// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot.shouldInitPtr
import godot.core.GodotError
import godot.icalls._icall_Long
import godot.icalls._icall_Unit
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Any

open class Mutex internal constructor(
  _ignore: Any?
) : Reference(_ignore) {
  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = invokeConstructor("Mutex", "_Mutex")
        }

  }

  open fun lock() {
    val mb = getMethodBind("_Mutex","lock")
    _icall_Unit( mb, this.ptr)
  }

  open fun tryLock(): GodotError {
    val mb = getMethodBind("_Mutex","try_lock")
    return GodotError.byValue( _icall_Long( mb, this.ptr).toUInt())
  }

  open fun unlock() {
    val mb = getMethodBind("_Mutex","unlock")
    _icall_Unit( mb, this.ptr)
  }
}
