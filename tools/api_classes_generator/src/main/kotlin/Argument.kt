import com.beust.klaxon.Json


class Argument(
        @Json(name = "name")
        var name: String,
        @Json(name = "type")
        var type: String,
        @Json(name = "has_default_value")
        val hasDefaultValue: Boolean = false,
        @Json(name = "default_value")
        var defaultValue: String = ""
) {
    init {
        name = name.convertToCamelCase().escapeKotlinReservedNames()
        type = type.convertTypeToKotlin()

        if (defaultValue == "[Object:null]" || defaultValue == "Null")
            defaultValue = "null"
    }


    fun applyDefaultValue(): String {
        if (hasDefaultValue) {
            if (defaultValue == "null")
                return "" // TODO: ? = null

            return " = " + when (type) {
                "Color", "Variant" -> "$type($defaultValue)"
                "Boolean" -> defaultValue.toLowerCase()
                "Float" -> intToFloat(defaultValue)
                "Vector2", "Vector3", "Rect2" -> "$type$defaultValue"
                "Transform", "Transform2D", "GodotArray", "RID", "PoolVector2Array", "PoolStringArray", "PoolVector3Array", "PoolColorArray", "PoolIntArray", "PoolRealArray", "PoolByteArray" -> "$type()"
                "String" -> "\"$defaultValue\""
                else -> defaultValue
            }
        }
        return ""
    }


    private fun intToFloat(defaultValue: String): String {
        //if (defaultValue.indexOf('.') == -1)
            return "${defaultValue}f"
        //return defaultValue
    }
}