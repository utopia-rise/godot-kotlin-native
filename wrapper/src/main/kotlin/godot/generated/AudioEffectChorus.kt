@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class AudioEffectChorus : AudioEffect {
    constructor() : super("AudioEffectChorus")
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
        infix fun from(other: AudioEffect): AudioEffectChorus = AudioEffectChorus("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): AudioEffectChorus = AudioEffectChorus("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): AudioEffectChorus = AudioEffectChorus("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): AudioEffectChorus = AudioEffectChorus("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): AudioEffectChorus = fromVariant(AudioEffectChorus(""), other)


        // Constants


    }


    // Properties
    open var voiceCount: Long
        get() = _icall_Long(getVoiceCountMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setVoiceCountMethodBind, this.rawMemory, value)


    open var dry: Double
        get() = _icall_Double(getDryMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setDryMethodBind, this.rawMemory, value)


    open var wet: Double
        get() = _icall_Double(getWetMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setWetMethodBind, this.rawMemory, value)


    open var voice_1_delayMs: Double
        get() = _icall_Double_Long(getVoiceDelayMsMethodBind, this.rawMemory, 0)
        set(value) = _icall_Unit_Long_Double(setVoiceDelayMsMethodBind, this.rawMemory, 0, value)


    open var voice_1_rateHz: Double
        get() = _icall_Double_Long(getVoiceRateHzMethodBind, this.rawMemory, 0)
        set(value) = _icall_Unit_Long_Double(setVoiceRateHzMethodBind, this.rawMemory, 0, value)


    open var voice_1_depthMs: Double
        get() = _icall_Double_Long(getVoiceDepthMsMethodBind, this.rawMemory, 0)
        set(value) = _icall_Unit_Long_Double(setVoiceDepthMsMethodBind, this.rawMemory, 0, value)


    open var voice_1_levelDb: Double
        get() = _icall_Double_Long(getVoiceLevelDbMethodBind, this.rawMemory, 0)
        set(value) = _icall_Unit_Long_Double(setVoiceLevelDbMethodBind, this.rawMemory, 0, value)


    open var voice_1_cutoffHz: Double
        get() = _icall_Double_Long(getVoiceCutoffHzMethodBind, this.rawMemory, 0)
        set(value) = _icall_Unit_Long_Double(setVoiceCutoffHzMethodBind, this.rawMemory, 0, value)


    open var voice_1_pan: Double
        get() = _icall_Double_Long(getVoicePanMethodBind, this.rawMemory, 0)
        set(value) = _icall_Unit_Long_Double(setVoicePanMethodBind, this.rawMemory, 0, value)


    open var voice_2_delayMs: Double
        get() = _icall_Double_Long(getVoiceDelayMsMethodBind, this.rawMemory, 1)
        set(value) = _icall_Unit_Long_Double(setVoiceDelayMsMethodBind, this.rawMemory, 1, value)


    open var voice_2_rateHz: Double
        get() = _icall_Double_Long(getVoiceRateHzMethodBind, this.rawMemory, 1)
        set(value) = _icall_Unit_Long_Double(setVoiceRateHzMethodBind, this.rawMemory, 1, value)


    open var voice_2_depthMs: Double
        get() = _icall_Double_Long(getVoiceDepthMsMethodBind, this.rawMemory, 1)
        set(value) = _icall_Unit_Long_Double(setVoiceDepthMsMethodBind, this.rawMemory, 1, value)


    open var voice_2_levelDb: Double
        get() = _icall_Double_Long(getVoiceLevelDbMethodBind, this.rawMemory, 1)
        set(value) = _icall_Unit_Long_Double(setVoiceLevelDbMethodBind, this.rawMemory, 1, value)


    open var voice_2_cutoffHz: Double
        get() = _icall_Double_Long(getVoiceCutoffHzMethodBind, this.rawMemory, 1)
        set(value) = _icall_Unit_Long_Double(setVoiceCutoffHzMethodBind, this.rawMemory, 1, value)


    open var voice_2_pan: Double
        get() = _icall_Double_Long(getVoicePanMethodBind, this.rawMemory, 1)
        set(value) = _icall_Unit_Long_Double(setVoicePanMethodBind, this.rawMemory, 1, value)


    open var voice_3_delayMs: Double
        get() = _icall_Double_Long(getVoiceDelayMsMethodBind, this.rawMemory, 2)
        set(value) = _icall_Unit_Long_Double(setVoiceDelayMsMethodBind, this.rawMemory, 2, value)


    open var voice_3_rateHz: Double
        get() = _icall_Double_Long(getVoiceRateHzMethodBind, this.rawMemory, 2)
        set(value) = _icall_Unit_Long_Double(setVoiceRateHzMethodBind, this.rawMemory, 2, value)


    open var voice_3_depthMs: Double
        get() = _icall_Double_Long(getVoiceDepthMsMethodBind, this.rawMemory, 2)
        set(value) = _icall_Unit_Long_Double(setVoiceDepthMsMethodBind, this.rawMemory, 2, value)


    open var voice_3_levelDb: Double
        get() = _icall_Double_Long(getVoiceLevelDbMethodBind, this.rawMemory, 2)
        set(value) = _icall_Unit_Long_Double(setVoiceLevelDbMethodBind, this.rawMemory, 2, value)


    open var voice_3_cutoffHz: Double
        get() = _icall_Double_Long(getVoiceCutoffHzMethodBind, this.rawMemory, 2)
        set(value) = _icall_Unit_Long_Double(setVoiceCutoffHzMethodBind, this.rawMemory, 2, value)


    open var voice_3_pan: Double
        get() = _icall_Double_Long(getVoicePanMethodBind, this.rawMemory, 2)
        set(value) = _icall_Unit_Long_Double(setVoicePanMethodBind, this.rawMemory, 2, value)


    open var voice_4_delayMs: Double
        get() = _icall_Double_Long(getVoiceDelayMsMethodBind, this.rawMemory, 3)
        set(value) = _icall_Unit_Long_Double(setVoiceDelayMsMethodBind, this.rawMemory, 3, value)


    open var voice_4_rateHz: Double
        get() = _icall_Double_Long(getVoiceRateHzMethodBind, this.rawMemory, 3)
        set(value) = _icall_Unit_Long_Double(setVoiceRateHzMethodBind, this.rawMemory, 3, value)


    open var voice_4_depthMs: Double
        get() = _icall_Double_Long(getVoiceDepthMsMethodBind, this.rawMemory, 3)
        set(value) = _icall_Unit_Long_Double(setVoiceDepthMsMethodBind, this.rawMemory, 3, value)


    open var voice_4_levelDb: Double
        get() = _icall_Double_Long(getVoiceLevelDbMethodBind, this.rawMemory, 3)
        set(value) = _icall_Unit_Long_Double(setVoiceLevelDbMethodBind, this.rawMemory, 3, value)


    open var voice_4_cutoffHz: Double
        get() = _icall_Double_Long(getVoiceCutoffHzMethodBind, this.rawMemory, 3)
        set(value) = _icall_Unit_Long_Double(setVoiceCutoffHzMethodBind, this.rawMemory, 3, value)


    open var voice_4_pan: Double
        get() = _icall_Double_Long(getVoicePanMethodBind, this.rawMemory, 3)
        set(value) = _icall_Unit_Long_Double(setVoicePanMethodBind, this.rawMemory, 3, value)




    // Methods
    private val setVoiceCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectChorus", "set_voice_count") }
    open fun setVoiceCount(voices: Long) {
        _icall_Unit_Long(setVoiceCountMethodBind, this.rawMemory, voices)
    }


    private val getVoiceCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectChorus", "get_voice_count") }
    open fun getVoiceCount(): Long {
        return _icall_Long(getVoiceCountMethodBind, this.rawMemory)
    }


    private val setVoiceDelayMsMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectChorus", "set_voice_delay_ms") }
    open fun setVoiceDelayMs(voiceIdx: Long, delayMs: Double) {
        _icall_Unit_Long_Double(setVoiceDelayMsMethodBind, this.rawMemory, voiceIdx, delayMs)
    }


    private val getVoiceDelayMsMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectChorus", "get_voice_delay_ms") }
    open fun getVoiceDelayMs(voiceIdx: Long): Double {
        return _icall_Double_Long(getVoiceDelayMsMethodBind, this.rawMemory, voiceIdx)
    }


    private val setVoiceRateHzMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectChorus", "set_voice_rate_hz") }
    open fun setVoiceRateHz(voiceIdx: Long, rateHz: Double) {
        _icall_Unit_Long_Double(setVoiceRateHzMethodBind, this.rawMemory, voiceIdx, rateHz)
    }


    private val getVoiceRateHzMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectChorus", "get_voice_rate_hz") }
    open fun getVoiceRateHz(voiceIdx: Long): Double {
        return _icall_Double_Long(getVoiceRateHzMethodBind, this.rawMemory, voiceIdx)
    }


    private val setVoiceDepthMsMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectChorus", "set_voice_depth_ms") }
    open fun setVoiceDepthMs(voiceIdx: Long, depthMs: Double) {
        _icall_Unit_Long_Double(setVoiceDepthMsMethodBind, this.rawMemory, voiceIdx, depthMs)
    }


    private val getVoiceDepthMsMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectChorus", "get_voice_depth_ms") }
    open fun getVoiceDepthMs(voiceIdx: Long): Double {
        return _icall_Double_Long(getVoiceDepthMsMethodBind, this.rawMemory, voiceIdx)
    }


    private val setVoiceLevelDbMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectChorus", "set_voice_level_db") }
    open fun setVoiceLevelDb(voiceIdx: Long, levelDb: Double) {
        _icall_Unit_Long_Double(setVoiceLevelDbMethodBind, this.rawMemory, voiceIdx, levelDb)
    }


    private val getVoiceLevelDbMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectChorus", "get_voice_level_db") }
    open fun getVoiceLevelDb(voiceIdx: Long): Double {
        return _icall_Double_Long(getVoiceLevelDbMethodBind, this.rawMemory, voiceIdx)
    }


    private val setVoiceCutoffHzMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectChorus", "set_voice_cutoff_hz") }
    open fun setVoiceCutoffHz(voiceIdx: Long, cutoffHz: Double) {
        _icall_Unit_Long_Double(setVoiceCutoffHzMethodBind, this.rawMemory, voiceIdx, cutoffHz)
    }


    private val getVoiceCutoffHzMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectChorus", "get_voice_cutoff_hz") }
    open fun getVoiceCutoffHz(voiceIdx: Long): Double {
        return _icall_Double_Long(getVoiceCutoffHzMethodBind, this.rawMemory, voiceIdx)
    }


    private val setVoicePanMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectChorus", "set_voice_pan") }
    open fun setVoicePan(voiceIdx: Long, pan: Double) {
        _icall_Unit_Long_Double(setVoicePanMethodBind, this.rawMemory, voiceIdx, pan)
    }


    private val getVoicePanMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectChorus", "get_voice_pan") }
    open fun getVoicePan(voiceIdx: Long): Double {
        return _icall_Double_Long(getVoicePanMethodBind, this.rawMemory, voiceIdx)
    }


    private val setWetMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectChorus", "set_wet") }
    open fun setWet(amount: Double) {
        _icall_Unit_Double(setWetMethodBind, this.rawMemory, amount)
    }


    private val getWetMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectChorus", "get_wet") }
    open fun getWet(): Double {
        return _icall_Double(getWetMethodBind, this.rawMemory)
    }


    private val setDryMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectChorus", "set_dry") }
    open fun setDry(amount: Double) {
        _icall_Unit_Double(setDryMethodBind, this.rawMemory, amount)
    }


    private val getDryMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectChorus", "get_dry") }
    open fun getDry(): Double {
        return _icall_Double(getDryMethodBind, this.rawMemory)
    }


}
