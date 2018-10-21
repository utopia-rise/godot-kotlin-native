@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class AudioEffectEQ : AudioEffect {
    constructor() : super("AudioEffectEQ")
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
        infix fun from(other: AudioEffect): AudioEffectEQ = AudioEffectEQ("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): AudioEffectEQ = AudioEffectEQ("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): AudioEffectEQ = AudioEffectEQ("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): AudioEffectEQ = AudioEffectEQ("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): AudioEffectEQ = fromVariant(AudioEffectEQ(""), other)


        // Constants


    }


    // Properties


    // Methods
    private val setBandGainDbMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectEQ", "set_band_gain_db") }
    open fun setBandGainDb(bandIdx: Long, volumeDb: Double) {
        _icall_Unit_Long_Double(setBandGainDbMethodBind, this.rawMemory, bandIdx, volumeDb)
    }


    private val getBandGainDbMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectEQ", "get_band_gain_db") }
    open fun getBandGainDb(bandIdx: Long): Double {
        return _icall_Double_Long(getBandGainDbMethodBind, this.rawMemory, bandIdx)
    }


    private val getBandCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectEQ", "get_band_count") }
    open fun getBandCount(): Long {
        return _icall_Long(getBandCountMethodBind, this.rawMemory)
    }


}
