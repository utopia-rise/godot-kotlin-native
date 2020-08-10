package godot

import godot.core.Color
import godot.core.Godot.shouldInitPtr
import godot.icalls._icall_Color
import godot.icalls._icall_Unit_Color
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Unit

open class ColorRect internal constructor(
  _ignore: Any?
) : Control(_ignore) {
  open var color: Color
    get() {
      val mb = getMethodBind("ColorRect","get_frame_color")
      return _icall_Color(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ColorRect","set_frame_color")
      _icall_Unit_Color(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("ColorRect", "ColorRect")
        }

  }

  open fun color(schedule: Color.() -> Unit): Color = color.apply{
      schedule(this)
      color = this
  }


  open fun getFrameColor(): Color {
    val mb = getMethodBind("ColorRect","get_frame_color")
    return _icall_Color( mb, this.ptr)
  }

  open fun setFrameColor(color: Color) {
    val mb = getMethodBind("ColorRect","set_frame_color")
    _icall_Unit_Color( mb, this.ptr, color)
  }
}
