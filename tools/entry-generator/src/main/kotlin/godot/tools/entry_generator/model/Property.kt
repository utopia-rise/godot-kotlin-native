package godot.tools.entry_generator.model

import com.beust.klaxon.Json


class Property(
        @Json(name = "name")
        val name: String,
        @Json(name = "type")
        val type: String,
        @Json(name = "defaultValue")
        val defaultValue: String = "",
        @Json(name = "export")
        val export: Boolean = true
) {
    fun generate(className: String, bridges: MutableList<String>): String {
        val bridgeID = bridges.size

        bridges.add("""
private fun udcBridge$bridgeID(): CPointer<CFunction<(COpaquePointer?,COpaquePointer?) -> Unit>> {
    return staticCFunction { o, r -> get<$className>("$name", "$className", o, r) {
        obj -> Variant(obj.$name)
    }}
}
        """.trimIndent())
        bridges.add("""
private fun udcBridge${bridgeID + 1}(): CPointer<CFunction<(COpaquePointer?,COpaquePointer?) -> Unit>> {
    return staticCFunction { o, v -> set<$className>("$name", "$className", o, v) {
        obj, value -> obj.$name = ${type.castFromVariant("value")}
    }}
}
        """.trimIndent())
        bridges.add("""
private fun udcBridge${bridgeID + 2}(): Variant {
    return Variant(${if (type == "String") "\"$defaultValue\"" else defaultValue})
}
        """.trimIndent())

        return "    registerProperty(\"$className\", \"$name\", $export, udcBridge$bridgeID(), udcBridge${bridgeID + 1}(), udcBridge${bridgeID + 2}())"
    }
}