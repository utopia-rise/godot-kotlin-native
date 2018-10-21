@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class AudioEffectEQ21 : AudioEffectEQ {
    constructor() : super("AudioEffectEQ21")
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
        infix fun from(other: AudioEffectEQ): AudioEffectEQ21 = AudioEffectEQ21("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: AudioEffect): AudioEffectEQ21 = AudioEffectEQ21("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): AudioEffectEQ21 = AudioEffectEQ21("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): AudioEffectEQ21 = AudioEffectEQ21("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): AudioEffectEQ21 = AudioEffectEQ21("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): AudioEffectEQ21 = fromVariant(AudioEffectEQ21(""), other)


        // Constants


    }


    // Properties


    // Methods
}
