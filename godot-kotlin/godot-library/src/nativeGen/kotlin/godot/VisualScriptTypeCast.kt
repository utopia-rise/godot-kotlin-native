// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot.shouldInitPtr
import godot.icalls._icall_String
import godot.icalls._icall_Unit_String
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Any
import kotlin.String

open class VisualScriptTypeCast internal constructor(
  _ignore: Any?
) : VisualScriptNode(_ignore) {
  open var baseScript: String
    get() {
      val mb = getMethodBind("VisualScriptTypeCast","get_base_script")
      return _icall_String(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VisualScriptTypeCast","set_base_script")
      _icall_Unit_String(mb, this.ptr, value)
    }

  open var baseType: String
    get() {
      val mb = getMethodBind("VisualScriptTypeCast","get_base_type")
      return _icall_String(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VisualScriptTypeCast","set_base_type")
      _icall_Unit_String(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = invokeConstructor("VisualScriptTypeCast", "VisualScriptTypeCast")
        }

  }

  open fun getBaseScript(): String {
    val mb = getMethodBind("VisualScriptTypeCast","get_base_script")
    return _icall_String( mb, this.ptr)
  }

  open fun getBaseType(): String {
    val mb = getMethodBind("VisualScriptTypeCast","get_base_type")
    return _icall_String( mb, this.ptr)
  }

  open fun setBaseScript(path: String) {
    val mb = getMethodBind("VisualScriptTypeCast","set_base_script")
    _icall_Unit_String( mb, this.ptr, path)
  }

  open fun setBaseType(type: String) {
    val mb = getMethodBind("VisualScriptTypeCast","set_base_type")
    _icall_Unit_String( mb, this.ptr, type)
  }
}
