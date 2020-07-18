package godot.core

import godot.gdnative.godot_array
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CValue

@ExperimentalUnsignedTypes
class TransformArray : CoreArray<Transform> {
    constructor() : super()
    internal constructor(native: CValue<godot_array>) : super(native)
    internal constructor(mem: COpaquePointer) : super(mem)

    override fun getCore(value: Variant): Transform = value.asTransform()
    override fun getCoreArray(value: CValue<godot_array>) = TransformArray(value)

}

/**
 * Build an TransformArray based on the vararg arguments.
 * Warning: Might be slow with a lot of arguments because GDNative can only append items one by one
 */
@ExperimentalUnsignedTypes
fun TransformArrayOf(vararg elements: Transform) = TransformArray().also {
    for (arg in elements) {
        it.append(arg)
    }
}

/**
 * Convert an iterable into an TransformArray
 * Warning: Might be slow if the iterable contains a lot of items because GDNative can only append items one by one
 */
@ExperimentalUnsignedTypes
fun Iterable<Transform>.toVariantArray() = TransformArray().also {
    for (arg in this) {
        it.append(arg)
    }
}

/**
 * Build a TransformArray based on an Iterable
 * Warning: Might be slow if the iterable contains a lot of items because GDNative can only append items one by one
 */
@ExperimentalUnsignedTypes
fun TransformArray(iter: Iterable<Transform>) = iter.toVariantArray()

/**
 * Create a shallow copy of the Array
 */
fun TransformArray(other: TransformArray) = other.duplicate(false)
