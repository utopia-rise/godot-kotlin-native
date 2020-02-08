@file:Suppress("unused", "MemberVisibilityCanBePrivate")
package godot.core

import godot.gdnative.godot_quat
import kotlinx.cinterop.*
import kotlin.math.*

actual class Quat: CoreType {
    actual var x: Double = 0.0
    actual var y: Double = 0.0
    actual var z: Double = 0.0
    actual var w: Double = 1.0


    actual constructor(basis: Basis) {
        val trace = basis[0][0] + basis[1][1] + basis[2][2]
        val temp: DoubleArray

        if(trace > 0.0) {
            var s = sqrt(trace + 1.0)
            val temp3 = s * 0.5
            s = 0.5 / s
            temp = doubleArrayOf(((basis[2][1] - basis[1][2]) * s),
                    ((basis[0][2] - basis[2][0]) * s),
                    ((basis[1][0] - basis[0][1]) * s),
                    temp3)
        }
        else {
            temp = doubleArrayOf(0.0, 0.0, 0.0 ,0.0)
            val i = if (basis[0][0] < basis[1][1]) {
                if (basis[1][1] < basis[2][2]) 2 else 1
            } else {
                if (basis[0][0] < basis[2][2]) 2 else 0
            }
            val j = (i + 1) % 3
            val k = (i + 2) % 3

            var s = sqrt(basis[i][i] - basis[j][j] - basis[k][k] + 1.0)
            temp[i] = s * 0.5
            s = 0.5 / s
            temp[3] = (basis[k][j] - basis[j][k]) * s
            temp[j] = (basis[j][i] + basis[i][j]) * s
            temp[k] = (basis[k][i] + basis[i][k]) * s
        }
        Quat(temp[0],temp[1],temp[2],temp[3])
    }

    actual constructor(x: Number, y: Number, z: Number, w: Number) {
        this.x = x.toDouble()
        this.y = y.toDouble()
        this.z = z.toDouble()
        this.w = w.toDouble()
    }

    actual constructor() :
            this(0.0, 0.0, 0.0, 1.0)

    actual constructor(axis: Vector3, angle: Double) {
        val d: Double = axis.length()
        if (d == 0.0) set(0.0, 0.0, 0.0, 0.0)
        else {
            val sinAngle: Double = sin(angle * 0.5)
            val cosAngle: Double = cos(angle * 0.5)
            val s: Double = sinAngle / d
            set(axis.x * s, axis.y * s, axis.z * s, cosAngle)
        }
    }

    actual constructor(v0: Vector3, v1: Vector3) {
        val c = v0.cross(v1)
        val d = v0.dot(v1)

        if (d < -1.0 + CMP_EPSILON) {
            x = 0.0
            y = 1.0
            z = 0.0
            w = 0.0
        } else {
            val s = sqrt((1.0 + d) * 2.0)
            val rs = 1.0 / s
            x = c.x * rs
            y = c.y * rs
            z = c.z * rs
            w = s * 0.5
        }
    }


    internal constructor(native: CValue<godot_quat>) : this() {
        memScoped {
            this@Quat.setRawMemory(native.ptr)
        }
    }
    internal constructor(mem: COpaquePointer) {
        this.setRawMemory(mem)
    }


    override fun getRawMemory(memScope: MemScope): COpaquePointer {
        return cValuesOf(x.toFloat(), y.toFloat(), z.toFloat(), w.toFloat()).getPointer(memScope)
    }
    override fun setRawMemory(mem: COpaquePointer) {
        val arr = mem.reinterpret<FloatVar>()
        x = arr[0].toDouble()
        y = arr[1].toDouble()
        z = arr[2].toDouble()
        w = arr[3].toDouble()
    }


    override fun equals(other: Any?): Boolean =
            when (other) {
                is Quat -> (x == other.x && y == other.y && z == other.z && w == other.w)
                else -> false
            }

    override fun toString(): String {
        return ""
    }

    override fun hashCode(): Int {
        var result = x.hashCode()
        result = 31 * result + y.hashCode()
        result = 31 * result + z.hashCode()
        result = 31 * result + w.hashCode()
        return result
    }
}
