@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class VisualShaderNodeVec3Constant : VisualShaderNode {
    constructor() : super("VisualShaderNodeVec3Constant")
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
        infix fun from(other: VisualShaderNode): VisualShaderNodeVec3Constant = VisualShaderNodeVec3Constant("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): VisualShaderNodeVec3Constant = VisualShaderNodeVec3Constant("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): VisualShaderNodeVec3Constant = VisualShaderNodeVec3Constant("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): VisualShaderNodeVec3Constant = VisualShaderNodeVec3Constant("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): VisualShaderNodeVec3Constant = fromVariant(VisualShaderNodeVec3Constant(""), other)


        // Constants


    }


    // Properties
    open var constant: Vector3
        get() = _icall_Vector3(getConstantMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Vector3(setConstantMethodBind, this.rawMemory, value)
    open fun constant(shedule: (Vector3) -> Unit): Vector3 = constant.apply {
        shedule(this)
        constant = this
    }




    // Methods
    private val setConstantMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualShaderNodeVec3Constant", "set_constant") }
    open fun setConstant(value: Vector3) {
        _icall_Unit_Vector3(setConstantMethodBind, this.rawMemory, value)
    }


    private val getConstantMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualShaderNodeVec3Constant", "get_constant") }
    open fun getConstant(): Vector3 {
        return _icall_Vector3(getConstantMethodBind, this.rawMemory)
    }


}
