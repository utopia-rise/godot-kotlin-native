@file:Suppress("unused", "MemberVisibilityCanBePrivate")

package godot.core

import godot.gdnative.godot_vector3
import godot.gdnative.godot_vector3_layout
import kotlinx.cinterop.*
import kotlin.math.*


class Vector3(var x: Double, var y: Double, var z: Double) : Comparable<Vector3>, CoreType {
    //CONSTANTS
    enum class Axis(private val value: Int) {
        X(0),
        Y(1),
        Z(2);
    }

    companion object {
        val AXIS_X = Axis.X
        val AXIS_Y = Axis.Y
        val AXIS_Z = Axis.Z
        val ZERO: Vector3
            get() = Vector3(0, 0, 0)
        val ONE: Vector3
            get() = Vector3(1, 1, 1)
        val INF: Vector3
            get() = Vector3(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY)
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

    //INTEROP
    override fun getRawMemory(memScope: MemScope): COpaquePointer {
        val value = cValue<godot_vector3_layout> {
            x = this@Vector3.x.toFloat()
            y = this@Vector3.y.toFloat()
            z = this@Vector3.z.toFloat()
        }
        return value.getPointer(memScope)
    }

    override fun setRawMemory(mem: COpaquePointer) {
        val value = mem.reinterpret<godot_vector3_layout>().pointed
        x = value.x.toRealT()
        y = value.y.toRealT()
        z = value.z.toRealT()
    }


    //API
    fun abs(): Vector3 {
        return Vector3(abs(x), abs(y), abs(z))
    }

    fun angleTo(to: Vector3): RealT {
        return atan2(cross(to).length(), dot(to))
    }

    fun bounce(n: Vector3): Vector3 {
        return -reflect(n)
    }

    fun ceil(): Vector3 {
        return Vector3(ceil(x), ceil(y), ceil(z))
    }


    fun cross(b: Vector3): Vector3 {
        return Vector3((y * b.z) - (z * b.y), (z * b.x) - (x * b.z), (x * b.y) - (y * b.x))
    }

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

    fun directionTo(other: Vector3): Vector3 {
        val ret = Vector3(other.x - x, other.y - y, other.z - z)
        ret.normalize()
        return ret
    }

    fun distanceSquaredTo(other: Vector3): RealT {
        return (other - this).lengthSquared()
    }

    fun distanceTo(other: Vector3): RealT {
        return (other - this).length()
    }

    fun dot(b: Vector3): Double {
        return x * b.x + y * b.y + z * b.z
    }

    fun floor(): Vector3 {
        return Vector3(floor(x), floor(y), floor(z))
    }

    fun inverse(): Vector3 {
        return Vector3(1.0 / x, 1.0 / y, 1.0 / z)
    }

    fun isEqualApprox(other: Vector3): Boolean {
        return isEqualApprox(other.x, x) && isEqualApprox(other.y, y) && isEqualApprox(other.z, z)
    }

    fun isNormalized(): Boolean {
        return isEqualApprox(this.length(), 1.0)
    }

    fun length(): Double {
        return sqrt(x * x + y * y + z * z)
    }

    fun lengthSquared(): Double {
        return x * x + y * y + z * z
    }

    fun linearInterpolate(b: Vector3, t: Double): Vector3 {
        return Vector3(x + (t * (b.x - x)), y + (t * (b.y - y)), z + (t * (b.z - z)))
    }

    fun maxAxis(): Int {
        return if (x < y) {
            if (y < z) {
                2
            } else {
                1
            }
        } else {
            if (x < z) {
                2
            } else {
                0
            }
        }
    }

    fun minAxis(): Int {
        return if (x < y) {
            if (x < z) {
                0
            } else {
                2
            }
        } else {
            if (y < z) {
                1
            } else {
                2
            }
        }
    }

    fun moveToward(to: Vector3, delta: RealT): Vector3 {
        val vd = to - this
        val len = vd.length()
        return if (len <= delta || len < CMP_EPSILON) {
            to
        } else {
            this + vd / len * delta
        }
    }

    fun normalized(): Vector3 {
        val v: Vector3 = this
        v.normalize()
        return v
    }

    internal fun normalize() {
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

    fun outer(b: Vector3) = Basis(
        Vector3(x * b.x, x * b.y, x * b.z),
        Vector3(y * b.x, y * b.y, y * b.z),
        Vector3(z * b.x, z * b.y, z * b.z)
    )

    fun posmod(mod: RealT): Vector3 {
        return Vector3(x.rem(mod), y.rem(mod), z.rem(mod))
    }

    fun posmodv(modv: Vector3): Vector3 {
        return Vector3(x.rem(modv.x), y.rem(modv.y), z.rem(modv.z))
    }

    fun project(vec: Vector3): Vector3 {
        val v1: Vector3 = vec
        val v2: Vector3 = this
        return v2 * (v1.dot(v2) / v2.dot(v2))
    }

    fun reflect(by: Vector3): Vector3 {
        return by - this * this.dot(by) * 2.0
    }

    fun rotated(axis: Vector3, phi: Double): Vector3 {
        if (!axis.isNormalized()) {
            Godot.printError("Axis not normalized", "rotated()", "Vector3.kt", 251)
        }
        val v = this
        v.rotate(axis, phi)
        return v
    }

    internal fun rotate(axis: Vector3, phi: Double) {
        val ret = Basis(axis, phi).xform(this)
        this.x = ret.x
        this.y = ret.y
        this.z = ret.z
    }

    fun round(): Vector3 {
        return Vector3(round(x), round(y), round(z))
    }

    fun sign(): Vector3 {
        return Vector3(sign(x), sign(y), sign(z))
    }

    fun slerp(b: Vector3, t: RealT): Vector3 {
        if (!this.isNormalized() || !b.isNormalized()) {
            Godot.printError("Vectors not normalized", "slerp()", "Vector3.kt", 275)
        }
        val theta: RealT = angleTo(b)
        return rotated(cross(b).normalized(), theta * t)
    }

    fun slide(vec: Vector3): Vector3 {
        return vec - this * this.dot(vec)
    }

    fun snapped(by: Double): Vector3 {
        val v: Vector3 = this
        v.snap(by)
        return v
    }

    internal fun snap(vecal: Double) {
        if (vecal != 0.0) {
            x = floor(x / vecal + 0.5) * vecal
            y = floor(y / vecal + 0.5) * vecal
            z = floor(z / vecal + 0.5) * vecal
        }
    }

    fun toDiagonalMatrix(): Basis {
        return Basis()
    }


    //UTILITIES
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

    override fun toString(): String {
        return "($x, $y, $z)"
    }

    override fun hashCode(): Int {
        return this.toString().hashCode()
    }
}

operator fun Double.times(vecec: Vector3) = vecec * this


