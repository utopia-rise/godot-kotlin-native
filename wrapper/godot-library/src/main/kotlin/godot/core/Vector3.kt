@file:Suppress("unused", "MemberVisibilityCanBePrivate")
package godot.core

import kotlin.math.sqrt
import godot.gdnative.*
import kotlinx.cinterop.*


class Vector3(var x: Double, var y: Double, var z: Double) : Comparable<Vector3>, CoreType {
    enum class Axis(val id: Long) {
        AXIS_X(0),
        AXIS_Y(1),
        AXIS_Z(2);

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }


    constructor() :
            this(0.0, 0.0, 0.0)

    constructor(x: Number, y: Number, z: Number) :
            this(x.toDouble(), y.toDouble(), z.toDouble())


    internal constructor(native: CValue<godot_vector3>) : this() {
        memScoped {
            this@Vector3.setRawMemory(native.ptr)
        }
    }
    internal constructor(mem: COpaquePointer) : this() {
        this.setRawMemory(mem)
    }


    override fun getRawMemory(memScope: MemScope): COpaquePointer {
        return cValuesOf(x.toFloat(), y.toFloat(), z.toFloat()).getPointer(memScope)
    }
    override fun setRawMemory(mem: COpaquePointer) {
        val arr = mem.reinterpret<FloatVar>()
        x = arr[0].toDouble()
        y = arr[1].toDouble()
        z = arr[2].toDouble()
    }

    operator fun get(n: Int): Double =
            when (n) {
                0 -> x
                1 -> y
                2 -> z
                else -> throw IndexOutOfBoundsException()
            }

    operator fun set(n: Int, f: Double): Unit =
            when (n) {
                0 -> x = f
                1 -> y = f
                2 -> z = f
                else -> throw IndexOutOfBoundsException()
            }

    operator fun plus(vec: Vector3): Vector3 =
            Vector3(x + vec.x, y + vec.y, z + vec.z)

    operator fun minus(vec: Vector3): Vector3 =
            Vector3(x - vec.x, y - vec.y, z - vec.z)

    operator fun times(vec: Vector3): Vector3 =
            Vector3(x * vec.x, y * vec.y, z * vec.z)

    operator fun div(vec: Vector3): Vector3 =
            Vector3(x / vec.x, y / vec.y, z / vec.z)

    operator fun times(scalar: Double): Vector3 =
            Vector3(x * scalar, y * scalar, z * scalar)

    operator fun div(scalar: Double): Vector3 =
            Vector3(x / scalar, y / scalar, z / scalar)

    operator fun unaryMinus(): Vector3 =
            Vector3(-x, -y, -z)

    override fun equals(other: Any?): Boolean =
            when (other) {
                is Vector3 -> (x == other.x && y == other.y && z == other.z)
                else -> false
            }

    override fun compareTo(other: Vector3): Int {
        if (x == other.x) {
            return if (y == other.y)
                when {
                    z < other.z -> -1
                    z == other.z -> 0
                    else -> 1
                }
            else
                when {
                    y < other.y -> -1
                    else -> 1
                }
        } else
            return when {
                x < other.x -> -1
                else -> 1
            }
    }

    fun abs(): Vector3 =
            Vector3(kotlin.math.abs(x), kotlin.math.abs(y), kotlin.math.abs(z))

    fun ceil(): Vector3 =
            Vector3(kotlin.math.ceil(x), kotlin.math.ceil(y), kotlin.math.ceil(z))

    fun cross(b: Vector3): Vector3 =
            Vector3((y * b.z) - (z * b.y),
                    (z * b.x) - (x * b.z),
                    (x * b.y) - (y * b.x))

    fun linearInterpolate(b: Vector3, t: Double): Vector3 =
            Vector3(x + (t * (b.x - x)),
                    y + (t * (b.y - y)),
                    z + (t * (b.z - z)))

    fun cubicInterpolate(b: Vector3, pre: Vector3, post: Vector3, t: Double): Vector3 {
        val p0: Vector3 = pre
        val p1: Vector3 = this
        val p2: Vector3 = b
        val p3: Vector3 = post

        val t2: Double = t * t
        val t3: Double = t2 * t

        return ((p1 * 2.0) +
                (-p0 + p2) * t +
                (p0 * 2.0 - p1 * 5.0 + p2 * 4.0 - p3) * t2 +
                (-p0 + p1 * 3.0 - p2 * 3.0 + p3) * t3) * 0.5
    }

    fun length(): Double = sqrt(x * x + y * y + z * z)

    fun lengthSquared(): Double = x * x + y * y + z * z

    fun distanceSquaredTo(b: Vector3): Double = (b - this).length()

    fun distanceTo(b: Vector3): Double = (b - this).lengthSquared()

    fun dot(b: Vector3): Double = x * b.x + y * b.y + z * b.z

    fun floor(): Vector3 = Vector3(kotlin.math.floor(x), kotlin.math.floor(y), kotlin.math.floor(z))

    fun inverse(): Vector3 = Vector3(1.0 / x, 1.0 / y, 1.0 / z)

    fun isNormalized() = kotlin.math.abs(lengthSquared() - 1.0) < 0.00001

    fun maxAxis(): Int =
            if (x < y)
                if (y < z) 2
                else 1
            else
                if (x < z) 2
                else 0

    fun minAxis(): Int =
            if (x < y)
                if (x < z) 0
                else 2
            else
                if (y < z) 1
                else 2

    fun normalize() {
        val l: Double = this.length()
        if (l == 0.0) {
            x = 0.0
            y = 0.0
            z = 0.0
        } else {
            x /= l
            y /= l
            z /= l
        }
    }

    fun normalized(): Vector3 {
        val v = this
        v.normalize()
        return v
    }

    fun reflect(by: Vector3): Vector3 =
            by - this * this.dot(by) * 2.0

    fun rotated(axis: Vector3, phi: Double): Vector3 {
        val v = this
        v.rotate(axis, phi)
        return v
    }

    fun rotate(axis: Vector3, phi: Double) {
        val ret = Basis(axis, phi).xform(this)
        this.x = ret.x
        this.y = ret.y
        this.z = ret.z
    }

    fun slide(by: Vector3): Vector3 =
            by - this * this.dot(by)

    fun snap(vecal: Double) {
        if (vecal != 0.0) {
            x = kotlin.math.floor(x / vecal + 0.5) * vecal
            y = kotlin.math.floor(y / vecal + 0.5) * vecal
            z = kotlin.math.floor(z / vecal + 0.5) * vecal
        }
    }

    fun snapped(by: Double): Vector3 {
        val v: Vector3 = this
        v.snap(by)
        return v
    }


    override fun toString() = "($x, $y, $z)"
    override fun hashCode(): Int = this.toString().hashCode()
}

operator fun Double.times(vecec: Vector3) =
        vecec * this

fun vec3Cross(a: Vector3, b: Vector3): Vector3 =
        a.cross(b)


