// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Color
import godot.core.PoolIntArray
import godot.core.Signal0
import godot.core.Signal1
import godot.core.Signal2
import godot.core.Signal3
import godot.core.VariantArray
import godot.core.signal
import godot.icalls._icall_Boolean
import godot.icalls._icall_Boolean_Long
import godot.icalls._icall_Boolean_String
import godot.icalls._icall_Color_String
import godot.icalls._icall_Double
import godot.icalls._icall_Long
import godot.icalls._icall_PoolIntArray_String_Long_Long_Long
import godot.icalls._icall_PopupMenu
import godot.icalls._icall_String
import godot.icalls._icall_String_Long
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Long_Boolean
import godot.icalls._icall_Unit_Long_Boolean_Boolean_Long
import godot.icalls._icall_Unit_Long_Long_Long_Long
import godot.icalls._icall_Unit_Long_String
import godot.icalls._icall_Unit_String
import godot.icalls._icall_Unit_String_Color
import godot.icalls._icall_Unit_String_String_Color_Boolean
import godot.icalls._icall_VariantArray
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.String
import kotlinx.cinterop.COpaquePointer

open class TextEdit : Control() {
  val breakpointToggled: Signal1<Long> by signal("row")

  val cursorChanged: Signal0 by signal()

  val infoClicked: Signal2<Long, String> by signal("row", "info")

  val requestCompletion: Signal0 by signal()

  val symbolLookup: Signal3<String, Long, Long> by signal("symbol", "row", "column")

  val textChanged: Signal0 by signal()

  open var breakpointGutter: Boolean
    get() {
      val mb = getMethodBind("TextEdit","is_breakpoint_gutter_enabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("TextEdit","set_breakpoint_gutter_enabled")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var caretBlink: Boolean
    get() {
      val mb = getMethodBind("TextEdit","cursor_get_blink_enabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("TextEdit","cursor_set_blink_enabled")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var caretBlinkSpeed: Double
    get() {
      val mb = getMethodBind("TextEdit","cursor_get_blink_speed")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("TextEdit","cursor_set_blink_speed")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var caretBlockMode: Boolean
    get() {
      val mb = getMethodBind("TextEdit","cursor_is_block_mode")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("TextEdit","cursor_set_block_mode")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var caretMovingByRightClick: Boolean
    get() {
      val mb = getMethodBind("TextEdit","is_right_click_moving_caret")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("TextEdit","set_right_click_moves_caret")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var contextMenuEnabled: Boolean
    get() {
      val mb = getMethodBind("TextEdit","is_context_menu_enabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("TextEdit","set_context_menu_enabled")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var drawSpaces: Boolean
    get() {
      val mb = getMethodBind("TextEdit","is_drawing_spaces")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("TextEdit","set_draw_spaces")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var drawTabs: Boolean
    get() {
      val mb = getMethodBind("TextEdit","is_drawing_tabs")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("TextEdit","set_draw_tabs")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var foldGutter: Boolean
    get() {
      val mb = getMethodBind("TextEdit","is_drawing_fold_gutter")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("TextEdit","set_draw_fold_gutter")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var hidingEnabled: Boolean
    get() {
      val mb = getMethodBind("TextEdit","is_hiding_enabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("TextEdit","set_hiding_enabled")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var highlightAllOccurrences: Boolean
    get() {
      val mb = getMethodBind("TextEdit","is_highlight_all_occurrences_enabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("TextEdit","set_highlight_all_occurrences")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var highlightCurrentLine: Boolean
    get() {
      val mb = getMethodBind("TextEdit","is_highlight_current_line_enabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("TextEdit","set_highlight_current_line")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var minimapDraw: Boolean
    get() {
      val mb = getMethodBind("TextEdit","is_drawing_minimap")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("TextEdit","draw_minimap")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var minimapWidth: Long
    get() {
      val mb = getMethodBind("TextEdit","get_minimap_width")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("TextEdit","set_minimap_width")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var overrideSelectedFontColor: Boolean
    get() {
      val mb = getMethodBind("TextEdit","is_overriding_selected_font_color")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("TextEdit","set_override_selected_font_color")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var readonly: Boolean
    get() {
      val mb = getMethodBind("TextEdit","is_readonly")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("TextEdit","set_readonly")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var scrollHorizontal: Long
    get() {
      val mb = getMethodBind("TextEdit","get_h_scroll")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("TextEdit","set_h_scroll")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var scrollVertical: Double
    get() {
      val mb = getMethodBind("TextEdit","get_v_scroll")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("TextEdit","set_v_scroll")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var selectingEnabled: Boolean
    get() {
      val mb = getMethodBind("TextEdit","is_selecting_enabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("TextEdit","set_selecting_enabled")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var shortcutKeysEnabled: Boolean
    get() {
      val mb = getMethodBind("TextEdit","is_shortcut_keys_enabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("TextEdit","set_shortcut_keys_enabled")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var showLineNumbers: Boolean
    get() {
      val mb = getMethodBind("TextEdit","is_show_line_numbers_enabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("TextEdit","set_show_line_numbers")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var smoothScrolling: Boolean
    get() {
      val mb = getMethodBind("TextEdit","is_smooth_scroll_enabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("TextEdit","set_smooth_scroll_enable")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var syntaxHighlighting: Boolean
    get() {
      val mb = getMethodBind("TextEdit","is_syntax_coloring_enabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("TextEdit","set_syntax_coloring")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var text: String
    get() {
      val mb = getMethodBind("TextEdit","get_text")
      return _icall_String(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("TextEdit","set_text")
      _icall_Unit_String(mb, this.ptr, value)
    }

  open var vScrollSpeed: Double
    get() {
      val mb = getMethodBind("TextEdit","get_v_scroll_speed")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("TextEdit","set_v_scroll_speed")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var wrapEnabled: Boolean
    get() {
      val mb = getMethodBind("TextEdit","is_wrap_enabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("TextEdit","set_wrap_enabled")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  override fun __new(): COpaquePointer = invokeConstructor("TextEdit", "TextEdit")

  open fun _clickSelectionHeld() {
  }

  open fun _cursorChangedEmit() {
  }

  override fun _guiInput(arg0: InputEvent) {
  }

  open fun _pushCurrentOp() {
  }

  open fun _scrollMoved(arg0: Double) {
  }

  open fun _textChangedEmit() {
  }

  open fun _toggleDrawCaret() {
  }

  open fun _updateWrapAt() {
  }

  open fun _vScrollInput() {
  }

  open fun addColorRegion(
    beginKey: String,
    endKey: String,
    color: Color,
    lineOnly: Boolean = false
  ) {
    val mb = getMethodBind("TextEdit","add_color_region")
    _icall_Unit_String_String_Color_Boolean( mb, this.ptr, beginKey, endKey, color, lineOnly)
  }

  open fun addKeywordColor(keyword: String, color: Color) {
    val mb = getMethodBind("TextEdit","add_keyword_color")
    _icall_Unit_String_Color( mb, this.ptr, keyword, color)
  }

  open fun canFold(line: Long): Boolean {
    val mb = getMethodBind("TextEdit","can_fold")
    return _icall_Boolean_Long( mb, this.ptr, line)
  }

  open fun centerViewportToCursor() {
    val mb = getMethodBind("TextEdit","center_viewport_to_cursor")
    _icall_Unit( mb, this.ptr)
  }

  open fun clearColors() {
    val mb = getMethodBind("TextEdit","clear_colors")
    _icall_Unit( mb, this.ptr)
  }

  open fun clearUndoHistory() {
    val mb = getMethodBind("TextEdit","clear_undo_history")
    _icall_Unit( mb, this.ptr)
  }

  open fun copy() {
    val mb = getMethodBind("TextEdit","copy")
    _icall_Unit( mb, this.ptr)
  }

  open fun cursorGetBlinkEnabled(): Boolean {
    val mb = getMethodBind("TextEdit","cursor_get_blink_enabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun cursorGetBlinkSpeed(): Double {
    val mb = getMethodBind("TextEdit","cursor_get_blink_speed")
    return _icall_Double( mb, this.ptr)
  }

  open fun cursorGetColumn(): Long {
    val mb = getMethodBind("TextEdit","cursor_get_column")
    return _icall_Long( mb, this.ptr)
  }

  open fun cursorGetLine(): Long {
    val mb = getMethodBind("TextEdit","cursor_get_line")
    return _icall_Long( mb, this.ptr)
  }

  open fun cursorIsBlockMode(): Boolean {
    val mb = getMethodBind("TextEdit","cursor_is_block_mode")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun cursorSetBlinkEnabled(enable: Boolean) {
    val mb = getMethodBind("TextEdit","cursor_set_blink_enabled")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun cursorSetBlinkSpeed(blinkSpeed: Double) {
    val mb = getMethodBind("TextEdit","cursor_set_blink_speed")
    _icall_Unit_Double( mb, this.ptr, blinkSpeed)
  }

  open fun cursorSetBlockMode(enable: Boolean) {
    val mb = getMethodBind("TextEdit","cursor_set_block_mode")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun cursorSetColumn(column: Long, adjustViewport: Boolean = true) {
    val mb = getMethodBind("TextEdit","cursor_set_column")
    _icall_Unit_Long_Boolean( mb, this.ptr, column, adjustViewport)
  }

  open fun cursorSetLine(
    line: Long,
    adjustViewport: Boolean = true,
    canBeHidden: Boolean = true,
    wrapIndex: Long = 0
  ) {
    val mb = getMethodBind("TextEdit","cursor_set_line")
    _icall_Unit_Long_Boolean_Boolean_Long( mb, this.ptr, line, adjustViewport, canBeHidden,
        wrapIndex)
  }

  open fun cut() {
    val mb = getMethodBind("TextEdit","cut")
    _icall_Unit( mb, this.ptr)
  }

  open fun deselect() {
    val mb = getMethodBind("TextEdit","deselect")
    _icall_Unit( mb, this.ptr)
  }

  open fun drawMinimap(draw: Boolean) {
    val mb = getMethodBind("TextEdit","draw_minimap")
    _icall_Unit_Boolean( mb, this.ptr, draw)
  }

  open fun foldAllLines() {
    val mb = getMethodBind("TextEdit","fold_all_lines")
    _icall_Unit( mb, this.ptr)
  }

  open fun foldLine(line: Long) {
    val mb = getMethodBind("TextEdit","fold_line")
    _icall_Unit_Long( mb, this.ptr, line)
  }

  open fun getBreakpoints(): VariantArray {
    val mb = getMethodBind("TextEdit","get_breakpoints")
    return _icall_VariantArray( mb, this.ptr)
  }

  open fun getHScroll(): Long {
    val mb = getMethodBind("TextEdit","get_h_scroll")
    return _icall_Long( mb, this.ptr)
  }

  open fun getKeywordColor(keyword: String): Color {
    val mb = getMethodBind("TextEdit","get_keyword_color")
    return _icall_Color_String( mb, this.ptr, keyword)
  }

  open fun getLine(line: Long): String {
    val mb = getMethodBind("TextEdit","get_line")
    return _icall_String_Long( mb, this.ptr, line)
  }

  open fun getLineCount(): Long {
    val mb = getMethodBind("TextEdit","get_line_count")
    return _icall_Long( mb, this.ptr)
  }

  open fun getMenu(): PopupMenu {
    val mb = getMethodBind("TextEdit","get_menu")
    return _icall_PopupMenu( mb, this.ptr)
  }

  open fun getMinimapWidth(): Long {
    val mb = getMethodBind("TextEdit","get_minimap_width")
    return _icall_Long( mb, this.ptr)
  }

  open fun getSelectionFromColumn(): Long {
    val mb = getMethodBind("TextEdit","get_selection_from_column")
    return _icall_Long( mb, this.ptr)
  }

  open fun getSelectionFromLine(): Long {
    val mb = getMethodBind("TextEdit","get_selection_from_line")
    return _icall_Long( mb, this.ptr)
  }

  open fun getSelectionText(): String {
    val mb = getMethodBind("TextEdit","get_selection_text")
    return _icall_String( mb, this.ptr)
  }

  open fun getSelectionToColumn(): Long {
    val mb = getMethodBind("TextEdit","get_selection_to_column")
    return _icall_Long( mb, this.ptr)
  }

  open fun getSelectionToLine(): Long {
    val mb = getMethodBind("TextEdit","get_selection_to_line")
    return _icall_Long( mb, this.ptr)
  }

  open fun getText(): String {
    val mb = getMethodBind("TextEdit","get_text")
    return _icall_String( mb, this.ptr)
  }

  open fun getVScroll(): Double {
    val mb = getMethodBind("TextEdit","get_v_scroll")
    return _icall_Double( mb, this.ptr)
  }

  open fun getVScrollSpeed(): Double {
    val mb = getMethodBind("TextEdit","get_v_scroll_speed")
    return _icall_Double( mb, this.ptr)
  }

  open fun getWordUnderCursor(): String {
    val mb = getMethodBind("TextEdit","get_word_under_cursor")
    return _icall_String( mb, this.ptr)
  }

  open fun hasKeywordColor(keyword: String): Boolean {
    val mb = getMethodBind("TextEdit","has_keyword_color")
    return _icall_Boolean_String( mb, this.ptr, keyword)
  }

  open fun insertTextAtCursor(text: String) {
    val mb = getMethodBind("TextEdit","insert_text_at_cursor")
    _icall_Unit_String( mb, this.ptr, text)
  }

  open fun isBreakpointGutterEnabled(): Boolean {
    val mb = getMethodBind("TextEdit","is_breakpoint_gutter_enabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isContextMenuEnabled(): Boolean {
    val mb = getMethodBind("TextEdit","is_context_menu_enabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isDrawingFoldGutter(): Boolean {
    val mb = getMethodBind("TextEdit","is_drawing_fold_gutter")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isDrawingMinimap(): Boolean {
    val mb = getMethodBind("TextEdit","is_drawing_minimap")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isDrawingSpaces(): Boolean {
    val mb = getMethodBind("TextEdit","is_drawing_spaces")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isDrawingTabs(): Boolean {
    val mb = getMethodBind("TextEdit","is_drawing_tabs")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isFolded(line: Long): Boolean {
    val mb = getMethodBind("TextEdit","is_folded")
    return _icall_Boolean_Long( mb, this.ptr, line)
  }

  open fun isHidingEnabled(): Boolean {
    val mb = getMethodBind("TextEdit","is_hiding_enabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isHighlightAllOccurrencesEnabled(): Boolean {
    val mb = getMethodBind("TextEdit","is_highlight_all_occurrences_enabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isHighlightCurrentLineEnabled(): Boolean {
    val mb = getMethodBind("TextEdit","is_highlight_current_line_enabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isLineHidden(line: Long): Boolean {
    val mb = getMethodBind("TextEdit","is_line_hidden")
    return _icall_Boolean_Long( mb, this.ptr, line)
  }

  open fun isOverridingSelectedFontColor(): Boolean {
    val mb = getMethodBind("TextEdit","is_overriding_selected_font_color")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isReadonly(): Boolean {
    val mb = getMethodBind("TextEdit","is_readonly")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isRightClickMovingCaret(): Boolean {
    val mb = getMethodBind("TextEdit","is_right_click_moving_caret")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isSelectingEnabled(): Boolean {
    val mb = getMethodBind("TextEdit","is_selecting_enabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isSelectionActive(): Boolean {
    val mb = getMethodBind("TextEdit","is_selection_active")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isShortcutKeysEnabled(): Boolean {
    val mb = getMethodBind("TextEdit","is_shortcut_keys_enabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isShowLineNumbersEnabled(): Boolean {
    val mb = getMethodBind("TextEdit","is_show_line_numbers_enabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isSmoothScrollEnabled(): Boolean {
    val mb = getMethodBind("TextEdit","is_smooth_scroll_enabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isSyntaxColoringEnabled(): Boolean {
    val mb = getMethodBind("TextEdit","is_syntax_coloring_enabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isWrapEnabled(): Boolean {
    val mb = getMethodBind("TextEdit","is_wrap_enabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun menuOption(option: Long) {
    val mb = getMethodBind("TextEdit","menu_option")
    _icall_Unit_Long( mb, this.ptr, option)
  }

  open fun paste() {
    val mb = getMethodBind("TextEdit","paste")
    _icall_Unit( mb, this.ptr)
  }

  open fun redo() {
    val mb = getMethodBind("TextEdit","redo")
    _icall_Unit( mb, this.ptr)
  }

  open fun removeBreakpoints() {
    val mb = getMethodBind("TextEdit","remove_breakpoints")
    _icall_Unit( mb, this.ptr)
  }

  open fun search(
    key: String,
    flags: Long,
    fromLine: Long,
    fromColumn: Long
  ): PoolIntArray {
    val mb = getMethodBind("TextEdit","search")
    return _icall_PoolIntArray_String_Long_Long_Long( mb, this.ptr, key, flags, fromLine,
        fromColumn)
  }

  open fun select(
    fromLine: Long,
    fromColumn: Long,
    toLine: Long,
    toColumn: Long
  ) {
    val mb = getMethodBind("TextEdit","select")
    _icall_Unit_Long_Long_Long_Long( mb, this.ptr, fromLine, fromColumn, toLine, toColumn)
  }

  open fun selectAll() {
    val mb = getMethodBind("TextEdit","select_all")
    _icall_Unit( mb, this.ptr)
  }

  open fun setBreakpointGutterEnabled(enable: Boolean) {
    val mb = getMethodBind("TextEdit","set_breakpoint_gutter_enabled")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setContextMenuEnabled(enable: Boolean) {
    val mb = getMethodBind("TextEdit","set_context_menu_enabled")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setDrawFoldGutter(arg0: Boolean) {
    val mb = getMethodBind("TextEdit","set_draw_fold_gutter")
    _icall_Unit_Boolean( mb, this.ptr, arg0)
  }

  open fun setDrawSpaces(arg0: Boolean) {
    val mb = getMethodBind("TextEdit","set_draw_spaces")
    _icall_Unit_Boolean( mb, this.ptr, arg0)
  }

  open fun setDrawTabs(arg0: Boolean) {
    val mb = getMethodBind("TextEdit","set_draw_tabs")
    _icall_Unit_Boolean( mb, this.ptr, arg0)
  }

  open fun setHScroll(value: Long) {
    val mb = getMethodBind("TextEdit","set_h_scroll")
    _icall_Unit_Long( mb, this.ptr, value)
  }

  open fun setHidingEnabled(enable: Boolean) {
    val mb = getMethodBind("TextEdit","set_hiding_enabled")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setHighlightAllOccurrences(enable: Boolean) {
    val mb = getMethodBind("TextEdit","set_highlight_all_occurrences")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setHighlightCurrentLine(enabled: Boolean) {
    val mb = getMethodBind("TextEdit","set_highlight_current_line")
    _icall_Unit_Boolean( mb, this.ptr, enabled)
  }

  open fun setLine(line: Long, newText: String) {
    val mb = getMethodBind("TextEdit","set_line")
    _icall_Unit_Long_String( mb, this.ptr, line, newText)
  }

  open fun setLineAsHidden(line: Long, enable: Boolean) {
    val mb = getMethodBind("TextEdit","set_line_as_hidden")
    _icall_Unit_Long_Boolean( mb, this.ptr, line, enable)
  }

  open fun setMinimapWidth(width: Long) {
    val mb = getMethodBind("TextEdit","set_minimap_width")
    _icall_Unit_Long( mb, this.ptr, width)
  }

  open fun setOverrideSelectedFontColor(override: Boolean) {
    val mb = getMethodBind("TextEdit","set_override_selected_font_color")
    _icall_Unit_Boolean( mb, this.ptr, override)
  }

  open fun setReadonly(enable: Boolean) {
    val mb = getMethodBind("TextEdit","set_readonly")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setRightClickMovesCaret(enable: Boolean) {
    val mb = getMethodBind("TextEdit","set_right_click_moves_caret")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setSelectingEnabled(enable: Boolean) {
    val mb = getMethodBind("TextEdit","set_selecting_enabled")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setShortcutKeysEnabled(enable: Boolean) {
    val mb = getMethodBind("TextEdit","set_shortcut_keys_enabled")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setShowLineNumbers(enable: Boolean) {
    val mb = getMethodBind("TextEdit","set_show_line_numbers")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setSmoothScrollEnable(enable: Boolean) {
    val mb = getMethodBind("TextEdit","set_smooth_scroll_enable")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setSyntaxColoring(enable: Boolean) {
    val mb = getMethodBind("TextEdit","set_syntax_coloring")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setText(text: String) {
    val mb = getMethodBind("TextEdit","set_text")
    _icall_Unit_String( mb, this.ptr, text)
  }

  open fun setVScroll(value: Double) {
    val mb = getMethodBind("TextEdit","set_v_scroll")
    _icall_Unit_Double( mb, this.ptr, value)
  }

  open fun setVScrollSpeed(speed: Double) {
    val mb = getMethodBind("TextEdit","set_v_scroll_speed")
    _icall_Unit_Double( mb, this.ptr, speed)
  }

  open fun setWrapEnabled(enable: Boolean) {
    val mb = getMethodBind("TextEdit","set_wrap_enabled")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun toggleFoldLine(line: Long) {
    val mb = getMethodBind("TextEdit","toggle_fold_line")
    _icall_Unit_Long( mb, this.ptr, line)
  }

  open fun undo() {
    val mb = getMethodBind("TextEdit","undo")
    _icall_Unit( mb, this.ptr)
  }

  open fun unfoldLine(line: Long) {
    val mb = getMethodBind("TextEdit","unfold_line")
    _icall_Unit_Long( mb, this.ptr, line)
  }

  open fun unhideAllLines() {
    val mb = getMethodBind("TextEdit","unhide_all_lines")
    _icall_Unit( mb, this.ptr)
  }

  enum class SearchFlags(
    id: Long
  ) {
    SEARCH_MATCH_CASE(1),

    SEARCH_WHOLE_WORDS(2),

    SEARCH_BACKWARDS(4);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class SearchResult(
    id: Long
  ) {
    SEARCH_RESULT_COLUMN(0),

    SEARCH_RESULT_LINE(1);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class MenuItems(
    id: Long
  ) {
    MENU_CUT(0),

    MENU_COPY(1),

    MENU_PASTE(2),

    MENU_CLEAR(3),

    MENU_SELECT_ALL(4),

    MENU_UNDO(5),

    MENU_REDO(6),

    MENU_MAX(7);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object
}
