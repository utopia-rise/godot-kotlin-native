// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.RigidBody
import godot.core.Godot.shouldInitPtr
import godot.core.Signal0
import godot.core.Signal1
import godot.core.Signal4
import godot.core.VariantArray
import godot.core.Vector3
import godot.core.signal
import godot.icalls._icall_Boolean
import godot.icalls._icall_Boolean_Long
import godot.icalls._icall_Double
import godot.icalls._icall_Long
import godot.icalls._icall_PhysicsMaterial
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Long_Boolean
import godot.icalls._icall_Unit_Object
import godot.icalls._icall_Unit_Vector3
import godot.icalls._icall_Unit_Vector3_Vector3
import godot.icalls._icall_VariantArray
import godot.icalls._icall_Vector3
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Unit

open class RigidBody internal constructor(
  _ignore: Any?
) : PhysicsBody(_ignore) {
  val bodyEntered: Signal1<Node> by signal("body")

  val bodyExited: Signal1<Node> by signal("body")

  val bodyShapeEntered: Signal4<Long, Node, Long, Long> by signal("body_id", "body", "body_shape",
      "local_shape")

  val bodyShapeExited: Signal4<Long, Node, Long, Long> by signal("body_id", "body", "body_shape",
      "local_shape")

  val sleepingStateChanged: Signal0 by signal()

  open var angularDamp: Double
    get() {
      val mb = getMethodBind("RigidBody","get_angular_damp")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("RigidBody","set_angular_damp")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var angularVelocity: Vector3
    get() {
      val mb = getMethodBind("RigidBody","get_angular_velocity")
      return _icall_Vector3(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("RigidBody","set_angular_velocity")
      _icall_Unit_Vector3(mb, this.ptr, value)
    }

  open var axisLockAngularX: Boolean
    get() {
      val mb = getMethodBind("RigidBody","get_axis_lock")
      return _icall_Boolean_Long(mb, this.ptr, 8)
    }
    set(value) {
      val mb = getMethodBind("RigidBody","set_axis_lock")
      _icall_Unit_Long_Boolean(mb, this.ptr, 8, value)
    }

  open var axisLockAngularY: Boolean
    get() {
      val mb = getMethodBind("RigidBody","get_axis_lock")
      return _icall_Boolean_Long(mb, this.ptr, 16)
    }
    set(value) {
      val mb = getMethodBind("RigidBody","set_axis_lock")
      _icall_Unit_Long_Boolean(mb, this.ptr, 16, value)
    }

  open var axisLockAngularZ: Boolean
    get() {
      val mb = getMethodBind("RigidBody","get_axis_lock")
      return _icall_Boolean_Long(mb, this.ptr, 32)
    }
    set(value) {
      val mb = getMethodBind("RigidBody","set_axis_lock")
      _icall_Unit_Long_Boolean(mb, this.ptr, 32, value)
    }

  open var axisLockLinearX: Boolean
    get() {
      val mb = getMethodBind("RigidBody","get_axis_lock")
      return _icall_Boolean_Long(mb, this.ptr, 1)
    }
    set(value) {
      val mb = getMethodBind("RigidBody","set_axis_lock")
      _icall_Unit_Long_Boolean(mb, this.ptr, 1, value)
    }

  open var axisLockLinearY: Boolean
    get() {
      val mb = getMethodBind("RigidBody","get_axis_lock")
      return _icall_Boolean_Long(mb, this.ptr, 2)
    }
    set(value) {
      val mb = getMethodBind("RigidBody","set_axis_lock")
      _icall_Unit_Long_Boolean(mb, this.ptr, 2, value)
    }

  open var axisLockLinearZ: Boolean
    get() {
      val mb = getMethodBind("RigidBody","get_axis_lock")
      return _icall_Boolean_Long(mb, this.ptr, 4)
    }
    set(value) {
      val mb = getMethodBind("RigidBody","set_axis_lock")
      _icall_Unit_Long_Boolean(mb, this.ptr, 4, value)
    }

  open var bounce: Double
    get() {
      val mb = getMethodBind("RigidBody","get_bounce")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("RigidBody","set_bounce")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var canSleep: Boolean
    get() {
      val mb = getMethodBind("RigidBody","is_able_to_sleep")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("RigidBody","set_can_sleep")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var contactMonitor: Boolean
    get() {
      val mb = getMethodBind("RigidBody","is_contact_monitor_enabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("RigidBody","set_contact_monitor")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var contactsReported: Long
    get() {
      val mb = getMethodBind("RigidBody","get_max_contacts_reported")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("RigidBody","set_max_contacts_reported")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var continuousCd: Boolean
    get() {
      val mb = getMethodBind("RigidBody","is_using_continuous_collision_detection")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("RigidBody","set_use_continuous_collision_detection")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var customIntegrator: Boolean
    get() {
      val mb = getMethodBind("RigidBody","is_using_custom_integrator")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("RigidBody","set_use_custom_integrator")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var friction: Double
    get() {
      val mb = getMethodBind("RigidBody","get_friction")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("RigidBody","set_friction")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var gravityScale: Double
    get() {
      val mb = getMethodBind("RigidBody","get_gravity_scale")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("RigidBody","set_gravity_scale")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var linearDamp: Double
    get() {
      val mb = getMethodBind("RigidBody","get_linear_damp")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("RigidBody","set_linear_damp")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var linearVelocity: Vector3
    get() {
      val mb = getMethodBind("RigidBody","get_linear_velocity")
      return _icall_Vector3(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("RigidBody","set_linear_velocity")
      _icall_Unit_Vector3(mb, this.ptr, value)
    }

  open var mass: Double
    get() {
      val mb = getMethodBind("RigidBody","get_mass")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("RigidBody","set_mass")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var mode: Long
    get() {
      val mb = getMethodBind("RigidBody","get_mode")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("RigidBody","set_mode")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var physicsMaterialOverride: PhysicsMaterial
    get() {
      val mb = getMethodBind("RigidBody","get_physics_material_override")
      return _icall_PhysicsMaterial(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("RigidBody","set_physics_material_override")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  open var sleeping: Boolean
    get() {
      val mb = getMethodBind("RigidBody","is_sleeping")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("RigidBody","set_sleeping")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var weight: Double
    get() {
      val mb = getMethodBind("RigidBody","get_weight")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("RigidBody","set_weight")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("RigidBody", "RigidBody")
        }

  }

  open fun angularVelocity(schedule: Vector3.() -> Unit): Vector3 = angularVelocity.apply{
      schedule(this)
      angularVelocity = this
  }


  open fun linearVelocity(schedule: Vector3.() -> Unit): Vector3 = linearVelocity.apply{
      schedule(this)
      linearVelocity = this
  }


  open fun _body_enter_tree(arg0: Long) {
  }

  open fun _body_exit_tree(arg0: Long) {
  }

  open fun _direct_state_changed(arg0: Object) {
  }

  open fun _integrate_forces(state: PhysicsDirectBodyState) {
  }

  open fun _reload_physics_characteristics() {
  }

  open fun addCentralForce(force: Vector3) {
    val mb = getMethodBind("RigidBody","add_central_force")
    _icall_Unit_Vector3( mb, this.ptr, force)
  }

  open fun addForce(force: Vector3, position: Vector3) {
    val mb = getMethodBind("RigidBody","add_force")
    _icall_Unit_Vector3_Vector3( mb, this.ptr, force, position)
  }

  open fun addTorque(torque: Vector3) {
    val mb = getMethodBind("RigidBody","add_torque")
    _icall_Unit_Vector3( mb, this.ptr, torque)
  }

  open fun applyCentralImpulse(impulse: Vector3) {
    val mb = getMethodBind("RigidBody","apply_central_impulse")
    _icall_Unit_Vector3( mb, this.ptr, impulse)
  }

  open fun applyImpulse(position: Vector3, impulse: Vector3) {
    val mb = getMethodBind("RigidBody","apply_impulse")
    _icall_Unit_Vector3_Vector3( mb, this.ptr, position, impulse)
  }

  open fun applyTorqueImpulse(impulse: Vector3) {
    val mb = getMethodBind("RigidBody","apply_torque_impulse")
    _icall_Unit_Vector3( mb, this.ptr, impulse)
  }

  open fun getAngularDamp(): Double {
    val mb = getMethodBind("RigidBody","get_angular_damp")
    return _icall_Double( mb, this.ptr)
  }

  open fun getAngularVelocity(): Vector3 {
    val mb = getMethodBind("RigidBody","get_angular_velocity")
    return _icall_Vector3( mb, this.ptr)
  }

  open fun getAxisLock(axis: Long): Boolean {
    val mb = getMethodBind("RigidBody","get_axis_lock")
    return _icall_Boolean_Long( mb, this.ptr, axis)
  }

  open fun getBounce(): Double {
    val mb = getMethodBind("RigidBody","get_bounce")
    return _icall_Double( mb, this.ptr)
  }

  open fun getCollidingBodies(): VariantArray {
    val mb = getMethodBind("RigidBody","get_colliding_bodies")
    return _icall_VariantArray( mb, this.ptr)
  }

  open fun getFriction(): Double {
    val mb = getMethodBind("RigidBody","get_friction")
    return _icall_Double( mb, this.ptr)
  }

  open fun getGravityScale(): Double {
    val mb = getMethodBind("RigidBody","get_gravity_scale")
    return _icall_Double( mb, this.ptr)
  }

  open fun getLinearDamp(): Double {
    val mb = getMethodBind("RigidBody","get_linear_damp")
    return _icall_Double( mb, this.ptr)
  }

  open fun getLinearVelocity(): Vector3 {
    val mb = getMethodBind("RigidBody","get_linear_velocity")
    return _icall_Vector3( mb, this.ptr)
  }

  open fun getMass(): Double {
    val mb = getMethodBind("RigidBody","get_mass")
    return _icall_Double( mb, this.ptr)
  }

  open fun getMaxContactsReported(): Long {
    val mb = getMethodBind("RigidBody","get_max_contacts_reported")
    return _icall_Long( mb, this.ptr)
  }

  open fun getMode(): RigidBody.Mode {
    val mb = getMethodBind("RigidBody","get_mode")
    return RigidBody.Mode.from( _icall_Long( mb, this.ptr))
  }

  open fun getPhysicsMaterialOverride(): PhysicsMaterial {
    val mb = getMethodBind("RigidBody","get_physics_material_override")
    return _icall_PhysicsMaterial( mb, this.ptr)
  }

  open fun getWeight(): Double {
    val mb = getMethodBind("RigidBody","get_weight")
    return _icall_Double( mb, this.ptr)
  }

  open fun isAbleToSleep(): Boolean {
    val mb = getMethodBind("RigidBody","is_able_to_sleep")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isContactMonitorEnabled(): Boolean {
    val mb = getMethodBind("RigidBody","is_contact_monitor_enabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isSleeping(): Boolean {
    val mb = getMethodBind("RigidBody","is_sleeping")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isUsingContinuousCollisionDetection(): Boolean {
    val mb = getMethodBind("RigidBody","is_using_continuous_collision_detection")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isUsingCustomIntegrator(): Boolean {
    val mb = getMethodBind("RigidBody","is_using_custom_integrator")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun setAngularDamp(angularDamp: Double) {
    val mb = getMethodBind("RigidBody","set_angular_damp")
    _icall_Unit_Double( mb, this.ptr, angularDamp)
  }

  open fun setAngularVelocity(angularVelocity: Vector3) {
    val mb = getMethodBind("RigidBody","set_angular_velocity")
    _icall_Unit_Vector3( mb, this.ptr, angularVelocity)
  }

  open fun setAxisLock(axis: Long, lock: Boolean) {
    val mb = getMethodBind("RigidBody","set_axis_lock")
    _icall_Unit_Long_Boolean( mb, this.ptr, axis, lock)
  }

  open fun setAxisVelocity(axisVelocity: Vector3) {
    val mb = getMethodBind("RigidBody","set_axis_velocity")
    _icall_Unit_Vector3( mb, this.ptr, axisVelocity)
  }

  open fun setBounce(bounce: Double) {
    val mb = getMethodBind("RigidBody","set_bounce")
    _icall_Unit_Double( mb, this.ptr, bounce)
  }

  open fun setCanSleep(ableToSleep: Boolean) {
    val mb = getMethodBind("RigidBody","set_can_sleep")
    _icall_Unit_Boolean( mb, this.ptr, ableToSleep)
  }

  open fun setContactMonitor(enabled: Boolean) {
    val mb = getMethodBind("RigidBody","set_contact_monitor")
    _icall_Unit_Boolean( mb, this.ptr, enabled)
  }

  open fun setFriction(friction: Double) {
    val mb = getMethodBind("RigidBody","set_friction")
    _icall_Unit_Double( mb, this.ptr, friction)
  }

  open fun setGravityScale(gravityScale: Double) {
    val mb = getMethodBind("RigidBody","set_gravity_scale")
    _icall_Unit_Double( mb, this.ptr, gravityScale)
  }

  open fun setLinearDamp(linearDamp: Double) {
    val mb = getMethodBind("RigidBody","set_linear_damp")
    _icall_Unit_Double( mb, this.ptr, linearDamp)
  }

  open fun setLinearVelocity(linearVelocity: Vector3) {
    val mb = getMethodBind("RigidBody","set_linear_velocity")
    _icall_Unit_Vector3( mb, this.ptr, linearVelocity)
  }

  open fun setMass(mass: Double) {
    val mb = getMethodBind("RigidBody","set_mass")
    _icall_Unit_Double( mb, this.ptr, mass)
  }

  open fun setMaxContactsReported(amount: Long) {
    val mb = getMethodBind("RigidBody","set_max_contacts_reported")
    _icall_Unit_Long( mb, this.ptr, amount)
  }

  open fun setMode(mode: Long) {
    val mb = getMethodBind("RigidBody","set_mode")
    _icall_Unit_Long( mb, this.ptr, mode)
  }

  open fun setPhysicsMaterialOverride(physicsMaterialOverride: PhysicsMaterial) {
    val mb = getMethodBind("RigidBody","set_physics_material_override")
    _icall_Unit_Object( mb, this.ptr, physicsMaterialOverride)
  }

  open fun setSleeping(sleeping: Boolean) {
    val mb = getMethodBind("RigidBody","set_sleeping")
    _icall_Unit_Boolean( mb, this.ptr, sleeping)
  }

  open fun setUseContinuousCollisionDetection(enable: Boolean) {
    val mb = getMethodBind("RigidBody","set_use_continuous_collision_detection")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setUseCustomIntegrator(enable: Boolean) {
    val mb = getMethodBind("RigidBody","set_use_custom_integrator")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setWeight(weight: Double) {
    val mb = getMethodBind("RigidBody","set_weight")
    _icall_Unit_Double( mb, this.ptr, weight)
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

  companion object {
    final const val MODE_CHARACTER: Long = 2

    final const val MODE_KINEMATIC: Long = 3

    final const val MODE_RIGID: Long = 0

    final const val MODE_STATIC: Long = 1
  }
}
