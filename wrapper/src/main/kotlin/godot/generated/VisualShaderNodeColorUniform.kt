@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class VisualShaderNodeColorUniform : VisualShaderNodeUniform {
    constructor() : super("VisualShaderNodeColorUniform")
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
        infix fun from(other: VisualShaderNodeUniform): VisualShaderNodeColorUniform = VisualShaderNodeColorUniform("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: VisualShaderNode): VisualShaderNodeColorUniform = VisualShaderNodeColorUniform("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): VisualShaderNodeColorUniform = VisualShaderNodeColorUniform("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): VisualShaderNodeColorUniform = VisualShaderNodeColorUniform("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): VisualShaderNodeColorUniform = VisualShaderNodeColorUniform("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): VisualShaderNodeColorUniform = fromVariant(VisualShaderNodeColorUniform(""), other)


        // Constants


    }


    // Properties


    // Methods
}
