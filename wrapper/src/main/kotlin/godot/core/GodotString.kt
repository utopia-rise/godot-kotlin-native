package kotlin.godot.core

import godot.*
import kotlinx.cinterop.*


class GodotString : CoreType {
    var godotString: CValue<godot_string> = cValue {
        godot_string_new(this.ptr)
    }


    override fun getRawMemory(memScope: MemScope): COpaquePointer {
        return godotString.getPointer(memScope)
    }

    override fun setRawMemory(mem: COpaquePointer) {
        godotString = mem.reinterpret<godot_string>().pointed.readValue()
    }


    constructor()

    constructor(contents: String) {
        godotString = godotString.copy {
            godot_string_parse_utf8(this.ptr, contents)
        }
    }

    constructor(other: GodotString) {
        godotString = godotString.copy {
            val aThis = this
            other.godotString.useContents {
                godot_string_new_copy(aThis.ptr, this.ptr)
            }
        }
    }


    companion object {
        fun num(p_num: Double, p_decimals: Int): GodotString {
            val newString = GodotString()
            newString.godotString = godot_string_num_with_decimals(p_num, p_decimals)
            return newString
        }

        fun numScientific(p_num: Double): GodotString {
            val newString = GodotString()
            newString.godotString = godot_string_num_scientific(p_num)
            return newString
        }

        fun numReal(p_num: Double): GodotString {
            val newString = GodotString()
            newString.godotString = godot_string_num_real(p_num)
            return newString
        }

        fun numInt64(p_num: Long, base: Int = 10, capitalize_hex: Boolean = true): GodotString {
            val newString = GodotString()
            newString.godotString = godot_string_num_int64_capitalized(p_num, base, capitalize_hex)
            return newString
        }

        fun char(p_char: Short): GodotString {
            val newString = GodotString()
            newString.godotString = godot_string_chr(p_char)
            return newString
        }

        fun md5(p_md5: String): GodotString {
            val newString = GodotString()
            newString.godotString = godot_string_md5(p_md5.cstr)
            return newString
        }

        fun hexEncodeBuffer(p_buffer: String, p_len: Int): GodotString {
            val newString = GodotString()
            newString.godotString = godot_string_hex_encode_buffer(p_buffer.cstr, p_len)
            return newString
        }
    }

    operator fun get(idx: Int): Char = godotString.useContents {
        godot_string_operator_index(this.ptr, idx)!![0].toChar()
    }


    override fun equals(other: Any?): Boolean =
            if (other is GodotString) {
                Utils.useContents(godotString, other.godotString) { a, b ->
                    godot_string_operator_equal(a.ptr, b.ptr)
                }
            } else false

    operator fun plus(other: GodotString): GodotString {
        val newString = GodotString()
        newString.godotString = Utils.useContents(godotString, other.godotString) { a, b ->
            godot_string_operator_plus(a.ptr, b.ptr)
        }
        return newString
    }

    operator fun compareTo(other: GodotString) =
            if (this == other) 0
            else if (Utils.useContents(godotString, other.godotString) { a, b ->
                        godot_string_operator_less(a.ptr, b.ptr)
                    }) -1
            else 1

    override fun toString(): String = godotString.useContents {
        godot_string_utf8(this.ptr).useContents {
            val ret = godot_char_string_get_data(this.ptr)!!.toKString()
            godot_char_string_destroy(this.ptr)

            return ret
        }
    }

    fun length(): Int = godotString.useContents { godot_string_length(this.ptr) }

    fun unicodeStr(): String = godotString.useContents { godot_string_wide_str(this.ptr)!!.toKString() }

    fun beginsWith(p_string: GodotString): Boolean = Utils.useContents(godotString, p_string.godotString) { a, b ->
        godot_string_begins_with(a.ptr, b.ptr)
    }

    fun beginsWithCharArray(p_string: kotlin.String): Boolean = godotString.useContents {
        godot_string_begins_with_char_array(this.ptr, p_string)
    }

    fun cEscape(): GodotString {
        val newString = GodotString()
        newString.godotString = godotString.useContents {
            godot_string_c_escape(this.ptr)
        }
        return newString
    }

    fun cUnescape(): GodotString {
        val newString = GodotString()
        newString.godotString = godotString.useContents {
            godot_string_c_unescape(this.ptr)
        }
        return newString
    }

    fun capitalize(): GodotString {
        val newString = GodotString()
        newString.godotString = godotString.useContents {
            godot_string_capitalize(this.ptr)
        }
        return newString
    }

    fun empty(): Boolean = godotString.useContents {
        godot_string_empty(this.ptr)
    }

    fun endsWith(p_string: GodotString): Boolean = Utils.useContents(godotString, p_string.godotString) { a, b ->
        godot_string_ends_with(a.ptr, b.ptr)
    }

    fun erase(position: Int, chars: Int) = godotString.useContents { godot_string_erase(this.ptr, position, chars) }

    fun find(p_what: GodotString): Int = Utils.useContents(godotString, p_what.godotString) { a, b ->
        godot_string_find(a.ptr, b.readValue())
    }

    /* Doesn't work */
    fun getBasename(): GodotString {
        val newString = GodotString()
        newString.godotString = godotString.useContents {
            godot_string_get_basename(this.ptr)
        }
        return newString
    }

    /* Doesn't work */
    fun getExtension(): GodotString {
        val newString = GodotString()
        newString.godotString = godotString.useContents {
            godot_string_get_extension(this.ptr)
        }
        return newString
    }

    /* Doesn't work */
    fun get_File(): GodotString {
        val newString = GodotString()
        newString.godotString = godotString.useContents {
            godot_string_get_file(this.ptr)
        }
        Godot.print(newString)
        return newString
    }

    override fun hashCode(): Int = godotString.useContents { godot_string_hash(this.ptr) }

    fun hexToInt(): Int = godotString.useContents { godot_string_hex_to_int(this.ptr) }

    fun insert(position: Int, p_what: GodotString): GodotString {
        val newString = GodotString()
        newString.godotString = Utils.useContents(godotString, p_what.godotString) { a, b ->
            godot_string_insert(a.ptr, position, b.readValue())
        }
        return newString
    }

    fun isAbsPath(): Boolean = godotString.useContents { godot_string_is_abs_path(this.ptr) }

    fun isRelPath(): Boolean = godotString.useContents { godot_string_is_rel_path(this.ptr) }

    fun isSubsequenceOf(text: GodotString): Boolean = Utils.useContents(godotString, text.godotString) { a, b ->
        godot_string_is_subsequence_of(a.ptr, b.ptr)
    }

    fun isSubsequenceOfi(text: GodotString): Boolean = Utils.useContents(godotString, text.godotString) { a, b ->
        godot_string_is_subsequence_ofi(a.ptr, b.ptr)
    }

    fun isValidFloat(): Boolean = godotString.useContents { godot_string_is_valid_float(this.ptr) }

    fun isValidHtmlColor(): Boolean = godotString.useContents { godot_string_is_valid_html_color(this.ptr) }

    fun isValidIdentifier(): Boolean = godotString.useContents { godot_string_is_valid_identifier(this.ptr) }

    fun isValidInteger(): Boolean = godotString.useContents { godot_string_is_valid_integer(this.ptr) }

    fun isValidIpAddress(): Boolean = godotString.useContents { godot_string_is_valid_ip_address(this.ptr) }

    fun jsonEscape(): GodotString {
        val newString = GodotString()
        newString.godotString = godotString.useContents { godot_string_json_escape(this.ptr) }
        return newString
    }

    fun left(position: Int): GodotString {
        val newString = GodotString()
        newString.godotString = godotString.useContents { godot_string_left(this.ptr, position) }
        return newString
    }

    fun match(expr: GodotString): Boolean = Utils.useContents(godotString, expr.godotString) { a, b ->
        godot_string_match(a.ptr, b.ptr)
    }

    fun matchn(expr: GodotString): Boolean = Utils.useContents(godotString, expr.godotString) { a, b ->
        godot_string_matchn(a.ptr, b.ptr)
    }

    fun md5Text(): GodotString {
        val newString = GodotString()
        newString.godotString = godotString.useContents { godot_string_md5_text(this.ptr) }
        return newString
    }

    fun ordAt(at: Int): Short = godotString.useContents { godot_string_ord_at(this.ptr, at) }

    fun padDecimals(digits: Int): GodotString {
        val newString = GodotString()
        newString.godotString = godotString.useContents { godot_string_pad_decimals(this.ptr, digits) }
        return newString
    }

    fun padZeros(digits: Int): GodotString {
        val newString = GodotString()
        newString.godotString = godotString.useContents { godot_string_pad_zeros(this.ptr, digits) }
        return newString
    }

    fun percentDecode(): GodotString {
        val newString = GodotString()
        newString.godotString = godotString.useContents { godot_string_percent_decode(this.ptr) }
        return newString
    }

    fun percentEncode(): GodotString {
        val newString = GodotString()
        newString.godotString = godotString.useContents { godot_string_percent_encode(this.ptr) }
        return newString
    }

    fun plusFile(file: GodotString): GodotString {
        val newString = GodotString()
        newString.godotString = Utils.useContents(godotString, file.godotString) { a, b ->
            godot_string_plus_file(a.ptr, b.ptr)
        }
        return newString
    }

    fun replace(p_key: GodotString, p_with: GodotString): GodotString {
        val newString = GodotString()
        newString.godotString = Utils.useContents(godotString, p_key.godotString) { a, b ->
            p_with.godotString.useContents {
                godot_string_replace(a.ptr, b.readValue(), this.readValue())
            }
        }
        return newString
    }

    fun replacen(what: GodotString, fromWhat: GodotString): GodotString {
        val newString = GodotString()
        newString.godotString = Utils.useContents(godotString, what.godotString) { a, b ->
            fromWhat.godotString.useContents {
                godot_string_replacen(a.ptr, b.readValue(), this.readValue())
            }
        }
        return newString
    }

    fun rfind(what: GodotString): Int = Utils.useContents(godotString, what.godotString) { a, b ->
        godot_string_rfind(a.ptr, b.readValue())
    }

    fun rfindn(what: GodotString): Int = Utils.useContents(godotString, what.godotString) { a, b ->
        godot_string_rfindn(a.ptr, b.readValue())
    }

    fun right(position: Int): GodotString {
        val newString = GodotString()
        newString.godotString = godotString.useContents { godot_string_right(this.ptr, position) }
        return newString
    }

    fun sha256Text(): GodotString {
        val newString = GodotString()
        newString.godotString = godotString.useContents { godot_string_sha256_text(this.ptr) }
        return newString
    }

    fun similatiry(text: GodotString): Float = Utils.useContents(godotString, text.godotString) { a, b ->
        godot_string_similarity(a.ptr, b.ptr)
    }

    fun stripEdges(left: Boolean, right: Boolean): GodotString {
        val newString = GodotString()
        newString.godotString = godotString.useContents { godot_string_strip_edges(this.ptr, left, right) }
        return newString
    }

    fun substr(from: Int, len: Int): GodotString {
        val newString = GodotString()
        newString.godotString = godotString.useContents { godot_string_substr(this.ptr, from, len) }
        return newString
    }

    fun toFloat(): Float = godotString.useContents { godot_string_to_float(this.ptr) }

    fun toInt(): Int = godotString.useContents { godot_string_to_int(this.ptr) }

    fun toLower(): GodotString {
        val newString = GodotString()
        newString.godotString = godotString.useContents { godot_string_to_lower(this.ptr) }
        return newString
    }

    fun toUpper(): GodotString {
        val newString = GodotString()
        newString.godotString = godotString.useContents { godot_string_to_upper(this.ptr) }
        return newString
    }

    fun xmlEscape(): GodotString {
        val newString = GodotString()
        newString.godotString = godotString.useContents { godot_string_xml_escape(this.ptr) }
        return newString
    }

    fun xmlUnescape(): GodotString {
        val newString = GodotString()
        newString.godotString = godotString.useContents { godot_string_xml_unescape(this.ptr) }
        return newString
    }

}
