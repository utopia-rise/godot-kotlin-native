package godot.core

import godot.gdnative.godot_array
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CValue

@ExperimentalUnsignedTypes
class QuatArray : CoreArray<Quat> {
    constructor() : super()
    constructor(other: QuatArray) : super(other)
    internal constructor(native: CValue<godot_array>) : super(native)
    internal constructor(mem: COpaquePointer) : super(mem)

    override fun getCore(value: Variant): Quat = value.asQuat()
    override fun getCoreArray(value: CValue<godot_array>) =
        QuatArray(value)
}

/**
 * Build an QuatArray based on the vararg arguments.
 * Warning: Might be slow with a lot of arguments because GDNative can only append items one by one
 */
@ExperimentalUnsignedTypes
fun QuatArrayOf(vararg elements: Quat) = QuatArray().also {
    for (arg in elements) {
        it.append(arg)
    }
}

/**
 * Convert an iterable into an QuatArray
 * Warning: Might be slow with a lot of arguments because GDNative can only append items one by one
 */
@ExperimentalUnsignedTypes
fun Iterable<Quat>.toVariantArray() = QuatArray().also {
    for (arg in this) {
        it.append(arg)
    }
}

/**
 * Build a QuatArray based on an Iterable
 * Warning: Might be slow with a lot of arguments because GDNative can only append items one by one
 */
@ExperimentalUnsignedTypes
fun quatArrayOf(iter: Iterable<Quat>) = iter.toVariantArray()

fun quatArrayOf(other: QuatArray) = other.duplicate(false)
