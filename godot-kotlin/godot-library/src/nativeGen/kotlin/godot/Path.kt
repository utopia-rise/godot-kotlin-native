// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Signal0
import godot.core.signal
import godot.icalls._icall_Curve3D
import godot.icalls._icall_Unit_Object
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlinx.cinterop.COpaquePointer

open class Path : Spatial() {
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

  override fun __new(): COpaquePointer = invokeConstructor("Path", "Path")

  open fun _curveChanged() {
  }

  open fun getCurve(): Curve3D {
    val mb = getMethodBind("Path","get_curve")
    return _icall_Curve3D( mb, this.ptr)
  }

  open fun setCurve(curve: Curve3D) {
    val mb = getMethodBind("Path","set_curve")
    _icall_Unit_Object( mb, this.ptr, curve)
  }
}
