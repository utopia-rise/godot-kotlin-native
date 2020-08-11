// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.AudioServer
import godot.core.Godot
import godot.core.Signal0
import godot.core.VariantArray
import godot.core.signal
import godot.icalls._icall_AudioBusLayout
import godot.icalls._icall_AudioEffectInstance_Long_Long_Long
import godot.icalls._icall_AudioEffect_Long_Long
import godot.icalls._icall_Boolean_Long
import godot.icalls._icall_Boolean_Long_Long
import godot.icalls._icall_Double
import godot.icalls._icall_Double_Long
import godot.icalls._icall_Double_Long_Long
import godot.icalls._icall_Long
import godot.icalls._icall_Long_Long
import godot.icalls._icall_Long_String
import godot.icalls._icall_String
import godot.icalls._icall_String_Long
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Long_Boolean
import godot.icalls._icall_Unit_Long_Double
import godot.icalls._icall_Unit_Long_Long
import godot.icalls._icall_Unit_Long_Long_Boolean
import godot.icalls._icall_Unit_Long_Long_Long
import godot.icalls._icall_Unit_Long_Object_Long
import godot.icalls._icall_Unit_Long_String
import godot.icalls._icall_Unit_Object
import godot.icalls._icall_Unit_String
import godot.icalls._icall_VariantArray
import godot.internal.type.nullSafe
import godot.internal.utils.getMethodBind
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.String
import kotlin.requireNotNull
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped

object AudioServer : Object() {
  init {
    memScoped {
        val ptr = nullSafe(Godot.gdnative.godot_global_get_singleton).invoke("AudioServer".cstr.ptr)
        requireNotNull(ptr) { "No instance found for singleton AudioServer" }
        this@AudioServer.ptr = ptr
    }
  }

  final const val SPEAKER_MODE_STEREO: Long = 0

  final const val SPEAKER_SURROUND_31: Long = 1

  final const val SPEAKER_SURROUND_51: Long = 2

  final const val SPEAKER_SURROUND_71: Long = 3

  val busLayoutChanged: Signal0 by signal()

  var busCount: Long
    get() {
      val mb = getMethodBind("AudioServer","get_bus_count")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AudioServer","set_bus_count")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  var device: String
    get() {
      val mb = getMethodBind("AudioServer","get_device")
      return _icall_String(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AudioServer","set_device")
      _icall_Unit_String(mb, this.ptr, value)
    }

  var globalRateScale: Double
    get() {
      val mb = getMethodBind("AudioServer","get_global_rate_scale")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AudioServer","set_global_rate_scale")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  fun addBus(atPosition: Long = -1) {
    val mb = getMethodBind("AudioServer","add_bus")
    _icall_Unit_Long( mb, this.ptr, atPosition)
  }

  fun addBusEffect(
    busIdx: Long,
    effect: AudioEffect,
    atPosition: Long = -1
  ) {
    val mb = getMethodBind("AudioServer","add_bus_effect")
    _icall_Unit_Long_Object_Long( mb, this.ptr, busIdx, effect, atPosition)
  }

  fun captureGetDevice(): String {
    val mb = getMethodBind("AudioServer","capture_get_device")
    return _icall_String( mb, this.ptr)
  }

  fun captureGetDeviceList(): VariantArray {
    val mb = getMethodBind("AudioServer","capture_get_device_list")
    return _icall_VariantArray( mb, this.ptr)
  }

  fun captureSetDevice(name: String) {
    val mb = getMethodBind("AudioServer","capture_set_device")
    _icall_Unit_String( mb, this.ptr, name)
  }

  fun generateBusLayout(): AudioBusLayout {
    val mb = getMethodBind("AudioServer","generate_bus_layout")
    return _icall_AudioBusLayout( mb, this.ptr)
  }

  fun getBusChannels(busIdx: Long): Long {
    val mb = getMethodBind("AudioServer","get_bus_channels")
    return _icall_Long_Long( mb, this.ptr, busIdx)
  }

  fun getBusCount(): Long {
    val mb = getMethodBind("AudioServer","get_bus_count")
    return _icall_Long( mb, this.ptr)
  }

  fun getBusEffect(busIdx: Long, effectIdx: Long): AudioEffect {
    val mb = getMethodBind("AudioServer","get_bus_effect")
    return _icall_AudioEffect_Long_Long( mb, this.ptr, busIdx, effectIdx)
  }

  fun getBusEffectCount(busIdx: Long): Long {
    val mb = getMethodBind("AudioServer","get_bus_effect_count")
    return _icall_Long_Long( mb, this.ptr, busIdx)
  }

  fun getBusEffectInstance(
    busIdx: Long,
    effectIdx: Long,
    channel: Long = 0
  ): AudioEffectInstance {
    val mb = getMethodBind("AudioServer","get_bus_effect_instance")
    return _icall_AudioEffectInstance_Long_Long_Long( mb, this.ptr, busIdx, effectIdx, channel)
  }

  fun getBusIndex(busName: String): Long {
    val mb = getMethodBind("AudioServer","get_bus_index")
    return _icall_Long_String( mb, this.ptr, busName)
  }

  fun getBusName(busIdx: Long): String {
    val mb = getMethodBind("AudioServer","get_bus_name")
    return _icall_String_Long( mb, this.ptr, busIdx)
  }

  fun getBusPeakVolumeLeftDb(busIdx: Long, channel: Long): Double {
    val mb = getMethodBind("AudioServer","get_bus_peak_volume_left_db")
    return _icall_Double_Long_Long( mb, this.ptr, busIdx, channel)
  }

  fun getBusPeakVolumeRightDb(busIdx: Long, channel: Long): Double {
    val mb = getMethodBind("AudioServer","get_bus_peak_volume_right_db")
    return _icall_Double_Long_Long( mb, this.ptr, busIdx, channel)
  }

  fun getBusSend(busIdx: Long): String {
    val mb = getMethodBind("AudioServer","get_bus_send")
    return _icall_String_Long( mb, this.ptr, busIdx)
  }

  fun getBusVolumeDb(busIdx: Long): Double {
    val mb = getMethodBind("AudioServer","get_bus_volume_db")
    return _icall_Double_Long( mb, this.ptr, busIdx)
  }

  fun getDevice(): String {
    val mb = getMethodBind("AudioServer","get_device")
    return _icall_String( mb, this.ptr)
  }

  fun getDeviceList(): VariantArray {
    val mb = getMethodBind("AudioServer","get_device_list")
    return _icall_VariantArray( mb, this.ptr)
  }

  fun getGlobalRateScale(): Double {
    val mb = getMethodBind("AudioServer","get_global_rate_scale")
    return _icall_Double( mb, this.ptr)
  }

  fun getMixRate(): Double {
    val mb = getMethodBind("AudioServer","get_mix_rate")
    return _icall_Double( mb, this.ptr)
  }

  fun getOutputLatency(): Double {
    val mb = getMethodBind("AudioServer","get_output_latency")
    return _icall_Double( mb, this.ptr)
  }

  fun getSpeakerMode(): AudioServer.SpeakerMode {
    val mb = getMethodBind("AudioServer","get_speaker_mode")
    return AudioServer.SpeakerMode.from( _icall_Long( mb, this.ptr))
  }

  fun getTimeSinceLastMix(): Double {
    val mb = getMethodBind("AudioServer","get_time_since_last_mix")
    return _icall_Double( mb, this.ptr)
  }

  fun getTimeToNextMix(): Double {
    val mb = getMethodBind("AudioServer","get_time_to_next_mix")
    return _icall_Double( mb, this.ptr)
  }

  fun isBusBypassingEffects(busIdx: Long): Boolean {
    val mb = getMethodBind("AudioServer","is_bus_bypassing_effects")
    return _icall_Boolean_Long( mb, this.ptr, busIdx)
  }

  fun isBusEffectEnabled(busIdx: Long, effectIdx: Long): Boolean {
    val mb = getMethodBind("AudioServer","is_bus_effect_enabled")
    return _icall_Boolean_Long_Long( mb, this.ptr, busIdx, effectIdx)
  }

  fun isBusMute(busIdx: Long): Boolean {
    val mb = getMethodBind("AudioServer","is_bus_mute")
    return _icall_Boolean_Long( mb, this.ptr, busIdx)
  }

  fun isBusSolo(busIdx: Long): Boolean {
    val mb = getMethodBind("AudioServer","is_bus_solo")
    return _icall_Boolean_Long( mb, this.ptr, busIdx)
  }

  fun lock() {
    val mb = getMethodBind("AudioServer","lock")
    _icall_Unit( mb, this.ptr)
  }

  fun moveBus(index: Long, toIndex: Long) {
    val mb = getMethodBind("AudioServer","move_bus")
    _icall_Unit_Long_Long( mb, this.ptr, index, toIndex)
  }

  fun removeBus(index: Long) {
    val mb = getMethodBind("AudioServer","remove_bus")
    _icall_Unit_Long( mb, this.ptr, index)
  }

  fun removeBusEffect(busIdx: Long, effectIdx: Long) {
    val mb = getMethodBind("AudioServer","remove_bus_effect")
    _icall_Unit_Long_Long( mb, this.ptr, busIdx, effectIdx)
  }

  fun setBusBypassEffects(busIdx: Long, enable: Boolean) {
    val mb = getMethodBind("AudioServer","set_bus_bypass_effects")
    _icall_Unit_Long_Boolean( mb, this.ptr, busIdx, enable)
  }

  fun setBusCount(amount: Long) {
    val mb = getMethodBind("AudioServer","set_bus_count")
    _icall_Unit_Long( mb, this.ptr, amount)
  }

  fun setBusEffectEnabled(
    busIdx: Long,
    effectIdx: Long,
    enabled: Boolean
  ) {
    val mb = getMethodBind("AudioServer","set_bus_effect_enabled")
    _icall_Unit_Long_Long_Boolean( mb, this.ptr, busIdx, effectIdx, enabled)
  }

  fun setBusLayout(busLayout: AudioBusLayout) {
    val mb = getMethodBind("AudioServer","set_bus_layout")
    _icall_Unit_Object( mb, this.ptr, busLayout)
  }

  fun setBusMute(busIdx: Long, enable: Boolean) {
    val mb = getMethodBind("AudioServer","set_bus_mute")
    _icall_Unit_Long_Boolean( mb, this.ptr, busIdx, enable)
  }

  fun setBusName(busIdx: Long, name: String) {
    val mb = getMethodBind("AudioServer","set_bus_name")
    _icall_Unit_Long_String( mb, this.ptr, busIdx, name)
  }

  fun setBusSend(busIdx: Long, send: String) {
    val mb = getMethodBind("AudioServer","set_bus_send")
    _icall_Unit_Long_String( mb, this.ptr, busIdx, send)
  }

  fun setBusSolo(busIdx: Long, enable: Boolean) {
    val mb = getMethodBind("AudioServer","set_bus_solo")
    _icall_Unit_Long_Boolean( mb, this.ptr, busIdx, enable)
  }

  fun setBusVolumeDb(busIdx: Long, volumeDb: Double) {
    val mb = getMethodBind("AudioServer","set_bus_volume_db")
    _icall_Unit_Long_Double( mb, this.ptr, busIdx, volumeDb)
  }

  fun setDevice(device: String) {
    val mb = getMethodBind("AudioServer","set_device")
    _icall_Unit_String( mb, this.ptr, device)
  }

  fun setGlobalRateScale(scale: Double) {
    val mb = getMethodBind("AudioServer","set_global_rate_scale")
    _icall_Unit_Double( mb, this.ptr, scale)
  }

  fun swapBusEffects(
    busIdx: Long,
    effectIdx: Long,
    byEffectIdx: Long
  ) {
    val mb = getMethodBind("AudioServer","swap_bus_effects")
    _icall_Unit_Long_Long_Long( mb, this.ptr, busIdx, effectIdx, byEffectIdx)
  }

  fun unlock() {
    val mb = getMethodBind("AudioServer","unlock")
    _icall_Unit( mb, this.ptr)
  }

  enum class SpeakerMode(
    id: Long
  ) {
    SPEAKER_MODE_STEREO(0),

    SPEAKER_SURROUND_31(1),

    SPEAKER_SURROUND_51(2),

    SPEAKER_SURROUND_71(3);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }
}
