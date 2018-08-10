package kotlin.godot.core

import kotlin.math.sqrt
import godot.*
import kotlinx.cinterop.*

class Vector3(var x: Float, var y: Float, var z: Float) : Comparable<Vector3>, CoreType {
    constructor() :
            this(0f, 0f, 0f)

    enum class Axis {
        AXIS_X,
        AXIS_Y,
        AXIS_Z
    }

    constructor(x: Number, y: Number, z: Number) :
            this(x.toFloat(), y.toFloat(), z.toFloat())

    override fun getRawMemory(memScope: MemScope): COpaquePointer {
        return cValuesOf(x, y, z).getPointer(memScope)
    }

    override fun setRawMemory(mem: COpaquePointer) {
        val arr = mem.reinterpret<FloatVar>()
        x = arr[0]
        y = arr[1]
        z = arr[2]
    }

    internal constructor(native: CValue<godot_vector3>) : this() {
        memScoped {
            this@Vector3.setRawMemory(native.ptr)
        }
    }

    internal constructor(mem: COpaquePointer) : this() {
        this.setRawMemory(mem)
    }

    operator fun get(n: Int): Float =
            when (n) {
                0 -> x
                1 -> y
                2 -> z
                else -> throw IndexOutOfBoundsException()
            }

    operator fun set(n: Int, f: Float): Unit =
            when (n) {
                0 -> x = f
                1 -> y = f
                2 -> z = f
                else -> throw IndexOutOfBoundsException()
            }

    operator fun plus(p_v: Vector3): Vector3 =
            Vector3(x + p_v.x, y + p_v.y, z + p_v.z)

    operator fun minus(p_v: Vector3): Vector3 =
            Vector3(x - p_v.x, y - p_v.y, z - p_v.z)

    operator fun times(p_v: Vector3): Vector3 =
            Vector3(x * p_v.x, y * p_v.y, z * p_v.z)

    operator fun div(p_v: Vector3): Vector3 =
            Vector3(x / p_v.x, y / p_v.y, z / p_v.z)

    operator fun times(p_scalar: Float): Vector3 =
            Vector3(x * p_scalar, y * p_scalar, z * p_scalar)

    operator fun div(p_scalar: Float): Vector3 =
            Vector3(x / p_scalar, y / p_scalar, z / p_scalar)

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

    fun linear_interpolate(p_b: Vector3, p_t: Float): Vector3 =
            Vector3(x + (p_t * (p_b.x - x)),
                    y + (p_t * (p_b.y - y)),
                    z + (p_t * (p_b.z - z)))

    fun cubic_interpolate(b: Vector3, pre_a: Vector3, post_b: Vector3, t: Float): Vector3 {
        val p0: Vector3 = pre_a
        val p1: Vector3 = this
        val p2: Vector3 = b
        val p3: Vector3 = post_b

        val t2: Float = t * t
        val t3: Float = t2 * t

        return ((p1 * 2.0f) +
                (-p0 + p2) * t +
                (p0 * 2.0f - p1 * 5.0f + p2 * 4f - p3) * t2 +
                (-p0 + p1 * 3.0f - p2 * 3.0f + p3) * t3) * 0.5f
    }

    fun length(): Float =
            sqrt(x * x + y * y + z * z)

    fun length_squared(): Float =
            x * x + y * y + z * z

    fun distance_squared_to(b: Vector3): Float =
            (b - this).length()

    fun distance_to(b: Vector3): Float =
            (b - this).length_squared()

    fun dot(b: Vector3): Float =
            x * b.x + y * b.y + z * b.z

    fun floor(): Vector3 =
            Vector3(kotlin.math.floor(x), kotlin.math.floor(y), kotlin.math.floor(z))

    fun inverse(): Vector3 =
            Vector3(1f / x, 1f / y, 1f / z)

    fun max_axis(): Int =
            if (x < y)
                if (y < z) 2
                else 1
            else
                if (x < z) 2
                else 0

    fun min_axis(): Int =
            if (x < y)
                if (x < z) 0
                else 2
            else
                if (y < z) 1
                else 2

    fun normalize(): Unit {
        val l: Float = this.length()
        if (l == 0f) {
            x = 0f
            y = 0f
            z = 0f
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
            by - this * this.dot(by) * 2f

    fun rotated(axis: Vector3, phi: Float): Vector3 {
        val v = this
        v.rotate(axis, phi)
        return v
    }

    fun rotate(p_axis: Vector3, p_phi: Float): Unit {
        val ret = Basis(p_axis, p_phi).xform(this)
        this.x = ret.x
        this.y = ret.y
        this.z = ret.z
    }

    fun slide(by: Vector3): Vector3 =
            by - this * this.dot(by)

    fun snap(p_val: Float): Unit {
        if (p_val != 0f) {
            x = kotlin.math.floor(x / p_val + 0.5f) * p_val
            y = kotlin.math.floor(y / p_val + 0.5f) * p_val
            z = kotlin.math.floor(z / p_val + 0.5f) * p_val
        }
    }

    fun snapped(by: Float): Vector3 {
        val v: Vector3 = this
        v.snap(by)
        return v
    }

    override fun toString() = "$x, $y, $z"
    //TODO(Do this with godot string)
}

operator fun Float.times(p_vec: Vector3) =
        p_vec * this

fun vec3_cross(p_a: Vector3, p_b: Vector3): Vector3 =
        p_a.cross(p_b)


