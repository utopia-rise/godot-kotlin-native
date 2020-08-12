// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.RigidBody2D
import godot.core.Godot.shouldInitPtr
import godot.core.Signal0
import godot.core.Signal1
import godot.core.Signal4
import godot.core.VariantArray
import godot.core.Vector2
import godot.core.signal
import godot.icalls._icall_Boolean
import godot.icalls._icall_Boolean_Vector2_Boolean_Double_nObject
import godot.icalls._icall_Double
import godot.icalls._icall_Long
import godot.icalls._icall_PhysicsMaterial
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Object
import godot.icalls._icall_Unit_Vector2
import godot.icalls._icall_Unit_Vector2_Vector2
import godot.icalls._icall_VariantArray
import godot.icalls._icall_Vector2
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Unit

open class RigidBody2D internal constructor(
  _ignore: Any?
) : PhysicsBody2D(_ignore) {
  val bodyEntered: Signal1<Node> by signal("body")

  val bodyExited: Signal1<Node> by signal("body")

  val bodyShapeEntered: Signal4<Long, Node, Long, Long> by signal("body_id", "body", "body_shape",
      "local_shape")

  val bodyShapeExited: Signal4<Long, Node, Long, Long> by signal("body_id", "body", "body_shape",
      "local_shape")

  val sleepingStateChanged: Signal0 by signal()

  open var angularDamp: Double
    get() {
      val mb = getMethodBind("RigidBody2D","get_angular_damp")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("RigidBody2D","set_angular_damp")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var angularVelocity: Double
    get() {
      val mb = getMethodBind("RigidBody2D","get_angular_velocity")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("RigidBody2D","set_angular_velocity")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var appliedForce: Vector2
    get() {
      val mb = getMethodBind("RigidBody2D","get_applied_force")
      return _icall_Vector2(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("RigidBody2D","set_applied_force")
      _icall_Unit_Vector2(mb, this.ptr, value)
    }

  open var appliedTorque: Double
    get() {
      val mb = getMethodBind("RigidBody2D","get_applied_torque")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("RigidBody2D","set_applied_torque")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var bounce: Double
    get() {
      val mb = getMethodBind("RigidBody2D","get_bounce")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("RigidBody2D","set_bounce")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var canSleep: Boolean
    get() {
      val mb = getMethodBind("RigidBody2D","is_able_to_sleep")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("RigidBody2D","set_can_sleep")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var contactMonitor: Boolean
    get() {
      val mb = getMethodBind("RigidBody2D","is_contact_monitor_enabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("RigidBody2D","set_contact_monitor")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var contactsReported: Long
    get() {
      val mb = getMethodBind("RigidBody2D","get_max_contacts_reported")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("RigidBody2D","set_max_contacts_reported")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var continuousCd: Long
    get() {
      val mb = getMethodBind("RigidBody2D","get_continuous_collision_detection_mode")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("RigidBody2D","set_continuous_collision_detection_mode")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var customIntegrator: Boolean
    get() {
      val mb = getMethodBind("RigidBody2D","is_using_custom_integrator")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("RigidBody2D","set_use_custom_integrator")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var friction: Double
    get() {
      val mb = getMethodBind("RigidBody2D","get_friction")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("RigidBody2D","set_friction")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var gravityScale: Double
    get() {
      val mb = getMethodBind("RigidBody2D","get_gravity_scale")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("RigidBody2D","set_gravity_scale")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var inertia: Double
    get() {
      val mb = getMethodBind("RigidBody2D","get_inertia")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("RigidBody2D","set_inertia")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var linearDamp: Double
    get() {
      val mb = getMethodBind("RigidBody2D","get_linear_damp")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("RigidBody2D","set_linear_damp")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var linearVelocity: Vector2
    get() {
      val mb = getMethodBind("RigidBody2D","get_linear_velocity")
      return _icall_Vector2(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("RigidBody2D","set_linear_velocity")
      _icall_Unit_Vector2(mb, this.ptr, value)
    }

  open var mass: Double
    get() {
      val mb = getMethodBind("RigidBody2D","get_mass")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("RigidBody2D","set_mass")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var mode: Long
    get() {
      val mb = getMethodBind("RigidBody2D","get_mode")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("RigidBody2D","set_mode")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var physicsMaterialOverride: PhysicsMaterial
    get() {
      val mb = getMethodBind("RigidBody2D","get_physics_material_override")
      return _icall_PhysicsMaterial(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("RigidBody2D","set_physics_material_override")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  open var sleeping: Boolean
    get() {
      val mb = getMethodBind("RigidBody2D","is_sleeping")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("RigidBody2D","set_sleeping")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var weight: Double
    get() {
      val mb = getMethodBind("RigidBody2D","get_weight")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("RigidBody2D","set_weight")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("RigidBody2D", "RigidBody2D")
        }

  }

  open fun appliedForce(schedule: Vector2.() -> Unit): Vector2 = appliedForce.apply{
      schedule(this)
      appliedForce = this
  }


  open fun linearVelocity(schedule: Vector2.() -> Unit): Vector2 = linearVelocity.apply{
      schedule(this)
      linearVelocity = this
  }


  open fun _bodyEnterTree(arg0: Long) {
  }

  open fun _bodyExitTree(arg0: Long) {
  }

  open fun _directStateChanged(arg0: Object) {
  }

  open fun _integrateForces(state: Physics2DDirectBodyState) {
  }

  open fun _reloadPhysicsCharacteristics() {
  }

  open fun addCentralForce(force: Vector2) {
    val mb = getMethodBind("RigidBody2D","add_central_force")
    _icall_Unit_Vector2( mb, this.ptr, force)
  }

  open fun addForce(offset: Vector2, force: Vector2) {
    val mb = getMethodBind("RigidBody2D","add_force")
    _icall_Unit_Vector2_Vector2( mb, this.ptr, offset, force)
  }

  open fun addTorque(torque: Double) {
    val mb = getMethodBind("RigidBody2D","add_torque")
    _icall_Unit_Double( mb, this.ptr, torque)
  }

  open fun applyCentralImpulse(impulse: Vector2) {
    val mb = getMethodBind("RigidBody2D","apply_central_impulse")
    _icall_Unit_Vector2( mb, this.ptr, impulse)
  }

  open fun applyImpulse(offset: Vector2, impulse: Vector2) {
    val mb = getMethodBind("RigidBody2D","apply_impulse")
    _icall_Unit_Vector2_Vector2( mb, this.ptr, offset, impulse)
  }

  open fun applyTorqueImpulse(torque: Double) {
    val mb = getMethodBind("RigidBody2D","apply_torque_impulse")
    _icall_Unit_Double( mb, this.ptr, torque)
  }

  open fun getAngularDamp(): Double {
    val mb = getMethodBind("RigidBody2D","get_angular_damp")
    return _icall_Double( mb, this.ptr)
  }

  open fun getAngularVelocity(): Double {
    val mb = getMethodBind("RigidBody2D","get_angular_velocity")
    return _icall_Double( mb, this.ptr)
  }

  open fun getAppliedForce(): Vector2 {
    val mb = getMethodBind("RigidBody2D","get_applied_force")
    return _icall_Vector2( mb, this.ptr)
  }

  open fun getAppliedTorque(): Double {
    val mb = getMethodBind("RigidBody2D","get_applied_torque")
    return _icall_Double( mb, this.ptr)
  }

  open fun getBounce(): Double {
    val mb = getMethodBind("RigidBody2D","get_bounce")
    return _icall_Double( mb, this.ptr)
  }

  open fun getCollidingBodies(): VariantArray {
    val mb = getMethodBind("RigidBody2D","get_colliding_bodies")
    return _icall_VariantArray( mb, this.ptr)
  }

  open fun getContinuousCollisionDetectionMode(): RigidBody2D.CCDMode {
    val mb = getMethodBind("RigidBody2D","get_continuous_collision_detection_mode")
    return RigidBody2D.CCDMode.from( _icall_Long( mb, this.ptr))
  }

  open fun getFriction(): Double {
    val mb = getMethodBind("RigidBody2D","get_friction")
    return _icall_Double( mb, this.ptr)
  }

  open fun getGravityScale(): Double {
    val mb = getMethodBind("RigidBody2D","get_gravity_scale")
    return _icall_Double( mb, this.ptr)
  }

  open fun getInertia(): Double {
    val mb = getMethodBind("RigidBody2D","get_inertia")
    return _icall_Double( mb, this.ptr)
  }

  open fun getLinearDamp(): Double {
    val mb = getMethodBind("RigidBody2D","get_linear_damp")
    return _icall_Double( mb, this.ptr)
  }

  open fun getLinearVelocity(): Vector2 {
    val mb = getMethodBind("RigidBody2D","get_linear_velocity")
    return _icall_Vector2( mb, this.ptr)
  }

  open fun getMass(): Double {
    val mb = getMethodBind("RigidBody2D","get_mass")
    return _icall_Double( mb, this.ptr)
  }

  open fun getMaxContactsReported(): Long {
    val mb = getMethodBind("RigidBody2D","get_max_contacts_reported")
    return _icall_Long( mb, this.ptr)
  }

  open fun getMode(): RigidBody2D.Mode {
    val mb = getMethodBind("RigidBody2D","get_mode")
    return RigidBody2D.Mode.from( _icall_Long( mb, this.ptr))
  }

  open fun getPhysicsMaterialOverride(): PhysicsMaterial {
    val mb = getMethodBind("RigidBody2D","get_physics_material_override")
    return _icall_PhysicsMaterial( mb, this.ptr)
  }

  open fun getWeight(): Double {
    val mb = getMethodBind("RigidBody2D","get_weight")
    return _icall_Double( mb, this.ptr)
  }

  open fun isAbleToSleep(): Boolean {
    val mb = getMethodBind("RigidBody2D","is_able_to_sleep")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isContactMonitorEnabled(): Boolean {
    val mb = getMethodBind("RigidBody2D","is_contact_monitor_enabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isSleeping(): Boolean {
    val mb = getMethodBind("RigidBody2D","is_sleeping")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isUsingCustomIntegrator(): Boolean {
    val mb = getMethodBind("RigidBody2D","is_using_custom_integrator")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun setAngularDamp(angularDamp: Double) {
    val mb = getMethodBind("RigidBody2D","set_angular_damp")
    _icall_Unit_Double( mb, this.ptr, angularDamp)
  }

  open fun setAngularVelocity(angularVelocity: Double) {
    val mb = getMethodBind("RigidBody2D","set_angular_velocity")
    _icall_Unit_Double( mb, this.ptr, angularVelocity)
  }

  open fun setAppliedForce(force: Vector2) {
    val mb = getMethodBind("RigidBody2D","set_applied_force")
    _icall_Unit_Vector2( mb, this.ptr, force)
  }

  open fun setAppliedTorque(torque: Double) {
    val mb = getMethodBind("RigidBody2D","set_applied_torque")
    _icall_Unit_Double( mb, this.ptr, torque)
  }

  open fun setAxisVelocity(axisVelocity: Vector2) {
    val mb = getMethodBind("RigidBody2D","set_axis_velocity")
    _icall_Unit_Vector2( mb, this.ptr, axisVelocity)
  }

  open fun setBounce(bounce: Double) {
    val mb = getMethodBind("RigidBody2D","set_bounce")
    _icall_Unit_Double( mb, this.ptr, bounce)
  }

  open fun setCanSleep(ableToSleep: Boolean) {
    val mb = getMethodBind("RigidBody2D","set_can_sleep")
    _icall_Unit_Boolean( mb, this.ptr, ableToSleep)
  }

  open fun setContactMonitor(enabled: Boolean) {
    val mb = getMethodBind("RigidBody2D","set_contact_monitor")
    _icall_Unit_Boolean( mb, this.ptr, enabled)
  }

  open fun setContinuousCollisionDetectionMode(mode: Long) {
    val mb = getMethodBind("RigidBody2D","set_continuous_collision_detection_mode")
    _icall_Unit_Long( mb, this.ptr, mode)
  }

  open fun setFriction(friction: Double) {
    val mb = getMethodBind("RigidBody2D","set_friction")
    _icall_Unit_Double( mb, this.ptr, friction)
  }

  open fun setGravityScale(gravityScale: Double) {
    val mb = getMethodBind("RigidBody2D","set_gravity_scale")
    _icall_Unit_Double( mb, this.ptr, gravityScale)
  }

  open fun setInertia(inertia: Double) {
    val mb = getMethodBind("RigidBody2D","set_inertia")
    _icall_Unit_Double( mb, this.ptr, inertia)
  }

  open fun setLinearDamp(linearDamp: Double) {
    val mb = getMethodBind("RigidBody2D","set_linear_damp")
    _icall_Unit_Double( mb, this.ptr, linearDamp)
  }

  open fun setLinearVelocity(linearVelocity: Vector2) {
    val mb = getMethodBind("RigidBody2D","set_linear_velocity")
    _icall_Unit_Vector2( mb, this.ptr, linearVelocity)
  }

  open fun setMass(mass: Double) {
    val mb = getMethodBind("RigidBody2D","set_mass")
    _icall_Unit_Double( mb, this.ptr, mass)
  }

  open fun setMaxContactsReported(amount: Long) {
    val mb = getMethodBind("RigidBody2D","set_max_contacts_reported")
    _icall_Unit_Long( mb, this.ptr, amount)
  }

  open fun setMode(mode: Long) {
    val mb = getMethodBind("RigidBody2D","set_mode")
    _icall_Unit_Long( mb, this.ptr, mode)
  }

  open fun setPhysicsMaterialOverride(physicsMaterialOverride: PhysicsMaterial) {
    val mb = getMethodBind("RigidBody2D","set_physics_material_override")
    _icall_Unit_Object( mb, this.ptr, physicsMaterialOverride)
  }

  open fun setSleeping(sleeping: Boolean) {
    val mb = getMethodBind("RigidBody2D","set_sleeping")
    _icall_Unit_Boolean( mb, this.ptr, sleeping)
  }

  open fun setUseCustomIntegrator(enable: Boolean) {
    val mb = getMethodBind("RigidBody2D","set_use_custom_integrator")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setWeight(weight: Double) {
    val mb = getMethodBind("RigidBody2D","set_weight")
    _icall_Unit_Double( mb, this.ptr, weight)
  }

  open fun testMotion(
    motion: Vector2,
    infiniteInertia: Boolean = true,
    margin: Double = 0.08,
    result: Physics2DTestMotionResult? = null
  ): Boolean {
    val mb = getMethodBind("RigidBody2D","test_motion")
    return _icall_Boolean_Vector2_Boolean_Double_nObject( mb, this.ptr, motion, infiniteInertia,
        margin, result)
  }

  enum class Mode(
    id: Long
  ) {
    MODE_RIGID(0),

    MODE_STATIC(1),

    MODE_CHARACTER(2),

    MODE_KINEMATIC(3);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class CCDMode(
    id: Long
  ) {
    CCD_MODE_DISABLED(0),

    CCD_MODE_CAST_RAY(1),

    CCD_MODE_CAST_SHAPE(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object
}
