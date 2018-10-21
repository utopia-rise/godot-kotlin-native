@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class HScrollBar : ScrollBar {
    constructor() : super("HScrollBar")
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
        infix fun from(other: ScrollBar): HScrollBar = HScrollBar("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Range): HScrollBar = HScrollBar("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Control): HScrollBar = HScrollBar("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CanvasItem): HScrollBar = HScrollBar("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): HScrollBar = HScrollBar("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): HScrollBar = HScrollBar("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): HScrollBar = fromVariant(HScrollBar(""), other)


        // Constants


    }


    // Properties


    // Methods
}
