// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Color
import godot.icalls._icall_Color
import godot.icalls._icall_Unit_Color
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Unit
import kotlinx.cinterop.COpaquePointer

open class CanvasModulate : Node2D() {
  open var color: Color
    get() {
      val mb = getMethodBind("CanvasModulate","get_color")
      return _icall_Color(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CanvasModulate","set_color")
      _icall_Unit_Color(mb, this.ptr, value)
    }

  override fun __new(): COpaquePointer = invokeConstructor("CanvasModulate", "CanvasModulate")

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
