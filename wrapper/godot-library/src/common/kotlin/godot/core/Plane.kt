@file:Suppress("unused", "MemberVisibilityCanBePrivate")
package godot.core

import kotlin.math.abs


expect class Plane {
    enum class ClockDirection

    var normal: Vector3
    var d: Double


    constructor(normal: Vector3, d: Number)

    constructor(point: Vector3, normal: Vector3)

    constructor(point1: Vector3, point2: Vector3, point3: Vector3, dir: ClockDirection)

    constructor(p1: Number, p2: Number, p3: Number, p4: Number)

    constructor()
}

fun Plane.project(point: Vector3): Vector3 =
    point - normal * distanceTo(point)

fun Plane.normalize() {
    val l = normal.length()
    if (l == 0.0) {
        this.normal = Vector3()
        this.d = 0.0
        return
    }
    normal /= l
    d /= l
}

fun Plane.normalized(): Plane {
    val p = this
    p.normalize()
    return p
}

fun Plane.getAnyPoint(): Vector3 =
    normal * d

fun Plane.getAnyPerpendicularNormal(): Vector3 {
    val p1 = Vector3(1, 0, 0)
    val p2 = Vector3(0, 1, 0)

    var p= if (abs(normal.dot(p1)) > 0.99) p2 else p1

    p -= normal * normal.dot(p)
    p.normalize()

    return p
}

fun Plane.intersect3(plane1: Plane, plane2: Plane): Vector3? {
    val plane0 = this
    val normal0 = plane0.normal
    val normal1 = plane1.normal
    val normal2 = plane2.normal

    val denom = vec3Cross(normal0, normal1).dot(normal2)

    if (abs(denom) <= CMP_EPSILON)
        return null

    val result: Vector3?
    result = ((vec3Cross(normal1, normal2) * plane0.d) +
        (vec3Cross(normal2, normal0) * plane1.d) +
        (vec3Cross(normal0, normal1) * plane2.d)) / denom
    return result
}

fun Plane.intersectsRay(from: Vector3, dir: Vector3): Vector3? {
    val den = normal.dot(dir)

    if (abs(den) <= CMP_EPSILON)
        return null

    val dist = (normal.dot(from) - d) / den

    if (dist > CMP_EPSILON)
        return null

    return from + dir * (-dist)
}

fun Plane.intersectsSegment(p_begin: Vector3, p_end: Vector3): Vector3? {
    val segment = p_begin - p_end
    val den = normal.dot(segment)

    if (abs(den) <= CMP_EPSILON)
        return null

    val dist = (normal.dot(p_begin) - d) / den

    if (dist < -CMP_EPSILON || dist > (1.0 + CMP_EPSILON))
        return null

    return p_begin + segment * (-dist)
}

fun Plane.isAlmostLike(plane: Plane) =
    normal.dot(plane.normal) > PLANE_EQ_DOT_EPSILON && abs(d - plane.d) < PLANE_EQ_D_EPSILON

fun Plane.isPointOver(point: Vector3): Boolean =
    normal.dot(point) > d

fun Plane.distanceTo(point: Vector3): Double =
    normal.dot(point) - d

fun Plane.hasPoint(point: Vector3, epsilon: Double): Boolean {
    val dist = abs(normal.dot(point) - d)
    return dist <= epsilon
}

