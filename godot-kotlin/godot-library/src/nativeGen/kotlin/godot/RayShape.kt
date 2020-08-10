package godot

import godot.core.Godot.shouldInitPtr
import godot.icalls._icall_Boolean
import godot.icalls._icall_Double
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Double
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Double

open class RayShape internal constructor(
  _ignore: Any?
) : Shape(_ignore) {
  open var length: Double
    get() {
      val mb = getMethodBind("RayShape","get_length")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("RayShape","set_length")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var slipsOnSlope: Boolean
    get() {
      val mb = getMethodBind("RayShape","get_slips_on_slope")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("RayShape","set_slips_on_slope")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("RayShape", "RayShape")
        }

  }

  open fun getLength(): Double {
    val mb = getMethodBind("RayShape","get_length")
    return _icall_Double( mb, this.ptr)
  }

  open fun getSlipsOnSlope(): Boolean {
    val mb = getMethodBind("RayShape","get_slips_on_slope")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun setLength(length: Double) {
    val mb = getMethodBind("RayShape","set_length")
    _icall_Unit_Double( mb, this.ptr, length)
  }

  open fun setSlipsOnSlope(active: Boolean) {
    val mb = getMethodBind("RayShape","set_slips_on_slope")
    _icall_Unit_Boolean( mb, this.ptr, active)
  }
}
