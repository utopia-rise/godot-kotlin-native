@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class CheckButton : Button {
    constructor() : super("CheckButton")
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
        infix fun from(other: Button): CheckButton = CheckButton("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: BaseButton): CheckButton = CheckButton("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Control): CheckButton = CheckButton("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CanvasItem): CheckButton = CheckButton("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): CheckButton = CheckButton("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): CheckButton = CheckButton("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): CheckButton = fromVariant(CheckButton(""), other)


        // Constants


    }


    // Properties


    // Methods
}
