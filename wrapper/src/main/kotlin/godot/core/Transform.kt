package kotlin.godot.core

import godot.godot_transform
import kotlinx.cinterop.*


class Transform: CoreType {

    lateinit var basis: Basis
    lateinit var origin: Vector3

    constructor(basis: Basis, origin: Vector3 = Vector3()) {
        this.basis = basis
        this.origin = origin
    }

    constructor(xx: Number, xy: Number, xz: Number, yx: Number, yy: Number, yz: Number, zx: Number, zy: Number, zz: Number, tx: Number, ty: Number, tz: Number):
            this(Basis(Vector3(xx,xy,xz), Vector3(yx,yy,yz), Vector3(zx,zy,zz)), Vector3(tx,ty,tz))

    constructor()

    internal constructor(native: CValue<godot_transform>) {
        memScoped {
            this@Transform.setRawMemory(native.ptr)
        }
    }

    internal constructor(mem: COpaquePointer) {
        this.setRawMemory(mem)
    }


    override fun getRawMemory(memScope: MemScope): COpaquePointer {
        return cValuesOf(basis[0][0], basis[0][1], basis[0][2], basis[1][0],
                basis[1][1],basis[1][2],basis[2][0],basis[2][1],
                basis[2][2], origin[0], origin[1], origin[2]).getPointer(memScope)
    }

    override fun setRawMemory(mem: COpaquePointer) {
        val arr = mem.reinterpret<FloatVar>()
        basis[0][0] = arr[0]
        basis[0][1] = arr[1]
        basis[0][2] = arr[2]
        basis[1][0] = arr[3]
        basis[1][1] = arr[4]
        basis[1][2] = arr[5]
        basis[2][0] = arr[6]
        basis[2][1] = arr[7]
        basis[2][2] = arr[8]
        origin[0] = arr[9]
        origin[1] = arr[10]
        origin[2] = arr[11]
    }

    fun inverseXform(t: Transform): Transform {
        val v = t.origin - origin
        return Transform(basis.transposeXform(t.basis), basis.xform(v))
    }

    fun set(xx: Number, xy: Number, xz: Number, yx: Number, yy: Number, yz: Number, zx: Number, zy: Number, zz: Number, tx: Number, ty: Number, tz: Number) {
        basis[0][0] = xx.toFloat()
        basis[0][1] = xy.toFloat()
        basis[0][2] = xz.toFloat()
        basis[1][0] = yx.toFloat()
        basis[1][1] = yy.toFloat()
        basis[1][2] = yz.toFloat()
        basis[2][0] = zx.toFloat()
        basis[2][1] = zy.toFloat()
        basis[2][2] = zz.toFloat()
        origin[0] = tx.toFloat()
        origin[1] = ty.toFloat()
        origin[2] = tz.toFloat()
    }

    fun xform(vector: Vector3): Vector3 =
            Vector3(basis[0].dot(vector)+origin.x,
                    basis[1].dot(vector)+origin.y,
                    basis[2].dot(vector)+origin.z)

    fun xformInv(vector: Vector3): Vector3 {
        val v = vector - origin
        return Vector3(
                (basis[0][0]*v.x ) + ( basis[1][0]*v.y ) + ( basis[2][0]*v.z ),
                (basis[0][1]*v.x ) + ( basis[1][1]*v.y ) + ( basis[2][1]*v.z ),
                (basis[0][2]*v.x ) + ( basis[1][2]*v.y ) + ( basis[2][2]*v.z )
        )
    }

    fun xform(plane: Plane): Plane {
        var point = plane.normal * plane.d
        var pointDir = point + plane.normal
        point = xform(point)
        pointDir = xform(pointDir)

        val normal = pointDir - point
        normal.normalize()

        return Plane( normal, normal.dot(point) )
    }

    fun xformInv(plane: Plane): Plane {
        var point = plane.normal * plane.d
        var pointDir = point + plane.normal
        point = xformInv(point)
        pointDir = xformInv(pointDir)

        val normal = pointDir - point
        normal.normalize()

        return Plane( normal, normal.dot(point) )
    }

    fun xform(aabb: AABB): AABB {
        val x = basis.getAxis(0) * aabb.size.x
        val y = basis.getAxis(1) * aabb.size.y
        val z = basis.getAxis(2) * aabb.size.z
        val pos = xform( aabb.position )

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
                arrayOf(Vector3(aabb.position.x+aabb.size.x,	aabb.position.y+aabb.size.y,	aabb.position.z+aabb.size.z),
                        Vector3(aabb.position.x+aabb.size.x,	aabb.position.y+aabb.size.y,	aabb.position.z),
                        Vector3(aabb.position.x+aabb.size.x,	aabb.position.y,		aabb.position.z+aabb.size.z),
                        Vector3(aabb.position.x+aabb.size.x,	aabb.position.y,		aabb.position.z),
                        Vector3(aabb.position.x,	aabb.position.y+aabb.size.y,	aabb.position.z+aabb.size.z),
                        Vector3(aabb.position.x,	aabb.position.y+aabb.size.y,	aabb.position.z),
                        Vector3(aabb.position.x,	aabb.position.y,		aabb.position.z+aabb.size.z),
                        Vector3(aabb.position.x,	aabb.position.y,		aabb.position.z))

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

    fun rotate(axis: Vector3, phi: Float) {
        val t = rotated(axis, phi)
        this.basis = t.basis
        this.origin = t.origin
    }

    fun rotated(axis: Vector3, phi: Float): Transform =
            Transform(Basis( axis, phi ), Vector3()) * this

    fun rotateBasis(axis: Vector3, phi: Float) {
        basis.rotate(axis, phi)
    }

    fun lookingAt(target: Vector3, up: Vector3): Transform {
        val t = this
        t.setLookAt(origin, target, up)
        return t
    }

    fun setLookAt(eye: Vector3, target: Vector3, up: Vector3) { //TODO: Refactor
        var x: Vector3
        var y: Vector3
        var z: Vector3

        z = eye - target
        z.normalize()
        y = up
        x = y.cross(z)
        y = z.cross(x)
        x.normalize()
        y.normalize()

        basis.setAxis(0, x)
        basis.setAxis(1, y)
        basis.setAxis(2, z)
        origin = eye
    }

    fun interpolateWith(transform: Transform, c: Float): Transform {
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
        for (i in 0..2)
            origin[i] += basis[i].dot(translation)
    }

    fun translate(tx: Float, ty: Float, tz: Float) =
            translate(Vector3(tx, ty, tz))

    fun translated(translation: Vector3): Transform {
        val t = this
        t.translate(translation)
        return t
    }

    fun orthonormalize() =
            basis.orthonormalize()

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

    override fun toString(): String {
        return basis.toString() + " - " + origin.toString()
    }

    external override fun hashCode(): Int {
        var result = basis.hashCode()
        result = 31 * result + origin.hashCode()
        return result
    }
}