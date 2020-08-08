package godot

import godot.core.Godot.shouldInitPtr
import godot.core.Signal0
import godot.core.signal
import godot.icalls._icall_Boolean
import godot.icalls._icall_HScrollBar
import godot.icalls._icall_Long
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_VScrollBar
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long

open class ScrollContainer internal constructor(
  _ignore: Any?
) : Container(_ignore) {
  val scrollEnded: Signal0 by signal()

  val scrollStarted: Signal0 by signal()

  open var followFocus: Boolean
    get() {
      val mb = getMethodBind("ScrollContainer","is_following_focus")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ScrollContainer","set_follow_focus")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var scrollDeadzone: Long
    get() {
      val mb = getMethodBind("ScrollContainer","get_deadzone")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ScrollContainer","set_deadzone")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var scrollHorizontal: Long
    get() {
      val mb = getMethodBind("ScrollContainer","get_h_scroll")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ScrollContainer","set_h_scroll")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var scrollHorizontalEnabled: Boolean
    get() {
      val mb = getMethodBind("ScrollContainer","is_h_scroll_enabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ScrollContainer","set_enable_h_scroll")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var scrollVertical: Long
    get() {
      val mb = getMethodBind("ScrollContainer","get_v_scroll")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ScrollContainer","set_v_scroll")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var scrollVerticalEnabled: Boolean
    get() {
      val mb = getMethodBind("ScrollContainer","is_v_scroll_enabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ScrollContainer","set_enable_v_scroll")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("ScrollContainer", "ScrollContainer")
        }

  }

  open fun _ensure_focused_visible(arg0: Control) {
  }

  override fun _gui_input(arg0: InputEvent) {
  }

  open fun _scroll_moved(arg0: Double) {
  }

  open fun _update_scrollbar_position() {
  }

  open fun getDeadzone(): Long {
    val mb = getMethodBind("ScrollContainer","get_deadzone")
    return _icall_Long( mb, this.ptr)
  }

  open fun getHScroll(): Long {
    val mb = getMethodBind("ScrollContainer","get_h_scroll")
    return _icall_Long( mb, this.ptr)
  }

  open fun getHScrollbar(): HScrollBar {
    val mb = getMethodBind("ScrollContainer","get_h_scrollbar")
    return _icall_HScrollBar( mb, this.ptr)
  }

  open fun getVScroll(): Long {
    val mb = getMethodBind("ScrollContainer","get_v_scroll")
    return _icall_Long( mb, this.ptr)
  }

  open fun getVScrollbar(): VScrollBar {
    val mb = getMethodBind("ScrollContainer","get_v_scrollbar")
    return _icall_VScrollBar( mb, this.ptr)
  }

  open fun isFollowingFocus(): Boolean {
    val mb = getMethodBind("ScrollContainer","is_following_focus")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isHScrollEnabled(): Boolean {
    val mb = getMethodBind("ScrollContainer","is_h_scroll_enabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isVScrollEnabled(): Boolean {
    val mb = getMethodBind("ScrollContainer","is_v_scroll_enabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun setDeadzone(deadzone: Long) {
    val mb = getMethodBind("ScrollContainer","set_deadzone")
    _icall_Unit_Long( mb, this.ptr, deadzone)
  }

  open fun setEnableHScroll(enable: Boolean) {
    val mb = getMethodBind("ScrollContainer","set_enable_h_scroll")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setEnableVScroll(enable: Boolean) {
    val mb = getMethodBind("ScrollContainer","set_enable_v_scroll")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setFollowFocus(enabled: Boolean) {
    val mb = getMethodBind("ScrollContainer","set_follow_focus")
    _icall_Unit_Boolean( mb, this.ptr, enabled)
  }

  open fun setHScroll(value: Long) {
    val mb = getMethodBind("ScrollContainer","set_h_scroll")
    _icall_Unit_Long( mb, this.ptr, value)
  }

  open fun setVScroll(value: Long) {
    val mb = getMethodBind("ScrollContainer","set_v_scroll")
    _icall_Unit_Long( mb, this.ptr, value)
  }

  companion object
}
