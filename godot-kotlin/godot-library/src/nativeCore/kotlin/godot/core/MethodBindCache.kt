package godot.core

import godot.gdnative.godot_method_bind
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped

@ThreadLocal
internal object MethodBindCache {
    private const val KEY_SEPARATOR = "#"
    private val cache = mutableMapOf<String, CPointer<godot_method_bind>>()

    fun getMethodBind(className: String, methodName: String): CPointer<godot_method_bind> {
        return cache.getOrPut(makeKey(className, methodName)) {
            memScoped {
                Godot.gdnative.godot_method_bind_get_method!!.invoke(className.cstr.getPointer(this), methodName.cstr.ptr)
                    ?: throw NotImplementedError("Cannot get method bind for $methodName in $className")
            }
        }
    }

    private fun makeKey(className: String, methodName: String) = "$className$KEY_SEPARATOR$methodName"
}
