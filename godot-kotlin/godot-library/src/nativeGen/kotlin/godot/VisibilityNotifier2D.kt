// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Rect2
import godot.core.Signal0
import godot.core.Signal1
import godot.core.signal
import godot.icalls._icall_Boolean
import godot.icalls._icall_Rect2
import godot.icalls._icall_Unit_Rect2
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Boolean
import kotlin.Unit
import kotlinx.cinterop.COpaquePointer

open class VisibilityNotifier2D : Node2D() {
  val screenEntered: Signal0 by signal()

  val screenExited: Signal0 by signal()

  val viewportEntered: Signal1<Viewport> by signal("viewport")

  val viewportExited: Signal1<Viewport> by signal("viewport")

  open var rect: Rect2
    get() {
      val mb = getMethodBind("VisibilityNotifier2D","get_rect")
      return _icall_Rect2(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VisibilityNotifier2D","set_rect")
      _icall_Unit_Rect2(mb, this.ptr, value)
    }

  override fun __new(): COpaquePointer = invokeConstructor("VisibilityNotifier2D",
      "VisibilityNotifier2D")

  open fun rect(schedule: Rect2.() -> Unit): Rect2 = rect.apply{
      schedule(this)
      rect = this
  }


  open fun getRect(): Rect2 {
    val mb = getMethodBind("VisibilityNotifier2D","get_rect")
    return _icall_Rect2( mb, this.ptr)
  }

  open fun isOnScreen(): Boolean {
    val mb = getMethodBind("VisibilityNotifier2D","is_on_screen")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun setRect(rect: Rect2) {
    val mb = getMethodBind("VisibilityNotifier2D","set_rect")
    _icall_Unit_Rect2( mb, this.ptr, rect)
  }
}
