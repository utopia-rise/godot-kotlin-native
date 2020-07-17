package godot.core

import godot.gdnative.godot_array
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CValue

@ExperimentalUnsignedTypes
class AABBArray : CoreArray<AABB> {
    constructor() : super()
    internal constructor(native: CValue<godot_array>) : super(native)
    internal constructor(mem: COpaquePointer) : super(mem)

    override fun getCore(value: Variant): AABB = value.asAABB()
    override fun getCoreArray(value: CValue<godot_array>) = AABBArray(value)

}

/**
 * Build an AABBArray based on the vararg arguments.
 * Warning: Might be slow with a lot of arguments because GDNative can only append items one by one
 */
@ExperimentalUnsignedTypes
fun AABBArrayOf(vararg elements: AABB) = AABBArray().also {
    for (arg in elements) {
        it.append(arg)
    }
}

/**
 * Convert an iterable into an AABBArray
 * Warning: Might be slow if the iterable contains a lot of items because GDNative can only append items one by one
 */
@ExperimentalUnsignedTypes
fun Iterable<AABB>.toVariantArray() = AABBArray().also {
    for (arg in this) {
        it.append(arg)
    }
}

/**
 * Build a AABBArray based on an Iterable
 * Warning: Might be slow if the iterable contains a lot of items because GDNative can only append items one by one
 */
@ExperimentalUnsignedTypes
fun aabbArrayOf(iter: Iterable<AABB>) = iter.toVariantArray()

/**
 * Create a shallow copy of the Array
 */
fun aabbArrayOf(other: AABBArray) = other.duplicate(false)
