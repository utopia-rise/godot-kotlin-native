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
    open var voiceCount: Int
        get() = _icall_Int(getVoiceCountMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setVoiceCountMethodBind, this.rawMemory, value)


    open var dry: Float
        get() = _icall_Float(getDryMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setDryMethodBind, this.rawMemory, value)


    open var wet: Float
        get() = _icall_Float(getWetMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setWetMethodBind, this.rawMemory, value)


    open var voice_1_delayMs: Float
        get() = _icall_Float_Int(getVoiceDelayMsMethodBind, this.rawMemory, 0)
        set(value) = _icall_Unit_Int_Float(setVoiceDelayMsMethodBind, this.rawMemory, 0, value)


    open var voice_1_rateHz: Float
        get() = _icall_Float_Int(getVoiceRateHzMethodBind, this.rawMemory, 0)
        set(value) = _icall_Unit_Int_Float(setVoiceRateHzMethodBind, this.rawMemory, 0, value)


    open var voice_1_depthMs: Float
        get() = _icall_Float_Int(getVoiceDepthMsMethodBind, this.rawMemory, 0)
        set(value) = _icall_Unit_Int_Float(setVoiceDepthMsMethodBind, this.rawMemory, 0, value)


    open var voice_1_levelDb: Float
        get() = _icall_Float_Int(getVoiceLevelDbMethodBind, this.rawMemory, 0)
        set(value) = _icall_Unit_Int_Float(setVoiceLevelDbMethodBind, this.rawMemory, 0, value)


    open var voice_1_cutoffHz: Float
        get() = _icall_Float_Int(getVoiceCutoffHzMethodBind, this.rawMemory, 0)
        set(value) = _icall_Unit_Int_Float(setVoiceCutoffHzMethodBind, this.rawMemory, 0, value)


    open var voice_1_pan: Float
        get() = _icall_Float_Int(getVoicePanMethodBind, this.rawMemory, 0)
        set(value) = _icall_Unit_Int_Float(setVoicePanMethodBind, this.rawMemory, 0, value)


    open var voice_2_delayMs: Float
        get() = _icall_Float_Int(getVoiceDelayMsMethodBind, this.rawMemory, 1)
        set(value) = _icall_Unit_Int_Float(setVoiceDelayMsMethodBind, this.rawMemory, 1, value)


    open var voice_2_rateHz: Float
        get() = _icall_Float_Int(getVoiceRateHzMethodBind, this.rawMemory, 1)
        set(value) = _icall_Unit_Int_Float(setVoiceRateHzMethodBind, this.rawMemory, 1, value)


    open var voice_2_depthMs: Float
        get() = _icall_Float_Int(getVoiceDepthMsMethodBind, this.rawMemory, 1)
        set(value) = _icall_Unit_Int_Float(setVoiceDepthMsMethodBind, this.rawMemory, 1, value)


    open var voice_2_levelDb: Float
        get() = _icall_Float_Int(getVoiceLevelDbMethodBind, this.rawMemory, 1)
        set(value) = _icall_Unit_Int_Float(setVoiceLevelDbMethodBind, this.rawMemory, 1, value)


    open var voice_2_cutoffHz: Float
        get() = _icall_Float_Int(getVoiceCutoffHzMethodBind, this.rawMemory, 1)
        set(value) = _icall_Unit_Int_Float(setVoiceCutoffHzMethodBind, this.rawMemory, 1, value)


    open var voice_2_pan: Float
        get() = _icall_Float_Int(getVoicePanMethodBind, this.rawMemory, 1)
        set(value) = _icall_Unit_Int_Float(setVoicePanMethodBind, this.rawMemory, 1, value)


    open var voice_3_delayMs: Float
        get() = _icall_Float_Int(getVoiceDelayMsMethodBind, this.rawMemory, 2)
        set(value) = _icall_Unit_Int_Float(setVoiceDelayMsMethodBind, this.rawMemory, 2, value)


    open var voice_3_rateHz: Float
        get() = _icall_Float_Int(getVoiceRateHzMethodBind, this.rawMemory, 2)
        set(value) = _icall_Unit_Int_Float(setVoiceRateHzMethodBind, this.rawMemory, 2, value)


    open var voice_3_depthMs: Float
        get() = _icall_Float_Int(getVoiceDepthMsMethodBind, this.rawMemory, 2)
        set(value) = _icall_Unit_Int_Float(setVoiceDepthMsMethodBind, this.rawMemory, 2, value)


    open var voice_3_levelDb: Float
        get() = _icall_Float_Int(getVoiceLevelDbMethodBind, this.rawMemory, 2)
        set(value) = _icall_Unit_Int_Float(setVoiceLevelDbMethodBind, this.rawMemory, 2, value)


    open var voice_3_cutoffHz: Float
        get() = _icall_Float_Int(getVoiceCutoffHzMethodBind, this.rawMemory, 2)
        set(value) = _icall_Unit_Int_Float(setVoiceCutoffHzMethodBind, this.rawMemory, 2, value)


    open var voice_3_pan: Float
        get() = _icall_Float_Int(getVoicePanMethodBind, this.rawMemory, 2)
        set(value) = _icall_Unit_Int_Float(setVoicePanMethodBind, this.rawMemory, 2, value)


    open var voice_4_delayMs: Float
        get() = _icall_Float_Int(getVoiceDelayMsMethodBind, this.rawMemory, 3)
        set(value) = _icall_Unit_Int_Float(setVoiceDelayMsMethodBind, this.rawMemory, 3, value)


    open var voice_4_rateHz: Float
        get() = _icall_Float_Int(getVoiceRateHzMethodBind, this.rawMemory, 3)
        set(value) = _icall_Unit_Int_Float(setVoiceRateHzMethodBind, this.rawMemory, 3, value)


    open var voice_4_depthMs: Float
        get() = _icall_Float_Int(getVoiceDepthMsMethodBind, this.rawMemory, 3)
        set(value) = _icall_Unit_Int_Float(setVoiceDepthMsMethodBind, this.rawMemory, 3, value)


    open var voice_4_levelDb: Float
        get() = _icall_Float_Int(getVoiceLevelDbMethodBind, this.rawMemory, 3)
        set(value) = _icall_Unit_Int_Float(setVoiceLevelDbMethodBind, this.rawMemory, 3, value)


    open var voice_4_cutoffHz: Float
        get() = _icall_Float_Int(getVoiceCutoffHzMethodBind, this.rawMemory, 3)
        set(value) = _icall_Unit_Int_Float(setVoiceCutoffHzMethodBind, this.rawMemory, 3, value)


    open var voice_4_pan: Float
        get() = _icall_Float_Int(getVoicePanMethodBind, this.rawMemory, 3)
        set(value) = _icall_Unit_Int_Float(setVoicePanMethodBind, this.rawMemory, 3, value)




    // Methods
    private val setVoiceCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectChorus", "set_voice_count") }
    open fun setVoiceCount(voices: Int) {
        _icall_Unit_Int(setVoiceCountMethodBind, this.rawMemory, voices)
    }


    private val getVoiceCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectChorus", "get_voice_count") }
    open fun getVoiceCount(): Int {
        return _icall_Int(getVoiceCountMethodBind, this.rawMemory)
    }


    private val setVoiceDelayMsMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectChorus", "set_voice_delay_ms") }
    open fun setVoiceDelayMs(voiceIdx: Int, delayMs: Float) {
        _icall_Unit_Int_Float(setVoiceDelayMsMethodBind, this.rawMemory, voiceIdx, delayMs)
    }


    private val getVoiceDelayMsMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectChorus", "get_voice_delay_ms") }
    open fun getVoiceDelayMs(voiceIdx: Int): Float {
        return _icall_Float_Int(getVoiceDelayMsMethodBind, this.rawMemory, voiceIdx)
    }


    private val setVoiceRateHzMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectChorus", "set_voice_rate_hz") }
    open fun setVoiceRateHz(voiceIdx: Int, rateHz: Float) {
        _icall_Unit_Int_Float(setVoiceRateHzMethodBind, this.rawMemory, voiceIdx, rateHz)
    }


    private val getVoiceRateHzMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectChorus", "get_voice_rate_hz") }
    open fun getVoiceRateHz(voiceIdx: Int): Float {
        return _icall_Float_Int(getVoiceRateHzMethodBind, this.rawMemory, voiceIdx)
    }


    private val setVoiceDepthMsMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectChorus", "set_voice_depth_ms") }
    open fun setVoiceDepthMs(voiceIdx: Int, depthMs: Float) {
        _icall_Unit_Int_Float(setVoiceDepthMsMethodBind, this.rawMemory, voiceIdx, depthMs)
    }


    private val getVoiceDepthMsMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectChorus", "get_voice_depth_ms") }
    open fun getVoiceDepthMs(voiceIdx: Int): Float {
        return _icall_Float_Int(getVoiceDepthMsMethodBind, this.rawMemory, voiceIdx)
    }


    private val setVoiceLevelDbMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectChorus", "set_voice_level_db") }
    open fun setVoiceLevelDb(voiceIdx: Int, levelDb: Float) {
        _icall_Unit_Int_Float(setVoiceLevelDbMethodBind, this.rawMemory, voiceIdx, levelDb)
    }


    private val getVoiceLevelDbMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectChorus", "get_voice_level_db") }
    open fun getVoiceLevelDb(voiceIdx: Int): Float {
        return _icall_Float_Int(getVoiceLevelDbMethodBind, this.rawMemory, voiceIdx)
    }


    private val setVoiceCutoffHzMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectChorus", "set_voice_cutoff_hz") }
    open fun setVoiceCutoffHz(voiceIdx: Int, cutoffHz: Float) {
        _icall_Unit_Int_Float(setVoiceCutoffHzMethodBind, this.rawMemory, voiceIdx, cutoffHz)
    }


    private val getVoiceCutoffHzMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectChorus", "get_voice_cutoff_hz") }
    open fun getVoiceCutoffHz(voiceIdx: Int): Float {
        return _icall_Float_Int(getVoiceCutoffHzMethodBind, this.rawMemory, voiceIdx)
    }


    private val setVoicePanMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectChorus", "set_voice_pan") }
    open fun setVoicePan(voiceIdx: Int, pan: Float) {
        _icall_Unit_Int_Float(setVoicePanMethodBind, this.rawMemory, voiceIdx, pan)
    }


    private val getVoicePanMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectChorus", "get_voice_pan") }
    open fun getVoicePan(voiceIdx: Int): Float {
        return _icall_Float_Int(getVoicePanMethodBind, this.rawMemory, voiceIdx)
    }


    private val setWetMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectChorus", "set_wet") }
    open fun setWet(amount: Float) {
        _icall_Unit_Float(setWetMethodBind, this.rawMemory, amount)
    }


    private val getWetMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectChorus", "get_wet") }
    open fun getWet(): Float {
        return _icall_Float(getWetMethodBind, this.rawMemory)
    }


    private val setDryMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectChorus", "set_dry") }
    open fun setDry(amount: Float) {
        _icall_Unit_Float(setDryMethodBind, this.rawMemory, amount)
    }


    private val getDryMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectChorus", "get_dry") }
    open fun getDry(): Float {
        return _icall_Float(getDryMethodBind, this.rawMemory)
    }


}
