// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot.shouldInitPtr
import godot.core.Signal0
import godot.core.signal
import godot.icalls._icall_AudioStream
import godot.icalls._icall_AudioStreamPlayback
import godot.icalls._icall_Boolean
import godot.icalls._icall_Double
import godot.icalls._icall_Long
import godot.icalls._icall_String
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Object
import godot.icalls._icall_Unit_String
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String

open class AudioStreamPlayer2D internal constructor(
  _ignore: Any?
) : Node2D(_ignore) {
  val finished: Signal0 by signal()

  open var areaMask: Long
    get() {
      val mb = getMethodBind("AudioStreamPlayer2D","get_area_mask")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AudioStreamPlayer2D","set_area_mask")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var attenuation: Double
    get() {
      val mb = getMethodBind("AudioStreamPlayer2D","get_attenuation")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AudioStreamPlayer2D","set_attenuation")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var autoplay: Boolean
    get() {
      val mb = getMethodBind("AudioStreamPlayer2D","is_autoplay_enabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AudioStreamPlayer2D","set_autoplay")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var bus: String
    get() {
      val mb = getMethodBind("AudioStreamPlayer2D","get_bus")
      return _icall_String(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AudioStreamPlayer2D","set_bus")
      _icall_Unit_String(mb, this.ptr, value)
    }

  open var maxDistance: Double
    get() {
      val mb = getMethodBind("AudioStreamPlayer2D","get_max_distance")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AudioStreamPlayer2D","set_max_distance")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var pitchScale: Double
    get() {
      val mb = getMethodBind("AudioStreamPlayer2D","get_pitch_scale")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AudioStreamPlayer2D","set_pitch_scale")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open val playing: Boolean
    get() {
      val mb = getMethodBind("AudioStreamPlayer2D","is_playing")
      return _icall_Boolean(mb, this.ptr)
    }

  open var stream: AudioStream
    get() {
      val mb = getMethodBind("AudioStreamPlayer2D","get_stream")
      return _icall_AudioStream(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AudioStreamPlayer2D","set_stream")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  open var streamPaused: Boolean
    get() {
      val mb = getMethodBind("AudioStreamPlayer2D","get_stream_paused")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AudioStreamPlayer2D","set_stream_paused")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var volumeDb: Double
    get() {
      val mb = getMethodBind("AudioStreamPlayer2D","get_volume_db")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AudioStreamPlayer2D","set_volume_db")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("AudioStreamPlayer2D", "AudioStreamPlayer2D")
        }

  }

  open fun _busLayoutChanged() {
  }

  open fun _isActive(): Boolean {
    throw NotImplementedError("_is_active is not implemented for AudioStreamPlayer2D")
  }

  open fun _setPlaying(enable: Boolean) {
  }

  open fun getAreaMask(): Long {
    val mb = getMethodBind("AudioStreamPlayer2D","get_area_mask")
    return _icall_Long( mb, this.ptr)
  }

  open fun getAttenuation(): Double {
    val mb = getMethodBind("AudioStreamPlayer2D","get_attenuation")
    return _icall_Double( mb, this.ptr)
  }

  open fun getBus(): String {
    val mb = getMethodBind("AudioStreamPlayer2D","get_bus")
    return _icall_String( mb, this.ptr)
  }

  open fun getMaxDistance(): Double {
    val mb = getMethodBind("AudioStreamPlayer2D","get_max_distance")
    return _icall_Double( mb, this.ptr)
  }

  open fun getPitchScale(): Double {
    val mb = getMethodBind("AudioStreamPlayer2D","get_pitch_scale")
    return _icall_Double( mb, this.ptr)
  }

  open fun getPlaybackPosition(): Double {
    val mb = getMethodBind("AudioStreamPlayer2D","get_playback_position")
    return _icall_Double( mb, this.ptr)
  }

  open fun getStream(): AudioStream {
    val mb = getMethodBind("AudioStreamPlayer2D","get_stream")
    return _icall_AudioStream( mb, this.ptr)
  }

  open fun getStreamPaused(): Boolean {
    val mb = getMethodBind("AudioStreamPlayer2D","get_stream_paused")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun getStreamPlayback(): AudioStreamPlayback {
    val mb = getMethodBind("AudioStreamPlayer2D","get_stream_playback")
    return _icall_AudioStreamPlayback( mb, this.ptr)
  }

  open fun getVolumeDb(): Double {
    val mb = getMethodBind("AudioStreamPlayer2D","get_volume_db")
    return _icall_Double( mb, this.ptr)
  }

  open fun isAutoplayEnabled(): Boolean {
    val mb = getMethodBind("AudioStreamPlayer2D","is_autoplay_enabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isPlaying(): Boolean {
    val mb = getMethodBind("AudioStreamPlayer2D","is_playing")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun play(fromPosition: Double = 0.0) {
    val mb = getMethodBind("AudioStreamPlayer2D","play")
    _icall_Unit_Double( mb, this.ptr, fromPosition)
  }

  open fun seek(toPosition: Double) {
    val mb = getMethodBind("AudioStreamPlayer2D","seek")
    _icall_Unit_Double( mb, this.ptr, toPosition)
  }

  open fun setAreaMask(mask: Long) {
    val mb = getMethodBind("AudioStreamPlayer2D","set_area_mask")
    _icall_Unit_Long( mb, this.ptr, mask)
  }

  open fun setAttenuation(curve: Double) {
    val mb = getMethodBind("AudioStreamPlayer2D","set_attenuation")
    _icall_Unit_Double( mb, this.ptr, curve)
  }

  open fun setAutoplay(enable: Boolean) {
    val mb = getMethodBind("AudioStreamPlayer2D","set_autoplay")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setBus(bus: String) {
    val mb = getMethodBind("AudioStreamPlayer2D","set_bus")
    _icall_Unit_String( mb, this.ptr, bus)
  }

  open fun setMaxDistance(pixels: Double) {
    val mb = getMethodBind("AudioStreamPlayer2D","set_max_distance")
    _icall_Unit_Double( mb, this.ptr, pixels)
  }

  open fun setPitchScale(pitchScale: Double) {
    val mb = getMethodBind("AudioStreamPlayer2D","set_pitch_scale")
    _icall_Unit_Double( mb, this.ptr, pitchScale)
  }

  open fun setStream(stream: AudioStream) {
    val mb = getMethodBind("AudioStreamPlayer2D","set_stream")
    _icall_Unit_Object( mb, this.ptr, stream)
  }

  open fun setStreamPaused(pause: Boolean) {
    val mb = getMethodBind("AudioStreamPlayer2D","set_stream_paused")
    _icall_Unit_Boolean( mb, this.ptr, pause)
  }

  open fun setVolumeDb(volumeDb: Double) {
    val mb = getMethodBind("AudioStreamPlayer2D","set_volume_db")
    _icall_Unit_Double( mb, this.ptr, volumeDb)
  }

  open fun stop() {
    val mb = getMethodBind("AudioStreamPlayer2D","stop")
    _icall_Unit( mb, this.ptr)
  }
}
