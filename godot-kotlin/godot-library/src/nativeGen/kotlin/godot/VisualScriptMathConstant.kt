// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.VisualScriptMathConstant
import godot.core.Godot.shouldInitPtr
import godot.icalls._icall_Long
import godot.icalls._icall_Unit_Long
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Any
import kotlin.Long

open class VisualScriptMathConstant internal constructor(
  _ignore: Any?
) : VisualScriptNode(_ignore) {
  open var constant: Long
    get() {
      val mb = getMethodBind("VisualScriptMathConstant","get_math_constant")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VisualScriptMathConstant","set_math_constant")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = invokeConstructor("VisualScriptMathConstant", "VisualScriptMathConstant")
        }

  }

  open fun getMathConstant(): VisualScriptMathConstant.MathConstant {
    val mb = getMethodBind("VisualScriptMathConstant","get_math_constant")
    return VisualScriptMathConstant.MathConstant.from( _icall_Long( mb, this.ptr))
  }

  open fun setMathConstant(which: Long) {
    val mb = getMethodBind("VisualScriptMathConstant","set_math_constant")
    _icall_Unit_Long( mb, this.ptr, which)
  }

  enum class MathConstant(
    id: Long
  ) {
    MATH_CONSTANT_ONE(0),

    MATH_CONSTANT_PI(1),

    MATH_CONSTANT_HALF_PI(2),

    MATH_CONSTANT_TAU(3),

    MATH_CONSTANT_E(4),

    MATH_CONSTANT_SQRT2(5),

    MATH_CONSTANT_INF(6),

    MATH_CONSTANT_NAN(7),

    MATH_CONSTANT_MAX(8);

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
