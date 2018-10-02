@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class VisualShaderNodeScalarConstant : VisualShaderNode {
    constructor() : super("VisualShaderNodeScalarConstant")
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
        infix fun from(other: VisualShaderNode): VisualShaderNodeScalarConstant = VisualShaderNodeScalarConstant("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): VisualShaderNodeScalarConstant = VisualShaderNodeScalarConstant("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): VisualShaderNodeScalarConstant = VisualShaderNodeScalarConstant("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): VisualShaderNodeScalarConstant = VisualShaderNodeScalarConstant("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): VisualShaderNodeScalarConstant = fromVariant(VisualShaderNodeScalarConstant(""), other)


        // Constants


    }


    // Properties
    open var constant: Double
        get() = _icall_Double(getConstantMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setConstantMethodBind, this.rawMemory, value)




    // Methods
    private val setConstantMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualShaderNodeScalarConstant", "set_constant") }
    open fun setConstant(value: Double) {
        _icall_Unit_Double(setConstantMethodBind, this.rawMemory, value)
    }


    private val getConstantMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualShaderNodeScalarConstant", "get_constant") }
    open fun getConstant(): Double {
        return _icall_Double(getConstantMethodBind, this.rawMemory)
    }


}
