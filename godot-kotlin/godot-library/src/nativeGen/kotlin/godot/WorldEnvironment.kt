// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot.shouldInitPtr
import godot.icalls._icall_Environment
import godot.icalls._icall_Unit_Object
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
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
            this.ptr = invokeConstructor("WorldEnvironment", "WorldEnvironment")
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
