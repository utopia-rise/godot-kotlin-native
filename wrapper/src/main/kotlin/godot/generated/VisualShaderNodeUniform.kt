@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class VisualShaderNodeUniform : VisualShaderNode {
    private constructor() : super("")
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
        infix fun from(other: VisualShaderNode): VisualShaderNodeUniform = VisualShaderNodeUniform("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): VisualShaderNodeUniform = VisualShaderNodeUniform("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): VisualShaderNodeUniform = VisualShaderNodeUniform("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): VisualShaderNodeUniform = VisualShaderNodeUniform("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): VisualShaderNodeUniform = fromVariant(VisualShaderNodeUniform(""), other)


        // Constants


    }


    // Properties
    open var uniformName: String
        get() = _icall_String(getUniformNameMethodBind, this.rawMemory)
        set(value) = _icall_Unit_String(setUniformNameMethodBind, this.rawMemory, value)




    // Methods
    private val setUniformNameMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualShaderNodeUniform", "set_uniform_name") }
    open fun setUniformName(name: String) {
        _icall_Unit_String(setUniformNameMethodBind, this.rawMemory, name)
    }


    private val getUniformNameMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualShaderNodeUniform", "get_uniform_name") }
    open fun getUniformName(): String {
        return _icall_String(getUniformNameMethodBind, this.rawMemory)
    }


}
