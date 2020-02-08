@file:Suppress("unused", "MemberVisibilityCanBePrivate")
package godot.core

import godot.gdnative.godot_transform
import kotlinx.cinterop.*


class Transform: CoreType {
    var basis: Basis
    var origin: Vector3


    constructor():
            this(Basis())

    constructor(basis: Basis, origin: Vector3 = Vector3()) {
        this.basis = basis
        this.origin = origin
    }

    constructor(xx: Number, xy: Number, xz: Number, yx: Number, yy: Number, yz: Number, zx: Number, zy: Number, zz: Number, tx: Number, ty: Number, tz: Number):
            this(Basis(Vector3(xx,xy,xz), Vector3(yx,yy,yz), Vector3(zx,zy,zz)), Vector3(tx,ty,tz))



    internal constructor(native: CValue<godot_transform>) {
        basis = Basis()
        origin = Vector3()

        memScoped {
            this@Transform.setRawMemory(native.ptr)
        }
    }
    internal constructor(mem: COpaquePointer) {
        basis = Basis()
        origin = Vector3()

        this.setRawMemory(mem)
    }


    override fun getRawMemory(memScope: MemScope): COpaquePointer {
        return cValuesOf(basis[0][0].toFloat(), basis[0][1].toFloat(), basis[0][2].toFloat(), basis[1][0].toFloat(),
                basis[1][1].toFloat(), basis[1][2].toFloat(), basis[2][0].toFloat(), basis[2][1].toFloat(),
                basis[2][2].toFloat(), origin[0].toFloat(), origin[1].toFloat(), origin[2].toFloat()).getPointer(memScope)
    }
    override fun setRawMemory(mem: COpaquePointer) {
        val arr = mem.reinterpret<FloatVar>()
        basis[0][0] = arr[0].toDouble()
        basis[0][1] = arr[1].toDouble()
        basis[0][2] = arr[2].toDouble()
        basis[1][0] = arr[3].toDouble()
        basis[1][1] = arr[4].toDouble()
        basis[1][2] = arr[5].toDouble()
        basis[2][0] = arr[6].toDouble()
        basis[2][1] = arr[7].toDouble()
        basis[2][2] = arr[8].toDouble()
        origin[0] = arr[9].toDouble()
        origin[1] = arr[10].toDouble()
        origin[2] = arr[11].toDouble()
    }



    fun inverseXform(t: Transform): Transform {
        val v = t.origin - origin
        return Transform(basis.transposeXform(t.basis), basis.xform(v))
    }

    fun set(xx: Number, xy: Number, xz: Number, yx: Number, yy: Number, yz: Number, zx: Number, zy: Number, zz: Number, tx: Number, ty: Number, tz: Number) {
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

    fun xform(vector: Vector3): Vector3 =
            Vector3(basis[0].dot(vector) + origin.x,
                    basis[1].dot(vector) + origin.y,
                    basis[2].dot(vector) + origin.z)

    fun xformInv(vector: Vector3): Vector3 {
        val v = vector - origin
        return Vector3(
                (basis[0][0] * v.x ) + ( basis[1][0] * v.y ) + ( basis[2][0] * v.z ),
                (basis[0][1] * v.x ) + ( basis[1][1] * v.y ) + ( basis[2][1] * v.z ),
                (basis[0][2] * v.x ) + ( basis[1][2] * v.y ) + ( basis[2][2] * v.z )
        )
    }

    fun xform(plane: Plane): Plane {
        var point = plane.normal * plane.d
        var pointDir = point + plane.normal
        point = xform(point)
        pointDir = xform(pointDir)

        val normal = pointDir - point
        normal.normalize()

        return Plane(normal, normal.dot(point))
    }

    fun xformInv(plane: Plane): Plane {
        var point = plane.normal * plane.d
        var pointDir = point + plane.normal
        point = xformInv(point)
        pointDir = xformInv(pointDir)

        val normal = pointDir - point
        normal.normalize()

        return Plane(normal, normal.dot(point))
    }

    fun xform(aabb: AABB): AABB {
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

    fun xformInv(aabb: AABB): AABB {
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

    fun affineInvert() {
        basis.invert()
        origin = basis.xform(-origin)
    }

    fun affineInverse(): Transform {
        val ret = this
        ret.affineInvert()
        return ret
    }

    fun invert() {
        basis.transpose()
        origin = basis.xform(-origin)
    }

    fun inverse(): Transform {
        val ret = this
        ret.invert()
        return ret
    }

    fun rotate(axis: Vector3, phi: Double) {
        val t = rotated(axis, phi)
        this.basis = t.basis
        this.origin = t.origin
    }

    fun rotated(axis: Vector3, phi: Double): Transform = Transform(Basis(axis, phi), Vector3()) * this

    fun rotateBasis(axis: Vector3, phi: Double) {
        basis.rotate(axis, phi)
    }

    fun lookingAt(target: Vector3, up: Vector3): Transform {
        val t = this
        t.setLookAt(origin, target, up)
        return t
    }

    fun setLookAt(eye: Vector3, target: Vector3, up: Vector3) { //TODO: Refactor
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

    fun interpolateWith(transform: Transform, c: Double): Transform {
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

    fun scale(scale: Vector3) {
        basis.scale(scale)
        origin *= scale
    }

    fun scaled(scale: Vector3): Transform {
        val t = this
        t.scale(scale)
        return t
    }

    fun scaleBasis(scale: Vector3) {
        basis.scale(scale)
    }

    fun translate(translation: Vector3) {
        for (i in 0..2) origin[i] += basis[i].dot(translation)
    }

    fun translate(tx: Double, ty: Double, tz: Double) = translate(Vector3(tx, ty, tz))

    fun translated(translation: Vector3): Transform {
        val t = this
        t.translate(translation)
        return t
    }

    fun orthonormalize() = basis.orthonormalize()

    fun orthonormalized(): Transform {
        val t = this
        t.orthonormalize()
        return t
    }

    override fun equals(other: Any?): Boolean {
        return when (other) {
            is Transform -> basis == other.basis && origin == other.origin
            else -> false
        }
    }

    operator fun times(transform: Transform): Transform {
        val t = this
        t.origin = xform(transform.origin)
        t.basis *= transform.basis
        return t
    }

    override fun toString(): String = "$basis - $origin"

    override fun hashCode(): Int {
        var result = basis.hashCode()
        result = 31 * result + origin.hashCode()
        return result
    }
}