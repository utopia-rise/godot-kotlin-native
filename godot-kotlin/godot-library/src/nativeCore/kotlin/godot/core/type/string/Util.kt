package godot.core.type.string

import godot.core.GdString
import godot.core.Godot
import godot.core.asGDString
import godot.internal.type.nullSafe
import godot.internal.type.toRealT
import kotlinx.cinterop.invoke

/** Returns the similarity index of the text compared to this string. 1 means totally similar and 0 means totally dissimilar. */
fun String.similarity(other: String) = asGDString { first ->
    other.asGDString { second ->
        nullSafe(Godot.gdnative.godot_string_similarity)(first.value.ptr, second.value.ptr).toRealT()
    }
}

/** Convert a CamelCase string to a Snake_Case one */
fun String.camelcaseToUnderscore() = asGDString {
    GdString(nullSafe(Godot.gdnative.godot_string_camelcase_to_underscore)(it.value.ptr)).toKString()
}

/** Convert a CamelCase string to a snake_case one */
fun String.camelcaseToUnderscoreLowercased(other: String) = asGDString {
    GdString(nullSafe(Godot.gdnative.godot_string_camelcase_to_underscore_lowercased)(it.value.ptr)).toKString()
}
