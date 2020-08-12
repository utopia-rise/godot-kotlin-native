// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.Tree
import godot.core.Godot.shouldInitPtr
import godot.core.Rect2
import godot.core.Signal0
import godot.core.Signal1
import godot.core.Signal3
import godot.core.Vector2
import godot.core.signal
import godot.icalls._icall_Boolean
import godot.icalls._icall_Long
import godot.icalls._icall_Long_Long
import godot.icalls._icall_Long_Vector2
import godot.icalls._icall_Rect2
import godot.icalls._icall_Rect2_Object_Long
import godot.icalls._icall_String_Long
import godot.icalls._icall_TreeItem
import godot.icalls._icall_TreeItem_Object
import godot.icalls._icall_TreeItem_Vector2
import godot.icalls._icall_TreeItem_nObject_Long
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Long_Boolean
import godot.icalls._icall_Unit_Long_Long
import godot.icalls._icall_Unit_Long_String
import godot.icalls._icall_Vector2
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.String

open class Tree internal constructor(
  _ignore: Any?
) : Control(_ignore) {
  val buttonPressed: Signal3<TreeItem, Long, Long> by signal("item", "column", "id")

  val cellSelected: Signal0 by signal()

  val columnTitlePressed: Signal1<Long> by signal("column")

  val customPopupEdited: Signal1<Boolean> by signal("arrow_clicked")

  val emptyRmb: Signal1<Vector2> by signal("position")

  val emptyTreeRmbSelected: Signal1<Vector2> by signal("position")

  val itemActivated: Signal0 by signal()

  val itemCollapsed: Signal1<TreeItem> by signal("item")

  val itemCustomButtonPressed: Signal0 by signal()

  val itemDoubleClicked: Signal0 by signal()

  val itemEdited: Signal0 by signal()

  val itemRmbEdited: Signal0 by signal()

  val itemRmbSelected: Signal1<Vector2> by signal("position")

  val itemSelected: Signal0 by signal()

  val multiSelected: Signal3<TreeItem, Long, Boolean> by signal("item", "column", "selected")

  val nothingSelected: Signal0 by signal()

  open var allowReselect: Boolean
    get() {
      val mb = getMethodBind("Tree","get_allow_reselect")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Tree","set_allow_reselect")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var allowRmbSelect: Boolean
    get() {
      val mb = getMethodBind("Tree","get_allow_rmb_select")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Tree","set_allow_rmb_select")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var columns: Long
    get() {
      val mb = getMethodBind("Tree","get_columns")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Tree","set_columns")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var dropModeFlags: Long
    get() {
      val mb = getMethodBind("Tree","get_drop_mode_flags")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Tree","set_drop_mode_flags")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var hideFolding: Boolean
    get() {
      val mb = getMethodBind("Tree","is_folding_hidden")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Tree","set_hide_folding")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var hideRoot: Boolean
    get() {
      val mb = getMethodBind("Tree","is_root_hidden")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Tree","set_hide_root")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var selectMode: Long
    get() {
      val mb = getMethodBind("Tree","get_select_mode")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Tree","set_select_mode")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("Tree", "Tree")
        }

  }

  override fun _guiInput(arg0: InputEvent) {
  }

  open fun _popupSelect(arg0: Long) {
  }

  open fun _rangeClickTimeout() {
  }

  open fun _scrollMoved(arg0: Double) {
  }

  open fun _textEditorEnter(arg0: String) {
  }

  open fun _textEditorModalClose() {
  }

  open fun _valueEditorChanged(arg0: Double) {
  }

  open fun areColumnTitlesVisible(): Boolean {
    val mb = getMethodBind("Tree","are_column_titles_visible")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun clear() {
    val mb = getMethodBind("Tree","clear")
    _icall_Unit( mb, this.ptr)
  }

  open fun createItem(parent: Object? = null, idx: Long = -1): TreeItem {
    val mb = getMethodBind("Tree","create_item")
    return _icall_TreeItem_nObject_Long( mb, this.ptr, parent, idx)
  }

  open fun ensureCursorIsVisible() {
    val mb = getMethodBind("Tree","ensure_cursor_is_visible")
    _icall_Unit( mb, this.ptr)
  }

  open fun getAllowReselect(): Boolean {
    val mb = getMethodBind("Tree","get_allow_reselect")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun getAllowRmbSelect(): Boolean {
    val mb = getMethodBind("Tree","get_allow_rmb_select")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun getColumnAtPosition(position: Vector2): Long {
    val mb = getMethodBind("Tree","get_column_at_position")
    return _icall_Long_Vector2( mb, this.ptr, position)
  }

  open fun getColumnTitle(column: Long): String {
    val mb = getMethodBind("Tree","get_column_title")
    return _icall_String_Long( mb, this.ptr, column)
  }

  open fun getColumnWidth(column: Long): Long {
    val mb = getMethodBind("Tree","get_column_width")
    return _icall_Long_Long( mb, this.ptr, column)
  }

  open fun getColumns(): Long {
    val mb = getMethodBind("Tree","get_columns")
    return _icall_Long( mb, this.ptr)
  }

  open fun getCustomPopupRect(): Rect2 {
    val mb = getMethodBind("Tree","get_custom_popup_rect")
    return _icall_Rect2( mb, this.ptr)
  }

  open fun getDropModeFlags(): Long {
    val mb = getMethodBind("Tree","get_drop_mode_flags")
    return _icall_Long( mb, this.ptr)
  }

  open fun getDropSectionAtPosition(position: Vector2): Long {
    val mb = getMethodBind("Tree","get_drop_section_at_position")
    return _icall_Long_Vector2( mb, this.ptr, position)
  }

  open fun getEdited(): TreeItem {
    val mb = getMethodBind("Tree","get_edited")
    return _icall_TreeItem( mb, this.ptr)
  }

  open fun getEditedColumn(): Long {
    val mb = getMethodBind("Tree","get_edited_column")
    return _icall_Long( mb, this.ptr)
  }

  open fun getItemAreaRect(item: Object, column: Long = -1): Rect2 {
    val mb = getMethodBind("Tree","get_item_area_rect")
    return _icall_Rect2_Object_Long( mb, this.ptr, item, column)
  }

  open fun getItemAtPosition(position: Vector2): TreeItem {
    val mb = getMethodBind("Tree","get_item_at_position")
    return _icall_TreeItem_Vector2( mb, this.ptr, position)
  }

  open fun getNextSelected(from: Object): TreeItem {
    val mb = getMethodBind("Tree","get_next_selected")
    return _icall_TreeItem_Object( mb, this.ptr, from)
  }

  open fun getPressedButton(): Long {
    val mb = getMethodBind("Tree","get_pressed_button")
    return _icall_Long( mb, this.ptr)
  }

  open fun getRoot(): TreeItem {
    val mb = getMethodBind("Tree","get_root")
    return _icall_TreeItem( mb, this.ptr)
  }

  open fun getScroll(): Vector2 {
    val mb = getMethodBind("Tree","get_scroll")
    return _icall_Vector2( mb, this.ptr)
  }

  open fun getSelectMode(): Tree.SelectMode {
    val mb = getMethodBind("Tree","get_select_mode")
    return Tree.SelectMode.from( _icall_Long( mb, this.ptr))
  }

  open fun getSelected(): TreeItem {
    val mb = getMethodBind("Tree","get_selected")
    return _icall_TreeItem( mb, this.ptr)
  }

  open fun getSelectedColumn(): Long {
    val mb = getMethodBind("Tree","get_selected_column")
    return _icall_Long( mb, this.ptr)
  }

  open fun isFoldingHidden(): Boolean {
    val mb = getMethodBind("Tree","is_folding_hidden")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isRootHidden(): Boolean {
    val mb = getMethodBind("Tree","is_root_hidden")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun setAllowReselect(allow: Boolean) {
    val mb = getMethodBind("Tree","set_allow_reselect")
    _icall_Unit_Boolean( mb, this.ptr, allow)
  }

  open fun setAllowRmbSelect(allow: Boolean) {
    val mb = getMethodBind("Tree","set_allow_rmb_select")
    _icall_Unit_Boolean( mb, this.ptr, allow)
  }

  open fun setColumnExpand(column: Long, expand: Boolean) {
    val mb = getMethodBind("Tree","set_column_expand")
    _icall_Unit_Long_Boolean( mb, this.ptr, column, expand)
  }

  open fun setColumnMinWidth(column: Long, minWidth: Long) {
    val mb = getMethodBind("Tree","set_column_min_width")
    _icall_Unit_Long_Long( mb, this.ptr, column, minWidth)
  }

  open fun setColumnTitle(column: Long, title: String) {
    val mb = getMethodBind("Tree","set_column_title")
    _icall_Unit_Long_String( mb, this.ptr, column, title)
  }

  open fun setColumnTitlesVisible(visible: Boolean) {
    val mb = getMethodBind("Tree","set_column_titles_visible")
    _icall_Unit_Boolean( mb, this.ptr, visible)
  }

  open fun setColumns(amount: Long) {
    val mb = getMethodBind("Tree","set_columns")
    _icall_Unit_Long( mb, this.ptr, amount)
  }

  open fun setDropModeFlags(flags: Long) {
    val mb = getMethodBind("Tree","set_drop_mode_flags")
    _icall_Unit_Long( mb, this.ptr, flags)
  }

  open fun setHideFolding(hide: Boolean) {
    val mb = getMethodBind("Tree","set_hide_folding")
    _icall_Unit_Boolean( mb, this.ptr, hide)
  }

  open fun setHideRoot(enable: Boolean) {
    val mb = getMethodBind("Tree","set_hide_root")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setSelectMode(mode: Long) {
    val mb = getMethodBind("Tree","set_select_mode")
    _icall_Unit_Long( mb, this.ptr, mode)
  }

  enum class SelectMode(
    id: Long
  ) {
    SELECT_SINGLE(0),

    SELECT_ROW(1),

    SELECT_MULTI(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class DropModeFlags(
    id: Long
  ) {
    DROP_MODE_DISABLED(0),

    DROP_MODE_ON_ITEM(1),

    DROP_MODE_INBETWEEN(2);

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
