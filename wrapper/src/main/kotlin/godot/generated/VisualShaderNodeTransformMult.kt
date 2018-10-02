@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class VisualShaderNodeTransformMult : VisualShaderNode {
    constructor() : super("VisualShaderNodeTransformMult")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class Operator(val id: Long) {
        OP_AxB(0),
        OP_BxA(1),
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
        infix fun from(other: VisualShaderNode): VisualShaderNodeTransformMult = VisualShaderNodeTransformMult("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): VisualShaderNodeTransformMult = VisualShaderNodeTransformMult("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): VisualShaderNodeTransformMult = VisualShaderNodeTransformMult("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): VisualShaderNodeTransformMult = VisualShaderNodeTransformMult("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): VisualShaderNodeTransformMult = fromVariant(VisualShaderNodeTransformMult(""), other)


        // Constants
        const val OP_AxB: Long = 0
        const val OP_BxA: Long = 1


    }


    // Properties
    open var operator: Long
        get() = _icall_Long(getOperatorMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setOperatorMethodBind, this.rawMemory, value)




    // Methods
    private val setOperatorMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualShaderNodeTransformMult", "set_operator") }
    open fun setOperator(op: Long) {
        _icall_Unit_Long(setOperatorMethodBind, this.rawMemory, op)
    }


    private val getOperatorMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualShaderNodeTransformMult", "get_operator") }
    open fun getOperator(): VisualShaderNodeTransformMult.Operator {
        return VisualShaderNodeTransformMult.Operator.fromInt(_icall_Long(getOperatorMethodBind, this.rawMemory))
    }


}
