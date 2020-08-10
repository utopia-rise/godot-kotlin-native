// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot.shouldInitPtr
import godot.icalls._icall_Long
import godot.icalls._icall_Unit_Long
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Long

open class VisualScriptGlobalConstant internal constructor(
  _ignore: Any?
) : VisualScriptNode(_ignore) {
  open var constant: Long
    get() {
      val mb = getMethodBind("VisualScriptGlobalConstant","get_global_constant")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VisualScriptGlobalConstant","set_global_constant")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("VisualScriptGlobalConstant", "VisualScriptGlobalConstant")
        }

  }

  open fun getGlobalConstant(): Long {
    val mb = getMethodBind("VisualScriptGlobalConstant","get_global_constant")
    return _icall_Long( mb, this.ptr)
  }

  open fun setGlobalConstant(index: Long) {
    val mb = getMethodBind("VisualScriptGlobalConstant","set_global_constant")
    _icall_Unit_Long( mb, this.ptr, index)
  }
}
