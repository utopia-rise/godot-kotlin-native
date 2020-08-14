// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.icalls._icall_Double
import godot.icalls._icall_Unit_Double
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Double
import kotlinx.cinterop.COpaquePointer

open class AudioStreamGenerator : AudioStream() {
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

  override fun __new(): COpaquePointer = invokeConstructor("AudioStreamGenerator",
      "AudioStreamGenerator")

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
