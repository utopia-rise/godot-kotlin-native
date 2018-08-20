import com.beust.klaxon.Json


class Property(
        @Json(name = "name")
        var name: String,
        @Json(name = "type")
        var type: String,
        @Json(name = "getter")
        var getter: String,
        @Json(name = "setter")
        var setter: String
) {
    init {
        name = name.convertToCamelCase()
        type = type.convertTypeToKotlin()

        getter = getter.convertToCamelCase()
        setter = setter.convertToCamelCase()
    }
}