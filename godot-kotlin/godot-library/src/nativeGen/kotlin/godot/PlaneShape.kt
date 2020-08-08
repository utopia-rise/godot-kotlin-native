package godot

import godot.core.Godot.shouldInitPtr
import godot.core.Plane
import godot.icalls._icall_Plane
import godot.icalls._icall_Unit_Plane
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Unit

open class PlaneShape internal constructor(
  _ignore: Any?
) : Shape(_ignore) {
  open var plane: Plane
    get() {
      val mb = getMethodBind("PlaneShape","get_plane")
      return _icall_Plane(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("PlaneShape","set_plane")
      _icall_Unit_Plane(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("PlaneShape", "PlaneShape")
        }

  }

  open fun plane(schedule: Plane.() -> Unit): Plane = plane.apply{
      schedule(this)
      plane = this
  }


  open fun getPlane(): Plane {
    val mb = getMethodBind("PlaneShape","get_plane")
    return _icall_Plane( mb, this.ptr)
  }

  open fun setPlane(plane: Plane) {
    val mb = getMethodBind("PlaneShape","set_plane")
    _icall_Unit_Plane( mb, this.ptr, plane)
  }

  companion object
}
