// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.SplitContainer
import godot.core.Signal1
import godot.core.signal
import godot.icalls._icall_Boolean
import godot.icalls._icall_Long
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Long
import godot.internal.utils.getMethodBind
import kotlin.Boolean
import kotlin.Long

open class SplitContainer internal constructor() : Container() {
  val dragged: Signal1<Long> by signal("offset")

  open var collapsed: Boolean
    get() {
      val mb = getMethodBind("SplitContainer","is_collapsed")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SplitContainer","set_collapsed")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var draggerVisibility: Long
    get() {
      val mb = getMethodBind("SplitContainer","get_dragger_visibility")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SplitContainer","set_dragger_visibility")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var splitOffset: Long
    get() {
      val mb = getMethodBind("SplitContainer","get_split_offset")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SplitContainer","set_split_offset")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  override fun _guiInput(arg0: InputEvent) {
  }

  open fun clampSplitOffset() {
    val mb = getMethodBind("SplitContainer","clamp_split_offset")
    _icall_Unit( mb, this.ptr)
  }

  open fun getDraggerVisibility(): SplitContainer.DraggerVisibility {
    val mb = getMethodBind("SplitContainer","get_dragger_visibility")
    return SplitContainer.DraggerVisibility.from( _icall_Long( mb, this.ptr))
  }

  open fun getSplitOffset(): Long {
    val mb = getMethodBind("SplitContainer","get_split_offset")
    return _icall_Long( mb, this.ptr)
  }

  open fun isCollapsed(): Boolean {
    val mb = getMethodBind("SplitContainer","is_collapsed")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun setCollapsed(collapsed: Boolean) {
    val mb = getMethodBind("SplitContainer","set_collapsed")
    _icall_Unit_Boolean( mb, this.ptr, collapsed)
  }

  open fun setDraggerVisibility(mode: Long) {
    val mb = getMethodBind("SplitContainer","set_dragger_visibility")
    _icall_Unit_Long( mb, this.ptr, mode)
  }

  open fun setSplitOffset(offset: Long) {
    val mb = getMethodBind("SplitContainer","set_split_offset")
    _icall_Unit_Long( mb, this.ptr, offset)
  }

  enum class DraggerVisibility(
    id: Long
  ) {
    DRAGGER_VISIBLE(0),

    DRAGGER_HIDDEN(1),

    DRAGGER_HIDDEN_COLLAPSED(2);

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
