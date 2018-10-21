@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class AudioStreamPlayback : Reference {
    private constructor() : super("")
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
        infix fun from(other: Reference): AudioStreamPlayback = AudioStreamPlayback("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): AudioStreamPlayback = AudioStreamPlayback("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): AudioStreamPlayback = fromVariant(AudioStreamPlayback(""), other)


        // Constants


    }


    // Properties


    // Methods
}
