package godot.core

import godot.gdnative.godot_array
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CValue
import kotlinx.cinterop.invoke

@ExperimentalUnsignedTypes
class Vector3Array : CoreArray<Vector3> {
    constructor() : super()
    constructor(other: Vector3Array) : super(other)
    constructor(other: PoolVector3Array) {
        callNative {
            checkNotNull(Godot.gdnative.godot_array_new_pool_vector3_array)(it, other._handle.ptr)
        }
    }

    internal constructor(native: CValue<godot_array>) : super(native)
    internal constructor(mem: COpaquePointer) : super(mem)

    override fun getCore(value: Variant): Vector3 = value.asVector3()
    override fun getCoreArray(value: CValue<godot_array>) =
        Vector3Array(value)
}

@ExperimentalUnsignedTypes
fun Vector3ArrayOf(vararg elements: Vector3) = Vector3Array().also {
    for (arg in elements) {
        it.append(arg)
    }
}

@ExperimentalUnsignedTypes
fun Iterable<Vector3>.toVariantArray() = Vector3Array().also{
    for (arg in this) {
        it.append(arg)
    }
}

@ExperimentalUnsignedTypes
fun Vector3Array(iter: Iterable<Vector3>) = iter.toVariantArray()
