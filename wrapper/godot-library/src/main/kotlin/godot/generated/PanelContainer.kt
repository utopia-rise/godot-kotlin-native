@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class PanelContainer : Container {
    constructor() : super("PanelContainer")
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
        infix fun from(other: Container): PanelContainer = PanelContainer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Control): PanelContainer = PanelContainer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CanvasItem): PanelContainer = PanelContainer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): PanelContainer = PanelContainer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): PanelContainer = PanelContainer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): PanelContainer = fromVariant(PanelContainer(""), other)


        // Constants


    }


    // Properties


    // Methods
}
