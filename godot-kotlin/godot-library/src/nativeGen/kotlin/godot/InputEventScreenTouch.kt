// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot.shouldInitPtr
import godot.core.Vector2
import godot.icalls._icall_Long
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Vector2
import godot.icalls._icall_Vector2
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.UninitializedPropertyAccessException
import kotlin.Unit

open class InputEventScreenTouch internal constructor(
  _ignore: Any?
) : InputEvent(_ignore) {
  open var index: Long
    get() {
      val mb = getMethodBind("InputEventScreenTouch","get_index")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("InputEventScreenTouch","set_index")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var position: Vector2
    get() {
      val mb = getMethodBind("InputEventScreenTouch","get_position")
      return _icall_Vector2(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("InputEventScreenTouch","set_position")
      _icall_Unit_Vector2(mb, this.ptr, value)
    }

  open var pressed: Boolean
    get() {
      throw UninitializedPropertyAccessException("Cannot access property pressed: has no getter")
    }
    set(value) {
      val mb = getMethodBind("InputEventScreenTouch","set_pressed")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("InputEventScreenTouch", "InputEventScreenTouch")
        }

  }

  open fun position(schedule: Vector2.() -> Unit): Vector2 = position.apply{
      schedule(this)
      position = this
  }


  open fun getIndex(): Long {
    val mb = getMethodBind("InputEventScreenTouch","get_index")
    return _icall_Long( mb, this.ptr)
  }

  open fun getPosition(): Vector2 {
    val mb = getMethodBind("InputEventScreenTouch","get_position")
    return _icall_Vector2( mb, this.ptr)
  }

  open fun setIndex(index: Long) {
    val mb = getMethodBind("InputEventScreenTouch","set_index")
    _icall_Unit_Long( mb, this.ptr, index)
  }

  open fun setPosition(position: Vector2) {
    val mb = getMethodBind("InputEventScreenTouch","set_position")
    _icall_Unit_Vector2( mb, this.ptr, position)
  }

  open fun setPressed(pressed: Boolean) {
    val mb = getMethodBind("InputEventScreenTouch","set_pressed")
    _icall_Unit_Boolean( mb, this.ptr, pressed)
  }
}
