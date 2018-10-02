@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class AudioStreamRandomPitch : AudioStream {
    constructor() : super("AudioStreamRandomPitch")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 



    // Signals
    class Signal {
        companion object {
        }
    }


    companion object {
        infix fun from(other: AudioStream): AudioStreamRandomPitch = AudioStreamRandomPitch("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): AudioStreamRandomPitch = AudioStreamRandomPitch("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): AudioStreamRandomPitch = AudioStreamRandomPitch("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): AudioStreamRandomPitch = AudioStreamRandomPitch("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): AudioStreamRandomPitch = fromVariant(AudioStreamRandomPitch(""), other)


        // Constants


    }


    // Properties
    open var audioStream: AudioStream
        get() = _icall_AudioStream(getAudioStreamMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setAudioStreamMethodBind, this.rawMemory, value)


    open var randomPitch: Double
        get() = _icall_Double(getRandomPitchMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setRandomPitchMethodBind, this.rawMemory, value)




    // Methods
    private val setAudioStreamMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamRandomPitch", "set_audio_stream") }
    open fun setAudioStream(stream: AudioStream) {
        _icall_Unit_Object(setAudioStreamMethodBind, this.rawMemory, stream)
    }


    private val getAudioStreamMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamRandomPitch", "get_audio_stream") }
    open fun getAudioStream(): AudioStream {
        return _icall_AudioStream(getAudioStreamMethodBind, this.rawMemory)
    }


    private val setRandomPitchMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamRandomPitch", "set_random_pitch") }
    open fun setRandomPitch(scale: Double) {
        _icall_Unit_Double(setRandomPitchMethodBind, this.rawMemory, scale)
    }


    private val getRandomPitchMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamRandomPitch", "get_random_pitch") }
    open fun getRandomPitch(): Double {
        return _icall_Double(getRandomPitchMethodBind, this.rawMemory)
    }


}
