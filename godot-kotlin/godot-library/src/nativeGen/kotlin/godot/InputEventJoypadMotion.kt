// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot.shouldInitPtr
import godot.icalls._icall_Double
import godot.icalls._icall_Long
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_Long
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Double
import kotlin.Long

open class InputEventJoypadMotion internal constructor(
  _ignore: Any?
) : InputEvent(_ignore) {
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

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("InputEventJoypadMotion", "InputEventJoypadMotion")
        }

  }

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
