package godot.core

import godot.gdnative.godot_array
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CValue

@ExperimentalUnsignedTypes
class PlaneArray : CoreArray<Plane> {
    constructor() : super()
    constructor(other: PlaneArray) : super(other)
    internal constructor(native: CValue<godot_array>) : super(native)
    internal constructor(mem: COpaquePointer) : super(mem)

    override fun getCore(value: Variant): Plane = value.asPlane()
    override fun getCoreArray(value: CValue<godot_array>) =
        PlaneArray(value)
}

@ExperimentalUnsignedTypes
fun PlaneArrayOf(vararg elements: Plane) = PlaneArray().also {
    for (arg in elements) {
        it.append(arg)
    }
}

@ExperimentalUnsignedTypes
fun Iterable<Plane>.toVariantArray() = PlaneArray().also{
    for (arg in this) {
        it.append(arg)
    }
}

@ExperimentalUnsignedTypes
fun PlaneArray(iter: Iterable<Plane>) = iter.toVariantArray()
