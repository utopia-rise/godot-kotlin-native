@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class AudioStreamSample : AudioStream {
    constructor() : super("AudioStreamSample")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class LoopMode(val id: Int) {
        LOOP_DISABLED(0),
        LOOP_FORWARD(1),
        LOOP_PING_PONG(2),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }
    enum class Format(val id: Int) {
        FORMAT_8_BITS(0),
        FORMAT_16_BITS(1),
        FORMAT_IMA_ADPCM(2),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }


    // Signals
    class Signal {
        companion object {
        }
    }


    companion object {
        infix fun from(other: AudioStream): AudioStreamSample = AudioStreamSample("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): AudioStreamSample = AudioStreamSample("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): AudioStreamSample = AudioStreamSample("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): AudioStreamSample = AudioStreamSample("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): AudioStreamSample = fromVariant(AudioStreamSample(""), other)


        // Constants
        const val FORMAT_8_BITS: Int = 0
        const val FORMAT_16_BITS: Int = 1
        const val FORMAT_IMA_ADPCM: Int = 2
        const val LOOP_DISABLED: Int = 0
        const val LOOP_FORWARD: Int = 1
        const val LOOP_PING_PONG: Int = 2


    }


    // Properties
    open var data: PoolByteArray
        get() = _icall_PoolByteArray(getDataMethodBind, this.rawMemory)
        set(value) = _icall_Unit_PoolByteArray(setDataMethodBind, this.rawMemory, value)


    open var format: Int
        get() = _icall_Int(getFormatMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setFormatMethodBind, this.rawMemory, value)


    open var loopMode: Int
        get() = _icall_Int(getLoopModeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setLoopModeMethodBind, this.rawMemory, value)


    open var loopBegin: Int
        get() = _icall_Int(getLoopBeginMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setLoopBeginMethodBind, this.rawMemory, value)


    open var loopEnd: Int
        get() = _icall_Int(getLoopEndMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setLoopEndMethodBind, this.rawMemory, value)


    open var mixRate: Int
        get() = _icall_Int(getMixRateMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setMixRateMethodBind, this.rawMemory, value)


    open var stereo: Boolean
        get() = _icall_Boolean(isStereoMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setStereoMethodBind, this.rawMemory, value)




    // Methods
    private val setDataMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamSample", "set_data") }
    open fun setData(data: PoolByteArray) {
        _icall_Unit_PoolByteArray(setDataMethodBind, this.rawMemory, data)
    }


    private val getDataMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamSample", "get_data") }
    open fun getData(): PoolByteArray {
        return _icall_PoolByteArray(getDataMethodBind, this.rawMemory)
    }


    private val setFormatMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamSample", "set_format") }
    open fun setFormat(format: Int) {
        _icall_Unit_Int(setFormatMethodBind, this.rawMemory, format)
    }


    private val getFormatMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamSample", "get_format") }
    open fun getFormat(): AudioStreamSample.Format {
        return AudioStreamSample.Format.fromInt(_icall_Int(getFormatMethodBind, this.rawMemory))
    }


    private val setLoopModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamSample", "set_loop_mode") }
    open fun setLoopMode(loopMode: Int) {
        _icall_Unit_Int(setLoopModeMethodBind, this.rawMemory, loopMode)
    }


    private val getLoopModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamSample", "get_loop_mode") }
    open fun getLoopMode(): AudioStreamSample.LoopMode {
        return AudioStreamSample.LoopMode.fromInt(_icall_Int(getLoopModeMethodBind, this.rawMemory))
    }


    private val setLoopBeginMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamSample", "set_loop_begin") }
    open fun setLoopBegin(loopBegin: Int) {
        _icall_Unit_Int(setLoopBeginMethodBind, this.rawMemory, loopBegin)
    }


    private val getLoopBeginMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamSample", "get_loop_begin") }
    open fun getLoopBegin(): Int {
        return _icall_Int(getLoopBeginMethodBind, this.rawMemory)
    }


    private val setLoopEndMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamSample", "set_loop_end") }
    open fun setLoopEnd(loopEnd: Int) {
        _icall_Unit_Int(setLoopEndMethodBind, this.rawMemory, loopEnd)
    }


    private val getLoopEndMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamSample", "get_loop_end") }
    open fun getLoopEnd(): Int {
        return _icall_Int(getLoopEndMethodBind, this.rawMemory)
    }


    private val setMixRateMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamSample", "set_mix_rate") }
    open fun setMixRate(mixRate: Int) {
        _icall_Unit_Int(setMixRateMethodBind, this.rawMemory, mixRate)
    }


    private val getMixRateMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamSample", "get_mix_rate") }
    open fun getMixRate(): Int {
        return _icall_Int(getMixRateMethodBind, this.rawMemory)
    }


    private val setStereoMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamSample", "set_stereo") }
    open fun setStereo(stereo: Boolean) {
        _icall_Unit_Boolean(setStereoMethodBind, this.rawMemory, stereo)
    }


    private val isStereoMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamSample", "is_stereo") }
    open fun isStereo(): Boolean {
        return _icall_Boolean(isStereoMethodBind, this.rawMemory)
    }


}
