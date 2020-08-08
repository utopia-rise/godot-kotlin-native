package godot

import godot.core.Color
import godot.core.Godot.shouldInitPtr
import godot.icalls._icall_Boolean
import godot.icalls._icall_Color
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Color
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Unit

open class ReferenceRect internal constructor(
  _ignore: Any?
) : Control(_ignore) {
  open var borderColor: Color
    get() {
      val mb = getMethodBind("ReferenceRect","get_border_color")
      return _icall_Color(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ReferenceRect","set_border_color")
      _icall_Unit_Color(mb, this.ptr, value)
    }

  open var editorOnly: Boolean
    get() {
      val mb = getMethodBind("ReferenceRect","get_editor_only")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ReferenceRect","set_editor_only")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("ReferenceRect", "ReferenceRect")
        }

  }

  open fun borderColor(schedule: Color.() -> Unit): Color = borderColor.apply{
      schedule(this)
      borderColor = this
  }


  open fun getBorderColor(): Color {
    val mb = getMethodBind("ReferenceRect","get_border_color")
    return _icall_Color( mb, this.ptr)
  }

  open fun getEditorOnly(): Boolean {
    val mb = getMethodBind("ReferenceRect","get_editor_only")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun setBorderColor(color: Color) {
    val mb = getMethodBind("ReferenceRect","set_border_color")
    _icall_Unit_Color( mb, this.ptr, color)
  }

  open fun setEditorOnly(enabled: Boolean) {
    val mb = getMethodBind("ReferenceRect","set_editor_only")
    _icall_Unit_Boolean( mb, this.ptr, enabled)
  }

  companion object
}
