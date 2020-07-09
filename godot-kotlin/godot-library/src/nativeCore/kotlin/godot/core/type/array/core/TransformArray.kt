package godot.core

import godot.gdnative.godot_array
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CValue

@ExperimentalUnsignedTypes
class TransformArray : CoreArray<Transform> {
    constructor() : super()
    constructor(other: TransformArray) : super(other)
    internal constructor(native: CValue<godot_array>) : super(native)
    internal constructor(mem: COpaquePointer) : super(mem)

    override fun getCore(value: Variant): Transform = value.asTransform()
    override fun getCoreArray(value: CValue<godot_array>) =
        TransformArray(value)
}

@ExperimentalUnsignedTypes
fun TransformArrayOf(vararg elements: Transform) = TransformArray().also {
    for (arg in elements) {
        it.append(arg)
    }
}

@ExperimentalUnsignedTypes
fun Iterable<Transform>.toVariantArray() = TransformArray().also{
    for (arg in this) {
        it.append(arg)
    }
}

@ExperimentalUnsignedTypes
fun TransformArray(iter: Iterable<Transform>) = iter.toVariantArray()
