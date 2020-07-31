package godot

import godot.core.NodePath

@Suppress("NOTHING_TO_INLINE", "UNCHECKED_CAST")
inline fun <T: Node> Node.getNode(path: String) = getNode(NodePath(path)) as T
