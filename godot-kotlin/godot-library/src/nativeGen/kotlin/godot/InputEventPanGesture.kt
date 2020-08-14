// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Vector2
import godot.icalls._icall_Unit_Vector2
import godot.icalls._icall_Vector2
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Unit
import kotlinx.cinterop.COpaquePointer

open class InputEventPanGesture : InputEventGesture() {
  open var delta: Vector2
    get() {
      val mb = getMethodBind("InputEventPanGesture","get_delta")
      return _icall_Vector2(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("InputEventPanGesture","set_delta")
      _icall_Unit_Vector2(mb, this.ptr, value)
    }

  override fun __new(): COpaquePointer = invokeConstructor("InputEventPanGesture",
      "InputEventPanGesture")

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
}
