// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.Timer
import godot.core.Godot.shouldInitPtr
import godot.core.Signal0
import godot.core.signal
import godot.icalls._icall_Boolean
import godot.icalls._icall_Double
import godot.icalls._icall_Long
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_Long
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long

open class Timer internal constructor(
  _ignore: Any?
) : Node(_ignore) {
  val timeout: Signal0 by signal()

  open var autostart: Boolean
    get() {
      val mb = getMethodBind("Timer","has_autostart")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Timer","set_autostart")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var oneShot: Boolean
    get() {
      val mb = getMethodBind("Timer","is_one_shot")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Timer","set_one_shot")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var paused: Boolean
    get() {
      val mb = getMethodBind("Timer","is_paused")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Timer","set_paused")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var processMode: Long
    get() {
      val mb = getMethodBind("Timer","get_timer_process_mode")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Timer","set_timer_process_mode")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open val timeLeft: Double
    get() {
      val mb = getMethodBind("Timer","get_time_left")
      return _icall_Double(mb, this.ptr)
    }

  open var waitTime: Double
    get() {
      val mb = getMethodBind("Timer","get_wait_time")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Timer","set_wait_time")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("Timer", "Timer")
        }

  }

  open fun getTimeLeft(): Double {
    val mb = getMethodBind("Timer","get_time_left")
    return _icall_Double( mb, this.ptr)
  }

  open fun getTimerProcessMode(): Timer.TimerProcessMode {
    val mb = getMethodBind("Timer","get_timer_process_mode")
    return Timer.TimerProcessMode.from( _icall_Long( mb, this.ptr))
  }

  open fun getWaitTime(): Double {
    val mb = getMethodBind("Timer","get_wait_time")
    return _icall_Double( mb, this.ptr)
  }

  open fun hasAutostart(): Boolean {
    val mb = getMethodBind("Timer","has_autostart")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isOneShot(): Boolean {
    val mb = getMethodBind("Timer","is_one_shot")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isPaused(): Boolean {
    val mb = getMethodBind("Timer","is_paused")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isStopped(): Boolean {
    val mb = getMethodBind("Timer","is_stopped")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun setAutostart(enable: Boolean) {
    val mb = getMethodBind("Timer","set_autostart")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setOneShot(enable: Boolean) {
    val mb = getMethodBind("Timer","set_one_shot")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setPaused(paused: Boolean) {
    val mb = getMethodBind("Timer","set_paused")
    _icall_Unit_Boolean( mb, this.ptr, paused)
  }

  open fun setTimerProcessMode(mode: Long) {
    val mb = getMethodBind("Timer","set_timer_process_mode")
    _icall_Unit_Long( mb, this.ptr, mode)
  }

  open fun setWaitTime(timeSec: Double) {
    val mb = getMethodBind("Timer","set_wait_time")
    _icall_Unit_Double( mb, this.ptr, timeSec)
  }

  open fun start(timeSec: Double = -1.0) {
    val mb = getMethodBind("Timer","start")
    _icall_Unit_Double( mb, this.ptr, timeSec)
  }

  open fun stop() {
    val mb = getMethodBind("Timer","stop")
    _icall_Unit( mb, this.ptr)
  }

  enum class TimerProcessMode(
    id: Long
  ) {
    TIMER_PROCESS_PHYSICS(0),

    TIMER_PROCESS_IDLE(1);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val TIMER_PROCESS_IDLE: Long = 1

    final const val TIMER_PROCESS_PHYSICS: Long = 0
  }
}
