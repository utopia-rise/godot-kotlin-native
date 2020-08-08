package godot.core

import godot.internal.type.nullSafe
import godot.internal.type.toKotlinReal
import kotlinx.cinterop.invoke

/** Returns the similarity index of the text compared to this string. 1 means totally similar and 0 means totally dissimilar. */
fun String.similarity(other: String) = asGDString { first ->
    other.asGDString { second ->
        nullSafe(Godot.gdnative.godot_string_similarity)(first, second).toKotlinReal()
    }
}

/** Convert a CamelCase string to a Snake_Case one */
fun String.camelcaseToUnderscore() = asGDString {
    nullSafe(Godot.gdnative.godot_string_camelcase_to_underscore)(it).string
}

/** Convert a CamelCase string to a snake_case one */
fun String.camelcaseToUnderscoreLowercased(other: String) = asGDString {

    nullSafe(Godot.gdnative.godot_string_camelcase_to_underscore_lowercased)(it).string
}
