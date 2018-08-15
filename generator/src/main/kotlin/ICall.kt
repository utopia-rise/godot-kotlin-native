class ICall(
        var returnType: String,
        val arguments: List<Argument>
) {
    val name: String

    init {
        if (returnType.isEnum())
            returnType = "Int"

        name = buildString {
            append("_icall_$returnType")

            for (arg in arguments)
                append('_').append(arg.type.convertTypeForICalls())
        }
    }


    fun generate(): String {
        return buildString {
            append("internal fun $name(mb: CPointer<godot_method_bind>, inst: COpaquePointer")

            for ((i, arg) in arguments.withIndex())
                append(", arg$i: ${arg.type.convertTypeForICalls()}")
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
                append("        val retVar = alloc<")
                append(if (isPrimitive) returnType else "COpaquePointer")
                appendln("Var>()")
            }


            appendln("        val args = allocArray<COpaquePointerVar>(${arguments.size})")
            for (i in arguments.indices)
                appendln("        args[$i] = arg$i.getRawMemory(memScope)")
            append("        godot_method_bind_ptrcall(mb, inst, args, ")
            append(if (shouldReturn) "retVar.ptr" else "null")
            appendln(')')


            if (shouldReturn)
                if (isPrimitive)
                    appendln("        ret = retVar.value")
                else
                    appendln("        ret = $returnType(retVar.value!!)")


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