@file:Suppress("unused", "MemberVisibilityCanBePrivate")
package godot.core


expect class GD {
    companion object {
        fun print(message: String)

        fun printWarning(description: String, function: String, file: String, line: Int)

        fun printError(description: String, function: String, file: String, line: Int, exception: Exception)

        fun printError(description: String, function: String, file: String, line: Int)
    }
}
