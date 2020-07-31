@file:Suppress("unused", "MemberVisibilityCanBePrivate")

package godot.core

import godot.gdnative.godot_transform
import godot.gdnative.godot_transform_layout
import godot.internal.type.CoreType
import godot.internal.type.KotlinReal
import godot.internal.type.toGodotReal
import kotlinx.cinterop.*

class Transform(
    p_basis: Basis,
    p_origin: Vector3 = Vector3()
) : CoreType {

    @PublishedApi
    internal var _basis = Basis(p_basis)

    @PublishedApi
    internal var _origin = Vector3(p_origin)


    //PROPERTIES
    /** Return a copy of the basis Basis.
     * Warning: Writing basis.x = 2 will only modify a copy, not the actual object.
     * To modify it, use basis().
     * */
    var basis
        get() = Basis(_basis)
        set(value) {
            _basis = Basis(value)
        }

    inline fun <T> basis(block: Basis.() -> T): T {
        return _basis.block()
    }

    /** Return a copy of the origin Vector3
     * Warning: Writing origin.x = 2 will only modify a copy, not the actual object.
     * To modify it, use origin().
     * */
    var origin
        get() = Vector3(_origin)
        set(value) {
            _origin = Vector3(value)
        }

    inline fun <T> origin(block: Vector3.() -> T): T {
        return _origin.block()
    }


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
    constructor() :
        this(Basis(), Vector3(0, 0, 0))

    constructor(other: Transform) :
        this(other._basis, other._origin)

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

    internal constructor(native: CValue<godot_transform>) : this() {
        _basis = Basis()
        _origin = Vector3()

        memScoped {
            this@Transform._setRawMemory(native.ptr)
        }
    }

    internal constructor(mem: COpaquePointer) : this() {
        _basis = Basis()
        _origin = Vector3()

        this._setRawMemory(mem)
    }

    //INTEROP
    override fun _getRawMemory(memScope: MemScope): COpaquePointer {
        val value = cValue<godot_transform_layout> {
            basis.x.x = this@Transform._basis._x._x.toGodotReal()
            basis.x.y = this@Transform._basis._x._y.toGodotReal()
            basis.x.z = this@Transform._basis._x._z.toGodotReal()
            basis.y.x = this@Transform._basis._y._x.toGodotReal()
            basis.y.y = this@Transform._basis._y._y.toGodotReal()
            basis.y.z = this@Transform._basis._y._z.toGodotReal()
            basis.z.x = this@Transform._basis._z._x.toGodotReal()
            basis.z.y = this@Transform._basis._z._y.toGodotReal()
            basis.z.z = this@Transform._basis._z._z.toGodotReal()
            origin.x = this@Transform._origin._x.toGodotReal()
            origin.y = this@Transform._origin._y.toGodotReal()
            origin.z = this@Transform._origin._z.toGodotReal()
        }
        return value.getPointer(memScope)
    }

    override fun _setRawMemory(mem: COpaquePointer) {
        val value = mem.reinterpret<godot_transform_layout>().pointed
        _basis._setRawMemory(value.basis.ptr)
        _origin._setRawMemory(value.origin.ptr)
    }


    //API
    /**
     * Returns the inverse of the transform, under the assumption that the transformation is composed of rotation, scaling and translation.
     */
    fun affineInverse(): Transform {
        val ret = Transform(this._basis, this._origin)
        ret.affineInvert()
        return ret
    }

    internal fun affineInvert() {
        _basis.invert()
        _origin = _basis.xform(-_origin)
    }

    /**
     * Interpolates the transform to other Transform by weight amount (0-1).
     */
    fun interpolateWith(transform: Transform, c: KotlinReal): Transform {
        val srcScale = _basis.getScale()
        val srcRot = Quat(_basis)
        val srcLoc = _origin

        val dstScale = transform._basis.getScale()
        val dstRot = Quat(transform._basis)
        val dstLoc = transform._origin

        val dst = Transform()
        dst._basis = Basis(srcRot.slerp(dstRot, c))
        dst._basis.scale(srcScale.linearInterpolate(dstScale, c))
        dst._origin = srcLoc.linearInterpolate(dstLoc, c)

        return dst
    }

    /**
     * Returns the inverse of the transform, under the assumption that the transformation is composed of rotation and translation (no scaling, use affine_inverse for transforms with scaling).
     */
    fun inverse(): Transform {
        val ret = Transform(this._basis, this._origin)
        ret.invert()
        return ret
    }

    internal fun invert() {
        _basis.transpose()
        _origin = _basis.xform(-_origin)
    }

    /**
     * Returns true if this transform and transform are approximately equal, by calling is_equal_approx on each component.
     */
    fun isEqualApprox(transform: Transform): Boolean {
        return transform._basis.isEqualApprox(this._basis) && transform._origin.isEqualApprox(this._origin)
    }

    /**
     * Returns a copy of the transform rotated such that its -Z axis points towards the target position.
     * The transform will first be rotated around the given up vector, and then fully aligned to the target by a further rotation around an axis perpendicular to both the target and up vectors.
     * Operations take place in global space.
     */
    fun lookingAt(target: Vector3, up: Vector3): Transform {
        val t = Transform(this._basis, this._origin)
        t.setLookAt(_origin, target, up)
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

        // on cpp, this calls basis.set(x, y, z)
        // which basically does:
        //  setAxis(0, x)
        //  setAxis(1, y)
        //  setAxis(2, z)
        _basis.set(x, y, z)
        _origin = Vector3(eye)
    }

    /**
     * Returns the transform with the basis orthogonal (90 degrees), and normalized axis vectors.
     */
    fun orthonormalized(): Transform {
        val t = Transform(this._basis, this._origin)
        t.orthonormalize()
        return t
    }

    internal fun orthonormalize() {
        _basis.orthonormalize()
    }


    /**
     * Rotates the transform around the given axis by the given angle (in radians), using matrix multiplication. The axis must be a normalized vector.
     */
    fun rotated(axis: Vector3, phi: KotlinReal): Transform {
        return Transform(Basis(axis, phi), Vector3()) * this
    }

    internal fun rotate(axis: Vector3, phi: KotlinReal) {
        val t = rotated(axis, phi)
        this._basis = t._basis
        this._origin = t._origin
    }

    /**
     * Scales basis and origin of the transform by the given scale factor, using matrix multiplication.
     */
    fun scaled(scale: Vector3): Transform {
        val t = Transform(this._basis, this._origin)
        t.scale(scale)
        return t
    }

    fun scale(scale: Vector3) {
        _basis.scale(scale)
        _origin *= scale
    }

    /**
     * Translates the transform by the given offset, relative to the transform’s basis vectors.
     * Unlike rotated and scaled, this does not use matrix multiplication.
     */
    fun translated(translation: Vector3): Transform {
        val t = Transform(this._basis, this._origin)
        t.translate(translation)
        return t
    }

    fun translate(translation: Vector3) {
        _origin._x += _basis._x.dot(translation).toGodotReal()
        _origin._y += _basis._y.dot(translation).toGodotReal()
        _origin._z += _basis._z.dot(translation).toGodotReal()
    }

    /**
     * Transforms the given Vector3 by this transform.
     */
    fun xform(vector: Vector3): Vector3 =
        Vector3(
            _basis._x.dot(vector) + _origin._x,
            _basis._y.dot(vector) + _origin._y,
            _basis._z.dot(vector) + _origin._z
        )

    /**
     * Transforms the given AABB by this transform.
     */
    fun xform(aabb: AABB): AABB {
        val x = _basis._x * aabb._size._x
        val y = _basis._y * aabb._size._y
        val z = _basis._z * aabb._size._z
        val pos = xform(aabb._position)

        val newAabb = AABB()
        newAabb._position = pos
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
        var point = plane._normal * plane._d
        var pointDir = point + plane._normal
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
        val v = vector - _origin
        return Vector3(
            (_basis._x._x * v._x) + (_basis._y._x * v._y) + (_basis._z._x * v._z),
            (_basis._x._y * v._x) + (_basis._y._y * v._y) + (_basis._z._y * v._z),
            (_basis._x._z * v._x) + (_basis._y._z * v._y) + (_basis._z._z * v._z)
        )
    }

    /**
     * Inverse-transforms the given Plane by this transform.
     */
    fun xformInv(plane: Plane): Plane {
        var point = plane._normal * plane._d
        var pointDir = point + plane._normal
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
            Vector3(
                aabb._position._x + aabb._size._x,
                aabb._position._y + aabb._size._y,
                aabb._position._z + aabb._size._z
            ),
            Vector3(aabb._position._x + aabb._size._x, aabb._position._y + aabb._size._y, aabb._position._z),
            Vector3(aabb._position._x + aabb._size._x, aabb._position._y, aabb._position._z + aabb._size._z),
            Vector3(aabb._position._x + aabb._size._x, aabb._position._y, aabb._position._z),
            Vector3(aabb._position._x, aabb._position._y + aabb._size._y, aabb._position._z + aabb._size._z),
            Vector3(aabb._position._x, aabb._position._y + aabb._size._y, aabb._position._z),
            Vector3(aabb._position._x, aabb._position._y, aabb._position._z + aabb._size._z),
            Vector3(aabb._position._x, aabb._position._y, aabb._position._z)
        )

        val ret = AABB()
        ret._position = xformInv(vertices[0])
        for (i in 1..7)
            ret.expandTo(xformInv(vertices[i]))

        return ret
    }


    //UTILITIES
    override fun _toVariant() = Variant(this)

    operator fun times(transform: Transform): Transform {
        val t = this
        t._origin = xform(transform._origin)
        t._basis *= transform._basis
        return t
    }

    override fun equals(other: Any?): Boolean {
        return when (other) {
            is Transform -> _basis == other._basis && _origin == other._origin
            else -> false
        }
    }

    override fun toString(): String {
        return "$_basis - $_origin"
    }

    override fun hashCode(): Int {
        var result = _basis.hashCode()
        result = 31 * result + _origin.hashCode()
        return result
    }

    /*
     * GDScript related members
     */
    constructor(x: Vector3, y: Vector3, z: Vector3, origin: Vector3) :
        this(Basis(x, y, z), origin)
}
