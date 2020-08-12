// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.TabContainer
import godot.core.Godot.shouldInitPtr
import godot.core.Signal0
import godot.core.Signal1
import godot.core.signal
import godot.icalls._icall_Boolean
import godot.icalls._icall_Boolean_Long
import godot.icalls._icall_Control
import godot.icalls._icall_Control_Long
import godot.icalls._icall_Long
import godot.icalls._icall_Popup
import godot.icalls._icall_String_Long
import godot.icalls._icall_Texture_Long
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Long_Boolean
import godot.icalls._icall_Unit_Long_Object
import godot.icalls._icall_Unit_Long_String
import godot.icalls._icall_Unit_Object
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.String

open class TabContainer internal constructor(
  _ignore: Any?
) : Container(_ignore) {
  val prePopupPressed: Signal0 by signal()

  val tabChanged: Signal1<Long> by signal("tab")

  val tabSelected: Signal1<Long> by signal("tab")

  open var currentTab: Long
    get() {
      val mb = getMethodBind("TabContainer","get_current_tab")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("TabContainer","set_current_tab")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var dragToRearrangeEnabled: Boolean
    get() {
      val mb = getMethodBind("TabContainer","get_drag_to_rearrange_enabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("TabContainer","set_drag_to_rearrange_enabled")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var tabAlign: Long
    get() {
      val mb = getMethodBind("TabContainer","get_tab_align")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("TabContainer","set_tab_align")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var tabsVisible: Boolean
    get() {
      val mb = getMethodBind("TabContainer","are_tabs_visible")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("TabContainer","set_tabs_visible")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var useHiddenTabsForMinSize: Boolean
    get() {
      val mb = getMethodBind("TabContainer","get_use_hidden_tabs_for_min_size")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("TabContainer","set_use_hidden_tabs_for_min_size")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("TabContainer", "TabContainer")
        }

  }

  open fun _childRenamedCallback() {
  }

  override fun _guiInput(arg0: InputEvent) {
  }

  open fun _onMouseExited() {
  }

  open fun _onThemeChanged() {
  }

  open fun _updateCurrentTab() {
  }

  open fun areTabsVisible(): Boolean {
    val mb = getMethodBind("TabContainer","are_tabs_visible")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun getCurrentTab(): Long {
    val mb = getMethodBind("TabContainer","get_current_tab")
    return _icall_Long( mb, this.ptr)
  }

  open fun getCurrentTabControl(): Control {
    val mb = getMethodBind("TabContainer","get_current_tab_control")
    return _icall_Control( mb, this.ptr)
  }

  open fun getDragToRearrangeEnabled(): Boolean {
    val mb = getMethodBind("TabContainer","get_drag_to_rearrange_enabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun getPopup(): Popup {
    val mb = getMethodBind("TabContainer","get_popup")
    return _icall_Popup( mb, this.ptr)
  }

  open fun getPreviousTab(): Long {
    val mb = getMethodBind("TabContainer","get_previous_tab")
    return _icall_Long( mb, this.ptr)
  }

  open fun getTabAlign(): TabContainer.TabAlign {
    val mb = getMethodBind("TabContainer","get_tab_align")
    return TabContainer.TabAlign.from( _icall_Long( mb, this.ptr))
  }

  open fun getTabControl(tabIdx: Long): Control {
    val mb = getMethodBind("TabContainer","get_tab_control")
    return _icall_Control_Long( mb, this.ptr, tabIdx)
  }

  open fun getTabCount(): Long {
    val mb = getMethodBind("TabContainer","get_tab_count")
    return _icall_Long( mb, this.ptr)
  }

  open fun getTabDisabled(tabIdx: Long): Boolean {
    val mb = getMethodBind("TabContainer","get_tab_disabled")
    return _icall_Boolean_Long( mb, this.ptr, tabIdx)
  }

  open fun getTabIcon(tabIdx: Long): Texture {
    val mb = getMethodBind("TabContainer","get_tab_icon")
    return _icall_Texture_Long( mb, this.ptr, tabIdx)
  }

  open fun getTabTitle(tabIdx: Long): String {
    val mb = getMethodBind("TabContainer","get_tab_title")
    return _icall_String_Long( mb, this.ptr, tabIdx)
  }

  open fun getTabsRearrangeGroup(): Long {
    val mb = getMethodBind("TabContainer","get_tabs_rearrange_group")
    return _icall_Long( mb, this.ptr)
  }

  open fun getUseHiddenTabsForMinSize(): Boolean {
    val mb = getMethodBind("TabContainer","get_use_hidden_tabs_for_min_size")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun setCurrentTab(tabIdx: Long) {
    val mb = getMethodBind("TabContainer","set_current_tab")
    _icall_Unit_Long( mb, this.ptr, tabIdx)
  }

  open fun setDragToRearrangeEnabled(enabled: Boolean) {
    val mb = getMethodBind("TabContainer","set_drag_to_rearrange_enabled")
    _icall_Unit_Boolean( mb, this.ptr, enabled)
  }

  open fun setPopup(popup: Node) {
    val mb = getMethodBind("TabContainer","set_popup")
    _icall_Unit_Object( mb, this.ptr, popup)
  }

  open fun setTabAlign(align: Long) {
    val mb = getMethodBind("TabContainer","set_tab_align")
    _icall_Unit_Long( mb, this.ptr, align)
  }

  open fun setTabDisabled(tabIdx: Long, disabled: Boolean) {
    val mb = getMethodBind("TabContainer","set_tab_disabled")
    _icall_Unit_Long_Boolean( mb, this.ptr, tabIdx, disabled)
  }

  open fun setTabIcon(tabIdx: Long, icon: Texture) {
    val mb = getMethodBind("TabContainer","set_tab_icon")
    _icall_Unit_Long_Object( mb, this.ptr, tabIdx, icon)
  }

  open fun setTabTitle(tabIdx: Long, title: String) {
    val mb = getMethodBind("TabContainer","set_tab_title")
    _icall_Unit_Long_String( mb, this.ptr, tabIdx, title)
  }

  open fun setTabsRearrangeGroup(groupId: Long) {
    val mb = getMethodBind("TabContainer","set_tabs_rearrange_group")
    _icall_Unit_Long( mb, this.ptr, groupId)
  }

  open fun setTabsVisible(visible: Boolean) {
    val mb = getMethodBind("TabContainer","set_tabs_visible")
    _icall_Unit_Boolean( mb, this.ptr, visible)
  }

  open fun setUseHiddenTabsForMinSize(enabled: Boolean) {
    val mb = getMethodBind("TabContainer","set_use_hidden_tabs_for_min_size")
    _icall_Unit_Boolean( mb, this.ptr, enabled)
  }

  enum class TabAlign(
    id: Long
  ) {
    ALIGN_LEFT(0),

    ALIGN_CENTER(1),

    ALIGN_RIGHT(2);

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
