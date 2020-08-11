// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot
import godot.core.VariantArray
import godot.icalls._icall_Boolean_Object_String
import godot.icalls._icall_Boolean_String
import godot.icalls._icall_Boolean_String_Object
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_String
import godot.icalls._icall_Unit_String_Double
import godot.icalls._icall_Unit_String_Object
import godot.icalls._icall_VariantArray
import godot.icalls._icall_VariantArray_String
import godot.internal.type.nullSafe
import godot.internal.utils.getMethodBind
import kotlin.Boolean
import kotlin.Double
import kotlin.String
import kotlin.requireNotNull
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped

object InputMap : Object() {
  init {
    memScoped {
        val ptr = nullSafe(Godot.gdnative.godot_global_get_singleton).invoke("InputMap".cstr.ptr)
        requireNotNull(ptr) { "No instance found for singleton InputMap" }
        this@InputMap.ptr = ptr
    }
  }

  fun actionAddEvent(action: String, event: InputEvent) {
    val mb = getMethodBind("InputMap","action_add_event")
    _icall_Unit_String_Object( mb, this.ptr, action, event)
  }

  fun actionEraseEvent(action: String, event: InputEvent) {
    val mb = getMethodBind("InputMap","action_erase_event")
    _icall_Unit_String_Object( mb, this.ptr, action, event)
  }

  fun actionEraseEvents(action: String) {
    val mb = getMethodBind("InputMap","action_erase_events")
    _icall_Unit_String( mb, this.ptr, action)
  }

  fun actionHasEvent(action: String, event: InputEvent): Boolean {
    val mb = getMethodBind("InputMap","action_has_event")
    return _icall_Boolean_String_Object( mb, this.ptr, action, event)
  }

  fun actionSetDeadzone(action: String, deadzone: Double) {
    val mb = getMethodBind("InputMap","action_set_deadzone")
    _icall_Unit_String_Double( mb, this.ptr, action, deadzone)
  }

  fun addAction(action: String, deadzone: Double = 0.5) {
    val mb = getMethodBind("InputMap","add_action")
    _icall_Unit_String_Double( mb, this.ptr, action, deadzone)
  }

  fun eraseAction(action: String) {
    val mb = getMethodBind("InputMap","erase_action")
    _icall_Unit_String( mb, this.ptr, action)
  }

  fun eventIsAction(event: InputEvent, action: String): Boolean {
    val mb = getMethodBind("InputMap","event_is_action")
    return _icall_Boolean_Object_String( mb, this.ptr, event, action)
  }

  fun getActionList(action: String): VariantArray {
    val mb = getMethodBind("InputMap","get_action_list")
    return _icall_VariantArray_String( mb, this.ptr, action)
  }

  fun getActions(): VariantArray {
    val mb = getMethodBind("InputMap","get_actions")
    return _icall_VariantArray( mb, this.ptr)
  }

  fun hasAction(action: String): Boolean {
    val mb = getMethodBind("InputMap","has_action")
    return _icall_Boolean_String( mb, this.ptr, action)
  }

  fun loadFromGlobals() {
    val mb = getMethodBind("InputMap","load_from_globals")
    _icall_Unit( mb, this.ptr)
  }
}
