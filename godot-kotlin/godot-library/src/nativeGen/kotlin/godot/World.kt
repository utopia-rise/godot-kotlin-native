// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot.shouldInitPtr
import godot.core.RID
import godot.icalls._icall_Environment
import godot.icalls._icall_PhysicsDirectSpaceState
import godot.icalls._icall_RID
import godot.icalls._icall_Unit_Object
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Any

open class World internal constructor(
  _ignore: Any?
) : Resource(_ignore) {
  open val directSpaceState: PhysicsDirectSpaceState
    get() {
      val mb = getMethodBind("World","get_direct_space_state")
      return _icall_PhysicsDirectSpaceState(mb, this.ptr)
    }

  open var environment: Environment
    get() {
      val mb = getMethodBind("World","get_environment")
      return _icall_Environment(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("World","set_environment")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  open var fallbackEnvironment: Environment
    get() {
      val mb = getMethodBind("World","get_fallback_environment")
      return _icall_Environment(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("World","set_fallback_environment")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  open val scenario: RID
    get() {
      val mb = getMethodBind("World","get_scenario")
      return _icall_RID(mb, this.ptr)
    }

  open val space: RID
    get() {
      val mb = getMethodBind("World","get_space")
      return _icall_RID(mb, this.ptr)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = invokeConstructor("World", "World")
        }

  }

  open fun getDirectSpaceState(): PhysicsDirectSpaceState {
    val mb = getMethodBind("World","get_direct_space_state")
    return _icall_PhysicsDirectSpaceState( mb, this.ptr)
  }

  open fun getEnvironment(): Environment {
    val mb = getMethodBind("World","get_environment")
    return _icall_Environment( mb, this.ptr)
  }

  open fun getFallbackEnvironment(): Environment {
    val mb = getMethodBind("World","get_fallback_environment")
    return _icall_Environment( mb, this.ptr)
  }

  open fun getScenario(): RID {
    val mb = getMethodBind("World","get_scenario")
    return _icall_RID( mb, this.ptr)
  }

  open fun getSpace(): RID {
    val mb = getMethodBind("World","get_space")
    return _icall_RID( mb, this.ptr)
  }

  open fun setEnvironment(env: Environment) {
    val mb = getMethodBind("World","set_environment")
    _icall_Unit_Object( mb, this.ptr, env)
  }

  open fun setFallbackEnvironment(env: Environment) {
    val mb = getMethodBind("World","set_fallback_environment")
    _icall_Unit_Object( mb, this.ptr, env)
  }
}
