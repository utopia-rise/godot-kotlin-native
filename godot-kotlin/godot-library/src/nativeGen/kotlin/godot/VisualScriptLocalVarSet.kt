package godot

import godot.core.Godot.shouldInitPtr
import godot.core.Variant
import godot.core.Variant.Type
import godot.icalls._icall_Long
import godot.icalls._icall_String
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_String
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Long
import kotlin.String

open class VisualScriptLocalVarSet internal constructor(
  _ignore: Any?
) : VisualScriptNode(_ignore) {
  open var type: Long
    get() {
      val mb = getMethodBind("VisualScriptLocalVarSet","get_var_type")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VisualScriptLocalVarSet","set_var_type")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var varName: String
    get() {
      val mb = getMethodBind("VisualScriptLocalVarSet","get_var_name")
      return _icall_String(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VisualScriptLocalVarSet","set_var_name")
      _icall_Unit_String(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("VisualScriptLocalVarSet", "VisualScriptLocalVarSet")
        }

  }

  open fun getVarName(): String {
    val mb = getMethodBind("VisualScriptLocalVarSet","get_var_name")
    return _icall_String( mb, this.ptr)
  }

  open fun getVarType(): Variant.Type {
    val mb = getMethodBind("VisualScriptLocalVarSet","get_var_type")
    return Variant.Type.from( _icall_Long( mb, this.ptr))
  }

  open fun setVarName(name: String) {
    val mb = getMethodBind("VisualScriptLocalVarSet","set_var_name")
    _icall_Unit_String( mb, this.ptr, name)
  }

  open fun setVarType(type: Long) {
    val mb = getMethodBind("VisualScriptLocalVarSet","set_var_type")
    _icall_Unit_Long( mb, this.ptr, type)
  }
}
