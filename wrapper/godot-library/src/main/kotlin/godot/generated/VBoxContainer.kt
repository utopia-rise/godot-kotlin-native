@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class VBoxContainer : BoxContainer {
    constructor() : super("VBoxContainer")
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
        infix fun from(other: BoxContainer): VBoxContainer = VBoxContainer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Container): VBoxContainer = VBoxContainer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Control): VBoxContainer = VBoxContainer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CanvasItem): VBoxContainer = VBoxContainer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): VBoxContainer = VBoxContainer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): VBoxContainer = VBoxContainer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): VBoxContainer = fromVariant(VBoxContainer(""), other)


        // Constants


    }


    // Properties


    // Methods
}
