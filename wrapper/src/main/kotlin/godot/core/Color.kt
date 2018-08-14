package kotlin.godot.core

import godot.*
import kotlinx.cinterop.*
import kotlin.math.*

class Color(var r: Float, var g: Float, var b: Float, var a: Float = 1f) : Comparable<Color>, CoreType {

    override fun getRawMemory(memScope: MemScope): COpaquePointer {
        return cValuesOf(r, g, b, a).getPointer(memScope)
    }

    override fun setRawMemory(mem: COpaquePointer) {
        val arr = mem.reinterpret<FloatVar>()
        r = arr[0]
        g = arr[1]
        b = arr[2]
        a = arr[3]
    }

    constructor() :
            this(0f, 0f, 0f, 1f)

    constructor(r: Number, g: Number, b: Number, a: Number = 1f) :
            this(r.toFloat(), g.toFloat(), b.toFloat(), a.toFloat())

    internal constructor(native: CValue<godot_color>) : this() {
        memScoped {
            this@Color.setRawMemory(native.ptr)
        }
    }

    internal constructor(mem: COpaquePointer) : this() {
        this.setRawMemory(mem)
    }

    operator fun get(n: Int): Float =
            when (n) {
                0 -> r
                1 -> g
                2 -> b
                3 -> a
                else -> throw IndexOutOfBoundsException()
            }

    operator fun set(n: Int, f: Float): Unit =
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

    fun gray(): Float =
            (r + g + b) / 3f

    fun geth(): Float {
        var min = minOf(r, g)
        min = minOf(min, b)
        var max = maxOf(r, g)
        max = maxOf(max, b)

        val delta = max - min
        if (delta == 0f) return 0f

        var h: Float
        if (r == max)
            h = (g - b) / delta         // between yellow & magenta
        else if (g == max)
            h = 2 + (b - r) / delta     // between cyan & yellow
        else
            h = 4 + (r - g) / delta     // between magenta & cyan

        h /= 6f
        if (h < 0)
            h += 1f

        return h
    }

    fun gets(): Float {
        var min = minOf(r, g)
        min = minOf(min, b)
        var max = maxOf(r, g)
        max = maxOf(max, b)

        val delta = max - min
        return if (max != 0f) delta / max else 0f
    }

    fun getv(): Float {
        var max = maxOf(r, g)
        max = maxOf(max, b)
        return max
    }

    fun sethsv(h: Float, s: Float, v: Float, alpha: Float) {
        val i: Int
        val f: Float
        val p: Float
        val q: Float
        val t: Float

        a = alpha
        if (s == 0f) {
            // acp_chromatic (grey)
            r = v
            g = v
            b = v
            return
        }

        var h2 = h * 6f
        h2 = h2.rem(6f)
        i = floor(h).toInt()

        f = h2 - i
        p = v * (1 - s)
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
        r = 1f - r
        g = 1f - g
        b = 1f - b
    }

    fun inverted(): Color {
        val c = this
        c.invert()
        return c
    }

    fun contrast() {
        r = (r + 0.5f).rem(1f)
        g = (g + 0.5f).rem(1f)
        b = (b + 0.5f).rem(1f)
    }

    fun contrasted(): Color {
        val c = this
        c.contrast()
        return c
    }

    fun linearInterpolate(otherColor: Color, t: Float): Color {
        val res = this
        res.r += (t * (otherColor.r - r))
        res.g += (t * (otherColor.g - g))
        res.b += (t * (otherColor.b - b))
        res.a += (t * (otherColor.a - a))

        return res
    }

    fun blend(over: Color): Color {
        val res = Color()
        val sa = 1f - over.a
        if (res.a == 0f) {
            return Color(0f, 0f, 0f, 0f)
        } else {
            res.r = (r * a * sa + over.r * over.a) / res.a
            res.g = (g * a * sa + over.g * over.a) / res.a
            res.b = (b * a * sa + over.b * over.a) / res.a
        }
        return res
    }

    fun toLinear(): Color {
        val red = if (r < 0.04045f) r * (1.0f / 12.92f) else ((r + 0.055f) * (1.0f / (1f + 0.055f))).pow(2.4f)
        val green = if (g < 0.04045f) g * (1.0f / 12.92f) else ((g + 0.055f) * (1.0f / (1f + 0.055f))).pow(2.4f)
        val blue = if (b < 0.04045f) b * (1.0f / 12.92f) else ((b + 0.055f) * (1.0f / (1f + 0.055f))).pow(2.4f)
        return Color(red, green, blue, a)
    }

    fun hex(p_hex: Int): Color {
        val a: Float = (p_hex and 0xFF) / 255f
        var hex = p_hex shr 8
        val b: Float = (hex and 0xFF) / 255f
        hex = hex shr 8
        val g: Float = (hex and 0xFF) / 255f
        hex = hex shr 8
        val r: Float = (hex and 0xFF) / 255f

        return Color(r, g, b, a)
    }

    fun html(p_color: String): Color {
        var color = p_color
        if (color.isEmpty())
            return Color()
        if (color[0] == '#')
            color = color.substring(1, color.length - 1)

        var alpha = false

        if (color.length == 8) {
            alpha = true
        } else if (color.length == 6) {
            alpha = false
        } else {
            ERR_PRINT("Invalid Color Code:$p_color")
            return Color()
        }

        var a = 255
        if (alpha) {
            a = parseCol(color, 0).toInt()
            if (a < 0) {
                ERR_PRINT("Invalid Color Code:$p_color")
                return Color()
            }
        }

        val from = if (alpha) 2 else 0
        val r = parseCol(color, from + 0).toInt()
        val g = parseCol(color, from + 2).toInt()
        val b = parseCol(color, from + 4).toInt()
        if (r < 0 || g < 0 || b < 0) {
            ERR_PRINT("Invalid Color Code:$p_color")
            return Color()
        }

        return Color(r / 255.0f, g / 255.0f, b / 255.0f, a / 255.0f)
    }

    fun htmlIsValid(p_color: String): Boolean {
        var color = p_color
        if (color.isEmpty())
            return false
        if (color[0] == '#')
            color = color.substring(1, color.length - 1)

        var alpha = false

        if (color.length == 8) {
            alpha = true
        } else if (color.length == 6) {
            alpha = false
        } else {
            return false
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
        fun parseCol(p_str: String, p_ofs: Int): Float {
            var ig = 0f
            for (i in 0..1) {
                var v = 0
                val c: Char = p_str[i + p_ofs]

                if (c in '0'..'9')
                    v = c.toInt() - '0'.toInt()
                else if (c in 'a'..'f') {
                    v = c.toInt() - 'a'.toInt()
                    v += 10
                } else if (c in 'A'..'F') {
                    v = c.toInt() - 'A'.toInt()
                    v += 10
                } else return -1f

                if (i == 0)
                    ig += v * 16
                else
                    ig += v
            }
            return ig
        }

        fun toHex(p_val: Float): String {
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

    fun toHtml(p_alpha: Boolean): String {
        var txt = ""
        txt += toHex(r)
        txt += toHex(g)
        txt += toHex(b)
        if (p_alpha)
            txt = toHex(a) + txt
        return txt
    }

    override fun compareTo(other: Color): Int {
        if (r == other.r) {
            if (g == other.g) {
                if (b == other.b) {
                    return when {
                        a < other.a -> -1
                        a == other.a -> 0
                        else -> 1
                    }
                } else
                    return if (b < other.b) -1 else 1
            } else
                return if (g < other.g) -1 else 1
        } else
            return if (r < other.r) -1 else 1
    }

    override fun toString() = "$r, $g, $b, $a"
    external override fun hashCode(): Int {
        var result = r.hashCode()
        result = 31 * result + g.hashCode()
        result = 31 * result + b.hashCode()
        result = 31 * result + a.hashCode()
        return result
    }
}