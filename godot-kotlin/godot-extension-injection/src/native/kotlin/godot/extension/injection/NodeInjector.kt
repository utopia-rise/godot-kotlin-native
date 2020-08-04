package godot.extension.injection

import godot.Node

interface NodeInjector<T: Node> {
    fun injectNodes(instance: T)
}
