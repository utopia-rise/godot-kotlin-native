// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot.shouldInitPtr
import godot.core.Variant
import godot.core.Vector3
import godot.icalls._icall_Long
import godot.icalls._icall_Object
import godot.icalls._icall_Variant
import godot.icalls._icall_Vector3
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Long

open class KinematicCollision internal constructor(
  _ignore: Any?
) : Reference(_ignore) {
  open val collider: Object
    get() {
      val mb = getMethodBind("KinematicCollision","get_collider")
      return _icall_Object(mb, this.ptr)
    }

  open val colliderId: Long
    get() {
      val mb = getMethodBind("KinematicCollision","get_collider_id")
      return _icall_Long(mb, this.ptr)
    }

  open val colliderMetadata: Variant
    get() {
      val mb = getMethodBind("KinematicCollision","get_collider_metadata")
      return _icall_Variant(mb, this.ptr)
    }

  open val colliderShape: Object
    get() {
      val mb = getMethodBind("KinematicCollision","get_collider_shape")
      return _icall_Object(mb, this.ptr)
    }

  open val colliderShapeIndex: Long
    get() {
      val mb = getMethodBind("KinematicCollision","get_collider_shape_index")
      return _icall_Long(mb, this.ptr)
    }

  open val colliderVelocity: Vector3
    get() {
      val mb = getMethodBind("KinematicCollision","get_collider_velocity")
      return _icall_Vector3(mb, this.ptr)
    }

  open val localShape: Object
    get() {
      val mb = getMethodBind("KinematicCollision","get_local_shape")
      return _icall_Object(mb, this.ptr)
    }

  open val normal: Vector3
    get() {
      val mb = getMethodBind("KinematicCollision","get_normal")
      return _icall_Vector3(mb, this.ptr)
    }

  open val position: Vector3
    get() {
      val mb = getMethodBind("KinematicCollision","get_position")
      return _icall_Vector3(mb, this.ptr)
    }

  open val remainder: Vector3
    get() {
      val mb = getMethodBind("KinematicCollision","get_remainder")
      return _icall_Vector3(mb, this.ptr)
    }

  open val travel: Vector3
    get() {
      val mb = getMethodBind("KinematicCollision","get_travel")
      return _icall_Vector3(mb, this.ptr)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("KinematicCollision", "KinematicCollision")
        }

  }

  open fun getCollider(): Object {
    val mb = getMethodBind("KinematicCollision","get_collider")
    return _icall_Object( mb, this.ptr)
  }

  open fun getColliderId(): Long {
    val mb = getMethodBind("KinematicCollision","get_collider_id")
    return _icall_Long( mb, this.ptr)
  }

  open fun getColliderMetadata(): Variant {
    val mb = getMethodBind("KinematicCollision","get_collider_metadata")
    return _icall_Variant( mb, this.ptr)
  }

  open fun getColliderShape(): Object {
    val mb = getMethodBind("KinematicCollision","get_collider_shape")
    return _icall_Object( mb, this.ptr)
  }

  open fun getColliderShapeIndex(): Long {
    val mb = getMethodBind("KinematicCollision","get_collider_shape_index")
    return _icall_Long( mb, this.ptr)
  }

  open fun getColliderVelocity(): Vector3 {
    val mb = getMethodBind("KinematicCollision","get_collider_velocity")
    return _icall_Vector3( mb, this.ptr)
  }

  open fun getLocalShape(): Object {
    val mb = getMethodBind("KinematicCollision","get_local_shape")
    return _icall_Object( mb, this.ptr)
  }

  open fun getNormal(): Vector3 {
    val mb = getMethodBind("KinematicCollision","get_normal")
    return _icall_Vector3( mb, this.ptr)
  }

  open fun getPosition(): Vector3 {
    val mb = getMethodBind("KinematicCollision","get_position")
    return _icall_Vector3( mb, this.ptr)
  }

  open fun getRemainder(): Vector3 {
    val mb = getMethodBind("KinematicCollision","get_remainder")
    return _icall_Vector3( mb, this.ptr)
  }

  open fun getTravel(): Vector3 {
    val mb = getMethodBind("KinematicCollision","get_travel")
    return _icall_Vector3( mb, this.ptr)
  }
}
