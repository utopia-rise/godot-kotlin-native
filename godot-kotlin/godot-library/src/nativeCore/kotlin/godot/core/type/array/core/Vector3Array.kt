package godot.core

import godot.gdnative.godot_array
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CValue

@ExperimentalUnsignedTypes
class Vector3Array : CoreArray<Vector3> {
    constructor() : super()
    internal constructor(native: CValue<godot_array>) : super(native)
    internal constructor(mem: COpaquePointer) : super(mem)

    override fun getCore(value: Variant): Vector3 = value.asVector3()
    override fun getCoreArray(value: CValue<godot_array>) = Vector3Array(value)

}

/**
 * Build an Vector3Array based on the vararg arguments.
 * Warning: Might be slow with a lot of arguments because GDNative can only append items one by one
 */
@ExperimentalUnsignedTypes
fun Vector3ArrayOf(vararg elements: Vector3) = Vector3Array().also {
    for (arg in elements) {
        it.append(arg)
    }
}

/**
 * Convert an iterable into an Vector3Array
 * Warning: Might be slow if the iterable contains a lot of items because GDNative can only append items one by one
 */
@ExperimentalUnsignedTypes
fun Iterable<Vector3>.toVariantArray() = Vector3Array().also {
    for (arg in this) {
        it.append(arg)
    }
}

/**
 * Build a Vector3Array based on an Iterable
 * Warning: Might be slow if the iterable contains a lot of items because GDNative can only append items one by one
 */
@ExperimentalUnsignedTypes
fun Vector3Array(iter: Iterable<Vector3>) = iter.toVariantArray()

/**
 * Create a shallow copy of the Array
 */
fun Vector3Array(other: Vector3Array) = other.duplicate(false)
