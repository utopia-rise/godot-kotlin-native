@file:Suppress("unused", "MemberVisibilityCanBePrivate")
package godot.core

import godot.gdnative.*
import kotlinx.cinterop.*
import kotlin.math.*

class Color(var r: Double, var g: Double, var b: Double, var a: Double = 1.0) : Comparable<Color>, CoreType {
    constructor() :
            this(0.0, 0.0, 0.0, 1.0)

    constructor(r: Number, g: Number, b: Number, a: Number = 1.0) :
            this(r.toDouble(), g.toDouble(), b.toDouble(), a.toDouble())



    internal constructor(native: CValue<godot_color>) : this() {
        memScoped {
            this@Color.setRawMemory(native.ptr)
        }
    }
    internal constructor(mem: COpaquePointer) : this() {
        this.setRawMemory(mem)
    }


    override fun getRawMemory(memScope: MemScope): COpaquePointer {
        return cValuesOf(r.toFloat(), g.toFloat(), b.toFloat(), a.toFloat()).getPointer(memScope)
    }

    override fun setRawMemory(mem: COpaquePointer) {
        val arr = mem.reinterpret<FloatVar>()
        r = arr[0].toDouble()
        g = arr[1].toDouble()
        b = arr[2].toDouble()
        a = arr[3].toDouble()
    }



    operator fun get(n: Int): Double =
            when (n) {
                0 -> r
                1 -> g
                2 -> b
                3 -> a
                else -> throw IndexOutOfBoundsException()
            }

    operator fun set(n: Int, f: Double): Unit =
            when (n) {
                0 -> r = f
                1 -> g = f
                2 -> b = f
                3 -> a = f
                else -> throw IndexOutOfBoundsException()
            }

    override fun equals(other: Any?): Boolean =
            when (other) {
                is Color -> (r == other.r && g == other.g && b == other.b && a == other.a)
                else -> false
            }

    fun to32(): Int {
        var c: Int = (a * 255).roundToInt()
        c = c shl 8
        c = c or (r * 255).roundToInt()
        c = c shl 8
        c = c or (g * 255).roundToInt()
        c = c shl 8
        c = c or (b * 255).roundToInt()

        return c
    }

    fun toARGB32(): Int {
        var c: Int = (a * 255).roundToInt()
        c = c shl 8
        c = c or (r * 255).roundToInt()
        c = c shl 8
        c = c or (g * 255).roundToInt()
        c = c shl 8
        c = c or (b * 255).roundToInt()

        return c
    }

    fun gray(): Double =
            (r + g + b) / 3.0

    fun geth(): Double {
        var min = minOf(r, g)
        min = minOf(min, b)
        var max = maxOf(r, g)
        max = maxOf(max, b)

        val delta = max - min
        if (delta == 0.0) return 0.0

        var h = when {
            r == max -> (g - b) / delta         // between yellow & magenta
            g == max -> 2 + (b - r) / delta     // between cyan & yellow
            else -> 4 + (r - g) / delta         // between magenta & cyan
        }

        h /= 6.0
        if (h < 0)
            h += 1.0

        return h
    }

    fun gets(): Double {
        var min = minOf(r, g)
        min = minOf(min, b)
        var max = maxOf(r, g)
        max = maxOf(max, b)

        val delta = max - min
        return if (max != 0.0) delta / max else 0.0
    }

    fun getv(): Double {
        var max = maxOf(r, g)
        max = maxOf(max, b)
        return max
    }

    fun sethsv(h: Double, s: Double, v: Double, alpha: Double) {
        val i = floor(h).toInt()
        val f: Double
        val p = v * (1 - s)
        val q: Double
        val t: Double

        a = alpha
        if (s == 0.0) {
            // acp_chromatic (grey)
            r = v
            g = v
            b = v
            return
        }

        var h2 = h * 6.0
        h2 = h2.rem(6.0)

        f = h2 - i
        q = v * (1 - s * f)
        t = v * (1 - s * (1 - f))

        when (i) {
            0 -> { // Red is the dominant color
                r = v
                g = t
                b = p
            }
            1 -> { // Green is the dominant color
                r = q
                g = v
                b = p
            }
            2 -> {
                r = p
                g = v
                b = t
            }
            3 -> { // Blue is the dominant color
                r = p
                g = q
                b = v
            }
            4 -> {
                r = t
                g = p
                b = v
            }
            else -> { // (5) Red is the dominant color
                r = v
                g = p
                b = q
            }
        }
    }

    fun invert() {
        r = 1.0 - r
        g = 1.0 - g
        b = 1.0 - b
    }

    fun inverted(): Color {
        val c = this
        c.invert()
        return c
    }

    fun contrast() {
        r = (r + 0.5).rem(1.0)
        g = (g + 0.5).rem(1.0)
        b = (b + 0.5).rem(1.0)
    }

    fun contrasted(): Color {
        val c = this
        c.contrast()
        return c
    }

    fun linearInterpolate(otherColor: Color, t: Double): Color {
        val res = this
        res.r += (t * (otherColor.r - r))
        res.g += (t * (otherColor.g - g))
        res.b += (t * (otherColor.b - b))
        res.a += (t * (otherColor.a - a))

        return res
    }

    fun blend(over: Color): Color {
        val res = Color()
        val sa = 1.0 - over.a
        if (res.a == 0.0) {
            return Color(0.0, 0.0, 0.0, 0.0)
        } else {
            res.r = (r * a * sa + over.r * over.a) / res.a
            res.g = (g * a * sa + over.g * over.a) / res.a
            res.b = (b * a * sa + over.b * over.a) / res.a
        }
        return res
    }

    fun toLinear(): Color {
        val red = if (r < 0.04045) r * (1.0 / 12.92) else ((r + 0.055) * (1.0 / (1.0 + 0.055))).pow(2.4)
        val green = if (g < 0.04045) g * (1.0 / 12.92) else ((g + 0.055) * (1.0 / (1.0 + 0.055))).pow(2.4)
        val blue = if (b < 0.04045) b * (1.0 / 12.92) else ((b + 0.055) * (1.0 / (1.0 + 0.055))).pow(2.4)
        return Color(red, green, blue, a)
    }

    fun hex(p_hex: Int): Color {
        val a: Double = (p_hex and 0xFF) / 255.0
        var hex = p_hex shr 8
        val b: Double = (hex and 0xFF) / 255.0
        hex = hex shr 8
        val g: Double = (hex and 0xFF) / 255.0
        hex = hex shr 8
        val r: Double = (hex and 0xFF) / 255.0

        return Color(r, g, b, a)
    }

    fun html(p_color: String): Color? {
        var color = p_color
        if (color.isEmpty())
            return Color()
        if (color[0] == '#')
            color = color.substring(1, color.length - 1)

        val alpha = when {
            color.length == 8 -> true
            color.length == 6 -> false
            else -> return null
        }

        var a = 255
        if (alpha) {
            a = parseCol(color, 0).toInt()
            if (a < 0) {
                return null
            }
        }

        val from = if (alpha) 2 else 0
        val r = parseCol(color, from + 0).toInt()
        val g = parseCol(color, from + 2).toInt()
        val b = parseCol(color, from + 4).toInt()
        if (r < 0 || g < 0 || b < 0) {
            return null
        }

        return Color(r / 255.0, g / 255.0, b / 255.0, a / 255.0)
    }

    fun htmlIsValid(p_color: String): Boolean {
        var color = p_color
        if (color.isEmpty())
            return false
        if (color[0] == '#')
            color = color.substring(1, color.length - 1)

        val alpha = when {
            color.length == 8 -> true
            color.length == 6 -> false
            else -> return false
        }

        val a: Int
        if (alpha) {
            a = parseCol(color, 0).toInt()
            if (a < 0) {
                return false
            }
        }

        val from = if (alpha) 2 else 0
        val r = parseCol(color, from + 0).toInt()
        val g = parseCol(color, from + 2).toInt()
        val b = parseCol(color, from + 4).toInt()
        if (r < 0 || g < 0 || b < 0) {
            return false
        }

        return true
    }


    companion object {
        fun parseCol(p_str: String, p_ofs: Int): Double {
            var ig = 0.0
            for (i in 0..1) {
                var v: Int
                val c: Char = p_str[i + p_ofs]

                when (c) {
                    in '0'..'9' -> v = c.toInt() - '0'.toInt()
                    in 'a'..'f' -> {
                        v = c.toInt() - 'a'.toInt()
                        v += 10
                    }
                    in 'A'..'F' -> {
                        v = c.toInt() - 'A'.toInt()
                        v += 10
                    }
                    else -> return -1.0
                }

                ig += if (i == 0)
                    v * 16
                else
                    v
            }
            return ig
        }

        fun toHex(p_val: Double): String {
            var v = (p_val * 255).toInt()
            v = when {
                v < 0 -> 0
                v > 255 -> 255
                else -> v
            }
            var ret = ""

            for (i in 0..1) {
                val c = shortArrayOf(0, 0)
                val lv = v and 0xF
                if (lv < 10)
                    c[0] = ('0'.toInt() + lv).toShort()
                else
                    c[0] = ('a'.toInt() + lv - 10).toShort()

                v = v shr 4
                val cs = String(charArrayOf(c[0].toChar()))
                ret = cs + ret
            }
            return ret
        }
    }

    fun toHtml(alpha: Boolean): String {
        var txt = ""
        txt += toHex(r)
        txt += toHex(g)
        txt += toHex(b)
        if (alpha)
            txt = toHex(a) + txt
        return txt
    }

    override fun compareTo(other: Color): Int {
        return when {
            r == other.r -> when {
                g == other.g -> when {
                    b == other.b -> when {
                        a < other.a -> -1
                        a == other.a -> 0
                        else -> 1
                    }
                    b < other.b -> -1
                    else -> 1
                }
                g < other.g -> -1
                else -> 1
            }
            r < other.r -> -1
            else -> 1
        }
    }

    override fun toString() = "$r, $g, $b, $a"
    override fun hashCode(): Int {
        var result = r.hashCode()
        result = 31 * result + g.hashCode()
        result = 31 * result + b.hashCode()
        result = 31 * result + a.hashCode()
        return result
    }
}