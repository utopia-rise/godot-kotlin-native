package godot.global

import godot.core.Godot
import godot.core.Variant

internal interface gdPrint {
    val builder: StringBuilder

    /** Converts one or more arguments to strings in the best way possible and prints them to the console.**/
    fun print(args: Array<Variant>) {
        for (arg in args) {
            builder.append(arg.toString())
        }
        Godot.print(builder.toString())
        builder.clear()
    }

    /** Prints one or more arguments to the console with a space between each argument.**/
    fun prints(args: Array<Variant>) {
        for (arg in args) {
            builder.append(arg.toString())
            builder.append(" ")
        }
        Godot.print(builder.trimEnd().toString())
        builder.clear()
    }

    /** Converts one or more arguments to strings in the best way possible and prints them to the console.**/
    fun printt(args: Array<Variant>) {
        for (arg in args) {
            builder.append(arg.toString())
            builder.append("    ")
        }
        Godot.print(builder.trimEnd().toString())
        builder.clear()
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
