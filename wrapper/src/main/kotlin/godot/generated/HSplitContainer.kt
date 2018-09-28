@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class HSplitContainer : SplitContainer {
    constructor() : super("HSplitContainer")
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
        infix fun from(other: SplitContainer): HSplitContainer = HSplitContainer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Container): HSplitContainer = HSplitContainer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Control): HSplitContainer = HSplitContainer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CanvasItem): HSplitContainer = HSplitContainer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): HSplitContainer = HSplitContainer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): HSplitContainer = HSplitContainer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): HSplitContainer = fromVariant(HSplitContainer(""), other)


        // Constants


    }


    // Properties


    // Methods
}
