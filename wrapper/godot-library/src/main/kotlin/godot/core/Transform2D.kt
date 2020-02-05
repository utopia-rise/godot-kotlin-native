@file:Suppress("unused", "MemberVisibilityCanBePrivate")
package godot.core

import godot.gdnative.godot_transform2d
import kotlinx.cinterop.*
import kotlin.math.acos
import kotlin.math.atan2
import kotlin.math.cos
import kotlin.math.sin


class Transform2D: CoreType {
    // Warning #1: basis of Transform2D is stored differently from Basis. In terms of elements array, the basis matrix looks like "on paper":
    // M = (elements[0][0] elements[1][0])
    //     (elements[0][1] elements[1][1])
    // This is such that the columns, which can be interpreted as basis vectors of the coordinate system "painted" on the object, can be accessed as elements[i].
    // Note that this is the opposite of the indices in mathematical texts, meaning: $M_{12}$ in a math book corresponds to elements[1][0] here.
    // This requires additional care when working with explicit indices.
    // See https://en.wikipedia.org/wiki/Row-_and_column-major_order for further reading.

    // Warning #2: 2D be aware that unlike 3D code, 2D code uses a left-handed coordinate system: Y-axis points down,
    // and angle is measure from +X to +Y in a clockwise-fashion.

    var elements: Array<Vector2> =
            arrayOf(Vector2(), Vector2(), Vector2())


    constructor(xx: Number, xy: Number, yx: Number, yy: Number, ox: Number, oy: Number) {
        elements[0][0] = xx.toDouble()
        elements[0][1] = xy.toDouble()
        elements[1][0] = yx.toDouble()
        elements[1][1] = yy.toDouble()
        elements[2][0] = ox.toDouble()
        elements[2][1] = oy.toDouble()
    }

    constructor(rot: Number, pos: Vector2) {
        val cr = cos(rot.toDouble())
        val sr = sin(rot.toDouble())
        elements[0][0] = cr
        elements[0][1] = sr
        elements[1][0] = -sr
        elements[1][1] = cr
        elements[2] = pos
    }

    constructor() {
        elements[0][0] = 1.0
        elements[1][1] = 1.0
    }


    internal constructor(native: CValue<godot_transform2d>) {
        memScoped {
            this@Transform2D.setRawMemory(native.ptr)
        }
    }
    internal constructor(mem: COpaquePointer) {
        this.setRawMemory(mem)
    }


    override fun getRawMemory(memScope: MemScope): COpaquePointer {
        return cValuesOf(elements[0][0].toFloat(), elements[0][1].toFloat(), elements[1][0].toFloat(), 
                         elements[1][1].toFloat(), elements[2][0].toFloat(), elements[2][1].toFloat()).getPointer(memScope)
    }
    override fun setRawMemory(mem: COpaquePointer) {
        val arr = mem.reinterpret<FloatVar>()
        elements[0][0] = arr[0].toDouble()
        elements[0][1] = arr[1].toDouble()
        elements[1][0] = arr[2].toDouble()
        elements[1][1] = arr[3].toDouble()
        elements[2][0] = arr[4].toDouble()
        elements[2][1] = arr[5].toDouble()
    }



    fun tdotx(v: Vector2): Double =
            elements[0][0] * v.x + elements[1][0] * v.y

    fun tdoty(v: Vector2): Double =
            elements[0][1] * v.x + elements[1][1] * v.y

    operator fun get(n: Int): Vector2 =
            elements[n]

    fun getAxis(axis: Int) =
            elements[axis]

    fun setAxis(axis: Int, vec: Vector2) {
        elements[axis] = vec
    }

    fun getOrigin(): Vector2 =
            elements[2]

    fun setOrigin(origin: Vector2) {
        elements[2] = origin
    }

    fun basisXform(v: Vector2): Vector2 =
            Vector2(tdotx(v), tdoty(v))

    fun basisXformInv(v: Vector2): Vector2 =
            Vector2(elements[0].dot(v), elements[1].dot(v))

    fun xform(v: Vector2): Vector2 =
            Vector2(tdotx(v), tdoty(v)) + elements[2]

    fun xformInv(vec: Vector2): Vector2 {
        val v = vec - elements[2]
        return Vector2(elements[0].dot(v), elements[1].dot(v))
    }

    fun xform(rect: Rect2): Rect2 {
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

    fun setRotationAndScale(rot: Double, scale: Vector2) {
        elements[0][0]=cos(rot)*scale.x
        elements[1][1]=cos(rot)*scale.y
        elements[1][0]=-sin(rot)*scale.y
        elements[0][1]=sin(rot)*scale.x
    }

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

    fun invert() {
        elements[0][1] = elements[1][0].also { elements[1][0] = elements[0][1] }
        elements[2] = basisXform(-elements[2])
    }

    fun inverse(): Transform2D {
        val inv = this
        inv.invert()
        return inv
    }

    fun affineInvert() {
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

    fun affineInverse(): Transform2D {
        val inv = this
        inv.affineInvert()
        return inv
    }

    fun rotate(phi: Double) {
        val transform2D = Transform2D(phi,Vector2()) * this
        this.elements = transform2D.elements
    }

    fun getRotation(): Double {
        val det = basisDeterminant()
        val m = orthonormalized()
        if (det < 0) {
            m.scaleBasis(Vector2(-1, -1))
        }
        return atan2(m[0].y, m[0].x)
    }

    fun setRotation(rot: Double) {
        val cr = cos(rot)
        val sr = sin(rot)
        elements[0][0] = cr
        elements[0][1] = sr
        elements[1][0] = -sr
        elements[1][1] = cr
    }

    fun getScale(): Vector2 {
        val detSign: Double = if (basisDeterminant() > 0.0) 1.0 else -1.0
        return detSign * Vector2(elements[0].length(), elements[1].length())
    }

    fun scale(scale: Vector2) {
        scaleBasis(scale)
        elements[2] *= scale
    }

    fun scaleBasis(scale: Vector2) {
        elements[0][0] *= scale.x
        elements[0][1] *= scale.y
        elements[1][0] *= scale.x
        elements[1][1] *= scale.y
    }

    fun translate(translation: Vector2) {
        elements[2] += basisXform(translation)
    }

    fun translate(tx: Double, ty: Double) =
            translate(Vector2(tx, ty))

    fun orthonormalize() {
        val x = elements[0]
        var y = elements[1]

        x.normalize()
        y = (y - x * (x.dot(y)))
        y.normalize()

        elements[0] = x
        elements[1] = y
    }

    fun orthonormalized(): Transform2D {
        val on = this
        on.orthonormalize()
        return on
    }

    override fun equals(other: Any?): Boolean =
        when(other) {
            is Transform2D -> elements[0] == other[0] && elements[1] == other[1] && elements[2] == other[2]
            else -> false
        }

    operator fun times(other: Transform2D): Transform2D {
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

    fun scaled(scale: Vector2): Transform2D {
        val copy = this
        copy.scale(scale)
        return copy
    }

    fun basisScaled(scale: Vector2): Transform2D {
        val copy = this
        copy.scaleBasis(scale)
        return copy
    }

    fun untranslated(): Transform2D {
        val copy = this
        copy.elements[2] = Vector2()
        return copy
    }

    fun translated(offset: Vector2): Transform2D {
        val copy = this
        copy.translate(offset)
        return copy
    }

    fun rotated(phi: Double): Transform2D {
        val copy = this
        copy.rotate(phi)
        return copy
    }

    fun basisDeterminant(): Double =
            elements[0].x * elements[1].y - elements[0].y * elements[1].x

    fun interpolateWith(transform: Transform2D, c: Double): Transform2D {
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


    override fun toString(): String =
            elements[0].toString() + ", " + elements[1].toString() + ", " + elements[2]

    override fun hashCode(): Int = this.toString().hashCode()
}