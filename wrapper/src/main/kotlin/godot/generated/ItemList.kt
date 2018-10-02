@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class ItemList : Control {
    constructor() : super("ItemList")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class SelectMode(val id: Long) {
        SELECT_SINGLE(0),
        SELECT_MULTI(1),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class IconMode(val id: Long) {
        ICON_MODE_TOP(0),
        ICON_MODE_LEFT(1),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }


    // Signals
    class Signal {
        companion object {
            const val ITEM_ACTIVATED: String = "item_activated"
            const val MULTI_SELECTED: String = "multi_selected"
            const val NOTHING_SELECTED: String = "nothing_selected"
            const val RMB_CLICKED: String = "rmb_clicked"
            const val ITEM_RMB_SELECTED: String = "item_rmb_selected"
            const val ITEM_SELECTED: String = "item_selected"
        }
    }


    companion object {
        infix fun from(other: Control): ItemList = ItemList("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CanvasItem): ItemList = ItemList("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): ItemList = ItemList("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): ItemList = ItemList("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): ItemList = fromVariant(ItemList(""), other)


        // Constants
        const val ICON_MODE_TOP: Long = 0
        const val ICON_MODE_LEFT: Long = 1
        const val SELECT_SINGLE: Long = 0
        const val SELECT_MULTI: Long = 1


    }


    // Properties
    open var selectMode: Long
        get() = _icall_Long(getSelectModeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setSelectModeMethodBind, this.rawMemory, value)


    open var allowReselect: Boolean
        get() = _icall_Boolean(getAllowReselectMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setAllowReselectMethodBind, this.rawMemory, value)


    open var allowRmbSelect: Boolean
        get() = _icall_Boolean(getAllowRmbSelectMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setAllowRmbSelectMethodBind, this.rawMemory, value)


    open var maxTextLines: Long
        get() = _icall_Long(getMaxTextLinesMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setMaxTextLinesMethodBind, this.rawMemory, value)


    open var autoHeight: Boolean
        get() = _icall_Boolean(hasAutoHeightMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setAutoHeightMethodBind, this.rawMemory, value)


    open var maxColumns: Long
        get() = _icall_Long(getMaxColumnsMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setMaxColumnsMethodBind, this.rawMemory, value)


    open var sameColumnWidth: Boolean
        get() = _icall_Boolean(isSameColumnWidthMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setSameColumnWidthMethodBind, this.rawMemory, value)


    open var fixedColumnWidth: Long
        get() = _icall_Long(getFixedColumnWidthMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setFixedColumnWidthMethodBind, this.rawMemory, value)


    open var iconMode: Long
        get() = _icall_Long(getIconModeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setIconModeMethodBind, this.rawMemory, value)


    open var iconScale: Double
        get() = _icall_Double(getIconScaleMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setIconScaleMethodBind, this.rawMemory, value)


    open var fixedIconSize: Vector2
        get() = _icall_Vector2(getFixedIconSizeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Vector2(setFixedIconSizeMethodBind, this.rawMemory, value)
    open fun fixedIconSize(shedule: (Vector2) -> Unit): Vector2 = fixedIconSize.apply {
        shedule(this)
        fixedIconSize = this
    }




    // Methods
    private val addItemMethodBind: CPointer<godot_method_bind> by lazy { getMB("ItemList", "add_item") }
    open fun addItem(text: String, icon: Texture, selectable: Boolean = true) {
        _icall_Unit_String_Object_Boolean(addItemMethodBind, this.rawMemory, text, icon, selectable)
    }


    private val addIconItemMethodBind: CPointer<godot_method_bind> by lazy { getMB("ItemList", "add_icon_item") }
    open fun addIconItem(icon: Texture, selectable: Boolean = true) {
        _icall_Unit_Object_Boolean(addIconItemMethodBind, this.rawMemory, icon, selectable)
    }


    private val setItemTextMethodBind: CPointer<godot_method_bind> by lazy { getMB("ItemList", "set_item_text") }
    open fun setItemText(idx: Long, text: String) {
        _icall_Unit_Long_String(setItemTextMethodBind, this.rawMemory, idx, text)
    }


    private val getItemTextMethodBind: CPointer<godot_method_bind> by lazy { getMB("ItemList", "get_item_text") }
    open fun getItemText(idx: Long): String {
        return _icall_String_Long(getItemTextMethodBind, this.rawMemory, idx)
    }


    private val setItemIconMethodBind: CPointer<godot_method_bind> by lazy { getMB("ItemList", "set_item_icon") }
    open fun setItemIcon(idx: Long, icon: Texture) {
        _icall_Unit_Long_Object(setItemIconMethodBind, this.rawMemory, idx, icon)
    }


    private val getItemIconMethodBind: CPointer<godot_method_bind> by lazy { getMB("ItemList", "get_item_icon") }
    open fun getItemIcon(idx: Long): Texture {
        return _icall_Texture_Long(getItemIconMethodBind, this.rawMemory, idx)
    }


    private val setItemIconRegionMethodBind: CPointer<godot_method_bind> by lazy { getMB("ItemList", "set_item_icon_region") }
    open fun setItemIconRegion(idx: Long, rect: Rect2) {
        _icall_Unit_Long_Rect2(setItemIconRegionMethodBind, this.rawMemory, idx, rect)
    }


    private val getItemIconRegionMethodBind: CPointer<godot_method_bind> by lazy { getMB("ItemList", "get_item_icon_region") }
    open fun getItemIconRegion(idx: Long): Rect2 {
        return _icall_Rect2_Long(getItemIconRegionMethodBind, this.rawMemory, idx)
    }


    private val setItemIconModulateMethodBind: CPointer<godot_method_bind> by lazy { getMB("ItemList", "set_item_icon_modulate") }
    open fun setItemIconModulate(idx: Long, modulate: Color) {
        _icall_Unit_Long_Color(setItemIconModulateMethodBind, this.rawMemory, idx, modulate)
    }


    private val getItemIconModulateMethodBind: CPointer<godot_method_bind> by lazy { getMB("ItemList", "get_item_icon_modulate") }
    open fun getItemIconModulate(idx: Long): Color {
        return _icall_Color_Long(getItemIconModulateMethodBind, this.rawMemory, idx)
    }


    private val setItemSelectableMethodBind: CPointer<godot_method_bind> by lazy { getMB("ItemList", "set_item_selectable") }
    open fun setItemSelectable(idx: Long, selectable: Boolean) {
        _icall_Unit_Long_Boolean(setItemSelectableMethodBind, this.rawMemory, idx, selectable)
    }


    private val isItemSelectableMethodBind: CPointer<godot_method_bind> by lazy { getMB("ItemList", "is_item_selectable") }
    open fun isItemSelectable(idx: Long): Boolean {
        return _icall_Boolean_Long(isItemSelectableMethodBind, this.rawMemory, idx)
    }


    private val setItemDisabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("ItemList", "set_item_disabled") }
    open fun setItemDisabled(idx: Long, disabled: Boolean) {
        _icall_Unit_Long_Boolean(setItemDisabledMethodBind, this.rawMemory, idx, disabled)
    }


    private val isItemDisabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("ItemList", "is_item_disabled") }
    open fun isItemDisabled(idx: Long): Boolean {
        return _icall_Boolean_Long(isItemDisabledMethodBind, this.rawMemory, idx)
    }


    private val setItemMetadataMethodBind: CPointer<godot_method_bind> by lazy { getMB("ItemList", "set_item_metadata") }
    open fun setItemMetadata(idx: Long, metadata: Variant) {
        _icall_Unit_Long_Variant(setItemMetadataMethodBind, this.rawMemory, idx, metadata)
    }


    private val getItemMetadataMethodBind: CPointer<godot_method_bind> by lazy { getMB("ItemList", "get_item_metadata") }
    open fun getItemMetadata(idx: Long): Variant {
        return _icall_Variant_Long(getItemMetadataMethodBind, this.rawMemory, idx)
    }


    private val setItemCustomBgColorMethodBind: CPointer<godot_method_bind> by lazy { getMB("ItemList", "set_item_custom_bg_color") }
    open fun setItemCustomBgColor(idx: Long, customBgColor: Color) {
        _icall_Unit_Long_Color(setItemCustomBgColorMethodBind, this.rawMemory, idx, customBgColor)
    }


    private val getItemCustomBgColorMethodBind: CPointer<godot_method_bind> by lazy { getMB("ItemList", "get_item_custom_bg_color") }
    open fun getItemCustomBgColor(idx: Long): Color {
        return _icall_Color_Long(getItemCustomBgColorMethodBind, this.rawMemory, idx)
    }


    private val setItemTooltipEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("ItemList", "set_item_tooltip_enabled") }
    open fun setItemTooltipEnabled(idx: Long, enable: Boolean) {
        _icall_Unit_Long_Boolean(setItemTooltipEnabledMethodBind, this.rawMemory, idx, enable)
    }


    private val isItemTooltipEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("ItemList", "is_item_tooltip_enabled") }
    open fun isItemTooltipEnabled(idx: Long): Boolean {
        return _icall_Boolean_Long(isItemTooltipEnabledMethodBind, this.rawMemory, idx)
    }


    private val setItemTooltipMethodBind: CPointer<godot_method_bind> by lazy { getMB("ItemList", "set_item_tooltip") }
    open fun setItemTooltip(idx: Long, tooltip: String) {
        _icall_Unit_Long_String(setItemTooltipMethodBind, this.rawMemory, idx, tooltip)
    }


    private val getItemTooltipMethodBind: CPointer<godot_method_bind> by lazy { getMB("ItemList", "get_item_tooltip") }
    open fun getItemTooltip(idx: Long): String {
        return _icall_String_Long(getItemTooltipMethodBind, this.rawMemory, idx)
    }


    private val selectMethodBind: CPointer<godot_method_bind> by lazy { getMB("ItemList", "select") }
    open fun select(idx: Long, single: Boolean = true) {
        _icall_Unit_Long_Boolean(selectMethodBind, this.rawMemory, idx, single)
    }


    private val unselectMethodBind: CPointer<godot_method_bind> by lazy { getMB("ItemList", "unselect") }
    open fun unselect(idx: Long) {
        _icall_Unit_Long(unselectMethodBind, this.rawMemory, idx)
    }


    private val unselectAllMethodBind: CPointer<godot_method_bind> by lazy { getMB("ItemList", "unselect_all") }
    open fun unselectAll() {
        _icall_Unit(unselectAllMethodBind, this.rawMemory)
    }


    private val isSelectedMethodBind: CPointer<godot_method_bind> by lazy { getMB("ItemList", "is_selected") }
    open fun isSelected(idx: Long): Boolean {
        return _icall_Boolean_Long(isSelectedMethodBind, this.rawMemory, idx)
    }


    private val getSelectedItemsMethodBind: CPointer<godot_method_bind> by lazy { getMB("ItemList", "get_selected_items") }
    open fun getSelectedItems(): PoolIntArray {
        return _icall_PoolIntArray(getSelectedItemsMethodBind, this.rawMemory)
    }


    private val moveItemMethodBind: CPointer<godot_method_bind> by lazy { getMB("ItemList", "move_item") }
    open fun moveItem(fromIdx: Long, toIdx: Long) {
        _icall_Unit_Long_Long(moveItemMethodBind, this.rawMemory, fromIdx, toIdx)
    }


    private val getItemCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("ItemList", "get_item_count") }
    open fun getItemCount(): Long {
        return _icall_Long(getItemCountMethodBind, this.rawMemory)
    }


    private val removeItemMethodBind: CPointer<godot_method_bind> by lazy { getMB("ItemList", "remove_item") }
    open fun removeItem(idx: Long) {
        _icall_Unit_Long(removeItemMethodBind, this.rawMemory, idx)
    }


    private val clearMethodBind: CPointer<godot_method_bind> by lazy { getMB("ItemList", "clear") }
    open fun clear() {
        _icall_Unit(clearMethodBind, this.rawMemory)
    }


    private val sortItemsByTextMethodBind: CPointer<godot_method_bind> by lazy { getMB("ItemList", "sort_items_by_text") }
    open fun sortItemsByText() {
        _icall_Unit(sortItemsByTextMethodBind, this.rawMemory)
    }


    private val setFixedColumnWidthMethodBind: CPointer<godot_method_bind> by lazy { getMB("ItemList", "set_fixed_column_width") }
    open fun setFixedColumnWidth(width: Long) {
        _icall_Unit_Long(setFixedColumnWidthMethodBind, this.rawMemory, width)
    }


    private val getFixedColumnWidthMethodBind: CPointer<godot_method_bind> by lazy { getMB("ItemList", "get_fixed_column_width") }
    open fun getFixedColumnWidth(): Long {
        return _icall_Long(getFixedColumnWidthMethodBind, this.rawMemory)
    }


    private val setSameColumnWidthMethodBind: CPointer<godot_method_bind> by lazy { getMB("ItemList", "set_same_column_width") }
    open fun setSameColumnWidth(enable: Boolean) {
        _icall_Unit_Boolean(setSameColumnWidthMethodBind, this.rawMemory, enable)
    }


    private val isSameColumnWidthMethodBind: CPointer<godot_method_bind> by lazy { getMB("ItemList", "is_same_column_width") }
    open fun isSameColumnWidth(): Boolean {
        return _icall_Boolean(isSameColumnWidthMethodBind, this.rawMemory)
    }


    private val setMaxTextLinesMethodBind: CPointer<godot_method_bind> by lazy { getMB("ItemList", "set_max_text_lines") }
    open fun setMaxTextLines(lines: Long) {
        _icall_Unit_Long(setMaxTextLinesMethodBind, this.rawMemory, lines)
    }


    private val getMaxTextLinesMethodBind: CPointer<godot_method_bind> by lazy { getMB("ItemList", "get_max_text_lines") }
    open fun getMaxTextLines(): Long {
        return _icall_Long(getMaxTextLinesMethodBind, this.rawMemory)
    }


    private val setMaxColumnsMethodBind: CPointer<godot_method_bind> by lazy { getMB("ItemList", "set_max_columns") }
    open fun setMaxColumns(amount: Long) {
        _icall_Unit_Long(setMaxColumnsMethodBind, this.rawMemory, amount)
    }


    private val getMaxColumnsMethodBind: CPointer<godot_method_bind> by lazy { getMB("ItemList", "get_max_columns") }
    open fun getMaxColumns(): Long {
        return _icall_Long(getMaxColumnsMethodBind, this.rawMemory)
    }


    private val setSelectModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("ItemList", "set_select_mode") }
    open fun setSelectMode(mode: Long) {
        _icall_Unit_Long(setSelectModeMethodBind, this.rawMemory, mode)
    }


    private val getSelectModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("ItemList", "get_select_mode") }
    open fun getSelectMode(): ItemList.SelectMode {
        return ItemList.SelectMode.fromInt(_icall_Long(getSelectModeMethodBind, this.rawMemory))
    }


    private val setIconModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("ItemList", "set_icon_mode") }
    open fun setIconMode(mode: Long) {
        _icall_Unit_Long(setIconModeMethodBind, this.rawMemory, mode)
    }


    private val getIconModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("ItemList", "get_icon_mode") }
    open fun getIconMode(): ItemList.IconMode {
        return ItemList.IconMode.fromInt(_icall_Long(getIconModeMethodBind, this.rawMemory))
    }


    private val setFixedIconSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("ItemList", "set_fixed_icon_size") }
    open fun setFixedIconSize(size: Vector2) {
        _icall_Unit_Vector2(setFixedIconSizeMethodBind, this.rawMemory, size)
    }


    private val getFixedIconSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("ItemList", "get_fixed_icon_size") }
    open fun getFixedIconSize(): Vector2 {
        return _icall_Vector2(getFixedIconSizeMethodBind, this.rawMemory)
    }


    private val setIconScaleMethodBind: CPointer<godot_method_bind> by lazy { getMB("ItemList", "set_icon_scale") }
    open fun setIconScale(scale: Double) {
        _icall_Unit_Double(setIconScaleMethodBind, this.rawMemory, scale)
    }


    private val getIconScaleMethodBind: CPointer<godot_method_bind> by lazy { getMB("ItemList", "get_icon_scale") }
    open fun getIconScale(): Double {
        return _icall_Double(getIconScaleMethodBind, this.rawMemory)
    }


    private val setAllowRmbSelectMethodBind: CPointer<godot_method_bind> by lazy { getMB("ItemList", "set_allow_rmb_select") }
    open fun setAllowRmbSelect(allow: Boolean) {
        _icall_Unit_Boolean(setAllowRmbSelectMethodBind, this.rawMemory, allow)
    }


    private val getAllowRmbSelectMethodBind: CPointer<godot_method_bind> by lazy { getMB("ItemList", "get_allow_rmb_select") }
    open fun getAllowRmbSelect(): Boolean {
        return _icall_Boolean(getAllowRmbSelectMethodBind, this.rawMemory)
    }


    private val setAllowReselectMethodBind: CPointer<godot_method_bind> by lazy { getMB("ItemList", "set_allow_reselect") }
    open fun setAllowReselect(allow: Boolean) {
        _icall_Unit_Boolean(setAllowReselectMethodBind, this.rawMemory, allow)
    }


    private val getAllowReselectMethodBind: CPointer<godot_method_bind> by lazy { getMB("ItemList", "get_allow_reselect") }
    open fun getAllowReselect(): Boolean {
        return _icall_Boolean(getAllowReselectMethodBind, this.rawMemory)
    }


    private val setAutoHeightMethodBind: CPointer<godot_method_bind> by lazy { getMB("ItemList", "set_auto_height") }
    open fun setAutoHeight(enable: Boolean) {
        _icall_Unit_Boolean(setAutoHeightMethodBind, this.rawMemory, enable)
    }


    private val hasAutoHeightMethodBind: CPointer<godot_method_bind> by lazy { getMB("ItemList", "has_auto_height") }
    open fun hasAutoHeight(): Boolean {
        return _icall_Boolean(hasAutoHeightMethodBind, this.rawMemory)
    }


    private val isAnythingSelectedMethodBind: CPointer<godot_method_bind> by lazy { getMB("ItemList", "is_anything_selected") }
    open fun isAnythingSelected(): Boolean {
        return _icall_Boolean(isAnythingSelectedMethodBind, this.rawMemory)
    }


    private val getItemAtPositionMethodBind: CPointer<godot_method_bind> by lazy { getMB("ItemList", "get_item_at_position") }
    open fun getItemAtPosition(position: Vector2, exact: Boolean = false): Long {
        return _icall_Long_Vector2_Boolean(getItemAtPositionMethodBind, this.rawMemory, position, exact)
    }


    private val ensureCurrentIsVisibleMethodBind: CPointer<godot_method_bind> by lazy { getMB("ItemList", "ensure_current_is_visible") }
    open fun ensureCurrentIsVisible() {
        _icall_Unit(ensureCurrentIsVisibleMethodBind, this.rawMemory)
    }


    private val getVScrollMethodBind: CPointer<godot_method_bind> by lazy { getMB("ItemList", "get_v_scroll") }
    open fun getVScroll(): VScrollBar {
        return _icall_VScrollBar(getVScrollMethodBind, this.rawMemory)
    }


    open fun _scroll_changed(arg0: Double) {
    }


    override fun _gui_input(arg0: InputEvent) {
    }


    open fun _set_items(arg0: GDArray) {
    }


    open fun _get_items(): GDArray {
        throw NotImplementedError("_get_items is not implemented for ItemList")
    }


}
