@file:Suppress("unused", "MemberVisibilityCanBePrivate")

package godot.core

import godot.gdnative.godot_color
import godot.gdnative.godot_color_layout
import godot.internal.type.*
import kotlinx.cinterop.CValue
import kotlinx.cinterop.cValue
import kotlinx.cinterop.useContents
import kotlin.math.*


class Color : Comparable<Color>, CoreType<godot_color> {

    //########################INTERNAL#############################

    //FIELD
    @PublishedApi
    internal var _r: GodotReal

    @PublishedApi
    internal var _g: GodotReal

    @PublishedApi
    internal var _b: GodotReal

    @PublishedApi
    internal var _a: GodotReal


    //CONSTRUCTOR
    internal constructor(native: CValue<godot_color>) : this() {
        this@Color.setRawMemory(native)
    }


    //INTEROP
    override fun getRawMemory(): CValue<godot_color> {
        return cValue<godot_color_layout> {
            r = this@Color._r
            g = this@Color._g
            b = this@Color._b
            a = this@Color._a
        } as CValue<godot_color>
    }

    override fun setRawMemory(native: CValue<godot_color>) {
        (native as CValue<godot_color_layout>).useContents {
            _r = r
            _g = g
            _b = b
            _a = a
        }
    }


    //HELPER
    internal fun contrast() {
        _r = (_r + 0.5f).rem(1.0f)
        _g = (_g + 0.5f).rem(1.0f)
        _b = (_b + 0.5f).rem(1.0f)
    }

    internal fun invert() {
        _r = 1.0f - _r
        _g = 1.0f - _g
        _b = 1.0f - _b
    }

    private fun toByteColorCode(
        first: KotlinReal,
        second: KotlinReal,
        third: KotlinReal,
        fourth: KotlinReal,
        colorByte: ColorByte
    ): Long {
        val size = colorByte.size
        val shift = colorByte.shift
        var c: Long = (first * size).roundToLong()
        c = c shl shift
        c = c or (second * size).roundToLong()
        c = c shl shift
        c = c or (third * size).roundToLong()
        c = c shl shift
        c = c or (fourth * size).roundToLong()

        return c
    }

    private fun toHex(p_val: KotlinReal): String {
        var v = (p_val * 255).toInt()
        v = when {
            v < 0   -> 0
            v > 255 -> 255
            else    -> v
        }
        var ret = ""

        for (i in 0..1) {
            val c = shortArrayOf(0, 0)
            val lv = v and 0xF
            if (lv < 10) {
                c[0] = ('0'.toInt() + lv).toShort()
            } else {
                c[0] = ('a'.toInt() + lv - 10).toShort()
            }

            v = v shr 4
            val cs = String(charArrayOf(c[0].toChar()))
            ret = cs + ret
        }
        return ret
    }

    //########################PUBLIC###############################

    //PROPERTIES
    inline var r: KotlinReal
        get() = _r.toKotlinReal()
        set(value) {
            _r = value.toGodotReal()
        }

    inline var g: KotlinReal
        get() = _g.toKotlinReal()
        set(value) {
            _g = value.toGodotReal()
        }

    inline var b: KotlinReal
        get() = _b.toKotlinReal()
        set(value) {
            _b = value.toGodotReal()
        }

    inline var a: KotlinReal
        get() = _a.toKotlinReal()
        set(value) {
            _a = value.toGodotReal()
        }
    var r8: Int
        get() = (_r * 255).roundToInt()
        set(value) {
            _r = value / 255f
        }
    var g8: Int
        get() = (_g * 255).roundToInt()
        set(value) {
            _g = value / 255f
        }
    var b8: Int
        get() = (_b * 255).roundToInt()
        set(value) {
            _b = value / 255f
        }

    var a8: Int
        get() = (_a * 255).roundToInt()
        set(value) {
            _a = value / 255f
        }

    var h: KotlinReal
        get() {
            var min = min(_r, _g)
            min = min(min, _b)
            var max = max(_r, _g)
            max = max(max, _b)

            val delta = max - min

            if (isEqualApprox(delta, 0.0f)) return 0.0

            var h = when {
                _r == max -> ((_g - _b) / delta) // between yellow & magenta
                _g == max -> (2 + (_b - _r) / delta) // between cyan & yellow
                else      -> (4 + (_r - _g) / delta) // between magenta & cyan
            }

            h /= 6.0f
            if (h < 0) {
                h += 1.0f
            }

            return h.toKotlinReal()
        }
        set(value) {
            setHSV(value, s, v, a)
        }

    var s: KotlinReal
        get() {
            var min = min(_r, _g)
            min = min(min, _b)
            var max = max(_r, _g)
            max = max(max, _b)

            val delta = max - min

            return if (!isEqualApprox(max, 0f)) (delta / max).toKotlinReal() else 0.0
        }
        set(value) {
            setHSV(h, value, v, a)
        }

    var v: KotlinReal
        get() {
            var max = max(_r, _g)
            max = max(max, _b)
            return max.toKotlinReal()
        }
        set(value) {
            setHSV(h, s, value, a)
        }

    private fun setHSV(h: KotlinReal, s: KotlinReal, v: KotlinReal, alpha: KotlinReal) {
        val i = floor(h).toInt()
        val f: KotlinReal
        val p = v * (1 - s)
        val q: KotlinReal
        val t: KotlinReal

        _a = alpha.toGodotReal()
        if (isEqualApprox(s.toGodotReal(), 0f)) {
            // acp_chromatic (grey)
            _r = v.toGodotReal()
            _g = v.toGodotReal()
            _b = v.toGodotReal()
            return
        }

        var h2 = h * 6.0f
        h2 = h2.rem(6.0f)

        f = h2 - i
        q = v * (1 - s * f)
        t = v * (1 - s * (1 - f))

        when (i) {
            0    -> { // Red is the dominant color
                _r = v.toGodotReal()
                _g = t.toGodotReal()
                _b = p.toGodotReal()
            }
            1    -> { // Green is the dominant color
                _r = q.toGodotReal()
                _g = v.toGodotReal()
                _b = p.toGodotReal()
            }
            2    -> {
                _r = p.toGodotReal()
                _g = v.toGodotReal()
                _b = t.toGodotReal()
            }
            3    -> { // Blue is the dominant color
                _r = p.toGodotReal()
                _g = q.toGodotReal()
                _b = v.toGodotReal()
            }
            4    -> {
                _r = t.toGodotReal()
                _g = p.toGodotReal()
                _b = v.toGodotReal()
            }
            else -> { // (5) Red is the dominant color
                _r = v.toGodotReal()
                _g = p.toGodotReal()
                _b = q.toGodotReal()
            }
        }
    }

    //CONSTANTS
    private enum class ColorByte(val size: Int, val shift: Int) {
        BITS32(255, 8),
        BITS64(65535, 16)

    }

    companion object {
        inline val aliceblue: Color
            get() = Color(0.94f, 0.97f, 1.00f)
        inline val antiquewhite: Color
            get() = Color(0.98f, 0.92f, 0.84f)
        inline val aqua: Color
            get() = Color(0.00f, 1.00f, 1.00f)
        inline val aquamarine: Color
            get() = Color(0.50f, 1.00f, 0.83f)
        inline val azure: Color
            get() = Color(0.94f, 1.00f, 1.00f)
        inline val beige: Color
            get() = Color(0.96f, 0.96f, 0.86f)
        inline val bisque: Color
            get() = Color(1.00f, 0.89f, 0.77f)
        inline val black: Color
            get() = Color(0.00f, 0.00f, 0.00f)
        inline val blanchedalmond: Color
            get() = Color(1.00f, 0.92f, 0.80f)
        inline val blue: Color
            get() = Color(0.00f, 0.00f, 1.00f)
        inline val blueviolet: Color
            get() = Color(0.54f, 0.17f, 0.89f)
        inline val brown: Color
            get() = Color(0.65f, 0.16f, 0.16f)
        inline val burlywood: Color
            get() = Color(0.87f, 0.72f, 0.53f)
        inline val cadetblue: Color
            get() = Color(0.37f, 0.62f, 0.63f)
        inline val chartreuse: Color
            get() = Color(0.50f, 1.00f, 0.00f)
        inline val chocolate: Color
            get() = Color(0.82f, 0.41f, 0.12f)
        inline val coral: Color
            get() = Color(1.00f, 0.50f, 0.31f)
        inline val cornflower: Color
            get() = Color(0.39f, 0.58f, 0.93f)
        inline val cornsilk: Color
            get() = Color(1.00f, 0.97f, 0.86f)
        inline val crimson: Color
            get() = Color(0.86f, 0.08f, 0.24f)
        inline val cyan: Color
            get() = Color(0.00f, 1.00f, 1.00f)
        inline val darkblue: Color
            get() = Color(0.00f, 0.00f, 0.55f)
        inline val darkcyan: Color
            get() = Color(0.00f, 0.55f, 0.55f)
        inline val darkgoldenrod: Color
            get() = Color(0.72f, 0.53f, 0.04f)
        inline val darkgray: Color
            get() = Color(0.66f, 0.66f, 0.66f)
        inline val darkgreen: Color
            get() = Color(0.00f, 0.39f, 0.00f)
        inline val darkkhaki: Color
            get() = Color(0.74f, 0.72f, 0.42f)
        inline val darkmagenta: Color
            get() = Color(0.55f, 0.00f, 0.55f)
        inline val darkolivegreen: Color
            get() = Color(0.33f, 0.42f, 0.18f)
        inline val darkorange: Color
            get() = Color(1.00f, 0.55f, 0.00f)
        inline val darkorchid: Color
            get() = Color(0.60f, 0.20f, 0.80f)
        inline val darkred: Color
            get() = Color(0.55f, 0.00f, 0.00f)
        inline val darksalmon: Color
            get() = Color(0.91f, 0.59f, 0.48f)
        inline val darkseagreen: Color
            get() = Color(0.56f, 0.74f, 0.56f)
        inline val darkslateblue: Color
            get() = Color(0.28f, 0.24f, 0.55f)
        inline val darkslategray: Color
            get() = Color(0.18f, 0.31f, 0.31f)
        inline val darkturquoise: Color
            get() = Color(0.00f, 0.81f, 0.82f)
        inline val darkviolet: Color
            get() = Color(0.58f, 0.00f, 0.83f)
        inline val deeppink: Color
            get() = Color(1.00f, 0.08f, 0.58f)
        inline val deepskyblue: Color
            get() = Color(0.00f, 0.75f, 1.00f)
        inline val dimgray: Color
            get() = Color(0.41f, 0.41f, 0.41f)
        inline val dodgerblue: Color
            get() = Color(0.12f, 0.56f, 1.00f)
        inline val firebrick: Color
            get() = Color(0.70f, 0.13f, 0.13f)
        inline val floralwhite: Color
            get() = Color(1.00f, 0.98f, 0.94f)
        inline val forestgreen: Color
            get() = Color(0.13f, 0.55f, 0.13f)
        inline val fuchsia: Color
            get() = Color(1.00f, 0.00f, 1.00f)
        inline val gainsboro: Color
            get() = Color(0.86f, 0.86f, 0.86f)
        inline val ghostwhite: Color
            get() = Color(0.97f, 0.97f, 1.00f)
        inline val gold: Color
            get() = Color(1.00f, 0.84f, 0.00f)
        inline val goldenrod: Color
            get() = Color(0.85f, 0.65f, 0.13f)
        inline val gray: Color
            get() = Color(0.75f, 0.75f, 0.75f)
        inline val webgray: Color
            get() = Color(0.50f, 0.50f, 0.50f)
        inline val green: Color
            get() = Color(0.00f, 1.00f, 0.00f)
        inline val webgreen: Color
            get() = Color(0.00f, 0.50f, 0.00f)
        inline val greenyellow: Color
            get() = Color(0.68f, 1.00f, 0.18f)
        inline val honeydew: Color
            get() = Color(0.94f, 1.00f, 0.94f)
        inline val hotpink: Color
            get() = Color(1.00f, 0.41f, 0.71f)
        inline val indianred: Color
            get() = Color(0.80f, 0.36f, 0.36f)
        inline val indigo: Color
            get() = Color(0.29f, 0.00f, 0.51f)
        inline val ivory: Color
            get() = Color(1.00f, 1.00f, 0.94f)
        inline val khaki: Color
            get() = Color(0.94f, 0.90f, 0.55f)
        inline val lavender: Color
            get() = Color(0.90f, 0.90f, 0.98f)
        inline val lavenderblush: Color
            get() = Color(1.00f, 0.94f, 0.96f)
        inline val lawngreen: Color
            get() = Color(0.49f, 0.99f, 0.00f)
        inline val lemonchiffon: Color
            get() = Color(1.00f, 0.98f, 0.80f)
        inline val lightblue: Color
            get() = Color(0.68f, 0.85f, 0.90f)
        inline val lightcoral: Color
            get() = Color(0.94f, 0.50f, 0.50f)
        inline val lightcyan: Color
            get() = Color(0.88f, 1.00f, 1.00f)
        inline val lightgoldenrod: Color
            get() = Color(0.98f, 0.98f, 0.82f)
        inline val lightgray: Color
            get() = Color(0.83f, 0.83f, 0.83f)
        inline val lightgreen: Color
            get() = Color(0.56f, 0.93f, 0.56f)
        inline val lightpink: Color
            get() = Color(1.00f, 0.71f, 0.76f)
        inline val lightsalmon: Color
            get() = Color(1.00f, 0.63f, 0.48f)
        inline val lightseagreen: Color
            get() = Color(0.13f, 0.70f, 0.67f)
        inline val lightskyblue: Color
            get() = Color(0.53f, 0.81f, 0.98f)
        inline val lightslategray: Color
            get() = Color(0.47f, 0.53f, 0.60f)
        inline val lightsteelblue: Color
            get() = Color(0.69f, 0.77f, 0.87f)
        inline val lightyellow: Color
            get() = Color(1.00f, 1.00f, 0.88f)
        inline val lime: Color
            get() = Color(0.00f, 1.00f, 0.00f)
        inline val limegreen: Color
            get() = Color(0.20f, 0.80f, 0.20f)
        inline val linen: Color
            get() = Color(0.98f, 0.94f, 0.90f)
        inline val magenta: Color
            get() = Color(1.00f, 0.00f, 1.00f)
        inline val maroon: Color
            get() = Color(0.69f, 0.19f, 0.38f)
        inline val webmaroon: Color
            get() = Color(0.50f, 0.00f, 0.00f)
        inline val mediumaquamarine: Color
            get() = Color(0.40f, 0.80f, 0.67f)
        inline val mediumblue: Color
            get() = Color(0.00f, 0.00f, 0.80f)
        inline val mediumorchid: Color
            get() = Color(0.73f, 0.33f, 0.83f)
        inline val mediumpurple: Color
            get() = Color(0.58f, 0.44f, 0.86f)
        inline val mediumseagreen: Color
            get() = Color(0.24f, 0.70f, 0.44f)
        inline val mediumslateblue: Color
            get() = Color(0.48f, 0.41f, 0.93f)
        inline val mediumspringgreen: Color
            get() = Color(0.00f, 0.98f, 0.60f)
        inline val mediumturquoise: Color
            get() = Color(0.28f, 0.82f, 0.80f)
        inline val mediumvioletred: Color
            get() = Color(0.78f, 0.08f, 0.52f)
        inline val midnightblue: Color
            get() = Color(0.10f, 0.10f, 0.44f)
        inline val mintcream: Color
            get() = Color(0.96f, 1.00f, 0.98f)
        inline val mistyrose: Color
            get() = Color(1.00f, 0.89f, 0.88f)
        inline val moccasin: Color
            get() = Color(1.00f, 0.89f, 0.71f)
        inline val navajowhite: Color
            get() = Color(1.00f, 0.87f, 0.68f)
        inline val navyblue: Color
            get() = Color(0.00f, 0.00f, 0.50f)
        inline val oldlace: Color
            get() = Color(0.99f, 0.96f, 0.90f)
        inline val olive: Color
            get() = Color(0.50f, 0.50f, 0.00f)
        inline val olivedrab: Color
            get() = Color(0.42f, 0.56f, 0.14f)
        inline val orange: Color
            get() = Color(1.00f, 0.65f, 0.00f)
        inline val orangered: Color
            get() = Color(1.00f, 0.27f, 0.00f)
        inline val orchid: Color
            get() = Color(0.85f, 0.44f, 0.84f)
        inline val palegoldenrod: Color
            get() = Color(0.93f, 0.91f, 0.67f)
        inline val palegreen: Color
            get() = Color(0.60f, 0.98f, 0.60f)
        inline val paleturquoise: Color
            get() = Color(0.69f, 0.93f, 0.93f)
        inline val palevioletred: Color
            get() = Color(0.86f, 0.44f, 0.58f)
        inline val papayawhip: Color
            get() = Color(1.00f, 0.94f, 0.84f)
        inline val peachpuff: Color
            get() = Color(1.00f, 0.85f, 0.73f)
        inline val peru: Color
            get() = Color(0.80f, 0.52f, 0.25f)
        inline val pink: Color
            get() = Color(1.00f, 0.75f, 0.80f)
        inline val plum: Color
            get() = Color(0.87f, 0.63f, 0.87f)
        inline val powderblue: Color
            get() = Color(0.69f, 0.88f, 0.90f)
        inline val purple: Color
            get() = Color(0.63f, 0.13f, 0.94f)
        inline val webpurple: Color
            get() = Color(0.50f, 0.00f, 0.50f)
        inline val rebeccapurple: Color
            get() = Color(0.40f, 0.20f, 0.60f)
        inline val red: Color
            get() = Color(1.00f, 0.00f, 0.00f)
        inline val rosybrown: Color
            get() = Color(0.74f, 0.56f, 0.56f)
        inline val royalblue: Color
            get() = Color(0.25f, 0.41f, 0.88f)
        inline val saddlebrown: Color
            get() = Color(0.55f, 0.27f, 0.07f)
        inline val salmon: Color
            get() = Color(0.98f, 0.50f, 0.45f)
        inline val sandybrown: Color
            get() = Color(0.96f, 0.64f, 0.38f)
        inline val seagreen: Color
            get() = Color(0.18f, 0.55f, 0.34f)
        inline val seashell: Color
            get() = Color(1.00f, 0.96f, 0.93f)
        inline val sienna: Color
            get() = Color(0.63f, 0.32f, 0.18f)
        inline val silver: Color
            get() = Color(0.75f, 0.75f, 0.75f)
        inline val skyblue: Color
            get() = Color(0.53f, 0.81f, 0.92f)
        inline val slateblue: Color
            get() = Color(0.42f, 0.35f, 0.80f)
        inline val slategray: Color
            get() = Color(0.44f, 0.50f, 0.56f)
        inline val snow: Color
            get() = Color(1.00f, 0.98f, 0.98f)
        inline val springgreen: Color
            get() = Color(0.00f, 1.00f, 0.50f)
        inline val steelblue: Color
            get() = Color(0.27f, 0.51f, 0.71f)
        inline val tan: Color
            get() = Color(0.82f, 0.71f, 0.55f)
        inline val teal: Color
            get() = Color(0.00f, 0.50f, 0.50f)
        inline val thistle: Color
            get() = Color(0.85f, 0.75f, 0.85f)
        inline val tomato: Color
            get() = Color(1.00f, 0.39f, 0.28f)
        inline val turquoise: Color
            get() = Color(0.25f, 0.88f, 0.82f)
        inline val transparent: Color
            get() = Color(1.00f, 1.00f, 1.00f, 0.00f)
        inline val violet: Color
            get() = Color(0.93f, 0.51f, 0.93f)
        inline val wheat: Color
            get() = Color(0.96f, 0.87f, 0.70f)
        inline val white: Color
            get() = Color(1.00f, 1.00f, 1.00f)
        inline val whitesmoke: Color
            get() = Color(0.96f, 0.96f, 0.96f)
        inline val yellow: Color
            get() = Color(1.00f, 1.00f, 0.00f)

        inline val yellowgreen: Color
            get() = Color(0.60f, 0.80f, 0.20f)

        internal fun parseCol(p_str: String, p_ofs: Int): KotlinReal {
            var ig = 0.0f
            for (i in 0..1) {
                var v: Int

                when (val c: Char = p_str[i + p_ofs]) {
                    in '0'..'9' -> v = c.toInt() - '0'.toInt()
                    in 'a'..'f' -> {
                        v = c.toInt() - 'a'.toInt()
                        v += 10
                    }
                    in 'A'..'F' -> {
                        v = c.toInt() - 'A'.toInt()
                        v += 10
                    }
                    else        -> return -1.0
                }

                ig += if (i == 0)
                    v * 16
                else
                    v
            }
            return ig.toKotlinReal()
        }

    }

    //CONSTRUCTOR

    constructor() {
        _r = 0f
        _g = 0f
        _b = 0f
        _a = 1f
    }

    constructor(other: Color) {
        _r = other._r
        _g = other._g
        _b = other._b
        _a = other._a
    }

    constructor(r: GodotReal, g: GodotReal, b: GodotReal, a: GodotReal = 1f) {
        _r = r
        _g = g
        _b = b
        _a = a
    }

    constructor(r: Number, g: Number, b: Number, a: Number = 1.0f) {
        _r = r.toGodotReal()
        _g = g.toGodotReal()
        _b = b.toGodotReal()
        _a = a.toGodotReal()
    }

    constructor(from: String) : this() {
        var color = from
        if (color.isEmpty())
            return
        if (color[0] == '#')
            color = color.substring(1, color.length - 1)

        val alpha = when {
            color.length == 8 -> true
            color.length == 6 -> false
            else              -> return
        }

        var a = 255
        if (alpha) {
            a = parseCol(color, 0).toInt()
            if (a < 0) {
                return
            }
        }

        val p = if (alpha) 2 else 0
        val r = parseCol(color, p + 0).toInt()
        val g = parseCol(color, p + 2).toInt()
        val b = parseCol(color, p + 4).toInt()
        if (r < 0 || g < 0 || b < 0) {
            return
        }

        this._r = r / 255f
        this._g = g / 255f
        this._b = b / 255f
        this._a = a / 255f
    }


    constructor(from: Int) {
        _a = (from and 0xFF) / 255f
        var hex = from shr 8
        _b = (hex and 0xFF) / 255f
        hex = hex shr 8
        _g = (hex and 0xFF) / 255f
        hex = hex shr 8
        _r = (hex and 0xFF) / 255f
    }


    //API
    /**
     * Returns a new color resulting from blending this color over another.
     * If the color is opaque, the result is also opaque. The second color may have a range of alpha values.
     */
    fun blend(over: Color): Color {
        val res = Color()
        val sa = 1f - over._a
        if (isEqualApprox(res._a, 0.0f)) {
            return Color(0.0f, 0.0f, 0.0f, 0.0f)
        } else {
            res._r = (_r * _a * sa + over._r * over._a) / res._a
            res._g = (_g * _a * sa + over._g * over._a) / res._a
            res._b = (_b * _a * sa + over._b * over._a) / res._a
        }
        return res
    }


    /**
     * Returns the most contrasting color.
     */
    fun contrasted(): Color {
        val c = Color(_r, _g, _b, _a)
        c.contrast()
        return c
    }

    /**
     * Returns a new color resulting from making this color darker by the specified percentage (ratio from 0 to 1).
     */
    fun darkened(amount: KotlinReal): Color {
        return Color(
            _r * (1.0f - amount),
            _g * (1.0f - amount),
            _b * (1.0f - amount),
            _a
        )
    }

    /**
     * Constructs a color from an HSV profile. h, s, and v are values between 0 and 1.f
     */
    fun fromHsv(h: KotlinReal, s: KotlinReal, v: KotlinReal, a: KotlinReal): Color {
        var h2 = (h * 360.0f).rem(360.0f)

        if (h2 < 0) h2 += 360

        val finalH = h2 / 60
        val c = v * s
        val x = c * (1.0f - (finalH.rem(2) - 1))
        val rgbTriple = when (finalH.toInt()) {
            0    -> Triple(c, x, 0.0)
            1    -> Triple(x, c, 0.0)
            2    -> Triple(0.0, c, x)
            3    -> Triple(0.0, x, c)
            4    -> Triple(x, 0.0, c)
            5    -> Triple(c, 0.0, x)
            else -> Triple(0.0, 0.0, 0.0)
        }

        val m = v - c
        return Color(m + rgbTriple.first, m + rgbTriple.second, m + rgbTriple.third, a)
    }

    /**
     * Returns the color’s grayscale representation.
     * The gray value is calculated as (r + g + b) / 3.f
     */
    fun gray(): KotlinReal = (_r + _g + _b) / 3.0

    /**
     * Returns the inverted color (1 - r, 1 - g, 1 - b, a).
     */
    fun inverted(): Color {
        val c = Color(_r, _g, _b, _a)
        c.invert()
        return c
    }

    /**
     * Returns true if this color and color are approximately equal, by running isEqualApprox on each component.
     */
    fun isEqualApprox(color: Color): Boolean {
        return isEqualApprox(_r, color._r)
            && isEqualApprox(_g, color._g)
            && isEqualApprox(_b, color._b)
            && isEqualApprox(_a, color._a)
    }

    /**
     * Returns a new color resulting from making this color lighter by the specified percentage (ratio from 0 to 1).
     */
    fun lightened(amount: KotlinReal): Color {
        return Color(
            _r + (1.0f - _r) * amount,
            _g + (1.0f - _g) * amount,
            _b + (1.0f - _b) * amount,
            _a
        )
    }


    /**
     * Returns the linear interpolation with another color. The interpolation factor t is between 0 and 1.f
     */
    fun linearInterpolate(otherColor: Color, t: KotlinReal): Color {
        val res = Color(this)
        res._r += (t.toGodotReal() * (otherColor._r - _r))
        res._g += (t.toGodotReal() * (otherColor._g - _g))
        res._b += (t.toGodotReal() * (otherColor._b - _b))
        res._a += (t.toGodotReal() * (otherColor._a - _a))
        return res
    }

    /**
     * Returns the color’s 32-bit integer in ABGR format (each byte represents a component of the ABGR profile).
     * ABGR is the reversed version of the default format.
     */
    fun toABGR32(): Int = toByteColorCode(a, b, g, r, ColorByte.BITS32).toInt()

    /**
     * Returns the color’s 64-bit integer in ABGR format (each word represents a component of the ABGR profile).
     * ABGR is the reversed version of the default format.
     */
    fun toABGR64(): Long = toByteColorCode(a, b, g, r, ColorByte.BITS64)

    /**
     * Returns the color’s 32-bit integer in ARGB format (each byte represents a component of the ARGB profile).
     * ARGB is more compatible with DirectX.
     */
    fun toARGB32(): Int = toByteColorCode(a, r, g, b, ColorByte.BITS32).toInt()

    /**
     * Returns the color’s 64-bit integer in ARGB format (each word represents a component of the ARGB profile).
     * ARGB is more compatible with DirectX.
     */
    fun toARGB64(): Long = toByteColorCode(a, r, g, b, ColorByte.BITS64)

    /**
     * Returns the color’s 32-bit integer in RGBA format (each byte represents a component of the RGBA profile).
     * RGBA is Godot’s default format.
     */
    fun toRGBA32(): Int = toByteColorCode(r, g, b, a, ColorByte.BITS32).toInt()

    /**
    Returns the color’s 64-bit integer in RGBA format (each word represents a component of the RGBA profile).
    RGBA is Godot’s default format.
     */
    fun toRGBA64(): Long = toByteColorCode(r, g, b, a, ColorByte.BITS64)

    /**
     * Returns the color’s HTML hexadecimal color string in ARGB format (ex: ff34f822).
     * Setting with_alpha to false excludes alpha from the hexadecimal string.
     */
    fun toHtml(alpha: Boolean): String {
        var txt = ""
        txt += toHex(r)
        txt += toHex(g)
        txt += toHex(b)
        if (alpha) {
            txt = toHex(a) + txt
        }
        return txt
    }

    //Utilities
    override fun toVariant() = Variant(this)

    operator fun plus(c: Color) = Color(_r + c._r, _g + c._g, _b + c._b, _a + c._a)
    operator fun plus(scalar: Float) = Color(_r + scalar, _g + scalar, _b + scalar, _a + scalar)
    operator fun plus(scalar: Double) = Color(_r + scalar, _g + scalar, _b + scalar, _a + scalar)

    operator fun minus(c: Color) = Color(_r - c._r, _g - c._g, _b - c._b, _a - c._a)
    operator fun minus(scalar: Float) = Color(_r - scalar, _g - scalar, _b - scalar, _a - scalar)
    operator fun minus(scalar: Double) = Color(_r - scalar, _g - scalar, _b - scalar, _a - scalar)

    operator fun times(c: Color) = Color(_r * c._r, _g * c._g, _b * c._b, _a * c._a)
    operator fun times(scalar: Float) = Color(_r * scalar, _g * scalar, _b * scalar, _a * scalar)
    operator fun times(scalar: Double) = Color(_r * scalar, _g * scalar, _b * scalar, _a * scalar)

    operator fun div(c: Color) = Color(_r / c._r, _g / c._g, _b / c._b, _a / c._a)
    operator fun div(scalar: Float) = Color(_r / scalar, _g / scalar, _b / scalar, _a / scalar)
    operator fun div(scalar: Double) = Color(_r / scalar, _g / scalar, _b / scalar, _a / scalar)

    override fun compareTo(other: Color): Int {
        return when {
            _r == other._r -> when {
                _g == other._g -> when {
                    _b == other._b -> when {
                        _a < other._a  -> -1
                        _a == other._a -> 0
                        else           -> 1
                    }
                    _b < other._b  -> -1
                    else           -> 1
                }
                _g < other._g  -> -1
                else           -> 1
            }
            _r < other._r  -> -1
            else           -> 1
        }
    }

    override fun toString(): String {
        return "$_r, $_g, $_b, $_a"
    }

    override fun hashCode(): Int {
        var result = _r.hashCode()
        result = 31 * result + _g.hashCode()
        result = 31 * result + _b.hashCode()
        result = 31 * result + _a.hashCode()
        return result
    }
}
