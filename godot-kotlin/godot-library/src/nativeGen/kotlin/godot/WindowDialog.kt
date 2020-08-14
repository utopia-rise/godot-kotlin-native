// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.icalls._icall_Boolean
import godot.icalls._icall_String
import godot.icalls._icall_TextureButton
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_String
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Boolean
import kotlin.String
import kotlinx.cinterop.COpaquePointer

open class WindowDialog : Popup() {
  open var resizable: Boolean
    get() {
      val mb = getMethodBind("WindowDialog","get_resizable")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("WindowDialog","set_resizable")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var windowTitle: String
    get() {
      val mb = getMethodBind("WindowDialog","get_title")
      return _icall_String(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("WindowDialog","set_title")
      _icall_Unit_String(mb, this.ptr, value)
    }

  override fun __new(): COpaquePointer = invokeConstructor("WindowDialog", "WindowDialog")

  open fun _closed() {
  }

  override fun _guiInput(arg0: InputEvent) {
  }

  open fun getCloseButton(): TextureButton {
    val mb = getMethodBind("WindowDialog","get_close_button")
    return _icall_TextureButton( mb, this.ptr)
  }

  open fun getResizable(): Boolean {
    val mb = getMethodBind("WindowDialog","get_resizable")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun getTitle(): String {
    val mb = getMethodBind("WindowDialog","get_title")
    return _icall_String( mb, this.ptr)
  }

  open fun setResizable(resizable: Boolean) {
    val mb = getMethodBind("WindowDialog","set_resizable")
    _icall_Unit_Boolean( mb, this.ptr, resizable)
  }

  open fun setTitle(title: String) {
    val mb = getMethodBind("WindowDialog","set_title")
    _icall_Unit_String( mb, this.ptr, title)
  }
}
