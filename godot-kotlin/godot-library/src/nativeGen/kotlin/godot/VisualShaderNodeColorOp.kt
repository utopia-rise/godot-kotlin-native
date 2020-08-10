// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.VisualShaderNodeColorOp
import godot.core.Godot.shouldInitPtr
import godot.icalls._icall_Long
import godot.icalls._icall_Unit_Long
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Long

open class VisualShaderNodeColorOp internal constructor(
  _ignore: Any?
) : VisualShaderNode(_ignore) {
  open var operator: Long
    get() {
      val mb = getMethodBind("VisualShaderNodeColorOp","get_operator")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VisualShaderNodeColorOp","set_operator")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("VisualShaderNodeColorOp", "VisualShaderNodeColorOp")
        }

  }

  open fun getOperator(): VisualShaderNodeColorOp.Operator {
    val mb = getMethodBind("VisualShaderNodeColorOp","get_operator")
    return VisualShaderNodeColorOp.Operator.from( _icall_Long( mb, this.ptr))
  }

  open fun setOperator(op: Long) {
    val mb = getMethodBind("VisualShaderNodeColorOp","set_operator")
    _icall_Unit_Long( mb, this.ptr, op)
  }

  enum class Operator(
    id: Long
  ) {
    OP_SCREEN(0),

    OP_DIFFERENCE(1),

    OP_DARKEN(2),

    OP_LIGHTEN(3),

    OP_OVERLAY(4),

    OP_DODGE(5),

    OP_BURN(6),

    OP_SOFT_LIGHT(7),

    OP_HARD_LIGHT(8);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val OP_BURN: Long = 6

    final const val OP_DARKEN: Long = 2

    final const val OP_DIFFERENCE: Long = 1

    final const val OP_DODGE: Long = 5

    final const val OP_HARD_LIGHT: Long = 8

    final const val OP_LIGHTEN: Long = 3

    final const val OP_OVERLAY: Long = 4

    final const val OP_SCREEN: Long = 0

    final const val OP_SOFT_LIGHT: Long = 7
  }
}
