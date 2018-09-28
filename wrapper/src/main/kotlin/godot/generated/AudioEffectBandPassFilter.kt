@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class AudioEffectBandPassFilter : AudioEffectFilter {
    constructor() : super("AudioEffectBandPassFilter")
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
        infix fun from(other: AudioEffectFilter): AudioEffectBandPassFilter = AudioEffectBandPassFilter("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: AudioEffect): AudioEffectBandPassFilter = AudioEffectBandPassFilter("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): AudioEffectBandPassFilter = AudioEffectBandPassFilter("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): AudioEffectBandPassFilter = AudioEffectBandPassFilter("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): AudioEffectBandPassFilter = AudioEffectBandPassFilter("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): AudioEffectBandPassFilter = fromVariant(AudioEffectBandPassFilter(""), other)


        // Constants


    }


    // Properties


    // Methods
}
