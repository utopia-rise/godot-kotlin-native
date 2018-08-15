package kotlin.godot.core

import godot.*
import kotlinx.cinterop.*
import kotlin.math.*

class Vector2(var x: Float, var y: Float) : Comparable<Vector2>, CoreType {
    constructor() :
            this(0f, 0f)

    constructor(x: Number, y: Number) :
            this(x.toFloat(), y.toFloat())


    override fun getRawMemory(memScope: MemScope): COpaquePointer {
        return cValuesOf(x, y).getPointer(memScope)
    }

    override fun setRawMemory(mem: COpaquePointer) {
        val arr = mem.reinterpret<FloatVar>()
        x = arr[0]
        y = arr[1]
    }

    internal constructor(native: CValue<godot_vector2>) : this(0f, 0f) {
        memScoped {
            this@Vector2.setRawMemory(native.ptr)
        }
    }

    internal constructor(mem: COpaquePointer) : this() {
        this.setRawMemory(mem)
    }

    var width: Float
        get() = x
        set(value) {
            x = value
        }
    var height: Float
        get() = y
        set(value) {
            y = value
        }

    operator fun get(idx: Int): Float =
            when (idx) {
                0 -> x
                1 -> y
                else -> throw IndexOutOfBoundsException()
            }

    operator fun set(n: Int, f: Float) =
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

    operator fun times(rvalue: Float): Vector2 =
            Vector2(x * rvalue, y * rvalue)

    operator fun div(v1: Vector2): Vector2 =
            Vector2(x / v1.x, y / v1.y)

    operator fun div(rvalue: Float): Vector2 =
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

    fun normalize(): Unit {
        var l: Float = x * x + y * y
        if (l != 0f) {
            l = sqrt(l)
            x /= l
            y /= l
        }
    }

    fun normalized(): Vector2 {
        val v: Vector2 = this
        v.normalize()
        return v
    }

    fun length(): Float =
            sqrt(x * x + y * y)

    fun lengthSquared(): Float =
            x * x + y * y

    fun distanceTo(vector2: Vector2): Float =
            sqrt((x - vector2.x) * (x - vector2.x) + (y - vector2.y) * (y - vector2.y))

    fun distanceSquaredTo(vector2: Vector2): Float =
            (x - vector2.x) * (x - vector2.x) + (y - vector2.y) * (y - vector2.y)

    fun angleTo(vector2: Vector2): Float =
            atan2(cross(vector2), dot(vector2))

    fun angleToPoint(vector2: Vector2): Float =
            atan2(y - vector2.y, x - vector2.x)

    fun dot(other: Vector2): Float =
            x * other.y + y * other.x

    fun cross(other: Vector2): Float =
            x * other.y - y * other.x

    fun cross(other: Float): Vector2 =
            Vector2(other * y, -other * x)

    fun project(vec: Vector2): Vector2 {
        val v1: Vector2 = vec
        val v2: Vector2 = this
        return v2 * (v1.dot(v2) / v2.dot(v2))
    }

    fun planeProject(d: Float, vec: Vector2): Vector2 =
            vec - this * (dot(vec) - d)

    fun clamped(len: Float): Vector2 {
        val l: Float = this.length()
        var v: Vector2 = this
        if (l > 0 && len < l) {
            v /= l
            v *= len
        }
        return v
    }

    internal fun linearInterpolate(v: Vector2, t: Float): Vector2 {
        val res: Vector2 = this
        res.x += (t * (v.x - x))
        res.y += (t * (v.y - y))
        return res
    }

    fun cubicInterpolate(v: Vector2, pre: Vector2, post: Vector2, t: Float): Vector2 {
        val p0: Vector2 = pre
        val p1: Vector2 = this
        val p2: Vector2 = v
        val p3: Vector2 = post

        val t2: Float = t * t
        val t3: Float = t2 * t

        return ((p1 * 2.0f) +
                (-p0 + p2) * t +
                (p0 * 2.0f - p1 * 5.0f + p2 * 4f - p3) * t2 +
                (-p0 + p1 * 3.0f - p2 * 3.0f + p3) * t3) * 0.5f
    }

    fun slide(vec: Vector2): Vector2 =
            vec - this * this.dot(vec)

    fun reflect(vec: Vector2): Vector2 =
            vec - this * this.dot(vec) * 2.0f

    fun angle(): Float =
            atan2(y, x)

    fun setRotation(radians: Float): Unit {
        x = cos(radians)
        y = sin(radians)
    }

    fun abs(): Vector2 =
            Vector2(kotlin.math.abs(x), kotlin.math.abs(y))

    fun rotated(by: Float): Vector2 {
        var v = Vector2(0f, 0f)
        v.setRotation(this.angle() + by)
        v *= length()
        return v
    }

    fun tangent(): Vector2 =
            Vector2(y, -x)

    fun floor(): Vector2 =
            Vector2(kotlin.math.floor(x), kotlin.math.floor(y))

    fun snapped(by: Vector2): Vector2 {
        val newx: Float = if (by.x != 0f)
            kotlin.math.floor(x / by.x + 0.5f)
        else x
        val newy = if (by.y != 0f)
            kotlin.math.floor(y / by.y + 0.5f)
        else y

        return Vector2(newx, newy)
    }

    fun aspect(): Float =
            this.width / this.height

    override fun toString() = "$x, $y"
    external override fun hashCode(): Int {
        var result = x.hashCode()
        result = 31 * result + y.hashCode()
        return result
    }
}

operator fun Float.times(vec: Vector2): Vector2 =
        vec * this