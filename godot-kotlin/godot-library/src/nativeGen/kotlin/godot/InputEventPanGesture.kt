package godot

import godot.core.Godot.shouldInitPtr
import godot.core.Vector2
import godot.icalls._icall_Unit_Vector2
import godot.icalls._icall_Vector2
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Unit

open class InputEventPanGesture internal constructor(
  _ignore: Any?
) : InputEventGesture(_ignore) {
  open var delta: Vector2
    get() {
      val mb = getMethodBind("InputEventPanGesture","get_delta")
      return _icall_Vector2(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("InputEventPanGesture","set_delta")
      _icall_Unit_Vector2(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("InputEventPanGesture", "InputEventPanGesture")
        }

  }

  open fun delta(schedule: Vector2.() -> Unit): Vector2 = delta.apply{
      schedule(this)
      delta = this
  }


  open fun getDelta(): Vector2 {
    val mb = getMethodBind("InputEventPanGesture","get_delta")
    return _icall_Vector2( mb, this.ptr)
  }

  open fun setDelta(delta: Vector2) {
    val mb = getMethodBind("InputEventPanGesture","set_delta")
    _icall_Unit_Vector2( mb, this.ptr, delta)
  }

  companion object
}
