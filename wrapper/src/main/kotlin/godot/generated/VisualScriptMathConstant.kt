@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class VisualScriptMathConstant : VisualScriptNode {
    constructor() : super("VisualScriptMathConstant")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class MathConstant(val id: Int) {
        MATH_CONSTANT_ONE(0),
        MATH_CONSTANT_PI(1),
        MATH_CONSTANT_HALF_PI(2),
        MATH_CONSTANT_TAU(3),
        MATH_CONSTANT_E(4),
        MATH_CONSTANT_SQRT2(5),
        MATH_CONSTANT_INF(6),
        MATH_CONSTANT_NAN(7),
        MATH_CONSTANT_MAX(8),
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
        infix fun from(other: VisualScriptNode): VisualScriptMathConstant = VisualScriptMathConstant("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): VisualScriptMathConstant = VisualScriptMathConstant("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): VisualScriptMathConstant = VisualScriptMathConstant("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): VisualScriptMathConstant = VisualScriptMathConstant("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): VisualScriptMathConstant = fromVariant(VisualScriptMathConstant(""), other)


        // Constants
        const val MATH_CONSTANT_ONE: Int = 0
        const val MATH_CONSTANT_PI: Int = 1
        const val MATH_CONSTANT_HALF_PI: Int = 2
        const val MATH_CONSTANT_TAU: Int = 3
        const val MATH_CONSTANT_E: Int = 4
        const val MATH_CONSTANT_SQRT2: Int = 5
        const val MATH_CONSTANT_INF: Int = 6
        const val MATH_CONSTANT_NAN: Int = 7
        const val MATH_CONSTANT_MAX: Int = 8


    }


    // Properties
    open var constant: Int
        get() = _icall_Int(getMathConstantMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setMathConstantMethodBind, this.rawMemory, value)




    // Methods
    private val setMathConstantMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptMathConstant", "set_math_constant") }
    open fun setMathConstant(which: Int) {
        _icall_Unit_Int(setMathConstantMethodBind, this.rawMemory, which)
    }


    private val getMathConstantMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptMathConstant", "get_math_constant") }
    open fun getMathConstant(): VisualScriptMathConstant.MathConstant {
        return VisualScriptMathConstant.MathConstant.fromInt(_icall_Int(getMathConstantMethodBind, this.rawMemory))
    }


}
