// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Variant
import godot.core.Variant.Type
import godot.icalls._icall_Long
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Variant
import godot.icalls._icall_Variant
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Long
import kotlinx.cinterop.COpaquePointer

open class VisualScriptConstant : VisualScriptNode() {
  open var type: Long
    get() {
      val mb = getMethodBind("VisualScriptConstant","get_constant_type")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VisualScriptConstant","set_constant_type")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var value: Variant
    get() {
      val mb = getMethodBind("VisualScriptConstant","get_constant_value")
      return _icall_Variant(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VisualScriptConstant","set_constant_value")
      _icall_Unit_Variant(mb, this.ptr, value)
    }

  override fun __new(): COpaquePointer = invokeConstructor("VisualScriptConstant",
      "VisualScriptConstant")

  open fun getConstantType(): Variant.Type {
    val mb = getMethodBind("VisualScriptConstant","get_constant_type")
    return Variant.Type.from( _icall_Long( mb, this.ptr))
  }

  open fun getConstantValue(): Variant {
    val mb = getMethodBind("VisualScriptConstant","get_constant_value")
    return _icall_Variant( mb, this.ptr)
  }

  open fun setConstantType(type: Long) {
    val mb = getMethodBind("VisualScriptConstant","set_constant_type")
    _icall_Unit_Long( mb, this.ptr, type)
  }

  open fun setConstantValue(value: Variant) {
    val mb = getMethodBind("VisualScriptConstant","set_constant_value")
    _icall_Unit_Variant( mb, this.ptr, value)
  }
}
