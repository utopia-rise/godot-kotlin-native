@file:Suppress("unused", "MemberVisibilityCanBePrivate")

package godot.core

import godot.gdnative.godot_string
import kotlinx.cinterop.*


//From Godot to Kotlin
internal fun String(ptr: COpaquePointer): String {
    return ptr.reinterpret<godot_string>().pointed.readValue().toKString()
}

internal fun CValue<godot_string>.toKString(): String {
    return memScoped {
        val charString = checkNotNull(Godot.gdnative.godot_string_utf8)(this@toKString.ptr)
        val ret = checkNotNull(Godot.gdnative.godot_char_string_get_data)(charString.ptr)?.toKString()
            ?: throw NullPointerException("Failed to convert Godot-string to Kotlin-string")
        checkNotNull(Godot.gdnative.godot_char_string_destroy)(charString.ptr)
        ret
    }
}

//From Kotlin to Godot
internal fun String.getRawMemory(memScope: MemScope): COpaquePointer {
    return this.toGDString().getPointer(memScope)
}

internal fun String.toGDString(): CValue<godot_string> {
    return memScoped {
        cValue {
            checkNotNull(Godot.gdnative.godot_string_new)(this.ptr)
            checkNotNull(Godot.gdnative.godot_string_parse_utf8)(
                this.ptr,
                this@toGDString.cstr.ptr
            )
        }
    }
}

internal fun <T> String.asGDString(block: MemScope.(CValue<godot_string>) -> T): T {
    return memScoped {
        val gdString = cValue<godot_string> {
            checkNotNull(Godot.gdnative.godot_string_new)(this.ptr)
            checkNotNull(Godot.gdnative.godot_string_parse_utf8)(
                this.ptr,
                this@asGDString.cstr.ptr
            )
        }
        val ret: T = block(this, gdString)
        checkNotNull(Godot.gdnative.godot_string_destroy)(gdString.ptr)
        ret
    }
}

