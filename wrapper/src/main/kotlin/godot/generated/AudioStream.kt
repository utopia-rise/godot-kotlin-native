@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class AudioStream : Resource {
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
        infix fun from(other: Resource): AudioStream = AudioStream("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): AudioStream = AudioStream("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): AudioStream = AudioStream("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): AudioStream = fromVariant(AudioStream(""), other)


        // Constants


    }


    // Properties


    // Methods
    private val getLengthMethodBind: CPointer<godot_method_bind> by lazy { getMB("AudioStream", "get_length") }
    open fun getLength(): Float {
        return _icall_Float(getLengthMethodBind, this.rawMemory)
    }


}
