@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class SliderJoint : Joint {
    constructor() : super("SliderJoint")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class Param(val id: Long) {
        PARAM_LINEAR_LIMIT_UPPER(0),
        PARAM_LINEAR_LIMIT_LOWER(1),
        PARAM_LINEAR_LIMIT_SOFTNESS(2),
        PARAM_LINEAR_LIMIT_RESTITUTION(3),
        PARAM_LINEAR_LIMIT_DAMPING(4),
        PARAM_LINEAR_MOTION_SOFTNESS(5),
        PARAM_LINEAR_MOTION_RESTITUTION(6),
        PARAM_LINEAR_MOTION_DAMPING(7),
        PARAM_LINEAR_ORTHOGONAL_SOFTNESS(8),
        PARAM_LINEAR_ORTHOGONAL_RESTITUTION(9),
        PARAM_LINEAR_ORTHOGONAL_DAMPING(10),
        PARAM_ANGULAR_LIMIT_UPPER(11),
        PARAM_ANGULAR_LIMIT_LOWER(12),
        PARAM_ANGULAR_LIMIT_SOFTNESS(13),
        PARAM_ANGULAR_LIMIT_RESTITUTION(14),
        PARAM_ANGULAR_LIMIT_DAMPING(15),
        PARAM_ANGULAR_MOTION_SOFTNESS(16),
        PARAM_ANGULAR_MOTION_RESTITUTION(17),
        PARAM_ANGULAR_MOTION_DAMPING(18),
        PARAM_ANGULAR_ORTHOGONAL_SOFTNESS(19),
        PARAM_ANGULAR_ORTHOGONAL_RESTITUTION(20),
        PARAM_ANGULAR_ORTHOGONAL_DAMPING(21),
        PARAM_MAX(22),
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
        infix fun from(other: Joint): SliderJoint = SliderJoint("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Spatial): SliderJoint = SliderJoint("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): SliderJoint = SliderJoint("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): SliderJoint = SliderJoint("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): SliderJoint = fromVariant(SliderJoint(""), other)


        // Constants
        const val PARAM_LINEAR_LIMIT_UPPER: Long = 0
        const val PARAM_LINEAR_LIMIT_LOWER: Long = 1
        const val PARAM_LINEAR_LIMIT_SOFTNESS: Long = 2
        const val PARAM_LINEAR_LIMIT_RESTITUTION: Long = 3
        const val PARAM_LINEAR_LIMIT_DAMPING: Long = 4
        const val PARAM_LINEAR_MOTION_SOFTNESS: Long = 5
        const val PARAM_LINEAR_MOTION_RESTITUTION: Long = 6
        const val PARAM_LINEAR_MOTION_DAMPING: Long = 7
        const val PARAM_LINEAR_ORTHOGONAL_SOFTNESS: Long = 8
        const val PARAM_LINEAR_ORTHOGONAL_RESTITUTION: Long = 9
        const val PARAM_LINEAR_ORTHOGONAL_DAMPING: Long = 10
        const val PARAM_ANGULAR_LIMIT_UPPER: Long = 11
        const val PARAM_ANGULAR_LIMIT_LOWER: Long = 12
        const val PARAM_ANGULAR_LIMIT_SOFTNESS: Long = 13
        const val PARAM_ANGULAR_LIMIT_RESTITUTION: Long = 14
        const val PARAM_ANGULAR_LIMIT_DAMPING: Long = 15
        const val PARAM_ANGULAR_MOTION_SOFTNESS: Long = 16
        const val PARAM_ANGULAR_MOTION_RESTITUTION: Long = 17
        const val PARAM_ANGULAR_MOTION_DAMPING: Long = 18
        const val PARAM_ANGULAR_ORTHOGONAL_SOFTNESS: Long = 19
        const val PARAM_ANGULAR_ORTHOGONAL_RESTITUTION: Long = 20
        const val PARAM_ANGULAR_ORTHOGONAL_DAMPING: Long = 21
        const val PARAM_MAX: Long = 22


    }


    // Properties
    open var linearLimit_upperDistance: Double
        get() = _icall_Double_Long(getParamMethodBind, this.rawMemory, 0)
        set(value) = _icall_Unit_Long_Double(setParamMethodBind, this.rawMemory, 0, value)


    open var linearLimit_lowerDistance: Double
        get() = _icall_Double_Long(getParamMethodBind, this.rawMemory, 1)
        set(value) = _icall_Unit_Long_Double(setParamMethodBind, this.rawMemory, 1, value)


    open var linearLimit_softness: Double
        get() = _icall_Double_Long(getParamMethodBind, this.rawMemory, 2)
        set(value) = _icall_Unit_Long_Double(setParamMethodBind, this.rawMemory, 2, value)


    open var linearLimit_restitution: Double
        get() = _icall_Double_Long(getParamMethodBind, this.rawMemory, 3)
        set(value) = _icall_Unit_Long_Double(setParamMethodBind, this.rawMemory, 3, value)


    open var linearLimit_damping: Double
        get() = _icall_Double_Long(getParamMethodBind, this.rawMemory, 4)
        set(value) = _icall_Unit_Long_Double(setParamMethodBind, this.rawMemory, 4, value)


    open var linearMotion_softness: Double
        get() = _icall_Double_Long(getParamMethodBind, this.rawMemory, 5)
        set(value) = _icall_Unit_Long_Double(setParamMethodBind, this.rawMemory, 5, value)


    open var linearMotion_restitution: Double
        get() = _icall_Double_Long(getParamMethodBind, this.rawMemory, 6)
        set(value) = _icall_Unit_Long_Double(setParamMethodBind, this.rawMemory, 6, value)


    open var linearMotion_damping: Double
        get() = _icall_Double_Long(getParamMethodBind, this.rawMemory, 7)
        set(value) = _icall_Unit_Long_Double(setParamMethodBind, this.rawMemory, 7, value)


    open var linearOrtho_softness: Double
        get() = _icall_Double_Long(getParamMethodBind, this.rawMemory, 8)
        set(value) = _icall_Unit_Long_Double(setParamMethodBind, this.rawMemory, 8, value)


    open var linearOrtho_restitution: Double
        get() = _icall_Double_Long(getParamMethodBind, this.rawMemory, 9)
        set(value) = _icall_Unit_Long_Double(setParamMethodBind, this.rawMemory, 9, value)


    open var linearOrtho_damping: Double
        get() = _icall_Double_Long(getParamMethodBind, this.rawMemory, 10)
        set(value) = _icall_Unit_Long_Double(setParamMethodBind, this.rawMemory, 10, value)


    open var angularLimit_softness: Double
        get() = _icall_Double_Long(getParamMethodBind, this.rawMemory, 13)
        set(value) = _icall_Unit_Long_Double(setParamMethodBind, this.rawMemory, 13, value)


    open var angularLimit_restitution: Double
        get() = _icall_Double_Long(getParamMethodBind, this.rawMemory, 14)
        set(value) = _icall_Unit_Long_Double(setParamMethodBind, this.rawMemory, 14, value)


    open var angularLimit_damping: Double
        get() = _icall_Double_Long(getParamMethodBind, this.rawMemory, 15)
        set(value) = _icall_Unit_Long_Double(setParamMethodBind, this.rawMemory, 15, value)


    open var angularMotion_softness: Double
        get() = _icall_Double_Long(getParamMethodBind, this.rawMemory, 16)
        set(value) = _icall_Unit_Long_Double(setParamMethodBind, this.rawMemory, 16, value)


    open var angularMotion_restitution: Double
        get() = _icall_Double_Long(getParamMethodBind, this.rawMemory, 17)
        set(value) = _icall_Unit_Long_Double(setParamMethodBind, this.rawMemory, 17, value)


    open var angularMotion_damping: Double
        get() = _icall_Double_Long(getParamMethodBind, this.rawMemory, 18)
        set(value) = _icall_Unit_Long_Double(setParamMethodBind, this.rawMemory, 18, value)


    open var angularOrtho_softness: Double
        get() = _icall_Double_Long(getParamMethodBind, this.rawMemory, 19)
        set(value) = _icall_Unit_Long_Double(setParamMethodBind, this.rawMemory, 19, value)


    open var angularOrtho_restitution: Double
        get() = _icall_Double_Long(getParamMethodBind, this.rawMemory, 20)
        set(value) = _icall_Unit_Long_Double(setParamMethodBind, this.rawMemory, 20, value)


    open var angularOrtho_damping: Double
        get() = _icall_Double_Long(getParamMethodBind, this.rawMemory, 21)
        set(value) = _icall_Unit_Long_Double(setParamMethodBind, this.rawMemory, 21, value)




    // Methods
    private val setParamMethodBind: CPointer<godot_method_bind> by lazy { getMB("SliderJoint", "set_param") }
    open fun setParam(param: Long, value: Double) {
        _icall_Unit_Long_Double(setParamMethodBind, this.rawMemory, param, value)
    }


    private val getParamMethodBind: CPointer<godot_method_bind> by lazy { getMB("SliderJoint", "get_param") }
    open fun getParam(param: Long): Double {
        return _icall_Double_Long(getParamMethodBind, this.rawMemory, param)
    }


    open fun _set_upper_limit_angular(upperLimitAngular: Double) {
    }


    open fun _get_upper_limit_angular(): Double {
        throw NotImplementedError("_get_upper_limit_angular is not implemented for SliderJoint")
    }


    open fun _set_lower_limit_angular(lowerLimitAngular: Double) {
    }


    open fun _get_lower_limit_angular(): Double {
        throw NotImplementedError("_get_lower_limit_angular is not implemented for SliderJoint")
    }


}
