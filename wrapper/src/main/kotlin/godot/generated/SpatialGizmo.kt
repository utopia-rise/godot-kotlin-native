@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class SpatialGizmo : Reference {
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
        infix fun from(other: Reference): SpatialGizmo = SpatialGizmo("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): SpatialGizmo = SpatialGizmo("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): SpatialGizmo = fromVariant(SpatialGizmo(""), other)


        // Constants


    }


    // Properties


    // Methods
}
