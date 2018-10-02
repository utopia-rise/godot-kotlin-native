@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class Shape : Resource {
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
        infix fun from(other: Resource): Shape = Shape("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): Shape = Shape("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): Shape = Shape("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): Shape = fromVariant(Shape(""), other)


        // Constants


    }


    // Properties


    // Methods
}
