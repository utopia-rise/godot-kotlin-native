// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot.shouldInitPtr
import godot.core.Transform
import godot.icalls._icall_Boolean
import godot.icalls._icall_Transform
import godot.icalls._icall_Unit
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Any
import kotlin.Boolean

open class Listener internal constructor(
  _ignore: Any?
) : Spatial(_ignore) {
  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = invokeConstructor("Listener", "Listener")
        }

  }

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
