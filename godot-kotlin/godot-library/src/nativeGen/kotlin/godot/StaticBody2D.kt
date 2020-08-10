// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot.shouldInitPtr
import godot.core.Vector2
import godot.icalls._icall_Double
import godot.icalls._icall_PhysicsMaterial
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_Object
import godot.icalls._icall_Unit_Vector2
import godot.icalls._icall_Vector2
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Double
import kotlin.Unit

open class StaticBody2D internal constructor(
  _ignore: Any?
) : PhysicsBody2D(_ignore) {
  open var bounce: Double
    get() {
      val mb = getMethodBind("StaticBody2D","get_bounce")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("StaticBody2D","set_bounce")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var constantAngularVelocity: Double
    get() {
      val mb = getMethodBind("StaticBody2D","get_constant_angular_velocity")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("StaticBody2D","set_constant_angular_velocity")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var constantLinearVelocity: Vector2
    get() {
      val mb = getMethodBind("StaticBody2D","get_constant_linear_velocity")
      return _icall_Vector2(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("StaticBody2D","set_constant_linear_velocity")
      _icall_Unit_Vector2(mb, this.ptr, value)
    }

  open var friction: Double
    get() {
      val mb = getMethodBind("StaticBody2D","get_friction")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("StaticBody2D","set_friction")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var physicsMaterialOverride: PhysicsMaterial
    get() {
      val mb = getMethodBind("StaticBody2D","get_physics_material_override")
      return _icall_PhysicsMaterial(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("StaticBody2D","set_physics_material_override")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("StaticBody2D", "StaticBody2D")
        }

  }

  open fun constantLinearVelocity(schedule: Vector2.() -> Unit): Vector2 =
      constantLinearVelocity.apply{
      schedule(this)
      constantLinearVelocity = this
  }


  open fun _reload_physics_characteristics() {
  }

  open fun getBounce(): Double {
    val mb = getMethodBind("StaticBody2D","get_bounce")
    return _icall_Double( mb, this.ptr)
  }

  open fun getConstantAngularVelocity(): Double {
    val mb = getMethodBind("StaticBody2D","get_constant_angular_velocity")
    return _icall_Double( mb, this.ptr)
  }

  open fun getConstantLinearVelocity(): Vector2 {
    val mb = getMethodBind("StaticBody2D","get_constant_linear_velocity")
    return _icall_Vector2( mb, this.ptr)
  }

  open fun getFriction(): Double {
    val mb = getMethodBind("StaticBody2D","get_friction")
    return _icall_Double( mb, this.ptr)
  }

  open fun getPhysicsMaterialOverride(): PhysicsMaterial {
    val mb = getMethodBind("StaticBody2D","get_physics_material_override")
    return _icall_PhysicsMaterial( mb, this.ptr)
  }

  open fun setBounce(bounce: Double) {
    val mb = getMethodBind("StaticBody2D","set_bounce")
    _icall_Unit_Double( mb, this.ptr, bounce)
  }

  open fun setConstantAngularVelocity(vel: Double) {
    val mb = getMethodBind("StaticBody2D","set_constant_angular_velocity")
    _icall_Unit_Double( mb, this.ptr, vel)
  }

  open fun setConstantLinearVelocity(vel: Vector2) {
    val mb = getMethodBind("StaticBody2D","set_constant_linear_velocity")
    _icall_Unit_Vector2( mb, this.ptr, vel)
  }

  open fun setFriction(friction: Double) {
    val mb = getMethodBind("StaticBody2D","set_friction")
    _icall_Unit_Double( mb, this.ptr, friction)
  }

  open fun setPhysicsMaterialOverride(physicsMaterialOverride: PhysicsMaterial) {
    val mb = getMethodBind("StaticBody2D","set_physics_material_override")
    _icall_Unit_Object( mb, this.ptr, physicsMaterialOverride)
  }
}
