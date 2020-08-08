package godot

import godot.core.Dictionary
import godot.core.Godot.shouldInitPtr
import godot.core.Variant
import godot.core.Variant.Type
import godot.icalls._icall_Dictionary
import godot.icalls._icall_Long
import godot.icalls._icall_Unit_Dictionary
import godot.icalls._icall_Unit_Long
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Long

open class VisualScriptConstructor internal constructor(
  _ignore: Any?
) : VisualScriptNode(_ignore) {
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

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("VisualScriptConstructor", "VisualScriptConstructor")
        }

  }

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

  companion object
}
