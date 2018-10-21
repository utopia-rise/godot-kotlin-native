@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class AudioEffectDelay : AudioEffect {
    constructor() : super("AudioEffectDelay")
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
        infix fun from(other: AudioEffect): AudioEffectDelay = AudioEffectDelay("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): AudioEffectDelay = AudioEffectDelay("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): AudioEffectDelay = AudioEffectDelay("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): AudioEffectDelay = AudioEffectDelay("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): AudioEffectDelay = fromVariant(AudioEffectDelay(""), other)


        // Constants


    }


    // Properties
    open var dry: Double
        get() = _icall_Double(getDryMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setDryMethodBind, this.rawMemory, value)


    open var tap1_active: Boolean
        get() = _icall_Boolean(isTap1ActiveMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setTap1ActiveMethodBind, this.rawMemory, value)


    open var tap1_delayMs: Double
        get() = _icall_Double(getTap1DelayMsMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setTap1DelayMsMethodBind, this.rawMemory, value)


    open var tap1_levelDb: Double
        get() = _icall_Double(getTap1LevelDbMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setTap1LevelDbMethodBind, this.rawMemory, value)


    open var tap1_pan: Double
        get() = _icall_Double(getTap1PanMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setTap1PanMethodBind, this.rawMemory, value)


    open var tap2_active: Boolean
        get() = _icall_Boolean(isTap2ActiveMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setTap2ActiveMethodBind, this.rawMemory, value)


    open var tap2_delayMs: Double
        get() = _icall_Double(getTap2DelayMsMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setTap2DelayMsMethodBind, this.rawMemory, value)


    open var tap2_levelDb: Double
        get() = _icall_Double(getTap2LevelDbMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setTap2LevelDbMethodBind, this.rawMemory, value)


    open var tap2_pan: Double
        get() = _icall_Double(getTap2PanMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setTap2PanMethodBind, this.rawMemory, value)


    open var feedback_active: Boolean
        get() = _icall_Boolean(isFeedbackActiveMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setFeedbackActiveMethodBind, this.rawMemory, value)


    open var feedback_delayMs: Double
        get() = _icall_Double(getFeedbackDelayMsMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setFeedbackDelayMsMethodBind, this.rawMemory, value)


    open var feedback_levelDb: Double
        get() = _icall_Double(getFeedbackLevelDbMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setFeedbackLevelDbMethodBind, this.rawMemory, value)


    open var feedback_lowpass: Double
        get() = _icall_Double(getFeedbackLowpassMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setFeedbackLowpassMethodBind, this.rawMemory, value)




    // Methods
    private val setDryMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectDelay", "set_dry") }
    open fun setDry(amount: Double) {
        _icall_Unit_Double(setDryMethodBind, this.rawMemory, amount)
    }


    private val getDryMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectDelay", "get_dry") }
    open fun getDry(): Double {
        return _icall_Double(getDryMethodBind, this.rawMemory)
    }


    private val setTap1ActiveMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectDelay", "set_tap1_active") }
    open fun setTap1Active(amount: Boolean) {
        _icall_Unit_Boolean(setTap1ActiveMethodBind, this.rawMemory, amount)
    }


    private val isTap1ActiveMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectDelay", "is_tap1_active") }
    open fun isTap1Active(): Boolean {
        return _icall_Boolean(isTap1ActiveMethodBind, this.rawMemory)
    }


    private val setTap1DelayMsMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectDelay", "set_tap1_delay_ms") }
    open fun setTap1DelayMs(amount: Double) {
        _icall_Unit_Double(setTap1DelayMsMethodBind, this.rawMemory, amount)
    }


    private val getTap1DelayMsMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectDelay", "get_tap1_delay_ms") }
    open fun getTap1DelayMs(): Double {
        return _icall_Double(getTap1DelayMsMethodBind, this.rawMemory)
    }


    private val setTap1LevelDbMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectDelay", "set_tap1_level_db") }
    open fun setTap1LevelDb(amount: Double) {
        _icall_Unit_Double(setTap1LevelDbMethodBind, this.rawMemory, amount)
    }


    private val getTap1LevelDbMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectDelay", "get_tap1_level_db") }
    open fun getTap1LevelDb(): Double {
        return _icall_Double(getTap1LevelDbMethodBind, this.rawMemory)
    }


    private val setTap1PanMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectDelay", "set_tap1_pan") }
    open fun setTap1Pan(amount: Double) {
        _icall_Unit_Double(setTap1PanMethodBind, this.rawMemory, amount)
    }


    private val getTap1PanMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectDelay", "get_tap1_pan") }
    open fun getTap1Pan(): Double {
        return _icall_Double(getTap1PanMethodBind, this.rawMemory)
    }


    private val setTap2ActiveMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectDelay", "set_tap2_active") }
    open fun setTap2Active(amount: Boolean) {
        _icall_Unit_Boolean(setTap2ActiveMethodBind, this.rawMemory, amount)
    }


    private val isTap2ActiveMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectDelay", "is_tap2_active") }
    open fun isTap2Active(): Boolean {
        return _icall_Boolean(isTap2ActiveMethodBind, this.rawMemory)
    }


    private val setTap2DelayMsMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectDelay", "set_tap2_delay_ms") }
    open fun setTap2DelayMs(amount: Double) {
        _icall_Unit_Double(setTap2DelayMsMethodBind, this.rawMemory, amount)
    }


    private val getTap2DelayMsMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectDelay", "get_tap2_delay_ms") }
    open fun getTap2DelayMs(): Double {
        return _icall_Double(getTap2DelayMsMethodBind, this.rawMemory)
    }


    private val setTap2LevelDbMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectDelay", "set_tap2_level_db") }
    open fun setTap2LevelDb(amount: Double) {
        _icall_Unit_Double(setTap2LevelDbMethodBind, this.rawMemory, amount)
    }


    private val getTap2LevelDbMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectDelay", "get_tap2_level_db") }
    open fun getTap2LevelDb(): Double {
        return _icall_Double(getTap2LevelDbMethodBind, this.rawMemory)
    }


    private val setTap2PanMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectDelay", "set_tap2_pan") }
    open fun setTap2Pan(amount: Double) {
        _icall_Unit_Double(setTap2PanMethodBind, this.rawMemory, amount)
    }


    private val getTap2PanMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectDelay", "get_tap2_pan") }
    open fun getTap2Pan(): Double {
        return _icall_Double(getTap2PanMethodBind, this.rawMemory)
    }


    private val setFeedbackActiveMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectDelay", "set_feedback_active") }
    open fun setFeedbackActive(amount: Boolean) {
        _icall_Unit_Boolean(setFeedbackActiveMethodBind, this.rawMemory, amount)
    }


    private val isFeedbackActiveMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectDelay", "is_feedback_active") }
    open fun isFeedbackActive(): Boolean {
        return _icall_Boolean(isFeedbackActiveMethodBind, this.rawMemory)
    }


    private val setFeedbackDelayMsMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectDelay", "set_feedback_delay_ms") }
    open fun setFeedbackDelayMs(amount: Double) {
        _icall_Unit_Double(setFeedbackDelayMsMethodBind, this.rawMemory, amount)
    }


    private val getFeedbackDelayMsMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectDelay", "get_feedback_delay_ms") }
    open fun getFeedbackDelayMs(): Double {
        return _icall_Double(getFeedbackDelayMsMethodBind, this.rawMemory)
    }


    private val setFeedbackLevelDbMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectDelay", "set_feedback_level_db") }
    open fun setFeedbackLevelDb(amount: Double) {
        _icall_Unit_Double(setFeedbackLevelDbMethodBind, this.rawMemory, amount)
    }


    private val getFeedbackLevelDbMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectDelay", "get_feedback_level_db") }
    open fun getFeedbackLevelDb(): Double {
        return _icall_Double(getFeedbackLevelDbMethodBind, this.rawMemory)
    }


    private val setFeedbackLowpassMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectDelay", "set_feedback_lowpass") }
    open fun setFeedbackLowpass(amount: Double) {
        _icall_Unit_Double(setFeedbackLowpassMethodBind, this.rawMemory, amount)
    }


    private val getFeedbackLowpassMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectDelay", "get_feedback_lowpass") }
    open fun getFeedbackLowpass(): Double {
        return _icall_Double(getFeedbackLowpassMethodBind, this.rawMemory)
    }


}
