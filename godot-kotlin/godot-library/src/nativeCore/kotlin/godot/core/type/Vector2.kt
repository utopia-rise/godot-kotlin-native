@file:Suppress("unused", "MemberVisibilityCanBePrivate")

package godot.core

import godot.gdnative.godot_vector2
import godot.gdnative.godot_vector2_layout
import godot.internal.type.*
import kotlinx.cinterop.*
import kotlin.math.*

class Vector2(
    p_x: KotlinReal,
    p_y: KotlinReal,
) : Comparable<Vector2>, CoreType {

    @PublishedApi
    internal var _x: GodotReal = p_x.toGodotReal()

    @PublishedApi
    internal var _y: GodotReal = p_y.toGodotReal()


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

    //CONSTANTS
    enum class Axis(val value: Int) {
        X(0),
        Y(1);

        companion object {
            fun from(value: Int) = when (value) {
                0 -> X
                1 -> Y
                else -> throw AssertionError("Unknown axis for Vector2: $value")
            }
        }
    }

    companion object {
        val AXIS_X = Axis.X.value
        val AXIS_Y = Axis.Y.value
        val ZERO: Vector2
            get() = Vector2(0, 0)
        val ONE: Vector2
            get() = Vector2(1, 1)
        val INF: Vector2
            get() = Vector2(KotlinReal.POSITIVE_INFINITY, KotlinReal.POSITIVE_INFINITY)
        val LEFT: Vector2
            get() = Vector2(-1, 0)
        val RIGHT: Vector2
            get() = Vector2(1, 0)
        val UP: Vector2
            get() = Vector2(0, -1)
        val DOWN: Vector2
            get() = Vector2(0, 1)
    }


    //CONSTRUCTOR
    constructor() :
        this(0.0f, 0.0f)

    constructor(vec: Vector2) :
        this(vec._x, vec._y)

    constructor(x: Number, y: Number) :
        this(x.toKotlinReal(), y.toKotlinReal())


    internal constructor(native: CValue<godot_vector2>) : this(0.0f, 0.0f) {
        memScoped {
            this@Vector2.setRawMemory(native.ptr)
        }
    }

    internal constructor(mem: COpaquePointer) : this() {
        this.setRawMemory(mem)
    }


    //INTEROP
    override fun getRawMemory(memScope: MemScope): COpaquePointer {
        val value = cValue<godot_vector2_layout> {
            x = this@Vector2._x.toFloat()
            y = this@Vector2._y.toFloat()
        }
        return value.getPointer(memScope)
    }

    override fun setRawMemory(mem: COpaquePointer) {
        val value = mem.reinterpret<godot_vector2_layout>().pointed
        _x = value.x.toGodotReal()
        _y = value.y.toGodotReal()
    }


    //API
    /**
     * Returns a new vector with all components in absolute values (i.e. positive).
     */
    fun abs(): Vector2 {
        return Vector2(abs(_x), abs(_y))
    }

    /**
     * Returns the vector’s angle in radians with respect to the x-axis, or (1, 0) vector.
     * Equivalent to the result of atan2 when called with the vector’s x and y as parameters: atan2(x, y).
     */
    fun angle(): KotlinReal {
        return atan2(_y, _x).toKotlinReal()
    }

    /**
     * Returns the angle in radians between the two vectors.
     */
    fun angleTo(to: Vector2): KotlinReal {
        return atan2(cross(to), dot(to))
    }

    /**
     * Returns the angle in radians between the line connecting the two points and the x coordinate.
     */
    fun angleToPoint(other: Vector2): KotlinReal {
        return atan2(_y - other._y, _x - other._x).toKotlinReal()
    }

    /**
     * Returns the ratio of x to y.
     */
    fun aspect(): KotlinReal {
        return (this._x / this._y).toKotlinReal()
    }

    /**
     * Returns the vector “bounced off” from a plane defined by the given normal.
     */
    fun bounce(n: Vector2): Vector2 {
        return -reflect(n)
    }

    /**
     * Returns the vector with all components rounded up.
     */
    fun ceil(): Vector2 {
        return Vector2(ceil(_x), ceil(_y))
    }

    /**
     * Returns the vector with a maximum length.
     */
    fun clamped(len: KotlinReal): Vector2 {
        val l = this.length()
        var v = Vector2(this)
        if (l > 0 && len < l) {
            v /= l
            v *= len
        }
        return v
    }

    /**
     * Returns the 2 dimensional analog of the cross product with the given vector.
     */
    fun cross(other: Vector2): KotlinReal {
        return (_x * other._y - _y * other._x).toKotlinReal()
    }

    /**
     * Cubicly interpolates between this vector and b using pre_a and post_b as handles, and returns the result at position t.
     * t is in the range of 0.0f - 1.0f, representing the amount of interpolation.
     */
    fun cubicInterpolate(v: Vector2, pre: Vector2, post: Vector2, t: KotlinReal): Vector2 {
        val p0: Vector2 = pre
        val p1: Vector2 = this
        val p2: Vector2 = v
        val p3: Vector2 = post

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
    fun directionTo(other: Vector2): Vector2 {
        val ret = Vector2(other._x - _x, other._y - _y)
        ret.normalize()
        return ret
    }

    /**
     * Returns the squared distance to vector b.
     * Prefer this function over distance_to if you need to sort vectors or need the squared distance for some formula.
     */
    fun distanceSquaredTo(other: Vector2): KotlinReal {
        return ((_x - other._x) * (_x - other._x) + (_y - other._y) * (_y - other._y)).toKotlinReal()
    }

    /**
     * Returns the distance to vector b.
     */
    fun distanceTo(other: Vector2): KotlinReal {
        return sqrt((_x - other._x) * (_x - other._x) + (_y - other._y) * (_y - other._y)).toKotlinReal()
    }

    /**
     * Returns the dot product with vector b.
     */
    fun dot(other: Vector2): KotlinReal {
        return (_x * other._x + _y * other._y).toKotlinReal()
    }

    /**
     * Returns the vector with all components rounded down.
     */
    fun floor(): Vector2 {
        return Vector2(floor(_x), floor(_y))
    }

    /**
     * Returns true if this vector and v are approximately equal, by running isEqualApprox on each component.
     */
    fun isEqualApprox(other: Vector2): Boolean {
        return isEqualApprox(
            other._x,
            _x
        ) && isEqualApprox(other._y, _y)
    }

    /**
     * Returns true if the vector is normalized.
     */
    fun isNormalized(): Boolean {
        return isEqualApprox(this.length().toGodotReal(), 1.0f)
    }

    /**
     * Returns the vector’s length.
     */
    fun length(): KotlinReal {
        return sqrt(_x * _x + _y * _y).toKotlinReal()
    }

    /**
     * Returns the vector’s length squared.
     * Prefer this method over length if you need to sort vectors or need the squared length for some formula.
     */
    fun lengthSquared(): KotlinReal {
        return (_x * _x + _y * _y).toKotlinReal()
    }

    /**
     * Returns the result of the linear interpolation between this vector and b by amount t.
     * t is in the range of 0.0f - 1.0f, representing the amount of interpolation.
     */
    fun linearInterpolate(v: Vector2, t: KotlinReal): Vector2 {
        val res = Vector2(this)
        res._x += (t * (v._x - _x)).toGodotReal()
        res._y += (t * (v._y - _y)).toGodotReal()
        return res
    }

    /**
     * Moves the vector toward to by the fixed delta amount.
     */
    fun moveToward(to: Vector2, delta: KotlinReal): Vector2 {
        val vd = to - this
        val len = vd.length()
        return if (len <= delta || len < CMP_EPSILON)
            to
        else
            this + vd / len * delta
    }

    /**
     * Returns the vector scaled to unit length. Equivalent to v / v.length().
     */
    fun normalized(): Vector2 {
        val v: Vector2 = Vector2(this)

        v.normalize()
        return v
    }

    internal fun normalize() {
        val l = length().toGodotReal()
        if (isEqualApprox(l, 0.0f)) {
            _x = 0.0f
            _y = 0.0f
        } else {
            _x /= l
            _y /= l
        }
    }

    /**
     * Returns a vector composed of the fposmod of this vector’s components and mod.
     */
    fun posmod(mod: KotlinReal): Vector2 {
        return Vector2(_x.rem(mod), _y.rem(mod))
    }

    /**
     * Returns a vector composed of the fposmod of this vector’s components and modv’s components.
     */
    fun posmodv(modv: Vector2): Vector2 {
        return Vector2(_x.rem(modv._x), _y.rem(modv._y))
    }

    /**
     * Returns the vector projected onto the vector b.
     */
    fun project(vec: Vector2): Vector2 {
        val v1: Vector2 = vec
        val v2: Vector2 = this
        return v2 * (v1.dot(v2) / v2.dot(v2))
    }

    /**
     * Returns the vector reflected from a plane defined by the given normal.
     */
    fun reflect(vec: Vector2): Vector2 {
        return vec * this.dot(vec) * 2.0f - this
    }

    /**
     * Returns the vector rotated by phi radians.
     */
    fun rotated(by: KotlinReal): Vector2 {
        var v = Vector2(0.0f, 0.0f)
        v.rotate(this.angle() + by)
        v *= length()
        return v
    }

    internal fun rotate(radians: KotlinReal) {
        _x = cos(radians).toGodotReal()
        _y = sin(radians).toGodotReal()
    }

    /**
     * Returns the vector with all components rounded to the nearest integer, with halfway cases rounded away from zero.
     */
    fun round(): Vector2 {
        return Vector2(round(_x), round(_y))
    }

    /**
     * Returns the vector with each component set to one or negative one, depending on the signs of the components.
     */
    fun sign(): Vector2 {
        return Vector2(sign(_x), sign(_y))
    }

    /**
     * Returns the result of spherical linear interpolation between this vector and b, by amount t.
     * t is in the range of 0.0f - 1.0f, representing the amount of interpolation.
     *
     * Note: Both vectors must be normalized.
     */
    fun slerp(b: Vector2, t: KotlinReal): Vector2 {
        if (!this.isNormalized() || !b.isNormalized()) {
            Godot.printError("Vectors not normalized", "slerp()", "Vector2.kt", 240)
        }
        val theta: KotlinReal = angleTo(b)
        return rotated((theta * t))
    }

    /**
     * Returns the component of the vector along a plane defined by the given normal.
     */
    fun slide(vec: Vector2): Vector2 {
        return vec - this * this.dot(vec)
    }

    /**
     * Returns the vector snapped to a grid with the given size.
     */
    fun snapped(by: Vector2): Vector2 {
        val newX = if (isEqualApprox(by._x, 0.0f)) {
            floor(_x / by._x + 0.5f)
        } else {
            _x
        }
        val newY = if (isEqualApprox(by._x, 0.0f)) {
            floor(_y / by._y + 0.5f)
        } else {
            _y
        }
        return Vector2(newX, newY)
    }

    /**
     * Returns a perpendicular vector.
     */
    fun tangent(): Vector2 {
        return Vector2(_y, -_x)
    }


    //UTILITIES
    override fun toVariant() = Variant(this)

    internal operator fun get(idx: Int): GodotReal =
        when (idx) {
            0 -> _x
            1 -> _y
            else -> throw IndexOutOfBoundsException()
        }

    internal operator fun set(n: Int, f: GodotReal) =
        when (n) {
            0 -> _x = f.toGodotReal()
            1 -> _y = f.toGodotReal()
            else -> throw IndexOutOfBoundsException()
        }

    operator fun plus(v: Vector2) = Vector2(_x + v._x, _y + v._y)
    operator fun plus(scalar: Int) = Vector2(_x + scalar, _y + scalar)
    operator fun plus(scalar: Long) = Vector2(_x + scalar, _y + scalar)
    operator fun plus(scalar: Float) = Vector2(_x + scalar, _y + scalar)
    operator fun plus(scalar: Double) = Vector2(_x + scalar, _y + scalar)

    operator fun minus(v: Vector2) = Vector2(_x - v._x, _y - v._y)
    operator fun minus(scalar: Int) = Vector2(_x - scalar, _y - scalar)
    operator fun minus(scalar: Long) = Vector2(_x - scalar, _y - scalar)
    operator fun minus(scalar: Float) = Vector2(_x - scalar, _y - scalar)
    operator fun minus(scalar: Double) = Vector2(_x - scalar, _y - scalar)

    operator fun times(v1: Vector2) = Vector2(_x * v1._x, _y * v1._y)
    operator fun times(scalar: Int) = Vector2(_x * scalar, _y * scalar)
    operator fun times(scalar: Long) = Vector2(_x * scalar, _y * scalar)
    operator fun times(scalar: Float) = Vector2(_x * scalar, _y * scalar)
    operator fun times(scalar: Double) = Vector2(_x * scalar, _y * scalar)

    operator fun div(v1: Vector2) = Vector2(_x / v1._x, _y / v1._y)
    operator fun div(scalar: Int) = Vector2(_x / scalar, _y / scalar)
    operator fun div(scalar: Long) = Vector2(_x / scalar, _y / scalar)
    operator fun div(scalar: Float) = Vector2(_x / scalar, _y / scalar)
    operator fun div(scalar: Double) = Vector2(_x / scalar, _y / scalar)

    operator fun unaryMinus() = Vector2(-_x, -_y)

    override fun equals(other: Any?): Boolean =
        when (other) {
            is Vector2 -> (isEqualApprox(_x, other._x) && isEqualApprox(_y, other._y))
            else -> false
        }

    override fun compareTo(other: Vector2): Int =
        if (isEqualApprox(_x, other._x)) {
            when {
                _y < other._y -> -1
                isEqualApprox(_y, other._y) -> 0
                else -> 1
            }
        } else {
            when {
                _x < other._x -> -1
                else -> 1
            }
        }

    override fun hashCode(): Int {
        var result = _x.hashCode()
        result = 31 * result + _y.hashCode()
        return result
    }

    override fun toString(): String {
        return "($_x, $_y)"
    }
}

operator fun Int.plus(vec: Vector2) = vec + this
operator fun Long.plus(vec: Vector2) = vec + this
operator fun Float.plus(vec: Vector2) = vec + this
operator fun Double.plus(vec: Vector2) = vec + this

operator fun Int.minus(vec: Vector2) = Vector2(this - vec._x, this - vec._y)
operator fun Long.minus(vec: Vector2) = Vector2(this - vec._x, this - vec._y)
operator fun Float.minus(vec: Vector2) = Vector2(this - vec._x, this - vec._y)
operator fun Double.minus(vec: Vector2) = Vector2(this - vec._x, this - vec._y)

operator fun Int.times(vec: Vector2) = vec * this
operator fun Long.times(vec: Vector2) = vec * this
operator fun Float.times(vec: Vector2) = vec * this
operator fun Double.times(vec: Vector2) = vec * this
