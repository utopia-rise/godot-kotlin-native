package kotlin.godot.core

import godot.*
import kotlinx.cinterop.*

class GodotString : CoreType{
    private val allocator = Arena()
    var godotString : godot_string = allocator.alloc() //TODO: CValue<godot_string>
    constructor(){
        godot_string_new(godotString.ptr)
    }

    constructor(contents: kotlin.String){
        godot_string_new(godotString.ptr)
        godot_string_parse_utf8(godotString.ptr, contents)
    }

    constructor(other: GodotString){
        godot_string_new_copy(godotString.ptr, other.godotString.ptr)
    }

    override fun godotPointer(memScope: MemScope): COpaquePointer{
        return godotString.ptr
    }

    companion object{
        fun num(p_num: Double, p_decimals: Int): GodotString {
            val newString = GodotString()
            memScoped {
                newString.godotString = godot_string_num_with_decimals(p_num, p_decimals).ptr.pointed
            }
            return newString
        }

        fun num_scientific(p_num: Double): GodotString {
            val newString = GodotString()
            memScoped {
                newString.godotString = godot_string_num_scientific(p_num).ptr.pointed
            }
            return newString
        }

        fun num_real(p_num: Double): GodotString {
            val newString = GodotString()
            memScoped {
                newString.godotString = godot_string_num_real(p_num).ptr.pointed
            }
            return newString
        }

        fun num_int64(p_num: Long, base: Int = 10, capitalize_hex: Boolean = true): GodotString {
            val newString = GodotString()
            memScoped {
                newString.godotString = godot_string_num_int64_capitalized(p_num, base, capitalize_hex).ptr.pointed

            }
            return newString
        }

        fun char(p_char: Short): GodotString{
            val newString = GodotString()
            memScoped {
                newString.godotString = godot_string_chr(p_char).ptr.pointed
            }
            return newString
        }

        fun md5(p_md5: ByteVarOf<Byte>): GodotString{ //TODO: Normal type for p_md5
            val newString = GodotString()
            memScoped {
                newString.godotString = godot_string_md5(p_md5.ptr).ptr.pointed
            }
            return newString
        }

        fun hex_encode_buffer(p_buffer: ByteVarOf<Byte>, p_len: Int): GodotString{ //TODO: Normal type for p_buffer
            val newString = GodotString()
            memScoped {
                newString.godotString = godot_string_hex_encode_buffer(p_buffer.ptr, p_len).ptr.pointed
            }
            return newString
        }
    }

    operator fun get(idx: Int) : ShortVar? = godot_string_operator_index(godotString.ptr, idx)?.pointed //TODO: Normal type for return val


    override fun equals(other: Any?): Boolean =
        if(other is GodotString) godot_string_operator_equal(godotString.ptr, other.godotString.ptr) else false

    operator fun plus(other: GodotString): GodotString{
        val newString = GodotString()
        memScoped {
            newString.godotString = godot_string_operator_plus(godotString.ptr, other.godotString.ptr).ptr.pointed
        }
        return newString
    }

    operator fun compareTo(other: GodotString) =
        if (this == other) 0
        else if(godot_string_operator_less(godotString.ptr, other.godotString.ptr)) -1
        else 1

    override fun toString(): kotlin.String{
        memScoped {
            val content = godot_string_utf8(godotString.ptr)
            val ret = godot_char_string_get_data(content.ptr).toString()
            godot_char_string_destroy(content.ptr)
            return ret
        }
    }

    fun length(): Int = godot_string_length(godotString.ptr)

    fun unicode_str(): ShortVar?{ //TODO: Normal type for return val
        return godot_string_wide_str(godotString.ptr)?.pointed
    }

    fun begins_with(p_string: GodotString): Boolean = godot_string_begins_with(godotString.ptr, p_string.godotString.ptr)

    fun begins_with_char_array(p_string: kotlin.String): Boolean = godot_string_begins_with_char_array(godotString.ptr, p_string)

    fun c_escape(): GodotString{
        val newString = GodotString()
        memScoped{
            newString.godotString = godot_string_c_escape(godotString.ptr).ptr.pointed
        }
        return newString
    }

    fun c_unescape(): GodotString{
        val newString = GodotString()
        memScoped {
            newString.godotString = godot_string_c_unescape(godotString.ptr).ptr.pointed
        }
        return newString
    }

    fun capitalize(): GodotString{
        val newString = GodotString()
        memScoped {
            newString.godotString = godot_string_capitalize(godotString.ptr).ptr.pointed
        }
        return newString
    }

    fun empty(): Boolean = godot_string_empty(godotString.ptr)

    fun ends_with(p_string: GodotString): Boolean = godot_string_ends_with(godotString.ptr, p_string.godotString.ptr)

    fun erase(position: Int, chars: Int) = godot_string_erase(godotString.ptr, position, chars)

    fun find(p_what: GodotString): Int = godot_string_find(godotString.ptr, p_what.godotString.readValue())

    fun get_basename(): GodotString{
        val newString = GodotString()
        memScoped {
            newString.godotString = godot_string_get_basename(godotString.ptr).ptr.pointed
        }
        return newString
    }

    fun get_extension(): GodotString{
        val newString = GodotString()
        memScoped {
            newString.godotString = godot_string_get_extension(godotString.ptr).ptr.pointed
        }
        return newString
    }

    fun get_file(): GodotString{
        val newString = GodotString()
        memScoped {
            newString.godotString = godot_string_get_file(godotString.ptr).ptr.pointed
        }
        return newString
    }

    override fun hashCode(): Int = godot_string_hash(godotString.ptr)

    fun hex_to_int(): Int = godot_string_hex_to_int(godotString.ptr)

    fun insert(position: Int, p_what: GodotString): GodotString{
        val newString = GodotString()
        memScoped {
            newString.godotString = godot_string_insert(godotString.ptr, position, p_what.godotString.readValue()).ptr.pointed
        }
        return newString
    }

    fun is_abs_path(): Boolean = godot_string_is_abs_path(godotString.ptr)

    fun is_rel_path(): Boolean = godot_string_is_rel_path(godotString.ptr)

    fun is_subsequence_of(text: GodotString): Boolean = godot_string_is_subsequence_of(godotString.ptr, text.godotString.ptr)

    fun is_subsequence_ofi(text: GodotString): Boolean = godot_string_is_subsequence_ofi(godotString.ptr, text.godotString.ptr)

    fun is_valid_float(): Boolean = godot_string_is_valid_float(godotString.ptr)

    fun is_valid_html_color(): Boolean = godot_string_is_valid_html_color(godotString.ptr)

    fun is_valid_identifier(): Boolean = godot_string_is_valid_identifier(godotString.ptr)

    fun is_valid_integer(): Boolean = godot_string_is_valid_integer(godotString.ptr)

    fun is_valid_ip_address(): Boolean = godot_string_is_valid_ip_address(godotString.ptr)

    fun json_escape(): GodotString{
        val newString = GodotString()
        memScoped {
            newString.godotString = godot_string_json_escape(godotString.ptr).ptr.pointed
        }
        return newString
    }

    fun left(position: Int): GodotString{
        val newString = GodotString()
        memScoped {
            newString.godotString = godot_string_left(godotString.ptr, position).ptr.pointed
        }
        return newString
    }

    fun match(expr: GodotString): Boolean = godot_string_match(godotString.ptr, expr.godotString.ptr)

    fun matchn(expr: GodotString): Boolean = godot_string_matchn(godotString.ptr, expr.godotString.ptr)

    fun md5_text(): GodotString{
        val newString = GodotString()
        memScoped {
            newString.godotString = godot_string_md5_text(godotString.ptr).ptr.pointed
        }
        return newString
    }

    fun ord_at(at: Int): Short = godot_string_ord_at(godotString.ptr, at)

    fun pad_decimals(digits: Int): GodotString{
        val newString = GodotString()
        memScoped {
            newString.godotString = godot_string_pad_decimals(godotString.ptr, digits).ptr.pointed
        }
        return newString
    }

    fun pad_zeros(digits: Int): GodotString{
        val newString = GodotString()
        memScoped {
            newString.godotString = godot_string_pad_zeros(godotString.ptr, digits).ptr.pointed
        }
        return newString
    }

    fun percent_decode(): GodotString{
        val newString = GodotString()
        memScoped {
            newString.godotString = godot_string_percent_decode(godotString.ptr).ptr.pointed
        }
        return newString
    }

    fun percent_encode(): GodotString{
        val newString = GodotString()
        memScoped {
            newString.godotString = godot_string_percent_encode(godotString.ptr).ptr.pointed
        }
        return newString
    }

    fun plus_file(file: GodotString): GodotString{
        val newString = GodotString()
        memScoped {
            newString.godotString = godot_string_plus_file(godotString.ptr, file.godotString.ptr).ptr.pointed
        }
        return newString
    }

    fun replace(p_key: GodotString, p_with: GodotString): GodotString{
        val newString = GodotString()
        memScoped {
            newString.godotString = godot_string_replace(godotString.ptr, p_key.godotString.readValue(), p_with.godotString.readValue()).ptr.pointed
        }
        return newString
    }

    fun replacen(what: GodotString, fromWhat: GodotString): GodotString{
        val newString = GodotString()
        memScoped {
            newString.godotString = godot_string_replacen(godotString.ptr, what.godotString.readValue(), fromWhat.godotString.readValue()).ptr.pointed
        }
        return newString
    }

    fun rfind(what: GodotString): Int = godot_string_rfind(godotString.ptr, what.godotString.readValue())

    fun rfindn(what: GodotString): Int = godot_string_rfindn(godotString.ptr, what.godotString.readValue())

    fun right(position: Int): GodotString{
        val newString = GodotString()
        memScoped {
            newString.godotString = godot_string_right(godotString.ptr, position).ptr.pointed
        }
        return newString
    }

    fun sha256_text(): GodotString{
        val newString = GodotString()
        memScoped {
            newString.godotString = godot_string_sha256_text(godotString.ptr).ptr.pointed
        }
        return newString
    }

    fun similatiry(text: GodotString): Float = godot_string_similarity(godotString.ptr, text.godotString.ptr)

    fun strip_edges(left: Boolean, right: Boolean): GodotString{
        val newString = GodotString()
        memScoped {
            newString.godotString = godot_string_strip_edges(godotString.ptr, left, right).ptr.pointed
        }
        return newString
    }

    fun substr(from: Int, len: Int): GodotString{
        val newString = GodotString()
        memScoped {
            newString.godotString = godot_string_substr(godotString.ptr, from, len).ptr.pointed
        }
        return newString
    }

    fun to_float(): Float = godot_string_to_float(godotString.ptr)

    fun to_int(): Int = godot_string_to_int(godotString.ptr)

    fun to_lower(): GodotString{
        val newString = GodotString()
        memScoped {
            newString.godotString = godot_string_to_lower(godotString.ptr).ptr.pointed
        }
        return newString
    }

    fun to_upper(): GodotString{
        val newString = GodotString()
        memScoped {
            newString.godotString = godot_string_to_upper(godotString.ptr).ptr.pointed
        }
        return newString
    }

    fun xml_escape(): GodotString{
        val newString = GodotString()
        memScoped {
            newString.godotString = godot_string_xml_escape(godotString.ptr).ptr.pointed
        }
        return newString
    }

    fun xml_unescape(): GodotString{
        val newString = GodotString()
        memScoped {
            newString.godotString = godot_string_xml_unescape(godotString.ptr).ptr.pointed
        }
        return newString
    }

}
