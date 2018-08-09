package kotlin.godot.core

import godot.*
import kotlinx.cinterop.*


class GodotString : CoreType {
    internal var nativeValue: CValue<godot_string> = cValue { godot_string_new(this.ptr) }

    constructor()

    internal constructor(native: CValue<godot_string>) {
        nativeValue = nativeValue.copy { godot_string_new_copy(this.ptr, native) }
    }

    constructor(contents: String) {
        nativeValue = nativeValue.copy { godot_string_parse_utf8(this.ptr, contents) }
    }

    constructor(other: GodotString) {
        nativeValue = nativeValue.copy { godot_string_new_copy(this.ptr, other.nativeValue) }
    }

    override fun getRawMemory(memScope: MemScope): COpaquePointer {
        return nativeValue.getPointer(memScope)
    }

    override fun setRawMemory(mem: COpaquePointer) {
        nativeValue = mem.reinterpret<godot_string>().pointed.readValue()
    }

    companion object {
        fun num(p_num: Double, p_decimals: Int): GodotString {
            val newString = GodotString()
            newString.nativeValue = godot_string_num_with_decimals(p_num, p_decimals)
            return newString
        }

        fun numScientific(p_num: Double): GodotString {
            val newString = GodotString()
            newString.nativeValue = godot_string_num_scientific(p_num)
            return newString
        }

        fun numReal(p_num: Double): GodotString {
            val newString = GodotString()
            newString.nativeValue = godot_string_num_real(p_num)
            return newString
        }

        fun numInt64(p_num: Long, base: Int = 10, capitalize_hex: Boolean = true): GodotString {
            val newString = GodotString()
            newString.nativeValue = godot_string_num_int64_capitalized(p_num, base, capitalize_hex)
            return newString
        }

        fun char(p_char: Short): GodotString {
            val newString = GodotString()
            newString.nativeValue = godot_string_chr(p_char)
            return newString
        }

        fun md5(p_md5: String): GodotString {
            val newString = GodotString()
            newString.nativeValue = godot_string_md5(p_md5.cstr)
            return newString
        }

        fun hexEncodeBuffer(p_buffer: String, p_len: Int): GodotString {
            val newString = GodotString()
            newString.nativeValue = godot_string_hex_encode_buffer(p_buffer.cstr, p_len)
            return newString
        }
    }

    operator fun get(idx: Int): Char = godot_string_operator_index(nativeValue, idx)!![0].toChar()

    override fun equals(other: Any?): Boolean =
            if (other is GodotString) godot_string_operator_equal(nativeValue, other.nativeValue)
            else false

    operator fun plus(other: GodotString): GodotString {
        val newString = GodotString()
        newString.nativeValue = godot_string_operator_plus(nativeValue, other.nativeValue)
        return newString
    }

    operator fun compareTo(other: GodotString) =
            when {
                this == other -> 0
                godot_string_operator_less(nativeValue, other.nativeValue) -> -1
                else -> 1
            }

    override fun toString(): String = godot_string_utf8(nativeValue).useContents {
        val ret = godot_char_string_get_data(this.ptr)!!.toKString()
        godot_char_string_destroy(this.ptr)
        return ret
    }

    fun length(): Int = godot_string_length(nativeValue)

    fun unicodeStr(): String = godot_string_wide_str(nativeValue)!!.toKString()

    fun beginsWith(p_string: GodotString): Boolean = godot_string_begins_with(nativeValue, p_string.nativeValue)

    fun beginsWithCharArray(p_string: kotlin.String): Boolean = godot_string_begins_with_char_array(nativeValue, p_string)

    fun cEscape(): GodotString {
        val newString = GodotString()
        newString.nativeValue = godot_string_c_escape(nativeValue)
        return newString
    }

    fun cUnescape(): GodotString {
        val newString = GodotString()
        newString.nativeValue = godot_string_c_unescape(nativeValue)
        return newString
    }

    fun capitalize(): GodotString {
        val newString = GodotString()
        newString.nativeValue = godot_string_capitalize(nativeValue)
        return newString
    }

    fun empty(): Boolean = godot_string_empty(nativeValue)

    fun endsWith(p_string: GodotString): Boolean = godot_string_ends_with(nativeValue, p_string.nativeValue)

    fun erase(position: Int, chars: Int) = godot_string_erase(nativeValue, position, chars)

    fun find(p_what: GodotString): Int = p_what.nativeValue.useContents {
        godot_string_find(nativeValue, this.readValue())
    }

    /* Doesn't work */
    fun getBasename(): GodotString {
        val newString = GodotString()
        newString.nativeValue = godot_string_get_basename(nativeValue)
        return newString
    }

    /* Doesn't work */
    fun getExtension(): GodotString {
        val newString = GodotString()
        newString.nativeValue = godot_string_get_extension(nativeValue)
        return newString
    }

    /* Doesn't work */
    fun get_File(): GodotString {
        val newString = GodotString()
        newString.nativeValue = godot_string_get_file(nativeValue)
        return newString
    }

    override fun hashCode(): Int = godot_string_hash(nativeValue)

    fun hexToInt(): Int = godot_string_hex_to_int(nativeValue)

    fun insert(position: Int, p_what: GodotString): GodotString {
        val newString = GodotString()
        newString.nativeValue = p_what.nativeValue.useContents {
            godot_string_insert(nativeValue, position, this.readValue())
        }
        return newString
    }

    fun isAbsPath(): Boolean = godot_string_is_abs_path(nativeValue)

    fun isRelPath(): Boolean = godot_string_is_rel_path(nativeValue)

    fun isSubsequenceOf(text: GodotString): Boolean = godot_string_is_subsequence_of(nativeValue, text.nativeValue)

    fun isSubsequenceOfi(text: GodotString): Boolean = godot_string_is_subsequence_ofi(nativeValue, text.nativeValue)

    fun isValidFloat(): Boolean = godot_string_is_valid_float(nativeValue)

    fun isValidHtmlColor(): Boolean = godot_string_is_valid_html_color(nativeValue)

    fun isValidIdentifier(): Boolean = godot_string_is_valid_identifier(nativeValue)

    fun isValidInteger(): Boolean = godot_string_is_valid_integer(nativeValue)

    fun isValidIpAddress(): Boolean = godot_string_is_valid_ip_address(nativeValue)

    fun jsonEscape(): GodotString {
        val newString = GodotString()
        newString.nativeValue = godot_string_json_escape(nativeValue)
        return newString
    }

    fun left(position: Int): GodotString {
        val newString = GodotString()
        newString.nativeValue = godot_string_left(nativeValue, position)
        return newString
    }

    fun match(expr: GodotString): Boolean = godot_string_match(nativeValue, expr.nativeValue)

    fun matchn(expr: GodotString): Boolean = godot_string_matchn(nativeValue, expr.nativeValue)

    fun md5Text(): GodotString {
        val newString = GodotString()
        newString.nativeValue = godot_string_md5_text(nativeValue)
        return newString
    }

    fun ordAt(at: Int): Short = godot_string_ord_at(nativeValue, at)

    fun padDecimals(digits: Int): GodotString {
        val newString = GodotString()
        newString.nativeValue = godot_string_pad_decimals(nativeValue, digits)
        return newString
    }

    fun padZeros(digits: Int): GodotString {
        val newString = GodotString()
        newString.nativeValue = godot_string_pad_zeros(nativeValue, digits)
        return newString
    }

    fun percentDecode(): GodotString {
        val newString = GodotString()
        newString.nativeValue = godot_string_percent_decode(nativeValue)
        return newString
    }

    fun percentEncode(): GodotString {
        val newString = GodotString()
        newString.nativeValue = godot_string_percent_encode(nativeValue)
        return newString
    }

    fun plusFile(file: GodotString): GodotString {
        val newString = GodotString()
        newString.nativeValue = godot_string_plus_file(nativeValue, file.nativeValue)
        return newString
    }

    fun replace(p_key: GodotString, p_with: GodotString): GodotString {
        val newString = GodotString()
        newString.nativeValue = Utils.useContents(p_key.nativeValue, p_with.nativeValue) { a, b ->
            godot_string_replace(nativeValue, a.readValue(), b.readValue())
        }
        return newString
    }

    fun replacen(what: GodotString, fromWhat: GodotString): GodotString {
        val newString = GodotString()
        newString.nativeValue = Utils.useContents(what.nativeValue, fromWhat.nativeValue) { a, b ->
            godot_string_replacen(nativeValue, a.readValue(), b.readValue())
        }
        return newString
    }

    fun rfind(what: GodotString): Int = what.nativeValue.useContents {
        godot_string_rfind(nativeValue, this.readValue())
    }

    fun rfindn(what: GodotString): Int = what.nativeValue.useContents {
        godot_string_rfindn(nativeValue, this.readValue())
    }

    fun right(position: Int): GodotString {
        val newString = GodotString()
        newString.nativeValue = godot_string_right(nativeValue, position)
        return newString
    }

    fun sha256Text(): GodotString {
        val newString = GodotString()
        newString.nativeValue = godot_string_sha256_text(nativeValue)
        return newString
    }

    fun similatiry(text: GodotString): Float = godot_string_similarity(nativeValue, text.nativeValue)


    fun stripEdges(left: Boolean, right: Boolean): GodotString {
        val newString = GodotString()
        newString.nativeValue = godot_string_strip_edges(nativeValue, left, right)
        return newString
    }

    fun substr(from: Int, len: Int): GodotString {
        val newString = GodotString()
        newString.nativeValue = godot_string_substr(nativeValue, from, len)
        return newString
    }

    fun toFloat(): Float = godot_string_to_float(nativeValue)

    fun toInt(): Int = godot_string_to_int(nativeValue)

    fun toLower(): GodotString {
        val newString = GodotString()
        newString.nativeValue = godot_string_to_lower(nativeValue)
        return newString
    }

    fun toUpper(): GodotString {
        val newString = GodotString()
        newString.nativeValue = godot_string_to_upper(nativeValue)
        return newString
    }

    fun xmlEscape(): GodotString {
        val newString = GodotString()
        newString.nativeValue = godot_string_xml_escape(nativeValue)
        return newString
    }

    fun xmlUnescape(): GodotString {
        val newString = GodotString()
        newString.nativeValue = godot_string_xml_unescape(nativeValue)
        return newString
    }

}
