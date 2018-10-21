@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class PopupDialog : Popup {
    constructor() : super("PopupDialog")
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
        infix fun from(other: Popup): PopupDialog = PopupDialog("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Control): PopupDialog = PopupDialog("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CanvasItem): PopupDialog = PopupDialog("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): PopupDialog = PopupDialog("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): PopupDialog = PopupDialog("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): PopupDialog = fromVariant(PopupDialog(""), other)


        // Constants


    }


    // Properties


    // Methods
}
