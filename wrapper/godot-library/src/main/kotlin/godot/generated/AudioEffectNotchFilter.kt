@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class AudioEffectNotchFilter : AudioEffectFilter {
    constructor() : super("AudioEffectNotchFilter")
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
        infix fun from(other: AudioEffectFilter): AudioEffectNotchFilter = AudioEffectNotchFilter("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: AudioEffect): AudioEffectNotchFilter = AudioEffectNotchFilter("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): AudioEffectNotchFilter = AudioEffectNotchFilter("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): AudioEffectNotchFilter = AudioEffectNotchFilter("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): AudioEffectNotchFilter = AudioEffectNotchFilter("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): AudioEffectNotchFilter = fromVariant(AudioEffectNotchFilter(""), other)


        // Constants


    }


    // Properties


    // Methods
}
