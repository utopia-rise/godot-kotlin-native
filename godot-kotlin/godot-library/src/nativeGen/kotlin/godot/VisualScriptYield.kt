// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.VisualScriptYield
import godot.core.Godot.shouldInitPtr
import godot.icalls._icall_Double
import godot.icalls._icall_Long
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_Long
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Any
import kotlin.Double
import kotlin.Long

open class VisualScriptYield internal constructor(
  _ignore: Any?
) : VisualScriptNode(_ignore) {
  open var mode: Long
    get() {
      val mb = getMethodBind("VisualScriptYield","get_yield_mode")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VisualScriptYield","set_yield_mode")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var waitTime: Double
    get() {
      val mb = getMethodBind("VisualScriptYield","get_wait_time")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VisualScriptYield","set_wait_time")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = invokeConstructor("VisualScriptYield", "VisualScriptYield")
        }

  }

  open fun getWaitTime(): Double {
    val mb = getMethodBind("VisualScriptYield","get_wait_time")
    return _icall_Double( mb, this.ptr)
  }

  open fun getYieldMode(): VisualScriptYield.YieldMode {
    val mb = getMethodBind("VisualScriptYield","get_yield_mode")
    return VisualScriptYield.YieldMode.from( _icall_Long( mb, this.ptr))
  }

  open fun setWaitTime(sec: Double) {
    val mb = getMethodBind("VisualScriptYield","set_wait_time")
    _icall_Unit_Double( mb, this.ptr, sec)
  }

  open fun setYieldMode(mode: Long) {
    val mb = getMethodBind("VisualScriptYield","set_yield_mode")
    _icall_Unit_Long( mb, this.ptr, mode)
  }

  enum class YieldMode(
    id: Long
  ) {
    YIELD_FRAME(1),

    YIELD_PHYSICS_FRAME(2),

    YIELD_WAIT(3);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object
}
