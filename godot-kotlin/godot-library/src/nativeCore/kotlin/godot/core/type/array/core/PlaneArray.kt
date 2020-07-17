package godot.core

import godot.gdnative.godot_array
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CValue

@ExperimentalUnsignedTypes
class PlaneArray : CoreArray<Plane> {
    constructor() : super()
    internal constructor(native: CValue<godot_array>) : super(native)
    internal constructor(mem: COpaquePointer) : super(mem)

    override fun getCore(value: Variant): Plane = value.asPlane()
    override fun getCoreArray(value: CValue<godot_array>) = PlaneArray(value)

}

/**
 * Build an PlaneArray based on the vararg arguments.
 * Warning: Might be slow with a lot of arguments because GDNative can only append items one by one
 */
@ExperimentalUnsignedTypes
fun PlaneArrayOf(vararg elements: Plane) = PlaneArray().also {
    for (arg in elements) {
        it.append(arg)
    }
}

/**
 * Convert an iterable into an PlaneArray
 * Warning: Might be slow if the iterable contains a lot of items because GDNative can only append items one by one
 */
@ExperimentalUnsignedTypes
fun Iterable<Plane>.toVariantArray() = PlaneArray().also {
    for (arg in this) {
        it.append(arg)
    }
}

/**
 * Build a PlaneArray based on an Iterable
 * Warning: Might be slow if the iterable contains a lot of items because GDNative can only append items one by one
 */
@ExperimentalUnsignedTypes
fun planeArrayOf(iter: Iterable<Plane>) = iter.toVariantArray()

/**
 * Create a shallow copy of the Array
 */
fun planeArrayOf(other: PlaneArray) = other.duplicate(false)
