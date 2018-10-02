@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
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
    open var ceilingDb: Float
        get() = _icall_Float(getCeilingDbMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setCeilingDbMethodBind, this.rawMemory, value)


    open var thresholdDb: Float
        get() = _icall_Float(getThresholdDbMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setThresholdDbMethodBind, this.rawMemory, value)


    open var softClipDb: Float
        get() = _icall_Float(getSoftClipDbMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setSoftClipDbMethodBind, this.rawMemory, value)


    open var softClipRatio: Float
        get() = _icall_Float(getSoftClipRatioMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setSoftClipRatioMethodBind, this.rawMemory, value)




    // Methods
    private val setCeilingDbMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectLimiter", "set_ceiling_db") }
    open fun setCeilingDb(ceiling: Float) {
        _icall_Unit_Float(setCeilingDbMethodBind, this.rawMemory, ceiling)
    }


    private val getCeilingDbMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectLimiter", "get_ceiling_db") }
    open fun getCeilingDb(): Float {
        return _icall_Float(getCeilingDbMethodBind, this.rawMemory)
    }


    private val setThresholdDbMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectLimiter", "set_threshold_db") }
    open fun setThresholdDb(threshold: Float) {
        _icall_Unit_Float(setThresholdDbMethodBind, this.rawMemory, threshold)
    }


    private val getThresholdDbMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectLimiter", "get_threshold_db") }
    open fun getThresholdDb(): Float {
        return _icall_Float(getThresholdDbMethodBind, this.rawMemory)
    }


    private val setSoftClipDbMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectLimiter", "set_soft_clip_db") }
    open fun setSoftClipDb(softClip: Float) {
        _icall_Unit_Float(setSoftClipDbMethodBind, this.rawMemory, softClip)
    }


    private val getSoftClipDbMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectLimiter", "get_soft_clip_db") }
    open fun getSoftClipDb(): Float {
        return _icall_Float(getSoftClipDbMethodBind, this.rawMemory)
    }


    private val setSoftClipRatioMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectLimiter", "set_soft_clip_ratio") }
    open fun setSoftClipRatio(softClip: Float) {
        _icall_Unit_Float(setSoftClipRatioMethodBind, this.rawMemory, softClip)
    }


    private val getSoftClipRatioMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioEffectLimiter", "get_soft_clip_ratio") }
    open fun getSoftClipRatio(): Float {
        return _icall_Float(getSoftClipRatioMethodBind, this.rawMemory)
    }


}
