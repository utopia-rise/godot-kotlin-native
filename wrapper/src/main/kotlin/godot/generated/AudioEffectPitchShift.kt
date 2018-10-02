@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class AudioEffectPitchShift : AudioEffect {
    constructor() : super("AudioEffectPitchShift")
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
        infix fun from(other: AudioEffect): AudioEffectPitchShift = AudioEffectPitchShift("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): AudioEffectPitchShift = AudioEffectPitchShift("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): AudioEffectPitchShift = AudioEffectPitchShift("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): AudioEffectPitchShift = AudioEffectPitchShift("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): AudioEffectPitchShift = fromVariant(AudioEffectPitchShift(""), other)


        // Constants


    }


    // Properties
    open var pitchScale: Float
        get() = _icall_Float(getPitchScaleMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setPitchScaleMethodBind, this.rawMemory, value)




    // Methods
    private val setPitchScaleMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectPitchShift", "set_pitch_scale") }
    open fun setPitchScale(rate: Float) {
        _icall_Unit_Float(setPitchScaleMethodBind, this.rawMemory, rate)
    }


    private val getPitchScaleMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectPitchShift", "get_pitch_scale") }
    open fun getPitchScale(): Float {
        return _icall_Float(getPitchScaleMethodBind, this.rawMemory)
    }


}
