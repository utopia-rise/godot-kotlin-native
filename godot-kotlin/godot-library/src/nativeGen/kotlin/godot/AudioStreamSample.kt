// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.AudioStreamSample
import godot.core.Godot.shouldInitPtr
import godot.core.GodotError
import godot.core.PoolByteArray
import godot.icalls._icall_Boolean
import godot.icalls._icall_Long
import godot.icalls._icall_Long_String
import godot.icalls._icall_PoolByteArray
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_PoolByteArray
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.String

open class AudioStreamSample internal constructor(
  _ignore: Any?
) : AudioStream(_ignore) {
  open var data: PoolByteArray
    get() {
      val mb = getMethodBind("AudioStreamSample","get_data")
      return _icall_PoolByteArray(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AudioStreamSample","set_data")
      _icall_Unit_PoolByteArray(mb, this.ptr, value)
    }

  open var format: Long
    get() {
      val mb = getMethodBind("AudioStreamSample","get_format")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AudioStreamSample","set_format")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var loopBegin: Long
    get() {
      val mb = getMethodBind("AudioStreamSample","get_loop_begin")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AudioStreamSample","set_loop_begin")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var loopEnd: Long
    get() {
      val mb = getMethodBind("AudioStreamSample","get_loop_end")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AudioStreamSample","set_loop_end")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var loopMode: Long
    get() {
      val mb = getMethodBind("AudioStreamSample","get_loop_mode")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AudioStreamSample","set_loop_mode")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var mixRate: Long
    get() {
      val mb = getMethodBind("AudioStreamSample","get_mix_rate")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AudioStreamSample","set_mix_rate")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var stereo: Boolean
    get() {
      val mb = getMethodBind("AudioStreamSample","is_stereo")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AudioStreamSample","set_stereo")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("AudioStreamSample", "AudioStreamSample")
        }

  }

  open fun getData(): PoolByteArray {
    val mb = getMethodBind("AudioStreamSample","get_data")
    return _icall_PoolByteArray( mb, this.ptr)
  }

  open fun getFormat(): AudioStreamSample.Format {
    val mb = getMethodBind("AudioStreamSample","get_format")
    return AudioStreamSample.Format.from( _icall_Long( mb, this.ptr))
  }

  open fun getLoopBegin(): Long {
    val mb = getMethodBind("AudioStreamSample","get_loop_begin")
    return _icall_Long( mb, this.ptr)
  }

  open fun getLoopEnd(): Long {
    val mb = getMethodBind("AudioStreamSample","get_loop_end")
    return _icall_Long( mb, this.ptr)
  }

  open fun getLoopMode(): AudioStreamSample.LoopMode {
    val mb = getMethodBind("AudioStreamSample","get_loop_mode")
    return AudioStreamSample.LoopMode.from( _icall_Long( mb, this.ptr))
  }

  open fun getMixRate(): Long {
    val mb = getMethodBind("AudioStreamSample","get_mix_rate")
    return _icall_Long( mb, this.ptr)
  }

  open fun isStereo(): Boolean {
    val mb = getMethodBind("AudioStreamSample","is_stereo")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun saveToWav(path: String): GodotError {
    val mb = getMethodBind("AudioStreamSample","save_to_wav")
    return GodotError.byValue( _icall_Long_String( mb, this.ptr, path).toUInt())
  }

  open fun setData(data: PoolByteArray) {
    val mb = getMethodBind("AudioStreamSample","set_data")
    _icall_Unit_PoolByteArray( mb, this.ptr, data)
  }

  open fun setFormat(format: Long) {
    val mb = getMethodBind("AudioStreamSample","set_format")
    _icall_Unit_Long( mb, this.ptr, format)
  }

  open fun setLoopBegin(loopBegin: Long) {
    val mb = getMethodBind("AudioStreamSample","set_loop_begin")
    _icall_Unit_Long( mb, this.ptr, loopBegin)
  }

  open fun setLoopEnd(loopEnd: Long) {
    val mb = getMethodBind("AudioStreamSample","set_loop_end")
    _icall_Unit_Long( mb, this.ptr, loopEnd)
  }

  open fun setLoopMode(loopMode: Long) {
    val mb = getMethodBind("AudioStreamSample","set_loop_mode")
    _icall_Unit_Long( mb, this.ptr, loopMode)
  }

  open fun setMixRate(mixRate: Long) {
    val mb = getMethodBind("AudioStreamSample","set_mix_rate")
    _icall_Unit_Long( mb, this.ptr, mixRate)
  }

  open fun setStereo(stereo: Boolean) {
    val mb = getMethodBind("AudioStreamSample","set_stereo")
    _icall_Unit_Boolean( mb, this.ptr, stereo)
  }

  enum class LoopMode(
    id: Long
  ) {
    LOOP_DISABLED(0),

    LOOP_FORWARD(1),

    LOOP_PING_PONG(2),

    LOOP_BACKWARD(3);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class Format(
    id: Long
  ) {
    FORMAT_8_BITS(0),

    FORMAT_16_BITS(1),

    FORMAT_IMA_ADPCM(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val FORMAT_16_BITS: Long = 1

    final const val FORMAT_8_BITS: Long = 0

    final const val FORMAT_IMA_ADPCM: Long = 2

    final const val LOOP_BACKWARD: Long = 3

    final const val LOOP_DISABLED: Long = 0

    final const val LOOP_FORWARD: Long = 1

    final const val LOOP_PING_PONG: Long = 2
  }
}
