package godot

import godot.core.Godot.shouldInitPtr
import godot.core.Signal0
import godot.core.signal
import godot.icalls._icall_String
import godot.icalls._icall_Unit_String
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.String

open class VisualShaderNodeInput internal constructor(
  _ignore: Any?
) : VisualShaderNode(_ignore) {
  val inputTypeChanged: Signal0 by signal()

  open var inputName: String
    get() {
      val mb = getMethodBind("VisualShaderNodeInput","get_input_name")
      return _icall_String(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VisualShaderNodeInput","set_input_name")
      _icall_Unit_String(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("VisualShaderNodeInput", "VisualShaderNodeInput")
        }

  }

  open fun getInputName(): String {
    val mb = getMethodBind("VisualShaderNodeInput","get_input_name")
    return _icall_String( mb, this.ptr)
  }

  open fun getInputRealName(): String {
    val mb = getMethodBind("VisualShaderNodeInput","get_input_real_name")
    return _icall_String( mb, this.ptr)
  }

  open fun setInputName(name: String) {
    val mb = getMethodBind("VisualShaderNodeInput","set_input_name")
    _icall_Unit_String( mb, this.ptr, name)
  }

  companion object
}
