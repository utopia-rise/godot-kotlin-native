package godot

import godot.ARVRPositionalTracker
import godot.ARVRServer
import godot.core.Basis
import godot.core.Godot.shouldInitPtr
import godot.core.Transform
import godot.core.Vector3
import godot.icalls._icall_Basis
import godot.icalls._icall_Boolean
import godot.icalls._icall_Double
import godot.icalls._icall_Long
import godot.icalls._icall_Mesh
import godot.icalls._icall_String
import godot.icalls._icall_Transform_Boolean
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Vector3
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.String

open class ARVRPositionalTracker internal constructor(
  _ignore: Any?
) : Object(_ignore) {
  open var rumble: Double
    get() {
      val mb = getMethodBind("ARVRPositionalTracker","get_rumble")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ARVRPositionalTracker","set_rumble")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("ARVRPositionalTracker", "ARVRPositionalTracker")
        }

  }

  open fun _set_joy_id(joyId: Long) {
  }

  open fun _set_mesh(mesh: Mesh) {
  }

  open fun _set_name(name: String) {
  }

  open fun _set_orientation(orientation: Basis) {
  }

  open fun _set_rw_position(rwPosition: Vector3) {
  }

  open fun _set_type(type: Long) {
  }

  open fun getHand(): ARVRPositionalTracker.TrackerHand {
    val mb = getMethodBind("ARVRPositionalTracker","get_hand")
    return ARVRPositionalTracker.TrackerHand.from( _icall_Long( mb, this.ptr))
  }

  open fun getJoyId(): Long {
    val mb = getMethodBind("ARVRPositionalTracker","get_joy_id")
    return _icall_Long( mb, this.ptr)
  }

  open fun getMesh(): Mesh {
    val mb = getMethodBind("ARVRPositionalTracker","get_mesh")
    return _icall_Mesh( mb, this.ptr)
  }

  open fun getName(): String {
    val mb = getMethodBind("ARVRPositionalTracker","get_name")
    return _icall_String( mb, this.ptr)
  }

  open fun getOrientation(): Basis {
    val mb = getMethodBind("ARVRPositionalTracker","get_orientation")
    return _icall_Basis( mb, this.ptr)
  }

  open fun getPosition(): Vector3 {
    val mb = getMethodBind("ARVRPositionalTracker","get_position")
    return _icall_Vector3( mb, this.ptr)
  }

  open fun getRumble(): Double {
    val mb = getMethodBind("ARVRPositionalTracker","get_rumble")
    return _icall_Double( mb, this.ptr)
  }

  open fun getTrackerId(): Long {
    val mb = getMethodBind("ARVRPositionalTracker","get_tracker_id")
    return _icall_Long( mb, this.ptr)
  }

  open fun getTracksOrientation(): Boolean {
    val mb = getMethodBind("ARVRPositionalTracker","get_tracks_orientation")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun getTracksPosition(): Boolean {
    val mb = getMethodBind("ARVRPositionalTracker","get_tracks_position")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun getTransform(adjustByReferenceFrame: Boolean): Transform {
    val mb = getMethodBind("ARVRPositionalTracker","get_transform")
    return _icall_Transform_Boolean( mb, this.ptr, adjustByReferenceFrame)
  }

  open fun getType(): ARVRServer.TrackerType {
    val mb = getMethodBind("ARVRPositionalTracker","get_type")
    return ARVRServer.TrackerType.from( _icall_Long( mb, this.ptr))
  }

  open fun setRumble(rumble: Double) {
    val mb = getMethodBind("ARVRPositionalTracker","set_rumble")
    _icall_Unit_Double( mb, this.ptr, rumble)
  }

  enum class TrackerHand(
    id: Long
  ) {
    TRACKER_HAND_UNKNOWN(0),

    TRACKER_LEFT_HAND(1),

    TRACKER_RIGHT_HAND(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val TRACKER_HAND_UNKNOWN: Long = 0

    final const val TRACKER_LEFT_HAND: Long = 1

    final const val TRACKER_RIGHT_HAND: Long = 2
  }
}
