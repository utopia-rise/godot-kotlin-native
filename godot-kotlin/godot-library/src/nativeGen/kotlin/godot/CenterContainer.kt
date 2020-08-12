// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.icalls._icall_Boolean
import godot.icalls._icall_Unit_Boolean
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Boolean
import kotlinx.cinterop.COpaquePointer

open class CenterContainer : Container() {
  open var useTopLeft: Boolean
    get() {
      val mb = getMethodBind("CenterContainer","is_using_top_left")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CenterContainer","set_use_top_left")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  override fun __new(): COpaquePointer = invokeConstructor("CenterContainer", "CenterContainer")

  open fun isUsingTopLeft(): Boolean {
    val mb = getMethodBind("CenterContainer","is_using_top_left")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun setUseTopLeft(enable: Boolean) {
    val mb = getMethodBind("CenterContainer","set_use_top_left")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }
}
