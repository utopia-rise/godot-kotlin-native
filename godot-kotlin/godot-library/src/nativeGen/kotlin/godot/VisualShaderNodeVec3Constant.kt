// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Vector3
import godot.icalls._icall_Unit_Vector3
import godot.icalls._icall_Vector3
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Unit
import kotlinx.cinterop.COpaquePointer

open class VisualShaderNodeVec3Constant : VisualShaderNode() {
  open var constant: Vector3
    get() {
      val mb = getMethodBind("VisualShaderNodeVec3Constant","get_constant")
      return _icall_Vector3(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VisualShaderNodeVec3Constant","set_constant")
      _icall_Unit_Vector3(mb, this.ptr, value)
    }

  override fun __new(): COpaquePointer = invokeConstructor("VisualShaderNodeVec3Constant",
      "VisualShaderNodeVec3Constant")

  open fun constant(schedule: Vector3.() -> Unit): Vector3 = constant.apply{
      schedule(this)
      constant = this
  }


  open fun getConstant(): Vector3 {
    val mb = getMethodBind("VisualShaderNodeVec3Constant","get_constant")
    return _icall_Vector3( mb, this.ptr)
  }

  open fun setConstant(value: Vector3) {
    val mb = getMethodBind("VisualShaderNodeVec3Constant","set_constant")
    _icall_Unit_Vector3( mb, this.ptr, value)
  }
}
