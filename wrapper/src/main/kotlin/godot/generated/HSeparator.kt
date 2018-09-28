@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class HSeparator : Separator {
    constructor() : super("HSeparator")
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
        infix fun from(other: Separator): HSeparator = HSeparator("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Control): HSeparator = HSeparator("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CanvasItem): HSeparator = HSeparator("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): HSeparator = HSeparator("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): HSeparator = HSeparator("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): HSeparator = fromVariant(HSeparator(""), other)


        // Constants


    }


    // Properties


    // Methods
}
