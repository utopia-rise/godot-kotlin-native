@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class AudioEffectLowPassFilter : AudioEffectFilter {
    constructor() : super("AudioEffectLowPassFilter")
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
        infix fun from(other: AudioEffectFilter): AudioEffectLowPassFilter = AudioEffectLowPassFilter("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: AudioEffect): AudioEffectLowPassFilter = AudioEffectLowPassFilter("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): AudioEffectLowPassFilter = AudioEffectLowPassFilter("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): AudioEffectLowPassFilter = AudioEffectLowPassFilter("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): AudioEffectLowPassFilter = AudioEffectLowPassFilter("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): AudioEffectLowPassFilter = fromVariant(AudioEffectLowPassFilter(""), other)


        // Constants


    }


    // Properties


    // Methods
}
