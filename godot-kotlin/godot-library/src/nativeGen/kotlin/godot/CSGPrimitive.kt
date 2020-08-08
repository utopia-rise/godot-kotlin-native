package godot

import godot.icalls._icall_Boolean
import godot.icalls._icall_Unit_Boolean
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean

open class CSGPrimitive internal constructor(
  _ignore: Any?
) : CSGShape(_ignore) {
  open var invertFaces: Boolean
    get() {
      val mb = getMethodBind("CSGPrimitive","is_inverting_faces")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CSGPrimitive","set_invert_faces")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  internal constructor() : this(null)

  open fun isInvertingFaces(): Boolean {
    val mb = getMethodBind("CSGPrimitive","is_inverting_faces")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun setInvertFaces(invertFaces: Boolean) {
    val mb = getMethodBind("CSGPrimitive","set_invert_faces")
    _icall_Unit_Boolean( mb, this.ptr, invertFaces)
  }

  companion object
}
