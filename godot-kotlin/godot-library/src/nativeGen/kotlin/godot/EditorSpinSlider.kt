package godot

import godot.icalls._icall_Boolean
import godot.icalls._icall_String
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_String
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.String

open class EditorSpinSlider internal constructor(
  _ignore: Any?
) : Range(_ignore) {
  open var flat: Boolean
    get() {
      val mb = getMethodBind("EditorSpinSlider","is_flat")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("EditorSpinSlider","set_flat")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var label: String
    get() {
      val mb = getMethodBind("EditorSpinSlider","get_label")
      return _icall_String(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("EditorSpinSlider","set_label")
      _icall_Unit_String(mb, this.ptr, value)
    }

  open var readOnly: Boolean
    get() {
      val mb = getMethodBind("EditorSpinSlider","is_read_only")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("EditorSpinSlider","set_read_only")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  internal constructor() : this(null)

  open fun _grabber_gui_input(arg0: InputEvent) {
  }

  open fun _grabber_mouse_entered() {
  }

  open fun _grabber_mouse_exited() {
  }

  override fun _gui_input(arg0: InputEvent) {
  }

  open fun _value_focus_exited() {
  }

  open fun _value_input_closed() {
  }

  open fun _value_input_entered(arg0: String) {
  }

  open fun getLabel(): String {
    val mb = getMethodBind("EditorSpinSlider","get_label")
    return _icall_String( mb, this.ptr)
  }

  open fun isFlat(): Boolean {
    val mb = getMethodBind("EditorSpinSlider","is_flat")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isReadOnly(): Boolean {
    val mb = getMethodBind("EditorSpinSlider","is_read_only")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun setFlat(flat: Boolean) {
    val mb = getMethodBind("EditorSpinSlider","set_flat")
    _icall_Unit_Boolean( mb, this.ptr, flat)
  }

  open fun setLabel(label: String) {
    val mb = getMethodBind("EditorSpinSlider","set_label")
    _icall_Unit_String( mb, this.ptr, label)
  }

  open fun setReadOnly(readOnly: Boolean) {
    val mb = getMethodBind("EditorSpinSlider","set_read_only")
    _icall_Unit_Boolean( mb, this.ptr, readOnly)
  }
}
