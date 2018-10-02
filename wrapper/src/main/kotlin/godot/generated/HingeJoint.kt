@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class HingeJoint : Joint {
    constructor() : super("HingeJoint")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class Param(val id: Long) {
        PARAM_BIAS(0),
        PARAM_LIMIT_UPPER(1),
        PARAM_LIMIT_LOWER(2),
        PARAM_LIMIT_BIAS(3),
        PARAM_LIMIT_SOFTNESS(4),
        PARAM_LIMIT_RELAXATION(5),
        PARAM_MOTOR_TARGET_VELOCITY(6),
        PARAM_MOTOR_MAX_IMPULSE(7),
        PARAM_MAX(8),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class Flag(val id: Long) {
        FLAG_USE_LIMIT(0),
        FLAG_ENABLE_MOTOR(1),
        FLAG_MAX(2),
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
        infix fun from(other: Joint): HingeJoint = HingeJoint("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Spatial): HingeJoint = HingeJoint("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): HingeJoint = HingeJoint("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): HingeJoint = HingeJoint("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): HingeJoint = fromVariant(HingeJoint(""), other)


        // Constants
        const val PARAM_BIAS: Long = 0
        const val PARAM_LIMIT_UPPER: Long = 1
        const val PARAM_LIMIT_LOWER: Long = 2
        const val PARAM_LIMIT_BIAS: Long = 3
        const val PARAM_LIMIT_SOFTNESS: Long = 4
        const val PARAM_LIMIT_RELAXATION: Long = 5
        const val PARAM_MOTOR_TARGET_VELOCITY: Long = 6
        const val PARAM_MOTOR_MAX_IMPULSE: Long = 7
        const val PARAM_MAX: Long = 8
        const val FLAG_USE_LIMIT: Long = 0
        const val FLAG_ENABLE_MOTOR: Long = 1
        const val FLAG_MAX: Long = 2


    }


    // Properties
    open var params_bias: Double
        get() = _icall_Double_Long(getParamMethodBind, this.rawMemory, 0)
        set(value) = _icall_Unit_Long_Double(setParamMethodBind, this.rawMemory, 0, value)


    open var angularLimit_enable: Boolean
        get() = _icall_Boolean_Long(getFlagMethodBind, this.rawMemory, 0)
        set(value) = _icall_Unit_Long_Boolean(setFlagMethodBind, this.rawMemory, 0, value)


    open var angularLimit_bias: Double
        get() = _icall_Double_Long(getParamMethodBind, this.rawMemory, 3)
        set(value) = _icall_Unit_Long_Double(setParamMethodBind, this.rawMemory, 3, value)


    open var angularLimit_softness: Double
        get() = _icall_Double_Long(getParamMethodBind, this.rawMemory, 4)
        set(value) = _icall_Unit_Long_Double(setParamMethodBind, this.rawMemory, 4, value)


    open var angularLimit_relaxation: Double
        get() = _icall_Double_Long(getParamMethodBind, this.rawMemory, 5)
        set(value) = _icall_Unit_Long_Double(setParamMethodBind, this.rawMemory, 5, value)


    open var motor_enable: Boolean
        get() = _icall_Boolean_Long(getFlagMethodBind, this.rawMemory, 1)
        set(value) = _icall_Unit_Long_Boolean(setFlagMethodBind, this.rawMemory, 1, value)


    open var motor_targetVelocity: Double
        get() = _icall_Double_Long(getParamMethodBind, this.rawMemory, 6)
        set(value) = _icall_Unit_Long_Double(setParamMethodBind, this.rawMemory, 6, value)


    open var motor_maxImpulse: Double
        get() = _icall_Double_Long(getParamMethodBind, this.rawMemory, 7)
        set(value) = _icall_Unit_Long_Double(setParamMethodBind, this.rawMemory, 7, value)




    // Methods
    private val setParamMethodBind: CPointer<godot_method_bind> by lazy { getMB("HingeJoint", "set_param") }
    open fun setParam(param: Long, value: Double) {
        _icall_Unit_Long_Double(setParamMethodBind, this.rawMemory, param, value)
    }


    private val getParamMethodBind: CPointer<godot_method_bind> by lazy { getMB("HingeJoint", "get_param") }
    open fun getParam(param: Long): Double {
        return _icall_Double_Long(getParamMethodBind, this.rawMemory, param)
    }


    private val setFlagMethodBind: CPointer<godot_method_bind> by lazy { getMB("HingeJoint", "set_flag") }
    open fun setFlag(flag: Long, enabled: Boolean) {
        _icall_Unit_Long_Boolean(setFlagMethodBind, this.rawMemory, flag, enabled)
    }


    private val getFlagMethodBind: CPointer<godot_method_bind> by lazy { getMB("HingeJoint", "get_flag") }
    open fun getFlag(flag: Long): Boolean {
        return _icall_Boolean_Long(getFlagMethodBind, this.rawMemory, flag)
    }


    open fun _set_upper_limit(upperLimit: Double) {
    }


    open fun _get_upper_limit(): Double {
        throw NotImplementedError("_get_upper_limit is not implemented for HingeJoint")
    }


    open fun _set_lower_limit(lowerLimit: Double) {
    }


    open fun _get_lower_limit(): Double {
        throw NotImplementedError("_get_lower_limit is not implemented for HingeJoint")
    }


}
