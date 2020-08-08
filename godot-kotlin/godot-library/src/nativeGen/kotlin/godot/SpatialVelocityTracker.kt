package godot

import godot.core.Godot.shouldInitPtr
import godot.core.Vector3
import godot.icalls._icall_Boolean
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Vector3
import godot.icalls._icall_Vector3
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean

open class SpatialVelocityTracker internal constructor(
  _ignore: Any?
) : Reference(_ignore) {
  open var trackPhysicsStep: Boolean
    get() {
      val mb = getMethodBind("SpatialVelocityTracker","is_tracking_physics_step")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SpatialVelocityTracker","set_track_physics_step")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("SpatialVelocityTracker", "SpatialVelocityTracker")
        }

  }

  open fun getTrackedLinearVelocity(): Vector3 {
    val mb = getMethodBind("SpatialVelocityTracker","get_tracked_linear_velocity")
    return _icall_Vector3( mb, this.ptr)
  }

  open fun isTrackingPhysicsStep(): Boolean {
    val mb = getMethodBind("SpatialVelocityTracker","is_tracking_physics_step")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun reset(position: Vector3) {
    val mb = getMethodBind("SpatialVelocityTracker","reset")
    _icall_Unit_Vector3( mb, this.ptr, position)
  }

  open fun setTrackPhysicsStep(enable: Boolean) {
    val mb = getMethodBind("SpatialVelocityTracker","set_track_physics_step")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun updatePosition(position: Vector3) {
    val mb = getMethodBind("SpatialVelocityTracker","update_position")
    _icall_Unit_Vector3( mb, this.ptr, position)
  }

  companion object
}
