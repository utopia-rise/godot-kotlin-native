@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class ToolButton : Button {
    constructor() : super("ToolButton")
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
        infix fun from(other: Button): ToolButton = ToolButton("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: BaseButton): ToolButton = ToolButton("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Control): ToolButton = ToolButton("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CanvasItem): ToolButton = ToolButton("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): ToolButton = ToolButton("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): ToolButton = ToolButton("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): ToolButton = fromVariant(ToolButton(""), other)


        // Constants


    }


    // Properties


    // Methods
}
