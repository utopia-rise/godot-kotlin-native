@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
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
    open fun setBandGainDb(bandIdx: Int, volumeDb: Float) {
        _icall_Unit_Int_Float(setBandGainDbMethodBind, this.rawMemory, bandIdx, volumeDb)
    }


    private val getBandGainDbMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectEQ", "get_band_gain_db") }
    open fun getBandGainDb(bandIdx: Int): Float {
        return _icall_Float_Int(getBandGainDbMethodBind, this.rawMemory, bandIdx)
    }


    private val getBandCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectEQ", "get_band_count") }
    open fun getBandCount(): Int {
        return _icall_Int(getBandCountMethodBind, this.rawMemory)
    }


}
