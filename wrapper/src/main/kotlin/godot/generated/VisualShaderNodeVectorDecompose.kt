@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class VisualShaderNodeVectorDecompose : VisualShaderNode {
    constructor() : super("VisualShaderNodeVectorDecompose")
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
        infix fun from(other: VisualShaderNode): VisualShaderNodeVectorDecompose = VisualShaderNodeVectorDecompose("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): VisualShaderNodeVectorDecompose = VisualShaderNodeVectorDecompose("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): VisualShaderNodeVectorDecompose = VisualShaderNodeVectorDecompose("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): VisualShaderNodeVectorDecompose = VisualShaderNodeVectorDecompose("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): VisualShaderNodeVectorDecompose = fromVariant(VisualShaderNodeVectorDecompose(""), other)


        // Constants


    }


    // Properties


    // Methods
}
