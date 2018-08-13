package kotlin.godot.core

import godot.godot_plane
import godot.godot_transform
import kotlinx.cinterop.*


class Transform: CoreType {

    lateinit var basis: Basis
    lateinit var origin: Vector3

    constructor(p_basis: Basis, p_origin: Vector3 = Vector3()) {
        this.basis = p_basis
        this.origin = p_origin
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

    fun inverse_xform(t: Transform): Transform {
        val v = t.origin - origin
        return Transform(basis.transpose_xform(t.basis), basis.xform(v))
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

    fun xform(p_vector: Vector3): Vector3 =
            Vector3(basis[0].dot(p_vector)+origin.x,
                    basis[1].dot(p_vector)+origin.y,
                    basis[2].dot(p_vector)+origin.z)

    fun xform_inv(p_vector: Vector3): Vector3 {
        val v = p_vector - origin
        return Vector3(
                (basis[0][0]*v.x ) + ( basis[1][0]*v.y ) + ( basis[2][0]*v.z ),
                (basis[0][1]*v.x ) + ( basis[1][1]*v.y ) + ( basis[2][1]*v.z ),
                (basis[0][2]*v.x ) + ( basis[1][2]*v.y ) + ( basis[2][2]*v.z )
        )
    }

    fun xform(p_plane: Plane): Plane {
        var point = p_plane.normal * p_plane.d
        var point_dir = point + p_plane.normal
        point = xform(point)
        point_dir = xform(point_dir)

        val normal = point_dir - point
        normal.normalize()

        return Plane( normal, normal.dot(point) )
    }

    fun xform_inv(p_plane: Plane): Plane {
        var point = p_plane.normal * p_plane.d
        var point_dir = point + p_plane.normal
        point = xform_inv(point)
        point_dir = xform_inv(point_dir)

        val normal = point_dir - point
        normal.normalize()

        return Plane( normal, normal.dot(point) )
    }

    fun xform(p_aabb: AABB): AABB {
        val x = basis.get_axis(0) * p_aabb.size.x
        val y = basis.get_axis(1) * p_aabb.size.y
        val z = basis.get_axis(2) * p_aabb.size.z
        val pos = xform( p_aabb.position )

        val new_aabb = AABB()
        new_aabb.position = pos
        new_aabb.expand_to( pos+x )
        new_aabb.expand_to( pos+y )
        new_aabb.expand_to( pos+z )
        new_aabb.expand_to( pos+x+y )
        new_aabb.expand_to( pos+x+z )
        new_aabb.expand_to( pos+y+z )
        new_aabb.expand_to( pos+x+y+z )
        return new_aabb
    }

    fun xform_inv(p_aabb: AABB): AABB {
        val vertices: Array<Vector3> =
                arrayOf(Vector3(p_aabb.position.x+p_aabb.size.x,	p_aabb.position.y+p_aabb.size.y,	p_aabb.position.z+p_aabb.size.z),
                        Vector3(p_aabb.position.x+p_aabb.size.x,	p_aabb.position.y+p_aabb.size.y,	p_aabb.position.z),
                        Vector3(p_aabb.position.x+p_aabb.size.x,	p_aabb.position.y,		p_aabb.position.z+p_aabb.size.z),
                        Vector3(p_aabb.position.x+p_aabb.size.x,	p_aabb.position.y,		p_aabb.position.z),
                        Vector3(p_aabb.position.x,	p_aabb.position.y+p_aabb.size.y,	p_aabb.position.z+p_aabb.size.z),
                        Vector3(p_aabb.position.x,	p_aabb.position.y+p_aabb.size.y,	p_aabb.position.z),
                        Vector3(p_aabb.position.x,	p_aabb.position.y,		p_aabb.position.z+p_aabb.size.z),
                        Vector3(p_aabb.position.x,	p_aabb.position.y,		p_aabb.position.z))

        val ret = AABB()
        ret.position = xform_inv(vertices[0])
        for (i in 1..7)
            ret.expand_to(xform_inv(vertices[i]))

        return ret
    }

    fun affine_invert() {
        basis.invert()
        origin = basis.xform(-origin)
    }

    fun affine_inverse(): Transform {
        val ret = this
        ret.affine_invert()
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

    fun rotate(p_axis: Vector3, p_phi: Float) {
        val new_t = rotated(p_axis, p_phi)
        this.basis = new_t.basis
        this.origin = new_t.origin
    }

    fun rotated(p_axis: Vector3, p_phi: Float): Transform =
            Transform(Basis( p_axis, p_phi ), Vector3()) * this

    fun rotate_basis(p_axis: Vector3, p_phi: Float) {
        basis.rotate(p_axis, p_phi)
    }

    fun looking_at(p_target: Vector3, p_up: Vector3): Transform {
        val t = this
        t.set_look_at(origin, p_target, p_up)
        return t
    }

    fun set_look_at(p_eye: Vector3, p_target: Vector3, p_up: Vector3) {
        var v_x: Vector3
        var v_y: Vector3
        var v_z: Vector3

        v_z = p_eye - p_target
        v_z.normalize()
        v_y = p_up
        v_x = v_y.cross(v_z)
        v_y = v_z.cross(v_x)
        v_x.normalize()
        v_y.normalize()

        basis.set_axis(0, v_x)
        basis.set_axis(1, v_y)
        basis.set_axis(2, v_z)
        origin = p_eye
    }

    fun interpolate_with(p_transform: Transform, p_c: Float): Transform {
        val src_scale = basis.get_scale()
        val src_rot = Quat(basis)
        val src_loc = origin

        val dst_scale = p_transform.basis.get_scale()
        val dst_rot = Quat(p_transform.basis)
        val dst_loc = p_transform.origin

        val dst = Transform()
        dst.basis= Basis(src_rot.slerp(dst_rot,p_c))
        dst.basis.scale(src_scale.linear_interpolate(dst_scale,p_c))
        dst.origin=src_loc.linear_interpolate(dst_loc,p_c)

        return dst
    }

    fun scale(p_scale: Vector3) {
        basis.scale(p_scale)
        origin *= p_scale
    }

    fun scaled(p_scale: Vector3): Transform {
        val t = this
        t.scale(p_scale)
        return t
    }

    fun scale_basis(p_scale: Vector3) {
        basis.scale(p_scale)
    }

    fun translate(p_translation: Vector3) {
        for (i in 0..2)
            origin[i] += basis[i].dot(p_translation)
    }

    fun translate(p_tx: Float, p_ty: Float, p_tz: Float) =
            translate(Vector3(p_tx, p_ty, p_tz))

    fun translated(p_translation: Vector3): Transform {
        val t = this
        t.translate(p_translation)
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

    operator fun times(p_transform: Transform): Transform {
        val t = this
        t.origin = xform(p_transform.origin)
        t.basis *= p_transform.basis
        return t
    }

    override fun toString(): String {
        return basis.toString() + " - " + origin.toString()
    }

    fun get_basis(): Basis = basis
    fun set_basis(p_basis: Basis) {basis = p_basis}
    fun get_origin(): Vector3 = origin
    fun set_origin(p_origin: Vector3) {origin = p_origin}
}