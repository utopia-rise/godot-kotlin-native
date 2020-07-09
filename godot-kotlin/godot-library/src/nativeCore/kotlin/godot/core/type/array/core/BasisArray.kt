package godot.core.type.array.core

import godot.core.Basis
import godot.core.CoreArray
import godot.core.Variant
import godot.gdnative.godot_array
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CValue

@ExperimentalUnsignedTypes
class BasisArray : CoreArray<Basis> {
    constructor() : super()
    constructor(other: BasisArray) : super(other)
    internal constructor(native: CValue<godot_array>) : super(native)
    internal constructor(mem: COpaquePointer) : super(mem)

    override fun getCore(value: Variant): Basis = value.asBasis()
    override fun getCoreArray(value: CValue<godot_array>) =
        BasisArray(value)
}

@ExperimentalUnsignedTypes
fun BasisArrayOf(vararg elements: Basis) = BasisArray().also {
    for (arg in elements) {
        it.append(arg)
    }
}

@ExperimentalUnsignedTypes
fun Iterable<Basis>.toVariantArray() = BasisArray().also{
    for (arg in this) {
        it.append(arg)
    }
}

@ExperimentalUnsignedTypes
fun BasisArray(iter: Iterable<Basis>) = iter.toVariantArray()
