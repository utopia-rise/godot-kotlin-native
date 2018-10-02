@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class SpotLight : Light {
    constructor() : super("SpotLight")
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
        infix fun from(other: Light): SpotLight = SpotLight("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: VisualInstance): SpotLight = SpotLight("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Spatial): SpotLight = SpotLight("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): SpotLight = SpotLight("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): SpotLight = SpotLight("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): SpotLight = fromVariant(SpotLight(""), other)


        // Constants


    }


    // Properties


    // Methods
}
