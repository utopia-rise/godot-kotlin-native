// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.icalls._icall_Double
import godot.icalls._icall_Unit_Double
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Double
import kotlinx.cinterop.COpaquePointer

open class CapsuleShape : Shape() {
  open var height: Double
    get() {
      val mb = getMethodBind("CapsuleShape","get_height")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CapsuleShape","set_height")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var radius: Double
    get() {
      val mb = getMethodBind("CapsuleShape","get_radius")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CapsuleShape","set_radius")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  override fun __new(): COpaquePointer = invokeConstructor("CapsuleShape", "CapsuleShape")

  open fun getHeight(): Double {
    val mb = getMethodBind("CapsuleShape","get_height")
    return _icall_Double( mb, this.ptr)
  }

  open fun getRadius(): Double {
    val mb = getMethodBind("CapsuleShape","get_radius")
    return _icall_Double( mb, this.ptr)
  }

  open fun setHeight(height: Double) {
    val mb = getMethodBind("CapsuleShape","set_height")
    _icall_Unit_Double( mb, this.ptr, height)
  }

  open fun setRadius(radius: Double) {
    val mb = getMethodBind("CapsuleShape","set_radius")
    _icall_Unit_Double( mb, this.ptr, radius)
  }
}
