@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class PhysicalBone : PhysicsBody {
    constructor() : super("PhysicalBone")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class JointType(val id: Long) {
        JOINT_TYPE_NONE(0),
        JOINT_TYPE_PIN(1),
        JOINT_TYPE_CONE(2),
        JOINT_TYPE_HINGE(3),
        JOINT_TYPE_SLIDER(4),
        JOINT_TYPE_6DOF(5),
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
        infix fun from(other: PhysicsBody): PhysicalBone = PhysicalBone("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CollisionObject): PhysicalBone = PhysicalBone("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Spatial): PhysicalBone = PhysicalBone("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): PhysicalBone = PhysicalBone("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): PhysicalBone = PhysicalBone("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): PhysicalBone = fromVariant(PhysicalBone(""), other)


        // Constants
        const val JOINT_TYPE_NONE: Long = 0
        const val JOINT_TYPE_PIN: Long = 1
        const val JOINT_TYPE_CONE: Long = 2
        const val JOINT_TYPE_HINGE: Long = 3
        const val JOINT_TYPE_SLIDER: Long = 4
        const val JOINT_TYPE_6DOF: Long = 5


    }


    // Properties
    open var jointType: Long
        get() = _icall_Long(getJointTypeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setJointTypeMethodBind, this.rawMemory, value)


    open var jointOffset: Transform
        get() = _icall_Transform(getJointOffsetMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Transform(setJointOffsetMethodBind, this.rawMemory, value)
    open fun jointOffset(shedule: (Transform) -> Unit): Transform = jointOffset.apply {
        shedule(this)
        jointOffset = this
    }


    open var bodyOffset: Transform
        get() = _icall_Transform(getBodyOffsetMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Transform(setBodyOffsetMethodBind, this.rawMemory, value)
    open fun bodyOffset(shedule: (Transform) -> Unit): Transform = bodyOffset.apply {
        shedule(this)
        bodyOffset = this
    }


    open var mass: Double
        get() = _icall_Double(getMassMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setMassMethodBind, this.rawMemory, value)


    open var weight: Double
        get() = _icall_Double(getWeightMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setWeightMethodBind, this.rawMemory, value)


    open var friction: Double
        get() = _icall_Double(getFrictionMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setFrictionMethodBind, this.rawMemory, value)


    open var bounce: Double
        get() = _icall_Double(getBounceMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setBounceMethodBind, this.rawMemory, value)


    open var gravityScale: Double
        get() = _icall_Double(getGravityScaleMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setGravityScaleMethodBind, this.rawMemory, value)




    // Methods
    open fun _direct_state_changed(arg0: Object) {
    }


    private val setJointTypeMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicalBone", "set_joint_type") }
    open fun setJointType(jointType: Long) {
        _icall_Unit_Long(setJointTypeMethodBind, this.rawMemory, jointType)
    }


    private val getJointTypeMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicalBone", "get_joint_type") }
    open fun getJointType(): PhysicalBone.JointType {
        return PhysicalBone.JointType.fromInt(_icall_Long(getJointTypeMethodBind, this.rawMemory))
    }


    private val setJointOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicalBone", "set_joint_offset") }
    open fun setJointOffset(offset: Transform) {
        _icall_Unit_Transform(setJointOffsetMethodBind, this.rawMemory, offset)
    }


    private val getJointOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicalBone", "get_joint_offset") }
    open fun getJointOffset(): Transform {
        return _icall_Transform(getJointOffsetMethodBind, this.rawMemory)
    }


    private val setBodyOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicalBone", "set_body_offset") }
    open fun setBodyOffset(offset: Transform) {
        _icall_Unit_Transform(setBodyOffsetMethodBind, this.rawMemory, offset)
    }


    private val getBodyOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicalBone", "get_body_offset") }
    open fun getBodyOffset(): Transform {
        return _icall_Transform(getBodyOffsetMethodBind, this.rawMemory)
    }


    private val isStaticBodyMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicalBone", "is_static_body") }
    open fun isStaticBody(): Boolean {
        return _icall_Boolean(isStaticBodyMethodBind, this.rawMemory)
    }


    private val getSimulatePhysicsMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicalBone", "get_simulate_physics") }
    open fun getSimulatePhysics(): Boolean {
        return _icall_Boolean(getSimulatePhysicsMethodBind, this.rawMemory)
    }


    private val isSimulatingPhysicsMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicalBone", "is_simulating_physics") }
    open fun isSimulatingPhysics(): Boolean {
        return _icall_Boolean(isSimulatingPhysicsMethodBind, this.rawMemory)
    }


    private val setMassMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicalBone", "set_mass") }
    open fun setMass(mass: Double) {
        _icall_Unit_Double(setMassMethodBind, this.rawMemory, mass)
    }


    private val getMassMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicalBone", "get_mass") }
    open fun getMass(): Double {
        return _icall_Double(getMassMethodBind, this.rawMemory)
    }


    private val setWeightMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicalBone", "set_weight") }
    open fun setWeight(weight: Double) {
        _icall_Unit_Double(setWeightMethodBind, this.rawMemory, weight)
    }


    private val getWeightMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicalBone", "get_weight") }
    open fun getWeight(): Double {
        return _icall_Double(getWeightMethodBind, this.rawMemory)
    }


    private val setFrictionMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicalBone", "set_friction") }
    open fun setFriction(friction: Double) {
        _icall_Unit_Double(setFrictionMethodBind, this.rawMemory, friction)
    }


    private val getFrictionMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicalBone", "get_friction") }
    open fun getFriction(): Double {
        return _icall_Double(getFrictionMethodBind, this.rawMemory)
    }


    private val setBounceMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicalBone", "set_bounce") }
    open fun setBounce(bounce: Double) {
        _icall_Unit_Double(setBounceMethodBind, this.rawMemory, bounce)
    }


    private val getBounceMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicalBone", "get_bounce") }
    open fun getBounce(): Double {
        return _icall_Double(getBounceMethodBind, this.rawMemory)
    }


    private val setGravityScaleMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicalBone", "set_gravity_scale") }
    open fun setGravityScale(gravityScale: Double) {
        _icall_Unit_Double(setGravityScaleMethodBind, this.rawMemory, gravityScale)
    }


    private val getGravityScaleMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicalBone", "get_gravity_scale") }
    open fun getGravityScale(): Double {
        return _icall_Double(getGravityScaleMethodBind, this.rawMemory)
    }


}
