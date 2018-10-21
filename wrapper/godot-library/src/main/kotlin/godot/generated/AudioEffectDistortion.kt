@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class AudioEffectDistortion : AudioEffect {
    constructor() : super("AudioEffectDistortion")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class Mode(val id: Long) {
        MODE_CLIP(0),
        MODE_ATAN(1),
        MODE_LOFI(2),
        MODE_OVERDRIVE(3),
        MODE_WAVESHAPE(4),
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
        infix fun from(other: AudioEffect): AudioEffectDistortion = AudioEffectDistortion("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): AudioEffectDistortion = AudioEffectDistortion("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): AudioEffectDistortion = AudioEffectDistortion("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): AudioEffectDistortion = AudioEffectDistortion("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): AudioEffectDistortion = fromVariant(AudioEffectDistortion(""), other)


        // Constants
        const val MODE_CLIP: Long = 0
        const val MODE_ATAN: Long = 1
        const val MODE_LOFI: Long = 2
        const val MODE_OVERDRIVE: Long = 3
        const val MODE_WAVESHAPE: Long = 4


    }


    // Properties
    open var mode: Long
        get() = _icall_Long(getModeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setModeMethodBind, this.rawMemory, value)


    open var preGain: Double
        get() = _icall_Double(getPreGainMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setPreGainMethodBind, this.rawMemory, value)


    open var keepHfHz: Double
        get() = _icall_Double(getKeepHfHzMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setKeepHfHzMethodBind, this.rawMemory, value)


    open var drive: Double
        get() = _icall_Double(getDriveMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setDriveMethodBind, this.rawMemory, value)


    open var postGain: Double
        get() = _icall_Double(getPostGainMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setPostGainMethodBind, this.rawMemory, value)




    // Methods
    private val setModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectDistortion", "set_mode") }
    open fun setMode(mode: Long) {
        _icall_Unit_Long(setModeMethodBind, this.rawMemory, mode)
    }


    private val getModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectDistortion", "get_mode") }
    open fun getMode(): AudioEffectDistortion.Mode {
        return AudioEffectDistortion.Mode.fromInt(_icall_Long(getModeMethodBind, this.rawMemory))
    }


    private val setPreGainMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectDistortion", "set_pre_gain") }
    open fun setPreGain(preGain: Double) {
        _icall_Unit_Double(setPreGainMethodBind, this.rawMemory, preGain)
    }


    private val getPreGainMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectDistortion", "get_pre_gain") }
    open fun getPreGain(): Double {
        return _icall_Double(getPreGainMethodBind, this.rawMemory)
    }


    private val setKeepHfHzMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectDistortion", "set_keep_hf_hz") }
    open fun setKeepHfHz(keepHfHz: Double) {
        _icall_Unit_Double(setKeepHfHzMethodBind, this.rawMemory, keepHfHz)
    }


    private val getKeepHfHzMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectDistortion", "get_keep_hf_hz") }
    open fun getKeepHfHz(): Double {
        return _icall_Double(getKeepHfHzMethodBind, this.rawMemory)
    }


    private val setDriveMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectDistortion", "set_drive") }
    open fun setDrive(drive: Double) {
        _icall_Unit_Double(setDriveMethodBind, this.rawMemory, drive)
    }


    private val getDriveMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectDistortion", "get_drive") }
    open fun getDrive(): Double {
        return _icall_Double(getDriveMethodBind, this.rawMemory)
    }


    private val setPostGainMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectDistortion", "set_post_gain") }
    open fun setPostGain(postGain: Double) {
        _icall_Unit_Double(setPostGainMethodBind, this.rawMemory, postGain)
    }


    private val getPostGainMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectDistortion", "get_post_gain") }
    open fun getPostGain(): Double {
        return _icall_Double(getPostGainMethodBind, this.rawMemory)
    }


}
