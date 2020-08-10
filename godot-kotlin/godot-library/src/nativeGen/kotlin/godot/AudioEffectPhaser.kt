// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot.shouldInitPtr
import godot.icalls._icall_Double
import godot.icalls._icall_Unit_Double
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Double

open class AudioEffectPhaser internal constructor(
  _ignore: Any?
) : AudioEffect(_ignore) {
  open var depth: Double
    get() {
      val mb = getMethodBind("AudioEffectPhaser","get_depth")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AudioEffectPhaser","set_depth")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var feedback: Double
    get() {
      val mb = getMethodBind("AudioEffectPhaser","get_feedback")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AudioEffectPhaser","set_feedback")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var rangeMaxHz: Double
    get() {
      val mb = getMethodBind("AudioEffectPhaser","get_range_max_hz")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AudioEffectPhaser","set_range_max_hz")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var rangeMinHz: Double
    get() {
      val mb = getMethodBind("AudioEffectPhaser","get_range_min_hz")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AudioEffectPhaser","set_range_min_hz")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var rateHz: Double
    get() {
      val mb = getMethodBind("AudioEffectPhaser","get_rate_hz")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AudioEffectPhaser","set_rate_hz")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("AudioEffectPhaser", "AudioEffectPhaser")
        }

  }

  open fun getDepth(): Double {
    val mb = getMethodBind("AudioEffectPhaser","get_depth")
    return _icall_Double( mb, this.ptr)
  }

  open fun getFeedback(): Double {
    val mb = getMethodBind("AudioEffectPhaser","get_feedback")
    return _icall_Double( mb, this.ptr)
  }

  open fun getRangeMaxHz(): Double {
    val mb = getMethodBind("AudioEffectPhaser","get_range_max_hz")
    return _icall_Double( mb, this.ptr)
  }

  open fun getRangeMinHz(): Double {
    val mb = getMethodBind("AudioEffectPhaser","get_range_min_hz")
    return _icall_Double( mb, this.ptr)
  }

  open fun getRateHz(): Double {
    val mb = getMethodBind("AudioEffectPhaser","get_rate_hz")
    return _icall_Double( mb, this.ptr)
  }

  open fun setDepth(depth: Double) {
    val mb = getMethodBind("AudioEffectPhaser","set_depth")
    _icall_Unit_Double( mb, this.ptr, depth)
  }

  open fun setFeedback(fbk: Double) {
    val mb = getMethodBind("AudioEffectPhaser","set_feedback")
    _icall_Unit_Double( mb, this.ptr, fbk)
  }

  open fun setRangeMaxHz(hz: Double) {
    val mb = getMethodBind("AudioEffectPhaser","set_range_max_hz")
    _icall_Unit_Double( mb, this.ptr, hz)
  }

  open fun setRangeMinHz(hz: Double) {
    val mb = getMethodBind("AudioEffectPhaser","set_range_min_hz")
    _icall_Unit_Double( mb, this.ptr, hz)
  }

  open fun setRateHz(hz: Double) {
    val mb = getMethodBind("AudioEffectPhaser","set_rate_hz")
    _icall_Unit_Double( mb, this.ptr, hz)
  }
}
