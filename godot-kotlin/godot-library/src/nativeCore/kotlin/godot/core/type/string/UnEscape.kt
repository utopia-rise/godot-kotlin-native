package godot.core

import godot.internal.type.nullSafe
import kotlinx.cinterop.invoke

/** Returns a copy of the string with special characters escaped using the C language standard. */
fun String.cEscape() = asGDString {
    nullSafe(Godot.gdnative.godot_string_c_escape)(it.ptr).toKString()
}

/** Returns a copy of the string with special characters escaped using the C language standard. */
fun String.cUnescapeMulti() = asGDString {
    nullSafe(Godot.gdnative.godot_string_c_escape_multiline)(it.ptr).toKString()
}

/** Returns a copy of the string with escaped characters replaced by their meanings according to the C language standard. */
fun String.cUnescape() = asGDString {
    nullSafe(Godot.gdnative.godot_string_c_unescape)(it.ptr).toKString()
}

/** Escapes (encodes) a string to URL friendly format. Also referred to as 'URL encode'. */
fun String.httpEscape() = asGDString {
    nullSafe(Godot.gdnative.godot_string_http_escape)(it.ptr).toKString()
}

/** Unescapes (decodes) a string in URL encoded format. Also referred to as 'URL decode'. */
fun String.httpUnescape() = asGDString {
    nullSafe(Godot.gdnative.godot_string_http_unescape)(it.ptr).toKString()
}

/** Returns a copy of the string with special characters escaped using the JSON standard. */
fun String.jsonEscape() = asGDString {
    nullSafe(Godot.gdnative.godot_string_json_escape)(it.ptr).toKString()
}

/** Returns a copy of the string with special characters escaped using the XML standard.. */
fun String.xmlEscape() = asGDString {
    nullSafe(Godot.gdnative.godot_string_xml_escape)(it.ptr).toKString()
}

/** Returns a copy of the string with special characters escaped using the XML standard. */
fun String.xlmEscapeWithQuotes() = asGDString {
    nullSafe(Godot.gdnative.godot_string_xml_escape_with_quotes)(it.ptr).toKString()
}

/** Returns a copy of the string with escaped characters replaced by their meanings according to the XML standard. */
fun String.xmlUnescape() = asGDString {
    nullSafe(Godot.gdnative.godot_string_xml_unescape)(it.ptr).toKString()
}

/** Decode a percent-encoded string. See percent_encode. */
fun String.percentDecode() = asGDString {
    nullSafe(Godot.gdnative.godot_string_percent_decode)(it.ptr).toKString()
}

/** Percent-encodes a string. Encodes parameters in a URL when sending a HTTP GET request (and bodies of form-urlencoded POST requests). */
fun String.percentEncode() = asGDString {
    nullSafe(Godot.gdnative.godot_string_percent_encode)(it.ptr).toKString()
}
