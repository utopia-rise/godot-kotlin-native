package godot

import godot.core.Godot.shouldInitPtr
import godot.icalls._icall_Boolean
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

open class InputEventMouseButton internal constructor(
  _ignore: Any?
) : InputEventMouse(_ignore) {
  open var buttonIndex: Long
    get() {
      val mb = getMethodBind("InputEventMouseButton","get_button_index")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("InputEventMouseButton","set_button_index")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var doubleclick: Boolean
    get() {
      val mb = getMethodBind("InputEventMouseButton","is_doubleclick")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("InputEventMouseButton","set_doubleclick")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var factor: Double
    get() {
      val mb = getMethodBind("InputEventMouseButton","get_factor")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("InputEventMouseButton","set_factor")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var pressed: Boolean
    get() {
      throw UninitializedPropertyAccessException("Cannot access property pressed: has no getter")
    }
    set(value) {
      val mb = getMethodBind("InputEventMouseButton","set_pressed")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("InputEventMouseButton", "InputEventMouseButton")
        }

  }

  open fun getButtonIndex(): Long {
    val mb = getMethodBind("InputEventMouseButton","get_button_index")
    return _icall_Long( mb, this.ptr)
  }

  open fun getFactor(): Double {
    val mb = getMethodBind("InputEventMouseButton","get_factor")
    return _icall_Double( mb, this.ptr)
  }

  open fun isDoubleclick(): Boolean {
    val mb = getMethodBind("InputEventMouseButton","is_doubleclick")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun setButtonIndex(buttonIndex: Long) {
    val mb = getMethodBind("InputEventMouseButton","set_button_index")
    _icall_Unit_Long( mb, this.ptr, buttonIndex)
  }

  open fun setDoubleclick(doubleclick: Boolean) {
    val mb = getMethodBind("InputEventMouseButton","set_doubleclick")
    _icall_Unit_Boolean( mb, this.ptr, doubleclick)
  }

  open fun setFactor(factor: Double) {
    val mb = getMethodBind("InputEventMouseButton","set_factor")
    _icall_Unit_Double( mb, this.ptr, factor)
  }

  open fun setPressed(pressed: Boolean) {
    val mb = getMethodBind("InputEventMouseButton","set_pressed")
    _icall_Unit_Boolean( mb, this.ptr, pressed)
  }

  companion object
}
