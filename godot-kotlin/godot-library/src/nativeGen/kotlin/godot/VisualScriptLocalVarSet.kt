// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Variant
import godot.core.Variant.Type
import godot.icalls._icall_Long
import godot.icalls._icall_String
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_String
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Long
import kotlin.String
import kotlinx.cinterop.COpaquePointer

open class VisualScriptLocalVarSet : VisualScriptNode() {
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

  override fun __new(): COpaquePointer = invokeConstructor("VisualScriptLocalVarSet",
      "VisualScriptLocalVarSet")

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
