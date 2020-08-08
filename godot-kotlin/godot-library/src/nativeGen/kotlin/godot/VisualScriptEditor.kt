package godot

import godot.core.Godot
import godot.core.Signal0
import godot.core.signal
import godot.icalls._icall_Unit_String_String
import godot.icalls._icall_Unit_String_String_Object
import godot.internal.type.nullSafe
import godot.internal.utils.getMethodBind
import kotlin.String
import kotlin.requireNotNull
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped

object VisualScriptEditor : Object() {
  init {
    memScoped {
        val ptr =
        nullSafe(Godot.gdnative.godot_global_get_singleton).invoke("VisualScriptEditor".cstr.ptr)
        requireNotNull(ptr) { "No instance found for singleton VisualScriptEditor" }
        this@VisualScriptEditor.ptr = ptr
    }
  }

  val customNodesUpdated: Signal0 by signal()

  fun addCustomNode(
    name: String,
    category: String,
    script: Script
  ) {
    val mb = getMethodBind("_VisualScriptEditor","add_custom_node")
    _icall_Unit_String_String_Object( mb, this.ptr, name, category, script)
  }

  fun removeCustomNode(name: String, category: String) {
    val mb = getMethodBind("_VisualScriptEditor","remove_custom_node")
    _icall_Unit_String_String( mb, this.ptr, name, category)
  }
}
