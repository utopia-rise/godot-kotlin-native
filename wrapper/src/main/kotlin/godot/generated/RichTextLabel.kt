@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class RichTextLabel : Control {
    constructor() : super("RichTextLabel")
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
    enum class ListType(val id: Int) {
        LIST_NUMBERS(0),
        LIST_LETTERS(1),
        LIST_DOTS(2),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }
    enum class ItemType(val id: Int) {
        ITEM_FRAME(0),
        ITEM_TEXT(1),
        ITEM_IMAGE(2),
        ITEM_NEWLINE(3),
        ITEM_FONT(4),
        ITEM_COLOR(5),
        ITEM_UNDERLINE(6),
        ITEM_ALIGN(7),
        ITEM_INDENT(8),
        ITEM_LIST(9),
        ITEM_TABLE(10),
        ITEM_META(11),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }


    // Signals
    class Signal {
        companion object {
            const val META_CLICKED: String = "meta_clicked"
            const val META_HOVER_STARTED: String = "meta_hover_started"
            const val META_HOVER_ENDED: String = "meta_hover_ended"
        }
    }


    companion object {
        infix fun from(other: Control): RichTextLabel = RichTextLabel("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CanvasItem): RichTextLabel = RichTextLabel("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): RichTextLabel = RichTextLabel("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): RichTextLabel = RichTextLabel("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): RichTextLabel = fromVariant(RichTextLabel(""), other)


        // Constants
        const val ALIGN_LEFT: Int = 0
        const val ALIGN_CENTER: Int = 1
        const val ALIGN_RIGHT: Int = 2
        const val ALIGN_FILL: Int = 3
        const val LIST_NUMBERS: Int = 0
        const val LIST_LETTERS: Int = 1
        const val LIST_DOTS: Int = 2
        const val ITEM_FRAME: Int = 0
        const val ITEM_TEXT: Int = 1
        const val ITEM_IMAGE: Int = 2
        const val ITEM_NEWLINE: Int = 3
        const val ITEM_FONT: Int = 4
        const val ITEM_COLOR: Int = 5
        const val ITEM_UNDERLINE: Int = 6
        const val ITEM_ALIGN: Int = 7
        const val ITEM_INDENT: Int = 8
        const val ITEM_LIST: Int = 9
        const val ITEM_TABLE: Int = 10
        const val ITEM_META: Int = 11


    }


    // Properties
    open var bbcodeEnabled: Boolean
        get() = _icall_Boolean(isUsingBbcodeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setUseBbcodeMethodBind, this.rawMemory, value)


    open var bbcodeText: String
        get() = _icall_String(getBbcodeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_String(setBbcodeMethodBind, this.rawMemory, value)


    open var visibleCharacters: Int
        get() = _icall_Int(getVisibleCharactersMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setVisibleCharactersMethodBind, this.rawMemory, value)


    open var percentVisible: Float
        get() = _icall_Float(getPercentVisibleMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setPercentVisibleMethodBind, this.rawMemory, value)


    open var metaUnderlined: Boolean
        get() = _icall_Boolean(isMetaUnderlinedMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setMetaUnderlineMethodBind, this.rawMemory, value)


    open var tabSize: Int
        get() = _icall_Int(getTabSizeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setTabSizeMethodBind, this.rawMemory, value)


    open var text: String
        get() = _icall_String(getTextMethodBind, this.rawMemory)
        set(value) = _icall_Unit_String(setTextMethodBind, this.rawMemory, value)


    open var scrollActive: Boolean
        get() = _icall_Boolean(isScrollActiveMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setScrollActiveMethodBind, this.rawMemory, value)


    open var scrollFollowing: Boolean
        get() = _icall_Boolean(isScrollFollowingMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setScrollFollowMethodBind, this.rawMemory, value)


    open var selectionEnabled: Boolean
        get() = _icall_Boolean(isSelectionEnabledMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setSelectionEnabledMethodBind, this.rawMemory, value)


    open var overrideSelectedFontColor: Boolean
        get() = _icall_Boolean(isOverridingSelectedFontColorMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setOverrideSelectedFontColorMethodBind, this.rawMemory, value)




    // Methods
    override fun _gui_input(arg0: InputEvent) {
    }


    open fun _scroll_changed(arg0: Float) {
    }


    private val getTextMethodBind: CPointer<godot_method_bind> by lazy { getMB("RichTextLabel", "get_text") }
    open fun getText(): String {
        return _icall_String(getTextMethodBind, this.rawMemory)
    }


    private val addTextMethodBind: CPointer<godot_method_bind> by lazy { getMB("RichTextLabel", "add_text") }
    open fun addText(text: String) {
        _icall_Unit_String(addTextMethodBind, this.rawMemory, text)
    }


    private val setTextMethodBind: CPointer<godot_method_bind> by lazy { getMB("RichTextLabel", "set_text") }
    open fun setText(text: String) {
        _icall_Unit_String(setTextMethodBind, this.rawMemory, text)
    }


    private val addImageMethodBind: CPointer<godot_method_bind> by lazy { getMB("RichTextLabel", "add_image") }
    open fun addImage(image: Texture) {
        _icall_Unit_Object(addImageMethodBind, this.rawMemory, image)
    }


    private val newlineMethodBind: CPointer<godot_method_bind> by lazy { getMB("RichTextLabel", "newline") }
    open fun newline() {
        _icall_Unit(newlineMethodBind, this.rawMemory)
    }


    private val removeLineMethodBind: CPointer<godot_method_bind> by lazy { getMB("RichTextLabel", "remove_line") }
    open fun removeLine(line: Int): Boolean {
        return _icall_Boolean_Int(removeLineMethodBind, this.rawMemory, line)
    }


    private val pushFontMethodBind: CPointer<godot_method_bind> by lazy { getMB("RichTextLabel", "push_font") }
    open fun pushFont(font: Font) {
        _icall_Unit_Object(pushFontMethodBind, this.rawMemory, font)
    }


    private val pushColorMethodBind: CPointer<godot_method_bind> by lazy { getMB("RichTextLabel", "push_color") }
    open fun pushColor(color: Color) {
        _icall_Unit_Color(pushColorMethodBind, this.rawMemory, color)
    }


    private val pushAlignMethodBind: CPointer<godot_method_bind> by lazy { getMB("RichTextLabel", "push_align") }
    open fun pushAlign(align: Int) {
        _icall_Unit_Int(pushAlignMethodBind, this.rawMemory, align)
    }


    private val pushIndentMethodBind: CPointer<godot_method_bind> by lazy { getMB("RichTextLabel", "push_indent") }
    open fun pushIndent(level: Int) {
        _icall_Unit_Int(pushIndentMethodBind, this.rawMemory, level)
    }


    private val pushListMethodBind: CPointer<godot_method_bind> by lazy { getMB("RichTextLabel", "push_list") }
    open fun pushList(type: Int) {
        _icall_Unit_Int(pushListMethodBind, this.rawMemory, type)
    }


    private val pushMetaMethodBind: CPointer<godot_method_bind> by lazy { getMB("RichTextLabel", "push_meta") }
    open fun pushMeta(data: Variant) {
        _icall_Unit_Variant(pushMetaMethodBind, this.rawMemory, data)
    }


    private val pushUnderlineMethodBind: CPointer<godot_method_bind> by lazy { getMB("RichTextLabel", "push_underline") }
    open fun pushUnderline() {
        _icall_Unit(pushUnderlineMethodBind, this.rawMemory)
    }


    private val pushTableMethodBind: CPointer<godot_method_bind> by lazy { getMB("RichTextLabel", "push_table") }
    open fun pushTable(columns: Int) {
        _icall_Unit_Int(pushTableMethodBind, this.rawMemory, columns)
    }


    private val setTableColumnExpandMethodBind: CPointer<godot_method_bind> by lazy { getMB("RichTextLabel", "set_table_column_expand") }
    open fun setTableColumnExpand(column: Int, expand: Boolean, ratio: Int) {
        _icall_Unit_Int_Boolean_Int(setTableColumnExpandMethodBind, this.rawMemory, column, expand, ratio)
    }


    private val pushCellMethodBind: CPointer<godot_method_bind> by lazy { getMB("RichTextLabel", "push_cell") }
    open fun pushCell() {
        _icall_Unit(pushCellMethodBind, this.rawMemory)
    }


    private val popMethodBind: CPointer<godot_method_bind> by lazy { getMB("RichTextLabel", "pop") }
    open fun pop() {
        _icall_Unit(popMethodBind, this.rawMemory)
    }


    private val clearMethodBind: CPointer<godot_method_bind> by lazy { getMB("RichTextLabel", "clear") }
    open fun clear() {
        _icall_Unit(clearMethodBind, this.rawMemory)
    }


    private val setMetaUnderlineMethodBind: CPointer<godot_method_bind> by lazy { getMB("RichTextLabel", "set_meta_underline") }
    open fun setMetaUnderline(enable: Boolean) {
        _icall_Unit_Boolean(setMetaUnderlineMethodBind, this.rawMemory, enable)
    }


    private val isMetaUnderlinedMethodBind: CPointer<godot_method_bind> by lazy { getMB("RichTextLabel", "is_meta_underlined") }
    open fun isMetaUnderlined(): Boolean {
        return _icall_Boolean(isMetaUnderlinedMethodBind, this.rawMemory)
    }


    private val setOverrideSelectedFontColorMethodBind: CPointer<godot_method_bind> by lazy { getMB("RichTextLabel", "set_override_selected_font_color") }
    open fun setOverrideSelectedFontColor(override: Boolean) {
        _icall_Unit_Boolean(setOverrideSelectedFontColorMethodBind, this.rawMemory, override)
    }


    private val isOverridingSelectedFontColorMethodBind: CPointer<godot_method_bind> by lazy { getMB("RichTextLabel", "is_overriding_selected_font_color") }
    open fun isOverridingSelectedFontColor(): Boolean {
        return _icall_Boolean(isOverridingSelectedFontColorMethodBind, this.rawMemory)
    }


    private val setScrollActiveMethodBind: CPointer<godot_method_bind> by lazy { getMB("RichTextLabel", "set_scroll_active") }
    open fun setScrollActive(active: Boolean) {
        _icall_Unit_Boolean(setScrollActiveMethodBind, this.rawMemory, active)
    }


    private val isScrollActiveMethodBind: CPointer<godot_method_bind> by lazy { getMB("RichTextLabel", "is_scroll_active") }
    open fun isScrollActive(): Boolean {
        return _icall_Boolean(isScrollActiveMethodBind, this.rawMemory)
    }


    private val setScrollFollowMethodBind: CPointer<godot_method_bind> by lazy { getMB("RichTextLabel", "set_scroll_follow") }
    open fun setScrollFollow(follow: Boolean) {
        _icall_Unit_Boolean(setScrollFollowMethodBind, this.rawMemory, follow)
    }


    private val isScrollFollowingMethodBind: CPointer<godot_method_bind> by lazy { getMB("RichTextLabel", "is_scroll_following") }
    open fun isScrollFollowing(): Boolean {
        return _icall_Boolean(isScrollFollowingMethodBind, this.rawMemory)
    }


    private val getVScrollMethodBind: CPointer<godot_method_bind> by lazy { getMB("RichTextLabel", "get_v_scroll") }
    open fun getVScroll(): VScrollBar {
        return _icall_VScrollBar(getVScrollMethodBind, this.rawMemory)
    }


    private val scrollToLineMethodBind: CPointer<godot_method_bind> by lazy { getMB("RichTextLabel", "scroll_to_line") }
    open fun scrollToLine(line: Int) {
        _icall_Unit_Int(scrollToLineMethodBind, this.rawMemory, line)
    }


    private val setTabSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("RichTextLabel", "set_tab_size") }
    open fun setTabSize(spaces: Int) {
        _icall_Unit_Int(setTabSizeMethodBind, this.rawMemory, spaces)
    }


    private val getTabSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("RichTextLabel", "get_tab_size") }
    open fun getTabSize(): Int {
        return _icall_Int(getTabSizeMethodBind, this.rawMemory)
    }


    private val setSelectionEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("RichTextLabel", "set_selection_enabled") }
    open fun setSelectionEnabled(enabled: Boolean) {
        _icall_Unit_Boolean(setSelectionEnabledMethodBind, this.rawMemory, enabled)
    }


    private val isSelectionEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("RichTextLabel", "is_selection_enabled") }
    open fun isSelectionEnabled(): Boolean {
        return _icall_Boolean(isSelectionEnabledMethodBind, this.rawMemory)
    }


    private val parseBbcodeMethodBind: CPointer<godot_method_bind> by lazy { getMB("RichTextLabel", "parse_bbcode") }
    open fun parseBbcode(bbcode: String): GodotError {
        return GodotError.fromInt(_icall_Int_String(parseBbcodeMethodBind, this.rawMemory, bbcode))
    }


    private val appendBbcodeMethodBind: CPointer<godot_method_bind> by lazy { getMB("RichTextLabel", "append_bbcode") }
    open fun appendBbcode(bbcode: String): GodotError {
        return GodotError.fromInt(_icall_Int_String(appendBbcodeMethodBind, this.rawMemory, bbcode))
    }


    private val setBbcodeMethodBind: CPointer<godot_method_bind> by lazy { getMB("RichTextLabel", "set_bbcode") }
    open fun setBbcode(text: String) {
        _icall_Unit_String(setBbcodeMethodBind, this.rawMemory, text)
    }


    private val getBbcodeMethodBind: CPointer<godot_method_bind> by lazy { getMB("RichTextLabel", "get_bbcode") }
    open fun getBbcode(): String {
        return _icall_String(getBbcodeMethodBind, this.rawMemory)
    }


    private val setVisibleCharactersMethodBind: CPointer<godot_method_bind> by lazy { getMB("RichTextLabel", "set_visible_characters") }
    open fun setVisibleCharacters(amount: Int) {
        _icall_Unit_Int(setVisibleCharactersMethodBind, this.rawMemory, amount)
    }


    private val getVisibleCharactersMethodBind: CPointer<godot_method_bind> by lazy { getMB("RichTextLabel", "get_visible_characters") }
    open fun getVisibleCharacters(): Int {
        return _icall_Int(getVisibleCharactersMethodBind, this.rawMemory)
    }


    private val setPercentVisibleMethodBind: CPointer<godot_method_bind> by lazy { getMB("RichTextLabel", "set_percent_visible") }
    open fun setPercentVisible(percentVisible: Float) {
        _icall_Unit_Float(setPercentVisibleMethodBind, this.rawMemory, percentVisible)
    }


    private val getPercentVisibleMethodBind: CPointer<godot_method_bind> by lazy { getMB("RichTextLabel", "get_percent_visible") }
    open fun getPercentVisible(): Float {
        return _icall_Float(getPercentVisibleMethodBind, this.rawMemory)
    }


    private val getTotalCharacterCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("RichTextLabel", "get_total_character_count") }
    open fun getTotalCharacterCount(): Int {
        return _icall_Int(getTotalCharacterCountMethodBind, this.rawMemory)
    }


    private val setUseBbcodeMethodBind: CPointer<godot_method_bind> by lazy { getMB("RichTextLabel", "set_use_bbcode") }
    open fun setUseBbcode(enable: Boolean) {
        _icall_Unit_Boolean(setUseBbcodeMethodBind, this.rawMemory, enable)
    }


    private val isUsingBbcodeMethodBind: CPointer<godot_method_bind> by lazy { getMB("RichTextLabel", "is_using_bbcode") }
    open fun isUsingBbcode(): Boolean {
        return _icall_Boolean(isUsingBbcodeMethodBind, this.rawMemory)
    }


    private val getLineCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("RichTextLabel", "get_line_count") }
    open fun getLineCount(): Int {
        return _icall_Int(getLineCountMethodBind, this.rawMemory)
    }


    private val getVisibleLineCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("RichTextLabel", "get_visible_line_count") }
    open fun getVisibleLineCount(): Int {
        return _icall_Int(getVisibleLineCountMethodBind, this.rawMemory)
    }


    private val getContentHeightMethodBind: CPointer<godot_method_bind> by lazy { getMB("RichTextLabel", "get_content_height") }
    open fun getContentHeight(): Int {
        return _icall_Int(getContentHeightMethodBind, this.rawMemory)
    }


}
