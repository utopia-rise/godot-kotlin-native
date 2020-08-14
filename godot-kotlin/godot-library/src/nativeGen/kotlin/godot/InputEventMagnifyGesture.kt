// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.icalls._icall_Double
import godot.icalls._icall_Unit_Double
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Double
import kotlinx.cinterop.COpaquePointer

open class InputEventMagnifyGesture : InputEventGesture() {
  open var factor: Double
    get() {
      val mb = getMethodBind("InputEventMagnifyGesture","get_factor")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("InputEventMagnifyGesture","set_factor")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  override fun __new(): COpaquePointer = invokeConstructor("InputEventMagnifyGesture",
      "InputEventMagnifyGesture")

  open fun getFactor(): Double {
    val mb = getMethodBind("InputEventMagnifyGesture","get_factor")
    return _icall_Double( mb, this.ptr)
  }

  open fun setFactor(factor: Double) {
    val mb = getMethodBind("InputEventMagnifyGesture","set_factor")
    _icall_Unit_Double( mb, this.ptr, factor)
  }
}
