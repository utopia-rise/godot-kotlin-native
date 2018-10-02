@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
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
    open var threshold: Float
        get() = _icall_Float(getThresholdMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setThresholdMethodBind, this.rawMemory, value)


    open var ratio: Float
        get() = _icall_Float(getRatioMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setRatioMethodBind, this.rawMemory, value)


    open var gain: Float
        get() = _icall_Float(getGainMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setGainMethodBind, this.rawMemory, value)


    open var attackUs: Float
        get() = _icall_Float(getAttackUsMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setAttackUsMethodBind, this.rawMemory, value)


    open var releaseMs: Float
        get() = _icall_Float(getReleaseMsMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setReleaseMsMethodBind, this.rawMemory, value)


    open var mix: Float
        get() = _icall_Float(getMixMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setMixMethodBind, this.rawMemory, value)


    open var sidechain: String
        get() = _icall_String(getSidechainMethodBind, this.rawMemory)
        set(value) = _icall_Unit_String(setSidechainMethodBind, this.rawMemory, value)




    // Methods
    private val setThresholdMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectCompressor", "set_threshold") }
    open fun setThreshold(threshold: Float) {
        _icall_Unit_Float(setThresholdMethodBind, this.rawMemory, threshold)
    }


    private val getThresholdMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectCompressor", "get_threshold") }
    open fun getThreshold(): Float {
        return _icall_Float(getThresholdMethodBind, this.rawMemory)
    }


    private val setRatioMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectCompressor", "set_ratio") }
    open fun setRatio(ratio: Float) {
        _icall_Unit_Float(setRatioMethodBind, this.rawMemory, ratio)
    }


    private val getRatioMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectCompressor", "get_ratio") }
    open fun getRatio(): Float {
        return _icall_Float(getRatioMethodBind, this.rawMemory)
    }


    private val setGainMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectCompressor", "set_gain") }
    open fun setGain(gain: Float) {
        _icall_Unit_Float(setGainMethodBind, this.rawMemory, gain)
    }


    private val getGainMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectCompressor", "get_gain") }
    open fun getGain(): Float {
        return _icall_Float(getGainMethodBind, this.rawMemory)
    }


    private val setAttackUsMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectCompressor", "set_attack_us") }
    open fun setAttackUs(attackUs: Float) {
        _icall_Unit_Float(setAttackUsMethodBind, this.rawMemory, attackUs)
    }


    private val getAttackUsMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectCompressor", "get_attack_us") }
    open fun getAttackUs(): Float {
        return _icall_Float(getAttackUsMethodBind, this.rawMemory)
    }


    private val setReleaseMsMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectCompressor", "set_release_ms") }
    open fun setReleaseMs(releaseMs: Float) {
        _icall_Unit_Float(setReleaseMsMethodBind, this.rawMemory, releaseMs)
    }


    private val getReleaseMsMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectCompressor", "get_release_ms") }
    open fun getReleaseMs(): Float {
        return _icall_Float(getReleaseMsMethodBind, this.rawMemory)
    }


    private val setMixMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectCompressor", "set_mix") }
    open fun setMix(mix: Float) {
        _icall_Unit_Float(setMixMethodBind, this.rawMemory, mix)
    }


    private val getMixMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectCompressor", "get_mix") }
    open fun getMix(): Float {
        return _icall_Float(getMixMethodBind, this.rawMemory)
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
