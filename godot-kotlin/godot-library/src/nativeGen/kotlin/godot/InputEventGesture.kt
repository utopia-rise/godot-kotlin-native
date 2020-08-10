package godot

import godot.core.Vector2
import godot.icalls._icall_Unit_Vector2
import godot.icalls._icall_Vector2
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Unit

open class InputEventGesture internal constructor(
  _ignore: Any?
) : InputEventWithModifiers(_ignore) {
  open var position: Vector2
    get() {
      val mb = getMethodBind("InputEventGesture","get_position")
      return _icall_Vector2(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("InputEventGesture","set_position")
      _icall_Unit_Vector2(mb, this.ptr, value)
    }

  internal constructor() : this(null)

  open fun position(schedule: Vector2.() -> Unit): Vector2 = position.apply{
      schedule(this)
      position = this
  }


  open fun getPosition(): Vector2 {
    val mb = getMethodBind("InputEventGesture","get_position")
    return _icall_Vector2( mb, this.ptr)
  }

  open fun setPosition(position: Vector2) {
    val mb = getMethodBind("InputEventGesture","set_position")
    _icall_Unit_Vector2( mb, this.ptr, position)
  }
}
