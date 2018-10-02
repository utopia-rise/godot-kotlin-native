@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class AudioEffectDistortion : AudioEffect {
    constructor() : super("AudioEffectDistortion")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class Mode(val id: Int) {
        MODE_CLIP(0),
        MODE_ATAN(1),
        MODE_LOFI(2),
        MODE_OVERDRIVE(3),
        MODE_WAVESHAPE(4),
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
        infix fun from(other: AudioEffect): AudioEffectDistortion = AudioEffectDistortion("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): AudioEffectDistortion = AudioEffectDistortion("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): AudioEffectDistortion = AudioEffectDistortion("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): AudioEffectDistortion = AudioEffectDistortion("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): AudioEffectDistortion = fromVariant(AudioEffectDistortion(""), other)


        // Constants
        const val MODE_CLIP: Int = 0
        const val MODE_ATAN: Int = 1
        const val MODE_LOFI: Int = 2
        const val MODE_OVERDRIVE: Int = 3
        const val MODE_WAVESHAPE: Int = 4


    }


    // Properties
    open var mode: Int
        get() = _icall_Int(getModeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setModeMethodBind, this.rawMemory, value)


    open var preGain: Float
        get() = _icall_Float(getPreGainMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setPreGainMethodBind, this.rawMemory, value)


    open var keepHfHz: Float
        get() = _icall_Float(getKeepHfHzMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setKeepHfHzMethodBind, this.rawMemory, value)


    open var drive: Float
        get() = _icall_Float(getDriveMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setDriveMethodBind, this.rawMemory, value)


    open var postGain: Float
        get() = _icall_Float(getPostGainMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setPostGainMethodBind, this.rawMemory, value)




    // Methods
    private val setModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectDistortion", "set_mode") }
    open fun setMode(mode: Int) {
        _icall_Unit_Int(setModeMethodBind, this.rawMemory, mode)
    }


    private val getModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectDistortion", "get_mode") }
    open fun getMode(): AudioEffectDistortion.Mode {
        return AudioEffectDistortion.Mode.fromInt(_icall_Int(getModeMethodBind, this.rawMemory))
    }


    private val setPreGainMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectDistortion", "set_pre_gain") }
    open fun setPreGain(preGain: Float) {
        _icall_Unit_Float(setPreGainMethodBind, this.rawMemory, preGain)
    }


    private val getPreGainMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectDistortion", "get_pre_gain") }
    open fun getPreGain(): Float {
        return _icall_Float(getPreGainMethodBind, this.rawMemory)
    }


    private val setKeepHfHzMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectDistortion", "set_keep_hf_hz") }
    open fun setKeepHfHz(keepHfHz: Float) {
        _icall_Unit_Float(setKeepHfHzMethodBind, this.rawMemory, keepHfHz)
    }


    private val getKeepHfHzMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectDistortion", "get_keep_hf_hz") }
    open fun getKeepHfHz(): Float {
        return _icall_Float(getKeepHfHzMethodBind, this.rawMemory)
    }


    private val setDriveMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectDistortion", "set_drive") }
    open fun setDrive(drive: Float) {
        _icall_Unit_Float(setDriveMethodBind, this.rawMemory, drive)
    }


    private val getDriveMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectDistortion", "get_drive") }
    open fun getDrive(): Float {
        return _icall_Float(getDriveMethodBind, this.rawMemory)
    }


    private val setPostGainMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectDistortion", "set_post_gain") }
    open fun setPostGain(postGain: Float) {
        _icall_Unit_Float(setPostGainMethodBind, this.rawMemory, postGain)
    }


    private val getPostGainMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectDistortion", "get_post_gain") }
    open fun getPostGain(): Float {
        return _icall_Float(getPostGainMethodBind, this.rawMemory)
    }


}
