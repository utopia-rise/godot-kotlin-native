// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.icalls._icall_Boolean
import godot.icalls._icall_Unit_Boolean
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Boolean
import kotlinx.cinterop.COpaquePointer

open class YSort : Node2D() {
  open var sortEnabled: Boolean
    get() {
      val mb = getMethodBind("YSort","is_sort_enabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("YSort","set_sort_enabled")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  override fun __new(): COpaquePointer = invokeConstructor("YSort", "YSort")

  open fun isSortEnabled(): Boolean {
    val mb = getMethodBind("YSort","is_sort_enabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun setSortEnabled(enabled: Boolean) {
    val mb = getMethodBind("YSort","set_sort_enabled")
    _icall_Unit_Boolean( mb, this.ptr, enabled)
  }
}
