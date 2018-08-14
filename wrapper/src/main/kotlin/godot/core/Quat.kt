package kotlin.godot.core

import godot.*
import kotlinx.cinterop.*
import kotlin.math.*

class Quat: CoreType {
    var x: Float = 0f
    var y: Float = 0f
    var z: Float = 0f
    var w: Float = 1f

    constructor(basis: Basis) {
        val trace = basis[0][0] + basis[1][1] + basis[2][2]
        val temp: FloatArray

        if(trace > 0f) {
            var s = sqrt(trace + 1f)
            val temp3 = s * 0.5f
            s = 0.5f / s
            temp = floatArrayOf(((basis[2][1] - basis[1][2]) * s),
                    ((basis[0][2] - basis[2][0]) * s),
                    ((basis[1][0] - basis[0][1]) * s),
                    temp3)
        }
        else {
            temp = floatArrayOf(0f,0f,0f,0f)
            val i = if (basis[0][0] < basis[1][1]) {
                if (basis[1][1] < basis[2][2]) 2 else 1
            } else {
                if (basis[0][0] < basis[2][2]) 2 else 0
            }
            val j = (i + 1) % 3
            val k = (i + 2) % 3

            var s = sqrt(basis[i][i] - basis[j][j] - basis[k][k] + 1.0f)
            temp[i] = s * 0.5f
            s = 0.5f / s
            temp[3] = (basis[k][j] - basis[j][k]) * s
            temp[j] = (basis[j][i] + basis[i][j]) * s
            temp[k] = (basis[k][i] + basis[i][k]) * s
        }
        Quat(temp[0],temp[1],temp[2],temp[3])
    }

    constructor(x: Number, y: Number, z: Number, w: Number = 1f) {
        this.x = x.toFloat()
        this.y = y.toFloat()
        this.z = z.toFloat()
        this.w = w.toFloat()
    }

    constructor() :
        this(0f, 0f, 0f, 1f)

    constructor(axis: Vector3, angle: Float) {
        val d: Float = axis.length()
        if (d == 0f) set(0f,0f,0f,0f)
        else {
            val sinAngle: Float = sin(angle * 0.5f)
            val cosAngle: Float = cos(angle * 0.5f)
            val s: Float = sinAngle / d
            set(axis.x * s, axis.y * s, axis.z * s, cosAngle)
        }
    }

    constructor(v0: Vector3, v1: Vector3) {
        val c = v0.cross(v1)
        val d = v0.dot(v1)

        if (d < -1f + CMP_EPSILON) {
            x = 0f
            y = 1f
            z = 0f
            w = 0f
        } else {
            val s = sqrt((1f + d) * 2f)
            val rs = 1f / s
            x = c.x * rs
            y = c.y * rs
            z = c.z * rs
            w = s * 0.5f
        }
    }



    override fun getRawMemory(memScope: MemScope): COpaquePointer {
        return cValuesOf(x, y, z, w).getPointer(memScope)
    }

    override fun setRawMemory(mem: COpaquePointer) {
        val arr = mem.reinterpret<FloatVar>()
        x = arr[0]
        y = arr[1]
        z = arr[2]
        w = arr[3]
    }

    internal constructor(native: CValue<godot_quat>) : this() {
        memScoped {
            this@Quat.setRawMemory(native.ptr)
        }
    }

    internal constructor(mem: COpaquePointer) {
        this.setRawMemory(mem)
    }


    fun set(px: Float, py: Float, pz: Float, pw: Float) {
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
        val half1: Float = p_euler.x * 0.5f
        val half2: Float = p_euler.y * 0.5f
        val half3: Float = p_euler.z * 0.5f

        // R = X(a1).Y(a2).Z(a3) convention for Euler angles.
        // Conversion to quaternion as listed in https://ntrs.nasa.gov/archive/nasa/casi.ntrs.nasa.gov/19770024290.pdf (page A-2)
        // a3 is the angle of the first rotation, following the notation in this reference.

        val cos1: Float = cos(half1)
        val cos2: Float = cos(half2)
        val cos3: Float = cos(half3)
        val sin1: Float = sin(half1)
        val sin2: Float = sin(half2)
        val sin3: Float = sin(half3)

        set(sin1 * cos2 * sin3 + cos1 * sin2 * cos3,
                sin1 * cos2 * cos3 - cos1 * sin2 * sin3,
                -sin1 * sin2 * cos3 + cos1 * sin2 * sin3,
                sin1 * sin2 * sin3 + cos1 * cos2 * cos3)
    }

    fun getEulerXyz(): Vector3 {
        val m = Basis(this)
        return m.getEulerXyz()
    }

    fun setEulerYxz(p_euler: Vector3): Unit {
        val half1: Float = p_euler.y * 0.5f
        val half2: Float = p_euler.x * 0.5f
        val half3: Float = p_euler.z * 0.5f

        // R = X(a1).Y(a2).Z(a3) convention for Euler angles.
        // Conversion to quaternion as listed in https://ntrs.nasa.gov/archive/nasa/casi.ntrs.nasa.gov/19770024290.pdf (page A-2)
        // a3 is the angle of the first rotation, following the notation in this reference.

        val cos1: Float = cos(half1)
        val cos2: Float = cos(half2)
        val cos3: Float = cos(half3)
        val sin1: Float = sin(half1)
        val sin2: Float = sin(half2)
        val sin3: Float = sin(half3)

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

    fun length(): Float =
            sqrt(this.lengthSquared())

    fun normalize() {
        x /= this.length()
        y /= this.length()
        z /= this.length()
        w /= this.length()
    }

    fun normalized(): Quat =
            this / this.length()

    fun inverse(): Quat =
            Quat(-x, -y, -z, -w)

    fun slerp(q: Quat, t: Float): Quat {
        val to1 = Quat()
        val omega: Float
        var cosom: Float
        val sinom: Float
        val scale0: Float
        val scale1: Float

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
            scale0 = sin((1f - t) * omega) / sinom
            scale1 = sin(t * omega) / sinom
        } else {
            // "from" and "to" quaternions are very close
            //  ... so we can do a linear interpolation
            scale0 = 1f - t
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

    fun slerpni(q: Quat, t: Float): Quat {
        val from = this
        val dot: Float = from.dot(q)

        if (abs(dot) > 0.9999) return from

        val theta:     Float = acos(dot)
        val sinT:      Float = 1f / sin(theta)
        val newFactor: Float = sin(t * theta) * sinT
        val invFactor: Float = sin((1f - t) * theta) * sinT

        return Quat(invFactor * from.x + newFactor * q.x,
                invFactor * from.y + newFactor * q.y,
                invFactor * from.z + newFactor * q.z,
                invFactor * from.w + newFactor * q.w)
    }

    fun cubicSlerp(q: Quat, prep: Quat, postq: Quat, t: Float): Quat {
        val t2: Float = (1f - t) * t * 2
        val sp = this.slerp(q, t)
        val sq = prep.slerpni(postq, t)
        return sp.slerpni(sq, t2)
    }

    fun getAxis(): Vector3
            = Vector3(x / sqrt(1f-w*w), y / sqrt(1f-w*w),z / sqrt(1f-w*w))

    fun getAngle(): Float
            = 2 * acos(w)

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

    operator fun times(f: Float): Quat =
            Quat(x*f, y*f, z*f, w*f)

    operator fun div(f: Float): Quat =
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

    fun dot(q: Quat): Float =
            x * q.x+y * q.y+z * q.z+w * q.w

    fun lengthSquared(): Float =
            dot(this)

    external override fun hashCode(): Int {
        var result = x.hashCode()
        result = 31 * result + y.hashCode()
        result = 31 * result + z.hashCode()
        result = 31 * result + w.hashCode()
        return result
    }
}