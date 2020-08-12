// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Color
import godot.core.Godot.shouldInitPtr
import godot.icalls._icall_Color
import godot.icalls._icall_Unit_Color
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Any
import kotlin.Unit

open class VisualShaderNodeColorConstant internal constructor(
  _ignore: Any?
) : VisualShaderNode(_ignore) {
  open var constant: Color
    get() {
      val mb = getMethodBind("VisualShaderNodeColorConstant","get_constant")
      return _icall_Color(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VisualShaderNodeColorConstant","set_constant")
      _icall_Unit_Color(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = invokeConstructor("VisualShaderNodeColorConstant",
            "VisualShaderNodeColorConstant")
        }

  }

  open fun constant(schedule: Color.() -> Unit): Color = constant.apply{
      schedule(this)
      constant = this
  }


  open fun getConstant(): Color {
    val mb = getMethodBind("VisualShaderNodeColorConstant","get_constant")
    return _icall_Color( mb, this.ptr)
  }

  open fun setConstant(value: Color) {
    val mb = getMethodBind("VisualShaderNodeColorConstant","set_constant")
    _icall_Unit_Color( mb, this.ptr, value)
  }
}
