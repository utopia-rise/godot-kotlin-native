package godot.core

import godot.internal.type.nullSafe
import kotlinx.cinterop.invoke

/** Returns true if this string contains a valid float. */
fun String.isValidFloat(): Boolean = asGDString {
    nullSafe(Godot.gdnative.godot_string_is_valid_float)(it.value.ptr)
}

/** Returns true if this string contains a valid hexadecimal number.
 * If with_prefix is true, then a validity of the hexadecimal number is determined by 0x prefix, for instance: 0xDEADC0DE.
 * */
fun String.isValidHex(withPrefix: Boolean): Boolean = asGDString {
    nullSafe(Godot.gdnative.godot_string_is_valid_hex_number)(it.value.ptr, withPrefix)
}

/** Returns true if this string contains a valid color in hexadecimal HTML notation.
 * Other HTML notations such as named colors or hsl() colors aren't considered valid by this method and will return false. */
fun String.isValidHtmlColor(): Boolean = asGDString {
    nullSafe(Godot.gdnative.godot_string_is_valid_html_color)(it.value.ptr)
}

/** Returns true if this string is a valid identifier.
 * A valid identifier may contain only letters, digits and underscores (_) and the first character may not be a digit. */
fun String.isValidIdentifier(): Boolean = asGDString {
    nullSafe(Godot.gdnative.godot_string_is_valid_identifier)(it.value.ptr)
}

/** Returns true if this string contains a valid integer. */
fun String.isValidInteger(): Boolean = asGDString {
    nullSafe(Godot.gdnative.godot_string_is_valid_integer)(it.value.ptr)
}

/** Returns true if this string contains a valid IP address. */
fun String.isValidAdress(): Boolean = asGDString {
    nullSafe(Godot.gdnative.godot_string_is_valid_ip_address)(it.value.ptr)
}
