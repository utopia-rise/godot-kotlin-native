@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class AudioEffectBandLimitFilter : AudioEffectFilter {
    constructor() : super("AudioEffectBandLimitFilter")
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
        infix fun from(other: AudioEffectFilter): AudioEffectBandLimitFilter = AudioEffectBandLimitFilter("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: AudioEffect): AudioEffectBandLimitFilter = AudioEffectBandLimitFilter("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): AudioEffectBandLimitFilter = AudioEffectBandLimitFilter("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): AudioEffectBandLimitFilter = AudioEffectBandLimitFilter("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): AudioEffectBandLimitFilter = AudioEffectBandLimitFilter("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): AudioEffectBandLimitFilter = fromVariant(AudioEffectBandLimitFilter(""), other)


        // Constants


    }


    // Properties


    // Methods
}
