@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class VisualShaderNodeTransformConstant : VisualShaderNode {
    constructor() : super("VisualShaderNodeTransformConstant")
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
        infix fun from(other: VisualShaderNode): VisualShaderNodeTransformConstant = VisualShaderNodeTransformConstant("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): VisualShaderNodeTransformConstant = VisualShaderNodeTransformConstant("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): VisualShaderNodeTransformConstant = VisualShaderNodeTransformConstant("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): VisualShaderNodeTransformConstant = VisualShaderNodeTransformConstant("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): VisualShaderNodeTransformConstant = fromVariant(VisualShaderNodeTransformConstant(""), other)


        // Constants


    }


    // Properties
    open var constant: Transform
        get() = _icall_Transform(getConstantMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Transform(setConstantMethodBind, this.rawMemory, value)
    open fun constant(shedule: (Transform) -> Unit): Transform = constant.apply {
        shedule(this)
        constant = this
    }




    // Methods
    private val setConstantMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualShaderNodeTransformConstant", "set_constant") }
    open fun setConstant(value: Transform) {
        _icall_Unit_Transform(setConstantMethodBind, this.rawMemory, value)
    }


    private val getConstantMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualShaderNodeTransformConstant", "get_constant") }
    open fun getConstant(): Transform {
        return _icall_Transform(getConstantMethodBind, this.rawMemory)
    }


}
