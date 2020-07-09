package godot.core

import godot.gdnative.godot_array
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CValue

@ExperimentalUnsignedTypes
class NodePathArray : CoreArray<NodePath> {
    constructor() : super()
    constructor(other: NodePathArray) : super(other)
    internal constructor(native: CValue<godot_array>) : super(native)
    internal constructor(mem: COpaquePointer) : super(mem)

    override fun getCore(value: Variant): NodePath = value.asNodePath()
    override fun getCoreArray(value: CValue<godot_array>) =
        NodePathArray(value)
}

@ExperimentalUnsignedTypes
fun NodePathArrayOf(vararg elements: NodePath) = NodePathArray().also {
    for (arg in elements) {
        it.append(arg)
    }
}

@ExperimentalUnsignedTypes
fun Iterable<NodePath>.toVariantArray() = NodePathArray().also{
    for (arg in this) {
        it.append(arg)
    }
}

@ExperimentalUnsignedTypes
fun NodePathArray(iter: Iterable<NodePath>) = iter.toVariantArray()
