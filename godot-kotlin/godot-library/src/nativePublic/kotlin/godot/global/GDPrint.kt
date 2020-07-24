package godot.global

import godot.core.Godot
import godot.core.Variant
import kotlin.native.concurrent.AtomicReference

internal interface GDPrint {
    val builder: AtomicReference<StringBuilder>

    /** Converts one or more arguments to strings in the best way possible and prints them to the console.**/
    fun print(vararg args: Any?) {
        for (arg in args) {
            builder.value.append(arg.toString())
        }
        Godot.print(builder.toString())
        builder.value.clear()
    }

    /** Prints one or more arguments to the console with a space between each argument.**/
    fun prints(vararg args: Any?) {
        for (arg in args) {
            builder.value.append(arg.toString())
            builder.value.append(" ")
        }
        Godot.print(builder.value.trimEnd().toString())
        builder.value.clear()
    }

    /** Converts one or more arguments to strings in the best way possible and prints them to the console.**/
    fun printt(vararg args: Any?) {
        for (arg in args) {
            builder.value.append(arg.toString())
            builder.value.append("    ")
        }
        Godot.print(builder.value.trimEnd().toString())
        builder.value.clear()
    }

    /** Pushes an error message to Godot's built-in debugger and to the OS terminal. */
    fun pushError(description: String, function: String, file: String, line: Int) {
        Godot.printError(description, function, file, line)
    }

    /** Pushes a warming message to Godot's built-in debugger and to the OS terminal. */
    fun pushWarning(description: String, function: String, file: String, line: Int) {
        Godot.printWarning(description, function, file, line)
    }
}
