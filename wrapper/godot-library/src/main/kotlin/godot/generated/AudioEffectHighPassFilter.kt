@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class AudioEffectHighPassFilter : AudioEffectFilter {
    constructor() : super("AudioEffectHighPassFilter")
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
        infix fun from(other: AudioEffectFilter): AudioEffectHighPassFilter = AudioEffectHighPassFilter("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: AudioEffect): AudioEffectHighPassFilter = AudioEffectHighPassFilter("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): AudioEffectHighPassFilter = AudioEffectHighPassFilter("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): AudioEffectHighPassFilter = AudioEffectHighPassFilter("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): AudioEffectHighPassFilter = AudioEffectHighPassFilter("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): AudioEffectHighPassFilter = fromVariant(AudioEffectHighPassFilter(""), other)


        // Constants


    }


    // Properties


    // Methods
}
