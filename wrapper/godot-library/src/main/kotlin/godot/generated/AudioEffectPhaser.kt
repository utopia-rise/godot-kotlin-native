@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
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
    open var rangeMinHz: Double
        get() = _icall_Double(getRangeMinHzMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setRangeMinHzMethodBind, this.rawMemory, value)


    open var rangeMaxHz: Double
        get() = _icall_Double(getRangeMaxHzMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setRangeMaxHzMethodBind, this.rawMemory, value)


    open var rateHz: Double
        get() = _icall_Double(getRateHzMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setRateHzMethodBind, this.rawMemory, value)


    open var feedback: Double
        get() = _icall_Double(getFeedbackMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setFeedbackMethodBind, this.rawMemory, value)


    open var depth: Double
        get() = _icall_Double(getDepthMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setDepthMethodBind, this.rawMemory, value)




    // Methods
    private val setRangeMinHzMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectPhaser", "set_range_min_hz") }
    open fun setRangeMinHz(hz: Double) {
        _icall_Unit_Double(setRangeMinHzMethodBind, this.rawMemory, hz)
    }


    private val getRangeMinHzMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectPhaser", "get_range_min_hz") }
    open fun getRangeMinHz(): Double {
        return _icall_Double(getRangeMinHzMethodBind, this.rawMemory)
    }


    private val setRangeMaxHzMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectPhaser", "set_range_max_hz") }
    open fun setRangeMaxHz(hz: Double) {
        _icall_Unit_Double(setRangeMaxHzMethodBind, this.rawMemory, hz)
    }


    private val getRangeMaxHzMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectPhaser", "get_range_max_hz") }
    open fun getRangeMaxHz(): Double {
        return _icall_Double(getRangeMaxHzMethodBind, this.rawMemory)
    }


    private val setRateHzMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectPhaser", "set_rate_hz") }
    open fun setRateHz(hz: Double) {
        _icall_Unit_Double(setRateHzMethodBind, this.rawMemory, hz)
    }


    private val getRateHzMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectPhaser", "get_rate_hz") }
    open fun getRateHz(): Double {
        return _icall_Double(getRateHzMethodBind, this.rawMemory)
    }


    private val setFeedbackMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectPhaser", "set_feedback") }
    open fun setFeedback(fbk: Double) {
        _icall_Unit_Double(setFeedbackMethodBind, this.rawMemory, fbk)
    }


    private val getFeedbackMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectPhaser", "get_feedback") }
    open fun getFeedback(): Double {
        return _icall_Double(getFeedbackMethodBind, this.rawMemory)
    }


    private val setDepthMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectPhaser", "set_depth") }
    open fun setDepth(depth: Double) {
        _icall_Unit_Double(setDepthMethodBind, this.rawMemory, depth)
    }


    private val getDepthMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectPhaser", "get_depth") }
    open fun getDepth(): Double {
        return _icall_Double(getDepthMethodBind, this.rawMemory)
    }


}
