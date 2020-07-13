package godot.core

import godot.gdnative.godot_array
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CValue

@ExperimentalUnsignedTypes
class Rect2Array : CoreArray<Rect2> {
    constructor() : super()
    internal constructor(native: CValue<godot_array>) : super(native)
    internal constructor(mem: COpaquePointer) : super(mem)

    override fun getCore(value: Variant): Rect2 = value.asRect2()
    override fun getCoreArray(value: CValue<godot_array>) = Rect2Array(value)

}

/**
 * Build an Rect2Array based on the vararg arguments.
 * Warning: Might be slow with a lot of arguments because GDNative can only append items one by one
 */
@ExperimentalUnsignedTypes
fun Rect2ArrayOf(vararg elements: Rect2) = Rect2Array().also {
    for (arg in elements) {
        it.append(arg)
    }
}

/**
 * Convert an iterable into an Rect2Array
 * Warning: Might be slow if the iterable contains a lot of items because GDNative can only append items one by one
 */
@ExperimentalUnsignedTypes
fun Iterable<Rect2>.toVariantArray() = Rect2Array().also {
    for (arg in this) {
        it.append(arg)
    }
}

/**
 * Build a Rect2Array based on an Iterable
 * Warning: Might be slow if the iterable contains a lot of items because GDNative can only append items one by one
 */
@ExperimentalUnsignedTypes
fun Rect2Array(iter: Iterable<Rect2>) = iter.toVariantArray()

/**
 * Create a shallow copy of the Array
 */
fun Rect2Array(other: Rect2Array) = other.duplicate(false)
