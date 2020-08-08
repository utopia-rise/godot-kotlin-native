package godot

import godot.Tabs
import godot.core.Godot.shouldInitPtr
import godot.core.Rect2
import godot.core.Signal1
import godot.core.signal
import godot.icalls._icall_Boolean
import godot.icalls._icall_Boolean_Long
import godot.icalls._icall_Long
import godot.icalls._icall_Rect2_Long
import godot.icalls._icall_String_Long
import godot.icalls._icall_Texture_Long
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Long_Boolean
import godot.icalls._icall_Unit_Long_Long
import godot.icalls._icall_Unit_Long_Object
import godot.icalls._icall_Unit_Long_String
import godot.icalls._icall_Unit_String_nObject
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.String

open class Tabs internal constructor(
  _ignore: Any?
) : Control(_ignore) {
  val repositionActiveTabRequest: Signal1<Long> by signal("idx_to")

  val rightButtonPressed: Signal1<Long> by signal("tab")

  val tabChanged: Signal1<Long> by signal("tab")

  val tabClicked: Signal1<Long> by signal("tab")

  val tabClose: Signal1<Long> by signal("tab")

  val tabHover: Signal1<Long> by signal("tab")

  open var currentTab: Long
    get() {
      val mb = getMethodBind("Tabs","get_current_tab")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Tabs","set_current_tab")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var dragToRearrangeEnabled: Boolean
    get() {
      val mb = getMethodBind("Tabs","get_drag_to_rearrange_enabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Tabs","set_drag_to_rearrange_enabled")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var scrollingEnabled: Boolean
    get() {
      val mb = getMethodBind("Tabs","get_scrolling_enabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Tabs","set_scrolling_enabled")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var tabAlign: Long
    get() {
      val mb = getMethodBind("Tabs","get_tab_align")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Tabs","set_tab_align")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var tabCloseDisplayPolicy: Long
    get() {
      val mb = getMethodBind("Tabs","get_tab_close_display_policy")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Tabs","set_tab_close_display_policy")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("Tabs", "Tabs")
        }

  }

  override fun _gui_input(arg0: InputEvent) {
  }

  open fun _on_mouse_exited() {
  }

  open fun _update_hover() {
  }

  open fun addTab(title: String = "", icon: Texture? = null) {
    val mb = getMethodBind("Tabs","add_tab")
    _icall_Unit_String_nObject( mb, this.ptr, title, icon)
  }

  open fun ensureTabVisible(idx: Long) {
    val mb = getMethodBind("Tabs","ensure_tab_visible")
    _icall_Unit_Long( mb, this.ptr, idx)
  }

  open fun getCurrentTab(): Long {
    val mb = getMethodBind("Tabs","get_current_tab")
    return _icall_Long( mb, this.ptr)
  }

  open fun getDragToRearrangeEnabled(): Boolean {
    val mb = getMethodBind("Tabs","get_drag_to_rearrange_enabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun getOffsetButtonsVisible(): Boolean {
    val mb = getMethodBind("Tabs","get_offset_buttons_visible")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun getScrollingEnabled(): Boolean {
    val mb = getMethodBind("Tabs","get_scrolling_enabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun getSelectWithRmb(): Boolean {
    val mb = getMethodBind("Tabs","get_select_with_rmb")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun getTabAlign(): Tabs.TabAlign {
    val mb = getMethodBind("Tabs","get_tab_align")
    return Tabs.TabAlign.from( _icall_Long( mb, this.ptr))
  }

  open fun getTabCloseDisplayPolicy(): Tabs.CloseButtonDisplayPolicy {
    val mb = getMethodBind("Tabs","get_tab_close_display_policy")
    return Tabs.CloseButtonDisplayPolicy.from( _icall_Long( mb, this.ptr))
  }

  open fun getTabCount(): Long {
    val mb = getMethodBind("Tabs","get_tab_count")
    return _icall_Long( mb, this.ptr)
  }

  open fun getTabDisabled(tabIdx: Long): Boolean {
    val mb = getMethodBind("Tabs","get_tab_disabled")
    return _icall_Boolean_Long( mb, this.ptr, tabIdx)
  }

  open fun getTabIcon(tabIdx: Long): Texture {
    val mb = getMethodBind("Tabs","get_tab_icon")
    return _icall_Texture_Long( mb, this.ptr, tabIdx)
  }

  open fun getTabOffset(): Long {
    val mb = getMethodBind("Tabs","get_tab_offset")
    return _icall_Long( mb, this.ptr)
  }

  open fun getTabRect(tabIdx: Long): Rect2 {
    val mb = getMethodBind("Tabs","get_tab_rect")
    return _icall_Rect2_Long( mb, this.ptr, tabIdx)
  }

  open fun getTabTitle(tabIdx: Long): String {
    val mb = getMethodBind("Tabs","get_tab_title")
    return _icall_String_Long( mb, this.ptr, tabIdx)
  }

  open fun getTabsRearrangeGroup(): Long {
    val mb = getMethodBind("Tabs","get_tabs_rearrange_group")
    return _icall_Long( mb, this.ptr)
  }

  open fun moveTab(from: Long, to: Long) {
    val mb = getMethodBind("Tabs","move_tab")
    _icall_Unit_Long_Long( mb, this.ptr, from, to)
  }

  open fun removeTab(tabIdx: Long) {
    val mb = getMethodBind("Tabs","remove_tab")
    _icall_Unit_Long( mb, this.ptr, tabIdx)
  }

  open fun setCurrentTab(tabIdx: Long) {
    val mb = getMethodBind("Tabs","set_current_tab")
    _icall_Unit_Long( mb, this.ptr, tabIdx)
  }

  open fun setDragToRearrangeEnabled(enabled: Boolean) {
    val mb = getMethodBind("Tabs","set_drag_to_rearrange_enabled")
    _icall_Unit_Boolean( mb, this.ptr, enabled)
  }

  open fun setScrollingEnabled(enabled: Boolean) {
    val mb = getMethodBind("Tabs","set_scrolling_enabled")
    _icall_Unit_Boolean( mb, this.ptr, enabled)
  }

  open fun setSelectWithRmb(enabled: Boolean) {
    val mb = getMethodBind("Tabs","set_select_with_rmb")
    _icall_Unit_Boolean( mb, this.ptr, enabled)
  }

  open fun setTabAlign(align: Long) {
    val mb = getMethodBind("Tabs","set_tab_align")
    _icall_Unit_Long( mb, this.ptr, align)
  }

  open fun setTabCloseDisplayPolicy(policy: Long) {
    val mb = getMethodBind("Tabs","set_tab_close_display_policy")
    _icall_Unit_Long( mb, this.ptr, policy)
  }

  open fun setTabDisabled(tabIdx: Long, disabled: Boolean) {
    val mb = getMethodBind("Tabs","set_tab_disabled")
    _icall_Unit_Long_Boolean( mb, this.ptr, tabIdx, disabled)
  }

  open fun setTabIcon(tabIdx: Long, icon: Texture) {
    val mb = getMethodBind("Tabs","set_tab_icon")
    _icall_Unit_Long_Object( mb, this.ptr, tabIdx, icon)
  }

  open fun setTabTitle(tabIdx: Long, title: String) {
    val mb = getMethodBind("Tabs","set_tab_title")
    _icall_Unit_Long_String( mb, this.ptr, tabIdx, title)
  }

  open fun setTabsRearrangeGroup(groupId: Long) {
    val mb = getMethodBind("Tabs","set_tabs_rearrange_group")
    _icall_Unit_Long( mb, this.ptr, groupId)
  }

  enum class CloseButtonDisplayPolicy(
    id: Long
  ) {
    CLOSE_BUTTON_SHOW_NEVER(0),

    CLOSE_BUTTON_SHOW_ACTIVE_ONLY(1),

    CLOSE_BUTTON_SHOW_ALWAYS(2),

    CLOSE_BUTTON_MAX(3);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class TabAlign(
    id: Long
  ) {
    ALIGN_LEFT(0),

    ALIGN_CENTER(1),

    ALIGN_RIGHT(2),

    ALIGN_MAX(3);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val ALIGN_CENTER: Long = 1

    final const val ALIGN_LEFT: Long = 0

    final const val ALIGN_MAX: Long = 3

    final const val ALIGN_RIGHT: Long = 2

    final const val CLOSE_BUTTON_MAX: Long = 3

    final const val CLOSE_BUTTON_SHOW_ACTIVE_ONLY: Long = 1

    final const val CLOSE_BUTTON_SHOW_ALWAYS: Long = 2

    final const val CLOSE_BUTTON_SHOW_NEVER: Long = 0
  }
}
