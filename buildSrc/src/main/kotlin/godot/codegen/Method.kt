package godot.codegen

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.squareup.kotlinpoet.*
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy


@JsonIgnoreProperties(ignoreUnknown = true)
open class Method @JsonCreator constructor(
    @JsonProperty("name")
    var name: String,
    @JsonProperty("return_type")
    var returnType: String,
    @JsonProperty("is_virtual")
    val isVirtual: Boolean,
    @JsonProperty("has_varargs")
    val hasVarargs: Boolean,
    @JsonProperty("arguments")
    val arguments: List<Argument>
) {

    val oldName: String = name

    init {
        if (!isVirtual) {
            name = name.convertToCamelCase()
        }
        returnType = returnType.convertTypeToKotlin()
    }

    var isGetterOrSetter: Boolean = false

    fun generate(clazz: Class, tree: Graph<Class>, icalls: MutableSet<ICall>): FunSpec {
        // Uncomment to disable method implementation generation
        //if (isGetterOrSetter) return null
        val modifiers = mutableListOf<KModifier>()

        if (!clazz.isSingleton) {
            modifiers.add(getModifier(tree, clazz))
        }

        val generatedFunBuilder = FunSpec
            .builder(name)
            .addModifiers(modifiers)

        val shouldReturn = returnType != "Unit"
        if (shouldReturn) {
            val simpleName = returnType.removeEnumPrefix()
            val returnClassName = if (returnType == "VariantArray") {
                ClassName(returnType.getPackage(), simpleName).parameterizedBy(Any::class.asTypeName())
            } else {
                ClassName(returnType.getPackage(), simpleName)
            }
            generatedFunBuilder.returns(returnClassName)
        }

        if (returnType.isEnum()) {
            val type = returnType.removeEnumPrefix()
            if (type.contains('.')) {
                clazz.additionalImports.add(returnType.getPackage() to type.split('.')[0])
            }
        }

        //TODO: move adding arguments to generatedFunBuilder to separate function
        val callArgumentsAsString = buildCallArgumentsString(
            tree,
            clazz,
            generatedFunBuilder
        ) //cannot be inlined as it also adds the arguments to the generatedFunBuilder

        if (hasVarargs) {
            generatedFunBuilder.addParameter(
                "__var_args",
                Any::class.asTypeName().copy(nullable = true),
                KModifier.VARARG
            )
        }

        if (!isVirtual) {
            val constructedICall = constructICall(callArgumentsAsString, icalls)
            generatedFunBuilder.addStatement(
                "%L%L%M%L%L",
                if (shouldReturn) "return " else "",
                if (returnType.isEnum()) {
                    "${returnType.removeEnumPrefix()}.fromInt( "
                } else if (hasVarargs && returnType != "Variant" && returnType != "Unit") {
                    "$returnType from "
                } else {
                    ""
                },
                MemberName("godot.icalls", constructedICall.first),
                constructedICall.second,
                if (returnType.isEnum()) ")" else ""
            )
        } else {
            if (shouldReturn) {
                generatedFunBuilder.addStatement(
                    "%L %T(%S)",
                    "throw",
                    NotImplementedError::class,
                    "$oldName is not implemented for ${clazz.name}"
                )
            }
        }
        return generatedFunBuilder.build()
    }

    private fun buildCallArgumentsString(tree: Graph<Class>, cl: Class, generatedFunBuilder: FunSpec.Builder): String {
        return buildString {
            arguments.withIndex().forEach {
                val index = it.index
                val argument = it.value

                if (index != 0 || !hasVarargs) append(", ")

                val sanitisedName = tree.getSanitisedArgumentName(this@Method, index, cl)
                append(sanitisedName)

                if (argument.type.isEnum()) append(".id")

                val parameterBuilder = ParameterSpec.builder(
                    argument.name,
                    if (argument.type == "VariantArray") {
                        ClassName(
                            argument.type.getPackage(),
                            argument.type.removeEnumPrefix()
                        ).parameterizedBy(Any::class.asTypeName()).copy(nullable = argument.nullable)
                    } else {
                        ClassName(
                            argument.type.getPackage(),
                            argument.type.removeEnumPrefix()
                        ).copy(nullable = argument.nullable)
                    }
                )

                if (argument.applyDefault != null) parameterBuilder.defaultValue(argument.applyDefault)

                generatedFunBuilder.addParameter(parameterBuilder.build())
            }
            if (hasVarargs && !isEmpty()) append(", ")
        }
    }

    private fun getModifier(tree: Graph<Class>, cl: Class) =
        if (tree.doAncestorsHaveMethod(cl, this)) {
            KModifier.OVERRIDE
        } else {
            KModifier.OPEN
        }


    private fun constructICall(methodArguments: String, icalls: MutableSet<ICall>): Pair<String, String> {
        if (hasVarargs) return "_icall_varargs" to "( ${name}MethodBind, this.ptr, arrayOf($methodArguments*__var_args))"

        val icall = ICall(returnType, arguments)
        icalls.add(icall)
        return icall.name to "( ${name}MethodBind, this.ptr$methodArguments)"
    }
}
