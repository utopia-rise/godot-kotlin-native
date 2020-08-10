// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot.shouldInitPtr
import godot.icalls._icall_Double
import godot.icalls._icall_String
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_String
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Double
import kotlin.String

open class AudioEffectCompressor internal constructor(
  _ignore: Any?
) : AudioEffect(_ignore) {
  open var attackUs: Double
    get() {
      val mb = getMethodBind("AudioEffectCompressor","get_attack_us")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AudioEffectCompressor","set_attack_us")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var gain: Double
    get() {
      val mb = getMethodBind("AudioEffectCompressor","get_gain")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AudioEffectCompressor","set_gain")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var mix: Double
    get() {
      val mb = getMethodBind("AudioEffectCompressor","get_mix")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AudioEffectCompressor","set_mix")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var ratio: Double
    get() {
      val mb = getMethodBind("AudioEffectCompressor","get_ratio")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AudioEffectCompressor","set_ratio")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var releaseMs: Double
    get() {
      val mb = getMethodBind("AudioEffectCompressor","get_release_ms")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AudioEffectCompressor","set_release_ms")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var sidechain: String
    get() {
      val mb = getMethodBind("AudioEffectCompressor","get_sidechain")
      return _icall_String(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AudioEffectCompressor","set_sidechain")
      _icall_Unit_String(mb, this.ptr, value)
    }

  open var threshold: Double
    get() {
      val mb = getMethodBind("AudioEffectCompressor","get_threshold")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AudioEffectCompressor","set_threshold")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("AudioEffectCompressor", "AudioEffectCompressor")
        }

  }

  open fun getAttackUs(): Double {
    val mb = getMethodBind("AudioEffectCompressor","get_attack_us")
    return _icall_Double( mb, this.ptr)
  }

  open fun getGain(): Double {
    val mb = getMethodBind("AudioEffectCompressor","get_gain")
    return _icall_Double( mb, this.ptr)
  }

  open fun getMix(): Double {
    val mb = getMethodBind("AudioEffectCompressor","get_mix")
    return _icall_Double( mb, this.ptr)
  }

  open fun getRatio(): Double {
    val mb = getMethodBind("AudioEffectCompressor","get_ratio")
    return _icall_Double( mb, this.ptr)
  }

  open fun getReleaseMs(): Double {
    val mb = getMethodBind("AudioEffectCompressor","get_release_ms")
    return _icall_Double( mb, this.ptr)
  }

  open fun getSidechain(): String {
    val mb = getMethodBind("AudioEffectCompressor","get_sidechain")
    return _icall_String( mb, this.ptr)
  }

  open fun getThreshold(): Double {
    val mb = getMethodBind("AudioEffectCompressor","get_threshold")
    return _icall_Double( mb, this.ptr)
  }

  open fun setAttackUs(attackUs: Double) {
    val mb = getMethodBind("AudioEffectCompressor","set_attack_us")
    _icall_Unit_Double( mb, this.ptr, attackUs)
  }

  open fun setGain(gain: Double) {
    val mb = getMethodBind("AudioEffectCompressor","set_gain")
    _icall_Unit_Double( mb, this.ptr, gain)
  }

  open fun setMix(mix: Double) {
    val mb = getMethodBind("AudioEffectCompressor","set_mix")
    _icall_Unit_Double( mb, this.ptr, mix)
  }

  open fun setRatio(ratio: Double) {
    val mb = getMethodBind("AudioEffectCompressor","set_ratio")
    _icall_Unit_Double( mb, this.ptr, ratio)
  }

  open fun setReleaseMs(releaseMs: Double) {
    val mb = getMethodBind("AudioEffectCompressor","set_release_ms")
    _icall_Unit_Double( mb, this.ptr, releaseMs)
  }

  open fun setSidechain(sidechain: String) {
    val mb = getMethodBind("AudioEffectCompressor","set_sidechain")
    _icall_Unit_String( mb, this.ptr, sidechain)
  }

  open fun setThreshold(threshold: Double) {
    val mb = getMethodBind("AudioEffectCompressor","set_threshold")
    _icall_Unit_Double( mb, this.ptr, threshold)
  }
}
