package godot

import godot.core.NodePath
import godot.core.camelToSnakeCase
import kotlin.reflect.KFunction

@Suppress("NOTHING_TO_INLINE", "UNCHECKED_CAST")
inline fun <T: Node> Node.getNode(path: String) = getNode(NodePath(path)) as T

inline fun <reified T: KFunction<*>> Object.callDeferred(method: T, vararg args: Any?) {
    callDeferred(method.name.camelToSnakeCase(), args)
}
