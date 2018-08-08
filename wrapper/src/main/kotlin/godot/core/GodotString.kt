package kotlin.godot.core

import godot.*
import kotlinx.cinterop.*
class GodotString : CoreType{
    var godotString : CValue<godot_string> = cValue{
        godot_string_new(this.ptr)
    }

    constructor()

    constructor(contents: String){
        godotString = godotString.copy {
            godot_string_parse_utf8(this.ptr, contents)
        }
    }

    inline fun <reified T1: CStructVar, reified T2: CStructVar, R> useContents(
            a: CValue<T1>,
            b: CValue<T2>,
            action: (T1, T2) -> R
    ) : R {
        return a.useContents {
            val aThis = this
            b.useContents {
                action(aThis, this)
            }
        }
    }

    constructor(other: GodotString) {
        godotString = godotString.copy {
            val aThis = this
            other.godotString.useContents{
                godot_string_new_copy(aThis.ptr, this.ptr)
            }
        }
    }


    override fun godotPointer(memScope: MemScope): COpaquePointer{
        godotString.useContents {
            return this.ptr
        }
    }

    companion object{
        fun num(p_num: Double, p_decimals: Int): GodotString {
            val newString = GodotString()
            newString.godotString = godot_string_num_with_decimals(p_num, p_decimals)
            return newString
        }

        fun num_scientific(p_num: Double): GodotString {
            val newString = GodotString()
            newString.godotString = godot_string_num_scientific(p_num)
            return newString
        }

        fun num_real(p_num: Double): GodotString {
            val newString = GodotString()
            newString.godotString = godot_string_num_real(p_num)
            return newString
        }

        fun num_int64(p_num: Long, base: Int = 10, capitalize_hex: Boolean = true): GodotString {
            val newString = GodotString()
            newString.godotString = godot_string_num_int64_capitalized(p_num, base, capitalize_hex)
            return newString
        }

        fun char(p_char: Short): GodotString{
            val newString = GodotString()
            newString.godotString = godot_string_chr(p_char)
            return newString
        }

        fun md5(p_md5: String): GodotString{
            val newString = GodotString()
            newString.godotString = godot_string_md5(p_md5.cstr)
            return newString
        }

        fun hex_encode_buffer(p_buffer: String, p_len: Int): GodotString{
            val newString = GodotString()
            newString.godotString = godot_string_hex_encode_buffer(p_buffer.cstr, p_len)
            return newString
        }
    }

    operator fun get(idx: Int) : Char = godotString.useContents {
        godot_string_operator_index(this.ptr, idx)!![0].toChar()
    }


    override fun equals(other: Any?): Boolean =
        if(other is GodotString) {
            useContents(godotString, other.godotString) { a, b ->
                godot_string_operator_equal(a.ptr, b.ptr)
            }
        }else false

    operator fun plus(other: GodotString): GodotString{
        val newString = GodotString()
        newString.godotString = useContents(godotString, other.godotString) { a, b ->
            godot_string_operator_plus(a.ptr, b.ptr)
        }
        return newString
    }

    operator fun compareTo(other: GodotString) =
        if (this == other) 0
        else if( useContents(godotString, other.godotString) { a, b ->
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

    fun unicode_str(): String  = godotString.useContents { godot_string_wide_str(this.ptr)!!.toKString()}

    fun begins_with(p_string: GodotString): Boolean = useContents(godotString, p_string.godotString) { a, b ->
        godot_string_begins_with(a.ptr, b.ptr)
    }

    fun begins_with_char_array(p_string: kotlin.String): Boolean = godotString.useContents {
        godot_string_begins_with_char_array(this.ptr, p_string)
    }

    fun c_escape(): GodotString{
        val newString = GodotString()
        newString.godotString = godotString.useContents {
            godot_string_c_escape(this.ptr)
        }
        return newString
    }

    fun c_unescape(): GodotString{
        val newString = GodotString()
        newString.godotString = godotString.useContents {
            godot_string_c_unescape(this.ptr)
        }
        return newString
    }

    fun capitalize(): GodotString{
        val newString = GodotString()
        newString.godotString = godotString.useContents {
            godot_string_capitalize(this.ptr)
        }
        return newString
    }

    fun empty(): Boolean = godotString.useContents {
        godot_string_empty(this.ptr)
    }

    fun ends_with(p_string: GodotString): Boolean = useContents(godotString, p_string.godotString) { a, b ->
        godot_string_ends_with(a.ptr, b.ptr)
    }

    fun erase(position: Int, chars: Int) = godotString.useContents { godot_string_erase(this.ptr, position, chars) }

    fun find(p_what: GodotString): Int = useContents(godotString, p_what.godotString) { a, b ->
        godot_string_find(a.ptr, b.readValue())
    }

    /* Don't work */
    fun get_basename(): GodotString{
        val newString = GodotString()
        newString.godotString = godotString.useContents {
            godot_string_get_basename(this.ptr)
        }
        return newString
    }

    /* Don't work */
    fun get_extension(): GodotString{
        val newString = GodotString()
        newString.godotString = godotString.useContents {
            godot_string_get_extension(this.ptr)
        }
        return newString
    }


    /* Don't work */
    fun get_file(): GodotString{
        val newString = GodotString()
        newString.godotString = godotString.useContents {
            godot_string_get_file(this.ptr)
        }
        Godot.print(newString)
        return newString
    }

    override fun hashCode(): Int = godotString.useContents { godot_string_hash(this.ptr)  }

    fun hex_to_int(): Int = godotString.useContents { godot_string_hex_to_int(this.ptr) }

    fun insert(position: Int, p_what: GodotString): GodotString{
        val newString = GodotString()
        newString.godotString = useContents(godotString, p_what.godotString) { a, b ->
            godot_string_insert(a.ptr, position, b.readValue())
        }
        return newString
    }

    fun is_abs_path(): Boolean = godotString.useContents { godot_string_is_abs_path(this.ptr) }

    fun is_rel_path(): Boolean = godotString.useContents { godot_string_is_rel_path(this.ptr) }

    fun is_subsequence_of(text: GodotString): Boolean = useContents(godotString, text.godotString) { a, b ->
        godot_string_is_subsequence_of(a.ptr, b.ptr)
    }

    fun is_subsequence_ofi(text: GodotString): Boolean = useContents(godotString, text.godotString) { a, b ->
        godot_string_is_subsequence_ofi(a.ptr, b.ptr)
    }

    fun is_valid_float(): Boolean = godotString.useContents { godot_string_is_valid_float(this.ptr) }

    fun is_valid_html_color(): Boolean = godotString.useContents { godot_string_is_valid_html_color(this.ptr) }

    fun is_valid_identifier(): Boolean = godotString.useContents { godot_string_is_valid_identifier(this.ptr) }

    fun is_valid_integer(): Boolean = godotString.useContents { godot_string_is_valid_integer(this.ptr) }

    fun is_valid_ip_address(): Boolean = godotString.useContents { godot_string_is_valid_ip_address(this.ptr) }

    fun json_escape(): GodotString{
        val newString = GodotString()
        newString.godotString = godotString.useContents { godot_string_json_escape(this.ptr) }
        return newString
    }

    fun left(position: Int): GodotString{
        val newString = GodotString()
        newString.godotString = godotString.useContents { godot_string_left(this.ptr, position) }
        return newString
    }

    fun match(expr: GodotString): Boolean = useContents(godotString, expr.godotString) { a, b ->
        godot_string_match(a.ptr, b.ptr)
    }

    fun matchn(expr: GodotString): Boolean = useContents(godotString, expr.godotString) { a, b ->
        godot_string_matchn(a.ptr, b.ptr)
    }

    fun md5_text(): GodotString{
        val newString = GodotString()
        newString.godotString = godotString.useContents { godot_string_md5_text(this.ptr) }
        return newString
    }

    fun ord_at(at: Int): Short = godotString.useContents { godot_string_ord_at(this.ptr, at) }

    fun pad_decimals(digits: Int): GodotString{
        val newString = GodotString()
        newString.godotString = godotString.useContents { godot_string_pad_decimals(this.ptr, digits) }
        return newString
    }

    fun pad_zeros(digits: Int): GodotString{
        val newString = GodotString()
        newString.godotString = godotString.useContents { godot_string_pad_zeros(this.ptr, digits) }
        return newString
    }

    fun percent_decode(): GodotString{
        val newString = GodotString()
        newString.godotString = godotString.useContents { godot_string_percent_decode(this.ptr) }
        return newString
    }

    fun percent_encode(): GodotString{
        val newString = GodotString()
        newString.godotString = godotString.useContents { godot_string_percent_encode(this.ptr) }
        return newString
    }

    fun plus_file(file: GodotString): GodotString{
        val newString = GodotString()
        newString.godotString = useContents(godotString, file.godotString) { a, b ->
            godot_string_plus_file(a.ptr, b.ptr)
        }
        return newString
    }

    fun replace(p_key: GodotString, p_with: GodotString): GodotString{
        val newString = GodotString()
        newString.godotString = useContents(godotString, p_key.godotString) { a, b ->
            p_with.godotString.useContents {
                godot_string_replace(a.ptr, b.readValue(), this.readValue())
            }
        }
        return newString
    }

    fun replacen(what: GodotString, fromWhat: GodotString): GodotString{
        val newString = GodotString()
        newString.godotString = useContents(godotString, what.godotString) { a, b ->
            fromWhat.godotString.useContents {
                godot_string_replacen(a.ptr, b.readValue(), this.readValue())
            }
        }
        return newString
    }

    fun rfind(what: GodotString): Int = useContents(godotString, what.godotString) { a, b ->
        godot_string_rfind(a.ptr, b.readValue())
    }

    fun rfindn(what: GodotString): Int = useContents(godotString, what.godotString) { a, b ->
        godot_string_rfindn(a.ptr, b.readValue())
    }

    fun right(position: Int): GodotString{
        val newString = GodotString()
        newString.godotString = godotString.useContents { godot_string_right(this.ptr, position) }
        return newString
    }

    fun sha256_text(): GodotString{
        val newString = GodotString()
        newString.godotString = godotString.useContents { godot_string_sha256_text(this.ptr) }
        return newString
    }

    fun similatiry(text: GodotString): Float = useContents(godotString, text.godotString) { a, b ->
        godot_string_similarity(a.ptr, b.ptr)
    }

    fun strip_edges(left: Boolean, right: Boolean): GodotString{
        val newString = GodotString()
        newString.godotString = godotString.useContents { godot_string_strip_edges(this.ptr, left, right) }
        return newString
    }

    fun substr(from: Int, len: Int): GodotString{
        val newString = GodotString()
        newString.godotString = godotString.useContents { godot_string_substr(this.ptr, from, len) }
        return newString
    }

    fun to_float(): Float = godotString.useContents { godot_string_to_float(this.ptr) }

    fun to_int(): Int = godotString.useContents { godot_string_to_int(this.ptr) }

    fun to_lower(): GodotString{
        val newString = GodotString()
        newString.godotString = godotString.useContents { godot_string_to_lower(this.ptr) }
        return newString
    }

    fun to_upper(): GodotString{
        val newString = GodotString()
        newString.godotString = godotString.useContents { godot_string_to_upper(this.ptr) }
        return newString
    }

    fun xml_escape(): GodotString{
        val newString = GodotString()
        newString.godotString = godotString.useContents { godot_string_xml_escape(this.ptr) }
        return newString
    }

    fun xml_unescape(): GodotString{
        val newString = GodotString()
        newString.godotString = godotString.useContents { godot_string_xml_unescape(this.ptr) }
        return newString
    }

}
