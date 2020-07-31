@file:Suppress("unused", "MemberVisibilityCanBePrivate")

package godot.core

import godot.gdnative.godot_quat
import godot.gdnative.godot_quat_layout
import godot.internal.type.*
import kotlinx.cinterop.*
import kotlin.math.*

class Quat(
    p_x: KotlinReal,
    p_y: KotlinReal,
    p_z: KotlinReal,
    p_w: KotlinReal
) : CoreType {

    @PublishedApi
    internal var _x: GodotReal = p_x.toGodotReal()

    @PublishedApi
    internal var _y: GodotReal = p_y.toGodotReal()

    @PublishedApi
    internal var _z: GodotReal = p_z.toGodotReal()

    @PublishedApi
    internal var _w: GodotReal = p_w.toGodotReal()

    //PROPERTIES
    inline var x: KotlinReal
        get() = _x.toKotlinReal()
        set(value) {
            _x = value.toGodotReal()
        }

    inline var y: KotlinReal
        get() = _y.toKotlinReal()
        set(value) {
            _y = value.toGodotReal()
        }

    inline var z: KotlinReal
        get() = _z.toKotlinReal()
        set(value) {
            _z = value.toGodotReal()
        }

    inline var w: KotlinReal
        get() = _w.toKotlinReal()
        set(value) {
            _w = value.toGodotReal()
        }

    //CONSTANTS
    companion object {
        val IDENTITY: Quat
            get() = Quat(0.0f, 0.0f, 0.0f, 1.0f)
    }


    //CONSTRUCTOR
    constructor() :
        this(0.0f, 0.0f, 0.0f, 1.0f)

    constructor(other: Quat) : this(other._x, other._y, other._z, other._w)

    constructor(x: Number, y: Number, z: Number, w: Number = 1.0f) :
        this(x.toKotlinReal(), y.toKotlinReal(), z.toKotlinReal(), w.toKotlinReal())

    constructor(axis: Vector3, angle: RealT) : this() {
        val d = axis.length().toGodotReal()
        if (isEqualApprox(d, 0f)) {
            set(0.0f, 0.0f, 0.0f, 0.0f)
        } else {
            val angle2 = angle.toGodotReal()
            val sinAngle = sin(angle2 * 0.5f)
            val cosAngle = cos(angle2 * 0.5f)
            val s = sinAngle / d
            set(axis._x * s, axis._y * s, axis._z * s, cosAngle)
        }
    }

    constructor(v0: Vector3, v1: Vector3) : this() {
        val c = v0.cross(v1)
        val d = v0.dot(v1).toGodotReal()

        if (d < -1.0f + CMP_EPSILON) {
            _x = 0.0f
            _y = 1.0f
            _z = 0.0f
            _w = 0.0f
        } else {
            val s = sqrt((1.0f + d) * 2.0f)
            val rs = 1.0f / s
            _x = c._x * rs
            _y = c._y * rs
            _z = c._z * rs
            _w = s * 0.5f
        }
    }


    internal constructor(native: CValue<godot_quat>) : this() {
        memScoped {
            this@Quat.setRawMemory(native.ptr)
        }
    }

    internal constructor(mem: COpaquePointer) : this() {
        this.setRawMemory(mem)
    }


    //INTEROP
    override fun getRawMemory(memScope: MemScope): COpaquePointer {
        val value = cValue<godot_quat_layout> {
            x = this@Quat._x.toGodotReal()
            y = this@Quat._y.toGodotReal()
            z = this@Quat._z.toGodotReal()
            w = this@Quat._w.toGodotReal()
        }
        return value.getPointer(memScope)
    }

    override fun setRawMemory(mem: COpaquePointer) {
        val value = mem.reinterpret<godot_quat_layout>().pointed
        _x = value.x.toGodotReal()
        _y = value.y.toGodotReal()
        _z = value.z.toGodotReal()
        _w = value.w.toGodotReal()
    }


    //API
    /**
     * Performs a cubic spherical-linear interpolation with another quaternion.
     */
    fun cubicSlerp(q: Quat, prep: Quat, postq: Quat, t: KotlinReal): Quat {
        val t2: KotlinReal = (1.0f - t) * t * 2
        val sp = this.slerp(q, t)
        val sq = prep.slerpni(postq, t)
        return sp.slerpni(sq, t2)
    }

    /**
     * Returns the dot product of two quaternions.5
     */
    fun dot(q: Quat): KotlinReal {
        return (_x * q._x + _y * q._y + _z * q._z + _w * q._w).toKotlinReal()
    }

    /**
     * Returns Euler angles (in the YXZ convention: first Z, then X, and Y last) corresponding to the rotation represented by the unit quaternion. Returned vector contains the rotation angles in the format (X angle, Y angle, Z angle).
     */
    fun getEuler(): Vector3 {
        return getEulerYxz()
    }

    /**
     * getEulerYxz returns a vector containing the Euler angles in the format
     *(ax,ay,az), where ax is the angle of rotation around x axis,
     * and similar for other axes.
     * This implementation uses YXZ convention (Z is the first rotation).
     */
    internal fun getEulerYxz(): Vector3 {
        val m = Basis(this)
        return m.getEulerYxz()
    }

    internal fun getEulerXyz(): Vector3 {
        val m = Basis(this)
        return m.getEulerXyz()
    }

    /**
     * Returns the inverse of the quaternion.
     */
    fun inverse(): Quat {
        return Quat(-_x, -_y, -_z, -_w)
    }

    /**
     * Returns true if this quaterion and quat are approximately equal, by running isEqualApprox on each component.
     */
    fun isEqualApprox(other: Quat): Boolean {
        return isEqualApprox(other._x, _x)
            && isEqualApprox(other._y, _y)
            && isEqualApprox(other._z, _z)
            && isEqualApprox(other._w, _w)
    }

    /**
     * Returns whether the quaternion is normalized or not.
     */
    fun isNormalized(): Boolean {
        return abs(lengthSquared() - 1.0f) < CMP_EPSILON
    }

    /**
     * Returns the length of the quaternion.
     */
    fun length(): KotlinReal {
        return sqrt(this.lengthSquared())
    }

    /**
     * Returns the length of the quaternion, squared.
     */
    fun lengthSquared(): KotlinReal {
        return dot(this)
    }

    /**
     * Returns a copy of the quaternion, normalized to unit length.
     */
    fun normalized(): Quat {
        return this / this.length()
    }

    internal fun normalize() {
        val l = this.length().toGodotReal()
        _x /= l
        _y /= l
        _z /= l
        _w /= l
    }

    /**
     * Sets the quaternion to a rotation which rotates around axis by the specified angle, in radians. The axis must be a normalized vector.
     */
    fun setAxisAndAngle(axis: Vector3, angle: KotlinReal) {
        if (!axis.isNormalized()) {
            Godot.printError("Vector $axis is not normalized", "setAxisAndAngle", "Quat.kt", 192)
        }

        val d = axis.length().toGodotReal()
        if (isEqualApprox(d, 0.0f)) {
            set(0.0f, 0.0f, 0.0f, 0.0f)
        } else {
            val sin = sin(angle.toGodotReal() * 0.5f)
            val cos = cos(angle.toGodotReal() * 0.5f)
            val s = sin / d
            set(axis._x * s, axis._y * s, axis._z * s, cos)
        }
    }

    /**
     * Sets the quaternion to a rotation specified by Euler angles (in the YXZ convention: first Z, then X, and Y last), given in the vector format as (X angle, Y angle, Z angle).
     */
    fun setEuler(p_euler: Vector3) {
        setEulerYxz(p_euler)
    }

    /**
     * setEulerXyz expects a vector containing the Euler angles in the format
     * (ax,ay,az), where ax is the angle of rotation around x axis,
     * and similar for other axes.
     * This implementation uses XYZ convention (Z is the first rotation).
     */
    internal fun setEulerXyz(p_euler: Vector3) {
        val half1 = p_euler._x * 0.5f
        val half2 = p_euler._y * 0.5f
        val half3 = p_euler._z * 0.5f

        // R = X(a1).Y(a2).Z(a3) convention for Euler angles.
        // Conversion to quaternion as listed in https://ntrs.nasa.gov/archive/nasa/casi.ntrs.nasa.gov/19770024290.pdf (page A-2)
        // a3 is the angle of the first rotation, following the notation in this reference.

        val cos1 = cos(half1)
        val cos2 = cos(half2)
        val cos3 = cos(half3)
        val sin1 = sin(half1)
        val sin2 = sin(half2)
        val sin3 = sin(half3)

        set(
            sin1 * cos2 * sin3 + cos1 * sin2 * cos3,
            sin1 * cos2 * cos3 - cos1 * sin2 * sin3,
            -sin1 * sin2 * cos3 + cos1 * sin2 * sin3,
            sin1 * sin2 * sin3 + cos1 * cos2 * cos3
        )
    }

    internal fun setEulerYxz(p_euler: Vector3) {
        val half1 = p_euler._y * 0.5f
        val half2 = p_euler._x * 0.5f
        val half3 = p_euler._z * 0.5f

        // R = X(a1).Y(a2).Z(a3) convention for Euler angles.
        // Conversion to quaternion as listed in https://ntrs.nasa.gov/archive/nasa/casi.ntrs.nasa.gov/19770024290.pdf (page A-2)
        // a3 is the angle of the first rotation, following the notation in this reference.

        val cos1 = cos(half1)
        val cos2 = cos(half2)
        val cos3 = cos(half3)
        val sin1 = sin(half1)
        val sin2 = sin(half2)
        val sin3 = sin(half3)

        set(
            sin1 * cos2 * sin3 + cos1 * sin2 * cos3,
            sin1 * cos2 * cos3 - cos1 * sin2 * sin3,
            -sin1 * sin2 * cos3 + cos1 * sin2 * sin3,
            sin1 * sin2 * sin3 + cos1 * cos2 * cos3
        )
    }

    /**
     * Performs a spherical-linear interpolation with another quaternion.
     */
    fun slerp(q: Quat, t: KotlinReal): Quat {
        val to1 = Quat()
        val omega: KotlinReal
        var cosom: KotlinReal
        val sinom: KotlinReal
        val scale0: KotlinReal
        val scale1: KotlinReal

        cosom = dot(q)

        if (cosom < 0) {
            cosom = -cosom
            to1._x = -q._x
            to1._y = -q._y
            to1._z = -q._z
            to1._w = -q._w
        } else {
            to1._x = q._x
            to1._y = q._y
            to1._z = q._z
            to1._w = q._w
        }

        if ((1.0f - cosom) > CMP_EPSILON) {
            // standard case (slerp)
            omega = acos(cosom)
            sinom = sin(omega)
            scale0 = sin((1.0f - t) * omega) / sinom
            scale1 = sin(t * omega) / sinom
        } else {
            // "from" and "to" quaternions are very close
            //  ... so we can do a linear interpolation
            scale0 = 1.0f - t
            scale1 = t
        }
        // calculate final values
        return Quat(
            scale0 * _x + scale1 * to1._x,
            scale0 * _y + scale1 * to1._y,
            scale0 * _z + scale1 * to1._z,
            scale0 * _w + scale1 * to1._w
        )
    }

    /**
     * Performs a spherical-linear interpolation with another quaterion without checking if the rotation path is not bigger than 90°.
     */
    fun slerpni(q: Quat, t: KotlinReal): Quat {
        val from = this
        val dot: KotlinReal = from.dot(q)

        if (abs(dot) > 0.9999f) return from

        val theta = acos(dot)
        val sinT = 1.0f / sin(theta)
        val newFactor: KotlinReal = sin(t * theta) * sinT
        val invFactor: KotlinReal = sin((1.0f - t) * theta) * sinT

        return Quat(
            invFactor * from._x + newFactor * q._x,
            invFactor * from._y + newFactor * q._y,
            invFactor * from._z + newFactor * q._z,
            invFactor * from._w + newFactor * q._w
        )
    }

    /**
     * Transforms the vector v by this quaternion.
     */
    fun xform(v: Vector3): Vector3 {
        var q = this * v
        q *= this.inverse()
        return Vector3(q._x, q._y, q._z)
    }


    //UTILITIES
    override fun toVariant() = Variant(this)

    private fun set(px: GodotReal, py: GodotReal, pz: GodotReal, pw: GodotReal) {
        _x = px
        _y = py
        _z = pz
        _w = pw
    }

    operator fun times(v: Vector3) =
        Quat(
            _w * v._x + _y * v._z - _z * v._y,
            _w * v._y + _z * v._x - _x * v._z,
            _w * v._z + _x * v._y - _y * v._x,
            -_x * v._x - _y * v._y - _z * v._z
        )

    operator fun plus(q2: Quat) = Quat(this._x + q2._x, this._y + q2._y, this._z + q2._z, this._w + q2._w)

    operator fun minus(q2: Quat) = Quat(this._x - q2._x, this._y - q2._y, this._z - q2._z, this._w - q2._w)

    operator fun times(q2: Quat) = Quat(this._x * q2._x, this._y * q2._y, this._z * q2._z, this._w * q2._w)
    operator fun times(scalar: Int) = Quat(_x * scalar, _y * scalar, _z * scalar, _w * scalar)
    operator fun times(scalar: Long) = Quat(_x * scalar, _y * scalar, _z * scalar, _w * scalar)
    operator fun times(scalar: Float) = Quat(_x * scalar, _y * scalar, _z * scalar, _w * scalar)
    operator fun times(scalar: Double) = Quat(_x * scalar, _y * scalar, _z * scalar, _w * scalar)

    operator fun div(f: KotlinReal) = Quat(_x / f, _y / f, _z / f, _w / f)

    operator fun unaryMinus() = Quat(-this._x, -this._y, -this._z, -this._w)

    override fun equals(other: Any?): Boolean =
        when (other) {
            is Quat -> (_x == other._x && _y == other._y && _z == other._z && _w == other._w)
            else -> false
        }

    override fun toString(): String {
        return "($_x, $_y, $_z, $_w)"
    }

    override fun hashCode(): Int {
        var result = _x.hashCode()
        result = 31 * result + _y.hashCode()
        result = 31 * result + _z.hashCode()
        result = 31 * result + _w.hashCode()
        return result
    }

    /*
     * GDScript related members
     */
    constructor(from: Basis) : this() {
        from.getQuat().also {
            set(it.x, it.y, it.z, it.w)
        }
    }
}

operator fun Int.times(quat: Quat) = quat * this
operator fun Long.times(quat: Quat) = quat * this
operator fun Float.times(quat: Quat) = quat * this
operator fun Double.times(quat: Quat) = quat * this
