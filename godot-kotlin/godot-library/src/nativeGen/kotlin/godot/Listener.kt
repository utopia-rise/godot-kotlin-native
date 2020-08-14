// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Transform
import godot.icalls._icall_Boolean
import godot.icalls._icall_Transform
import godot.icalls._icall_Unit
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Boolean
import kotlinx.cinterop.COpaquePointer

open class Listener : Spatial() {
  override fun __new(): COpaquePointer = invokeConstructor("Listener", "Listener")

  open fun clearCurrent() {
    val mb = getMethodBind("Listener","clear_current")
    _icall_Unit( mb, this.ptr)
  }

  open fun getListenerTransform(): Transform {
    val mb = getMethodBind("Listener","get_listener_transform")
    return _icall_Transform( mb, this.ptr)
  }

  open fun isCurrent(): Boolean {
    val mb = getMethodBind("Listener","is_current")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun makeCurrent() {
    val mb = getMethodBind("Listener","make_current")
    _icall_Unit( mb, this.ptr)
  }
}
