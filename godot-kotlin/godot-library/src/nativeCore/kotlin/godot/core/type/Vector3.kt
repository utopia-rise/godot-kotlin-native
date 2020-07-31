@file:Suppress("unused", "MemberVisibilityCanBePrivate")

package godot.core

import godot.gdnative.godot_vector3
import godot.gdnative.godot_vector3_layout
import godot.internal.type.*
import kotlinx.cinterop.*
import kotlin.math.*


class Vector3(
    p_x: KotlinReal,
    p_y: KotlinReal,
    p_z: KotlinReal
) : Comparable<Vector3>, CoreType {

    @PublishedApi
    internal var _x: GodotReal = p_x.toGodotReal()

    @PublishedApi
    internal var _y: GodotReal = p_y.toGodotReal()

    @PublishedApi
    internal var _z: GodotReal = p_z.toGodotReal()


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

    //CONSTANTS
    enum class Axis(val value: Int) {
        X(0),
        Y(1),
        Z(2);

        companion object {
            fun from(value: Int) = when (value) {
                0 -> X
                1 -> Y
                2 -> Z
                else -> throw AssertionError("Unknown axis for Vector3: $value")
            }
        }
    }

    companion object {
        val AXIS_X = Axis.X.value
        val AXIS_Y = Axis.Y.value
        val AXIS_Z = Axis.Z.value
        val ZERO: Vector3
            get() = Vector3(0, 0, 0)
        val ONE: Vector3
            get() = Vector3(1, 1, 1)
        val INF: Vector3
            get() = Vector3(KotlinReal.POSITIVE_INFINITY, KotlinReal.POSITIVE_INFINITY, KotlinReal.POSITIVE_INFINITY)
        val LEFT: Vector3
            get() = Vector3(-1, 0, 0)
        val RIGHT: Vector3
            get() = Vector3(1, 0, 0)
        val UP: Vector3
            get() = Vector3(0, 1, 0)
        val DOWN: Vector3
            get() = Vector3(0, -1, 0)
        val FORWARD: Vector3
            get() = Vector3(0, 0, -1)
        val BACK: Vector3
            get() = Vector3(0, 0, 1)
    }


    //CONSTRUCTOR
    constructor() :
        this(0.0f, 0.0f, 0.0f)

    constructor(vec: Vector3) :
        this(vec._x, vec._y, vec._z)

    constructor(x: Number, y: Number, z: Number) :
        this(x.toKotlinReal(), y.toKotlinReal(), z.toKotlinReal())

    internal constructor(native: CValue<godot_vector3>) : this() {
        memScoped {
            this@Vector3.setRawMemory(native.ptr)
        }
    }

    internal constructor(mem: COpaquePointer) : this() {
        this.setRawMemory(mem)
    }

    //INTEROP
    override fun getRawMemory(memScope: MemScope): COpaquePointer {
        val value = cValue<godot_vector3_layout> {
            x = this@Vector3._x.toFloat()
            y = this@Vector3._y.toFloat()
            z = this@Vector3._z.toFloat()
        }
        return value.getPointer(memScope)
    }

    override fun setRawMemory(mem: COpaquePointer) {
        val value = mem.reinterpret<godot_vector3_layout>().pointed
        _x = value.x.toGodotReal()
        _y = value.y.toGodotReal()
        _z = value.z.toGodotReal()
    }


    //API
    /**
     * Returns a new vector with all components in absolute values (i.e. positive).
     */
    fun abs(): Vector3 {
        return Vector3(abs(_x), abs(_y), abs(_z))
    }

    /**
     * Returns the minimum angle to the given vector.
     */
    fun angleTo(to: Vector3): KotlinReal {
        return atan2(cross(to).length(), dot(to))
    }

    /**
     * Returns the vector “bounced off” from a plane defined by the given normal.
     */
    fun bounce(n: Vector3): Vector3 {
        return -reflect(n)
    }

    /**
     * Returns a new vector with all components rounded up.
     */
    fun ceil(): Vector3 {
        return Vector3(ceil(_x), ceil(_y), ceil(_z))
    }

    /**
     * Returns the cross product with b.
     */
    fun cross(b: Vector3): Vector3 {
        return Vector3((_y * b._z) - (_z * b._y), (_z * b._x) - (_x * b._z), (_x * b._y) - (_y * b._x))
    }

    /**
     * Performs a cubic interpolation between vectors pre_a, a, b, post_b (a is current), by the given amount t.
     * t is in the range of 0.0f - 1.0f, representing the amount of interpolation.
     */
    fun cubicInterpolate(b: Vector3, pre: Vector3, post: Vector3, t: KotlinReal): Vector3 {
        val p0: Vector3 = pre
        val p1: Vector3 = this
        val p2: Vector3 = b
        val p3: Vector3 = post

        val t2 = t * t
        val t3 = t2 * t

        return ((p1 * 2.0f) +
            (-p0 + p2) * t +
            (p0 * 2.0f - p1 * 5.0f + p2 * 4.0f - p3) * t2 +
            (-p0 + p1 * 3.0f - p2 * 3.0f + p3) * t3) * 0.5f
    }

    /**
     * Returns the normalized vector pointing from this vector to b.
     */
    fun directionTo(other: Vector3): Vector3 {
        val ret = Vector3(other._x - _x, other._y - _y, other._z - _z)
        ret.normalize()
        return ret
    }

    /**
     * Returns the squared distance to b.
     * Prefer this function over distance_to if you need to sort vectors or need the squared distance for some formula.
     */
    fun distanceSquaredTo(other: Vector3): KotlinReal {
        return (other - this).lengthSquared()
    }

    /**
     * Returns the distance to b.
     */
    fun distanceTo(other: Vector3): KotlinReal {
        return (other - this).length()
    }

    /**
     * Returns the dot product with b.
     */
    fun dot(b: Vector3): KotlinReal {
        return (_x * b._x + _y * b._y + _z * b._z).toKotlinReal()
    }

    /**
     * Returns a new vector with all components rounded down.
     */
    fun floor(): Vector3 {
        return Vector3(floor(_x), floor(_y), floor(_z))
    }

    /**
     * Returns the inverse of the vector. This is the same as Vector3( 1.0f / v.x, 1.0f / v.y, 1.0f / v.z ).
     */
    fun inverse(): Vector3 {
        return Vector3(1.0f / _x, 1.0f / _y, 1.0f / _z)
    }

    /**
     * Returns true if this vector and v are approximately equal, by running isEqualApprox on each component.
     */
    fun isEqualApprox(other: Vector3): Boolean {
        return godot.internal.type.isEqualApprox(
            other._x,
            _x
        ) && godot.internal.type.isEqualApprox(
            other._y,
            _y
        ) && godot.internal.type.isEqualApprox(other._z, _z)
    }

    /**
     * Returns true if the vector is normalized.
     */
    fun isNormalized(): Boolean {
        return godot.internal.type.isEqualApprox(this.length().toGodotReal(), 1.0f)
    }

    /**
     * Returns the vector’s length.
     */
    fun length(): KotlinReal {
        return sqrt(_x * _x + _y * _y + _z * _z).toKotlinReal()
    }

    /**
     * Returns the vector’s length squared.
     * Prefer this function over length if you need to sort vectors or need the squared length for some formula.
     */
    fun lengthSquared(): KotlinReal {
        return (_x * _x + _y * _y + _z * _z).toKotlinReal()
    }

    /**
     * Returns the result of the linear interpolation between this vector and b by amount t.
     * t is in the range of 0.0f - 1.0f, representing the amount of interpolation.
     */
    fun linearInterpolate(b: Vector3, t: KotlinReal): Vector3 {
        return Vector3(_x + (t * (b._x - _x)), _y + (t * (b._y - _y)), _z + (t * (b._z - _z)))
    }

    /**
     * Returns the axis of the vector’s largest value. See AXIS_* constants.
     */
    fun maxAxis(): Int {
        return if (_x < _y) {
            if (_y < _z) {
                2
            } else {
                1
            }
        } else {
            if (_x < _z) {
                2
            } else {
                0
            }
        }
    }

    /**
     * Returns the axis of the vector’s smallest value. See AXIS_* constants.
     */
    fun minAxis(): Int {
        return if (_x < _y) {
            if (_x < _z) {
                0
            } else {
                2
            }
        } else {
            if (_y < _z) {
                1
            } else {
                2
            }
        }
    }

    /**
     * Moves the vector toward to by the fixed delta amount.
     */
    fun moveToward(to: Vector3, delta: KotlinReal): Vector3 {
        val vd = to - this
        val len = vd.length()
        return if (len <= delta || len < CMP_EPSILON) {
            to
        } else {
            this + vd / len * delta
        }
    }

    /**
     * Returns the vector scaled to unit length. Equivalent to v / v.length().
     */
    fun normalized(): Vector3 {
        val v: Vector3 = Vector3(this)
        v.normalize()
        return v
    }

    internal fun normalize() {
        val l = this.length().toGodotReal()
        if (isEqualApprox(l, 0.0f)) {
            _x = 0.0f
            _y = 0.0f
            _z = 0.0f
        } else {
            _x /= l
            _y /= l
            _z /= l
        }
    }

    /**
     * Returns the outer product with b.
     */
    fun outer(b: Vector3) = Basis(
        Vector3(_x * b._x, _x * b._y, _x * b._z),
        Vector3(_y * b._x, _y * b._y, _y * b._z),
        Vector3(_z * b._x, _z * b._y, _z * b._z)
    )

    /**
     * Returns a vector composed of the fposmod of this vector’s components and mod.
     */
    fun posmod(mod: KotlinReal): Vector3 {
        return Vector3(_x.rem(mod), _y.rem(mod), _z.rem(mod))
    }

    /**
     * Returns a vector composed of the fposmod of this vector’s components and modv’s components.
     */
    fun posmodv(modv: Vector3): Vector3 {
        return Vector3(_x.rem(modv._x), _y.rem(modv._y), _z.rem(modv._z))
    }

    /**
     * Returns the vector projected onto the vector b.
     */
    fun project(vec: Vector3): Vector3 {
        val v1: Vector3 = vec
        val v2: Vector3 = this
        return v2 * (v1.dot(v2) / v2.dot(v2))
    }

    /**
     * Returns the vector reflected from a plane defined by the given normal.
     */
    fun reflect(by: Vector3): Vector3 {
        return by - this * this.dot(by) * 2.0f
    }

    /**
     * Rotates the vector around a given axis by phi radians. The axis must be a normalized vector.
     */
    fun rotated(axis: Vector3, phi: KotlinReal): Vector3 {
        if (!axis.isNormalized()) {
            Godot.printError("Axis not normalized", "rotated()", "Vector3.kt", 251)
        }
        val v = Vector3(this)
        v.rotate(axis, phi)
        return v
    }

    internal fun rotate(axis: Vector3, phi: KotlinReal) {
        val ret = Basis(axis, phi).xform(this)
        this._x = ret._x
        this._y = ret._y
        this._z = ret._z
    }

    /**
     * Returns the vector with all components rounded to the nearest integer, with halfway cases rounded away from zero.
     */
    fun round(): Vector3 {
        return Vector3(round(_x), round(_y), round(_z))
    }

    /**
     * Returns the vector with each component set to one or negative one, depending on the signs of the components.
     */
    fun sign(): Vector3 {
        return Vector3(sign(_x), sign(_y), sign(_z))
    }

    /**
     * Returns the result of spherical linear interpolation between this vector and b, by amount t.
     * t is in the range of 0.0f - 1.0f, representing the amount of interpolation.
     *
     * Note: Both vectors must be normalized.
     */
    fun slerp(b: Vector3, t: KotlinReal): Vector3 {
        if (!this.isNormalized() || !b.isNormalized()) {
            Godot.printError("Vectors not normalized", "slerp()", "Vector3.kt", 275)
        }
        val theta: KotlinReal = angleTo(b)
        return rotated(cross(b).normalized(), theta * t)
    }

    /**
     * Returns the component of the vector along a plane defined by the given normal.
     */
    fun slide(vec: Vector3): Vector3 {
        return vec - this * this.dot(vec)
    }

    /**
     * Returns a copy of the vector snapped to the lowest neared multiple.
     */
    fun snapped(by: KotlinReal): Vector3 {
        val v: Vector3 = Vector3(this)
        v.snap(by)
        return v
    }

    internal fun snap(vecal: KotlinReal) {
        val vecal2 = vecal.toGodotReal()
        if (isEqualApprox(vecal2, 0.0f)) {
            _x = (floor(_x / vecal2 + 0.5f) * vecal2)
            _y = (floor(_y / vecal2 + 0.5f) * vecal2)
            _z = (floor(_z / vecal2 + 0.5f) * vecal2)
        }
    }

    /**
     * Returns a diagonal matrix with the vector as main diagonal.
     */
    fun toDiagonalMatrix(): Basis {
        return Basis()
    }


    //UTILITIES
    override fun toVariant() = Variant(this)

    operator fun get(n: Int): GodotReal =
        when (n) {
            0 -> _x
            1 -> _y
            2 -> _z
            else -> throw IndexOutOfBoundsException()
        }

    operator fun set(n: Int, f: GodotReal): Unit =
        when (n) {
            0 -> _x = f
            1 -> _y = f
            2 -> _z = f
            else -> throw IndexOutOfBoundsException()
        }

    operator fun plus(vec: Vector3) = Vector3(_x + vec._x, _y + vec._y, _z + vec._z)
    operator fun plus(scalar: Int) = Vector3(_x + scalar, _y + scalar, _z + scalar)
    operator fun plus(scalar: Long) = Vector3(_x + scalar, _y + scalar, _z + scalar)
    operator fun plus(scalar: Float) = Vector3(_x + scalar, _y + scalar, _z + scalar)
    operator fun plus(scalar: Double) = Vector3(_x + scalar, _y + scalar, _z + scalar)

    operator fun minus(vec: Vector3) = Vector3(_x - vec._x, _y - vec._y, _z - vec._z)
    operator fun minus(scalar: Int) = Vector3(_x - scalar, _y - scalar, _z - scalar)
    operator fun minus(scalar: Long) = Vector3(_x - scalar, _y - scalar, _z - scalar)
    operator fun minus(scalar: Float) = Vector3(_x - scalar, _y - scalar, _z - scalar)
    operator fun minus(scalar: Double) = Vector3(_x - scalar, _y - scalar, _z - scalar)

    operator fun times(vec: Vector3) = Vector3(_x * vec._x, _y * vec._y, _z * vec._z)
    operator fun times(scalar: Int) = Vector3(_x * scalar, _y * scalar, _z * scalar)
    operator fun times(scalar: Long) = Vector3(_x * scalar, _y * scalar, _z * scalar)
    operator fun times(scalar: Float) = Vector3(_x * scalar, _y * scalar, _z * scalar)
    operator fun times(scalar: Double) = Vector3(_x * scalar, _y * scalar, _z * scalar)

    operator fun div(vec: Vector3) = Vector3(_x / vec._x, _y / vec._y, _z / vec._z)
    operator fun div(scalar: Int) = Vector3(_x / scalar, _y / scalar, _z / scalar)
    operator fun div(scalar: Long) = Vector3(_x / scalar, _y / scalar, _z / scalar)
    operator fun div(scalar: Float) = Vector3(_x / scalar, _y / scalar, _z / scalar)
    operator fun div(scalar: Double) = Vector3(_x / scalar, _y / scalar, _z / scalar)

    operator fun unaryMinus() = Vector3(-_x, -_y, -_z)

    override fun equals(other: Any?): Boolean =
        when (other) {
            is Vector3 -> (_x == other._x && _y == other._y && _z == other._z)
            else -> false
        }

    override fun compareTo(other: Vector3): Int {
        if (_x == other._x) {
            return if (_y == other._y)
                when {
                    _z < other._z -> -1
                    _z == other._z -> 0
                    else -> 1
                }
            else
                when {
                    _y < other._y -> -1
                    else -> 1
                }
        } else
            return when {
                _x < other._x -> -1
                else -> 1
            }
    }

    override fun toString(): String {
        return "($_x, $_y, $_z)"
    }

    override fun hashCode(): Int {
        return this.toString().hashCode()
    }
}

operator fun Int.plus(vec: Vector3) = vec + this
operator fun Long.plus(vec: Vector3) = vec + this
operator fun Float.plus(vec: Vector3) = vec + this
operator fun Double.plus(vec: Vector3) = vec + this

operator fun Int.minus(vec: Vector3) = Vector3(this - vec._x, this - vec._y, this - vec._z)
operator fun Long.minus(vec: Vector3) = Vector3(this - vec._x, this - vec._y, this - vec._z)
operator fun Float.minus(vec: Vector3) = Vector3(this - vec._x, this - vec._y, this - vec._z)
operator fun Double.minus(vec: Vector3) = Vector3(this - vec._x, this - vec._y, this - vec._z)

operator fun Int.times(vec: Vector3) = vec * this
operator fun Long.times(vec: Vector3) = vec * this
operator fun Float.times(vec: Vector3) = vec * this
operator fun Double.times(vec: Vector3) = vec * this
