package godot.internal.utils

import godot.core.Godot
import godot.gdnative.godot_method_bind
import kotlinx.cinterop.*


internal fun getMethodBind(cl: String, m: String): CPointer<godot_method_bind> {
    memScoped {
        return Godot.gdnative.godot_method_bind_get_method!!.invoke(cl.cstr.getPointer(this), m.cstr.ptr) ?: throw NotImplementedError("Cannot get method bind for $m in $cl")
    }
}


internal fun getSingleton(cl: String, clOld: String): COpaquePointer {
    memScoped {
        return Godot.gdnative.godot_global_get_singleton!!.invoke(cl.cstr.ptr) ?: throw NullPointerException("Cannot get singleton instance for class $clOld")
    }
}
