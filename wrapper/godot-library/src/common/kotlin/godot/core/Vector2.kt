@file:Suppress("unused", "MemberVisibilityCanBePrivate")
package godot.core

import godot.core.abs
import kotlin.math.*

expect class Vector2 : Comparable<Vector2> {
    var x: Double
    var y: Double

    constructor()
    constructor(x: Number, y: Number)

    var width: Double
    var height: Double
}

operator fun Vector2.get(idx: Int): Double =
    when (idx) {
        0 -> x
        1 -> y
        else -> throw IndexOutOfBoundsException()
    }

operator fun Vector2.set(n: Int, f: Double) =
    when (n) {
        0 -> x = f
        1 -> y = f
        else -> throw IndexOutOfBoundsException()
    }

operator fun Vector2.plus(v: Vector2): Vector2 =
    Vector2(x + v.x, y + v.y)

operator fun Vector2.minus(v: Vector2): Vector2 =
    Vector2(x - v.x, y - v.y)

operator fun Vector2.times(v1: Vector2): Vector2 =
    Vector2(x * v1.x, y * v1.y)

operator fun Vector2.times(rvalue: Double): Vector2 =
    Vector2(x * rvalue, y * rvalue)

operator fun Vector2.div(v1: Vector2): Vector2 =
    Vector2(x / v1.x, y / v1.y)

operator fun Vector2.div(rvalue: Double): Vector2 =
    Vector2(x / rvalue, y / rvalue)

operator fun Vector2.unaryMinus(): Vector2 =
    Vector2(-x, -y)

fun Vector2.normalize() {
    var l: Double = x * x + y * y
    if (l != 0.0) {
        l = sqrt(l)
        x /= l
        y /= l
    }
}

fun Vector2.normalized(): Vector2 {
    val v: Vector2 = this
    v.normalize()
    return v
}

fun Vector2.length() = sqrt(x * x + y * y)

fun Vector2.lengthSquared() = x * x + y * y

fun Vector2.distanceTo(vector2: Vector2) = sqrt((x - vector2.x) * (x - vector2.x) + (y - vector2.y) * (y - vector2.y))

fun Vector2.distanceSquaredTo(vector2: Vector2) = (x - vector2.x) * (x - vector2.x) + (y - vector2.y) * (y - vector2.y)

fun Vector2.angleTo(vector2: Vector2) = atan2(cross(vector2), dot(vector2))

fun Vector2.angleToPoint(vector2: Vector2) = atan2(y - vector2.y, x - vector2.x)

fun Vector2.dot(other: Vector2) = x * other.x + y * other.y

fun Vector2.cross(other: Vector2) = x * other.y - y * other.x

fun Vector2.cross(other: Double) = Vector2(other * y, -other * x)

fun Vector2.project(vec: Vector2): Vector2 {
    val v1: Vector2 = vec
    val v2: Vector2 = this
    return v2 * (v1.dot(v2) / v2.dot(v2))
}

fun Vector2.planeProject(d: Double, vec: Vector2): Vector2 =
    vec - this * (dot(vec) - d)

fun Vector2.clamped(len: Double): Vector2 {
    val l: Double = this.length()
    var v: Vector2 = this
    if (l > 0 && len < l) {
        v /= l
        v *= len
    }
    return v
}

internal fun Vector2.linearInterpolate(v: Vector2, t: Double): Vector2 {
    val res: Vector2 = this
    res.x += (t * (v.x - x))
    res.y += (t * (v.y - y))
    return res
}

fun Vector2.cubicInterpolate(v: Vector2, pre: Vector2, post: Vector2, t: Double): Vector2 {
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

fun Vector2.slide(vec: Vector2) = vec - this * this.dot(vec)

fun Vector2.reflect(vec: Vector2) = vec * this.dot(vec) * 2.0 - this

fun Vector2.bounce(vec: Vector2) = -reflect(vec)

fun Vector2.angle() = atan2(y, x)

fun Vector2.setRotation(radians: Double) {
    x = cos(radians)
    y = sin(radians)
}

fun Vector2.abs() = Vector2(abs(x), abs(y))

fun Vector2.rotated(by: Double): Vector2 {
    var v = Vector2(0.0, 0.0)
    v.setRotation(this.angle() + by)
    v *= length()
    return v
}

fun Vector2.tangent() = Vector2(y, -x)

fun Vector2.floor() = Vector2(floor(x), floor(y))

fun Vector2.snapped(by: Vector2): Vector2 {
    val newX: Double = if (by.x != 0.0) floor(x / by.x + 0.5) else x

    val newY = if (by.y != 0.0) floor(y / by.y + 0.5) else y

    return Vector2(newX, newY)
}

fun Vector2.aspect()= this.width / this.height
