@file:Suppress("unused", "MemberVisibilityCanBePrivate")
package godot.core

import godot.gdnative.*
import kotlinx.cinterop.*
import kotlin.math.*


class Vector2(var x: Double, var y: Double) : Comparable<Vector2>, CoreType {

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

    constructor() :
            this(0.0, 0.0)

    constructor(x: Number, y: Number) :
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



    var width: Double
        get() = x
        set(value) {
            x = value
        }
    var height: Double
        get() = y
        set(value) {
            y = value
        }


    operator fun get(idx: Int): Double =
            when (idx) {
                0 -> x
                1 -> y
                else -> throw IndexOutOfBoundsException()
            }

    operator fun set(n: Int, f: Double) =
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

    operator fun times(rvalue: Double): Vector2 =
            Vector2(x * rvalue, y * rvalue)

    operator fun div(v1: Vector2): Vector2 =
            Vector2(x / v1.x, y / v1.y)

    operator fun div(rvalue: Double): Vector2 =
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

    fun normalize() {
        var l: Double = x * x + y * y
        if (l != 0.0) {
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

    fun length() = sqrt(x * x + y * y)

    fun lengthSquared() = x * x + y * y

    fun distanceTo(vector2: Vector2) = sqrt((x - vector2.x) * (x - vector2.x) + (y - vector2.y) * (y - vector2.y))

    fun distanceSquaredTo(vector2: Vector2) = (x - vector2.x) * (x - vector2.x) + (y - vector2.y) * (y - vector2.y)

    fun angleTo(vector2: Vector2) = atan2(cross(vector2), dot(vector2))

    fun angleToPoint(vector2: Vector2) = atan2(y - vector2.y, x - vector2.x)

    fun dot(other: Vector2) = x * other.x + y * other.y

    fun cross(other: Vector2) = x * other.y - y * other.x

    fun cross(other: Double) = Vector2(other * y, -other * x)

    fun project(vec: Vector2): Vector2 {
        val v1: Vector2 = vec
        val v2: Vector2 = this
        return v2 * (v1.dot(v2) / v2.dot(v2))
    }

    fun planeProject(d: Double, vec: Vector2): Vector2 =
            vec - this * (dot(vec) - d)

    fun clamped(len: Double): Vector2 {
        val l: Double = this.length()
        var v: Vector2 = this
        if (l > 0 && len < l) {
            v /= l
            v *= len
        }
        return v
    }

    internal fun linearInterpolate(v: Vector2, t: Double): Vector2 {
        val res: Vector2 = this
        res.x += (t * (v.x - x))
        res.y += (t * (v.y - y))
        return res
    }

    fun cubicInterpolate(v: Vector2, pre: Vector2, post: Vector2, t: Double): Vector2 {
        val p0: Vector2 = pre
        val p1: Vector2 = this
        val p2: Vector2 = v
        val p3: Vector2 = post

        val t2: Double = t * t
        val t3: Double = t2 * t

        return ((p1 * 2.0) +
                (-p0 + p2) * t +
                (p0 * 2.0 - p1 * 5.0 + p2 * 4.0 - p3) * t2 +
                (-p0 + p1 * 3.0 - p2 * 3.0 + p3) * t3) * 0.5
    }

    fun slide(vec: Vector2) = vec - this * this.dot(vec)

    fun reflect(vec: Vector2) = vec - this * this.dot(vec) * 2.0

    fun bounce(vec: Vector2) = -reflect(vec)

    fun angle() = atan2(y, x)

    fun setRotation(radians: Double) {
        x = cos(radians)
        y = sin(radians)
    }

    fun abs() = Vector2(abs(x), abs(y))

    fun rotated(by: Double): Vector2 {
        var v = Vector2(0.0, 0.0)
        v.setRotation(this.angle() + by)
        v *= length()
        return v
    }

    fun tangent() = Vector2(y, -x)

    fun floor() = Vector2(floor(x), floor(y))

    fun snapped(by: Vector2): Vector2 {
        val newX: Double = if (by.x != 0.0) floor(x / by.x + 0.5) else x

        val newY = if (by.y != 0.0) floor(y / by.y + 0.5) else y

        return Vector2(newX, newY)
    }

    fun aspect()= this.width / this.height



    override fun toString() = "$x, $y"
    override fun hashCode(): Int = this.toString().hashCode()
}

operator fun Double.times(vec: Vector2) = vec * this