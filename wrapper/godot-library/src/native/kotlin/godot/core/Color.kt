@file:Suppress("unused", "MemberVisibilityCanBePrivate")
package godot.core

import godot.gdnative.*
import kotlinx.cinterop.*

actual class Color actual constructor (actual var r: Double, actual var g: Double, actual var b: Double, actual var a: Double): Comparable<Color>, CoreType {

    actual companion object {}

    actual constructor():
            this(0.0, 0.0, 0.0, 1.0)

    actual constructor(r: Number, g: Number, b: Number, a: Number) :
            this(r.toDouble(), g.toDouble(), b.toDouble(), a.toDouble())

    internal constructor(native: CValue<godot_color>) : this() {
        memScoped {
            this@Color.setRawMemory(native.ptr)
        }
    }
    internal constructor(mem: COpaquePointer) : this() {
        this.setRawMemory(mem)
    }


    override fun getRawMemory(memScope: MemScope): COpaquePointer {
        return cValuesOf(r.toFloat(), g.toFloat(), b.toFloat(), a.toFloat()).getPointer(memScope)
    }

    override fun setRawMemory(mem: COpaquePointer) {
        val arr = mem.reinterpret<FloatVar>()
        r = arr[0].toDouble()
        g = arr[1].toDouble()
        b = arr[2].toDouble()
        a = arr[3].toDouble()
    }


    override fun equals(other: Any?): Boolean =
            when (other) {
                is Color -> (r == other.r && g == other.g && b == other.b && a == other.a)
                else -> false
            }

    override fun compareTo(other: Color): Int {
        return when {
            r == other.r -> when {
                g == other.g -> when {
                    b == other.b -> when {
                        a < other.a -> -1
                        a == other.a -> 0
                        else -> 1
                    }
                    b < other.b -> -1
                    else -> 1
                }
                g < other.g -> -1
                else -> 1
            }
            r < other.r -> -1
            else -> 1
        }
    }

    override fun toString() = "$r, $g, $b, $a"
    override fun hashCode(): Int {
        var result = r.hashCode()
        result = 31 * result + g.hashCode()
        result = 31 * result + b.hashCode()
        result = 31 * result + a.hashCode()
        return result
    }
}
