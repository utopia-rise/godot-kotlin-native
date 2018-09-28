@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class PopupMenu : Popup {
    constructor() : super("PopupMenu")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 



    // Signals
    class Signal {
        companion object {
            const val INDEX_PRESSED: String = "index_pressed"
            const val ID_FOCUSED: String = "id_focused"
            const val ID_PRESSED: String = "id_pressed"
        }
    }


    companion object {
        infix fun from(other: Popup): PopupMenu = PopupMenu("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Control): PopupMenu = PopupMenu("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CanvasItem): PopupMenu = PopupMenu("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): PopupMenu = PopupMenu("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): PopupMenu = PopupMenu("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): PopupMenu = fromVariant(PopupMenu(""), other)


        // Constants


    }


    // Properties
    open var hideOnItemSelection: Boolean
        get() = _icall_Boolean(isHideOnItemSelectionMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setHideOnItemSelectionMethodBind, this.rawMemory, value)


    open var hideOnCheckableItemSelection: Boolean
        get() = _icall_Boolean(isHideOnCheckableItemSelectionMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setHideOnCheckableItemSelectionMethodBind, this.rawMemory, value)


    open var hideOnStateItemSelection: Boolean
        get() = _icall_Boolean(isHideOnStateItemSelectionMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setHideOnStateItemSelectionMethodBind, this.rawMemory, value)


    open var submenuPopupDelay: Float
        get() = _icall_Float(getSubmenuPopupDelayMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setSubmenuPopupDelayMethodBind, this.rawMemory, value)




    // Methods
    override fun _gui_input(arg0: InputEvent) {
    }


    private val addIconItemMethodBind: CPointer<godot_method_bind> by lazy { getMB("PopupMenu", "add_icon_item") }
    open fun addIconItem(texture: Texture, label: String, id: Int = -1, accel: Int = 0) {
        _icall_Unit_Object_String_Int_Int(addIconItemMethodBind, this.rawMemory, texture, label, id, accel)
    }


    private val addItemMethodBind: CPointer<godot_method_bind> by lazy { getMB("PopupMenu", "add_item") }
    open fun addItem(label: String, id: Int = -1, accel: Int = 0) {
        _icall_Unit_String_Int_Int(addItemMethodBind, this.rawMemory, label, id, accel)
    }


    private val addIconCheckItemMethodBind: CPointer<godot_method_bind> by lazy { getMB("PopupMenu", "add_icon_check_item") }
    open fun addIconCheckItem(texture: Texture, label: String, id: Int = -1, accel: Int = 0) {
        _icall_Unit_Object_String_Int_Int(addIconCheckItemMethodBind, this.rawMemory, texture, label, id, accel)
    }


    private val addCheckItemMethodBind: CPointer<godot_method_bind> by lazy { getMB("PopupMenu", "add_check_item") }
    open fun addCheckItem(label: String, id: Int = -1, accel: Int = 0) {
        _icall_Unit_String_Int_Int(addCheckItemMethodBind, this.rawMemory, label, id, accel)
    }


    private val addRadioCheckItemMethodBind: CPointer<godot_method_bind> by lazy { getMB("PopupMenu", "add_radio_check_item") }
    open fun addRadioCheckItem(label: String, id: Int = -1, accel: Int = 0) {
        _icall_Unit_String_Int_Int(addRadioCheckItemMethodBind, this.rawMemory, label, id, accel)
    }


    private val addSubmenuItemMethodBind: CPointer<godot_method_bind> by lazy { getMB("PopupMenu", "add_submenu_item") }
    open fun addSubmenuItem(label: String, submenu: String, id: Int = -1) {
        _icall_Unit_String_String_Int(addSubmenuItemMethodBind, this.rawMemory, label, submenu, id)
    }


    private val addIconShortcutMethodBind: CPointer<godot_method_bind> by lazy { getMB("PopupMenu", "add_icon_shortcut") }
    open fun addIconShortcut(texture: Texture, shortcut: ShortCut, id: Int = -1, global: Boolean = false) {
        _icall_Unit_Object_Object_Int_Boolean(addIconShortcutMethodBind, this.rawMemory, texture, shortcut, id, global)
    }


    private val addShortcutMethodBind: CPointer<godot_method_bind> by lazy { getMB("PopupMenu", "add_shortcut") }
    open fun addShortcut(shortcut: ShortCut, id: Int = -1, global: Boolean = false) {
        _icall_Unit_Object_Int_Boolean(addShortcutMethodBind, this.rawMemory, shortcut, id, global)
    }


    private val addIconCheckShortcutMethodBind: CPointer<godot_method_bind> by lazy { getMB("PopupMenu", "add_icon_check_shortcut") }
    open fun addIconCheckShortcut(texture: Texture, shortcut: ShortCut, id: Int = -1, global: Boolean = false) {
        _icall_Unit_Object_Object_Int_Boolean(addIconCheckShortcutMethodBind, this.rawMemory, texture, shortcut, id, global)
    }


    private val addCheckShortcutMethodBind: CPointer<godot_method_bind> by lazy { getMB("PopupMenu", "add_check_shortcut") }
    open fun addCheckShortcut(shortcut: ShortCut, id: Int = -1, global: Boolean = false) {
        _icall_Unit_Object_Int_Boolean(addCheckShortcutMethodBind, this.rawMemory, shortcut, id, global)
    }


    private val addRadioCheckShortcutMethodBind: CPointer<godot_method_bind> by lazy { getMB("PopupMenu", "add_radio_check_shortcut") }
    open fun addRadioCheckShortcut(shortcut: ShortCut, id: Int = -1, global: Boolean = false) {
        _icall_Unit_Object_Int_Boolean(addRadioCheckShortcutMethodBind, this.rawMemory, shortcut, id, global)
    }


    private val setItemTextMethodBind: CPointer<godot_method_bind> by lazy { getMB("PopupMenu", "set_item_text") }
    open fun setItemText(idx: Int, text: String) {
        _icall_Unit_Int_String(setItemTextMethodBind, this.rawMemory, idx, text)
    }


    private val setItemIconMethodBind: CPointer<godot_method_bind> by lazy { getMB("PopupMenu", "set_item_icon") }
    open fun setItemIcon(idx: Int, icon: Texture) {
        _icall_Unit_Int_Object(setItemIconMethodBind, this.rawMemory, idx, icon)
    }


    private val setItemCheckedMethodBind: CPointer<godot_method_bind> by lazy { getMB("PopupMenu", "set_item_checked") }
    open fun setItemChecked(idx: Int, checked: Boolean) {
        _icall_Unit_Int_Boolean(setItemCheckedMethodBind, this.rawMemory, idx, checked)
    }


    private val setItemIdMethodBind: CPointer<godot_method_bind> by lazy { getMB("PopupMenu", "set_item_id") }
    open fun setItemId(idx: Int, id: Int) {
        _icall_Unit_Int_Int(setItemIdMethodBind, this.rawMemory, idx, id)
    }


    private val setItemAcceleratorMethodBind: CPointer<godot_method_bind> by lazy { getMB("PopupMenu", "set_item_accelerator") }
    open fun setItemAccelerator(idx: Int, accel: Int) {
        _icall_Unit_Int_Int(setItemAcceleratorMethodBind, this.rawMemory, idx, accel)
    }


    private val setItemMetadataMethodBind: CPointer<godot_method_bind> by lazy { getMB("PopupMenu", "set_item_metadata") }
    open fun setItemMetadata(idx: Int, metadata: Variant) {
        _icall_Unit_Int_Variant(setItemMetadataMethodBind, this.rawMemory, idx, metadata)
    }


    private val setItemDisabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("PopupMenu", "set_item_disabled") }
    open fun setItemDisabled(idx: Int, disabled: Boolean) {
        _icall_Unit_Int_Boolean(setItemDisabledMethodBind, this.rawMemory, idx, disabled)
    }


    private val setItemSubmenuMethodBind: CPointer<godot_method_bind> by lazy { getMB("PopupMenu", "set_item_submenu") }
    open fun setItemSubmenu(idx: Int, submenu: String) {
        _icall_Unit_Int_String(setItemSubmenuMethodBind, this.rawMemory, idx, submenu)
    }


    private val setItemAsSeparatorMethodBind: CPointer<godot_method_bind> by lazy { getMB("PopupMenu", "set_item_as_separator") }
    open fun setItemAsSeparator(idx: Int, enable: Boolean) {
        _icall_Unit_Int_Boolean(setItemAsSeparatorMethodBind, this.rawMemory, idx, enable)
    }


    private val setItemAsCheckableMethodBind: CPointer<godot_method_bind> by lazy { getMB("PopupMenu", "set_item_as_checkable") }
    open fun setItemAsCheckable(idx: Int, enable: Boolean) {
        _icall_Unit_Int_Boolean(setItemAsCheckableMethodBind, this.rawMemory, idx, enable)
    }


    private val setItemAsRadioCheckableMethodBind: CPointer<godot_method_bind> by lazy { getMB("PopupMenu", "set_item_as_radio_checkable") }
    open fun setItemAsRadioCheckable(idx: Int, enable: Boolean) {
        _icall_Unit_Int_Boolean(setItemAsRadioCheckableMethodBind, this.rawMemory, idx, enable)
    }


    private val setItemTooltipMethodBind: CPointer<godot_method_bind> by lazy { getMB("PopupMenu", "set_item_tooltip") }
    open fun setItemTooltip(idx: Int, tooltip: String) {
        _icall_Unit_Int_String(setItemTooltipMethodBind, this.rawMemory, idx, tooltip)
    }


    private val setItemShortcutMethodBind: CPointer<godot_method_bind> by lazy { getMB("PopupMenu", "set_item_shortcut") }
    open fun setItemShortcut(idx: Int, shortcut: ShortCut, global: Boolean = false) {
        _icall_Unit_Int_Object_Boolean(setItemShortcutMethodBind, this.rawMemory, idx, shortcut, global)
    }


    private val setItemMultistateMethodBind: CPointer<godot_method_bind> by lazy { getMB("PopupMenu", "set_item_multistate") }
    open fun setItemMultistate(idx: Int, state: Int) {
        _icall_Unit_Int_Int(setItemMultistateMethodBind, this.rawMemory, idx, state)
    }


    private val setItemShortcutDisabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("PopupMenu", "set_item_shortcut_disabled") }
    open fun setItemShortcutDisabled(idx: Int, disabled: Boolean) {
        _icall_Unit_Int_Boolean(setItemShortcutDisabledMethodBind, this.rawMemory, idx, disabled)
    }


    private val toggleItemCheckedMethodBind: CPointer<godot_method_bind> by lazy { getMB("PopupMenu", "toggle_item_checked") }
    open fun toggleItemChecked(idx: Int) {
        _icall_Unit_Int(toggleItemCheckedMethodBind, this.rawMemory, idx)
    }


    private val toggleItemMultistateMethodBind: CPointer<godot_method_bind> by lazy { getMB("PopupMenu", "toggle_item_multistate") }
    open fun toggleItemMultistate(idx: Int) {
        _icall_Unit_Int(toggleItemMultistateMethodBind, this.rawMemory, idx)
    }


    private val getItemTextMethodBind: CPointer<godot_method_bind> by lazy { getMB("PopupMenu", "get_item_text") }
    open fun getItemText(idx: Int): String {
        return _icall_String_Int(getItemTextMethodBind, this.rawMemory, idx)
    }


    private val getItemIconMethodBind: CPointer<godot_method_bind> by lazy { getMB("PopupMenu", "get_item_icon") }
    open fun getItemIcon(idx: Int): Texture {
        return _icall_Texture_Int(getItemIconMethodBind, this.rawMemory, idx)
    }


    private val isItemCheckedMethodBind: CPointer<godot_method_bind> by lazy { getMB("PopupMenu", "is_item_checked") }
    open fun isItemChecked(idx: Int): Boolean {
        return _icall_Boolean_Int(isItemCheckedMethodBind, this.rawMemory, idx)
    }


    private val getItemIdMethodBind: CPointer<godot_method_bind> by lazy { getMB("PopupMenu", "get_item_id") }
    open fun getItemId(idx: Int): Int {
        return _icall_Int_Int(getItemIdMethodBind, this.rawMemory, idx)
    }


    private val getItemIndexMethodBind: CPointer<godot_method_bind> by lazy { getMB("PopupMenu", "get_item_index") }
    open fun getItemIndex(id: Int): Int {
        return _icall_Int_Int(getItemIndexMethodBind, this.rawMemory, id)
    }


    private val getItemAcceleratorMethodBind: CPointer<godot_method_bind> by lazy { getMB("PopupMenu", "get_item_accelerator") }
    open fun getItemAccelerator(idx: Int): Int {
        return _icall_Int_Int(getItemAcceleratorMethodBind, this.rawMemory, idx)
    }


    private val getItemMetadataMethodBind: CPointer<godot_method_bind> by lazy { getMB("PopupMenu", "get_item_metadata") }
    open fun getItemMetadata(idx: Int): Variant {
        return _icall_Variant_Int(getItemMetadataMethodBind, this.rawMemory, idx)
    }


    private val isItemDisabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("PopupMenu", "is_item_disabled") }
    open fun isItemDisabled(idx: Int): Boolean {
        return _icall_Boolean_Int(isItemDisabledMethodBind, this.rawMemory, idx)
    }


    private val getItemSubmenuMethodBind: CPointer<godot_method_bind> by lazy { getMB("PopupMenu", "get_item_submenu") }
    open fun getItemSubmenu(idx: Int): String {
        return _icall_String_Int(getItemSubmenuMethodBind, this.rawMemory, idx)
    }


    private val isItemSeparatorMethodBind: CPointer<godot_method_bind> by lazy { getMB("PopupMenu", "is_item_separator") }
    open fun isItemSeparator(idx: Int): Boolean {
        return _icall_Boolean_Int(isItemSeparatorMethodBind, this.rawMemory, idx)
    }


    private val isItemCheckableMethodBind: CPointer<godot_method_bind> by lazy { getMB("PopupMenu", "is_item_checkable") }
    open fun isItemCheckable(idx: Int): Boolean {
        return _icall_Boolean_Int(isItemCheckableMethodBind, this.rawMemory, idx)
    }


    private val isItemRadioCheckableMethodBind: CPointer<godot_method_bind> by lazy { getMB("PopupMenu", "is_item_radio_checkable") }
    open fun isItemRadioCheckable(idx: Int): Boolean {
        return _icall_Boolean_Int(isItemRadioCheckableMethodBind, this.rawMemory, idx)
    }


    private val isItemShortcutDisabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("PopupMenu", "is_item_shortcut_disabled") }
    open fun isItemShortcutDisabled(idx: Int): Boolean {
        return _icall_Boolean_Int(isItemShortcutDisabledMethodBind, this.rawMemory, idx)
    }


    private val getItemTooltipMethodBind: CPointer<godot_method_bind> by lazy { getMB("PopupMenu", "get_item_tooltip") }
    open fun getItemTooltip(idx: Int): String {
        return _icall_String_Int(getItemTooltipMethodBind, this.rawMemory, idx)
    }


    private val getItemShortcutMethodBind: CPointer<godot_method_bind> by lazy { getMB("PopupMenu", "get_item_shortcut") }
    open fun getItemShortcut(idx: Int): ShortCut {
        return _icall_ShortCut_Int(getItemShortcutMethodBind, this.rawMemory, idx)
    }


    private val getItemCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("PopupMenu", "get_item_count") }
    open fun getItemCount(): Int {
        return _icall_Int(getItemCountMethodBind, this.rawMemory)
    }


    private val removeItemMethodBind: CPointer<godot_method_bind> by lazy { getMB("PopupMenu", "remove_item") }
    open fun removeItem(idx: Int) {
        _icall_Unit_Int(removeItemMethodBind, this.rawMemory, idx)
    }


    private val addSeparatorMethodBind: CPointer<godot_method_bind> by lazy { getMB("PopupMenu", "add_separator") }
    open fun addSeparator(label: String = "") {
        _icall_Unit_String(addSeparatorMethodBind, this.rawMemory, label)
    }


    private val clearMethodBind: CPointer<godot_method_bind> by lazy { getMB("PopupMenu", "clear") }
    open fun clear() {
        _icall_Unit(clearMethodBind, this.rawMemory)
    }


    open fun _set_items(arg0: GDArray) {
    }


    open fun _get_items(): GDArray {
        throw NotImplementedError("_get_items is not implemented for PopupMenu")
    }


    private val setHideOnItemSelectionMethodBind: CPointer<godot_method_bind> by lazy { getMB("PopupMenu", "set_hide_on_item_selection") }
    open fun setHideOnItemSelection(enable: Boolean) {
        _icall_Unit_Boolean(setHideOnItemSelectionMethodBind, this.rawMemory, enable)
    }


    private val isHideOnItemSelectionMethodBind: CPointer<godot_method_bind> by lazy { getMB("PopupMenu", "is_hide_on_item_selection") }
    open fun isHideOnItemSelection(): Boolean {
        return _icall_Boolean(isHideOnItemSelectionMethodBind, this.rawMemory)
    }


    private val setHideOnCheckableItemSelectionMethodBind: CPointer<godot_method_bind> by lazy { getMB("PopupMenu", "set_hide_on_checkable_item_selection") }
    open fun setHideOnCheckableItemSelection(enable: Boolean) {
        _icall_Unit_Boolean(setHideOnCheckableItemSelectionMethodBind, this.rawMemory, enable)
    }


    private val isHideOnCheckableItemSelectionMethodBind: CPointer<godot_method_bind> by lazy { getMB("PopupMenu", "is_hide_on_checkable_item_selection") }
    open fun isHideOnCheckableItemSelection(): Boolean {
        return _icall_Boolean(isHideOnCheckableItemSelectionMethodBind, this.rawMemory)
    }


    private val setHideOnStateItemSelectionMethodBind: CPointer<godot_method_bind> by lazy { getMB("PopupMenu", "set_hide_on_state_item_selection") }
    open fun setHideOnStateItemSelection(enable: Boolean) {
        _icall_Unit_Boolean(setHideOnStateItemSelectionMethodBind, this.rawMemory, enable)
    }


    private val isHideOnStateItemSelectionMethodBind: CPointer<godot_method_bind> by lazy { getMB("PopupMenu", "is_hide_on_state_item_selection") }
    open fun isHideOnStateItemSelection(): Boolean {
        return _icall_Boolean(isHideOnStateItemSelectionMethodBind, this.rawMemory)
    }


    private val setSubmenuPopupDelayMethodBind: CPointer<godot_method_bind> by lazy { getMB("PopupMenu", "set_submenu_popup_delay") }
    open fun setSubmenuPopupDelay(seconds: Float) {
        _icall_Unit_Float(setSubmenuPopupDelayMethodBind, this.rawMemory, seconds)
    }


    private val getSubmenuPopupDelayMethodBind: CPointer<godot_method_bind> by lazy { getMB("PopupMenu", "get_submenu_popup_delay") }
    open fun getSubmenuPopupDelay(): Float {
        return _icall_Float(getSubmenuPopupDelayMethodBind, this.rawMemory)
    }


    open fun _submenu_timeout() {
    }


}
