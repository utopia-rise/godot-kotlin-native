@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class VisualShaderNodeVectorInterp : VisualShaderNode {
    constructor() : super("VisualShaderNodeVectorInterp")
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
        infix fun from(other: VisualShaderNode): VisualShaderNodeVectorInterp = VisualShaderNodeVectorInterp("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): VisualShaderNodeVectorInterp = VisualShaderNodeVectorInterp("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): VisualShaderNodeVectorInterp = VisualShaderNodeVectorInterp("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): VisualShaderNodeVectorInterp = VisualShaderNodeVectorInterp("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): VisualShaderNodeVectorInterp = fromVariant(VisualShaderNodeVectorInterp(""), other)


        // Constants


    }


    // Properties


    // Methods
}
