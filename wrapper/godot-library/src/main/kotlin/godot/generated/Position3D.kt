@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class Position3D : Spatial {
    constructor() : super("Position3D")
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
        infix fun from(other: Spatial): Position3D = Position3D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): Position3D = Position3D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): Position3D = Position3D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): Position3D = fromVariant(Position3D(""), other)


        // Constants


    }


    // Properties


    // Methods
}
