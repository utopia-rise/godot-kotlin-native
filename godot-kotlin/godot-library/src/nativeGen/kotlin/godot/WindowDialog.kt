package godot

import godot.core.Godot.shouldInitPtr
import godot.icalls._icall_Boolean
import godot.icalls._icall_String
import godot.icalls._icall_TextureButton
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_String
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.String

open class WindowDialog internal constructor(
  _ignore: Any?
) : Popup(_ignore) {
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

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("WindowDialog", "WindowDialog")
        }

  }

  open fun _closed() {
  }

  override fun _gui_input(arg0: InputEvent) {
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

  companion object
}
