@file:Suppress("unused", "MemberVisibilityCanBePrivate")
package godot.core

import godot.gdnative.*
import kotlinx.cinterop.*


fun String(mem: COpaquePointer) = mem.reinterpret<godot_string>().pointed.readValue().toKString()

fun String.getRawMemory(memScope: MemScope): COpaquePointer =
        cValue<godot_string> { godot_string_parse_utf8(this.ptr, this@getRawMemory) }.getPointer(memScope)

internal fun String.toGDString(): CValue<godot_string> = cValue { godot_string_parse_utf8(this.ptr, this@toGDString) }

internal fun CValue<godot_string>.toKString(): String =
        godot_string_utf8(this).useContents {
            val ret = godot_char_string_get_data(this.ptr)?.toKString() ?: throw NullPointerException("Failed to convert Godot-string to Kotlin-string")
            godot_char_string_destroy(this.ptr)
            return ret
        }