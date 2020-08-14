// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Vector2
import godot.icalls._icall_Unit_Vector2
import godot.icalls._icall_Vector2
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Unit
import kotlinx.cinterop.COpaquePointer

open class RectangleShape2D : Shape2D() {
  open var extents: Vector2
    get() {
      val mb = getMethodBind("RectangleShape2D","get_extents")
      return _icall_Vector2(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("RectangleShape2D","set_extents")
      _icall_Unit_Vector2(mb, this.ptr, value)
    }

  override fun __new(): COpaquePointer = invokeConstructor("RectangleShape2D", "RectangleShape2D")

  open fun extents(schedule: Vector2.() -> Unit): Vector2 = extents.apply{
      schedule(this)
      extents = this
  }


  open fun getExtents(): Vector2 {
    val mb = getMethodBind("RectangleShape2D","get_extents")
    return _icall_Vector2( mb, this.ptr)
  }

  open fun setExtents(extents: Vector2) {
    val mb = getMethodBind("RectangleShape2D","set_extents")
    _icall_Unit_Vector2( mb, this.ptr, extents)
  }
}
