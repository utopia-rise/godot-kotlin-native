package godot.core

import godot.gdnative.godot_array
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CValue

@ExperimentalUnsignedTypes
class Transform2DArray : CoreArray<Transform2D> {
    constructor() : super()
    internal constructor(native: CValue<godot_array>) : super(native)
    internal constructor(mem: COpaquePointer) : super(mem)

    override fun getCore(value: Variant): Transform2D = value.asTransform2D()
    override fun getCoreArray(value: CValue<godot_array>) = Transform2DArray(value)

}

/**
 * Build an Transform2DArray based on the vararg arguments.
 * Warning: Might be slow with a lot of arguments because GDNative can only append items one by one
 */
@ExperimentalUnsignedTypes
fun Transform2DArrayOf(vararg elements: Transform2D) = Transform2DArray().also {
    for (arg in elements) {
        it.append(arg)
    }
}

/**
 * Convert an iterable into an Transform2DArray
 * Warning: Might be slow if the iterable contains a lot of items because GDNative can only append items one by one
 */
@ExperimentalUnsignedTypes
fun Iterable<Transform2D>.toVariantArray() = Transform2DArray().also {
    for (arg in this) {
        it.append(arg)
    }
}

/**
 * Build a Transform2DArray based on an Iterable
 * Warning: Might be slow if the iterable contains a lot of items because GDNative can only append items one by one
 */
@ExperimentalUnsignedTypes
fun transform2DArrayOf(iter: Iterable<Transform2D>) = iter.toVariantArray()

/**
 * Create a shallow copy of the Array
 */
fun transform2DArrayOf(other: Transform2DArray) = other.duplicate(false)
