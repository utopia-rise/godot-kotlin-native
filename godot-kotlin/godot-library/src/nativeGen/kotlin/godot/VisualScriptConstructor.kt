// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Dictionary
import godot.core.Variant
import godot.core.Variant.Type
import godot.icalls._icall_Dictionary
import godot.icalls._icall_Long
import godot.icalls._icall_Unit_Dictionary
import godot.icalls._icall_Unit_Long
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Long
import kotlinx.cinterop.COpaquePointer

open class VisualScriptConstructor : VisualScriptNode() {
  open var constructor: Dictionary
    get() {
      val mb = getMethodBind("VisualScriptConstructor","get_constructor")
      return _icall_Dictionary(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VisualScriptConstructor","set_constructor")
      _icall_Unit_Dictionary(mb, this.ptr, value)
    }

  open var type: Long
    get() {
      val mb = getMethodBind("VisualScriptConstructor","get_constructor_type")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VisualScriptConstructor","set_constructor_type")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  override fun __new(): COpaquePointer = invokeConstructor("VisualScriptConstructor",
      "VisualScriptConstructor")

  open fun getConstructor(): Dictionary {
    val mb = getMethodBind("VisualScriptConstructor","get_constructor")
    return _icall_Dictionary( mb, this.ptr)
  }

  open fun getConstructorType(): Variant.Type {
    val mb = getMethodBind("VisualScriptConstructor","get_constructor_type")
    return Variant.Type.from( _icall_Long( mb, this.ptr))
  }

  open fun setConstructor(constructor: Dictionary) {
    val mb = getMethodBind("VisualScriptConstructor","set_constructor")
    _icall_Unit_Dictionary( mb, this.ptr, constructor)
  }

  open fun setConstructorType(type: Long) {
    val mb = getMethodBind("VisualScriptConstructor","set_constructor_type")
    _icall_Unit_Long( mb, this.ptr, type)
  }
}
