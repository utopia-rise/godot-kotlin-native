@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class AudioEffectAmplify : AudioEffect {
    constructor() : super("AudioEffectAmplify")
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
        infix fun from(other: AudioEffect): AudioEffectAmplify = AudioEffectAmplify("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): AudioEffectAmplify = AudioEffectAmplify("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): AudioEffectAmplify = AudioEffectAmplify("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): AudioEffectAmplify = AudioEffectAmplify("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): AudioEffectAmplify = fromVariant(AudioEffectAmplify(""), other)


        // Constants


    }


    // Properties
    open var volumeDb: Double
        get() = _icall_Double(getVolumeDbMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setVolumeDbMethodBind, this.rawMemory, value)




    // Methods
    private val setVolumeDbMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectAmplify", "set_volume_db") }
    open fun setVolumeDb(volume: Double) {
        _icall_Unit_Double(setVolumeDbMethodBind, this.rawMemory, volume)
    }


    private val getVolumeDbMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectAmplify", "get_volume_db") }
    open fun getVolumeDb(): Double {
        return _icall_Double(getVolumeDbMethodBind, this.rawMemory)
    }


}
