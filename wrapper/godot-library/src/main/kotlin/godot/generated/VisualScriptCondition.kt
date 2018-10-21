@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class VisualScriptCondition : VisualScriptNode {
    constructor() : super("VisualScriptCondition")
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
        infix fun from(other: VisualScriptNode): VisualScriptCondition = VisualScriptCondition("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): VisualScriptCondition = VisualScriptCondition("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): VisualScriptCondition = VisualScriptCondition("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): VisualScriptCondition = VisualScriptCondition("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): VisualScriptCondition = fromVariant(VisualScriptCondition(""), other)


        // Constants


    }


    // Properties


    // Methods
}
