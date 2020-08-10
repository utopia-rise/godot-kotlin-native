package godot

import godot.core.Godot.shouldInitPtr
import godot.icalls._icall_Environment
import godot.icalls._icall_Unit_Object
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any

open class WorldEnvironment internal constructor(
  _ignore: Any?
) : Node(_ignore) {
  open var environment: Environment
    get() {
      val mb = getMethodBind("WorldEnvironment","get_environment")
      return _icall_Environment(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("WorldEnvironment","set_environment")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("WorldEnvironment", "WorldEnvironment")
        }

  }

  open fun getEnvironment(): Environment {
    val mb = getMethodBind("WorldEnvironment","get_environment")
    return _icall_Environment( mb, this.ptr)
  }

  open fun setEnvironment(env: Environment) {
    val mb = getMethodBind("WorldEnvironment","set_environment")
    _icall_Unit_Object( mb, this.ptr, env)
  }
}
