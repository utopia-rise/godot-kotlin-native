package kotlin.godot.core

import godot.core.toGDString
import godot.godot_print
import godot.godot_print_error
import godot.godot_print_warning


class Godot {
    companion object {
        fun print(message: String){
            godot_print(message.toGDString())
        }

        fun printWarning(description: String, function: String, file: String, line: Int) {
            godot_print_warning(description, function, file, line)
        }

        fun printError(description: String, function: String, file: String, line: Int, exception: Exception) {
            godot_print_error(description, function, file, line)
            throw exception
        }

        fun printError(description: String, function: String, file: String, line: Int) {
            godot_print_error(description, function, file, line)
        }
    }
}