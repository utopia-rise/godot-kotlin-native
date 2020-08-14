// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Signal0
import godot.core.Variant
import godot.core.VariantArray
import godot.core.signal
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_Long_Variant
import godot.icalls._icall_Variant_Long
import godot.icalls._icall_VisualScript
import godot.internal.utils.getMethodBind
import kotlin.Long
import kotlin.NotImplementedError

open class VisualScriptNode internal constructor() : Resource() {
  val portsChanged: Signal0 by signal()

  open fun _getDefaultInputValues(): VariantArray {
    throw NotImplementedError("_get_default_input_values is not implemented for VisualScriptNode")
  }

  open fun _setDefaultInputValues(values: VariantArray) {
  }

  open fun getDefaultInputValue(portIdx: Long): Variant {
    val mb = getMethodBind("VisualScriptNode","get_default_input_value")
    return _icall_Variant_Long( mb, this.ptr, portIdx)
  }

  open fun getVisualScript(): VisualScript {
    val mb = getMethodBind("VisualScriptNode","get_visual_script")
    return _icall_VisualScript( mb, this.ptr)
  }

  open fun portsChangedNotify() {
    val mb = getMethodBind("VisualScriptNode","ports_changed_notify")
    _icall_Unit( mb, this.ptr)
  }

  open fun setDefaultInputValue(portIdx: Long, value: Variant) {
    val mb = getMethodBind("VisualScriptNode","set_default_input_value")
    _icall_Unit_Long_Variant( mb, this.ptr, portIdx, value)
  }
}
