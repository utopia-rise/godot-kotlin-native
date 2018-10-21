@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class ColorPickerButton : Button {
    constructor() : super("ColorPickerButton")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 



    // Signals
    class Signal {
        companion object {
            const val POPUP_CLOSED: String = "popup_closed"
            const val COLOR_CHANGED: String = "color_changed"
        }
    }


    companion object {
        infix fun from(other: Button): ColorPickerButton = ColorPickerButton("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: BaseButton): ColorPickerButton = ColorPickerButton("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Control): ColorPickerButton = ColorPickerButton("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CanvasItem): ColorPickerButton = ColorPickerButton("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): ColorPickerButton = ColorPickerButton("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): ColorPickerButton = ColorPickerButton("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): ColorPickerButton = fromVariant(ColorPickerButton(""), other)


        // Constants


    }


    // Properties
    open var color: Color
        get() = _icall_Color(getPickColorMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Color(setPickColorMethodBind, this.rawMemory, value)
    open fun color(shedule: (Color) -> Unit): Color = color.apply {
        shedule(this)
        color = this
    }


    open var editAlpha: Boolean
        get() = _icall_Boolean(isEditingAlphaMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setEditAlphaMethodBind, this.rawMemory, value)




    // Methods
    private val setPickColorMethodBind: CPointer<godot_method_bind> by lazy { getMB("ColorPickerButton", "set_pick_color") }
    open fun setPickColor(color: Color) {
        _icall_Unit_Color(setPickColorMethodBind, this.rawMemory, color)
    }


    private val getPickColorMethodBind: CPointer<godot_method_bind> by lazy { getMB("ColorPickerButton", "get_pick_color") }
    open fun getPickColor(): Color {
        return _icall_Color(getPickColorMethodBind, this.rawMemory)
    }


    private val getPickerMethodBind: CPointer<godot_method_bind> by lazy { getMB("ColorPickerButton", "get_picker") }
    open fun getPicker(): ColorPicker {
        return _icall_ColorPicker(getPickerMethodBind, this.rawMemory)
    }


    private val getPopupMethodBind: CPointer<godot_method_bind> by lazy { getMB("ColorPickerButton", "get_popup") }
    open fun getPopup(): PopupPanel {
        return _icall_PopupPanel(getPopupMethodBind, this.rawMemory)
    }


    private val setEditAlphaMethodBind: CPointer<godot_method_bind> by lazy { getMB("ColorPickerButton", "set_edit_alpha") }
    open fun setEditAlpha(show: Boolean) {
        _icall_Unit_Boolean(setEditAlphaMethodBind, this.rawMemory, show)
    }


    private val isEditingAlphaMethodBind: CPointer<godot_method_bind> by lazy { getMB("ColorPickerButton", "is_editing_alpha") }
    open fun isEditingAlpha(): Boolean {
        return _icall_Boolean(isEditingAlphaMethodBind, this.rawMemory)
    }


    open fun _color_changed(arg0: Color) {
    }


    open fun _modal_closed() {
    }


}
