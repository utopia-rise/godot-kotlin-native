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

    enum class Param(val id: Int) {
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
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }
    enum class Flag(val id: Int) {
        FLAG_USE_LIMIT(0),
        FLAG_ENABLE_MOTOR(1),
        FLAG_MAX(2),
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
        infix fun from(other: Joint): HingeJoint = HingeJoint("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Spatial): HingeJoint = HingeJoint("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): HingeJoint = HingeJoint("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): HingeJoint = HingeJoint("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): HingeJoint = fromVariant(HingeJoint(""), other)


        // Constants
        const val PARAM_BIAS: Int = 0
        const val PARAM_LIMIT_UPPER: Int = 1
        const val PARAM_LIMIT_LOWER: Int = 2
        const val PARAM_LIMIT_BIAS: Int = 3
        const val PARAM_LIMIT_SOFTNESS: Int = 4
        const val PARAM_LIMIT_RELAXATION: Int = 5
        const val PARAM_MOTOR_TARGET_VELOCITY: Int = 6
        const val PARAM_MOTOR_MAX_IMPULSE: Int = 7
        const val PARAM_MAX: Int = 8
        const val FLAG_USE_LIMIT: Int = 0
        const val FLAG_ENABLE_MOTOR: Int = 1
        const val FLAG_MAX: Int = 2


    }


    // Properties
    open var params_bias: Float
        get() = _icall_Float_Int(getParamMethodBind, this.rawMemory, 0)
        set(value) = _icall_Unit_Int_Float(setParamMethodBind, this.rawMemory, 0, value)


    open var angularLimit_enable: Boolean
        get() = _icall_Boolean_Int(getFlagMethodBind, this.rawMemory, 0)
        set(value) = _icall_Unit_Int_Boolean(setFlagMethodBind, this.rawMemory, 0, value)


    open var angularLimit_bias: Float
        get() = _icall_Float_Int(getParamMethodBind, this.rawMemory, 3)
        set(value) = _icall_Unit_Int_Float(setParamMethodBind, this.rawMemory, 3, value)


    open var angularLimit_softness: Float
        get() = _icall_Float_Int(getParamMethodBind, this.rawMemory, 4)
        set(value) = _icall_Unit_Int_Float(setParamMethodBind, this.rawMemory, 4, value)


    open var angularLimit_relaxation: Float
        get() = _icall_Float_Int(getParamMethodBind, this.rawMemory, 5)
        set(value) = _icall_Unit_Int_Float(setParamMethodBind, this.rawMemory, 5, value)


    open var motor_enable: Boolean
        get() = _icall_Boolean_Int(getFlagMethodBind, this.rawMemory, 1)
        set(value) = _icall_Unit_Int_Boolean(setFlagMethodBind, this.rawMemory, 1, value)


    open var motor_targetVelocity: Float
        get() = _icall_Float_Int(getParamMethodBind, this.rawMemory, 6)
        set(value) = _icall_Unit_Int_Float(setParamMethodBind, this.rawMemory, 6, value)


    open var motor_maxImpulse: Float
        get() = _icall_Float_Int(getParamMethodBind, this.rawMemory, 7)
        set(value) = _icall_Unit_Int_Float(setParamMethodBind, this.rawMemory, 7, value)




    // Methods
    private val setParamMethodBind: CPointer<godot_method_bind> by lazy { getMB("HingeJoint", "set_param") }
    open fun setParam(param: Int, value: Float) {
        _icall_Unit_Int_Float(setParamMethodBind, this.rawMemory, param, value)
    }


    private val getParamMethodBind: CPointer<godot_method_bind> by lazy { getMB("HingeJoint", "get_param") }
    open fun getParam(param: Int): Float {
        return _icall_Float_Int(getParamMethodBind, this.rawMemory, param)
    }


    private val setFlagMethodBind: CPointer<godot_method_bind> by lazy { getMB("HingeJoint", "set_flag") }
    open fun setFlag(flag: Int, enabled: Boolean) {
        _icall_Unit_Int_Boolean(setFlagMethodBind, this.rawMemory, flag, enabled)
    }


    private val getFlagMethodBind: CPointer<godot_method_bind> by lazy { getMB("HingeJoint", "get_flag") }
    open fun getFlag(flag: Int): Boolean {
        return _icall_Boolean_Int(getFlagMethodBind, this.rawMemory, flag)
    }


    open fun _set_upper_limit(upperLimit: Float) {
    }


    open fun _get_upper_limit(): Float {
        throw NotImplementedError("_get_upper_limit is not implemented for HingeJoint")
    }


    open fun _set_lower_limit(lowerLimit: Float) {
    }


    open fun _get_lower_limit(): Float {
        throw NotImplementedError("_get_lower_limit is not implemented for HingeJoint")
    }


}
