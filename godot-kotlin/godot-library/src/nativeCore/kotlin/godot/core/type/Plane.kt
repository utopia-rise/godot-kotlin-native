@file:Suppress("unused", "MemberVisibilityCanBePrivate")

package godot.core

import godot.gdnative.godot_basis_layout
import godot.gdnative.godot_plane
import godot.gdnative.godot_plane_layout
import kotlinx.cinterop.*
import kotlin.math.abs


class Plane(var normal: Vector3, var d: RealT = 0.0) : CoreType {
    //CONSTANTS
    companion object {
        val PLANE_YZ: Plane
            get() = Plane(1, 0, 0, 0)
        val PLANE_XZ: Plane
            get() = Plane(0, 1, 0, 0)
        val PLANE_XY: Plane
            get() = Plane(0, 0, 1, 0)
    }

    //PROPERTIES
    inline var x: RealT
        get() = normal.x
        set(value) {
            normal.x = value
        }

    inline var y: RealT
        get() = normal.y
        set(value) {
            normal.y = value
        }

    inline var z: RealT
        get() = normal.z
        set(value) {
            normal.z = value
        }

    //CONSTRUCTOR
    constructor() :
        this(Vector3(0, 0, 0), 0)

    constructor(p1: Number, p2: Number, p3: Number, p4: Number) :
        this(Vector3(p1.toRealT(), p2.toRealT(), p3.toRealT()), p4.toRealT())

    constructor(point1: Vector3, point2: Vector3, point3: Vector3) : this() {
        normal = (point1 - point3).cross(point1 - point2)
        normal.normalize()
        d = normal.dot(point1)
    }

    constructor(normal: Vector3, d: Number) :
        this(normal, d.toRealT())

    constructor(point: Vector3, normal: Vector3) : this() {
        this.normal = normal
        this.d = normal.dot(point)
    }


    internal constructor(native: CValue<godot_plane>) : this() {
        memScoped {
            this@Plane.setRawMemory(native.ptr)
        }
    }

    internal constructor(mem: COpaquePointer) : this() {
        this.setRawMemory(mem)
    }

    //INTEROP
    override fun getRawMemory(memScope: MemScope): COpaquePointer {
        val value = cValue<godot_plane_layout> {
            normal.x = this@Plane.normal.x.toFloat()
            normal.y = this@Plane.normal.y.toFloat()
            normal.z = this@Plane.normal.z.toFloat()
            d = this@Plane.d.toFloat()

        }
        return value.getPointer(memScope)
    }

    override fun setRawMemory(mem: COpaquePointer) {
        val value = mem.reinterpret<godot_plane_layout>().pointed
        normal.setRawMemory(value.normal.ptr)
        d = value.d.toRealT()
    }


    //API
    /**
     * Returns the center of the plane.
     */
    fun center(): Vector3 {
        return normal * d;
    }

    /**
     * Returns the shortest distance from the plane to the position point.
     */
    fun distanceTo(point: Vector3): Double {
        return normal.dot(point) - d
    }

    /**
     * Returns a point on the plane.
     */
    fun getAnyPoint(): Vector3 {
        return normal * d
    }

    /**
     * Returns a normal of the plane.
     */
    fun getAnyPerpendicularNormal(): Vector3 {
        val p1 = Vector3(1, 0, 0)
        val p2 = Vector3(0, 1, 0)

        var p = if (abs(normal.dot(p1)) > 0.99) p2 else p1

        p -= normal * normal.dot(p)
        p.normalize()

        return p
    }

    /**
     * Returns true if point is inside the plane (by a very minimum epsilon threshold).
     */
    fun hasPoint(point: Vector3, epsilon: RealT): Boolean {
        val dist = abs(normal.dot(point) - d)
        return dist <= epsilon
    }

    /**
     * Returns the intersection point of the three planes b, c and this plane.
     * If no intersection is found, null is returned.
     */
    fun intersect3(plane1: Plane, plane2: Plane): Vector3? {
        val plane0 = this
        val normal0 = plane0.normal
        val normal1 = plane1.normal
        val normal2 = plane2.normal

        val denom = normal0.cross(normal1).dot(normal2)

        if (abs(denom) <= CMP_EPSILON) {
            return null
        }

        val result: Vector3?
        result = (normal1.cross(normal2) * plane0.d) +
            (normal2.cross(normal0) * plane1.d) +
            (normal0.cross(normal1) * plane2.d) / denom
        return result
    }

    /**
     * Returns the intersection point of a ray consisting of the position from and the direction normal dir with this plane.
     * If no intersection is found, null is returned.
     */
    fun intersectsRay(from: Vector3, dir: Vector3): Vector3? {
        val den = normal.dot(dir)

        if (abs(den) <= CMP_EPSILON) {
            return null
        }

        val dist = (normal.dot(from) - d) / den

        if (dist > CMP_EPSILON) {
            return null
        }

        return from + dir * (-dist)
    }

    /**
     * Returns the intersection point of a segment from position begin to position end with this plane.
     * If no intersection is found, null is returned.
     */
    fun intersectsSegment(p_begin: Vector3, p_end: Vector3): Vector3? {
        val segment = p_begin - p_end
        val den = normal.dot(segment)

        if (abs(den) <= CMP_EPSILON) {
            return null
        }

        val dist = (normal.dot(p_begin) - d) / den

        if (dist < -CMP_EPSILON || dist > (1.0 + CMP_EPSILON)) {
            return null
        }

        return p_begin + segment * (-dist)
    }

    /**
     * Returns true if this plane and plane are approximately equal, by running isEqualApprox on each component.
     */
    fun isEqualApprox(other: Plane): Boolean {
        return this.normal.isEqualApprox(other.normal) && isEqualApprox(this.d, other.d)
    }

    /**
     * Returns true if point is located above the plane.
     */
    fun isPointOver(point: Vector3): Boolean {
        return normal.dot(point) > d
    }

    /**
     * Returns a copy of the plane, normalized.
     */
    fun normalized(): Plane {
        val p = this
        p.normalize()
        return p
    }

    internal fun normalize() {
        val l = normal.length()
        if (l == 0.0) {
            this.normal = Vector3()
            this.d = 0.0
            return
        }
        normal /= l
        d /= l
    }

    /**
     * Returns the orthogonal projection of point p into a point in the plane.
     */
    fun project(point: Vector3): Vector3 {
        return point - normal * distanceTo(point)
    }


    //UTILITIES
    override fun toVariant() = Variant(this)

    override fun toString(): String {
        return "Plane(normal=$normal, d=$d)"
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
