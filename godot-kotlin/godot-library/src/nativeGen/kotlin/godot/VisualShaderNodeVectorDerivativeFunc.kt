// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.VisualShaderNodeVectorDerivativeFunc
import godot.icalls._icall_Long
import godot.icalls._icall_Unit_Long
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Long
import kotlinx.cinterop.COpaquePointer

open class VisualShaderNodeVectorDerivativeFunc : VisualShaderNode() {
  open var function: Long
    get() {
      val mb = getMethodBind("VisualShaderNodeVectorDerivativeFunc","get_function")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VisualShaderNodeVectorDerivativeFunc","set_function")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  override fun __new(): COpaquePointer = invokeConstructor("VisualShaderNodeVectorDerivativeFunc",
      "VisualShaderNodeVectorDerivativeFunc")

  open fun getFunction(): VisualShaderNodeVectorDerivativeFunc.Function {
    val mb = getMethodBind("VisualShaderNodeVectorDerivativeFunc","get_function")
    return VisualShaderNodeVectorDerivativeFunc.Function.from( _icall_Long( mb, this.ptr))
  }

  open fun setFunction(func: Long) {
    val mb = getMethodBind("VisualShaderNodeVectorDerivativeFunc","set_function")
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
