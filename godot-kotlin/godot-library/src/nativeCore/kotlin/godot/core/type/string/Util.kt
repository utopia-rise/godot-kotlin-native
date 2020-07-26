package godot.core.type.string

import godot.core.Godot
import godot.core.asGDString
import godot.core.toKString
import godot.internal.type.nullSafe
import godot.internal.type.toRealT
import kotlinx.cinterop.invoke

/** Returns the similarity index of the text compared to this string. 1 means totally similar and 0 means totally dissimilar. */
fun String.similarity(other: String) = asGDString { first ->
    other.asGDString { second ->
        nullSafe(Godot.gdnative.godot_string_similarity)(first.ptr, second.ptr).toRealT()
    }
}

/** Convert a CamelCase string to a Snake_Case one */
fun String.camelcaseToUnderscore() = asGDString {
    nullSafe(Godot.gdnative.godot_string_camelcase_to_underscore)(it.ptr).toKString()
}

/** Convert a CamelCase string to a snake_case one */
fun String.camelcaseToUnderscoreLowercased(other: String) = asGDString {
    nullSafe(Godot.gdnative.godot_string_camelcase_to_underscore_lowercased)(it.ptr).toKString()
}
