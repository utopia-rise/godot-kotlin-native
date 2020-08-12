// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Color
import godot.icalls._icall_Color
import godot.icalls._icall_Unit_Color
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Unit
import kotlinx.cinterop.COpaquePointer

open class ColorRect : Control() {
  open var color: Color
    get() {
      val mb = getMethodBind("ColorRect","get_frame_color")
      return _icall_Color(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ColorRect","set_frame_color")
      _icall_Unit_Color(mb, this.ptr, value)
    }

  override fun __new(): COpaquePointer = invokeConstructor("ColorRect", "ColorRect")

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
