package godot.utils

import godot.GodotObject
import godot.gdnative.godot_global_get_singleton
import godot.gdnative.godot_method_bind
import godot.gdnative.godot_method_bind_get_method
import godot.gdnative.godot_variant_as_object
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import godot.core.Variant


internal fun getMB(cl: String, m: String): CPointer<godot_method_bind> {
    return godot_method_bind_get_method(cl, m) ?: throw NotImplementedError("Cannot get method bind for $m in $cl")
}


internal fun getSingleton(cl: String, clOld: String): COpaquePointer {
    return godot_global_get_singleton(cl.cstr) ?: throw NullPointerException("Cannot get singleton instance for class $clOld")
}


internal fun <T: GodotObject> fromVariant(obj: T, other: Variant): T {
    obj.setRawMemory(godot_variant_as_object(other.nativeValue)
            ?: throw NullPointerException("godot_variant_as_object return null for $other"))
    return obj
}