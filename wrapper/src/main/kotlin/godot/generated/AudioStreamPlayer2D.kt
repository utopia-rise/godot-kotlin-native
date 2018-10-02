@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class AudioStreamPlayer2D : Node2D {
    constructor() : super("AudioStreamPlayer2D")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 



    // Signals
    class Signal {
        companion object {
            const val FINISHED: String = "finished"
        }
    }


    companion object {
        infix fun from(other: Node2D): AudioStreamPlayer2D = AudioStreamPlayer2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CanvasItem): AudioStreamPlayer2D = AudioStreamPlayer2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): AudioStreamPlayer2D = AudioStreamPlayer2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): AudioStreamPlayer2D = AudioStreamPlayer2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): AudioStreamPlayer2D = fromVariant(AudioStreamPlayer2D(""), other)


        // Constants


    }


    // Properties
    open var stream: AudioStream
        get() = _icall_AudioStream(getStreamMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setStreamMethodBind, this.rawMemory, value)


    open var volumeDb: Float
        get() = _icall_Float(getVolumeDbMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setVolumeDbMethodBind, this.rawMemory, value)


    open var pitchScale: Float
        get() = _icall_Float(getPitchScaleMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setPitchScaleMethodBind, this.rawMemory, value)


    open val playing: Boolean
        get() = _icall_Boolean(isPlayingMethodBind, this.rawMemory)


    open var autoplay: Boolean
        get() = _icall_Boolean(isAutoplayEnabledMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setAutoplayMethodBind, this.rawMemory, value)


    open var streamPaused: Boolean
        get() = _icall_Boolean(getStreamPausedMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setStreamPausedMethodBind, this.rawMemory, value)


    open var maxDistance: Float
        get() = _icall_Float(getMaxDistanceMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setMaxDistanceMethodBind, this.rawMemory, value)


    open var attenuation: Float
        get() = _icall_Float(getAttenuationMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setAttenuationMethodBind, this.rawMemory, value)


    open var bus: String
        get() = _icall_String(getBusMethodBind, this.rawMemory)
        set(value) = _icall_Unit_String(setBusMethodBind, this.rawMemory, value)


    open var areaMask: Int
        get() = _icall_Int(getAreaMaskMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setAreaMaskMethodBind, this.rawMemory, value)




    // Methods
    private val setStreamMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamPlayer2D", "set_stream") }
    open fun setStream(stream: AudioStream) {
        _icall_Unit_Object(setStreamMethodBind, this.rawMemory, stream)
    }


    private val getStreamMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamPlayer2D", "get_stream") }
    open fun getStream(): AudioStream {
        return _icall_AudioStream(getStreamMethodBind, this.rawMemory)
    }


    private val setVolumeDbMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamPlayer2D", "set_volume_db") }
    open fun setVolumeDb(volumeDb: Float) {
        _icall_Unit_Float(setVolumeDbMethodBind, this.rawMemory, volumeDb)
    }


    private val getVolumeDbMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamPlayer2D", "get_volume_db") }
    open fun getVolumeDb(): Float {
        return _icall_Float(getVolumeDbMethodBind, this.rawMemory)
    }


    private val setPitchScaleMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamPlayer2D", "set_pitch_scale") }
    open fun setPitchScale(pitchScale: Float) {
        _icall_Unit_Float(setPitchScaleMethodBind, this.rawMemory, pitchScale)
    }


    private val getPitchScaleMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamPlayer2D", "get_pitch_scale") }
    open fun getPitchScale(): Float {
        return _icall_Float(getPitchScaleMethodBind, this.rawMemory)
    }


    private val playMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamPlayer2D", "play") }
    open fun play(fromPosition: Float = 0f) {
        _icall_Unit_Float(playMethodBind, this.rawMemory, fromPosition)
    }


    private val seekMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamPlayer2D", "seek") }
    open fun seek(toPosition: Float) {
        _icall_Unit_Float(seekMethodBind, this.rawMemory, toPosition)
    }


    private val stopMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamPlayer2D", "stop") }
    open fun stop() {
        _icall_Unit(stopMethodBind, this.rawMemory)
    }


    private val isPlayingMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamPlayer2D", "is_playing") }
    open fun isPlaying(): Boolean {
        return _icall_Boolean(isPlayingMethodBind, this.rawMemory)
    }


    private val getPlaybackPositionMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamPlayer2D", "get_playback_position") }
    open fun getPlaybackPosition(): Float {
        return _icall_Float(getPlaybackPositionMethodBind, this.rawMemory)
    }


    private val setBusMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamPlayer2D", "set_bus") }
    open fun setBus(bus: String) {
        _icall_Unit_String(setBusMethodBind, this.rawMemory, bus)
    }


    private val getBusMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamPlayer2D", "get_bus") }
    open fun getBus(): String {
        return _icall_String(getBusMethodBind, this.rawMemory)
    }


    private val setAutoplayMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamPlayer2D", "set_autoplay") }
    open fun setAutoplay(enable: Boolean) {
        _icall_Unit_Boolean(setAutoplayMethodBind, this.rawMemory, enable)
    }


    private val isAutoplayEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamPlayer2D", "is_autoplay_enabled") }
    open fun isAutoplayEnabled(): Boolean {
        return _icall_Boolean(isAutoplayEnabledMethodBind, this.rawMemory)
    }


    open fun _set_playing(enable: Boolean) {
    }


    open fun _is_active(): Boolean {
        throw NotImplementedError("_is_active is not implemented for AudioStreamPlayer2D")
    }


    private val setMaxDistanceMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamPlayer2D", "set_max_distance") }
    open fun setMaxDistance(pixels: Float) {
        _icall_Unit_Float(setMaxDistanceMethodBind, this.rawMemory, pixels)
    }


    private val getMaxDistanceMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamPlayer2D", "get_max_distance") }
    open fun getMaxDistance(): Float {
        return _icall_Float(getMaxDistanceMethodBind, this.rawMemory)
    }


    private val setAttenuationMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamPlayer2D", "set_attenuation") }
    open fun setAttenuation(curve: Float) {
        _icall_Unit_Float(setAttenuationMethodBind, this.rawMemory, curve)
    }


    private val getAttenuationMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamPlayer2D", "get_attenuation") }
    open fun getAttenuation(): Float {
        return _icall_Float(getAttenuationMethodBind, this.rawMemory)
    }


    private val setAreaMaskMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamPlayer2D", "set_area_mask") }
    open fun setAreaMask(mask: Int) {
        _icall_Unit_Int(setAreaMaskMethodBind, this.rawMemory, mask)
    }


    private val getAreaMaskMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamPlayer2D", "get_area_mask") }
    open fun getAreaMask(): Int {
        return _icall_Int(getAreaMaskMethodBind, this.rawMemory)
    }


    private val setStreamPausedMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamPlayer2D", "set_stream_paused") }
    open fun setStreamPaused(pause: Boolean) {
        _icall_Unit_Boolean(setStreamPausedMethodBind, this.rawMemory, pause)
    }


    private val getStreamPausedMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamPlayer2D", "get_stream_paused") }
    open fun getStreamPaused(): Boolean {
        return _icall_Boolean(getStreamPausedMethodBind, this.rawMemory)
    }


    open fun _bus_layout_changed() {
    }


}
