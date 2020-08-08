package godot

import godot.core.Color
import godot.core.Godot.shouldInitPtr
import godot.icalls._icall_Color
import godot.icalls._icall_Unit_Color
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
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
            this.ptr = getConstructor("VisualShaderNodeColorConstant",
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

  companion object
}
