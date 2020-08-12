// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.PhysicalBone
import godot.core.Godot.shouldInitPtr
import godot.core.Transform
import godot.core.Vector3
import godot.icalls._icall_Boolean
import godot.icalls._icall_Double
import godot.icalls._icall_Long
import godot.icalls._icall_Transform
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Transform
import godot.icalls._icall_Unit_Vector3
import godot.icalls._icall_Unit_Vector3_Vector3
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Unit

open class PhysicalBone internal constructor(
  _ignore: Any?
) : PhysicsBody(_ignore) {
  open var bodyOffset: Transform
    get() {
      val mb = getMethodBind("PhysicalBone","get_body_offset")
      return _icall_Transform(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("PhysicalBone","set_body_offset")
      _icall_Unit_Transform(mb, this.ptr, value)
    }

  open var bounce: Double
    get() {
      val mb = getMethodBind("PhysicalBone","get_bounce")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("PhysicalBone","set_bounce")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var friction: Double
    get() {
      val mb = getMethodBind("PhysicalBone","get_friction")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("PhysicalBone","set_friction")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var gravityScale: Double
    get() {
      val mb = getMethodBind("PhysicalBone","get_gravity_scale")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("PhysicalBone","set_gravity_scale")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var jointOffset: Transform
    get() {
      val mb = getMethodBind("PhysicalBone","get_joint_offset")
      return _icall_Transform(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("PhysicalBone","set_joint_offset")
      _icall_Unit_Transform(mb, this.ptr, value)
    }

  open var jointType: Long
    get() {
      val mb = getMethodBind("PhysicalBone","get_joint_type")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("PhysicalBone","set_joint_type")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var mass: Double
    get() {
      val mb = getMethodBind("PhysicalBone","get_mass")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("PhysicalBone","set_mass")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var weight: Double
    get() {
      val mb = getMethodBind("PhysicalBone","get_weight")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("PhysicalBone","set_weight")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("PhysicalBone", "PhysicalBone")
        }

  }

  open fun bodyOffset(schedule: Transform.() -> Unit): Transform = bodyOffset.apply{
      schedule(this)
      bodyOffset = this
  }


  open fun jointOffset(schedule: Transform.() -> Unit): Transform = jointOffset.apply{
      schedule(this)
      jointOffset = this
  }


  open fun _directStateChanged(arg0: Object) {
  }

  open fun applyCentralImpulse(impulse: Vector3) {
    val mb = getMethodBind("PhysicalBone","apply_central_impulse")
    _icall_Unit_Vector3( mb, this.ptr, impulse)
  }

  open fun applyImpulse(position: Vector3, impulse: Vector3) {
    val mb = getMethodBind("PhysicalBone","apply_impulse")
    _icall_Unit_Vector3_Vector3( mb, this.ptr, position, impulse)
  }

  open fun getBodyOffset(): Transform {
    val mb = getMethodBind("PhysicalBone","get_body_offset")
    return _icall_Transform( mb, this.ptr)
  }

  open fun getBoneId(): Long {
    val mb = getMethodBind("PhysicalBone","get_bone_id")
    return _icall_Long( mb, this.ptr)
  }

  open fun getBounce(): Double {
    val mb = getMethodBind("PhysicalBone","get_bounce")
    return _icall_Double( mb, this.ptr)
  }

  open fun getFriction(): Double {
    val mb = getMethodBind("PhysicalBone","get_friction")
    return _icall_Double( mb, this.ptr)
  }

  open fun getGravityScale(): Double {
    val mb = getMethodBind("PhysicalBone","get_gravity_scale")
    return _icall_Double( mb, this.ptr)
  }

  open fun getJointOffset(): Transform {
    val mb = getMethodBind("PhysicalBone","get_joint_offset")
    return _icall_Transform( mb, this.ptr)
  }

  open fun getJointType(): PhysicalBone.JointType {
    val mb = getMethodBind("PhysicalBone","get_joint_type")
    return PhysicalBone.JointType.from( _icall_Long( mb, this.ptr))
  }

  open fun getMass(): Double {
    val mb = getMethodBind("PhysicalBone","get_mass")
    return _icall_Double( mb, this.ptr)
  }

  open fun getSimulatePhysics(): Boolean {
    val mb = getMethodBind("PhysicalBone","get_simulate_physics")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun getWeight(): Double {
    val mb = getMethodBind("PhysicalBone","get_weight")
    return _icall_Double( mb, this.ptr)
  }

  open fun isSimulatingPhysics(): Boolean {
    val mb = getMethodBind("PhysicalBone","is_simulating_physics")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isStaticBody(): Boolean {
    val mb = getMethodBind("PhysicalBone","is_static_body")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun setBodyOffset(offset: Transform) {
    val mb = getMethodBind("PhysicalBone","set_body_offset")
    _icall_Unit_Transform( mb, this.ptr, offset)
  }

  open fun setBounce(bounce: Double) {
    val mb = getMethodBind("PhysicalBone","set_bounce")
    _icall_Unit_Double( mb, this.ptr, bounce)
  }

  open fun setFriction(friction: Double) {
    val mb = getMethodBind("PhysicalBone","set_friction")
    _icall_Unit_Double( mb, this.ptr, friction)
  }

  open fun setGravityScale(gravityScale: Double) {
    val mb = getMethodBind("PhysicalBone","set_gravity_scale")
    _icall_Unit_Double( mb, this.ptr, gravityScale)
  }

  open fun setJointOffset(offset: Transform) {
    val mb = getMethodBind("PhysicalBone","set_joint_offset")
    _icall_Unit_Transform( mb, this.ptr, offset)
  }

  open fun setJointType(jointType: Long) {
    val mb = getMethodBind("PhysicalBone","set_joint_type")
    _icall_Unit_Long( mb, this.ptr, jointType)
  }

  open fun setMass(mass: Double) {
    val mb = getMethodBind("PhysicalBone","set_mass")
    _icall_Unit_Double( mb, this.ptr, mass)
  }

  open fun setWeight(weight: Double) {
    val mb = getMethodBind("PhysicalBone","set_weight")
    _icall_Unit_Double( mb, this.ptr, weight)
  }

  enum class JointType(
    id: Long
  ) {
    JOINT_TYPE_NONE(0),

    JOINT_TYPE_PIN(1),

    JOINT_TYPE_CONE(2),

    JOINT_TYPE_HINGE(3),

    JOINT_TYPE_SLIDER(4),

    JOINT_TYPE_6DOF(5);

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
