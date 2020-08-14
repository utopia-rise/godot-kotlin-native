// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Color
import godot.core.PoolColorArray
import godot.core.Signal1
import godot.core.signal
import godot.icalls._icall_Boolean
import godot.icalls._icall_Color
import godot.icalls._icall_PoolColorArray
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Color
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.COpaquePointer

open class ColorPicker : BoxContainer() {
  val colorChanged: Signal1<Color> by signal("color")

  val presetAdded: Signal1<Color> by signal("color")

  val presetRemoved: Signal1<Color> by signal("color")

  open var color: Color
    get() {
      val mb = getMethodBind("ColorPicker","get_pick_color")
      return _icall_Color(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ColorPicker","set_pick_color")
      _icall_Unit_Color(mb, this.ptr, value)
    }

  open var deferredMode: Boolean
    get() {
      val mb = getMethodBind("ColorPicker","is_deferred_mode")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ColorPicker","set_deferred_mode")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var editAlpha: Boolean
    get() {
      val mb = getMethodBind("ColorPicker","is_editing_alpha")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ColorPicker","set_edit_alpha")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var hsvMode: Boolean
    get() {
      val mb = getMethodBind("ColorPicker","is_hsv_mode")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ColorPicker","set_hsv_mode")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var presetsEnabled: Boolean
    get() {
      val mb = getMethodBind("ColorPicker","are_presets_enabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ColorPicker","set_presets_enabled")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var presetsVisible: Boolean
    get() {
      val mb = getMethodBind("ColorPicker","are_presets_visible")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ColorPicker","set_presets_visible")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var rawMode: Boolean
    get() {
      val mb = getMethodBind("ColorPicker","is_raw_mode")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ColorPicker","set_raw_mode")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  override fun __new(): COpaquePointer = invokeConstructor("ColorPicker", "ColorPicker")

  open fun color(schedule: Color.() -> Unit): Color = color.apply{
      schedule(this)
      color = this
  }


  open fun _addPresetPressed() {
  }

  open fun _focusEnter() {
  }

  open fun _focusExit() {
  }

  open fun _hsvDraw(arg0: Long, arg1: Control) {
  }

  open fun _htmlEntered(arg0: String) {
  }

  open fun _htmlFocusExit() {
  }

  open fun _presetInput(arg0: InputEvent) {
  }

  open fun _sampleDraw() {
  }

  open fun _screenInput(arg0: InputEvent) {
  }

  open fun _screenPickPressed() {
  }

  open fun _textTypeToggled() {
  }

  open fun _updatePresets() {
  }

  open fun _uvInput(arg0: InputEvent) {
  }

  open fun _valueChanged(arg0: Double) {
  }

  open fun _wInput(arg0: InputEvent) {
  }

  open fun addPreset(color: Color) {
    val mb = getMethodBind("ColorPicker","add_preset")
    _icall_Unit_Color( mb, this.ptr, color)
  }

  open fun arePresetsEnabled(): Boolean {
    val mb = getMethodBind("ColorPicker","are_presets_enabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun arePresetsVisible(): Boolean {
    val mb = getMethodBind("ColorPicker","are_presets_visible")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun erasePreset(color: Color) {
    val mb = getMethodBind("ColorPicker","erase_preset")
    _icall_Unit_Color( mb, this.ptr, color)
  }

  open fun getPickColor(): Color {
    val mb = getMethodBind("ColorPicker","get_pick_color")
    return _icall_Color( mb, this.ptr)
  }

  open fun getPresets(): PoolColorArray {
    val mb = getMethodBind("ColorPicker","get_presets")
    return _icall_PoolColorArray( mb, this.ptr)
  }

  open fun isDeferredMode(): Boolean {
    val mb = getMethodBind("ColorPicker","is_deferred_mode")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isEditingAlpha(): Boolean {
    val mb = getMethodBind("ColorPicker","is_editing_alpha")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isHsvMode(): Boolean {
    val mb = getMethodBind("ColorPicker","is_hsv_mode")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isRawMode(): Boolean {
    val mb = getMethodBind("ColorPicker","is_raw_mode")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun setDeferredMode(mode: Boolean) {
    val mb = getMethodBind("ColorPicker","set_deferred_mode")
    _icall_Unit_Boolean( mb, this.ptr, mode)
  }

  open fun setEditAlpha(show: Boolean) {
    val mb = getMethodBind("ColorPicker","set_edit_alpha")
    _icall_Unit_Boolean( mb, this.ptr, show)
  }

  open fun setHsvMode(mode: Boolean) {
    val mb = getMethodBind("ColorPicker","set_hsv_mode")
    _icall_Unit_Boolean( mb, this.ptr, mode)
  }

  open fun setPickColor(color: Color) {
    val mb = getMethodBind("ColorPicker","set_pick_color")
    _icall_Unit_Color( mb, this.ptr, color)
  }

  open fun setPresetsEnabled(enabled: Boolean) {
    val mb = getMethodBind("ColorPicker","set_presets_enabled")
    _icall_Unit_Boolean( mb, this.ptr, enabled)
  }

  open fun setPresetsVisible(visible: Boolean) {
    val mb = getMethodBind("ColorPicker","set_presets_visible")
    _icall_Unit_Boolean( mb, this.ptr, visible)
  }

  open fun setRawMode(mode: Boolean) {
    val mb = getMethodBind("ColorPicker","set_raw_mode")
    _icall_Unit_Boolean( mb, this.ptr, mode)
  }
}
