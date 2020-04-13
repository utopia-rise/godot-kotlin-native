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

    private val oldName: String = name
    private val shouldGenerate: Boolean
    val additionalImports = mutableListOf<Pair<String, String>>()

    init {
        name = name.escapeUnderscore()
        baseClass = baseClass.escapeUnderscore()

        shouldGenerate = name != "GlobalConstants"
    }


    fun generate(outputDir: File, tree: Graph<Class>, icalls: MutableSet<ICall>) {
        applyGettersAndSettersForProperties()
        if (!shouldGenerate) return

        val packageName = "godot"
        val className = ClassName(packageName, name)

        val classTypeBuilder = createTypeBuilder(className, packageName)

        if (name == "Object") {
            generatePointerVariable(classTypeBuilder)
            generateInitAndDestroy(classTypeBuilder)
            generateSignalExtensions(classTypeBuilder)
        }

        generateConstructors(classTypeBuilder)
        generateEnums(classTypeBuilder)
        generateSignals(classTypeBuilder)

        val baseCompanion = createBaseCompanion()
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
            .writeTo(outputDir)
    }

    private fun applyGettersAndSettersForProperties() {
        properties.forEach { property ->
            methods.forEach { method ->
                property.applyGetterOrSetter(method)
            }
        }
    }

    private fun createTypeBuilder(className: ClassName, packageName: String): TypeSpec.Builder {
        return TypeSpec
            .classBuilder(className)
            .addModifiers(KModifier.OPEN)
            .superclass(ClassName(packageName, if (baseClass.isEmpty()) "GodotObject" else baseClass))
    }

    private fun generatePointerVariable(typeBuilder: TypeSpec.Builder) {
        typeBuilder.addProperty(
            PropertySpec.builder(
                "ptr",
                ClassName("kotlinx.cinterop", "COpaquePointer")
            )
                .addModifiers(KModifier.INTERNAL, KModifier.LATEINIT)
                .mutable(true)
                .build()
        )
    }

    private fun generateInitAndDestroy(typeBuilder: TypeSpec.Builder) {
        typeBuilder.addFunctions(
            listOf(
                FunSpec.builder("_onInit").addModifiers(KModifier.OPEN).build(),
                FunSpec.builder("_onDestroy").addModifiers(KModifier.OPEN).build()
            )
        )
    }

    private fun generateSignalExtensions(typeBuilder: TypeSpec.Builder) {

        fun List<TypeVariableName>.toParameterTypes() = this.map { ParameterSpec.builder(it.name.toLowerCase(), it).build() }

        val typeVariablesNames = mutableListOf<TypeVariableName>()
        for (i in 0..10) {
            if (i != 0) typeVariablesNames.add(TypeVariableName.invoke("A${i - 1}"))

            val signalType = ClassName("godot.core", "Signal$i")

            val emitFunBuilder = FunSpec.builder("emit")

            val signalParameterizedType = if (typeVariablesNames.isNotEmpty()) {
                val parameterSpecs = typeVariablesNames.toParameterTypes()
                emitFunBuilder.addTypeVariables(typeVariablesNames)
                emitFunBuilder.addParameters(parameterSpecs)
                emitFunBuilder.addStatement(
                    "%L(this@Object, ${
                    parameterSpecs
                        .map { it.name }
                        .reduce{ acc, string -> "$acc, $string" }
                    })",
                "emit"
                )
                signalType.parameterizedBy(typeVariablesNames)
            }
            else {
                emitFunBuilder.addStatement(
                    "%L(this@Object)",
                    "emit"
                )
                signalType
            }

            emitFunBuilder.receiver(signalParameterizedType)

            typeBuilder.addFunction(emitFunBuilder.build())

            val kTypeVariable = TypeVariableName.invoke(
                "K",
                bounds = *arrayOf(
                    LambdaTypeName.get(
                        returnType = UNIT
                    )
                )
            ).copy(reified = true)
            val connectTypeVariableNames = listOf(
                *typeVariablesNames.toTypedArray(),
                kTypeVariable
            )

            val objectType = ClassName("godot", "Object")
            typeBuilder.addFunction(
                FunSpec.builder("connect")
                    .receiver(signalParameterizedType)
                    .addTypeVariables(connectTypeVariableNames)
                    .addModifiers(KModifier.INLINE)
                    .addParameters(
                        listOf(
                            ParameterSpec.builder("target", objectType)
                                .build(),
                            ParameterSpec.builder("method", kTypeVariable)
                                .build(),
                            ParameterSpec.builder("binds", List::class.asTypeName().parameterizedBy(ANY).copy(nullable = true))
                                .defaultValue("null")
                                .build(),
                            ParameterSpec.builder("flags", Long::class)
                                .defaultValue("0")
                                .build()
                        )
                    )
                    .addCode("""
                            |val methodName = (method as %T<%T>).name
                            |connect(this@%T, target, methodName, binds, flags)
                            |""".trimMargin(),
                        ClassName("kotlin.reflect", "KCallable"),
                        UNIT,
                        objectType
                    )
                    .build()
            )
        }
    }

    private fun generateConstructors(typeBuilder: TypeSpec.Builder) {
        if (isInstanciable) {
            typeBuilder.addFunction(
                FunSpec.constructorBuilder()
                    .callThisConstructor("null")
                    .addStatement(
                        """if (shouldInit()) {
                            |    %M("$oldName")?.let {
                            |        this.ptr = it.%M<%T<()->%T>>().%M()
                            |    } ?: throw NotImplementedError("No constructor for $name in Godot")
                            |}
                            |""".trimMargin(),
                        MemberName("godot.gdnative", "godot_get_class_constructor"),
                        MemberName("kotlinx.cinterop", "reinterpret"),
                        ClassName("kotlinx.cinterop", "CFunction"),
                        ClassName("kotlinx.cinterop", "COpaquePointer"),
                        MemberName("kotlinx.cinterop", "invoke")
                    )
                    .build()
            )
        }

        typeBuilder.primaryConstructor(
            FunSpec.constructorBuilder()
                .addParameter(ParameterSpec("_ignore", Any::class.asTypeName().copy(nullable = true)))
                .callSuperConstructor()
                .addModifiers(KModifier.INTERNAL)
                .build()
        ).addSuperclassConstructorParameter("_ignore")
    }

    private fun generateEnums(typeBuilder: TypeSpec.Builder) {
        enums.forEach {
            typeBuilder.addType(it.generated)
        }
    }

    private fun generateSignals(typeBuilder: TypeSpec.Builder) {
        signals.forEach {
            typeBuilder.addProperty(it.generated)
        }
    }

    private fun createBaseCompanion(): TypeSpec.Builder {
        return TypeSpec.companionObjectBuilder().apply {
            if (isSingleton) {
                this.addAnnotation(ClassName("kotlin.native", "ThreadLocal"))
                this.addProperty(createSingletonProperty(ClassName("kotlinx.cinterop", "COpaquePointer")))
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
                .addStatement("return %M($name(\"\"), other)", MemberName("godot.internal", "fromVariant"))
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
            val propertySpec = property.generate(this, tree, icalls)
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

    private fun generateMethods(
        propertiesReceiverType: TypeSpec.Builder,
        tree: Graph<Class>,
        icalls: MutableSet<ICall>
    ) {
        methods.forEach { method ->
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
            propertiesReceiverType.addFunction(method.generate(this, tree, icalls))
        }
    }
}
