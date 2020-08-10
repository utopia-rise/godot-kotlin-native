package godot

import godot.core.Godot.shouldInitPtr
import godot.icalls._icall_String
import godot.icalls._icall_Unit_String
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.String

open class VisualShaderNodeExpression internal constructor(
  _ignore: Any?
) : VisualShaderNodeGroupBase(_ignore) {
  open var expression: String
    get() {
      val mb = getMethodBind("VisualShaderNodeExpression","get_expression")
      return _icall_String(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VisualShaderNodeExpression","set_expression")
      _icall_Unit_String(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("VisualShaderNodeExpression", "VisualShaderNodeExpression")
        }

  }

  open fun getExpression(): String {
    val mb = getMethodBind("VisualShaderNodeExpression","get_expression")
    return _icall_String( mb, this.ptr)
  }

  open fun setExpression(expression: String) {
    val mb = getMethodBind("VisualShaderNodeExpression","set_expression")
    _icall_Unit_String( mb, this.ptr, expression)
  }
}
