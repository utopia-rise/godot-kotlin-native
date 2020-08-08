package godot

import godot.AnimationNodeStateMachineTransition
import godot.core.Godot.shouldInitPtr
import godot.core.Signal0
import godot.core.signal
import godot.icalls._icall_Boolean
import godot.icalls._icall_Double
import godot.icalls._icall_Long
import godot.icalls._icall_String
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_String
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.String

open class AnimationNodeStateMachineTransition internal constructor(
  _ignore: Any?
) : Resource(_ignore) {
  val advanceConditionChanged: Signal0 by signal()

  open var advanceCondition: String
    get() {
      val mb = getMethodBind("AnimationNodeStateMachineTransition","get_advance_condition")
      return _icall_String(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeStateMachineTransition","set_advance_condition")
      _icall_Unit_String(mb, this.ptr, value)
    }

  open var autoAdvance: Boolean
    get() {
      val mb = getMethodBind("AnimationNodeStateMachineTransition","has_auto_advance")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeStateMachineTransition","set_auto_advance")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var disabled: Boolean
    get() {
      val mb = getMethodBind("AnimationNodeStateMachineTransition","is_disabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeStateMachineTransition","set_disabled")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var priority: Long
    get() {
      val mb = getMethodBind("AnimationNodeStateMachineTransition","get_priority")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeStateMachineTransition","set_priority")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var switchMode: Long
    get() {
      val mb = getMethodBind("AnimationNodeStateMachineTransition","get_switch_mode")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeStateMachineTransition","set_switch_mode")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var xfadeTime: Double
    get() {
      val mb = getMethodBind("AnimationNodeStateMachineTransition","get_xfade_time")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeStateMachineTransition","set_xfade_time")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("AnimationNodeStateMachineTransition",
            "AnimationNodeStateMachineTransition")
        }

  }

  open fun getAdvanceCondition(): String {
    val mb = getMethodBind("AnimationNodeStateMachineTransition","get_advance_condition")
    return _icall_String( mb, this.ptr)
  }

  open fun getPriority(): Long {
    val mb = getMethodBind("AnimationNodeStateMachineTransition","get_priority")
    return _icall_Long( mb, this.ptr)
  }

  open fun getSwitchMode(): AnimationNodeStateMachineTransition.SwitchMode {
    val mb = getMethodBind("AnimationNodeStateMachineTransition","get_switch_mode")
    return AnimationNodeStateMachineTransition.SwitchMode.from( _icall_Long( mb, this.ptr))
  }

  open fun getXfadeTime(): Double {
    val mb = getMethodBind("AnimationNodeStateMachineTransition","get_xfade_time")
    return _icall_Double( mb, this.ptr)
  }

  open fun hasAutoAdvance(): Boolean {
    val mb = getMethodBind("AnimationNodeStateMachineTransition","has_auto_advance")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isDisabled(): Boolean {
    val mb = getMethodBind("AnimationNodeStateMachineTransition","is_disabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun setAdvanceCondition(name: String) {
    val mb = getMethodBind("AnimationNodeStateMachineTransition","set_advance_condition")
    _icall_Unit_String( mb, this.ptr, name)
  }

  open fun setAutoAdvance(autoAdvance: Boolean) {
    val mb = getMethodBind("AnimationNodeStateMachineTransition","set_auto_advance")
    _icall_Unit_Boolean( mb, this.ptr, autoAdvance)
  }

  open fun setDisabled(disabled: Boolean) {
    val mb = getMethodBind("AnimationNodeStateMachineTransition","set_disabled")
    _icall_Unit_Boolean( mb, this.ptr, disabled)
  }

  open fun setPriority(priority: Long) {
    val mb = getMethodBind("AnimationNodeStateMachineTransition","set_priority")
    _icall_Unit_Long( mb, this.ptr, priority)
  }

  open fun setSwitchMode(mode: Long) {
    val mb = getMethodBind("AnimationNodeStateMachineTransition","set_switch_mode")
    _icall_Unit_Long( mb, this.ptr, mode)
  }

  open fun setXfadeTime(secs: Double) {
    val mb = getMethodBind("AnimationNodeStateMachineTransition","set_xfade_time")
    _icall_Unit_Double( mb, this.ptr, secs)
  }

  enum class SwitchMode(
    id: Long
  ) {
    SWITCH_MODE_IMMEDIATE(0),

    SWITCH_MODE_SYNC(1),

    SWITCH_MODE_AT_END(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val SWITCH_MODE_AT_END: Long = 2

    final const val SWITCH_MODE_IMMEDIATE: Long = 0

    final const val SWITCH_MODE_SYNC: Long = 1
  }
}
