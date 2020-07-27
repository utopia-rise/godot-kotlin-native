@file:Suppress("unused", "MemberVisibilityCanBePrivate")

package godot.core

import godot.gdnative.godot_string_layout
import godot.internal.type.nullSafe
import kotlinx.cinterop.*

typealias GdString = CValue<godot_string_layout>

//From Godot to Kotlin
internal fun String(ptr: COpaquePointer): String {
    return ptr.reinterpret<godot_string_layout>().pointed.readValue().toKString()
}

internal fun GdString.toKString(): String {
    return memScoped {
        val charString = nullSafe(Godot.gdnative.godot_string_utf8)(this@toKString.ptr)
        val ret = nullSafe(Godot.gdnative.godot_char_string_get_data)(charString.ptr)?.toKString()
            ?: throw NullPointerException("Failed to convert Godot-string to Kotlin-string")
        nullSafe(Godot.gdnative.godot_char_string_destroy)(charString.ptr)
        nullSafe(Godot.gdnative.godot_string_destroy)(this@toKString.ptr)
        ret
    }
}

//From Kotlin to Godot
internal fun String.getRawMemory(memScope: MemScope): COpaquePointer {
    return this.toGDString().getPointer(memScope)
}

internal fun String.toGDString(): GdString {
    return memScoped {
        cValue {
            nullSafe(Godot.gdnative.godot_string_new)(this.ptr)
            nullSafe(Godot.gdnative.godot_string_parse_utf8)(
                this.ptr,
                this@toGDString.cstr.ptr
            )
        }
    }
}

internal fun <T> String.asGDString(block: MemScope.(GdString) -> T): T {
    return memScoped {
        val gdString = cValue<godot_string_layout> {
            nullSafe(Godot.gdnative.godot_string_new)(this.ptr)
            nullSafe(Godot.gdnative.godot_string_parse_utf8)(
                this.ptr,
                this@asGDString.cstr.ptr
            )
        }
        val ret: T = block(this, gdString)
        nullSafe(Godot.gdnative.godot_string_destroy)(gdString.ptr)
        ret
    }
}
