@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class AudioEffectHighShelfFilter : AudioEffectFilter {
    constructor() : super("AudioEffectHighShelfFilter")
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
        infix fun from(other: AudioEffectFilter): AudioEffectHighShelfFilter = AudioEffectHighShelfFilter("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: AudioEffect): AudioEffectHighShelfFilter = AudioEffectHighShelfFilter("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): AudioEffectHighShelfFilter = AudioEffectHighShelfFilter("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): AudioEffectHighShelfFilter = AudioEffectHighShelfFilter("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): AudioEffectHighShelfFilter = AudioEffectHighShelfFilter("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): AudioEffectHighShelfFilter = fromVariant(AudioEffectHighShelfFilter(""), other)


        // Constants


    }


    // Properties


    // Methods
}
