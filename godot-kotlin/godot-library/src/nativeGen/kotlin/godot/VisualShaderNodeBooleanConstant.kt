// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.icalls._icall_Boolean
import godot.icalls._icall_Unit_Boolean
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Boolean
import kotlinx.cinterop.COpaquePointer

open class VisualShaderNodeBooleanConstant : VisualShaderNode() {
  open var constant: Boolean
    get() {
      val mb = getMethodBind("VisualShaderNodeBooleanConstant","get_constant")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VisualShaderNodeBooleanConstant","set_constant")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  override fun __new(): COpaquePointer = invokeConstructor("VisualShaderNodeBooleanConstant",
      "VisualShaderNodeBooleanConstant")

  open fun getConstant(): Boolean {
    val mb = getMethodBind("VisualShaderNodeBooleanConstant","get_constant")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun setConstant(value: Boolean) {
    val mb = getMethodBind("VisualShaderNodeBooleanConstant","set_constant")
    _icall_Unit_Boolean( mb, this.ptr, value)
  }
}
