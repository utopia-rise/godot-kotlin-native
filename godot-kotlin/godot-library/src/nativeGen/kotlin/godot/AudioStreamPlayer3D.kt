// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.AudioStreamPlayer3D
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
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String

open class AudioStreamPlayer3D internal constructor(
  _ignore: Any?
) : Spatial(_ignore) {
  val finished: Signal0 by signal()

  open var areaMask: Long
    get() {
      val mb = getMethodBind("AudioStreamPlayer3D","get_area_mask")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AudioStreamPlayer3D","set_area_mask")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var attenuationFilterCutoffHz: Double
    get() {
      val mb = getMethodBind("AudioStreamPlayer3D","get_attenuation_filter_cutoff_hz")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AudioStreamPlayer3D","set_attenuation_filter_cutoff_hz")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var attenuationFilterDb: Double
    get() {
      val mb = getMethodBind("AudioStreamPlayer3D","get_attenuation_filter_db")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AudioStreamPlayer3D","set_attenuation_filter_db")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var attenuationModel: Long
    get() {
      val mb = getMethodBind("AudioStreamPlayer3D","get_attenuation_model")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AudioStreamPlayer3D","set_attenuation_model")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var autoplay: Boolean
    get() {
      val mb = getMethodBind("AudioStreamPlayer3D","is_autoplay_enabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AudioStreamPlayer3D","set_autoplay")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var bus: String
    get() {
      val mb = getMethodBind("AudioStreamPlayer3D","get_bus")
      return _icall_String(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AudioStreamPlayer3D","set_bus")
      _icall_Unit_String(mb, this.ptr, value)
    }

  open var dopplerTracking: Long
    get() {
      val mb = getMethodBind("AudioStreamPlayer3D","get_doppler_tracking")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AudioStreamPlayer3D","set_doppler_tracking")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var emissionAngleDegrees: Double
    get() {
      val mb = getMethodBind("AudioStreamPlayer3D","get_emission_angle")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AudioStreamPlayer3D","set_emission_angle")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var emissionAngleEnabled: Boolean
    get() {
      val mb = getMethodBind("AudioStreamPlayer3D","is_emission_angle_enabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AudioStreamPlayer3D","set_emission_angle_enabled")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var emissionAngleFilterAttenuationDb: Double
    get() {
      val mb = getMethodBind("AudioStreamPlayer3D","get_emission_angle_filter_attenuation_db")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AudioStreamPlayer3D","set_emission_angle_filter_attenuation_db")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var maxDb: Double
    get() {
      val mb = getMethodBind("AudioStreamPlayer3D","get_max_db")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AudioStreamPlayer3D","set_max_db")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var maxDistance: Double
    get() {
      val mb = getMethodBind("AudioStreamPlayer3D","get_max_distance")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AudioStreamPlayer3D","set_max_distance")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var outOfRangeMode: Long
    get() {
      val mb = getMethodBind("AudioStreamPlayer3D","get_out_of_range_mode")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AudioStreamPlayer3D","set_out_of_range_mode")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var pitchScale: Double
    get() {
      val mb = getMethodBind("AudioStreamPlayer3D","get_pitch_scale")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AudioStreamPlayer3D","set_pitch_scale")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open val playing: Boolean
    get() {
      val mb = getMethodBind("AudioStreamPlayer3D","is_playing")
      return _icall_Boolean(mb, this.ptr)
    }

  open var stream: AudioStream
    get() {
      val mb = getMethodBind("AudioStreamPlayer3D","get_stream")
      return _icall_AudioStream(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AudioStreamPlayer3D","set_stream")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  open var streamPaused: Boolean
    get() {
      val mb = getMethodBind("AudioStreamPlayer3D","get_stream_paused")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AudioStreamPlayer3D","set_stream_paused")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var unitDb: Double
    get() {
      val mb = getMethodBind("AudioStreamPlayer3D","get_unit_db")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AudioStreamPlayer3D","set_unit_db")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var unitSize: Double
    get() {
      val mb = getMethodBind("AudioStreamPlayer3D","get_unit_size")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AudioStreamPlayer3D","set_unit_size")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = invokeConstructor("AudioStreamPlayer3D", "AudioStreamPlayer3D")
        }

  }

  open fun _busLayoutChanged() {
  }

  open fun _isActive(): Boolean {
    throw NotImplementedError("_is_active is not implemented for AudioStreamPlayer3D")
  }

  open fun _setPlaying(enable: Boolean) {
  }

  open fun getAreaMask(): Long {
    val mb = getMethodBind("AudioStreamPlayer3D","get_area_mask")
    return _icall_Long( mb, this.ptr)
  }

  open fun getAttenuationFilterCutoffHz(): Double {
    val mb = getMethodBind("AudioStreamPlayer3D","get_attenuation_filter_cutoff_hz")
    return _icall_Double( mb, this.ptr)
  }

  open fun getAttenuationFilterDb(): Double {
    val mb = getMethodBind("AudioStreamPlayer3D","get_attenuation_filter_db")
    return _icall_Double( mb, this.ptr)
  }

  open fun getAttenuationModel(): AudioStreamPlayer3D.AttenuationModel {
    val mb = getMethodBind("AudioStreamPlayer3D","get_attenuation_model")
    return AudioStreamPlayer3D.AttenuationModel.from( _icall_Long( mb, this.ptr))
  }

  open fun getBus(): String {
    val mb = getMethodBind("AudioStreamPlayer3D","get_bus")
    return _icall_String( mb, this.ptr)
  }

  open fun getDopplerTracking(): AudioStreamPlayer3D.DopplerTracking {
    val mb = getMethodBind("AudioStreamPlayer3D","get_doppler_tracking")
    return AudioStreamPlayer3D.DopplerTracking.from( _icall_Long( mb, this.ptr))
  }

  open fun getEmissionAngle(): Double {
    val mb = getMethodBind("AudioStreamPlayer3D","get_emission_angle")
    return _icall_Double( mb, this.ptr)
  }

  open fun getEmissionAngleFilterAttenuationDb(): Double {
    val mb = getMethodBind("AudioStreamPlayer3D","get_emission_angle_filter_attenuation_db")
    return _icall_Double( mb, this.ptr)
  }

  open fun getMaxDb(): Double {
    val mb = getMethodBind("AudioStreamPlayer3D","get_max_db")
    return _icall_Double( mb, this.ptr)
  }

  open fun getMaxDistance(): Double {
    val mb = getMethodBind("AudioStreamPlayer3D","get_max_distance")
    return _icall_Double( mb, this.ptr)
  }

  open fun getOutOfRangeMode(): AudioStreamPlayer3D.OutOfRangeMode {
    val mb = getMethodBind("AudioStreamPlayer3D","get_out_of_range_mode")
    return AudioStreamPlayer3D.OutOfRangeMode.from( _icall_Long( mb, this.ptr))
  }

  open fun getPitchScale(): Double {
    val mb = getMethodBind("AudioStreamPlayer3D","get_pitch_scale")
    return _icall_Double( mb, this.ptr)
  }

  open fun getPlaybackPosition(): Double {
    val mb = getMethodBind("AudioStreamPlayer3D","get_playback_position")
    return _icall_Double( mb, this.ptr)
  }

  open fun getStream(): AudioStream {
    val mb = getMethodBind("AudioStreamPlayer3D","get_stream")
    return _icall_AudioStream( mb, this.ptr)
  }

  open fun getStreamPaused(): Boolean {
    val mb = getMethodBind("AudioStreamPlayer3D","get_stream_paused")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun getStreamPlayback(): AudioStreamPlayback {
    val mb = getMethodBind("AudioStreamPlayer3D","get_stream_playback")
    return _icall_AudioStreamPlayback( mb, this.ptr)
  }

  open fun getUnitDb(): Double {
    val mb = getMethodBind("AudioStreamPlayer3D","get_unit_db")
    return _icall_Double( mb, this.ptr)
  }

  open fun getUnitSize(): Double {
    val mb = getMethodBind("AudioStreamPlayer3D","get_unit_size")
    return _icall_Double( mb, this.ptr)
  }

  open fun isAutoplayEnabled(): Boolean {
    val mb = getMethodBind("AudioStreamPlayer3D","is_autoplay_enabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isEmissionAngleEnabled(): Boolean {
    val mb = getMethodBind("AudioStreamPlayer3D","is_emission_angle_enabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isPlaying(): Boolean {
    val mb = getMethodBind("AudioStreamPlayer3D","is_playing")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun play(fromPosition: Double = 0.0) {
    val mb = getMethodBind("AudioStreamPlayer3D","play")
    _icall_Unit_Double( mb, this.ptr, fromPosition)
  }

  open fun seek(toPosition: Double) {
    val mb = getMethodBind("AudioStreamPlayer3D","seek")
    _icall_Unit_Double( mb, this.ptr, toPosition)
  }

  open fun setAreaMask(mask: Long) {
    val mb = getMethodBind("AudioStreamPlayer3D","set_area_mask")
    _icall_Unit_Long( mb, this.ptr, mask)
  }

  open fun setAttenuationFilterCutoffHz(degrees: Double) {
    val mb = getMethodBind("AudioStreamPlayer3D","set_attenuation_filter_cutoff_hz")
    _icall_Unit_Double( mb, this.ptr, degrees)
  }

  open fun setAttenuationFilterDb(db: Double) {
    val mb = getMethodBind("AudioStreamPlayer3D","set_attenuation_filter_db")
    _icall_Unit_Double( mb, this.ptr, db)
  }

  open fun setAttenuationModel(model: Long) {
    val mb = getMethodBind("AudioStreamPlayer3D","set_attenuation_model")
    _icall_Unit_Long( mb, this.ptr, model)
  }

  open fun setAutoplay(enable: Boolean) {
    val mb = getMethodBind("AudioStreamPlayer3D","set_autoplay")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setBus(bus: String) {
    val mb = getMethodBind("AudioStreamPlayer3D","set_bus")
    _icall_Unit_String( mb, this.ptr, bus)
  }

  open fun setDopplerTracking(mode: Long) {
    val mb = getMethodBind("AudioStreamPlayer3D","set_doppler_tracking")
    _icall_Unit_Long( mb, this.ptr, mode)
  }

  open fun setEmissionAngle(degrees: Double) {
    val mb = getMethodBind("AudioStreamPlayer3D","set_emission_angle")
    _icall_Unit_Double( mb, this.ptr, degrees)
  }

  open fun setEmissionAngleEnabled(enabled: Boolean) {
    val mb = getMethodBind("AudioStreamPlayer3D","set_emission_angle_enabled")
    _icall_Unit_Boolean( mb, this.ptr, enabled)
  }

  open fun setEmissionAngleFilterAttenuationDb(db: Double) {
    val mb = getMethodBind("AudioStreamPlayer3D","set_emission_angle_filter_attenuation_db")
    _icall_Unit_Double( mb, this.ptr, db)
  }

  open fun setMaxDb(maxDb: Double) {
    val mb = getMethodBind("AudioStreamPlayer3D","set_max_db")
    _icall_Unit_Double( mb, this.ptr, maxDb)
  }

  open fun setMaxDistance(metres: Double) {
    val mb = getMethodBind("AudioStreamPlayer3D","set_max_distance")
    _icall_Unit_Double( mb, this.ptr, metres)
  }

  open fun setOutOfRangeMode(mode: Long) {
    val mb = getMethodBind("AudioStreamPlayer3D","set_out_of_range_mode")
    _icall_Unit_Long( mb, this.ptr, mode)
  }

  open fun setPitchScale(pitchScale: Double) {
    val mb = getMethodBind("AudioStreamPlayer3D","set_pitch_scale")
    _icall_Unit_Double( mb, this.ptr, pitchScale)
  }

  open fun setStream(stream: AudioStream) {
    val mb = getMethodBind("AudioStreamPlayer3D","set_stream")
    _icall_Unit_Object( mb, this.ptr, stream)
  }

  open fun setStreamPaused(pause: Boolean) {
    val mb = getMethodBind("AudioStreamPlayer3D","set_stream_paused")
    _icall_Unit_Boolean( mb, this.ptr, pause)
  }

  open fun setUnitDb(unitDb: Double) {
    val mb = getMethodBind("AudioStreamPlayer3D","set_unit_db")
    _icall_Unit_Double( mb, this.ptr, unitDb)
  }

  open fun setUnitSize(unitSize: Double) {
    val mb = getMethodBind("AudioStreamPlayer3D","set_unit_size")
    _icall_Unit_Double( mb, this.ptr, unitSize)
  }

  open fun stop() {
    val mb = getMethodBind("AudioStreamPlayer3D","stop")
    _icall_Unit( mb, this.ptr)
  }

  enum class AttenuationModel(
    id: Long
  ) {
    ATTENUATION_INVERSE_DISTANCE(0),

    ATTENUATION_INVERSE_SQUARE_DISTANCE(1),

    ATTENUATION_LOGARITHMIC(2),

    ATTENUATION_DISABLED(3);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class OutOfRangeMode(
    id: Long
  ) {
    OUT_OF_RANGE_MIX(0),

    OUT_OF_RANGE_PAUSE(1);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class DopplerTracking(
    id: Long
  ) {
    DOPPLER_TRACKING_DISABLED(0),

    DOPPLER_TRACKING_IDLE_STEP(1),

    DOPPLER_TRACKING_PHYSICS_STEP(2);

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
