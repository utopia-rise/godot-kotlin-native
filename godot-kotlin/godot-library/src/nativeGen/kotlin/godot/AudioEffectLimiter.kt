// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.icalls._icall_Double
import godot.icalls._icall_Unit_Double
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Double
import kotlinx.cinterop.COpaquePointer

open class AudioEffectLimiter : AudioEffect() {
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

  override fun __new(): COpaquePointer = invokeConstructor("AudioEffectLimiter",
      "AudioEffectLimiter")

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
