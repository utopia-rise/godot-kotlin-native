@file:Suppress("unused", "MemberVisibilityCanBePrivate")

package godot.core

import godot.gdnative.godot_transform2d
import godot.gdnative.godot_transform2d_layout
import kotlinx.cinterop.*
import kotlin.math.acos
import kotlin.math.atan2
import kotlin.math.cos
import kotlin.math.sin

class Transform2D(var x: Vector2, var y: Vector2, var origin: Vector2) : CoreType {
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
    constructor(xx: Number, xy: Number, yx: Number, yy: Number, ox: Number, oy: Number): this(
        Vector2(xx.toRealT(), xy.toRealT()),
        Vector2(yx.toRealT(), yy.toRealT()),
        Vector2(ox.toRealT(), oy.toRealT())
    )

    constructor(rot: Number, pos: Vector2): this(
        Vector2(cos(rot.toRealT()), sin(rot.toRealT())),
        Vector2(-sin(rot.toRealT()), cos(rot.toRealT())),
        pos
    )

    constructor() : this(Vector2(1,0), Vector2(0,1), Vector2())

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
            x.x = this@Transform2D.x.x.toFloat()
            x.y = this@Transform2D.x.y.toFloat()
            y.x = this@Transform2D.y.x.toFloat()
            y.y = this@Transform2D.y.y.toFloat()
            origin.x = this@Transform2D.origin.x.toFloat()
            origin.y = this@Transform2D.origin.y.toFloat()
        }
        return value.getPointer(memScope)
    }

    override fun setRawMemory(mem: COpaquePointer) {
        val value = mem.reinterpret<godot_transform2d_layout>().pointed
        x.setRawMemory(value.x.ptr)
        x.setRawMemory(value.y.ptr)
        x.setRawMemory(value.origin.ptr)
    }


    //API
    /**
     * Returns the inverse of the matrix.
     */
    fun affineInverse(): Transform2D {
        val inv = Transform2D(this.x, this.y, this.origin)
        inv.affineInvert()
        return inv
    }

    /**
     * Returns the inverse of the matrix.
     */
    internal fun affineInvert() {
        val det = basisDeterminant()
        if (det == 0.0) {
            Godot.printError("determinant == 0", "affineInvert()", "Transform2D.kt", 84)
            return
        }
        val idet = - 1.0 / det
        val copy = x.x
        x.x = y.y
        y.y = copy
        this.x *= Vector2(idet,-idet)
        this.y *= Vector2(-idet,idet)

        this.origin = basisXform(-this.origin)
    }

    private fun basisDeterminant(): RealT {
        return this.x.x * this.y.y - this.x.y * this.y.x
    }

    /**
     * Transforms the given vector by this transform’s basis (no translation).
     */
    fun basisXform(v: Vector2) = Vector2(tdotx(v), tdoty(v))

    /**
     * Inverse-transforms the given vector by this transform’s basis (no translation).
     */
    fun basisXformInv(v: Vector2) = Vector2(this.x.dot(v), this.y.dot(v))

    /**
     * Returns the transform’s origin (translation).
     */
    fun getOrigin() = this.origin

    /**
     * Returns the transform’s rotation (in radians).
     */
    fun getRotation(): RealT {
        val det = basisDeterminant()
        val m = orthonormalized()
        if (det < 0) {
            m.scaleBasis(Vector2(-1, -1))
        }
        return atan2(m.x.y, m.x.x)
    }

    /**
     * Returns the scale.
     */
    fun getScale(): Vector2 {
        val detSign: RealT = if (basisDeterminant() > 0.0) 1.0 else -1.0
        return detSign * Vector2(this.x.length(), this.y.length())
    }

    /**
     * Returns a transform interpolated between this transform and another by a given weight (0-1).
     */
    fun interpolateWith(transform: Transform2D, c: RealT): Transform2D {
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

    /**
     * Returns the inverse of the transform, under the assumption that the transformation is composed of rotation and translation (no scaling, use affine_inverse for transforms with scaling).
     */
    fun inverse(): Transform2D {
        val inv = Transform2D(this.x, this.y, this.origin)
        inv.invert()
        return inv
    }

    internal fun invert() {
        val copy = x.y
        x.y = y.x
        y.x = copy
        origin = basisXform(-origin)
    }

    /**
     * Returns true if this transform and transform are approximately equal, by calling is_equal_approx on each component.
     */
    fun isEqualApprox(transform: Transform2D): Boolean {
        return transform.x.isEqualApprox(this.x) && transform.y.isEqualApprox(this.y) && transform.origin.isEqualApprox(this.origin)
    }

    /**
     * Returns the transform with the basis orthogonal (90 degrees), and normalized axis vectors.
     */
    fun orthonormalized(): Transform2D {
        val on = Transform2D(this.x, this.y, this.origin)
        on.orthonormalize()
        return on
    }

    internal fun orthonormalize() {
        val x = this.x
        var y = this.y

        x.normalize()
        y = (y - x * (x.dot(y)))
        y.normalize()

        this.x = x
        this.y = y
    }

    /**
     * Rotates the transform by the given angle (in radians), using matrix multiplication.
     */
    fun rotated(phi: RealT): Transform2D {
        val copy = Transform2D(this.x, this.y, this.origin)
        copy.rotate(phi)
        return copy
    }

    internal fun rotate(phi: RealT) {
        val transform2D = Transform2D(phi,Vector2()) * this
        this.x = transform2D.x
        this.y = transform2D.y
        this.origin = transform2D.origin
    }

    /**
     * Scales the transform by the given scale factor, using matrix multiplication.
     */
    fun scaled(scale: Vector2): Transform2D {
        val copy = Transform2D(this.x, this.y, this.origin)
        copy.scale(scale)
        return copy
    }

    internal fun scale(scale: Vector2) {
        scaleBasis(scale)
        this.origin *= scale
    }


    /**
     * Translates the transform by the given offset, relative to the transform’s basis vectors.
     * Unlike rotated and scaled, this does not use matrix multiplication.
     */
    fun translated(offset: Vector2): Transform2D {
        val copy = Transform2D(this.x, this.y, this.origin)
        copy.translate(offset)
        return copy
    }

    internal fun translate(offset: Vector2) {
        this.origin += offset
    }

    private fun scaleBasis(scale: Vector2) {
        x.x *= scale.x
        x.y *= scale.y
        this.y[0] *= scale.x
        y.y *= scale.y
    }

    /**
     * Transforms the given Vector2 by this transform.
     */
    fun xform(v: Vector2): Vector2 {
        return Vector2(tdotx(v), tdoty(v)) + this.origin
    }

    /**
     * Transforms the given Rect2 by this transform.
     */
    fun xform(rect: Rect2): Rect2 {
        val x = this.x * rect.size.x
        val y = this.y * rect.size.y
        val pos = xform(rect.position)

        val newRect = Rect2()
        newRect.position = pos
        newRect.expandTo(pos + x)
        newRect.expandTo(pos + y)
        newRect.expandTo(pos + x + y)
        return newRect
    }

    /**
     * Inverse-transforms the given Vector2 by this transform.
     */
    fun xformInv(vec: Vector2): Vector2 {
        val v = vec - this.origin
        return Vector2(this.x.dot(v), this.y.dot(v))
    }

    /**
     * Inverse-transforms the given Rect2 by this transform.
     */
    fun xformInv(rect: Rect2): Rect2 {
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

    private fun tdotx(v: Vector2) : RealT {
        return x.x * v.x + this.y[0] * v.y
    }

    private fun tdoty(v: Vector2) : RealT {
        return  x.y * v.x + y.y * v.y
    }


    //UTILITIES
    operator fun times(other: Transform2D): Transform2D {
        val origin = xform(other.origin)
        val x0 = tdotx(other.x)
        val x1 = tdoty(other.x)
        val y0 = tdotx(other.y)
        val y1 = tdoty(other.y)

        return Transform2D(x0, x1, y0, y1, origin.x, origin.y)
    }

    override fun toString(): String {
        return "${this.x}, ${this.y}, ${this.origin}"
    }

    override fun equals(other: Any?): Boolean {
        return when(other) {
            is Transform2D -> this.x == other.x && this.y == other.y && this.origin == other.origin
            else -> false
        }
    }

    override fun hashCode(): Int {
        var result = x.hashCode()
        result = 31 * result + y.hashCode()
        result = 31 * result + origin.hashCode()
        return result
    }

}
