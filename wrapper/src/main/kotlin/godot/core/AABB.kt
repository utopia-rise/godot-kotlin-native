package kotlin.godot.core

<<<<<<< Updated upstream
import kotlinx.cinterop.*


class AABB: CoreType {
    var position: Vector3
    var size: Vector3
=======
import godot.godot_aabb
import godot.godot_basis
import kotlinx.cinterop.*
import kotlin.godot.core.Defs.Companion.CMP_EPSILON

class AABB: CoreType {

    lateinit var position: Vector3
    lateinit var size: Vector3
>>>>>>> Stashed changes

    constructor(p_pos: Vector3, p_size: Vector3) {
        position = p_pos
        size = p_size
    }

    constructor() :
            this(Vector3(), Vector3())

<<<<<<< Updated upstream

=======
>>>>>>> Stashed changes
    override fun getRawMemory(memScope: MemScope): COpaquePointer {
        return cValuesOf(position[0], position[1], position[2], size[0], size[1], size[2]).getPointer(memScope)
    }

    override fun setRawMemory(mem: COpaquePointer) {
        val arr = mem.reinterpret<FloatVar>()
        position[0] = arr[0]
        position[1] = arr[1]
        position[2] = arr[2]
<<<<<<< Updated upstream
        size[0] = arr[3]
        size[1] = arr[4]
        size[2] = arr[5]
    }

=======
        size[0]     = arr[3]
        size[1]     = arr[4]
        size[2]     = arr[5]
    }

    internal constructor(native: CValue<godot_aabb>) {
        memScoped {
            this@AABB.setRawMemory(native.ptr)
        }
    }

    internal constructor(mem: COpaquePointer) {
        this.setRawMemory(mem)
    }
>>>>>>> Stashed changes

    fun has_no_area(): Boolean =
            (size.x <= CMP_EPSILON || size.y <= CMP_EPSILON || size.z <= CMP_EPSILON)

    fun has_no_surface(): Boolean =
            (size.x <= CMP_EPSILON && size.y <= CMP_EPSILON && size.z <= CMP_EPSILON)

    fun get_position(): Vector3 = position
    fun set_position(p_position: Vector3) {
        position = p_position
    }

    fun get_size(): Vector3 = size
    fun set_size(p_size: Vector3) {
        size = p_size
    }

    fun intersects(p_aabb: AABB): Boolean {
        if (position.x >= (p_aabb.position.x + p_aabb.size.x))
            return false
        if ((position.x + size.x) <= p_aabb.position.x)
            return false
        if (position.y >= (p_aabb.position.y + p_aabb.size.y))
            return false
        if ((position.y + size.y) <= p_aabb.position.y)
            return false
        if (position.z >= (p_aabb.position.z + p_aabb.size.z))
            return false
        if ((position.z + size.z) <= p_aabb.position.z)
            return false

        return true
    }

    fun intersects_inclusive(p_aabb: AABB): Boolean {
        if (position.x > (p_aabb.position.x + p_aabb.size.x))
            return false
        if ((position.x + size.x) < p_aabb.position.x)
            return false
        if (position.y > (p_aabb.position.y + p_aabb.size.y))
            return false
        if ((position.y + size.y) < p_aabb.position.y)
            return false
        if (position.z > (p_aabb.position.z + p_aabb.size.z))
            return false
        if ((position.z + size.z) < p_aabb.position.z)
            return false

        return true
    }

    fun encloses(p_aabb: AABB): Boolean {
        val src_min = position
        val src_max = position + size
        val dst_min = p_aabb.position
        val dst_max = p_aabb.position + p_aabb.size
        return ((src_min.x <= dst_min.x) &&
                (src_max.x > dst_max.x) &&
                (src_min.y <= dst_min.y) &&
                (src_max.y > dst_max.y) &&
                (src_min.z <= dst_min.z) &&
                (src_max.z > dst_max.z))
    }

    fun get_support(p_normal: Vector3): Vector3 {
        val half_extents = size * 0.5f
        val ofs = position + half_extents

        return Vector3(
                if (p_normal.x > 0f) -half_extents.x else half_extents.x,
                if (p_normal.y > 0f) -half_extents.y else half_extents.y,
                if (p_normal.z > 0f) -half_extents.z else half_extents.z
        ) + ofs
    }

    fun get_endpoint(p_point: Int): Vector3 {
        when (p_point) {
            0 -> return Vector3(position.x, position.y, position.z);
            1 -> return Vector3(position.x, position.y, position.z + size.z);
            2 -> return Vector3(position.x, position.y + size.y, position.z);
            3 -> return Vector3(position.x, position.y + size.y, position.z + size.z);
            4 -> return Vector3(position.x + size.x, position.y, position.z);
            5 -> return Vector3(position.x + size.x, position.y, position.z + size.z);
            6 -> return Vector3(position.x + size.x, position.y + size.y, position.z);
            7 -> return Vector3(position.x + size.x, position.y + size.y, position.z + size.z)
        }
        return Vector3()
    }

    fun intersects_convex_shape(p_planes: Array<Plane>, p_plane_count: Int): Boolean {
        val half_extents = size * 0.5f
        val ofs = position + half_extents

        for (i in 0 until p_plane_count) {
            val p = p_planes[i]
            var point = Vector3(
                    if (p.normal.x > 0) -half_extents.x else half_extents.x,
                    if (p.normal.y > 0) -half_extents.y else half_extents.y,
                    if (p.normal.z > 0) -half_extents.z else half_extents.z
            )
            point += ofs
            if (p.is_point_over(point))
                return false
        }
        return true
    }

    fun has_point(p_point: Vector3): Boolean {
        if (p_point.x < position.x)
            return false
        if (p_point.y < position.y)
            return false
        if (p_point.z < position.z)
            return false
        if (p_point.x > position.x + size.x)
            return false
        if (p_point.y > position.y + size.y)
            return false
        if (p_point.z > position.z + size.z)
            return false

        return true
    }

    fun expand_to(p_vector: Vector3) {
        val begin = position
        val end = position + size

        if (p_vector.x < begin.x)
            begin.x = p_vector.x
        if (p_vector.y < begin.y)
            begin.y = p_vector.y
        if (p_vector.z < begin.z)
            begin.z = p_vector.z

        if (p_vector.x > end.x)
            end.x = p_vector.x
        if (p_vector.y > end.y)
            end.y = p_vector.y
        if (p_vector.z > end.z)
            end.z = p_vector.z

        position = begin
        size = end - begin
    }

    fun project_range_in_plane(p_plane: Plane): Pair<Float, Float> {
        val half_extents = size * 0.5f
        val center = position + half_extents

        val length: Float = p_plane.normal.abs().dot(half_extents)
        val distance: Float = p_plane.distance_to(center)
        return Pair(distance - length, distance + length)
    }

    fun get_longest_axis_size(): Float {
        var max_size = size.x
        if (size.y > max_size) {
            max_size = size.y
        }
        if (size.z > max_size) {
            max_size = size.z
        }
        return max_size
    }

    fun get_shortest_axis_size(): Float {
        var min_size = size.x
        if (size.y < min_size) {
            min_size = size.y
        }

        if (size.z < min_size) {
            min_size = size.z
        }

        return min_size
    }

    fun smits_intersect_rat(from: Vector3, dir: Vector3, t0: Float, t1: Float): Boolean {
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

    fun grow_by(p_amount: Float) {
        position.x -= p_amount
        position.y -= p_amount
        position.z -= p_amount
        size.x += 2f * p_amount
        size.y += 2f * p_amount
        size.z += 2f * p_amount
    }

    fun get_area(): Float =
            size.x * size.y * size.z

    override fun equals(other: Any?): Boolean =
            when (other) {
                is AABB -> (position == other.position && size == other.size)
                else -> false
            }

    fun merge_with(p_aabb: AABB) {
        val beg_1 = position
        val beg_2 = p_aabb.position
        val end_1 = Vector3(size.x, size.y, size.z) + beg_1
        val end_2 = Vector3(p_aabb.size.x, p_aabb.size.y, p_aabb.size.z) + beg_2

        val min = Vector3()
        val max = Vector3()

        min.x = if (beg_1.x < beg_2.x) beg_1.x else beg_2.x
        min.y = if (beg_1.y < beg_2.y) beg_1.y else beg_2.y
        min.z = if (beg_1.z < beg_2.z) beg_1.z else beg_2.z

        max.x = if (end_1.x > end_2.x) end_1.x else end_2.x
        max.y = if (end_1.y > end_2.y) end_1.y else end_2.y
        max.z = if (end_1.z > end_2.z) end_1.z else end_2.z

        position = min
        size = max - min
    }

    fun intersection(p_aabb: AABB): AABB {
        val src_min = position
        val src_max = position + size
        val dst_min = p_aabb.position
        val dst_max = p_aabb.position + p_aabb.size

        val min = Vector3()
        val max = Vector3()

        if (src_min.x > dst_max.x || src_max.x < dst_min.x)
            return AABB()
        else {
            min.x = if (src_min.x > dst_min.x) src_min.x else dst_min.x
            max.x = if (src_max.x < dst_max.x) src_max.x else dst_max.x
        }
        if (src_min.y > dst_max.y || src_max.y < dst_min.y)
            return AABB()
        else {
            min.y = if (src_min.y > dst_min.y) src_min.y else dst_min.y
            max.y = if (src_max.y < dst_max.y) src_max.y else dst_max.y
        }

        if (src_min.z > dst_max.z || src_max.z < dst_min.z)
            return AABB()
        else {
            min.z = if (src_min.z > dst_min.z) src_min.z else dst_min.z
            max.z = if (src_max.z < dst_max.z) src_max.z else dst_max.z
        }

        return AABB(min, max - min)
    }

    fun intersects_ray(p_from: Vector3, p_dir: Vector3, r_clip: Vector3?, r_normal: Vector3?): Triple<Boolean, Vector3?, Vector3?> {
        var c1 = Vector3()
        var c2 = Vector3()
        val end = position + size
        var near = (-1e20).toFloat()
        var far = 1e20.toFloat()
        var axis: Int = 0

        for (i in 0 until 3) {
            if (p_dir[i] == 0f) {
                if ((p_from[i] < position[i]) || (p_from[i] > end[i])) {
                    return Triple(false, null, null)
                }
            } else { // ray not parallel to planes in this direction
                c1[i] = (position[i] - p_from[i]) / p_dir[i]
                c2[i] = (end[i] - p_from[i]) / p_dir[i]

                if (c1[i] > c2[i]) {
                    c1 = c2.also { c2 = c1 }
                }
                if (c1[i] > near) {
                    near = c1[i]
                    axis = i
                }
                if (c2[i] < far) {
                    far = c2[i]
                }
                if ((near > far) || (far < 0)) {
                    return Triple(false, r_clip, r_normal)
                }
            }
        }
        val ret1: Vector3? = if (r_clip != null) c1 else null
        val ret2: Vector3?
        if (r_normal != null) {
            ret2 = Vector3()
            ret2[axis] = if (p_dir[axis] != 0f) -1f else 1f
        } else ret2 = null

        return Triple(true, ret1, ret2)
    }

    fun intersects_segment(p_from: Vector3, p_to: Vector3, r_clip: Vector3?, r_normal: Vector3?): Triple<Boolean, Vector3?, Vector3?> {
        var min = 0f
        var max = 0f
        var axis = 0
        var sign = 0f

        for (i in 0..2) {
            val seg_from = p_from[i]
            val seg_to = p_to[i]
            val box_begin = position[i]
            val box_end = box_begin + size[i]
            val cmin: Float
            val cmax: Float
            val csign: Float

            if (seg_from < seg_to) {

                if (seg_from > box_end || seg_to < box_begin)
                    return Triple(false, r_clip, r_normal)
                val length = seg_to - seg_from
                cmin = if (seg_from < box_begin) ((box_begin - seg_from) / length) else 0f
                cmax = if (seg_to > box_end) ((box_end - seg_from) / length) else 1f;
                csign = -1f
            } else {
                if (seg_to > box_end || seg_from < box_begin)
                    return Triple(false, r_clip, r_normal)
                val length = seg_to - seg_from;
                cmin = if (seg_from > box_end) (box_end - seg_from) / length else 0f
                cmax = if (seg_to < box_begin) (box_begin - seg_from) / length else 1f
                csign = 1f
            }
            if (cmin > min) {
                min = cmin
                axis = i
                sign = csign
            }
            if (cmax < max)
                max = cmax
            if (max < min)
                return Triple(false, r_clip, r_normal)
        }

        val rel = p_to - p_from
        val ret1: Vector3?
        val ret2: Vector3?

        if (r_normal != null) {
            ret2 = Vector3()
            ret2[axis] = sign
        } else
            ret2 = null

        if (r_clip != null)
            ret1 = p_from + rel * min
        else
            ret1 = null

        return Triple(true, ret1, ret2)
    }

    fun intersects_plane(p_plane: Plane): Boolean {
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
            if (p_plane.distance_to(points[i]) > 0)
                over = true
            else
                under = true
        }

        return under && over
    }

    fun get_longest_axis(): Vector3 {
        var axis = Vector3(1f, 0f, 0f)
        var max_size = size.x

        if (size.y > max_size) {
            axis = Vector3(0f, 1f, 0f)
            max_size = size.y
        }

        if (size.z > max_size) {
            axis = Vector3(0f, 0f, 1f)
            max_size = size.z
        }

        return axis
    }

    fun get_longest_axis_index(): Int {
        var axis = 0
        var max_size = size.x

        if (size.y > max_size) {
            axis = 1
            max_size = size.y
        }

        if (size.z > max_size) {
            axis = 2
            max_size = size.z
        }

        return axis
    }

    fun get_shortest_axis(): Vector3 {
        var axis = Vector3(1f, 0f, 0f)
        var min_size = size.x

        if (size.y < min_size) {
            axis = Vector3(0f, 1f, 0f)
            min_size = size.y
        }

        if (size.z < min_size) {
            axis = Vector3(0f, 0f, 1f)
            min_size = size.z
        }

        return axis
    }

    fun get_shortest_axis_index(): Int {
        var axis = 0
        var max_size = size.x

        if (size.y < max_size) {
            axis = 1
            max_size = size.y
        }

        if (size.z < max_size) {
            axis = 2
            max_size = size.z
        }

        return axis
    }

    fun merge(p_with: AABB): AABB {
        val aabb = this
        aabb.merge_with(p_with)
        return aabb
    }

    fun expand(p_vector: Vector3): AABB {
        val aabb = this
        aabb.expand_to(p_vector)
        return aabb
    }

    fun grow(p_by: Float): AABB {
        val aabb = this
        aabb.grow_by(p_by)
        return aabb
    }

    fun get_edge(p_edge: Int): Pair<Vector3?, Vector3?> {
        val r_from: Vector3?
        val r_to: Vector3?
        when (p_edge) {
            0 -> {
                r_from = Vector3(position.x + size.x, position.y, position.z)
                r_to = Vector3(position.x, position.y, position.z)
            }
            1 -> {
                r_from = Vector3(position.x + size.x, position.y, position.z + size.z)
                r_to = Vector3(position.x + size.x, position.y, position.z)
            }
            2 -> {
                r_from = Vector3(position.x, position.y, position.z + size.z)
                r_to = Vector3(position.x + size.x, position.y, position.z + size.z)
            }
            3 -> {
                r_from = Vector3(position.x, position.y, position.z)
                r_to = Vector3(position.x, position.y, position.z + size.z)
            }
            4 -> {
                r_from = Vector3(position.x, position.y + size.y, position.z)
                r_to = Vector3(position.x + size.x, position.y + size.y, position.z)
            }
            5 -> {
                r_from = Vector3(position.x + size.x, position.y + size.y, position.z)
                r_to = Vector3(position.x + size.x, position.y + size.y, position.z + size.z)
            }
            6 -> {
                r_from = Vector3(position.x + size.x, position.y + size.y, position.z + size.z)
                r_to = Vector3(position.x, position.y + size.y, position.z + size.z)
            }
            7 -> {
                r_from = Vector3(position.x, position.y + size.y, position.z + size.z)
                r_to = Vector3(position.x, position.y + size.y, position.z)
            }
            8 -> {
                r_from = Vector3(position.x, position.y, position.z + size.z)
                r_to = Vector3(position.x, position.y + size.y, position.z + size.z)
            }
            9 -> {
                r_from = Vector3(position.x, position.y, position.z)
                r_to = Vector3(position.x, position.y + size.y, position.z)
            }
            10 -> {
                r_from = Vector3(position.x + size.x, position.y, position.z)
                r_to = Vector3(position.x + size.x, position.y + size.y, position.z)
            }
            11 -> {
                r_from = Vector3(position.x + size.x, position.y, position.z + size.z)
                r_to = Vector3(position.x + size.x, position.y + size.y, position.z + size.z)
            }
            else -> {
                r_from = null
                r_to = null
            }
        }
        return Pair(r_from, r_to)
    }

    override fun toString(): String =
            "$position - $size"
}