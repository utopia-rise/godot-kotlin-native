package godot

import godot.core.Godot.shouldInitPtr
import godot.icalls._icall_Double
import godot.icalls._icall_Unit_Double
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Double

open class AudioStreamGenerator internal constructor(
  _ignore: Any?
) : AudioStream(_ignore) {
  open var bufferLength: Double
    get() {
      val mb = getMethodBind("AudioStreamGenerator","get_buffer_length")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AudioStreamGenerator","set_buffer_length")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var mixRate: Double
    get() {
      val mb = getMethodBind("AudioStreamGenerator","get_mix_rate")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AudioStreamGenerator","set_mix_rate")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("AudioStreamGenerator", "AudioStreamGenerator")
        }

  }

  open fun getBufferLength(): Double {
    val mb = getMethodBind("AudioStreamGenerator","get_buffer_length")
    return _icall_Double( mb, this.ptr)
  }

  open fun getMixRate(): Double {
    val mb = getMethodBind("AudioStreamGenerator","get_mix_rate")
    return _icall_Double( mb, this.ptr)
  }

  open fun setBufferLength(seconds: Double) {
    val mb = getMethodBind("AudioStreamGenerator","set_buffer_length")
    _icall_Unit_Double( mb, this.ptr, seconds)
  }

  open fun setMixRate(hz: Double) {
    val mb = getMethodBind("AudioStreamGenerator","set_mix_rate")
    _icall_Unit_Double( mb, this.ptr, hz)
  }
}
