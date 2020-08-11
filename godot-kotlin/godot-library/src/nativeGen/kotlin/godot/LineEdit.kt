// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.LineEdit
import godot.core.Godot.shouldInitPtr
import godot.core.Signal0
import godot.core.Signal1
import godot.core.signal
import godot.icalls._icall_Boolean
import godot.icalls._icall_Double
import godot.icalls._icall_Long
import godot.icalls._icall_PopupMenu
import godot.icalls._icall_String
import godot.icalls._icall_Texture
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Long_Long
import godot.icalls._icall_Unit_Object
import godot.icalls._icall_Unit_String
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.String

open class LineEdit internal constructor(
  _ignore: Any?
) : Control(_ignore) {
  val textChangeRejected: Signal0 by signal()

  val textChanged: Signal1<String> by signal("new_text")

  val textEntered: Signal1<String> by signal("new_text")

  open var align: Long
    get() {
      val mb = getMethodBind("LineEdit","get_align")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("LineEdit","set_align")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var caretBlink: Boolean
    get() {
      val mb = getMethodBind("LineEdit","cursor_get_blink_enabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("LineEdit","cursor_set_blink_enabled")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var caretBlinkSpeed: Double
    get() {
      val mb = getMethodBind("LineEdit","cursor_get_blink_speed")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("LineEdit","cursor_set_blink_speed")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var caretPosition: Long
    get() {
      val mb = getMethodBind("LineEdit","get_cursor_position")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("LineEdit","set_cursor_position")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var clearButtonEnabled: Boolean
    get() {
      val mb = getMethodBind("LineEdit","is_clear_button_enabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("LineEdit","set_clear_button_enabled")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var contextMenuEnabled: Boolean
    get() {
      val mb = getMethodBind("LineEdit","is_context_menu_enabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("LineEdit","set_context_menu_enabled")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var editable: Boolean
    get() {
      val mb = getMethodBind("LineEdit","is_editable")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("LineEdit","set_editable")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var expandToTextLength: Boolean
    get() {
      val mb = getMethodBind("LineEdit","get_expand_to_text_length")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("LineEdit","set_expand_to_text_length")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var maxLength: Long
    get() {
      val mb = getMethodBind("LineEdit","get_max_length")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("LineEdit","set_max_length")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var placeholderAlpha: Double
    get() {
      val mb = getMethodBind("LineEdit","get_placeholder_alpha")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("LineEdit","set_placeholder_alpha")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var placeholderText: String
    get() {
      val mb = getMethodBind("LineEdit","get_placeholder")
      return _icall_String(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("LineEdit","set_placeholder")
      _icall_Unit_String(mb, this.ptr, value)
    }

  open var rightIcon: Texture
    get() {
      val mb = getMethodBind("LineEdit","get_right_icon")
      return _icall_Texture(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("LineEdit","set_right_icon")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  open var secret: Boolean
    get() {
      val mb = getMethodBind("LineEdit","is_secret")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("LineEdit","set_secret")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var secretCharacter: String
    get() {
      val mb = getMethodBind("LineEdit","get_secret_character")
      return _icall_String(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("LineEdit","set_secret_character")
      _icall_Unit_String(mb, this.ptr, value)
    }

  open var selectingEnabled: Boolean
    get() {
      val mb = getMethodBind("LineEdit","is_selecting_enabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("LineEdit","set_selecting_enabled")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var shortcutKeysEnabled: Boolean
    get() {
      val mb = getMethodBind("LineEdit","is_shortcut_keys_enabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("LineEdit","set_shortcut_keys_enabled")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var text: String
    get() {
      val mb = getMethodBind("LineEdit","get_text")
      return _icall_String(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("LineEdit","set_text")
      _icall_Unit_String(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("LineEdit", "LineEdit")
        }

  }

  open fun _editor_settings_changed() {
  }

  override fun _gui_input(arg0: InputEvent) {
  }

  open fun _text_changed() {
  }

  open fun _toggle_draw_caret() {
  }

  open fun appendAtCursor(text: String) {
    val mb = getMethodBind("LineEdit","append_at_cursor")
    _icall_Unit_String( mb, this.ptr, text)
  }

  open fun clear() {
    val mb = getMethodBind("LineEdit","clear")
    _icall_Unit( mb, this.ptr)
  }

  open fun cursorGetBlinkEnabled(): Boolean {
    val mb = getMethodBind("LineEdit","cursor_get_blink_enabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun cursorGetBlinkSpeed(): Double {
    val mb = getMethodBind("LineEdit","cursor_get_blink_speed")
    return _icall_Double( mb, this.ptr)
  }

  open fun cursorSetBlinkEnabled(enabled: Boolean) {
    val mb = getMethodBind("LineEdit","cursor_set_blink_enabled")
    _icall_Unit_Boolean( mb, this.ptr, enabled)
  }

  open fun cursorSetBlinkSpeed(blinkSpeed: Double) {
    val mb = getMethodBind("LineEdit","cursor_set_blink_speed")
    _icall_Unit_Double( mb, this.ptr, blinkSpeed)
  }

  open fun deselect() {
    val mb = getMethodBind("LineEdit","deselect")
    _icall_Unit( mb, this.ptr)
  }

  open fun getAlign(): LineEdit.Align {
    val mb = getMethodBind("LineEdit","get_align")
    return LineEdit.Align.from( _icall_Long( mb, this.ptr))
  }

  open fun getCursorPosition(): Long {
    val mb = getMethodBind("LineEdit","get_cursor_position")
    return _icall_Long( mb, this.ptr)
  }

  open fun getExpandToTextLength(): Boolean {
    val mb = getMethodBind("LineEdit","get_expand_to_text_length")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun getMaxLength(): Long {
    val mb = getMethodBind("LineEdit","get_max_length")
    return _icall_Long( mb, this.ptr)
  }

  open fun getMenu(): PopupMenu {
    val mb = getMethodBind("LineEdit","get_menu")
    return _icall_PopupMenu( mb, this.ptr)
  }

  open fun getPlaceholder(): String {
    val mb = getMethodBind("LineEdit","get_placeholder")
    return _icall_String( mb, this.ptr)
  }

  open fun getPlaceholderAlpha(): Double {
    val mb = getMethodBind("LineEdit","get_placeholder_alpha")
    return _icall_Double( mb, this.ptr)
  }

  open fun getRightIcon(): Texture {
    val mb = getMethodBind("LineEdit","get_right_icon")
    return _icall_Texture( mb, this.ptr)
  }

  open fun getSecretCharacter(): String {
    val mb = getMethodBind("LineEdit","get_secret_character")
    return _icall_String( mb, this.ptr)
  }

  open fun getText(): String {
    val mb = getMethodBind("LineEdit","get_text")
    return _icall_String( mb, this.ptr)
  }

  open fun isClearButtonEnabled(): Boolean {
    val mb = getMethodBind("LineEdit","is_clear_button_enabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isContextMenuEnabled(): Boolean {
    val mb = getMethodBind("LineEdit","is_context_menu_enabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isEditable(): Boolean {
    val mb = getMethodBind("LineEdit","is_editable")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isSecret(): Boolean {
    val mb = getMethodBind("LineEdit","is_secret")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isSelectingEnabled(): Boolean {
    val mb = getMethodBind("LineEdit","is_selecting_enabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isShortcutKeysEnabled(): Boolean {
    val mb = getMethodBind("LineEdit","is_shortcut_keys_enabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun menuOption(option: Long) {
    val mb = getMethodBind("LineEdit","menu_option")
    _icall_Unit_Long( mb, this.ptr, option)
  }

  open fun select(from: Long = 0, to: Long = -1) {
    val mb = getMethodBind("LineEdit","select")
    _icall_Unit_Long_Long( mb, this.ptr, from, to)
  }

  open fun selectAll() {
    val mb = getMethodBind("LineEdit","select_all")
    _icall_Unit( mb, this.ptr)
  }

  open fun setAlign(align: Long) {
    val mb = getMethodBind("LineEdit","set_align")
    _icall_Unit_Long( mb, this.ptr, align)
  }

  open fun setClearButtonEnabled(enable: Boolean) {
    val mb = getMethodBind("LineEdit","set_clear_button_enabled")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setContextMenuEnabled(enable: Boolean) {
    val mb = getMethodBind("LineEdit","set_context_menu_enabled")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setCursorPosition(position: Long) {
    val mb = getMethodBind("LineEdit","set_cursor_position")
    _icall_Unit_Long( mb, this.ptr, position)
  }

  open fun setEditable(enabled: Boolean) {
    val mb = getMethodBind("LineEdit","set_editable")
    _icall_Unit_Boolean( mb, this.ptr, enabled)
  }

  open fun setExpandToTextLength(enabled: Boolean) {
    val mb = getMethodBind("LineEdit","set_expand_to_text_length")
    _icall_Unit_Boolean( mb, this.ptr, enabled)
  }

  open fun setMaxLength(chars: Long) {
    val mb = getMethodBind("LineEdit","set_max_length")
    _icall_Unit_Long( mb, this.ptr, chars)
  }

  open fun setPlaceholder(text: String) {
    val mb = getMethodBind("LineEdit","set_placeholder")
    _icall_Unit_String( mb, this.ptr, text)
  }

  open fun setPlaceholderAlpha(alpha: Double) {
    val mb = getMethodBind("LineEdit","set_placeholder_alpha")
    _icall_Unit_Double( mb, this.ptr, alpha)
  }

  open fun setRightIcon(icon: Texture) {
    val mb = getMethodBind("LineEdit","set_right_icon")
    _icall_Unit_Object( mb, this.ptr, icon)
  }

  open fun setSecret(enabled: Boolean) {
    val mb = getMethodBind("LineEdit","set_secret")
    _icall_Unit_Boolean( mb, this.ptr, enabled)
  }

  open fun setSecretCharacter(character: String) {
    val mb = getMethodBind("LineEdit","set_secret_character")
    _icall_Unit_String( mb, this.ptr, character)
  }

  open fun setSelectingEnabled(enable: Boolean) {
    val mb = getMethodBind("LineEdit","set_selecting_enabled")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setShortcutKeysEnabled(enable: Boolean) {
    val mb = getMethodBind("LineEdit","set_shortcut_keys_enabled")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setText(text: String) {
    val mb = getMethodBind("LineEdit","set_text")
    _icall_Unit_String( mb, this.ptr, text)
  }

  enum class Align(
    id: Long
  ) {
    ALIGN_LEFT(0),

    ALIGN_CENTER(1),

    ALIGN_RIGHT(2),

    ALIGN_FILL(3);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class MenuItems(
    id: Long
  ) {
    MENU_CUT(0),

    MENU_COPY(1),

    MENU_PASTE(2),

    MENU_CLEAR(3),

    MENU_SELECT_ALL(4),

    MENU_UNDO(5),

    MENU_REDO(6),

    MENU_MAX(7);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val ALIGN_CENTER: Long = 1

    final const val ALIGN_FILL: Long = 3

    final const val ALIGN_LEFT: Long = 0

    final const val ALIGN_RIGHT: Long = 2

    final const val MENU_CLEAR: Long = 3

    final const val MENU_COPY: Long = 1

    final const val MENU_CUT: Long = 0

    final const val MENU_MAX: Long = 7

    final const val MENU_PASTE: Long = 2

    final const val MENU_REDO: Long = 6

    final const val MENU_SELECT_ALL: Long = 4

    final const val MENU_UNDO: Long = 5
  }
}
