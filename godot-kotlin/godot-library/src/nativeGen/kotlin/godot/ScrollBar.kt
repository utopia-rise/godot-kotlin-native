package godot

import godot.core.Signal0
import godot.core.signal
import godot.icalls._icall_Double
import godot.icalls._icall_Unit_Double
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Double

open class ScrollBar internal constructor(
  _ignore: Any?
) : Range(_ignore) {
  val scrolling: Signal0 by signal()

  open var customStep: Double
    get() {
      val mb = getMethodBind("ScrollBar","get_custom_step")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ScrollBar","set_custom_step")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  internal constructor() : this(null)

  open fun _drag_node_exit() {
  }

  open fun _drag_node_input(arg0: InputEvent) {
  }

  override fun _gui_input(arg0: InputEvent) {
  }

  open fun getCustomStep(): Double {
    val mb = getMethodBind("ScrollBar","get_custom_step")
    return _icall_Double( mb, this.ptr)
  }

  open fun setCustomStep(step: Double) {
    val mb = getMethodBind("ScrollBar","set_custom_step")
    _icall_Unit_Double( mb, this.ptr, step)
  }
}
