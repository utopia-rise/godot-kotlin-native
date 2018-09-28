@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class AudioBusLayout : Resource {
    constructor() : super("AudioBusLayout")
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
        infix fun from(other: Resource): AudioBusLayout = AudioBusLayout("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): AudioBusLayout = AudioBusLayout("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): AudioBusLayout = AudioBusLayout("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): AudioBusLayout = fromVariant(AudioBusLayout(""), other)


        // Constants


    }


    // Properties


    // Methods
}
