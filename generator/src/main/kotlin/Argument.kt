import com.beust.klaxon.Json


class Argument(
        @Json(name = "name")
        var name: String,
        @Json(name = "type")
        var type: String,
        @Json(name = "has_default_value")
        val hasDefaultValue: Boolean = false,
        @Json(name = "default_value")
        val defaultValue: String = ""
) {
    init {
        name = name.convertToCamelCase().escapeKotlinReservedNames()
        type = type.convertTypeToKotlin()
    }
}