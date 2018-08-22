import com.beust.klaxon.Json


open class Method(
        @Json(name = "name")
        var name: String,
        @Json(name = "return_type")
        var returnType: String,
        @Json(name = "is_virtual")
        val isVirtual: Boolean,
        @Json(name = "has_varargs")
        val hasVarargs: Boolean,
        @Json(name = "arguments")
        val arguments: List<Argument>
) {
    private val oldName: String = name

    init {
        name = name.convertToCamelCase()
        returnType = returnType.convertTypeToKotlin()
    }

    var isGetterOrSetter: Boolean = false



    fun generate(prefix: String, cl: Class, tree: Graph<Class>, icalls: MutableSet<ICall>): String {
        return buildString {
            if (!isVirtual) {
                appendln("$prefix    private val ${name}MethodBind: CPointer<godot_method_bind> by lazy { getMB(\"${cl.oldName}\", \"$oldName\") }")
            }

            // TODO: uncomment to disable method implementation
            //if (isGetterOrSetter)
            //    return@buildString


            append("$prefix    ")
            if (!cl.isSingleton)
                if (tree.doAncestorsHaveMethod(cl, this@Method))
                    append("override ")
                else
                    append("open ")
            append("fun $name(")


            val methodArguments = StringBuilder()
            for ((i, arg) in arguments.withIndex()) {
                methodArguments.append(", ${arg.name}")
                if (arg.type.isEnum())
                    methodArguments.append(".id")

                append("${arg.name}: ${arg.type.removeEnumPrefix()}${arg.applyDefaultValue()}")

                if (i != arguments.size - 1)
                    append(", ")
            }


            val shouldReturn = returnType != "Unit"


            append(')')
            if (shouldReturn)
                append(": ${returnType.removeEnumPrefix()}")
            appendln(" {")


            // TODO: check virtuals, getters and setters
            if (!isVirtual) {
                append("$prefix        ")

                var suffix = ""

                if (shouldReturn) {
                    append("return ")

                    if (returnType.isEnum()) {
                        append("${returnType.removeEnumPrefix()}.fromInt(")
                        suffix = ")"
                    }
                }

                append(constructICall(methodArguments.toString(), icalls))
                appendln(suffix)
            } else {
                if (shouldReturn) {
                    appendln("$prefix        throw NotImplementedError(\"$oldName is not implemented for ${cl.name}\")")
                }
            }


            appendln("$prefix    }")
            appendln()
            appendln()
        }
    }


    private fun constructICall(methodArguments: String, icalls: MutableSet<ICall>): String {
        val icall = ICall(returnType, arguments)
        icalls.add(icall)
        return "${icall.name}(${name}MethodBind, this.rawMem()$methodArguments)"
    }
}