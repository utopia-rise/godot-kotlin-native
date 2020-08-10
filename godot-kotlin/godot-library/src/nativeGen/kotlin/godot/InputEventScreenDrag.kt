package godot

import godot.core.Godot.shouldInitPtr
import godot.core.Vector2
import godot.icalls._icall_Long
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Vector2
import godot.icalls._icall_Vector2
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Long
import kotlin.Unit

open class InputEventScreenDrag internal constructor(
  _ignore: Any?
) : InputEvent(_ignore) {
  open var index: Long
    get() {
      val mb = getMethodBind("InputEventScreenDrag","get_index")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("InputEventScreenDrag","set_index")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var position: Vector2
    get() {
      val mb = getMethodBind("InputEventScreenDrag","get_position")
      return _icall_Vector2(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("InputEventScreenDrag","set_position")
      _icall_Unit_Vector2(mb, this.ptr, value)
    }

  open var relative: Vector2
    get() {
      val mb = getMethodBind("InputEventScreenDrag","get_relative")
      return _icall_Vector2(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("InputEventScreenDrag","set_relative")
      _icall_Unit_Vector2(mb, this.ptr, value)
    }

  open var speed: Vector2
    get() {
      val mb = getMethodBind("InputEventScreenDrag","get_speed")
      return _icall_Vector2(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("InputEventScreenDrag","set_speed")
      _icall_Unit_Vector2(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("InputEventScreenDrag", "InputEventScreenDrag")
        }

  }

  open fun position(schedule: Vector2.() -> Unit): Vector2 = position.apply{
      schedule(this)
      position = this
  }


  open fun relative(schedule: Vector2.() -> Unit): Vector2 = relative.apply{
      schedule(this)
      relative = this
  }


  open fun speed(schedule: Vector2.() -> Unit): Vector2 = speed.apply{
      schedule(this)
      speed = this
  }


  open fun getIndex(): Long {
    val mb = getMethodBind("InputEventScreenDrag","get_index")
    return _icall_Long( mb, this.ptr)
  }

  open fun getPosition(): Vector2 {
    val mb = getMethodBind("InputEventScreenDrag","get_position")
    return _icall_Vector2( mb, this.ptr)
  }

  open fun getRelative(): Vector2 {
    val mb = getMethodBind("InputEventScreenDrag","get_relative")
    return _icall_Vector2( mb, this.ptr)
  }

  open fun getSpeed(): Vector2 {
    val mb = getMethodBind("InputEventScreenDrag","get_speed")
    return _icall_Vector2( mb, this.ptr)
  }

  open fun setIndex(index: Long) {
    val mb = getMethodBind("InputEventScreenDrag","set_index")
    _icall_Unit_Long( mb, this.ptr, index)
  }

  open fun setPosition(position: Vector2) {
    val mb = getMethodBind("InputEventScreenDrag","set_position")
    _icall_Unit_Vector2( mb, this.ptr, position)
  }

  open fun setRelative(relative: Vector2) {
    val mb = getMethodBind("InputEventScreenDrag","set_relative")
    _icall_Unit_Vector2( mb, this.ptr, relative)
  }

  open fun setSpeed(speed: Vector2) {
    val mb = getMethodBind("InputEventScreenDrag","set_speed")
    _icall_Unit_Vector2( mb, this.ptr, speed)
  }
}
