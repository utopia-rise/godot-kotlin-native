@file:Suppress("unused", "MemberVisibilityCanBePrivate")
package godot.core

import godot.gdnative.godot_vector2
import kotlinx.cinterop.*


actual class Vector2(actual var x: Double, actual var y: Double) : Comparable<Vector2>, CoreType {

    companion object {
        fun linearInterpolate(vector1: Vector2, vector2: Vector2, t: Double): Vector2 {
            val res: Vector2 = vector1
            res.x += (t * (vector2.x - vector1.x))
            res.y += (t * (vector2.y - vector1.y))
            return res
        }
    }

    enum class Axis(private val value: Int) {
        X(0),
        Y(1);

        companion object {
            fun from(value: Int): Axis {
                values().forEach {
                    if (it.value == value) return it
                }
                throw AssertionError("$value is not a valid value for Enum Vector2.Axis")
            }
        }
    }

    actual constructor() :
            this(0.0, 0.0)

    actual constructor(x: Number, y: Number) :
            this(x.toDouble(), y.toDouble())


    internal constructor(native: CValue<godot_vector2>) : this(0.0, 0.0) {
        memScoped {
            this@Vector2.setRawMemory(native.ptr)
        }
    }
    internal constructor(mem: COpaquePointer) : this() {
        this.setRawMemory(mem)
    }


    override fun getRawMemory(memScope: MemScope): COpaquePointer {
        return cValuesOf(x.toFloat(), y.toFloat()).getPointer(memScope)
    }
    override fun setRawMemory(mem: COpaquePointer) {
        val arr = mem.reinterpret<FloatVar>()
        x = arr[0].toDouble()
        y = arr[1].toDouble()
    }



    actual var width: Double
        get() = x
        set(value) {
            x = value
        }
    actual var height: Double
        get() = y
        set(value) {
            y = value
        }


    override fun equals(other: Any?): Boolean =
            when (other) {
                is Vector2 -> (x == other.x && y == other.y)
                else -> false
            }

    override fun compareTo(other: Vector2): Int =
            if (x == other.x) {
                when {
                    y < other.y -> -1
                    y == other.y -> 0
                    else -> 1
                }
            } else {
                when {
                    x < other.x -> -1
                    else -> 1
                }
            }

    override fun toString() = "$x, $y"
    override fun hashCode(): Int = this.toString().hashCode()
}
