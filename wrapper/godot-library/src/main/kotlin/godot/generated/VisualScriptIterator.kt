@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class VisualScriptIterator : VisualScriptNode {
    constructor() : super("VisualScriptIterator")
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
        infix fun from(other: VisualScriptNode): VisualScriptIterator = VisualScriptIterator("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): VisualScriptIterator = VisualScriptIterator("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): VisualScriptIterator = VisualScriptIterator("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): VisualScriptIterator = VisualScriptIterator("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): VisualScriptIterator = fromVariant(VisualScriptIterator(""), other)


        // Constants


    }


    // Properties


    // Methods
}
