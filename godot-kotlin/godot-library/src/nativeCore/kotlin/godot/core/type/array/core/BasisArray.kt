package godot.core

import godot.gdnative.godot_array
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CValue

@ExperimentalUnsignedTypes
class BasisArray : CoreArray<Basis> {
    constructor() : super()
    internal constructor(native: CValue<godot_array>) : super(native)
    internal constructor(mem: COpaquePointer) : super(mem)

    override fun getCore(value: Variant): Basis = value.asBasis()
    override fun getCoreArray(value: CValue<godot_array>) = BasisArray(value)

}

/**
 * Build an BasisArray based on the vararg arguments.
 * Warning: Might be slow with a lot of arguments because GDNative can only append items one by one
 */
@ExperimentalUnsignedTypes
fun BasisArrayOf(vararg elements: Basis) = BasisArray().also {
    for (arg in elements) {
        it.append(arg)
    }
}

/**
 * Convert an iterable into an BasisArray
 * Warning: Might be slow if the iterable contains a lot of items because GDNative can only append items one by one
 */
@ExperimentalUnsignedTypes
fun Iterable<Basis>.toVariantArray() = BasisArray().also {
    for (arg in this) {
        it.append(arg)
    }
}

/**
 * Build a BasisArray based on an Iterable
 * Warning: Might be slow if the iterable contains a lot of items because GDNative can only append items one by one
 */
@ExperimentalUnsignedTypes
fun basisArrayOf(iter: Iterable<Basis>) = iter.toVariantArray()

/**
 * Create a shallow copy of the Array
 */
fun basisArrayOf(other: BasisArray) = other.duplicate(false)
