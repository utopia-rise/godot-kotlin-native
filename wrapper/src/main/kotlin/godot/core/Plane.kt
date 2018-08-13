package kotlin.godot.core

import godot.godot_plane
import kotlinx.cinterop.*
import kotlin.math.abs


class Plane: CoreType {

    enum class ClockDirection {
        CLOCKWISE,
        COUNTERCLOCKWISE
    }

    lateinit var normal: Vector3
    var d: Float = 0f

    constructor(p_normal: Vector3, p_d: Number) {
        this.normal = p_normal
        this.d = p_d.toFloat()
    }

    constructor(p_point: Vector3, p_normal: Vector3) {
        this.normal = p_normal
        this.d = p_normal.dot(p_point)
    }

    constructor(p_point1: Vector3, p_point2: Vector3, p_point3: Vector3, p_dir: ClockDirection) {
        if (p_dir == ClockDirection.CLOCKWISE)
            normal = (p_point1 - p_point3).cross(p_point1 - p_point2)
        else
            normal = (p_point1 - p_point2).cross(p_point1 - p_point3)

        normal.normalize()
        d = normal.dot(p_point1)
    }

    constructor(p1: Number, p2: Number, p3: Number, p4: Number) :
            this(Vector3(p1, p2, p3), p4)

    constructor() {}

    internal constructor(native: CValue<godot_plane>) {
        memScoped {
            this@Plane.setRawMemory(native.ptr)
        }
    }

    internal constructor(mem: COpaquePointer) {
        this.setRawMemory(mem)
    }


    override fun getRawMemory(memScope: MemScope): COpaquePointer {
        return cValuesOf(normal[0], normal[1], normal[2], d).getPointer(memScope)
    }

    override fun setRawMemory(mem: COpaquePointer) {
        val arr = mem.reinterpret<FloatVar>()
        normal[0] = arr[0]
        normal[1] = arr[1]
        normal[2] = arr[2]
        d = arr[3]
    }

    fun setNormal(p_normal: Vector3) {
        this.normal = p_normal
    }

    fun getNormal(): Vector3 =
            normal

    fun project(p_point: Vector3): Vector3 =
            p_point - normal * distanceTo(p_point)

    fun normalize() {
        val l = normal.length()
        if (l == 0f) {
            this.normal = Vector3()
            this.d = 0f
            return
        }
        normal /= l
        d /= l
    }

    fun normalized(): Plane {
        val p = this
        p.normalize()
        return p
    }

    fun getAnyPoint(): Vector3 =
            getNormal() * d

    fun getAnyPerpendicularNormal(): Vector3 {
        val p1 = Vector3(1, 0, 0)
        val p2 = Vector3(0, 1, 0)
        var p: Vector3

        if (abs(normal.dot(p1)) > 0.99)
            p = p2
        else
            p = p1

        p -= normal * normal.dot(p)
        p.normalize()

        return p
    }

    fun intersect3(p_plane1: Plane, p_plane2: Plane, r_result: Vector3?): Pair<Boolean, Vector3?> {
        val p_plane0 = this
        val normal0 = p_plane0.normal
        val normal1 = p_plane1.normal
        val normal2 = p_plane2.normal

        val denom = vec3Cross(normal0, normal1).dot(normal2)

        if (abs(denom) <= CMP_EPSILON)
            return Pair(false, r_result)

        var new_result: Vector3? = null
        if (r_result != null) {
            new_result = ((vec3Cross(normal1, normal2) * p_plane0.d) +
                    (vec3Cross(normal2, normal0) * p_plane1.d) +
                    (vec3Cross(normal0, normal1) * p_plane2.d)) / denom
        }
        return Pair(true, new_result)
    }

    fun intersectsRay(p_from: Vector3, p_dir: Vector3, p_intersection: Vector3?): Pair<Boolean, Vector3?> {
        val segment = p_dir
        val den = normal.dot(segment)

        if (abs(den) <= CMP_EPSILON)
            return Pair(false, p_intersection)

        val dist = (normal.dot(p_from) - d) / den

        if (dist > CMP_EPSILON)
            return Pair(false, p_intersection)

        return Pair(true, p_from + segment * (-dist))
    }

    fun intersectsSegment(p_begin: Vector3, p_end: Vector3, p_intersection: Vector3?): Pair<Boolean, Vector3?> {
        val segment = p_begin - p_end
        val den = normal.dot(segment)

        if (abs(den) <= CMP_EPSILON)
            return Pair(false, p_intersection)

        val dist = (normal.dot(p_begin) - d) / den

        if (dist < -CMP_EPSILON || dist > (1.0 + CMP_EPSILON))
            return Pair(false, p_intersection)

        return Pair(true, p_begin + segment * (-dist))
    }

    fun isAlmostLike(p_plane: Plane) =
            normal.dot(p_plane.normal) > _PLANE_EQ_DOT_EPSILON && abs(d - p_plane.d) < _PLANE_EQ_D_EPSILON

    override fun toString(): String = ""

    fun isPointOver(p_point: Vector3): Boolean =
            normal.dot(p_point) > d

    fun distanceTo(p_point: Vector3): Float =
            normal.dot(p_point) - d

    fun hasPoint(p_point: Vector3, _epsilon: Float): Boolean {
        val dist = abs(normal.dot(p_point) - d)
        return dist <= _epsilon
    }

    override fun equals(other: Any?): Boolean {
        return when (other) {
            is Plane -> normal == other.normal && d == other.d
            else -> false
        }
    }
}
