@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class CSGCombiner : CSGShape {
    constructor() : super("CSGCombiner")
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
        infix fun from(other: CSGShape): CSGCombiner = CSGCombiner("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: VisualInstance): CSGCombiner = CSGCombiner("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Spatial): CSGCombiner = CSGCombiner("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): CSGCombiner = CSGCombiner("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): CSGCombiner = CSGCombiner("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): CSGCombiner = fromVariant(CSGCombiner(""), other)


        // Constants


    }


    // Properties


    // Methods
}
