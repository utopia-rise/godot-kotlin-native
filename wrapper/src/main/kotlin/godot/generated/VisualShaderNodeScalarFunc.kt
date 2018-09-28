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

    enum class Function(val id: Int) {
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
            fun fromInt(value: Int) = values().single { it.id == value }
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
        const val FUNC_SIN: Int = 0
        const val FUNC_COS: Int = 1
        const val FUNC_TAN: Int = 2
        const val FUNC_ASIN: Int = 3
        const val FUNC_ACOS: Int = 4
        const val FUNC_ATAN: Int = 5
        const val FUNC_SINH: Int = 6
        const val FUNC_COSH: Int = 7
        const val FUNC_TANH: Int = 8
        const val FUNC_LOG: Int = 9
        const val FUNC_EXP: Int = 10
        const val FUNC_SQRT: Int = 11
        const val FUNC_ABS: Int = 12
        const val FUNC_SIGN: Int = 13
        const val FUNC_FLOOR: Int = 14
        const val FUNC_ROUND: Int = 15
        const val FUNC_CEIL: Int = 16
        const val FUNC_FRAC: Int = 17
        const val FUNC_SATURATE: Int = 18
        const val FUNC_NEGATE: Int = 19


    }


    // Properties
    open var function: Int
        get() = _icall_Int(getFunctionMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setFunctionMethodBind, this.rawMemory, value)




    // Methods
    private val setFunctionMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualShaderNodeScalarFunc", "set_function") }
    open fun setFunction(func: Int) {
        _icall_Unit_Int(setFunctionMethodBind, this.rawMemory, func)
    }


    private val getFunctionMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualShaderNodeScalarFunc", "get_function") }
    open fun getFunction(): VisualShaderNodeScalarFunc.Function {
        return VisualShaderNodeScalarFunc.Function.fromInt(_icall_Int(getFunctionMethodBind, this.rawMemory))
    }


}
