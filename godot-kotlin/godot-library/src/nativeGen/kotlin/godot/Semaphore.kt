package godot

import godot.core.Godot.shouldInitPtr
import godot.core.GodotError
import godot.icalls._icall_Long
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any

open class Semaphore internal constructor(
  _ignore: Any?
) : Reference(_ignore) {
  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("Semaphore", "_Semaphore")
        }

  }

  open fun post(): GodotError {
    val mb = getMethodBind("_Semaphore","post")
    return GodotError.byValue( _icall_Long( mb, this.ptr).toUInt())
  }

  open fun wait(): GodotError {
    val mb = getMethodBind("_Semaphore","wait")
    return GodotError.byValue( _icall_Long( mb, this.ptr).toUInt())
  }

  companion object
}
