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

    enum class BuiltinFunc(val id: Long) {
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
            fun fromInt(value: Long) = values().single { it.id == value }
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
        const val MATH_SIN: Long = 0
        const val MATH_COS: Long = 1
        const val MATH_TAN: Long = 2
        const val MATH_SINH: Long = 3
        const val MATH_COSH: Long = 4
        const val MATH_TANH: Long = 5
        const val MATH_ASIN: Long = 6
        const val MATH_ACOS: Long = 7
        const val MATH_ATAN: Long = 8
        const val MATH_ATAN2: Long = 9
        const val MATH_SQRT: Long = 10
        const val MATH_FMOD: Long = 11
        const val MATH_FPOSMOD: Long = 12
        const val MATH_FLOOR: Long = 13
        const val MATH_CEIL: Long = 14
        const val MATH_ROUND: Long = 15
        const val MATH_ABS: Long = 16
        const val MATH_SIGN: Long = 17
        const val MATH_POW: Long = 18
        const val MATH_LOG: Long = 19
        const val MATH_EXP: Long = 20
        const val MATH_ISNAN: Long = 21
        const val MATH_ISINF: Long = 22
        const val MATH_EASE: Long = 23
        const val MATH_DECIMALS: Long = 24
        const val MATH_STEPIFY: Long = 25
        const val MATH_LERP: Long = 26
        const val MATH_INVERSE_LERP: Long = 27
        const val MATH_RANGE_LERP: Long = 28
        const val MATH_DECTIME: Long = 29
        const val MATH_RANDOMIZE: Long = 30
        const val MATH_RAND: Long = 31
        const val MATH_RANDF: Long = 32
        const val MATH_RANDOM: Long = 33
        const val MATH_SEED: Long = 34
        const val MATH_RANDSEED: Long = 35
        const val MATH_DEG2RAD: Long = 36
        const val MATH_RAD2DEG: Long = 37
        const val MATH_LINEAR2DB: Long = 38
        const val MATH_DB2LINEAR: Long = 39
        const val MATH_POLAR2CARTESIAN: Long = 40
        const val MATH_CARTESIAN2POLAR: Long = 41
        const val MATH_WRAP: Long = 42
        const val MATH_WRAPF: Long = 43
        const val LOGIC_MAX: Long = 44
        const val LOGIC_MIN: Long = 45
        const val LOGIC_CLAMP: Long = 46
        const val LOGIC_NEAREST_PO2: Long = 47
        const val OBJ_WEAKREF: Long = 48
        const val FUNC_FUNCREF: Long = 49
        const val TYPE_CONVERT: Long = 50
        const val TYPE_OF: Long = 51
        const val TYPE_EXISTS: Long = 52
        const val TEXT_CHAR: Long = 53
        const val TEXT_STR: Long = 54
        const val TEXT_PRINT: Long = 55
        const val TEXT_PRINTERR: Long = 56
        const val TEXT_PRINTRAW: Long = 57
        const val VAR_TO_STR: Long = 58
        const val STR_TO_VAR: Long = 59
        const val VAR_TO_BYTES: Long = 60
        const val BYTES_TO_VAR: Long = 61
        const val COLORN: Long = 62
        const val FUNC_MAX: Long = 63


    }


    // Properties
    open var function: Long
        get() = _icall_Long(getFuncMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setFuncMethodBind, this.rawMemory, value)




    // Methods
    private val setFuncMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptBuiltinFunc", "set_func") }
    open fun setFunc(which: Long) {
        _icall_Unit_Long(setFuncMethodBind, this.rawMemory, which)
    }


    private val getFuncMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptBuiltinFunc", "get_func") }
    open fun getFunc(): VisualScriptBuiltinFunc.BuiltinFunc {
        return VisualScriptBuiltinFunc.BuiltinFunc.fromInt(_icall_Long(getFuncMethodBind, this.rawMemory))
    }


}
