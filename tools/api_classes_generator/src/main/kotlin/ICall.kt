class ICall(
        var returnType: String,
        val arguments: List<Argument>
) {
    val name: String

    init {
        if (returnType.isEnum())
            returnType = "Long"

        name = buildString {
            append("_icall_$returnType")

            for (arg in arguments) {
                append('_')
                if (arg.nullable)
                    append('n')
                append(arg.type.convertTypeForICalls())
            }
        }
    }


    fun generate(): String {
        return buildString {
            append("internal fun $name(mb: CPointer<godot_method_bind>, inst: COpaquePointer")

            for ((i, arg) in arguments.withIndex()) {
                append(", arg$i: ${arg.type.convertTypeForICalls()}")
                if (arg.nullable)
                    append('?')
            }
            append(')')



            val shouldReturn = returnType != "Unit"
            val isPrimitive = returnType.isPrimitive()


            if (shouldReturn)
                append(": $returnType")
            appendln(" {")


            if (shouldReturn) {
                append("    ")
                if (isPrimitive)
                    appendln("var ret: $returnType = ${returnType.defaultValue()}")
                else
                    appendln("lateinit var ret: $returnType")
            }


            appendln("    memScoped {")


            if (shouldReturn) {
                append("        val retVar = alloc")
                if (isPrimitive)
                    appendln("<${returnType}Var>()")
                else
                    appendln("Array<ByteVar>(8)")
            }


            appendln("        val args = allocArray<COpaquePointerVar>(${arguments.size + 1})")
            for ((i, arg) in arguments.withIndex()) {
                append("        args[$i] = arg$i")
                if (arg.nullable)
                    append('?')
                appendln(".getRawMemory(memScope)")
            }
            appendln("        args[${arguments.size}] = null")

            append("        godot_method_bind_ptrcall(mb, inst, args, ")
            if (shouldReturn)
                if (isPrimitive)
                    append("retVar.ptr")
                else
                    append("retVar")
            else
                append("null")
            appendln(')')


            if (shouldReturn)
                if (isPrimitive)
                    appendln("        ret = retVar.value")
                else
                    appendln("        ret = $returnType(retVar)")


            appendln("    }")


            if (shouldReturn)
                appendln("    return ret")
            appendln("}")
            appendln()
        }
    }



    override fun equals(other: Any?): Boolean {
        if (other !is ICall)
            return false
        return this.name == other.name
    }

    override fun hashCode(): Int {
        return name.hashCode()
    }
}