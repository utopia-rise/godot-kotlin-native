@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class VisualShaderNodeColorOp : VisualShaderNode {
    constructor() : super("VisualShaderNodeColorOp")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class Operator(val id: Long) {
        OP_SCREEN(0),
        OP_DIFFERENCE(1),
        OP_DARKEN(2),
        OP_LIGHTEN(3),
        OP_OVERLAY(4),
        OP_DODGE(5),
        OP_BURN(6),
        OP_SOFT_LIGHT(7),
        OP_HARD_LIGHT(8),
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
        infix fun from(other: VisualShaderNode): VisualShaderNodeColorOp = VisualShaderNodeColorOp("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): VisualShaderNodeColorOp = VisualShaderNodeColorOp("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): VisualShaderNodeColorOp = VisualShaderNodeColorOp("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): VisualShaderNodeColorOp = VisualShaderNodeColorOp("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): VisualShaderNodeColorOp = fromVariant(VisualShaderNodeColorOp(""), other)


        // Constants
        const val OP_SCREEN: Long = 0
        const val OP_DIFFERENCE: Long = 1
        const val OP_DARKEN: Long = 2
        const val OP_LIGHTEN: Long = 3
        const val OP_OVERLAY: Long = 4
        const val OP_DODGE: Long = 5
        const val OP_BURN: Long = 6
        const val OP_SOFT_LIGHT: Long = 7
        const val OP_HARD_LIGHT: Long = 8


    }


    // Properties
    open var operator: Long
        get() = _icall_Long(getOperatorMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setOperatorMethodBind, this.rawMemory, value)




    // Methods
    private val setOperatorMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualShaderNodeColorOp", "set_operator") }
    open fun setOperator(op: Long) {
        _icall_Unit_Long(setOperatorMethodBind, this.rawMemory, op)
    }


    private val getOperatorMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualShaderNodeColorOp", "get_operator") }
    open fun getOperator(): VisualShaderNodeColorOp.Operator {
        return VisualShaderNodeColorOp.Operator.fromInt(_icall_Long(getOperatorMethodBind, this.rawMemory))
    }


}
