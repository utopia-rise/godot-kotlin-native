@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class TreeItem : Object {
    private constructor() : super("")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class TreeCellMode(val id: Int) {
        CELL_MODE_STRING(0),
        CELL_MODE_CHECK(1),
        CELL_MODE_RANGE(2),
        CELL_MODE_RANGE_EXPRESSION(3),
        CELL_MODE_ICON(4),
        CELL_MODE_CUSTOM(5),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }
    enum class TextAlign(val id: Int) {
        ALIGN_LEFT(0),
        ALIGN_CENTER(1),
        ALIGN_RIGHT(2),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }


    // Signals
    class Signal {
        companion object {
        }
    }


    companion object {
        infix fun from(other: Object): TreeItem = TreeItem("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): TreeItem = fromVariant(TreeItem(""), other)


        // Constants
        const val CELL_MODE_STRING: Int = 0
        const val CELL_MODE_CHECK: Int = 1
        const val CELL_MODE_RANGE: Int = 2
        const val CELL_MODE_RANGE_EXPRESSION: Int = 3
        const val CELL_MODE_ICON: Int = 4
        const val CELL_MODE_CUSTOM: Int = 5
        const val ALIGN_LEFT: Int = 0
        const val ALIGN_CENTER: Int = 1
        const val ALIGN_RIGHT: Int = 2


    }


    // Properties
    open var collapsed: Boolean
        get() = _icall_Boolean(isCollapsedMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setCollapsedMethodBind, this.rawMemory, value)


    open var disableFolding: Boolean
        get() = _icall_Boolean(isFoldingDisabledMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setDisableFoldingMethodBind, this.rawMemory, value)


    open var customMinimumHeight: Int
        get() = _icall_Int(getCustomMinimumHeightMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setCustomMinimumHeightMethodBind, this.rawMemory, value)




    // Methods
    private val setCellModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("TreeItem", "set_cell_mode") }
    open fun setCellMode(column: Int, mode: Int) {
        _icall_Unit_Int_Int(setCellModeMethodBind, this.rawMemory, column, mode)
    }


    private val getCellModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("TreeItem", "get_cell_mode") }
    open fun getCellMode(column: Int): TreeItem.TreeCellMode {
        return TreeItem.TreeCellMode.fromInt(_icall_Int_Int(getCellModeMethodBind, this.rawMemory, column))
    }


    private val setCheckedMethodBind: CPointer<godot_method_bind> by lazy { getMB("TreeItem", "set_checked") }
    open fun setChecked(column: Int, checked: Boolean) {
        _icall_Unit_Int_Boolean(setCheckedMethodBind, this.rawMemory, column, checked)
    }


    private val isCheckedMethodBind: CPointer<godot_method_bind> by lazy { getMB("TreeItem", "is_checked") }
    open fun isChecked(column: Int): Boolean {
        return _icall_Boolean_Int(isCheckedMethodBind, this.rawMemory, column)
    }


    private val setTextMethodBind: CPointer<godot_method_bind> by lazy { getMB("TreeItem", "set_text") }
    open fun setText(column: Int, text: String) {
        _icall_Unit_Int_String(setTextMethodBind, this.rawMemory, column, text)
    }


    private val getTextMethodBind: CPointer<godot_method_bind> by lazy { getMB("TreeItem", "get_text") }
    open fun getText(column: Int): String {
        return _icall_String_Int(getTextMethodBind, this.rawMemory, column)
    }


    private val setIconMethodBind: CPointer<godot_method_bind> by lazy { getMB("TreeItem", "set_icon") }
    open fun setIcon(column: Int, texture: Texture) {
        _icall_Unit_Int_Object(setIconMethodBind, this.rawMemory, column, texture)
    }


    private val getIconMethodBind: CPointer<godot_method_bind> by lazy { getMB("TreeItem", "get_icon") }
    open fun getIcon(column: Int): Texture {
        return _icall_Texture_Int(getIconMethodBind, this.rawMemory, column)
    }


    private val setIconRegionMethodBind: CPointer<godot_method_bind> by lazy { getMB("TreeItem", "set_icon_region") }
    open fun setIconRegion(column: Int, region: Rect2) {
        _icall_Unit_Int_Rect2(setIconRegionMethodBind, this.rawMemory, column, region)
    }


    private val getIconRegionMethodBind: CPointer<godot_method_bind> by lazy { getMB("TreeItem", "get_icon_region") }
    open fun getIconRegion(column: Int): Rect2 {
        return _icall_Rect2_Int(getIconRegionMethodBind, this.rawMemory, column)
    }


    private val setIconMaxWidthMethodBind: CPointer<godot_method_bind> by lazy { getMB("TreeItem", "set_icon_max_width") }
    open fun setIconMaxWidth(column: Int, width: Int) {
        _icall_Unit_Int_Int(setIconMaxWidthMethodBind, this.rawMemory, column, width)
    }


    private val getIconMaxWidthMethodBind: CPointer<godot_method_bind> by lazy { getMB("TreeItem", "get_icon_max_width") }
    open fun getIconMaxWidth(column: Int): Int {
        return _icall_Int_Int(getIconMaxWidthMethodBind, this.rawMemory, column)
    }


    private val setRangeMethodBind: CPointer<godot_method_bind> by lazy { getMB("TreeItem", "set_range") }
    open fun setRange(column: Int, value: Float) {
        _icall_Unit_Int_Float(setRangeMethodBind, this.rawMemory, column, value)
    }


    private val getRangeMethodBind: CPointer<godot_method_bind> by lazy { getMB("TreeItem", "get_range") }
    open fun getRange(column: Int): Float {
        return _icall_Float_Int(getRangeMethodBind, this.rawMemory, column)
    }


    private val setRangeConfigMethodBind: CPointer<godot_method_bind> by lazy { getMB("TreeItem", "set_range_config") }
    open fun setRangeConfig(column: Int, min: Float, max: Float, step: Float, expr: Boolean = false) {
        _icall_Unit_Int_Float_Float_Float_Boolean(setRangeConfigMethodBind, this.rawMemory, column, min, max, step, expr)
    }


    private val getRangeConfigMethodBind: CPointer<godot_method_bind> by lazy { getMB("TreeItem", "get_range_config") }
    open fun getRangeConfig(column: Int): Dictionary {
        return _icall_Dictionary_Int(getRangeConfigMethodBind, this.rawMemory, column)
    }


    private val setMetadataMethodBind: CPointer<godot_method_bind> by lazy { getMB("TreeItem", "set_metadata") }
    open fun setMetadata(column: Int, meta: Variant) {
        _icall_Unit_Int_Variant(setMetadataMethodBind, this.rawMemory, column, meta)
    }


    private val getMetadataMethodBind: CPointer<godot_method_bind> by lazy { getMB("TreeItem", "get_metadata") }
    open fun getMetadata(column: Int): Variant {
        return _icall_Variant_Int(getMetadataMethodBind, this.rawMemory, column)
    }


    private val setCustomDrawMethodBind: CPointer<godot_method_bind> by lazy { getMB("TreeItem", "set_custom_draw") }
    open fun setCustomDraw(column: Int, _object: Object, callback: String) {
        _icall_Unit_Int_Object_String(setCustomDrawMethodBind, this.rawMemory, column, _object, callback)
    }


    private val setCollapsedMethodBind: CPointer<godot_method_bind> by lazy { getMB("TreeItem", "set_collapsed") }
    open fun setCollapsed(enable: Boolean) {
        _icall_Unit_Boolean(setCollapsedMethodBind, this.rawMemory, enable)
    }


    private val isCollapsedMethodBind: CPointer<godot_method_bind> by lazy { getMB("TreeItem", "is_collapsed") }
    open fun isCollapsed(): Boolean {
        return _icall_Boolean(isCollapsedMethodBind, this.rawMemory)
    }


    private val setCustomMinimumHeightMethodBind: CPointer<godot_method_bind> by lazy { getMB("TreeItem", "set_custom_minimum_height") }
    open fun setCustomMinimumHeight(height: Int) {
        _icall_Unit_Int(setCustomMinimumHeightMethodBind, this.rawMemory, height)
    }


    private val getCustomMinimumHeightMethodBind: CPointer<godot_method_bind> by lazy { getMB("TreeItem", "get_custom_minimum_height") }
    open fun getCustomMinimumHeight(): Int {
        return _icall_Int(getCustomMinimumHeightMethodBind, this.rawMemory)
    }


    private val getNextMethodBind: CPointer<godot_method_bind> by lazy { getMB("TreeItem", "get_next") }
    open fun getNext(): TreeItem {
        return _icall_TreeItem(getNextMethodBind, this.rawMemory)
    }


    private val getPrevMethodBind: CPointer<godot_method_bind> by lazy { getMB("TreeItem", "get_prev") }
    open fun getPrev(): TreeItem {
        return _icall_TreeItem(getPrevMethodBind, this.rawMemory)
    }


    private val getParentMethodBind: CPointer<godot_method_bind> by lazy { getMB("TreeItem", "get_parent") }
    open fun getParent(): TreeItem {
        return _icall_TreeItem(getParentMethodBind, this.rawMemory)
    }


    private val getChildrenMethodBind: CPointer<godot_method_bind> by lazy { getMB("TreeItem", "get_children") }
    open fun getChildren(): TreeItem {
        return _icall_TreeItem(getChildrenMethodBind, this.rawMemory)
    }


    private val getNextVisibleMethodBind: CPointer<godot_method_bind> by lazy { getMB("TreeItem", "get_next_visible") }
    open fun getNextVisible(): TreeItem {
        return _icall_TreeItem(getNextVisibleMethodBind, this.rawMemory)
    }


    private val getPrevVisibleMethodBind: CPointer<godot_method_bind> by lazy { getMB("TreeItem", "get_prev_visible") }
    open fun getPrevVisible(): TreeItem {
        return _icall_TreeItem(getPrevVisibleMethodBind, this.rawMemory)
    }


    private val removeChildMethodBind: CPointer<godot_method_bind> by lazy { getMB("TreeItem", "remove_child") }
    open fun removeChild(child: Object) {
        _icall_Unit_Object(removeChildMethodBind, this.rawMemory, child)
    }


    private val setSelectableMethodBind: CPointer<godot_method_bind> by lazy { getMB("TreeItem", "set_selectable") }
    open fun setSelectable(column: Int, selectable: Boolean) {
        _icall_Unit_Int_Boolean(setSelectableMethodBind, this.rawMemory, column, selectable)
    }


    private val isSelectableMethodBind: CPointer<godot_method_bind> by lazy { getMB("TreeItem", "is_selectable") }
    open fun isSelectable(column: Int): Boolean {
        return _icall_Boolean_Int(isSelectableMethodBind, this.rawMemory, column)
    }


    private val isSelectedMethodBind: CPointer<godot_method_bind> by lazy { getMB("TreeItem", "is_selected") }
    open fun isSelected(column: Int): Boolean {
        return _icall_Boolean_Int(isSelectedMethodBind, this.rawMemory, column)
    }


    private val selectMethodBind: CPointer<godot_method_bind> by lazy { getMB("TreeItem", "select") }
    open fun select(column: Int) {
        _icall_Unit_Int(selectMethodBind, this.rawMemory, column)
    }


    private val deselectMethodBind: CPointer<godot_method_bind> by lazy { getMB("TreeItem", "deselect") }
    open fun deselect(column: Int) {
        _icall_Unit_Int(deselectMethodBind, this.rawMemory, column)
    }


    private val setEditableMethodBind: CPointer<godot_method_bind> by lazy { getMB("TreeItem", "set_editable") }
    open fun setEditable(column: Int, enabled: Boolean) {
        _icall_Unit_Int_Boolean(setEditableMethodBind, this.rawMemory, column, enabled)
    }


    private val isEditableMethodBind: CPointer<godot_method_bind> by lazy { getMB("TreeItem", "is_editable") }
    open fun isEditable(column: Int): Boolean {
        return _icall_Boolean_Int(isEditableMethodBind, this.rawMemory, column)
    }


    private val setCustomColorMethodBind: CPointer<godot_method_bind> by lazy { getMB("TreeItem", "set_custom_color") }
    open fun setCustomColor(column: Int, color: Color) {
        _icall_Unit_Int_Color(setCustomColorMethodBind, this.rawMemory, column, color)
    }


    private val clearCustomColorMethodBind: CPointer<godot_method_bind> by lazy { getMB("TreeItem", "clear_custom_color") }
    open fun clearCustomColor(column: Int) {
        _icall_Unit_Int(clearCustomColorMethodBind, this.rawMemory, column)
    }


    private val setCustomBgColorMethodBind: CPointer<godot_method_bind> by lazy { getMB("TreeItem", "set_custom_bg_color") }
    open fun setCustomBgColor(column: Int, color: Color, justOutline: Boolean = false) {
        _icall_Unit_Int_Color_Boolean(setCustomBgColorMethodBind, this.rawMemory, column, color, justOutline)
    }


    private val clearCustomBgColorMethodBind: CPointer<godot_method_bind> by lazy { getMB("TreeItem", "clear_custom_bg_color") }
    open fun clearCustomBgColor(column: Int) {
        _icall_Unit_Int(clearCustomBgColorMethodBind, this.rawMemory, column)
    }


    private val getCustomBgColorMethodBind: CPointer<godot_method_bind> by lazy { getMB("TreeItem", "get_custom_bg_color") }
    open fun getCustomBgColor(column: Int): Color {
        return _icall_Color_Int(getCustomBgColorMethodBind, this.rawMemory, column)
    }


    private val setCustomAsButtonMethodBind: CPointer<godot_method_bind> by lazy { getMB("TreeItem", "set_custom_as_button") }
    open fun setCustomAsButton(column: Int, enable: Boolean) {
        _icall_Unit_Int_Boolean(setCustomAsButtonMethodBind, this.rawMemory, column, enable)
    }


    private val isCustomSetAsButtonMethodBind: CPointer<godot_method_bind> by lazy { getMB("TreeItem", "is_custom_set_as_button") }
    open fun isCustomSetAsButton(column: Int): Boolean {
        return _icall_Boolean_Int(isCustomSetAsButtonMethodBind, this.rawMemory, column)
    }


    private val addButtonMethodBind: CPointer<godot_method_bind> by lazy { getMB("TreeItem", "add_button") }
    open fun addButton(column: Int, button: Texture, buttonIdx: Int = -1, disabled: Boolean = false, tooltip: String = "") {
        _icall_Unit_Int_Object_Int_Boolean_String(addButtonMethodBind, this.rawMemory, column, button, buttonIdx, disabled, tooltip)
    }


    private val getButtonCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("TreeItem", "get_button_count") }
    open fun getButtonCount(column: Int): Int {
        return _icall_Int_Int(getButtonCountMethodBind, this.rawMemory, column)
    }


    private val getButtonMethodBind: CPointer<godot_method_bind> by lazy { getMB("TreeItem", "get_button") }
    open fun getButton(column: Int, buttonIdx: Int): Texture {
        return _icall_Texture_Int_Int(getButtonMethodBind, this.rawMemory, column, buttonIdx)
    }


    private val setButtonMethodBind: CPointer<godot_method_bind> by lazy { getMB("TreeItem", "set_button") }
    open fun setButton(column: Int, buttonIdx: Int, button: Texture) {
        _icall_Unit_Int_Int_Object(setButtonMethodBind, this.rawMemory, column, buttonIdx, button)
    }


    private val eraseButtonMethodBind: CPointer<godot_method_bind> by lazy { getMB("TreeItem", "erase_button") }
    open fun eraseButton(column: Int, buttonIdx: Int) {
        _icall_Unit_Int_Int(eraseButtonMethodBind, this.rawMemory, column, buttonIdx)
    }


    private val isButtonDisabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("TreeItem", "is_button_disabled") }
    open fun isButtonDisabled(column: Int, buttonIdx: Int): Boolean {
        return _icall_Boolean_Int_Int(isButtonDisabledMethodBind, this.rawMemory, column, buttonIdx)
    }


    private val setExpandRightMethodBind: CPointer<godot_method_bind> by lazy { getMB("TreeItem", "set_expand_right") }
    open fun setExpandRight(column: Int, enable: Boolean) {
        _icall_Unit_Int_Boolean(setExpandRightMethodBind, this.rawMemory, column, enable)
    }


    private val getExpandRightMethodBind: CPointer<godot_method_bind> by lazy { getMB("TreeItem", "get_expand_right") }
    open fun getExpandRight(column: Int): Boolean {
        return _icall_Boolean_Int(getExpandRightMethodBind, this.rawMemory, column)
    }


    private val setTooltipMethodBind: CPointer<godot_method_bind> by lazy { getMB("TreeItem", "set_tooltip") }
    open fun setTooltip(column: Int, tooltip: String) {
        _icall_Unit_Int_String(setTooltipMethodBind, this.rawMemory, column, tooltip)
    }


    private val getTooltipMethodBind: CPointer<godot_method_bind> by lazy { getMB("TreeItem", "get_tooltip") }
    open fun getTooltip(column: Int): String {
        return _icall_String_Int(getTooltipMethodBind, this.rawMemory, column)
    }


    private val setTextAlignMethodBind: CPointer<godot_method_bind> by lazy { getMB("TreeItem", "set_text_align") }
    open fun setTextAlign(column: Int, textAlign: Int) {
        _icall_Unit_Int_Int(setTextAlignMethodBind, this.rawMemory, column, textAlign)
    }


    private val getTextAlignMethodBind: CPointer<godot_method_bind> by lazy { getMB("TreeItem", "get_text_align") }
    open fun getTextAlign(column: Int): TreeItem.TextAlign {
        return TreeItem.TextAlign.fromInt(_icall_Int_Int(getTextAlignMethodBind, this.rawMemory, column))
    }


    private val moveToTopMethodBind: CPointer<godot_method_bind> by lazy { getMB("TreeItem", "move_to_top") }
    open fun moveToTop() {
        _icall_Unit(moveToTopMethodBind, this.rawMemory)
    }


    private val moveToBottomMethodBind: CPointer<godot_method_bind> by lazy { getMB("TreeItem", "move_to_bottom") }
    open fun moveToBottom() {
        _icall_Unit(moveToBottomMethodBind, this.rawMemory)
    }


    private val setDisableFoldingMethodBind: CPointer<godot_method_bind> by lazy { getMB("TreeItem", "set_disable_folding") }
    open fun setDisableFolding(disable: Boolean) {
        _icall_Unit_Boolean(setDisableFoldingMethodBind, this.rawMemory, disable)
    }


    private val isFoldingDisabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("TreeItem", "is_folding_disabled") }
    open fun isFoldingDisabled(): Boolean {
        return _icall_Boolean(isFoldingDisabledMethodBind, this.rawMemory)
    }


}
