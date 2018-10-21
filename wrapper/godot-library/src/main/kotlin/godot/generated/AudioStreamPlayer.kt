@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class AudioStreamPlayer : Node {
    constructor() : super("AudioStreamPlayer")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class MixTarget(val id: Long) {
        MIX_TARGET_STEREO(0),
        MIX_TARGET_SURROUND(1),
        MIX_TARGET_CENTER(2),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }


    // Signals
    class Signal {
        companion object {
            const val FINISHED: String = "finished"
        }
    }


    companion object {
        infix fun from(other: Node): AudioStreamPlayer = AudioStreamPlayer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): AudioStreamPlayer = AudioStreamPlayer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): AudioStreamPlayer = fromVariant(AudioStreamPlayer(""), other)


        // Constants
        const val MIX_TARGET_STEREO: Long = 0
        const val MIX_TARGET_SURROUND: Long = 1
        const val MIX_TARGET_CENTER: Long = 2


    }


    // Properties
    open var stream: AudioStream
        get() = _icall_AudioStream(getStreamMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setStreamMethodBind, this.rawMemory, value)


    open var volumeDb: Double
        get() = _icall_Double(getVolumeDbMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setVolumeDbMethodBind, this.rawMemory, value)


    open var pitchScale: Double
        get() = _icall_Double(getPitchScaleMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setPitchScaleMethodBind, this.rawMemory, value)


    open val playing: Boolean
        get() = _icall_Boolean(isPlayingMethodBind, this.rawMemory)


    open var autoplay: Boolean
        get() = _icall_Boolean(isAutoplayEnabledMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setAutoplayMethodBind, this.rawMemory, value)


    open var streamPaused: Boolean
        get() = _icall_Boolean(getStreamPausedMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setStreamPausedMethodBind, this.rawMemory, value)


    open var mixTarget: Long
        get() = _icall_Long(getMixTargetMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setMixTargetMethodBind, this.rawMemory, value)


    open var bus: String
        get() = _icall_String(getBusMethodBind, this.rawMemory)
        set(value) = _icall_Unit_String(setBusMethodBind, this.rawMemory, value)




    // Methods
    private val setStreamMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamPlayer", "set_stream") }
    open fun setStream(stream: AudioStream) {
        _icall_Unit_Object(setStreamMethodBind, this.rawMemory, stream)
    }


    private val getStreamMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamPlayer", "get_stream") }
    open fun getStream(): AudioStream {
        return _icall_AudioStream(getStreamMethodBind, this.rawMemory)
    }


    private val setVolumeDbMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamPlayer", "set_volume_db") }
    open fun setVolumeDb(volumeDb: Double) {
        _icall_Unit_Double(setVolumeDbMethodBind, this.rawMemory, volumeDb)
    }


    private val getVolumeDbMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamPlayer", "get_volume_db") }
    open fun getVolumeDb(): Double {
        return _icall_Double(getVolumeDbMethodBind, this.rawMemory)
    }


    private val setPitchScaleMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamPlayer", "set_pitch_scale") }
    open fun setPitchScale(pitchScale: Double) {
        _icall_Unit_Double(setPitchScaleMethodBind, this.rawMemory, pitchScale)
    }


    private val getPitchScaleMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamPlayer", "get_pitch_scale") }
    open fun getPitchScale(): Double {
        return _icall_Double(getPitchScaleMethodBind, this.rawMemory)
    }


    private val playMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamPlayer", "play") }
    open fun play(fromPosition: Double = 0.0) {
        _icall_Unit_Double(playMethodBind, this.rawMemory, fromPosition)
    }


    private val seekMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamPlayer", "seek") }
    open fun seek(toPosition: Double) {
        _icall_Unit_Double(seekMethodBind, this.rawMemory, toPosition)
    }


    private val stopMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamPlayer", "stop") }
    open fun stop() {
        _icall_Unit(stopMethodBind, this.rawMemory)
    }


    private val isPlayingMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamPlayer", "is_playing") }
    open fun isPlaying(): Boolean {
        return _icall_Boolean(isPlayingMethodBind, this.rawMemory)
    }


    private val getPlaybackPositionMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamPlayer", "get_playback_position") }
    open fun getPlaybackPosition(): Double {
        return _icall_Double(getPlaybackPositionMethodBind, this.rawMemory)
    }


    private val setBusMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamPlayer", "set_bus") }
    open fun setBus(bus: String) {
        _icall_Unit_String(setBusMethodBind, this.rawMemory, bus)
    }


    private val getBusMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamPlayer", "get_bus") }
    open fun getBus(): String {
        return _icall_String(getBusMethodBind, this.rawMemory)
    }


    private val setAutoplayMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamPlayer", "set_autoplay") }
    open fun setAutoplay(enable: Boolean) {
        _icall_Unit_Boolean(setAutoplayMethodBind, this.rawMemory, enable)
    }


    private val isAutoplayEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamPlayer", "is_autoplay_enabled") }
    open fun isAutoplayEnabled(): Boolean {
        return _icall_Boolean(isAutoplayEnabledMethodBind, this.rawMemory)
    }


    private val setMixTargetMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamPlayer", "set_mix_target") }
    open fun setMixTarget(mixTarget: Long) {
        _icall_Unit_Long(setMixTargetMethodBind, this.rawMemory, mixTarget)
    }


    private val getMixTargetMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamPlayer", "get_mix_target") }
    open fun getMixTarget(): AudioStreamPlayer.MixTarget {
        return AudioStreamPlayer.MixTarget.fromInt(_icall_Long(getMixTargetMethodBind, this.rawMemory))
    }


    open fun _set_playing(enable: Boolean) {
    }


    open fun _is_active(): Boolean {
        throw NotImplementedError("_is_active is not implemented for AudioStreamPlayer")
    }


    open fun _bus_layout_changed() {
    }


    private val setStreamPausedMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamPlayer", "set_stream_paused") }
    open fun setStreamPaused(pause: Boolean) {
        _icall_Unit_Boolean(setStreamPausedMethodBind, this.rawMemory, pause)
    }


    private val getStreamPausedMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamPlayer", "get_stream_paused") }
    open fun getStreamPaused(): Boolean {
        return _icall_Boolean(getStreamPausedMethodBind, this.rawMemory)
    }


}
