package godot.core

import godot.internal.type.nullSafe
import kotlinx.cinterop.invoke

/** If the string is a valid file path, returns the base directory name. */
fun String.getBaseDir() = asGDString {
    GdString(nullSafe(Godot.gdnative.godot_string_get_base_dir)(it.value.ptr)).toKString()
}

/** If the string is a valid file path, returns the full file path without the extension. */
fun String.getBaseName() = asGDString {
    GdString(nullSafe(Godot.gdnative.godot_string_get_basename)(it.value.ptr)).toKString()
}

/** If the string is a valid file path, returns the extension. */
fun String.getExtension() = asGDString {
    GdString(nullSafe(Godot.gdnative.godot_string_get_extension)(it.value.ptr)).toKString()
}

/** If the string is a valid file path, returns the filename. */
fun String.getFile() = asGDString {
    GdString(nullSafe(Godot.gdnative.godot_string_get_file)(it.value.ptr)).toKString()
}

/** If the string is a path to a file or directory, returns true if the path is absolute. */
fun String.isAbsolutePath(): Boolean = asGDString {
    nullSafe(Godot.gdnative.godot_string_is_abs_path)(it.value.ptr)
}

/** If the string is a path to a file or directory, returns true if the path is relative. */
fun String.isRelativePath(): Boolean = asGDString {
    nullSafe(Godot.gdnative.godot_string_is_rel_path)(it.value.ptr)
}

/**  Return true if the string is a path to a Godot resource. */
fun String.isResourceFile(): Boolean = asGDString {
    nullSafe(Godot.gdnative.godot_string_is_resource_file)(it.value.ptr)
}

/** Simplify the path if there is redundant relative paths inside. */
fun String.simplifyPath() = asGDString {
    GdString(nullSafe(Godot.gdnative.godot_string_simplify_path)(it.value.ptr)).toKString()
}
