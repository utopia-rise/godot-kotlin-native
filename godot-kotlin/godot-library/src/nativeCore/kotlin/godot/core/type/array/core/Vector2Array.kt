package godot.core

import godot.gdnative.godot_array
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CValue
import kotlinx.cinterop.invoke

@ExperimentalUnsignedTypes
class Vector2Array : CoreArray<Vector2> {
    constructor() : super()
    constructor(other: Vector2Array) : super(other)
    constructor(other: PoolVector2Array) {
        callNative {
            checkNotNull(Godot.gdnative.godot_array_new_pool_vector2_array)(it, other._handle.ptr)
        }
    }

    internal constructor(native: CValue<godot_array>) : super(native)
    internal constructor(mem: COpaquePointer) : super(mem)

    override fun getCore(value: Variant): Vector2 = value.asVector2()
    override fun getCoreArray(value: CValue<godot_array>) =
        Vector2Array(value)
}

@ExperimentalUnsignedTypes
fun Vector2ArrayOf(vararg elements: Vector2) = Vector2Array().also {
    for (arg in elements) {
        it.append(arg)
    }
}

@ExperimentalUnsignedTypes
fun Iterable<Vector2>.toVariantArray() = Vector2Array().also{
    for (arg in this) {
        it.append(arg)
    }
}

@ExperimentalUnsignedTypes
fun Vector2Array(iter: Iterable<Vector2>) = iter.toVariantArray()
