@file:Suppress("unused", "MemberVisibilityCanBePrivate")
package godot.core

import kotlin.math.sqrt

expect class Vector3 : Comparable<Vector3> {
    var x: Double
    var y: Double
    var z: Double

    enum class Axis {
        AXIS_X,
        AXIS_Y,
        AXIS_Z;

        companion object {
            fun fromInt(value: Long): Axis
        }
    }

    constructor()
    constructor(x: Number, y: Number, z: Number)
}

operator fun Vector3.get(n: Int): Double =
    when (n) {
        0 -> x
        1 -> y
        2 -> z
        else -> throw IndexOutOfBoundsException()
    }

operator fun Vector3.set(n: Int, f: Double): Unit =
    when (n) {
        0 -> x = f
        1 -> y = f
        2 -> z = f
        else -> throw IndexOutOfBoundsException()
    }

operator fun Vector3.plus(vec: Vector3): Vector3 =
    Vector3(x + vec.x, y + vec.y, z + vec.z)

operator fun Vector3.minus(vec: Vector3): Vector3 =
    Vector3(x - vec.x, y - vec.y, z - vec.z)

operator fun Vector3.times(vec: Vector3): Vector3 =
    Vector3(x * vec.x, y * vec.y, z * vec.z)

operator fun Vector3.div(vec: Vector3): Vector3 =
    Vector3(x / vec.x, y / vec.y, z / vec.z)

operator fun Vector3.times(scalar: Double): Vector3 =
    Vector3(x * scalar, y * scalar, z * scalar)

operator fun Vector3.div(scalar: Double): Vector3 =
    Vector3(x / scalar, y / scalar, z / scalar)

operator fun Vector3.unaryMinus(): Vector3 =
    Vector3(-x, -y, -z)

fun Vector3.abs(): Vector3 = Vector3(kotlin.math.abs(x), kotlin.math.abs(y), kotlin.math.abs(z))

fun Vector3.ceil(): Vector3 = Vector3(kotlin.math.ceil(x), kotlin.math.ceil(y), kotlin.math.ceil(z))

fun Vector3.cross(b: Vector3): Vector3 = Vector3((y * b.z) - (z * b.y), (z * b.x) - (x * b.z), (x * b.y) - (y * b.x))

fun Vector3.linearInterpolate(b: Vector3, t: Double): Vector3 = Vector3(x + (t * (b.x - x)), y + (t * (b.y - y)), z + (t * (b.z - z)))

fun Vector3.cubicInterpolate(b: Vector3, pre: Vector3, post: Vector3, t: Double): Vector3 {
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

fun Vector3.length(): Double = sqrt(x * x + y * y + z * z)

fun Vector3.lengthSquared(): Double = x * x + y * y + z * z

fun Vector3.distanceSquaredTo(b: Vector3): Double = (b - this).lengthSquared()

fun Vector3.distanceTo(b: Vector3): Double = (b - this).length()

fun Vector3.dot(b: Vector3): Double = x * b.x + y * b.y + z * b.z

fun Vector3.floor(): Vector3 = Vector3(kotlin.math.floor(x), kotlin.math.floor(y), kotlin.math.floor(z))

fun Vector3.inverse(): Vector3 = Vector3(1.0 / x, 1.0 / y, 1.0 / z)

fun Vector3.isNormalized() = kotlin.math.abs(lengthSquared() - 1.0) < 0.00001

fun Vector3.outer(b: Vector3) = Basis(
    Vector3(x * b.x, x * b.y, x * b.z),
    Vector3(y * b.x, y * b.y, y * b.z),
    Vector3(z * b.x, z * b.y, z * b.z)
)

fun Vector3.maxAxis() = if (x < y) {
    if (y < z) 2 else 1
} else {
    if (x < z) 2 else 0
}

fun Vector3.minAxis() = if (x < y) {
    if (x < z) 0
    else 2
} else {
    if (y < z) 1
    else 2
}

fun Vector3.normalize() {
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

fun Vector3.normalized(): Vector3 {
    val v = this
    v.normalize()
    return v
}

fun Vector3.reflect(by: Vector3) = by - this * this.dot(by) * 2.0

fun Vector3.rotated(axis: Vector3, phi: Double): Vector3 {
    val v = this
    v.rotate(axis, phi)
    return v
}

fun Vector3.rotate(axis: Vector3, phi: Double) {
    val ret = Basis(axis, phi).xform(this)
    this.x = ret.x
    this.y = ret.y
    this.z = ret.z
}

fun Vector3.slide(by: Vector3): Vector3 = by - this * this.dot(by)

fun Vector3.snap(vecal: Double) {
    if (vecal != 0.0) {
        x = kotlin.math.floor(x / vecal + 0.5) * vecal
        y = kotlin.math.floor(y / vecal + 0.5) * vecal
        z = kotlin.math.floor(z / vecal + 0.5) * vecal
    }
}

fun Vector3.snapped(by: Double): Vector3 {
    val v: Vector3 = this
    v.snap(by)
    return v
}

operator fun Double.times(vecec: Vector3) = vecec * this

fun vec3Cross(a: Vector3, b: Vector3) = a.cross(b)
