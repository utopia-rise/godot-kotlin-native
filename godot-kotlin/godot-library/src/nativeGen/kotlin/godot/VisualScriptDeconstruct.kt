// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Variant
import godot.core.Variant.Type
import godot.core.VariantArray
import godot.icalls._icall_Long
import godot.icalls._icall_Unit_Long
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Long
import kotlin.NotImplementedError
import kotlinx.cinterop.COpaquePointer

open class VisualScriptDeconstruct : VisualScriptNode() {
  open var type: Long
    get() {
      val mb = getMethodBind("VisualScriptDeconstruct","get_deconstruct_type")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VisualScriptDeconstruct","set_deconstruct_type")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  override fun __new(): COpaquePointer = invokeConstructor("VisualScriptDeconstruct",
      "VisualScriptDeconstruct")

  open fun _getElemCache(): VariantArray {
    throw NotImplementedError("_get_elem_cache is not implemented for VisualScriptDeconstruct")
  }

  open fun _setElemCache(_cache: VariantArray) {
  }

  open fun getDeconstructType(): Variant.Type {
    val mb = getMethodBind("VisualScriptDeconstruct","get_deconstruct_type")
    return Variant.Type.from( _icall_Long( mb, this.ptr))
  }

  open fun setDeconstructType(type: Long) {
    val mb = getMethodBind("VisualScriptDeconstruct","set_deconstruct_type")
    _icall_Unit_Long( mb, this.ptr, type)
  }
}
