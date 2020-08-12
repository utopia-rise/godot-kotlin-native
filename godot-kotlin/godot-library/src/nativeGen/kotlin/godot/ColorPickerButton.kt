// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Color
import godot.core.Godot.shouldInitPtr
import godot.core.Signal0
import godot.core.Signal1
import godot.core.signal
import godot.icalls._icall_Boolean
import godot.icalls._icall_Color
import godot.icalls._icall_ColorPicker
import godot.icalls._icall_PopupPanel
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Color
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Unit

open class ColorPickerButton internal constructor(
  _ignore: Any?
) : Button(_ignore) {
  val colorChanged: Signal1<Color> by signal("color")

  val pickerCreated: Signal0 by signal()

  val popupClosed: Signal0 by signal()

  open var color: Color
    get() {
      val mb = getMethodBind("ColorPickerButton","get_pick_color")
      return _icall_Color(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ColorPickerButton","set_pick_color")
      _icall_Unit_Color(mb, this.ptr, value)
    }

  open var editAlpha: Boolean
    get() {
      val mb = getMethodBind("ColorPickerButton","is_editing_alpha")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ColorPickerButton","set_edit_alpha")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("ColorPickerButton", "ColorPickerButton")
        }

  }

  open fun color(schedule: Color.() -> Unit): Color = color.apply{
      schedule(this)
      color = this
  }


  open fun _colorChanged(arg0: Color) {
  }

  open fun _modalClosed() {
  }

  open fun getPickColor(): Color {
    val mb = getMethodBind("ColorPickerButton","get_pick_color")
    return _icall_Color( mb, this.ptr)
  }

  open fun getPicker(): ColorPicker {
    val mb = getMethodBind("ColorPickerButton","get_picker")
    return _icall_ColorPicker( mb, this.ptr)
  }

  open fun getPopup(): PopupPanel {
    val mb = getMethodBind("ColorPickerButton","get_popup")
    return _icall_PopupPanel( mb, this.ptr)
  }

  open fun isEditingAlpha(): Boolean {
    val mb = getMethodBind("ColorPickerButton","is_editing_alpha")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun setEditAlpha(show: Boolean) {
    val mb = getMethodBind("ColorPickerButton","set_edit_alpha")
    _icall_Unit_Boolean( mb, this.ptr, show)
  }

  open fun setPickColor(color: Color) {
    val mb = getMethodBind("ColorPickerButton","set_pick_color")
    _icall_Unit_Color( mb, this.ptr, color)
  }
}
