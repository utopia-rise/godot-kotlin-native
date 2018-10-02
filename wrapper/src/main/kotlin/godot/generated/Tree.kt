@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class Tree : Control {
    constructor() : super("Tree")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class SelectMode(val id: Int) {
        SELECT_SINGLE(0),
        SELECT_ROW(1),
        SELECT_MULTI(2),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }
    enum class DropModeFlags(val id: Int) {
        DROP_MODE_DISABLED(0),
        DROP_MODE_ON_ITEM(1),
        DROP_MODE_INBETWEEN(2),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }


    // Signals
    class Signal {
        companion object {
            const val ITEM_ACTIVATED: String = "item_activated"
            const val MULTI_SELECTED: String = "multi_selected"
            const val COLUMN_TITLE_PRESSED: String = "column_title_pressed"
            const val CUSTOM_POPUP_EDITED: String = "custom_popup_edited"
            const val ITEM_COLLAPSED: String = "item_collapsed"
            const val ITEM_RMB_EDITED: String = "item_rmb_edited"
            const val ITEM_EDITED: String = "item_edited"
            const val EMPTY_TREE_RMB_SELECTED: String = "empty_tree_rmb_selected"
            const val NOTHING_SELECTED: String = "nothing_selected"
            const val ITEM_DOUBLE_CLICKED: String = "item_double_clicked"
            const val ITEM_RMB_SELECTED: String = "item_rmb_selected"
            const val ITEM_SELECTED: String = "item_selected"
            const val CELL_SELECTED: String = "cell_selected"
            const val BUTTON_PRESSED: String = "button_pressed"
            const val ITEM_CUSTOM_BUTTON_PRESSED: String = "item_custom_button_pressed"
        }
    }


    companion object {
        infix fun from(other: Control): Tree = Tree("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CanvasItem): Tree = Tree("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): Tree = Tree("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): Tree = Tree("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): Tree = fromVariant(Tree(""), other)


        // Constants
        const val SELECT_SINGLE: Int = 0
        const val SELECT_ROW: Int = 1
        const val SELECT_MULTI: Int = 2
        const val DROP_MODE_DISABLED: Int = 0
        const val DROP_MODE_ON_ITEM: Int = 1
        const val DROP_MODE_INBETWEEN: Int = 2


    }


    // Properties
    open var columns: Int
        get() = _icall_Int(getColumnsMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setColumnsMethodBind, this.rawMemory, value)


    open var allowReselect: Boolean
        get() = _icall_Boolean(getAllowReselectMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setAllowReselectMethodBind, this.rawMemory, value)


    open var allowRmbSelect: Boolean
        get() = _icall_Boolean(getAllowRmbSelectMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setAllowRmbSelectMethodBind, this.rawMemory, value)


    open var hideFolding: Boolean
        get() = _icall_Boolean(isFoldingHiddenMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setHideFoldingMethodBind, this.rawMemory, value)


    open var hideRoot: Boolean
        get() = _icall_Boolean(isRootHiddenMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setHideRootMethodBind, this.rawMemory, value)


    open var dropModeFlags: Int
        get() = _icall_Int(getDropModeFlagsMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setDropModeFlagsMethodBind, this.rawMemory, value)


    open var selectMode: Int
        get() = _icall_Int(getSelectModeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setSelectModeMethodBind, this.rawMemory, value)




    // Methods
    open fun _range_click_timeout() {
    }


    override fun _gui_input(arg0: InputEvent) {
    }


    open fun _popup_select(arg0: Int) {
    }


    open fun _text_editor_enter(arg0: String) {
    }


    open fun _text_editor_modal_close() {
    }


    open fun _value_editor_changed(arg0: Float) {
    }


    open fun _scroll_moved(arg0: Float) {
    }


    private val clearMethodBind: CPointer<godot_method_bind> by lazy { getMB("Tree", "clear") }
    open fun clear() {
        _icall_Unit(clearMethodBind, this.rawMemory)
    }


    private val createItemMethodBind: CPointer<godot_method_bind> by lazy { getMB("Tree", "create_item") }
    open fun createItem(parent: Object, idx: Int = -1): Object {
        return _icall_Object_Object_Int(createItemMethodBind, this.rawMemory, parent, idx)
    }


    private val getRootMethodBind: CPointer<godot_method_bind> by lazy { getMB("Tree", "get_root") }
    open fun getRoot(): TreeItem {
        return _icall_TreeItem(getRootMethodBind, this.rawMemory)
    }


    private val setColumnMinWidthMethodBind: CPointer<godot_method_bind> by lazy { getMB("Tree", "set_column_min_width") }
    open fun setColumnMinWidth(column: Int, minWidth: Int) {
        _icall_Unit_Int_Int(setColumnMinWidthMethodBind, this.rawMemory, column, minWidth)
    }


    private val setColumnExpandMethodBind: CPointer<godot_method_bind> by lazy { getMB("Tree", "set_column_expand") }
    open fun setColumnExpand(column: Int, expand: Boolean) {
        _icall_Unit_Int_Boolean(setColumnExpandMethodBind, this.rawMemory, column, expand)
    }


    private val getColumnWidthMethodBind: CPointer<godot_method_bind> by lazy { getMB("Tree", "get_column_width") }
    open fun getColumnWidth(column: Int): Int {
        return _icall_Int_Int(getColumnWidthMethodBind, this.rawMemory, column)
    }


    private val setHideRootMethodBind: CPointer<godot_method_bind> by lazy { getMB("Tree", "set_hide_root") }
    open fun setHideRoot(enable: Boolean) {
        _icall_Unit_Boolean(setHideRootMethodBind, this.rawMemory, enable)
    }


    private val isRootHiddenMethodBind: CPointer<godot_method_bind> by lazy { getMB("Tree", "is_root_hidden") }
    open fun isRootHidden(): Boolean {
        return _icall_Boolean(isRootHiddenMethodBind, this.rawMemory)
    }


    private val getNextSelectedMethodBind: CPointer<godot_method_bind> by lazy { getMB("Tree", "get_next_selected") }
    open fun getNextSelected(from: Object): TreeItem {
        return _icall_TreeItem_Object(getNextSelectedMethodBind, this.rawMemory, from)
    }


    private val getSelectedMethodBind: CPointer<godot_method_bind> by lazy { getMB("Tree", "get_selected") }
    open fun getSelected(): TreeItem {
        return _icall_TreeItem(getSelectedMethodBind, this.rawMemory)
    }


    private val getSelectedColumnMethodBind: CPointer<godot_method_bind> by lazy { getMB("Tree", "get_selected_column") }
    open fun getSelectedColumn(): Int {
        return _icall_Int(getSelectedColumnMethodBind, this.rawMemory)
    }


    private val getPressedButtonMethodBind: CPointer<godot_method_bind> by lazy { getMB("Tree", "get_pressed_button") }
    open fun getPressedButton(): Int {
        return _icall_Int(getPressedButtonMethodBind, this.rawMemory)
    }


    private val setSelectModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Tree", "set_select_mode") }
    open fun setSelectMode(mode: Int) {
        _icall_Unit_Int(setSelectModeMethodBind, this.rawMemory, mode)
    }


    private val getSelectModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Tree", "get_select_mode") }
    open fun getSelectMode(): Tree.SelectMode {
        return Tree.SelectMode.fromInt(_icall_Int(getSelectModeMethodBind, this.rawMemory))
    }


    private val setColumnsMethodBind: CPointer<godot_method_bind> by lazy { getMB("Tree", "set_columns") }
    open fun setColumns(amount: Int) {
        _icall_Unit_Int(setColumnsMethodBind, this.rawMemory, amount)
    }


    private val getColumnsMethodBind: CPointer<godot_method_bind> by lazy { getMB("Tree", "get_columns") }
    open fun getColumns(): Int {
        return _icall_Int(getColumnsMethodBind, this.rawMemory)
    }


    private val getEditedMethodBind: CPointer<godot_method_bind> by lazy { getMB("Tree", "get_edited") }
    open fun getEdited(): TreeItem {
        return _icall_TreeItem(getEditedMethodBind, this.rawMemory)
    }


    private val getEditedColumnMethodBind: CPointer<godot_method_bind> by lazy { getMB("Tree", "get_edited_column") }
    open fun getEditedColumn(): Int {
        return _icall_Int(getEditedColumnMethodBind, this.rawMemory)
    }


    private val getCustomPopupRectMethodBind: CPointer<godot_method_bind> by lazy { getMB("Tree", "get_custom_popup_rect") }
    open fun getCustomPopupRect(): Rect2 {
        return _icall_Rect2(getCustomPopupRectMethodBind, this.rawMemory)
    }


    private val getItemAreaRectMethodBind: CPointer<godot_method_bind> by lazy { getMB("Tree", "get_item_area_rect") }
    open fun getItemAreaRect(item: Object, column: Int = -1): Rect2 {
        return _icall_Rect2_Object_Int(getItemAreaRectMethodBind, this.rawMemory, item, column)
    }


    private val getItemAtPositionMethodBind: CPointer<godot_method_bind> by lazy { getMB("Tree", "get_item_at_position") }
    open fun getItemAtPosition(position: Vector2): TreeItem {
        return _icall_TreeItem_Vector2(getItemAtPositionMethodBind, this.rawMemory, position)
    }


    private val getColumnAtPositionMethodBind: CPointer<godot_method_bind> by lazy { getMB("Tree", "get_column_at_position") }
    open fun getColumnAtPosition(position: Vector2): Int {
        return _icall_Int_Vector2(getColumnAtPositionMethodBind, this.rawMemory, position)
    }


    private val getDropSectionAtPositionMethodBind: CPointer<godot_method_bind> by lazy { getMB("Tree", "get_drop_section_at_position") }
    open fun getDropSectionAtPosition(position: Vector2): Int {
        return _icall_Int_Vector2(getDropSectionAtPositionMethodBind, this.rawMemory, position)
    }


    private val ensureCursorIsVisibleMethodBind: CPointer<godot_method_bind> by lazy { getMB("Tree", "ensure_cursor_is_visible") }
    open fun ensureCursorIsVisible() {
        _icall_Unit(ensureCursorIsVisibleMethodBind, this.rawMemory)
    }


    private val setColumnTitlesVisibleMethodBind: CPointer<godot_method_bind> by lazy { getMB("Tree", "set_column_titles_visible") }
    open fun setColumnTitlesVisible(visible: Boolean) {
        _icall_Unit_Boolean(setColumnTitlesVisibleMethodBind, this.rawMemory, visible)
    }


    private val areColumnTitlesVisibleMethodBind: CPointer<godot_method_bind> by lazy { getMB("Tree", "are_column_titles_visible") }
    open fun areColumnTitlesVisible(): Boolean {
        return _icall_Boolean(areColumnTitlesVisibleMethodBind, this.rawMemory)
    }


    private val setColumnTitleMethodBind: CPointer<godot_method_bind> by lazy { getMB("Tree", "set_column_title") }
    open fun setColumnTitle(column: Int, title: String) {
        _icall_Unit_Int_String(setColumnTitleMethodBind, this.rawMemory, column, title)
    }


    private val getColumnTitleMethodBind: CPointer<godot_method_bind> by lazy { getMB("Tree", "get_column_title") }
    open fun getColumnTitle(column: Int): String {
        return _icall_String_Int(getColumnTitleMethodBind, this.rawMemory, column)
    }


    private val getScrollMethodBind: CPointer<godot_method_bind> by lazy { getMB("Tree", "get_scroll") }
    open fun getScroll(): Vector2 {
        return _icall_Vector2(getScrollMethodBind, this.rawMemory)
    }


    private val setHideFoldingMethodBind: CPointer<godot_method_bind> by lazy { getMB("Tree", "set_hide_folding") }
    open fun setHideFolding(hide: Boolean) {
        _icall_Unit_Boolean(setHideFoldingMethodBind, this.rawMemory, hide)
    }


    private val isFoldingHiddenMethodBind: CPointer<godot_method_bind> by lazy { getMB("Tree", "is_folding_hidden") }
    open fun isFoldingHidden(): Boolean {
        return _icall_Boolean(isFoldingHiddenMethodBind, this.rawMemory)
    }


    private val setDropModeFlagsMethodBind: CPointer<godot_method_bind> by lazy { getMB("Tree", "set_drop_mode_flags") }
    open fun setDropModeFlags(flags: Int) {
        _icall_Unit_Int(setDropModeFlagsMethodBind, this.rawMemory, flags)
    }


    private val getDropModeFlagsMethodBind: CPointer<godot_method_bind> by lazy { getMB("Tree", "get_drop_mode_flags") }
    open fun getDropModeFlags(): Int {
        return _icall_Int(getDropModeFlagsMethodBind, this.rawMemory)
    }


    private val setAllowRmbSelectMethodBind: CPointer<godot_method_bind> by lazy { getMB("Tree", "set_allow_rmb_select") }
    open fun setAllowRmbSelect(allow: Boolean) {
        _icall_Unit_Boolean(setAllowRmbSelectMethodBind, this.rawMemory, allow)
    }


    private val getAllowRmbSelectMethodBind: CPointer<godot_method_bind> by lazy { getMB("Tree", "get_allow_rmb_select") }
    open fun getAllowRmbSelect(): Boolean {
        return _icall_Boolean(getAllowRmbSelectMethodBind, this.rawMemory)
    }


    private val setAllowReselectMethodBind: CPointer<godot_method_bind> by lazy { getMB("Tree", "set_allow_reselect") }
    open fun setAllowReselect(allow: Boolean) {
        _icall_Unit_Boolean(setAllowReselectMethodBind, this.rawMemory, allow)
    }


    private val getAllowReselectMethodBind: CPointer<godot_method_bind> by lazy { getMB("Tree", "get_allow_reselect") }
    open fun getAllowReselect(): Boolean {
        return _icall_Boolean(getAllowReselectMethodBind, this.rawMemory)
    }


}
