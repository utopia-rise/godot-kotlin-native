@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class TabContainer : Container {
    constructor() : super("TabContainer")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class TabAlign(val id: Int) {
        ALIGN_LEFT(0),
        ALIGN_CENTER(1),
        ALIGN_RIGHT(2),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }


    // Signals
    class Signal {
        companion object {
            const val PRE_POPUP_PRESSED: String = "pre_popup_pressed"
            const val TAB_SELECTED: String = "tab_selected"
            const val TAB_CHANGED: String = "tab_changed"
        }
    }


    companion object {
        infix fun from(other: Container): TabContainer = TabContainer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Control): TabContainer = TabContainer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CanvasItem): TabContainer = TabContainer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): TabContainer = TabContainer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): TabContainer = TabContainer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): TabContainer = fromVariant(TabContainer(""), other)


        // Constants
        const val ALIGN_LEFT: Int = 0
        const val ALIGN_CENTER: Int = 1
        const val ALIGN_RIGHT: Int = 2


    }


    // Properties
    open var tabAlign: Int
        get() = _icall_Int(getTabAlignMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setTabAlignMethodBind, this.rawMemory, value)


    open var currentTab: Int
        get() = _icall_Int(getCurrentTabMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setCurrentTabMethodBind, this.rawMemory, value)


    open var tabsVisible: Boolean
        get() = _icall_Boolean(areTabsVisibleMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setTabsVisibleMethodBind, this.rawMemory, value)


    open var dragToRearrangeEnabled: Boolean
        get() = _icall_Boolean(getDragToRearrangeEnabledMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setDragToRearrangeEnabledMethodBind, this.rawMemory, value)




    // Methods
    override fun _gui_input(arg0: InputEvent) {
    }


    private val getTabCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("TabContainer", "get_tab_count") }
    open fun getTabCount(): Int {
        return _icall_Int(getTabCountMethodBind, this.rawMemory)
    }


    private val setCurrentTabMethodBind: CPointer<godot_method_bind> by lazy { getMB("TabContainer", "set_current_tab") }
    open fun setCurrentTab(tabIdx: Int) {
        _icall_Unit_Int(setCurrentTabMethodBind, this.rawMemory, tabIdx)
    }


    private val getCurrentTabMethodBind: CPointer<godot_method_bind> by lazy { getMB("TabContainer", "get_current_tab") }
    open fun getCurrentTab(): Int {
        return _icall_Int(getCurrentTabMethodBind, this.rawMemory)
    }


    private val getPreviousTabMethodBind: CPointer<godot_method_bind> by lazy { getMB("TabContainer", "get_previous_tab") }
    open fun getPreviousTab(): Int {
        return _icall_Int(getPreviousTabMethodBind, this.rawMemory)
    }


    private val getCurrentTabControlMethodBind: CPointer<godot_method_bind> by lazy { getMB("TabContainer", "get_current_tab_control") }
    open fun getCurrentTabControl(): Control {
        return _icall_Control(getCurrentTabControlMethodBind, this.rawMemory)
    }


    private val getTabControlMethodBind: CPointer<godot_method_bind> by lazy { getMB("TabContainer", "get_tab_control") }
    open fun getTabControl(idx: Int): Control {
        return _icall_Control_Int(getTabControlMethodBind, this.rawMemory, idx)
    }


    private val setTabAlignMethodBind: CPointer<godot_method_bind> by lazy { getMB("TabContainer", "set_tab_align") }
    open fun setTabAlign(align: Int) {
        _icall_Unit_Int(setTabAlignMethodBind, this.rawMemory, align)
    }


    private val getTabAlignMethodBind: CPointer<godot_method_bind> by lazy { getMB("TabContainer", "get_tab_align") }
    open fun getTabAlign(): TabContainer.TabAlign {
        return TabContainer.TabAlign.fromInt(_icall_Int(getTabAlignMethodBind, this.rawMemory))
    }


    private val setTabsVisibleMethodBind: CPointer<godot_method_bind> by lazy { getMB("TabContainer", "set_tabs_visible") }
    open fun setTabsVisible(visible: Boolean) {
        _icall_Unit_Boolean(setTabsVisibleMethodBind, this.rawMemory, visible)
    }


    private val areTabsVisibleMethodBind: CPointer<godot_method_bind> by lazy { getMB("TabContainer", "are_tabs_visible") }
    open fun areTabsVisible(): Boolean {
        return _icall_Boolean(areTabsVisibleMethodBind, this.rawMemory)
    }


    private val setTabTitleMethodBind: CPointer<godot_method_bind> by lazy { getMB("TabContainer", "set_tab_title") }
    open fun setTabTitle(tabIdx: Int, title: String) {
        _icall_Unit_Int_String(setTabTitleMethodBind, this.rawMemory, tabIdx, title)
    }


    private val getTabTitleMethodBind: CPointer<godot_method_bind> by lazy { getMB("TabContainer", "get_tab_title") }
    open fun getTabTitle(tabIdx: Int): String {
        return _icall_String_Int(getTabTitleMethodBind, this.rawMemory, tabIdx)
    }


    private val setTabIconMethodBind: CPointer<godot_method_bind> by lazy { getMB("TabContainer", "set_tab_icon") }
    open fun setTabIcon(tabIdx: Int, icon: Texture) {
        _icall_Unit_Int_Object(setTabIconMethodBind, this.rawMemory, tabIdx, icon)
    }


    private val getTabIconMethodBind: CPointer<godot_method_bind> by lazy { getMB("TabContainer", "get_tab_icon") }
    open fun getTabIcon(tabIdx: Int): Texture {
        return _icall_Texture_Int(getTabIconMethodBind, this.rawMemory, tabIdx)
    }


    private val setTabDisabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("TabContainer", "set_tab_disabled") }
    open fun setTabDisabled(tabIdx: Int, disabled: Boolean) {
        _icall_Unit_Int_Boolean(setTabDisabledMethodBind, this.rawMemory, tabIdx, disabled)
    }


    private val getTabDisabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("TabContainer", "get_tab_disabled") }
    open fun getTabDisabled(tabIdx: Int): Boolean {
        return _icall_Boolean_Int(getTabDisabledMethodBind, this.rawMemory, tabIdx)
    }


    private val setPopupMethodBind: CPointer<godot_method_bind> by lazy { getMB("TabContainer", "set_popup") }
    open fun setPopup(popup: Object) {
        _icall_Unit_Object(setPopupMethodBind, this.rawMemory, popup)
    }


    private val getPopupMethodBind: CPointer<godot_method_bind> by lazy { getMB("TabContainer", "get_popup") }
    open fun getPopup(): Popup {
        return _icall_Popup(getPopupMethodBind, this.rawMemory)
    }


    private val setDragToRearrangeEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("TabContainer", "set_drag_to_rearrange_enabled") }
    open fun setDragToRearrangeEnabled(enabled: Boolean) {
        _icall_Unit_Boolean(setDragToRearrangeEnabledMethodBind, this.rawMemory, enabled)
    }


    private val getDragToRearrangeEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("TabContainer", "get_drag_to_rearrange_enabled") }
    open fun getDragToRearrangeEnabled(): Boolean {
        return _icall_Boolean(getDragToRearrangeEnabledMethodBind, this.rawMemory)
    }


    private val setTabsRearrangeGroupMethodBind: CPointer<godot_method_bind> by lazy { getMB("TabContainer", "set_tabs_rearrange_group") }
    open fun setTabsRearrangeGroup(groupId: Int) {
        _icall_Unit_Int(setTabsRearrangeGroupMethodBind, this.rawMemory, groupId)
    }


    private val getTabsRearrangeGroupMethodBind: CPointer<godot_method_bind> by lazy { getMB("TabContainer", "get_tabs_rearrange_group") }
    open fun getTabsRearrangeGroup(): Int {
        return _icall_Int(getTabsRearrangeGroupMethodBind, this.rawMemory)
    }


    open fun _child_renamed_callback() {
    }


    open fun _on_theme_changed() {
    }


    open fun _update_current_tab() {
    }


}
