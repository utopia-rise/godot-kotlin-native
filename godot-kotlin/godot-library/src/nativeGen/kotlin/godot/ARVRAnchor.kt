package godot

import godot.core.Godot.shouldInitPtr
import godot.core.Plane
import godot.core.Signal1
import godot.core.Vector3
import godot.core.signal
import godot.icalls._icall_Boolean
import godot.icalls._icall_Long
import godot.icalls._icall_Mesh
import godot.icalls._icall_Plane
import godot.icalls._icall_String
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Vector3
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.String

open class ARVRAnchor internal constructor(
  _ignore: Any?
) : Spatial(_ignore) {
  val meshUpdated: Signal1<Mesh> by signal("mesh")

  open var anchorId: Long
    get() {
      val mb = getMethodBind("ARVRAnchor","get_anchor_id")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ARVRAnchor","set_anchor_id")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("ARVRAnchor", "ARVRAnchor")
        }

  }

  open fun getAnchorId(): Long {
    val mb = getMethodBind("ARVRAnchor","get_anchor_id")
    return _icall_Long( mb, this.ptr)
  }

  open fun getAnchorName(): String {
    val mb = getMethodBind("ARVRAnchor","get_anchor_name")
    return _icall_String( mb, this.ptr)
  }

  open fun getIsActive(): Boolean {
    val mb = getMethodBind("ARVRAnchor","get_is_active")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun getMesh(): Mesh {
    val mb = getMethodBind("ARVRAnchor","get_mesh")
    return _icall_Mesh( mb, this.ptr)
  }

  open fun getPlane(): Plane {
    val mb = getMethodBind("ARVRAnchor","get_plane")
    return _icall_Plane( mb, this.ptr)
  }

  open fun getSize(): Vector3 {
    val mb = getMethodBind("ARVRAnchor","get_size")
    return _icall_Vector3( mb, this.ptr)
  }

  open fun setAnchorId(anchorId: Long) {
    val mb = getMethodBind("ARVRAnchor","set_anchor_id")
    _icall_Unit_Long( mb, this.ptr, anchorId)
  }

  companion object
}
