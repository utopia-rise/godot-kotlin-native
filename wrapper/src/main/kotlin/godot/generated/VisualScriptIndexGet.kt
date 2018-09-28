@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class VisualScriptIndexGet : VisualScriptNode {
    constructor() : super("VisualScriptIndexGet")
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
        infix fun from(other: VisualScriptNode): VisualScriptIndexGet = VisualScriptIndexGet("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): VisualScriptIndexGet = VisualScriptIndexGet("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): VisualScriptIndexGet = VisualScriptIndexGet("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): VisualScriptIndexGet = VisualScriptIndexGet("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): VisualScriptIndexGet = fromVariant(VisualScriptIndexGet(""), other)


        // Constants


    }


    // Properties


    // Methods
}
