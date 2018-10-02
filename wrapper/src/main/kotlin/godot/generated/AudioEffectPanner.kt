@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class AudioEffectPanner : AudioEffect {
    constructor() : super("AudioEffectPanner")
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
        infix fun from(other: AudioEffect): AudioEffectPanner = AudioEffectPanner("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): AudioEffectPanner = AudioEffectPanner("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): AudioEffectPanner = AudioEffectPanner("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): AudioEffectPanner = AudioEffectPanner("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): AudioEffectPanner = fromVariant(AudioEffectPanner(""), other)


        // Constants


    }


    // Properties
    open var pan: Float
        get() = _icall_Float(getPanMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setPanMethodBind, this.rawMemory, value)




    // Methods
    private val setPanMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectPanner", "set_pan") }
    open fun setPan(cpanume: Float) {
        _icall_Unit_Float(setPanMethodBind, this.rawMemory, cpanume)
    }


    private val getPanMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectPanner", "get_pan") }
    open fun getPan(): Float {
        return _icall_Float(getPanMethodBind, this.rawMemory)
    }


}
