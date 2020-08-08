@file:Suppress("unused", "MemberVisibilityCanBePrivate")

package godot.core

import godot.gdnative.godot_rect2
import godot.gdnative.godot_rect2_layout
import godot.gdnative.godot_vector2
import godot.internal.type.*
import kotlinx.cinterop.CValue
import kotlinx.cinterop.cValue
import kotlinx.cinterop.readValue
import kotlinx.cinterop.useContents
import kotlin.math.max
import kotlin.math.min

class Rect2 : CoreType<godot_rect2> {

    //########################INTERNAL#############################

    //FIELD
    @PublishedApi
    internal var _position: Vector2

    @PublishedApi
    internal var _size: Vector2


    //CONSTRUCTOR
    internal constructor(native: CValue<godot_rect2>) : this() {
        this.setRawMemory(native)
    }


    //INTEROP
    override fun getRawMemory(): CValue<godot_rect2> {
        return cValue<godot_rect2_layout> {
            position.x = this@Rect2._position._x
            position.y = this@Rect2._position._y
            size.x = this@Rect2._size._x
            size.y = this@Rect2._size._y
        } as CValue<godot_rect2>
    }

    override fun setRawMemory(native: CValue<godot_rect2>) {
        (native as CValue<godot_rect2_layout>).useContents {
            _position.setRawMemory(position.readValue() as CValue<godot_vector2>)
            _size.setRawMemory(size.readValue() as CValue<godot_vector2>)
        }
    }


    //HELPER
    internal fun expandTo(vector: Vector2) {
        val begin = _position
        val end = _position + _size

        if (vector._x < begin._x) {
            begin._x = vector._x
        }
        if (vector._y < begin._y) {
            begin._y = vector._y
        }
        if (vector._x > end._x) {
            end._x = vector._x
        }
        if (vector._y > end._y) {
            end._y = vector._y
        }

        _position = begin
        _size = end - begin
    }

    //########################PUBLIC###############################

    //PROPERTIES
    /** Return a copy of the position Vector3
     * Warning: Writing position.x = 2 will only modify a copy, not the actual object.
     * To modify it, use position().
     * */
    var position
        get() = Vector2(_position)
        set(value) {
            _position = Vector2(value)
        }

    inline fun <T> position(block: Vector2.() -> T): T {
        return _position.block()
    }

    /** Return a copy of the size Vector2
     * Warning: Writing size.x = 2 will only modify a copy, not the actual object.
     * To modify it, use size().
     * */
    var size
        get() = Vector2(_size)
        set(value) {
            _size = Vector2(value)
        }

    inline fun <T> size(block: Vector2.() -> T): T {
        return _size.block()
    }

    /** Return a copy of the end Vector2
     * Warning: Writing end.x = 2 will only modify a copy, not the actual object.
     * To modify it, use end().
     * */
    inline var end: Vector2
        get() = _position + _size
        set(value) {
            _size = value - _position
        }

    inline fun <T> end(block: Vector2.() -> T): T {
        val vec = end
        val ret = vec.block()
        end = vec
        return ret
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
    constructor() {
        _position = Vector2()
        _size = Vector2()
    }

    constructor(other: Rect2) {
        _position = Vector2(other._position)
        _size = Vector2(other._size)
    }

    constructor(position: Vector2, size: Vector2) {
        _position = Vector2(position)
        _size = Vector2(size)
    }

    constructor(x: GodotReal, y: GodotReal, width: GodotReal, height: GodotReal) {
        _position = Vector2(x, y)
        _size = Vector2(width, height)
    }

    constructor(x: Number, y: Number, width: Number, height: Number) {
        _position = Vector2(x, y)
        _size = Vector2(width, height)
    }


    //API
    /**
     *Returns a Rect2 with equivalent position and area, modified so that
     * the top-left corner is the origin and width and height are positive.
     */
    fun abs(): Rect2 {
        return Rect2(
            _position._x - min(_size._x, 0.0f),
            _position._x - min(_size._x, 0.0f),
            kotlin.math.abs(_size._x),
            kotlin.math.abs(_size._y)
        )
    }

    /**
     * Returns the intersection of this Rect2 and b.
     */
    fun clip(b: Rect2): Rect2 {
        if (!intersects(b)) return Rect2()

        b._position._x = max(b._position._x, _position._x)
        b._position._y = max(b._position._y, _position._y)

        val rectEnd = b._position + b._size
        val end = _position + _size

        b._size._x = min(rectEnd._x, end._x) - b._position._x
        b._size._y = min(rectEnd._y, end._y) - b._position._y

        return b
    }

    /**
     * Returns true if this Rect2 completely encloses another one.
     */
    fun encloses(b: Rect2): Boolean {
        return (b._position._x >= _position._x) && (b._position._y >= _position._y) &&
            ((b._position._x + b._size._x) < (_position._x + _size._x)) &&
            ((b._position._y + b._size._y) < (_position._y + _size._y))
    }


    /**
     * Returns this Rect2 expanded to include a given point.
     */
    fun expand(vector: Vector2): Rect2 {
        val r = Rect2(this._position, this._size)
        r.expandTo(vector)
        return r
    }

    /**
     * Returns the area of the Rect2.
     */
    fun getArea(): KotlinReal {
        return (_size._x * _size._y).toKotlinReal()
    }

    /**
     * Returns a copy of the Rect2 grown a given amount of units towards all the sides.
     */
    fun grow(by: KotlinReal): Rect2 {
        val amount = by.toGodotReal()
        val g = Rect2(this)
        g._position._x -= amount
        g._position._y -= amount
        g._size._x += amount * 2
        g._size._y += amount * 2
        return g
    }

    /**
     * Returns a copy of the Rect2 grown a given amount of units towards all the sides.
     */
    fun growIndividual(left: KotlinReal, top: KotlinReal, right: KotlinReal, bottom: KotlinReal): Rect2 {
        val g = Rect2(this)
        g._position._x -= left.toGodotReal()
        g._position._y -= top.toGodotReal()
        g._size._x += (left + right).toGodotReal()
        g._size._y += (top + bottom).toGodotReal()
        return g
    }

    /**
     * Returns a copy of the Rect2 grown a given amount of units towards all the sides.
     */
    fun growMargin(margin: Margin, by: KotlinReal): Rect2 {
        val amount = by.toGodotReal()
        val g = Rect2(this)
        when (margin) {
            Margin.LEFT   -> {
                g._position._x -= amount
                g._size._x += amount
            }
            Margin.RIGHT  -> {
                g._size._x += amount
            }
            Margin.TOP    -> {
                g._position._y -= amount
                g._size._y += amount
            }
            Margin.BOTTOM -> {
                g._size._y += amount
            }
        }
        return g
    }

    /**
     * Returns true if the Rect2 is flat or empty.
     */
    fun hasNoArea(): Boolean {
        return _size._x <= 0 || _size._y <= 0
    }

    /**
     * Returns true if the Rect2 contains a point.
     */
    fun hasPoint(point: Vector2): Boolean {
        return when {
            point._x < _position._x               -> false
            point._y < _position._y               -> false
            point._x >= (_position._x + _size._x) -> false
            point._y >= (_position._y + _size._y) -> false
            else                                  -> true
        }
    }

    /**
     * Returns true if the Rect2 overlaps with b (i.e. they have at least one point in common).
     * If include_borders is true, they will also be considered overlapping if their borders touch, even without intersection.
     */
    fun intersects(b: Rect2, includeBorders: Boolean = false): Boolean {
        if (includeBorders) {
            return when {
                _position._x > (b._position._x + b._size._x) -> false
                (_position._x + _size._x) < b._position._x   -> false
                _position._y > (b._position._y + b._size._y) -> false
                (_position._y + _size._y) < b._position._y   -> false
                else                                         -> true
            }
        } else {
            return when {
                _position._x >= (b._position._x + b._size._x) -> false
                (_position._x + _size._x) <= b._position._x   -> false
                _position._y >= (b._position._y + b._size._y) -> false
                (_position._y + _size._y) <= b._position._y   -> false
                else                                          -> true
            }
        }
    }

    /**
     * Returns true if this Rect2 and rect are approximately equal, by calling is_equal_approx on each component.
     */
    fun isEqualApprox(b: Rect2): Boolean {
        return b._position.isEqualApprox(this._position) && b._size.isEqualApprox(this._size)
    }

    /**
     * Returns a larger Rect2 that contains this Rect2 and b.
     */
    fun merge(b: Rect2): Rect2 {
        val ret = Rect2()

        ret._position._x = min(b._position._x, _position._x)
        ret._position._y = min(b._position._y, _position._y)

        ret._size._x = max(b._position._x + b._size._x, _position._x + _size._x)
        ret._size._y = max(b._position._y + b._size._y, _position._y + _size._y)

        ret._size = b._size - b._position //make relative again

        return ret
    }


    //UTILITIES
    override fun toVariant() = Variant(this)

    override fun equals(other: Any?): Boolean {
        return when (other) {
            is Rect2 -> _position == other._position && _size == other._size
            else     -> false
        }
    }

    override fun toString(): String {
        return "$_position, $_size"
    }


    override fun hashCode(): Int {
        var result = _position.hashCode()
        result = 31 * result + _size.hashCode()
        return result
    }
}
