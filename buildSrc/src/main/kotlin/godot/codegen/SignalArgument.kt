package godot.codegen

import com.beust.klaxon.Json
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.PropertySpec

class SignalArgument(
    @Json(name = "name")
    val name: String,
    @Json(name = "type")
    var type: String,
    @Json(name = "default_value")
    val defaultValue: String
) {
    init {
        type = type.convertTypeToKotlin()
    }
}
