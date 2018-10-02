@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class AudioEffectStereoEnhance : AudioEffect {
    constructor() : super("AudioEffectStereoEnhance")
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
        infix fun from(other: AudioEffect): AudioEffectStereoEnhance = AudioEffectStereoEnhance("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): AudioEffectStereoEnhance = AudioEffectStereoEnhance("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): AudioEffectStereoEnhance = AudioEffectStereoEnhance("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): AudioEffectStereoEnhance = AudioEffectStereoEnhance("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): AudioEffectStereoEnhance = fromVariant(AudioEffectStereoEnhance(""), other)


        // Constants


    }


    // Properties
    open var panPullout: Double
        get() = _icall_Double(getPanPulloutMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setPanPulloutMethodBind, this.rawMemory, value)


    open var timePulloutMs: Double
        get() = _icall_Double(getTimePulloutMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setTimePulloutMethodBind, this.rawMemory, value)


    open var surround: Double
        get() = _icall_Double(getSurroundMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setSurroundMethodBind, this.rawMemory, value)




    // Methods
    private val setPanPulloutMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectStereoEnhance", "set_pan_pullout") }
    open fun setPanPullout(amount: Double) {
        _icall_Unit_Double(setPanPulloutMethodBind, this.rawMemory, amount)
    }


    private val getPanPulloutMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectStereoEnhance", "get_pan_pullout") }
    open fun getPanPullout(): Double {
        return _icall_Double(getPanPulloutMethodBind, this.rawMemory)
    }


    private val setTimePulloutMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectStereoEnhance", "set_time_pullout") }
    open fun setTimePullout(amount: Double) {
        _icall_Unit_Double(setTimePulloutMethodBind, this.rawMemory, amount)
    }


    private val getTimePulloutMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectStereoEnhance", "get_time_pullout") }
    open fun getTimePullout(): Double {
        return _icall_Double(getTimePulloutMethodBind, this.rawMemory)
    }


    private val setSurroundMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectStereoEnhance", "set_surround") }
    open fun setSurround(amount: Double) {
        _icall_Unit_Double(setSurroundMethodBind, this.rawMemory, amount)
    }


    private val getSurroundMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectStereoEnhance", "get_surround") }
    open fun getSurround(): Double {
        return _icall_Double(getSurroundMethodBind, this.rawMemory)
    }


}
