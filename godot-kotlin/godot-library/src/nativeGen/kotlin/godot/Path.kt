package godot

import godot.core.Godot.shouldInitPtr
import godot.core.Signal0
import godot.core.signal
import godot.icalls._icall_Curve3D
import godot.icalls._icall_Unit_Object
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any

open class Path internal constructor(
  _ignore: Any?
) : Spatial(_ignore) {
  val curveChanged: Signal0 by signal()

  open var curve: Curve3D
    get() {
      val mb = getMethodBind("Path","get_curve")
      return _icall_Curve3D(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Path","set_curve")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("Path", "Path")
        }

  }

  open fun _curve_changed() {
  }

  open fun getCurve(): Curve3D {
    val mb = getMethodBind("Path","get_curve")
    return _icall_Curve3D( mb, this.ptr)
  }

  open fun setCurve(curve: Curve3D) {
    val mb = getMethodBind("Path","set_curve")
    _icall_Unit_Object( mb, this.ptr, curve)
  }

  companion object
}
