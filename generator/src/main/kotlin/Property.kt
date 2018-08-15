import com.beust.klaxon.Json


class Property(
        @Json(name = "name")
        val name: String,
        @Json(name = "type")
        val type: String,
        @Json(name = "getter")
        val getter: String,
        @Json(name = "setter")
        val setter: String
) {

}