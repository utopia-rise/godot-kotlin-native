@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class Generic6DOFJoint : Joint {
    constructor() : super("Generic6DOFJoint")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class Param(val id: Int) {
        PARAM_LINEAR_LOWER_LIMIT(0),
        PARAM_LINEAR_UPPER_LIMIT(1),
        PARAM_LINEAR_LIMIT_SOFTNESS(2),
        PARAM_LINEAR_RESTITUTION(3),
        PARAM_LINEAR_DAMPING(4),
        PARAM_LINEAR_MOTOR_TARGET_VELOCITY(5),
        PARAM_LINEAR_MOTOR_FORCE_LIMIT(6),
        PARAM_ANGULAR_LOWER_LIMIT(7),
        PARAM_ANGULAR_UPPER_LIMIT(8),
        PARAM_ANGULAR_LIMIT_SOFTNESS(9),
        PARAM_ANGULAR_DAMPING(10),
        PARAM_ANGULAR_RESTITUTION(11),
        PARAM_ANGULAR_FORCE_LIMIT(12),
        PARAM_ANGULAR_ERP(13),
        PARAM_ANGULAR_MOTOR_TARGET_VELOCITY(14),
        PARAM_ANGULAR_MOTOR_FORCE_LIMIT(15),
        PARAM_MAX(16),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }
    enum class Flag(val id: Int) {
        FLAG_ENABLE_LINEAR_LIMIT(0),
        FLAG_ENABLE_ANGULAR_LIMIT(1),
        FLAG_ENABLE_MOTOR(2),
        FLAG_ENABLE_LINEAR_MOTOR(3),
        FLAG_MAX(4),
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
        infix fun from(other: Joint): Generic6DOFJoint = Generic6DOFJoint("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Spatial): Generic6DOFJoint = Generic6DOFJoint("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): Generic6DOFJoint = Generic6DOFJoint("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): Generic6DOFJoint = Generic6DOFJoint("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): Generic6DOFJoint = fromVariant(Generic6DOFJoint(""), other)


        // Constants
        const val PARAM_LINEAR_LOWER_LIMIT: Int = 0
        const val PARAM_LINEAR_UPPER_LIMIT: Int = 1
        const val PARAM_LINEAR_LIMIT_SOFTNESS: Int = 2
        const val PARAM_LINEAR_RESTITUTION: Int = 3
        const val PARAM_LINEAR_DAMPING: Int = 4
        const val PARAM_LINEAR_MOTOR_TARGET_VELOCITY: Int = 5
        const val PARAM_LINEAR_MOTOR_FORCE_LIMIT: Int = 6
        const val PARAM_ANGULAR_LOWER_LIMIT: Int = 7
        const val PARAM_ANGULAR_UPPER_LIMIT: Int = 8
        const val PARAM_ANGULAR_LIMIT_SOFTNESS: Int = 9
        const val PARAM_ANGULAR_DAMPING: Int = 10
        const val PARAM_ANGULAR_RESTITUTION: Int = 11
        const val PARAM_ANGULAR_FORCE_LIMIT: Int = 12
        const val PARAM_ANGULAR_ERP: Int = 13
        const val PARAM_ANGULAR_MOTOR_TARGET_VELOCITY: Int = 14
        const val PARAM_ANGULAR_MOTOR_FORCE_LIMIT: Int = 15
        const val PARAM_MAX: Int = 16
        const val FLAG_ENABLE_LINEAR_LIMIT: Int = 0
        const val FLAG_ENABLE_ANGULAR_LIMIT: Int = 1
        const val FLAG_ENABLE_MOTOR: Int = 2
        const val FLAG_ENABLE_LINEAR_MOTOR: Int = 3
        const val FLAG_MAX: Int = 4


    }


    // Properties
    open var linearLimitX_enabled: Boolean
        get() = _icall_Boolean_Int(getFlagXMethodBind, this.rawMemory, 0)
        set(value) = _icall_Unit_Int_Boolean(setFlagXMethodBind, this.rawMemory, 0, value)


    open var linearLimitX_upperDistance: Float
        get() = _icall_Float_Int(getParamXMethodBind, this.rawMemory, 1)
        set(value) = _icall_Unit_Int_Float(setParamXMethodBind, this.rawMemory, 1, value)


    open var linearLimitX_lowerDistance: Float
        get() = _icall_Float_Int(getParamXMethodBind, this.rawMemory, 0)
        set(value) = _icall_Unit_Int_Float(setParamXMethodBind, this.rawMemory, 0, value)


    open var linearLimitX_softness: Float
        get() = _icall_Float_Int(getParamXMethodBind, this.rawMemory, 2)
        set(value) = _icall_Unit_Int_Float(setParamXMethodBind, this.rawMemory, 2, value)


    open var linearLimitX_restitution: Float
        get() = _icall_Float_Int(getParamXMethodBind, this.rawMemory, 3)
        set(value) = _icall_Unit_Int_Float(setParamXMethodBind, this.rawMemory, 3, value)


    open var linearLimitX_damping: Float
        get() = _icall_Float_Int(getParamXMethodBind, this.rawMemory, 4)
        set(value) = _icall_Unit_Int_Float(setParamXMethodBind, this.rawMemory, 4, value)


    open var linearMotorX_enabled: Boolean
        get() = _icall_Boolean_Int(getFlagXMethodBind, this.rawMemory, 3)
        set(value) = _icall_Unit_Int_Boolean(setFlagXMethodBind, this.rawMemory, 3, value)


    open var linearMotorX_targetVelocity: Float
        get() = _icall_Float_Int(getParamXMethodBind, this.rawMemory, 5)
        set(value) = _icall_Unit_Int_Float(setParamXMethodBind, this.rawMemory, 5, value)


    open var linearMotorX_forceLimit: Float
        get() = _icall_Float_Int(getParamXMethodBind, this.rawMemory, 6)
        set(value) = _icall_Unit_Int_Float(setParamXMethodBind, this.rawMemory, 6, value)


    open var angularLimitX_enabled: Boolean
        get() = _icall_Boolean_Int(getFlagXMethodBind, this.rawMemory, 1)
        set(value) = _icall_Unit_Int_Boolean(setFlagXMethodBind, this.rawMemory, 1, value)


    open var angularLimitX_softness: Float
        get() = _icall_Float_Int(getParamXMethodBind, this.rawMemory, 9)
        set(value) = _icall_Unit_Int_Float(setParamXMethodBind, this.rawMemory, 9, value)


    open var angularLimitX_restitution: Float
        get() = _icall_Float_Int(getParamXMethodBind, this.rawMemory, 11)
        set(value) = _icall_Unit_Int_Float(setParamXMethodBind, this.rawMemory, 11, value)


    open var angularLimitX_damping: Float
        get() = _icall_Float_Int(getParamXMethodBind, this.rawMemory, 10)
        set(value) = _icall_Unit_Int_Float(setParamXMethodBind, this.rawMemory, 10, value)


    open var angularLimitX_forceLimit: Float
        get() = _icall_Float_Int(getParamXMethodBind, this.rawMemory, 12)
        set(value) = _icall_Unit_Int_Float(setParamXMethodBind, this.rawMemory, 12, value)


    open var angularLimitX_erp: Float
        get() = _icall_Float_Int(getParamXMethodBind, this.rawMemory, 13)
        set(value) = _icall_Unit_Int_Float(setParamXMethodBind, this.rawMemory, 13, value)


    open var angularMotorX_enabled: Boolean
        get() = _icall_Boolean_Int(getFlagXMethodBind, this.rawMemory, 2)
        set(value) = _icall_Unit_Int_Boolean(setFlagXMethodBind, this.rawMemory, 2, value)


    open var angularMotorX_targetVelocity: Float
        get() = _icall_Float_Int(getParamXMethodBind, this.rawMemory, 14)
        set(value) = _icall_Unit_Int_Float(setParamXMethodBind, this.rawMemory, 14, value)


    open var angularMotorX_forceLimit: Float
        get() = _icall_Float_Int(getParamXMethodBind, this.rawMemory, 15)
        set(value) = _icall_Unit_Int_Float(setParamXMethodBind, this.rawMemory, 15, value)


    open var linearLimitY_enabled: Boolean
        get() = _icall_Boolean_Int(getFlagYMethodBind, this.rawMemory, 0)
        set(value) = _icall_Unit_Int_Boolean(setFlagYMethodBind, this.rawMemory, 0, value)


    open var linearLimitY_upperDistance: Float
        get() = _icall_Float_Int(getParamYMethodBind, this.rawMemory, 1)
        set(value) = _icall_Unit_Int_Float(setParamYMethodBind, this.rawMemory, 1, value)


    open var linearLimitY_lowerDistance: Float
        get() = _icall_Float_Int(getParamYMethodBind, this.rawMemory, 0)
        set(value) = _icall_Unit_Int_Float(setParamYMethodBind, this.rawMemory, 0, value)


    open var linearLimitY_softness: Float
        get() = _icall_Float_Int(getParamYMethodBind, this.rawMemory, 2)
        set(value) = _icall_Unit_Int_Float(setParamYMethodBind, this.rawMemory, 2, value)


    open var linearLimitY_restitution: Float
        get() = _icall_Float_Int(getParamYMethodBind, this.rawMemory, 3)
        set(value) = _icall_Unit_Int_Float(setParamYMethodBind, this.rawMemory, 3, value)


    open var linearLimitY_damping: Float
        get() = _icall_Float_Int(getParamYMethodBind, this.rawMemory, 4)
        set(value) = _icall_Unit_Int_Float(setParamYMethodBind, this.rawMemory, 4, value)


    open var linearMotorY_enabled: Boolean
        get() = _icall_Boolean_Int(getFlagYMethodBind, this.rawMemory, 3)
        set(value) = _icall_Unit_Int_Boolean(setFlagYMethodBind, this.rawMemory, 3, value)


    open var linearMotorY_targetVelocity: Float
        get() = _icall_Float_Int(getParamYMethodBind, this.rawMemory, 5)
        set(value) = _icall_Unit_Int_Float(setParamYMethodBind, this.rawMemory, 5, value)


    open var linearMotorY_forceLimit: Float
        get() = _icall_Float_Int(getParamYMethodBind, this.rawMemory, 6)
        set(value) = _icall_Unit_Int_Float(setParamYMethodBind, this.rawMemory, 6, value)


    open var angularLimitY_enabled: Boolean
        get() = _icall_Boolean_Int(getFlagYMethodBind, this.rawMemory, 1)
        set(value) = _icall_Unit_Int_Boolean(setFlagYMethodBind, this.rawMemory, 1, value)


    open var angularLimitY_softness: Float
        get() = _icall_Float_Int(getParamYMethodBind, this.rawMemory, 9)
        set(value) = _icall_Unit_Int_Float(setParamYMethodBind, this.rawMemory, 9, value)


    open var angularLimitY_restitution: Float
        get() = _icall_Float_Int(getParamYMethodBind, this.rawMemory, 11)
        set(value) = _icall_Unit_Int_Float(setParamYMethodBind, this.rawMemory, 11, value)


    open var angularLimitY_damping: Float
        get() = _icall_Float_Int(getParamYMethodBind, this.rawMemory, 10)
        set(value) = _icall_Unit_Int_Float(setParamYMethodBind, this.rawMemory, 10, value)


    open var angularLimitY_forceLimit: Float
        get() = _icall_Float_Int(getParamYMethodBind, this.rawMemory, 12)
        set(value) = _icall_Unit_Int_Float(setParamYMethodBind, this.rawMemory, 12, value)


    open var angularLimitY_erp: Float
        get() = _icall_Float_Int(getParamYMethodBind, this.rawMemory, 13)
        set(value) = _icall_Unit_Int_Float(setParamYMethodBind, this.rawMemory, 13, value)


    open var angularMotorY_enabled: Boolean
        get() = _icall_Boolean_Int(getFlagYMethodBind, this.rawMemory, 2)
        set(value) = _icall_Unit_Int_Boolean(setFlagYMethodBind, this.rawMemory, 2, value)


    open var angularMotorY_targetVelocity: Float
        get() = _icall_Float_Int(getParamYMethodBind, this.rawMemory, 14)
        set(value) = _icall_Unit_Int_Float(setParamYMethodBind, this.rawMemory, 14, value)


    open var angularMotorY_forceLimit: Float
        get() = _icall_Float_Int(getParamYMethodBind, this.rawMemory, 15)
        set(value) = _icall_Unit_Int_Float(setParamYMethodBind, this.rawMemory, 15, value)


    open var linearLimitZ_enabled: Boolean
        get() = _icall_Boolean_Int(getFlagZMethodBind, this.rawMemory, 0)
        set(value) = _icall_Unit_Int_Boolean(setFlagZMethodBind, this.rawMemory, 0, value)


    open var linearLimitZ_upperDistance: Float
        get() = _icall_Float_Int(getParamZMethodBind, this.rawMemory, 1)
        set(value) = _icall_Unit_Int_Float(setParamZMethodBind, this.rawMemory, 1, value)


    open var linearLimitZ_lowerDistance: Float
        get() = _icall_Float_Int(getParamZMethodBind, this.rawMemory, 0)
        set(value) = _icall_Unit_Int_Float(setParamZMethodBind, this.rawMemory, 0, value)


    open var linearLimitZ_softness: Float
        get() = _icall_Float_Int(getParamZMethodBind, this.rawMemory, 2)
        set(value) = _icall_Unit_Int_Float(setParamZMethodBind, this.rawMemory, 2, value)


    open var linearLimitZ_restitution: Float
        get() = _icall_Float_Int(getParamZMethodBind, this.rawMemory, 3)
        set(value) = _icall_Unit_Int_Float(setParamZMethodBind, this.rawMemory, 3, value)


    open var linearLimitZ_damping: Float
        get() = _icall_Float_Int(getParamZMethodBind, this.rawMemory, 4)
        set(value) = _icall_Unit_Int_Float(setParamZMethodBind, this.rawMemory, 4, value)


    open var linearMotorZ_enabled: Boolean
        get() = _icall_Boolean_Int(getFlagZMethodBind, this.rawMemory, 3)
        set(value) = _icall_Unit_Int_Boolean(setFlagZMethodBind, this.rawMemory, 3, value)


    open var linearMotorZ_targetVelocity: Float
        get() = _icall_Float_Int(getParamZMethodBind, this.rawMemory, 5)
        set(value) = _icall_Unit_Int_Float(setParamZMethodBind, this.rawMemory, 5, value)


    open var linearMotorZ_forceLimit: Float
        get() = _icall_Float_Int(getParamZMethodBind, this.rawMemory, 6)
        set(value) = _icall_Unit_Int_Float(setParamZMethodBind, this.rawMemory, 6, value)


    open var angularLimitZ_enabled: Boolean
        get() = _icall_Boolean_Int(getFlagZMethodBind, this.rawMemory, 1)
        set(value) = _icall_Unit_Int_Boolean(setFlagZMethodBind, this.rawMemory, 1, value)


    open var angularLimitZ_softness: Float
        get() = _icall_Float_Int(getParamZMethodBind, this.rawMemory, 9)
        set(value) = _icall_Unit_Int_Float(setParamZMethodBind, this.rawMemory, 9, value)


    open var angularLimitZ_restitution: Float
        get() = _icall_Float_Int(getParamZMethodBind, this.rawMemory, 11)
        set(value) = _icall_Unit_Int_Float(setParamZMethodBind, this.rawMemory, 11, value)


    open var angularLimitZ_damping: Float
        get() = _icall_Float_Int(getParamZMethodBind, this.rawMemory, 10)
        set(value) = _icall_Unit_Int_Float(setParamZMethodBind, this.rawMemory, 10, value)


    open var angularLimitZ_forceLimit: Float
        get() = _icall_Float_Int(getParamZMethodBind, this.rawMemory, 12)
        set(value) = _icall_Unit_Int_Float(setParamZMethodBind, this.rawMemory, 12, value)


    open var angularLimitZ_erp: Float
        get() = _icall_Float_Int(getParamZMethodBind, this.rawMemory, 13)
        set(value) = _icall_Unit_Int_Float(setParamZMethodBind, this.rawMemory, 13, value)


    open var angularMotorZ_enabled: Boolean
        get() = _icall_Boolean_Int(getFlagZMethodBind, this.rawMemory, 2)
        set(value) = _icall_Unit_Int_Boolean(setFlagZMethodBind, this.rawMemory, 2, value)


    open var angularMotorZ_targetVelocity: Float
        get() = _icall_Float_Int(getParamZMethodBind, this.rawMemory, 14)
        set(value) = _icall_Unit_Int_Float(setParamZMethodBind, this.rawMemory, 14, value)


    open var angularMotorZ_forceLimit: Float
        get() = _icall_Float_Int(getParamZMethodBind, this.rawMemory, 15)
        set(value) = _icall_Unit_Int_Float(setParamZMethodBind, this.rawMemory, 15, value)




    // Methods
    open fun _set_angular_hi_limit_x(angle: Float) {
    }


    open fun _get_angular_hi_limit_x(): Float {
        throw NotImplementedError("_get_angular_hi_limit_x is not implemented for Generic6DOFJoint")
    }


    open fun _set_angular_lo_limit_x(angle: Float) {
    }


    open fun _get_angular_lo_limit_x(): Float {
        throw NotImplementedError("_get_angular_lo_limit_x is not implemented for Generic6DOFJoint")
    }


    open fun _set_angular_hi_limit_y(angle: Float) {
    }


    open fun _get_angular_hi_limit_y(): Float {
        throw NotImplementedError("_get_angular_hi_limit_y is not implemented for Generic6DOFJoint")
    }


    open fun _set_angular_lo_limit_y(angle: Float) {
    }


    open fun _get_angular_lo_limit_y(): Float {
        throw NotImplementedError("_get_angular_lo_limit_y is not implemented for Generic6DOFJoint")
    }


    open fun _set_angular_hi_limit_z(angle: Float) {
    }


    open fun _get_angular_hi_limit_z(): Float {
        throw NotImplementedError("_get_angular_hi_limit_z is not implemented for Generic6DOFJoint")
    }


    open fun _set_angular_lo_limit_z(angle: Float) {
    }


    open fun _get_angular_lo_limit_z(): Float {
        throw NotImplementedError("_get_angular_lo_limit_z is not implemented for Generic6DOFJoint")
    }


    private val setParamXMethodBind: CPointer<godot_method_bind> by lazy { getMB("Generic6DOFJoint", "set_param_x") }
    open fun setParamX(param: Int, value: Float) {
        _icall_Unit_Int_Float(setParamXMethodBind, this.rawMemory, param, value)
    }


    private val getParamXMethodBind: CPointer<godot_method_bind> by lazy { getMB("Generic6DOFJoint", "get_param_x") }
    open fun getParamX(param: Int): Float {
        return _icall_Float_Int(getParamXMethodBind, this.rawMemory, param)
    }


    private val setParamYMethodBind: CPointer<godot_method_bind> by lazy { getMB("Generic6DOFJoint", "set_param_y") }
    open fun setParamY(param: Int, value: Float) {
        _icall_Unit_Int_Float(setParamYMethodBind, this.rawMemory, param, value)
    }


    private val getParamYMethodBind: CPointer<godot_method_bind> by lazy { getMB("Generic6DOFJoint", "get_param_y") }
    open fun getParamY(param: Int): Float {
        return _icall_Float_Int(getParamYMethodBind, this.rawMemory, param)
    }


    private val setParamZMethodBind: CPointer<godot_method_bind> by lazy { getMB("Generic6DOFJoint", "set_param_z") }
    open fun setParamZ(param: Int, value: Float) {
        _icall_Unit_Int_Float(setParamZMethodBind, this.rawMemory, param, value)
    }


    private val getParamZMethodBind: CPointer<godot_method_bind> by lazy { getMB("Generic6DOFJoint", "get_param_z") }
    open fun getParamZ(param: Int): Float {
        return _icall_Float_Int(getParamZMethodBind, this.rawMemory, param)
    }


    private val setFlagXMethodBind: CPointer<godot_method_bind> by lazy { getMB("Generic6DOFJoint", "set_flag_x") }
    open fun setFlagX(flag: Int, value: Boolean) {
        _icall_Unit_Int_Boolean(setFlagXMethodBind, this.rawMemory, flag, value)
    }


    private val getFlagXMethodBind: CPointer<godot_method_bind> by lazy { getMB("Generic6DOFJoint", "get_flag_x") }
    open fun getFlagX(flag: Int): Boolean {
        return _icall_Boolean_Int(getFlagXMethodBind, this.rawMemory, flag)
    }


    private val setFlagYMethodBind: CPointer<godot_method_bind> by lazy { getMB("Generic6DOFJoint", "set_flag_y") }
    open fun setFlagY(flag: Int, value: Boolean) {
        _icall_Unit_Int_Boolean(setFlagYMethodBind, this.rawMemory, flag, value)
    }


    private val getFlagYMethodBind: CPointer<godot_method_bind> by lazy { getMB("Generic6DOFJoint", "get_flag_y") }
    open fun getFlagY(flag: Int): Boolean {
        return _icall_Boolean_Int(getFlagYMethodBind, this.rawMemory, flag)
    }


    private val setFlagZMethodBind: CPointer<godot_method_bind> by lazy { getMB("Generic6DOFJoint", "set_flag_z") }
    open fun setFlagZ(flag: Int, value: Boolean) {
        _icall_Unit_Int_Boolean(setFlagZMethodBind, this.rawMemory, flag, value)
    }


    private val getFlagZMethodBind: CPointer<godot_method_bind> by lazy { getMB("Generic6DOFJoint", "get_flag_z") }
    open fun getFlagZ(flag: Int): Boolean {
        return _icall_Boolean_Int(getFlagZMethodBind, this.rawMemory, flag)
    }


}
