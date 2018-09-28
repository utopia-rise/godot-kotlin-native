@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class LineEdit : Control {
    constructor() : super("LineEdit")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class Align(val id: Int) {
        ALIGN_LEFT(0),
        ALIGN_CENTER(1),
        ALIGN_RIGHT(2),
        ALIGN_FILL(3),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }
    enum class MenuItems(val id: Int) {
        MENU_CUT(0),
        MENU_COPY(1),
        MENU_PASTE(2),
        MENU_CLEAR(3),
        MENU_SELECT_ALL(4),
        MENU_UNDO(5),
        MENU_REDO(6),
        MENU_MAX(7),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }


    // Signals
    class Signal {
        companion object {
            const val TEXT_ENTERED: String = "text_entered"
            const val TEXT_CHANGED: String = "text_changed"
        }
    }


    companion object {
        infix fun from(other: Control): LineEdit = LineEdit("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CanvasItem): LineEdit = LineEdit("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): LineEdit = LineEdit("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): LineEdit = LineEdit("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): LineEdit = fromVariant(LineEdit(""), other)


        // Constants
        const val ALIGN_LEFT: Int = 0
        const val ALIGN_CENTER: Int = 1
        const val ALIGN_RIGHT: Int = 2
        const val ALIGN_FILL: Int = 3
        const val MENU_CUT: Int = 0
        const val MENU_COPY: Int = 1
        const val MENU_PASTE: Int = 2
        const val MENU_CLEAR: Int = 3
        const val MENU_SELECT_ALL: Int = 4
        const val MENU_UNDO: Int = 5
        const val MENU_REDO: Int = 6
        const val MENU_MAX: Int = 7


    }


    // Properties
    open var text: String
        get() = _icall_String(getTextMethodBind, this.rawMemory)
        set(value) = _icall_Unit_String(setTextMethodBind, this.rawMemory, value)


    open var align: Int
        get() = _icall_Int(getAlignMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setAlignMethodBind, this.rawMemory, value)


    open var maxLength: Int
        get() = _icall_Int(getMaxLengthMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setMaxLengthMethodBind, this.rawMemory, value)


    open var editable: Boolean
        get() = _icall_Boolean(isEditableMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setEditableMethodBind, this.rawMemory, value)


    open var secret: Boolean
        get() = _icall_Boolean(isSecretMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setSecretMethodBind, this.rawMemory, value)


    open var secretCharacter: String
        get() = _icall_String(getSecretCharacterMethodBind, this.rawMemory)
        set(value) = _icall_Unit_String(setSecretCharacterMethodBind, this.rawMemory, value)


    open var expandToTextLength: Boolean
        get() = _icall_Boolean(getExpandToTextLengthMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setExpandToTextLengthMethodBind, this.rawMemory, value)


    open var contextMenuEnabled: Boolean
        get() = _icall_Boolean(isContextMenuEnabledMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setContextMenuEnabledMethodBind, this.rawMemory, value)


    open var placeholderText: String
        get() = _icall_String(getPlaceholderMethodBind, this.rawMemory)
        set(value) = _icall_Unit_String(setPlaceholderMethodBind, this.rawMemory, value)


    open var placeholderAlpha: Float
        get() = _icall_Float(getPlaceholderAlphaMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setPlaceholderAlphaMethodBind, this.rawMemory, value)


    open var caretBlink: Boolean
        get() = _icall_Boolean(cursorGetBlinkEnabledMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(cursorSetBlinkEnabledMethodBind, this.rawMemory, value)


    open var caretBlinkSpeed: Float
        get() = _icall_Float(cursorGetBlinkSpeedMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(cursorSetBlinkSpeedMethodBind, this.rawMemory, value)


    open var caretPosition: Int
        get() = _icall_Int(getCursorPositionMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setCursorPositionMethodBind, this.rawMemory, value)




    // Methods
    open fun _text_changed() {
    }


    open fun _toggle_draw_caret() {
    }


    open fun _editor_settings_changed() {
    }


    private val setAlignMethodBind: CPointer<godot_method_bind> by lazy { getMB("LineEdit", "set_align") }
    open fun setAlign(align: Int) {
        _icall_Unit_Int(setAlignMethodBind, this.rawMemory, align)
    }


    private val getAlignMethodBind: CPointer<godot_method_bind> by lazy { getMB("LineEdit", "get_align") }
    open fun getAlign(): LineEdit.Align {
        return LineEdit.Align.fromInt(_icall_Int(getAlignMethodBind, this.rawMemory))
    }


    override fun _gui_input(arg0: InputEvent) {
    }


    private val clearMethodBind: CPointer<godot_method_bind> by lazy { getMB("LineEdit", "clear") }
    open fun clear() {
        _icall_Unit(clearMethodBind, this.rawMemory)
    }


    private val selectMethodBind: CPointer<godot_method_bind> by lazy { getMB("LineEdit", "select") }
    open fun select(from: Int = 0, to: Int = -1) {
        _icall_Unit_Int_Int(selectMethodBind, this.rawMemory, from, to)
    }


    private val selectAllMethodBind: CPointer<godot_method_bind> by lazy { getMB("LineEdit", "select_all") }
    open fun selectAll() {
        _icall_Unit(selectAllMethodBind, this.rawMemory)
    }


    private val deselectMethodBind: CPointer<godot_method_bind> by lazy { getMB("LineEdit", "deselect") }
    open fun deselect() {
        _icall_Unit(deselectMethodBind, this.rawMemory)
    }


    private val setTextMethodBind: CPointer<godot_method_bind> by lazy { getMB("LineEdit", "set_text") }
    open fun setText(text: String) {
        _icall_Unit_String(setTextMethodBind, this.rawMemory, text)
    }


    private val getTextMethodBind: CPointer<godot_method_bind> by lazy { getMB("LineEdit", "get_text") }
    open fun getText(): String {
        return _icall_String(getTextMethodBind, this.rawMemory)
    }


    private val setPlaceholderMethodBind: CPointer<godot_method_bind> by lazy { getMB("LineEdit", "set_placeholder") }
    open fun setPlaceholder(text: String) {
        _icall_Unit_String(setPlaceholderMethodBind, this.rawMemory, text)
    }


    private val getPlaceholderMethodBind: CPointer<godot_method_bind> by lazy { getMB("LineEdit", "get_placeholder") }
    open fun getPlaceholder(): String {
        return _icall_String(getPlaceholderMethodBind, this.rawMemory)
    }


    private val setPlaceholderAlphaMethodBind: CPointer<godot_method_bind> by lazy { getMB("LineEdit", "set_placeholder_alpha") }
    open fun setPlaceholderAlpha(alpha: Float) {
        _icall_Unit_Float(setPlaceholderAlphaMethodBind, this.rawMemory, alpha)
    }


    private val getPlaceholderAlphaMethodBind: CPointer<godot_method_bind> by lazy { getMB("LineEdit", "get_placeholder_alpha") }
    open fun getPlaceholderAlpha(): Float {
        return _icall_Float(getPlaceholderAlphaMethodBind, this.rawMemory)
    }


    private val setCursorPositionMethodBind: CPointer<godot_method_bind> by lazy { getMB("LineEdit", "set_cursor_position") }
    open fun setCursorPosition(position: Int) {
        _icall_Unit_Int(setCursorPositionMethodBind, this.rawMemory, position)
    }


    private val getCursorPositionMethodBind: CPointer<godot_method_bind> by lazy { getMB("LineEdit", "get_cursor_position") }
    open fun getCursorPosition(): Int {
        return _icall_Int(getCursorPositionMethodBind, this.rawMemory)
    }


    private val setExpandToTextLengthMethodBind: CPointer<godot_method_bind> by lazy { getMB("LineEdit", "set_expand_to_text_length") }
    open fun setExpandToTextLength(enabled: Boolean) {
        _icall_Unit_Boolean(setExpandToTextLengthMethodBind, this.rawMemory, enabled)
    }


    private val getExpandToTextLengthMethodBind: CPointer<godot_method_bind> by lazy { getMB("LineEdit", "get_expand_to_text_length") }
    open fun getExpandToTextLength(): Boolean {
        return _icall_Boolean(getExpandToTextLengthMethodBind, this.rawMemory)
    }


    private val cursorSetBlinkEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("LineEdit", "cursor_set_blink_enabled") }
    open fun cursorSetBlinkEnabled(enabled: Boolean) {
        _icall_Unit_Boolean(cursorSetBlinkEnabledMethodBind, this.rawMemory, enabled)
    }


    private val cursorGetBlinkEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("LineEdit", "cursor_get_blink_enabled") }
    open fun cursorGetBlinkEnabled(): Boolean {
        return _icall_Boolean(cursorGetBlinkEnabledMethodBind, this.rawMemory)
    }


    private val cursorSetBlinkSpeedMethodBind: CPointer<godot_method_bind> by lazy { getMB("LineEdit", "cursor_set_blink_speed") }
    open fun cursorSetBlinkSpeed(blinkSpeed: Float) {
        _icall_Unit_Float(cursorSetBlinkSpeedMethodBind, this.rawMemory, blinkSpeed)
    }


    private val cursorGetBlinkSpeedMethodBind: CPointer<godot_method_bind> by lazy { getMB("LineEdit", "cursor_get_blink_speed") }
    open fun cursorGetBlinkSpeed(): Float {
        return _icall_Float(cursorGetBlinkSpeedMethodBind, this.rawMemory)
    }


    private val setMaxLengthMethodBind: CPointer<godot_method_bind> by lazy { getMB("LineEdit", "set_max_length") }
    open fun setMaxLength(chars: Int) {
        _icall_Unit_Int(setMaxLengthMethodBind, this.rawMemory, chars)
    }


    private val getMaxLengthMethodBind: CPointer<godot_method_bind> by lazy { getMB("LineEdit", "get_max_length") }
    open fun getMaxLength(): Int {
        return _icall_Int(getMaxLengthMethodBind, this.rawMemory)
    }


    private val appendAtCursorMethodBind: CPointer<godot_method_bind> by lazy { getMB("LineEdit", "append_at_cursor") }
    open fun appendAtCursor(text: String) {
        _icall_Unit_String(appendAtCursorMethodBind, this.rawMemory, text)
    }


    private val setEditableMethodBind: CPointer<godot_method_bind> by lazy { getMB("LineEdit", "set_editable") }
    open fun setEditable(enabled: Boolean) {
        _icall_Unit_Boolean(setEditableMethodBind, this.rawMemory, enabled)
    }


    private val isEditableMethodBind: CPointer<godot_method_bind> by lazy { getMB("LineEdit", "is_editable") }
    open fun isEditable(): Boolean {
        return _icall_Boolean(isEditableMethodBind, this.rawMemory)
    }


    private val setSecretMethodBind: CPointer<godot_method_bind> by lazy { getMB("LineEdit", "set_secret") }
    open fun setSecret(enabled: Boolean) {
        _icall_Unit_Boolean(setSecretMethodBind, this.rawMemory, enabled)
    }


    private val isSecretMethodBind: CPointer<godot_method_bind> by lazy { getMB("LineEdit", "is_secret") }
    open fun isSecret(): Boolean {
        return _icall_Boolean(isSecretMethodBind, this.rawMemory)
    }


    private val setSecretCharacterMethodBind: CPointer<godot_method_bind> by lazy { getMB("LineEdit", "set_secret_character") }
    open fun setSecretCharacter(character: String) {
        _icall_Unit_String(setSecretCharacterMethodBind, this.rawMemory, character)
    }


    private val getSecretCharacterMethodBind: CPointer<godot_method_bind> by lazy { getMB("LineEdit", "get_secret_character") }
    open fun getSecretCharacter(): String {
        return _icall_String(getSecretCharacterMethodBind, this.rawMemory)
    }


    private val menuOptionMethodBind: CPointer<godot_method_bind> by lazy { getMB("LineEdit", "menu_option") }
    open fun menuOption(option: Int) {
        _icall_Unit_Int(menuOptionMethodBind, this.rawMemory, option)
    }


    private val getMenuMethodBind: CPointer<godot_method_bind> by lazy { getMB("LineEdit", "get_menu") }
    open fun getMenu(): PopupMenu {
        return _icall_PopupMenu(getMenuMethodBind, this.rawMemory)
    }


    private val setContextMenuEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("LineEdit", "set_context_menu_enabled") }
    open fun setContextMenuEnabled(enable: Boolean) {
        _icall_Unit_Boolean(setContextMenuEnabledMethodBind, this.rawMemory, enable)
    }


    private val isContextMenuEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("LineEdit", "is_context_menu_enabled") }
    open fun isContextMenuEnabled(): Boolean {
        return _icall_Boolean(isContextMenuEnabledMethodBind, this.rawMemory)
    }


}
