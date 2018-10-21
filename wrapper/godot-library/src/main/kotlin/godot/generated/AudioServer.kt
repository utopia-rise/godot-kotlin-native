@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class AudioServer : Object {
    private constructor() : super("")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class SpeakerMode(val id: Long) {
        SPEAKER_MODE_STEREO(0),
        SPEAKER_SURROUND_51(2),
        SPEAKER_SURROUND_71(3),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }


    // Signals
    class Signal {
        companion object {
            const val BUS_LAYOUT_CHANGED: String = "bus_layout_changed"
        }
    }


    @ThreadLocal    companion object {
        infix fun from(other: Object): AudioServer = AudioServer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): AudioServer = fromVariant(AudioServer(""), other)


        // Constants
        const val SPEAKER_MODE_STEREO: Long = 0
        const val SPEAKER_SURROUND_51: Long = 2
        const val SPEAKER_SURROUND_71: Long = 3


        private val rawMemory: COpaquePointer by lazy { getSingleton("AudioServer", "AudioServer") }


        // Properties


        // Methods
        private val setBusCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioServer", "set_bus_count") }
        fun setBusCount(amount: Long) {
            _icall_Unit_Long(setBusCountMethodBind, this.rawMemory, amount)
        }


        private val getBusCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioServer", "get_bus_count") }
        fun getBusCount(): Long {
            return _icall_Long(getBusCountMethodBind, this.rawMemory)
        }


        private val removeBusMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioServer", "remove_bus") }
        fun removeBus(index: Long) {
            _icall_Unit_Long(removeBusMethodBind, this.rawMemory, index)
        }


        private val addBusMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioServer", "add_bus") }
        fun addBus(atPosition: Long = -1) {
            _icall_Unit_Long(addBusMethodBind, this.rawMemory, atPosition)
        }


        private val moveBusMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioServer", "move_bus") }
        fun moveBus(index: Long, toIndex: Long) {
            _icall_Unit_Long_Long(moveBusMethodBind, this.rawMemory, index, toIndex)
        }


        private val setBusNameMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioServer", "set_bus_name") }
        fun setBusName(busIdx: Long, name: String) {
            _icall_Unit_Long_String(setBusNameMethodBind, this.rawMemory, busIdx, name)
        }


        private val getBusNameMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioServer", "get_bus_name") }
        fun getBusName(busIdx: Long): String {
            return _icall_String_Long(getBusNameMethodBind, this.rawMemory, busIdx)
        }


        private val getBusIndexMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioServer", "get_bus_index") }
        fun getBusIndex(busName: String): Long {
            return _icall_Long_String(getBusIndexMethodBind, this.rawMemory, busName)
        }


        private val setBusVolumeDbMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioServer", "set_bus_volume_db") }
        fun setBusVolumeDb(busIdx: Long, volumeDb: Double) {
            _icall_Unit_Long_Double(setBusVolumeDbMethodBind, this.rawMemory, busIdx, volumeDb)
        }


        private val getBusVolumeDbMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioServer", "get_bus_volume_db") }
        fun getBusVolumeDb(busIdx: Long): Double {
            return _icall_Double_Long(getBusVolumeDbMethodBind, this.rawMemory, busIdx)
        }


        private val setBusSendMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioServer", "set_bus_send") }
        fun setBusSend(busIdx: Long, send: String) {
            _icall_Unit_Long_String(setBusSendMethodBind, this.rawMemory, busIdx, send)
        }


        private val getBusSendMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioServer", "get_bus_send") }
        fun getBusSend(busIdx: Long): String {
            return _icall_String_Long(getBusSendMethodBind, this.rawMemory, busIdx)
        }


        private val setBusSoloMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioServer", "set_bus_solo") }
        fun setBusSolo(busIdx: Long, enable: Boolean) {
            _icall_Unit_Long_Boolean(setBusSoloMethodBind, this.rawMemory, busIdx, enable)
        }


        private val isBusSoloMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioServer", "is_bus_solo") }
        fun isBusSolo(busIdx: Long): Boolean {
            return _icall_Boolean_Long(isBusSoloMethodBind, this.rawMemory, busIdx)
        }


        private val setBusMuteMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioServer", "set_bus_mute") }
        fun setBusMute(busIdx: Long, enable: Boolean) {
            _icall_Unit_Long_Boolean(setBusMuteMethodBind, this.rawMemory, busIdx, enable)
        }


        private val isBusMuteMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioServer", "is_bus_mute") }
        fun isBusMute(busIdx: Long): Boolean {
            return _icall_Boolean_Long(isBusMuteMethodBind, this.rawMemory, busIdx)
        }


        private val setBusBypassEffectsMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioServer", "set_bus_bypass_effects") }
        fun setBusBypassEffects(busIdx: Long, enable: Boolean) {
            _icall_Unit_Long_Boolean(setBusBypassEffectsMethodBind, this.rawMemory, busIdx, enable)
        }


        private val isBusBypassingEffectsMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioServer", "is_bus_bypassing_effects") }
        fun isBusBypassingEffects(busIdx: Long): Boolean {
            return _icall_Boolean_Long(isBusBypassingEffectsMethodBind, this.rawMemory, busIdx)
        }


        private val addBusEffectMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioServer", "add_bus_effect") }
        fun addBusEffect(busIdx: Long, effect: AudioEffect, atPosition: Long = -1) {
            _icall_Unit_Long_Object_Long(addBusEffectMethodBind, this.rawMemory, busIdx, effect, atPosition)
        }


        private val removeBusEffectMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioServer", "remove_bus_effect") }
        fun removeBusEffect(busIdx: Long, effectIdx: Long) {
            _icall_Unit_Long_Long(removeBusEffectMethodBind, this.rawMemory, busIdx, effectIdx)
        }


        private val getBusEffectCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioServer", "get_bus_effect_count") }
        fun getBusEffectCount(busIdx: Long): Long {
            return _icall_Long_Long(getBusEffectCountMethodBind, this.rawMemory, busIdx)
        }


        private val getBusEffectMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioServer", "get_bus_effect") }
        fun getBusEffect(busIdx: Long, effectIdx: Long): AudioEffect {
            return _icall_AudioEffect_Long_Long(getBusEffectMethodBind, this.rawMemory, busIdx, effectIdx)
        }


        private val swapBusEffectsMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioServer", "swap_bus_effects") }
        fun swapBusEffects(busIdx: Long, effectIdx: Long, byEffectIdx: Long) {
            _icall_Unit_Long_Long_Long(swapBusEffectsMethodBind, this.rawMemory, busIdx, effectIdx, byEffectIdx)
        }


        private val setBusEffectEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioServer", "set_bus_effect_enabled") }
        fun setBusEffectEnabled(busIdx: Long, effectIdx: Long, enabled: Boolean) {
            _icall_Unit_Long_Long_Boolean(setBusEffectEnabledMethodBind, this.rawMemory, busIdx, effectIdx, enabled)
        }


        private val isBusEffectEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioServer", "is_bus_effect_enabled") }
        fun isBusEffectEnabled(busIdx: Long, effectIdx: Long): Boolean {
            return _icall_Boolean_Long_Long(isBusEffectEnabledMethodBind, this.rawMemory, busIdx, effectIdx)
        }


        private val getBusPeakVolumeLeftDbMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioServer", "get_bus_peak_volume_left_db") }
        fun getBusPeakVolumeLeftDb(busIdx: Long, channel: Long): Double {
            return _icall_Double_Long_Long(getBusPeakVolumeLeftDbMethodBind, this.rawMemory, busIdx, channel)
        }


        private val getBusPeakVolumeRightDbMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioServer", "get_bus_peak_volume_right_db") }
        fun getBusPeakVolumeRightDb(busIdx: Long, channel: Long): Double {
            return _icall_Double_Long_Long(getBusPeakVolumeRightDbMethodBind, this.rawMemory, busIdx, channel)
        }


        private val lockMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioServer", "lock") }
        fun lock() {
            _icall_Unit(lockMethodBind, this.rawMemory)
        }


        private val unlockMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioServer", "unlock") }
        fun unlock() {
            _icall_Unit(unlockMethodBind, this.rawMemory)
        }


        private val getSpeakerModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioServer", "get_speaker_mode") }
        fun getSpeakerMode(): AudioServer.SpeakerMode {
            return AudioServer.SpeakerMode.fromInt(_icall_Long(getSpeakerModeMethodBind, this.rawMemory))
        }


        private val getMixRateMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioServer", "get_mix_rate") }
        fun getMixRate(): Double {
            return _icall_Double(getMixRateMethodBind, this.rawMemory)
        }


        private val getDeviceListMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioServer", "get_device_list") }
        fun getDeviceList(): GDArray {
            return _icall_GDArray(getDeviceListMethodBind, this.rawMemory)
        }


        private val getDeviceMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioServer", "get_device") }
        fun getDevice(): String {
            return _icall_String(getDeviceMethodBind, this.rawMemory)
        }


        private val setDeviceMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioServer", "set_device") }
        fun setDevice(arg0: String) {
            _icall_Unit_String(setDeviceMethodBind, this.rawMemory, arg0)
        }


        private val setBusLayoutMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioServer", "set_bus_layout") }
        fun setBusLayout(busLayout: AudioBusLayout) {
            _icall_Unit_Object(setBusLayoutMethodBind, this.rawMemory, busLayout)
        }


        private val generateBusLayoutMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioServer", "generate_bus_layout") }
        fun generateBusLayout(): AudioBusLayout {
            return _icall_AudioBusLayout(generateBusLayoutMethodBind, this.rawMemory)
        }


    }
}
