// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Transform2D
import godot.core.Vector2
import godot.icalls._icall_Boolean
import godot.icalls._icall_Boolean_Object
import godot.icalls._icall_Boolean_String
import godot.icalls._icall_Boolean_String_Boolean
import godot.icalls._icall_Double_String
import godot.icalls._icall_InputEvent_Transform2D_Vector2
import godot.icalls._icall_Long
import godot.icalls._icall_String
import godot.icalls._icall_Unit_Long
import godot.internal.utils.getMethodBind
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.String

open class InputEvent internal constructor() : Resource() {
  open var device: Long
    get() {
      val mb = getMethodBind("InputEvent","get_device")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("InputEvent","set_device")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open fun accumulate(withEvent: InputEvent): Boolean {
    val mb = getMethodBind("InputEvent","accumulate")
    return _icall_Boolean_Object( mb, this.ptr, withEvent)
  }

  open fun asText(): String {
    val mb = getMethodBind("InputEvent","as_text")
    return _icall_String( mb, this.ptr)
  }

  open fun getActionStrength(action: String): Double {
    val mb = getMethodBind("InputEvent","get_action_strength")
    return _icall_Double_String( mb, this.ptr, action)
  }

  open fun getDevice(): Long {
    val mb = getMethodBind("InputEvent","get_device")
    return _icall_Long( mb, this.ptr)
  }

  open fun isAction(action: String): Boolean {
    val mb = getMethodBind("InputEvent","is_action")
    return _icall_Boolean_String( mb, this.ptr, action)
  }

  open fun isActionPressed(action: String, allowEcho: Boolean = false): Boolean {
    val mb = getMethodBind("InputEvent","is_action_pressed")
    return _icall_Boolean_String_Boolean( mb, this.ptr, action, allowEcho)
  }

  open fun isActionReleased(action: String): Boolean {
    val mb = getMethodBind("InputEvent","is_action_released")
    return _icall_Boolean_String( mb, this.ptr, action)
  }

  open fun isActionType(): Boolean {
    val mb = getMethodBind("InputEvent","is_action_type")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isEcho(): Boolean {
    val mb = getMethodBind("InputEvent","is_echo")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isPressed(): Boolean {
    val mb = getMethodBind("InputEvent","is_pressed")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun setDevice(device: Long) {
    val mb = getMethodBind("InputEvent","set_device")
    _icall_Unit_Long( mb, this.ptr, device)
  }

  open fun shortcutMatch(event: InputEvent): Boolean {
    val mb = getMethodBind("InputEvent","shortcut_match")
    return _icall_Boolean_Object( mb, this.ptr, event)
  }

  open fun xformedBy(xform: Transform2D, localOfs: Vector2 = Vector2(0.0, 0.0)): InputEvent {
    val mb = getMethodBind("InputEvent","xformed_by")
    return _icall_InputEvent_Transform2D_Vector2( mb, this.ptr, xform, localOfs)
  }
}
