@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class Physics2DServerSW : Physics2DServer {
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
        infix fun from(other: Physics2DServer): Physics2DServerSW = Physics2DServerSW("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): Physics2DServerSW = Physics2DServerSW("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): Physics2DServerSW = fromVariant(Physics2DServerSW(""), other)


        // Constants


    }


    // Properties


    // Methods
}
