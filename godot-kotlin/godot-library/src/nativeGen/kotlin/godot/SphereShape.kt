// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.icalls._icall_Double
import godot.icalls._icall_Unit_Double
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Double
import kotlinx.cinterop.COpaquePointer

open class SphereShape : Shape() {
  open var radius: Double
    get() {
      val mb = getMethodBind("SphereShape","get_radius")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SphereShape","set_radius")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  override fun __new(): COpaquePointer = invokeConstructor("SphereShape", "SphereShape")

  open fun getRadius(): Double {
    val mb = getMethodBind("SphereShape","get_radius")
    return _icall_Double( mb, this.ptr)
  }

  open fun setRadius(radius: Double) {
    val mb = getMethodBind("SphereShape","set_radius")
    _icall_Unit_Double( mb, this.ptr, radius)
  }
}
