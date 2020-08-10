package godot

import godot.core.Godot.shouldInitPtr
import godot.core.Vector2
import godot.icalls._icall_String
import godot.icalls._icall_Unit_String
import godot.icalls._icall_Unit_Vector2
import godot.icalls._icall_Vector2
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.String
import kotlin.Unit

open class VisualScriptComment internal constructor(
  _ignore: Any?
) : VisualScriptNode(_ignore) {
  open var description: String
    get() {
      val mb = getMethodBind("VisualScriptComment","get_description")
      return _icall_String(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VisualScriptComment","set_description")
      _icall_Unit_String(mb, this.ptr, value)
    }

  open var size: Vector2
    get() {
      val mb = getMethodBind("VisualScriptComment","get_size")
      return _icall_Vector2(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VisualScriptComment","set_size")
      _icall_Unit_Vector2(mb, this.ptr, value)
    }

  open var title: String
    get() {
      val mb = getMethodBind("VisualScriptComment","get_title")
      return _icall_String(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VisualScriptComment","set_title")
      _icall_Unit_String(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("VisualScriptComment", "VisualScriptComment")
        }

  }

  open fun size(schedule: Vector2.() -> Unit): Vector2 = size.apply{
      schedule(this)
      size = this
  }


  open fun getDescription(): String {
    val mb = getMethodBind("VisualScriptComment","get_description")
    return _icall_String( mb, this.ptr)
  }

  open fun getSize(): Vector2 {
    val mb = getMethodBind("VisualScriptComment","get_size")
    return _icall_Vector2( mb, this.ptr)
  }

  open fun getTitle(): String {
    val mb = getMethodBind("VisualScriptComment","get_title")
    return _icall_String( mb, this.ptr)
  }

  open fun setDescription(description: String) {
    val mb = getMethodBind("VisualScriptComment","set_description")
    _icall_Unit_String( mb, this.ptr, description)
  }

  open fun setSize(size: Vector2) {
    val mb = getMethodBind("VisualScriptComment","set_size")
    _icall_Unit_Vector2( mb, this.ptr, size)
  }

  open fun setTitle(title: String) {
    val mb = getMethodBind("VisualScriptComment","set_title")
    _icall_Unit_String( mb, this.ptr, title)
  }
}
