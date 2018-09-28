@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class VideoPlayer : Control {
    constructor() : super("VideoPlayer")
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
        infix fun from(other: Control): VideoPlayer = VideoPlayer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CanvasItem): VideoPlayer = VideoPlayer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): VideoPlayer = VideoPlayer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): VideoPlayer = VideoPlayer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): VideoPlayer = fromVariant(VideoPlayer(""), other)


        // Constants


    }


    // Properties
    open var audioTrack: Int
        get() = _icall_Int(getAudioTrackMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setAudioTrackMethodBind, this.rawMemory, value)


    open var stream: VideoStream
        get() = _icall_VideoStream(getStreamMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setStreamMethodBind, this.rawMemory, value)


    open var volumeDb: Float
        get() = _icall_Float(getVolumeDbMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setVolumeDbMethodBind, this.rawMemory, value)


    open var volume: Float
        get() = _icall_Float(getVolumeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setVolumeMethodBind, this.rawMemory, value)


    open var autoplay: Boolean
        get() = _icall_Boolean(hasAutoplayMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setAutoplayMethodBind, this.rawMemory, value)


    open var paused: Boolean
        get() = _icall_Boolean(isPausedMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setPausedMethodBind, this.rawMemory, value)


    open var expand: Boolean
        get() = _icall_Boolean(hasExpandMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setExpandMethodBind, this.rawMemory, value)


    open var bufferingMsec: Int
        get() = _icall_Int(getBufferingMsecMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setBufferingMsecMethodBind, this.rawMemory, value)


    open var streamPosition: Float
        get() = _icall_Float(getStreamPositionMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setStreamPositionMethodBind, this.rawMemory, value)


    open var bus: String
        get() = _icall_String(getBusMethodBind, this.rawMemory)
        set(value) = _icall_Unit_String(setBusMethodBind, this.rawMemory, value)




    // Methods
    private val setStreamMethodBind: CPointer<godot_method_bind> by lazy { getMB("VideoPlayer", "set_stream") }
    open fun setStream(stream: VideoStream) {
        _icall_Unit_Object(setStreamMethodBind, this.rawMemory, stream)
    }


    private val getStreamMethodBind: CPointer<godot_method_bind> by lazy { getMB("VideoPlayer", "get_stream") }
    open fun getStream(): VideoStream {
        return _icall_VideoStream(getStreamMethodBind, this.rawMemory)
    }


    private val playMethodBind: CPointer<godot_method_bind> by lazy { getMB("VideoPlayer", "play") }
    open fun play() {
        _icall_Unit(playMethodBind, this.rawMemory)
    }


    private val stopMethodBind: CPointer<godot_method_bind> by lazy { getMB("VideoPlayer", "stop") }
    open fun stop() {
        _icall_Unit(stopMethodBind, this.rawMemory)
    }


    private val isPlayingMethodBind: CPointer<godot_method_bind> by lazy { getMB("VideoPlayer", "is_playing") }
    open fun isPlaying(): Boolean {
        return _icall_Boolean(isPlayingMethodBind, this.rawMemory)
    }


    private val setPausedMethodBind: CPointer<godot_method_bind> by lazy { getMB("VideoPlayer", "set_paused") }
    open fun setPaused(paused: Boolean) {
        _icall_Unit_Boolean(setPausedMethodBind, this.rawMemory, paused)
    }


    private val isPausedMethodBind: CPointer<godot_method_bind> by lazy { getMB("VideoPlayer", "is_paused") }
    open fun isPaused(): Boolean {
        return _icall_Boolean(isPausedMethodBind, this.rawMemory)
    }


    private val setVolumeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VideoPlayer", "set_volume") }
    open fun setVolume(volume: Float) {
        _icall_Unit_Float(setVolumeMethodBind, this.rawMemory, volume)
    }


    private val getVolumeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VideoPlayer", "get_volume") }
    open fun getVolume(): Float {
        return _icall_Float(getVolumeMethodBind, this.rawMemory)
    }


    private val setVolumeDbMethodBind: CPointer<godot_method_bind> by lazy { getMB("VideoPlayer", "set_volume_db") }
    open fun setVolumeDb(db: Float) {
        _icall_Unit_Float(setVolumeDbMethodBind, this.rawMemory, db)
    }


    private val getVolumeDbMethodBind: CPointer<godot_method_bind> by lazy { getMB("VideoPlayer", "get_volume_db") }
    open fun getVolumeDb(): Float {
        return _icall_Float(getVolumeDbMethodBind, this.rawMemory)
    }


    private val setAudioTrackMethodBind: CPointer<godot_method_bind> by lazy { getMB("VideoPlayer", "set_audio_track") }
    open fun setAudioTrack(track: Int) {
        _icall_Unit_Int(setAudioTrackMethodBind, this.rawMemory, track)
    }


    private val getAudioTrackMethodBind: CPointer<godot_method_bind> by lazy { getMB("VideoPlayer", "get_audio_track") }
    open fun getAudioTrack(): Int {
        return _icall_Int(getAudioTrackMethodBind, this.rawMemory)
    }


    private val getStreamNameMethodBind: CPointer<godot_method_bind> by lazy { getMB("VideoPlayer", "get_stream_name") }
    open fun getStreamName(): String {
        return _icall_String(getStreamNameMethodBind, this.rawMemory)
    }


    private val setStreamPositionMethodBind: CPointer<godot_method_bind> by lazy { getMB("VideoPlayer", "set_stream_position") }
    open fun setStreamPosition(position: Float) {
        _icall_Unit_Float(setStreamPositionMethodBind, this.rawMemory, position)
    }


    private val getStreamPositionMethodBind: CPointer<godot_method_bind> by lazy { getMB("VideoPlayer", "get_stream_position") }
    open fun getStreamPosition(): Float {
        return _icall_Float(getStreamPositionMethodBind, this.rawMemory)
    }


    private val setAutoplayMethodBind: CPointer<godot_method_bind> by lazy { getMB("VideoPlayer", "set_autoplay") }
    open fun setAutoplay(enabled: Boolean) {
        _icall_Unit_Boolean(setAutoplayMethodBind, this.rawMemory, enabled)
    }


    private val hasAutoplayMethodBind: CPointer<godot_method_bind> by lazy { getMB("VideoPlayer", "has_autoplay") }
    open fun hasAutoplay(): Boolean {
        return _icall_Boolean(hasAutoplayMethodBind, this.rawMemory)
    }


    private val setExpandMethodBind: CPointer<godot_method_bind> by lazy { getMB("VideoPlayer", "set_expand") }
    open fun setExpand(enable: Boolean) {
        _icall_Unit_Boolean(setExpandMethodBind, this.rawMemory, enable)
    }


    private val hasExpandMethodBind: CPointer<godot_method_bind> by lazy { getMB("VideoPlayer", "has_expand") }
    open fun hasExpand(): Boolean {
        return _icall_Boolean(hasExpandMethodBind, this.rawMemory)
    }


    private val setBufferingMsecMethodBind: CPointer<godot_method_bind> by lazy { getMB("VideoPlayer", "set_buffering_msec") }
    open fun setBufferingMsec(msec: Int) {
        _icall_Unit_Int(setBufferingMsecMethodBind, this.rawMemory, msec)
    }


    private val getBufferingMsecMethodBind: CPointer<godot_method_bind> by lazy { getMB("VideoPlayer", "get_buffering_msec") }
    open fun getBufferingMsec(): Int {
        return _icall_Int(getBufferingMsecMethodBind, this.rawMemory)
    }


    private val setBusMethodBind: CPointer<godot_method_bind> by lazy { getMB("VideoPlayer", "set_bus") }
    open fun setBus(bus: String) {
        _icall_Unit_String(setBusMethodBind, this.rawMemory, bus)
    }


    private val getBusMethodBind: CPointer<godot_method_bind> by lazy { getMB("VideoPlayer", "get_bus") }
    open fun getBus(): String {
        return _icall_String(getBusMethodBind, this.rawMemory)
    }


    private val getVideoTextureMethodBind: CPointer<godot_method_bind> by lazy { getMB("VideoPlayer", "get_video_texture") }
    open fun getVideoTexture(): Texture {
        return _icall_Texture(getVideoTextureMethodBind, this.rawMemory)
    }


}
