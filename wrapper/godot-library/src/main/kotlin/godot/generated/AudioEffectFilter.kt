@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class AudioEffectFilter : AudioEffect {
    constructor() : super("AudioEffectFilter")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class FilterDB(val id: Long) {
        FILTER_6DB(0),
        FILTER_12DB(1),
        FILTER_18DB(2),
        FILTER_24DB(3),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
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
        const val FILTER_6DB: Long = 0
        const val FILTER_12DB: Long = 1
        const val FILTER_18DB: Long = 2
        const val FILTER_24DB: Long = 3


    }


    // Properties
    open var cutoffHz: Double
        get() = _icall_Double(getCutoffMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setCutoffMethodBind, this.rawMemory, value)


    open var resonance: Double
        get() = _icall_Double(getResonanceMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setResonanceMethodBind, this.rawMemory, value)


    open var gain: Double
        get() = _icall_Double(getGainMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setGainMethodBind, this.rawMemory, value)


    open var db: Long
        get() = _icall_Long(getDbMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setDbMethodBind, this.rawMemory, value)




    // Methods
    private val setCutoffMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectFilter", "set_cutoff") }
    open fun setCutoff(freq: Double) {
        _icall_Unit_Double(setCutoffMethodBind, this.rawMemory, freq)
    }


    private val getCutoffMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectFilter", "get_cutoff") }
    open fun getCutoff(): Double {
        return _icall_Double(getCutoffMethodBind, this.rawMemory)
    }


    private val setResonanceMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectFilter", "set_resonance") }
    open fun setResonance(amount: Double) {
        _icall_Unit_Double(setResonanceMethodBind, this.rawMemory, amount)
    }


    private val getResonanceMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectFilter", "get_resonance") }
    open fun getResonance(): Double {
        return _icall_Double(getResonanceMethodBind, this.rawMemory)
    }


    private val setGainMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectFilter", "set_gain") }
    open fun setGain(amount: Double) {
        _icall_Unit_Double(setGainMethodBind, this.rawMemory, amount)
    }


    private val getGainMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectFilter", "get_gain") }
    open fun getGain(): Double {
        return _icall_Double(getGainMethodBind, this.rawMemory)
    }


    private val setDbMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectFilter", "set_db") }
    open fun setDb(amount: Long) {
        _icall_Unit_Long(setDbMethodBind, this.rawMemory, amount)
    }


    private val getDbMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectFilter", "get_db") }
    open fun getDb(): AudioEffectFilter.FilterDB {
        return AudioEffectFilter.FilterDB.fromInt(_icall_Long(getDbMethodBind, this.rawMemory))
    }


}
