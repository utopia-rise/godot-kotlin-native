@file:Suppress("unused", "MemberVisibilityCanBePrivate")

package godot.core

import godot.gdnative.godot_rect2
import godot.gdnative.godot_rect2_layout
import kotlinx.cinterop.*
import kotlin.math.max
import kotlin.math.min


class Rect2(var position: Vector2, var size: Vector2) : CoreType {
    //PROPERTIES
    inline var end: Vector2
        get() = position + size
        set(value) {
            size = value - position
        }

    //CONSTANTS
    enum class Margin(val value: Int) {
        LEFT(0),
        TOP(1),
        RIGHT(2),
        BOTTOM(3)
    }

    companion object {
        val MARGIN_LEFT = Margin.LEFT.value
        val MARGIN_TOP = Margin.TOP.value
        val MARGIN_RIGHT = Margin.RIGHT.value
        val MARGIN_BOTTOM = Margin.BOTTOM.value
    }

    //CONSTRUCTOR
    constructor() :
        this(Vector2(), Vector2())

    constructor(x: RealT, y: RealT, width: RealT, height: RealT) :
        this(Vector2(x, y), Vector2(width, height))


    internal constructor(native: CValue<godot_rect2>) : this() {
        memScoped {
            this@Rect2.setRawMemory(native.ptr)
        }
    }

    internal constructor(mem: COpaquePointer) : this() {
        this.setRawMemory(mem)
    }


    //INTEROP
    override fun getRawMemory(memScope: MemScope): COpaquePointer {
        val value = cValue<godot_rect2_layout> {
            position.x = this@Rect2.position.x.toFloat()
            position.y = this@Rect2.position.y.toFloat()
            size.x = this@Rect2.size.x.toFloat()
            size.y = this@Rect2.size.y.toFloat()
        }
        return value.getPointer(memScope)
    }

    override fun setRawMemory(mem: COpaquePointer) {
        val value = mem.reinterpret<godot_rect2_layout>().pointed
        position.setRawMemory(value.position.ptr)
        size.setRawMemory(value.size.ptr)
    }

    //API
    /**
     *Returns a Rect2 with equivalent position and area, modified so that
     * the top-left corner is the origin and width and height are positive.
     */
    fun abs(): Rect2 {
        return Rect2(
            position.x - kotlin.math.min(size.x, 0.0),
            position.x - kotlin.math.min(size.x, 0.0),
            kotlin.math.abs(size.x),
            kotlin.math.abs(size.y)
        )
    }

    /**
     * Returns the intersection of this Rect2 and b.
     */
    fun clip(rect: Rect2): Rect2 {
        if (!intersects(rect)) return Rect2()

        rect.position.x = max(rect.position.x, position.x)
        rect.position.y = max(rect.position.y, position.y)

        val rectEnd = rect.position + rect.size
        val end = position + size

        rect.size.x = min(rectEnd.x, end.x) - rect.position.x
        rect.size.y = min(rectEnd.y, end.y) - rect.position.y

        return rect
    }

    /**
     * Returns true if this Rect2 completely encloses another one.
     */
    fun encloses(rect: Rect2): Boolean {
        return (rect.position.x >= position.x) && (rect.position.y >= position.y) &&
            ((rect.position.x + rect.size.x) < (position.x + size.x)) &&
            ((rect.position.y + rect.size.y) < (position.y + size.y))
    }

    /**
     * Returns this Rect2 expanded to include a given point.
     */
    fun expand(vector: Vector2): Rect2 {
        val r = Rect2(this.position, this.size)
        r.expandTo(vector)
        return r
    }


    internal fun expandTo(vector: Vector2) {
        val begin = position
        val end = position + size

        if (vector.x < begin.x) {
            begin.x = vector.x
        }
        if (vector.y < begin.y) {
            begin.y = vector.y
        }
        if (vector.x > end.x) {
            end.x = vector.x
        }
        if (vector.y > end.y) {
            end.y = vector.y
        }

        position = begin
        size = end - begin
    }

    /**
     * Returns the area of the Rect2.
     */
    fun getArea(): RealT {
        return size.x * size.y
    }

    /**
     * Returns a copy of the Rect2 grown a given amount of units towards all the sides.
     */
    fun grow(by: RealT): Rect2 {
        val g = Rect2(this.position, this.size)
        g.position.x -= by
        g.position.y -= by
        g.size.x += by * 2
        g.size.y += by * 2
        return g
    }

    /**
     * Returns a copy of the Rect2 grown a given amount of units towards all the sides.
     */
    fun growIndividual (left: RealT, top: RealT,right: RealT,bottom: RealT ): Rect2 {
        val g = Rect2(this.position, this.size)
        g.position.x -= left
        g.position.y -= top
        g.size.x += left + right
        g.size.y += top + bottom
        return g
    }

    /**
     * Returns a copy of the Rect2 grown a given amount of units towards all the sides.
     */
    fun growMargin (margin: Margin, by: RealT ): Rect2 {
        val g = Rect2(this.position, this.size)
        g.position.x -= by
        g.position.y -= by
        g.size.x += by * 2
        g.size.y += by * 2
        return g
    }

    /**
     * Returns true if the Rect2 is flat or empty.
     */
    fun hasNoArea(): Boolean {
        return size.x <= 0 || size.y <= 0
    }

    /**
     * Returns true if the Rect2 contains a point.
     */
    fun hasPoint(point: Vector2): Boolean {
        return when {
            point.x < position.x                -> false
            point.y < position.y                -> false
            point.x >= (position.x + size.x)    -> false
            point.y >= (position.y + size.y)    -> false
            else                                -> true
        }
    }

    /**
     * Returns true if the Rect2 overlaps with b (i.e. they have at least one point in common).
     * If include_borders is true, they will also be considered overlapping if their borders touch, even without intersection.
     */
    fun intersects(rect: Rect2): Boolean {
        return when {
            position.x >= (rect.position.x + rect.size.x)   -> false
            (position.x + size.x) <= rect.position.x        -> false
            position.y >= (rect.position.y + rect.size.y)   -> false
            (position.y + size.y) <= rect.position.y        -> false
            else                                            -> true
        }
    }

    /**
     * Returns true if this Rect2 and rect are approximately equal, by calling is_equal_approx on each component.
     */
    fun isEqualApprox(rect: Rect2): Boolean {
        return rect.position.isEqualApprox(this.position) && rect.size.isEqualApprox(this.size)
    }

    /**
     * Returns a larger Rect2 that contains this Rect2 and b.
     */
    fun merge(rect: Rect2): Rect2 {
        val ret = Rect2()

        ret.position.x = min(rect.position.x, position.x)
        ret.position.y = min(rect.position.y, position.y)

        ret.size.x = max(rect.position.x + rect.size.x, position.x + size.x)
        ret.size.y = max(rect.position.y + rect.size.y, position.y + size.y)

        ret.size = rect.size - rect.position //make relative again

        return ret
    }


    //UTILITIES
    override fun equals(other: Any?): Boolean {
        return when (other) {
            is Rect2 -> position == other.position && size == other.size
            else -> false
        }
    }

    override fun toString(): String {
        return "$position, $size"
    }


    override fun hashCode(): Int {
        var result = position.hashCode()
        result = 31 * result + size.hashCode()
        return result
    }
}
