package godot

import godot.core.NodePath

inline fun <T: Resource> ResourceLoader.load(path: String, typeHint: String = "", noCache: Boolean = false) = load(
    path, typeHint, noCache
) as T

inline fun <T: Node> Node.getNode(path: String) = getNode(NodePath(path)) as T
