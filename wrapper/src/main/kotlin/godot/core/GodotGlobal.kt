package kotlin.godot.core

import godot.*
import godot.core.*
import kotlinx.cinterop.*


class Godot {
    companion object {
        fun print(message: String){
            godot_print(message.toGDString())
        }

        fun printWarning(description: String, function: String, file: String, line: Int) {
            godot_print_warning(description, function, file, line)
        }

        fun printError(description: String, function: String, file: String, line: Int) {
            godot_print_error(description, function, file, line)
        }
    }
}