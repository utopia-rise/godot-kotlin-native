package godot

import godot.core.Godot.shouldInitPtr
import godot.core.Vector2
import godot.icalls._icall_Unit_Vector2
import godot.icalls._icall_Vector2
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Unit

open class RectangleShape2D internal constructor(
  _ignore: Any?
) : Shape2D(_ignore) {
  open var extents: Vector2
    get() {
      val mb = getMethodBind("RectangleShape2D","get_extents")
      return _icall_Vector2(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("RectangleShape2D","set_extents")
      _icall_Unit_Vector2(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("RectangleShape2D", "RectangleShape2D")
        }

  }

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

  companion object
}
