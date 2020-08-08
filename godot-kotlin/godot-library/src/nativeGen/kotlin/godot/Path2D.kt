package godot

import godot.core.Godot.shouldInitPtr
import godot.icalls._icall_Curve2D
import godot.icalls._icall_Unit_Object
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any

open class Path2D internal constructor(
  _ignore: Any?
) : Node2D(_ignore) {
  open var curve: Curve2D
    get() {
      val mb = getMethodBind("Path2D","get_curve")
      return _icall_Curve2D(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Path2D","set_curve")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("Path2D", "Path2D")
        }

  }

  open fun _curve_changed() {
  }

  open fun getCurve(): Curve2D {
    val mb = getMethodBind("Path2D","get_curve")
    return _icall_Curve2D( mb, this.ptr)
  }

  open fun setCurve(curve: Curve2D) {
    val mb = getMethodBind("Path2D","set_curve")
    _icall_Unit_Object( mb, this.ptr, curve)
  }

  companion object
}
