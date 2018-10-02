@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class VisualShaderNodeVectorOp : VisualShaderNode {
    constructor() : super("VisualShaderNodeVectorOp")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class Operator(val id: Long) {
        OP_ADD(0),
        OP_SUB(1),
        OP_MUL(2),
        OP_DIV(3),
        OP_MOD(4),
        OP_POW(5),
        OP_MAX(6),
        OP_MIN(7),
        OP_CROSS(8),
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
        infix fun from(other: VisualShaderNode): VisualShaderNodeVectorOp = VisualShaderNodeVectorOp("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): VisualShaderNodeVectorOp = VisualShaderNodeVectorOp("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): VisualShaderNodeVectorOp = VisualShaderNodeVectorOp("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): VisualShaderNodeVectorOp = VisualShaderNodeVectorOp("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): VisualShaderNodeVectorOp = fromVariant(VisualShaderNodeVectorOp(""), other)


        // Constants
        const val OP_ADD: Long = 0
        const val OP_SUB: Long = 1
        const val OP_MUL: Long = 2
        const val OP_DIV: Long = 3
        const val OP_MOD: Long = 4
        const val OP_POW: Long = 5
        const val OP_MAX: Long = 6
        const val OP_MIN: Long = 7
        const val OP_CROSS: Long = 8


    }


    // Properties
    open var operator: Long
        get() = _icall_Long(getOperatorMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setOperatorMethodBind, this.rawMemory, value)




    // Methods
    private val setOperatorMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualShaderNodeVectorOp", "set_operator") }
    open fun setOperator(op: Long) {
        _icall_Unit_Long(setOperatorMethodBind, this.rawMemory, op)
    }


    private val getOperatorMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualShaderNodeVectorOp", "get_operator") }
    open fun getOperator(): VisualShaderNodeVectorOp.Operator {
        return VisualShaderNodeVectorOp.Operator.fromInt(_icall_Long(getOperatorMethodBind, this.rawMemory))
    }


}
