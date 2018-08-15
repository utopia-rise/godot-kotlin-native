package kotlin.godot.registration

import godot.godot_wrapper_register_class
import godot.godot_wrapper_register_method
import kotlinx.cinterop.staticCFunction
import kotlin.godot.Node


private fun NodeRawConstructor(): Node = Node("")
private val NodeConstructor = ::NodeRawConstructor
private val NodeSetRawMem = Node::setRawMemory

private fun Node_ready0(obj: Node) = obj._ready()
private val Node_readyMethod0 = ::Node_ready0


class GodotApiClasses {
    companion object {
        fun registerAll() {
            godot_wrapper_register_class("Node", "Object",
                    staticCFunction { mem -> constructFromRawMem(mem, NodeConstructor, NodeSetRawMem) },
                    staticCFunction { mem -> deconstructFromRawMem(mem) })
            godot_wrapper_register_method("Node", "_ready",
                    staticCFunction { r, o, n, a -> prepareInvocation<Node>(r, o, n, a) { obj, numArgs, args -> run {
                        when (numArgs) {
                            0 -> {
                                Node_readyMethod0(obj)
                            }
                            else -> noMethodToInvoke("_ready", "Node", numArgs)
                        }
                        return@run null }}})
        }
    }
}