@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class VScrollBar : ScrollBar {
    constructor() : super("VScrollBar")
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
        infix fun from(other: ScrollBar): VScrollBar = VScrollBar("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Range): VScrollBar = VScrollBar("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Control): VScrollBar = VScrollBar("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CanvasItem): VScrollBar = VScrollBar("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): VScrollBar = VScrollBar("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): VScrollBar = VScrollBar("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): VScrollBar = fromVariant(VScrollBar(""), other)


        // Constants


    }


    // Properties


    // Methods
}
