// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.ItemList
import godot.core.Color
import godot.core.Godot.shouldInitPtr
import godot.core.PoolIntArray
import godot.core.Rect2
import godot.core.Signal0
import godot.core.Signal1
import godot.core.Signal2
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import godot.core.signal
import godot.icalls._icall_Boolean
import godot.icalls._icall_Boolean_Long
import godot.icalls._icall_Color_Long
import godot.icalls._icall_Double
import godot.icalls._icall_Long
import godot.icalls._icall_Long_Vector2_Boolean
import godot.icalls._icall_PoolIntArray
import godot.icalls._icall_Rect2_Long
import godot.icalls._icall_String_Long
import godot.icalls._icall_Texture_Long
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Long_Boolean
import godot.icalls._icall_Unit_Long_Color
import godot.icalls._icall_Unit_Long_Long
import godot.icalls._icall_Unit_Long_Object
import godot.icalls._icall_Unit_Long_Rect2
import godot.icalls._icall_Unit_Long_String
import godot.icalls._icall_Unit_Long_Variant
import godot.icalls._icall_Unit_Object_Boolean
import godot.icalls._icall_Unit_String_nObject_Boolean
import godot.icalls._icall_Unit_Vector2
import godot.icalls._icall_VScrollBar
import godot.icalls._icall_Variant_Long
import godot.icalls._icall_Vector2
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Unit

open class ItemList internal constructor(
  _ignore: Any?
) : Control(_ignore) {
  val itemActivated: Signal1<Long> by signal("index")

  val itemRmbSelected: Signal2<Long, Vector2> by signal("index", "at_position")

  val itemSelected: Signal1<Long> by signal("index")

  val multiSelected: Signal2<Long, Boolean> by signal("index", "selected")

  val nothingSelected: Signal0 by signal()

  val rmbClicked: Signal1<Vector2> by signal("at_position")

  open var allowReselect: Boolean
    get() {
      val mb = getMethodBind("ItemList","get_allow_reselect")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ItemList","set_allow_reselect")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var allowRmbSelect: Boolean
    get() {
      val mb = getMethodBind("ItemList","get_allow_rmb_select")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ItemList","set_allow_rmb_select")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var autoHeight: Boolean
    get() {
      val mb = getMethodBind("ItemList","has_auto_height")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ItemList","set_auto_height")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var fixedColumnWidth: Long
    get() {
      val mb = getMethodBind("ItemList","get_fixed_column_width")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ItemList","set_fixed_column_width")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var fixedIconSize: Vector2
    get() {
      val mb = getMethodBind("ItemList","get_fixed_icon_size")
      return _icall_Vector2(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ItemList","set_fixed_icon_size")
      _icall_Unit_Vector2(mb, this.ptr, value)
    }

  open var iconMode: Long
    get() {
      val mb = getMethodBind("ItemList","get_icon_mode")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ItemList","set_icon_mode")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var iconScale: Double
    get() {
      val mb = getMethodBind("ItemList","get_icon_scale")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ItemList","set_icon_scale")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var maxColumns: Long
    get() {
      val mb = getMethodBind("ItemList","get_max_columns")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ItemList","set_max_columns")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var maxTextLines: Long
    get() {
      val mb = getMethodBind("ItemList","get_max_text_lines")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ItemList","set_max_text_lines")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var sameColumnWidth: Boolean
    get() {
      val mb = getMethodBind("ItemList","is_same_column_width")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ItemList","set_same_column_width")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var selectMode: Long
    get() {
      val mb = getMethodBind("ItemList","get_select_mode")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ItemList","set_select_mode")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = invokeConstructor("ItemList", "ItemList")
        }

  }

  open fun fixedIconSize(schedule: Vector2.() -> Unit): Vector2 = fixedIconSize.apply{
      schedule(this)
      fixedIconSize = this
  }


  open fun _getItems(): VariantArray {
    throw NotImplementedError("_get_items is not implemented for ItemList")
  }

  override fun _guiInput(arg0: InputEvent) {
  }

  open fun _scrollChanged(arg0: Double) {
  }

  open fun _setItems(arg0: VariantArray) {
  }

  open fun addIconItem(icon: Texture, selectable: Boolean = true) {
    val mb = getMethodBind("ItemList","add_icon_item")
    _icall_Unit_Object_Boolean( mb, this.ptr, icon, selectable)
  }

  open fun addItem(
    text: String,
    icon: Texture? = null,
    selectable: Boolean = true
  ) {
    val mb = getMethodBind("ItemList","add_item")
    _icall_Unit_String_nObject_Boolean( mb, this.ptr, text, icon, selectable)
  }

  open fun clear() {
    val mb = getMethodBind("ItemList","clear")
    _icall_Unit( mb, this.ptr)
  }

  open fun ensureCurrentIsVisible() {
    val mb = getMethodBind("ItemList","ensure_current_is_visible")
    _icall_Unit( mb, this.ptr)
  }

  open fun getAllowReselect(): Boolean {
    val mb = getMethodBind("ItemList","get_allow_reselect")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun getAllowRmbSelect(): Boolean {
    val mb = getMethodBind("ItemList","get_allow_rmb_select")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun getFixedColumnWidth(): Long {
    val mb = getMethodBind("ItemList","get_fixed_column_width")
    return _icall_Long( mb, this.ptr)
  }

  open fun getFixedIconSize(): Vector2 {
    val mb = getMethodBind("ItemList","get_fixed_icon_size")
    return _icall_Vector2( mb, this.ptr)
  }

  open fun getIconMode(): ItemList.IconMode {
    val mb = getMethodBind("ItemList","get_icon_mode")
    return ItemList.IconMode.from( _icall_Long( mb, this.ptr))
  }

  open fun getIconScale(): Double {
    val mb = getMethodBind("ItemList","get_icon_scale")
    return _icall_Double( mb, this.ptr)
  }

  open fun getItemAtPosition(position: Vector2, exact: Boolean = false): Long {
    val mb = getMethodBind("ItemList","get_item_at_position")
    return _icall_Long_Vector2_Boolean( mb, this.ptr, position, exact)
  }

  open fun getItemCount(): Long {
    val mb = getMethodBind("ItemList","get_item_count")
    return _icall_Long( mb, this.ptr)
  }

  open fun getItemCustomBgColor(idx: Long): Color {
    val mb = getMethodBind("ItemList","get_item_custom_bg_color")
    return _icall_Color_Long( mb, this.ptr, idx)
  }

  open fun getItemCustomFgColor(idx: Long): Color {
    val mb = getMethodBind("ItemList","get_item_custom_fg_color")
    return _icall_Color_Long( mb, this.ptr, idx)
  }

  open fun getItemIcon(idx: Long): Texture {
    val mb = getMethodBind("ItemList","get_item_icon")
    return _icall_Texture_Long( mb, this.ptr, idx)
  }

  open fun getItemIconModulate(idx: Long): Color {
    val mb = getMethodBind("ItemList","get_item_icon_modulate")
    return _icall_Color_Long( mb, this.ptr, idx)
  }

  open fun getItemIconRegion(idx: Long): Rect2 {
    val mb = getMethodBind("ItemList","get_item_icon_region")
    return _icall_Rect2_Long( mb, this.ptr, idx)
  }

  open fun getItemMetadata(idx: Long): Variant {
    val mb = getMethodBind("ItemList","get_item_metadata")
    return _icall_Variant_Long( mb, this.ptr, idx)
  }

  open fun getItemText(idx: Long): String {
    val mb = getMethodBind("ItemList","get_item_text")
    return _icall_String_Long( mb, this.ptr, idx)
  }

  open fun getItemTooltip(idx: Long): String {
    val mb = getMethodBind("ItemList","get_item_tooltip")
    return _icall_String_Long( mb, this.ptr, idx)
  }

  open fun getMaxColumns(): Long {
    val mb = getMethodBind("ItemList","get_max_columns")
    return _icall_Long( mb, this.ptr)
  }

  open fun getMaxTextLines(): Long {
    val mb = getMethodBind("ItemList","get_max_text_lines")
    return _icall_Long( mb, this.ptr)
  }

  open fun getSelectMode(): ItemList.SelectMode {
    val mb = getMethodBind("ItemList","get_select_mode")
    return ItemList.SelectMode.from( _icall_Long( mb, this.ptr))
  }

  open fun getSelectedItems(): PoolIntArray {
    val mb = getMethodBind("ItemList","get_selected_items")
    return _icall_PoolIntArray( mb, this.ptr)
  }

  open fun getVScroll(): VScrollBar {
    val mb = getMethodBind("ItemList","get_v_scroll")
    return _icall_VScrollBar( mb, this.ptr)
  }

  open fun hasAutoHeight(): Boolean {
    val mb = getMethodBind("ItemList","has_auto_height")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isAnythingSelected(): Boolean {
    val mb = getMethodBind("ItemList","is_anything_selected")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isItemDisabled(idx: Long): Boolean {
    val mb = getMethodBind("ItemList","is_item_disabled")
    return _icall_Boolean_Long( mb, this.ptr, idx)
  }

  open fun isItemIconTransposed(idx: Long): Boolean {
    val mb = getMethodBind("ItemList","is_item_icon_transposed")
    return _icall_Boolean_Long( mb, this.ptr, idx)
  }

  open fun isItemSelectable(idx: Long): Boolean {
    val mb = getMethodBind("ItemList","is_item_selectable")
    return _icall_Boolean_Long( mb, this.ptr, idx)
  }

  open fun isItemTooltipEnabled(idx: Long): Boolean {
    val mb = getMethodBind("ItemList","is_item_tooltip_enabled")
    return _icall_Boolean_Long( mb, this.ptr, idx)
  }

  open fun isSameColumnWidth(): Boolean {
    val mb = getMethodBind("ItemList","is_same_column_width")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isSelected(idx: Long): Boolean {
    val mb = getMethodBind("ItemList","is_selected")
    return _icall_Boolean_Long( mb, this.ptr, idx)
  }

  open fun moveItem(fromIdx: Long, toIdx: Long) {
    val mb = getMethodBind("ItemList","move_item")
    _icall_Unit_Long_Long( mb, this.ptr, fromIdx, toIdx)
  }

  open fun removeItem(idx: Long) {
    val mb = getMethodBind("ItemList","remove_item")
    _icall_Unit_Long( mb, this.ptr, idx)
  }

  open fun select(idx: Long, single: Boolean = true) {
    val mb = getMethodBind("ItemList","select")
    _icall_Unit_Long_Boolean( mb, this.ptr, idx, single)
  }

  open fun setAllowReselect(allow: Boolean) {
    val mb = getMethodBind("ItemList","set_allow_reselect")
    _icall_Unit_Boolean( mb, this.ptr, allow)
  }

  open fun setAllowRmbSelect(allow: Boolean) {
    val mb = getMethodBind("ItemList","set_allow_rmb_select")
    _icall_Unit_Boolean( mb, this.ptr, allow)
  }

  open fun setAutoHeight(enable: Boolean) {
    val mb = getMethodBind("ItemList","set_auto_height")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setFixedColumnWidth(width: Long) {
    val mb = getMethodBind("ItemList","set_fixed_column_width")
    _icall_Unit_Long( mb, this.ptr, width)
  }

  open fun setFixedIconSize(size: Vector2) {
    val mb = getMethodBind("ItemList","set_fixed_icon_size")
    _icall_Unit_Vector2( mb, this.ptr, size)
  }

  open fun setIconMode(mode: Long) {
    val mb = getMethodBind("ItemList","set_icon_mode")
    _icall_Unit_Long( mb, this.ptr, mode)
  }

  open fun setIconScale(scale: Double) {
    val mb = getMethodBind("ItemList","set_icon_scale")
    _icall_Unit_Double( mb, this.ptr, scale)
  }

  open fun setItemCustomBgColor(idx: Long, customBgColor: Color) {
    val mb = getMethodBind("ItemList","set_item_custom_bg_color")
    _icall_Unit_Long_Color( mb, this.ptr, idx, customBgColor)
  }

  open fun setItemCustomFgColor(idx: Long, customFgColor: Color) {
    val mb = getMethodBind("ItemList","set_item_custom_fg_color")
    _icall_Unit_Long_Color( mb, this.ptr, idx, customFgColor)
  }

  open fun setItemDisabled(idx: Long, disabled: Boolean) {
    val mb = getMethodBind("ItemList","set_item_disabled")
    _icall_Unit_Long_Boolean( mb, this.ptr, idx, disabled)
  }

  open fun setItemIcon(idx: Long, icon: Texture) {
    val mb = getMethodBind("ItemList","set_item_icon")
    _icall_Unit_Long_Object( mb, this.ptr, idx, icon)
  }

  open fun setItemIconModulate(idx: Long, modulate: Color) {
    val mb = getMethodBind("ItemList","set_item_icon_modulate")
    _icall_Unit_Long_Color( mb, this.ptr, idx, modulate)
  }

  open fun setItemIconRegion(idx: Long, rect: Rect2) {
    val mb = getMethodBind("ItemList","set_item_icon_region")
    _icall_Unit_Long_Rect2( mb, this.ptr, idx, rect)
  }

  open fun setItemIconTransposed(idx: Long, transposed: Boolean) {
    val mb = getMethodBind("ItemList","set_item_icon_transposed")
    _icall_Unit_Long_Boolean( mb, this.ptr, idx, transposed)
  }

  open fun setItemMetadata(idx: Long, metadata: Variant) {
    val mb = getMethodBind("ItemList","set_item_metadata")
    _icall_Unit_Long_Variant( mb, this.ptr, idx, metadata)
  }

  open fun setItemSelectable(idx: Long, selectable: Boolean) {
    val mb = getMethodBind("ItemList","set_item_selectable")
    _icall_Unit_Long_Boolean( mb, this.ptr, idx, selectable)
  }

  open fun setItemText(idx: Long, text: String) {
    val mb = getMethodBind("ItemList","set_item_text")
    _icall_Unit_Long_String( mb, this.ptr, idx, text)
  }

  open fun setItemTooltip(idx: Long, tooltip: String) {
    val mb = getMethodBind("ItemList","set_item_tooltip")
    _icall_Unit_Long_String( mb, this.ptr, idx, tooltip)
  }

  open fun setItemTooltipEnabled(idx: Long, enable: Boolean) {
    val mb = getMethodBind("ItemList","set_item_tooltip_enabled")
    _icall_Unit_Long_Boolean( mb, this.ptr, idx, enable)
  }

  open fun setMaxColumns(amount: Long) {
    val mb = getMethodBind("ItemList","set_max_columns")
    _icall_Unit_Long( mb, this.ptr, amount)
  }

  open fun setMaxTextLines(lines: Long) {
    val mb = getMethodBind("ItemList","set_max_text_lines")
    _icall_Unit_Long( mb, this.ptr, lines)
  }

  open fun setSameColumnWidth(enable: Boolean) {
    val mb = getMethodBind("ItemList","set_same_column_width")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setSelectMode(mode: Long) {
    val mb = getMethodBind("ItemList","set_select_mode")
    _icall_Unit_Long( mb, this.ptr, mode)
  }

  open fun sortItemsByText() {
    val mb = getMethodBind("ItemList","sort_items_by_text")
    _icall_Unit( mb, this.ptr)
  }

  open fun unselect(idx: Long) {
    val mb = getMethodBind("ItemList","unselect")
    _icall_Unit_Long( mb, this.ptr, idx)
  }

  open fun unselectAll() {
    val mb = getMethodBind("ItemList","unselect_all")
    _icall_Unit( mb, this.ptr)
  }

  enum class SelectMode(
    id: Long
  ) {
    SELECT_SINGLE(0),

    SELECT_MULTI(1);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class IconMode(
    id: Long
  ) {
    ICON_MODE_TOP(0),

    ICON_MODE_LEFT(1);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object
}
