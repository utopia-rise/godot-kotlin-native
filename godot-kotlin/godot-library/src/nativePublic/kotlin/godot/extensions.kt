package godot

import godot.core.NodePath
import godot.core.VariantArray
import godot.core.camelToSnakeCase
import kotlin.reflect.KFunction

@Suppress("NOTHING_TO_INLINE", "UNCHECKED_CAST")
inline fun <T: Node> Node.getNode(path: String) = getNode(NodePath(path)) as T

inline fun <reified T: KFunction<*>> Object.callDeferred(method: T, vararg args: Any?) {
    callDeferred(method.name.camelToSnakeCase(), args)
}

inline fun <reified T: KFunction<*>> Object.call(method: T, vararg args: Any?) {
    call(method.name.camelToSnakeCase(), args)
}

inline fun <reified T: KFunction<*>> Object.callv(method: T, argArray: VariantArray) {
    callv(method.name.camelToSnakeCase(), argArray)
}
