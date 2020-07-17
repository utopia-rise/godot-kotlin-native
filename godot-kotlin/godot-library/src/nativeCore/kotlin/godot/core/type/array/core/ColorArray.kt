package godot.core

import godot.gdnative.godot_array
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CValue

@ExperimentalUnsignedTypes
class ColorArray : CoreArray<Color> {
    constructor() : super()
    internal constructor(native: CValue<godot_array>) : super(native)
    internal constructor(mem: COpaquePointer) : super(mem)

    override fun getCore(value: Variant): Color = value.asColor()
    override fun getCoreArray(value: CValue<godot_array>) = ColorArray(value)

}

/**
 * Build an ColorArray based on the vararg arguments.
 * Warning: Might be slow with a lot of arguments because GDNative can only append items one by one
 */
@ExperimentalUnsignedTypes
fun ColorArrayOf(vararg elements: Color) = ColorArray().also {
    for (arg in elements) {
        it.append(arg)
    }
}

/**
 * Convert an iterable into an ColorArray
 * Warning: Might be slow if the iterable contains a lot of items because GDNative can only append items one by one
 */
@ExperimentalUnsignedTypes
fun Iterable<Color>.toVariantArray() = ColorArray().also {
    for (arg in this) {
        it.append(arg)
    }
}

/**
 * Build a ColorArray based on an Iterable
 * Warning: Might be slow if the iterable contains a lot of items because GDNative can only append items one by one
 */
@ExperimentalUnsignedTypes
fun colorArrayOf(iter: Iterable<Color>) = iter.toVariantArray()

/**
 * Create a shallow copy of the Array
 */
fun colorArrayOf(other: ColorArray) = other.duplicate(false)
