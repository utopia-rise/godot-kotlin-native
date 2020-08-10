package godot

import godot.core.Godot.shouldInitPtr
import godot.core.Signal0
import godot.core.VariantArray
import godot.core.signal
import godot.icalls._icall_Boolean
import godot.icalls._icall_PopupMenu
import godot.icalls._icall_Unit_Boolean
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.NotImplementedError

open class MenuButton internal constructor(
  _ignore: Any?
) : Button(_ignore) {
  val aboutToShow: Signal0 by signal()

  open var switchOnHover: Boolean
    get() {
      val mb = getMethodBind("MenuButton","is_switch_on_hover")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("MenuButton","set_switch_on_hover")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("MenuButton", "MenuButton")
        }

  }

  open fun _get_items(): VariantArray {
    throw NotImplementedError("_get_items is not implemented for MenuButton")
  }

  open fun _set_items(arg0: VariantArray) {
  }

  open fun _unhandled_key_input(arg0: InputEvent) {
  }

  open fun getPopup(): PopupMenu {
    val mb = getMethodBind("MenuButton","get_popup")
    return _icall_PopupMenu( mb, this.ptr)
  }

  open fun isSwitchOnHover(): Boolean {
    val mb = getMethodBind("MenuButton","is_switch_on_hover")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun setDisableShortcuts(disabled: Boolean) {
    val mb = getMethodBind("MenuButton","set_disable_shortcuts")
    _icall_Unit_Boolean( mb, this.ptr, disabled)
  }

  open fun setSwitchOnHover(enable: Boolean) {
    val mb = getMethodBind("MenuButton","set_switch_on_hover")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }
}
