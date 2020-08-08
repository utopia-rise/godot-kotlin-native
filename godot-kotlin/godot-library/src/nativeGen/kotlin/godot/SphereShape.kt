package godot

import godot.core.Godot.shouldInitPtr
import godot.icalls._icall_Double
import godot.icalls._icall_Unit_Double
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Double

open class SphereShape internal constructor(
  _ignore: Any?
) : Shape(_ignore) {
  open var radius: Double
    get() {
      val mb = getMethodBind("SphereShape","get_radius")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SphereShape","set_radius")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("SphereShape", "SphereShape")
        }

  }

  open fun getRadius(): Double {
    val mb = getMethodBind("SphereShape","get_radius")
    return _icall_Double( mb, this.ptr)
  }

  open fun setRadius(radius: Double) {
    val mb = getMethodBind("SphereShape","set_radius")
    _icall_Unit_Double( mb, this.ptr, radius)
  }

  companion object
}
