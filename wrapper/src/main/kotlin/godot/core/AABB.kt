package kotlin.godot.core

import godot.*
import kotlinx.cinterop.*


class AABB: CoreType {
    lateinit var position: Vector3
    lateinit var size: Vector3


    constructor(p_pos: Vector3, p_size: Vector3) {
        position = p_pos
        size = p_size
    }

    constructor() :
            this(Vector3(), Vector3())



    internal constructor(native: CValue<godot_aabb>) {
        memScoped {
            this@AABB.setRawMemory(native.ptr)
        }
    }

    internal constructor(mem: COpaquePointer) {
        this.setRawMemory(mem)
    }



    override fun getRawMemory(memScope: MemScope): COpaquePointer {
        return cValuesOf(position[0], position[1], position[2], size[0], size[1], size[2]).getPointer(memScope)
    }

    override fun setRawMemory(mem: COpaquePointer) {
        val arr = mem.reinterpret<FloatVar>()
        position[0] = arr[0]
        position[1] = arr[1]
        position[2] = arr[2]
        size[0] = arr[3]
        size[1] = arr[4]
        size[2] = arr[5]
    }


    fun hasNoArea(): Boolean =
            (size.x <= CMP_EPSILON || size.y <= CMP_EPSILON || size.z <= CMP_EPSILON)

    fun hasNoSurface(): Boolean =
            (size.x <= CMP_EPSILON && size.y <= CMP_EPSILON && size.z <= CMP_EPSILON)

    fun intersects(other: AABB): Boolean =
            when {
                position.x >= (other.position.x + other.size.x) -> false
                (position.x + size.x) <= other.position.x        -> false
                position.y >= (other.position.y + other.size.y) -> false
                (position.y + size.y) <= other.position.y        -> false
                position.z >= (other.position.z + other.size.z) -> false
                (position.z + size.z) <= other.position.z        -> false
                else -> true
            }


    fun intersectsInclusive(other: AABB): Boolean =
            when {
                position.x > (other.position.x + other.size.x) -> false
                (position.x + size.x) < other.position.x        -> false
                position.y > (other.position.y + other.size.y) -> false
                (position.y + size.y) < other.position.y        -> false
                position.z > (other.position.z + other.size.z) -> false
                (position.z + size.z) < other.position.z        -> false
                else -> true
            }

    fun encloses(other: AABB): Boolean {
        val srcMin = position
        val srcMax = position + size
        val dstMin = other.position
        val dstMax = other.position + other.size
        return ((srcMin.x <= dstMin.x) &&
                (srcMax.x > dstMax.x)  &&
                (srcMin.y <= dstMin.y) &&
                (srcMax.y > dstMax.y)  &&
                (srcMin.z <= dstMin.z) &&
                (srcMax.z > dstMax.z))
    }

    fun getSupport(normal: Vector3): Vector3 {
        val halfExtents = size * 0.5f
        val ofs = position + halfExtents

        return Vector3(
                if (normal.x > 0f) -halfExtents.x else halfExtents.x,
                if (normal.y > 0f) -halfExtents.y else halfExtents.y,
                if (normal.z > 0f) -halfExtents.z else halfExtents.z
        ) + ofs
    }

    fun getEndpoint(point: Int): Vector3 =
        when (point) {
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

    fun intersectsConvexShape(planes: Array<Plane>, planeCount: Int): Boolean {
        val halfExtents = size * 0.5f
        val ofs = position + halfExtents

        for (i in 0 until planeCount) {
            val p = planes[i]
            var point = Vector3(
                    if (p.normal.x > 0) -halfExtents.x else halfExtents.x,
                    if (p.normal.y > 0) -halfExtents.y else halfExtents.y,
                    if (p.normal.z > 0) -halfExtents.z else halfExtents.z
            )
            point += ofs
            if (p.isPointOver(point))
                return false
        }
        return true
    }

    fun hasPoint(point: Vector3): Boolean =
            when {
                point.x < position.x -> false
                point.y < position.y -> false
                point.z < position.z -> false
                point.x > position.x + size.x -> false
                point.y > position.y + size.y -> false
                point.z > position.z + size.z -> false
                else -> true
            }


    fun expandTo(vector: Vector3) {
        val begin = position
        val end = position + size

        if (vector.x < begin.x)
            begin.x = vector.x
        if (vector.y < begin.y)
            begin.y = vector.y
        if (vector.z < begin.z)
            begin.z = vector.z

        if (vector.x > end.x)
            end.x = vector.x
        if (vector.y > end.y)
            end.y = vector.y
        if (vector.z > end.z)
            end.z = vector.z

        position = begin
        size = end - begin
    }

    fun projectRangeInPlane(plane: Plane): Pair<Float, Float> {
        val halfExtents = size * 0.5f
        val center = position + halfExtents

        val length: Float = plane.normal.abs().dot(halfExtents)
        val distance: Float = plane.distanceTo(center)

        return Pair(distance - length, distance + length)
    }

    fun getLongestAxisSize(): Float {
        var maxSize = size.x
        if (size.y > maxSize) {
            maxSize = size.y
        }
        if (size.z > maxSize) {
            maxSize = size.z
        }
        return maxSize
    }

    fun getShortestAxisSize(): Float {
        var minSize = size.x
        if (size.y < minSize) {
            minSize = size.y
        }

        if (size.z < minSize) {
            minSize = size.z
        }

        return minSize
    }

    fun smitsIntersectRat(from: Vector3, dir: Vector3, t0: Float, t1: Float): Boolean {
        val divx = 1f / dir.x
        val divy = 1f / dir.y
        val divz = 1f / dir.z

        val upbound = position + size
        var tmin: Float
        var tmax: Float
        val tymin: Float
        val tymax: Float
        val tzmin: Float
        val tzmax: Float

        if (dir.x >= 0) {
            tmin = (position.x - from.x) * divx
            tmax = (upbound.x - from.x) * divx
        } else {
            tmin = (upbound.x - from.x) * divx
            tmax = (position.x - from.x) * divx
        }
        if (dir.y >= 0) {
            tymin = (position.y - from.y) * divy
            tymax = (upbound.y - from.y) * divy
        } else {
            tymin = (upbound.y - from.y) * divy
            tymax = (position.y - from.y) * divy
        }
        if ((tmin > tymax) || (tymin > tmax))
            return false
        if (tymin > tmin)
            tmin = tymin
        if (tymax < tmax)
            tmax = tymax
        if (dir.z >= 0) {
            tzmin = (position.z - from.z) * divz
            tzmax = (upbound.z - from.z) * divz
        } else {
            tzmin = (upbound.z - from.z) * divz
            tzmax = (position.z - from.z) * divz
        }
        if ((tmin > tzmax) || (tzmin > tmax))
            return false
        if (tzmin > tmin)
            tmin = tzmin
        if (tzmax < tmax)
            tmax = tzmax
        return ((tmin < t1) && (tmax > t0))
    }

    fun growBy(amount: Float) {
        position.x -= amount
        position.y -= amount
        position.z -= amount
        size.x += 2f * amount
        size.y += 2f * amount
        size.z += 2f * amount
    }

    fun getArea(): Float =
            size.x * size.y * size.z

    override fun equals(other: Any?): Boolean =
            when (other) {
                is AABB -> (position == other.position && size == other.size)
                else -> false
            }

    fun mergeWith(other: AABB) {
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

    fun intersection(other: AABB): AABB {
        val srcMin = position
        val srcMax = position + size
        val dstMin = other.position
        val dstMax = other.position + other.size

        val min = Vector3()
        val max = Vector3()

        if (srcMin.x > dstMax.x || srcMax.x < dstMin.x)
            return AABB()
        else {
            min.x = if (srcMin.x > dstMin.x) srcMin.x else dstMin.x
            max.x = if (srcMax.x < dstMax.x) srcMax.x else dstMax.x
        }

        if (srcMin.y > dstMax.y || srcMax.y < dstMin.y)
            return AABB()
        else {
            min.y = if (srcMin.y > dstMin.y) srcMin.y else dstMin.y
            max.y = if (srcMax.y < dstMax.y) srcMax.y else dstMax.y
        }

        if (srcMin.z > dstMax.z || srcMax.z < dstMin.z)
            return AABB()
        else {
            min.z = if (srcMin.z > dstMin.z) srcMin.z else dstMin.z
            max.z = if (srcMax.z < dstMax.z) srcMax.z else dstMax.z
        }

        return AABB(min, max - min)
    }

    fun intersectsRay(p_from: Vector3, p_dir: Vector3): Boolean {
        var c1 = Vector3()
        var c2 = Vector3()
        val end = position + size
        var near = (-1e20).toFloat()
        var far = 1e20.toFloat()

        for (i in 0 until 3) {
            if (p_dir[i] == 0f) {
                if ((p_from[i] < position[i]) || (p_from[i] > end[i])) {
                    return false
                }
            } else { // ray not parallel to planes in this direction
                c1[i] = (position[i] - p_from[i]) / p_dir[i]
                c2[i] = (end[i] - p_from[i]) / p_dir[i]

                if (c1[i] > c2[i])
                    c1 = c2.also { c2 = c1 }

                if (c1[i] > near)
                    near = c1[i]

                if (c2[i] < far)
                    far = c2[i]

                if ((near > far) || (far < 0))
                    return false
            }
        }
        return true
    }

    fun intersectsSegment(p_from: Vector3, p_to: Vector3): Boolean {
        var min = 0f
        var max = 0f

        for (i in 0..2) {
            val segFrom = p_from[i]
            val segTo = p_to[i]
            val boxBegin = position[i]
            val boxEnd = boxBegin + size[i]
            val cmin: Float
            val cmax: Float

            if (segFrom < segTo) {

                if (segFrom > boxEnd || segTo < boxBegin)
                    return false
                val length = segTo - segFrom
                cmin = if (segFrom < boxBegin) ((boxBegin - segFrom) / length) else 0f
                cmax = if (segTo > boxEnd) ((boxEnd - segFrom) / length) else 1f
            } else {
                if (segTo > boxEnd || segFrom < boxBegin)
                    return false
                val length = segTo - segFrom
                cmin = if (segFrom > boxEnd) (boxEnd - segFrom) / length else 0f
                cmax = if (segTo < boxBegin) (boxBegin - segFrom) / length else 1f
            }
            if (cmin > min) {
                min = cmin
            }
            if (cmax < max)
                max = cmax
            if (max < min)
                return false
        }
        return true
    }

    fun intersectsPlane(p_plane: Plane): Boolean {
        val points = arrayOf(Vector3(position.x, position.y, position.z),
                Vector3(position.x, position.y, position.z + size.z),
                Vector3(position.x, position.y + size.y, position.z),
                Vector3(position.x, position.y + size.y, position.z + size.z),
                Vector3(position.x + size.x, position.y, position.z),
                Vector3(position.x + size.x, position.y, position.z + size.z),
                Vector3(position.x + size.x, position.y + size.y, position.z),
                Vector3(position.x + size.x, position.y + size.y, position.z + size.z))

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

    fun getLongestAxis(): Vector3 {
        var axis = Vector3(1f, 0f, 0f)
        var maxSize = size.x

        if (size.y > maxSize) {
            axis = Vector3(0f, 1f, 0f)
            maxSize = size.y
        }

        if (size.z > maxSize) {
            axis = Vector3(0f, 0f, 1f)
        }

        return axis
    }

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

    fun getShortestAxis(): Vector3 {
        var axis = Vector3(1f, 0f, 0f)
        var minSize = size.x

        if (size.y < minSize) {
            axis = Vector3(0f, 1f, 0f)
            minSize = size.y
        }

        if (size.z < minSize) {
            axis = Vector3(0f, 0f, 1f)
        }

        return axis
    }

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

    fun merge(p_with: AABB): AABB {
        val aabb = this
        aabb.mergeWith(p_with)
        return aabb
    }

    fun expand(p_vector: Vector3): AABB {
        val aabb = this
        aabb.expandTo(p_vector)
        return aabb
    }

    fun grow(p_by: Float): AABB {
        val aabb = this
        aabb.growBy(p_by)
        return aabb
    }

    fun getEdge(p_edge: Int): Pair<Vector3, Vector3> {
        val from: Vector3
        val to: Vector3
        when (p_edge) {
            0 -> {
                from = Vector3(position.x + size.x, position.y, position.z)
                to = Vector3(position.x, position.y, position.z)
            }
            1 -> {
                from = Vector3(position.x + size.x, position.y, position.z + size.z)
                to = Vector3(position.x + size.x, position.y, position.z)
            }
            2 -> {
                from = Vector3(position.x, position.y, position.z + size.z)
                to = Vector3(position.x + size.x, position.y, position.z + size.z)
            }
            3 -> {
                from = Vector3(position.x, position.y, position.z)
                to = Vector3(position.x, position.y, position.z + size.z)
            }
            4 -> {
                from = Vector3(position.x, position.y + size.y, position.z)
                to = Vector3(position.x + size.x, position.y + size.y, position.z)
            }
            5 -> {
                from = Vector3(position.x + size.x, position.y + size.y, position.z)
                to = Vector3(position.x + size.x, position.y + size.y, position.z + size.z)
            }
            6 -> {
                from = Vector3(position.x + size.x, position.y + size.y, position.z + size.z)
                to = Vector3(position.x, position.y + size.y, position.z + size.z)
            }
            7 -> {
                from = Vector3(position.x, position.y + size.y, position.z + size.z)
                to = Vector3(position.x, position.y + size.y, position.z)
            }
            8 -> {
                from = Vector3(position.x, position.y, position.z + size.z)
                to = Vector3(position.x, position.y + size.y, position.z + size.z)
            }
            9 -> {
                from = Vector3(position.x, position.y, position.z)
                to = Vector3(position.x, position.y + size.y, position.z)
            }
            10 -> {
                from = Vector3(position.x + size.x, position.y, position.z)
                to = Vector3(position.x + size.x, position.y + size.y, position.z)
            }
            11 -> {
                from = Vector3(position.x + size.x, position.y, position.z + size.z)
                to = Vector3(position.x + size.x, position.y + size.y, position.z + size.z)
            }
            else -> throw IllegalArgumentException()
        }
        return Pair(from, to)
    }

    override fun toString(): String =
            "$position - $size"

    external override fun hashCode(): Int {
        var result = position.hashCode()
        result = 31 * result + size.hashCode()
        return result
    }
}