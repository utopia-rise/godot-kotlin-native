@file:Suppress("unused", "MemberVisibilityCanBePrivate")
package godot.core

import godot.gdnative.godot_vector3
import kotlinx.cinterop.*


actual class Vector3(actual var x: Double, actual var y: Double, actual var z: Double) : Comparable<Vector3>, CoreType {
    actual enum class Axis (val id: Long) {
        AXIS_X(0),
        AXIS_Y(1),
        AXIS_Z(2);

        actual companion object {
            actual fun fromInt(value: Long) = values().single { it.id == value }
        }
    }


    actual constructor() :
            this(0.0, 0.0, 0.0)

    actual constructor(x: Number, y: Number, z: Number) :
            this(x.toDouble(), y.toDouble(), z.toDouble())


    internal constructor(native: CValue<godot_vector3>) : this() {
        memScoped {
            this@Vector3.setRawMemory(native.ptr)
        }
    }
    internal constructor(mem: COpaquePointer) : this() {
        this.setRawMemory(mem)
    }


    override fun getRawMemory(memScope: MemScope): COpaquePointer {
        return cValuesOf(x.toFloat(), y.toFloat(), z.toFloat()).getPointer(memScope)
    }
    override fun setRawMemory(mem: COpaquePointer) {
        val arr = mem.reinterpret<FloatVar>()
        x = arr[0].toDouble()
        y = arr[1].toDouble()
        z = arr[2].toDouble()
    }

    override fun equals(other: Any?): Boolean =
            when (other) {
                is Vector3 -> (x == other.x && y == other.y && z == other.z)
                else -> false
            }

    override fun compareTo(other: Vector3): Int {
        if (x == other.x) {
            return if (y == other.y)
                when {
                    z < other.z -> -1
                    z == other.z -> 0
                    else -> 1
                }
            else
                when {
                    y < other.y -> -1
                    else -> 1
                }
        } else
            return when {
                x < other.x -> -1
                else -> 1
            }
    }

    override fun toString() = "($x, $y, $z)"
    override fun hashCode(): Int = this.toString().hashCode()
}


