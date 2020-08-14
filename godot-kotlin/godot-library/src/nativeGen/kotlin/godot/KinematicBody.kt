// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Transform
import godot.core.Vector3
import godot.icalls._icall_Boolean
import godot.icalls._icall_Boolean_Long
import godot.icalls._icall_Boolean_Transform_Vector3_Boolean
import godot.icalls._icall_Double
import godot.icalls._icall_KinematicCollision_Long
import godot.icalls._icall_KinematicCollision_Vector3_Boolean_Boolean_Boolean
import godot.icalls._icall_Long
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_Long_Boolean
import godot.icalls._icall_Vector3
import godot.icalls._icall_Vector3_Vector3_Vector3_Boolean_Long_Double_Boolean
import godot.icalls._icall_Vector3_Vector3_Vector3_Vector3_Boolean_Long_Double_Boolean
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlinx.cinterop.COpaquePointer

open class KinematicBody : PhysicsBody() {
  open var collision_safeMargin: Double
    get() {
      val mb = getMethodBind("KinematicBody","get_safe_margin")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("KinematicBody","set_safe_margin")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var moveLockX: Boolean
    get() {
      val mb = getMethodBind("KinematicBody","get_axis_lock")
      return _icall_Boolean_Long(mb, this.ptr, 1)
    }
    set(value) {
      val mb = getMethodBind("KinematicBody","set_axis_lock")
      _icall_Unit_Long_Boolean(mb, this.ptr, 1, value)
    }

  open var moveLockY: Boolean
    get() {
      val mb = getMethodBind("KinematicBody","get_axis_lock")
      return _icall_Boolean_Long(mb, this.ptr, 2)
    }
    set(value) {
      val mb = getMethodBind("KinematicBody","set_axis_lock")
      _icall_Unit_Long_Boolean(mb, this.ptr, 2, value)
    }

  open var moveLockZ: Boolean
    get() {
      val mb = getMethodBind("KinematicBody","get_axis_lock")
      return _icall_Boolean_Long(mb, this.ptr, 4)
    }
    set(value) {
      val mb = getMethodBind("KinematicBody","set_axis_lock")
      _icall_Unit_Long_Boolean(mb, this.ptr, 4, value)
    }

  override fun __new(): COpaquePointer = invokeConstructor("KinematicBody", "KinematicBody")

  open fun getAxisLock(axis: Long): Boolean {
    val mb = getMethodBind("KinematicBody","get_axis_lock")
    return _icall_Boolean_Long( mb, this.ptr, axis)
  }

  open fun getFloorNormal(): Vector3 {
    val mb = getMethodBind("KinematicBody","get_floor_normal")
    return _icall_Vector3( mb, this.ptr)
  }

  open fun getFloorVelocity(): Vector3 {
    val mb = getMethodBind("KinematicBody","get_floor_velocity")
    return _icall_Vector3( mb, this.ptr)
  }

  open fun getSafeMargin(): Double {
    val mb = getMethodBind("KinematicBody","get_safe_margin")
    return _icall_Double( mb, this.ptr)
  }

  open fun getSlideCollision(slideIdx: Long): KinematicCollision {
    val mb = getMethodBind("KinematicBody","get_slide_collision")
    return _icall_KinematicCollision_Long( mb, this.ptr, slideIdx)
  }

  open fun getSlideCount(): Long {
    val mb = getMethodBind("KinematicBody","get_slide_count")
    return _icall_Long( mb, this.ptr)
  }

  open fun isOnCeiling(): Boolean {
    val mb = getMethodBind("KinematicBody","is_on_ceiling")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isOnFloor(): Boolean {
    val mb = getMethodBind("KinematicBody","is_on_floor")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isOnWall(): Boolean {
    val mb = getMethodBind("KinematicBody","is_on_wall")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun moveAndCollide(
    relVec: Vector3,
    infiniteInertia: Boolean = true,
    excludeRaycastShapes: Boolean = true,
    testOnly: Boolean = false
  ): KinematicCollision {
    val mb = getMethodBind("KinematicBody","move_and_collide")
    return _icall_KinematicCollision_Vector3_Boolean_Boolean_Boolean( mb, this.ptr, relVec,
        infiniteInertia, excludeRaycastShapes, testOnly)
  }

  open fun moveAndSlide(
    linearVelocity: Vector3,
    upDirection: Vector3 = Vector3(0.0, 0.0, 0.0),
    stopOnSlope: Boolean = false,
    maxSlides: Long = 4,
    floorMaxAngle: Double = 0.785398,
    infiniteInertia: Boolean = true
  ): Vector3 {
    val mb = getMethodBind("KinematicBody","move_and_slide")
    return _icall_Vector3_Vector3_Vector3_Boolean_Long_Double_Boolean( mb, this.ptr, linearVelocity,
        upDirection, stopOnSlope, maxSlides, floorMaxAngle, infiniteInertia)
  }

  open fun moveAndSlideWithSnap(
    linearVelocity: Vector3,
    snap: Vector3,
    upDirection: Vector3 = Vector3(0.0, 0.0, 0.0),
    stopOnSlope: Boolean = false,
    maxSlides: Long = 4,
    floorMaxAngle: Double = 0.785398,
    infiniteInertia: Boolean = true
  ): Vector3 {
    val mb = getMethodBind("KinematicBody","move_and_slide_with_snap")
    return _icall_Vector3_Vector3_Vector3_Vector3_Boolean_Long_Double_Boolean( mb, this.ptr,
        linearVelocity, snap, upDirection, stopOnSlope, maxSlides, floorMaxAngle, infiniteInertia)
  }

  open fun setAxisLock(axis: Long, lock: Boolean) {
    val mb = getMethodBind("KinematicBody","set_axis_lock")
    _icall_Unit_Long_Boolean( mb, this.ptr, axis, lock)
  }

  open fun setSafeMargin(pixels: Double) {
    val mb = getMethodBind("KinematicBody","set_safe_margin")
    _icall_Unit_Double( mb, this.ptr, pixels)
  }

  open fun testMove(
    from: Transform,
    relVec: Vector3,
    infiniteInertia: Boolean = true
  ): Boolean {
    val mb = getMethodBind("KinematicBody","test_move")
    return _icall_Boolean_Transform_Vector3_Boolean( mb, this.ptr, from, relVec, infiniteInertia)
  }
}
