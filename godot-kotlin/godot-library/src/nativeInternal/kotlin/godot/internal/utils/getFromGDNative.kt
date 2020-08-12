package godot.internal.utils

import godot.core.Godot
import godot.core.MethodBindCache
import godot.gdnative.godot_method_bind
import kotlinx.cinterop.*

@Suppress("NOTHING_TO_INLINE")
internal inline fun getMethodBind(className: String, methodName: String): CPointer<godot_method_bind> {
    return MethodBindCache.getMethodBind(className, methodName)
}

internal fun invokeConstructor(className: String, oldClassName: String): COpaquePointer {
    memScoped {
        return Godot.gdnative.godot_get_class_constructor
            ?.invoke(oldClassName.cstr.ptr)
            ?.reinterpret<CFunction<() -> COpaquePointer>>()
            ?.invoke()
            ?: throw NotImplementedError("Cannot get constructor for class $className")
    }
}

internal fun getSingleton(className: String, oldClassName: String): COpaquePointer {
    memScoped {
        return Godot.gdnative.godot_global_get_singleton!!.invoke(oldClassName.cstr.ptr) ?: throw NotImplementedError("Cannot get singleton instance $className")
    }
}
