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

    enum class Operator(val id: Int) {
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
            fun fromInt(value: Int) = values().single { it.id == value }
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
        const val OP_ADD: Int = 0
        const val OP_SUB: Int = 1
        const val OP_MUL: Int = 2
        const val OP_DIV: Int = 3
        const val OP_MOD: Int = 4
        const val OP_POW: Int = 5
        const val OP_MAX: Int = 6
        const val OP_MIN: Int = 7
        const val OP_ATAN2: Int = 8


    }


    // Properties
    open var operator: Int
        get() = _icall_Int(getOperatorMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setOperatorMethodBind, this.rawMemory, value)




    // Methods
    private val setOperatorMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualShaderNodeScalarOp", "set_operator") }
    open fun setOperator(op: Int) {
        _icall_Unit_Int(setOperatorMethodBind, this.rawMemory, op)
    }


    private val getOperatorMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualShaderNodeScalarOp", "get_operator") }
    open fun getOperator(): VisualShaderNodeScalarOp.Operator {
        return VisualShaderNodeScalarOp.Operator.fromInt(_icall_Int(getOperatorMethodBind, this.rawMemory))
    }


}
