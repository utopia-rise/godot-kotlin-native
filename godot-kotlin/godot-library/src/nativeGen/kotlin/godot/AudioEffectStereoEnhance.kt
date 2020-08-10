package godot

import godot.core.Godot.shouldInitPtr
import godot.icalls._icall_Double
import godot.icalls._icall_Unit_Double
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Double

open class AudioEffectStereoEnhance internal constructor(
  _ignore: Any?
) : AudioEffect(_ignore) {
  open var panPullout: Double
    get() {
      val mb = getMethodBind("AudioEffectStereoEnhance","get_pan_pullout")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AudioEffectStereoEnhance","set_pan_pullout")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var surround: Double
    get() {
      val mb = getMethodBind("AudioEffectStereoEnhance","get_surround")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AudioEffectStereoEnhance","set_surround")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var timePulloutMs: Double
    get() {
      val mb = getMethodBind("AudioEffectStereoEnhance","get_time_pullout")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AudioEffectStereoEnhance","set_time_pullout")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("AudioEffectStereoEnhance", "AudioEffectStereoEnhance")
        }

  }

  open fun getPanPullout(): Double {
    val mb = getMethodBind("AudioEffectStereoEnhance","get_pan_pullout")
    return _icall_Double( mb, this.ptr)
  }

  open fun getSurround(): Double {
    val mb = getMethodBind("AudioEffectStereoEnhance","get_surround")
    return _icall_Double( mb, this.ptr)
  }

  open fun getTimePullout(): Double {
    val mb = getMethodBind("AudioEffectStereoEnhance","get_time_pullout")
    return _icall_Double( mb, this.ptr)
  }

  open fun setPanPullout(amount: Double) {
    val mb = getMethodBind("AudioEffectStereoEnhance","set_pan_pullout")
    _icall_Unit_Double( mb, this.ptr, amount)
  }

  open fun setSurround(amount: Double) {
    val mb = getMethodBind("AudioEffectStereoEnhance","set_surround")
    _icall_Unit_Double( mb, this.ptr, amount)
  }

  open fun setTimePullout(amount: Double) {
    val mb = getMethodBind("AudioEffectStereoEnhance","set_time_pullout")
    _icall_Unit_Double( mb, this.ptr, amount)
  }
}
