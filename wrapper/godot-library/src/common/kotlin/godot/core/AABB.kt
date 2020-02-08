@file:Suppress("unused", "MemberVisibilityCanBePrivate")
package godot.core

expect class AABB {
    constructor()
    constructor(p_pos: Vector3, p_size: Vector3)

    var position: Vector3
    var size: Vector3
}

fun AABB.hasNoArea(): Boolean =
    (size.x <= CMP_EPSILON || size.y <= CMP_EPSILON || size.z <= CMP_EPSILON)

fun AABB.hasNoSurface(): Boolean =
    (size.x <= CMP_EPSILON && size.y <= CMP_EPSILON && size.z <= CMP_EPSILON)

fun AABB.intersects(other: AABB): Boolean =
    when {
        position.x >= (other.position.x + other.size.x) -> false
        (position.x + size.x) <= other.position.x        -> false
        position.y >= (other.position.y + other.size.y) -> false
        (position.y + size.y) <= other.position.y        -> false
        position.z >= (other.position.z + other.size.z) -> false
        (position.z + size.z) <= other.position.z        -> false
        else -> true
    }


fun AABB.intersectsInclusive(other: AABB): Boolean =
    when {
        position.x > (other.position.x + other.size.x) -> false
        (position.x + size.x) < other.position.x        -> false
        position.y > (other.position.y + other.size.y) -> false
        (position.y + size.y) < other.position.y        -> false
        position.z > (other.position.z + other.size.z) -> false
        (position.z + size.z) < other.position.z        -> false
        else -> true
    }

fun AABB.encloses(other: AABB): Boolean {
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

fun AABB.getSupport(normal: Vector3): Vector3 {
    val halfExtents = size * 0.5
    val ofs = position + halfExtents

    return Vector3(
        if (normal.x > 0.0) -halfExtents.x else halfExtents.x,
        if (normal.y > 0.0) -halfExtents.y else halfExtents.y,
        if (normal.z > 0.0) -halfExtents.z else halfExtents.z
    ) + ofs
}

fun AABB.getEndpoint(point: Int): Vector3 =
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

fun AABB.intersectsConvexShape(planes: Array<Plane>, planeCount: Int): Boolean {
    val halfExtents = size * 0.5
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

fun AABB.hasPoint(point: Vector3): Boolean =
    when {
        point.x < position.x -> false
        point.y < position.y -> false
        point.z < position.z -> false
        point.x > position.x + size.x -> false
        point.y > position.y + size.y -> false
        point.z > position.z + size.z -> false
        else -> true
    }


fun AABB.expandTo(vector: Vector3) {
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

fun AABB.projectRangeInPlane(plane: Plane): Pair<Double, Double> {
    val halfExtents = size * 0.5
    val center = position + halfExtents

    val length: Double = plane.normal.abs().dot(halfExtents)
    val distance: Double = plane.distanceTo(center)

    return Pair(distance - length, distance + length)
}

fun AABB.getLongestAxisSize(): Double {
    var maxSize = size.x
    if (size.y > maxSize) {
        maxSize = size.y
    }
    if (size.z > maxSize) {
        maxSize = size.z
    }
    return maxSize
}

fun AABB.getShortestAxisSize(): Double {
    var minSize = size.x
    if (size.y < minSize) {
        minSize = size.y
    }

    if (size.z < minSize) {
        minSize = size.z
    }

    return minSize
}

fun AABB.smitsIntersectRat(from: Vector3, dir: Vector3, t0: Double, t1: Double): Boolean {
    val divx = 1.0 / dir.x
    val divy = 1.0 / dir.y
    val divz = 1.0 / dir.z

    val upbound = position + size
    var tmin: Double
    var tmax: Double
    val tymin: Double
    val tymax: Double
    val tzmin: Double
    val tzmax: Double

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

fun AABB.growBy(amount: Double) {
    position.x -= amount
    position.y -= amount
    position.z -= amount
    size.x += 2.0 * amount
    size.y += 2.0 * amount
    size.z += 2.0 * amount
}

fun AABB.getArea(): Double =
    size.x * size.y * size.z

fun AABB.mergeWith(other: AABB) {
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

fun AABB.intersection(other: AABB): AABB {
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

fun AABB.intersectsRay(from: Vector3, dir: Vector3, clip: Boolean, normal: Boolean): Triple<Boolean, Vector3?, Vector3?> {
    var c1 = Vector3()
    var c2 = Vector3()
    val end = position + size
    var near = (-1e20).toDouble()
    var far = 1e20.toDouble()
    var axis = 0

    for (i in 0 until 3) {
        if (dir[i] == 0.0) {
            if ((from[i] < position[i]) || (from[i] > end[i])) {
                return Triple(false, null, null)
            }
        } else { // ray not parallel to planes in this direction
            c1[i] = (position[i] - from[i]) / dir[i]
            c2[i] = (end[i] - from[i]) / dir[i]

            if (c1[i] > c2[i])
                c1 = c2.also { c2 = c1 }

            if (c1[i] > near) {
                near = c1[i]
                axis = i
            }

            if (c2[i] < far)
                far = c2[i]

            if ((near > far) || (far < 0))
                return Triple(false, null, null)
        }
    }

    var ret1: Vector3? = null
    var ret2: Vector3? = null
    if (clip)
        ret1 = c1
    if (normal) {
        ret2 = Vector3()
        ret2[axis] = if (dir[axis] != 0.0) -1.0 else 1.0
    }
    return Triple(true, ret1, ret2)
}

//    fun AABB.intersectionRayClip(from: Vector3, dir: Vector3): Vector3 {
//        var ret = Vector3()
//
//    }

fun AABB.intersectsSegment(from: Vector3, to: Vector3, clip: Boolean, normal: Boolean): Triple<Boolean, Vector3?, Vector3?> {
    var min = 0.0
    var max = 0.0
    var axis = 0
    var sign = 0.0

    for (i in 0..2) {
        val segFrom = from[i]
        val segTo = to[i]
        val boxBegin = position[i]
        val boxEnd = boxBegin + size[i]
        val cmin: Double
        val cmax: Double
        val csign: Double

        if (segFrom < segTo) {

            if (segFrom > boxEnd || segTo < boxBegin)
                return Triple(false, null, null)
            val length = segTo - segFrom
            cmin = if (segFrom < boxBegin) ((boxBegin - segFrom) / length) else 0.0
            cmax = if (segTo > boxEnd) ((boxEnd - segFrom) / length) else 1.0
            csign = -1.0
        } else {
            if (segTo > boxEnd || segFrom < boxBegin)
                return Triple(false, null, null)
            val length = segTo - segFrom
            cmin = if (segFrom > boxEnd) (boxEnd - segFrom) / length else 0.0
            cmax = if (segTo < boxBegin) (boxBegin - segFrom) / length else 1.0
            csign = 1.0
        }
        if (cmin > min) {
            min = cmin
            axis = i
            sign = csign
        }
        if (cmax < max)
            max = cmax
        if (max < min)
            return Triple(false, null, null)
    }

    val rel = to - from
    val ret1: Vector3?
    val ret2: Vector3?
    if (normal) {
        ret2 = Vector3()
        ret2[axis] = sign
    } else
        ret2 = null
    ret1 = if (clip)
        from + rel * min
    else
        null
    return Triple(true, ret1, ret2)
}

fun AABB.intersectsPlane(p_plane: Plane): Boolean {
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

fun AABB.getLongestAxis(): Vector3 {
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

fun AABB.getLongestAxisIndex(): Int {
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

fun AABB.getShortestAxis(): Vector3 {
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

fun AABB.getShortestAxisIndex(): Int {
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

fun AABB.merge(p_with: AABB): AABB {
    val aabb = this
    aabb.mergeWith(p_with)
    return aabb
}

fun AABB.expand(p_vector: Vector3): AABB {
    val aabb = this
    aabb.expandTo(p_vector)
    return aabb
}

fun AABB.grow(p_by: Double): AABB {
    val aabb = this
    aabb.growBy(p_by)
    return aabb
}

fun AABB.getEdge(p_edge: Int): Pair<Vector3, Vector3> {
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

