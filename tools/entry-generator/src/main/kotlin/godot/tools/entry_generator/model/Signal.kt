package godot.tools.entry_generator.model

import com.beust.klaxon.Json


class SignalArgument(
        @Json(name = "name")
        val name: String,
        @Json(name = "type")
        val type: String
) {

}

class Signal(
        @Json(name = "name")
        val name: String,
        @Json(name = "arguments")
        val arguments: List<SignalArgument> = listOf(),
        @Json(name = "defaultValues")
        val defaultValues: List<String> = listOf()
) {
    fun generate(className: String): String {
        return buildString {
            append("    registerSignal(\"$className\", \"$name\"")

            if (arguments.isNotEmpty()) {
                appendln(',')
                append("             arrayOf(")

                for ((i,arg) in arguments.withIndex()) {
                    if (i != 0) {
                        appendln(',')
                        append("                     ")
                    }
                    append("\"${arg.name}\" to ${arg.type.getVariantType()}")
                }
                append(')')
            }
            if (defaultValues.isNotEmpty()) {
                appendln(',')
                append("             arrayOf(")

                for ((i,arg) in defaultValues.withIndex()) {
                    if (i != 0) {
                        appendln(',')
                        append("                     ")
                    }
                    append("Variant($arg)")
                }
                append(')')
            }

            append(')')
        }
    }
}