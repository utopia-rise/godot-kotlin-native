package kotlin.godot.core

import godot.*
import kotlinx.cinterop.*


class Godot {
    companion object {
        fun print(message: GodotString) {
            message.nativeValue.useContents {
                godot_print(this.ptr)
            }
        }

        fun print(message: String){
            memScoped {
                val gMessage = alloc<godot_string>()

                godot_string_new(gMessage.ptr)
                godot_string_parse_utf8(gMessage.ptr, message)
                godot_print(gMessage.ptr)
            }
        }

        fun print_warning(description: GodotString, function: GodotString, file: GodotString, line: Int) {
            godot_print_warning(description.toString(), function.toString(), file.toString(), line)
        }

        fun print_warning(description: String, function: String, file: String, line: Int) {
            godot_print_warning(description, function, file, line)
        }

        fun print_error(description: GodotString, function: GodotString, file: GodotString, line: Int) {
            godot_print_error(description.toString(), function.toString(), file.toString(), line)
        }

        fun print_error(description: String, function: String, file: String, line: Int) {
            godot_print_error(description, function, file, line)
        }
    }
}