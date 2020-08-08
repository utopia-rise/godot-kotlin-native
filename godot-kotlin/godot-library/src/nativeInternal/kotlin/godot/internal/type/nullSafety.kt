package godot.internal.type

inline fun <reified T : Any> nullSafe(obj: T?): T {
    return obj!!
}

inline fun <reified T> isNullable(): Boolean = null is T
