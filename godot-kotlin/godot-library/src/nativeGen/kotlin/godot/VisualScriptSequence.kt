// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.icalls._icall_Long
import godot.icalls._icall_Unit_Long
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Long
import kotlinx.cinterop.COpaquePointer

open class VisualScriptSequence : VisualScriptNode() {
  open var steps: Long
    get() {
      val mb = getMethodBind("VisualScriptSequence","get_steps")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VisualScriptSequence","set_steps")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  override fun __new(): COpaquePointer = invokeConstructor("VisualScriptSequence",
      "VisualScriptSequence")

  open fun getSteps(): Long {
    val mb = getMethodBind("VisualScriptSequence","get_steps")
    return _icall_Long( mb, this.ptr)
  }

  open fun setSteps(steps: Long) {
    val mb = getMethodBind("VisualScriptSequence","set_steps")
    _icall_Unit_Long( mb, this.ptr, steps)
  }
}
