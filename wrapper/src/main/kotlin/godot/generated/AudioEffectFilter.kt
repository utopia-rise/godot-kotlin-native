@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class AudioEffectFilter : AudioEffect {
    constructor() : super("AudioEffectFilter")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class FilterDB(val id: Int) {
        FILTER_6DB(0),
        FILTER_12DB(1),
        FILTER_18DB(2),
        FILTER_24DB(3),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }


    // Signals
    class Signal {
        companion object {
        }
    }


    companion object {
        infix fun from(other: AudioEffect): AudioEffectFilter = AudioEffectFilter("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): AudioEffectFilter = AudioEffectFilter("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): AudioEffectFilter = AudioEffectFilter("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): AudioEffectFilter = AudioEffectFilter("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): AudioEffectFilter = fromVariant(AudioEffectFilter(""), other)


        // Constants
        const val FILTER_6DB: Int = 0
        const val FILTER_12DB: Int = 1
        const val FILTER_18DB: Int = 2
        const val FILTER_24DB: Int = 3


    }


    // Properties
    open var cutoffHz: Float
        get() = _icall_Float(getCutoffMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setCutoffMethodBind, this.rawMemory, value)


    open var resonance: Float
        get() = _icall_Float(getResonanceMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setResonanceMethodBind, this.rawMemory, value)


    open var gain: Float
        get() = _icall_Float(getGainMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setGainMethodBind, this.rawMemory, value)


    open var db: Int
        get() = _icall_Int(getDbMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setDbMethodBind, this.rawMemory, value)




    // Methods
    private val setCutoffMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectFilter", "set_cutoff") }
    open fun setCutoff(freq: Float) {
        _icall_Unit_Float(setCutoffMethodBind, this.rawMemory, freq)
    }


    private val getCutoffMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectFilter", "get_cutoff") }
    open fun getCutoff(): Float {
        return _icall_Float(getCutoffMethodBind, this.rawMemory)
    }


    private val setResonanceMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectFilter", "set_resonance") }
    open fun setResonance(amount: Float) {
        _icall_Unit_Float(setResonanceMethodBind, this.rawMemory, amount)
    }


    private val getResonanceMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectFilter", "get_resonance") }
    open fun getResonance(): Float {
        return _icall_Float(getResonanceMethodBind, this.rawMemory)
    }


    private val setGainMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectFilter", "set_gain") }
    open fun setGain(amount: Float) {
        _icall_Unit_Float(setGainMethodBind, this.rawMemory, amount)
    }


    private val getGainMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectFilter", "get_gain") }
    open fun getGain(): Float {
        return _icall_Float(getGainMethodBind, this.rawMemory)
    }


    private val setDbMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectFilter", "set_db") }
    open fun setDb(amount: Int) {
        _icall_Unit_Int(setDbMethodBind, this.rawMemory, amount)
    }


    private val getDbMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectFilter", "get_db") }
    open fun getDb(): AudioEffectFilter.FilterDB {
        return AudioEffectFilter.FilterDB.fromInt(_icall_Int(getDbMethodBind, this.rawMemory))
    }


}
