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

open class VisualScriptBasicTypeConstant internal constructor(
  _ignore: Any?
) : VisualScriptNode(_ignore) {
  open var basicType: Long
    get() {
      val mb = getMethodBind("VisualScriptBasicTypeConstant","get_basic_type")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VisualScriptBasicTypeConstant","set_basic_type")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var constant: String
    get() {
      val mb = getMethodBind("VisualScriptBasicTypeConstant","get_basic_type_constant")
      return _icall_String(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VisualScriptBasicTypeConstant","set_basic_type_constant")
      _icall_Unit_String(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("VisualScriptBasicTypeConstant",
            "VisualScriptBasicTypeConstant")
        }

  }

  open fun getBasicType(): Variant.Type {
    val mb = getMethodBind("VisualScriptBasicTypeConstant","get_basic_type")
    return Variant.Type.from( _icall_Long( mb, this.ptr))
  }

  open fun getBasicTypeConstant(): String {
    val mb = getMethodBind("VisualScriptBasicTypeConstant","get_basic_type_constant")
    return _icall_String( mb, this.ptr)
  }

  open fun setBasicType(name: Long) {
    val mb = getMethodBind("VisualScriptBasicTypeConstant","set_basic_type")
    _icall_Unit_Long( mb, this.ptr, name)
  }

  open fun setBasicTypeConstant(name: String) {
    val mb = getMethodBind("VisualScriptBasicTypeConstant","set_basic_type_constant")
    _icall_Unit_String( mb, this.ptr, name)
  }
}
