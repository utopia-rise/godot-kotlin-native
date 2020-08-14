// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.icalls._icall_Boolean
import godot.icalls._icall_Long
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Long
import godot.internal.utils.getMethodBind
import kotlin.Boolean
import kotlin.Long

open class Slider internal constructor() : Range() {
  open var editable: Boolean
    get() {
      val mb = getMethodBind("Slider","is_editable")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Slider","set_editable")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var scrollable: Boolean
    get() {
      val mb = getMethodBind("Slider","is_scrollable")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Slider","set_scrollable")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var tickCount: Long
    get() {
      val mb = getMethodBind("Slider","get_ticks")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Slider","set_ticks")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var ticksOnBorders: Boolean
    get() {
      val mb = getMethodBind("Slider","get_ticks_on_borders")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Slider","set_ticks_on_borders")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  override fun _guiInput(arg0: InputEvent) {
  }

  open fun getTicks(): Long {
    val mb = getMethodBind("Slider","get_ticks")
    return _icall_Long( mb, this.ptr)
  }

  open fun getTicksOnBorders(): Boolean {
    val mb = getMethodBind("Slider","get_ticks_on_borders")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isEditable(): Boolean {
    val mb = getMethodBind("Slider","is_editable")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isScrollable(): Boolean {
    val mb = getMethodBind("Slider","is_scrollable")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun setEditable(editable: Boolean) {
    val mb = getMethodBind("Slider","set_editable")
    _icall_Unit_Boolean( mb, this.ptr, editable)
  }

  open fun setScrollable(scrollable: Boolean) {
    val mb = getMethodBind("Slider","set_scrollable")
    _icall_Unit_Boolean( mb, this.ptr, scrollable)
  }

  open fun setTicks(count: Long) {
    val mb = getMethodBind("Slider","set_ticks")
    _icall_Unit_Long( mb, this.ptr, count)
  }

  open fun setTicksOnBorders(ticksOnBorder: Boolean) {
    val mb = getMethodBind("Slider","set_ticks_on_borders")
    _icall_Unit_Boolean( mb, this.ptr, ticksOnBorder)
  }
}
