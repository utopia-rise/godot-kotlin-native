// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.LineEdit
import godot.core.Godot.shouldInitPtr
import godot.icalls._icall_Boolean
import godot.icalls._icall_LineEdit
import godot.icalls._icall_Long
import godot.icalls._icall_String
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_String
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.String

open class SpinBox internal constructor(
  _ignore: Any?
) : Range(_ignore) {
  open var align: Long
    get() {
      val mb = getMethodBind("SpinBox","get_align")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SpinBox","set_align")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var editable: Boolean
    get() {
      val mb = getMethodBind("SpinBox","is_editable")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SpinBox","set_editable")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var prefix: String
    get() {
      val mb = getMethodBind("SpinBox","get_prefix")
      return _icall_String(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SpinBox","set_prefix")
      _icall_Unit_String(mb, this.ptr, value)
    }

  open var suffix: String
    get() {
      val mb = getMethodBind("SpinBox","get_suffix")
      return _icall_String(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SpinBox","set_suffix")
      _icall_Unit_String(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("SpinBox", "SpinBox")
        }

  }

  override fun _guiInput(arg0: InputEvent) {
  }

  open fun _lineEditFocusExit() {
  }

  open fun _lineEditInput(arg0: InputEvent) {
  }

  open fun _rangeClickTimeout() {
  }

  open fun _textEntered(arg0: String) {
  }

  open fun apply() {
    val mb = getMethodBind("SpinBox","apply")
    _icall_Unit( mb, this.ptr)
  }

  open fun getAlign(): LineEdit.Align {
    val mb = getMethodBind("SpinBox","get_align")
    return LineEdit.Align.from( _icall_Long( mb, this.ptr))
  }

  open fun getLineEdit(): LineEdit {
    val mb = getMethodBind("SpinBox","get_line_edit")
    return _icall_LineEdit( mb, this.ptr)
  }

  open fun getPrefix(): String {
    val mb = getMethodBind("SpinBox","get_prefix")
    return _icall_String( mb, this.ptr)
  }

  open fun getSuffix(): String {
    val mb = getMethodBind("SpinBox","get_suffix")
    return _icall_String( mb, this.ptr)
  }

  open fun isEditable(): Boolean {
    val mb = getMethodBind("SpinBox","is_editable")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun setAlign(align: Long) {
    val mb = getMethodBind("SpinBox","set_align")
    _icall_Unit_Long( mb, this.ptr, align)
  }

  open fun setEditable(editable: Boolean) {
    val mb = getMethodBind("SpinBox","set_editable")
    _icall_Unit_Boolean( mb, this.ptr, editable)
  }

  open fun setPrefix(prefix: String) {
    val mb = getMethodBind("SpinBox","set_prefix")
    _icall_Unit_String( mb, this.ptr, prefix)
  }

  open fun setSuffix(suffix: String) {
    val mb = getMethodBind("SpinBox","set_suffix")
    _icall_Unit_String( mb, this.ptr, suffix)
  }
}
