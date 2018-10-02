@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class PopupPanel : Popup {
    constructor() : super("PopupPanel")
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
        infix fun from(other: Popup): PopupPanel = PopupPanel("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Control): PopupPanel = PopupPanel("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CanvasItem): PopupPanel = PopupPanel("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): PopupPanel = PopupPanel("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): PopupPanel = PopupPanel("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): PopupPanel = fromVariant(PopupPanel(""), other)


        // Constants


    }


    // Properties


    // Methods
}
