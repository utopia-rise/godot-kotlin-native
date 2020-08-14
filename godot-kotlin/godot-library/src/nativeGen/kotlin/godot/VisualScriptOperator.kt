// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Variant
import godot.core.Variant.Operator
import godot.core.Variant.Type
import godot.icalls._icall_Long
import godot.icalls._icall_Unit_Long
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Long
import kotlinx.cinterop.COpaquePointer

open class VisualScriptOperator : VisualScriptNode() {
  open var operator: Long
    get() {
      val mb = getMethodBind("VisualScriptOperator","get_operator")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VisualScriptOperator","set_operator")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var type: Long
    get() {
      val mb = getMethodBind("VisualScriptOperator","get_typed")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VisualScriptOperator","set_typed")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  override fun __new(): COpaquePointer = invokeConstructor("VisualScriptOperator",
      "VisualScriptOperator")

  open fun getOperator(): Variant.Operator {
    val mb = getMethodBind("VisualScriptOperator","get_operator")
    return Variant.Operator.from( _icall_Long( mb, this.ptr))
  }

  open fun getTyped(): Variant.Type {
    val mb = getMethodBind("VisualScriptOperator","get_typed")
    return Variant.Type.from( _icall_Long( mb, this.ptr))
  }

  open fun setOperator(op: Long) {
    val mb = getMethodBind("VisualScriptOperator","set_operator")
    _icall_Unit_Long( mb, this.ptr, op)
  }

  open fun setTyped(type: Long) {
    val mb = getMethodBind("VisualScriptOperator","set_typed")
    _icall_Unit_Long( mb, this.ptr, type)
  }
}
