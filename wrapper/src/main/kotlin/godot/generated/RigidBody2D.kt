@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class RigidBody2D : PhysicsBody2D {
    constructor() : super("RigidBody2D")
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
    enum class CCDMode(val id: Int) {
        CCD_MODE_DISABLED(0),
        CCD_MODE_CAST_RAY(1),
        CCD_MODE_CAST_SHAPE(2),
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
        infix fun from(other: PhysicsBody2D): RigidBody2D = RigidBody2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CollisionObject2D): RigidBody2D = RigidBody2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node2D): RigidBody2D = RigidBody2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CanvasItem): RigidBody2D = RigidBody2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): RigidBody2D = RigidBody2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): RigidBody2D = RigidBody2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): RigidBody2D = fromVariant(RigidBody2D(""), other)


        // Constants
        const val MODE_RIGID: Int = 0
        const val MODE_STATIC: Int = 1
        const val MODE_CHARACTER: Int = 2
        const val MODE_KINEMATIC: Int = 3
        const val CCD_MODE_DISABLED: Int = 0
        const val CCD_MODE_CAST_RAY: Int = 1
        const val CCD_MODE_CAST_SHAPE: Int = 2


    }


    // Properties
    open var mode: Int
        get() = _icall_Int(getModeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setModeMethodBind, this.rawMemory, value)


    open var mass: Float
        get() = _icall_Float(getMassMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setMassMethodBind, this.rawMemory, value)


    open var inertia: Float
        get() = _icall_Float(getInertiaMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setInertiaMethodBind, this.rawMemory, value)


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


    open var continuousCd: Int
        get() = _icall_Int(getContinuousCollisionDetectionModeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setContinuousCollisionDetectionModeMethodBind, this.rawMemory, value)


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


    open var linearVelocity: Vector2
        get() = _icall_Vector2(getLinearVelocityMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Vector2(setLinearVelocityMethodBind, this.rawMemory, value)
    open fun linearVelocity(shedule: (Vector2) -> Unit): Vector2 = linearVelocity.apply {
        shedule(this)
        linearVelocity = this
    }


    open var linearDamp: Float
        get() = _icall_Float(getLinearDampMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setLinearDampMethodBind, this.rawMemory, value)


    open var angularVelocity: Float
        get() = _icall_Float(getAngularVelocityMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setAngularVelocityMethodBind, this.rawMemory, value)


    open var angularDamp: Float
        get() = _icall_Float(getAngularDampMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setAngularDampMethodBind, this.rawMemory, value)


    open var appliedForce: Vector2
        get() = _icall_Vector2(getAppliedForceMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Vector2(setAppliedForceMethodBind, this.rawMemory, value)
    open fun appliedForce(shedule: (Vector2) -> Unit): Vector2 = appliedForce.apply {
        shedule(this)
        appliedForce = this
    }


    open var appliedTorque: Float
        get() = _icall_Float(getAppliedTorqueMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setAppliedTorqueMethodBind, this.rawMemory, value)




    // Methods
    open fun _integrate_forces(state: Physics2DDirectBodyState) {
    }


    private val setModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("RigidBody2D", "set_mode") }
    open fun setMode(mode: Int) {
        _icall_Unit_Int(setModeMethodBind, this.rawMemory, mode)
    }


    private val getModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("RigidBody2D", "get_mode") }
    open fun getMode(): RigidBody2D.Mode {
        return RigidBody2D.Mode.fromInt(_icall_Int(getModeMethodBind, this.rawMemory))
    }


    private val setMassMethodBind: CPointer<godot_method_bind> by lazy { getMB("RigidBody2D", "set_mass") }
    open fun setMass(mass: Float) {
        _icall_Unit_Float(setMassMethodBind, this.rawMemory, mass)
    }


    private val getMassMethodBind: CPointer<godot_method_bind> by lazy { getMB("RigidBody2D", "get_mass") }
    open fun getMass(): Float {
        return _icall_Float(getMassMethodBind, this.rawMemory)
    }


    private val getInertiaMethodBind: CPointer<godot_method_bind> by lazy { getMB("RigidBody2D", "get_inertia") }
    open fun getInertia(): Float {
        return _icall_Float(getInertiaMethodBind, this.rawMemory)
    }


    private val setInertiaMethodBind: CPointer<godot_method_bind> by lazy { getMB("RigidBody2D", "set_inertia") }
    open fun setInertia(inertia: Float) {
        _icall_Unit_Float(setInertiaMethodBind, this.rawMemory, inertia)
    }


    private val setWeightMethodBind: CPointer<godot_method_bind> by lazy { getMB("RigidBody2D", "set_weight") }
    open fun setWeight(weight: Float) {
        _icall_Unit_Float(setWeightMethodBind, this.rawMemory, weight)
    }


    private val getWeightMethodBind: CPointer<godot_method_bind> by lazy { getMB("RigidBody2D", "get_weight") }
    open fun getWeight(): Float {
        return _icall_Float(getWeightMethodBind, this.rawMemory)
    }


    private val setFrictionMethodBind: CPointer<godot_method_bind> by lazy { getMB("RigidBody2D", "set_friction") }
    open fun setFriction(friction: Float) {
        _icall_Unit_Float(setFrictionMethodBind, this.rawMemory, friction)
    }


    private val getFrictionMethodBind: CPointer<godot_method_bind> by lazy { getMB("RigidBody2D", "get_friction") }
    open fun getFriction(): Float {
        return _icall_Float(getFrictionMethodBind, this.rawMemory)
    }


    private val setBounceMethodBind: CPointer<godot_method_bind> by lazy { getMB("RigidBody2D", "set_bounce") }
    open fun setBounce(bounce: Float) {
        _icall_Unit_Float(setBounceMethodBind, this.rawMemory, bounce)
    }


    private val getBounceMethodBind: CPointer<godot_method_bind> by lazy { getMB("RigidBody2D", "get_bounce") }
    open fun getBounce(): Float {
        return _icall_Float(getBounceMethodBind, this.rawMemory)
    }


    private val setGravityScaleMethodBind: CPointer<godot_method_bind> by lazy { getMB("RigidBody2D", "set_gravity_scale") }
    open fun setGravityScale(gravityScale: Float) {
        _icall_Unit_Float(setGravityScaleMethodBind, this.rawMemory, gravityScale)
    }


    private val getGravityScaleMethodBind: CPointer<godot_method_bind> by lazy { getMB("RigidBody2D", "get_gravity_scale") }
    open fun getGravityScale(): Float {
        return _icall_Float(getGravityScaleMethodBind, this.rawMemory)
    }


    private val setLinearDampMethodBind: CPointer<godot_method_bind> by lazy { getMB("RigidBody2D", "set_linear_damp") }
    open fun setLinearDamp(linearDamp: Float) {
        _icall_Unit_Float(setLinearDampMethodBind, this.rawMemory, linearDamp)
    }


    private val getLinearDampMethodBind: CPointer<godot_method_bind> by lazy { getMB("RigidBody2D", "get_linear_damp") }
    open fun getLinearDamp(): Float {
        return _icall_Float(getLinearDampMethodBind, this.rawMemory)
    }


    private val setAngularDampMethodBind: CPointer<godot_method_bind> by lazy { getMB("RigidBody2D", "set_angular_damp") }
    open fun setAngularDamp(angularDamp: Float) {
        _icall_Unit_Float(setAngularDampMethodBind, this.rawMemory, angularDamp)
    }


    private val getAngularDampMethodBind: CPointer<godot_method_bind> by lazy { getMB("RigidBody2D", "get_angular_damp") }
    open fun getAngularDamp(): Float {
        return _icall_Float(getAngularDampMethodBind, this.rawMemory)
    }


    private val setLinearVelocityMethodBind: CPointer<godot_method_bind> by lazy { getMB("RigidBody2D", "set_linear_velocity") }
    open fun setLinearVelocity(linearVelocity: Vector2) {
        _icall_Unit_Vector2(setLinearVelocityMethodBind, this.rawMemory, linearVelocity)
    }


    private val getLinearVelocityMethodBind: CPointer<godot_method_bind> by lazy { getMB("RigidBody2D", "get_linear_velocity") }
    open fun getLinearVelocity(): Vector2 {
        return _icall_Vector2(getLinearVelocityMethodBind, this.rawMemory)
    }


    private val setAngularVelocityMethodBind: CPointer<godot_method_bind> by lazy { getMB("RigidBody2D", "set_angular_velocity") }
    open fun setAngularVelocity(angularVelocity: Float) {
        _icall_Unit_Float(setAngularVelocityMethodBind, this.rawMemory, angularVelocity)
    }


    private val getAngularVelocityMethodBind: CPointer<godot_method_bind> by lazy { getMB("RigidBody2D", "get_angular_velocity") }
    open fun getAngularVelocity(): Float {
        return _icall_Float(getAngularVelocityMethodBind, this.rawMemory)
    }


    private val setMaxContactsReportedMethodBind: CPointer<godot_method_bind> by lazy { getMB("RigidBody2D", "set_max_contacts_reported") }
    open fun setMaxContactsReported(amount: Int) {
        _icall_Unit_Int(setMaxContactsReportedMethodBind, this.rawMemory, amount)
    }


    private val getMaxContactsReportedMethodBind: CPointer<godot_method_bind> by lazy { getMB("RigidBody2D", "get_max_contacts_reported") }
    open fun getMaxContactsReported(): Int {
        return _icall_Int(getMaxContactsReportedMethodBind, this.rawMemory)
    }


    private val setUseCustomIntegratorMethodBind: CPointer<godot_method_bind> by lazy { getMB("RigidBody2D", "set_use_custom_integrator") }
    open fun setUseCustomIntegrator(enable: Boolean) {
        _icall_Unit_Boolean(setUseCustomIntegratorMethodBind, this.rawMemory, enable)
    }


    private val isUsingCustomIntegratorMethodBind: CPointer<godot_method_bind> by lazy { getMB("RigidBody2D", "is_using_custom_integrator") }
    open fun isUsingCustomIntegrator(): Boolean {
        return _icall_Boolean(isUsingCustomIntegratorMethodBind, this.rawMemory)
    }


    private val setContactMonitorMethodBind: CPointer<godot_method_bind> by lazy { getMB("RigidBody2D", "set_contact_monitor") }
    open fun setContactMonitor(enabled: Boolean) {
        _icall_Unit_Boolean(setContactMonitorMethodBind, this.rawMemory, enabled)
    }


    private val isContactMonitorEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("RigidBody2D", "is_contact_monitor_enabled") }
    open fun isContactMonitorEnabled(): Boolean {
        return _icall_Boolean(isContactMonitorEnabledMethodBind, this.rawMemory)
    }


    private val setContinuousCollisionDetectionModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("RigidBody2D", "set_continuous_collision_detection_mode") }
    open fun setContinuousCollisionDetectionMode(mode: Int) {
        _icall_Unit_Int(setContinuousCollisionDetectionModeMethodBind, this.rawMemory, mode)
    }


    private val getContinuousCollisionDetectionModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("RigidBody2D", "get_continuous_collision_detection_mode") }
    open fun getContinuousCollisionDetectionMode(): RigidBody2D.CCDMode {
        return RigidBody2D.CCDMode.fromInt(_icall_Int(getContinuousCollisionDetectionModeMethodBind, this.rawMemory))
    }


    private val setAxisVelocityMethodBind: CPointer<godot_method_bind> by lazy { getMB("RigidBody2D", "set_axis_velocity") }
    open fun setAxisVelocity(axisVelocity: Vector2) {
        _icall_Unit_Vector2(setAxisVelocityMethodBind, this.rawMemory, axisVelocity)
    }


    private val applyImpulseMethodBind: CPointer<godot_method_bind> by lazy { getMB("RigidBody2D", "apply_impulse") }
    open fun applyImpulse(offset: Vector2, impulse: Vector2) {
        _icall_Unit_Vector2_Vector2(applyImpulseMethodBind, this.rawMemory, offset, impulse)
    }


    private val setAppliedForceMethodBind: CPointer<godot_method_bind> by lazy { getMB("RigidBody2D", "set_applied_force") }
    open fun setAppliedForce(force: Vector2) {
        _icall_Unit_Vector2(setAppliedForceMethodBind, this.rawMemory, force)
    }


    private val getAppliedForceMethodBind: CPointer<godot_method_bind> by lazy { getMB("RigidBody2D", "get_applied_force") }
    open fun getAppliedForce(): Vector2 {
        return _icall_Vector2(getAppliedForceMethodBind, this.rawMemory)
    }


    private val setAppliedTorqueMethodBind: CPointer<godot_method_bind> by lazy { getMB("RigidBody2D", "set_applied_torque") }
    open fun setAppliedTorque(torque: Float) {
        _icall_Unit_Float(setAppliedTorqueMethodBind, this.rawMemory, torque)
    }


    private val getAppliedTorqueMethodBind: CPointer<godot_method_bind> by lazy { getMB("RigidBody2D", "get_applied_torque") }
    open fun getAppliedTorque(): Float {
        return _icall_Float(getAppliedTorqueMethodBind, this.rawMemory)
    }


    private val addForceMethodBind: CPointer<godot_method_bind> by lazy { getMB("RigidBody2D", "add_force") }
    open fun addForce(offset: Vector2, force: Vector2) {
        _icall_Unit_Vector2_Vector2(addForceMethodBind, this.rawMemory, offset, force)
    }


    private val setSleepingMethodBind: CPointer<godot_method_bind> by lazy { getMB("RigidBody2D", "set_sleeping") }
    open fun setSleeping(sleeping: Boolean) {
        _icall_Unit_Boolean(setSleepingMethodBind, this.rawMemory, sleeping)
    }


    private val isSleepingMethodBind: CPointer<godot_method_bind> by lazy { getMB("RigidBody2D", "is_sleeping") }
    open fun isSleeping(): Boolean {
        return _icall_Boolean(isSleepingMethodBind, this.rawMemory)
    }


    private val setCanSleepMethodBind: CPointer<godot_method_bind> by lazy { getMB("RigidBody2D", "set_can_sleep") }
    open fun setCanSleep(ableToSleep: Boolean) {
        _icall_Unit_Boolean(setCanSleepMethodBind, this.rawMemory, ableToSleep)
    }


    private val isAbleToSleepMethodBind: CPointer<godot_method_bind> by lazy { getMB("RigidBody2D", "is_able_to_sleep") }
    open fun isAbleToSleep(): Boolean {
        return _icall_Boolean(isAbleToSleepMethodBind, this.rawMemory)
    }


    private val testMotionMethodBind: CPointer<godot_method_bind> by lazy { getMB("RigidBody2D", "test_motion") }
    open fun testMotion(motion: Vector2, infiniteInertia: Boolean = true, margin: Float = 0.08f, result: Physics2DTestMotionResult): Boolean {
        return _icall_Boolean_Vector2_Boolean_Float_Object(testMotionMethodBind, this.rawMemory, motion, infiniteInertia, margin, result)
    }


    open fun _direct_state_changed(arg0: Object) {
    }


    open fun _body_enter_tree(arg0: Int) {
    }


    open fun _body_exit_tree(arg0: Int) {
    }


    private val getCollidingBodiesMethodBind: CPointer<godot_method_bind> by lazy { getMB("RigidBody2D", "get_colliding_bodies") }
    open fun getCollidingBodies(): GDArray {
        return _icall_GDArray(getCollidingBodiesMethodBind, this.rawMemory)
    }


}
