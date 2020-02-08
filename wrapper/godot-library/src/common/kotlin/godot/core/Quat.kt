@file:Suppress("unused", "MemberVisibilityCanBePrivate")
package godot.core

import kotlin.math.*

typealias AxisAndAngle = Pair<Vector3, Double>

expect class Quat {
    var x: Double
    var y: Double
    var z: Double
    var w: Double

    constructor(basis: Basis)
    constructor(x: Number, y: Number, z: Number, w: Number = 1.0)
    constructor()
    constructor(axis: Vector3, angle: Double)
    constructor(v0: Vector3, v1: Vector3)
}

fun Quat.set(px: Double, py: Double, pz: Double, pw: Double) {
    x = px
    y = py
    z = pz
    w = pw
}

// setEulerXyz expects a vector containing the Euler angles in the format
// (ax,ay,az), where ax is the angle of rotation around x axis,
// and similar for other axes.
// This implementation uses XYZ convention (Z is the first rotation).
fun Quat.setEulerXyz(p_euler: Vector3) {
    val half1: Double = p_euler.x * 0.5
    val half2: Double = p_euler.y * 0.5
    val half3: Double = p_euler.z * 0.5

    // R = X(a1).Y(a2).Z(a3) convention for Euler angles.
    // Conversion to quaternion as listed in https://ntrs.nasa.gov/archive/nasa/casi.ntrs.nasa.gov/19770024290.pdf (page A-2)
    // a3 is the angle of the first rotation, following the notation in this reference.

    val cos1: Double = cos(half1)
    val cos2: Double = cos(half2)
    val cos3: Double = cos(half3)
    val sin1: Double = sin(half1)
    val sin2: Double = sin(half2)
    val sin3: Double = sin(half3)

    set(sin1 * cos2 * sin3 + cos1 * sin2 * cos3,
        sin1 * cos2 * cos3 - cos1 * sin2 * sin3,
        -sin1 * sin2 * cos3 + cos1 * sin2 * sin3,
        sin1 * sin2 * sin3 + cos1 * cos2 * cos3)
}

fun Quat.getEulerXyz(): Vector3 {
    val m = Basis(this)
    return m.getEulerXyz()
}

fun Quat.setEulerYxz(p_euler: Vector3) {
    val half1: Double = p_euler.y * 0.5
    val half2: Double = p_euler.x * 0.5
    val half3: Double = p_euler.z * 0.5

    // R = X(a1).Y(a2).Z(a3) convention for Euler angles.
    // Conversion to quaternion as listed in https://ntrs.nasa.gov/archive/nasa/casi.ntrs.nasa.gov/19770024290.pdf (page A-2)
    // a3 is the angle of the first rotation, following the notation in this reference.

    val cos1: Double = cos(half1)
    val cos2: Double = cos(half2)
    val cos3: Double = cos(half3)
    val sin1: Double = sin(half1)
    val sin2: Double = sin(half2)
    val sin3: Double = sin(half3)

    set(sin1 * cos2 * sin3 + cos1 * sin2 * cos3,
        sin1 * cos2 * cos3 - cos1 * sin2 * sin3,
        -sin1 * sin2 * cos3 + cos1 * sin2 * sin3,
        sin1 * sin2 * sin3 + cos1 * cos2 * cos3)
}

// getEulerYxz returns a vector containing the Euler angles in the format
// (ax,ay,az), where ax is the angle of rotation around x axis,
// and similar for other axes.
// This implementation uses YXZ convention (Z is the first rotation).
fun Quat.getEulerYxz(): Vector3 {
    val m = Basis(this)
    return m.getEulerYxz()
}

fun Quat.setEuler(p_euler: Vector3) = setEulerYxz(p_euler)
fun Quat.getEuler(): Vector3 = getEulerYxz()

fun Quat.length(): Double =
    sqrt(this.lengthSquared())

fun Quat.normalize() {
    x /= this.length()
    y /= this.length()
    z /= this.length()
    w /= this.length()
}

fun Quat.normalized(): Quat = this / this.length()

fun Quat.inverse(): Quat = Quat(-x, -y, -z, -w)

fun Quat.isNormalized() = abs(lengthSquared() - 1.0) < 0.00001

fun Quat.slerp(q: Quat, t: Double): Quat {
    val to1 = Quat()
    val omega: Double
    var cosom: Double
    val sinom: Double
    val scale0: Double
    val scale1: Double

    cosom = dot(q)

    if (cosom < 0) {
        cosom = -cosom
        to1.x = - q.x
        to1.y = - q.y
        to1.z = - q.z
        to1.w = - q.w
    } else {
        to1.x = q.x
        to1.y = q.y
        to1.z = q.z
        to1.w = q.w
    }

    if ( (1.0 - cosom) > CMP_EPSILON ) {
        // standard case (slerp)
        omega = acos(cosom)
        sinom = sin(omega)
        scale0 = sin((1.0 - t) * omega) / sinom
        scale1 = sin(t * omega) / sinom
    } else {
        // "from" and "to" quaternions are very close
        //  ... so we can do a linear interpolation
        scale0 = 1.0 - t
        scale1 = t
    }
    // calculate final values
    return Quat(
        scale0 * x + scale1 * to1.x,
        scale0 * y + scale1 * to1.y,
        scale0 * z + scale1 * to1.z,
        scale0 * w + scale1 * to1.w
    )
}

fun Quat.slerpni(q: Quat, t: Double): Quat {
    val from = this
    val dot: Double = from.dot(q)

    if (abs(dot) > 0.9999) return from

    val theta:     Double = acos(dot)
    val sinT:      Double = 1.0 / sin(theta)
    val newFactor: Double = sin(t * theta) * sinT
    val invFactor: Double = sin((1.0 - t) * theta) * sinT

    return Quat(invFactor * from.x + newFactor * q.x,
        invFactor * from.y + newFactor * q.y,
        invFactor * from.z + newFactor * q.z,
        invFactor * from.w + newFactor * q.w)
}

fun Quat.cubicSlerp(q: Quat, prep: Quat, postq: Quat, t: Double): Quat {
    val t2: Double = (1.0 - t) * t * 2
    val sp = this.slerp(q, t)
    val sq = prep.slerpni(postq, t)
    return sp.slerpni(sq, t2)
}

fun Quat.getAxisAndAngle(): AxisAndAngle = Vector3(x / sqrt(1.0 - w*w), y / sqrt(1.0 - w*w),z / sqrt(1.0 - w*w)) to 2 * acos(w)

fun Quat.setAxisAndAngle(axisAndAngle: AxisAndAngle) {
    val axis = axisAndAngle.first
    if (!axis.isNormalized()) GD.printError("Vector $axis is not normalized", "setAxisAndAngle", "Quat.kt", 270) //TODO: Find an efficient way to get source code line number

    val angle = axisAndAngle.second
    val d = axis.length()
    if (d == 0.0) {
        set(0.0, 0.0, 0.0, 0.0)
    }
    else {
        val sin = sin(angle * 0.5)
        val cos = cos(angle * 0.5)
        val s = sin / d
        set(axis.x * s, axis.y * s, axis.z * s, cos)
    }
}

operator fun Quat.times(v: Vector3) =
    Quat( w * v.x + y * v.z - z * v.y,
        w * v.y + z * v.x - x * v.z,
        w * v.z + x * v.y - y * v.x,
        -x * v.x - y * v.y - z * v.z)

operator fun Quat.plus(q2: Quat): Quat =
    Quat( this.x + q2.x, this.y + q2.y, this.z + q2.z, this.w + q2.w )

operator fun Quat.minus(q2: Quat): Quat =
    Quat( this.x - q2.x, this.y - q2.y, this.z - q2.z, this.w - q2.w )

operator fun Quat.times(q2: Quat): Quat =
    Quat( this.x * q2.x, this.y * q2.y, this.z * q2.z, this.w * q2.w )

operator fun Quat.unaryMinus(): Quat =
    Quat( -this.x, -this.y, -this.z, -this.w)

operator fun Quat.times(f: Double): Quat =
    Quat(x * f, y * f, z * f, w * f)

operator fun Quat.div(f: Double): Quat =
    Quat(x / f, y / f, z / f, w / f)

fun Quat.xform(v: Vector3): Vector3 {
    var q = this * v
    q *= this.inverse()
    return Vector3(q.x, q.y, q.z)
}

fun Quat.dot(q: Quat): Double =
    x * q.x+y * q.y+z * q.z+w * q.w

fun Quat.lengthSquared(): Double =
    dot(this)
