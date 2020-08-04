package godot.codegen

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.squareup.kotlinpoet.*

import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import godot.codegen.utils.*


@JsonIgnoreProperties(ignoreUnknown = true)
open class Method @JsonCreator constructor(
    @JsonProperty("name")
    val oldName: String,
    @JsonProperty("return_type")
    var returnType: String,
    @JsonProperty("is_virtual")
    val isVirtual: Boolean,
    @JsonProperty("has_varargs")
    val hasVarargs: Boolean,
    @JsonProperty("arguments")
    val arguments: List<Argument>
) {

    val newName: String

    init {
        newName = if (!isVirtual) oldName.convertToCamelCase() else oldName
        returnType = returnType.convertTypeToKotlin()
    }

    var isGetterOrSetter: Boolean = false

    fun generate(clazz: Class, icalls: MutableSet<ICall>): FunSpec {
        // Uncomment to disable method implementation generation
        //if (isGetterOrSetter) return null
        val modifiers = mutableListOf<KModifier>()

        if (!clazz.isSingleton) {
            modifiers.add(getModifier(clazz))
        }

        val generatedFunBuilder = FunSpec
            .builder(newName)
            .addModifiers(modifiers)

        val shouldReturn = returnType != "Unit"
        if (shouldReturn) {
            val simpleName = returnType.removeEnumPrefix()
            generatedFunBuilder.returns(ClassName(returnType.getPackage(), simpleName).convertIfTypeParameter())
        }

        if (returnType.isEnum()) {
            val type = returnType.removeEnumPrefix()
            if (type.contains('.')) {
                clazz.additionalImports.add(returnType.getPackage() to type.split('.')[0])
            }
        }

        //TODO: move adding arguments to generatedFunBuilder to separate function
        val callArgumentsAsString = buildCallArgumentsString(
            clazz,
            generatedFunBuilder
        ) //cannot be inlined as it also adds the arguments to the generatedFunBuilder

        if (hasVarargs) {
            generatedFunBuilder.addParameter(
                "__var_args",
                ANY.copy(nullable = true),
                KModifier.VARARG
            )
        }

        if (!isVirtual) {
            generatedFunBuilder.addStatement("val mb = %M(\"${clazz.oldName}\",\"${oldName}\")", MemberName("godot.internal.utils", "getMethodBind"))
            val constructedICall = constructICall(callArgumentsAsString, icalls)
            generatedFunBuilder.addStatement(
                "%L%L%M%L%L",
                if (shouldReturn) "return " else "",
                when {
                    returnType == "enum.Error" -> {
                        "${returnType.removeEnumPrefix()}.byValue( "
                    }
                    returnType.isEnum() -> {
                        "${returnType.removeEnumPrefix()}.from( "
                    }
                    hasVarargs && returnType != "Variant" && returnType != "Unit" -> {
                        "$returnType from "
                    }
                    else -> {
                        ""
                    }
                },
                MemberName("godot.icalls", constructedICall.first),
                constructedICall.second,
                when {
                    returnType == "enum.Error" -> ".toUInt())"
                    returnType.isEnum() -> ")"
                    else -> ""
                }
            )
        } else {
            if (shouldReturn) {
                generatedFunBuilder.addStatement(
                    "%L %T(%S)",
                    "throw",
                    NotImplementedError::class,
                    "$oldName is not implemented for ${clazz.newName}"
                )
            }
        }
        return generatedFunBuilder.build()
    }

    private fun buildCallArgumentsString(cl: Class, generatedFunBuilder: FunSpec.Builder): String {
        return buildString {
            arguments.withIndex().forEach {
                val index = it.index
                val argument = it.value

                if (index != 0 || !hasVarargs) append(", ")

                val sanitisedName = tree.getSanitisedArgumentName(this@Method, index, cl)
                append(sanitisedName)

                if (argument.type.isEnum()) append(".id")

                val baseClassName = ClassName(
                    argument.type.getPackage(),
                    argument.type.removeEnumPrefix()
                )
                val parameterBuilder = ParameterSpec.builder(
                    argument.name,
                    baseClassName.convertIfTypeParameter().copy(nullable = argument.nullable)
                )

                if (argument.applyDefault != null) parameterBuilder.defaultValue(argument.applyDefault)

                generatedFunBuilder.addParameter(parameterBuilder.build())
            }
            if (hasVarargs && !isEmpty()) append(", ")
        }
    }

    private fun getModifier(cl: Class) =
        if (tree.doAncestorsHaveMethod(cl, this)) KModifier.OVERRIDE else KModifier.OPEN

    private fun constructICall(methodArguments: String, icalls: MutableSet<ICall>): Pair<String, String> {
        if (hasVarargs) {
            return "_icall_varargs" to
                "( mb, this.ptr, " +
                if (methodArguments.isNotEmpty()) "arrayOf($methodArguments*__var_args))" else "__var_args)"
        }

        val icall = ICall(returnType, arguments)
        icalls.add(icall)
        return icall.name to "( mb, this.ptr$methodArguments)"
    }
}
