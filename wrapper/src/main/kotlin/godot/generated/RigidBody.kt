@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class RigidBody : PhysicsBody {
    constructor() : super("RigidBody")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class Mode(val id: Int) {
        MODE_RIGID(0),
        MODE_STATIC(1),
        MODE_CHARACTER(2),
        MODE_KINEMATIC(3),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
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
        const val MODE_RIGID: Int = 0
        const val MODE_STATIC: Int = 1
        const val MODE_CHARACTER: Int = 2
        const val MODE_KINEMATIC: Int = 3


    }


    // Properties
    open var mode: Int
        get() = _icall_Int(getModeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setModeMethodBind, this.rawMemory, value)


    open var mass: Float
        get() = _icall_Float(getMassMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setMassMethodBind, this.rawMemory, value)


    open var weight: Float
        get() = _icall_Float(getWeightMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setWeightMethodBind, this.rawMemory, value)


    open var friction: Float
        get() = _icall_Float(getFrictionMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setFrictionMethodBind, this.rawMemory, value)


    open var bounce: Float
        get() = _icall_Float(getBounceMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setBounceMethodBind, this.rawMemory, value)


    open var gravityScale: Float
        get() = _icall_Float(getGravityScaleMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setGravityScaleMethodBind, this.rawMemory, value)


    open var customIntegrator: Boolean
        get() = _icall_Boolean(isUsingCustomIntegratorMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setUseCustomIntegratorMethodBind, this.rawMemory, value)


    open var continuousCd: Boolean
        get() = _icall_Boolean(isUsingContinuousCollisionDetectionMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setUseContinuousCollisionDetectionMethodBind, this.rawMemory, value)


    open var contactsReported: Int
        get() = _icall_Int(getMaxContactsReportedMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setMaxContactsReportedMethodBind, this.rawMemory, value)


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
        get() = _icall_Boolean_Int(getAxisLockMethodBind, this.rawMemory, 1)
        set(value) = _icall_Unit_Int_Boolean(setAxisLockMethodBind, this.rawMemory, 1, value)


    open var axisLockLinearY: Boolean
        get() = _icall_Boolean_Int(getAxisLockMethodBind, this.rawMemory, 2)
        set(value) = _icall_Unit_Int_Boolean(setAxisLockMethodBind, this.rawMemory, 2, value)


    open var axisLockLinearZ: Boolean
        get() = _icall_Boolean_Int(getAxisLockMethodBind, this.rawMemory, 4)
        set(value) = _icall_Unit_Int_Boolean(setAxisLockMethodBind, this.rawMemory, 4, value)


    open var axisLockAngularX: Boolean
        get() = _icall_Boolean_Int(getAxisLockMethodBind, this.rawMemory, 8)
        set(value) = _icall_Unit_Int_Boolean(setAxisLockMethodBind, this.rawMemory, 8, value)


    open var axisLockAngularY: Boolean
        get() = _icall_Boolean_Int(getAxisLockMethodBind, this.rawMemory, 16)
        set(value) = _icall_Unit_Int_Boolean(setAxisLockMethodBind, this.rawMemory, 16, value)


    open var axisLockAngularZ: Boolean
        get() = _icall_Boolean_Int(getAxisLockMethodBind, this.rawMemory, 32)
        set(value) = _icall_Unit_Int_Boolean(setAxisLockMethodBind, this.rawMemory, 32, value)


    open var linearVelocity: Vector3
        get() = _icall_Vector3(getLinearVelocityMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Vector3(setLinearVelocityMethodBind, this.rawMemory, value)
    open fun linearVelocity(shedule: (Vector3) -> Unit): Vector3 = linearVelocity.apply {
        shedule(this)
        linearVelocity = this
    }


    open var linearDamp: Float
        get() = _icall_Float(getLinearDampMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setLinearDampMethodBind, this.rawMemory, value)


    open var angularVelocity: Vector3
        get() = _icall_Vector3(getAngularVelocityMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Vector3(setAngularVelocityMethodBind, this.rawMemory, value)
    open fun angularVelocity(shedule: (Vector3) -> Unit): Vector3 = angularVelocity.apply {
        shedule(this)
        angularVelocity = this
    }


    open var angularDamp: Float
        get() = _icall_Float(getAngularDampMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setAngularDampMethodBind, this.rawMemory, value)




    // Methods
    open fun _integrate_forces(state: PhysicsDirectBodyState) {
    }


    private val setModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("RigidBody", "set_mode") }
    open fun setMode(mode: Int) {
        _icall_Unit_Int(setModeMethodBind, this.rawMemory, mode)
    }


    private val getModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("RigidBody", "get_mode") }
    open fun getMode(): RigidBody.Mode {
        return RigidBody.Mode.fromInt(_icall_Int(getModeMethodBind, this.rawMemory))
    }


    private val setMassMethodBind: CPointer<godot_method_bind> by lazy { getMB("RigidBody", "set_mass") }
    open fun setMass(mass: Float) {
        _icall_Unit_Float(setMassMethodBind, this.rawMemory, mass)
    }


    private val getMassMethodBind: CPointer<godot_method_bind> by lazy { getMB("RigidBody", "get_mass") }
    open fun getMass(): Float {
        return _icall_Float(getMassMethodBind, this.rawMemory)
    }


    private val setWeightMethodBind: CPointer<godot_method_bind> by lazy { getMB("RigidBody", "set_weight") }
    open fun setWeight(weight: Float) {
        _icall_Unit_Float(setWeightMethodBind, this.rawMemory, weight)
    }


    private val getWeightMethodBind: CPointer<godot_method_bind> by lazy { getMB("RigidBody", "get_weight") }
    open fun getWeight(): Float {
        return _icall_Float(getWeightMethodBind, this.rawMemory)
    }


    private val setFrictionMethodBind: CPointer<godot_method_bind> by lazy { getMB("RigidBody", "set_friction") }
    open fun setFriction(friction: Float) {
        _icall_Unit_Float(setFrictionMethodBind, this.rawMemory, friction)
    }


    private val getFrictionMethodBind: CPointer<godot_method_bind> by lazy { getMB("RigidBody", "get_friction") }
    open fun getFriction(): Float {
        return _icall_Float(getFrictionMethodBind, this.rawMemory)
    }


    private val setBounceMethodBind: CPointer<godot_method_bind> by lazy { getMB("RigidBody", "set_bounce") }
    open fun setBounce(bounce: Float) {
        _icall_Unit_Float(setBounceMethodBind, this.rawMemory, bounce)
    }


    private val getBounceMethodBind: CPointer<godot_method_bind> by lazy { getMB("RigidBody", "get_bounce") }
    open fun getBounce(): Float {
        return _icall_Float(getBounceMethodBind, this.rawMemory)
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
    open fun setGravityScale(gravityScale: Float) {
        _icall_Unit_Float(setGravityScaleMethodBind, this.rawMemory, gravityScale)
    }


    private val getGravityScaleMethodBind: CPointer<godot_method_bind> by lazy { getMB("RigidBody", "get_gravity_scale") }
    open fun getGravityScale(): Float {
        return _icall_Float(getGravityScaleMethodBind, this.rawMemory)
    }


    private val setLinearDampMethodBind: CPointer<godot_method_bind> by lazy { getMB("RigidBody", "set_linear_damp") }
    open fun setLinearDamp(linearDamp: Float) {
        _icall_Unit_Float(setLinearDampMethodBind, this.rawMemory, linearDamp)
    }


    private val getLinearDampMethodBind: CPointer<godot_method_bind> by lazy { getMB("RigidBody", "get_linear_damp") }
    open fun getLinearDamp(): Float {
        return _icall_Float(getLinearDampMethodBind, this.rawMemory)
    }


    private val setAngularDampMethodBind: CPointer<godot_method_bind> by lazy { getMB("RigidBody", "set_angular_damp") }
    open fun setAngularDamp(angularDamp: Float) {
        _icall_Unit_Float(setAngularDampMethodBind, this.rawMemory, angularDamp)
    }


    private val getAngularDampMethodBind: CPointer<godot_method_bind> by lazy { getMB("RigidBody", "get_angular_damp") }
    open fun getAngularDamp(): Float {
        return _icall_Float(getAngularDampMethodBind, this.rawMemory)
    }


    private val setMaxContactsReportedMethodBind: CPointer<godot_method_bind> by lazy { getMB("RigidBody", "set_max_contacts_reported") }
    open fun setMaxContactsReported(amount: Int) {
        _icall_Unit_Int(setMaxContactsReportedMethodBind, this.rawMemory, amount)
    }


    private val getMaxContactsReportedMethodBind: CPointer<godot_method_bind> by lazy { getMB("RigidBody", "get_max_contacts_reported") }
    open fun getMaxContactsReported(): Int {
        return _icall_Int(getMaxContactsReportedMethodBind, this.rawMemory)
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


    open fun _body_enter_tree(arg0: Int) {
    }


    open fun _body_exit_tree(arg0: Int) {
    }


    private val setAxisLockMethodBind: CPointer<godot_method_bind> by lazy { getMB("RigidBody", "set_axis_lock") }
    open fun setAxisLock(axis: Int, lock: Boolean) {
        _icall_Unit_Int_Boolean(setAxisLockMethodBind, this.rawMemory, axis, lock)
    }


    private val getAxisLockMethodBind: CPointer<godot_method_bind> by lazy { getMB("RigidBody", "get_axis_lock") }
    open fun getAxisLock(axis: Int): Boolean {
        return _icall_Boolean_Int(getAxisLockMethodBind, this.rawMemory, axis)
    }


    private val getCollidingBodiesMethodBind: CPointer<godot_method_bind> by lazy { getMB("RigidBody", "get_colliding_bodies") }
    open fun getCollidingBodies(): GDArray {
        return _icall_GDArray(getCollidingBodiesMethodBind, this.rawMemory)
    }


}
