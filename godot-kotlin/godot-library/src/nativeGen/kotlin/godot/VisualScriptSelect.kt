package godot

import godot.core.Godot.shouldInitPtr
import godot.core.Variant
import godot.core.Variant.Type
import godot.icalls._icall_Long
import godot.icalls._icall_Unit_Long
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Long

open class VisualScriptSelect internal constructor(
  _ignore: Any?
) : VisualScriptNode(_ignore) {
  open var type: Long
    get() {
      val mb = getMethodBind("VisualScriptSelect","get_typed")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VisualScriptSelect","set_typed")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("VisualScriptSelect", "VisualScriptSelect")
        }

  }

  open fun getTyped(): Variant.Type {
    val mb = getMethodBind("VisualScriptSelect","get_typed")
    return Variant.Type.from( _icall_Long( mb, this.ptr))
  }

  open fun setTyped(type: Long) {
    val mb = getMethodBind("VisualScriptSelect","set_typed")
    _icall_Unit_Long( mb, this.ptr, type)
  }
}
