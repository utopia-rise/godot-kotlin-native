package godot.core

import godot.gdnative.godot_array
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CValue

@ExperimentalUnsignedTypes
class Transform2DArray : CoreArray<Transform2D> {
    constructor() : super()
    constructor(other: Transform2DArray) : super(other)
    internal constructor(native: CValue<godot_array>) : super(native)
    internal constructor(mem: COpaquePointer) : super(mem)

    override fun getCore(value: Variant): Transform2D = value.asTransform2D()
    override fun getCoreArray(value: CValue<godot_array>) =
        Transform2DArray(value)
}

@ExperimentalUnsignedTypes
fun Transform2DArrayOf(vararg elements: Transform2D) = Transform2DArray().also {
    for (arg in elements) {
        it.append(arg)
    }
}

@ExperimentalUnsignedTypes
fun Iterable<Transform2D>.toVariantArray() = Transform2DArray().also{
    for (arg in this) {
        it.append(arg)
    }
}

@ExperimentalUnsignedTypes
fun Transform2DArray(iter: Iterable<Transform2D>) = iter.toVariantArray()
