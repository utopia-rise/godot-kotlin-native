// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.icalls._icall_Boolean
import godot.icalls._icall_Unit_Boolean
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Boolean
import kotlinx.cinterop.COpaquePointer

open class ProgressBar : Range() {
  open var percentVisible: Boolean
    get() {
      val mb = getMethodBind("ProgressBar","is_percent_visible")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ProgressBar","set_percent_visible")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  override fun __new(): COpaquePointer = invokeConstructor("ProgressBar", "ProgressBar")

  open fun isPercentVisible(): Boolean {
    val mb = getMethodBind("ProgressBar","is_percent_visible")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun setPercentVisible(visible: Boolean) {
    val mb = getMethodBind("ProgressBar","set_percent_visible")
    _icall_Unit_Boolean( mb, this.ptr, visible)
  }
}
