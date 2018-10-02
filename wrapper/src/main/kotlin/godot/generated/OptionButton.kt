@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class OptionButton : Button {
    constructor() : super("OptionButton")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 



    // Signals
    class Signal {
        companion object {
            const val ITEM_FOCUSED: String = "item_focused"
            const val ITEM_SELECTED: String = "item_selected"
        }
    }


    companion object {
        infix fun from(other: Button): OptionButton = OptionButton("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: BaseButton): OptionButton = OptionButton("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Control): OptionButton = OptionButton("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CanvasItem): OptionButton = OptionButton("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): OptionButton = OptionButton("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): OptionButton = OptionButton("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): OptionButton = fromVariant(OptionButton(""), other)


        // Constants


    }


    // Properties
    open val selected: Int
        get() = _icall_Int(getSelectedMethodBind, this.rawMemory)




    // Methods
    open fun _selected(arg0: Int) {
    }


    open fun _focused(arg0: Int) {
    }


    private val addItemMethodBind: CPointer<godot_method_bind> by lazy { getMB("OptionButton", "add_item") }
    open fun addItem(label: String, id: Int = -1) {
        _icall_Unit_String_Int(addItemMethodBind, this.rawMemory, label, id)
    }


    private val addIconItemMethodBind: CPointer<godot_method_bind> by lazy { getMB("OptionButton", "add_icon_item") }
    open fun addIconItem(texture: Texture, label: String, id: Int = -1) {
        _icall_Unit_Object_String_Int(addIconItemMethodBind, this.rawMemory, texture, label, id)
    }


    private val setItemTextMethodBind: CPointer<godot_method_bind> by lazy { getMB("OptionButton", "set_item_text") }
    open fun setItemText(idx: Int, text: String) {
        _icall_Unit_Int_String(setItemTextMethodBind, this.rawMemory, idx, text)
    }


    private val setItemIconMethodBind: CPointer<godot_method_bind> by lazy { getMB("OptionButton", "set_item_icon") }
    open fun setItemIcon(idx: Int, texture: Texture) {
        _icall_Unit_Int_Object(setItemIconMethodBind, this.rawMemory, idx, texture)
    }


    private val setItemDisabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("OptionButton", "set_item_disabled") }
    open fun setItemDisabled(idx: Int, disabled: Boolean) {
        _icall_Unit_Int_Boolean(setItemDisabledMethodBind, this.rawMemory, idx, disabled)
    }


    private val setItemIdMethodBind: CPointer<godot_method_bind> by lazy { getMB("OptionButton", "set_item_id") }
    open fun setItemId(idx: Int, id: Int) {
        _icall_Unit_Int_Int(setItemIdMethodBind, this.rawMemory, idx, id)
    }


    private val setItemMetadataMethodBind: CPointer<godot_method_bind> by lazy { getMB("OptionButton", "set_item_metadata") }
    open fun setItemMetadata(idx: Int, metadata: Variant) {
        _icall_Unit_Int_Variant(setItemMetadataMethodBind, this.rawMemory, idx, metadata)
    }


    private val getItemTextMethodBind: CPointer<godot_method_bind> by lazy { getMB("OptionButton", "get_item_text") }
    open fun getItemText(idx: Int): String {
        return _icall_String_Int(getItemTextMethodBind, this.rawMemory, idx)
    }


    private val getItemIconMethodBind: CPointer<godot_method_bind> by lazy { getMB("OptionButton", "get_item_icon") }
    open fun getItemIcon(idx: Int): Texture {
        return _icall_Texture_Int(getItemIconMethodBind, this.rawMemory, idx)
    }


    private val getItemIdMethodBind: CPointer<godot_method_bind> by lazy { getMB("OptionButton", "get_item_id") }
    open fun getItemId(idx: Int): Int {
        return _icall_Int_Int(getItemIdMethodBind, this.rawMemory, idx)
    }


    private val getItemMetadataMethodBind: CPointer<godot_method_bind> by lazy { getMB("OptionButton", "get_item_metadata") }
    open fun getItemMetadata(idx: Int): Variant {
        return _icall_Variant_Int(getItemMetadataMethodBind, this.rawMemory, idx)
    }


    private val isItemDisabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("OptionButton", "is_item_disabled") }
    open fun isItemDisabled(idx: Int): Boolean {
        return _icall_Boolean_Int(isItemDisabledMethodBind, this.rawMemory, idx)
    }


    private val getItemCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("OptionButton", "get_item_count") }
    open fun getItemCount(): Int {
        return _icall_Int(getItemCountMethodBind, this.rawMemory)
    }


    private val addSeparatorMethodBind: CPointer<godot_method_bind> by lazy { getMB("OptionButton", "add_separator") }
    open fun addSeparator() {
        _icall_Unit(addSeparatorMethodBind, this.rawMemory)
    }


    private val clearMethodBind: CPointer<godot_method_bind> by lazy { getMB("OptionButton", "clear") }
    open fun clear() {
        _icall_Unit(clearMethodBind, this.rawMemory)
    }


    private val selectMethodBind: CPointer<godot_method_bind> by lazy { getMB("OptionButton", "select") }
    open fun select(idx: Int) {
        _icall_Unit_Int(selectMethodBind, this.rawMemory, idx)
    }


    private val getSelectedMethodBind: CPointer<godot_method_bind> by lazy { getMB("OptionButton", "get_selected") }
    open fun getSelected(): Int {
        return _icall_Int(getSelectedMethodBind, this.rawMemory)
    }


    private val getSelectedIdMethodBind: CPointer<godot_method_bind> by lazy { getMB("OptionButton", "get_selected_id") }
    open fun getSelectedId(): Int {
        return _icall_Int(getSelectedIdMethodBind, this.rawMemory)
    }


    private val getSelectedMetadataMethodBind: CPointer<godot_method_bind> by lazy { getMB("OptionButton", "get_selected_metadata") }
    open fun getSelectedMetadata(): Variant {
        return _icall_Variant(getSelectedMetadataMethodBind, this.rawMemory)
    }


    private val removeItemMethodBind: CPointer<godot_method_bind> by lazy { getMB("OptionButton", "remove_item") }
    open fun removeItem(idx: Int) {
        _icall_Unit_Int(removeItemMethodBind, this.rawMemory, idx)
    }


    open fun _select_int(arg0: Int) {
    }


    private val getPopupMethodBind: CPointer<godot_method_bind> by lazy { getMB("OptionButton", "get_popup") }
    open fun getPopup(): PopupMenu {
        return _icall_PopupMenu(getPopupMethodBind, this.rawMemory)
    }


    open fun _set_items(arg0: GDArray) {
    }


    open fun _get_items(): GDArray {
        throw NotImplementedError("_get_items is not implemented for OptionButton")
    }


}
