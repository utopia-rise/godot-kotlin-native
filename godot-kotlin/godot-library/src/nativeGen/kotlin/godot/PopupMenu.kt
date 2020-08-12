// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot.shouldInitPtr
import godot.core.Signal1
import godot.core.Variant
import godot.core.VariantArray
import godot.core.signal
import godot.icalls._icall_Boolean
import godot.icalls._icall_Boolean_Long
import godot.icalls._icall_Double
import godot.icalls._icall_Long
import godot.icalls._icall_Long_Long
import godot.icalls._icall_ShortCut_Long
import godot.icalls._icall_String_Long
import godot.icalls._icall_Texture_Long
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Long_Boolean
import godot.icalls._icall_Unit_Long_Long
import godot.icalls._icall_Unit_Long_Object
import godot.icalls._icall_Unit_Long_Object_Boolean
import godot.icalls._icall_Unit_Long_String
import godot.icalls._icall_Unit_Long_Variant
import godot.icalls._icall_Unit_Object_Long_Boolean
import godot.icalls._icall_Unit_Object_Object_Long_Boolean
import godot.icalls._icall_Unit_Object_String_Long_Long
import godot.icalls._icall_Unit_String
import godot.icalls._icall_Unit_String_Long_Long
import godot.icalls._icall_Unit_String_Long_Long_Long_Long
import godot.icalls._icall_Unit_String_String_Long
import godot.icalls._icall_Variant_Long
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String

open class PopupMenu internal constructor(
  _ignore: Any?
) : Popup(_ignore) {
  val idFocused: Signal1<Long> by signal("id")

  val idPressed: Signal1<Long> by signal("id")

  val indexPressed: Signal1<Long> by signal("index")

  open var allowSearch: Boolean
    get() {
      val mb = getMethodBind("PopupMenu","get_allow_search")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("PopupMenu","set_allow_search")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var hideOnCheckableItemSelection: Boolean
    get() {
      val mb = getMethodBind("PopupMenu","is_hide_on_checkable_item_selection")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("PopupMenu","set_hide_on_checkable_item_selection")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var hideOnItemSelection: Boolean
    get() {
      val mb = getMethodBind("PopupMenu","is_hide_on_item_selection")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("PopupMenu","set_hide_on_item_selection")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var hideOnStateItemSelection: Boolean
    get() {
      val mb = getMethodBind("PopupMenu","is_hide_on_state_item_selection")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("PopupMenu","set_hide_on_state_item_selection")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var submenuPopupDelay: Double
    get() {
      val mb = getMethodBind("PopupMenu","get_submenu_popup_delay")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("PopupMenu","set_submenu_popup_delay")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("PopupMenu", "PopupMenu")
        }

  }

  open fun _getItems(): VariantArray {
    throw NotImplementedError("_get_items is not implemented for PopupMenu")
  }

  override fun _guiInput(arg0: InputEvent) {
  }

  open fun _setItems(arg0: VariantArray) {
  }

  open fun _submenuTimeout() {
  }

  open fun addCheckItem(
    label: String,
    id: Long = -1,
    accel: Long = 0
  ) {
    val mb = getMethodBind("PopupMenu","add_check_item")
    _icall_Unit_String_Long_Long( mb, this.ptr, label, id, accel)
  }

  open fun addCheckShortcut(
    shortcut: ShortCut,
    id: Long = -1,
    global: Boolean = false
  ) {
    val mb = getMethodBind("PopupMenu","add_check_shortcut")
    _icall_Unit_Object_Long_Boolean( mb, this.ptr, shortcut, id, global)
  }

  open fun addIconCheckItem(
    texture: Texture,
    label: String,
    id: Long = -1,
    accel: Long = 0
  ) {
    val mb = getMethodBind("PopupMenu","add_icon_check_item")
    _icall_Unit_Object_String_Long_Long( mb, this.ptr, texture, label, id, accel)
  }

  open fun addIconCheckShortcut(
    texture: Texture,
    shortcut: ShortCut,
    id: Long = -1,
    global: Boolean = false
  ) {
    val mb = getMethodBind("PopupMenu","add_icon_check_shortcut")
    _icall_Unit_Object_Object_Long_Boolean( mb, this.ptr, texture, shortcut, id, global)
  }

  open fun addIconItem(
    texture: Texture,
    label: String,
    id: Long = -1,
    accel: Long = 0
  ) {
    val mb = getMethodBind("PopupMenu","add_icon_item")
    _icall_Unit_Object_String_Long_Long( mb, this.ptr, texture, label, id, accel)
  }

  open fun addIconRadioCheckItem(
    texture: Texture,
    label: String,
    id: Long = -1,
    accel: Long = 0
  ) {
    val mb = getMethodBind("PopupMenu","add_icon_radio_check_item")
    _icall_Unit_Object_String_Long_Long( mb, this.ptr, texture, label, id, accel)
  }

  open fun addIconRadioCheckShortcut(
    texture: Texture,
    shortcut: ShortCut,
    id: Long = -1,
    global: Boolean = false
  ) {
    val mb = getMethodBind("PopupMenu","add_icon_radio_check_shortcut")
    _icall_Unit_Object_Object_Long_Boolean( mb, this.ptr, texture, shortcut, id, global)
  }

  open fun addIconShortcut(
    texture: Texture,
    shortcut: ShortCut,
    id: Long = -1,
    global: Boolean = false
  ) {
    val mb = getMethodBind("PopupMenu","add_icon_shortcut")
    _icall_Unit_Object_Object_Long_Boolean( mb, this.ptr, texture, shortcut, id, global)
  }

  open fun addItem(
    label: String,
    id: Long = -1,
    accel: Long = 0
  ) {
    val mb = getMethodBind("PopupMenu","add_item")
    _icall_Unit_String_Long_Long( mb, this.ptr, label, id, accel)
  }

  open fun addMultistateItem(
    label: String,
    maxStates: Long,
    defaultState: Long = 0,
    id: Long = -1,
    accel: Long = 0
  ) {
    val mb = getMethodBind("PopupMenu","add_multistate_item")
    _icall_Unit_String_Long_Long_Long_Long( mb, this.ptr, label, maxStates, defaultState, id, accel)
  }

  open fun addRadioCheckItem(
    label: String,
    id: Long = -1,
    accel: Long = 0
  ) {
    val mb = getMethodBind("PopupMenu","add_radio_check_item")
    _icall_Unit_String_Long_Long( mb, this.ptr, label, id, accel)
  }

  open fun addRadioCheckShortcut(
    shortcut: ShortCut,
    id: Long = -1,
    global: Boolean = false
  ) {
    val mb = getMethodBind("PopupMenu","add_radio_check_shortcut")
    _icall_Unit_Object_Long_Boolean( mb, this.ptr, shortcut, id, global)
  }

  open fun addSeparator(label: String = "") {
    val mb = getMethodBind("PopupMenu","add_separator")
    _icall_Unit_String( mb, this.ptr, label)
  }

  open fun addShortcut(
    shortcut: ShortCut,
    id: Long = -1,
    global: Boolean = false
  ) {
    val mb = getMethodBind("PopupMenu","add_shortcut")
    _icall_Unit_Object_Long_Boolean( mb, this.ptr, shortcut, id, global)
  }

  open fun addSubmenuItem(
    label: String,
    submenu: String,
    id: Long = -1
  ) {
    val mb = getMethodBind("PopupMenu","add_submenu_item")
    _icall_Unit_String_String_Long( mb, this.ptr, label, submenu, id)
  }

  open fun clear() {
    val mb = getMethodBind("PopupMenu","clear")
    _icall_Unit( mb, this.ptr)
  }

  open fun getAllowSearch(): Boolean {
    val mb = getMethodBind("PopupMenu","get_allow_search")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun getCurrentIndex(): Long {
    val mb = getMethodBind("PopupMenu","get_current_index")
    return _icall_Long( mb, this.ptr)
  }

  open fun getItemAccelerator(idx: Long): Long {
    val mb = getMethodBind("PopupMenu","get_item_accelerator")
    return _icall_Long_Long( mb, this.ptr, idx)
  }

  open fun getItemCount(): Long {
    val mb = getMethodBind("PopupMenu","get_item_count")
    return _icall_Long( mb, this.ptr)
  }

  open fun getItemIcon(idx: Long): Texture {
    val mb = getMethodBind("PopupMenu","get_item_icon")
    return _icall_Texture_Long( mb, this.ptr, idx)
  }

  open fun getItemId(idx: Long): Long {
    val mb = getMethodBind("PopupMenu","get_item_id")
    return _icall_Long_Long( mb, this.ptr, idx)
  }

  open fun getItemIndex(id: Long): Long {
    val mb = getMethodBind("PopupMenu","get_item_index")
    return _icall_Long_Long( mb, this.ptr, id)
  }

  open fun getItemMetadata(idx: Long): Variant {
    val mb = getMethodBind("PopupMenu","get_item_metadata")
    return _icall_Variant_Long( mb, this.ptr, idx)
  }

  open fun getItemShortcut(idx: Long): ShortCut {
    val mb = getMethodBind("PopupMenu","get_item_shortcut")
    return _icall_ShortCut_Long( mb, this.ptr, idx)
  }

  open fun getItemSubmenu(idx: Long): String {
    val mb = getMethodBind("PopupMenu","get_item_submenu")
    return _icall_String_Long( mb, this.ptr, idx)
  }

  open fun getItemText(idx: Long): String {
    val mb = getMethodBind("PopupMenu","get_item_text")
    return _icall_String_Long( mb, this.ptr, idx)
  }

  open fun getItemTooltip(idx: Long): String {
    val mb = getMethodBind("PopupMenu","get_item_tooltip")
    return _icall_String_Long( mb, this.ptr, idx)
  }

  open fun getSubmenuPopupDelay(): Double {
    val mb = getMethodBind("PopupMenu","get_submenu_popup_delay")
    return _icall_Double( mb, this.ptr)
  }

  open fun isHideOnCheckableItemSelection(): Boolean {
    val mb = getMethodBind("PopupMenu","is_hide_on_checkable_item_selection")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isHideOnItemSelection(): Boolean {
    val mb = getMethodBind("PopupMenu","is_hide_on_item_selection")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isHideOnStateItemSelection(): Boolean {
    val mb = getMethodBind("PopupMenu","is_hide_on_state_item_selection")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isHideOnWindowLoseFocus(): Boolean {
    val mb = getMethodBind("PopupMenu","is_hide_on_window_lose_focus")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isItemCheckable(idx: Long): Boolean {
    val mb = getMethodBind("PopupMenu","is_item_checkable")
    return _icall_Boolean_Long( mb, this.ptr, idx)
  }

  open fun isItemChecked(idx: Long): Boolean {
    val mb = getMethodBind("PopupMenu","is_item_checked")
    return _icall_Boolean_Long( mb, this.ptr, idx)
  }

  open fun isItemDisabled(idx: Long): Boolean {
    val mb = getMethodBind("PopupMenu","is_item_disabled")
    return _icall_Boolean_Long( mb, this.ptr, idx)
  }

  open fun isItemRadioCheckable(idx: Long): Boolean {
    val mb = getMethodBind("PopupMenu","is_item_radio_checkable")
    return _icall_Boolean_Long( mb, this.ptr, idx)
  }

  open fun isItemSeparator(idx: Long): Boolean {
    val mb = getMethodBind("PopupMenu","is_item_separator")
    return _icall_Boolean_Long( mb, this.ptr, idx)
  }

  open fun isItemShortcutDisabled(idx: Long): Boolean {
    val mb = getMethodBind("PopupMenu","is_item_shortcut_disabled")
    return _icall_Boolean_Long( mb, this.ptr, idx)
  }

  open fun removeItem(idx: Long) {
    val mb = getMethodBind("PopupMenu","remove_item")
    _icall_Unit_Long( mb, this.ptr, idx)
  }

  open fun setAllowSearch(allow: Boolean) {
    val mb = getMethodBind("PopupMenu","set_allow_search")
    _icall_Unit_Boolean( mb, this.ptr, allow)
  }

  open fun setHideOnCheckableItemSelection(enable: Boolean) {
    val mb = getMethodBind("PopupMenu","set_hide_on_checkable_item_selection")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setHideOnItemSelection(enable: Boolean) {
    val mb = getMethodBind("PopupMenu","set_hide_on_item_selection")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setHideOnStateItemSelection(enable: Boolean) {
    val mb = getMethodBind("PopupMenu","set_hide_on_state_item_selection")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setHideOnWindowLoseFocus(enable: Boolean) {
    val mb = getMethodBind("PopupMenu","set_hide_on_window_lose_focus")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setItemAccelerator(idx: Long, accel: Long) {
    val mb = getMethodBind("PopupMenu","set_item_accelerator")
    _icall_Unit_Long_Long( mb, this.ptr, idx, accel)
  }

  open fun setItemAsCheckable(idx: Long, enable: Boolean) {
    val mb = getMethodBind("PopupMenu","set_item_as_checkable")
    _icall_Unit_Long_Boolean( mb, this.ptr, idx, enable)
  }

  open fun setItemAsRadioCheckable(idx: Long, enable: Boolean) {
    val mb = getMethodBind("PopupMenu","set_item_as_radio_checkable")
    _icall_Unit_Long_Boolean( mb, this.ptr, idx, enable)
  }

  open fun setItemAsSeparator(idx: Long, enable: Boolean) {
    val mb = getMethodBind("PopupMenu","set_item_as_separator")
    _icall_Unit_Long_Boolean( mb, this.ptr, idx, enable)
  }

  open fun setItemChecked(idx: Long, checked: Boolean) {
    val mb = getMethodBind("PopupMenu","set_item_checked")
    _icall_Unit_Long_Boolean( mb, this.ptr, idx, checked)
  }

  open fun setItemDisabled(idx: Long, disabled: Boolean) {
    val mb = getMethodBind("PopupMenu","set_item_disabled")
    _icall_Unit_Long_Boolean( mb, this.ptr, idx, disabled)
  }

  open fun setItemIcon(idx: Long, icon: Texture) {
    val mb = getMethodBind("PopupMenu","set_item_icon")
    _icall_Unit_Long_Object( mb, this.ptr, idx, icon)
  }

  open fun setItemId(idx: Long, id: Long) {
    val mb = getMethodBind("PopupMenu","set_item_id")
    _icall_Unit_Long_Long( mb, this.ptr, idx, id)
  }

  open fun setItemMetadata(idx: Long, metadata: Variant) {
    val mb = getMethodBind("PopupMenu","set_item_metadata")
    _icall_Unit_Long_Variant( mb, this.ptr, idx, metadata)
  }

  open fun setItemMultistate(idx: Long, state: Long) {
    val mb = getMethodBind("PopupMenu","set_item_multistate")
    _icall_Unit_Long_Long( mb, this.ptr, idx, state)
  }

  open fun setItemShortcut(
    idx: Long,
    shortcut: ShortCut,
    global: Boolean = false
  ) {
    val mb = getMethodBind("PopupMenu","set_item_shortcut")
    _icall_Unit_Long_Object_Boolean( mb, this.ptr, idx, shortcut, global)
  }

  open fun setItemShortcutDisabled(idx: Long, disabled: Boolean) {
    val mb = getMethodBind("PopupMenu","set_item_shortcut_disabled")
    _icall_Unit_Long_Boolean( mb, this.ptr, idx, disabled)
  }

  open fun setItemSubmenu(idx: Long, submenu: String) {
    val mb = getMethodBind("PopupMenu","set_item_submenu")
    _icall_Unit_Long_String( mb, this.ptr, idx, submenu)
  }

  open fun setItemText(idx: Long, text: String) {
    val mb = getMethodBind("PopupMenu","set_item_text")
    _icall_Unit_Long_String( mb, this.ptr, idx, text)
  }

  open fun setItemTooltip(idx: Long, tooltip: String) {
    val mb = getMethodBind("PopupMenu","set_item_tooltip")
    _icall_Unit_Long_String( mb, this.ptr, idx, tooltip)
  }

  open fun setSubmenuPopupDelay(seconds: Double) {
    val mb = getMethodBind("PopupMenu","set_submenu_popup_delay")
    _icall_Unit_Double( mb, this.ptr, seconds)
  }

  open fun toggleItemChecked(idx: Long) {
    val mb = getMethodBind("PopupMenu","toggle_item_checked")
    _icall_Unit_Long( mb, this.ptr, idx)
  }

  open fun toggleItemMultistate(idx: Long) {
    val mb = getMethodBind("PopupMenu","toggle_item_multistate")
    _icall_Unit_Long( mb, this.ptr, idx)
  }
}
