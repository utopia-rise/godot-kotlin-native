// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Color
import godot.core.Dictionary
import godot.core.Godot.shouldInitPtr
import godot.core.GodotError
import godot.core.PoolStringArray
import godot.core.Signal1
import godot.core.Variant
import godot.core.VariantArray
import godot.core.signal
import godot.icalls._icall_Boolean
import godot.icalls._icall_Boolean_Long
import godot.icalls._icall_Dictionary_PoolStringArray
import godot.icalls._icall_Double
import godot.icalls._icall_Long
import godot.icalls._icall_Long_String
import godot.icalls._icall_String
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Color
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Long_Boolean_Long
import godot.icalls._icall_Unit_Object
import godot.icalls._icall_Unit_Object_Long_Long
import godot.icalls._icall_Unit_String
import godot.icalls._icall_Unit_Variant
import godot.icalls._icall_Unit_VariantArray
import godot.icalls._icall_VScrollBar
import godot.icalls._icall_VariantArray
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.String

open class RichTextLabel internal constructor(
  _ignore: Any?
) : Control(_ignore) {
  val metaClicked: Signal1<Variant> by signal("meta")

  val metaHoverEnded: Signal1<Variant> by signal("meta")

  val metaHoverStarted: Signal1<Variant> by signal("meta")

  open var bbcodeEnabled: Boolean
    get() {
      val mb = getMethodBind("RichTextLabel","is_using_bbcode")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("RichTextLabel","set_use_bbcode")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var bbcodeText: String
    get() {
      val mb = getMethodBind("RichTextLabel","get_bbcode")
      return _icall_String(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("RichTextLabel","set_bbcode")
      _icall_Unit_String(mb, this.ptr, value)
    }

  open var customEffects: VariantArray
    get() {
      val mb = getMethodBind("RichTextLabel","get_effects")
      return _icall_VariantArray(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("RichTextLabel","set_effects")
      _icall_Unit_VariantArray(mb, this.ptr, value)
    }

  open var metaUnderlined: Boolean
    get() {
      val mb = getMethodBind("RichTextLabel","is_meta_underlined")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("RichTextLabel","set_meta_underline")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var overrideSelectedFontColor: Boolean
    get() {
      val mb = getMethodBind("RichTextLabel","is_overriding_selected_font_color")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("RichTextLabel","set_override_selected_font_color")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var percentVisible: Double
    get() {
      val mb = getMethodBind("RichTextLabel","get_percent_visible")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("RichTextLabel","set_percent_visible")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var scrollActive: Boolean
    get() {
      val mb = getMethodBind("RichTextLabel","is_scroll_active")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("RichTextLabel","set_scroll_active")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var scrollFollowing: Boolean
    get() {
      val mb = getMethodBind("RichTextLabel","is_scroll_following")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("RichTextLabel","set_scroll_follow")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var selectionEnabled: Boolean
    get() {
      val mb = getMethodBind("RichTextLabel","is_selection_enabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("RichTextLabel","set_selection_enabled")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var tabSize: Long
    get() {
      val mb = getMethodBind("RichTextLabel","get_tab_size")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("RichTextLabel","set_tab_size")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var text: String
    get() {
      val mb = getMethodBind("RichTextLabel","get_text")
      return _icall_String(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("RichTextLabel","set_text")
      _icall_Unit_String(mb, this.ptr, value)
    }

  open var visibleCharacters: Long
    get() {
      val mb = getMethodBind("RichTextLabel","get_visible_characters")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("RichTextLabel","set_visible_characters")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = invokeConstructor("RichTextLabel", "RichTextLabel")
        }

  }

  override fun _guiInput(arg0: InputEvent) {
  }

  open fun _scrollChanged(arg0: Double) {
  }

  open fun addImage(
    image: Texture,
    width: Long = 0,
    height: Long = 0
  ) {
    val mb = getMethodBind("RichTextLabel","add_image")
    _icall_Unit_Object_Long_Long( mb, this.ptr, image, width, height)
  }

  open fun addText(text: String) {
    val mb = getMethodBind("RichTextLabel","add_text")
    _icall_Unit_String( mb, this.ptr, text)
  }

  open fun appendBbcode(bbcode: String): GodotError {
    val mb = getMethodBind("RichTextLabel","append_bbcode")
    return GodotError.byValue( _icall_Long_String( mb, this.ptr, bbcode).toUInt())
  }

  open fun clear() {
    val mb = getMethodBind("RichTextLabel","clear")
    _icall_Unit( mb, this.ptr)
  }

  open fun getBbcode(): String {
    val mb = getMethodBind("RichTextLabel","get_bbcode")
    return _icall_String( mb, this.ptr)
  }

  open fun getContentHeight(): Long {
    val mb = getMethodBind("RichTextLabel","get_content_height")
    return _icall_Long( mb, this.ptr)
  }

  open fun getEffects(): VariantArray {
    val mb = getMethodBind("RichTextLabel","get_effects")
    return _icall_VariantArray( mb, this.ptr)
  }

  open fun getLineCount(): Long {
    val mb = getMethodBind("RichTextLabel","get_line_count")
    return _icall_Long( mb, this.ptr)
  }

  open fun getPercentVisible(): Double {
    val mb = getMethodBind("RichTextLabel","get_percent_visible")
    return _icall_Double( mb, this.ptr)
  }

  open fun getTabSize(): Long {
    val mb = getMethodBind("RichTextLabel","get_tab_size")
    return _icall_Long( mb, this.ptr)
  }

  open fun getText(): String {
    val mb = getMethodBind("RichTextLabel","get_text")
    return _icall_String( mb, this.ptr)
  }

  open fun getTotalCharacterCount(): Long {
    val mb = getMethodBind("RichTextLabel","get_total_character_count")
    return _icall_Long( mb, this.ptr)
  }

  open fun getVScroll(): VScrollBar {
    val mb = getMethodBind("RichTextLabel","get_v_scroll")
    return _icall_VScrollBar( mb, this.ptr)
  }

  open fun getVisibleCharacters(): Long {
    val mb = getMethodBind("RichTextLabel","get_visible_characters")
    return _icall_Long( mb, this.ptr)
  }

  open fun getVisibleLineCount(): Long {
    val mb = getMethodBind("RichTextLabel","get_visible_line_count")
    return _icall_Long( mb, this.ptr)
  }

  open fun installEffect(effect: Variant) {
    val mb = getMethodBind("RichTextLabel","install_effect")
    _icall_Unit_Variant( mb, this.ptr, effect)
  }

  open fun isMetaUnderlined(): Boolean {
    val mb = getMethodBind("RichTextLabel","is_meta_underlined")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isOverridingSelectedFontColor(): Boolean {
    val mb = getMethodBind("RichTextLabel","is_overriding_selected_font_color")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isScrollActive(): Boolean {
    val mb = getMethodBind("RichTextLabel","is_scroll_active")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isScrollFollowing(): Boolean {
    val mb = getMethodBind("RichTextLabel","is_scroll_following")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isSelectionEnabled(): Boolean {
    val mb = getMethodBind("RichTextLabel","is_selection_enabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isUsingBbcode(): Boolean {
    val mb = getMethodBind("RichTextLabel","is_using_bbcode")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun newline() {
    val mb = getMethodBind("RichTextLabel","newline")
    _icall_Unit( mb, this.ptr)
  }

  open fun parseBbcode(bbcode: String): GodotError {
    val mb = getMethodBind("RichTextLabel","parse_bbcode")
    return GodotError.byValue( _icall_Long_String( mb, this.ptr, bbcode).toUInt())
  }

  open fun parseExpressionsForValues(expressions: PoolStringArray): Dictionary {
    val mb = getMethodBind("RichTextLabel","parse_expressions_for_values")
    return _icall_Dictionary_PoolStringArray( mb, this.ptr, expressions)
  }

  open fun pop() {
    val mb = getMethodBind("RichTextLabel","pop")
    _icall_Unit( mb, this.ptr)
  }

  open fun pushAlign(align: Long) {
    val mb = getMethodBind("RichTextLabel","push_align")
    _icall_Unit_Long( mb, this.ptr, align)
  }

  open fun pushBold() {
    val mb = getMethodBind("RichTextLabel","push_bold")
    _icall_Unit( mb, this.ptr)
  }

  open fun pushBoldItalics() {
    val mb = getMethodBind("RichTextLabel","push_bold_italics")
    _icall_Unit( mb, this.ptr)
  }

  open fun pushCell() {
    val mb = getMethodBind("RichTextLabel","push_cell")
    _icall_Unit( mb, this.ptr)
  }

  open fun pushColor(color: Color) {
    val mb = getMethodBind("RichTextLabel","push_color")
    _icall_Unit_Color( mb, this.ptr, color)
  }

  open fun pushFont(font: Font) {
    val mb = getMethodBind("RichTextLabel","push_font")
    _icall_Unit_Object( mb, this.ptr, font)
  }

  open fun pushIndent(level: Long) {
    val mb = getMethodBind("RichTextLabel","push_indent")
    _icall_Unit_Long( mb, this.ptr, level)
  }

  open fun pushItalics() {
    val mb = getMethodBind("RichTextLabel","push_italics")
    _icall_Unit( mb, this.ptr)
  }

  open fun pushList(type: Long) {
    val mb = getMethodBind("RichTextLabel","push_list")
    _icall_Unit_Long( mb, this.ptr, type)
  }

  open fun pushMeta(data: Variant) {
    val mb = getMethodBind("RichTextLabel","push_meta")
    _icall_Unit_Variant( mb, this.ptr, data)
  }

  open fun pushMono() {
    val mb = getMethodBind("RichTextLabel","push_mono")
    _icall_Unit( mb, this.ptr)
  }

  open fun pushNormal() {
    val mb = getMethodBind("RichTextLabel","push_normal")
    _icall_Unit( mb, this.ptr)
  }

  open fun pushStrikethrough() {
    val mb = getMethodBind("RichTextLabel","push_strikethrough")
    _icall_Unit( mb, this.ptr)
  }

  open fun pushTable(columns: Long) {
    val mb = getMethodBind("RichTextLabel","push_table")
    _icall_Unit_Long( mb, this.ptr, columns)
  }

  open fun pushUnderline() {
    val mb = getMethodBind("RichTextLabel","push_underline")
    _icall_Unit( mb, this.ptr)
  }

  open fun removeLine(line: Long): Boolean {
    val mb = getMethodBind("RichTextLabel","remove_line")
    return _icall_Boolean_Long( mb, this.ptr, line)
  }

  open fun scrollToLine(line: Long) {
    val mb = getMethodBind("RichTextLabel","scroll_to_line")
    _icall_Unit_Long( mb, this.ptr, line)
  }

  open fun setBbcode(text: String) {
    val mb = getMethodBind("RichTextLabel","set_bbcode")
    _icall_Unit_String( mb, this.ptr, text)
  }

  open fun setEffects(effects: VariantArray) {
    val mb = getMethodBind("RichTextLabel","set_effects")
    _icall_Unit_VariantArray( mb, this.ptr, effects)
  }

  open fun setMetaUnderline(enable: Boolean) {
    val mb = getMethodBind("RichTextLabel","set_meta_underline")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setOverrideSelectedFontColor(override: Boolean) {
    val mb = getMethodBind("RichTextLabel","set_override_selected_font_color")
    _icall_Unit_Boolean( mb, this.ptr, override)
  }

  open fun setPercentVisible(percentVisible: Double) {
    val mb = getMethodBind("RichTextLabel","set_percent_visible")
    _icall_Unit_Double( mb, this.ptr, percentVisible)
  }

  open fun setScrollActive(active: Boolean) {
    val mb = getMethodBind("RichTextLabel","set_scroll_active")
    _icall_Unit_Boolean( mb, this.ptr, active)
  }

  open fun setScrollFollow(follow: Boolean) {
    val mb = getMethodBind("RichTextLabel","set_scroll_follow")
    _icall_Unit_Boolean( mb, this.ptr, follow)
  }

  open fun setSelectionEnabled(enabled: Boolean) {
    val mb = getMethodBind("RichTextLabel","set_selection_enabled")
    _icall_Unit_Boolean( mb, this.ptr, enabled)
  }

  open fun setTabSize(spaces: Long) {
    val mb = getMethodBind("RichTextLabel","set_tab_size")
    _icall_Unit_Long( mb, this.ptr, spaces)
  }

  open fun setTableColumnExpand(
    column: Long,
    expand: Boolean,
    ratio: Long
  ) {
    val mb = getMethodBind("RichTextLabel","set_table_column_expand")
    _icall_Unit_Long_Boolean_Long( mb, this.ptr, column, expand, ratio)
  }

  open fun setText(text: String) {
    val mb = getMethodBind("RichTextLabel","set_text")
    _icall_Unit_String( mb, this.ptr, text)
  }

  open fun setUseBbcode(enable: Boolean) {
    val mb = getMethodBind("RichTextLabel","set_use_bbcode")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setVisibleCharacters(amount: Long) {
    val mb = getMethodBind("RichTextLabel","set_visible_characters")
    _icall_Unit_Long( mb, this.ptr, amount)
  }

  enum class Align(
    id: Long
  ) {
    ALIGN_LEFT(0),

    ALIGN_CENTER(1),

    ALIGN_RIGHT(2),

    ALIGN_FILL(3);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class ListType(
    id: Long
  ) {
    LIST_NUMBERS(0),

    LIST_LETTERS(1),

    LIST_DOTS(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class ItemType(
    id: Long
  ) {
    ITEM_FRAME(0),

    ITEM_TEXT(1),

    ITEM_IMAGE(2),

    ITEM_NEWLINE(3),

    ITEM_FONT(4),

    ITEM_COLOR(5),

    ITEM_UNDERLINE(6),

    ITEM_STRIKETHROUGH(7),

    ITEM_ALIGN(8),

    ITEM_INDENT(9),

    ITEM_LIST(10),

    ITEM_TABLE(11),

    ITEM_FADE(12),

    ITEM_SHAKE(13),

    ITEM_WAVE(14),

    ITEM_TORNADO(15),

    ITEM_RAINBOW(16),

    ITEM_META(17),

    ITEM_CUSTOMFX(18);

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
