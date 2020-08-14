// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.icalls._icall_Boolean
import godot.icalls._icall_Double
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Double
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Boolean
import kotlin.Double
import kotlinx.cinterop.COpaquePointer

open class AudioEffectDelay : AudioEffect() {
  open var dry: Double
    get() {
      val mb = getMethodBind("AudioEffectDelay","get_dry")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AudioEffectDelay","set_dry")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var feedback_active: Boolean
    get() {
      val mb = getMethodBind("AudioEffectDelay","is_feedback_active")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AudioEffectDelay","set_feedback_active")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var feedback_delayMs: Double
    get() {
      val mb = getMethodBind("AudioEffectDelay","get_feedback_delay_ms")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AudioEffectDelay","set_feedback_delay_ms")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var feedback_levelDb: Double
    get() {
      val mb = getMethodBind("AudioEffectDelay","get_feedback_level_db")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AudioEffectDelay","set_feedback_level_db")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var feedback_lowpass: Double
    get() {
      val mb = getMethodBind("AudioEffectDelay","get_feedback_lowpass")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AudioEffectDelay","set_feedback_lowpass")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var tap1_active: Boolean
    get() {
      val mb = getMethodBind("AudioEffectDelay","is_tap1_active")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AudioEffectDelay","set_tap1_active")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var tap1_delayMs: Double
    get() {
      val mb = getMethodBind("AudioEffectDelay","get_tap1_delay_ms")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AudioEffectDelay","set_tap1_delay_ms")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var tap1_levelDb: Double
    get() {
      val mb = getMethodBind("AudioEffectDelay","get_tap1_level_db")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AudioEffectDelay","set_tap1_level_db")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var tap1_pan: Double
    get() {
      val mb = getMethodBind("AudioEffectDelay","get_tap1_pan")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AudioEffectDelay","set_tap1_pan")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var tap2_active: Boolean
    get() {
      val mb = getMethodBind("AudioEffectDelay","is_tap2_active")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AudioEffectDelay","set_tap2_active")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var tap2_delayMs: Double
    get() {
      val mb = getMethodBind("AudioEffectDelay","get_tap2_delay_ms")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AudioEffectDelay","set_tap2_delay_ms")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var tap2_levelDb: Double
    get() {
      val mb = getMethodBind("AudioEffectDelay","get_tap2_level_db")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AudioEffectDelay","set_tap2_level_db")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var tap2_pan: Double
    get() {
      val mb = getMethodBind("AudioEffectDelay","get_tap2_pan")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AudioEffectDelay","set_tap2_pan")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  override fun __new(): COpaquePointer = invokeConstructor("AudioEffectDelay", "AudioEffectDelay")

  open fun getDry(): Double {
    val mb = getMethodBind("AudioEffectDelay","get_dry")
    return _icall_Double( mb, this.ptr)
  }

  open fun getFeedbackDelayMs(): Double {
    val mb = getMethodBind("AudioEffectDelay","get_feedback_delay_ms")
    return _icall_Double( mb, this.ptr)
  }

  open fun getFeedbackLevelDb(): Double {
    val mb = getMethodBind("AudioEffectDelay","get_feedback_level_db")
    return _icall_Double( mb, this.ptr)
  }

  open fun getFeedbackLowpass(): Double {
    val mb = getMethodBind("AudioEffectDelay","get_feedback_lowpass")
    return _icall_Double( mb, this.ptr)
  }

  open fun getTap1DelayMs(): Double {
    val mb = getMethodBind("AudioEffectDelay","get_tap1_delay_ms")
    return _icall_Double( mb, this.ptr)
  }

  open fun getTap1LevelDb(): Double {
    val mb = getMethodBind("AudioEffectDelay","get_tap1_level_db")
    return _icall_Double( mb, this.ptr)
  }

  open fun getTap1Pan(): Double {
    val mb = getMethodBind("AudioEffectDelay","get_tap1_pan")
    return _icall_Double( mb, this.ptr)
  }

  open fun getTap2DelayMs(): Double {
    val mb = getMethodBind("AudioEffectDelay","get_tap2_delay_ms")
    return _icall_Double( mb, this.ptr)
  }

  open fun getTap2LevelDb(): Double {
    val mb = getMethodBind("AudioEffectDelay","get_tap2_level_db")
    return _icall_Double( mb, this.ptr)
  }

  open fun getTap2Pan(): Double {
    val mb = getMethodBind("AudioEffectDelay","get_tap2_pan")
    return _icall_Double( mb, this.ptr)
  }

  open fun isFeedbackActive(): Boolean {
    val mb = getMethodBind("AudioEffectDelay","is_feedback_active")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isTap1Active(): Boolean {
    val mb = getMethodBind("AudioEffectDelay","is_tap1_active")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isTap2Active(): Boolean {
    val mb = getMethodBind("AudioEffectDelay","is_tap2_active")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun setDry(amount: Double) {
    val mb = getMethodBind("AudioEffectDelay","set_dry")
    _icall_Unit_Double( mb, this.ptr, amount)
  }

  open fun setFeedbackActive(amount: Boolean) {
    val mb = getMethodBind("AudioEffectDelay","set_feedback_active")
    _icall_Unit_Boolean( mb, this.ptr, amount)
  }

  open fun setFeedbackDelayMs(amount: Double) {
    val mb = getMethodBind("AudioEffectDelay","set_feedback_delay_ms")
    _icall_Unit_Double( mb, this.ptr, amount)
  }

  open fun setFeedbackLevelDb(amount: Double) {
    val mb = getMethodBind("AudioEffectDelay","set_feedback_level_db")
    _icall_Unit_Double( mb, this.ptr, amount)
  }

  open fun setFeedbackLowpass(amount: Double) {
    val mb = getMethodBind("AudioEffectDelay","set_feedback_lowpass")
    _icall_Unit_Double( mb, this.ptr, amount)
  }

  open fun setTap1Active(amount: Boolean) {
    val mb = getMethodBind("AudioEffectDelay","set_tap1_active")
    _icall_Unit_Boolean( mb, this.ptr, amount)
  }

  open fun setTap1DelayMs(amount: Double) {
    val mb = getMethodBind("AudioEffectDelay","set_tap1_delay_ms")
    _icall_Unit_Double( mb, this.ptr, amount)
  }

  open fun setTap1LevelDb(amount: Double) {
    val mb = getMethodBind("AudioEffectDelay","set_tap1_level_db")
    _icall_Unit_Double( mb, this.ptr, amount)
  }

  open fun setTap1Pan(amount: Double) {
    val mb = getMethodBind("AudioEffectDelay","set_tap1_pan")
    _icall_Unit_Double( mb, this.ptr, amount)
  }

  open fun setTap2Active(amount: Boolean) {
    val mb = getMethodBind("AudioEffectDelay","set_tap2_active")
    _icall_Unit_Boolean( mb, this.ptr, amount)
  }

  open fun setTap2DelayMs(amount: Double) {
    val mb = getMethodBind("AudioEffectDelay","set_tap2_delay_ms")
    _icall_Unit_Double( mb, this.ptr, amount)
  }

  open fun setTap2LevelDb(amount: Double) {
    val mb = getMethodBind("AudioEffectDelay","set_tap2_level_db")
    _icall_Unit_Double( mb, this.ptr, amount)
  }

  open fun setTap2Pan(amount: Double) {
    val mb = getMethodBind("AudioEffectDelay","set_tap2_pan")
    _icall_Unit_Double( mb, this.ptr, amount)
  }
}
