@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class VisualShaderNodeTransformUniform : VisualShaderNodeUniform {
    constructor() : super("VisualShaderNodeTransformUniform")
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
        infix fun from(other: VisualShaderNodeUniform): VisualShaderNodeTransformUniform = VisualShaderNodeTransformUniform("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: VisualShaderNode): VisualShaderNodeTransformUniform = VisualShaderNodeTransformUniform("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): VisualShaderNodeTransformUniform = VisualShaderNodeTransformUniform("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): VisualShaderNodeTransformUniform = VisualShaderNodeTransformUniform("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): VisualShaderNodeTransformUniform = VisualShaderNodeTransformUniform("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): VisualShaderNodeTransformUniform = fromVariant(VisualShaderNodeTransformUniform(""), other)


        // Constants


    }


    // Properties


    // Methods
}
