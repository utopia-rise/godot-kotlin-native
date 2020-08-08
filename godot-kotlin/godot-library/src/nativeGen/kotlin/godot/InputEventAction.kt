package godot

import godot.core.Godot.shouldInitPtr
import godot.icalls._icall_Double
import godot.icalls._icall_String
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_String
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.String
import kotlin.UninitializedPropertyAccessException

open class InputEventAction internal constructor(
  _ignore: Any?
) : InputEvent(_ignore) {
  open var action: String
    get() {
      val mb = getMethodBind("InputEventAction","get_action")
      return _icall_String(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("InputEventAction","set_action")
      _icall_Unit_String(mb, this.ptr, value)
    }

  open var pressed: Boolean
    get() {
      throw UninitializedPropertyAccessException("Cannot access property pressed: has no getter")
    }
    set(value) {
      val mb = getMethodBind("InputEventAction","set_pressed")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var strength: Double
    get() {
      val mb = getMethodBind("InputEventAction","get_strength")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("InputEventAction","set_strength")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("InputEventAction", "InputEventAction")
        }

  }

  open fun getAction(): String {
    val mb = getMethodBind("InputEventAction","get_action")
    return _icall_String( mb, this.ptr)
  }

  open fun getStrength(): Double {
    val mb = getMethodBind("InputEventAction","get_strength")
    return _icall_Double( mb, this.ptr)
  }

  open fun setAction(action: String) {
    val mb = getMethodBind("InputEventAction","set_action")
    _icall_Unit_String( mb, this.ptr, action)
  }

  open fun setPressed(pressed: Boolean) {
    val mb = getMethodBind("InputEventAction","set_pressed")
    _icall_Unit_Boolean( mb, this.ptr, pressed)
  }

  open fun setStrength(strength: Double) {
    val mb = getMethodBind("InputEventAction","set_strength")
    _icall_Unit_Double( mb, this.ptr, strength)
  }

  companion object
}
