@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class VehicleWheel : Spatial {
    constructor() : super("VehicleWheel")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 



    // Signals
    class Signal {
        companion object {
        }
    }


    companion object {
        infix fun from(other: Spatial): VehicleWheel = VehicleWheel("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): VehicleWheel = VehicleWheel("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): VehicleWheel = VehicleWheel("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): VehicleWheel = fromVariant(VehicleWheel(""), other)


        // Constants


    }


    // Properties
    open var useAsTraction: Boolean
        get() = _icall_Boolean(isUsedAsTractionMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setUseAsTractionMethodBind, this.rawMemory, value)


    open var useAsSteering: Boolean
        get() = _icall_Boolean(isUsedAsSteeringMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setUseAsSteeringMethodBind, this.rawMemory, value)


    open var wheelRollInfluence: Float
        get() = _icall_Float(getRollInfluenceMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setRollInfluenceMethodBind, this.rawMemory, value)


    open var wheelRadius: Float
        get() = _icall_Float(getRadiusMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setRadiusMethodBind, this.rawMemory, value)


    open var wheelRestLength: Float
        get() = _icall_Float(getSuspensionRestLengthMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setSuspensionRestLengthMethodBind, this.rawMemory, value)


    open var wheelFrictionSlip: Float
        get() = _icall_Float(getFrictionSlipMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setFrictionSlipMethodBind, this.rawMemory, value)


    open var suspensionTravel: Float
        get() = _icall_Float(getSuspensionTravelMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setSuspensionTravelMethodBind, this.rawMemory, value)


    open var suspensionStiffness: Float
        get() = _icall_Float(getSuspensionStiffnessMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setSuspensionStiffnessMethodBind, this.rawMemory, value)


    open var suspensionMaxForce: Float
        get() = _icall_Float(getSuspensionMaxForceMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setSuspensionMaxForceMethodBind, this.rawMemory, value)


    open var dampingCompression: Float
        get() = _icall_Float(getDampingCompressionMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setDampingCompressionMethodBind, this.rawMemory, value)


    open var dampingRelaxation: Float
        get() = _icall_Float(getDampingRelaxationMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setDampingRelaxationMethodBind, this.rawMemory, value)




    // Methods
    private val setRadiusMethodBind: CPointer<godot_method_bind> by lazy { getMB("VehicleWheel", "set_radius") }
    open fun setRadius(length: Float) {
        _icall_Unit_Float(setRadiusMethodBind, this.rawMemory, length)
    }


    private val getRadiusMethodBind: CPointer<godot_method_bind> by lazy { getMB("VehicleWheel", "get_radius") }
    open fun getRadius(): Float {
        return _icall_Float(getRadiusMethodBind, this.rawMemory)
    }


    private val setSuspensionRestLengthMethodBind: CPointer<godot_method_bind> by lazy { getMB("VehicleWheel", "set_suspension_rest_length") }
    open fun setSuspensionRestLength(length: Float) {
        _icall_Unit_Float(setSuspensionRestLengthMethodBind, this.rawMemory, length)
    }


    private val getSuspensionRestLengthMethodBind: CPointer<godot_method_bind> by lazy { getMB("VehicleWheel", "get_suspension_rest_length") }
    open fun getSuspensionRestLength(): Float {
        return _icall_Float(getSuspensionRestLengthMethodBind, this.rawMemory)
    }


    private val setSuspensionTravelMethodBind: CPointer<godot_method_bind> by lazy { getMB("VehicleWheel", "set_suspension_travel") }
    open fun setSuspensionTravel(length: Float) {
        _icall_Unit_Float(setSuspensionTravelMethodBind, this.rawMemory, length)
    }


    private val getSuspensionTravelMethodBind: CPointer<godot_method_bind> by lazy { getMB("VehicleWheel", "get_suspension_travel") }
    open fun getSuspensionTravel(): Float {
        return _icall_Float(getSuspensionTravelMethodBind, this.rawMemory)
    }


    private val setSuspensionStiffnessMethodBind: CPointer<godot_method_bind> by lazy { getMB("VehicleWheel", "set_suspension_stiffness") }
    open fun setSuspensionStiffness(length: Float) {
        _icall_Unit_Float(setSuspensionStiffnessMethodBind, this.rawMemory, length)
    }


    private val getSuspensionStiffnessMethodBind: CPointer<godot_method_bind> by lazy { getMB("VehicleWheel", "get_suspension_stiffness") }
    open fun getSuspensionStiffness(): Float {
        return _icall_Float(getSuspensionStiffnessMethodBind, this.rawMemory)
    }


    private val setSuspensionMaxForceMethodBind: CPointer<godot_method_bind> by lazy { getMB("VehicleWheel", "set_suspension_max_force") }
    open fun setSuspensionMaxForce(length: Float) {
        _icall_Unit_Float(setSuspensionMaxForceMethodBind, this.rawMemory, length)
    }


    private val getSuspensionMaxForceMethodBind: CPointer<godot_method_bind> by lazy { getMB("VehicleWheel", "get_suspension_max_force") }
    open fun getSuspensionMaxForce(): Float {
        return _icall_Float(getSuspensionMaxForceMethodBind, this.rawMemory)
    }


    private val setDampingCompressionMethodBind: CPointer<godot_method_bind> by lazy { getMB("VehicleWheel", "set_damping_compression") }
    open fun setDampingCompression(length: Float) {
        _icall_Unit_Float(setDampingCompressionMethodBind, this.rawMemory, length)
    }


    private val getDampingCompressionMethodBind: CPointer<godot_method_bind> by lazy { getMB("VehicleWheel", "get_damping_compression") }
    open fun getDampingCompression(): Float {
        return _icall_Float(getDampingCompressionMethodBind, this.rawMemory)
    }


    private val setDampingRelaxationMethodBind: CPointer<godot_method_bind> by lazy { getMB("VehicleWheel", "set_damping_relaxation") }
    open fun setDampingRelaxation(length: Float) {
        _icall_Unit_Float(setDampingRelaxationMethodBind, this.rawMemory, length)
    }


    private val getDampingRelaxationMethodBind: CPointer<godot_method_bind> by lazy { getMB("VehicleWheel", "get_damping_relaxation") }
    open fun getDampingRelaxation(): Float {
        return _icall_Float(getDampingRelaxationMethodBind, this.rawMemory)
    }


    private val setUseAsTractionMethodBind: CPointer<godot_method_bind> by lazy { getMB("VehicleWheel", "set_use_as_traction") }
    open fun setUseAsTraction(enable: Boolean) {
        _icall_Unit_Boolean(setUseAsTractionMethodBind, this.rawMemory, enable)
    }


    private val isUsedAsTractionMethodBind: CPointer<godot_method_bind> by lazy { getMB("VehicleWheel", "is_used_as_traction") }
    open fun isUsedAsTraction(): Boolean {
        return _icall_Boolean(isUsedAsTractionMethodBind, this.rawMemory)
    }


    private val setUseAsSteeringMethodBind: CPointer<godot_method_bind> by lazy { getMB("VehicleWheel", "set_use_as_steering") }
    open fun setUseAsSteering(enable: Boolean) {
        _icall_Unit_Boolean(setUseAsSteeringMethodBind, this.rawMemory, enable)
    }


    private val isUsedAsSteeringMethodBind: CPointer<godot_method_bind> by lazy { getMB("VehicleWheel", "is_used_as_steering") }
    open fun isUsedAsSteering(): Boolean {
        return _icall_Boolean(isUsedAsSteeringMethodBind, this.rawMemory)
    }


    private val setFrictionSlipMethodBind: CPointer<godot_method_bind> by lazy { getMB("VehicleWheel", "set_friction_slip") }
    open fun setFrictionSlip(length: Float) {
        _icall_Unit_Float(setFrictionSlipMethodBind, this.rawMemory, length)
    }


    private val getFrictionSlipMethodBind: CPointer<godot_method_bind> by lazy { getMB("VehicleWheel", "get_friction_slip") }
    open fun getFrictionSlip(): Float {
        return _icall_Float(getFrictionSlipMethodBind, this.rawMemory)
    }


    private val isInContactMethodBind: CPointer<godot_method_bind> by lazy { getMB("VehicleWheel", "is_in_contact") }
    open fun isInContact(): Boolean {
        return _icall_Boolean(isInContactMethodBind, this.rawMemory)
    }


    private val setRollInfluenceMethodBind: CPointer<godot_method_bind> by lazy { getMB("VehicleWheel", "set_roll_influence") }
    open fun setRollInfluence(rollInfluence: Float) {
        _icall_Unit_Float(setRollInfluenceMethodBind, this.rawMemory, rollInfluence)
    }


    private val getRollInfluenceMethodBind: CPointer<godot_method_bind> by lazy { getMB("VehicleWheel", "get_roll_influence") }
    open fun getRollInfluence(): Float {
        return _icall_Float(getRollInfluenceMethodBind, this.rawMemory)
    }


    private val getSkidinfoMethodBind: CPointer<godot_method_bind> by lazy { getMB("VehicleWheel", "get_skidinfo") }
    open fun getSkidinfo(): Float {
        return _icall_Float(getSkidinfoMethodBind, this.rawMemory)
    }


}
