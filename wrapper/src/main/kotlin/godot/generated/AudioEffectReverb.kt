@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class AudioEffectReverb : AudioEffect {
    constructor() : super("AudioEffectReverb")
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
        infix fun from(other: AudioEffect): AudioEffectReverb = AudioEffectReverb("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): AudioEffectReverb = AudioEffectReverb("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): AudioEffectReverb = AudioEffectReverb("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): AudioEffectReverb = AudioEffectReverb("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): AudioEffectReverb = fromVariant(AudioEffectReverb(""), other)


        // Constants


    }


    // Properties
    open var predelayMsec: Float
        get() = _icall_Float(getPredelayMsecMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setPredelayMsecMethodBind, this.rawMemory, value)


    open var predelayFeedback: Float
        get() = _icall_Float(getPredelayFeedbackMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setPredelayFeedbackMethodBind, this.rawMemory, value)


    open var roomSize: Float
        get() = _icall_Float(getRoomSizeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setRoomSizeMethodBind, this.rawMemory, value)


    open var damping: Float
        get() = _icall_Float(getDampingMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setDampingMethodBind, this.rawMemory, value)


    open var spread: Float
        get() = _icall_Float(getSpreadMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setSpreadMethodBind, this.rawMemory, value)


    open var hipass: Float
        get() = _icall_Float(getHpfMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setHpfMethodBind, this.rawMemory, value)


    open var dry: Float
        get() = _icall_Float(getDryMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setDryMethodBind, this.rawMemory, value)


    open var wet: Float
        get() = _icall_Float(getWetMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setWetMethodBind, this.rawMemory, value)




    // Methods
    private val setPredelayMsecMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectReverb", "set_predelay_msec") }
    open fun setPredelayMsec(msec: Float) {
        _icall_Unit_Float(setPredelayMsecMethodBind, this.rawMemory, msec)
    }


    private val getPredelayMsecMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectReverb", "get_predelay_msec") }
    open fun getPredelayMsec(): Float {
        return _icall_Float(getPredelayMsecMethodBind, this.rawMemory)
    }


    private val setPredelayFeedbackMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectReverb", "set_predelay_feedback") }
    open fun setPredelayFeedback(feedback: Float) {
        _icall_Unit_Float(setPredelayFeedbackMethodBind, this.rawMemory, feedback)
    }


    private val getPredelayFeedbackMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectReverb", "get_predelay_feedback") }
    open fun getPredelayFeedback(): Float {
        return _icall_Float(getPredelayFeedbackMethodBind, this.rawMemory)
    }


    private val setRoomSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectReverb", "set_room_size") }
    open fun setRoomSize(size: Float) {
        _icall_Unit_Float(setRoomSizeMethodBind, this.rawMemory, size)
    }


    private val getRoomSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectReverb", "get_room_size") }
    open fun getRoomSize(): Float {
        return _icall_Float(getRoomSizeMethodBind, this.rawMemory)
    }


    private val setDampingMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectReverb", "set_damping") }
    open fun setDamping(amount: Float) {
        _icall_Unit_Float(setDampingMethodBind, this.rawMemory, amount)
    }


    private val getDampingMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectReverb", "get_damping") }
    open fun getDamping(): Float {
        return _icall_Float(getDampingMethodBind, this.rawMemory)
    }


    private val setSpreadMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectReverb", "set_spread") }
    open fun setSpread(amount: Float) {
        _icall_Unit_Float(setSpreadMethodBind, this.rawMemory, amount)
    }


    private val getSpreadMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectReverb", "get_spread") }
    open fun getSpread(): Float {
        return _icall_Float(getSpreadMethodBind, this.rawMemory)
    }


    private val setDryMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectReverb", "set_dry") }
    open fun setDry(amount: Float) {
        _icall_Unit_Float(setDryMethodBind, this.rawMemory, amount)
    }


    private val getDryMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectReverb", "get_dry") }
    open fun getDry(): Float {
        return _icall_Float(getDryMethodBind, this.rawMemory)
    }


    private val setWetMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectReverb", "set_wet") }
    open fun setWet(amount: Float) {
        _icall_Unit_Float(setWetMethodBind, this.rawMemory, amount)
    }


    private val getWetMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectReverb", "get_wet") }
    open fun getWet(): Float {
        return _icall_Float(getWetMethodBind, this.rawMemory)
    }


    private val setHpfMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectReverb", "set_hpf") }
    open fun setHpf(amount: Float) {
        _icall_Unit_Float(setHpfMethodBind, this.rawMemory, amount)
    }


    private val getHpfMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectReverb", "get_hpf") }
    open fun getHpf(): Float {
        return _icall_Float(getHpfMethodBind, this.rawMemory)
    }


}
