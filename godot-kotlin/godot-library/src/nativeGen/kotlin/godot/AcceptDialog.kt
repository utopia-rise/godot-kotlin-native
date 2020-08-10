package godot

import godot.core.Godot.shouldInitPtr
import godot.core.Signal0
import godot.core.Signal1
import godot.core.signal
import godot.icalls._icall_Boolean
import godot.icalls._icall_Button
import godot.icalls._icall_Button_String
import godot.icalls._icall_Button_String_Boolean_String
import godot.icalls._icall_Label
import godot.icalls._icall_String
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Object
import godot.icalls._icall_Unit_String
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.String

open class AcceptDialog internal constructor(
  _ignore: Any?
) : WindowDialog(_ignore) {
  val confirmed: Signal0 by signal()

  val customAction: Signal1<String> by signal("action")

  open var dialogAutowrap: Boolean
    get() {
      val mb = getMethodBind("AcceptDialog","has_autowrap")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AcceptDialog","set_autowrap")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var dialogHideOnOk: Boolean
    get() {
      val mb = getMethodBind("AcceptDialog","get_hide_on_ok")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AcceptDialog","set_hide_on_ok")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var dialogText: String
    get() {
      val mb = getMethodBind("AcceptDialog","get_text")
      return _icall_String(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AcceptDialog","set_text")
      _icall_Unit_String(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("AcceptDialog", "AcceptDialog")
        }

  }

  open fun _builtin_text_entered(arg0: String) {
  }

  open fun _custom_action(arg0: String) {
  }

  open fun _ok() {
  }

  open fun addButton(
    text: String,
    right: Boolean = false,
    action: String = ""
  ): Button {
    val mb = getMethodBind("AcceptDialog","add_button")
    return _icall_Button_String_Boolean_String( mb, this.ptr, text, right, action)
  }

  open fun addCancel(name: String): Button {
    val mb = getMethodBind("AcceptDialog","add_cancel")
    return _icall_Button_String( mb, this.ptr, name)
  }

  open fun getHideOnOk(): Boolean {
    val mb = getMethodBind("AcceptDialog","get_hide_on_ok")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun getLabel(): Label {
    val mb = getMethodBind("AcceptDialog","get_label")
    return _icall_Label( mb, this.ptr)
  }

  open fun getOk(): Button {
    val mb = getMethodBind("AcceptDialog","get_ok")
    return _icall_Button( mb, this.ptr)
  }

  open fun getText(): String {
    val mb = getMethodBind("AcceptDialog","get_text")
    return _icall_String( mb, this.ptr)
  }

  open fun hasAutowrap(): Boolean {
    val mb = getMethodBind("AcceptDialog","has_autowrap")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun registerTextEnter(lineEdit: Node) {
    val mb = getMethodBind("AcceptDialog","register_text_enter")
    _icall_Unit_Object( mb, this.ptr, lineEdit)
  }

  open fun setAutowrap(autowrap: Boolean) {
    val mb = getMethodBind("AcceptDialog","set_autowrap")
    _icall_Unit_Boolean( mb, this.ptr, autowrap)
  }

  open fun setHideOnOk(enabled: Boolean) {
    val mb = getMethodBind("AcceptDialog","set_hide_on_ok")
    _icall_Unit_Boolean( mb, this.ptr, enabled)
  }

  open fun setText(text: String) {
    val mb = getMethodBind("AcceptDialog","set_text")
    _icall_Unit_String( mb, this.ptr, text)
  }
}
