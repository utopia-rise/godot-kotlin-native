// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.VisualShaderNodeColorOp
import godot.icalls._icall_Long
import godot.icalls._icall_Unit_Long
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Long
import kotlinx.cinterop.COpaquePointer

open class VisualShaderNodeColorOp : VisualShaderNode() {
  open var operator: Long
    get() {
      val mb = getMethodBind("VisualShaderNodeColorOp","get_operator")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VisualShaderNodeColorOp","set_operator")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  override fun __new(): COpaquePointer = invokeConstructor("VisualShaderNodeColorOp",
      "VisualShaderNodeColorOp")

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

  companion object
}
