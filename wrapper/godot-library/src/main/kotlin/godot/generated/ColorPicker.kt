@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class ColorPicker : BoxContainer {
    constructor() : super("ColorPicker")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 



    // Signals
    class Signal {
        companion object {
            const val COLOR_CHANGED: String = "color_changed"
        }
    }


    companion object {
        infix fun from(other: BoxContainer): ColorPicker = ColorPicker("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Container): ColorPicker = ColorPicker("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Control): ColorPicker = ColorPicker("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CanvasItem): ColorPicker = ColorPicker("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): ColorPicker = ColorPicker("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): ColorPicker = ColorPicker("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): ColorPicker = fromVariant(ColorPicker(""), other)


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


    open var rawMode: Boolean
        get() = _icall_Boolean(isRawModeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setRawModeMethodBind, this.rawMemory, value)


    open var deferredMode: Boolean
        get() = _icall_Boolean(isDeferredModeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setDeferredModeMethodBind, this.rawMemory, value)




    // Methods
    private val setPickColorMethodBind: CPointer<godot_method_bind> by lazy { getMB("ColorPicker", "set_pick_color") }
    open fun setPickColor(color: Color) {
        _icall_Unit_Color(setPickColorMethodBind, this.rawMemory, color)
    }


    private val getPickColorMethodBind: CPointer<godot_method_bind> by lazy { getMB("ColorPicker", "get_pick_color") }
    open fun getPickColor(): Color {
        return _icall_Color(getPickColorMethodBind, this.rawMemory)
    }


    private val setRawModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("ColorPicker", "set_raw_mode") }
    open fun setRawMode(mode: Boolean) {
        _icall_Unit_Boolean(setRawModeMethodBind, this.rawMemory, mode)
    }


    private val isRawModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("ColorPicker", "is_raw_mode") }
    open fun isRawMode(): Boolean {
        return _icall_Boolean(isRawModeMethodBind, this.rawMemory)
    }


    private val setDeferredModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("ColorPicker", "set_deferred_mode") }
    open fun setDeferredMode(mode: Boolean) {
        _icall_Unit_Boolean(setDeferredModeMethodBind, this.rawMemory, mode)
    }


    private val isDeferredModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("ColorPicker", "is_deferred_mode") }
    open fun isDeferredMode(): Boolean {
        return _icall_Boolean(isDeferredModeMethodBind, this.rawMemory)
    }


    private val setEditAlphaMethodBind: CPointer<godot_method_bind> by lazy { getMB("ColorPicker", "set_edit_alpha") }
    open fun setEditAlpha(show: Boolean) {
        _icall_Unit_Boolean(setEditAlphaMethodBind, this.rawMemory, show)
    }


    private val isEditingAlphaMethodBind: CPointer<godot_method_bind> by lazy { getMB("ColorPicker", "is_editing_alpha") }
    open fun isEditingAlpha(): Boolean {
        return _icall_Boolean(isEditingAlphaMethodBind, this.rawMemory)
    }


    private val addPresetMethodBind: CPointer<godot_method_bind> by lazy { getMB("ColorPicker", "add_preset") }
    open fun addPreset(color: Color) {
        _icall_Unit_Color(addPresetMethodBind, this.rawMemory, color)
    }


    open fun _value_changed(arg0: Double) {
    }


    open fun _html_entered(arg0: String) {
    }


    open fun _text_type_toggled() {
    }


    open fun _add_preset_pressed() {
    }


    open fun _screen_pick_pressed() {
    }


    open fun _sample_draw() {
    }


    open fun _update_presets() {
    }


    open fun _hsv_draw(arg0: Long, arg1: Object) {
    }


    open fun _uv_input(arg0: InputEvent) {
    }


    open fun _w_input(arg0: InputEvent) {
    }


    open fun _preset_input(arg0: InputEvent) {
    }


    open fun _screen_input(arg0: InputEvent) {
    }


    open fun _focus_enter() {
    }


    open fun _focus_exit() {
    }


    open fun _html_focus_exit() {
    }


}
