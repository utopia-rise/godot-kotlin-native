@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
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
    open var dry: Float
        get() = _icall_Float(getDryMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setDryMethodBind, this.rawMemory, value)


    open var tap1_active: Boolean
        get() = _icall_Boolean(isTap1ActiveMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setTap1ActiveMethodBind, this.rawMemory, value)


    open var tap1_delayMs: Float
        get() = _icall_Float(getTap1DelayMsMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setTap1DelayMsMethodBind, this.rawMemory, value)


    open var tap1_levelDb: Float
        get() = _icall_Float(getTap1LevelDbMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setTap1LevelDbMethodBind, this.rawMemory, value)


    open var tap1_pan: Float
        get() = _icall_Float(getTap1PanMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setTap1PanMethodBind, this.rawMemory, value)


    open var tap2_active: Boolean
        get() = _icall_Boolean(isTap2ActiveMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setTap2ActiveMethodBind, this.rawMemory, value)


    open var tap2_delayMs: Float
        get() = _icall_Float(getTap2DelayMsMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setTap2DelayMsMethodBind, this.rawMemory, value)


    open var tap2_levelDb: Float
        get() = _icall_Float(getTap2LevelDbMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setTap2LevelDbMethodBind, this.rawMemory, value)


    open var tap2_pan: Float
        get() = _icall_Float(getTap2PanMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setTap2PanMethodBind, this.rawMemory, value)


    open var feedback_active: Boolean
        get() = _icall_Boolean(isFeedbackActiveMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setFeedbackActiveMethodBind, this.rawMemory, value)


    open var feedback_delayMs: Float
        get() = _icall_Float(getFeedbackDelayMsMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setFeedbackDelayMsMethodBind, this.rawMemory, value)


    open var feedback_levelDb: Float
        get() = _icall_Float(getFeedbackLevelDbMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setFeedbackLevelDbMethodBind, this.rawMemory, value)


    open var feedback_lowpass: Float
        get() = _icall_Float(getFeedbackLowpassMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setFeedbackLowpassMethodBind, this.rawMemory, value)




    // Methods
    private val setDryMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectDelay", "set_dry") }
    open fun setDry(amount: Float) {
        _icall_Unit_Float(setDryMethodBind, this.rawMemory, amount)
    }


    private val getDryMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectDelay", "get_dry") }
    open fun getDry(): Float {
        return _icall_Float(getDryMethodBind, this.rawMemory)
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
    open fun setTap1DelayMs(amount: Float) {
        _icall_Unit_Float(setTap1DelayMsMethodBind, this.rawMemory, amount)
    }


    private val getTap1DelayMsMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectDelay", "get_tap1_delay_ms") }
    open fun getTap1DelayMs(): Float {
        return _icall_Float(getTap1DelayMsMethodBind, this.rawMemory)
    }


    private val setTap1LevelDbMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectDelay", "set_tap1_level_db") }
    open fun setTap1LevelDb(amount: Float) {
        _icall_Unit_Float(setTap1LevelDbMethodBind, this.rawMemory, amount)
    }


    private val getTap1LevelDbMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectDelay", "get_tap1_level_db") }
    open fun getTap1LevelDb(): Float {
        return _icall_Float(getTap1LevelDbMethodBind, this.rawMemory)
    }


    private val setTap1PanMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectDelay", "set_tap1_pan") }
    open fun setTap1Pan(amount: Float) {
        _icall_Unit_Float(setTap1PanMethodBind, this.rawMemory, amount)
    }


    private val getTap1PanMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectDelay", "get_tap1_pan") }
    open fun getTap1Pan(): Float {
        return _icall_Float(getTap1PanMethodBind, this.rawMemory)
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
    open fun setTap2DelayMs(amount: Float) {
        _icall_Unit_Float(setTap2DelayMsMethodBind, this.rawMemory, amount)
    }


    private val getTap2DelayMsMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectDelay", "get_tap2_delay_ms") }
    open fun getTap2DelayMs(): Float {
        return _icall_Float(getTap2DelayMsMethodBind, this.rawMemory)
    }


    private val setTap2LevelDbMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectDelay", "set_tap2_level_db") }
    open fun setTap2LevelDb(amount: Float) {
        _icall_Unit_Float(setTap2LevelDbMethodBind, this.rawMemory, amount)
    }


    private val getTap2LevelDbMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectDelay", "get_tap2_level_db") }
    open fun getTap2LevelDb(): Float {
        return _icall_Float(getTap2LevelDbMethodBind, this.rawMemory)
    }


    private val setTap2PanMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectDelay", "set_tap2_pan") }
    open fun setTap2Pan(amount: Float) {
        _icall_Unit_Float(setTap2PanMethodBind, this.rawMemory, amount)
    }


    private val getTap2PanMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectDelay", "get_tap2_pan") }
    open fun getTap2Pan(): Float {
        return _icall_Float(getTap2PanMethodBind, this.rawMemory)
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
    open fun setFeedbackDelayMs(amount: Float) {
        _icall_Unit_Float(setFeedbackDelayMsMethodBind, this.rawMemory, amount)
    }


    private val getFeedbackDelayMsMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectDelay", "get_feedback_delay_ms") }
    open fun getFeedbackDelayMs(): Float {
        return _icall_Float(getFeedbackDelayMsMethodBind, this.rawMemory)
    }


    private val setFeedbackLevelDbMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectDelay", "set_feedback_level_db") }
    open fun setFeedbackLevelDb(amount: Float) {
        _icall_Unit_Float(setFeedbackLevelDbMethodBind, this.rawMemory, amount)
    }


    private val getFeedbackLevelDbMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectDelay", "get_feedback_level_db") }
    open fun getFeedbackLevelDb(): Float {
        return _icall_Float(getFeedbackLevelDbMethodBind, this.rawMemory)
    }


    private val setFeedbackLowpassMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectDelay", "set_feedback_lowpass") }
    open fun setFeedbackLowpass(amount: Float) {
        _icall_Unit_Float(setFeedbackLowpassMethodBind, this.rawMemory, amount)
    }


    private val getFeedbackLowpassMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectDelay", "get_feedback_lowpass") }
    open fun getFeedbackLowpass(): Float {
        return _icall_Float(getFeedbackLowpassMethodBind, this.rawMemory)
    }


}
