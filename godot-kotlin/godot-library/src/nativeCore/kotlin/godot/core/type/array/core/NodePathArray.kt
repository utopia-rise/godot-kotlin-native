package godot.core

import godot.gdnative.godot_array
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CValue

@ExperimentalUnsignedTypes
class NodePathArray : CoreArray<NodePath> {
    constructor() : super()
    internal constructor(native: CValue<godot_array>) : super(native)
    internal constructor(mem: COpaquePointer) : super(mem)

    override fun getCore(value: Variant): NodePath = value.asNodePath()
    override fun getCoreArray(value: CValue<godot_array>) = NodePathArray(value)

}

/**
 * Build an NodePathArray based on the vararg arguments.
 * Warning: Might be slow with a lot of arguments because GDNative can only append items one by one
 */
@ExperimentalUnsignedTypes
fun NodePathArrayOf(vararg elements: NodePath) = NodePathArray().also {
    for (arg in elements) {
        it.append(arg)
    }
}

/**
 * Convert an iterable into an NodePathArray
 * Warning: Might be slow if the iterable contains a lot of items because GDNative can only append items one by one
 */
@ExperimentalUnsignedTypes
fun Iterable<NodePath>.toVariantArray() = NodePathArray().also {
    for (arg in this) {
        it.append(arg)
    }
}

/**
 * Build a NodePathArray based on an Iterable
 * Warning: Might be slow if the iterable contains a lot of items because GDNative can only append items one by one
 */
@ExperimentalUnsignedTypes
fun nodePathArrayOf(iter: Iterable<NodePath>) = iter.toVariantArray()

/**
 * Create a shallow copy of the Array
 */
fun nodePathArrayOf(other: NodePathArray) = other.duplicate(false)
