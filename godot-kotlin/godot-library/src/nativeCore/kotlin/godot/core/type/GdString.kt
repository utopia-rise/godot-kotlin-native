@file:Suppress("unused", "MemberVisibilityCanBePrivate")

package godot.core

import godot.gdnative.godot_string
import godot.gdnative.godot_string_layout
import godot.internal.type.nullSafe
import kotlinx.cinterop.*

inline class GdString(val value: CValue<godot_string_layout>) {

    internal fun toKString(): String {
        return memScoped {
            val charString = nullSafe(Godot.gdnative.godot_string_utf8)(this@GdString.value.ptr)
            val ret = nullSafe(Godot.gdnative.godot_char_string_get_data)(charString.ptr)?.toKString()
                ?: throw NullPointerException("Failed to convert Godot-string to Kotlin-string")
            nullSafe(Godot.gdnative.godot_char_string_destroy)(charString.ptr)
            destroy(this@memScoped)
            ret
        }
    }

    internal fun destroy(memScope: MemScope) =
        nullSafe(Godot.gdnative.godot_string_destroy)(this.value.getPointer(memScope))
}

//From Godot to Kotlin
internal fun GdString(ptr: COpaquePointer) = GdString(ptr.reinterpret())
internal fun GdString(ptr: CPointer<godot_string>) = GdString(ptr.pointed.readValue())

//From Kotlin to Godot
internal fun String.getRawMemory(memScope: MemScope) =
    this.toGDString().value.getPointer(memScope)

internal fun String.toGDString() = memScoped {
    GdString(cValue {
        nullSafe(Godot.gdnative.godot_string_new)(this.ptr)
        nullSafe(Godot.gdnative.godot_string_parse_utf8)(
            this.ptr,
            this@toGDString.cstr.ptr
        )
    })
}

internal fun <T> String.asGDString(block: MemScope.(GdString) -> T): T {
    return memScoped {
        val gdString = GdString(cValue {
            nullSafe(Godot.gdnative.godot_string_new)(this.ptr)
            nullSafe(Godot.gdnative.godot_string_parse_utf8)(
                this.ptr,
                this@asGDString.cstr.ptr
            )
        })
        val ret: T = block(this, gdString)
        nullSafe(Godot.gdnative.godot_string_destroy)(gdString.value.ptr)
        ret
    }
}
