package kotlin.godot

import godot.godot_string
import kotlinx.cinterop.*


fun g_print() {
    memScoped {
        val helloPtr = "hello".cstr.getPointer(memScope)
        val gHello = alloc<godot_string>()

        API.godot_string_new!!(gHello.ptr)
        API.godot_string_parse_utf8!!(gHello.ptr, helloPtr)
        API.godot_print!!(gHello.ptr)
    }
}