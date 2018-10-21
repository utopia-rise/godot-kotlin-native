@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class RigidBody : PhysicsBody {
    constructor() : super("RigidBody")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class Mode(val id: Long) {
        MODE_RIGID(0),
        MODE_STATIC(1),
        MODE_CHARACTER(2),
        MODE_KINEMATIC(3),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }


    // Signals
    class Signal {
        companion object {
            const val BODY_ENTERED: String = "body_entered"
            const val BODY_SHAPE_ENTERED: String = "body_shape_entered"
            const val SLEEPING_STATE_CHANGED: String = "sleeping_state_changed"
            const val BODY_EXITED: String = "body_exited"
            const val BODY_SHAPE_EXITED: String = "body_shape_exited"
        }
    }


    companion object {
        infix fun from(other: PhysicsBody): RigidBody = RigidBody("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CollisionObject): RigidBody = RigidBody("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Spatial): RigidBody = RigidBody("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): RigidBody = RigidBody("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): RigidBody = RigidBody("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): RigidBody = fromVariant(RigidBody(""), other)


        // Constants
        const val MODE_RIGID: Long = 0
        const val MODE_STATIC: Long = 1
        const val MODE_CHARACTER: Long = 2
        const val MODE_KINEMATIC: Long = 3


    }


    // Properties
    open var mode: Long
        get() = _icall_Long(getModeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setModeMethodBind, this.rawMemory, value)


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


    open var customIntegrator: Boolean
        get() = _icall_Boolean(isUsingCustomIntegratorMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setUseCustomIntegratorMethodBind, this.rawMemory, value)


    open var continuousCd: Boolean
        get() = _icall_Boolean(isUsingContinuousCollisionDetectionMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setUseContinuousCollisionDetectionMethodBind, this.rawMemory, value)


    open var contactsReported: Long
        get() = _icall_Long(getMaxContactsReportedMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setMaxContactsReportedMethodBind, this.rawMemory, value)


    open var contactMonitor: Boolean
        get() = _icall_Boolean(isContactMonitorEnabledMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setContactMonitorMethodBind, this.rawMemory, value)


    open var sleeping: Boolean
        get() = _icall_Boolean(isSleepingMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setSleepingMethodBind, this.rawMemory, value)


    open var canSleep: Boolean
        get() = _icall_Boolean(isAbleToSleepMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setCanSleepMethodBind, this.rawMemory, value)


    open var axisLockLinearX: Boolean
        get() = _icall_Boolean_Long(getAxisLockMethodBind, this.rawMemory, 1)
        set(value) = _icall_Unit_Long_Boolean(setAxisLockMethodBind, this.rawMemory, 1, value)


    open var axisLockLinearY: Boolean
        get() = _icall_Boolean_Long(getAxisLockMethodBind, this.rawMemory, 2)
        set(value) = _icall_Unit_Long_Boolean(setAxisLockMethodBind, this.rawMemory, 2, value)


    open var axisLockLinearZ: Boolean
        get() = _icall_Boolean_Long(getAxisLockMethodBind, this.rawMemory, 4)
        set(value) = _icall_Unit_Long_Boolean(setAxisLockMethodBind, this.rawMemory, 4, value)


    open var axisLockAngularX: Boolean
        get() = _icall_Boolean_Long(getAxisLockMethodBind, this.rawMemory, 8)
        set(value) = _icall_Unit_Long_Boolean(setAxisLockMethodBind, this.rawMemory, 8, value)


    open var axisLockAngularY: Boolean
        get() = _icall_Boolean_Long(getAxisLockMethodBind, this.rawMemory, 16)
        set(value) = _icall_Unit_Long_Boolean(setAxisLockMethodBind, this.rawMemory, 16, value)


    open var axisLockAngularZ: Boolean
        get() = _icall_Boolean_Long(getAxisLockMethodBind, this.rawMemory, 32)
        set(value) = _icall_Unit_Long_Boolean(setAxisLockMethodBind, this.rawMemory, 32, value)


    open var linearVelocity: Vector3
        get() = _icall_Vector3(getLinearVelocityMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Vector3(setLinearVelocityMethodBind, this.rawMemory, value)
    open fun linearVelocity(shedule: (Vector3) -> Unit): Vector3 = linearVelocity.apply {
        shedule(this)
        linearVelocity = this
    }


    open var linearDamp: Double
        get() = _icall_Double(getLinearDampMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setLinearDampMethodBind, this.rawMemory, value)


    open var angularVelocity: Vector3
        get() = _icall_Vector3(getAngularVelocityMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Vector3(setAngularVelocityMethodBind, this.rawMemory, value)
    open fun angularVelocity(shedule: (Vector3) -> Unit): Vector3 = angularVelocity.apply {
        shedule(this)
        angularVelocity = this
    }


    open var angularDamp: Double
        get() = _icall_Double(getAngularDampMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setAngularDampMethodBind, this.rawMemory, value)




    // Methods
    open fun _integrate_forces(state: PhysicsDirectBodyState) {
    }


    private val setModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("RigidBody", "set_mode") }
    open fun setMode(mode: Long) {
        _icall_Unit_Long(setModeMethodBind, this.rawMemory, mode)
    }


    private val getModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("RigidBody", "get_mode") }
    open fun getMode(): RigidBody.Mode {
        return RigidBody.Mode.fromInt(_icall_Long(getModeMethodBind, this.rawMemory))
    }


    private val setMassMethodBind: CPointer<godot_method_bind> by lazy { getMB("RigidBody", "set_mass") }
    open fun setMass(mass: Double) {
        _icall_Unit_Double(setMassMethodBind, this.rawMemory, mass)
    }


    private val getMassMethodBind: CPointer<godot_method_bind> by lazy { getMB("RigidBody", "get_mass") }
    open fun getMass(): Double {
        return _icall_Double(getMassMethodBind, this.rawMemory)
    }


    private val setWeightMethodBind: CPointer<godot_method_bind> by lazy { getMB("RigidBody", "set_weight") }
    open fun setWeight(weight: Double) {
        _icall_Unit_Double(setWeightMethodBind, this.rawMemory, weight)
    }


    private val getWeightMethodBind: CPointer<godot_method_bind> by lazy { getMB("RigidBody", "get_weight") }
    open fun getWeight(): Double {
        return _icall_Double(getWeightMethodBind, this.rawMemory)
    }


    private val setFrictionMethodBind: CPointer<godot_method_bind> by lazy { getMB("RigidBody", "set_friction") }
    open fun setFriction(friction: Double) {
        _icall_Unit_Double(setFrictionMethodBind, this.rawMemory, friction)
    }


    private val getFrictionMethodBind: CPointer<godot_method_bind> by lazy { getMB("RigidBody", "get_friction") }
    open fun getFriction(): Double {
        return _icall_Double(getFrictionMethodBind, this.rawMemory)
    }


    private val setBounceMethodBind: CPointer<godot_method_bind> by lazy { getMB("RigidBody", "set_bounce") }
    open fun setBounce(bounce: Double) {
        _icall_Unit_Double(setBounceMethodBind, this.rawMemory, bounce)
    }


    private val getBounceMethodBind: CPointer<godot_method_bind> by lazy { getMB("RigidBody", "get_bounce") }
    open fun getBounce(): Double {
        return _icall_Double(getBounceMethodBind, this.rawMemory)
    }


    private val setLinearVelocityMethodBind: CPointer<godot_method_bind> by lazy { getMB("RigidBody", "set_linear_velocity") }
    open fun setLinearVelocity(linearVelocity: Vector3) {
        _icall_Unit_Vector3(setLinearVelocityMethodBind, this.rawMemory, linearVelocity)
    }


    private val getLinearVelocityMethodBind: CPointer<godot_method_bind> by lazy { getMB("RigidBody", "get_linear_velocity") }
    open fun getLinearVelocity(): Vector3 {
        return _icall_Vector3(getLinearVelocityMethodBind, this.rawMemory)
    }


    private val setAngularVelocityMethodBind: CPointer<godot_method_bind> by lazy { getMB("RigidBody", "set_angular_velocity") }
    open fun setAngularVelocity(angularVelocity: Vector3) {
        _icall_Unit_Vector3(setAngularVelocityMethodBind, this.rawMemory, angularVelocity)
    }


    private val getAngularVelocityMethodBind: CPointer<godot_method_bind> by lazy { getMB("RigidBody", "get_angular_velocity") }
    open fun getAngularVelocity(): Vector3 {
        return _icall_Vector3(getAngularVelocityMethodBind, this.rawMemory)
    }


    private val setGravityScaleMethodBind: CPointer<godot_method_bind> by lazy { getMB("RigidBody", "set_gravity_scale") }
    open fun setGravityScale(gravityScale: Double) {
        _icall_Unit_Double(setGravityScaleMethodBind, this.rawMemory, gravityScale)
    }


    private val getGravityScaleMethodBind: CPointer<godot_method_bind> by lazy { getMB("RigidBody", "get_gravity_scale") }
    open fun getGravityScale(): Double {
        return _icall_Double(getGravityScaleMethodBind, this.rawMemory)
    }


    private val setLinearDampMethodBind: CPointer<godot_method_bind> by lazy { getMB("RigidBody", "set_linear_damp") }
    open fun setLinearDamp(linearDamp: Double) {
        _icall_Unit_Double(setLinearDampMethodBind, this.rawMemory, linearDamp)
    }


    private val getLinearDampMethodBind: CPointer<godot_method_bind> by lazy { getMB("RigidBody", "get_linear_damp") }
    open fun getLinearDamp(): Double {
        return _icall_Double(getLinearDampMethodBind, this.rawMemory)
    }


    private val setAngularDampMethodBind: CPointer<godot_method_bind> by lazy { getMB("RigidBody", "set_angular_damp") }
    open fun setAngularDamp(angularDamp: Double) {
        _icall_Unit_Double(setAngularDampMethodBind, this.rawMemory, angularDamp)
    }


    private val getAngularDampMethodBind: CPointer<godot_method_bind> by lazy { getMB("RigidBody", "get_angular_damp") }
    open fun getAngularDamp(): Double {
        return _icall_Double(getAngularDampMethodBind, this.rawMemory)
    }


    private val setMaxContactsReportedMethodBind: CPointer<godot_method_bind> by lazy { getMB("RigidBody", "set_max_contacts_reported") }
    open fun setMaxContactsReported(amount: Long) {
        _icall_Unit_Long(setMaxContactsReportedMethodBind, this.rawMemory, amount)
    }


    private val getMaxContactsReportedMethodBind: CPointer<godot_method_bind> by lazy { getMB("RigidBody", "get_max_contacts_reported") }
    open fun getMaxContactsReported(): Long {
        return _icall_Long(getMaxContactsReportedMethodBind, this.rawMemory)
    }


    private val setUseCustomIntegratorMethodBind: CPointer<godot_method_bind> by lazy { getMB("RigidBody", "set_use_custom_integrator") }
    open fun setUseCustomIntegrator(enable: Boolean) {
        _icall_Unit_Boolean(setUseCustomIntegratorMethodBind, this.rawMemory, enable)
    }


    private val isUsingCustomIntegratorMethodBind: CPointer<godot_method_bind> by lazy { getMB("RigidBody", "is_using_custom_integrator") }
    open fun isUsingCustomIntegrator(): Boolean {
        return _icall_Boolean(isUsingCustomIntegratorMethodBind, this.rawMemory)
    }


    private val setContactMonitorMethodBind: CPointer<godot_method_bind> by lazy { getMB("RigidBody", "set_contact_monitor") }
    open fun setContactMonitor(enabled: Boolean) {
        _icall_Unit_Boolean(setContactMonitorMethodBind, this.rawMemory, enabled)
    }


    private val isContactMonitorEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("RigidBody", "is_contact_monitor_enabled") }
    open fun isContactMonitorEnabled(): Boolean {
        return _icall_Boolean(isContactMonitorEnabledMethodBind, this.rawMemory)
    }


    private val setUseContinuousCollisionDetectionMethodBind: CPointer<godot_method_bind> by lazy { getMB("RigidBody", "set_use_continuous_collision_detection") }
    open fun setUseContinuousCollisionDetection(enable: Boolean) {
        _icall_Unit_Boolean(setUseContinuousCollisionDetectionMethodBind, this.rawMemory, enable)
    }


    private val isUsingContinuousCollisionDetectionMethodBind: CPointer<godot_method_bind> by lazy { getMB("RigidBody", "is_using_continuous_collision_detection") }
    open fun isUsingContinuousCollisionDetection(): Boolean {
        return _icall_Boolean(isUsingContinuousCollisionDetectionMethodBind, this.rawMemory)
    }


    private val setAxisVelocityMethodBind: CPointer<godot_method_bind> by lazy { getMB("RigidBody", "set_axis_velocity") }
    open fun setAxisVelocity(axisVelocity: Vector3) {
        _icall_Unit_Vector3(setAxisVelocityMethodBind, this.rawMemory, axisVelocity)
    }


    private val applyImpulseMethodBind: CPointer<godot_method_bind> by lazy { getMB("RigidBody", "apply_impulse") }
    open fun applyImpulse(position: Vector3, impulse: Vector3) {
        _icall_Unit_Vector3_Vector3(applyImpulseMethodBind, this.rawMemory, position, impulse)
    }


    private val applyTorqueImpulseMethodBind: CPointer<godot_method_bind> by lazy { getMB("RigidBody", "apply_torque_impulse") }
    open fun applyTorqueImpulse(impulse: Vector3) {
        _icall_Unit_Vector3(applyTorqueImpulseMethodBind, this.rawMemory, impulse)
    }


    private val setSleepingMethodBind: CPointer<godot_method_bind> by lazy { getMB("RigidBody", "set_sleeping") }
    open fun setSleeping(sleeping: Boolean) {
        _icall_Unit_Boolean(setSleepingMethodBind, this.rawMemory, sleeping)
    }


    private val isSleepingMethodBind: CPointer<godot_method_bind> by lazy { getMB("RigidBody", "is_sleeping") }
    open fun isSleeping(): Boolean {
        return _icall_Boolean(isSleepingMethodBind, this.rawMemory)
    }


    private val setCanSleepMethodBind: CPointer<godot_method_bind> by lazy { getMB("RigidBody", "set_can_sleep") }
    open fun setCanSleep(ableToSleep: Boolean) {
        _icall_Unit_Boolean(setCanSleepMethodBind, this.rawMemory, ableToSleep)
    }


    private val isAbleToSleepMethodBind: CPointer<godot_method_bind> by lazy { getMB("RigidBody", "is_able_to_sleep") }
    open fun isAbleToSleep(): Boolean {
        return _icall_Boolean(isAbleToSleepMethodBind, this.rawMemory)
    }


    open fun _direct_state_changed(arg0: Object) {
    }


    open fun _body_enter_tree(arg0: Long) {
    }


    open fun _body_exit_tree(arg0: Long) {
    }


    private val setAxisLockMethodBind: CPointer<godot_method_bind> by lazy { getMB("RigidBody", "set_axis_lock") }
    open fun setAxisLock(axis: Long, lock: Boolean) {
        _icall_Unit_Long_Boolean(setAxisLockMethodBind, this.rawMemory, axis, lock)
    }


    private val getAxisLockMethodBind: CPointer<godot_method_bind> by lazy { getMB("RigidBody", "get_axis_lock") }
    open fun getAxisLock(axis: Long): Boolean {
        return _icall_Boolean_Long(getAxisLockMethodBind, this.rawMemory, axis)
    }


    private val getCollidingBodiesMethodBind: CPointer<godot_method_bind> by lazy { getMB("RigidBody", "get_colliding_bodies") }
    open fun getCollidingBodies(): GDArray {
        return _icall_GDArray(getCollidingBodiesMethodBind, this.rawMemory)
    }


}
