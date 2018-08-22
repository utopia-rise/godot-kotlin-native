package godot.core

import godot.gdnative.godot_plane
import kotlinx.cinterop.*
import kotlin.math.abs


class Plane: CoreType {
    override fun isNull(): Boolean = false // TODO: make me beautiful


    enum class ClockDirection {
        CLOCKWISE,
        COUNTERCLOCKWISE
    }

    lateinit var normal: Vector3
    var d: Float = 0f

    constructor(normal: Vector3, d: Number) {
        this.normal = normal
        this.d = d.toFloat()
    }

    constructor(point: Vector3, normal: Vector3) {
        this.normal = normal
        this.d = normal.dot(point)
    }

    constructor(point1: Vector3, point2: Vector3, point3: Vector3, dir: ClockDirection) {
        if (dir == ClockDirection.CLOCKWISE)
            normal = (point1 - point3).cross(point1 - point2)
        else
            normal = (point1 - point2).cross(point1 - point3)

        normal.normalize()
        d = normal.dot(point1)
    }

    constructor(p1: Number, p2: Number, p3: Number, p4: Number) :
            this(Vector3(p1, p2, p3), p4)

    constructor() :
            this(Vector3(0,0,0), 0)

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

    fun project(point: Vector3): Vector3 =
            point - normal * distanceTo(point)

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
            normal * d

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

    fun intersect3(plane1: Plane, plane2: Plane): Vector3? {
        val plane0 = this
        val normal0 = plane0.normal
        val normal1 = plane1.normal
        val normal2 = plane2.normal

        val denom = vec3Cross(normal0, normal1).dot(normal2)

        if (abs(denom) <= CMP_EPSILON)
            return null

        val result: Vector3?
        result = ((vec3Cross(normal1, normal2) * plane0.d) +
                    (vec3Cross(normal2, normal0) * plane1.d) +
                    (vec3Cross(normal0, normal1) * plane2.d)) / denom
        return result
    }

    fun intersectsRay(from: Vector3, dir: Vector3): Vector3? {
        val den = normal.dot(dir)

        if (abs(den) <= CMP_EPSILON)
            return null

        val dist = (normal.dot(from) - d) / den

        if (dist > CMP_EPSILON)
            return null

        return from + dir * (-dist)
    }

    fun intersectsSegment(p_begin: Vector3, p_end: Vector3): Vector3? {
        val segment = p_begin - p_end
        val den = normal.dot(segment)

        if (abs(den) <= CMP_EPSILON)
            return null

        val dist = (normal.dot(p_begin) - d) / den

        if (dist < -CMP_EPSILON || dist > (1.0 + CMP_EPSILON))
            return null

        return p_begin + segment * (-dist)
    }

    fun isAlmostLike(plane: Plane) =
            normal.dot(plane.normal) > PLANE_EQ_DOT_EPSILON && abs(d - plane.d) < PLANE_EQ_D_EPSILON

    override fun toString(): String = ""

    fun isPointOver(point: Vector3): Boolean =
            normal.dot(point) > d

    fun distanceTo(point: Vector3): Float =
            normal.dot(point) - d

    fun hasPoint(point: Vector3, epsilon: Float): Boolean {
        val dist = abs(normal.dot(point) - d)
        return dist <= epsilon
    }

    override fun equals(other: Any?): Boolean {
        return when (other) {
            is Plane -> normal == other.normal && d == other.d
            else -> false
        }
    }

    override fun hashCode(): Int {
        var result = normal.hashCode()
        result = 31 * result + d.hashCode()
        return result
    }
}
