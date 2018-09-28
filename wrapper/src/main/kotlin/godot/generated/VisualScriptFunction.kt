@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class VisualScriptFunction : VisualScriptNode {
    constructor() : super("VisualScriptFunction")
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
        infix fun from(other: VisualScriptNode): VisualScriptFunction = VisualScriptFunction("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): VisualScriptFunction = VisualScriptFunction("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): VisualScriptFunction = VisualScriptFunction("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): VisualScriptFunction = VisualScriptFunction("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): VisualScriptFunction = fromVariant(VisualScriptFunction(""), other)


        // Constants


    }


    // Properties


    // Methods
}
