@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class ReferenceRect : Control {
    constructor() : super("ReferenceRect")
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
        infix fun from(other: Control): ReferenceRect = ReferenceRect("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CanvasItem): ReferenceRect = ReferenceRect("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): ReferenceRect = ReferenceRect("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): ReferenceRect = ReferenceRect("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): ReferenceRect = fromVariant(ReferenceRect(""), other)


        // Constants


    }


    // Properties


    // Methods
}
