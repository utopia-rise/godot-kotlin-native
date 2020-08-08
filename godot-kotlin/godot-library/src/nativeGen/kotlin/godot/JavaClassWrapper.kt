package godot

import godot.core.Godot
import godot.icalls._icall_JavaClass_String
import godot.internal.type.nullSafe
import godot.internal.utils.getMethodBind
import kotlin.String
import kotlin.requireNotNull
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped

object JavaClassWrapper : Object() {
  init {
    memScoped {
        val ptr =
        nullSafe(Godot.gdnative.godot_global_get_singleton).invoke("JavaClassWrapper".cstr.ptr)
        requireNotNull(ptr) { "No instance found for singleton JavaClassWrapper" }
        this@JavaClassWrapper.ptr = ptr
    }
  }

  fun wrap(name: String): JavaClass {
    val mb = getMethodBind("JavaClassWrapper","wrap")
    return _icall_JavaClass_String( mb, this.ptr, name)
  }
}
