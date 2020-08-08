package godot

import godot.core.Godot.shouldInitPtr
import godot.icalls._icall_Double
import godot.icalls._icall_Unit_Double
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Double

open class VisualShaderNodeScalarConstant internal constructor(
  _ignore: Any?
) : VisualShaderNode(_ignore) {
  open var constant: Double
    get() {
      val mb = getMethodBind("VisualShaderNodeScalarConstant","get_constant")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VisualShaderNodeScalarConstant","set_constant")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("VisualShaderNodeScalarConstant",
            "VisualShaderNodeScalarConstant")
        }

  }

  open fun getConstant(): Double {
    val mb = getMethodBind("VisualShaderNodeScalarConstant","get_constant")
    return _icall_Double( mb, this.ptr)
  }

  open fun setConstant(value: Double) {
    val mb = getMethodBind("VisualShaderNodeScalarConstant","set_constant")
    _icall_Unit_Double( mb, this.ptr, value)
  }

  companion object
}
