@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class VisualScriptExpression : VisualScriptNode {
    constructor() : super("VisualScriptExpression")
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
        infix fun from(other: VisualScriptNode): VisualScriptExpression = VisualScriptExpression("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): VisualScriptExpression = VisualScriptExpression("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): VisualScriptExpression = VisualScriptExpression("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): VisualScriptExpression = VisualScriptExpression("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): VisualScriptExpression = fromVariant(VisualScriptExpression(""), other)


        // Constants


    }


    // Properties


    // Methods
}
