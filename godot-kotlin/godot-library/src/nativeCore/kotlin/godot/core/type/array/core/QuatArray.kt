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

@ExperimentalUnsignedTypes
fun QuatArrayOf(vararg elements: Quat) = QuatArray().also {
    for (arg in elements) {
        it.append(arg)
    }
}

@ExperimentalUnsignedTypes
fun Iterable<Quat>.toVariantArray() = QuatArray().also{
    for (arg in this) {
        it.append(arg)
    }
}

@ExperimentalUnsignedTypes
fun QuatArray(iter: Iterable<Quat>) = iter.toVariantArray()
