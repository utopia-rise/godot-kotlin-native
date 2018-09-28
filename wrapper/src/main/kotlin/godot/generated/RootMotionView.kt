@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class RootMotionView : VisualInstance {
    private constructor() : super("")
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
        infix fun from(other: VisualInstance): RootMotionView = RootMotionView("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Spatial): RootMotionView = RootMotionView("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): RootMotionView = RootMotionView("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): RootMotionView = RootMotionView("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): RootMotionView = fromVariant(RootMotionView(""), other)


        // Constants


    }


    // Properties


    // Methods
}
