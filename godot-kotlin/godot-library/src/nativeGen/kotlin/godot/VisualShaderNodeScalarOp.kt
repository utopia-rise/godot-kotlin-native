// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.VisualShaderNodeScalarOp
import godot.core.Godot.shouldInitPtr
import godot.icalls._icall_Long
import godot.icalls._icall_Unit_Long
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Long

open class VisualShaderNodeScalarOp internal constructor(
  _ignore: Any?
) : VisualShaderNode(_ignore) {
  open var operator: Long
    get() {
      val mb = getMethodBind("VisualShaderNodeScalarOp","get_operator")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VisualShaderNodeScalarOp","set_operator")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("VisualShaderNodeScalarOp", "VisualShaderNodeScalarOp")
        }

  }

  open fun getOperator(): VisualShaderNodeScalarOp.Operator {
    val mb = getMethodBind("VisualShaderNodeScalarOp","get_operator")
    return VisualShaderNodeScalarOp.Operator.from( _icall_Long( mb, this.ptr))
  }

  open fun setOperator(op: Long) {
    val mb = getMethodBind("VisualShaderNodeScalarOp","set_operator")
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

    OP_ATAN2(8),

    OP_STEP(9);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val OP_ADD: Long = 0

    final const val OP_ATAN2: Long = 8

    final const val OP_DIV: Long = 3

    final const val OP_MAX: Long = 6

    final const val OP_MIN: Long = 7

    final const val OP_MOD: Long = 4

    final const val OP_MUL: Long = 2

    final const val OP_POW: Long = 5

    final const val OP_STEP: Long = 9

    final const val OP_SUB: Long = 1
  }
}
