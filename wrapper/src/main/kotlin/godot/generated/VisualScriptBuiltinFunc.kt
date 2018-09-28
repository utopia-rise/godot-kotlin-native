@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class VisualScriptBuiltinFunc : VisualScriptNode {
    constructor() : super("VisualScriptBuiltinFunc")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class BuiltinFunc(val id: Int) {
        MATH_SIN(0),
        MATH_COS(1),
        MATH_TAN(2),
        MATH_SINH(3),
        MATH_COSH(4),
        MATH_TANH(5),
        MATH_ASIN(6),
        MATH_ACOS(7),
        MATH_ATAN(8),
        MATH_ATAN2(9),
        MATH_SQRT(10),
        MATH_FMOD(11),
        MATH_FPOSMOD(12),
        MATH_FLOOR(13),
        MATH_CEIL(14),
        MATH_ROUND(15),
        MATH_ABS(16),
        MATH_SIGN(17),
        MATH_POW(18),
        MATH_LOG(19),
        MATH_EXP(20),
        MATH_ISNAN(21),
        MATH_ISINF(22),
        MATH_EASE(23),
        MATH_DECIMALS(24),
        MATH_STEPIFY(25),
        MATH_LERP(26),
        MATH_INVERSE_LERP(27),
        MATH_RANGE_LERP(28),
        MATH_DECTIME(29),
        MATH_RANDOMIZE(30),
        MATH_RAND(31),
        MATH_RANDF(32),
        MATH_RANDOM(33),
        MATH_SEED(34),
        MATH_RANDSEED(35),
        MATH_DEG2RAD(36),
        MATH_RAD2DEG(37),
        MATH_LINEAR2DB(38),
        MATH_DB2LINEAR(39),
        MATH_POLAR2CARTESIAN(40),
        MATH_CARTESIAN2POLAR(41),
        MATH_WRAP(42),
        MATH_WRAPF(43),
        LOGIC_MAX(44),
        LOGIC_MIN(45),
        LOGIC_CLAMP(46),
        LOGIC_NEAREST_PO2(47),
        OBJ_WEAKREF(48),
        FUNC_FUNCREF(49),
        TYPE_CONVERT(50),
        TYPE_OF(51),
        TYPE_EXISTS(52),
        TEXT_CHAR(53),
        TEXT_STR(54),
        TEXT_PRINT(55),
        TEXT_PRINTERR(56),
        TEXT_PRINTRAW(57),
        VAR_TO_STR(58),
        STR_TO_VAR(59),
        VAR_TO_BYTES(60),
        BYTES_TO_VAR(61),
        COLORN(62),
        FUNC_MAX(63),
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
        infix fun from(other: VisualScriptNode): VisualScriptBuiltinFunc = VisualScriptBuiltinFunc("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): VisualScriptBuiltinFunc = VisualScriptBuiltinFunc("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): VisualScriptBuiltinFunc = VisualScriptBuiltinFunc("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): VisualScriptBuiltinFunc = VisualScriptBuiltinFunc("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): VisualScriptBuiltinFunc = fromVariant(VisualScriptBuiltinFunc(""), other)


        // Constants
        const val MATH_SIN: Int = 0
        const val MATH_COS: Int = 1
        const val MATH_TAN: Int = 2
        const val MATH_SINH: Int = 3
        const val MATH_COSH: Int = 4
        const val MATH_TANH: Int = 5
        const val MATH_ASIN: Int = 6
        const val MATH_ACOS: Int = 7
        const val MATH_ATAN: Int = 8
        const val MATH_ATAN2: Int = 9
        const val MATH_SQRT: Int = 10
        const val MATH_FMOD: Int = 11
        const val MATH_FPOSMOD: Int = 12
        const val MATH_FLOOR: Int = 13
        const val MATH_CEIL: Int = 14
        const val MATH_ROUND: Int = 15
        const val MATH_ABS: Int = 16
        const val MATH_SIGN: Int = 17
        const val MATH_POW: Int = 18
        const val MATH_LOG: Int = 19
        const val MATH_EXP: Int = 20
        const val MATH_ISNAN: Int = 21
        const val MATH_ISINF: Int = 22
        const val MATH_EASE: Int = 23
        const val MATH_DECIMALS: Int = 24
        const val MATH_STEPIFY: Int = 25
        const val MATH_LERP: Int = 26
        const val MATH_INVERSE_LERP: Int = 27
        const val MATH_RANGE_LERP: Int = 28
        const val MATH_DECTIME: Int = 29
        const val MATH_RANDOMIZE: Int = 30
        const val MATH_RAND: Int = 31
        const val MATH_RANDF: Int = 32
        const val MATH_RANDOM: Int = 33
        const val MATH_SEED: Int = 34
        const val MATH_RANDSEED: Int = 35
        const val MATH_DEG2RAD: Int = 36
        const val MATH_RAD2DEG: Int = 37
        const val MATH_LINEAR2DB: Int = 38
        const val MATH_DB2LINEAR: Int = 39
        const val MATH_POLAR2CARTESIAN: Int = 40
        const val MATH_CARTESIAN2POLAR: Int = 41
        const val MATH_WRAP: Int = 42
        const val MATH_WRAPF: Int = 43
        const val LOGIC_MAX: Int = 44
        const val LOGIC_MIN: Int = 45
        const val LOGIC_CLAMP: Int = 46
        const val LOGIC_NEAREST_PO2: Int = 47
        const val OBJ_WEAKREF: Int = 48
        const val FUNC_FUNCREF: Int = 49
        const val TYPE_CONVERT: Int = 50
        const val TYPE_OF: Int = 51
        const val TYPE_EXISTS: Int = 52
        const val TEXT_CHAR: Int = 53
        const val TEXT_STR: Int = 54
        const val TEXT_PRINT: Int = 55
        const val TEXT_PRINTERR: Int = 56
        const val TEXT_PRINTRAW: Int = 57
        const val VAR_TO_STR: Int = 58
        const val STR_TO_VAR: Int = 59
        const val VAR_TO_BYTES: Int = 60
        const val BYTES_TO_VAR: Int = 61
        const val COLORN: Int = 62
        const val FUNC_MAX: Int = 63


    }


    // Properties
    open var function: Int
        get() = _icall_Int(getFuncMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setFuncMethodBind, this.rawMemory, value)




    // Methods
    private val setFuncMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptBuiltinFunc", "set_func") }
    open fun setFunc(which: Int) {
        _icall_Unit_Int(setFuncMethodBind, this.rawMemory, which)
    }


    private val getFuncMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptBuiltinFunc", "get_func") }
    open fun getFunc(): VisualScriptBuiltinFunc.BuiltinFunc {
        return VisualScriptBuiltinFunc.BuiltinFunc.fromInt(_icall_Int(getFuncMethodBind, this.rawMemory))
    }


}
