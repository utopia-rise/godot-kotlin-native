@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class VSeparator : Separator {
    constructor() : super("VSeparator")
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
        infix fun from(other: Separator): VSeparator = VSeparator("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Control): VSeparator = VSeparator("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CanvasItem): VSeparator = VSeparator("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): VSeparator = VSeparator("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): VSeparator = VSeparator("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): VSeparator = fromVariant(VSeparator(""), other)


        // Constants


    }


    // Properties


    // Methods
}
