// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot.shouldInitPtr
import godot.icalls._icall_Boolean
import godot.icalls._icall_Unit_Boolean
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Any
import kotlin.Boolean

open class ProgressBar internal constructor(
  _ignore: Any?
) : Range(_ignore) {
  open var percentVisible: Boolean
    get() {
      val mb = getMethodBind("ProgressBar","is_percent_visible")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ProgressBar","set_percent_visible")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = invokeConstructor("ProgressBar", "ProgressBar")
        }

  }

  open fun isPercentVisible(): Boolean {
    val mb = getMethodBind("ProgressBar","is_percent_visible")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun setPercentVisible(visible: Boolean) {
    val mb = getMethodBind("ProgressBar","set_percent_visible")
    _icall_Unit_Boolean( mb, this.ptr, visible)
  }
}
