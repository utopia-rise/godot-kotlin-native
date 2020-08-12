// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Transform
import godot.icalls._icall_Transform
import godot.icalls._icall_Unit_Transform
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Unit
import kotlinx.cinterop.COpaquePointer

open class VisualShaderNodeTransformConstant : VisualShaderNode() {
  open var constant: Transform
    get() {
      val mb = getMethodBind("VisualShaderNodeTransformConstant","get_constant")
      return _icall_Transform(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VisualShaderNodeTransformConstant","set_constant")
      _icall_Unit_Transform(mb, this.ptr, value)
    }

  override fun __new(): COpaquePointer = invokeConstructor("VisualShaderNodeTransformConstant",
      "VisualShaderNodeTransformConstant")

  open fun constant(schedule: Transform.() -> Unit): Transform = constant.apply{
      schedule(this)
      constant = this
  }


  open fun getConstant(): Transform {
    val mb = getMethodBind("VisualShaderNodeTransformConstant","get_constant")
    return _icall_Transform( mb, this.ptr)
  }

  open fun setConstant(value: Transform) {
    val mb = getMethodBind("VisualShaderNodeTransformConstant","set_constant")
    _icall_Unit_Transform( mb, this.ptr, value)
  }
}
