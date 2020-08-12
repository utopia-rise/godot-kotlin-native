// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.VisualShaderNodeScalarDerivativeFunc
import godot.core.Godot.shouldInitPtr
import godot.icalls._icall_Long
import godot.icalls._icall_Unit_Long
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Any
import kotlin.Long

open class VisualShaderNodeScalarDerivativeFunc internal constructor(
  _ignore: Any?
) : VisualShaderNode(_ignore) {
  open var function: Long
    get() {
      val mb = getMethodBind("VisualShaderNodeScalarDerivativeFunc","get_function")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VisualShaderNodeScalarDerivativeFunc","set_function")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = invokeConstructor("VisualShaderNodeScalarDerivativeFunc",
            "VisualShaderNodeScalarDerivativeFunc")
        }

  }

  open fun getFunction(): VisualShaderNodeScalarDerivativeFunc.Function {
    val mb = getMethodBind("VisualShaderNodeScalarDerivativeFunc","get_function")
    return VisualShaderNodeScalarDerivativeFunc.Function.from( _icall_Long( mb, this.ptr))
  }

  open fun setFunction(func: Long) {
    val mb = getMethodBind("VisualShaderNodeScalarDerivativeFunc","set_function")
    _icall_Unit_Long( mb, this.ptr, func)
  }

  enum class Function(
    id: Long
  ) {
    FUNC_SUM(0),

    FUNC_X(1),

    FUNC_Y(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object
}
