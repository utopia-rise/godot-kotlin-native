@file:Suppress("unused", "MemberVisibilityCanBePrivate")
package godot.core

expect class Transform {
    var basis: Basis
    var origin: Vector3

    constructor()
    constructor(basis: Basis, origin: Vector3 = Vector3())
    constructor(xx: Number, xy: Number, xz: Number, yx: Number, yy: Number, yz: Number, zx: Number, zy: Number, zz: Number, tx: Number, ty: Number, tz: Number)
}

fun Transform.inverseXform(t: Transform): Transform {
    val v = t.origin - origin
    return Transform(basis.transposeXform(t.basis), basis.xform(v))
}

fun Transform.set(xx: Number, xy: Number, xz: Number, yx: Number, yy: Number, yz: Number, zx: Number, zy: Number, zz: Number, tx: Number, ty: Number, tz: Number) {
    basis[0][0] = xx.toDouble()
    basis[0][1] = xy.toDouble()
    basis[0][2] = xz.toDouble()
    basis[1][0] = yx.toDouble()
    basis[1][1] = yy.toDouble()
    basis[1][2] = yz.toDouble()
    basis[2][0] = zx.toDouble()
    basis[2][1] = zy.toDouble()
    basis[2][2] = zz.toDouble()
    origin[0] = tx.toDouble()
    origin[1] = ty.toDouble()
    origin[2] = tz.toDouble()
}

fun Transform.xform(vector: Vector3): Vector3 =
    Vector3(basis[0].dot(vector) + origin.x,
        basis[1].dot(vector) + origin.y,
        basis[2].dot(vector) + origin.z)

fun Transform.xformInv(vector: Vector3): Vector3 {
    val v = vector - origin
    return Vector3(
        (basis[0][0] * v.x ) + ( basis[1][0] * v.y ) + ( basis[2][0] * v.z ),
        (basis[0][1] * v.x ) + ( basis[1][1] * v.y ) + ( basis[2][1] * v.z ),
        (basis[0][2] * v.x ) + ( basis[1][2] * v.y ) + ( basis[2][2] * v.z )
    )
}

fun Transform.xform(plane: Plane): Plane {
    var point = plane.normal * plane.d
    var pointDir = point + plane.normal
    point = xform(point)
    pointDir = xform(pointDir)

    val normal = pointDir - point
    normal.normalize()

    return Plane(normal, normal.dot(point))
}

fun Transform.xformInv(plane: Plane): Plane {
    var point = plane.normal * plane.d
    var pointDir = point + plane.normal
    point = xformInv(point)
    pointDir = xformInv(pointDir)

    val normal = pointDir - point
    normal.normalize()

    return Plane(normal, normal.dot(point))
}

fun Transform.xform(aabb: AABB): AABB {
    val x = basis.getAxis(0) * aabb.size.x
    val y = basis.getAxis(1) * aabb.size.y
    val z = basis.getAxis(2) * aabb.size.z
    val pos = xform(aabb.position)

    val newAabb = AABB()
    newAabb.position = pos
    newAabb.expandTo(pos + x)
    newAabb.expandTo(pos + y)
    newAabb.expandTo(pos + z)
    newAabb.expandTo(pos + x + y)
    newAabb.expandTo(pos + x + z)
    newAabb.expandTo(pos + y + z)
    newAabb.expandTo(pos + x + y + z)
    return newAabb
}

fun Transform.xformInv(aabb: AABB): AABB {
    val vertices: Array<Vector3> =
        arrayOf(Vector3(aabb.position.x + aabb.size.x, aabb.position.y + aabb.size.y, aabb.position.z + aabb.size.z),
            Vector3(aabb.position.x + aabb.size.x, aabb.position.y + aabb.size.y, aabb.position.z),
            Vector3(aabb.position.x + aabb.size.x, aabb.position.y, aabb.position.z + aabb.size.z),
            Vector3(aabb.position.x + aabb.size.x, aabb.position.y, aabb.position.z),
            Vector3(aabb.position.x, aabb.position.y + aabb.size.y, aabb.position.z + aabb.size.z),
            Vector3(aabb.position.x, aabb.position.y + aabb.size.y, aabb.position.z),
            Vector3(aabb.position.x, aabb.position.y, aabb.position.z + aabb.size.z),
            Vector3(aabb.position.x, aabb.position.y, aabb.position.z))

    val ret = AABB()
    ret.position = xformInv(vertices[0])
    for (i in 1..7)
        ret.expandTo(xformInv(vertices[i]))

    return ret
}

fun Transform.affineInvert() {
    basis.invert()
    origin = basis.xform(-origin)
}

fun Transform.affineInverse(): Transform {
    val ret = this
    ret.affineInvert()
    return ret
}

fun Transform.invert() {
    basis.transpose()
    origin = basis.xform(-origin)
}

fun Transform.inverse(): Transform {
    val ret = this
    ret.invert()
    return ret
}

fun Transform.rotate(axis: Vector3, phi: Double) {
    val t = rotated(axis, phi)
    this.basis = t.basis
    this.origin = t.origin
}

fun Transform.rotated(axis: Vector3, phi: Double): Transform = Transform(Basis(axis, phi), Vector3()) * this

fun Transform.rotateBasis(axis: Vector3, phi: Double) {
    basis.rotate(axis, phi)
}

fun Transform.lookingAt(target: Vector3, up: Vector3): Transform {
    val t = this
    t.setLookAt(origin, target, up)
    return t
}

fun Transform.setLookAt(eye: Vector3, target: Vector3, up: Vector3) { //TODO: Refactor
    val x: Vector3
    var y = up
    val z = eye - target

    z.normalize()
    x = y.cross(z)
    y = z.cross(x)
    x.normalize()
    y.normalize()

    basis.setAxis(0, x)
    basis.setAxis(1, y)
    basis.setAxis(2, z)
    origin = eye
}

fun Transform.interpolateWith(transform: Transform, c: Double): Transform {
    val srcScale = basis.getScale()
    val srcRot = Quat(basis)
    val srcLoc = origin

    val dstScale = transform.basis.getScale()
    val dstRot = Quat(transform.basis)
    val dstLoc = transform.origin

    val dst = Transform()
    dst.basis= Basis(srcRot.slerp(dstRot,c))
    dst.basis.scale(srcScale.linearInterpolate(dstScale, c))
    dst.origin = srcLoc.linearInterpolate(dstLoc, c)

    return dst
}

fun Transform.scale(scale: Vector3) {
    basis.scale(scale)
    origin *= scale
}

fun Transform.scaled(scale: Vector3): Transform {
    val t = this
    t.scale(scale)
    return t
}

fun Transform.scaleBasis(scale: Vector3) {
    basis.scale(scale)
}

fun Transform.translate(translation: Vector3) {
    for (i in 0..2) origin[i] += basis[i].dot(translation)
}

fun Transform.translate(tx: Double, ty: Double, tz: Double) = translate(Vector3(tx, ty, tz))

fun Transform.translated(translation: Vector3): Transform {
    val t = this
    t.translate(translation)
    return t
}

fun Transform.orthonormalize() = basis.orthonormalize()

fun Transform.orthonormalized(): Transform {
    val t = this
    t.orthonormalize()
    return t
}

operator fun Transform.times(transform: Transform): Transform {
    val t = this
    t.origin = xform(transform.origin)
    t.basis *= transform.basis
    return t
}

