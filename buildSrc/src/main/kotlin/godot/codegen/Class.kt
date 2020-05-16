package godot.codegen

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.squareup.kotlinpoet.*
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import java.io.File


@JsonIgnoreProperties(ignoreUnknown = true)
class Class @JsonCreator constructor(
    @JsonProperty("name")
    var name: String,
    @JsonProperty("base_class")
    var baseClass: String,
    @JsonProperty("singleton")
    val isSingleton: Boolean,
    @JsonProperty("instanciable")
    val isInstanciable: Boolean,
    @JsonProperty("constants")
    val constants: Map<String, Int>,
    @JsonProperty("properties")
    val properties: List<Property>,
    @JsonProperty("signals")
    val signals: List<Signal>,
    @JsonProperty("methods")
    val methods: List<Method>,
    @JsonProperty("enums")
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

        val className = ClassName("godot", name)

        val classTypeBuilder = createTypeBuilder(className)

        if (name == "Object") {
            generatePointerVariable(classTypeBuilder)
            generateInitAndDestroy(classTypeBuilder)
            generateSignalExtensions(classTypeBuilder)
        }

        generateConstructors(classTypeBuilder)
        generateEnums(classTypeBuilder)

        val baseCompanion = if (isSingleton || constants.isNotEmpty()) createBaseCompanion() else null

        if (baseCompanion != null) generateConstants(baseCompanion)

        val propertiesReceiverType = if (isSingleton) baseCompanion!! else classTypeBuilder

        generateSignals(propertiesReceiverType)
        generateProperties(tree, icalls, propertiesReceiverType)
        generateMethods(propertiesReceiverType, tree, icalls)

        baseCompanion?.build()?.let { classTypeBuilder.addType(it) }

        //Build Type and create file
        val fileBuilder = FileSpec
            .builder("godot", className.simpleName)
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
                property applyGetterOrSetter method
            }
        }
    }

    private fun createTypeBuilder(className: ClassName): TypeSpec.Builder {
        val typeSpec = TypeSpec
            .classBuilder(className)
            .addModifiers(KModifier.OPEN)
        if (baseClass.isNotEmpty()) typeSpec.superclass(ClassName("godot", baseClass))
        return typeSpec
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
        val noArgConstructor = FunSpec.constructorBuilder()
            .callThisConstructor("null")
            .addStatement(
                """if (%M()) {
                   |    this.ptr = %M("$name", "$oldName")
                   |}
                   |""".trimMargin(),
                MemberName(ClassName("godot.core", "Godot"), "shouldInitPtr"),
                MemberName("godot.internal.utils", "getConstructor")
            )

        if (!isInstanciable) noArgConstructor.addModifiers(KModifier.INTERNAL)

        typeBuilder.addFunction(noArgConstructor.build())

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
                "ptr",
                cOpaquePointerClass,
                KModifier.FINAL
            )
            .delegate("lazy{ %M(\"$name\", \"$oldName\") }", MemberName("godot.internal.utils", "getSingleton"))
            .build()
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
