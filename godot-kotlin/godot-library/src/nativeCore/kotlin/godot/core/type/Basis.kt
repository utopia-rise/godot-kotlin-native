@file:Suppress("unused", "MemberVisibilityCanBePrivate")

package godot.core

import godot.gdnative.godot_basis
import godot.gdnative.godot_basis_layout
import godot.internal.type.*
import kotlinx.cinterop.*
import kotlin.math.*


class Basis() : CoreType {

    @PublishedApi
    internal var _x = Vector3()

    @PublishedApi
    internal var _y = Vector3()

    @PublishedApi
    internal var _z = Vector3()

    init {
        _x.x = 1.0
        _x.y = 0.0
        _x.z = 0.0
        _y.x = 0.0
        _y.y = 1.0
        _y.z = 0.0
        _z.x = 0.0
        _z.y = 0.1
        _z.z = 1.0
    }

    //CONSTANTS
    companion object {
        val IDENTITY: Basis
            get() = Basis(1, 0, 0, 0, 1, 0, 0, 0, 1)
        val FLIP_X: Basis
            get() = Basis(-1, 0, 0, 0, 1, 0, 0, 0, 1)
        val FLIP_Y: Basis
            get() = Basis(1, 0, 0, 0, -1, 0, 0, 0, 1)
        val FLIP_Z: Basis
            get() = Basis(1, 0, 0, 0, 1, 0, 0, 0, -1)

        //used internally by a few methods
        private val orthoBases: Array<Basis> =
            arrayOf(
                Basis(1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f),
                Basis(0.0f, -1.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f),
                Basis(-1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f),
                Basis(0.0f, 1.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f),
                Basis(1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 1.0f, 0.0f),
                Basis(0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f),
                Basis(-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f, 0.0f),
                Basis(0.0f, 0.0f, -1.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f),
                Basis(1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, -1.0f),
                Basis(0.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f),
                Basis(-1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, -1.0f),
                Basis(0.0f, -1.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f),
                Basis(1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, -1.0f, 0.0f),
                Basis(0.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f),
                Basis(-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, -1.0f, 0.0f),
                Basis(0.0f, 0.0f, 1.0f, -1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f),
                Basis(0.0f, 0.0f, 1.0f, 0.0f, 1.0f, 0.0f, -1.0f, 0.0f, 0.0f),
                Basis(0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f, -1.0f, 0.0f, 0.0f),
                Basis(0.0f, 0.0f, -1.0f, 0.0f, -1.0f, 0.0f, -1.0f, 0.0f, 0.0f),
                Basis(0.0f, 1.0f, 0.0f, 0.0f, 0.0f, -1.0f, -1.0f, 0.0f, 0.0f),
                Basis(0.0f, 0.0f, 1.0f, 0.0f, -1.0f, 0.0f, 1.0f, 0.0f, 0.0f),
                Basis(0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f),
                Basis(0.0f, 0.0f, -1.0f, 0.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0.0f),
                Basis(0.0f, -1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.0f)
            )
    }


    //CONSTRUCTOR
    constructor(other: Basis) : this() {
        _x.x = other._x.x
        _x.y = other._x.y
        _x.z = other._x.z
        _y.x = other._y.x
        _y.y = other._y.y
        _y.z = other._y.z
        _z.x = other._z.x
        _z.y = other._z.y
        _z.z = other._z.z
    }

    constructor(
        xx: Number,
        xy: Number,
        xz: Number,
        yx: Number,
        yy: Number,
        yz: Number,
        zx: Number,
        zy: Number,
        zz: Number
    ) : this() {
        _x[0] = xx.toRealT()
        _x[1] = xy.toRealT()
        _x[2] = xz.toRealT()
        _y[0] = yx.toRealT()
        _y[1] = yy.toRealT()
        _y[2] = yz.toRealT()
        _z[0] = zx.toRealT()
        _z[1] = zy.toRealT()
        _z[2] = zz.toRealT()
    }


    constructor(from: Vector3) : this() {
        setEuler(from)
    }

    constructor(quat: Quat) : this() {
        val d = quat.lengthSquared().toGodotReal()
        val s = 2.0f / d
        val xs = quat._x * s
        val ys = quat._y * s
        val zs = quat._z * s
        val wx = quat._w * xs
        val wy = quat._w * ys
        val wz = quat._w * zs
        val xx = quat._x * xs
        val xy = quat._x * ys
        val xz = quat._x * zs
        val yy = quat._y * ys
        val yz = quat._y * zs
        val zz = quat._z * zs
        set(
            1.0f - (yy + zz), xy - wz, xz + wy,
            xy + wz, 1.0f - (xx + zz), yz - wx,
            xz - wy, yz + wx, 1.0f - (xx + yy)
        )
    }

    constructor(axis: Vector3, phi: KotlinReal) : this() {
        // Rotation matrix from axis and angle, see https://en.wikipedia.org/wiki/Rotation_matrix#Rotation_matrix_from_axis_and_angle
        val axisq = Vector3(axis._x * axis._x, axis._y * axis._y, axis._z * axis._z)

        val cosine = cos(phi)
        val sine = sin(phi)

        apply {
            _x._x = (axisq._x + cosine * (1.0f - axisq._x)).toGodotReal()
            _x._y = (axis._x * axis._y * (1.0f - cosine) - axis._z * sine).toGodotReal()
            _x._z = (axis._z * axis._x * (1.0f - cosine) + axis._y * sine).toGodotReal()

            _y._x = (axis._x * axis._y * (1.0f - cosine) + axis._z * sine).toGodotReal()
            _y._y = (axisq._y + cosine * (1.0f - axisq._y)).toGodotReal()
            _y._z = (axis._y * axis._z * (1.0f - cosine) - axis._x * sine).toGodotReal()

            _z._x = (axis._z * axis._x * (1.0f - cosine) - axis._y * sine).toGodotReal()
            _z._y = (axis._y * axis._z * (1.0f - cosine) + axis._x * sine).toGodotReal()
            _z._z = (axisq._z + cosine * (1.0f - axisq._z)).toGodotReal()
        }
    }

    internal constructor(native: CValue<godot_basis>) : this() {
        memScoped {
            this@Basis.setRawMemory(native.ptr)
        }
    }

    internal constructor(mem: COpaquePointer) : this() {
        this.setRawMemory(mem)
    }


    //INTEROP
    override fun getRawMemory(memScope: MemScope): COpaquePointer {
        val value = cValue<godot_basis_layout> {
            x.x = this@Basis._x._x.toGodotReal()
            x.y = this@Basis._x._y.toGodotReal()
            x.z = this@Basis._x._z.toGodotReal()
            y.x = this@Basis._y._x.toGodotReal()
            y.y = this@Basis._y._y.toGodotReal()
            y.z = this@Basis._y._z.toGodotReal()
            z.x = this@Basis._z._x.toGodotReal()
            z.y = this@Basis._z._y.toGodotReal()
            z.z = this@Basis._z._z.toGodotReal()
        }
        return value.getPointer(memScope)
    }

    override fun setRawMemory(mem: COpaquePointer) {
        val value = mem.reinterpret<godot_basis_layout>().pointed
        _x.setRawMemory(value.x.ptr)
        _y.setRawMemory(value.y.ptr)
        _z.setRawMemory(value.z.ptr)
    }


    //API
    /**
     * Returns the determinant of the matrix.
     */
    fun determinant(): KotlinReal {
        return (this._x._x * (this._y._y * this._z._z - this._z._y * this._y._z) -
            this._y._x * (this._x._y * this._z._z - this._z._y * this._x._z) +
            this._z._x * (this._x._y * this._y._z - this._y._y * this._x._z)).toKotlinReal()
    }

    /**
     *
     */
    fun getEuler(): Vector3 {
        return getEulerYxz()
    }

    /**
     * getEulerXyz returns a vector containing the Euler angles in the format
     * (a1,a2,a3), where a3 is the angle of the first rotation, and a1 is the last
     * (following the convention they are commonly defined in the literature).
     *
     * The current implementation uses XYZ convention (Z is the first rotation),
     * so euler.z is the angle of the (first) rotation around Z axis and so on,
     *
     * And thus, assuming the matrix is a rotation matrix, this function returns
     * @return the angles in the decomposition R = X(a1).Y(a2).Z(a3) where Z(a) rotates
     */
    internal fun getEulerXyz(): Vector3 {
        // Euler angles in XYZ convention.
        // See https://en.wikipedia.org/wiki/Euler_angles#Rotation_matrix
        //
        // rot =  cy*cz          -cy*sz           sy
        //        cz*sx*sy+cx*sz  cx*cz-sx*sy*sz -cy*sx
        //       -cx*cz*sy+sx*sz  cz*sx+cx*sy*sz  cx*cy
        val euler = Vector3()
        if (!isRotation()) return euler

        val sy = this._x._z
        if (sy < 1.0f) {
            if (sy > -1.0f) {
                // is this a pure Y rotation?
                if (isEqualApprox(this._y._x, 0.0f)
                    && isEqualApprox(this._x._y, 0.0f)
                    && isEqualApprox(this._y._z, 0.0f)
                    && isEqualApprox(this._z._y, 0.0f)
                    && isEqualApprox(this._y._y, 1.0f)
                ) {
                    // return the simplest form (human friendlier in editor and scripts)
                    euler._x = 0.0f
                    euler._y = atan2(this._x._z, this._x._x)
                    euler._z = 0.0f
                } else {
                    euler._x = atan2(-this._y._z, this._z._z)
                    euler._y = asin(sy)
                    euler._z = atan2(-this._x._y, this._x._x)
                }
            } else {
                euler._x = -atan2(this._x._y, this._y._y)
                euler._y = -PI.toGodotReal() / 2.0f
                euler._z = 0.0f
            }
        } else {
            euler._x = atan2(this._x._y, this._y._y)
            euler._y = PI.toGodotReal() / 2.0f
            euler._z = 0.0f
        }
        return euler
    }

    /**
     * getEulerYxz returns a vector containing the Euler angles in the YXZ convention,
     * as in first-Z, then-X, last-Y. The angles for X, Y, and Z rotations are returned
     * as the x, y, and z components of a Vector3 respectively.
     */
    internal fun getEulerYxz(): Vector3 {

        // Euler angles in YXZ convention.
        // See https://en.wikipedia.org/wiki/Euler_angles#Rotation_matrix
        //
        // rot =  cy*cz+sy*sx*sz    cz*sy*sx-cy*sz        cx*sy
        //        cx*sz             cx*cz                 -sx
        //        cy*sx*sz-cz*sy    cy*cz*sx+sy*sz        cy*cx

        val euler = Vector3()

        if (!isRotation()) return euler
        val m12 = this._y._z
        if (m12 < 1.0f) {
            if (m12 > -1.0f) {
                // is this a pure X rotation?
                if (isEqualApprox(this._y._x, 0.0f) && isEqualApprox(this._x._y, 0.0f) && isEqualApprox(
                        this._x._z,
                        0.0f
                    ) && isEqualApprox(this._z._x, 0.0f) && isEqualApprox(this._x._x, 1.0f)
                ) {
                    // return the simplest form (human friendlier in editor and scripts)
                    euler._x = atan2(-m12, this._y._y)
                    euler._y = 0.0f
                    euler._z = 0.0f
                } else {
                    euler._x = asin(-m12)
                    euler._y = atan2(this._x._z, this._z._z)
                    euler._z = atan2(this._y._x, this._y._y)
                }
            } else { // m12 == -1
                euler._x = PI.toGodotReal() * 0.5f
                euler._y = -atan2(-this._x._y, this._x._x)
                euler._z = 0.0f
            }
        } else { // m12 == 1
            euler._x = (-PI).toGodotReal() * 0.5f
            euler._y = -atan2(-this._x._y, this._x._x)
            euler._z = 0.0f
        }

        return euler
    }


    private fun isOrthogonal(): Boolean {
        val id = Basis()
        val m = this.transposed()
        return m.isEqualApprox(id)
    }

    private fun isRotation(): Boolean =
        abs(determinant() - 1) < CMP_EPSILON && isOrthogonal()

    /**
     * This function considers a discretization of rotations into 24 points on unit sphere,
     * lying along the vectors (x,y,z) with each component being either -1,0 or 1,
     * and returns the index of the point best representing the orientation of the object.
     * It is mainly used by the grid map editor. For further details, refer to Godot source code.
     */
    fun getOrthogonalIndex(): Int {
        val orth = this
        for (i in 0..2) {
            for (j in 0..2) {
                var v = orth._get(i)[j]
                v = when {
                    v > 0.5f -> 1.0f
                    v < -0.5f -> -1.0f
                    else -> 0.0f
                }
                orth._get(i)[j] = v
            }
        }

        for (i in 0..23) {
            if (orthoBases[i] == orth) {
                return i
            }
        }
        return 0
    }

    /**
     *
     */
    fun getRotationQuat(): Quat {
        // Assumes that the matrix can be decomposed into a proper rotation and scaling matrix as M = R.S,
        // and returns the Euler angles corresponding to the rotation part, complementing get_scale().
        // See the comment in get_scale() for further information.
        val m = orthonormalized()
        val det = m.determinant()
        if (det < 0) {
            // Ensure that the determinant is 1, such that result is a proper rotation matrix which can be represented by Euler angles.
            m.scale(Vector3(-1, -1, -1))
        }

        return Quat(m)
    }

    /**
     * Assuming that the matrix is the combination of a rotation and scaling,
     * return the absolute value of scaling factors along each axis.
     */
    fun getScale(): Vector3 {
        // We are assuming M = R.S, and performing a polar decomposition to extract R and S.
        // FIXME: We eventually need a proper polar decomposition.
        // As a cheap workaround until then, to ensure that R is a proper rotation matrix with determinant +1
        // (such that it can be represented by a Quat or Euler angles), we absorb the sign flip into the scaling matrix.
        // As such, it works in conjuction with getRotation().
        val detSign = if (determinant() > 0) 1.0f else -1.0f
        return detSign * Vector3(
            Vector3(this._x._x, this._y._x, this._z._x).length(),
            Vector3(this._x._y, this._y._y, this._z._y).length(),
            Vector3(this._x._z, this._y._z, this._z._z).length()
        )
    }

    /**
     * Returns the inverse of the matrix.
     */
    fun inverse(): Basis {
        val b = Basis(this)
        b.invert()
        return b
    }

    internal fun invert() {
        inline fun cofac(row1: Int, col1: Int, row2: Int, col2: Int): RealT {
            return this._get(row1)[col1] * this._get(row2)[col2] - this._get(row1)[col2] * this._get(row2)[col1]
        }

        val co1 = _y._y * _z._z - _y._z * _z._y
        val co2 = _y._z * _z._x - _y._x - _z._z
        val co3 = _y._x * _z._y - _y._y * _z._x

        val det = this._x._x * co1 + this._x._y * co2 + this._x._z * co3


        if (isEqualApprox(det, 0.0f)) {
            Godot.printError("determinant = 0", "invert", "Basis.kt", 372)
            return
        }

        val s = 1.0f / det
        set(
            co1 * s, (_x._z * _z._y - _x._y * _z._z) * s, (_x._y * _y._z - _x._z * _y._y) * s,
            co2 * s, (_x._x * _z._z - _x._z * _z._x) * s, (_x._z * _y._x - _x._x * _y._z) * s,
            co3 * s, (_x._y * _z._x - _x._x * _z._y) * s, (_x._x * _y._y - _x._y * _y._x) * s
        )
    }

    fun getQuat(): Quat {
        require(isRotation()) { "Basis must be normalized in order to be casted to a Quaternion. Use get_rotation_quat() or call orthonormalized() instead." }
        val trace = this._x.x + this._y.y + this._z.z
        val temp: Array<RealT>

        if (trace > 0.0) {
            var s = sqrt(trace + 1.0)
            val temp3 = s * 0.5
            s = 0.5 / s
            temp = arrayOf(
                ((this._z.y - this._y.z) * s),
                ((this._x.z - this._z.x) * s),
                ((this._y.x - this._x.y) * s),
                temp3
            )
        } else {
            temp = arrayOf(0.0, 0.0, 0.0, 0.0)
            val i = if (this._x.x < this._y.y) {
                if (this._y.y < this._z.z) 2 else 1
            } else {
                if (this._x.x < this._z.z) 2 else 0
            }
            val j = (i + 1) % 3
            val k = (i + 2) % 3

            var s = sqrt(this._get(i)[i] - this._get(j)[j] - this._get(k)[k] + 1.0)
            temp[i] = s * 0.5
            s = 0.5 / s
            temp[3] = (this._get(k)[j] - this._get(j)[k]) * s
            temp[j] = (this._get(j)[i] + this._get(i)[j]) * s
            temp[k] = (this._get(k)[i] + this._get(i)[k]) * s
        }

        return Quat(temp[0], temp[1], temp[2], temp[3]);
    }

    /**
     *
     */
    fun isEqualApprox(a: Basis): Boolean {
        if (isEqualApprox(this._x.x, a._x.x)) return false
        if (isEqualApprox(this._x.y, a._x.y)) return false
        if (isEqualApprox(this._x.z, a._x.z)) return false

        if (isEqualApprox(this._y.x, a._y.x)) return false
        if (isEqualApprox(this._y.y, a._y.y)) return false
        if (isEqualApprox(this._y.x, a._y.x)) return false

        if (isEqualApprox(this._z.x, a._z.x)) return false
        if (isEqualApprox(this._z.y, a._z.y)) return false
        if (isEqualApprox(this._z.z, a._z.z)) return false

        return true
    }

    /**
     * Returns the orthonormalized version of the matrix (useful to call from time to time to avoid rounding error for orthogonal matrices).
     * This performs a Gram-Schmidt orthonormalization on the basis of the matrix.
     */
    fun orthonormalized(): Basis {
        val b = Basis(this)
        b.orthonormalize()
        return b
    }

    internal fun orthonormalize() {
        if (isEqualApprox(determinant().toGodotReal(), 0.0f)) {
            Godot.printError("determinant == 0\n", "orthonormalize()", "Basis.kt", 375)
            return
        }

        val x = getAxis(0)
        var y = getAxis(1)
        var z = getAxis(2)

        x.normalize()
        y = (y - x * (x.dot(y)))
        y.normalize()
        z = (z - x * (x.dot(z)) - y * (y.dot(z)))
        z.normalize()

        setAxis(0, x)
        setAxis(1, y)
        setAxis(2, z)
    }

    private fun getAxis(axis: Int): Vector3 =
        Vector3(this._x[axis], this._y[axis], this._z[axis])

    private fun setAxis(axis: Int, value: Vector3) {
        this._x[axis] = value._x
        this._y[axis] = value._y
        this._z[axis] = value._z
    }

    /**
     * Introduce an additional rotation around the given axis by phi (radians). The axis must be a normalized vector.
     */
    fun rotated(axis: Vector3, phi: KotlinReal): Basis {
        return Basis(axis, phi) * this
    }

    internal fun rotate(axis: Vector3, phi: KotlinReal) {
        val ret = rotated(axis, phi)
        this._x = ret._x
        this._y = ret._y
        this._z = ret._z
    }

    /**
     * Introduce an additional scaling specified by the given 3D scaling factor.
     */
    fun scaled(scale: Vector3): Basis {
        val b = Basis(this)
        b.scale(scale)
        return b
    }

    internal fun scale(scale: Vector3) {
        this._x._x *= scale._x
        this._x._y *= scale._x
        this._x._z *= scale._x
        this._y._x *= scale._y
        this._y._y *= scale._y
        this._y._z *= scale._y
        this._z._x *= scale._z
        this._z._y *= scale._z
        this._z._z *= scale._z
    }

    /**
     *
     */
    fun setEuler(p_euler: Vector3) {
        setEulerYxz(p_euler)
    }

    /**
     * setEulerXyz expects a vector containing the Euler angles in the format
     * (ax,ay,az), where ax is the angle of rotation around x axis,
     * and similar for other axes.
     * The current implementation uses XYZ convention (Z is the first rotation).
     */
    internal fun setEulerXyz(euler: Vector3) {

        var c = cos(euler._x)
        var s = sin(euler._x)

        val xmat = Basis(1.0f, 0.0f, 0.0f, 0.0f, c, -s, 0.0f, s, c)

        c = cos(euler._y)
        s = sin(euler._y)
        val ymat = Basis(c, 0.0f, s, 0.0f, 1.0f, 0.0f, -s, 0.0f, c)

        c = cos(euler._z)
        s = sin(euler._z)
        val zmat = Basis(c, -s, 0.0f, s, c, 0.0f, 0.0f, 0.0f, 1.0f)

        //optimizer will optimize away all this anyway
        val ret = xmat * (ymat * zmat)
        this._x = ret._x
        this._y = ret._y
        this._z = ret._z
    }

    /**
     * setEulerYxz expects a vector containing the Euler angles in the format
     * (ax,ay,az), where ax is the angle of rotation around x axis,
     * and similar for other axes.
     * The current implementation uses YXZ convention (Z is the first rotation).
     */
    internal fun setEulerYxz(euler: Vector3) {
        var c = cos(euler._x)
        var s = sin(euler._x)

        val xmat = Basis(1.0f, 0.0f, 0.0f, 0.0f, c, -s, 0.0f, s, c)

        c = cos(euler._y)
        s = sin(euler._y)
        val ymat = Basis(c, 0.0f, s, 0.0f, 1.0f, 0.0f, -s, 0.0f, c)

        c = cos(euler._z)
        s = sin(euler._z)
        val zmat = Basis(c, -s, 0.0f, s, c, 0.0f, 0.0f, 0.0f, 1.0f)

        val ret = ymat * xmat * zmat

        this._x = ret._x
        this._y = ret._y
        this._z = ret._z
    }

    /**
     *
     */
    fun setOrthogonalIndex(index: Int) {
        if (index >= 24) {
            Godot.printError("index >= 24", "setOrthogonalIndex($index)", "Basis.kt", 493)
            return
        }
        val ret = orthoBases[index]
        this._x = ret._x
        this._y = ret._y
        this._z = ret._z
    }

    /**
     * Assuming that the matrix is a proper rotation matrix, slerp performs a spherical-linear interpolation with another rotation matrix.
     */
    fun slerp(b: Basis, t: KotlinReal): Basis {
        if (!this.isRotation()) {
            Godot.printError("Basis is not a rotation", "slerp()", "Basis.kt", 504)
        }

        val from = Quat(this)
        val to = Quat(b)

        val ret = Basis(from.slerp(to, t))
        ret._x *= (b._x.length() - this._x.length()) * t
        ret._y *= (b._y.length() - this._y.length()) * t
        ret._z *= (b._z.length() - this._z.length()) * t

        return ret
    }

    /**
     * Transposed dot product with the x axis of the matrix.
     */
    fun tdotx(v: Vector3): KotlinReal {
        return (this._x._x * v._x + this._y._x * v._y + this._z._x * v._z).toKotlinReal()
    }

    /**
     * Transposed dot product with the y axis of the matrix.
     */
    fun tdoty(v: Vector3): KotlinReal {
        return (this._x._y * v._x + this._y._y * v._y + this._z._y * v._z).toKotlinReal()
    }

    /**
     * Transposed dot product with the z axis of the matrix.
     */
    fun tdotz(v: Vector3): KotlinReal {
        return (this._x._z * v._x + this._y._z * v._y + this._z._z * v._z).toKotlinReal()
    }

    /**
     * Returns the transposed version of the matrix.
     */
    fun transposed(): Basis {
        val b = Basis(this)
        b.transpose()
        return b
    }

    internal fun transpose() {
        this._x._y = this._y._x.also { this._y._x = this._x._y }
        this._x._z = this._z._x.also { this._z._x = this._x._z }
        this._y._z = this._z._y.also { this._z._y = this._y._z }
    }

    /**
     * Returns a vector transformed (multiplied) by the matrix.
     */
    fun xform(vector: Vector3): Vector3 =
        Vector3(
            this._x.dot(vector),
            this._y.dot(vector),
            this._z.dot(vector)
        )

    /**
     * Returns a vector transformed (multiplied) by the transposed matrix.
     * Note that this results in a multiplication by the inverse of the matrix only if it represents a rotation-reflection.
     */
    fun xformInv(vector: Vector3): Vector3 =
        Vector3(
            (this._x._x * vector._x) + (this._y._x * vector._y) + (this._z._x * vector._z),
            (this._x._y * vector._x) + (this._y._y * vector._y) + (this._z._y * vector._z),
            (this._x._z * vector._x) + (this._y._z * vector._y) + (this._z._z * vector._z)
        )


    //UTILITIES
    override fun toVariant() = Variant(this)

    internal fun _get(n: Int): Vector3 {
        return when (n) {
            0 -> _x
            1 -> _y
            2 -> _z
            else -> throw IndexOutOfBoundsException()
        }
    }

    internal fun _set(n: Int, f: Vector3) {
        when (n) {
            0 -> _x = f
            1 -> _y = f
            2 -> _z = f
            else -> throw IndexOutOfBoundsException()
        }
    }

    internal fun set(
        xx: GodotReal,
        xy: GodotReal,
        xz: GodotReal,
        yx: GodotReal,
        yy: GodotReal,
        yz: GodotReal,
        zx: GodotReal,
        zy: GodotReal,
        zz: GodotReal
    ) {
        _x._x = xx; _x._y = xy; _x._z = xz
        _y._x = yx; _y._y = yy; _y._z = yz
        _z._x = zx; _z._y = zy; _z._z = zz
    }


    operator fun plus(matrix: Basis) = Basis().also {
        it._x = this._x + matrix._x
        it._y = this._y + matrix._y
        it._z = this._z + matrix._z
    }

    operator fun minus(matrix: Basis) = Basis().also {
        it._x = this._x - matrix._x
        it._y = this._y - matrix._y
        it._z = this._z - matrix._z
    }

    operator fun times(matrix: Basis) = Basis(
        matrix.tdotx(this._x), matrix.tdoty(this._x), matrix.tdotz(this._x),
        matrix.tdotx(this._y), matrix.tdoty(this._y), matrix.tdotz(this._y),
        matrix.tdotx(this._z), matrix.tdoty(this._z), matrix.tdotz(this._z)
    )

    operator fun times(scalar: Int) = Basis().also {
        it._x = this._x * scalar
        it._y = this._y * scalar
        it._z = this._z * scalar
    }
    operator fun times(scalar: Long) = Basis().also {
        it._x = this._x * scalar
        it._y = this._y * scalar
        it._z = this._z * scalar
    }
    operator fun times(scalar: Float) = Basis().also {
        it._x = this._x * scalar
        it._y = this._y * scalar
        it._z = this._z * scalar
    }
    operator fun times(scalar: Double) = Basis().also {
        it._x = this._x * scalar
        it._y = this._y * scalar
        it._z = this._z * scalar
    }

    override fun toString(): String {
        return buildString {
            append("${this@Basis._x._x}, ${this@Basis._x._y}, ${this@Basis._x._z}, ")
            append("${this@Basis._y._x}, ${this@Basis._y._y}, ${this@Basis._y._z}, ")
            append("${this@Basis._z._x}, ${this@Basis._z._y}, ${this@Basis._z._z}")
        }
    }

    override fun equals(other: Any?): Boolean =
        when (other) {
            is Basis -> (this._x._x == other._x._x && this._x._y == other._x._y && this._x._z == other._x._z &&
                this._y._x == other._y._x && this._y._y == other._y._y && this._y._z == other._y._z &&
                this._z._x == other._z._x && this._z._y == other._z._y && this._z._z == other._z._z)
            else -> throw IllegalArgumentException()
        }

    override fun hashCode(): Int {
        var result = _x.hashCode()
        result = 31 * result + _y.hashCode()
        result = 31 * result + _z.hashCode()
        return result
    }


    fun set(xAxis: Vector3, yAxis: Vector3, zAxis: Vector3) {
        setAxis(0, xAxis)
        setAxis(1, yAxis)
        setAxis(2, zAxis)
    }

    /*
     * GDScript related members
     */
    constructor(xAxis: Vector3, yAxis: Vector3, zAxis: Vector3) : this() {
        set(xAxis, yAxis, zAxis)
    }

    //PROPERTIES
    /** Return a copy of the x Vector3
     * Warning: Writing x.x = 2 will only modify a copy, not the actual object.
     * To modify it, use x().
     * */
    var x
        get() = getAxis(0)
        set(value) {
            setAxis(0, value)
        }

    inline fun <T> x(block: Vector3.() -> T): T {
        return _x.block()
    }

    /** Return a copy of the y Vector3
     * Warning: Writing y.x = 2 will only modify a copy, not the actual object.
     * To modify it, use y().
     * */
    var y
        get() = getAxis(1)
        set(value) {
            setAxis(1, value)
        }


    inline fun <T> y(block: Vector3.() -> T): T {
        return _y.block()
    }

    /** Return a copy of the z Vector3
     * Warning: Writing z.x = 2 will only modify a copy, not the actual object.
     * To modify it, use z().
     * */
    var z
        get() = getAxis(2)
        set(value) {
            setAxis(2, value)
        }

    inline fun <T> z(block: Vector3.() -> T): T {
        return _z.block()
    }

    operator fun get(index: Int): Vector3 {
        return getAxis(index)
    }

    operator fun set(index: Int, value: Vector3) {
        return setAxis(index, value)
    }
}

operator fun Int.times(basis: Basis) = basis * this
operator fun Long.times(basis: Basis) = basis * this
operator fun Float.times(basis: Basis) = basis * this
operator fun Double.times(basis: Basis) = basis * this
