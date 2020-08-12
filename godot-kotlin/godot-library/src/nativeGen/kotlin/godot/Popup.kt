// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Rect2
import godot.core.Signal0
import godot.core.Vector2
import godot.core.signal
import godot.icalls._icall_Boolean
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_Rect2
import godot.icalls._icall_Unit_Vector2
import godot.icalls._icall_Unit_Vector2_Double
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlinx.cinterop.COpaquePointer

open class Popup : Control() {
  val aboutToShow: Signal0 by signal()

  val popupHide: Signal0 by signal()

  open var popupExclusive: Boolean
    get() {
      val mb = getMethodBind("Popup","is_exclusive")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Popup","set_exclusive")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  override fun __new(): COpaquePointer = invokeConstructor("Popup", "Popup")

  open fun isExclusive(): Boolean {
    val mb = getMethodBind("Popup","is_exclusive")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun popup(bounds: Rect2 = Rect2(0.0, 0.0, 0.0, 0.0)) {
    val mb = getMethodBind("Popup","popup")
    _icall_Unit_Rect2( mb, this.ptr, bounds)
  }

  open fun popupCentered(size: Vector2 = Vector2(0.0, 0.0)) {
    val mb = getMethodBind("Popup","popup_centered")
    _icall_Unit_Vector2( mb, this.ptr, size)
  }

  open fun popupCenteredClamped(size: Vector2 = Vector2(0.0, 0.0), fallbackRatio: Double = 0.75) {
    val mb = getMethodBind("Popup","popup_centered_clamped")
    _icall_Unit_Vector2_Double( mb, this.ptr, size, fallbackRatio)
  }

  open fun popupCenteredMinsize(minsize: Vector2 = Vector2(0.0, 0.0)) {
    val mb = getMethodBind("Popup","popup_centered_minsize")
    _icall_Unit_Vector2( mb, this.ptr, minsize)
  }

  open fun popupCenteredRatio(ratio: Double = 0.75) {
    val mb = getMethodBind("Popup","popup_centered_ratio")
    _icall_Unit_Double( mb, this.ptr, ratio)
  }

  open fun setAsMinsize() {
    val mb = getMethodBind("Popup","set_as_minsize")
    _icall_Unit( mb, this.ptr)
  }

  open fun setExclusive(enable: Boolean) {
    val mb = getMethodBind("Popup","set_exclusive")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  companion object {
    final const val NOTIFICATION_POPUP_HIDE: Long = 81

    final const val NOTIFICATION_POST_POPUP: Long = 80
  }
}
