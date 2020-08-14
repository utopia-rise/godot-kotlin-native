// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Variant
import godot.core.Variant.Type
import godot.icalls._icall_Long
import godot.icalls._icall_Unit_Long
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Long
import kotlinx.cinterop.COpaquePointer

open class VisualScriptSelect : VisualScriptNode() {
  open var type: Long
    get() {
      val mb = getMethodBind("VisualScriptSelect","get_typed")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VisualScriptSelect","set_typed")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  override fun __new(): COpaquePointer = invokeConstructor("VisualScriptSelect",
      "VisualScriptSelect")

  open fun getTyped(): Variant.Type {
    val mb = getMethodBind("VisualScriptSelect","get_typed")
    return Variant.Type.from( _icall_Long( mb, this.ptr))
  }

  open fun setTyped(type: Long) {
    val mb = getMethodBind("VisualScriptSelect","set_typed")
    _icall_Unit_Long( mb, this.ptr, type)
  }
}
