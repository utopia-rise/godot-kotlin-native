package kotlin.godot.core

import godot.*
import kotlinx.cinterop.*
import platform.posix.cosf
import kotlin.math.*

data class Vector2(var x: Float, var y: Float) {

    var width: Float
        get() = x
        set(value) {
            x = value
        }
    var height: Float
        get() = y
        set(value) {
            y = value
        }

    operator fun plus(p_v: Vector2): Vector2 =
            Vector2(x + p_v.x, y + p_v.y)

    operator fun minus(p_v: Vector2): Vector2 =
            Vector2(x - p_v.x, y - p_v.y)

    operator fun times(p_v1: Vector2): Vector2 =
            Vector2(x * p_v1.x, y * p_v1.y)

    operator fun times(rvalue: Float): Vector2 =
            Vector2(x * rvalue, y * rvalue)

    operator fun div(p_v1: Vector2): Vector2 =
            Vector2(x / p_v1.x, y / p_v1.y)

    operator fun div(rvalue: Float): Vector2 =
            Vector2(x / rvalue, y / rvalue)

    operator fun unaryMinus(): Vector2 =
            Vector2(-x, -y)

    fun equals(p_vec2: Vector2): Boolean =
            (x == p_vec2.x && y == p_vec2.y)

    fun normalize(): Unit {
        var l: Float = x*x + y*y
        if (l != 0f) {
            l = sqrt(l)
            x /= l
            y /= l
        }
    }

    fun normalized(): Vector2 {
        val v: Vector2 = this
        v.normalize()
        return v
    }

    fun length(): Float =
            sqrt(x*x + y*y)

    fun length_squared(): Float =
            x*x + y*y

    fun distance_to(p_vector2: Vector2): Float =
            sqrt((x - p_vector2.x) * (x - p_vector2.x) + (y - p_vector2.y) * (y - p_vector2.y))

    fun distance_squared_to(p_vector2: Vector2): Float =
            (x - p_vector2.x) * (x - p_vector2.x) + (y - p_vector2.y) * (y - p_vector2.y)

    fun angle_to(p_vector2: Vector2): Float =
            atan2(cross(p_vector2), dot(p_vector2))

    fun angle_to_point(p_vector2: Vector2): Float =
            atan2(y - p_vector2.y, x-p_vector2.x)

    fun dot(p_other: Vector2): Float =
            x * p_other.y + y * p_other.x

    fun cross(p_other: Vector2): Float =
            x * p_other.y - y * p_other.x

    fun cross(p_other: Float): Vector2 =
            Vector2(p_other * y, -p_other * x)

    fun project(p_vec: Vector2): Vector2 {
        val v1: Vector2 = p_vec
        val v2: Vector2 = this
        return v2 * (v1.dot(v2) / v2.dot(v2))
    }

    fun plane_project(p_d: Float, p_vec: Vector2): Vector2 =
            p_vec - this * (dot(p_vec) - p_d)

    fun clamped(p_len: Float): Vector2 {
        val l: Float = this.length()
        var v: Vector2 = this
        if (l > 0 && p_len < l) {
            v /= l
            v *= p_len
        }
        return v;
    }

    fun linear_interpolate(p_b: Vector2, p_t: Float): Vector2 {
        val res: Vector2 = this
        res.x+= (p_t * (p_b.x-x))
        res.y+= (p_t * (p_b.y-y))
        return res
    }

    fun cubic_interpolate(p_b: Vector2, p_pre_a: Vector2, p_post_b: Vector2, p_t: Float): Vector2 {
        val p0: Vector2 = p_pre_a
        val p1: Vector2 = this
        val p2: Vector2 = p_b
        val p3: Vector2 = p_post_b

        val t:  Float = p_t
        val t2: Float = t*t
        val t3: Float = t2*t

        val out: Vector2 =
                ( ( p1 * 2.0f) +
                ( -p0 + p2 ) * t +
                ( p0 * 2.0f - p1 * 5.0f + p2 * 4f - p3 ) * t2 +
                ( -p0 + p1 * 3.0f - p2 * 3.0f + p3 ) * t3 ) * 0.5f

        return out
    }

    fun slide(p_vec: Vector2): Vector2 =
            p_vec - this * this.dot(p_vec)

    fun reflect(p_vec: Vector2): Vector2 =
            p_vec - this * this.dot(p_vec) * 2.0f

    fun angle(): Float =
            atan2(y, x);

    fun set_rotation(p_radians: Float): Unit {
        x = cos(p_radians)
        y = sin(p_radians)
    }

    fun abs(): Vector2 =
            Vector2( kotlin.math.abs(x),  kotlin.math.abs(y) )

    fun rotated(p_by: Float): Vector2 {
        var v = Vector2(0f, 0f)
        v.set_rotation(this.angle() + p_by)
        v *= length()
        return v
    }

    fun tangent(): Vector2 =
            Vector2(y,-x)

    fun floor(): Vector2 =
            Vector2(kotlin.math.floor(x), kotlin.math.floor(y))

    fun snapped(p_by: Vector2): Vector2 {
        val new_x: Float
        val new_y: Float

        new_x = if (p_by.x != 0f)
            kotlin.math.floor(x / p_by.x + 0.5f)
        else x

        new_y = if (p_by.y != 0f)
            kotlin.math.floor(y / p_by.y + 0.5f)
        else y

        return Vector2(new_x, new_y)
    }

    override fun toString() = "$x, $y"
}