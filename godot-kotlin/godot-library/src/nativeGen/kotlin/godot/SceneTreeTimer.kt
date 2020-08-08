package godot

import godot.core.Signal0
import godot.core.signal
import godot.icalls._icall_Double
import godot.icalls._icall_Unit_Double
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Double

open class SceneTreeTimer internal constructor(
  _ignore: Any?
) : Reference(_ignore) {
  val timeout: Signal0 by signal()

  open var timeLeft: Double
    get() {
      val mb = getMethodBind("SceneTreeTimer","get_time_left")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SceneTreeTimer","set_time_left")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  internal constructor() : this(null)

  open fun getTimeLeft(): Double {
    val mb = getMethodBind("SceneTreeTimer","get_time_left")
    return _icall_Double( mb, this.ptr)
  }

  open fun setTimeLeft(time: Double) {
    val mb = getMethodBind("SceneTreeTimer","set_time_left")
    _icall_Unit_Double( mb, this.ptr, time)
  }

  companion object
}
