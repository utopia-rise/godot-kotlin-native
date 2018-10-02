@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class VisualScriptSubCall : VisualScriptNode {
    constructor() : super("VisualScriptSubCall")
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
        infix fun from(other: VisualScriptNode): VisualScriptSubCall = VisualScriptSubCall("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): VisualScriptSubCall = VisualScriptSubCall("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): VisualScriptSubCall = VisualScriptSubCall("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): VisualScriptSubCall = VisualScriptSubCall("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): VisualScriptSubCall = fromVariant(VisualScriptSubCall(""), other)


        // Constants


    }


    // Properties


    // Methods
    open fun _subcall(arguments: Variant): Variant {
        throw NotImplementedError("_subcall is not implemented for VisualScriptSubCall")
    }


}
