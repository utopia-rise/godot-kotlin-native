package godot

import godot.core.Godot.shouldInitPtr
import godot.icalls._icall_Double
import godot.icalls._icall_Double_Long
import godot.icalls._icall_Long
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Long_Double
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Double
import kotlin.Long

open class AudioEffectChorus internal constructor(
  _ignore: Any?
) : AudioEffect(_ignore) {
  open var dry: Double
    get() {
      val mb = getMethodBind("AudioEffectChorus","get_dry")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AudioEffectChorus","set_dry")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var voice_1_cutoffHz: Double
    get() {
      val mb = getMethodBind("AudioEffectChorus","get_voice_cutoff_hz")
      return _icall_Double_Long(mb, this.ptr, 0)
    }
    set(value) {
      val mb = getMethodBind("AudioEffectChorus","set_voice_cutoff_hz")
      _icall_Unit_Long_Double(mb, this.ptr, 0, value)
    }

  open var voice_1_delayMs: Double
    get() {
      val mb = getMethodBind("AudioEffectChorus","get_voice_delay_ms")
      return _icall_Double_Long(mb, this.ptr, 0)
    }
    set(value) {
      val mb = getMethodBind("AudioEffectChorus","set_voice_delay_ms")
      _icall_Unit_Long_Double(mb, this.ptr, 0, value)
    }

  open var voice_1_depthMs: Double
    get() {
      val mb = getMethodBind("AudioEffectChorus","get_voice_depth_ms")
      return _icall_Double_Long(mb, this.ptr, 0)
    }
    set(value) {
      val mb = getMethodBind("AudioEffectChorus","set_voice_depth_ms")
      _icall_Unit_Long_Double(mb, this.ptr, 0, value)
    }

  open var voice_1_levelDb: Double
    get() {
      val mb = getMethodBind("AudioEffectChorus","get_voice_level_db")
      return _icall_Double_Long(mb, this.ptr, 0)
    }
    set(value) {
      val mb = getMethodBind("AudioEffectChorus","set_voice_level_db")
      _icall_Unit_Long_Double(mb, this.ptr, 0, value)
    }

  open var voice_1_pan: Double
    get() {
      val mb = getMethodBind("AudioEffectChorus","get_voice_pan")
      return _icall_Double_Long(mb, this.ptr, 0)
    }
    set(value) {
      val mb = getMethodBind("AudioEffectChorus","set_voice_pan")
      _icall_Unit_Long_Double(mb, this.ptr, 0, value)
    }

  open var voice_1_rateHz: Double
    get() {
      val mb = getMethodBind("AudioEffectChorus","get_voice_rate_hz")
      return _icall_Double_Long(mb, this.ptr, 0)
    }
    set(value) {
      val mb = getMethodBind("AudioEffectChorus","set_voice_rate_hz")
      _icall_Unit_Long_Double(mb, this.ptr, 0, value)
    }

  open var voice_2_cutoffHz: Double
    get() {
      val mb = getMethodBind("AudioEffectChorus","get_voice_cutoff_hz")
      return _icall_Double_Long(mb, this.ptr, 1)
    }
    set(value) {
      val mb = getMethodBind("AudioEffectChorus","set_voice_cutoff_hz")
      _icall_Unit_Long_Double(mb, this.ptr, 1, value)
    }

  open var voice_2_delayMs: Double
    get() {
      val mb = getMethodBind("AudioEffectChorus","get_voice_delay_ms")
      return _icall_Double_Long(mb, this.ptr, 1)
    }
    set(value) {
      val mb = getMethodBind("AudioEffectChorus","set_voice_delay_ms")
      _icall_Unit_Long_Double(mb, this.ptr, 1, value)
    }

  open var voice_2_depthMs: Double
    get() {
      val mb = getMethodBind("AudioEffectChorus","get_voice_depth_ms")
      return _icall_Double_Long(mb, this.ptr, 1)
    }
    set(value) {
      val mb = getMethodBind("AudioEffectChorus","set_voice_depth_ms")
      _icall_Unit_Long_Double(mb, this.ptr, 1, value)
    }

  open var voice_2_levelDb: Double
    get() {
      val mb = getMethodBind("AudioEffectChorus","get_voice_level_db")
      return _icall_Double_Long(mb, this.ptr, 1)
    }
    set(value) {
      val mb = getMethodBind("AudioEffectChorus","set_voice_level_db")
      _icall_Unit_Long_Double(mb, this.ptr, 1, value)
    }

  open var voice_2_pan: Double
    get() {
      val mb = getMethodBind("AudioEffectChorus","get_voice_pan")
      return _icall_Double_Long(mb, this.ptr, 1)
    }
    set(value) {
      val mb = getMethodBind("AudioEffectChorus","set_voice_pan")
      _icall_Unit_Long_Double(mb, this.ptr, 1, value)
    }

  open var voice_2_rateHz: Double
    get() {
      val mb = getMethodBind("AudioEffectChorus","get_voice_rate_hz")
      return _icall_Double_Long(mb, this.ptr, 1)
    }
    set(value) {
      val mb = getMethodBind("AudioEffectChorus","set_voice_rate_hz")
      _icall_Unit_Long_Double(mb, this.ptr, 1, value)
    }

  open var voice_3_cutoffHz: Double
    get() {
      val mb = getMethodBind("AudioEffectChorus","get_voice_cutoff_hz")
      return _icall_Double_Long(mb, this.ptr, 2)
    }
    set(value) {
      val mb = getMethodBind("AudioEffectChorus","set_voice_cutoff_hz")
      _icall_Unit_Long_Double(mb, this.ptr, 2, value)
    }

  open var voice_3_delayMs: Double
    get() {
      val mb = getMethodBind("AudioEffectChorus","get_voice_delay_ms")
      return _icall_Double_Long(mb, this.ptr, 2)
    }
    set(value) {
      val mb = getMethodBind("AudioEffectChorus","set_voice_delay_ms")
      _icall_Unit_Long_Double(mb, this.ptr, 2, value)
    }

  open var voice_3_depthMs: Double
    get() {
      val mb = getMethodBind("AudioEffectChorus","get_voice_depth_ms")
      return _icall_Double_Long(mb, this.ptr, 2)
    }
    set(value) {
      val mb = getMethodBind("AudioEffectChorus","set_voice_depth_ms")
      _icall_Unit_Long_Double(mb, this.ptr, 2, value)
    }

  open var voice_3_levelDb: Double
    get() {
      val mb = getMethodBind("AudioEffectChorus","get_voice_level_db")
      return _icall_Double_Long(mb, this.ptr, 2)
    }
    set(value) {
      val mb = getMethodBind("AudioEffectChorus","set_voice_level_db")
      _icall_Unit_Long_Double(mb, this.ptr, 2, value)
    }

  open var voice_3_pan: Double
    get() {
      val mb = getMethodBind("AudioEffectChorus","get_voice_pan")
      return _icall_Double_Long(mb, this.ptr, 2)
    }
    set(value) {
      val mb = getMethodBind("AudioEffectChorus","set_voice_pan")
      _icall_Unit_Long_Double(mb, this.ptr, 2, value)
    }

  open var voice_3_rateHz: Double
    get() {
      val mb = getMethodBind("AudioEffectChorus","get_voice_rate_hz")
      return _icall_Double_Long(mb, this.ptr, 2)
    }
    set(value) {
      val mb = getMethodBind("AudioEffectChorus","set_voice_rate_hz")
      _icall_Unit_Long_Double(mb, this.ptr, 2, value)
    }

  open var voice_4_cutoffHz: Double
    get() {
      val mb = getMethodBind("AudioEffectChorus","get_voice_cutoff_hz")
      return _icall_Double_Long(mb, this.ptr, 3)
    }
    set(value) {
      val mb = getMethodBind("AudioEffectChorus","set_voice_cutoff_hz")
      _icall_Unit_Long_Double(mb, this.ptr, 3, value)
    }

  open var voice_4_delayMs: Double
    get() {
      val mb = getMethodBind("AudioEffectChorus","get_voice_delay_ms")
      return _icall_Double_Long(mb, this.ptr, 3)
    }
    set(value) {
      val mb = getMethodBind("AudioEffectChorus","set_voice_delay_ms")
      _icall_Unit_Long_Double(mb, this.ptr, 3, value)
    }

  open var voice_4_depthMs: Double
    get() {
      val mb = getMethodBind("AudioEffectChorus","get_voice_depth_ms")
      return _icall_Double_Long(mb, this.ptr, 3)
    }
    set(value) {
      val mb = getMethodBind("AudioEffectChorus","set_voice_depth_ms")
      _icall_Unit_Long_Double(mb, this.ptr, 3, value)
    }

  open var voice_4_levelDb: Double
    get() {
      val mb = getMethodBind("AudioEffectChorus","get_voice_level_db")
      return _icall_Double_Long(mb, this.ptr, 3)
    }
    set(value) {
      val mb = getMethodBind("AudioEffectChorus","set_voice_level_db")
      _icall_Unit_Long_Double(mb, this.ptr, 3, value)
    }

  open var voice_4_pan: Double
    get() {
      val mb = getMethodBind("AudioEffectChorus","get_voice_pan")
      return _icall_Double_Long(mb, this.ptr, 3)
    }
    set(value) {
      val mb = getMethodBind("AudioEffectChorus","set_voice_pan")
      _icall_Unit_Long_Double(mb, this.ptr, 3, value)
    }

  open var voice_4_rateHz: Double
    get() {
      val mb = getMethodBind("AudioEffectChorus","get_voice_rate_hz")
      return _icall_Double_Long(mb, this.ptr, 3)
    }
    set(value) {
      val mb = getMethodBind("AudioEffectChorus","set_voice_rate_hz")
      _icall_Unit_Long_Double(mb, this.ptr, 3, value)
    }

  open var voiceCount: Long
    get() {
      val mb = getMethodBind("AudioEffectChorus","get_voice_count")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AudioEffectChorus","set_voice_count")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var wet: Double
    get() {
      val mb = getMethodBind("AudioEffectChorus","get_wet")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AudioEffectChorus","set_wet")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("AudioEffectChorus", "AudioEffectChorus")
        }

  }

  open fun getDry(): Double {
    val mb = getMethodBind("AudioEffectChorus","get_dry")
    return _icall_Double( mb, this.ptr)
  }

  open fun getVoiceCount(): Long {
    val mb = getMethodBind("AudioEffectChorus","get_voice_count")
    return _icall_Long( mb, this.ptr)
  }

  open fun getVoiceCutoffHz(voiceIdx: Long): Double {
    val mb = getMethodBind("AudioEffectChorus","get_voice_cutoff_hz")
    return _icall_Double_Long( mb, this.ptr, voiceIdx)
  }

  open fun getVoiceDelayMs(voiceIdx: Long): Double {
    val mb = getMethodBind("AudioEffectChorus","get_voice_delay_ms")
    return _icall_Double_Long( mb, this.ptr, voiceIdx)
  }

  open fun getVoiceDepthMs(voiceIdx: Long): Double {
    val mb = getMethodBind("AudioEffectChorus","get_voice_depth_ms")
    return _icall_Double_Long( mb, this.ptr, voiceIdx)
  }

  open fun getVoiceLevelDb(voiceIdx: Long): Double {
    val mb = getMethodBind("AudioEffectChorus","get_voice_level_db")
    return _icall_Double_Long( mb, this.ptr, voiceIdx)
  }

  open fun getVoicePan(voiceIdx: Long): Double {
    val mb = getMethodBind("AudioEffectChorus","get_voice_pan")
    return _icall_Double_Long( mb, this.ptr, voiceIdx)
  }

  open fun getVoiceRateHz(voiceIdx: Long): Double {
    val mb = getMethodBind("AudioEffectChorus","get_voice_rate_hz")
    return _icall_Double_Long( mb, this.ptr, voiceIdx)
  }

  open fun getWet(): Double {
    val mb = getMethodBind("AudioEffectChorus","get_wet")
    return _icall_Double( mb, this.ptr)
  }

  open fun setDry(amount: Double) {
    val mb = getMethodBind("AudioEffectChorus","set_dry")
    _icall_Unit_Double( mb, this.ptr, amount)
  }

  open fun setVoiceCount(voices: Long) {
    val mb = getMethodBind("AudioEffectChorus","set_voice_count")
    _icall_Unit_Long( mb, this.ptr, voices)
  }

  open fun setVoiceCutoffHz(voiceIdx: Long, cutoffHz: Double) {
    val mb = getMethodBind("AudioEffectChorus","set_voice_cutoff_hz")
    _icall_Unit_Long_Double( mb, this.ptr, voiceIdx, cutoffHz)
  }

  open fun setVoiceDelayMs(voiceIdx: Long, delayMs: Double) {
    val mb = getMethodBind("AudioEffectChorus","set_voice_delay_ms")
    _icall_Unit_Long_Double( mb, this.ptr, voiceIdx, delayMs)
  }

  open fun setVoiceDepthMs(voiceIdx: Long, depthMs: Double) {
    val mb = getMethodBind("AudioEffectChorus","set_voice_depth_ms")
    _icall_Unit_Long_Double( mb, this.ptr, voiceIdx, depthMs)
  }

  open fun setVoiceLevelDb(voiceIdx: Long, levelDb: Double) {
    val mb = getMethodBind("AudioEffectChorus","set_voice_level_db")
    _icall_Unit_Long_Double( mb, this.ptr, voiceIdx, levelDb)
  }

  open fun setVoicePan(voiceIdx: Long, pan: Double) {
    val mb = getMethodBind("AudioEffectChorus","set_voice_pan")
    _icall_Unit_Long_Double( mb, this.ptr, voiceIdx, pan)
  }

  open fun setVoiceRateHz(voiceIdx: Long, rateHz: Double) {
    val mb = getMethodBind("AudioEffectChorus","set_voice_rate_hz")
    _icall_Unit_Long_Double( mb, this.ptr, voiceIdx, rateHz)
  }

  open fun setWet(amount: Double) {
    val mb = getMethodBind("AudioEffectChorus","set_wet")
    _icall_Unit_Double( mb, this.ptr, amount)
  }

  companion object
}
