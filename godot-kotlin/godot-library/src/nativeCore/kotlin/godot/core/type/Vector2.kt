@file:Suppress("unused", "MemberVisibilityCanBePrivate")

package godot.core

import godot.gdnative.*
import kotlinx.cinterop.*
import kotlin.math.*

class Vector2(var x: RealT, var y: RealT) : Comparable<Vector2>, CoreType {
    //CONSTANTS
    enum class Axis(val value: Int) {
        X(0),
        Y(1);
    }

    companion object {
        val AXIS_X = Axis.X.value
        val AXIS_Y = Axis.Y.value
        val ZERO: Vector2
            get() = Vector2(0, 0)
        val ONE: Vector2
            get() = Vector2(1, 1)
        val INF: Vector2
            get() = Vector2(RealT.POSITIVE_INFINITY, RealT.POSITIVE_INFINITY)
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
        this(0.0, 0.0)

    constructor(x: Number, y: Number) :
        this(x.toRealT(), y.toRealT())


    internal constructor(native: CValue<godot_vector2>) : this(0.0, 0.0) {
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
            x = this@Vector2.x.toFloat()
            y = this@Vector2.y.toFloat()
        }
        return value.getPointer(memScope)
    }

    override fun setRawMemory(mem: COpaquePointer) {
        val value = mem.reinterpret<godot_vector2_layout>().pointed
        x = value.x.toRealT()
        y = value.y.toRealT()
    }


    //API
    fun abs(): Vector2 {
        return Vector2(abs(x), abs(y))
    }

    fun angle(): RealT {
        return atan2(y, x)
    }

    fun angleTo(to: Vector2): RealT {
        return atan2(cross(to), dot(to))
    }

    fun angleToPoint(other: Vector2): RealT {
        return atan2(y - other.y, x - other.x)
    }

    fun aspect(): RealT {
        return this.x / this.y
    }

    fun bounce(n: Vector2): Vector2 {
        return -reflect(n)
    }

    fun ceil(): Vector2 {
        return Vector2(ceil(x), ceil(y))
    }

    fun clamped(len: RealT): Vector2 {
        val l: RealT = this.length()
        var v: Vector2 = this
        if (l > 0 && len < l) {
            v /= l
            v *= len
        }
        return v
    }

    fun cross(other: Vector2): RealT {
        return x * other.y - y * other.x
    }

    fun cubicInterpolate(v: Vector2, pre: Vector2, post: Vector2, t: RealT): Vector2 {
        val p0: Vector2 = pre
        val p1: Vector2 = this
        val p2: Vector2 = v
        val p3: Vector2 = post

        val t2: RealT = t * t
        val t3: RealT = t2 * t

        return ((p1 * 2.0) +
            (-p0 + p2) * t +
            (p0 * 2.0 - p1 * 5.0 + p2 * 4.0 - p3) * t2 +
            (-p0 + p1 * 3.0 - p2 * 3.0 + p3) * t3) * 0.5
    }

    fun directionTo(other: Vector2): Vector2 {
        val ret = Vector2(other.x - x, other.y - y)
        ret.normalize()
        return ret
    }

    fun distanceSquaredTo(other: Vector2): RealT {
        return (x - other.x) * (x - other.x) + (y - other.y) * (y - other.y)
    }

    fun distanceTo(other: Vector2): RealT {
        return sqrt((x - other.x) * (x - other.x) + (y - other.y) * (y - other.y))
    }

    fun dot(other: Vector2): RealT {
        return x * other.x + y * other.y
    }

    fun floor(): Vector2 {
        return Vector2(floor(x), floor(y))
    }

    fun isEqualApprox(other: Vector2): Boolean {
        return isEqualApprox(other.x, x) && isEqualApprox(other.y, y)
    }

    fun isNormalized(): Boolean {
        return isEqualApprox(this.length(), 1.0)
    }

    fun length(): RealT {
        return sqrt(x * x + y * y)
    }

    fun lengthSquared(): RealT {
        return x * x + y * y
    }

    fun linearInterpolate(v: Vector2, t: RealT): Vector2 {
        val res: Vector2 = this
        res.x += (t * (v.x - x))
        res.y += (t * (v.y - y))
        return res
    }

    fun moveToward(to: Vector2, delta: RealT): Vector2 {
        val vd = to - this
        val len = vd.length()
        return if (len <= delta || len < CMP_EPSILON)
            to
        else
            this + vd / len * delta
    }

    fun normalized(): Vector2 {
        val v: Vector2 = this
        v.normalize()
        return v
    }

    internal fun normalize() {
        val l: RealT = length()
        if (l == 0.0) {
            x = 0.0
            y = 0.0
        } else {
            x /= l
            y /= l
        }
    }

    fun posmod(mod: RealT): Vector2 {
        return Vector2(x.rem(mod), y.rem(mod))
    }

    fun posmodv(modv: Vector2): Vector2 {
        return Vector2(x.rem(modv.x), y.rem(modv.y))
    }

    fun project(vec: Vector2): Vector2 {
        val v1: Vector2 = vec
        val v2: Vector2 = this
        return v2 * (v1.dot(v2) / v2.dot(v2))
    }

    fun reflect(vec: Vector2): Vector2 {
        return vec * this.dot(vec) * 2.0 - this
    }

    fun rotated(by: RealT): Vector2 {
        var v = Vector2(0.0, 0.0)
        v.rotate(this.angle() + by)
        v *= length()
        return v
    }

    internal fun rotate(radians: RealT) {
        x = cos(radians)
        y = sin(radians)
    }

    fun round(): Vector2 {
        return Vector2(round(x), round(y))
    }

    fun sign(): Vector2 {
        return Vector2(sign(x), sign(y))
    }

    fun slerp(b: Vector2, t: RealT): Vector2 {
        if (!this.isNormalized() || !b.isNormalized()) {
            Godot.printError("Vectors not normalized", "slerp()", "Vector2.kt", 240)
        }
        val theta: RealT = angleTo(b)
        return rotated((theta * t))
    }

    fun slide(vec: Vector2): Vector2 {
        return vec - this * this.dot(vec)
    }

    fun snapped(by: Vector2): Vector2 {
        val newX: RealT = if (by.x != 0.0) floor(x / by.x + 0.5) else x
        val newY = if (by.y != 0.0) floor(y / by.y + 0.5) else y
        return Vector2(newX, newY)
    }

    fun tangent(): Vector2 {
        return Vector2(y, -x)
    }


    //UTILITIES
    operator fun get(idx: Int): RealT =
        when (idx) {
            0 -> x
            1 -> y
            else -> throw IndexOutOfBoundsException()
        }

    operator fun set(n: Int, f: RealT) =
        when (n) {
            0 -> x = f
            1 -> y = f
            else -> throw IndexOutOfBoundsException()
        }

    operator fun plus(v: Vector2): Vector2 =
        Vector2(x + v.x, y + v.y)

    operator fun minus(v: Vector2): Vector2 =
        Vector2(x - v.x, y - v.y)

    operator fun times(v1: Vector2): Vector2 =
        Vector2(x * v1.x, y * v1.y)

    operator fun times(rvalue: RealT): Vector2 =
        Vector2(x * rvalue, y * rvalue)

    operator fun div(v1: Vector2): Vector2 =
        Vector2(x / v1.x, y / v1.y)

    operator fun div(rvalue: RealT): Vector2 =
        Vector2(x / rvalue, y / rvalue)

    operator fun unaryMinus(): Vector2 =
        Vector2(-x, -y)


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

    override fun toString(): String {
        return "($x, $y)"
    }

    override fun hashCode(): Int {
        return this.toString().hashCode()
    }
}

operator fun RealT.times(vec: Vector2) = vec * this
