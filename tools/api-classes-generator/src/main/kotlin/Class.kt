import com.beust.klaxon.Json
import com.squareup.kotlinpoet.*
import java.io.File
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy


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
        val enums: List<Enum>) {

    private val oldName: String = name
    private val shouldGenerate: Boolean
    val additionalImports = mutableListOf<Pair<String, String>>()

    init {
        name = name.escapeUnderscore()
        baseClass = baseClass.escapeUnderscore()

        shouldGenerate = name != "GlobalConstants"
    }


    fun generate(path: String, tree: Graph<Class>, icalls: MutableSet<ICall>) {
        applyGettersAndSettersForProperties()
        if (!shouldGenerate) return

        val outputDirectory = getPathForGeneratedFiles(path)
        val packageName = "godot"
        val className = ClassName(packageName, name)

        val classTypeBuilder = createTypeBuilder(className, packageName)
        val cOpaquePointerClass = ClassName("kotlinx.cinterop", "COpaquePointer")

        generateConstructors(classTypeBuilder, cOpaquePointerClass)
        generateEnums(classTypeBuilder)
        generateSignals(classTypeBuilder)

        val baseCompanion = createBaseCompanion(cOpaquePointerClass)
        generateCasts(tree, baseCompanion)
        generateConstants(baseCompanion)

        val propertiesReceiverType = if (isSingleton) baseCompanion else classTypeBuilder
        generateProperties(tree, icalls, propertiesReceiverType)
        generateMethods(propertiesReceiverType, tree, icalls)

        classTypeBuilder.addType(baseCompanion.build())

        //Build Type and create file
        val fileBuilder = FileSpec
                .builder(packageName, className.simpleName)
                .addType(classTypeBuilder.build())

        additionalImports.forEach {
            fileBuilder.addImport(it.first, it.second)
        }

        fileBuilder
                .build()
                .writeTo(outputDirectory)
    }

    private fun applyGettersAndSettersForProperties() {
        properties.forEach { property ->
            methods.forEach { method ->
                property.applyGetterOrSetter(method)
            }
        }
    }

    private fun getPathForGeneratedFiles(path: String): File {
        val outputDir = File(path)
        outputDir.parentFile.mkdirs()
        return outputDir
    }

    private fun createTypeBuilder(className: ClassName, packageName: String): TypeSpec.Builder {
        return TypeSpec
                .classBuilder(className)
                .addModifiers(KModifier.OPEN)
                .superclass(ClassName(packageName, if (baseClass.isEmpty()) "GodotObject" else baseClass))
    }

    private fun generateConstructors(typeBuilder: TypeSpec.Builder, cOpaquePointerClass: ClassName) {
        val superConstructorName = when {
            isInstanciable && name != "Thread" -> "\"$name\""
            isInstanciable && name == "Thread" -> "\"_Thread\""
            else -> ""
        }
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
                .delegate("lazy{ %M(\"$name\", \"$oldName\") }", MemberName("godot.utils", "getSingleton"))
                .build()
    }

    private fun generateCasts(tree: Graph<Class>, baseCompanion: TypeSpec.Builder) {
        val funSpecs = mutableListOf<FunSpec>()
        var node = tree.nodes.find { it.value.name == name }!!.parent

        while (node != null) {
            funSpecs.add(
                    FunSpec.builder("from")
                            .addModifiers(KModifier.INFIX)
                            .addParameter("other", ClassName(if (node.value.name.isCoreType()) "godot.core" else "godot", node.value.name))
                            .addStatement("return $name(\"\").apply { setRawMemory(other.rawMemory) }").build()
            )
            node = node.parent
        }
        funSpecs.add(
                FunSpec.builder("from")
                        .addModifiers(KModifier.INFIX)
                        .addParameter("other", ClassName("godot.core", "Variant"))
                        .addStatement("return %M($name(\"\"), other)", MemberName("godot.utils", "fromVariant"))
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

    private fun generateProperties(tree: Graph<Class>, icalls: MutableSet<ICall>, propertiesReceiverType: TypeSpec.Builder) {
        properties.forEach { property ->
            val propertySpec = property.generate(this, tree, icalls)
            if (propertySpec != null) {
                propertiesReceiverType.addProperty(propertySpec)

                val parameterType = property.type
                val parameterTypeName = ClassName(if (parameterType.isCoreType()) "godot.core" else "godot", parameterType)

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
                                                    parameters = *arrayOf(parameterTypeName),
                                                    returnType = ClassName("kotlin", "Unit")
                                            )
                                    ).build()
                            )
                            .returns(parameterTypeName)
                            .addStatement(
                                    """return $parameterName.apply {
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

    private fun generateMethods(propertiesReceiverType: TypeSpec.Builder, tree: Graph<Class>, icalls: MutableSet<ICall>) {
        methods.forEach { method ->
            if (!method.isVirtual) {
                propertiesReceiverType.addProperty(
                        PropertySpec.builder(
                                "${method.name}MethodBind",
                                ClassName("kotlinx.cinterop", "CPointer")
                                        .parameterizedBy(ClassName("godot.gdnative", "godot_method_bind"))
                        ).delegate("%L%M(\"${oldName}\",\"${method.oldName}\")%L",
                                "lazy{ ",
                                MemberName("godot.utils", "getMB"),
                                " }"
                        ).addModifiers(KModifier.PRIVATE, KModifier.FINAL).build()
                )
            }
            propertiesReceiverType.addFunction(method.generate(this, tree, icalls))
        }
    }
}
