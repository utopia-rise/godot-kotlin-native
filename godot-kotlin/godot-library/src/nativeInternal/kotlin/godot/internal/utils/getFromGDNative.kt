package godot.internal.utils

import godot.core.Godot
import godot.gdnative.godot_method_bind
import kotlinx.cinterop.*


internal fun getMethodBind(className: String, methodName: String): CPointer<godot_method_bind> {
    memScoped {
        return Godot.gdnative.godot_method_bind_get_method!!.invoke(className.cstr.getPointer(this), methodName.cstr.ptr) ?: throw NotImplementedError("Cannot get method bind for $methodName in $className")
    }
}

internal fun getConstructor(className: String, oldClassName: String): COpaquePointer {
    memScoped {
        return Godot.gdnative.godot_get_class_constructor!!.invoke(oldClassName.cstr.ptr) ?: throw NotImplementedError("Cannot get constructor for class $className")
    }
}

internal fun getSingleton(className: String, oldClassName: String): COpaquePointer {
    memScoped {
        return Godot.gdnative.godot_global_get_singleton!!.invoke(oldClassName.cstr.ptr) ?: throw NullPointerException("Cannot get singleton instance $className")
    }
}
