package godot

import godot.core.Godot.shouldInitPtr
import godot.icalls._icall_Double
import godot.icalls._icall_Unit_Double
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Double

open class AudioEffectLimiter internal constructor(
  _ignore: Any?
) : AudioEffect(_ignore) {
  open var ceilingDb: Double
    get() {
      val mb = getMethodBind("AudioEffectLimiter","get_ceiling_db")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AudioEffectLimiter","set_ceiling_db")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var softClipDb: Double
    get() {
      val mb = getMethodBind("AudioEffectLimiter","get_soft_clip_db")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AudioEffectLimiter","set_soft_clip_db")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var softClipRatio: Double
    get() {
      val mb = getMethodBind("AudioEffectLimiter","get_soft_clip_ratio")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AudioEffectLimiter","set_soft_clip_ratio")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var thresholdDb: Double
    get() {
      val mb = getMethodBind("AudioEffectLimiter","get_threshold_db")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AudioEffectLimiter","set_threshold_db")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("AudioEffectLimiter", "AudioEffectLimiter")
        }

  }

  open fun getCeilingDb(): Double {
    val mb = getMethodBind("AudioEffectLimiter","get_ceiling_db")
    return _icall_Double( mb, this.ptr)
  }

  open fun getSoftClipDb(): Double {
    val mb = getMethodBind("AudioEffectLimiter","get_soft_clip_db")
    return _icall_Double( mb, this.ptr)
  }

  open fun getSoftClipRatio(): Double {
    val mb = getMethodBind("AudioEffectLimiter","get_soft_clip_ratio")
    return _icall_Double( mb, this.ptr)
  }

  open fun getThresholdDb(): Double {
    val mb = getMethodBind("AudioEffectLimiter","get_threshold_db")
    return _icall_Double( mb, this.ptr)
  }

  open fun setCeilingDb(ceiling: Double) {
    val mb = getMethodBind("AudioEffectLimiter","set_ceiling_db")
    _icall_Unit_Double( mb, this.ptr, ceiling)
  }

  open fun setSoftClipDb(softClip: Double) {
    val mb = getMethodBind("AudioEffectLimiter","set_soft_clip_db")
    _icall_Unit_Double( mb, this.ptr, softClip)
  }

  open fun setSoftClipRatio(softClip: Double) {
    val mb = getMethodBind("AudioEffectLimiter","set_soft_clip_ratio")
    _icall_Unit_Double( mb, this.ptr, softClip)
  }

  open fun setThresholdDb(threshold: Double) {
    val mb = getMethodBind("AudioEffectLimiter","set_threshold_db")
    _icall_Unit_Double( mb, this.ptr, threshold)
  }
}
