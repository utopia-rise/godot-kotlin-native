@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class AudioStreamPlayer3D : Spatial {
    constructor() : super("AudioStreamPlayer3D")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class AttenuationModel(val id: Int) {
        ATTENUATION_INVERSE_DISTANCE(0),
        ATTENUATION_INVERSE_SQUARE_DISTANCE(1),
        ATTENUATION_LOGARITHMIC(2),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }
    enum class OutOfRangeMode(val id: Int) {
        OUT_OF_RANGE_MIX(0),
        OUT_OF_RANGE_PAUSE(1),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }
    enum class DopplerTracking(val id: Int) {
        DOPPLER_TRACKING_DISABLED(0),
        DOPPLER_TRACKING_IDLE_STEP(1),
        DOPPLER_TRACKING_PHYSICS_STEP(2),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }


    // Signals
    class Signal {
        companion object {
            const val FINISHED: String = "finished"
        }
    }


    companion object {
        infix fun from(other: Spatial): AudioStreamPlayer3D = AudioStreamPlayer3D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): AudioStreamPlayer3D = AudioStreamPlayer3D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): AudioStreamPlayer3D = AudioStreamPlayer3D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): AudioStreamPlayer3D = fromVariant(AudioStreamPlayer3D(""), other)


        // Constants
        const val ATTENUATION_INVERSE_DISTANCE: Int = 0
        const val ATTENUATION_INVERSE_SQUARE_DISTANCE: Int = 1
        const val ATTENUATION_LOGARITHMIC: Int = 2
        const val OUT_OF_RANGE_MIX: Int = 0
        const val OUT_OF_RANGE_PAUSE: Int = 1
        const val DOPPLER_TRACKING_DISABLED: Int = 0
        const val DOPPLER_TRACKING_IDLE_STEP: Int = 1
        const val DOPPLER_TRACKING_PHYSICS_STEP: Int = 2


    }


    // Properties
    open var stream: AudioStream
        get() = _icall_AudioStream(getStreamMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setStreamMethodBind, this.rawMemory, value)


    open var attenuationModel: Int
        get() = _icall_Int(getAttenuationModelMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setAttenuationModelMethodBind, this.rawMemory, value)


    open var unitDb: Float
        get() = _icall_Float(getUnitDbMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setUnitDbMethodBind, this.rawMemory, value)


    open var unitSize: Float
        get() = _icall_Float(getUnitSizeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setUnitSizeMethodBind, this.rawMemory, value)


    open var maxDb: Float
        get() = _icall_Float(getMaxDbMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setMaxDbMethodBind, this.rawMemory, value)


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


    open var outOfRangeMode: Int
        get() = _icall_Int(getOutOfRangeModeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setOutOfRangeModeMethodBind, this.rawMemory, value)


    open var bus: String
        get() = _icall_String(getBusMethodBind, this.rawMemory)
        set(value) = _icall_Unit_String(setBusMethodBind, this.rawMemory, value)


    open var areaMask: Int
        get() = _icall_Int(getAreaMaskMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setAreaMaskMethodBind, this.rawMemory, value)


    open var emissionAngleEnabled: Boolean
        get() = _icall_Boolean(isEmissionAngleEnabledMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setEmissionAngleEnabledMethodBind, this.rawMemory, value)


    open var emissionAngleDegrees: Float
        get() = _icall_Float(getEmissionAngleMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setEmissionAngleMethodBind, this.rawMemory, value)


    open var emissionAngleFilterAttenuationDb: Float
        get() = _icall_Float(getEmissionAngleFilterAttenuationDbMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setEmissionAngleFilterAttenuationDbMethodBind, this.rawMemory, value)


    open var attenuationFilterCutoffHz: Float
        get() = _icall_Float(getAttenuationFilterCutoffHzMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setAttenuationFilterCutoffHzMethodBind, this.rawMemory, value)


    open var attenuationFilterDb: Float
        get() = _icall_Float(getAttenuationFilterDbMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setAttenuationFilterDbMethodBind, this.rawMemory, value)


    open var dopplerTracking: Int
        get() = _icall_Int(getDopplerTrackingMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setDopplerTrackingMethodBind, this.rawMemory, value)




    // Methods
    private val setStreamMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamPlayer3D", "set_stream") }
    open fun setStream(stream: AudioStream) {
        _icall_Unit_Object(setStreamMethodBind, this.rawMemory, stream)
    }


    private val getStreamMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamPlayer3D", "get_stream") }
    open fun getStream(): AudioStream {
        return _icall_AudioStream(getStreamMethodBind, this.rawMemory)
    }


    private val setUnitDbMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamPlayer3D", "set_unit_db") }
    open fun setUnitDb(unitDb: Float) {
        _icall_Unit_Float(setUnitDbMethodBind, this.rawMemory, unitDb)
    }


    private val getUnitDbMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamPlayer3D", "get_unit_db") }
    open fun getUnitDb(): Float {
        return _icall_Float(getUnitDbMethodBind, this.rawMemory)
    }


    private val setUnitSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamPlayer3D", "set_unit_size") }
    open fun setUnitSize(unitSize: Float) {
        _icall_Unit_Float(setUnitSizeMethodBind, this.rawMemory, unitSize)
    }


    private val getUnitSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamPlayer3D", "get_unit_size") }
    open fun getUnitSize(): Float {
        return _icall_Float(getUnitSizeMethodBind, this.rawMemory)
    }


    private val setMaxDbMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamPlayer3D", "set_max_db") }
    open fun setMaxDb(maxDb: Float) {
        _icall_Unit_Float(setMaxDbMethodBind, this.rawMemory, maxDb)
    }


    private val getMaxDbMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamPlayer3D", "get_max_db") }
    open fun getMaxDb(): Float {
        return _icall_Float(getMaxDbMethodBind, this.rawMemory)
    }


    private val setPitchScaleMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamPlayer3D", "set_pitch_scale") }
    open fun setPitchScale(pitchScale: Float) {
        _icall_Unit_Float(setPitchScaleMethodBind, this.rawMemory, pitchScale)
    }


    private val getPitchScaleMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamPlayer3D", "get_pitch_scale") }
    open fun getPitchScale(): Float {
        return _icall_Float(getPitchScaleMethodBind, this.rawMemory)
    }


    private val playMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamPlayer3D", "play") }
    open fun play(fromPosition: Float = 0f) {
        _icall_Unit_Float(playMethodBind, this.rawMemory, fromPosition)
    }


    private val seekMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamPlayer3D", "seek") }
    open fun seek(toPosition: Float) {
        _icall_Unit_Float(seekMethodBind, this.rawMemory, toPosition)
    }


    private val stopMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamPlayer3D", "stop") }
    open fun stop() {
        _icall_Unit(stopMethodBind, this.rawMemory)
    }


    private val isPlayingMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamPlayer3D", "is_playing") }
    open fun isPlaying(): Boolean {
        return _icall_Boolean(isPlayingMethodBind, this.rawMemory)
    }


    private val getPlaybackPositionMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamPlayer3D", "get_playback_position") }
    open fun getPlaybackPosition(): Float {
        return _icall_Float(getPlaybackPositionMethodBind, this.rawMemory)
    }


    private val setBusMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamPlayer3D", "set_bus") }
    open fun setBus(bus: String) {
        _icall_Unit_String(setBusMethodBind, this.rawMemory, bus)
    }


    private val getBusMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamPlayer3D", "get_bus") }
    open fun getBus(): String {
        return _icall_String(getBusMethodBind, this.rawMemory)
    }


    private val setAutoplayMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamPlayer3D", "set_autoplay") }
    open fun setAutoplay(enable: Boolean) {
        _icall_Unit_Boolean(setAutoplayMethodBind, this.rawMemory, enable)
    }


    private val isAutoplayEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamPlayer3D", "is_autoplay_enabled") }
    open fun isAutoplayEnabled(): Boolean {
        return _icall_Boolean(isAutoplayEnabledMethodBind, this.rawMemory)
    }


    open fun _set_playing(enable: Boolean) {
    }


    open fun _is_active(): Boolean {
        throw NotImplementedError("_is_active is not implemented for AudioStreamPlayer3D")
    }


    private val setMaxDistanceMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamPlayer3D", "set_max_distance") }
    open fun setMaxDistance(metres: Float) {
        _icall_Unit_Float(setMaxDistanceMethodBind, this.rawMemory, metres)
    }


    private val getMaxDistanceMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamPlayer3D", "get_max_distance") }
    open fun getMaxDistance(): Float {
        return _icall_Float(getMaxDistanceMethodBind, this.rawMemory)
    }


    private val setAreaMaskMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamPlayer3D", "set_area_mask") }
    open fun setAreaMask(mask: Int) {
        _icall_Unit_Int(setAreaMaskMethodBind, this.rawMemory, mask)
    }


    private val getAreaMaskMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamPlayer3D", "get_area_mask") }
    open fun getAreaMask(): Int {
        return _icall_Int(getAreaMaskMethodBind, this.rawMemory)
    }


    private val setEmissionAngleMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamPlayer3D", "set_emission_angle") }
    open fun setEmissionAngle(degrees: Float) {
        _icall_Unit_Float(setEmissionAngleMethodBind, this.rawMemory, degrees)
    }


    private val getEmissionAngleMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamPlayer3D", "get_emission_angle") }
    open fun getEmissionAngle(): Float {
        return _icall_Float(getEmissionAngleMethodBind, this.rawMemory)
    }


    private val setEmissionAngleEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamPlayer3D", "set_emission_angle_enabled") }
    open fun setEmissionAngleEnabled(enabled: Boolean) {
        _icall_Unit_Boolean(setEmissionAngleEnabledMethodBind, this.rawMemory, enabled)
    }


    private val isEmissionAngleEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamPlayer3D", "is_emission_angle_enabled") }
    open fun isEmissionAngleEnabled(): Boolean {
        return _icall_Boolean(isEmissionAngleEnabledMethodBind, this.rawMemory)
    }


    private val setEmissionAngleFilterAttenuationDbMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamPlayer3D", "set_emission_angle_filter_attenuation_db") }
    open fun setEmissionAngleFilterAttenuationDb(db: Float) {
        _icall_Unit_Float(setEmissionAngleFilterAttenuationDbMethodBind, this.rawMemory, db)
    }


    private val getEmissionAngleFilterAttenuationDbMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamPlayer3D", "get_emission_angle_filter_attenuation_db") }
    open fun getEmissionAngleFilterAttenuationDb(): Float {
        return _icall_Float(getEmissionAngleFilterAttenuationDbMethodBind, this.rawMemory)
    }


    private val setAttenuationFilterCutoffHzMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamPlayer3D", "set_attenuation_filter_cutoff_hz") }
    open fun setAttenuationFilterCutoffHz(degrees: Float) {
        _icall_Unit_Float(setAttenuationFilterCutoffHzMethodBind, this.rawMemory, degrees)
    }


    private val getAttenuationFilterCutoffHzMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamPlayer3D", "get_attenuation_filter_cutoff_hz") }
    open fun getAttenuationFilterCutoffHz(): Float {
        return _icall_Float(getAttenuationFilterCutoffHzMethodBind, this.rawMemory)
    }


    private val setAttenuationFilterDbMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamPlayer3D", "set_attenuation_filter_db") }
    open fun setAttenuationFilterDb(db: Float) {
        _icall_Unit_Float(setAttenuationFilterDbMethodBind, this.rawMemory, db)
    }


    private val getAttenuationFilterDbMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamPlayer3D", "get_attenuation_filter_db") }
    open fun getAttenuationFilterDb(): Float {
        return _icall_Float(getAttenuationFilterDbMethodBind, this.rawMemory)
    }


    private val setAttenuationModelMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamPlayer3D", "set_attenuation_model") }
    open fun setAttenuationModel(model: Int) {
        _icall_Unit_Int(setAttenuationModelMethodBind, this.rawMemory, model)
    }


    private val getAttenuationModelMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamPlayer3D", "get_attenuation_model") }
    open fun getAttenuationModel(): AudioStreamPlayer3D.AttenuationModel {
        return AudioStreamPlayer3D.AttenuationModel.fromInt(_icall_Int(getAttenuationModelMethodBind, this.rawMemory))
    }


    private val setOutOfRangeModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamPlayer3D", "set_out_of_range_mode") }
    open fun setOutOfRangeMode(mode: Int) {
        _icall_Unit_Int(setOutOfRangeModeMethodBind, this.rawMemory, mode)
    }


    private val getOutOfRangeModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamPlayer3D", "get_out_of_range_mode") }
    open fun getOutOfRangeMode(): AudioStreamPlayer3D.OutOfRangeMode {
        return AudioStreamPlayer3D.OutOfRangeMode.fromInt(_icall_Int(getOutOfRangeModeMethodBind, this.rawMemory))
    }


    private val setDopplerTrackingMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamPlayer3D", "set_doppler_tracking") }
    open fun setDopplerTracking(mode: Int) {
        _icall_Unit_Int(setDopplerTrackingMethodBind, this.rawMemory, mode)
    }


    private val getDopplerTrackingMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamPlayer3D", "get_doppler_tracking") }
    open fun getDopplerTracking(): AudioStreamPlayer3D.DopplerTracking {
        return AudioStreamPlayer3D.DopplerTracking.fromInt(_icall_Int(getDopplerTrackingMethodBind, this.rawMemory))
    }


    private val setStreamPausedMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamPlayer3D", "set_stream_paused") }
    open fun setStreamPaused(pause: Boolean) {
        _icall_Unit_Boolean(setStreamPausedMethodBind, this.rawMemory, pause)
    }


    private val getStreamPausedMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamPlayer3D", "get_stream_paused") }
    open fun getStreamPaused(): Boolean {
        return _icall_Boolean(getStreamPausedMethodBind, this.rawMemory)
    }


    open fun _bus_layout_changed() {
    }


}
