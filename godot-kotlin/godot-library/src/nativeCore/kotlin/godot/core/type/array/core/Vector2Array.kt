package godot.core

import godot.gdnative.godot_array
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CValue

@ExperimentalUnsignedTypes
class Vector2Array : CoreArray<Vector2> {
    constructor() : super()
    internal constructor(native: CValue<godot_array>) : super(native)
    internal constructor(mem: COpaquePointer) : super(mem)

    override fun getCore(value: Variant): Vector2 = value.asVector2()
    override fun getCoreArray(value: CValue<godot_array>) = Vector2Array(value)

}

/**
 * Build an Vector2Array based on the vararg arguments.
 * Warning: Might be slow with a lot of arguments because GDNative can only append items one by one
 */
@ExperimentalUnsignedTypes
fun Vector2ArrayOf(vararg elements: Vector2) = Vector2Array().also {
    for (arg in elements) {
        it.append(arg)
    }
}

/**
 * Convert an iterable into an Vector2Array
 * Warning: Might be slow if the iterable contains a lot of items because GDNative can only append items one by one
 */
@ExperimentalUnsignedTypes
fun Iterable<Vector2>.toVariantArray() = Vector2Array().also {
    for (arg in this) {
        it.append(arg)
    }
}

/**
 * Build a Vector2Array based on an Iterable
 * Warning: Might be slow if the iterable contains a lot of items because GDNative can only append items one by one
 */
@ExperimentalUnsignedTypes
fun vector2ArrayOf(iter: Iterable<Vector2>) = iter.toVariantArray()

/**
 * Create a shallow copy of the Array
 */
fun vector2ArrayOf(other: Vector2Array) = other.duplicate(false)
