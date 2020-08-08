package godot

import godot.core.RID
import godot.core.Transform2D
import godot.core.Variant
import godot.core.Vector2
import godot.icalls._icall_Boolean
import godot.icalls._icall_Double
import godot.icalls._icall_Long
import godot.icalls._icall_Long_Long
import godot.icalls._icall_Object_Long
import godot.icalls._icall_Physics2DDirectSpaceState
import godot.icalls._icall_RID_Long
import godot.icalls._icall_Transform2D
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_Transform2D
import godot.icalls._icall_Unit_Vector2
import godot.icalls._icall_Unit_Vector2_Vector2
import godot.icalls._icall_Variant_Long
import godot.icalls._icall_Vector2
import godot.icalls._icall_Vector2_Long
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Unit

open class Physics2DDirectBodyState internal constructor(
  _ignore: Any?
) : Object(_ignore) {
  open var angularVelocity: Double
    get() {
      val mb = getMethodBind("Physics2DDirectBodyState","get_angular_velocity")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Physics2DDirectBodyState","set_angular_velocity")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open val inverseInertia: Double
    get() {
      val mb = getMethodBind("Physics2DDirectBodyState","get_inverse_inertia")
      return _icall_Double(mb, this.ptr)
    }

  open val inverseMass: Double
    get() {
      val mb = getMethodBind("Physics2DDirectBodyState","get_inverse_mass")
      return _icall_Double(mb, this.ptr)
    }

  open var linearVelocity: Vector2
    get() {
      val mb = getMethodBind("Physics2DDirectBodyState","get_linear_velocity")
      return _icall_Vector2(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Physics2DDirectBodyState","set_linear_velocity")
      _icall_Unit_Vector2(mb, this.ptr, value)
    }

  open var sleeping: Boolean
    get() {
      val mb = getMethodBind("Physics2DDirectBodyState","is_sleeping")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Physics2DDirectBodyState","set_sleep_state")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open val step: Double
    get() {
      val mb = getMethodBind("Physics2DDirectBodyState","get_step")
      return _icall_Double(mb, this.ptr)
    }

  open val totalAngularDamp: Double
    get() {
      val mb = getMethodBind("Physics2DDirectBodyState","get_total_angular_damp")
      return _icall_Double(mb, this.ptr)
    }

  open val totalGravity: Vector2
    get() {
      val mb = getMethodBind("Physics2DDirectBodyState","get_total_gravity")
      return _icall_Vector2(mb, this.ptr)
    }

  open val totalLinearDamp: Double
    get() {
      val mb = getMethodBind("Physics2DDirectBodyState","get_total_linear_damp")
      return _icall_Double(mb, this.ptr)
    }

  open var transform: Transform2D
    get() {
      val mb = getMethodBind("Physics2DDirectBodyState","get_transform")
      return _icall_Transform2D(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Physics2DDirectBodyState","set_transform")
      _icall_Unit_Transform2D(mb, this.ptr, value)
    }

  internal constructor() : this(null)

  open fun linearVelocity(schedule: Vector2.() -> Unit): Vector2 = linearVelocity.apply{
      schedule(this)
      linearVelocity = this
  }


  open fun transform(schedule: Transform2D.() -> Unit): Transform2D = transform.apply{
      schedule(this)
      transform = this
  }


  open fun addCentralForce(force: Vector2) {
    val mb = getMethodBind("Physics2DDirectBodyState","add_central_force")
    _icall_Unit_Vector2( mb, this.ptr, force)
  }

  open fun addForce(offset: Vector2, force: Vector2) {
    val mb = getMethodBind("Physics2DDirectBodyState","add_force")
    _icall_Unit_Vector2_Vector2( mb, this.ptr, offset, force)
  }

  open fun addTorque(torque: Double) {
    val mb = getMethodBind("Physics2DDirectBodyState","add_torque")
    _icall_Unit_Double( mb, this.ptr, torque)
  }

  open fun applyCentralImpulse(impulse: Vector2) {
    val mb = getMethodBind("Physics2DDirectBodyState","apply_central_impulse")
    _icall_Unit_Vector2( mb, this.ptr, impulse)
  }

  open fun applyImpulse(offset: Vector2, impulse: Vector2) {
    val mb = getMethodBind("Physics2DDirectBodyState","apply_impulse")
    _icall_Unit_Vector2_Vector2( mb, this.ptr, offset, impulse)
  }

  open fun applyTorqueImpulse(impulse: Double) {
    val mb = getMethodBind("Physics2DDirectBodyState","apply_torque_impulse")
    _icall_Unit_Double( mb, this.ptr, impulse)
  }

  open fun getAngularVelocity(): Double {
    val mb = getMethodBind("Physics2DDirectBodyState","get_angular_velocity")
    return _icall_Double( mb, this.ptr)
  }

  open fun getContactCollider(contactIdx: Long): RID {
    val mb = getMethodBind("Physics2DDirectBodyState","get_contact_collider")
    return _icall_RID_Long( mb, this.ptr, contactIdx)
  }

  open fun getContactColliderId(contactIdx: Long): Long {
    val mb = getMethodBind("Physics2DDirectBodyState","get_contact_collider_id")
    return _icall_Long_Long( mb, this.ptr, contactIdx)
  }

  open fun getContactColliderObject(contactIdx: Long): Object {
    val mb = getMethodBind("Physics2DDirectBodyState","get_contact_collider_object")
    return _icall_Object_Long( mb, this.ptr, contactIdx)
  }

  open fun getContactColliderPosition(contactIdx: Long): Vector2 {
    val mb = getMethodBind("Physics2DDirectBodyState","get_contact_collider_position")
    return _icall_Vector2_Long( mb, this.ptr, contactIdx)
  }

  open fun getContactColliderShape(contactIdx: Long): Long {
    val mb = getMethodBind("Physics2DDirectBodyState","get_contact_collider_shape")
    return _icall_Long_Long( mb, this.ptr, contactIdx)
  }

  open fun getContactColliderShapeMetadata(contactIdx: Long): Variant {
    val mb = getMethodBind("Physics2DDirectBodyState","get_contact_collider_shape_metadata")
    return _icall_Variant_Long( mb, this.ptr, contactIdx)
  }

  open fun getContactColliderVelocityAtPosition(contactIdx: Long): Vector2 {
    val mb = getMethodBind("Physics2DDirectBodyState","get_contact_collider_velocity_at_position")
    return _icall_Vector2_Long( mb, this.ptr, contactIdx)
  }

  open fun getContactCount(): Long {
    val mb = getMethodBind("Physics2DDirectBodyState","get_contact_count")
    return _icall_Long( mb, this.ptr)
  }

  open fun getContactLocalNormal(contactIdx: Long): Vector2 {
    val mb = getMethodBind("Physics2DDirectBodyState","get_contact_local_normal")
    return _icall_Vector2_Long( mb, this.ptr, contactIdx)
  }

  open fun getContactLocalPosition(contactIdx: Long): Vector2 {
    val mb = getMethodBind("Physics2DDirectBodyState","get_contact_local_position")
    return _icall_Vector2_Long( mb, this.ptr, contactIdx)
  }

  open fun getContactLocalShape(contactIdx: Long): Long {
    val mb = getMethodBind("Physics2DDirectBodyState","get_contact_local_shape")
    return _icall_Long_Long( mb, this.ptr, contactIdx)
  }

  open fun getInverseInertia(): Double {
    val mb = getMethodBind("Physics2DDirectBodyState","get_inverse_inertia")
    return _icall_Double( mb, this.ptr)
  }

  open fun getInverseMass(): Double {
    val mb = getMethodBind("Physics2DDirectBodyState","get_inverse_mass")
    return _icall_Double( mb, this.ptr)
  }

  open fun getLinearVelocity(): Vector2 {
    val mb = getMethodBind("Physics2DDirectBodyState","get_linear_velocity")
    return _icall_Vector2( mb, this.ptr)
  }

  open fun getSpaceState(): Physics2DDirectSpaceState {
    val mb = getMethodBind("Physics2DDirectBodyState","get_space_state")
    return _icall_Physics2DDirectSpaceState( mb, this.ptr)
  }

  open fun getStep(): Double {
    val mb = getMethodBind("Physics2DDirectBodyState","get_step")
    return _icall_Double( mb, this.ptr)
  }

  open fun getTotalAngularDamp(): Double {
    val mb = getMethodBind("Physics2DDirectBodyState","get_total_angular_damp")
    return _icall_Double( mb, this.ptr)
  }

  open fun getTotalGravity(): Vector2 {
    val mb = getMethodBind("Physics2DDirectBodyState","get_total_gravity")
    return _icall_Vector2( mb, this.ptr)
  }

  open fun getTotalLinearDamp(): Double {
    val mb = getMethodBind("Physics2DDirectBodyState","get_total_linear_damp")
    return _icall_Double( mb, this.ptr)
  }

  open fun getTransform(): Transform2D {
    val mb = getMethodBind("Physics2DDirectBodyState","get_transform")
    return _icall_Transform2D( mb, this.ptr)
  }

  open fun integrateForces() {
    val mb = getMethodBind("Physics2DDirectBodyState","integrate_forces")
    _icall_Unit( mb, this.ptr)
  }

  open fun isSleeping(): Boolean {
    val mb = getMethodBind("Physics2DDirectBodyState","is_sleeping")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun setAngularVelocity(velocity: Double) {
    val mb = getMethodBind("Physics2DDirectBodyState","set_angular_velocity")
    _icall_Unit_Double( mb, this.ptr, velocity)
  }

  open fun setLinearVelocity(velocity: Vector2) {
    val mb = getMethodBind("Physics2DDirectBodyState","set_linear_velocity")
    _icall_Unit_Vector2( mb, this.ptr, velocity)
  }

  open fun setSleepState(enabled: Boolean) {
    val mb = getMethodBind("Physics2DDirectBodyState","set_sleep_state")
    _icall_Unit_Boolean( mb, this.ptr, enabled)
  }

  open fun setTransform(transform: Transform2D) {
    val mb = getMethodBind("Physics2DDirectBodyState","set_transform")
    _icall_Unit_Transform2D( mb, this.ptr, transform)
  }

  companion object
}
