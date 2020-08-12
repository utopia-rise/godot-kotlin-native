// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.icalls._icall_Boolean
import godot.icalls._icall_Double
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Double
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Boolean
import kotlin.Double
import kotlinx.cinterop.COpaquePointer

open class RayShape : Shape() {
  open var length: Double
    get() {
      val mb = getMethodBind("RayShape","get_length")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("RayShape","set_length")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var slipsOnSlope: Boolean
    get() {
      val mb = getMethodBind("RayShape","get_slips_on_slope")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("RayShape","set_slips_on_slope")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  override fun __new(): COpaquePointer = invokeConstructor("RayShape", "RayShape")

  open fun getLength(): Double {
    val mb = getMethodBind("RayShape","get_length")
    return _icall_Double( mb, this.ptr)
  }

  open fun getSlipsOnSlope(): Boolean {
    val mb = getMethodBind("RayShape","get_slips_on_slope")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun setLength(length: Double) {
    val mb = getMethodBind("RayShape","set_length")
    _icall_Unit_Double( mb, this.ptr, length)
  }

  open fun setSlipsOnSlope(active: Boolean) {
    val mb = getMethodBind("RayShape","set_slips_on_slope")
    _icall_Unit_Boolean( mb, this.ptr, active)
  }
}
