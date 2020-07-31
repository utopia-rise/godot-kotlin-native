@file:Suppress("unused", "MemberVisibilityCanBePrivate")

package godot.core

import godot.gdnative.godot_transform2d
import godot.gdnative.godot_transform2d_layout
import godot.internal.type.*
import kotlinx.cinterop.*
import kotlin.math.acos
import kotlin.math.atan2
import kotlin.math.cos
import kotlin.math.sin

class Transform2D(
    p_x: Vector2,
    p_y: Vector2,
    p_origin: Vector2
) : CoreType {

    @PublishedApi
    internal var _x = Vector2(p_x)

    @PublishedApi
    internal var _y = Vector2(p_y)

    @PublishedApi
    internal var _origin = Vector2(p_origin)

    //PROPERTIES
    /** Return a copy of the x Vector2
     * Warning: Writing x.x = 2 will only modify a copy, not the actual object.
     * To modify it, use x().
     * */
    var x
        get() = Vector2(_x)
        set(value) {
            _x = Vector2(value)
        }

    inline fun <T> x(block: Vector2.() -> T): T {
        return _x.block()
    }

    /** Return a copy of the y Vector2
     * Warning: Writing y.x = 2 will only modify a copy, not the actual object.
     * To modify it, use y().
     * */
    var y
        get() = Vector2(_y)
        set(value) {
            _y = Vector2(value)
        }

    inline fun <T> y(block: Vector2.() -> T): T {
        return _y.block()
    }

    /** Return a copy of the origin Vector2
     * Warning: Writing origin.x = 2 will only modify a copy, not the actual object.
     * To modify it, use origin().
     * */
    var origin
        get() = Vector2(_origin)
        set(value) {
            _origin = Vector2(value)
        }

    inline fun <T> origin(block: Vector2.() -> T): T {
        return _origin.block()
    }


    //CONSTANTS
    companion object {
        inline val IDENTITY: Transform2D
            get() = Transform2D(1, 0, 0, 1, 0, 0)
        inline val FLIP_X: Transform2D
            get() = Transform2D(-1, 0, 0, 1, 0, 0)
        inline val FLIP_Y: Transform2D
            get() = Transform2D(1, 0, 0, -1, 0, 0)
    }


    //CONSTRUCTOR
    constructor() : this(Vector2(1, 0), Vector2(0, 1), Vector2())

    constructor(other: Transform2D) : this(other._x, other._y, other._origin)

    constructor(xx: Number, xy: Number, yx: Number, yy: Number, ox: Number, oy: Number) : this(
        Vector2(xx.toGodotReal(), xy.toGodotReal()),
        Vector2(yx.toGodotReal(), yy.toGodotReal()),
        Vector2(ox.toGodotReal(), oy.toGodotReal())
    )

    constructor(rot: Number, pos: Vector2) : this(
        Vector2(cos(rot.toGodotReal()), sin(rot.toGodotReal())),
        Vector2(-sin(rot.toGodotReal()), cos(rot.toGodotReal())),
        pos
    )


    internal constructor(native: CValue<godot_transform2d>) : this() {
        memScoped {
            this@Transform2D.setRawMemory(native.ptr)
        }
    }

    internal constructor(mem: COpaquePointer) : this() {
        this.setRawMemory(mem)
    }

    //INTEROP
    override fun getRawMemory(memScope: MemScope): COpaquePointer {
        val value = cValue<godot_transform2d_layout> {
            x.x = this@Transform2D._x._x.toGodotReal()
            x.y = this@Transform2D._x._y.toGodotReal()
            y.x = this@Transform2D._y._x.toGodotReal()
            y.y = this@Transform2D._y._y.toGodotReal()
            origin.x = this@Transform2D._origin._x.toGodotReal()
            origin.y = this@Transform2D._origin._y.toGodotReal()
        }
        return value.getPointer(memScope)
    }

    override fun setRawMemory(mem: COpaquePointer) {
        val value = mem.reinterpret<godot_transform2d_layout>().pointed
        _x.setRawMemory(value.x.ptr)
        _x.setRawMemory(value.y.ptr)
        _x.setRawMemory(value.origin.ptr)
    }


    //API
    /**
     * Returns the inverse of the matrix.
     */
    fun affineInverse(): Transform2D {
        val inv = Transform2D(this._x, this._y, this._origin)
        inv.affineInvert()
        return inv
    }

    /**
     * Returns the inverse of the matrix.
     */
    internal fun affineInvert() {
        val det = basisDeterminant().toGodotReal()
        if (isEqualApprox(det, 0.0f)) {
            Godot.printError("determinant == 0", "affineInvert()", "Transform2D.kt", 84)
            return
        }
        val idet = -1.0f / det
        val copy = _x._x
        _x._x = _y._y
        _y._y = copy
        this._x *= Vector2(idet, -idet)
        this._y *= Vector2(-idet, idet)

        this._origin = basisXform(-this._origin)
    }

    private fun basisDeterminant(): KotlinReal {
        return (this._x._x * this._y._y - this._x._y * this._y._x).toKotlinReal()
    }

    /**
     * Transforms the given vector by this transform’s basis (no translation).
     */
    fun basisXform(v: Vector2) = Vector2(tdotx(v), tdoty(v))

    /**
     * Inverse-transforms the given vector by this transform’s basis (no translation).
     */
    fun basisXformInv(v: Vector2) = Vector2(this._x.dot(v), this._y.dot(v))

    /**
     * Returns the transform’s origin (translation).
     */
    fun getOrigin() = this._origin

    /**
     * Returns the transform’s rotation (in radians).
     */
    fun getRotation(): KotlinReal {
        val det = basisDeterminant()
        val m = orthonormalized()
        if (det < 0) {
            m.scaleBasis(Vector2(-1, -1))
        }
        return atan2(m._x._y, m._x._x).toKotlinReal()
    }

    /**
     * Returns the scale.
     */
    fun getScale(): Vector2 {
        val detSign: KotlinReal = if (basisDeterminant() > 0.0) 1.0 else -1.0
        return detSign * Vector2(this._x.length(), this._y.length())
    }

    /**
     * Returns a transform interpolated between this transform and another by a given weight (0-1).
     */
    fun interpolateWith(transform: Transform2D, c: KotlinReal): Transform2D {
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

        val res = Transform2D(atan2(v._y, v._x), (Vector2::linearInterpolate)(p1, p2, c))
        res.scaleBasis((Vector2::linearInterpolate)(s1, s2, c))
        return res
    }

    /**
     * Returns the inverse of the transform, under the assumption that the transformation is composed of rotation and translation (no scaling, use affine_inverse for transforms with scaling).
     */
    fun inverse(): Transform2D {
        val inv = Transform2D(this._x, this._y, this._origin)
        inv.invert()
        return inv
    }

    internal fun invert() {
        val copy = _x._y
        _x._y = _y._x
        _y._x = copy
        _origin = basisXform(-_origin)
    }

    /**
     * Returns true if this transform and transform are approximately equal, by calling is_equal_approx on each component.
     */
    fun isEqualApprox(transform: Transform2D): Boolean {
        return transform._x.isEqualApprox(this._x)
            && transform._y.isEqualApprox(this._y)
            && transform._origin.isEqualApprox(this._origin)
    }

    /**
     * Returns the transform with the basis orthogonal (90 degrees), and normalized axis vectors.
     */
    fun orthonormalized(): Transform2D {
        val on = Transform2D(this._x, this._y, this._origin)
        on.orthonormalize()
        return on
    }

    internal fun orthonormalize() {
        val x = this._x
        var y = this._y

        x.normalize()
        y = (y - x * (x.dot(y)))
        y.normalize()

        this._x = x
        this._y = y
    }

    /**
     * Rotates the transform by the given angle (in radians), using matrix multiplication.
     */
    fun rotated(phi: KotlinReal): Transform2D {
        val copy = Transform2D(this._x, this._y, this._origin)
        copy.rotate(phi)
        return copy
    }

    internal fun rotate(phi: KotlinReal) {
        val transform2D = Transform2D(phi, Vector2()) * this
        this._x = transform2D._x
        this._y = transform2D._y
        this._origin = transform2D._origin
    }

    /**
     * Scales the transform by the given scale factor, using matrix multiplication.
     */
    fun scaled(scale: Vector2): Transform2D {
        val copy = Transform2D(this._x, this._y, this._origin)
        copy.scale(scale)
        return copy
    }

    internal fun scale(scale: Vector2) {
        scaleBasis(scale)
        this._origin *= scale
    }


    /**
     * Translates the transform by the given offset, relative to the transform’s basis vectors.
     * Unlike rotated and scaled, this does not use matrix multiplication.
     */
    fun translated(offset: Vector2): Transform2D {
        val copy = Transform2D(this._x, this._y, this._origin)
        copy.translate(offset)
        return copy
    }

    internal fun translate(offset: Vector2) {
        this._origin += offset
    }

    private fun scaleBasis(scale: Vector2) {
        _x._x *= scale._x
        _x._y *= scale._y
        this._y._x *= scale._x
        _y._y *= scale._y
    }

    /**
     * Transforms the given Vector2 by this transform.
     */
    fun xform(v: Vector2): Vector2 {
        return Vector2(tdotx(v), tdoty(v)) + this._origin
    }

    /**
     * Transforms the given Rect2 by this transform.
     */
    fun xform(rect: Rect2): Rect2 {
        val x = this._x * rect._size._x
        val y = this._y * rect._size._y
        val pos = xform(rect._position)

        val newRect = Rect2()
        newRect._position = pos
        newRect.expandTo(pos + x)
        newRect.expandTo(pos + y)
        newRect.expandTo(pos + x + y)
        return newRect
    }

    /**
     * Inverse-transforms the given Vector2 by this transform.
     */
    fun xformInv(vec: Vector2): Vector2 {
        val v = vec - this._origin
        return Vector2(this._x.dot(v), this._y.dot(v))
    }

    /**
     * Inverse-transforms the given Rect2 by this transform.
     */
    fun xformInv(rect: Rect2): Rect2 {
        val ends = arrayOf(
            xformInv(rect._position),
            xformInv(Vector2(rect._position._x, rect._position._y + rect._size._y)),
            xformInv(Vector2(rect._position._x + rect._size._x, rect._position._y + rect._size._y)),
            xformInv(Vector2(rect._position._x + rect._size._x, rect._position._y))
        )

        val newRect = Rect2()
        newRect._position = ends[0]
        newRect.expandTo(ends[1])
        newRect.expandTo(ends[2])
        newRect.expandTo(ends[3])

        return newRect
    }

    private fun tdotx(v: Vector2): KotlinReal {
        return (_x._x * v._x + _y._x * v._y).toKotlinReal()
    }

    private fun tdoty(v: Vector2): KotlinReal {
        return (_x._y * v._x + _y._y * v._y).toKotlinReal()
    }


    //UTILITIES
    override fun toVariant() = Variant(this)

    operator fun times(other: Transform2D): Transform2D {
        val origin = xform(other._origin)
        val x0 = tdotx(other._x)
        val x1 = tdoty(other._x)
        val y0 = tdotx(other._y)
        val y1 = tdoty(other._y)

        return Transform2D(x0, x1, y0, y1, origin._x, origin._y)
    }

    override fun toString(): String {
        return "${this._x}, ${this._y}, ${this._origin}"
    }

    override fun equals(other: Any?): Boolean {
        return when (other) {
            is Transform2D -> this._x == other._x && this._y == other._y && this._origin == other._origin
            else -> false
        }
    }

    override fun hashCode(): Int {
        var result = _x.hashCode()
        result = 31 * result + _y.hashCode()
        result = 31 * result + _origin.hashCode()
        return result
    }

}
