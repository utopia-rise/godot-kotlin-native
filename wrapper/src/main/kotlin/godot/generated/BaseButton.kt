@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class BaseButton : Control {
    private constructor() : super("")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class ActionMode(val id: Int) {
        ACTION_MODE_BUTTON_PRESS(0),
        ACTION_MODE_BUTTON_RELEASE(1),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }
    enum class DrawMode(val id: Int) {
        DRAW_NORMAL(0),
        DRAW_PRESSED(1),
        DRAW_HOVER(2),
        DRAW_DISABLED(3),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }


    // Signals
    class Signal {
        companion object {
            const val BUTTON_DOWN: String = "button_down"
            const val TOGGLED: String = "toggled"
            const val PRESSED: String = "pressed"
            const val BUTTON_UP: String = "button_up"
        }
    }


    companion object {
        infix fun from(other: Control): BaseButton = BaseButton("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CanvasItem): BaseButton = BaseButton("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): BaseButton = BaseButton("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): BaseButton = BaseButton("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): BaseButton = fromVariant(BaseButton(""), other)


        // Constants
        const val DRAW_NORMAL: Int = 0
        const val DRAW_PRESSED: Int = 1
        const val DRAW_HOVER: Int = 2
        const val DRAW_DISABLED: Int = 3
        const val ACTION_MODE_BUTTON_PRESS: Int = 0
        const val ACTION_MODE_BUTTON_RELEASE: Int = 1


    }


    // Properties
    open var disabled: Boolean
        get() = _icall_Boolean(isDisabledMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setDisabledMethodBind, this.rawMemory, value)


    open var toggleMode: Boolean
        get() = _icall_Boolean(isToggleModeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setToggleModeMethodBind, this.rawMemory, value)


    open var pressed: Boolean
        get() = _icall_Boolean(isPressedMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setPressedMethodBind, this.rawMemory, value)


    open var actionMode: Int
        get() = _icall_Int(getActionModeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setActionModeMethodBind, this.rawMemory, value)


    open var buttonMask: Int
        get() = _icall_Int(getButtonMaskMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setButtonMaskMethodBind, this.rawMemory, value)


    open var enabledFocusMode: Int
        get() = _icall_Int(getEnabledFocusModeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setEnabledFocusModeMethodBind, this.rawMemory, value)


    open var shortcut: ShortCut
        get() = _icall_ShortCut(getShortcutMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setShortcutMethodBind, this.rawMemory, value)


    open var group: ButtonGroup
        get() = _icall_ButtonGroup(getButtonGroupMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setButtonGroupMethodBind, this.rawMemory, value)




    // Methods
    open fun _pressed() {
    }


    open fun _toggled(buttonPressed: Boolean) {
    }


    override fun _gui_input(arg0: InputEvent) {
    }


    override fun _unhandled_input(arg0: InputEvent) {
    }


    private val setPressedMethodBind: CPointer<godot_method_bind> by lazy { getMB("BaseButton", "set_pressed") }
    open fun setPressed(pressed: Boolean) {
        _icall_Unit_Boolean(setPressedMethodBind, this.rawMemory, pressed)
    }


    private val isPressedMethodBind: CPointer<godot_method_bind> by lazy { getMB("BaseButton", "is_pressed") }
    open fun isPressed(): Boolean {
        return _icall_Boolean(isPressedMethodBind, this.rawMemory)
    }


    private val isHoveredMethodBind: CPointer<godot_method_bind> by lazy { getMB("BaseButton", "is_hovered") }
    open fun isHovered(): Boolean {
        return _icall_Boolean(isHoveredMethodBind, this.rawMemory)
    }


    private val setToggleModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("BaseButton", "set_toggle_mode") }
    open fun setToggleMode(enabled: Boolean) {
        _icall_Unit_Boolean(setToggleModeMethodBind, this.rawMemory, enabled)
    }


    private val isToggleModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("BaseButton", "is_toggle_mode") }
    open fun isToggleMode(): Boolean {
        return _icall_Boolean(isToggleModeMethodBind, this.rawMemory)
    }


    private val setDisabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("BaseButton", "set_disabled") }
    open fun setDisabled(disabled: Boolean) {
        _icall_Unit_Boolean(setDisabledMethodBind, this.rawMemory, disabled)
    }


    private val isDisabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("BaseButton", "is_disabled") }
    open fun isDisabled(): Boolean {
        return _icall_Boolean(isDisabledMethodBind, this.rawMemory)
    }


    private val setActionModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("BaseButton", "set_action_mode") }
    open fun setActionMode(mode: Int) {
        _icall_Unit_Int(setActionModeMethodBind, this.rawMemory, mode)
    }


    private val getActionModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("BaseButton", "get_action_mode") }
    open fun getActionMode(): BaseButton.ActionMode {
        return BaseButton.ActionMode.fromInt(_icall_Int(getActionModeMethodBind, this.rawMemory))
    }


    private val setButtonMaskMethodBind: CPointer<godot_method_bind> by lazy { getMB("BaseButton", "set_button_mask") }
    open fun setButtonMask(mask: Int) {
        _icall_Unit_Int(setButtonMaskMethodBind, this.rawMemory, mask)
    }


    private val getButtonMaskMethodBind: CPointer<godot_method_bind> by lazy { getMB("BaseButton", "get_button_mask") }
    open fun getButtonMask(): Int {
        return _icall_Int(getButtonMaskMethodBind, this.rawMemory)
    }


    private val getDrawModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("BaseButton", "get_draw_mode") }
    open fun getDrawMode(): BaseButton.DrawMode {
        return BaseButton.DrawMode.fromInt(_icall_Int(getDrawModeMethodBind, this.rawMemory))
    }


    private val setEnabledFocusModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("BaseButton", "set_enabled_focus_mode") }
    open fun setEnabledFocusMode(mode: Int) {
        _icall_Unit_Int(setEnabledFocusModeMethodBind, this.rawMemory, mode)
    }


    private val getEnabledFocusModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("BaseButton", "get_enabled_focus_mode") }
    open fun getEnabledFocusMode(): Control.FocusMode {
        return Control.FocusMode.fromInt(_icall_Int(getEnabledFocusModeMethodBind, this.rawMemory))
    }


    private val setShortcutMethodBind: CPointer<godot_method_bind> by lazy { getMB("BaseButton", "set_shortcut") }
    open fun setShortcut(shortcut: ShortCut) {
        _icall_Unit_Object(setShortcutMethodBind, this.rawMemory, shortcut)
    }


    private val getShortcutMethodBind: CPointer<godot_method_bind> by lazy { getMB("BaseButton", "get_shortcut") }
    open fun getShortcut(): ShortCut {
        return _icall_ShortCut(getShortcutMethodBind, this.rawMemory)
    }


    private val setButtonGroupMethodBind: CPointer<godot_method_bind> by lazy { getMB("BaseButton", "set_button_group") }
    open fun setButtonGroup(buttonGroup: ButtonGroup) {
        _icall_Unit_Object(setButtonGroupMethodBind, this.rawMemory, buttonGroup)
    }


    private val getButtonGroupMethodBind: CPointer<godot_method_bind> by lazy { getMB("BaseButton", "get_button_group") }
    open fun getButtonGroup(): ButtonGroup {
        return _icall_ButtonGroup(getButtonGroupMethodBind, this.rawMemory)
    }


}
