// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot.shouldInitPtr
import godot.icalls._icall_String
import godot.icalls._icall_Unit_String
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Any
import kotlin.String

open class VisualScriptVariableGet internal constructor(
  _ignore: Any?
) : VisualScriptNode(_ignore) {
  open var varName: String
    get() {
      val mb = getMethodBind("VisualScriptVariableGet","get_variable")
      return _icall_String(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VisualScriptVariableGet","set_variable")
      _icall_Unit_String(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = invokeConstructor("VisualScriptVariableGet", "VisualScriptVariableGet")
        }

  }

  open fun getVariable(): String {
    val mb = getMethodBind("VisualScriptVariableGet","get_variable")
    return _icall_String( mb, this.ptr)
  }

  open fun setVariable(name: String) {
    val mb = getMethodBind("VisualScriptVariableGet","set_variable")
    _icall_Unit_String( mb, this.ptr, name)
  }
}
