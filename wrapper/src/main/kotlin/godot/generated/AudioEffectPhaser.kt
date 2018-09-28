@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class AudioEffectPhaser : AudioEffect {
    constructor() : super("AudioEffectPhaser")
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
        infix fun from(other: AudioEffect): AudioEffectPhaser = AudioEffectPhaser("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): AudioEffectPhaser = AudioEffectPhaser("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): AudioEffectPhaser = AudioEffectPhaser("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): AudioEffectPhaser = AudioEffectPhaser("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): AudioEffectPhaser = fromVariant(AudioEffectPhaser(""), other)


        // Constants


    }


    // Properties
    open var rangeMinHz: Float
        get() = _icall_Float(getRangeMinHzMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setRangeMinHzMethodBind, this.rawMemory, value)


    open var rangeMaxHz: Float
        get() = _icall_Float(getRangeMaxHzMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setRangeMaxHzMethodBind, this.rawMemory, value)


    open var rateHz: Float
        get() = _icall_Float(getRateHzMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setRateHzMethodBind, this.rawMemory, value)


    open var feedback: Float
        get() = _icall_Float(getFeedbackMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setFeedbackMethodBind, this.rawMemory, value)


    open var depth: Float
        get() = _icall_Float(getDepthMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setDepthMethodBind, this.rawMemory, value)




    // Methods
    private val setRangeMinHzMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectPhaser", "set_range_min_hz") }
    open fun setRangeMinHz(hz: Float) {
        _icall_Unit_Float(setRangeMinHzMethodBind, this.rawMemory, hz)
    }


    private val getRangeMinHzMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectPhaser", "get_range_min_hz") }
    open fun getRangeMinHz(): Float {
        return _icall_Float(getRangeMinHzMethodBind, this.rawMemory)
    }


    private val setRangeMaxHzMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectPhaser", "set_range_max_hz") }
    open fun setRangeMaxHz(hz: Float) {
        _icall_Unit_Float(setRangeMaxHzMethodBind, this.rawMemory, hz)
    }


    private val getRangeMaxHzMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectPhaser", "get_range_max_hz") }
    open fun getRangeMaxHz(): Float {
        return _icall_Float(getRangeMaxHzMethodBind, this.rawMemory)
    }


    private val setRateHzMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectPhaser", "set_rate_hz") }
    open fun setRateHz(hz: Float) {
        _icall_Unit_Float(setRateHzMethodBind, this.rawMemory, hz)
    }


    private val getRateHzMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectPhaser", "get_rate_hz") }
    open fun getRateHz(): Float {
        return _icall_Float(getRateHzMethodBind, this.rawMemory)
    }


    private val setFeedbackMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectPhaser", "set_feedback") }
    open fun setFeedback(fbk: Float) {
        _icall_Unit_Float(setFeedbackMethodBind, this.rawMemory, fbk)
    }


    private val getFeedbackMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectPhaser", "get_feedback") }
    open fun getFeedback(): Float {
        return _icall_Float(getFeedbackMethodBind, this.rawMemory)
    }


    private val setDepthMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectPhaser", "set_depth") }
    open fun setDepth(depth: Float) {
        _icall_Unit_Float(setDepthMethodBind, this.rawMemory, depth)
    }


    private val getDepthMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectPhaser", "get_depth") }
    open fun getDepth(): Float {
        return _icall_Float(getDepthMethodBind, this.rawMemory)
    }


}
