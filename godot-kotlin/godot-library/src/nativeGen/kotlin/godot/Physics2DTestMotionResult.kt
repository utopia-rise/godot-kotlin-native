// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot.shouldInitPtr
import godot.core.RID
import godot.core.Vector2
import godot.icalls._icall_Long
import godot.icalls._icall_Object
import godot.icalls._icall_RID
import godot.icalls._icall_Vector2
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Any
import kotlin.Long

open class Physics2DTestMotionResult internal constructor(
  _ignore: Any?
) : Reference(_ignore) {
  open val collider: Object
    get() {
      val mb = getMethodBind("Physics2DTestMotionResult","get_collider")
      return _icall_Object(mb, this.ptr)
    }

  open val colliderId: Long
    get() {
      val mb = getMethodBind("Physics2DTestMotionResult","get_collider_id")
      return _icall_Long(mb, this.ptr)
    }

  open val colliderRid: RID
    get() {
      val mb = getMethodBind("Physics2DTestMotionResult","get_collider_rid")
      return _icall_RID(mb, this.ptr)
    }

  open val colliderShape: Long
    get() {
      val mb = getMethodBind("Physics2DTestMotionResult","get_collider_shape")
      return _icall_Long(mb, this.ptr)
    }

  open val colliderVelocity: Vector2
    get() {
      val mb = getMethodBind("Physics2DTestMotionResult","get_collider_velocity")
      return _icall_Vector2(mb, this.ptr)
    }

  open val collisionNormal: Vector2
    get() {
      val mb = getMethodBind("Physics2DTestMotionResult","get_collision_normal")
      return _icall_Vector2(mb, this.ptr)
    }

  open val collisionPoint: Vector2
    get() {
      val mb = getMethodBind("Physics2DTestMotionResult","get_collision_point")
      return _icall_Vector2(mb, this.ptr)
    }

  open val motion: Vector2
    get() {
      val mb = getMethodBind("Physics2DTestMotionResult","get_motion")
      return _icall_Vector2(mb, this.ptr)
    }

  open val motionRemainder: Vector2
    get() {
      val mb = getMethodBind("Physics2DTestMotionResult","get_motion_remainder")
      return _icall_Vector2(mb, this.ptr)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = invokeConstructor("Physics2DTestMotionResult", "Physics2DTestMotionResult")
        }

  }

  open fun getCollider(): Object {
    val mb = getMethodBind("Physics2DTestMotionResult","get_collider")
    return _icall_Object( mb, this.ptr)
  }

  open fun getColliderId(): Long {
    val mb = getMethodBind("Physics2DTestMotionResult","get_collider_id")
    return _icall_Long( mb, this.ptr)
  }

  open fun getColliderRid(): RID {
    val mb = getMethodBind("Physics2DTestMotionResult","get_collider_rid")
    return _icall_RID( mb, this.ptr)
  }

  open fun getColliderShape(): Long {
    val mb = getMethodBind("Physics2DTestMotionResult","get_collider_shape")
    return _icall_Long( mb, this.ptr)
  }

  open fun getColliderVelocity(): Vector2 {
    val mb = getMethodBind("Physics2DTestMotionResult","get_collider_velocity")
    return _icall_Vector2( mb, this.ptr)
  }

  open fun getCollisionNormal(): Vector2 {
    val mb = getMethodBind("Physics2DTestMotionResult","get_collision_normal")
    return _icall_Vector2( mb, this.ptr)
  }

  open fun getCollisionPoint(): Vector2 {
    val mb = getMethodBind("Physics2DTestMotionResult","get_collision_point")
    return _icall_Vector2( mb, this.ptr)
  }

  open fun getMotion(): Vector2 {
    val mb = getMethodBind("Physics2DTestMotionResult","get_motion")
    return _icall_Vector2( mb, this.ptr)
  }

  open fun getMotionRemainder(): Vector2 {
    val mb = getMethodBind("Physics2DTestMotionResult","get_motion_remainder")
    return _icall_Vector2( mb, this.ptr)
  }
}
