@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class VisualShaderNodeScalarFunc : VisualShaderNode {
    constructor() : super("VisualShaderNodeScalarFunc")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class Function(val id: Long) {
        FUNC_SIN(0),
        FUNC_COS(1),
        FUNC_TAN(2),
        FUNC_ASIN(3),
        FUNC_ACOS(4),
        FUNC_ATAN(5),
        FUNC_SINH(6),
        FUNC_COSH(7),
        FUNC_TANH(8),
        FUNC_LOG(9),
        FUNC_EXP(10),
        FUNC_SQRT(11),
        FUNC_ABS(12),
        FUNC_SIGN(13),
        FUNC_FLOOR(14),
        FUNC_ROUND(15),
        FUNC_CEIL(16),
        FUNC_FRAC(17),
        FUNC_SATURATE(18),
        FUNC_NEGATE(19),
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
        infix fun from(other: VisualShaderNode): VisualShaderNodeScalarFunc = VisualShaderNodeScalarFunc("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): VisualShaderNodeScalarFunc = VisualShaderNodeScalarFunc("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): VisualShaderNodeScalarFunc = VisualShaderNodeScalarFunc("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): VisualShaderNodeScalarFunc = VisualShaderNodeScalarFunc("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): VisualShaderNodeScalarFunc = fromVariant(VisualShaderNodeScalarFunc(""), other)


        // Constants
        const val FUNC_SIN: Long = 0
        const val FUNC_COS: Long = 1
        const val FUNC_TAN: Long = 2
        const val FUNC_ASIN: Long = 3
        const val FUNC_ACOS: Long = 4
        const val FUNC_ATAN: Long = 5
        const val FUNC_SINH: Long = 6
        const val FUNC_COSH: Long = 7
        const val FUNC_TANH: Long = 8
        const val FUNC_LOG: Long = 9
        const val FUNC_EXP: Long = 10
        const val FUNC_SQRT: Long = 11
        const val FUNC_ABS: Long = 12
        const val FUNC_SIGN: Long = 13
        const val FUNC_FLOOR: Long = 14
        const val FUNC_ROUND: Long = 15
        const val FUNC_CEIL: Long = 16
        const val FUNC_FRAC: Long = 17
        const val FUNC_SATURATE: Long = 18
        const val FUNC_NEGATE: Long = 19


    }


    // Properties
    open var function: Long
        get() = _icall_Long(getFunctionMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setFunctionMethodBind, this.rawMemory, value)




    // Methods
    private val setFunctionMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualShaderNodeScalarFunc", "set_function") }
    open fun setFunction(func: Long) {
        _icall_Unit_Long(setFunctionMethodBind, this.rawMemory, func)
    }


    private val getFunctionMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualShaderNodeScalarFunc", "get_function") }
    open fun getFunction(): VisualShaderNodeScalarFunc.Function {
        return VisualShaderNodeScalarFunc.Function.fromInt(_icall_Long(getFunctionMethodBind, this.rawMemory))
    }


}
