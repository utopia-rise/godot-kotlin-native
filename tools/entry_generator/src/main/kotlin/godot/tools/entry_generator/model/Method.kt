package godot.tools.entry_generator.model

import com.beust.klaxon.Json


class Method(
        @Json(name = "name")
        val name: String,
        @Json(name = "returnType")
        val returnType: String = "Unit",
        @Json(name = "vararg")
        val isVararg: Boolean = false,
        @Json(name = "arguments")
        val arguments: List<String> = listOf()
) {
    init {
        if (isVararg && arguments.size != 1)
            error("Method $name is vararg and have ${arguments.size} arguments, expected 1 argument")
    }


    fun generate(): String {
        return buildString {

            if (isVararg) {
                appendln("        args!!")
                appendln("        val varargs = Array(numArgs) { i -> ${arguments[0].castFromRawMemory("args[i]!!")} }")
                append("        ")
                if (returnType != "Unit")
                    append("Variant from ")
                appendln("obj.$name(*varargs)")
                if (returnType == "Unit")
                    appendln("        null")

            } else {

                appendln("            ${arguments.size} -> {")

                val argumentsSequence = StringBuilder()
                if (arguments.isNotEmpty()) {
                    appendln("                args!!")

                    for ((i, arg) in arguments.withIndex()) {
                        appendln("                val arg$i = ${arg.castFromRawMemory("args[$i]!!")}")

                        if (i != 0)
                            argumentsSequence.append(", ")
                        argumentsSequence.append("arg$i")
                    }
                }
                append("                ")
                if (returnType != "Unit")
                    append("return@run Variant from ")
                appendln("obj.$name($argumentsSequence)")

                appendln("            }")
            }
        }
    }
}