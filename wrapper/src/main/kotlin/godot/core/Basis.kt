package kotlin.godot.core

import kotlinx.cinterop.*
import godot.*
import kotlin.math.*
import platform.posix.perror
import kotlin.godot.core.Defs.Companion.CMP_EPSILON
import kotlin.godot.core.Defs.Companion.CMP_EPSILON2
import kotlin.godot.core.Defs.Companion.Math_PI


class Basis: CoreType {
    lateinit var x: Vector3
    lateinit var y: Vector3
    lateinit var z: Vector3


    constructor(x: Vector3, y: Vector3, z: Vector3) {
        this.x = x
        this.y = y
        this.z = z
    }

    constructor(p_euler: Vector3) {
        set_euler(p_euler)
    }

    constructor(p_quat: Quat) {
        val d = p_quat.length_squared()
        val s = 2f / d
        val xs = p_quat.x * s
        val ys = p_quat.y * s
        val zs = p_quat.z * s
        val wx = p_quat.w * xs
        val wy = p_quat.w * ys
        val wz = p_quat.w * zs
        val xx = p_quat.x * xs
        val xy = p_quat.x * ys
        val xz = p_quat.x * zs
        val yy = p_quat.y * ys
        val yz = p_quat.y * zs
        val zz = p_quat.z * zs
        set(	1.0f - (yy + zz), xy - wz, xz + wy,
                xy + wz, 1.0f - (xx + zz), yz - wx,
                xz - wy, yz + wx, 1.0f - (xx + yy))
    }

    constructor(p_axis: Vector3, p_phi: Float) {
        // Rotation matrix from axis and angle, see https://en.wikipedia.org/wiki/Rotation_matrix#Rotation_matrix_from_axis_and_angle
        val axis_sq = Vector3(p_axis.x*p_axis.x,p_axis.y*p_axis.y,p_axis.z*p_axis.z);

        val cosine: Float = cos(p_phi)
        val sine: Float = sin(p_phi)

        this[0][0] = axis_sq.x + cosine * ( 1.0f - axis_sq.x )
        this[0][1] = p_axis.x * p_axis.y * ( 1.0f - cosine ) - p_axis.z * sine
        this[0][2] = p_axis.z * p_axis.x * ( 1.0f - cosine ) + p_axis.y * sine

        this[1][0] = p_axis.x * p_axis.y * ( 1.0f - cosine ) + p_axis.z * sine
        this[1][1] = axis_sq.y + cosine  * ( 1.0f - axis_sq.y )
        this[1][2] = p_axis.y * p_axis.z * ( 1.0f - cosine ) - p_axis.x * sine

        this[2][0] = p_axis.z * p_axis.x * ( 1.0f - cosine ) - p_axis.y * sine
        this[2][1] = p_axis.y * p_axis.z * ( 1.0f - cosine ) + p_axis.x * sine
        this[2][2] = axis_sq.z + cosine  * ( 1.0f - axis_sq.z )
    }

    constructor(xx: Number, xy: Number, xz: Number, yx: Number, yy: Number, yz: Number, zx: Number, zy: Number, zz: Number) :
            this(Vector3(xx,xy,xz), Vector3(yx,yy,yz), Vector3(zx,zy,zz))

    constructor():
            this(1f,0f, 0f, 0f, 1f, 0f, 0f, 0f, 1f)

    internal constructor(native: CValue<godot_basis>) {
        memScoped {
            this@Basis.setRawMemory(native.ptr)
        }
    }

    internal constructor(mem: COpaquePointer) {
        this.setRawMemory(mem)
    }


    override fun getRawMemory(memScope: MemScope): COpaquePointer {
        return cValuesOf(x[0], x[1], x[2], y[0], y[1], y[2], z[0], z[1], z[2]).getPointer(memScope)
    }

    override fun setRawMemory(mem: COpaquePointer) {
        val arr = mem.reinterpret<FloatVar>()
        x[0] = arr[0]
        x[1] = arr[1]
        x[2] = arr[2]
        y[0] = arr[3]
        y[1] = arr[4]
        y[2] = arr[5]
        z[0] = arr[6]
        z[1] = arr[7]
        z[2] = arr[8]
    }

    
    operator fun get(n: Int): Vector3 =
            when (n) {
                0 -> x
                1 -> y
                2 -> z
                else -> throw IndexOutOfBoundsException()
            }

    operator fun set(n: Int, f: Vector3): Unit =
            when (n) {
                0 -> x = f
                1 -> y = f
                2 -> z = f
                else -> throw IndexOutOfBoundsException()
            }

    fun set(xx: Float, xy: Float, xz:Float, yx:Float, yy:Float, yz:Float, zx:Float, zy:Float, zz:Float) {
        x[0] = xx; x[1] = xy; x[2] = xz
        y[0] = yx; y[1] = yy; y[2] = yz
        z[0] = zx; z[1] = zy; z[2] = zz
    }


    fun invert(): Unit {
        fun cofac(row1: Int, col1: Int, row2: Int, col2: Int) =
                this[row1][col1] * this[row2][col2] - this[row1][col2] * this[row2][col1]

        val co: FloatArray = floatArrayOf(
                cofac(1, 1, 2, 2),
                cofac(1, 2, 2, 0),
                cofac(1, 0, 2, 1))

        val det: Float =    this[0][0] * co[0]+
                            this[0][1] * co[1]+
                            this[0][2] * co[2]


        if (det == 0f) {
            perror("det == 0f")
            return
        }

        val s = 1f / det
        set(    co[0]*s, cofac(0, 2, 2, 1) * s, cofac(0, 1, 1, 2) * s,
                co[1]*s, cofac(0, 0, 2, 2) * s, cofac(0, 2, 1, 0) * s,
                co[2]*s, cofac(0, 1, 2, 0) * s, cofac(0, 0, 1, 1) * s )
    }

    fun isequal_approx(a: Basis, b: Basis): Boolean {
        for (i in 0..2) {
            for (j in 0..2) {
            if (!(abs(a[i][j]-b[i][j]) < CMP_EPSILON))
                return false
            }
        }
        return true
    }

    fun is_orthogonal(): Boolean {
        val id = Basis()
        val m = this.transposed()
        return isequal_approx(id, m)
    }

    fun is_rotation(): Boolean =
            abs(determinant()-1) < CMP_EPSILON && is_orthogonal()

    fun transpose() {
        this[0][1] = this[1][0].also { this[1][0] = this[0][1] }
        this[0][2] = this[2][0].also { this[2][0] = this[0][2] }
        this[1][2] = this[2][1].also { this[2][1] = this[1][2] }
    }

    fun inverse(): Basis {
        val b = this
        b.invert()
        return b
    }

    fun transposed(): Basis {
        val b = this
        b.transpose()
        return b
    }

    fun determinant() : Float =
            this[0][0]*(this[1][1]*this[2][2]-this[2][1]*this[1][2]) -
            this[1][0]*(this[0][1]*this[2][2]-this[2][1]*this[0][2]) +
            this[2][0]*(this[0][1]*this[1][2]-this[1][1]*this[0][2])

    fun get_axis(axis: Int): Vector3 =
            Vector3(this[0][axis], this[1][axis], this[2][axis])

    fun set_axis(axis: Int, value: Vector3) {
        this[0][axis] = value.x
        this[1][axis] = value.y
        this[2][axis] = value.z
    }

    fun rotate(axis: Vector3, phi: Float) {
        val ret = rotated(axis, phi)
        this.x = ret.x
        this.y = ret.y
        this.z = ret.z
    }

    fun rotated(axis: Vector3, phi: Float): Basis =
            Basis(axis, phi) * this

    fun scale(scale: Vector3) {
        this[0][0]*=scale.x
        this[0][1]*=scale.x
        this[0][2]*=scale.x
        this[1][0]*=scale.y
        this[1][1]*=scale.y
        this[1][2]*=scale.y
        this[2][0]*=scale.z
        this[2][1]*=scale.z
        this[2][2]*=scale.z
    }

    fun scaled(scale: Vector3): Basis {
        val b = this
        b.scale(scale)
        return b
    }

    fun get_scale(): Vector3 {
        // We are assuming M = R.S, and performing a polar decomposition to extract R and S.
        // FIXME: We eventually need a proper polar decomposition.
        // As a cheap workaround until then, to ensure that R is a proper rotation matrix with determinant +1
        // (such that it can be represented by a Quat or Euler angles), we absorb the sign flip into the scaling matrix.
        // As such, it works in conjuction with get_rotation().
        val det_sign: Float = if (determinant() > 0) 1f else -1f
        return det_sign*Vector3(
                Vector3(this[0][0],this[1][0],this[2][0]).length(),
                Vector3(this[0][1],this[1][1],this[2][1]).length(),
                Vector3(this[0][2],this[1][2],this[2][2]).length()
        )
    }

    // get_euler_xyz returns a vector containing the Euler angles in the format
    // (a1,a2,a3), where a3 is the angle of the first rotation, and a1 is the last
    // (following the convention they are commonly defined in the literature).
    //
    // The current implementation uses XYZ convention (Z is the first rotation),
    // so euler.z is the angle of the (first) rotation around Z axis and so on,
    //
    // And thus, assuming the matrix is a rotation matrix, this function returns
    // the angles in the decomposition R = X(a1).Y(a2).Z(a3) where Z(a) rotates
    fun get_euler_xyz(): Vector3 {
        // Euler angles in XYZ convention.
        // See https://en.wikipedia.org/wiki/Euler_angles#Rotation_matrix
        //
        // rot =  cy*cz          -cy*sz           sy
        //        cz*sx*sy+cx*sz  cx*cz-sx*sy*sz -cy*sx
        //       -cx*cz*sy+sx*sz  cz*sx+cx*sy*sz  cx*cy
        val euler = Vector3()
        if (!is_rotation()) return euler

        val sy = this[0][2]
        if (sy < 1f) {
            if (sy > -1f) {
                // is this a pure Y rotation?
                if (this[1][0] == 0f && this[0][1] == 0f && this[1][2] == 0f && this[2][1] == 0f && this[1][1] == 1f) {
                    // return the simplest form (human friendlier in editor and scripts)
                    euler.x = 0f
                    euler.y = atan2(this[0][2], this[0][0])
                    euler.z = 0f
                } else {
                    euler.x = atan2(-this[1][2], this[2][2])
                    euler.y = asin(sy)
                    euler.z = atan2(-this[0][1], this[0][0])
                }
            } else {
                euler.x = -atan2(this[0][1], this[1][1])
                euler.y = (-Math_PI).toFloat() / 2f
                euler.z = 0f
            }
        } else {
            euler.x = atan2(this[0][1], this[1][1]);
            euler.y = Math_PI.toFloat() / 2f
            euler.z = 0f
        }
        return euler
    }

    // set_euler_xyz expects a vector containing the Euler angles in the format
    // (ax,ay,az), where ax is the angle of rotation around x axis,
    // and similar for other axes.
    // The current implementation uses XYZ convention (Z is the first rotation).
    fun set_euler_xyz(euler: Vector3): Unit {

        var c: Float
        var s: Float

        c = cos(euler.x)
        s = sin(euler.x)
        val xmat = Basis(1f, 0f, 0f, 0f, c, -s, 0f, s, c)

        c = cos(euler.y)
        s = sin(euler.y)
        val ymat = Basis(c, 0f, s, 0f, 1f, 0f, -s, 0f, c)

        c = cos(euler.z);
        s = sin(euler.z);
        val zmat = Basis(c, -s, 0f, s, c, 0f, 0f, 0f, 1f)

        //optimizer will optimize away all this anyway
        val ret = xmat * (ymat * zmat)
        this.x = ret.x
        this.y = ret.y
        this.z = ret.z
    }

    // get_euler_yxz returns a vector containing the Euler angles in the YXZ convention,
    // as in first-Z, then-X, last-Y. The angles for X, Y, and Z rotations are returned
    // as the x, y, and z components of a Vector3 respectively.
    fun get_euler_yxz(): Vector3 {

        // Euler angles in YXZ convention.
        // See https://en.wikipedia.org/wiki/Euler_angles#Rotation_matrix
        //
        // rot =  cy*cz+sy*sx*sz    cz*sy*sx-cy*sz        cx*sy
        //        cx*sz             cx*cz                 -sx
        //        cy*sx*sz-cz*sy    cy*cz*sx+sy*sz        cy*cx

        val euler = Vector3()

        if (!is_rotation()) return euler
        val m12 = this[1][2]
        if (m12 < 1f) {
            if (m12 > -1f) {
                // is this a pure X rotation?
                if (this[1][0] == 0f && this[0][1] == 0f && this[0][2] == 0f && this[2][0] == 0f && this[0][0] == 1f) {
                    // return the simplest form (human friendlier in editor and scripts)
                    euler.x = atan2(-m12, this[1][1]);
                    euler.y = 0f
                    euler.z = 0f
                } else {
                    euler.x = asin(-m12)
                    euler.y = atan2(this[0][2], this[2][2])
                    euler.z = atan2(this[1][0], this[1][1])
                }
            } else { // m12 == -1
                euler.x = Math_PI.toFloat() * 0.5f
                euler.y = -atan2(-this[0][1], this[0][0])
                euler.z = 0f
            }
        } else { // m12 == 1
            euler.x = (-Math_PI).toFloat() * 0.5f
            euler.y = -atan2(-this[0][1], this[0][0])
            euler.z = 0f
        }

        return euler
    }

    // set_euler_yxz expects a vector containing the Euler angles in the format
    // (ax,ay,az), where ax is the angle of rotation around x axis,
    // and similar for other axes.
    // The current implementation uses YXZ convention (Z is the first rotation).
    fun set_euler_yxz(euler: Vector3) {
        var c: Float
        var s: Float

        c = cos(euler.x)
        s = sin(euler.x)
        val xmat = Basis(1f,0f,0f,0f,c,-s,0f,s,c)

        c = cos(euler.y)
        s = sin(euler.y)
        val ymat = Basis(c,0f,s,0f,1f,0f,-s,0f,c)

        c = cos(euler.z)
        s = sin(euler.z)
        val zmat = Basis(c,-s,0f,s,c,0f,0f,0f,1f)

        val ret = ymat * xmat * zmat
        this.x = ret.x
        this.y = ret.y
        this.z = ret.z
    }

    fun get_euler(): Vector3 = get_euler_yxz()
    fun set_euler(p_euler: Vector3) = set_euler_yxz(p_euler)

    fun tdotx(v: Vector3): Float =
            this[0][0] * v[0] + this[1][0] * v[1] + this[2][0] * v[2]

    fun tdoty(v: Vector3): Float =
            this[0][1] * v[0] + this[1][1] * v[1] + this[2][1] * v[2]

    fun tdotz(v: Vector3): Float =
            this[0][2] * v[0] + this[1][2] * v[1] + this[2][2] * v[2]

    override fun equals(other: Any?): Boolean =
            when (other) {
                is Basis -> (this[0][0] == other[0][0] && this[0][1] == other[0][1] && this[0][2] == other[0][2] &&
                             this[1][0] == other[1][0] && this[1][1] == other[1][1] && this[1][2] == other[1][2] &&
                             this[2][0] == other[2][0] && this[2][1] == other[2][1] && this[2][2] == other[2][2])
                else -> throw IllegalArgumentException()
            }

    fun xform(p_vector: Vector3): Vector3 =
            Vector3(
                    this[0].dot(p_vector),
                    this[1].dot(p_vector),
                    this[2].dot(p_vector)
            )

    fun xform_inv(p_vector: Vector3): Vector3 =
            Vector3((this[0][0]*p_vector.x ) + ( this[1][0]*p_vector.y ) + ( this[2][0]*p_vector.z ),
                    (this[0][1]*p_vector.x ) + ( this[1][1]*p_vector.y ) + ( this[2][1]*p_vector.z ),
                    (this[0][2]*p_vector.x ) + ( this[1][2]*p_vector.y ) + ( this[2][2]*p_vector.z ))

    operator fun times(p_matrix: Basis): Basis =
            Basis(p_matrix.tdotx(this[0]), p_matrix.tdoty(this[0]), p_matrix.tdotz(this[0]),
                  p_matrix.tdotx(this[1]), p_matrix.tdoty(this[1]), p_matrix.tdotz(this[1]),
                  p_matrix.tdotx(this[2]), p_matrix.tdoty(this[2]), p_matrix.tdotz(this[2]))

    operator fun plus(p_matrix: Basis): Basis =
            Basis(this[0] + p_matrix[0], this[1] + p_matrix[1], this[2] + p_matrix[2])

    operator fun minus(p_matrix: Basis): Basis =
            Basis(this[0] - p_matrix[0], this[1] - p_matrix[1], this[2] - p_matrix[2])

    operator fun times(p_val: Float): Basis =
            Basis(this[0] * p_val, this[1] * p_val, this[2] * p_val)

    override fun toString(): String =
            "${this[0][0]}, ${this[0][1]}, ${this[0][2]}, " +
            "${this[1][0]}, ${this[1][1]}, ${this[1][2]}, " +
            "${this[2][0]}, ${this[2][1]}, ${this[2][2]}"

    fun get_column(i: Int): Vector3 =
            Vector3(this[0][i],this[1][i],this[2][i])

    fun get_row(i: Int): Vector3 =
            Vector3(this[i][0],this[i][1],this[i][2])

    fun get_main_diagonal(): Vector3 =
            Vector3(this[0][0],this[1][1],this[2][2])

    fun set_row(i: Int, p_row: Vector3) {
        this[i][0]=p_row.x
        this[i][1]=p_row.y
        this[i][2]=p_row.z
    }

    fun transpose_xform(m: Basis): Basis =
            Basis(this[0].x * m[0].x + this[1].x * m[1].x + this[2].x * m[2].x,
                  this[0].x * m[0].y + this[1].x * m[1].y + this[2].x * m[2].y,
                  this[0].x * m[0].z + this[1].x * m[1].z + this[2].x * m[2].z,
                  this[0].y * m[0].x + this[1].y * m[1].x + this[2].y * m[2].x,
                  this[0].y * m[0].y + this[1].y * m[1].y + this[2].y * m[2].y,
                  this[0].y * m[0].z + this[1].y * m[1].z + this[2].y * m[2].z,
                  this[0].z * m[0].x + this[1].z * m[1].x + this[2].z * m[2].x,
                  this[0].z * m[0].y + this[1].z * m[1].y + this[2].z * m[2].y,
                  this[0].z * m[0].z + this[1].z * m[1].z + this[2].z * m[2].z)

    fun orthonormalize() {
        if (determinant() == 0f) { perror("determiamnt == 0\n"); return }

        var x = get_axis(0)
        var y = get_axis(1)
        var z = get_axis(2)

        x.normalize()
        y = (y-x*(x.dot(y)))
        y.normalize()
        z = (z-x*(x.dot(z))-y*(y.dot(z)))
        z.normalize()

        set_axis(0,x)
        set_axis(1,y)
        set_axis(2,z)
    }

    fun orthonormalized(): Basis {
        val b = this
        b.orthonormalize()
        return b
    }

    fun is_symmetric(): Boolean {
        if (abs(this[0][1] - this[1][0]) > CMP_EPSILON)
            return false
        if (abs(this[0][2] - this[2][0]) > CMP_EPSILON)
            return false
        if (abs(this[1][2] - this[2][1]) > CMP_EPSILON)
            return false

        return true
    }

    fun diagonalize(): Basis {
        if (!is_symmetric()) return Basis()

        val ite_max = 1024
        var off_matrix_norm_2: Float =
                this[0][1] * this[0][1] + this[0][2] * this[0][2] + this[1][2] * this[1][2]

        var ite: Int = 0
        var acc_rot = Basis()
        while (off_matrix_norm_2 > CMP_EPSILON2 && ite++ < ite_max) {
            var el01_2 = this[0][1] * this[0][1]
            var el02_2 = this[0][2] * this[0][2]
            var el12_2 = this[1][2] * this[1][2]
            // Find the pivot element
            var i: Int
            var j: Int
            if (el01_2 > el02_2) {
                if (el12_2 > el01_2) {
                    i = 1
                    j = 2
                } else {
                    i = 0
                    j = 1
                }
            } else {
                if (el12_2 > el02_2) {
                    i = 1
                    j = 2
                } else {
                    i = 0
                    j = 2
                }
            }

            // Compute the rotation angle
            var angle: Float
            if (abs(this[j][j] - this[i][i]) < CMP_EPSILON) {
                angle = Math_PI.toFloat() / 4f
            } else {
                angle = 0.5f * atan(2 * this[i][j] / (this[j][j] - this[i][i]))
            }

            // Compute the rotation matrix
            val rot = Basis()
            rot[i][i] = cos(angle)
            rot[j][j] = cos(angle)
            rot[i][j] = -sin(angle)
            rot[j][i] = sin(angle)

            // Update the off matrix norm
            off_matrix_norm_2 -= this[i][j] * this[i][j]

            // Apply the rotation
            val ret = rot * this * rot.transposed()
            this.x = ret.x
            this.y = ret.y
            this.z = ret.z
            acc_rot = rot * acc_rot
        }
        return acc_rot
    }

    companion object {
        val _ortho_bases: Array<Basis> =
                arrayOf(Basis(1f, 0f, 0f, 0f, 1f, 0f, 0f, 0f, 1f),
                        Basis(0f, -1f, 0f, 1f, 0f, 0f, 0f, 0f, 1f),
                        Basis(-1f, 0f, 0f, 0f, -1f, 0f, 0f, 0f, 1f),
                        Basis(0f, 1f, 0f, -1f, 0f, 0f, 0f, 0f, 1f),
                        Basis(1f, 0f, 0f, 0f, 0f, -1f, 0f, 1f, 0f),
                        Basis(0f, 0f, 1f, 1f, 0f, 0f, 0f, 1f, 0f),
                        Basis(-1f, 0f, 0f, 0f, 0f, 1f, 0f, 1f, 0f),
                        Basis(0f, 0f, -1f, -1f, 0f, 0f, 0f, 1f, 0f),
                        Basis(1f, 0f, 0f, 0f, -1f, 0f, 0f, 0f, -1f),
                        Basis(0f, 1f, 0f, 1f, 0f, 0f, 0f, 0f, -1f),
                        Basis(-1f, 0f, 0f, 0f, 1f, 0f, 0f, 0f, -1f),
                        Basis(0f, -1f, 0f, -1f, 0f, 0f, 0f, 0f, -1f),
                        Basis(1f, 0f, 0f, 0f, 0f, 1f, 0f, -1f, 0f),
                        Basis(0f, 0f, -1f, 1f, 0f, 0f, 0f, -1f, 0f),
                        Basis(-1f, 0f, 0f, 0f, 0f, -1f, 0f, -1f, 0f),
                        Basis(0f, 0f, 1f, -1f, 0f, 0f, 0f, -1f, 0f),
                        Basis(0f, 0f, 1f, 0f, 1f, 0f, -1f, 0f, 0f),
                        Basis(0f, -1f, 0f, 0f, 0f, 1f, -1f, 0f, 0f),
                        Basis(0f, 0f, -1f, 0f, -1f, 0f, -1f, 0f, 0f),
                        Basis(0f, 1f, 0f, 0f, 0f, -1f, -1f, 0f, 0f),
                        Basis(0f, 0f, 1f, 0f, -1f, 0f, 1f, 0f, 0f),
                        Basis(0f, 1f, 0f, 0f, 0f, 1f, 1f, 0f, 0f),
                        Basis(0f, 0f, -1f, 0f, 1f, 0f, 1f, 0f, 0f),
                        Basis(0f, -1f, 0f, 0f, 0f, -1f, 1f, 0f, 0f))
    }

    fun get_orthogonal_index(): Int {
        var orth = this
        for(i in 0..2) {
            for(j in 0..2) {

                var v = orth[i][j]
                if (v>0.5f)
                    v=1.0f
                else if (v<-0.5)
                    v=-1.0f
                else
                    v=0f

                orth[i][j]=v
            }
        }

        for(i in 0..23) {

            if (_ortho_bases[i]==orth)
                return i
        }
        return 0
    }

    fun set_orthogonal_index(p_index: Int) {
        if (p_index >= 24) { perror("p_index >= 24"); return }
        val ret = _ortho_bases[p_index]
        this.x = ret.x
        this.y = ret.y
        this.z = ret.z
    }
}