// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.VisualShaderNodeVectorOp
import godot.core.Godot.shouldInitPtr
import godot.icalls._icall_Long
import godot.icalls._icall_Unit_Long
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Long

open class VisualShaderNodeVectorOp internal constructor(
  _ignore: Any?
) : VisualShaderNode(_ignore) {
  open var operator: Long
    get() {
      val mb = getMethodBind("VisualShaderNodeVectorOp","get_operator")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VisualShaderNodeVectorOp","set_operator")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("VisualShaderNodeVectorOp", "VisualShaderNodeVectorOp")
        }

  }

  open fun getOperator(): VisualShaderNodeVectorOp.Operator {
    val mb = getMethodBind("VisualShaderNodeVectorOp","get_operator")
    return VisualShaderNodeVectorOp.Operator.from( _icall_Long( mb, this.ptr))
  }

  open fun setOperator(op: Long) {
    val mb = getMethodBind("VisualShaderNodeVectorOp","set_operator")
    _icall_Unit_Long( mb, this.ptr, op)
  }

  enum class Operator(
    id: Long
  ) {
    OP_ADD(0),

    OP_SUB(1),

    OP_MUL(2),

    OP_DIV(3),

    OP_MOD(4),

    OP_POW(5),

    OP_MAX(6),

    OP_MIN(7),

    OP_CROSS(8),

    OP_ATAN2(9),

    OP_REFLECT(10),

    OP_STEP(11);

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
