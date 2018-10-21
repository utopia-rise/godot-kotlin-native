@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
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
    open var predelayMsec: Double
        get() = _icall_Double(getPredelayMsecMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setPredelayMsecMethodBind, this.rawMemory, value)


    open var predelayFeedback: Double
        get() = _icall_Double(getPredelayFeedbackMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setPredelayFeedbackMethodBind, this.rawMemory, value)


    open var roomSize: Double
        get() = _icall_Double(getRoomSizeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setRoomSizeMethodBind, this.rawMemory, value)


    open var damping: Double
        get() = _icall_Double(getDampingMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setDampingMethodBind, this.rawMemory, value)


    open var spread: Double
        get() = _icall_Double(getSpreadMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setSpreadMethodBind, this.rawMemory, value)


    open var hipass: Double
        get() = _icall_Double(getHpfMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setHpfMethodBind, this.rawMemory, value)


    open var dry: Double
        get() = _icall_Double(getDryMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setDryMethodBind, this.rawMemory, value)


    open var wet: Double
        get() = _icall_Double(getWetMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setWetMethodBind, this.rawMemory, value)




    // Methods
    private val setPredelayMsecMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectReverb", "set_predelay_msec") }
    open fun setPredelayMsec(msec: Double) {
        _icall_Unit_Double(setPredelayMsecMethodBind, this.rawMemory, msec)
    }


    private val getPredelayMsecMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectReverb", "get_predelay_msec") }
    open fun getPredelayMsec(): Double {
        return _icall_Double(getPredelayMsecMethodBind, this.rawMemory)
    }


    private val setPredelayFeedbackMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectReverb", "set_predelay_feedback") }
    open fun setPredelayFeedback(feedback: Double) {
        _icall_Unit_Double(setPredelayFeedbackMethodBind, this.rawMemory, feedback)
    }


    private val getPredelayFeedbackMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectReverb", "get_predelay_feedback") }
    open fun getPredelayFeedback(): Double {
        return _icall_Double(getPredelayFeedbackMethodBind, this.rawMemory)
    }


    private val setRoomSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectReverb", "set_room_size") }
    open fun setRoomSize(size: Double) {
        _icall_Unit_Double(setRoomSizeMethodBind, this.rawMemory, size)
    }


    private val getRoomSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectReverb", "get_room_size") }
    open fun getRoomSize(): Double {
        return _icall_Double(getRoomSizeMethodBind, this.rawMemory)
    }


    private val setDampingMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectReverb", "set_damping") }
    open fun setDamping(amount: Double) {
        _icall_Unit_Double(setDampingMethodBind, this.rawMemory, amount)
    }


    private val getDampingMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectReverb", "get_damping") }
    open fun getDamping(): Double {
        return _icall_Double(getDampingMethodBind, this.rawMemory)
    }


    private val setSpreadMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectReverb", "set_spread") }
    open fun setSpread(amount: Double) {
        _icall_Unit_Double(setSpreadMethodBind, this.rawMemory, amount)
    }


    private val getSpreadMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectReverb", "get_spread") }
    open fun getSpread(): Double {
        return _icall_Double(getSpreadMethodBind, this.rawMemory)
    }


    private val setDryMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectReverb", "set_dry") }
    open fun setDry(amount: Double) {
        _icall_Unit_Double(setDryMethodBind, this.rawMemory, amount)
    }


    private val getDryMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectReverb", "get_dry") }
    open fun getDry(): Double {
        return _icall_Double(getDryMethodBind, this.rawMemory)
    }


    private val setWetMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectReverb", "set_wet") }
    open fun setWet(amount: Double) {
        _icall_Unit_Double(setWetMethodBind, this.rawMemory, amount)
    }


    private val getWetMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectReverb", "get_wet") }
    open fun getWet(): Double {
        return _icall_Double(getWetMethodBind, this.rawMemory)
    }


    private val setHpfMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectReverb", "set_hpf") }
    open fun setHpf(amount: Double) {
        _icall_Unit_Double(setHpfMethodBind, this.rawMemory, amount)
    }


    private val getHpfMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectReverb", "get_hpf") }
    open fun getHpf(): Double {
        return _icall_Double(getHpfMethodBind, this.rawMemory)
    }


}
