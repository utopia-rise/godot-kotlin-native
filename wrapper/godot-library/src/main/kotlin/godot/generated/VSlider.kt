@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class VSlider : Slider {
    constructor() : super("VSlider")
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
        infix fun from(other: Slider): VSlider = VSlider("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Range): VSlider = VSlider("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Control): VSlider = VSlider("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CanvasItem): VSlider = VSlider("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): VSlider = VSlider("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): VSlider = VSlider("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): VSlider = fromVariant(VSlider(""), other)


        // Constants


    }


    // Properties


    // Methods
}
