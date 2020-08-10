// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot.shouldInitPtr
import godot.core.RID
import godot.core.Vector2
import godot.icalls._icall_Boolean
import godot.icalls._icall_Boolean_Long
import godot.icalls._icall_Long
import godot.icalls._icall_Object
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Long_Boolean
import godot.icalls._icall_Unit_Object
import godot.icalls._icall_Unit_RID
import godot.icalls._icall_Unit_Vector2
import godot.icalls._icall_Vector2
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.Unit

open class RayCast2D internal constructor(
  _ignore: Any?
) : Node2D(_ignore) {
  open var castTo: Vector2
    get() {
      val mb = getMethodBind("RayCast2D","get_cast_to")
      return _icall_Vector2(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("RayCast2D","set_cast_to")
      _icall_Unit_Vector2(mb, this.ptr, value)
    }

  open var collideWithAreas: Boolean
    get() {
      val mb = getMethodBind("RayCast2D","is_collide_with_areas_enabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("RayCast2D","set_collide_with_areas")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var collideWithBodies: Boolean
    get() {
      val mb = getMethodBind("RayCast2D","is_collide_with_bodies_enabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("RayCast2D","set_collide_with_bodies")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var collisionMask: Long
    get() {
      val mb = getMethodBind("RayCast2D","get_collision_mask")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("RayCast2D","set_collision_mask")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var enabled: Boolean
    get() {
      val mb = getMethodBind("RayCast2D","is_enabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("RayCast2D","set_enabled")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var excludeParent: Boolean
    get() {
      val mb = getMethodBind("RayCast2D","get_exclude_parent_body")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("RayCast2D","set_exclude_parent_body")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("RayCast2D", "RayCast2D")
        }

  }

  open fun castTo(schedule: Vector2.() -> Unit): Vector2 = castTo.apply{
      schedule(this)
      castTo = this
  }


  open fun addException(node: Object) {
    val mb = getMethodBind("RayCast2D","add_exception")
    _icall_Unit_Object( mb, this.ptr, node)
  }

  open fun addExceptionRid(rid: RID) {
    val mb = getMethodBind("RayCast2D","add_exception_rid")
    _icall_Unit_RID( mb, this.ptr, rid)
  }

  open fun clearExceptions() {
    val mb = getMethodBind("RayCast2D","clear_exceptions")
    _icall_Unit( mb, this.ptr)
  }

  open fun forceRaycastUpdate() {
    val mb = getMethodBind("RayCast2D","force_raycast_update")
    _icall_Unit( mb, this.ptr)
  }

  open fun getCastTo(): Vector2 {
    val mb = getMethodBind("RayCast2D","get_cast_to")
    return _icall_Vector2( mb, this.ptr)
  }

  open fun getCollider(): Object {
    val mb = getMethodBind("RayCast2D","get_collider")
    return _icall_Object( mb, this.ptr)
  }

  open fun getColliderShape(): Long {
    val mb = getMethodBind("RayCast2D","get_collider_shape")
    return _icall_Long( mb, this.ptr)
  }

  open fun getCollisionMask(): Long {
    val mb = getMethodBind("RayCast2D","get_collision_mask")
    return _icall_Long( mb, this.ptr)
  }

  open fun getCollisionMaskBit(bit: Long): Boolean {
    val mb = getMethodBind("RayCast2D","get_collision_mask_bit")
    return _icall_Boolean_Long( mb, this.ptr, bit)
  }

  open fun getCollisionNormal(): Vector2 {
    val mb = getMethodBind("RayCast2D","get_collision_normal")
    return _icall_Vector2( mb, this.ptr)
  }

  open fun getCollisionPoint(): Vector2 {
    val mb = getMethodBind("RayCast2D","get_collision_point")
    return _icall_Vector2( mb, this.ptr)
  }

  open fun getExcludeParentBody(): Boolean {
    val mb = getMethodBind("RayCast2D","get_exclude_parent_body")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isCollideWithAreasEnabled(): Boolean {
    val mb = getMethodBind("RayCast2D","is_collide_with_areas_enabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isCollideWithBodiesEnabled(): Boolean {
    val mb = getMethodBind("RayCast2D","is_collide_with_bodies_enabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isColliding(): Boolean {
    val mb = getMethodBind("RayCast2D","is_colliding")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isEnabled(): Boolean {
    val mb = getMethodBind("RayCast2D","is_enabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun removeException(node: Object) {
    val mb = getMethodBind("RayCast2D","remove_exception")
    _icall_Unit_Object( mb, this.ptr, node)
  }

  open fun removeExceptionRid(rid: RID) {
    val mb = getMethodBind("RayCast2D","remove_exception_rid")
    _icall_Unit_RID( mb, this.ptr, rid)
  }

  open fun setCastTo(localPoint: Vector2) {
    val mb = getMethodBind("RayCast2D","set_cast_to")
    _icall_Unit_Vector2( mb, this.ptr, localPoint)
  }

  open fun setCollideWithAreas(enable: Boolean) {
    val mb = getMethodBind("RayCast2D","set_collide_with_areas")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setCollideWithBodies(enable: Boolean) {
    val mb = getMethodBind("RayCast2D","set_collide_with_bodies")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setCollisionMask(mask: Long) {
    val mb = getMethodBind("RayCast2D","set_collision_mask")
    _icall_Unit_Long( mb, this.ptr, mask)
  }

  open fun setCollisionMaskBit(bit: Long, value: Boolean) {
    val mb = getMethodBind("RayCast2D","set_collision_mask_bit")
    _icall_Unit_Long_Boolean( mb, this.ptr, bit, value)
  }

  open fun setEnabled(enabled: Boolean) {
    val mb = getMethodBind("RayCast2D","set_enabled")
    _icall_Unit_Boolean( mb, this.ptr, enabled)
  }

  open fun setExcludeParentBody(mask: Boolean) {
    val mb = getMethodBind("RayCast2D","set_exclude_parent_body")
    _icall_Unit_Boolean( mb, this.ptr, mask)
  }
}
