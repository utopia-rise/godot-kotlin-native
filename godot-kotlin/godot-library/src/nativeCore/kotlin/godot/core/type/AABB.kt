@file:Suppress("unused", "MemberVisibilityCanBePrivate")

package godot.core

import godot.gdnative.godot_aabb
import godot.gdnative.godot_aabb_layout
import godot.internal.type.*
import kotlinx.cinterop.*


class AABB(
    p_position: Vector3,
    p_size: Vector3
) : CoreType {

    @PublishedApi
    internal var _position = Vector3(p_position)

    @PublishedApi
    internal var _size = Vector3(p_size)


    //PROPERTIES
    /** Return a copy of the position Vector3
     * Warning: Writing position.x = 2 will only modify a copy, not the actual object.
     * To modify it, use position().
     * */
    inline var position
        get() = Vector3(_position)
        set(value) {
            _position = Vector3(value)
        }

    inline fun <T> position(block: Vector3.() -> T): T {
        return _position.block()
    }

    /** Return a copy of the size Vector3
     * Warning: Writing size.x = 2 will only modify a copy, not the actual object.
     * To modify it, use size().
     * */
    inline var size
        get() = Vector3(_size)
        set(value) {
            _size = Vector3(value)
        }

    inline fun <T> size(block: Vector3.() -> T): T {
        return _size.block()
    }

    /** Return a copy of the end Vector3
     * Warning: Writing end.x = 2 will only modify a copy, not the actual object.
     * To modify it, use end().
     * */
    inline var end: Vector3
        get() = _position + _size
        set(value) {
            _size = value - _position
        }

    inline fun <T> end(block: Vector3.() -> T): T {
        val vec = end
        val ret = vec.block()
        end = vec
        return ret
    }


    //CONSTRUCTOR
    constructor() :
        this(Vector3(), Vector3())

    constructor(other: AABB) :
        this(other._position, other._size)

    internal constructor(native: CValue<godot_aabb>) : this() {
        memScoped {
            this@AABB._setRawMemory(native.ptr)
        }
    }

    internal constructor(mem: COpaquePointer) : this() {
        this._setRawMemory(mem)
    }


    //INTEROP
    override fun _getRawMemory(memScope: MemScope): COpaquePointer {
        val value = cValue<godot_aabb_layout> {
            position.x = this@AABB._position._x.toGodotReal()
            position.y = this@AABB._position._y.toGodotReal()
            position.z = this@AABB._position._z.toGodotReal()
            size.x = this@AABB._size._x.toGodotReal()
            size.y = this@AABB._size._y.toGodotReal()
            size.z = this@AABB._size._z.toGodotReal()
        }
        return value.getPointer(memScope)
    }

    override fun _setRawMemory(mem: COpaquePointer) {
        val value = mem.reinterpret<godot_aabb_layout>().pointed
        _position._setRawMemory(value.position.ptr)
        _size._setRawMemory(value.size.ptr)
    }

    //API
    /**
     * Returns true if this AABB completely encloses another one.
     */
    fun encloses(other: AABB): Boolean {
        val srcMin = _position
        val srcMax = _position + _size
        val dstMin = other._position
        val dstMax = other._position + other._size
        return ((srcMin._x <= dstMin._x) &&
            (srcMax._x > dstMax._x) &&
            (srcMin._y <= dstMin._y) &&
            (srcMax._y > dstMax._y) &&
            (srcMin._z <= dstMin._z) &&
            (srcMax._z > dstMax._z))
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
        val begin = _position
        val end = _position + _size

        if (vector._x < begin._x) {
            begin._x = vector._x
        }
        if (vector._y < begin._y) {
            begin._y = vector._y
        }
        if (vector._z < begin._z) {
            begin._z = vector._z
        }

        if (vector._x > end._x) {
            end._x = vector._x
        }
        if (vector._y > end._y) {
            end._y = vector._y
        }
        if (vector._z > end._z) {
            end._z = vector._z
        }

        _position = begin
        _size = end - begin
    }

    /**
     * Returns the volume of the AABB.
     */
    fun getArea(): KotlinReal {
        return (_size._x * _size._y * _size._z).toKotlinReal()
    }

    /**
     * Gets the position of the 8 endpoints of the AABB in space.
     */
    fun getEndpoint(point: Int): Vector3 {
        return when (point) {
            0 -> Vector3(_position._x, _position._y, _position._z)
            1 -> Vector3(_position._x, _position._y, _position._z + _size._z)
            2 -> Vector3(_position._x, _position._y + _size._y, _position._z)
            3 -> Vector3(_position._x, _position._y + _size._y, _position._z + _size._z)
            4 -> Vector3(_position._x + _size._x, _position._y, _position._z)
            5 -> Vector3(_position._x + _size._x, _position._y, _position._z + _size._z)
            6 -> Vector3(_position._x + _size._x, _position._y + _size._y, _position._z)
            7 -> Vector3(_position._x + _size._x, _position._y + _size._y, _position._z + _size._z)
            else -> Vector3()
        }
    }

    /**
     * Returns the normalized longest axis of the AABB.
     */
    fun getLongestAxis(): Vector3 {
        var axis = Vector3(1.0f, 0.0f, 0.0f)
        var maxSize = _size._x

        if (_size._y > maxSize) {
            axis = Vector3(0.0f, 1.0f, 0.0f)
            maxSize = _size._y
        }

        if (_size._z > maxSize) {
            axis = Vector3(0.0f, 0.0f, 1.0f)
        }

        return axis
    }

    /**
     * Returns the index of the longest axis of the AABB (according to Vector3’s AXIS_* constants).
     */
    fun getLongestAxisIndex(): Int {
        var axis = 0
        var maxSize = _size._x

        if (_size._y > maxSize) {
            axis = 1
            maxSize = _size._y
        }

        if (_size._z > maxSize) {
            axis = 2
        }

        return axis
    }

    /**
     *  Returns the scalar length of the longest axis of the AABB.
     */
    fun getLongestAxisSize(): KotlinReal {
        var maxSize = _size._x
        if (_size._y > maxSize) {
            maxSize = _size._y
        }
        if (_size._z > maxSize) {
            maxSize = _size._z
        }
        return maxSize.toKotlinReal()
    }


    /**
     *  Returns the scalar length of the longest axis of the AABB.
     */
    fun getShortestAxis(): Vector3 {
        var axis = Vector3(1.0f, 0.0f, 0.0f)
        var minSize = _size._x

        if (_size._y < minSize) {
            axis = Vector3(0.0f, 1.0f, 0.0f)
            minSize = _size._y
        }

        if (_size._z < minSize) {
            axis = Vector3(0.0f, 0.0f, 1.0f)
        }

        return axis
    }

    /**
     * Gets the position of the 8 endpoints of the AABB in space.
     */
    fun getShortestAxisIndex(): Int {
        var axis = 0
        var maxSize = _size._x

        if (_size._y < maxSize) {
            axis = 1
            maxSize = _size._y
        }

        if (_size._z < maxSize) {
            axis = 2
        }

        return axis
    }

    /**
     * Gets the position of the 8 endpoints of the AABB in space.
     */
    fun getShortestAxisSize(): KotlinReal {
        var minSize = _size._x
        if (_size._y < minSize) {
            minSize = _size._y
        }

        if (_size._z < minSize) {
            minSize = _size._z
        }

        return minSize.toKotlinReal()
    }

    /**
     * Returns the support point in a given direction. This is useful for collision detection algorithms.
     */
    fun getSupport(normal: Vector3): Vector3 {
        val halfExtents = _size * 0.5f
        val ofs = _position + halfExtents

        return Vector3(
            if (normal._x > 0.0f) -halfExtents._x else halfExtents._x,
            if (normal._y > 0.0f) -halfExtents._y else halfExtents._y,
            if (normal._z > 0.0f) -halfExtents._z else halfExtents._z
        ) + ofs
    }

    /**
     * Returns a copy of the AABB grown a given amount of units towards all the sides.
     */
    fun grow(p_by: KotlinReal): AABB {
        val aabb = this
        aabb.growBy(p_by)
        return aabb
    }

    internal fun growBy(p_amount: KotlinReal) {
        val amount = p_amount.toGodotReal()
        _position._x -= amount
        _position._y -= amount
        _position._z -= amount
        _size._x += 2.0f * amount
        _size._y += 2.0f * amount
        _size._z += 2.0f * amount
    }

    /**
     * Returns true if the AABB is flat or empty.
     */
    fun hasNoArea(): Boolean {
        return (_size._x <= CMP_EPSILON || _size._y <= CMP_EPSILON || _size._z <= CMP_EPSILON)
    }

    /**
     * Returns true if the AABB is empty.
     */
    fun hasNoSurface(): Boolean {
        return (_size._x <= CMP_EPSILON && _size._y <= CMP_EPSILON && _size._z <= CMP_EPSILON)
    }

    /**
     * Returns true if the AABB contains a point.
     */
    fun hasPoint(point: Vector3): Boolean {
        return when {
            point._x < _position._x -> false
            point._y < _position._y -> false
            point._z < _position._z -> false
            point._x > _position._x + _size._x -> false
            point._y > _position._y + _size._y -> false
            point._z > _position._z + _size._z -> false
            else -> true
        }
    }

    /**
     * Returns the intersection between two AABB. An empty AABB (size 0,0,0) is returned on failure.
     */
    fun intersection(other: AABB): AABB {
        val srcMin = _position
        val srcMax = _position + _size
        val dstMin = other._position
        val dstMax = other._position + other._size

        val min = Vector3()
        val max = Vector3()

        if (srcMin._x > dstMax._x || srcMax._x < dstMin._x) {
            return AABB()
        } else {
            min._x = if (srcMin._x > dstMin._x) srcMin._x else dstMin._x
            max._x = if (srcMax._x < dstMax._x) srcMax._x else dstMax._x
        }

        if (srcMin._y > dstMax._y || srcMax._y < dstMin._y) {
            return AABB()
        } else {
            min._y = if (srcMin._y > dstMin._y) srcMin._y else dstMin._y
            max._y = if (srcMax._y < dstMax._y) srcMax._y else dstMax._y
        }

        if (srcMin._z > dstMax._z || srcMax._z < dstMin._z) {
            return AABB()
        } else {
            min._z = if (srcMin._z > dstMin._z) srcMin._z else dstMin._z
            max._z = if (srcMax._z < dstMax._z) srcMax._z else dstMax._z
        }

        return AABB(min, max - min)
    }

    /**
     * Returns true if the AABB overlaps with another.
     */
    fun intersects(other: AABB): Boolean {
        return when {
            _position._x >= (other._position._x + other._size._x) -> false
            (_position._x + _size._x) <= other._position._x -> false
            _position._y >= (other._position._y + other._size._y) -> false
            (_position._y + _size._y) <= other._position._y -> false
            _position._z >= (other._position._z + other._size._z) -> false
            (_position._z + _size._z) <= other._position._z -> false
            else -> true
        }
    }

    /**
     * Returns true if the AABB is on both sides of a plane.
     */
    fun intersectsPlane(p_plane: Plane): Boolean {
        val points = arrayOf(
            Vector3(_position._x, _position._y, _position._z),
            Vector3(_position._x, _position._y, _position._z + _size._z),
            Vector3(_position._x, _position._y + _size._y, _position._z),
            Vector3(_position._x, _position._y + _size._y, _position._z + _size._z),
            Vector3(_position._x + _size._x, _position._y, _position._z),
            Vector3(_position._x + _size._x, _position._y, _position._z + _size._z),
            Vector3(_position._x + _size._x, _position._y + _size._y, _position._z),
            Vector3(_position._x + _size._x, _position._y + _size._y, _position._z + _size._z)
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
        var min = 0.0f
        var max = 0.0f

        for (i in 0..2) {
            val segFrom = from[i].toGodotReal()
            val segTo = to[i].toGodotReal()
            val boxBegin = _position[i].toGodotReal()
            val boxEnd = boxBegin + _size[i].toGodotReal()
            val cmin: GodotReal
            val cmax: GodotReal

            if (segFrom < segTo) {
                if (segFrom > boxEnd || segTo < boxBegin) {
                    return false
                }
                val length = (segTo - segFrom).toGodotReal()
                cmin = if (segFrom < boxBegin) ((boxBegin - segFrom) / length) else 0.0f
                cmax = if (segTo > boxEnd) ((boxEnd - segFrom) / length) else 1.0f
            } else {
                if (segTo > boxEnd || segFrom < boxBegin) {
                    return false
                }
                val length = segTo - segFrom
                cmin = if (segFrom > boxEnd) (boxEnd - segFrom) / length else 0.0f
                cmax = if (segTo < boxBegin) (boxBegin - segFrom) / length else 1.0f
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
        return this._position.isEqualApprox(other._position) && this._size.isEqualApprox(other._size)
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
        val beg1 = _position
        val beg2 = other._position
        val end1 = _position + _size
        val end2 = other._position + other._size

        val min = Vector3()
        val max = Vector3()

        min._x = if (beg1._x < beg2._x) beg1._x else beg2._x
        min._y = if (beg1._y < beg2._y) beg1._y else beg2._y
        min._z = if (beg1._z < beg2._z) beg1._z else beg2._z

        max._x = if (end1._x > end2._x) end1._x else end2._x
        max._y = if (end1._y > end2._y) end1._y else end2._y
        max._z = if (end1._z > end2._z) end1._z else end2._z

        _position = min
        _size = max - min
    }

    //UTILITIES
    override fun _toVariant() = Variant(this)

    override fun equals(other: Any?): Boolean =
        when (other) {
            is AABB -> (_position == other._position && _size == other._size)
            else -> false
        }

    override fun toString(): String {
        return "AABB(position=$_position, size=$_size)"
    }

    override fun hashCode(): Int {
        var result = _position.hashCode()
        result = 31 * result + _size.hashCode()
        return result
    }
}
