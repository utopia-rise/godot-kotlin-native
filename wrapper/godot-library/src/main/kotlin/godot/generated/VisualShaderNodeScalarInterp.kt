@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class VisualShaderNodeScalarInterp : VisualShaderNode {
    constructor() : super("VisualShaderNodeScalarInterp")
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
        infix fun from(other: VisualShaderNode): VisualShaderNodeScalarInterp = VisualShaderNodeScalarInterp("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): VisualShaderNodeScalarInterp = VisualShaderNodeScalarInterp("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): VisualShaderNodeScalarInterp = VisualShaderNodeScalarInterp("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): VisualShaderNodeScalarInterp = VisualShaderNodeScalarInterp("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): VisualShaderNodeScalarInterp = fromVariant(VisualShaderNodeScalarInterp(""), other)


        // Constants


    }


    // Properties


    // Methods
}
