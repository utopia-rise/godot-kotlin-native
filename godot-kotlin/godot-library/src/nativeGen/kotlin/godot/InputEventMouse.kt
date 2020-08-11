// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Vector2
import godot.icalls._icall_Long
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Vector2
import godot.icalls._icall_Vector2
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Long
import kotlin.Unit

open class InputEventMouse internal constructor(
  _ignore: Any?
) : InputEventWithModifiers(_ignore) {
  open var buttonMask: Long
    get() {
      val mb = getMethodBind("InputEventMouse","get_button_mask")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("InputEventMouse","set_button_mask")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var globalPosition: Vector2
    get() {
      val mb = getMethodBind("InputEventMouse","get_global_position")
      return _icall_Vector2(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("InputEventMouse","set_global_position")
      _icall_Unit_Vector2(mb, this.ptr, value)
    }

  open var position: Vector2
    get() {
      val mb = getMethodBind("InputEventMouse","get_position")
      return _icall_Vector2(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("InputEventMouse","set_position")
      _icall_Unit_Vector2(mb, this.ptr, value)
    }

  internal constructor() : this(null)

  open fun globalPosition(schedule: Vector2.() -> Unit): Vector2 = globalPosition.apply{
      schedule(this)
      globalPosition = this
  }


  open fun position(schedule: Vector2.() -> Unit): Vector2 = position.apply{
      schedule(this)
      position = this
  }


  open fun getButtonMask(): Long {
    val mb = getMethodBind("InputEventMouse","get_button_mask")
    return _icall_Long( mb, this.ptr)
  }

  open fun getGlobalPosition(): Vector2 {
    val mb = getMethodBind("InputEventMouse","get_global_position")
    return _icall_Vector2( mb, this.ptr)
  }

  open fun getPosition(): Vector2 {
    val mb = getMethodBind("InputEventMouse","get_position")
    return _icall_Vector2( mb, this.ptr)
  }

  open fun setButtonMask(buttonMask: Long) {
    val mb = getMethodBind("InputEventMouse","set_button_mask")
    _icall_Unit_Long( mb, this.ptr, buttonMask)
  }

  open fun setGlobalPosition(globalPosition: Vector2) {
    val mb = getMethodBind("InputEventMouse","set_global_position")
    _icall_Unit_Vector2( mb, this.ptr, globalPosition)
  }

  open fun setPosition(position: Vector2) {
    val mb = getMethodBind("InputEventMouse","set_position")
    _icall_Unit_Vector2( mb, this.ptr, position)
  }
}
