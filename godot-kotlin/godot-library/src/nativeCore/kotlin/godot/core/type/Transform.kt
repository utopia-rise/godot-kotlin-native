@file:Suppress("unused", "MemberVisibilityCanBePrivate")

package godot.core

import godot.gdnative.godot_transform
import godot.gdnative.godot_transform2d_layout
import godot.gdnative.godot_transform_layout
import kotlinx.cinterop.*

class Transform(var basis: Basis, var origin: Vector3 = Vector3()) : CoreType {
    //CONSTANTS
    companion object {
        inline val IDENTITY: Transform
            get() = Transform(Basis(1, 0, 0, 0, 1, 0, 0, 0, 1), Vector3(0, 0, 0))
        inline val FLIP_X: Transform
            get() = Transform(Basis(-1, 0, 0, 0, 1, 0, 0, 0, 1), Vector3(0, 0, 0))
        inline val FLIP_Y: Transform
            get() = Transform(Basis(1, 0, 0, 0, -1, 0, 0, 0, 1), Vector3(0, 0, 0))
        inline val FLIP_Z: Transform
            get() = Transform(Basis(1, 0, 0, 0, 1, 0, 0, 0, -1), Vector3(0, 0, 0))
    }


    //CONSTRUCTOR
    constructor(
        xx: Number,
        xy: Number,
        xz: Number,
        yx: Number,
        yy: Number,
        yz: Number,
        zx: Number,
        zy: Number,
        zz: Number,
        tx: Number,
        ty: Number,
        tz: Number
    ) :
        this(Basis(xx, xy, xz, yx, yy, yz, zx, zy, zz), Vector3(tx, ty, tz))

    constructor(x: Vector3, y: Vector3, z: Vector3, origin: Vector3) :
        this(Basis(x, y, z), origin)

    constructor(from: Quat) :
        this(Basis(from))

    constructor() :
        this(Basis(1, 0, 0, 0, 1, 0, 0, 0, 1), Vector3(0, 0, 0))

    internal constructor(native: CValue<godot_transform>) : this() {
        basis = Basis()
        origin = Vector3()

        memScoped {
            this@Transform.setRawMemory(native.ptr)
        }
    }

    internal constructor(mem: COpaquePointer) : this() {
        basis = Basis()
        origin = Vector3()

        this.setRawMemory(mem)
    }

    //INTEROP
    override fun getRawMemory(memScope: MemScope): COpaquePointer {
        val value = cValue<godot_transform_layout> {
            basis.x.x = this@Transform.basis.x.x.toFloat()
            basis.x.y = this@Transform.basis.x.y.toFloat()
            basis.x.z = this@Transform.basis.x.z.toFloat()
            basis.y.x = this@Transform.basis.y.x.toFloat()
            basis.y.y = this@Transform.basis.y.y.toFloat()
            basis.y.z = this@Transform.basis.y.z.toFloat()
            basis.z.x = this@Transform.basis.z.x.toFloat()
            basis.z.y = this@Transform.basis.z.y.toFloat()
            basis.z.z = this@Transform.basis.z.z.toFloat()
            origin.x = this@Transform.origin.x.toFloat()
            origin.y = this@Transform.origin.y.toFloat()
            origin.z = this@Transform.origin.z.toFloat()
        }
        return value.getPointer(memScope)
    }

    override fun setRawMemory(mem: COpaquePointer) {
        val value = mem.reinterpret<godot_transform_layout>().pointed
        basis.setRawMemory(value.basis.ptr)
        origin.setRawMemory(value.origin.ptr)
    }


    //API
    /**
     * Returns the inverse of the transform, under the assumption that the transformation is composed of rotation, scaling and translation.
     */
    fun affineInverse(): Transform {
        val ret = Transform(this.basis, this.origin)
        ret.affineInvert()
        return ret
    }

    internal fun affineInvert() {
        basis.invert()
        origin = basis.xform(-origin)
    }

    /**
     * Interpolates the transform to other Transform by weight amount (0-1).
     */
    fun interpolateWith(transform: Transform, c: RealT): Transform {
        val srcScale = basis.getScale()
        val srcRot = Quat(basis)
        val srcLoc = origin

        val dstScale = transform.basis.getScale()
        val dstRot = Quat(transform.basis)
        val dstLoc = transform.origin

        val dst = Transform()
        dst.basis = Basis(srcRot.slerp(dstRot, c))
        dst.basis.scale(srcScale.linearInterpolate(dstScale, c))
        dst.origin = srcLoc.linearInterpolate(dstLoc, c)

        return dst
    }

    /**
     * Returns the inverse of the transform, under the assumption that the transformation is composed of rotation and translation (no scaling, use affine_inverse for transforms with scaling).
     */
    fun inverse(): Transform {
        val ret = Transform(this.basis, this.origin)
        ret.invert()
        return ret
    }

    internal fun invert() {
        basis.transpose()
        origin = basis.xform(-origin)
    }

    /**
     * Returns true if this transform and transform are approximately equal, by calling is_equal_approx on each component.
     */
    fun isEqualApprox(transform: Transform): Boolean {
        return transform.basis.isEqualApprox(this.basis) && transform.origin.isEqualApprox(this.origin)
    }

    /**
     * Returns a copy of the transform rotated such that its -Z axis points towards the target position.
     * The transform will first be rotated around the given up vector, and then fully aligned to the target by a further rotation around an axis perpendicular to both the target and up vectors.
     * Operations take place in global space.
     */
    fun lookingAt(target: Vector3, up: Vector3): Transform {
        val t = Transform(this.basis, this.origin)
        t.setLookAt(origin, target, up)
        return t
    }

    internal fun setLookAt(eye: Vector3, target: Vector3, up: Vector3) {
        val x: Vector3
        var y = up
        val z = eye - target

        z.normalize()
        x = y.cross(z)
        y = z.cross(x)
        x.normalize()
        y.normalize()

        basis.x = x
        basis.y = y
        basis.z = z
        origin = eye
    }

    /**
     * Returns the transform with the basis orthogonal (90 degrees), and normalized axis vectors.
     */
    fun orthonormalized(): Transform {
        val t = Transform(this.basis, this.origin)
        t.orthonormalize()
        return t
    }

    internal fun orthonormalize() {
        basis.orthonormalize()
    }


    /**
     * Rotates the transform around the given axis by the given angle (in radians), using matrix multiplication. The axis must be a normalized vector.
     */
    fun rotated(axis: Vector3, phi: RealT): Transform {
        return Transform(Basis(axis, phi), Vector3()) * this
    }

    internal fun rotate(axis: Vector3, phi: RealT) {
        val t = rotated(axis, phi)
        this.basis = t.basis
        this.origin = t.origin
    }

    /**
     * Scales basis and origin of the transform by the given scale factor, using matrix multiplication.
     */
    fun scaled(scale: Vector3): Transform {
        val t = Transform(this.basis, this.origin)
        t.scale(scale)
        return t
    }

    fun scale(scale: Vector3) {
        basis.scale(scale)
        origin *= scale
    }

    /**
     * Translates the transform by the given offset, relative to the transform’s basis vectors.
     * Unlike rotated and scaled, this does not use matrix multiplication.
     */
    fun translated(translation: Vector3): Transform {
        val t = Transform(this.basis, this.origin)
        t.translate(translation)
        return t
    }

    fun translate(translation: Vector3) {
        origin.x += basis.x.dot(translation)
        origin.y += basis.y.dot(translation)
        origin.z += basis.z.dot(translation)
    }

    /**
     * Transforms the given Vector3 by this transform.
     */
    fun xform(vector: Vector3): Vector3 =
        Vector3(
            basis[0].dot(vector) + origin.x,
            basis[1].dot(vector) + origin.y,
            basis[2].dot(vector) + origin.z
        )

    /**
     * Transforms the given AABB by this transform.
     */
    fun xform(aabb: AABB): AABB {
        val x = basis.x * aabb.size.x
        val y = basis.y * aabb.size.y
        val z = basis.z * aabb.size.z
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

    /**
     * Transforms the given Plane by this transform.
     */
    fun xform(plane: Plane): Plane {
        var point = plane.normal * plane.d
        var pointDir = point + plane.normal
        point = xform(point)
        pointDir = xform(pointDir)

        val normal = pointDir - point
        normal.normalize()

        return Plane(normal, normal.dot(point))
    }

    /**
     * Inverse-transforms the given Vector3 by this transform.
     */
    fun xformInv(vector: Vector3): Vector3 {
        val v = vector - origin
        return Vector3(
            (basis[0][0] * v.x) + (basis[1][0] * v.y) + (basis[2][0] * v.z),
            (basis[0][1] * v.x) + (basis[1][1] * v.y) + (basis[2][1] * v.z),
            (basis[0][2] * v.x) + (basis[1][2] * v.y) + (basis[2][2] * v.z)
        )
    }

    /**
     * Inverse-transforms the given Plane by this transform.
     */
    fun xformInv(plane: Plane): Plane {
        var point = plane.normal * plane.d
        var pointDir = point + plane.normal
        point = xformInv(point)
        pointDir = xformInv(pointDir)

        val normal = pointDir - point
        normal.normalize()

        return Plane(normal, normal.dot(point))
    }

    /**
     * Inverse-transforms the given AABB by this transform.
     */
    fun xformInv(aabb: AABB): AABB {
        val vertices = arrayOf(
            Vector3(aabb.position.x + aabb.size.x, aabb.position.y + aabb.size.y, aabb.position.z + aabb.size.z),
            Vector3(aabb.position.x + aabb.size.x, aabb.position.y + aabb.size.y, aabb.position.z),
            Vector3(aabb.position.x + aabb.size.x, aabb.position.y, aabb.position.z + aabb.size.z),
            Vector3(aabb.position.x + aabb.size.x, aabb.position.y, aabb.position.z),
            Vector3(aabb.position.x, aabb.position.y + aabb.size.y, aabb.position.z + aabb.size.z),
            Vector3(aabb.position.x, aabb.position.y + aabb.size.y, aabb.position.z),
            Vector3(aabb.position.x, aabb.position.y, aabb.position.z + aabb.size.z),
            Vector3(aabb.position.x, aabb.position.y, aabb.position.z)
        )

        val ret = AABB()
        ret.position = xformInv(vertices[0])
        for (i in 1..7)
            ret.expandTo(xformInv(vertices[i]))

        return ret
    }


    //UTILITIES
    override fun toVariant() = Variant(this)

    operator fun times(transform: Transform): Transform {
        val t = this
        t.origin = xform(transform.origin)
        t.basis *= transform.basis
        return t
    }

    override fun equals(other: Any?): Boolean {
        return when (other) {
            is Transform -> basis == other.basis && origin == other.origin
            else -> false
        }
    }

    override fun toString(): String {
        return "$basis - $origin"
    }

    override fun hashCode(): Int {
        var result = basis.hashCode()
        result = 31 * result + origin.hashCode()
        return result
    }
}
