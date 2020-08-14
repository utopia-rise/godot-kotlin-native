// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.icalls._icall_Environment
import godot.icalls._icall_Unit_Object
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlinx.cinterop.COpaquePointer

open class WorldEnvironment : Node() {
  open var environment: Environment
    get() {
      val mb = getMethodBind("WorldEnvironment","get_environment")
      return _icall_Environment(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("WorldEnvironment","set_environment")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  override fun __new(): COpaquePointer = invokeConstructor("WorldEnvironment", "WorldEnvironment")

  open fun getEnvironment(): Environment {
    val mb = getMethodBind("WorldEnvironment","get_environment")
    return _icall_Environment( mb, this.ptr)
  }

  open fun setEnvironment(env: Environment) {
    val mb = getMethodBind("WorldEnvironment","set_environment")
    _icall_Unit_Object( mb, this.ptr, env)
  }
}
