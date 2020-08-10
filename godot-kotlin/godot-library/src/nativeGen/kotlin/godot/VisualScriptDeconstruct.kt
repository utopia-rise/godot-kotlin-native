package godot

import godot.core.Godot.shouldInitPtr
import godot.core.Variant
import godot.core.Variant.Type
import godot.core.VariantArray
import godot.icalls._icall_Long
import godot.icalls._icall_Unit_Long
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Long
import kotlin.NotImplementedError

open class VisualScriptDeconstruct internal constructor(
  _ignore: Any?
) : VisualScriptNode(_ignore) {
  open var type: Long
    get() {
      val mb = getMethodBind("VisualScriptDeconstruct","get_deconstruct_type")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VisualScriptDeconstruct","set_deconstruct_type")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("VisualScriptDeconstruct", "VisualScriptDeconstruct")
        }

  }

  open fun _get_elem_cache(): VariantArray {
    throw NotImplementedError("_get_elem_cache is not implemented for VisualScriptDeconstruct")
  }

  open fun _set_elem_cache(_cache: VariantArray) {
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
