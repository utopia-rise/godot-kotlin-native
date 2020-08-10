// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot.shouldInitPtr
import godot.icalls._icall_Long
import godot.icalls._icall_Unit_Long
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Long

open class VisualScriptSequence internal constructor(
  _ignore: Any?
) : VisualScriptNode(_ignore) {
  open var steps: Long
    get() {
      val mb = getMethodBind("VisualScriptSequence","get_steps")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VisualScriptSequence","set_steps")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("VisualScriptSequence", "VisualScriptSequence")
        }

  }

  open fun getSteps(): Long {
    val mb = getMethodBind("VisualScriptSequence","get_steps")
    return _icall_Long( mb, this.ptr)
  }

  open fun setSteps(steps: Long) {
    val mb = getMethodBind("VisualScriptSequence","set_steps")
    _icall_Unit_Long( mb, this.ptr, steps)
  }
}
