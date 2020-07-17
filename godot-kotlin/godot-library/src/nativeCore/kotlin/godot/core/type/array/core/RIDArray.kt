package godot.core

import godot.gdnative.godot_array
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CValue

@ExperimentalUnsignedTypes
class RIDArray : CoreArray<RID> {
    constructor() : super()
    internal constructor(native: CValue<godot_array>) : super(native)
    internal constructor(mem: COpaquePointer) : super(mem)

    override fun getCore(value: Variant): RID = value.asRID()
    override fun getCoreArray(value: CValue<godot_array>) = RIDArray(value)

}

/**
 * Build an RIDArray based on the vararg arguments.
 * Warning: Might be slow with a lot of arguments because GDNative can only append items one by one
 */
@ExperimentalUnsignedTypes
fun RIDArrayOf(vararg elements: RID) = RIDArray().also {
    for (arg in elements) {
        it.append(arg)
    }
}

/**
 * Convert an iterable into an RIDArray
 * Warning: Might be slow if the iterable contains a lot of items because GDNative can only append items one by one
 */
@ExperimentalUnsignedTypes
fun Iterable<RID>.toVariantArray() = RIDArray().also {
    for (arg in this) {
        it.append(arg)
    }
}

/**
 * Build a RIDArray based on an Iterable
 * Warning: Might be slow if the iterable contains a lot of items because GDNative can only append items one by one
 */
@ExperimentalUnsignedTypes
fun ridArrayOf(iter: Iterable<RID>) = iter.toVariantArray()

/**
 * Create a shallow copy of the Array
 */
fun ridArrayOf(other: RIDArray) = other.duplicate(false)
