// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot.shouldInitPtr
import godot.icalls._icall_Boolean
import godot.icalls._icall_Unit_Boolean
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Any
import kotlin.Boolean

open class VisualShaderNodeBooleanConstant internal constructor(
  _ignore: Any?
) : VisualShaderNode(_ignore) {
  open var constant: Boolean
    get() {
      val mb = getMethodBind("VisualShaderNodeBooleanConstant","get_constant")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VisualShaderNodeBooleanConstant","set_constant")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = invokeConstructor("VisualShaderNodeBooleanConstant",
            "VisualShaderNodeBooleanConstant")
        }

  }

  open fun getConstant(): Boolean {
    val mb = getMethodBind("VisualShaderNodeBooleanConstant","get_constant")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun setConstant(value: Boolean) {
    val mb = getMethodBind("VisualShaderNodeBooleanConstant","set_constant")
    _icall_Unit_Boolean( mb, this.ptr, value)
  }
}
