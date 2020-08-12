// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Plane
import godot.icalls._icall_Plane
import godot.icalls._icall_Unit_Plane
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Unit
import kotlinx.cinterop.COpaquePointer

open class PlaneShape : Shape() {
  open var plane: Plane
    get() {
      val mb = getMethodBind("PlaneShape","get_plane")
      return _icall_Plane(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("PlaneShape","set_plane")
      _icall_Unit_Plane(mb, this.ptr, value)
    }

  override fun __new(): COpaquePointer = invokeConstructor("PlaneShape", "PlaneShape")

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
}
