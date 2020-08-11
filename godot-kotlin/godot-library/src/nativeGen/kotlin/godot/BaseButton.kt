// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.BaseButton
import godot.Control
import godot.core.Signal0
import godot.core.Signal1
import godot.core.signal
import godot.icalls._icall_Boolean
import godot.icalls._icall_ButtonGroup
import godot.icalls._icall_Long
import godot.icalls._icall_ShortCut
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Object
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Long

open class BaseButton internal constructor(
  _ignore: Any?
) : Control(_ignore) {
  val buttonDown: Signal0 by signal()

  val buttonUp: Signal0 by signal()

  val signalPressed: Signal0 by signal()

  val toggled: Signal1<Boolean> by signal("button_pressed")

  open var actionMode: Long
    get() {
      val mb = getMethodBind("BaseButton","get_action_mode")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("BaseButton","set_action_mode")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var buttonMask: Long
    get() {
      val mb = getMethodBind("BaseButton","get_button_mask")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("BaseButton","set_button_mask")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var disabled: Boolean
    get() {
      val mb = getMethodBind("BaseButton","is_disabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("BaseButton","set_disabled")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var enabledFocusMode: Long
    get() {
      val mb = getMethodBind("BaseButton","get_enabled_focus_mode")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("BaseButton","set_enabled_focus_mode")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var group: ButtonGroup
    get() {
      val mb = getMethodBind("BaseButton","get_button_group")
      return _icall_ButtonGroup(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("BaseButton","set_button_group")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  open var keepPressedOutside: Boolean
    get() {
      val mb = getMethodBind("BaseButton","is_keep_pressed_outside")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("BaseButton","set_keep_pressed_outside")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var pressed: Boolean
    get() {
      val mb = getMethodBind("BaseButton","is_pressed")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("BaseButton","set_pressed")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var shortcut: ShortCut
    get() {
      val mb = getMethodBind("BaseButton","get_shortcut")
      return _icall_ShortCut(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("BaseButton","set_shortcut")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  open var shortcutInTooltip: Boolean
    get() {
      val mb = getMethodBind("BaseButton","is_shortcut_in_tooltip_enabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("BaseButton","set_shortcut_in_tooltip")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var toggleMode: Boolean
    get() {
      val mb = getMethodBind("BaseButton","is_toggle_mode")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("BaseButton","set_toggle_mode")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  internal constructor() : this(null)

  override fun _gui_input(arg0: InputEvent) {
  }

  open fun _pressed() {
  }

  open fun _toggled(buttonPressed: Boolean) {
  }

  override fun _unhandled_input(arg0: InputEvent) {
  }

  open fun getActionMode(): BaseButton.ActionMode {
    val mb = getMethodBind("BaseButton","get_action_mode")
    return BaseButton.ActionMode.from( _icall_Long( mb, this.ptr))
  }

  open fun getButtonGroup(): ButtonGroup {
    val mb = getMethodBind("BaseButton","get_button_group")
    return _icall_ButtonGroup( mb, this.ptr)
  }

  open fun getButtonMask(): Long {
    val mb = getMethodBind("BaseButton","get_button_mask")
    return _icall_Long( mb, this.ptr)
  }

  open fun getDrawMode(): BaseButton.DrawMode {
    val mb = getMethodBind("BaseButton","get_draw_mode")
    return BaseButton.DrawMode.from( _icall_Long( mb, this.ptr))
  }

  open fun getEnabledFocusMode(): Control.FocusMode {
    val mb = getMethodBind("BaseButton","get_enabled_focus_mode")
    return Control.FocusMode.from( _icall_Long( mb, this.ptr))
  }

  open fun getShortcut(): ShortCut {
    val mb = getMethodBind("BaseButton","get_shortcut")
    return _icall_ShortCut( mb, this.ptr)
  }

  open fun isDisabled(): Boolean {
    val mb = getMethodBind("BaseButton","is_disabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isHovered(): Boolean {
    val mb = getMethodBind("BaseButton","is_hovered")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isKeepPressedOutside(): Boolean {
    val mb = getMethodBind("BaseButton","is_keep_pressed_outside")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isPressed(): Boolean {
    val mb = getMethodBind("BaseButton","is_pressed")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isShortcutInTooltipEnabled(): Boolean {
    val mb = getMethodBind("BaseButton","is_shortcut_in_tooltip_enabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isToggleMode(): Boolean {
    val mb = getMethodBind("BaseButton","is_toggle_mode")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun setActionMode(mode: Long) {
    val mb = getMethodBind("BaseButton","set_action_mode")
    _icall_Unit_Long( mb, this.ptr, mode)
  }

  open fun setButtonGroup(buttonGroup: ButtonGroup) {
    val mb = getMethodBind("BaseButton","set_button_group")
    _icall_Unit_Object( mb, this.ptr, buttonGroup)
  }

  open fun setButtonMask(mask: Long) {
    val mb = getMethodBind("BaseButton","set_button_mask")
    _icall_Unit_Long( mb, this.ptr, mask)
  }

  open fun setDisabled(disabled: Boolean) {
    val mb = getMethodBind("BaseButton","set_disabled")
    _icall_Unit_Boolean( mb, this.ptr, disabled)
  }

  open fun setEnabledFocusMode(mode: Long) {
    val mb = getMethodBind("BaseButton","set_enabled_focus_mode")
    _icall_Unit_Long( mb, this.ptr, mode)
  }

  open fun setKeepPressedOutside(enabled: Boolean) {
    val mb = getMethodBind("BaseButton","set_keep_pressed_outside")
    _icall_Unit_Boolean( mb, this.ptr, enabled)
  }

  open fun setPressed(pressed: Boolean) {
    val mb = getMethodBind("BaseButton","set_pressed")
    _icall_Unit_Boolean( mb, this.ptr, pressed)
  }

  open fun setShortcut(shortcut: ShortCut) {
    val mb = getMethodBind("BaseButton","set_shortcut")
    _icall_Unit_Object( mb, this.ptr, shortcut)
  }

  open fun setShortcutInTooltip(enabled: Boolean) {
    val mb = getMethodBind("BaseButton","set_shortcut_in_tooltip")
    _icall_Unit_Boolean( mb, this.ptr, enabled)
  }

  open fun setToggleMode(enabled: Boolean) {
    val mb = getMethodBind("BaseButton","set_toggle_mode")
    _icall_Unit_Boolean( mb, this.ptr, enabled)
  }

  enum class ActionMode(
    id: Long
  ) {
    ACTION_MODE_BUTTON_PRESS(0),

    ACTION_MODE_BUTTON_RELEASE(1);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class DrawMode(
    id: Long
  ) {
    DRAW_NORMAL(0),

    DRAW_PRESSED(1),

    DRAW_HOVER(2),

    DRAW_DISABLED(3),

    DRAW_HOVER_PRESSED(4);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val ACTION_MODE_BUTTON_PRESS: Long = 0

    final const val ACTION_MODE_BUTTON_RELEASE: Long = 1

    final const val DRAW_DISABLED: Long = 3

    final const val DRAW_HOVER: Long = 2

    final const val DRAW_HOVER_PRESSED: Long = 4

    final const val DRAW_NORMAL: Long = 0

    final const val DRAW_PRESSED: Long = 1
  }
}
