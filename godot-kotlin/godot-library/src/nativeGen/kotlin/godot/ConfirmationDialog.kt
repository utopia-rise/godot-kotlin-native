// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot.shouldInitPtr
import godot.icalls._icall_Button
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Any

open class ConfirmationDialog internal constructor(
  _ignore: Any?
) : AcceptDialog(_ignore) {
  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = invokeConstructor("ConfirmationDialog", "ConfirmationDialog")
        }

  }

  open fun getCancel(): Button {
    val mb = getMethodBind("ConfirmationDialog","get_cancel")
    return _icall_Button( mb, this.ptr)
  }
}
