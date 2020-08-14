// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.icalls._icall_Double
import godot.icalls._icall_Unit_Double
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Double
import kotlinx.cinterop.COpaquePointer

open class PinJoint2D : Joint2D() {
  open var softness: Double
    get() {
      val mb = getMethodBind("PinJoint2D","get_softness")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("PinJoint2D","set_softness")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  override fun __new(): COpaquePointer = invokeConstructor("PinJoint2D", "PinJoint2D")

  open fun getSoftness(): Double {
    val mb = getMethodBind("PinJoint2D","get_softness")
    return _icall_Double( mb, this.ptr)
  }

  open fun setSoftness(softness: Double) {
    val mb = getMethodBind("PinJoint2D","set_softness")
    _icall_Unit_Double( mb, this.ptr, softness)
  }
}
