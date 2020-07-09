package godot.core

import godot.gdnative.godot_array
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CValue

@ExperimentalUnsignedTypes
class AABBArray : CoreArray<AABB> {
    constructor() : super()
    constructor(other: AABBArray) : super(other)
    internal constructor(native: CValue<godot_array>) : super(native)
    internal constructor(mem: COpaquePointer) : super(mem)

    override fun getCore(value: Variant): AABB = value.asAABB()
    override fun getCoreArray(value: CValue<godot_array>) =
        AABBArray(value)
}

@ExperimentalUnsignedTypes
fun AABBArrayOf(vararg elements: AABB) = AABBArray().also {
    for (arg in elements) {
        it.append(arg)
    }
}

@ExperimentalUnsignedTypes
fun Iterable<AABB>.toVariantArray() = AABBArray().also{
    for (arg in this) {
        it.append(arg)
    }
}

@ExperimentalUnsignedTypes
fun AABBArray(iter: Iterable<AABB>) = iter.toVariantArray()

