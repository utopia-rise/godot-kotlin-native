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

    enum class LoopMode(val id: Long) {
        LOOP_DISABLED(0),
        LOOP_FORWARD(1),
        LOOP_PING_PONG(2),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class Format(val id: Long) {
        FORMAT_8_BITS(0),
        FORMAT_16_BITS(1),
        FORMAT_IMA_ADPCM(2),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
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
        const val FORMAT_8_BITS: Long = 0
        const val FORMAT_16_BITS: Long = 1
        const val FORMAT_IMA_ADPCM: Long = 2
        const val LOOP_DISABLED: Long = 0
        const val LOOP_FORWARD: Long = 1
        const val LOOP_PING_PONG: Long = 2


    }


    // Properties
    open var data: PoolByteArray
        get() = _icall_PoolByteArray(getDataMethodBind, this.rawMemory)
        set(value) = _icall_Unit_PoolByteArray(setDataMethodBind, this.rawMemory, value)


    open var format: Long
        get() = _icall_Long(getFormatMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setFormatMethodBind, this.rawMemory, value)


    open var loopMode: Long
        get() = _icall_Long(getLoopModeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setLoopModeMethodBind, this.rawMemory, value)


    open var loopBegin: Long
        get() = _icall_Long(getLoopBeginMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setLoopBeginMethodBind, this.rawMemory, value)


    open var loopEnd: Long
        get() = _icall_Long(getLoopEndMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setLoopEndMethodBind, this.rawMemory, value)


    open var mixRate: Long
        get() = _icall_Long(getMixRateMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setMixRateMethodBind, this.rawMemory, value)


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
    open fun setFormat(format: Long) {
        _icall_Unit_Long(setFormatMethodBind, this.rawMemory, format)
    }


    private val getFormatMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamSample", "get_format") }
    open fun getFormat(): AudioStreamSample.Format {
        return AudioStreamSample.Format.fromInt(_icall_Long(getFormatMethodBind, this.rawMemory))
    }


    private val setLoopModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamSample", "set_loop_mode") }
    open fun setLoopMode(loopMode: Long) {
        _icall_Unit_Long(setLoopModeMethodBind, this.rawMemory, loopMode)
    }


    private val getLoopModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamSample", "get_loop_mode") }
    open fun getLoopMode(): AudioStreamSample.LoopMode {
        return AudioStreamSample.LoopMode.fromInt(_icall_Long(getLoopModeMethodBind, this.rawMemory))
    }


    private val setLoopBeginMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamSample", "set_loop_begin") }
    open fun setLoopBegin(loopBegin: Long) {
        _icall_Unit_Long(setLoopBeginMethodBind, this.rawMemory, loopBegin)
    }


    private val getLoopBeginMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamSample", "get_loop_begin") }
    open fun getLoopBegin(): Long {
        return _icall_Long(getLoopBeginMethodBind, this.rawMemory)
    }


    private val setLoopEndMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamSample", "set_loop_end") }
    open fun setLoopEnd(loopEnd: Long) {
        _icall_Unit_Long(setLoopEndMethodBind, this.rawMemory, loopEnd)
    }


    private val getLoopEndMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamSample", "get_loop_end") }
    open fun getLoopEnd(): Long {
        return _icall_Long(getLoopEndMethodBind, this.rawMemory)
    }


    private val setMixRateMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamSample", "set_mix_rate") }
    open fun setMixRate(mixRate: Long) {
        _icall_Unit_Long(setMixRateMethodBind, this.rawMemory, mixRate)
    }


    private val getMixRateMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStreamSample", "get_mix_rate") }
    open fun getMixRate(): Long {
        return _icall_Long(getMixRateMethodBind, this.rawMemory)
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
