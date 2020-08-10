// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot.shouldInitPtr
import godot.icalls._icall_Boolean
import godot.icalls._icall_Boolean_Object
import godot.icalls._icall_InputEvent
import godot.icalls._icall_String
import godot.icalls._icall_Unit_Object
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.String

open class ShortCut internal constructor(
  _ignore: Any?
) : Resource(_ignore) {
  open var shortcut: InputEvent
    get() {
      val mb = getMethodBind("ShortCut","get_shortcut")
      return _icall_InputEvent(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ShortCut","set_shortcut")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("ShortCut", "ShortCut")
        }

  }

  open fun getAsText(): String {
    val mb = getMethodBind("ShortCut","get_as_text")
    return _icall_String( mb, this.ptr)
  }

  open fun getShortcut(): InputEvent {
    val mb = getMethodBind("ShortCut","get_shortcut")
    return _icall_InputEvent( mb, this.ptr)
  }

  open fun isShortcut(event: InputEvent): Boolean {
    val mb = getMethodBind("ShortCut","is_shortcut")
    return _icall_Boolean_Object( mb, this.ptr, event)
  }

  open fun isValid(): Boolean {
    val mb = getMethodBind("ShortCut","is_valid")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun setShortcut(event: InputEvent) {
    val mb = getMethodBind("ShortCut","set_shortcut")
    _icall_Unit_Object( mb, this.ptr, event)
  }
}
