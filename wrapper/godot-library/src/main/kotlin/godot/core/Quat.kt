@file:Suppress("unused", "MemberVisibilityCanBePrivate")
package godot.core

import godot.gdnative.*
import kotlinx.cinterop.*
import kotlin.math.*

class Quat: CoreType {
    var x: Double = 0.0
    var y: Double = 0.0
    var z: Double = 0.0
    var w: Double = 1.0


    constructor(basis: Basis) {
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

    constructor(x: Number, y: Number, z: Number, w: Number = 1.0) {
        this.x = x.toDouble()
        this.y = y.toDouble()
        this.z = z.toDouble()
        this.w = w.toDouble()
    }

    constructor() :
        this(0.0, 0.0, 0.0, 1.0)

    constructor(axis: Vector3, angle: Double) {
        val d: Double = axis.length()
        if (d == 0.0) set(0.0, 0.0, 0.0, 0.0)
        else {
            val sinAngle: Double = sin(angle * 0.5)
            val cosAngle: Double = cos(angle * 0.5)
            val s: Double = sinAngle / d
            set(axis.x * s, axis.y * s, axis.z * s, cosAngle)
        }
    }

    constructor(v0: Vector3, v1: Vector3) {
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



    fun set(px: Double, py: Double, pz: Double, pw: Double) {
        x = px
        y = py
        z = pz
        w = pw
    }

    // setEulerXyz expects a vector containing the Euler angles in the format
    // (ax,ay,az), where ax is the angle of rotation around x axis,
    // and similar for other axes.
    // This implementation uses XYZ convention (Z is the first rotation).
    fun setEulerXyz(p_euler: Vector3) {
        val half1: Double = p_euler.x * 0.5
        val half2: Double = p_euler.y * 0.5
        val half3: Double = p_euler.z * 0.5

        // R = X(a1).Y(a2).Z(a3) convention for Euler angles.
        // Conversion to quaternion as listed in https://ntrs.nasa.gov/archive/nasa/casi.ntrs.nasa.gov/19770024290.pdf (page A-2)
        // a3 is the angle of the first rotation, following the notation in this reference.

        val cos1: Double = cos(half1)
        val cos2: Double = cos(half2)
        val cos3: Double = cos(half3)
        val sin1: Double = sin(half1)
        val sin2: Double = sin(half2)
        val sin3: Double = sin(half3)

        set(sin1 * cos2 * sin3 + cos1 * sin2 * cos3,
                sin1 * cos2 * cos3 - cos1 * sin2 * sin3,
                -sin1 * sin2 * cos3 + cos1 * sin2 * sin3,
                sin1 * sin2 * sin3 + cos1 * cos2 * cos3)
    }

    fun getEulerXyz(): Vector3 {
        val m = Basis(this)
        return m.getEulerXyz()
    }

    fun setEulerYxz(p_euler: Vector3) {
        val half1: Double = p_euler.y * 0.5
        val half2: Double = p_euler.x * 0.5
        val half3: Double = p_euler.z * 0.5

        // R = X(a1).Y(a2).Z(a3) convention for Euler angles.
        // Conversion to quaternion as listed in https://ntrs.nasa.gov/archive/nasa/casi.ntrs.nasa.gov/19770024290.pdf (page A-2)
        // a3 is the angle of the first rotation, following the notation in this reference.

        val cos1: Double = cos(half1)
        val cos2: Double = cos(half2)
        val cos3: Double = cos(half3)
        val sin1: Double = sin(half1)
        val sin2: Double = sin(half2)
        val sin3: Double = sin(half3)

        set(sin1 * cos2 * sin3 + cos1 * sin2 * cos3,
                sin1 * cos2 * cos3 - cos1 * sin2 * sin3,
                -sin1 * sin2 * cos3 + cos1 * sin2 * sin3,
                sin1 * sin2 * sin3 + cos1 * cos2 * cos3)
    }

    // getEulerYxz returns a vector containing the Euler angles in the format
    // (ax,ay,az), where ax is the angle of rotation around x axis,
    // and similar for other axes.
    // This implementation uses YXZ convention (Z is the first rotation).
    fun getEulerYxz(): Vector3 {
        val m = Basis(this)
        return m.getEulerYxz()
    }

    fun setEuler(p_euler: Vector3) = setEulerYxz(p_euler)
    fun getEuler(): Vector3 = getEulerYxz()

    fun length(): Double =
            sqrt(this.lengthSquared())

    fun normalize() {
        x /= this.length()
        y /= this.length()
        z /= this.length()
        w /= this.length()
    }

    fun normalized(): Quat = this / this.length()

    fun inverse(): Quat = Quat(-x, -y, -z, -w)

    fun isNormalized() = abs(lengthSquared() - 1.0) < 0.00001

    fun slerp(q: Quat, t: Double): Quat {
        val to1 = Quat()
        val omega: Double
        var cosom: Double
        val sinom: Double
        val scale0: Double
        val scale1: Double

        cosom = dot(q)

        if (cosom < 0) {
            cosom = -cosom
            to1.x = - q.x
            to1.y = - q.y
            to1.z = - q.z
            to1.w = - q.w
        } else {
            to1.x = q.x
            to1.y = q.y
            to1.z = q.z
            to1.w = q.w
        }

        if ( (1.0 - cosom) > CMP_EPSILON ) {
            // standard case (slerp)
            omega = acos(cosom)
            sinom = sin(omega)
            scale0 = sin((1.0 - t) * omega) / sinom
            scale1 = sin(t * omega) / sinom
        } else {
            // "from" and "to" quaternions are very close
            //  ... so we can do a linear interpolation
            scale0 = 1.0 - t
            scale1 = t
        }
        // calculate final values
        return Quat(
                scale0 * x + scale1 * to1.x,
                scale0 * y + scale1 * to1.y,
                scale0 * z + scale1 * to1.z,
                scale0 * w + scale1 * to1.w
        )
    }

    fun slerpni(q: Quat, t: Double): Quat {
        val from = this
        val dot: Double = from.dot(q)

        if (abs(dot) > 0.9999) return from

        val theta:     Double = acos(dot)
        val sinT:      Double = 1.0 / sin(theta)
        val newFactor: Double = sin(t * theta) * sinT
        val invFactor: Double = sin((1.0 - t) * theta) * sinT

        return Quat(invFactor * from.x + newFactor * q.x,
                invFactor * from.y + newFactor * q.y,
                invFactor * from.z + newFactor * q.z,
                invFactor * from.w + newFactor * q.w)
    }

    fun cubicSlerp(q: Quat, prep: Quat, postq: Quat, t: Double): Quat {
        val t2: Double = (1.0 - t) * t * 2
        val sp = this.slerp(q, t)
        val sq = prep.slerpni(postq, t)
        return sp.slerpni(sq, t2)
    }

    fun getAxis(): Vector3 = Vector3(x / sqrt(1.0 - w*w), y / sqrt(1.0 - w*w),z / sqrt(1.0 - w*w))

    fun getAngle(): Double = 2 * acos(w)

    operator fun times(v: Vector3) =
            Quat( w * v.x + y * v.z - z * v.y,
                    w * v.y + z * v.x - x * v.z,
                    w * v.z + x * v.y - y * v.x,
                    -x * v.x - y * v.y - z * v.z)

    operator fun plus(q2: Quat): Quat =
            Quat( this.x+q2.x, this.y+q2.y, this.z+q2.z, this.w+q2.w )

    operator fun minus(q2: Quat): Quat =
            Quat( this.x-q2.x, this.y-q2.y, this.z-q2.z, this.w-q2.w )

    operator fun times(q2: Quat): Quat =
            Quat( this.x*q2.x, this.y*q2.y, this.z*q2.z, this.w*q2.w )

    operator fun unaryMinus(): Quat =
            Quat( -this.x, -this.y, -this.z, -this.w)

    operator fun times(f: Double): Quat =
            Quat(x*f, y*f, z*f, w*f)

    operator fun div(f: Double): Quat =
            Quat(x/f, y/f, z/f, w/f)

    override fun equals(other: Any?): Boolean =
        when (other) {
            is Quat -> (x == other.x && y == other.y && z == other.z && w == other.w)
            else -> false
        }

    fun xform(v: Vector3): Vector3 {
        var q = this * v
        q *= this.inverse()
        return Vector3(q.x, q.y, q.z)
    }

    override fun toString(): String {
        return ""
    }

    fun dot(q: Quat): Double =
            x * q.x+y * q.y+z * q.z+w * q.w

    fun lengthSquared(): Double =
            dot(this)

    override fun hashCode(): Int {
        var result = x.hashCode()
        result = 31 * result + y.hashCode()
        result = 31 * result + z.hashCode()
        result = 31 * result + w.hashCode()
        return result
    }
}