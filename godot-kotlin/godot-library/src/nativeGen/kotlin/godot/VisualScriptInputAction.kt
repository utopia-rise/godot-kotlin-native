// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.VisualScriptInputAction
import godot.icalls._icall_Long
import godot.icalls._icall_String
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_String
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Long
import kotlin.String
import kotlinx.cinterop.COpaquePointer

open class VisualScriptInputAction : VisualScriptNode() {
  open var action: String
    get() {
      val mb = getMethodBind("VisualScriptInputAction","get_action_name")
      return _icall_String(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VisualScriptInputAction","set_action_name")
      _icall_Unit_String(mb, this.ptr, value)
    }

  open var mode: Long
    get() {
      val mb = getMethodBind("VisualScriptInputAction","get_action_mode")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VisualScriptInputAction","set_action_mode")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  override fun __new(): COpaquePointer = invokeConstructor("VisualScriptInputAction",
      "VisualScriptInputAction")

  open fun getActionMode(): VisualScriptInputAction.Mode {
    val mb = getMethodBind("VisualScriptInputAction","get_action_mode")
    return VisualScriptInputAction.Mode.from( _icall_Long( mb, this.ptr))
  }

  open fun getActionName(): String {
    val mb = getMethodBind("VisualScriptInputAction","get_action_name")
    return _icall_String( mb, this.ptr)
  }

  open fun setActionMode(mode: Long) {
    val mb = getMethodBind("VisualScriptInputAction","set_action_mode")
    _icall_Unit_Long( mb, this.ptr, mode)
  }

  open fun setActionName(name: String) {
    val mb = getMethodBind("VisualScriptInputAction","set_action_name")
    _icall_Unit_String( mb, this.ptr, name)
  }

  enum class Mode(
    id: Long
  ) {
    MODE_PRESSED(0),

    MODE_RELEASED(1),

    MODE_JUST_PRESSED(2),

    MODE_JUST_RELEASED(3);

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
