package godot

import godot.TreeItem
import godot.core.Color
import godot.core.Dictionary
import godot.core.Rect2
import godot.core.Variant
import godot.icalls._icall_Boolean
import godot.icalls._icall_Boolean_Long
import godot.icalls._icall_Boolean_Long_Long
import godot.icalls._icall_Color_Long
import godot.icalls._icall_Dictionary_Long
import godot.icalls._icall_Double_Long
import godot.icalls._icall_Long
import godot.icalls._icall_Long_Long
import godot.icalls._icall_Rect2_Long
import godot.icalls._icall_String_Long
import godot.icalls._icall_String_Long_Long
import godot.icalls._icall_Texture_Long
import godot.icalls._icall_Texture_Long_Long
import godot.icalls._icall_TreeItem
import godot.icalls._icall_TreeItem_Boolean
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Long_Boolean
import godot.icalls._icall_Unit_Long_Color
import godot.icalls._icall_Unit_Long_Color_Boolean
import godot.icalls._icall_Unit_Long_Double
import godot.icalls._icall_Unit_Long_Double_Double_Double_Boolean
import godot.icalls._icall_Unit_Long_Long
import godot.icalls._icall_Unit_Long_Long_Boolean
import godot.icalls._icall_Unit_Long_Long_Object
import godot.icalls._icall_Unit_Long_Object
import godot.icalls._icall_Unit_Long_Object_Long_Boolean_String
import godot.icalls._icall_Unit_Long_Object_String
import godot.icalls._icall_Unit_Long_Rect2
import godot.icalls._icall_Unit_Long_String
import godot.icalls._icall_Unit_Long_Variant
import godot.icalls._icall_Unit_Object
import godot.icalls._icall_Variant_Long
import godot.icalls._icall_varargs
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.String

open class TreeItem internal constructor(
  _ignore: Any?
) : Object(_ignore) {
  open var collapsed: Boolean
    get() {
      val mb = getMethodBind("TreeItem","is_collapsed")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("TreeItem","set_collapsed")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var customMinimumHeight: Long
    get() {
      val mb = getMethodBind("TreeItem","get_custom_minimum_height")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("TreeItem","set_custom_minimum_height")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var disableFolding: Boolean
    get() {
      val mb = getMethodBind("TreeItem","is_folding_disabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("TreeItem","set_disable_folding")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  internal constructor() : this(null)

  open fun addButton(
    column: Long,
    button: Texture,
    buttonIdx: Long = -1,
    disabled: Boolean = false,
    tooltip: String = ""
  ) {
    val mb = getMethodBind("TreeItem","add_button")
    _icall_Unit_Long_Object_Long_Boolean_String( mb, this.ptr, column, button, buttonIdx, disabled,
        tooltip)
  }

  open fun callRecursive(method: String, vararg __var_args: Any?): Variant {
    val mb = getMethodBind("TreeItem","call_recursive")
    return _icall_varargs( mb, this.ptr, arrayOf(method, *__var_args))
  }

  open fun clearCustomBgColor(column: Long) {
    val mb = getMethodBind("TreeItem","clear_custom_bg_color")
    _icall_Unit_Long( mb, this.ptr, column)
  }

  open fun clearCustomColor(column: Long) {
    val mb = getMethodBind("TreeItem","clear_custom_color")
    _icall_Unit_Long( mb, this.ptr, column)
  }

  open fun deselect(column: Long) {
    val mb = getMethodBind("TreeItem","deselect")
    _icall_Unit_Long( mb, this.ptr, column)
  }

  open fun eraseButton(column: Long, buttonIdx: Long) {
    val mb = getMethodBind("TreeItem","erase_button")
    _icall_Unit_Long_Long( mb, this.ptr, column, buttonIdx)
  }

  open fun getButton(column: Long, buttonIdx: Long): Texture {
    val mb = getMethodBind("TreeItem","get_button")
    return _icall_Texture_Long_Long( mb, this.ptr, column, buttonIdx)
  }

  open fun getButtonCount(column: Long): Long {
    val mb = getMethodBind("TreeItem","get_button_count")
    return _icall_Long_Long( mb, this.ptr, column)
  }

  open fun getButtonTooltip(column: Long, buttonIdx: Long): String {
    val mb = getMethodBind("TreeItem","get_button_tooltip")
    return _icall_String_Long_Long( mb, this.ptr, column, buttonIdx)
  }

  open fun getCellMode(column: Long): TreeItem.TreeCellMode {
    val mb = getMethodBind("TreeItem","get_cell_mode")
    return TreeItem.TreeCellMode.from( _icall_Long_Long( mb, this.ptr, column))
  }

  open fun getChildren(): TreeItem {
    val mb = getMethodBind("TreeItem","get_children")
    return _icall_TreeItem( mb, this.ptr)
  }

  open fun getCustomBgColor(column: Long): Color {
    val mb = getMethodBind("TreeItem","get_custom_bg_color")
    return _icall_Color_Long( mb, this.ptr, column)
  }

  open fun getCustomColor(column: Long): Color {
    val mb = getMethodBind("TreeItem","get_custom_color")
    return _icall_Color_Long( mb, this.ptr, column)
  }

  open fun getCustomMinimumHeight(): Long {
    val mb = getMethodBind("TreeItem","get_custom_minimum_height")
    return _icall_Long( mb, this.ptr)
  }

  open fun getExpandRight(column: Long): Boolean {
    val mb = getMethodBind("TreeItem","get_expand_right")
    return _icall_Boolean_Long( mb, this.ptr, column)
  }

  open fun getIcon(column: Long): Texture {
    val mb = getMethodBind("TreeItem","get_icon")
    return _icall_Texture_Long( mb, this.ptr, column)
  }

  open fun getIconMaxWidth(column: Long): Long {
    val mb = getMethodBind("TreeItem","get_icon_max_width")
    return _icall_Long_Long( mb, this.ptr, column)
  }

  open fun getIconModulate(column: Long): Color {
    val mb = getMethodBind("TreeItem","get_icon_modulate")
    return _icall_Color_Long( mb, this.ptr, column)
  }

  open fun getIconRegion(column: Long): Rect2 {
    val mb = getMethodBind("TreeItem","get_icon_region")
    return _icall_Rect2_Long( mb, this.ptr, column)
  }

  open fun getMetadata(column: Long): Variant {
    val mb = getMethodBind("TreeItem","get_metadata")
    return _icall_Variant_Long( mb, this.ptr, column)
  }

  open fun getNext(): TreeItem {
    val mb = getMethodBind("TreeItem","get_next")
    return _icall_TreeItem( mb, this.ptr)
  }

  open fun getNextVisible(wrap: Boolean = false): TreeItem {
    val mb = getMethodBind("TreeItem","get_next_visible")
    return _icall_TreeItem_Boolean( mb, this.ptr, wrap)
  }

  open fun getParent(): TreeItem {
    val mb = getMethodBind("TreeItem","get_parent")
    return _icall_TreeItem( mb, this.ptr)
  }

  open fun getPrev(): TreeItem {
    val mb = getMethodBind("TreeItem","get_prev")
    return _icall_TreeItem( mb, this.ptr)
  }

  open fun getPrevVisible(wrap: Boolean = false): TreeItem {
    val mb = getMethodBind("TreeItem","get_prev_visible")
    return _icall_TreeItem_Boolean( mb, this.ptr, wrap)
  }

  open fun getRange(column: Long): Double {
    val mb = getMethodBind("TreeItem","get_range")
    return _icall_Double_Long( mb, this.ptr, column)
  }

  open fun getRangeConfig(column: Long): Dictionary {
    val mb = getMethodBind("TreeItem","get_range_config")
    return _icall_Dictionary_Long( mb, this.ptr, column)
  }

  open fun getSuffix(column: Long): String {
    val mb = getMethodBind("TreeItem","get_suffix")
    return _icall_String_Long( mb, this.ptr, column)
  }

  open fun getText(column: Long): String {
    val mb = getMethodBind("TreeItem","get_text")
    return _icall_String_Long( mb, this.ptr, column)
  }

  open fun getTextAlign(column: Long): TreeItem.TextAlign {
    val mb = getMethodBind("TreeItem","get_text_align")
    return TreeItem.TextAlign.from( _icall_Long_Long( mb, this.ptr, column))
  }

  open fun getTooltip(column: Long): String {
    val mb = getMethodBind("TreeItem","get_tooltip")
    return _icall_String_Long( mb, this.ptr, column)
  }

  open fun isButtonDisabled(column: Long, buttonIdx: Long): Boolean {
    val mb = getMethodBind("TreeItem","is_button_disabled")
    return _icall_Boolean_Long_Long( mb, this.ptr, column, buttonIdx)
  }

  open fun isChecked(column: Long): Boolean {
    val mb = getMethodBind("TreeItem","is_checked")
    return _icall_Boolean_Long( mb, this.ptr, column)
  }

  open fun isCollapsed(): Boolean {
    val mb = getMethodBind("TreeItem","is_collapsed")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isCustomSetAsButton(column: Long): Boolean {
    val mb = getMethodBind("TreeItem","is_custom_set_as_button")
    return _icall_Boolean_Long( mb, this.ptr, column)
  }

  open fun isEditable(column: Long): Boolean {
    val mb = getMethodBind("TreeItem","is_editable")
    return _icall_Boolean_Long( mb, this.ptr, column)
  }

  open fun isFoldingDisabled(): Boolean {
    val mb = getMethodBind("TreeItem","is_folding_disabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isSelectable(column: Long): Boolean {
    val mb = getMethodBind("TreeItem","is_selectable")
    return _icall_Boolean_Long( mb, this.ptr, column)
  }

  open fun isSelected(column: Long): Boolean {
    val mb = getMethodBind("TreeItem","is_selected")
    return _icall_Boolean_Long( mb, this.ptr, column)
  }

  open fun moveToBottom() {
    val mb = getMethodBind("TreeItem","move_to_bottom")
    _icall_Unit( mb, this.ptr)
  }

  open fun moveToTop() {
    val mb = getMethodBind("TreeItem","move_to_top")
    _icall_Unit( mb, this.ptr)
  }

  open fun removeChild(child: Object) {
    val mb = getMethodBind("TreeItem","remove_child")
    _icall_Unit_Object( mb, this.ptr, child)
  }

  open fun select(column: Long) {
    val mb = getMethodBind("TreeItem","select")
    _icall_Unit_Long( mb, this.ptr, column)
  }

  open fun setButton(
    column: Long,
    buttonIdx: Long,
    button: Texture
  ) {
    val mb = getMethodBind("TreeItem","set_button")
    _icall_Unit_Long_Long_Object( mb, this.ptr, column, buttonIdx, button)
  }

  open fun setButtonDisabled(
    column: Long,
    buttonIdx: Long,
    disabled: Boolean
  ) {
    val mb = getMethodBind("TreeItem","set_button_disabled")
    _icall_Unit_Long_Long_Boolean( mb, this.ptr, column, buttonIdx, disabled)
  }

  open fun setCellMode(column: Long, mode: Long) {
    val mb = getMethodBind("TreeItem","set_cell_mode")
    _icall_Unit_Long_Long( mb, this.ptr, column, mode)
  }

  open fun setChecked(column: Long, checked: Boolean) {
    val mb = getMethodBind("TreeItem","set_checked")
    _icall_Unit_Long_Boolean( mb, this.ptr, column, checked)
  }

  open fun setCollapsed(enable: Boolean) {
    val mb = getMethodBind("TreeItem","set_collapsed")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setCustomAsButton(column: Long, enable: Boolean) {
    val mb = getMethodBind("TreeItem","set_custom_as_button")
    _icall_Unit_Long_Boolean( mb, this.ptr, column, enable)
  }

  open fun setCustomBgColor(
    column: Long,
    color: Color,
    justOutline: Boolean = false
  ) {
    val mb = getMethodBind("TreeItem","set_custom_bg_color")
    _icall_Unit_Long_Color_Boolean( mb, this.ptr, column, color, justOutline)
  }

  open fun setCustomColor(column: Long, color: Color) {
    val mb = getMethodBind("TreeItem","set_custom_color")
    _icall_Unit_Long_Color( mb, this.ptr, column, color)
  }

  open fun setCustomDraw(
    column: Long,
    _object: Object,
    callback: String
  ) {
    val mb = getMethodBind("TreeItem","set_custom_draw")
    _icall_Unit_Long_Object_String( mb, this.ptr, column, _object, callback)
  }

  open fun setCustomMinimumHeight(height: Long) {
    val mb = getMethodBind("TreeItem","set_custom_minimum_height")
    _icall_Unit_Long( mb, this.ptr, height)
  }

  open fun setDisableFolding(disable: Boolean) {
    val mb = getMethodBind("TreeItem","set_disable_folding")
    _icall_Unit_Boolean( mb, this.ptr, disable)
  }

  open fun setEditable(column: Long, enabled: Boolean) {
    val mb = getMethodBind("TreeItem","set_editable")
    _icall_Unit_Long_Boolean( mb, this.ptr, column, enabled)
  }

  open fun setExpandRight(column: Long, enable: Boolean) {
    val mb = getMethodBind("TreeItem","set_expand_right")
    _icall_Unit_Long_Boolean( mb, this.ptr, column, enable)
  }

  open fun setIcon(column: Long, texture: Texture) {
    val mb = getMethodBind("TreeItem","set_icon")
    _icall_Unit_Long_Object( mb, this.ptr, column, texture)
  }

  open fun setIconMaxWidth(column: Long, width: Long) {
    val mb = getMethodBind("TreeItem","set_icon_max_width")
    _icall_Unit_Long_Long( mb, this.ptr, column, width)
  }

  open fun setIconModulate(column: Long, modulate: Color) {
    val mb = getMethodBind("TreeItem","set_icon_modulate")
    _icall_Unit_Long_Color( mb, this.ptr, column, modulate)
  }

  open fun setIconRegion(column: Long, region: Rect2) {
    val mb = getMethodBind("TreeItem","set_icon_region")
    _icall_Unit_Long_Rect2( mb, this.ptr, column, region)
  }

  open fun setMetadata(column: Long, meta: Variant) {
    val mb = getMethodBind("TreeItem","set_metadata")
    _icall_Unit_Long_Variant( mb, this.ptr, column, meta)
  }

  open fun setRange(column: Long, value: Double) {
    val mb = getMethodBind("TreeItem","set_range")
    _icall_Unit_Long_Double( mb, this.ptr, column, value)
  }

  open fun setRangeConfig(
    column: Long,
    min: Double,
    max: Double,
    step: Double,
    expr: Boolean = false
  ) {
    val mb = getMethodBind("TreeItem","set_range_config")
    _icall_Unit_Long_Double_Double_Double_Boolean( mb, this.ptr, column, min, max, step, expr)
  }

  open fun setSelectable(column: Long, selectable: Boolean) {
    val mb = getMethodBind("TreeItem","set_selectable")
    _icall_Unit_Long_Boolean( mb, this.ptr, column, selectable)
  }

  open fun setSuffix(column: Long, text: String) {
    val mb = getMethodBind("TreeItem","set_suffix")
    _icall_Unit_Long_String( mb, this.ptr, column, text)
  }

  open fun setText(column: Long, text: String) {
    val mb = getMethodBind("TreeItem","set_text")
    _icall_Unit_Long_String( mb, this.ptr, column, text)
  }

  open fun setTextAlign(column: Long, textAlign: Long) {
    val mb = getMethodBind("TreeItem","set_text_align")
    _icall_Unit_Long_Long( mb, this.ptr, column, textAlign)
  }

  open fun setTooltip(column: Long, tooltip: String) {
    val mb = getMethodBind("TreeItem","set_tooltip")
    _icall_Unit_Long_String( mb, this.ptr, column, tooltip)
  }

  enum class TreeCellMode(
    id: Long
  ) {
    CELL_MODE_STRING(0),

    CELL_MODE_CHECK(1),

    CELL_MODE_RANGE(2),

    CELL_MODE_ICON(3),

    CELL_MODE_CUSTOM(4);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class TextAlign(
    id: Long
  ) {
    ALIGN_LEFT(0),

    ALIGN_CENTER(1),

    ALIGN_RIGHT(2);

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

    final const val ALIGN_LEFT: Long = 0

    final const val ALIGN_RIGHT: Long = 2

    final const val CELL_MODE_CHECK: Long = 1

    final const val CELL_MODE_CUSTOM: Long = 4

    final const val CELL_MODE_ICON: Long = 3

    final const val CELL_MODE_RANGE: Long = 2

    final const val CELL_MODE_STRING: Long = 0
  }
}
