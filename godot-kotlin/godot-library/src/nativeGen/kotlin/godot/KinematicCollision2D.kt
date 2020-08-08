package godot

import godot.core.Godot.shouldInitPtr
import godot.core.Variant
import godot.core.Vector2
import godot.icalls._icall_Long
import godot.icalls._icall_Object
import godot.icalls._icall_Variant
import godot.icalls._icall_Vector2
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Long

open class KinematicCollision2D internal constructor(
  _ignore: Any?
) : Reference(_ignore) {
  open val collider: Object
    get() {
      val mb = getMethodBind("KinematicCollision2D","get_collider")
      return _icall_Object(mb, this.ptr)
    }

  open val colliderId: Long
    get() {
      val mb = getMethodBind("KinematicCollision2D","get_collider_id")
      return _icall_Long(mb, this.ptr)
    }

  open val colliderMetadata: Variant
    get() {
      val mb = getMethodBind("KinematicCollision2D","get_collider_metadata")
      return _icall_Variant(mb, this.ptr)
    }

  open val colliderShape: Object
    get() {
      val mb = getMethodBind("KinematicCollision2D","get_collider_shape")
      return _icall_Object(mb, this.ptr)
    }

  open val colliderShapeIndex: Long
    get() {
      val mb = getMethodBind("KinematicCollision2D","get_collider_shape_index")
      return _icall_Long(mb, this.ptr)
    }

  open val colliderVelocity: Vector2
    get() {
      val mb = getMethodBind("KinematicCollision2D","get_collider_velocity")
      return _icall_Vector2(mb, this.ptr)
    }

  open val localShape: Object
    get() {
      val mb = getMethodBind("KinematicCollision2D","get_local_shape")
      return _icall_Object(mb, this.ptr)
    }

  open val normal: Vector2
    get() {
      val mb = getMethodBind("KinematicCollision2D","get_normal")
      return _icall_Vector2(mb, this.ptr)
    }

  open val position: Vector2
    get() {
      val mb = getMethodBind("KinematicCollision2D","get_position")
      return _icall_Vector2(mb, this.ptr)
    }

  open val remainder: Vector2
    get() {
      val mb = getMethodBind("KinematicCollision2D","get_remainder")
      return _icall_Vector2(mb, this.ptr)
    }

  open val travel: Vector2
    get() {
      val mb = getMethodBind("KinematicCollision2D","get_travel")
      return _icall_Vector2(mb, this.ptr)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("KinematicCollision2D", "KinematicCollision2D")
        }

  }

  open fun getCollider(): Object {
    val mb = getMethodBind("KinematicCollision2D","get_collider")
    return _icall_Object( mb, this.ptr)
  }

  open fun getColliderId(): Long {
    val mb = getMethodBind("KinematicCollision2D","get_collider_id")
    return _icall_Long( mb, this.ptr)
  }

  open fun getColliderMetadata(): Variant {
    val mb = getMethodBind("KinematicCollision2D","get_collider_metadata")
    return _icall_Variant( mb, this.ptr)
  }

  open fun getColliderShape(): Object {
    val mb = getMethodBind("KinematicCollision2D","get_collider_shape")
    return _icall_Object( mb, this.ptr)
  }

  open fun getColliderShapeIndex(): Long {
    val mb = getMethodBind("KinematicCollision2D","get_collider_shape_index")
    return _icall_Long( mb, this.ptr)
  }

  open fun getColliderVelocity(): Vector2 {
    val mb = getMethodBind("KinematicCollision2D","get_collider_velocity")
    return _icall_Vector2( mb, this.ptr)
  }

  open fun getLocalShape(): Object {
    val mb = getMethodBind("KinematicCollision2D","get_local_shape")
    return _icall_Object( mb, this.ptr)
  }

  open fun getNormal(): Vector2 {
    val mb = getMethodBind("KinematicCollision2D","get_normal")
    return _icall_Vector2( mb, this.ptr)
  }

  open fun getPosition(): Vector2 {
    val mb = getMethodBind("KinematicCollision2D","get_position")
    return _icall_Vector2( mb, this.ptr)
  }

  open fun getRemainder(): Vector2 {
    val mb = getMethodBind("KinematicCollision2D","get_remainder")
    return _icall_Vector2( mb, this.ptr)
  }

  open fun getTravel(): Vector2 {
    val mb = getMethodBind("KinematicCollision2D","get_travel")
    return _icall_Vector2( mb, this.ptr)
  }

  companion object
}
