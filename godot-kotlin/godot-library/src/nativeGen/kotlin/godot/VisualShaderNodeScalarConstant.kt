// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.icalls._icall_Double
import godot.icalls._icall_Unit_Double
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Double
import kotlinx.cinterop.COpaquePointer

open class VisualShaderNodeScalarConstant : VisualShaderNode() {
  open var constant: Double
    get() {
      val mb = getMethodBind("VisualShaderNodeScalarConstant","get_constant")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VisualShaderNodeScalarConstant","set_constant")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  override fun __new(): COpaquePointer = invokeConstructor("VisualShaderNodeScalarConstant",
      "VisualShaderNodeScalarConstant")

  open fun getConstant(): Double {
    val mb = getMethodBind("VisualShaderNodeScalarConstant","get_constant")
    return _icall_Double( mb, this.ptr)
  }

  open fun setConstant(value: Double) {
    val mb = getMethodBind("VisualShaderNodeScalarConstant","set_constant")
    _icall_Unit_Double( mb, this.ptr, value)
  }
}
