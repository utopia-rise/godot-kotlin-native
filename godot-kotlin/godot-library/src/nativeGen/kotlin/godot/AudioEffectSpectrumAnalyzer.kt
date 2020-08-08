package godot

import godot.AudioEffectSpectrumAnalyzer
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

open class AudioEffectSpectrumAnalyzer internal constructor(
  _ignore: Any?
) : AudioEffect(_ignore) {
  open var bufferLength: Double
    get() {
      val mb = getMethodBind("AudioEffectSpectrumAnalyzer","get_buffer_length")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AudioEffectSpectrumAnalyzer","set_buffer_length")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var fftSize: Long
    get() {
      val mb = getMethodBind("AudioEffectSpectrumAnalyzer","get_fft_size")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AudioEffectSpectrumAnalyzer","set_fft_size")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var tapBackPos: Double
    get() {
      val mb = getMethodBind("AudioEffectSpectrumAnalyzer","get_tap_back_pos")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AudioEffectSpectrumAnalyzer","set_tap_back_pos")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("AudioEffectSpectrumAnalyzer", "AudioEffectSpectrumAnalyzer")
        }

  }

  open fun getBufferLength(): Double {
    val mb = getMethodBind("AudioEffectSpectrumAnalyzer","get_buffer_length")
    return _icall_Double( mb, this.ptr)
  }

  open fun getFftSize(): AudioEffectSpectrumAnalyzer.FFT_Size {
    val mb = getMethodBind("AudioEffectSpectrumAnalyzer","get_fft_size")
    return AudioEffectSpectrumAnalyzer.FFT_Size.from( _icall_Long( mb, this.ptr))
  }

  open fun getTapBackPos(): Double {
    val mb = getMethodBind("AudioEffectSpectrumAnalyzer","get_tap_back_pos")
    return _icall_Double( mb, this.ptr)
  }

  open fun setBufferLength(seconds: Double) {
    val mb = getMethodBind("AudioEffectSpectrumAnalyzer","set_buffer_length")
    _icall_Unit_Double( mb, this.ptr, seconds)
  }

  open fun setFftSize(size: Long) {
    val mb = getMethodBind("AudioEffectSpectrumAnalyzer","set_fft_size")
    _icall_Unit_Long( mb, this.ptr, size)
  }

  open fun setTapBackPos(seconds: Double) {
    val mb = getMethodBind("AudioEffectSpectrumAnalyzer","set_tap_back_pos")
    _icall_Unit_Double( mb, this.ptr, seconds)
  }

  enum class FFT_Size(
    id: Long
  ) {
    FFT_SIZE_256(0),

    FFT_SIZE_512(1),

    FFT_SIZE_1024(2),

    FFT_SIZE_2048(3),

    FFT_SIZE_4096(4),

    FFT_SIZE_MAX(5);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val FFT_SIZE_1024: Long = 2

    final const val FFT_SIZE_2048: Long = 3

    final const val FFT_SIZE_256: Long = 0

    final const val FFT_SIZE_4096: Long = 4

    final const val FFT_SIZE_512: Long = 1

    final const val FFT_SIZE_MAX: Long = 5
  }
}
