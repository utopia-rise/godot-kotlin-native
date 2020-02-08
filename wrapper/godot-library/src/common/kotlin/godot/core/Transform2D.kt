@file:Suppress("unused", "MemberVisibilityCanBePrivate")
package godot.core

import kotlin.math.acos
import kotlin.math.atan2
import kotlin.math.cos
import kotlin.math.sin

expect class Transform2D {
    var elements: Array<Vector2>

    constructor(xx: Number, xy: Number, yx: Number, yy: Number, ox: Number, oy: Number)
    constructor(rot: Number, pos: Vector2)
    constructor()
}

fun Transform2D.tdotx(v: Vector2) = elements[0][0] * v.x + elements[1][0] * v.y

fun Transform2D.tdoty(v: Vector2) = elements[0][1] * v.x + elements[1][1] * v.y

operator fun Transform2D.get(n: Int) = elements[n]

fun Transform2D.getAxis(axis: Int) = elements[axis]

fun Transform2D.setAxis(axis: Int, vec: Vector2) {
    elements[axis] = vec
}

fun Transform2D.getOrigin() = elements[2]

fun Transform2D.setOrigin(origin: Vector2) {
    elements[2] = origin
}

fun Transform2D.basisXform(v: Vector2) = Vector2(tdotx(v), tdoty(v))

fun Transform2D.basisXformInv(v: Vector2) = Vector2(elements[0].dot(v), elements[1].dot(v))

fun Transform2D.xform(v: Vector2) = Vector2(tdotx(v), tdoty(v)) + elements[2]

fun Transform2D.xformInv(vec: Vector2): Vector2 {
    val v = vec - elements[2]
    return Vector2(elements[0].dot(v), elements[1].dot(v))
}

fun Transform2D.xform(rect: Rect2): Rect2 {
    val x = elements[0] * rect.size.x
    val y = elements[1] * rect.size.y
    val pos = xform(rect.position)

    val newRect = Rect2()
    newRect.position = pos
    newRect.expandTo(pos + x)
    newRect.expandTo(pos + y)
    newRect.expandTo(pos + x + y)
    return newRect
}

fun Transform2D.setRotationAndScale(rot: Double, scale: Vector2) {
    elements[0][0] = cos(rot) * scale.x
    elements[1][1] = cos(rot) * scale.y
    elements[1][0] = -sin(rot) * scale.y
    elements[0][1] = sin(rot) * scale.x
}

fun Transform2D.xformInv(rect: Rect2): Rect2 {
    val ends = arrayOf(xformInv(rect.position),
        xformInv(Vector2(rect.position.x, rect.position.y + rect.size.y)),
        xformInv(Vector2(rect.position.x + rect.size.x, rect.position.y + rect.size.y)),
        xformInv(Vector2(rect.position.x + rect.size.x, rect.position.y)))

    val newRect = Rect2()
    newRect.position=ends[0]
    newRect.expandTo(ends[1])
    newRect.expandTo(ends[2])
    newRect.expandTo(ends[3])

    return newRect
}

fun Transform2D.invert() {
    elements[0][1] = elements[1][0].also { elements[1][0] = elements[0][1] }
    elements[2] = basisXform(-elements[2])
}

fun Transform2D.inverse(): Transform2D {
    val inv = this
    inv.invert()
    return inv
}

fun Transform2D.affineInvert() {
    val det = basisDeterminant()
    if (det == 0.0) {
        GD.printError("determinant == 0", "affineInvert()", "Transform2D.kt", 161)
        return
    }
    val idet = - 1.0 / det
    elements[0][0] = elements[1][1].also { elements[1][1] = elements[0][0] }
    elements[0] *= Vector2(idet,-idet)
    elements[1] *= Vector2(-idet,idet)

    elements[2] = basisXform(-elements[2])
}

fun Transform2D.affineInverse(): Transform2D {
    val inv = this
    inv.affineInvert()
    return inv
}

fun Transform2D.rotate(phi: Double) {
    val transform2D = Transform2D(phi,Vector2()) * this
    this.elements = transform2D.elements
}

fun Transform2D.getRotation(): Double {
    val det = basisDeterminant()
    val m = orthonormalized()
    if (det < 0) {
        m.scaleBasis(Vector2(-1, -1))
    }
    return atan2(m[0].y, m[0].x)
}

fun Transform2D.setRotation(rot: Double) {
    val cr = cos(rot)
    val sr = sin(rot)
    elements[0][0] = cr
    elements[0][1] = sr
    elements[1][0] = -sr
    elements[1][1] = cr
}

fun Transform2D.getScale(): Vector2 {
    val detSign: Double = if (basisDeterminant() > 0.0) 1.0 else -1.0
    return Vector2(elements[0].length(), elements[1].length()) * detSign
}

fun Transform2D.scale(scale: Vector2) {
    scaleBasis(scale)
    elements[2] *= scale
}

fun Transform2D.scaleBasis(scale: Vector2) {
    elements[0][0] *= scale.x
    elements[0][1] *= scale.y
    elements[1][0] *= scale.x
    elements[1][1] *= scale.y
}

fun Transform2D.translate(translation: Vector2) {
    elements[2] += basisXform(translation)
}

fun Transform2D.translate(tx: Double, ty: Double) =
    translate(Vector2(tx, ty))

fun Transform2D.orthonormalize() {
    val x = elements[0]
    var y = elements[1]

    x.normalize()
    y = (y - x * (x.dot(y)))
    y.normalize()

    elements[0] = x
    elements[1] = y
}

fun Transform2D.orthonormalized(): Transform2D {
    val on = this
    on.orthonormalize()
    return on
}

operator fun Transform2D.times(other: Transform2D): Transform2D {
    val new = this
    new.elements[2] = xform(other[2])
    val x0 = tdotx(other[0])
    val x1 = tdoty(other[0])
    val y0 = tdotx(other[1])
    val y1 = tdoty(other[1])

    new[0][0] = x0
    new[0][1] = x1
    new[1][0] = y0
    new[1][1] = y1

    return new
}

fun Transform2D.scaled(scale: Vector2): Transform2D {
    val copy = this
    copy.scale(scale)
    return copy
}

fun Transform2D.basisScaled(scale: Vector2): Transform2D {
    val copy = this
    copy.scaleBasis(scale)
    return copy
}

fun Transform2D.untranslated(): Transform2D {
    val copy = this
    copy.elements[2] = Vector2()
    return copy
}

fun Transform2D.translated(offset: Vector2): Transform2D {
    val copy = this
    copy.translate(offset)
    return copy
}

fun Transform2D.rotated(phi: Double): Transform2D {
    val copy = this
    copy.rotate(phi)
    return copy
}

fun Transform2D.basisDeterminant(): Double =
    elements[0].x * elements[1].y - elements[0].y * elements[1].x

fun Transform2D.interpolateWith(transform: Transform2D, c: Double): Transform2D {
    val p1 = getOrigin()
    val p2 = transform.getOrigin()

    val r1 = getRotation()
    val r2 = transform.getRotation()

    val s1 = getScale()
    val s2 = transform.getScale()

    val v1 = Vector2(cos(r1), sin(r1))
    val v2 = Vector2(cos(r2), sin(r2))

    var dot = v1.dot(v2)
    dot = when {
        dot < -1.0 -> -1.0
        dot > 1.0 -> 1.0
        else -> dot
    }

    val v = if (dot > 0.9995)
        (Vector2::linearInterpolate)(v1, v2, c).normalized()
    else {
        val angle = c * acos(dot)
        val v3 = (v2 - v1 * dot).normalized()
        v1 * cos(angle) + v3 * sin(angle)
    }

    val res = Transform2D(atan2(v.y, v.x), (Vector2::linearInterpolate)(p1, p2, c))
    res.scaleBasis((Vector2::linearInterpolate)(s1, s2, c))
    return res
}

