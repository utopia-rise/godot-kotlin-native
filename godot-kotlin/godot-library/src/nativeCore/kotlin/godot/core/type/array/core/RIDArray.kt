package godot.core

import godot.gdnative.godot_array
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CValue

@ExperimentalUnsignedTypes
class RIDArray : CoreArray<RID> {
    constructor() : super()
    constructor(other: RIDArray) : super(other)
    internal constructor(native: CValue<godot_array>) : super(native)
    internal constructor(mem: COpaquePointer) : super(mem)

    override fun getCore(value: Variant): RID = value.asRID()
    override fun getCoreArray(value: CValue<godot_array>) =
        RIDArray(value)
}

@ExperimentalUnsignedTypes
fun RIDArrayOf(vararg elements: RID) = RIDArray().also {
    for (arg in elements) {
        it.append(arg)
    }
}

@ExperimentalUnsignedTypes
fun Iterable<RID>.toVariantArray() = RIDArray().also{
    for (arg in this) {
        it.append(arg)
    }
}

@ExperimentalUnsignedTypes
fun RIDArray(iter: Iterable<RID>) = iter.toVariantArray()
