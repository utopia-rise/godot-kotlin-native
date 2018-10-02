@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class AudioEffectEQ10 : AudioEffectEQ {
    constructor() : super("AudioEffectEQ10")
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
        infix fun from(other: AudioEffectEQ): AudioEffectEQ10 = AudioEffectEQ10("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: AudioEffect): AudioEffectEQ10 = AudioEffectEQ10("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): AudioEffectEQ10 = AudioEffectEQ10("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): AudioEffectEQ10 = AudioEffectEQ10("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): AudioEffectEQ10 = AudioEffectEQ10("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): AudioEffectEQ10 = fromVariant(AudioEffectEQ10(""), other)


        // Constants


    }


    // Properties


    // Methods
}
