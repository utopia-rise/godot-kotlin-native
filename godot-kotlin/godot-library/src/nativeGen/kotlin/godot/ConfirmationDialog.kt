// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.icalls._icall_Button
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlinx.cinterop.COpaquePointer

open class ConfirmationDialog : AcceptDialog() {
  override fun __new(): COpaquePointer = invokeConstructor("ConfirmationDialog",
      "ConfirmationDialog")

  open fun getCancel(): Button {
    val mb = getMethodBind("ConfirmationDialog","get_cancel")
    return _icall_Button( mb, this.ptr)
  }
}
