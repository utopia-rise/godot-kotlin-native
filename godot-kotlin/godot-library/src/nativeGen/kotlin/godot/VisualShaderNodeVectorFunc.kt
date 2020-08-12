// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.VisualShaderNodeVectorFunc
import godot.core.Godot.shouldInitPtr
import godot.icalls._icall_Long
import godot.icalls._icall_Unit_Long
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Long

open class VisualShaderNodeVectorFunc internal constructor(
  _ignore: Any?
) : VisualShaderNode(_ignore) {
  open var function: Long
    get() {
      val mb = getMethodBind("VisualShaderNodeVectorFunc","get_function")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VisualShaderNodeVectorFunc","set_function")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("VisualShaderNodeVectorFunc", "VisualShaderNodeVectorFunc")
        }

  }

  open fun getFunction(): VisualShaderNodeVectorFunc.Function {
    val mb = getMethodBind("VisualShaderNodeVectorFunc","get_function")
    return VisualShaderNodeVectorFunc.Function.from( _icall_Long( mb, this.ptr))
  }

  open fun setFunction(func: Long) {
    val mb = getMethodBind("VisualShaderNodeVectorFunc","set_function")
    _icall_Unit_Long( mb, this.ptr, func)
  }

  enum class Function(
    id: Long
  ) {
    FUNC_NORMALIZE(0),

    FUNC_SATURATE(1),

    FUNC_NEGATE(2),

    FUNC_RECIPROCAL(3),

    FUNC_RGB2HSV(4),

    FUNC_HSV2RGB(5),

    FUNC_ABS(6),

    FUNC_ACOS(7),

    FUNC_ACOSH(8),

    FUNC_ASIN(9),

    FUNC_ASINH(10),

    FUNC_ATAN(11),

    FUNC_ATANH(12),

    FUNC_CEIL(13),

    FUNC_COS(14),

    FUNC_COSH(15),

    FUNC_DEGREES(16),

    FUNC_EXP(17),

    FUNC_EXP2(18),

    FUNC_FLOOR(19),

    FUNC_FRAC(20),

    FUNC_INVERSE_SQRT(21),

    FUNC_LOG(22),

    FUNC_LOG2(23),

    FUNC_RADIANS(24),

    FUNC_ROUND(25),

    FUNC_ROUNDEVEN(26),

    FUNC_SIGN(27),

    FUNC_SIN(28),

    FUNC_SINH(29),

    FUNC_SQRT(30),

    FUNC_TAN(31),

    FUNC_TANH(32),

    FUNC_TRUNC(33),

    FUNC_ONEMINUS(34);

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
