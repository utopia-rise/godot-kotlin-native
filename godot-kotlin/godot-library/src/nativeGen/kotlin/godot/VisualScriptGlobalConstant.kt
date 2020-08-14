// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.icalls._icall_Long
import godot.icalls._icall_Unit_Long
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Long
import kotlinx.cinterop.COpaquePointer

open class VisualScriptGlobalConstant : VisualScriptNode() {
  open var constant: Long
    get() {
      val mb = getMethodBind("VisualScriptGlobalConstant","get_global_constant")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VisualScriptGlobalConstant","set_global_constant")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  override fun __new(): COpaquePointer = invokeConstructor("VisualScriptGlobalConstant",
      "VisualScriptGlobalConstant")

  open fun getGlobalConstant(): Long {
    val mb = getMethodBind("VisualScriptGlobalConstant","get_global_constant")
    return _icall_Long( mb, this.ptr)
  }

  open fun setGlobalConstant(index: Long) {
    val mb = getMethodBind("VisualScriptGlobalConstant","set_global_constant")
    _icall_Unit_Long( mb, this.ptr, index)
  }
}
