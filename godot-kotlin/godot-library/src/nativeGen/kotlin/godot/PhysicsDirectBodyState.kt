// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Basis
import godot.core.RID
import godot.core.Transform
import godot.core.Vector3
import godot.icalls._icall_Basis
import godot.icalls._icall_Boolean
import godot.icalls._icall_Double
import godot.icalls._icall_Double_Long
import godot.icalls._icall_Long
import godot.icalls._icall_Long_Long
import godot.icalls._icall_Object_Long
import godot.icalls._icall_PhysicsDirectSpaceState
import godot.icalls._icall_RID_Long
import godot.icalls._icall_Transform
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Transform
import godot.icalls._icall_Unit_Vector3
import godot.icalls._icall_Unit_Vector3_Vector3
import godot.icalls._icall_Vector3
import godot.icalls._icall_Vector3_Long
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Unit

open class PhysicsDirectBodyState internal constructor(
  _ignore: Any?
) : Object(_ignore) {
  open var angularVelocity: Vector3
    get() {
      val mb = getMethodBind("PhysicsDirectBodyState","get_angular_velocity")
      return _icall_Vector3(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("PhysicsDirectBodyState","set_angular_velocity")
      _icall_Unit_Vector3(mb, this.ptr, value)
    }

  open val centerOfMass: Vector3
    get() {
      val mb = getMethodBind("PhysicsDirectBodyState","get_center_of_mass")
      return _icall_Vector3(mb, this.ptr)
    }

  open val inverseInertia: Vector3
    get() {
      val mb = getMethodBind("PhysicsDirectBodyState","get_inverse_inertia")
      return _icall_Vector3(mb, this.ptr)
    }

  open val inverseMass: Double
    get() {
      val mb = getMethodBind("PhysicsDirectBodyState","get_inverse_mass")
      return _icall_Double(mb, this.ptr)
    }

  open var linearVelocity: Vector3
    get() {
      val mb = getMethodBind("PhysicsDirectBodyState","get_linear_velocity")
      return _icall_Vector3(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("PhysicsDirectBodyState","set_linear_velocity")
      _icall_Unit_Vector3(mb, this.ptr, value)
    }

  open val principalInertiaAxes: Basis
    get() {
      val mb = getMethodBind("PhysicsDirectBodyState","get_principal_inertia_axes")
      return _icall_Basis(mb, this.ptr)
    }

  open var sleeping: Boolean
    get() {
      val mb = getMethodBind("PhysicsDirectBodyState","is_sleeping")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("PhysicsDirectBodyState","set_sleep_state")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open val step: Double
    get() {
      val mb = getMethodBind("PhysicsDirectBodyState","get_step")
      return _icall_Double(mb, this.ptr)
    }

  open val totalAngularDamp: Double
    get() {
      val mb = getMethodBind("PhysicsDirectBodyState","get_total_angular_damp")
      return _icall_Double(mb, this.ptr)
    }

  open val totalGravity: Vector3
    get() {
      val mb = getMethodBind("PhysicsDirectBodyState","get_total_gravity")
      return _icall_Vector3(mb, this.ptr)
    }

  open val totalLinearDamp: Double
    get() {
      val mb = getMethodBind("PhysicsDirectBodyState","get_total_linear_damp")
      return _icall_Double(mb, this.ptr)
    }

  open var transform: Transform
    get() {
      val mb = getMethodBind("PhysicsDirectBodyState","get_transform")
      return _icall_Transform(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("PhysicsDirectBodyState","set_transform")
      _icall_Unit_Transform(mb, this.ptr, value)
    }

  internal constructor() : this(null)

  open fun angularVelocity(schedule: Vector3.() -> Unit): Vector3 = angularVelocity.apply{
      schedule(this)
      angularVelocity = this
  }


  open fun linearVelocity(schedule: Vector3.() -> Unit): Vector3 = linearVelocity.apply{
      schedule(this)
      linearVelocity = this
  }


  open fun transform(schedule: Transform.() -> Unit): Transform = transform.apply{
      schedule(this)
      transform = this
  }


  open fun addCentralForce(force: Vector3) {
    val mb = getMethodBind("PhysicsDirectBodyState","add_central_force")
    _icall_Unit_Vector3( mb, this.ptr, force)
  }

  open fun addForce(force: Vector3, position: Vector3) {
    val mb = getMethodBind("PhysicsDirectBodyState","add_force")
    _icall_Unit_Vector3_Vector3( mb, this.ptr, force, position)
  }

  open fun addTorque(torque: Vector3) {
    val mb = getMethodBind("PhysicsDirectBodyState","add_torque")
    _icall_Unit_Vector3( mb, this.ptr, torque)
  }

  open fun applyCentralImpulse(j: Vector3) {
    val mb = getMethodBind("PhysicsDirectBodyState","apply_central_impulse")
    _icall_Unit_Vector3( mb, this.ptr, j)
  }

  open fun applyImpulse(position: Vector3, j: Vector3) {
    val mb = getMethodBind("PhysicsDirectBodyState","apply_impulse")
    _icall_Unit_Vector3_Vector3( mb, this.ptr, position, j)
  }

  open fun applyTorqueImpulse(j: Vector3) {
    val mb = getMethodBind("PhysicsDirectBodyState","apply_torque_impulse")
    _icall_Unit_Vector3( mb, this.ptr, j)
  }

  open fun getAngularVelocity(): Vector3 {
    val mb = getMethodBind("PhysicsDirectBodyState","get_angular_velocity")
    return _icall_Vector3( mb, this.ptr)
  }

  open fun getCenterOfMass(): Vector3 {
    val mb = getMethodBind("PhysicsDirectBodyState","get_center_of_mass")
    return _icall_Vector3( mb, this.ptr)
  }

  open fun getContactCollider(contactIdx: Long): RID {
    val mb = getMethodBind("PhysicsDirectBodyState","get_contact_collider")
    return _icall_RID_Long( mb, this.ptr, contactIdx)
  }

  open fun getContactColliderId(contactIdx: Long): Long {
    val mb = getMethodBind("PhysicsDirectBodyState","get_contact_collider_id")
    return _icall_Long_Long( mb, this.ptr, contactIdx)
  }

  open fun getContactColliderObject(contactIdx: Long): Object {
    val mb = getMethodBind("PhysicsDirectBodyState","get_contact_collider_object")
    return _icall_Object_Long( mb, this.ptr, contactIdx)
  }

  open fun getContactColliderPosition(contactIdx: Long): Vector3 {
    val mb = getMethodBind("PhysicsDirectBodyState","get_contact_collider_position")
    return _icall_Vector3_Long( mb, this.ptr, contactIdx)
  }

  open fun getContactColliderShape(contactIdx: Long): Long {
    val mb = getMethodBind("PhysicsDirectBodyState","get_contact_collider_shape")
    return _icall_Long_Long( mb, this.ptr, contactIdx)
  }

  open fun getContactColliderVelocityAtPosition(contactIdx: Long): Vector3 {
    val mb = getMethodBind("PhysicsDirectBodyState","get_contact_collider_velocity_at_position")
    return _icall_Vector3_Long( mb, this.ptr, contactIdx)
  }

  open fun getContactCount(): Long {
    val mb = getMethodBind("PhysicsDirectBodyState","get_contact_count")
    return _icall_Long( mb, this.ptr)
  }

  open fun getContactImpulse(contactIdx: Long): Double {
    val mb = getMethodBind("PhysicsDirectBodyState","get_contact_impulse")
    return _icall_Double_Long( mb, this.ptr, contactIdx)
  }

  open fun getContactLocalNormal(contactIdx: Long): Vector3 {
    val mb = getMethodBind("PhysicsDirectBodyState","get_contact_local_normal")
    return _icall_Vector3_Long( mb, this.ptr, contactIdx)
  }

  open fun getContactLocalPosition(contactIdx: Long): Vector3 {
    val mb = getMethodBind("PhysicsDirectBodyState","get_contact_local_position")
    return _icall_Vector3_Long( mb, this.ptr, contactIdx)
  }

  open fun getContactLocalShape(contactIdx: Long): Long {
    val mb = getMethodBind("PhysicsDirectBodyState","get_contact_local_shape")
    return _icall_Long_Long( mb, this.ptr, contactIdx)
  }

  open fun getInverseInertia(): Vector3 {
    val mb = getMethodBind("PhysicsDirectBodyState","get_inverse_inertia")
    return _icall_Vector3( mb, this.ptr)
  }

  open fun getInverseMass(): Double {
    val mb = getMethodBind("PhysicsDirectBodyState","get_inverse_mass")
    return _icall_Double( mb, this.ptr)
  }

  open fun getLinearVelocity(): Vector3 {
    val mb = getMethodBind("PhysicsDirectBodyState","get_linear_velocity")
    return _icall_Vector3( mb, this.ptr)
  }

  open fun getPrincipalInertiaAxes(): Basis {
    val mb = getMethodBind("PhysicsDirectBodyState","get_principal_inertia_axes")
    return _icall_Basis( mb, this.ptr)
  }

  open fun getSpaceState(): PhysicsDirectSpaceState {
    val mb = getMethodBind("PhysicsDirectBodyState","get_space_state")
    return _icall_PhysicsDirectSpaceState( mb, this.ptr)
  }

  open fun getStep(): Double {
    val mb = getMethodBind("PhysicsDirectBodyState","get_step")
    return _icall_Double( mb, this.ptr)
  }

  open fun getTotalAngularDamp(): Double {
    val mb = getMethodBind("PhysicsDirectBodyState","get_total_angular_damp")
    return _icall_Double( mb, this.ptr)
  }

  open fun getTotalGravity(): Vector3 {
    val mb = getMethodBind("PhysicsDirectBodyState","get_total_gravity")
    return _icall_Vector3( mb, this.ptr)
  }

  open fun getTotalLinearDamp(): Double {
    val mb = getMethodBind("PhysicsDirectBodyState","get_total_linear_damp")
    return _icall_Double( mb, this.ptr)
  }

  open fun getTransform(): Transform {
    val mb = getMethodBind("PhysicsDirectBodyState","get_transform")
    return _icall_Transform( mb, this.ptr)
  }

  open fun integrateForces() {
    val mb = getMethodBind("PhysicsDirectBodyState","integrate_forces")
    _icall_Unit( mb, this.ptr)
  }

  open fun isSleeping(): Boolean {
    val mb = getMethodBind("PhysicsDirectBodyState","is_sleeping")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun setAngularVelocity(velocity: Vector3) {
    val mb = getMethodBind("PhysicsDirectBodyState","set_angular_velocity")
    _icall_Unit_Vector3( mb, this.ptr, velocity)
  }

  open fun setLinearVelocity(velocity: Vector3) {
    val mb = getMethodBind("PhysicsDirectBodyState","set_linear_velocity")
    _icall_Unit_Vector3( mb, this.ptr, velocity)
  }

  open fun setSleepState(enabled: Boolean) {
    val mb = getMethodBind("PhysicsDirectBodyState","set_sleep_state")
    _icall_Unit_Boolean( mb, this.ptr, enabled)
  }

  open fun setTransform(transform: Transform) {
    val mb = getMethodBind("PhysicsDirectBodyState","set_transform")
    _icall_Unit_Transform( mb, this.ptr, transform)
  }
}
