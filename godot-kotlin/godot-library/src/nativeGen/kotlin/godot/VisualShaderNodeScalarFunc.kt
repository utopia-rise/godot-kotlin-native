// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.VisualShaderNodeScalarFunc
import godot.icalls._icall_Long
import godot.icalls._icall_Unit_Long
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Long
import kotlinx.cinterop.COpaquePointer

open class VisualShaderNodeScalarFunc : VisualShaderNode() {
  open var function: Long
    get() {
      val mb = getMethodBind("VisualShaderNodeScalarFunc","get_function")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VisualShaderNodeScalarFunc","set_function")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  override fun __new(): COpaquePointer = invokeConstructor("VisualShaderNodeScalarFunc",
      "VisualShaderNodeScalarFunc")

  open fun getFunction(): VisualShaderNodeScalarFunc.Function {
    val mb = getMethodBind("VisualShaderNodeScalarFunc","get_function")
    return VisualShaderNodeScalarFunc.Function.from( _icall_Long( mb, this.ptr))
  }

  open fun setFunction(func: Long) {
    val mb = getMethodBind("VisualShaderNodeScalarFunc","set_function")
    _icall_Unit_Long( mb, this.ptr, func)
  }

  enum class Function(
    id: Long
  ) {
    FUNC_SIN(0),

    FUNC_COS(1),

    FUNC_TAN(2),

    FUNC_ASIN(3),

    FUNC_ACOS(4),

    FUNC_ATAN(5),

    FUNC_SINH(6),

    FUNC_COSH(7),

    FUNC_TANH(8),

    FUNC_LOG(9),

    FUNC_EXP(10),

    FUNC_SQRT(11),

    FUNC_ABS(12),

    FUNC_SIGN(13),

    FUNC_FLOOR(14),

    FUNC_ROUND(15),

    FUNC_CEIL(16),

    FUNC_FRAC(17),

    FUNC_SATURATE(18),

    FUNC_NEGATE(19),

    FUNC_ACOSH(20),

    FUNC_ASINH(21),

    FUNC_ATANH(22),

    FUNC_DEGREES(23),

    FUNC_EXP2(24),

    FUNC_INVERSE_SQRT(25),

    FUNC_LOG2(26),

    FUNC_RADIANS(27),

    FUNC_RECIPROCAL(28),

    FUNC_ROUNDEVEN(29),

    FUNC_TRUNC(30),

    FUNC_ONEMINUS(31);

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
