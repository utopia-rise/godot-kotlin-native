@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class Tabs : Control {
    constructor() : super("Tabs")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class CloseButtonDisplayPolicy(val id: Long) {
        CLOSE_BUTTON_SHOW_NEVER(0),
        CLOSE_BUTTON_SHOW_ACTIVE_ONLY(1),
        CLOSE_BUTTON_SHOW_ALWAYS(2),
        CLOSE_BUTTON_MAX(3),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class TabAlign(val id: Long) {
        ALIGN_LEFT(0),
        ALIGN_CENTER(1),
        ALIGN_RIGHT(2),
        ALIGN_MAX(3),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }


    // Signals
    class Signal {
        companion object {
            const val TAB_CLOSE: String = "tab_close"
            const val TAB_CLICKED: String = "tab_clicked"
            const val REPOSITION_ACTIVE_TAB_REQUEST: String = "reposition_active_tab_request"
            const val RIGHT_BUTTON_PRESSED: String = "right_button_pressed"
            const val TAB_CHANGED: String = "tab_changed"
            const val TAB_HOVER: String = "tab_hover"
        }
    }


    companion object {
        infix fun from(other: Control): Tabs = Tabs("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CanvasItem): Tabs = Tabs("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): Tabs = Tabs("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): Tabs = Tabs("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): Tabs = fromVariant(Tabs(""), other)


        // Constants
        const val ALIGN_LEFT: Long = 0
        const val ALIGN_CENTER: Long = 1
        const val ALIGN_RIGHT: Long = 2
        const val ALIGN_MAX: Long = 3
        const val CLOSE_BUTTON_SHOW_NEVER: Long = 0
        const val CLOSE_BUTTON_SHOW_ACTIVE_ONLY: Long = 1
        const val CLOSE_BUTTON_SHOW_ALWAYS: Long = 2
        const val CLOSE_BUTTON_MAX: Long = 3


    }


    // Properties
    open var currentTab: Long
        get() = _icall_Long(getCurrentTabMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setCurrentTabMethodBind, this.rawMemory, value)


    open var tabAlign: Long
        get() = _icall_Long(getTabAlignMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setTabAlignMethodBind, this.rawMemory, value)


    open var tabCloseDisplayPolicy: Long
        get() = _icall_Long(getTabCloseDisplayPolicyMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setTabCloseDisplayPolicyMethodBind, this.rawMemory, value)


    open var scrollingEnabled: Boolean
        get() = _icall_Boolean(getScrollingEnabledMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setScrollingEnabledMethodBind, this.rawMemory, value)


    open var dragToRearrangeEnabled: Boolean
        get() = _icall_Boolean(getDragToRearrangeEnabledMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setDragToRearrangeEnabledMethodBind, this.rawMemory, value)




    // Methods
    override fun _gui_input(arg0: InputEvent) {
    }


    private val getTabCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("Tabs", "get_tab_count") }
    open fun getTabCount(): Long {
        return _icall_Long(getTabCountMethodBind, this.rawMemory)
    }


    private val setCurrentTabMethodBind: CPointer<godot_method_bind> by lazy { getMB("Tabs", "set_current_tab") }
    open fun setCurrentTab(tabIdx: Long) {
        _icall_Unit_Long(setCurrentTabMethodBind, this.rawMemory, tabIdx)
    }


    private val getCurrentTabMethodBind: CPointer<godot_method_bind> by lazy { getMB("Tabs", "get_current_tab") }
    open fun getCurrentTab(): Long {
        return _icall_Long(getCurrentTabMethodBind, this.rawMemory)
    }


    private val setTabTitleMethodBind: CPointer<godot_method_bind> by lazy { getMB("Tabs", "set_tab_title") }
    open fun setTabTitle(tabIdx: Long, title: String) {
        _icall_Unit_Long_String(setTabTitleMethodBind, this.rawMemory, tabIdx, title)
    }


    private val getTabTitleMethodBind: CPointer<godot_method_bind> by lazy { getMB("Tabs", "get_tab_title") }
    open fun getTabTitle(tabIdx: Long): String {
        return _icall_String_Long(getTabTitleMethodBind, this.rawMemory, tabIdx)
    }


    private val setTabIconMethodBind: CPointer<godot_method_bind> by lazy { getMB("Tabs", "set_tab_icon") }
    open fun setTabIcon(tabIdx: Long, icon: Texture) {
        _icall_Unit_Long_Object(setTabIconMethodBind, this.rawMemory, tabIdx, icon)
    }


    private val getTabIconMethodBind: CPointer<godot_method_bind> by lazy { getMB("Tabs", "get_tab_icon") }
    open fun getTabIcon(tabIdx: Long): Texture {
        return _icall_Texture_Long(getTabIconMethodBind, this.rawMemory, tabIdx)
    }


    private val setTabDisabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("Tabs", "set_tab_disabled") }
    open fun setTabDisabled(tabIdx: Long, disabled: Boolean) {
        _icall_Unit_Long_Boolean(setTabDisabledMethodBind, this.rawMemory, tabIdx, disabled)
    }


    private val getTabDisabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("Tabs", "get_tab_disabled") }
    open fun getTabDisabled(tabIdx: Long): Boolean {
        return _icall_Boolean_Long(getTabDisabledMethodBind, this.rawMemory, tabIdx)
    }


    private val removeTabMethodBind: CPointer<godot_method_bind> by lazy { getMB("Tabs", "remove_tab") }
    open fun removeTab(tabIdx: Long) {
        _icall_Unit_Long(removeTabMethodBind, this.rawMemory, tabIdx)
    }


    private val addTabMethodBind: CPointer<godot_method_bind> by lazy { getMB("Tabs", "add_tab") }
    open fun addTab(title: String = "", icon: Texture? = null) {
        _icall_Unit_String_nObject(addTabMethodBind, this.rawMemory, title, icon)
    }


    private val setTabAlignMethodBind: CPointer<godot_method_bind> by lazy { getMB("Tabs", "set_tab_align") }
    open fun setTabAlign(align: Long) {
        _icall_Unit_Long(setTabAlignMethodBind, this.rawMemory, align)
    }


    private val getTabAlignMethodBind: CPointer<godot_method_bind> by lazy { getMB("Tabs", "get_tab_align") }
    open fun getTabAlign(): Tabs.TabAlign {
        return Tabs.TabAlign.fromInt(_icall_Long(getTabAlignMethodBind, this.rawMemory))
    }


    private val getTabOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("Tabs", "get_tab_offset") }
    open fun getTabOffset(): Long {
        return _icall_Long(getTabOffsetMethodBind, this.rawMemory)
    }


    private val getOffsetButtonsVisibleMethodBind: CPointer<godot_method_bind> by lazy { getMB("Tabs", "get_offset_buttons_visible") }
    open fun getOffsetButtonsVisible(): Boolean {
        return _icall_Boolean(getOffsetButtonsVisibleMethodBind, this.rawMemory)
    }


    private val ensureTabVisibleMethodBind: CPointer<godot_method_bind> by lazy { getMB("Tabs", "ensure_tab_visible") }
    open fun ensureTabVisible(idx: Long) {
        _icall_Unit_Long(ensureTabVisibleMethodBind, this.rawMemory, idx)
    }


    private val getTabRectMethodBind: CPointer<godot_method_bind> by lazy { getMB("Tabs", "get_tab_rect") }
    open fun getTabRect(tabIdx: Long): Rect2 {
        return _icall_Rect2_Long(getTabRectMethodBind, this.rawMemory, tabIdx)
    }


    private val moveTabMethodBind: CPointer<godot_method_bind> by lazy { getMB("Tabs", "move_tab") }
    open fun moveTab(from: Long, to: Long) {
        _icall_Unit_Long_Long(moveTabMethodBind, this.rawMemory, from, to)
    }


    private val setTabCloseDisplayPolicyMethodBind: CPointer<godot_method_bind> by lazy { getMB("Tabs", "set_tab_close_display_policy") }
    open fun setTabCloseDisplayPolicy(policy: Long) {
        _icall_Unit_Long(setTabCloseDisplayPolicyMethodBind, this.rawMemory, policy)
    }


    private val getTabCloseDisplayPolicyMethodBind: CPointer<godot_method_bind> by lazy { getMB("Tabs", "get_tab_close_display_policy") }
    open fun getTabCloseDisplayPolicy(): Tabs.CloseButtonDisplayPolicy {
        return Tabs.CloseButtonDisplayPolicy.fromInt(_icall_Long(getTabCloseDisplayPolicyMethodBind, this.rawMemory))
    }


    private val setScrollingEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("Tabs", "set_scrolling_enabled") }
    open fun setScrollingEnabled(enabled: Boolean) {
        _icall_Unit_Boolean(setScrollingEnabledMethodBind, this.rawMemory, enabled)
    }


    private val getScrollingEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("Tabs", "get_scrolling_enabled") }
    open fun getScrollingEnabled(): Boolean {
        return _icall_Boolean(getScrollingEnabledMethodBind, this.rawMemory)
    }


    private val setDragToRearrangeEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("Tabs", "set_drag_to_rearrange_enabled") }
    open fun setDragToRearrangeEnabled(enabled: Boolean) {
        _icall_Unit_Boolean(setDragToRearrangeEnabledMethodBind, this.rawMemory, enabled)
    }


    private val getDragToRearrangeEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("Tabs", "get_drag_to_rearrange_enabled") }
    open fun getDragToRearrangeEnabled(): Boolean {
        return _icall_Boolean(getDragToRearrangeEnabledMethodBind, this.rawMemory)
    }


    private val setTabsRearrangeGroupMethodBind: CPointer<godot_method_bind> by lazy { getMB("Tabs", "set_tabs_rearrange_group") }
    open fun setTabsRearrangeGroup(groupId: Long) {
        _icall_Unit_Long(setTabsRearrangeGroupMethodBind, this.rawMemory, groupId)
    }


    private val getTabsRearrangeGroupMethodBind: CPointer<godot_method_bind> by lazy { getMB("Tabs", "get_tabs_rearrange_group") }
    open fun getTabsRearrangeGroup(): Long {
        return _icall_Long(getTabsRearrangeGroupMethodBind, this.rawMemory)
    }


}
