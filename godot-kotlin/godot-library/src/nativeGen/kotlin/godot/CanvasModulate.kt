// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Color
import godot.core.Godot.shouldInitPtr
import godot.icalls._icall_Color
import godot.icalls._icall_Unit_Color
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Unit

open class CanvasModulate internal constructor(
  _ignore: Any?
) : Node2D(_ignore) {
  open var color: Color
    get() {
      val mb = getMethodBind("CanvasModulate","get_color")
      return _icall_Color(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CanvasModulate","set_color")
      _icall_Unit_Color(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("CanvasModulate", "CanvasModulate")
        }

  }

  open fun color(schedule: Color.() -> Unit): Color = color.apply{
      schedule(this)
      color = this
  }


  open fun getColor(): Color {
    val mb = getMethodBind("CanvasModulate","get_color")
    return _icall_Color( mb, this.ptr)
  }

  open fun setColor(color: Color) {
    val mb = getMethodBind("CanvasModulate","set_color")
    _icall_Unit_Color( mb, this.ptr, color)
  }
}
