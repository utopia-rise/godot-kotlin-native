@file:Suppress("unused", "MemberVisibilityCanBePrivate")

package godot.core

import godot.gdnative.*
import kotlinx.cinterop.*


//From Godot to Kotlin
fun String(mem: COpaquePointer) {
    val gdString = mem.reinterpret<godot_string>()
    val s = gdString.pointed.readValue().toKString()
    godot_string_destroy(gdString)
}

fun String.toVariant() = Variant(this)

internal fun CValue<godot_string>.toKString(): String {
    godot_string_utf8(this).useContents {
        val ret = godot_char_string_get_data(this.ptr)?.toKString()
            ?: throw NullPointerException("Failed to convert Godot-string to Kotlin-string")
        godot_char_string_destroy(this.ptr)
        return ret
    }
}

//From Kotlin to Godot
fun String.getRawMemory(memScope: MemScope): COpaquePointer {
    return cValue<godot_string> { godot_string_parse_utf8(this.ptr, this@getRawMemory) }.getPointer(memScope)
}

internal fun String.toGDString(): CValue<godot_string> {
    return cValue { godot_string_parse_utf8(this.ptr, this@toGDString) }
}

internal fun <T> String.asGDString(block: MemScope.(CValue<godot_string>) -> T): T {
    return memScoped {
        val gdString = cValue<godot_string> { godot_string_parse_utf8(this.ptr, this@asGDString) }
        val ret: T = block(this, gdString)
        godot_string_destroy(gdString)
        ret
    }
}

