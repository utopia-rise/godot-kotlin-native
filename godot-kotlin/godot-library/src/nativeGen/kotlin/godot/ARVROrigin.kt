// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot.shouldInitPtr
import godot.icalls._icall_Double
import godot.icalls._icall_Unit_Double
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Any
import kotlin.Double

open class ARVROrigin internal constructor(
  _ignore: Any?
) : Spatial(_ignore) {
  open var worldScale: Double
    get() {
      val mb = getMethodBind("ARVROrigin","get_world_scale")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ARVROrigin","set_world_scale")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = invokeConstructor("ARVROrigin", "ARVROrigin")
        }

  }

  open fun getWorldScale(): Double {
    val mb = getMethodBind("ARVROrigin","get_world_scale")
    return _icall_Double( mb, this.ptr)
  }

  open fun setWorldScale(worldScale: Double) {
    val mb = getMethodBind("ARVROrigin","set_world_scale")
    _icall_Unit_Double( mb, this.ptr, worldScale)
  }
}
