package godot.core

import kotlinx.cinterop.*
import godot.gdnative.*
import kotlin.math.*


class Basis: CoreType {
    override fun isNull(): Boolean = false // TODO: make me beautiful


    lateinit var x: Vector3
    lateinit var y: Vector3
    lateinit var z: Vector3


    constructor(x: Vector3, y: Vector3, z: Vector3) {
        this.x = x
        this.y = y
        this.z = z
    }

    constructor(euler: Vector3) {
        setEuler(euler)
    }

    constructor(quat: Quat) {
        val d = quat.lengthSquared()
        val s = 2f / d
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
        set(	1.0f - (yy + zz), xy - wz, xz + wy,
                xy + wz, 1.0f - (xx + zz), yz - wx,
                xz - wy, yz + wx, 1.0f - (xx + yy))
    }

    constructor(axis: Vector3, phi: Float) {
        // Rotation matrix from axis and angle, see https://en.wikipedia.org/wiki/Rotation_matrix#Rotation_matrix_from_axis_and_angle
        val axisq = Vector3(axis.x*axis.x,axis.y*axis.y,axis.z*axis.z)

        val cosine: Float = cos(phi)
        val sine: Float = sin(phi)

        apply {
            x[0] = axisq.x + cosine * (1.0f - axisq.x)
            x[1] = axis.x * axis.y * (1.0f - cosine) - axis.z * sine
            x[2] = axis.z * axis.x * (1.0f - cosine) + axis.y * sine

            y[0] = axis.x * axis.y * (1.0f - cosine) + axis.z * sine
            y[1] = axisq.y + cosine * (1.0f - axisq.y)
            y[2] = axis.y * axis.z * (1.0f - cosine) - axis.x * sine

            z[0] = axis.z * axis.x * (1.0f - cosine) - axis.y * sine
            z[1] = axis.y * axis.z * (1.0f - cosine) + axis.x * sine
            z[2] = axisq.z + cosine * (1.0f - axisq.z)
        }
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


    fun invert() {
        fun cofac(row1: Int, col1: Int, row2: Int, col2: Int) =
                this[row1][col1] * this[row2][col2] - this[row1][col2] * this[row2][col1]

        val co: FloatArray = floatArrayOf(
                cofac(1, 1, 2, 2),
                cofac(1, 2, 2, 0),
                cofac(1, 0, 2, 1))

        val det: Float =
                this[0][0] * co[0] + this[0][1] * co[1] + this[0][2] * co[2]


        if (det == 0f) {
            Godot.printError("determinant = 0", "invert", "Basis.kt", 138)
            return
        }

        val s = 1f / det
        set(    co[0]*s, cofac(0, 2, 2, 1) * s, cofac(0, 1, 1, 2) * s,
                co[1]*s, cofac(0, 0, 2, 2) * s, cofac(0, 2, 1, 0) * s,
                co[2]*s, cofac(0, 1, 2, 0) * s, cofac(0, 0, 1, 1) * s )
    }

    fun isEqualApprox(a: Basis, b: Basis): Boolean {
        for (i in 0..2) {
            for (j in 0..2) {
            if (abs(a[i][j]-b[i][j]) >= CMP_EPSILON)
                return false
            }
        }
        return true
    }

    fun isOrthogonal(): Boolean {
        val id = Basis()
        val m = this.transposed()
        return isEqualApprox(id, m)
    }

    fun isRotation(): Boolean =
            abs(determinant()-1) < CMP_EPSILON && isOrthogonal()

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

    fun getAxis(axis: Int): Vector3 =
            Vector3(this[0][axis], this[1][axis], this[2][axis])

    fun setAxis(axis: Int, value: Vector3) {
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

    fun getScale(): Vector3 {
        // We are assuming M = R.S, and performing a polar decomposition to extract R and S.
        // FIXME: We eventually need a proper polar decomposition.
        // As a cheap workaround until then, to ensure that R is a proper rotation matrix with determinant +1
        // (such that it can be represented by a Quat or Euler angles), we absorb the sign flip into the scaling matrix.
        // As such, it works in conjuction with getRotation().
        val detSign: Float = if (determinant() > 0) 1f else -1f
        return detSign*Vector3(
                Vector3(this[0][0],this[1][0],this[2][0]).length(),
                Vector3(this[0][1],this[1][1],this[2][1]).length(),
                Vector3(this[0][2],this[1][2],this[2][2]).length()
        )
    }

    // getEulerXyz returns a vector containing the Euler angles in the format
    // (a1,a2,a3), where a3 is the angle of the first rotation, and a1 is the last
    // (following the convention they are commonly defined in the literature).
    //
    // The current implementation uses XYZ convention (Z is the first rotation),
    // so euler.z is the angle of the (first) rotation around Z axis and so on,
    //
    // And thus, assuming the matrix is a rotation matrix, this function returns
    // the angles in the decomposition R = X(a1).Y(a2).Z(a3) where Z(a) rotates
    fun getEulerXyz(): Vector3 {
        // Euler angles in XYZ convention.
        // See https://en.wikipedia.org/wiki/Euler_angles#Rotation_matrix
        //
        // rot =  cy*cz          -cy*sz           sy
        //        cz*sx*sy+cx*sz  cx*cz-sx*sy*sz -cy*sx
        //       -cx*cz*sy+sx*sz  cz*sx+cx*sy*sz  cx*cy
        val euler = Vector3()
        if (!isRotation()) return euler

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
            euler.x = atan2(this[0][1], this[1][1])
            euler.y = Math_PI.toFloat() / 2f
            euler.z = 0f
        }
        return euler
    }

    // setEulerXyz expects a vector containing the Euler angles in the format
    // (ax,ay,az), where ax is the angle of rotation around x axis,
    // and similar for other axes.
    // The current implementation uses XYZ convention (Z is the first rotation).
    fun setEulerXyz(euler: Vector3): Unit {

        var c: Float = cos(euler.x)
        var s: Float = sin(euler.x)

        val xmat = Basis(1f, 0f, 0f, 0f, c, -s, 0f, s, c)

        c = cos(euler.y)
        s = sin(euler.y)
        val ymat = Basis(c, 0f, s, 0f, 1f, 0f, -s, 0f, c)

        c = cos(euler.z)
        s = sin(euler.z)
        val zmat = Basis(c, -s, 0f, s, c, 0f, 0f, 0f, 1f)

        //optimizer will optimize away all this anyway
        val ret = xmat * (ymat * zmat)
        this.x = ret.x
        this.y = ret.y
        this.z = ret.z
    }

    // getEulerYxz returns a vector containing the Euler angles in the YXZ convention,
    // as in first-Z, then-X, last-Y. The angles for X, Y, and Z rotations are returned
    // as the x, y, and z components of a Vector3 respectively.
    fun getEulerYxz(): Vector3 {

        // Euler angles in YXZ convention.
        // See https://en.wikipedia.org/wiki/Euler_angles#Rotation_matrix
        //
        // rot =  cy*cz+sy*sx*sz    cz*sy*sx-cy*sz        cx*sy
        //        cx*sz             cx*cz                 -sx
        //        cy*sx*sz-cz*sy    cy*cz*sx+sy*sz        cy*cx

        val euler = Vector3()

        if (!isRotation()) return euler
        val m12 = this[1][2]
        if (m12 < 1f) {
            if (m12 > -1f) {
                // is this a pure X rotation?
                if (this[1][0] == 0f && this[0][1] == 0f && this[0][2] == 0f && this[2][0] == 0f && this[0][0] == 1f) {
                    // return the simplest form (human friendlier in editor and scripts)
                    euler.x = atan2(-m12, this[1][1])
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

    // setEulerYxz expects a vector containing the Euler angles in the format
    // (ax,ay,az), where ax is the angle of rotation around x axis,
    // and similar for other axes.
    // The current implementation uses YXZ convention (Z is the first rotation).
    fun setEulerYxz(euler: Vector3) {
        var c: Float = cos(euler.x)
        var s: Float = sin(euler.x)

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

    fun getEuler(): Vector3 = getEulerYxz()
    fun setEuler(p_euler: Vector3) = setEulerYxz(p_euler)

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

    fun xform(vector: Vector3): Vector3 =
            Vector3(
                    this[0].dot(vector),
                    this[1].dot(vector),
                    this[2].dot(vector)
            )

    fun xformInv(vector: Vector3): Vector3 =
            Vector3((this[0][0]*vector.x ) + ( this[1][0]*vector.y ) + ( this[2][0]*vector.z ),
                    (this[0][1]*vector.x ) + ( this[1][1]*vector.y ) + ( this[2][1]*vector.z ),
                    (this[0][2]*vector.x ) + ( this[1][2]*vector.y ) + ( this[2][2]*vector.z ))

    operator fun times(matrix: Basis): Basis =
            Basis(matrix.tdotx(this[0]), matrix.tdoty(this[0]), matrix.tdotz(this[0]),
                  matrix.tdotx(this[1]), matrix.tdoty(this[1]), matrix.tdotz(this[1]),
                  matrix.tdotx(this[2]), matrix.tdoty(this[2]), matrix.tdotz(this[2]))

    operator fun plus(matrix: Basis): Basis =
            Basis(this[0] + matrix[0], this[1] + matrix[1], this[2] + matrix[2])

    operator fun minus(matrix: Basis): Basis =
            Basis(this[0] - matrix[0], this[1] - matrix[1], this[2] - matrix[2])

    operator fun times(value: Float): Basis =
            Basis(this[0] * value, this[1] * value, this[2] * value)

    override fun toString(): String =
            "${this[0][0]}, ${this[0][1]}, ${this[0][2]}, " +
            "${this[1][0]}, ${this[1][1]}, ${this[1][2]}, " +
            "${this[2][0]}, ${this[2][1]}, ${this[2][2]}"

    fun getColumn(i: Int): Vector3 =
            Vector3(this[0][i],this[1][i],this[2][i])

    fun getRow(i: Int): Vector3 =
            Vector3(this[i][0],this[i][1],this[i][2])

    fun getMainDiagonal(): Vector3 =
            Vector3(this[0][0],this[1][1],this[2][2])

    fun setRow(i: Int, p_row: Vector3) {
        this[i][0]=p_row.x
        this[i][1]=p_row.y
        this[i][2]=p_row.z
    }

    fun transposeXform(m: Basis): Basis =
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
        if (determinant() == 0f) {
            Godot.printError("determinant == 0\n", "orthonormalize()", "Basis.kt", 464)
            return
        }

        var x = getAxis(0)
        var y = getAxis(1)
        var z = getAxis(2)

        x.normalize()
        y = (y-x*(x.dot(y)))
        y.normalize()
        z = (z-x*(x.dot(z))-y*(y.dot(z)))
        z.normalize()

        setAxis(0,x)
        setAxis(1,y)
        setAxis(2,z)
    }

    fun orthonormalized(): Basis {
        val b = this
        b.orthonormalize()
        return b
    }

    fun isSymmetric(): Boolean {
        if (abs(this[0][1] - this[1][0]) > CMP_EPSILON)
            return false
        if (abs(this[0][2] - this[2][0]) > CMP_EPSILON)
            return false
        if (abs(this[1][2] - this[2][1]) > CMP_EPSILON)
            return false

        return true
    }

    fun diagonalize(): Basis {
        if (!isSymmetric()) return Basis()

        val iteMax = 1024
        var offMatrixNorm2: Float =
                this[0][1] * this[0][1] + this[0][2] * this[0][2] + this[1][2] * this[1][2]

        var ite = 0
        var accRot = Basis()
        while (offMatrixNorm2 > CMP_EPSILON2 && ite++ < iteMax) {
            val el012 = this[0][1] * this[0][1]
            val el022 = this[0][2] * this[0][2]
            val el122 = this[1][2] * this[1][2]
            // Find the pivot element
            var i: Int
            var j: Int
            if (el012 > el022) {
                if (el122 > el012) {
                    i = 1
                    j = 2
                } else {
                    i = 0
                    j = 1
                }
            } else {
                if (el122 > el022) {
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
            offMatrixNorm2 -= this[i][j] * this[i][j]

            // Apply the rotation
            val ret = rot * this * rot.transposed()
            this.x = ret.x
            this.y = ret.y
            this.z = ret.z
            accRot = rot * accRot
        }
        return accRot
    }

    companion object {
        val orthoBases: Array<Basis> =
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

    fun getOrthogonalIndex(): Int {
        val orth = this
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
            if (orthoBases[i]==orth)
                return i
        }
        return 0
    }

    fun setOrthogonalIndex(index: Int) {
        if (index >= 24) {
            Godot.printError("index >= 24", "setOrthogonalIndex($index)", "Basis.kt", 616)
            return
        }
        val ret = orthoBases[index]
        this.x = ret.x
        this.y = ret.y
        this.z = ret.z
    }

    override fun hashCode(): Int {
        var result = x.hashCode()
        result = 31 * result + y.hashCode()
        result = 31 * result + z.hashCode()
        return result
    }
}