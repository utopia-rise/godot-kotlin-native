package model

import com.beust.klaxon.Json


class Method(
        @Json(name = "name")
        val name: String,
        @Json(name = "returnType")
        val returnType: String = "Unit",
        @Json(name = "arguments")
        val arguments: List<String> = listOf()
) {
    fun generate(): String {
        return buildString {
            appendln("            ${arguments.size} -> {")

            val argumentsSequence = StringBuilder()
            if (arguments.isNotEmpty()) {
                appendln("                args!!")

                for ((i,arg) in arguments.withIndex()) {
                    appendln( "                val arg$i = ${arg.castFromRawMemory("args[$i]!!")}")

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