// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot.shouldInitPtr
import godot.core.Vector3
import godot.icalls._icall_Double
import godot.icalls._icall_PhysicsMaterial
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_Object
import godot.icalls._icall_Unit_Vector3
import godot.icalls._icall_Vector3
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Double
import kotlin.Unit

open class StaticBody internal constructor(
  _ignore: Any?
) : PhysicsBody(_ignore) {
  open var bounce: Double
    get() {
      val mb = getMethodBind("StaticBody","get_bounce")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("StaticBody","set_bounce")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var constantAngularVelocity: Vector3
    get() {
      val mb = getMethodBind("StaticBody","get_constant_angular_velocity")
      return _icall_Vector3(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("StaticBody","set_constant_angular_velocity")
      _icall_Unit_Vector3(mb, this.ptr, value)
    }

  open var constantLinearVelocity: Vector3
    get() {
      val mb = getMethodBind("StaticBody","get_constant_linear_velocity")
      return _icall_Vector3(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("StaticBody","set_constant_linear_velocity")
      _icall_Unit_Vector3(mb, this.ptr, value)
    }

  open var friction: Double
    get() {
      val mb = getMethodBind("StaticBody","get_friction")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("StaticBody","set_friction")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var physicsMaterialOverride: PhysicsMaterial
    get() {
      val mb = getMethodBind("StaticBody","get_physics_material_override")
      return _icall_PhysicsMaterial(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("StaticBody","set_physics_material_override")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("StaticBody", "StaticBody")
        }

  }

  open fun constantAngularVelocity(schedule: Vector3.() -> Unit): Vector3 =
      constantAngularVelocity.apply{
      schedule(this)
      constantAngularVelocity = this
  }


  open fun constantLinearVelocity(schedule: Vector3.() -> Unit): Vector3 =
      constantLinearVelocity.apply{
      schedule(this)
      constantLinearVelocity = this
  }


  open fun _reload_physics_characteristics() {
  }

  open fun getBounce(): Double {
    val mb = getMethodBind("StaticBody","get_bounce")
    return _icall_Double( mb, this.ptr)
  }

  open fun getConstantAngularVelocity(): Vector3 {
    val mb = getMethodBind("StaticBody","get_constant_angular_velocity")
    return _icall_Vector3( mb, this.ptr)
  }

  open fun getConstantLinearVelocity(): Vector3 {
    val mb = getMethodBind("StaticBody","get_constant_linear_velocity")
    return _icall_Vector3( mb, this.ptr)
  }

  open fun getFriction(): Double {
    val mb = getMethodBind("StaticBody","get_friction")
    return _icall_Double( mb, this.ptr)
  }

  open fun getPhysicsMaterialOverride(): PhysicsMaterial {
    val mb = getMethodBind("StaticBody","get_physics_material_override")
    return _icall_PhysicsMaterial( mb, this.ptr)
  }

  open fun setBounce(bounce: Double) {
    val mb = getMethodBind("StaticBody","set_bounce")
    _icall_Unit_Double( mb, this.ptr, bounce)
  }

  open fun setConstantAngularVelocity(vel: Vector3) {
    val mb = getMethodBind("StaticBody","set_constant_angular_velocity")
    _icall_Unit_Vector3( mb, this.ptr, vel)
  }

  open fun setConstantLinearVelocity(vel: Vector3) {
    val mb = getMethodBind("StaticBody","set_constant_linear_velocity")
    _icall_Unit_Vector3( mb, this.ptr, vel)
  }

  open fun setFriction(friction: Double) {
    val mb = getMethodBind("StaticBody","set_friction")
    _icall_Unit_Double( mb, this.ptr, friction)
  }

  open fun setPhysicsMaterialOverride(physicsMaterialOverride: PhysicsMaterial) {
    val mb = getMethodBind("StaticBody","set_physics_material_override")
    _icall_Unit_Object( mb, this.ptr, physicsMaterialOverride)
  }
}
