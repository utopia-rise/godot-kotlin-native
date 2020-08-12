// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot.shouldInitPtr
import godot.icalls._icall_String
import godot.icalls._icall_Unit_String
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Any
import kotlin.String

open class VisualScriptClassConstant internal constructor(
  _ignore: Any?
) : VisualScriptNode(_ignore) {
  open var baseType: String
    get() {
      val mb = getMethodBind("VisualScriptClassConstant","get_base_type")
      return _icall_String(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VisualScriptClassConstant","set_base_type")
      _icall_Unit_String(mb, this.ptr, value)
    }

  open var constant: String
    get() {
      val mb = getMethodBind("VisualScriptClassConstant","get_class_constant")
      return _icall_String(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VisualScriptClassConstant","set_class_constant")
      _icall_Unit_String(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = invokeConstructor("VisualScriptClassConstant", "VisualScriptClassConstant")
        }

  }

  open fun getBaseType(): String {
    val mb = getMethodBind("VisualScriptClassConstant","get_base_type")
    return _icall_String( mb, this.ptr)
  }

  open fun getClassConstant(): String {
    val mb = getMethodBind("VisualScriptClassConstant","get_class_constant")
    return _icall_String( mb, this.ptr)
  }

  open fun setBaseType(name: String) {
    val mb = getMethodBind("VisualScriptClassConstant","set_base_type")
    _icall_Unit_String( mb, this.ptr, name)
  }

  open fun setClassConstant(name: String) {
    val mb = getMethodBind("VisualScriptClassConstant","set_class_constant")
    _icall_Unit_String( mb, this.ptr, name)
  }
}
