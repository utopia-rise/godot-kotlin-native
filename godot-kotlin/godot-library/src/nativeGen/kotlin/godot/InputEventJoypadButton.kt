// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot.shouldInitPtr
import godot.icalls._icall_Double
import godot.icalls._icall_Long
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_Long
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.UninitializedPropertyAccessException

open class InputEventJoypadButton internal constructor(
  _ignore: Any?
) : InputEvent(_ignore) {
  open var buttonIndex: Long
    get() {
      val mb = getMethodBind("InputEventJoypadButton","get_button_index")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("InputEventJoypadButton","set_button_index")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var pressed: Boolean
    get() {
      throw UninitializedPropertyAccessException("Cannot access property pressed: has no getter")
    }
    set(value) {
      val mb = getMethodBind("InputEventJoypadButton","set_pressed")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var pressure: Double
    get() {
      val mb = getMethodBind("InputEventJoypadButton","get_pressure")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("InputEventJoypadButton","set_pressure")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("InputEventJoypadButton", "InputEventJoypadButton")
        }

  }

  open fun getButtonIndex(): Long {
    val mb = getMethodBind("InputEventJoypadButton","get_button_index")
    return _icall_Long( mb, this.ptr)
  }

  open fun getPressure(): Double {
    val mb = getMethodBind("InputEventJoypadButton","get_pressure")
    return _icall_Double( mb, this.ptr)
  }

  open fun setButtonIndex(buttonIndex: Long) {
    val mb = getMethodBind("InputEventJoypadButton","set_button_index")
    _icall_Unit_Long( mb, this.ptr, buttonIndex)
  }

  open fun setPressed(pressed: Boolean) {
    val mb = getMethodBind("InputEventJoypadButton","set_pressed")
    _icall_Unit_Boolean( mb, this.ptr, pressed)
  }

  open fun setPressure(pressure: Double) {
    val mb = getMethodBind("InputEventJoypadButton","set_pressure")
    _icall_Unit_Double( mb, this.ptr, pressure)
  }
}