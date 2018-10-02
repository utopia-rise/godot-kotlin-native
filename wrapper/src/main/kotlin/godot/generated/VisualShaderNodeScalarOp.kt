@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class VisualShaderNodeScalarOp : VisualShaderNode {
    constructor() : super("VisualShaderNodeScalarOp")
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
        OP_ATAN2(8),
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
        infix fun from(other: VisualShaderNode): VisualShaderNodeScalarOp = VisualShaderNodeScalarOp("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): VisualShaderNodeScalarOp = VisualShaderNodeScalarOp("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): VisualShaderNodeScalarOp = VisualShaderNodeScalarOp("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): VisualShaderNodeScalarOp = VisualShaderNodeScalarOp("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): VisualShaderNodeScalarOp = fromVariant(VisualShaderNodeScalarOp(""), other)


        // Constants
        const val OP_ADD: Long = 0
        const val OP_SUB: Long = 1
        const val OP_MUL: Long = 2
        const val OP_DIV: Long = 3
        const val OP_MOD: Long = 4
        const val OP_POW: Long = 5
        const val OP_MAX: Long = 6
        const val OP_MIN: Long = 7
        const val OP_ATAN2: Long = 8


    }


    // Properties
    open var operator: Long
        get() = _icall_Long(getOperatorMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setOperatorMethodBind, this.rawMemory, value)




    // Methods
    private val setOperatorMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualShaderNodeScalarOp", "set_operator") }
    open fun setOperator(op: Long) {
        _icall_Unit_Long(setOperatorMethodBind, this.rawMemory, op)
    }


    private val getOperatorMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualShaderNodeScalarOp", "get_operator") }
    open fun getOperator(): VisualShaderNodeScalarOp.Operator {
        return VisualShaderNodeScalarOp.Operator.fromInt(_icall_Long(getOperatorMethodBind, this.rawMemory))
    }


}
