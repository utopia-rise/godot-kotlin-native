// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.AudioEffectFilter
import godot.core.Godot.shouldInitPtr
import godot.icalls._icall_Double
import godot.icalls._icall_Long
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_Long
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Double
import kotlin.Long

open class AudioEffectFilter internal constructor(
  _ignore: Any?
) : AudioEffect(_ignore) {
  open var cutoffHz: Double
    get() {
      val mb = getMethodBind("AudioEffectFilter","get_cutoff")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AudioEffectFilter","set_cutoff")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var db: Long
    get() {
      val mb = getMethodBind("AudioEffectFilter","get_db")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AudioEffectFilter","set_db")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var gain: Double
    get() {
      val mb = getMethodBind("AudioEffectFilter","get_gain")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AudioEffectFilter","set_gain")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var resonance: Double
    get() {
      val mb = getMethodBind("AudioEffectFilter","get_resonance")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AudioEffectFilter","set_resonance")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("AudioEffectFilter", "AudioEffectFilter")
        }

  }

  open fun getCutoff(): Double {
    val mb = getMethodBind("AudioEffectFilter","get_cutoff")
    return _icall_Double( mb, this.ptr)
  }

  open fun getDb(): AudioEffectFilter.FilterDB {
    val mb = getMethodBind("AudioEffectFilter","get_db")
    return AudioEffectFilter.FilterDB.from( _icall_Long( mb, this.ptr))
  }

  open fun getGain(): Double {
    val mb = getMethodBind("AudioEffectFilter","get_gain")
    return _icall_Double( mb, this.ptr)
  }

  open fun getResonance(): Double {
    val mb = getMethodBind("AudioEffectFilter","get_resonance")
    return _icall_Double( mb, this.ptr)
  }

  open fun setCutoff(freq: Double) {
    val mb = getMethodBind("AudioEffectFilter","set_cutoff")
    _icall_Unit_Double( mb, this.ptr, freq)
  }

  open fun setDb(amount: Long) {
    val mb = getMethodBind("AudioEffectFilter","set_db")
    _icall_Unit_Long( mb, this.ptr, amount)
  }

  open fun setGain(amount: Double) {
    val mb = getMethodBind("AudioEffectFilter","set_gain")
    _icall_Unit_Double( mb, this.ptr, amount)
  }

  open fun setResonance(amount: Double) {
    val mb = getMethodBind("AudioEffectFilter","set_resonance")
    _icall_Unit_Double( mb, this.ptr, amount)
  }

  enum class FilterDB(
    id: Long
  ) {
    FILTER_6DB(0),

    FILTER_12DB(1),

    FILTER_18DB(2),

    FILTER_24DB(3);

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
