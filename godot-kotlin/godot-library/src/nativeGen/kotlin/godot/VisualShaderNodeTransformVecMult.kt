// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.VisualShaderNodeTransformVecMult
import godot.core.Godot.shouldInitPtr
import godot.icalls._icall_Long
import godot.icalls._icall_Unit_Long
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Any
import kotlin.Long

open class VisualShaderNodeTransformVecMult internal constructor(
  _ignore: Any?
) : VisualShaderNode(_ignore) {
  open var operator: Long
    get() {
      val mb = getMethodBind("VisualShaderNodeTransformVecMult","get_operator")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VisualShaderNodeTransformVecMult","set_operator")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = invokeConstructor("VisualShaderNodeTransformVecMult",
            "VisualShaderNodeTransformVecMult")
        }

  }

  open fun getOperator(): VisualShaderNodeTransformVecMult.Operator {
    val mb = getMethodBind("VisualShaderNodeTransformVecMult","get_operator")
    return VisualShaderNodeTransformVecMult.Operator.from( _icall_Long( mb, this.ptr))
  }

  open fun setOperator(op: Long) {
    val mb = getMethodBind("VisualShaderNodeTransformVecMult","set_operator")
    _icall_Unit_Long( mb, this.ptr, op)
  }

  enum class Operator(
    id: Long
  ) {
    OP_AxB(0),

    OP_BxA(1),

    OP_3x3_AxB(2),

    OP_3x3_BxA(3);

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
