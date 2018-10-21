@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class CheckBox : Button {
    constructor() : super("CheckBox")
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
        infix fun from(other: Button): CheckBox = CheckBox("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: BaseButton): CheckBox = CheckBox("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Control): CheckBox = CheckBox("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CanvasItem): CheckBox = CheckBox("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): CheckBox = CheckBox("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): CheckBox = CheckBox("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): CheckBox = fromVariant(CheckBox(""), other)


        // Constants


    }


    // Properties


    // Methods
}
