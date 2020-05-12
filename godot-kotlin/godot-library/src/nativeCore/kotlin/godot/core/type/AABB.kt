@file:Suppress("unused", "MemberVisibilityCanBePrivate")

package godot.core

import godot.gdnative.*
import kotlinx.cinterop.*


class AABB(var position: Vector3, var size: Vector3) : CoreType {
    //PROPERTIES
    inline var end: Vector3
        get() = position + size
        set(value) {
            size = value - position
        }


    //CONSTRUCTOR
    constructor() :
        this(Vector3(), Vector3())

    internal constructor(native: CValue<godot_aabb_layout>) : this() {
        memScoped {
            this@AABB.setRawMemory(native.ptr)
        }
    }

    internal constructor(mem: COpaquePointer) : this() {
        this.setRawMemory(mem)
    }


    //INTEROP
    override fun getRawMemory(memScope: MemScope): COpaquePointer {
        val value = cValue<godot_aabb_layout> {
            position.x = this@AABB.position.x.toFloat()
            position.y = this@AABB.position.y.toFloat()
            position.z = this@AABB.position.z.toFloat()
            size.x = this@AABB.size.x.toFloat()
            size.y = this@AABB.size.y.toFloat()
            size.z = this@AABB.size.z.toFloat()
        }
        return value.getPointer(memScope)
    }

    override fun setRawMemory(mem: COpaquePointer) {
        val value = mem.reinterpret<godot_aabb_layout>().pointed
        position.setRawMemory(value.position.ptr)
        size.setRawMemory(value.size.ptr)
    }

    //API
    /**
     * Returns true if this AABB completely encloses another one.
     */
    fun encloses(other: AABB): Boolean {
        val srcMin = position
        val srcMax = position + size
        val dstMin = other.position
        val dstMax = other.position + other.size
        return ((srcMin.x <= dstMin.x) &&
            (srcMax.x > dstMax.x) &&
            (srcMin.y <= dstMin.y) &&
            (srcMax.y > dstMax.y) &&
            (srcMin.z <= dstMin.z) &&
            (srcMax.z > dstMax.z))
    }

    /**
     * Returns this AABB expanded to include a given point.
     */
    fun expand(p_vector: Vector3): AABB {
        val aabb = this
        aabb.expandTo(p_vector)
        return aabb
    }

    internal fun expandTo(vector: Vector3) {
        val begin = position
        val end = position + size

        if (vector.x < begin.x) {
            begin.x = vector.x
        }
        if (vector.y < begin.y) {
            begin.y = vector.y
        }
        if (vector.z < begin.z) {
            begin.z = vector.z
        }

        if (vector.x > end.x) {
            end.x = vector.x
        }
        if (vector.y > end.y) {
            end.y = vector.y
        }
        if (vector.z > end.z) {
            end.z = vector.z
        }

        position = begin
        size = end - begin
    }

    /**
     * Returns the volume of the AABB.
     */
    fun getArea(): RealT {
        return size.x * size.y * size.z
    }

    /**
     * Gets the position of the 8 endpoints of the AABB in space.
     */
    fun getEndpoint(point: Int): Vector3 {
        return when (point) {
            0 -> Vector3(position.x, position.y, position.z)
            1 -> Vector3(position.x, position.y, position.z + size.z)
            2 -> Vector3(position.x, position.y + size.y, position.z)
            3 -> Vector3(position.x, position.y + size.y, position.z + size.z)
            4 -> Vector3(position.x + size.x, position.y, position.z)
            5 -> Vector3(position.x + size.x, position.y, position.z + size.z)
            6 -> Vector3(position.x + size.x, position.y + size.y, position.z)
            7 -> Vector3(position.x + size.x, position.y + size.y, position.z + size.z)
            else -> Vector3()
        }
    }

    /**
     * Returns the normalized longest axis of the AABB.
     */
    fun getLongestAxis(): Vector3 {
        var axis = Vector3(1.0, 0.0, 0.0)
        var maxSize = size.x

        if (size.y > maxSize) {
            axis = Vector3(0.0, 1.0, 0.0)
            maxSize = size.y
        }

        if (size.z > maxSize) {
            axis = Vector3(0.0, 0.0, 1.0)
        }

        return axis
    }

    /**
     * Returns the index of the longest axis of the AABB (according to Vector3’s AXIS_* constants).
     */
    fun getLongestAxisIndex(): Int {
        var axis = 0
        var maxSize = size.x

        if (size.y > maxSize) {
            axis = 1
            maxSize = size.y
        }

        if (size.z > maxSize) {
            axis = 2
        }

        return axis
    }

    /**
     *  Returns the scalar length of the longest axis of the AABB.
     */
    fun getLongestAxisSize(): Double {
        var maxSize = size.x
        if (size.y > maxSize) {
            maxSize = size.y
        }
        if (size.z > maxSize) {
            maxSize = size.z
        }
        return maxSize
    }


    /**
     *  Returns the scalar length of the longest axis of the AABB.
     */
    fun getShortestAxis(): Vector3 {
        var axis = Vector3(1.0, 0.0, 0.0)
        var minSize = size.x

        if (size.y < minSize) {
            axis = Vector3(0.0, 1.0, 0.0)
            minSize = size.y
        }

        if (size.z < minSize) {
            axis = Vector3(0.0, 0.0, 1.0)
        }

        return axis
    }

    /**
     * Gets the position of the 8 endpoints of the AABB in space.
     */
    fun getShortestAxisIndex(): Int {
        var axis = 0
        var maxSize = size.x

        if (size.y < maxSize) {
            axis = 1
            maxSize = size.y
        }

        if (size.z < maxSize) {
            axis = 2
        }

        return axis
    }

    /**
     * Gets the position of the 8 endpoints of the AABB in space.
     */
    fun getShortestAxisSize(): Double {
        var minSize = size.x
        if (size.y < minSize) {
            minSize = size.y
        }

        if (size.z < minSize) {
            minSize = size.z
        }

        return minSize
    }

    /**
     * Returns the support point in a given direction. This is useful for collision detection algorithms.
     */
    fun getSupport(normal: Vector3): Vector3 {
        val halfExtents = size * 0.5
        val ofs = position + halfExtents

        return Vector3(
            if (normal.x > 0.0) -halfExtents.x else halfExtents.x,
            if (normal.y > 0.0) -halfExtents.y else halfExtents.y,
            if (normal.z > 0.0) -halfExtents.z else halfExtents.z
        ) + ofs
    }

    /**
     * Returns a copy of the AABB grown a given amount of units towards all the sides.
     */
    fun grow(p_by: RealT): AABB {
        val aabb = this
        aabb.growBy(p_by)
        return aabb
    }

    internal fun growBy(amount: RealT) {
        position.x -= amount
        position.y -= amount
        position.z -= amount
        size.x += 2.0 * amount
        size.y += 2.0 * amount
        size.z += 2.0 * amount
    }

    /**
     * Returns true if the AABB is flat or empty.
     */
    fun hasNoArea(): Boolean {
        return (size.x <= CMP_EPSILON || size.y <= CMP_EPSILON || size.z <= CMP_EPSILON)
    }

    /**
     * Returns true if the AABB is empty.
     */
    fun hasNoSurface(): Boolean {
        return (size.x <= CMP_EPSILON && size.y <= CMP_EPSILON && size.z <= CMP_EPSILON)
    }

    /**
     * Returns true if the AABB contains a point.
     */
    fun hasPoint(point: Vector3): Boolean {
        return when {
            point.x < position.x -> false
            point.y < position.y -> false
            point.z < position.z -> false
            point.x > position.x + size.x -> false
            point.y > position.y + size.y -> false
            point.z > position.z + size.z -> false
            else -> true
        }
    }

    /**
     * Returns the intersection between two AABB. An empty AABB (size 0,0,0) is returned on failure.
     */
    fun intersection(other: AABB): AABB {
        val srcMin = position
        val srcMax = position + size
        val dstMin = other.position
        val dstMax = other.position + other.size

        val min = Vector3()
        val max = Vector3()

        if (srcMin.x > dstMax.x || srcMax.x < dstMin.x) {
            return AABB()
        } else {
            min.x = if (srcMin.x > dstMin.x) srcMin.x else dstMin.x
            max.x = if (srcMax.x < dstMax.x) srcMax.x else dstMax.x
        }

        if (srcMin.y > dstMax.y || srcMax.y < dstMin.y) {
            return AABB()
        } else {
            min.y = if (srcMin.y > dstMin.y) srcMin.y else dstMin.y
            max.y = if (srcMax.y < dstMax.y) srcMax.y else dstMax.y
        }

        if (srcMin.z > dstMax.z || srcMax.z < dstMin.z) {
            return AABB()
        } else {
            min.z = if (srcMin.z > dstMin.z) srcMin.z else dstMin.z
            max.z = if (srcMax.z < dstMax.z) srcMax.z else dstMax.z
        }

        return AABB(min, max - min)
    }

    /**
     * Returns true if the AABB overlaps with another.
     */
    fun intersects(other: AABB): Boolean {
        return when {
            position.x >= (other.position.x + other.size.x) -> false
            (position.x + size.x) <= other.position.x -> false
            position.y >= (other.position.y + other.size.y) -> false
            (position.y + size.y) <= other.position.y -> false
            position.z >= (other.position.z + other.size.z) -> false
            (position.z + size.z) <= other.position.z -> false
            else -> true
        }
    }

    /**
     * Returns true if the AABB is on both sides of a plane.
     */
    fun intersectsPlane(p_plane: Plane): Boolean {
        val points = arrayOf(
            Vector3(position.x, position.y, position.z),
            Vector3(position.x, position.y, position.z + size.z),
            Vector3(position.x, position.y + size.y, position.z),
            Vector3(position.x, position.y + size.y, position.z + size.z),
            Vector3(position.x + size.x, position.y, position.z),
            Vector3(position.x + size.x, position.y, position.z + size.z),
            Vector3(position.x + size.x, position.y + size.y, position.z),
            Vector3(position.x + size.x, position.y + size.y, position.z + size.z)
        )

        var over = false
        var under = false
        for (i in 0..7) {
            if (p_plane.distanceTo(points[i]) > 0)
                over = true
            else
                under = true
        }

        return under && over
    }

    /**
     * Returns true if the AABB intersects the line segment between from and to.
     */
    fun intersectsSegment(from: Vector3, to: Vector3): Boolean {
        var min = 0.0
        var max = 0.0

        for (i in 0..2) {
            val segFrom = from[i]
            val segTo = to[i]
            val boxBegin = position[i]
            val boxEnd = boxBegin + size[i]
            val cmin: RealT
            val cmax: RealT

            if (segFrom < segTo) {
                if (segFrom > boxEnd || segTo < boxBegin) {
                    return false
                }
                val length = segTo - segFrom
                cmin = if (segFrom < boxBegin) ((boxBegin - segFrom) / length) else 0.0
                cmax = if (segTo > boxEnd) ((boxEnd - segFrom) / length) else 1.0
            } else {
                if (segTo > boxEnd || segFrom < boxBegin) {
                    return false
                }
                val length = segTo - segFrom
                cmin = if (segFrom > boxEnd) (boxEnd - segFrom) / length else 0.0
                cmax = if (segTo < boxBegin) (boxBegin - segFrom) / length else 1.0
            }
            if (cmin > min) {
                min = cmin
            }
            if (cmax < max)
                max = cmax
            if (max < min) {
                return false
            }
        }
        return true
    }

    /**
     * Returns true if this AABB and aabb are approximately equal, by running isEqualApprox on each component.
     */
    fun isEqualApprox(other: AABB): Boolean {
        return this.position.isEqualApprox(other.position) && this.size.isEqualApprox(other.size)
    }

    /**
     * Returns a larger AABB that contains both this AABB and with.
     */
    fun merge(p_with: AABB): AABB {
        val aabb = this
        aabb.mergeWith(p_with)
        return aabb
    }

    internal fun mergeWith(other: AABB) {
        val beg1 = position
        val beg2 = other.position
        val end1 = position + size
        val end2 = other.position + other.size

        val min = Vector3()
        val max = Vector3()

        min.x = if (beg1.x < beg2.x) beg1.x else beg2.x
        min.y = if (beg1.y < beg2.y) beg1.y else beg2.y
        min.z = if (beg1.z < beg2.z) beg1.z else beg2.z

        max.x = if (end1.x > end2.x) end1.x else end2.x
        max.y = if (end1.y > end2.y) end1.y else end2.y
        max.z = if (end1.z > end2.z) end1.z else end2.z

        position = min
        size = max - min
    }

    //UTILITIES
    override fun toVariant() = Variant(this)

    override fun equals(other: Any?): Boolean =
        when (other) {
            is AABB -> (position == other.position && size == other.size)
            else -> false
        }

    override fun toString(): String {
        return "AABB(position=$position, size=$size)"
    }

    override fun hashCode(): Int {
        var result = position.hashCode()
        result = 31 * result + size.hashCode()
        return result
    }
}
