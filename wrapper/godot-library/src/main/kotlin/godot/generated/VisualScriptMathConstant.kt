@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class VisualScriptMathConstant : VisualScriptNode {
    constructor() : super("VisualScriptMathConstant")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class MathConstant(val id: Long) {
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
            fun fromInt(value: Long) = values().single { it.id == value }
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
        const val MATH_CONSTANT_ONE: Long = 0
        const val MATH_CONSTANT_PI: Long = 1
        const val MATH_CONSTANT_HALF_PI: Long = 2
        const val MATH_CONSTANT_TAU: Long = 3
        const val MATH_CONSTANT_E: Long = 4
        const val MATH_CONSTANT_SQRT2: Long = 5
        const val MATH_CONSTANT_INF: Long = 6
        const val MATH_CONSTANT_NAN: Long = 7
        const val MATH_CONSTANT_MAX: Long = 8


    }


    // Properties
    open var constant: Long
        get() = _icall_Long(getMathConstantMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setMathConstantMethodBind, this.rawMemory, value)




    // Methods
    private val setMathConstantMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptMathConstant", "set_math_constant") }
    open fun setMathConstant(which: Long) {
        _icall_Unit_Long(setMathConstantMethodBind, this.rawMemory, which)
    }


    private val getMathConstantMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptMathConstant", "get_math_constant") }
    open fun getMathConstant(): VisualScriptMathConstant.MathConstant {
        return VisualScriptMathConstant.MathConstant.fromInt(_icall_Long(getMathConstantMethodBind, this.rawMemory))
    }


}
