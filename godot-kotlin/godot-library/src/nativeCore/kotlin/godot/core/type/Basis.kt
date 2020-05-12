@file:Suppress("unused", "MemberVisibilityCanBePrivate")

package godot.core

import godot.gdnative.godot_basis
import godot.gdnative.godot_basis_layout
import godot.gdnative.real_t
import kotlinx.cinterop.*
import kotlin.math.*


class Basis(var x: Vector3, var y: Vector3, var z: Vector3) : CoreType {
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
                Basis(1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0),
                Basis(0.0, -1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0),
                Basis(-1.0, 0.0, 0.0, 0.0, -1.0, 0.0, 0.0, 0.0, 1.0),
                Basis(0.0, 1.0, 0.0, -1.0, 0.0, 0.0, 0.0, 0.0, 1.0),
                Basis(1.0, 0.0, 0.0, 0.0, 0.0, -1.0, 0.0, 1.0, 0.0),
                Basis(0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0),
                Basis(-1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 1.0, 0.0),
                Basis(0.0, 0.0, -1.0, -1.0, 0.0, 0.0, 0.0, 1.0, 0.0),
                Basis(1.0, 0.0, 0.0, 0.0, -1.0, 0.0, 0.0, 0.0, -1.0),
                Basis(0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, -1.0),
                Basis(-1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, -1.0),
                Basis(0.0, -1.0, 0.0, -1.0, 0.0, 0.0, 0.0, 0.0, -1.0),
                Basis(1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, -1.0, 0.0),
                Basis(0.0, 0.0, -1.0, 1.0, 0.0, 0.0, 0.0, -1.0, 0.0),
                Basis(-1.0, 0.0, 0.0, 0.0, 0.0, -1.0, 0.0, -1.0, 0.0),
                Basis(0.0, 0.0, 1.0, -1.0, 0.0, 0.0, 0.0, -1.0, 0.0),
                Basis(0.0, 0.0, 1.0, 0.0, 1.0, 0.0, -1.0, 0.0, 0.0),
                Basis(0.0, -1.0, 0.0, 0.0, 0.0, 1.0, -1.0, 0.0, 0.0),
                Basis(0.0, 0.0, -1.0, 0.0, -1.0, 0.0, -1.0, 0.0, 0.0),
                Basis(0.0, 1.0, 0.0, 0.0, 0.0, -1.0, -1.0, 0.0, 0.0),
                Basis(0.0, 0.0, 1.0, 0.0, -1.0, 0.0, 1.0, 0.0, 0.0),
                Basis(0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0),
                Basis(0.0, 0.0, -1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0),
                Basis(0.0, -1.0, 0.0, 0.0, 0.0, -1.0, 1.0, 0.0, 0.0)
            )
    }


    //CONSTRUCTOR
    constructor() :
        this(Vector3(1, 0, 0), Vector3(1, 1, 0), Vector3(1, 0, 1))

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
    ) : this(Vector3(xx, xy, xz), Vector3(yx, yy, yz), Vector3(zx, zy, zz))


    constructor(from: Vector3) : this() {
        setEuler(from)
    }

    constructor(quat: Quat) : this() {
        val d = quat.lengthSquared()
        val s = 2.0 / d
        val xs = quat.x * s
        val ys = quat.y * s
        val zs = quat.z * s
        val wx = quat.w * xs
        val wy = quat.w * ys
        val wz = quat.w * zs
        val xx = quat.x * xs
        val xy = quat.x * ys
        val xz = quat.x * zs
        val yy = quat.y * ys
        val yz = quat.y * zs
        val zz = quat.z * zs
        set(
            1.0 - (yy + zz), xy - wz, xz + wy,
            xy + wz, 1.0 - (xx + zz), yz - wx,
            xz - wy, yz + wx, 1.0 - (xx + yy)
        )
    }

    constructor(axis: Vector3, phi: Double) : this() {
        // Rotation matrix from axis and angle, see https://en.wikipedia.org/wiki/Rotation_matrix#Rotation_matrix_from_axis_and_angle
        val axisq = Vector3(axis.x * axis.x, axis.y * axis.y, axis.z * axis.z)

        val cosine: Double = cos(phi)
        val sine: Double = sin(phi)

        apply {
            x.x = axisq.x + cosine * (1.0 - axisq.x)
            x.y = axis.x * axis.y * (1.0 - cosine) - axis.z * sine
            x.z = axis.z * axis.x * (1.0 - cosine) + axis.y * sine

            y.x = axis.x * axis.y * (1.0 - cosine) + axis.z * sine
            y.y = axisq.y + cosine * (1.0 - axisq.y)
            y.z = axis.y * axis.z * (1.0 - cosine) - axis.x * sine

            z.x = axis.z * axis.x * (1.0 - cosine) - axis.y * sine
            z.y = axis.y * axis.z * (1.0 - cosine) + axis.x * sine
            z.z = axisq.z + cosine * (1.0 - axisq.z)
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
            x.x = this@Basis.x.x.toFloat()
            x.y = this@Basis.x.y.toFloat()
            x.z = this@Basis.x.z.toFloat()
            y.x = this@Basis.y.x.toFloat()
            y.y = this@Basis.y.y.toFloat()
            y.z = this@Basis.y.z.toFloat()
            z.x = this@Basis.z.x.toFloat()
            z.y = this@Basis.z.y.toFloat()
            z.z = this@Basis.z.z.toFloat()
        }
        return value.getPointer(memScope)
    }

    override fun setRawMemory(mem: COpaquePointer) {
        val value = mem.reinterpret<godot_basis_layout>().pointed
        x.setRawMemory(value.x.ptr)
        y.setRawMemory(value.y.ptr)
        z.setRawMemory(value.z.ptr)
    }


    //API
    /**
     * Returns the determinant of the matrix.
     */
    fun determinant(): Double {
        return this[0][0] * (this[1][1] * this[2][2] - this[2][1] * this[1][2]) -
            this[1][0] * (this[0][1] * this[2][2] - this[2][1] * this[0][2]) +
            this[2][0] * (this[0][1] * this[1][2] - this[1][1] * this[0][2])
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

        val sy = this[0][2]
        if (sy < 1.0) {
            if (sy > -1.0) {
                // is this a pure Y rotation?
                if (this[1][0] == 0.0 && this[0][1] == 0.0 && this[1][2] == 0.0 && this[2][1] == 0.0 && this[1][1] == 1.0) {
                    // return the simplest form (human friendlier in editor and scripts)
                    euler.x = 0.0
                    euler.y = atan2(this[0][2], this[0][0])
                    euler.z = 0.0
                } else {
                    euler.x = atan2(-this[1][2], this[2][2])
                    euler.y = asin(sy)
                    euler.z = atan2(-this[0][1], this[0][0])
                }
            } else {
                euler.x = -atan2(this[0][1], this[1][1])
                euler.y = (-PI).toDouble() / 2.0
                euler.z = 0.0
            }
        } else {
            euler.x = atan2(this[0][1], this[1][1])
            euler.y = PI.toDouble() / 2.0
            euler.z = 0.0
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
        val m12 = this[1][2]
        if (m12 < 1.0) {
            if (m12 > -1.0) {
                // is this a pure X rotation?
                if (this[1][0] == 0.0 && this[0][1] == 0.0 && this[0][2] == 0.0 && this[2][0] == 0.0 && this[0][0] == 1.0) {
                    // return the simplest form (human friendlier in editor and scripts)
                    euler.x = atan2(-m12, this[1][1])
                    euler.y = 0.0
                    euler.z = 0.0
                } else {
                    euler.x = asin(-m12)
                    euler.y = atan2(this[0][2], this[2][2])
                    euler.z = atan2(this[1][0], this[1][1])
                }
            } else { // m12 == -1
                euler.x = PI.toDouble() * 0.5
                euler.y = -atan2(-this[0][1], this[0][0])
                euler.z = 0.0
            }
        } else { // m12 == 1
            euler.x = (-PI).toDouble() * 0.5
            euler.y = -atan2(-this[0][1], this[0][0])
            euler.z = 0.0
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
                var v = orth[i][j]
                v = when {
                    v > 0.5 -> 1.0
                    v < -0.5 -> -1.0
                    else -> 0.0
                }
                orth[i][j] = v
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
        val det: RealT = m.determinant().toRealT()
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
        val detSign: Double = if (determinant() > 0) 1.0 else -1.0
        return detSign * Vector3(
            Vector3(this[0][0], this[1][0], this[2][0]).length(),
            Vector3(this[0][1], this[1][1], this[2][1]).length(),
            Vector3(this[0][2], this[1][2], this[2][2]).length()
        )
    }

    /**
     * Returns the inverse of the matrix.
     */
    fun inverse(): Basis {
        val b = this
        b.invert()
        return b
    }

    internal fun invert() {
        fun cofac(row1: Int, col1: Int, row2: Int, col2: Int): RealT {
            return this[row1][col1] * this[row2][col2] - this[row1][col2] * this[row2][col1]
        }

        val co: DoubleArray = doubleArrayOf(
            cofac(1, 1, 2, 2),
            cofac(1, 2, 2, 0),
            cofac(1, 0, 2, 1)
        )

        val det: Double =
            this[0][0] * co[0] + this[0][1] * co[1] + this[0][2] * co[2]


        if (det == 0.0) {
            Godot.printError("determinant = 0", "invert", "Basis.kt", 138)
            return
        }

        val s = 1.0 / det
        set(
            co[0] * s, cofac(0, 2, 2, 1) * s, cofac(0, 1, 1, 2) * s,
            co[1] * s, cofac(0, 0, 2, 2) * s, cofac(0, 2, 1, 0) * s,
            co[2] * s, cofac(0, 1, 2, 0) * s, cofac(0, 0, 1, 1) * s
        )
    }

    /**
     *
     */
    fun isEqualApprox(a: Basis, epsilon: Double = CMP_EPSILON): Boolean {
        //epsilon has to be Double instead of RealT because of CMP_EPSILON constant
        for (i in 0..2) {
            for (j in 0..2) {
                if (isEqualApprox(this[i][j], a[i][j], epsilon)) {
                    return false
                }
            }
        }
        return true
    }

    /**
     * Returns the orthonormalized version of the matrix (useful to call from time to time to avoid rounding error for orthogonal matrices).
     * This performs a Gram-Schmidt orthonormalization on the basis of the matrix.
     */
    fun orthonormalized(): Basis {
        val b = this
        b.orthonormalize()
        return b
    }

    internal fun orthonormalize() {
        if (determinant() == 0.0) {
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
        Vector3(this[0][axis], this[1][axis], this[2][axis])

    private fun setAxis(axis: Int, value: Vector3) {
        this[0][axis] = value.x
        this[1][axis] = value.y
        this[2][axis] = value.z
    }

    /**
     * Introduce an additional rotation around the given axis by phi (radians). The axis must be a normalized vector.
     */
    fun rotated(axis: Vector3, phi: Double): Basis {
        return Basis(axis, phi) * this
    }

    internal fun rotate(axis: Vector3, phi: Double) {
        val ret = rotated(axis, phi)
        this.x = ret.x
        this.y = ret.y
        this.z = ret.z
    }

    /**
     * Introduce an additional scaling specified by the given 3D scaling factor.
     */
    fun scaled(scale: Vector3): Basis {
        val b = this
        b.scale(scale)
        return b
    }

    internal fun scale(scale: Vector3) {
        this[0][0] *= scale.x
        this[0][1] *= scale.x
        this[0][2] *= scale.x
        this[1][0] *= scale.y
        this[1][1] *= scale.y
        this[1][2] *= scale.y
        this[2][0] *= scale.z
        this[2][1] *= scale.z
        this[2][2] *= scale.z
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

        var c: Double = cos(euler.x)
        var s: Double = sin(euler.x)

        val xmat = Basis(1.0, 0.0, 0.0, 0.0, c, -s, 0.0, s, c)

        c = cos(euler.y)
        s = sin(euler.y)
        val ymat = Basis(c, 0.0, s, 0.0, 1.0, 0.0, -s, 0.0, c)

        c = cos(euler.z)
        s = sin(euler.z)
        val zmat = Basis(c, -s, 0.0, s, c, 0.0, 0.0, 0.0, 1.0)

        //optimizer will optimize away all this anyway
        val ret = xmat * (ymat * zmat)
        this.x = ret.x
        this.y = ret.y
        this.z = ret.z
    }

    /**
     * setEulerYxz expects a vector containing the Euler angles in the format
     * (ax,ay,az), where ax is the angle of rotation around x axis,
     * and similar for other axes.
     * The current implementation uses YXZ convention (Z is the first rotation).
     */
    internal fun setEulerYxz(euler: Vector3) {
        var c: Double = cos(euler.x)
        var s: Double = sin(euler.x)

        val xmat = Basis(1.0, 0.0, 0.0, 0.0, c, -s, 0.0, s, c)

        c = cos(euler.y)
        s = sin(euler.y)
        val ymat = Basis(c, 0.0, s, 0.0, 1.0, 0.0, -s, 0.0, c)

        c = cos(euler.z)
        s = sin(euler.z)
        val zmat = Basis(c, -s, 0.0, s, c, 0.0, 0.0, 0.0, 1.0)

        val ret = ymat * xmat * zmat

        this.x = ret.x
        this.y = ret.y
        this.z = ret.z
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
        this.x = ret.x
        this.y = ret.y
        this.z = ret.z
    }

    /**
     * Assuming that the matrix is a proper rotation matrix, slerp performs a spherical-linear interpolation with another rotation matrix.
     */
    fun slerp(b: Basis, t: RealT): Basis {
        if (!this.isRotation()) {
            Godot.printError("Basis is not a rotation", "slerp()", "Basis.kt", 504)
        }

        val from = Quat(this)
        val to = Quat(b)

        val ret = Basis(from.slerp(to, t))
        ret.x *= (b.x.length() - this.x.length()) * t
        ret.y *= (b.y.length() - this.y.length()) * t
        ret.z *= (b.z.length() - this.z.length()) * t

        return ret;
    }

    /**
     * Transposed dot product with the x axis of the matrix.
     */
    fun tdotx(v: Vector3): Double {
        return this[0][0] * v[0] + this[1][0] * v[1] + this[2][0] * v[2]
    }

    /**
     * Transposed dot product with the y axis of the matrix.
     */
    fun tdoty(v: Vector3): Double {
        return this[0][1] * v[0] + this[1][1] * v[1] + this[2][1] * v[2]
    }

    /**
     * Transposed dot product with the z axis of the matrix.
     */
    fun tdotz(v: Vector3): Double {
        return this[0][2] * v[0] + this[1][2] * v[1] + this[2][2] * v[2]
    }

    /**
     * Returns the transposed version of the matrix.
     */
    fun transposed(): Basis {
        val b = this
        b.transpose()
        return b
    }

    internal fun transpose() {
        this[0][1] = this[1][0].also { this[1][0] = this[0][1] }
        this[0][2] = this[2][0].also { this[2][0] = this[0][2] }
        this[1][2] = this[2][1].also { this[2][1] = this[1][2] }
    }

    /**
     * Returns a vector transformed (multiplied) by the matrix.
     */
    fun xform(vector: Vector3): Vector3 =
        Vector3(
            this[0].dot(vector),
            this[1].dot(vector),
            this[2].dot(vector)
        )

    /**
     * Returns a vector transformed (multiplied) by the transposed matrix.
     * Note that this results in a multiplication by the inverse of the matrix only if it represents a rotation-reflection.
     */
    fun xformInv(vector: Vector3): Vector3 =
        Vector3(
            (this[0][0] * vector.x) + (this[1][0] * vector.y) + (this[2][0] * vector.z),
            (this[0][1] * vector.x) + (this[1][1] * vector.y) + (this[2][1] * vector.z),
            (this[0][2] * vector.x) + (this[1][2] * vector.y) + (this[2][2] * vector.z)
        )


    //UTILITIES
    override fun toVariant() = Variant(this)

    operator fun get(n: Int): Vector3 {
        return when (n) {
            0 -> x
            1 -> y
            2 -> z
            else -> throw IndexOutOfBoundsException()
        }
    }

    operator fun set(n: Int, f: Vector3) {
        when (n) {
            0 -> x = f
            1 -> y = f
            2 -> z = f
            else -> throw IndexOutOfBoundsException()
        }
    }

    fun set(
        xx: Double,
        xy: Double,
        xz: Double,
        yx: Double,
        yy: Double,
        yz: Double,
        zx: Double,
        zy: Double,
        zz: Double
    ) {
        x[0] = xx; x[1] = xy; x[2] = xz
        y[0] = yx; y[1] = yy; y[2] = yz
        z[0] = zx; z[1] = zy; z[2] = zz
    }

    operator fun times(matrix: Basis) = Basis(
        matrix.tdotx(this[0]), matrix.tdoty(this[0]), matrix.tdotz(this[0]),
        matrix.tdotx(this[1]), matrix.tdoty(this[1]), matrix.tdotz(this[1]),
        matrix.tdotx(this[2]), matrix.tdoty(this[2]), matrix.tdotz(this[2])
    )

    operator fun plus(matrix: Basis) = Basis(this[0] + matrix[0], this[1] + matrix[1], this[2] + matrix[2])

    operator fun minus(matrix: Basis) = Basis(this[0] - matrix[0], this[1] - matrix[1], this[2] - matrix[2])

    operator fun times(value: Double) = Basis(this[0] * value, this[1] * value, this[2] * value)

    override fun toString(): String =
        "${this[0][0]}, ${this[0][1]}, ${this[0][2]}, " +
            "${this[1][0]}, ${this[1][1]}, ${this[1][2]}, " +
            "${this[2][0]}, ${this[2][1]}, ${this[2][2]}"


    override fun equals(other: Any?): Boolean =
        when (other) {
            is Basis -> (this[0][0] == other[0][0] && this[0][1] == other[0][1] && this[0][2] == other[0][2] &&
                this[1][0] == other[1][0] && this[1][1] == other[1][1] && this[1][2] == other[1][2] &&
                this[2][0] == other[2][0] && this[2][1] == other[2][1] && this[2][2] == other[2][2])
            else -> throw IllegalArgumentException()
        }

    override fun hashCode(): Int {
        var result = x.hashCode()
        result = 31 * result + y.hashCode()
        result = 31 * result + z.hashCode()
        return result
    }
}
