@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class TextEdit : Control {
    constructor() : super("TextEdit")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class SearchFlags(val id: Long) {
        SEARCH_MATCH_CASE(1),
        SEARCH_WHOLE_WORDS(2),
        SEARCH_BACKWARDS(4),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class MenuItems(val id: Long) {
        MENU_CUT(0),
        MENU_COPY(1),
        MENU_PASTE(2),
        MENU_CLEAR(3),
        MENU_SELECT_ALL(4),
        MENU_UNDO(5),
        MENU_MAX(6),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }


    // Signals
    class Signal {
        companion object {
            const val BREAKPOINT_TOGGLED: String = "breakpoint_toggled"
            const val TEXT_CHANGED: String = "text_changed"
            const val SYMBOL_LOOKUP: String = "symbol_lookup"
            const val CURSOR_CHANGED: String = "cursor_changed"
            const val REQUEST_COMPLETION: String = "request_completion"
        }
    }


    companion object {
        infix fun from(other: Control): TextEdit = TextEdit("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CanvasItem): TextEdit = TextEdit("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): TextEdit = TextEdit("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): TextEdit = TextEdit("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): TextEdit = fromVariant(TextEdit(""), other)


        // Constants
        const val SEARCH_MATCH_CASE: Long = 1
        const val SEARCH_WHOLE_WORDS: Long = 2
        const val SEARCH_BACKWARDS: Long = 4
        const val MENU_CUT: Long = 0
        const val MENU_COPY: Long = 1
        const val MENU_PASTE: Long = 2
        const val MENU_CLEAR: Long = 3
        const val MENU_SELECT_ALL: Long = 4
        const val MENU_UNDO: Long = 5
        const val MENU_MAX: Long = 6


    }


    // Properties
    open var text: String
        get() = _icall_String(getTextMethodBind, this.rawMemory)
        set(value) = _icall_Unit_String(setTextMethodBind, this.rawMemory, value)


    open var readonly: Boolean
        get() = _icall_Boolean(isReadonlyMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setReadonlyMethodBind, this.rawMemory, value)


    open var highlightCurrentLine: Boolean
        get() = _icall_Boolean(isHighlightCurrentLineEnabledMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setHighlightCurrentLineMethodBind, this.rawMemory, value)


    open var syntaxHighlighting: Boolean
        get() = _icall_Boolean(isSyntaxColoringEnabledMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setSyntaxColoringMethodBind, this.rawMemory, value)


    open var showLineNumbers: Boolean
        get() = _icall_Boolean(isShowLineNumbersEnabledMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setShowLineNumbersMethodBind, this.rawMemory, value)


    open var breakpointGutter: Boolean
        get() = _icall_Boolean(isBreakpointGutterEnabledMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setBreakpointGutterEnabledMethodBind, this.rawMemory, value)


    open var highlightAllOccurrences: Boolean
        get() = _icall_Boolean(isHighlightAllOccurrencesEnabledMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setHighlightAllOccurrencesMethodBind, this.rawMemory, value)


    open var overrideSelectedFontColor: Boolean
        get() = _icall_Boolean(isOverridingSelectedFontColorMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setOverrideSelectedFontColorMethodBind, this.rawMemory, value)


    open var contextMenuEnabled: Boolean
        get() = _icall_Boolean(isContextMenuEnabledMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setContextMenuEnabledMethodBind, this.rawMemory, value)


    open var smoothScrolling: Boolean
        get() = _icall_Boolean(isSmoothScrollEnabledMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setSmoothScrollEnableMethodBind, this.rawMemory, value)


    open var vScrollSpeed: Double
        get() = _icall_Double(getVScrollSpeedMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setVScrollSpeedMethodBind, this.rawMemory, value)


    open var hidingEnabled: Boolean
        get() = _icall_Boolean(isHidingEnabledMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setHidingEnabledMethodBind, this.rawMemory, value)


    open var wrapEnabled: Boolean
        get() = _icall_Boolean(isWrapEnabledMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setWrapEnabledMethodBind, this.rawMemory, value)


    open var caretBlockMode: Boolean
        get() = _icall_Boolean(cursorIsBlockModeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(cursorSetBlockModeMethodBind, this.rawMemory, value)


    open var caretBlink: Boolean
        get() = _icall_Boolean(cursorGetBlinkEnabledMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(cursorSetBlinkEnabledMethodBind, this.rawMemory, value)


    open var caretBlinkSpeed: Double
        get() = _icall_Double(cursorGetBlinkSpeedMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(cursorSetBlinkSpeedMethodBind, this.rawMemory, value)


    open var caretMovingByRightClick: Boolean
        get() = _icall_Boolean(isRightClickMovingCaretMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setRightClickMovesCaretMethodBind, this.rawMemory, value)




    // Methods
    override fun _gui_input(arg0: InputEvent) {
    }


    open fun _scroll_moved(arg0: Double) {
    }


    open fun _cursor_changed_emit() {
    }


    open fun _text_changed_emit() {
    }


    open fun _push_current_op() {
    }


    open fun _click_selection_held() {
    }


    open fun _toggle_draw_caret() {
    }


    open fun _v_scroll_input() {
    }


    private val setTextMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextEdit", "set_text") }
    open fun setText(text: String) {
        _icall_Unit_String(setTextMethodBind, this.rawMemory, text)
    }


    private val insertTextAtCursorMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextEdit", "insert_text_at_cursor") }
    open fun insertTextAtCursor(text: String) {
        _icall_Unit_String(insertTextAtCursorMethodBind, this.rawMemory, text)
    }


    private val getLineCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextEdit", "get_line_count") }
    open fun getLineCount(): Long {
        return _icall_Long(getLineCountMethodBind, this.rawMemory)
    }


    private val getTextMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextEdit", "get_text") }
    open fun getText(): String {
        return _icall_String(getTextMethodBind, this.rawMemory)
    }


    private val getLineMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextEdit", "get_line") }
    open fun getLine(line: Long): String {
        return _icall_String_Long(getLineMethodBind, this.rawMemory, line)
    }


    private val cursorSetColumnMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextEdit", "cursor_set_column") }
    open fun cursorSetColumn(column: Long, adjustViewport: Boolean = true) {
        _icall_Unit_Long_Boolean(cursorSetColumnMethodBind, this.rawMemory, column, adjustViewport)
    }


    private val cursorSetLineMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextEdit", "cursor_set_line") }
    open fun cursorSetLine(line: Long, adjustViewport: Boolean = true, canBeHidden: Boolean = true, wrapIndex: Long = 0) {
        _icall_Unit_Long_Boolean_Boolean_Long(cursorSetLineMethodBind, this.rawMemory, line, adjustViewport, canBeHidden, wrapIndex)
    }


    private val cursorGetColumnMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextEdit", "cursor_get_column") }
    open fun cursorGetColumn(): Long {
        return _icall_Long(cursorGetColumnMethodBind, this.rawMemory)
    }


    private val cursorGetLineMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextEdit", "cursor_get_line") }
    open fun cursorGetLine(): Long {
        return _icall_Long(cursorGetLineMethodBind, this.rawMemory)
    }


    private val cursorSetBlinkEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextEdit", "cursor_set_blink_enabled") }
    open fun cursorSetBlinkEnabled(enable: Boolean) {
        _icall_Unit_Boolean(cursorSetBlinkEnabledMethodBind, this.rawMemory, enable)
    }


    private val cursorGetBlinkEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextEdit", "cursor_get_blink_enabled") }
    open fun cursorGetBlinkEnabled(): Boolean {
        return _icall_Boolean(cursorGetBlinkEnabledMethodBind, this.rawMemory)
    }


    private val cursorSetBlinkSpeedMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextEdit", "cursor_set_blink_speed") }
    open fun cursorSetBlinkSpeed(blinkSpeed: Double) {
        _icall_Unit_Double(cursorSetBlinkSpeedMethodBind, this.rawMemory, blinkSpeed)
    }


    private val cursorGetBlinkSpeedMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextEdit", "cursor_get_blink_speed") }
    open fun cursorGetBlinkSpeed(): Double {
        return _icall_Double(cursorGetBlinkSpeedMethodBind, this.rawMemory)
    }


    private val cursorSetBlockModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextEdit", "cursor_set_block_mode") }
    open fun cursorSetBlockMode(enable: Boolean) {
        _icall_Unit_Boolean(cursorSetBlockModeMethodBind, this.rawMemory, enable)
    }


    private val cursorIsBlockModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextEdit", "cursor_is_block_mode") }
    open fun cursorIsBlockMode(): Boolean {
        return _icall_Boolean(cursorIsBlockModeMethodBind, this.rawMemory)
    }


    private val setRightClickMovesCaretMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextEdit", "set_right_click_moves_caret") }
    open fun setRightClickMovesCaret(enable: Boolean) {
        _icall_Unit_Boolean(setRightClickMovesCaretMethodBind, this.rawMemory, enable)
    }


    private val isRightClickMovingCaretMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextEdit", "is_right_click_moving_caret") }
    open fun isRightClickMovingCaret(): Boolean {
        return _icall_Boolean(isRightClickMovingCaretMethodBind, this.rawMemory)
    }


    private val setReadonlyMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextEdit", "set_readonly") }
    open fun setReadonly(enable: Boolean) {
        _icall_Unit_Boolean(setReadonlyMethodBind, this.rawMemory, enable)
    }


    private val isReadonlyMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextEdit", "is_readonly") }
    open fun isReadonly(): Boolean {
        return _icall_Boolean(isReadonlyMethodBind, this.rawMemory)
    }


    private val setWrapEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextEdit", "set_wrap_enabled") }
    open fun setWrapEnabled(enable: Boolean) {
        _icall_Unit_Boolean(setWrapEnabledMethodBind, this.rawMemory, enable)
    }


    private val isWrapEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextEdit", "is_wrap_enabled") }
    open fun isWrapEnabled(): Boolean {
        return _icall_Boolean(isWrapEnabledMethodBind, this.rawMemory)
    }


    private val setContextMenuEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextEdit", "set_context_menu_enabled") }
    open fun setContextMenuEnabled(enable: Boolean) {
        _icall_Unit_Boolean(setContextMenuEnabledMethodBind, this.rawMemory, enable)
    }


    private val isContextMenuEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextEdit", "is_context_menu_enabled") }
    open fun isContextMenuEnabled(): Boolean {
        return _icall_Boolean(isContextMenuEnabledMethodBind, this.rawMemory)
    }


    private val cutMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextEdit", "cut") }
    open fun cut() {
        _icall_Unit(cutMethodBind, this.rawMemory)
    }


    private val copyMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextEdit", "copy") }
    open fun copy() {
        _icall_Unit(copyMethodBind, this.rawMemory)
    }


    private val pasteMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextEdit", "paste") }
    open fun paste() {
        _icall_Unit(pasteMethodBind, this.rawMemory)
    }


    private val selectMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextEdit", "select") }
    open fun select(fromLine: Long, fromColumn: Long, toLine: Long, toColumn: Long) {
        _icall_Unit_Long_Long_Long_Long(selectMethodBind, this.rawMemory, fromLine, fromColumn, toLine, toColumn)
    }


    private val selectAllMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextEdit", "select_all") }
    open fun selectAll() {
        _icall_Unit(selectAllMethodBind, this.rawMemory)
    }


    private val deselectMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextEdit", "deselect") }
    open fun deselect() {
        _icall_Unit(deselectMethodBind, this.rawMemory)
    }


    private val isSelectionActiveMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextEdit", "is_selection_active") }
    open fun isSelectionActive(): Boolean {
        return _icall_Boolean(isSelectionActiveMethodBind, this.rawMemory)
    }


    private val getSelectionFromLineMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextEdit", "get_selection_from_line") }
    open fun getSelectionFromLine(): Long {
        return _icall_Long(getSelectionFromLineMethodBind, this.rawMemory)
    }


    private val getSelectionFromColumnMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextEdit", "get_selection_from_column") }
    open fun getSelectionFromColumn(): Long {
        return _icall_Long(getSelectionFromColumnMethodBind, this.rawMemory)
    }


    private val getSelectionToLineMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextEdit", "get_selection_to_line") }
    open fun getSelectionToLine(): Long {
        return _icall_Long(getSelectionToLineMethodBind, this.rawMemory)
    }


    private val getSelectionToColumnMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextEdit", "get_selection_to_column") }
    open fun getSelectionToColumn(): Long {
        return _icall_Long(getSelectionToColumnMethodBind, this.rawMemory)
    }


    private val getSelectionTextMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextEdit", "get_selection_text") }
    open fun getSelectionText(): String {
        return _icall_String(getSelectionTextMethodBind, this.rawMemory)
    }


    private val getWordUnderCursorMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextEdit", "get_word_under_cursor") }
    open fun getWordUnderCursor(): String {
        return _icall_String(getWordUnderCursorMethodBind, this.rawMemory)
    }


    private val searchMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextEdit", "search") }
    open fun search(key: String, flags: Long, fromLine: Long, fromColumn: Long): PoolIntArray {
        return _icall_PoolIntArray_String_Long_Long_Long(searchMethodBind, this.rawMemory, key, flags, fromLine, fromColumn)
    }


    private val undoMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextEdit", "undo") }
    open fun undo() {
        _icall_Unit(undoMethodBind, this.rawMemory)
    }


    private val redoMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextEdit", "redo") }
    open fun redo() {
        _icall_Unit(redoMethodBind, this.rawMemory)
    }


    private val clearUndoHistoryMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextEdit", "clear_undo_history") }
    open fun clearUndoHistory() {
        _icall_Unit(clearUndoHistoryMethodBind, this.rawMemory)
    }


    private val setShowLineNumbersMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextEdit", "set_show_line_numbers") }
    open fun setShowLineNumbers(enable: Boolean) {
        _icall_Unit_Boolean(setShowLineNumbersMethodBind, this.rawMemory, enable)
    }


    private val isShowLineNumbersEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextEdit", "is_show_line_numbers_enabled") }
    open fun isShowLineNumbersEnabled(): Boolean {
        return _icall_Boolean(isShowLineNumbersEnabledMethodBind, this.rawMemory)
    }


    private val setBreakpointGutterEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextEdit", "set_breakpoint_gutter_enabled") }
    open fun setBreakpointGutterEnabled(enable: Boolean) {
        _icall_Unit_Boolean(setBreakpointGutterEnabledMethodBind, this.rawMemory, enable)
    }


    private val isBreakpointGutterEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextEdit", "is_breakpoint_gutter_enabled") }
    open fun isBreakpointGutterEnabled(): Boolean {
        return _icall_Boolean(isBreakpointGutterEnabledMethodBind, this.rawMemory)
    }


    private val setHidingEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextEdit", "set_hiding_enabled") }
    open fun setHidingEnabled(enable: Long) {
        _icall_Unit_Long(setHidingEnabledMethodBind, this.rawMemory, enable)
    }


    private val isHidingEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextEdit", "is_hiding_enabled") }
    open fun isHidingEnabled(): Long {
        return _icall_Long(isHidingEnabledMethodBind, this.rawMemory)
    }


    private val setLineAsHiddenMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextEdit", "set_line_as_hidden") }
    open fun setLineAsHidden(line: Long, enable: Boolean) {
        _icall_Unit_Long_Boolean(setLineAsHiddenMethodBind, this.rawMemory, line, enable)
    }


    private val isLineHiddenMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextEdit", "is_line_hidden") }
    open fun isLineHidden(line: Long): Boolean {
        return _icall_Boolean_Long(isLineHiddenMethodBind, this.rawMemory, line)
    }


    private val foldAllLinesMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextEdit", "fold_all_lines") }
    open fun foldAllLines() {
        _icall_Unit(foldAllLinesMethodBind, this.rawMemory)
    }


    private val unhideAllLinesMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextEdit", "unhide_all_lines") }
    open fun unhideAllLines() {
        _icall_Unit(unhideAllLinesMethodBind, this.rawMemory)
    }


    private val foldLineMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextEdit", "fold_line") }
    open fun foldLine(line: Long) {
        _icall_Unit_Long(foldLineMethodBind, this.rawMemory, line)
    }


    private val unfoldLineMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextEdit", "unfold_line") }
    open fun unfoldLine(line: Long) {
        _icall_Unit_Long(unfoldLineMethodBind, this.rawMemory, line)
    }


    private val toggleFoldLineMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextEdit", "toggle_fold_line") }
    open fun toggleFoldLine(line: Long) {
        _icall_Unit_Long(toggleFoldLineMethodBind, this.rawMemory, line)
    }


    private val canFoldMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextEdit", "can_fold") }
    open fun canFold(line: Long): Boolean {
        return _icall_Boolean_Long(canFoldMethodBind, this.rawMemory, line)
    }


    private val isFoldedMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextEdit", "is_folded") }
    open fun isFolded(line: Long): Boolean {
        return _icall_Boolean_Long(isFoldedMethodBind, this.rawMemory, line)
    }


    private val setHighlightAllOccurrencesMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextEdit", "set_highlight_all_occurrences") }
    open fun setHighlightAllOccurrences(enable: Boolean) {
        _icall_Unit_Boolean(setHighlightAllOccurrencesMethodBind, this.rawMemory, enable)
    }


    private val isHighlightAllOccurrencesEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextEdit", "is_highlight_all_occurrences_enabled") }
    open fun isHighlightAllOccurrencesEnabled(): Boolean {
        return _icall_Boolean(isHighlightAllOccurrencesEnabledMethodBind, this.rawMemory)
    }


    private val setOverrideSelectedFontColorMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextEdit", "set_override_selected_font_color") }
    open fun setOverrideSelectedFontColor(override: Boolean) {
        _icall_Unit_Boolean(setOverrideSelectedFontColorMethodBind, this.rawMemory, override)
    }


    private val isOverridingSelectedFontColorMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextEdit", "is_overriding_selected_font_color") }
    open fun isOverridingSelectedFontColor(): Boolean {
        return _icall_Boolean(isOverridingSelectedFontColorMethodBind, this.rawMemory)
    }


    private val setSyntaxColoringMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextEdit", "set_syntax_coloring") }
    open fun setSyntaxColoring(enable: Boolean) {
        _icall_Unit_Boolean(setSyntaxColoringMethodBind, this.rawMemory, enable)
    }


    private val isSyntaxColoringEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextEdit", "is_syntax_coloring_enabled") }
    open fun isSyntaxColoringEnabled(): Boolean {
        return _icall_Boolean(isSyntaxColoringEnabledMethodBind, this.rawMemory)
    }


    private val setHighlightCurrentLineMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextEdit", "set_highlight_current_line") }
    open fun setHighlightCurrentLine(enabled: Boolean) {
        _icall_Unit_Boolean(setHighlightCurrentLineMethodBind, this.rawMemory, enabled)
    }


    private val isHighlightCurrentLineEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextEdit", "is_highlight_current_line_enabled") }
    open fun isHighlightCurrentLineEnabled(): Boolean {
        return _icall_Boolean(isHighlightCurrentLineEnabledMethodBind, this.rawMemory)
    }


    private val setSmoothScrollEnableMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextEdit", "set_smooth_scroll_enable") }
    open fun setSmoothScrollEnable(enable: Boolean) {
        _icall_Unit_Boolean(setSmoothScrollEnableMethodBind, this.rawMemory, enable)
    }


    private val isSmoothScrollEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextEdit", "is_smooth_scroll_enabled") }
    open fun isSmoothScrollEnabled(): Boolean {
        return _icall_Boolean(isSmoothScrollEnabledMethodBind, this.rawMemory)
    }


    private val setVScrollSpeedMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextEdit", "set_v_scroll_speed") }
    open fun setVScrollSpeed(speed: Double) {
        _icall_Unit_Double(setVScrollSpeedMethodBind, this.rawMemory, speed)
    }


    private val getVScrollSpeedMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextEdit", "get_v_scroll_speed") }
    open fun getVScrollSpeed(): Double {
        return _icall_Double(getVScrollSpeedMethodBind, this.rawMemory)
    }


    private val addKeywordColorMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextEdit", "add_keyword_color") }
    open fun addKeywordColor(keyword: String, color: Color) {
        _icall_Unit_String_Color(addKeywordColorMethodBind, this.rawMemory, keyword, color)
    }


    private val hasKeywordColorMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextEdit", "has_keyword_color") }
    open fun hasKeywordColor(keyword: String): Boolean {
        return _icall_Boolean_String(hasKeywordColorMethodBind, this.rawMemory, keyword)
    }


    private val getKeywordColorMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextEdit", "get_keyword_color") }
    open fun getKeywordColor(keyword: String): Color {
        return _icall_Color_String(getKeywordColorMethodBind, this.rawMemory, keyword)
    }


    private val addColorRegionMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextEdit", "add_color_region") }
    open fun addColorRegion(beginKey: String, endKey: String, color: Color, lineOnly: Boolean = false) {
        _icall_Unit_String_String_Color_Boolean(addColorRegionMethodBind, this.rawMemory, beginKey, endKey, color, lineOnly)
    }


    private val clearColorsMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextEdit", "clear_colors") }
    open fun clearColors() {
        _icall_Unit(clearColorsMethodBind, this.rawMemory)
    }


    private val menuOptionMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextEdit", "menu_option") }
    open fun menuOption(option: Long) {
        _icall_Unit_Long(menuOptionMethodBind, this.rawMemory, option)
    }


    private val getMenuMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextEdit", "get_menu") }
    open fun getMenu(): PopupMenu {
        return _icall_PopupMenu(getMenuMethodBind, this.rawMemory)
    }


    private val getBreakpointsMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextEdit", "get_breakpoints") }
    open fun getBreakpoints(): GDArray {
        return _icall_GDArray(getBreakpointsMethodBind, this.rawMemory)
    }


    private val removeBreakpointsMethodBind: CPointer<godot_method_bind> by lazy { getMB("TextEdit", "remove_breakpoints") }
    open fun removeBreakpoints() {
        _icall_Unit(removeBreakpointsMethodBind, this.rawMemory)
    }


}
