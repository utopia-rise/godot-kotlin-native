@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class AudioEffectLimiter : AudioEffect {
    constructor() : super("AudioEffectLimiter")
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
        infix fun from(other: AudioEffect): AudioEffectLimiter = AudioEffectLimiter("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): AudioEffectLimiter = AudioEffectLimiter("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): AudioEffectLimiter = AudioEffectLimiter("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): AudioEffectLimiter = AudioEffectLimiter("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): AudioEffectLimiter = fromVariant(AudioEffectLimiter(""), other)


        // Constants


    }


    // Properties
    open var ceilingDb: Double
        get() = _icall_Double(getCeilingDbMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setCeilingDbMethodBind, this.rawMemory, value)


    open var thresholdDb: Double
        get() = _icall_Double(getThresholdDbMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setThresholdDbMethodBind, this.rawMemory, value)


    open var softClipDb: Double
        get() = _icall_Double(getSoftClipDbMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setSoftClipDbMethodBind, this.rawMemory, value)


    open var softClipRatio: Double
        get() = _icall_Double(getSoftClipRatioMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setSoftClipRatioMethodBind, this.rawMemory, value)




    // Methods
    private val setCeilingDbMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectLimiter", "set_ceiling_db") }
    open fun setCeilingDb(ceiling: Double) {
        _icall_Unit_Double(setCeilingDbMethodBind, this.rawMemory, ceiling)
    }


    private val getCeilingDbMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectLimiter", "get_ceiling_db") }
    open fun getCeilingDb(): Double {
        return _icall_Double(getCeilingDbMethodBind, this.rawMemory)
    }


    private val setThresholdDbMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectLimiter", "set_threshold_db") }
    open fun setThresholdDb(threshold: Double) {
        _icall_Unit_Double(setThresholdDbMethodBind, this.rawMemory, threshold)
    }


    private val getThresholdDbMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectLimiter", "get_threshold_db") }
    open fun getThresholdDb(): Double {
        return _icall_Double(getThresholdDbMethodBind, this.rawMemory)
    }


    private val setSoftClipDbMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectLimiter", "set_soft_clip_db") }
    open fun setSoftClipDb(softClip: Double) {
        _icall_Unit_Double(setSoftClipDbMethodBind, this.rawMemory, softClip)
    }


    private val getSoftClipDbMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectLimiter", "get_soft_clip_db") }
    open fun getSoftClipDb(): Double {
        return _icall_Double(getSoftClipDbMethodBind, this.rawMemory)
    }


    private val setSoftClipRatioMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectLimiter", "set_soft_clip_ratio") }
    open fun setSoftClipRatio(softClip: Double) {
        _icall_Unit_Double(setSoftClipRatioMethodBind, this.rawMemory, softClip)
    }


    private val getSoftClipRatioMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectLimiter", "get_soft_clip_ratio") }
    open fun getSoftClipRatio(): Double {
        return _icall_Double(getSoftClipRatioMethodBind, this.rawMemory)
    }


}
