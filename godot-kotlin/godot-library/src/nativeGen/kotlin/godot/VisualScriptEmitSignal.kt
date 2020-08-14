// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.icalls._icall_String
import godot.icalls._icall_Unit_String
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.String
import kotlinx.cinterop.COpaquePointer

open class VisualScriptEmitSignal : VisualScriptNode() {
  open var signal: String
    get() {
      val mb = getMethodBind("VisualScriptEmitSignal","get_signal")
      return _icall_String(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VisualScriptEmitSignal","set_signal")
      _icall_Unit_String(mb, this.ptr, value)
    }

  override fun __new(): COpaquePointer = invokeConstructor("VisualScriptEmitSignal",
      "VisualScriptEmitSignal")

  open fun getSignal(): String {
    val mb = getMethodBind("VisualScriptEmitSignal","get_signal")
    return _icall_String( mb, this.ptr)
  }

  open fun setSignal(name: String) {
    val mb = getMethodBind("VisualScriptEmitSignal","set_signal")
    _icall_Unit_String( mb, this.ptr, name)
  }
}
