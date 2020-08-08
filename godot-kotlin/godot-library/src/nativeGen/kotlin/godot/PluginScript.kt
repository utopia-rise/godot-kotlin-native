package godot

import godot.core.Godot.shouldInitPtr
import godot.core.Variant
import godot.icalls._icall_varargs
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any

open class PluginScript internal constructor(
  _ignore: Any?
) : Script(_ignore) {
  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("PluginScript", "PluginScript")
        }

  }

  open fun new(vararg __var_args: Any?): Variant {
    val mb = getMethodBind("PluginScript","new")
    return _icall_varargs( mb, this.ptr, __var_args)
  }

  companion object
}
