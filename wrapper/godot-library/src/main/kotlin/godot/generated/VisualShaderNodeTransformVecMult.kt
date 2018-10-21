@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class VisualShaderNodeTransformVecMult : VisualShaderNode {
    constructor() : super("VisualShaderNodeTransformVecMult")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class Operator(val id: Long) {
        OP_AxB(0),
        OP_BxA(1),
        OP_3x3_AxB(2),
        OP_3x3_BxA(3),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }


    // Signals
    class Signal {
        companion object {
        }
    }


    companion object {
        infix fun from(other: VisualShaderNode): VisualShaderNodeTransformVecMult = VisualShaderNodeTransformVecMult("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): VisualShaderNodeTransformVecMult = VisualShaderNodeTransformVecMult("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): VisualShaderNodeTransformVecMult = VisualShaderNodeTransformVecMult("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): VisualShaderNodeTransformVecMult = VisualShaderNodeTransformVecMult("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): VisualShaderNodeTransformVecMult = fromVariant(VisualShaderNodeTransformVecMult(""), other)


        // Constants
        const val OP_AxB: Long = 0
        const val OP_BxA: Long = 1
        const val OP_3x3_AxB: Long = 2
        const val OP_3x3_BxA: Long = 3


    }


    // Properties
    open var operator: Long
        get() = _icall_Long(getOperatorMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setOperatorMethodBind, this.rawMemory, value)




    // Methods
    private val setOperatorMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualShaderNodeTransformVecMult", "set_operator") }
    open fun setOperator(op: Long) {
        _icall_Unit_Long(setOperatorMethodBind, this.rawMemory, op)
    }


    private val getOperatorMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualShaderNodeTransformVecMult", "get_operator") }
    open fun getOperator(): VisualShaderNodeTransformVecMult.Operator {
        return VisualShaderNodeTransformVecMult.Operator.fromInt(_icall_Long(getOperatorMethodBind, this.rawMemory))
    }


}
