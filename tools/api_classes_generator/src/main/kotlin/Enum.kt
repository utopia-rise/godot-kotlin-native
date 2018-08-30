import com.beust.klaxon.Json


class Enum(
        @Json(name = "name")
        var name: String,
        @Json(name = "values")
        var values: Map<String, Int>
) {
    fun generate(content: StringBuilder) {
        content.appendln("    enum class ${name.escapeUnderscore()}(val id: Long) {")
        for (value in values)
            content.appendln("        ${value.key}(${value.value}),")
        content.appendln("        ;")
        content.appendln()
        content.appendln("        companion object {")
        content.appendln("            fun fromInt(value: Long) = values().single { it.id == value }")
        content.appendln("        }")
        content.appendln("    }")
    }
}