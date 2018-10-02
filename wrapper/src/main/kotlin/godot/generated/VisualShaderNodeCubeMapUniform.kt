@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class VisualShaderNodeCubeMapUniform : VisualShaderNode {
    constructor() : super("VisualShaderNodeCubeMapUniform")
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
        infix fun from(other: VisualShaderNode): VisualShaderNodeCubeMapUniform = VisualShaderNodeCubeMapUniform("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): VisualShaderNodeCubeMapUniform = VisualShaderNodeCubeMapUniform("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): VisualShaderNodeCubeMapUniform = VisualShaderNodeCubeMapUniform("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): VisualShaderNodeCubeMapUniform = VisualShaderNodeCubeMapUniform("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): VisualShaderNodeCubeMapUniform = fromVariant(VisualShaderNodeCubeMapUniform(""), other)


        // Constants


    }


    // Properties


    // Methods
}
