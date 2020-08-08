package godot

import godot.core.Godot.shouldInitPtr
import godot.core.Variant
import godot.core.Variant.Operator
import godot.core.Variant.Type
import godot.icalls._icall_Long
import godot.icalls._icall_Unit_Long
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Long

open class VisualScriptOperator internal constructor(
  _ignore: Any?
) : VisualScriptNode(_ignore) {
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

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("VisualScriptOperator", "VisualScriptOperator")
        }

  }

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

  companion object
}
