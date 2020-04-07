package godot.codegen

import com.beust.klaxon.Json
import com.squareup.kotlinpoet.*
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import java.io.File


class Class(
    @Json(name = "name")
    var name: String,
    @Json(name = "base_class")
    var baseClass: String,
    @Json(name = "singleton")
    val isSingleton: Boolean,
    @Json(name = "instanciable")
    val isInstanciable: Boolean,
    @Json(name = "constants")
    val constants: Map<String, Int>,
    @Json(name = "properties")
    val properties: List<Property>,
    @Json(name = "signals")
    val signals: List<Signal>,
    @Json(name = "methods")
    val methods: List<Method>,
    @Json(name = "enums")
    val enums: List<Enum>
) {

    val oldName: String = name
    private val shouldGenerate: Boolean
    val additionalImports = mutableListOf<Pair<String, String>>()

    val allMethods: MutableList<Method>

    init {
        name = name.escapeUnderscore()
        baseClass = baseClass.escapeUnderscore()

        allMethods = methods.toMutableList()

        shouldGenerate = name != "GlobalConstants"
    }


    fun generate(outputDir: File, tree: Graph<Class>, icalls: MutableSet<ICall>) {
        allMethods.addAll(tree getMethodsFromAncestorsOf this)
        applyGettersAndSettersForProperties()
        if (!shouldGenerate) return

        val packageName = "godot"
        val className = ClassName(packageName, name)

        val generatedInterface = generateInterface(packageName, tree)

        //Build Type and create file
        val fileBuilders = if (isInstanciable || isSingleton) {
            listOf(
                FileSpec
                .builder(packageName, className.simpleName)
                .addType(generatedInterface),
                FileSpec
                .builder(packageName, "${className.simpleName}Methods")
                .addType(generateMethodsClass(className, icalls, tree)),
                FileSpec
                .builder(packageName, "${className.simpleName}Impl")
                .addType(generateClassImpl(packageName, className, tree, icalls))
            )
        } else {
            listOf(
                FileSpec
                .builder(packageName, className.simpleName)
                .addType(generatedInterface)
            )
        }


        additionalImports.forEach {
            fileBuilders.forEach { file -> file.addImport(it.first, it.second) }
        }

        fileBuilders.forEach {
            it.build()
            .writeTo(outputDir)
        }
    }

    private fun generateInterface(packageName: String, tree: Graph<Class>): TypeSpec {
        val interfaceBuilder = createTypeBuilder(ClassName(packageName, name), packageName, true)
        methods.forEach {
            interfaceBuilder.addFunction(it.generateForInterface(this, tree))
        }
        generateEnums(interfaceBuilder)
        return interfaceBuilder.build()
    }

    private fun generateClassImpl(packageName: String, className: ClassName, tree: Graph<Class>, icalls: MutableSet<ICall>): TypeSpec {
        val classTypeBuilder = createTypeBuilder(className, packageName, false)
        val cOpaquePointerClass = ClassName("kotlinx.cinterop", "COpaquePointer")


        generateImplConstructorsAndInline(classTypeBuilder)
        generateSignals(classTypeBuilder)

        val baseCompanion = createBaseCompanion(cOpaquePointerClass)
        generateCasts(tree, baseCompanion)
        generateConstants(baseCompanion)

        val propertiesReceiverType = if (isSingleton) baseCompanion else classTypeBuilder
        generateProperties(tree, icalls, propertiesReceiverType)
        generateMethodsForImpl(propertiesReceiverType, tree)

        classTypeBuilder.addType(baseCompanion.build())
        return classTypeBuilder.build()
    }

    private fun generateMethodsClass(className: ClassName, icalls: MutableSet<ICall>, tree: Graph<Class>): TypeSpec {
        val methodsClassBuilder = TypeSpec.objectBuilder("${className.simpleName}Methods")
        methodsClassBuilder.addModifiers(KModifier.INTERNAL)
        generateMethodsBindingsAndCalls(methodsClassBuilder, tree, icalls)
        return methodsClassBuilder.build()
    }

    private fun applyGettersAndSettersForProperties() {
        properties.forEach { property ->
            methods.forEach { method ->
                property.applyGetterOrSetter(method)
            }
        }
    }

    private fun createTypeBuilder(className: ClassName, packageName: String, isInterface: Boolean): TypeSpec.Builder {
        return if (!isInterface) {
            TypeSpec.classBuilder(ClassName(packageName, "${className.simpleName}Impl"))
                .addSuperinterface(className)
        }
        else {
            TypeSpec.interfaceBuilder(className)
                .addSuperinterface(ClassName(packageName, if (baseClass.isEmpty()) "GodotObject" else baseClass))
        }
    }

    private fun generateImplConstructorsAndInline(typeBuilder: TypeSpec.Builder) {
        val cOpaquePtrType = ClassName("kotlinx.cinterop", "COpaquePointer")
        typeBuilder.primaryConstructor(
            FunSpec.constructorBuilder()
                .addParameter("pointer", cOpaquePtrType)
                .build()
        )
            .addProperty(
                PropertySpec.builder("pointer", cOpaquePtrType)
                    .initializer("pointer")
                    .addModifiers(KModifier.FINAL).build()
            )
            .addModifiers(KModifier.INLINE)
    }

    private fun generateConstructors(typeBuilder: TypeSpec.Builder, cOpaquePointerClass: ClassName) {
        val superConstructorName = if (isInstanciable) "\"$oldName\"" else ""

        typeBuilder.addFunction(
            FunSpec.constructorBuilder()
                .callSuperConstructor(superConstructorName)
                .build()
        )
        typeBuilder.addFunction(
            FunSpec.constructorBuilder()
                .addParameter("variant", ClassName("godot.core", "Variant"))
                .callSuperConstructor("variant")
                .build()
        )
        typeBuilder.addFunction(
            FunSpec.constructorBuilder()
                .addModifiers(KModifier.INTERNAL)
                .addParameter("mem", cOpaquePointerClass)
                .callSuperConstructor("mem")
                .build()
        )
        typeBuilder.addFunction(
            FunSpec.constructorBuilder()
                .addModifiers(KModifier.INTERNAL)
                .addParameter("name", String::class)
                .callSuperConstructor("name")
                .build()
        )
    }

    private fun generateEnums(typeBuilder: TypeSpec.Builder) {
        enums.forEach {
            typeBuilder.addType(it.generated)
        }
    }

    private fun generateSignals(typeBuilder: TypeSpec.Builder) {
        val signalClassBuilder = TypeSpec.classBuilder("Signal")
        val signalCompanionObjectBuilder = TypeSpec.companionObjectBuilder()

        signals.forEach {
            signalCompanionObjectBuilder.addProperty(it.generated)
        }
        signalClassBuilder.addType(signalCompanionObjectBuilder.build())

        typeBuilder.addType(signalClassBuilder.build())
    }

    private fun createBaseCompanion(cOpaquePointerClass: ClassName): TypeSpec.Builder {
        return TypeSpec.companionObjectBuilder().apply {
            if (isSingleton) {
                this.addAnnotation(ClassName("kotlin.native", "ThreadLocal"))
                this.addProperty(createSingletonProperty(cOpaquePointerClass))
            }
        }
    }

    private fun createSingletonProperty(cOpaquePointerClass: ClassName): PropertySpec {
        return PropertySpec
            .builder(
                "rawMemory",
                cOpaquePointerClass,
                KModifier.PRIVATE, KModifier.FINAL
            )
            .delegate("lazy{ %M(\"$name\", \"$oldName\") }", MemberName("godot.internal", "getSingleton"))
            .build()
    }

    private fun generateCasts(tree: Graph<Class>, baseCompanion: TypeSpec.Builder) {
        val funSpecs = mutableListOf<FunSpec>()
        var node = tree.nodes.find { it.value.name == name }!!.parent

        while (node != null) {
            funSpecs.add(
                FunSpec.builder("from")
                    .addModifiers(KModifier.INFIX)
                    .addParameter(
                        "other",
                        ClassName(if (node.value.name.isCoreType()) "godot.core" else "godot", node.value.name)
                    )
                    .addStatement("return $name(\"\").apply{ setRawMemory(other.rawMemory) }")
                    .build()
            )
            node = node.parent
        }
        funSpecs.add(
            FunSpec.builder("from")
                .addModifiers(KModifier.INFIX)
                .addParameter("other", ClassName("godot.core", "Variant"))
                .addStatement("return %M($name(\"\"), other)", MemberName("godot.internal.utils", "fromVariant"))
                .build()
        )

        funSpecs.forEach {
            baseCompanion.addFunction(it)
        }
    }

    private fun generateConstants(baseCompanion: TypeSpec.Builder) {
        constants.forEach { (key, value) ->
            baseCompanion.addProperty(
                PropertySpec
                    .builder(key, Long::class)
                    .addModifiers(KModifier.CONST, KModifier.FINAL)
                    .initializer("%L", value)
                    .build()
            )
        }
    }

    private fun generateProperties(
        tree: Graph<Class>,
        icalls: MutableSet<ICall>,
        propertiesReceiverType: TypeSpec.Builder
    ) {
        properties.forEach { property ->
            val propertySpec = property.generateForMethodsClass(this, tree, icalls)
            if (propertySpec != null) {
                propertiesReceiverType.addProperty(propertySpec)

                val parameterType = property.type
                val parameterTypeName =
                    ClassName(if (parameterType.isCoreType()) "godot.core" else "godot", parameterType)

                if (property.hasValidSetter && parameterType.isCoreTypeAdaptedForKotlin()) {
                    val parameterName = property.name
                    val propertyFunSpec = FunSpec.builder(parameterName)

                    if (!isSingleton) {
                        if (tree.doAncestorsHaveProperty(this, property)) {
                            propertyFunSpec.addModifiers(KModifier.OVERRIDE)
                        } else {
                            propertyFunSpec.addModifiers(KModifier.OPEN)
                        }
                    }

                    propertyFunSpec
                        .addParameter(
                            ParameterSpec.builder(
                                "schedule",
                                LambdaTypeName.get(
                                    receiver = parameterTypeName,
                                    returnType = ClassName("kotlin", "Unit")
                                )
                            ).build()
                        )
                        .returns(parameterTypeName)
                        .addStatement(
                            """return $parameterName.apply{
                                                |    schedule(this)
                                                |    $parameterName = this
                                                |}
                                                |""".trimMargin()
                        )

                    propertiesReceiverType.addFunction(propertyFunSpec.build())
                }
            }
        }
    }

    private fun generateMethodsBindingsAndCalls(
        propertiesReceiverType: TypeSpec.Builder,
        tree: Graph<Class>,
        icalls: MutableSet<ICall>
    ) {
        allMethods.forEach { method ->
            if (!method.isVirtual) {
                propertiesReceiverType.addProperty(
                    PropertySpec.builder(
                        "${method.name}MethodBind",
                        ClassName("kotlinx.cinterop", "CPointer")
                            .parameterizedBy(ClassName("godot.gdnative", "godot_method_bind"))
                    ).delegate(
                        "%L%M(\"${oldName}\",\"${method.oldName}\")%L",
                        "lazy{ ",
                        MemberName("godot.internal.utils", "getMethodBind"),
                        " }"
                    ).addModifiers(KModifier.PRIVATE, KModifier.FINAL).build()
                )
            }
            propertiesReceiverType.addFunction(method.generateForMethodsClass(this, tree, icalls))
        }
    }

    private fun generateMethodsForImpl(receiverType: TypeSpec.Builder, tree: Graph<Class>) {
        allMethods.forEach {
            receiverType.addFunction(it.generateForClassImpl(this, tree))
        }
    }
}
