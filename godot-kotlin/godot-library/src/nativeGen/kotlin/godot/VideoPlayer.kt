// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot.shouldInitPtr
import godot.core.Signal0
import godot.core.signal
import godot.icalls._icall_Boolean
import godot.icalls._icall_Double
import godot.icalls._icall_Long
import godot.icalls._icall_String
import godot.icalls._icall_Texture
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Object
import godot.icalls._icall_Unit_String
import godot.icalls._icall_VideoStream
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.String

open class VideoPlayer internal constructor(
  _ignore: Any?
) : Control(_ignore) {
  val finished: Signal0 by signal()

  open var audioTrack: Long
    get() {
      val mb = getMethodBind("VideoPlayer","get_audio_track")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VideoPlayer","set_audio_track")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var autoplay: Boolean
    get() {
      val mb = getMethodBind("VideoPlayer","has_autoplay")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VideoPlayer","set_autoplay")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var bufferingMsec: Long
    get() {
      val mb = getMethodBind("VideoPlayer","get_buffering_msec")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VideoPlayer","set_buffering_msec")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var bus: String
    get() {
      val mb = getMethodBind("VideoPlayer","get_bus")
      return _icall_String(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VideoPlayer","set_bus")
      _icall_Unit_String(mb, this.ptr, value)
    }

  open var expand: Boolean
    get() {
      val mb = getMethodBind("VideoPlayer","has_expand")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VideoPlayer","set_expand")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var paused: Boolean
    get() {
      val mb = getMethodBind("VideoPlayer","is_paused")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VideoPlayer","set_paused")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var stream: VideoStream
    get() {
      val mb = getMethodBind("VideoPlayer","get_stream")
      return _icall_VideoStream(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VideoPlayer","set_stream")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  open var streamPosition: Double
    get() {
      val mb = getMethodBind("VideoPlayer","get_stream_position")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VideoPlayer","set_stream_position")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var volume: Double
    get() {
      val mb = getMethodBind("VideoPlayer","get_volume")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VideoPlayer","set_volume")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var volumeDb: Double
    get() {
      val mb = getMethodBind("VideoPlayer","get_volume_db")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VideoPlayer","set_volume_db")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = invokeConstructor("VideoPlayer", "VideoPlayer")
        }

  }

  open fun getAudioTrack(): Long {
    val mb = getMethodBind("VideoPlayer","get_audio_track")
    return _icall_Long( mb, this.ptr)
  }

  open fun getBufferingMsec(): Long {
    val mb = getMethodBind("VideoPlayer","get_buffering_msec")
    return _icall_Long( mb, this.ptr)
  }

  open fun getBus(): String {
    val mb = getMethodBind("VideoPlayer","get_bus")
    return _icall_String( mb, this.ptr)
  }

  open fun getStream(): VideoStream {
    val mb = getMethodBind("VideoPlayer","get_stream")
    return _icall_VideoStream( mb, this.ptr)
  }

  open fun getStreamName(): String {
    val mb = getMethodBind("VideoPlayer","get_stream_name")
    return _icall_String( mb, this.ptr)
  }

  open fun getStreamPosition(): Double {
    val mb = getMethodBind("VideoPlayer","get_stream_position")
    return _icall_Double( mb, this.ptr)
  }

  open fun getVideoTexture(): Texture {
    val mb = getMethodBind("VideoPlayer","get_video_texture")
    return _icall_Texture( mb, this.ptr)
  }

  open fun getVolume(): Double {
    val mb = getMethodBind("VideoPlayer","get_volume")
    return _icall_Double( mb, this.ptr)
  }

  open fun getVolumeDb(): Double {
    val mb = getMethodBind("VideoPlayer","get_volume_db")
    return _icall_Double( mb, this.ptr)
  }

  open fun hasAutoplay(): Boolean {
    val mb = getMethodBind("VideoPlayer","has_autoplay")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun hasExpand(): Boolean {
    val mb = getMethodBind("VideoPlayer","has_expand")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isPaused(): Boolean {
    val mb = getMethodBind("VideoPlayer","is_paused")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isPlaying(): Boolean {
    val mb = getMethodBind("VideoPlayer","is_playing")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun play() {
    val mb = getMethodBind("VideoPlayer","play")
    _icall_Unit( mb, this.ptr)
  }

  open fun setAudioTrack(track: Long) {
    val mb = getMethodBind("VideoPlayer","set_audio_track")
    _icall_Unit_Long( mb, this.ptr, track)
  }

  open fun setAutoplay(enabled: Boolean) {
    val mb = getMethodBind("VideoPlayer","set_autoplay")
    _icall_Unit_Boolean( mb, this.ptr, enabled)
  }

  open fun setBufferingMsec(msec: Long) {
    val mb = getMethodBind("VideoPlayer","set_buffering_msec")
    _icall_Unit_Long( mb, this.ptr, msec)
  }

  open fun setBus(bus: String) {
    val mb = getMethodBind("VideoPlayer","set_bus")
    _icall_Unit_String( mb, this.ptr, bus)
  }

  open fun setExpand(enable: Boolean) {
    val mb = getMethodBind("VideoPlayer","set_expand")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setPaused(paused: Boolean) {
    val mb = getMethodBind("VideoPlayer","set_paused")
    _icall_Unit_Boolean( mb, this.ptr, paused)
  }

  open fun setStream(stream: VideoStream) {
    val mb = getMethodBind("VideoPlayer","set_stream")
    _icall_Unit_Object( mb, this.ptr, stream)
  }

  open fun setStreamPosition(position: Double) {
    val mb = getMethodBind("VideoPlayer","set_stream_position")
    _icall_Unit_Double( mb, this.ptr, position)
  }

  open fun setVolume(volume: Double) {
    val mb = getMethodBind("VideoPlayer","set_volume")
    _icall_Unit_Double( mb, this.ptr, volume)
  }

  open fun setVolumeDb(db: Double) {
    val mb = getMethodBind("VideoPlayer","set_volume_db")
    _icall_Unit_Double( mb, this.ptr, db)
  }

  open fun stop() {
    val mb = getMethodBind("VideoPlayer","stop")
    _icall_Unit( mb, this.ptr)
  }
}
