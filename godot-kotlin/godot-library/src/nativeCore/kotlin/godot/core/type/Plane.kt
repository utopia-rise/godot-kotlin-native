@file:Suppress("unused", "MemberVisibilityCanBePrivate")
package godot.core.type

import godot.core.*
import godot.core.CoreType
import godot.gdnative.godot_plane
import kotlinx.cinterop.*
import kotlin.math.abs


class Plane: CoreType {
    enum class ClockDirection {
        CLOCKWISE,
        COUNTERCLOCKWISE
    }

    var normal: Vector3
    var d: Double = 0.0


    constructor(normal: Vector3, d: Number) {
        this.normal = normal
        this.d = d.toDouble()
    }

    constructor(point: Vector3, normal: Vector3) {
        this.normal = normal
        this.d = normal.dot(point)
    }

    constructor(point1: Vector3, point2: Vector3, point3: Vector3, dir: ClockDirection) {
        normal = if (dir == ClockDirection.CLOCKWISE)
            (point1 - point3).cross(point1 - point2)
        else
            (point1 - point2).cross(point1 - point3)

        normal.normalize()
        d = normal.dot(point1)
    }

    constructor(p1: Number, p2: Number, p3: Number, p4: Number) :
        this(Vector3(p1, p2, p3), p4)

    constructor() :
        this(Vector3(0,0,0), 0)



    internal constructor(native: CValue<godot_plane>) {
        normal = Vector3()
        memScoped {
            this@Plane.setRawMemory(native.ptr)
        }
    }
    internal constructor(mem: COpaquePointer) {
        normal = Vector3()
        this.setRawMemory(mem)
    }


    override fun getRawMemory(memScope: MemScope): COpaquePointer {
        return cValuesOf(normal[0].toFloat(), normal[1].toFloat(), normal[2].toFloat(), d.toFloat()).getPointer(memScope)
    }
    override fun setRawMemory(mem: COpaquePointer) {
        val arr = mem.reinterpret<FloatVar>()
        normal[0] = arr[0].toDouble()
        normal[1] = arr[1].toDouble()
        normal[2] = arr[2].toDouble()
        d = arr[3].toDouble()
    }



    fun project(point: Vector3): Vector3 =
        point - normal * distanceTo(point)

    fun normalize() {
        val l = normal.length()
        if (l == 0.0) {
            this.normal = Vector3()
            this.d = 0.0
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

        var p= if (abs(normal.dot(p1)) > 0.99) p2 else p1

        p -= normal * normal.dot(p)
        p.normalize()

        return p
    }

    fun intersect3(plane1: Plane, plane2: Plane): Vector3? {
        val plane0 = this
        val normal0 = plane0.normal
        val normal1 = plane1.normal
        val normal2 = plane2.normal

        val denom = normal0.cross(normal1).dot(normal2)

        if (abs(denom) <= CMP_EPSILON)
            return null

        val result: Vector3?
        result = ((normal1.cross(normal2) * plane0.d) +
            (normal2.cross(normal0) * plane1.d) +
            (normal0.cross(normal1) * plane2.d)) / denom
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

    fun distanceTo(point: Vector3): Double =
        normal.dot(point) - d

    fun hasPoint(point: Vector3, epsilon: Double): Boolean {
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
