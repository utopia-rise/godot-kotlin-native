@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class AudioEffectCompressor : AudioEffect {
    constructor() : super("AudioEffectCompressor")
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
        infix fun from(other: AudioEffect): AudioEffectCompressor = AudioEffectCompressor("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): AudioEffectCompressor = AudioEffectCompressor("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): AudioEffectCompressor = AudioEffectCompressor("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): AudioEffectCompressor = AudioEffectCompressor("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): AudioEffectCompressor = fromVariant(AudioEffectCompressor(""), other)


        // Constants


    }


    // Properties
    open var threshold: Double
        get() = _icall_Double(getThresholdMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setThresholdMethodBind, this.rawMemory, value)


    open var ratio: Double
        get() = _icall_Double(getRatioMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setRatioMethodBind, this.rawMemory, value)


    open var gain: Double
        get() = _icall_Double(getGainMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setGainMethodBind, this.rawMemory, value)


    open var attackUs: Double
        get() = _icall_Double(getAttackUsMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setAttackUsMethodBind, this.rawMemory, value)


    open var releaseMs: Double
        get() = _icall_Double(getReleaseMsMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setReleaseMsMethodBind, this.rawMemory, value)


    open var mix: Double
        get() = _icall_Double(getMixMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setMixMethodBind, this.rawMemory, value)


    open var sidechain: String
        get() = _icall_String(getSidechainMethodBind, this.rawMemory)
        set(value) = _icall_Unit_String(setSidechainMethodBind, this.rawMemory, value)




    // Methods
    private val setThresholdMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectCompressor", "set_threshold") }
    open fun setThreshold(threshold: Double) {
        _icall_Unit_Double(setThresholdMethodBind, this.rawMemory, threshold)
    }


    private val getThresholdMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectCompressor", "get_threshold") }
    open fun getThreshold(): Double {
        return _icall_Double(getThresholdMethodBind, this.rawMemory)
    }


    private val setRatioMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectCompressor", "set_ratio") }
    open fun setRatio(ratio: Double) {
        _icall_Unit_Double(setRatioMethodBind, this.rawMemory, ratio)
    }


    private val getRatioMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectCompressor", "get_ratio") }
    open fun getRatio(): Double {
        return _icall_Double(getRatioMethodBind, this.rawMemory)
    }


    private val setGainMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectCompressor", "set_gain") }
    open fun setGain(gain: Double) {
        _icall_Unit_Double(setGainMethodBind, this.rawMemory, gain)
    }


    private val getGainMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectCompressor", "get_gain") }
    open fun getGain(): Double {
        return _icall_Double(getGainMethodBind, this.rawMemory)
    }


    private val setAttackUsMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectCompressor", "set_attack_us") }
    open fun setAttackUs(attackUs: Double) {
        _icall_Unit_Double(setAttackUsMethodBind, this.rawMemory, attackUs)
    }


    private val getAttackUsMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectCompressor", "get_attack_us") }
    open fun getAttackUs(): Double {
        return _icall_Double(getAttackUsMethodBind, this.rawMemory)
    }


    private val setReleaseMsMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectCompressor", "set_release_ms") }
    open fun setReleaseMs(releaseMs: Double) {
        _icall_Unit_Double(setReleaseMsMethodBind, this.rawMemory, releaseMs)
    }


    private val getReleaseMsMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectCompressor", "get_release_ms") }
    open fun getReleaseMs(): Double {
        return _icall_Double(getReleaseMsMethodBind, this.rawMemory)
    }


    private val setMixMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectCompressor", "set_mix") }
    open fun setMix(mix: Double) {
        _icall_Unit_Double(setMixMethodBind, this.rawMemory, mix)
    }


    private val getMixMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectCompressor", "get_mix") }
    open fun getMix(): Double {
        return _icall_Double(getMixMethodBind, this.rawMemory)
    }


    private val setSidechainMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectCompressor", "set_sidechain") }
    open fun setSidechain(sidechain: String) {
        _icall_Unit_String(setSidechainMethodBind, this.rawMemory, sidechain)
    }


    private val getSidechainMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectCompressor", "get_sidechain") }
    open fun getSidechain(): String {
        return _icall_String(getSidechainMethodBind, this.rawMemory)
    }


}
