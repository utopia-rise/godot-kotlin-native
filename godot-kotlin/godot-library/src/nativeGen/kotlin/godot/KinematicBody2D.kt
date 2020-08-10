// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot.shouldInitPtr
import godot.core.Transform2D
import godot.core.Vector2
import godot.icalls._icall_Boolean
import godot.icalls._icall_Boolean_Transform2D_Vector2_Boolean
import godot.icalls._icall_Double
import godot.icalls._icall_KinematicCollision2D_Long
import godot.icalls._icall_KinematicCollision2D_Vector2_Boolean_Boolean_Boolean
import godot.icalls._icall_Long
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Vector2
import godot.icalls._icall_Vector2_Vector2_Vector2_Boolean_Long_Double_Boolean
import godot.icalls._icall_Vector2_Vector2_Vector2_Vector2_Boolean_Long_Double_Boolean
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long

open class KinematicBody2D internal constructor(
  _ignore: Any?
) : PhysicsBody2D(_ignore) {
  open var collision_safeMargin: Double
    get() {
      val mb = getMethodBind("KinematicBody2D","get_safe_margin")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("KinematicBody2D","set_safe_margin")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var motion_syncToPhysics: Boolean
    get() {
      val mb = getMethodBind("KinematicBody2D","is_sync_to_physics_enabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("KinematicBody2D","set_sync_to_physics")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("KinematicBody2D", "KinematicBody2D")
        }

  }

  open fun _direct_state_changed(arg0: Object) {
  }

  open fun getFloorNormal(): Vector2 {
    val mb = getMethodBind("KinematicBody2D","get_floor_normal")
    return _icall_Vector2( mb, this.ptr)
  }

  open fun getFloorVelocity(): Vector2 {
    val mb = getMethodBind("KinematicBody2D","get_floor_velocity")
    return _icall_Vector2( mb, this.ptr)
  }

  open fun getSafeMargin(): Double {
    val mb = getMethodBind("KinematicBody2D","get_safe_margin")
    return _icall_Double( mb, this.ptr)
  }

  open fun getSlideCollision(slideIdx: Long): KinematicCollision2D {
    val mb = getMethodBind("KinematicBody2D","get_slide_collision")
    return _icall_KinematicCollision2D_Long( mb, this.ptr, slideIdx)
  }

  open fun getSlideCount(): Long {
    val mb = getMethodBind("KinematicBody2D","get_slide_count")
    return _icall_Long( mb, this.ptr)
  }

  open fun isOnCeiling(): Boolean {
    val mb = getMethodBind("KinematicBody2D","is_on_ceiling")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isOnFloor(): Boolean {
    val mb = getMethodBind("KinematicBody2D","is_on_floor")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isOnWall(): Boolean {
    val mb = getMethodBind("KinematicBody2D","is_on_wall")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isSyncToPhysicsEnabled(): Boolean {
    val mb = getMethodBind("KinematicBody2D","is_sync_to_physics_enabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun moveAndCollide(
    relVec: Vector2,
    infiniteInertia: Boolean = true,
    excludeRaycastShapes: Boolean = true,
    testOnly: Boolean = false
  ): KinematicCollision2D {
    val mb = getMethodBind("KinematicBody2D","move_and_collide")
    return _icall_KinematicCollision2D_Vector2_Boolean_Boolean_Boolean( mb, this.ptr, relVec,
        infiniteInertia, excludeRaycastShapes, testOnly)
  }

  open fun moveAndSlide(
    linearVelocity: Vector2,
    upDirection: Vector2 = Vector2(0.0, 0.0),
    stopOnSlope: Boolean = false,
    maxSlides: Long = 4,
    floorMaxAngle: Double = 0.785398,
    infiniteInertia: Boolean = true
  ): Vector2 {
    val mb = getMethodBind("KinematicBody2D","move_and_slide")
    return _icall_Vector2_Vector2_Vector2_Boolean_Long_Double_Boolean( mb, this.ptr, linearVelocity,
        upDirection, stopOnSlope, maxSlides, floorMaxAngle, infiniteInertia)
  }

  open fun moveAndSlideWithSnap(
    linearVelocity: Vector2,
    snap: Vector2,
    upDirection: Vector2 = Vector2(0.0, 0.0),
    stopOnSlope: Boolean = false,
    maxSlides: Long = 4,
    floorMaxAngle: Double = 0.785398,
    infiniteInertia: Boolean = true
  ): Vector2 {
    val mb = getMethodBind("KinematicBody2D","move_and_slide_with_snap")
    return _icall_Vector2_Vector2_Vector2_Vector2_Boolean_Long_Double_Boolean( mb, this.ptr,
        linearVelocity, snap, upDirection, stopOnSlope, maxSlides, floorMaxAngle, infiniteInertia)
  }

  open fun setSafeMargin(pixels: Double) {
    val mb = getMethodBind("KinematicBody2D","set_safe_margin")
    _icall_Unit_Double( mb, this.ptr, pixels)
  }

  open fun setSyncToPhysics(enable: Boolean) {
    val mb = getMethodBind("KinematicBody2D","set_sync_to_physics")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun testMove(
    from: Transform2D,
    relVec: Vector2,
    infiniteInertia: Boolean = true
  ): Boolean {
    val mb = getMethodBind("KinematicBody2D","test_move")
    return _icall_Boolean_Transform2D_Vector2_Boolean( mb, this.ptr, from, relVec, infiniteInertia)
  }
}
