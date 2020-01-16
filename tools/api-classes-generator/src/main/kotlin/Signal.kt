import com.beust.klaxon.Json


class Signal(
        @Json(name = "name")
        var name: String
 ) {
    fun generate(): String {
        return "const val ${name.toUpperCase()}: String = \"$name\""
    }
}