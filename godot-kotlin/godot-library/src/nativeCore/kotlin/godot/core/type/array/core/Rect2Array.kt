package godot.core

import godot.gdnative.godot_array
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CValue

@ExperimentalUnsignedTypes
class Rect2Array : CoreArray<Rect2> {
    constructor() : super()
    constructor(other: Rect2Array) : super(other)
    internal constructor(native: CValue<godot_array>) : super(native)
    internal constructor(mem: COpaquePointer) : super(mem)

    override fun getCore(value: Variant): Rect2 = value.asRect2()
    override fun getCoreArray(value: CValue<godot_array>) =
        Rect2Array(value)
}

@ExperimentalUnsignedTypes
fun Rect2ArrayOf(vararg elements: Rect2) = Rect2Array().also {
    for (arg in elements) {
        it.append(arg)
    }
}

@ExperimentalUnsignedTypes
fun Iterable<Rect2>.toVariantArray() = Rect2Array().also{
    for (arg in this) {
        it.append(arg)
    }
}

@ExperimentalUnsignedTypes
fun Rect2Array(iter: Iterable<Rect2>) = iter.toVariantArray()
