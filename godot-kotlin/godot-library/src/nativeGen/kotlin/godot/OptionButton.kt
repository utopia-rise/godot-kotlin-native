package godot

import godot.core.Godot.shouldInitPtr
import godot.core.Signal1
import godot.core.Variant
import godot.core.VariantArray
import godot.core.signal
import godot.icalls._icall_Boolean_Long
import godot.icalls._icall_Long
import godot.icalls._icall_Long_Long
import godot.icalls._icall_PopupMenu
import godot.icalls._icall_String_Long
import godot.icalls._icall_Texture_Long
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Long_Boolean
import godot.icalls._icall_Unit_Long_Long
import godot.icalls._icall_Unit_Long_Object
import godot.icalls._icall_Unit_Long_String
import godot.icalls._icall_Unit_Long_Variant
import godot.icalls._icall_Unit_Object_String_Long
import godot.icalls._icall_Unit_String_Long
import godot.icalls._icall_Variant
import godot.icalls._icall_Variant_Long
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String

open class OptionButton internal constructor(
  _ignore: Any?
) : Button(_ignore) {
  val itemFocused: Signal1<Long> by signal("index")

  val itemSelected: Signal1<Long> by signal("index")

  open val selected: Long
    get() {
      val mb = getMethodBind("OptionButton","get_selected")
      return _icall_Long(mb, this.ptr)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("OptionButton", "OptionButton")
        }

  }

  open fun _focused(arg0: Long) {
  }

  open fun _get_items(): VariantArray {
    throw NotImplementedError("_get_items is not implemented for OptionButton")
  }

  open fun _select_int(arg0: Long) {
  }

  open fun _selected(arg0: Long) {
  }

  open fun _set_items(arg0: VariantArray) {
  }

  open fun addIconItem(
    texture: Texture,
    label: String,
    id: Long = -1
  ) {
    val mb = getMethodBind("OptionButton","add_icon_item")
    _icall_Unit_Object_String_Long( mb, this.ptr, texture, label, id)
  }

  open fun addItem(label: String, id: Long = -1) {
    val mb = getMethodBind("OptionButton","add_item")
    _icall_Unit_String_Long( mb, this.ptr, label, id)
  }

  open fun addSeparator() {
    val mb = getMethodBind("OptionButton","add_separator")
    _icall_Unit( mb, this.ptr)
  }

  open fun clear() {
    val mb = getMethodBind("OptionButton","clear")
    _icall_Unit( mb, this.ptr)
  }

  open fun getItemCount(): Long {
    val mb = getMethodBind("OptionButton","get_item_count")
    return _icall_Long( mb, this.ptr)
  }

  open fun getItemIcon(idx: Long): Texture {
    val mb = getMethodBind("OptionButton","get_item_icon")
    return _icall_Texture_Long( mb, this.ptr, idx)
  }

  open fun getItemId(idx: Long): Long {
    val mb = getMethodBind("OptionButton","get_item_id")
    return _icall_Long_Long( mb, this.ptr, idx)
  }

  open fun getItemIndex(id: Long): Long {
    val mb = getMethodBind("OptionButton","get_item_index")
    return _icall_Long_Long( mb, this.ptr, id)
  }

  open fun getItemMetadata(idx: Long): Variant {
    val mb = getMethodBind("OptionButton","get_item_metadata")
    return _icall_Variant_Long( mb, this.ptr, idx)
  }

  open fun getItemText(idx: Long): String {
    val mb = getMethodBind("OptionButton","get_item_text")
    return _icall_String_Long( mb, this.ptr, idx)
  }

  open fun getPopup(): PopupMenu {
    val mb = getMethodBind("OptionButton","get_popup")
    return _icall_PopupMenu( mb, this.ptr)
  }

  open fun getSelected(): Long {
    val mb = getMethodBind("OptionButton","get_selected")
    return _icall_Long( mb, this.ptr)
  }

  open fun getSelectedId(): Long {
    val mb = getMethodBind("OptionButton","get_selected_id")
    return _icall_Long( mb, this.ptr)
  }

  open fun getSelectedMetadata(): Variant {
    val mb = getMethodBind("OptionButton","get_selected_metadata")
    return _icall_Variant( mb, this.ptr)
  }

  open fun isItemDisabled(idx: Long): Boolean {
    val mb = getMethodBind("OptionButton","is_item_disabled")
    return _icall_Boolean_Long( mb, this.ptr, idx)
  }

  open fun removeItem(idx: Long) {
    val mb = getMethodBind("OptionButton","remove_item")
    _icall_Unit_Long( mb, this.ptr, idx)
  }

  open fun select(idx: Long) {
    val mb = getMethodBind("OptionButton","select")
    _icall_Unit_Long( mb, this.ptr, idx)
  }

  open fun setItemDisabled(idx: Long, disabled: Boolean) {
    val mb = getMethodBind("OptionButton","set_item_disabled")
    _icall_Unit_Long_Boolean( mb, this.ptr, idx, disabled)
  }

  open fun setItemIcon(idx: Long, texture: Texture) {
    val mb = getMethodBind("OptionButton","set_item_icon")
    _icall_Unit_Long_Object( mb, this.ptr, idx, texture)
  }

  open fun setItemId(idx: Long, id: Long) {
    val mb = getMethodBind("OptionButton","set_item_id")
    _icall_Unit_Long_Long( mb, this.ptr, idx, id)
  }

  open fun setItemMetadata(idx: Long, metadata: Variant) {
    val mb = getMethodBind("OptionButton","set_item_metadata")
    _icall_Unit_Long_Variant( mb, this.ptr, idx, metadata)
  }

  open fun setItemText(idx: Long, text: String) {
    val mb = getMethodBind("OptionButton","set_item_text")
    _icall_Unit_Long_String( mb, this.ptr, idx, text)
  }
}
