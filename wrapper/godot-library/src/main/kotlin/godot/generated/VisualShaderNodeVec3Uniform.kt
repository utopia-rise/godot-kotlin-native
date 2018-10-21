@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class VisualShaderNodeVec3Uniform : VisualShaderNodeUniform {
    constructor() : super("VisualShaderNodeVec3Uniform")
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
        infix fun from(other: VisualShaderNodeUniform): VisualShaderNodeVec3Uniform = VisualShaderNodeVec3Uniform("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: VisualShaderNode): VisualShaderNodeVec3Uniform = VisualShaderNodeVec3Uniform("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): VisualShaderNodeVec3Uniform = VisualShaderNodeVec3Uniform("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): VisualShaderNodeVec3Uniform = VisualShaderNodeVec3Uniform("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): VisualShaderNodeVec3Uniform = VisualShaderNodeVec3Uniform("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): VisualShaderNodeVec3Uniform = fromVariant(VisualShaderNodeVec3Uniform(""), other)


        // Constants


    }


    // Properties


    // Methods
}
