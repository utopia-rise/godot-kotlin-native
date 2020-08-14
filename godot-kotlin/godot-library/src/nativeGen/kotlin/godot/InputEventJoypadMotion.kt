// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.icalls._icall_Double
import godot.icalls._icall_Long
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_Long
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Double
import kotlin.Long
import kotlinx.cinterop.COpaquePointer

open class InputEventJoypadMotion : InputEvent() {
  open var axis: Long
    get() {
      val mb = getMethodBind("InputEventJoypadMotion","get_axis")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("InputEventJoypadMotion","set_axis")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var axisValue: Double
    get() {
      val mb = getMethodBind("InputEventJoypadMotion","get_axis_value")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("InputEventJoypadMotion","set_axis_value")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  override fun __new(): COpaquePointer = invokeConstructor("InputEventJoypadMotion",
      "InputEventJoypadMotion")

  open fun getAxis(): Long {
    val mb = getMethodBind("InputEventJoypadMotion","get_axis")
    return _icall_Long( mb, this.ptr)
  }

  open fun getAxisValue(): Double {
    val mb = getMethodBind("InputEventJoypadMotion","get_axis_value")
    return _icall_Double( mb, this.ptr)
  }

  open fun setAxis(axis: Long) {
    val mb = getMethodBind("InputEventJoypadMotion","set_axis")
    _icall_Unit_Long( mb, this.ptr, axis)
  }

  open fun setAxisValue(axisValue: Double) {
    val mb = getMethodBind("InputEventJoypadMotion","set_axis_value")
    _icall_Unit_Double( mb, this.ptr, axisValue)
  }
}
