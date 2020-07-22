package godot.internal.type

inline fun <reified T: Any> notNull(obj: T?) : T{
    return obj!!
}
