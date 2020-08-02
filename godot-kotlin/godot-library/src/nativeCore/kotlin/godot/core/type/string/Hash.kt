package godot.core

import godot.internal.type.nullSafe
import kotlinx.cinterop.invoke

/** Hashes the string and returns a 32-bit integer. */
fun String.hash() = asGDString {
    nullSafe(Godot.gdnative.godot_string_hash)(it.value.ptr).toInt()
}

/** Hashes the string and returns a 64-bit integer. */
fun String.hash64() = asGDString {
    nullSafe(Godot.gdnative.godot_string_hash64)(it.value.ptr).toLong()
}

/** Returns the MD5 hash of the string as an array of bytes. */
fun String.md5Buffer() = asGDString {
    PoolByteArray(nullSafe(Godot.gdnative.godot_string_md5_buffer)(it.value.ptr))
}

/** Returns the MD5 hash of the string as a string. */
fun String.md5Text() = asGDString {
    GdString(nullSafe(Godot.gdnative.godot_string_md5_text)(it.value.ptr)).toKString()
}

/** Returns the SHA-256 hash of the string as an array of bytes. */
fun String.sha256Buffer() = asGDString {
    PoolByteArray(nullSafe(Godot.gdnative.godot_string_sha256_buffer)(it.value.ptr))
}

/** Returns the SHA-256 hash of the string as a string. */
fun String.sha256Text() = asGDString {
    GdString(nullSafe(Godot.gdnative.godot_string_sha256_text)(it.value.ptr)).toKString()
}
