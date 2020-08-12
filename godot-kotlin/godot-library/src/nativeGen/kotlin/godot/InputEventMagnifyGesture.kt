// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot.shouldInitPtr
import godot.icalls._icall_Double
import godot.icalls._icall_Unit_Double
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Any
import kotlin.Double

open class InputEventMagnifyGesture internal constructor(
  _ignore: Any?
) : InputEventGesture(_ignore) {
  open var factor: Double
    get() {
      val mb = getMethodBind("InputEventMagnifyGesture","get_factor")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("InputEventMagnifyGesture","set_factor")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = invokeConstructor("InputEventMagnifyGesture", "InputEventMagnifyGesture")
        }

  }

  open fun getFactor(): Double {
    val mb = getMethodBind("InputEventMagnifyGesture","get_factor")
    return _icall_Double( mb, this.ptr)
  }

  open fun setFactor(factor: Double) {
    val mb = getMethodBind("InputEventMagnifyGesture","set_factor")
    _icall_Unit_Double( mb, this.ptr, factor)
  }
}
