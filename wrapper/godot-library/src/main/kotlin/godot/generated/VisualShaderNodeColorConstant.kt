@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class VisualShaderNodeColorConstant : VisualShaderNode {
    constructor() : super("VisualShaderNodeColorConstant")
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
        infix fun from(other: VisualShaderNode): VisualShaderNodeColorConstant = VisualShaderNodeColorConstant("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): VisualShaderNodeColorConstant = VisualShaderNodeColorConstant("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): VisualShaderNodeColorConstant = VisualShaderNodeColorConstant("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): VisualShaderNodeColorConstant = VisualShaderNodeColorConstant("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): VisualShaderNodeColorConstant = fromVariant(VisualShaderNodeColorConstant(""), other)


        // Constants


    }


    // Properties
    open var constant: Color
        get() = _icall_Color(getConstantMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Color(setConstantMethodBind, this.rawMemory, value)
    open fun constant(shedule: (Color) -> Unit): Color = constant.apply {
        shedule(this)
        constant = this
    }




    // Methods
    private val setConstantMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualShaderNodeColorConstant", "set_constant") }
    open fun setConstant(value: Color) {
        _icall_Unit_Color(setConstantMethodBind, this.rawMemory, value)
    }


    private val getConstantMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualShaderNodeColorConstant", "get_constant") }
    open fun getConstant(): Color {
        return _icall_Color(getConstantMethodBind, this.rawMemory)
    }


}
