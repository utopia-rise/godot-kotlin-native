package godot

import godot.core.Godot.shouldInitPtr
import godot.icalls._icall_Double
import godot.icalls._icall_Unit_Double
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Double

open class GrooveJoint2D internal constructor(
  _ignore: Any?
) : Joint2D(_ignore) {
  open var initialOffset: Double
    get() {
      val mb = getMethodBind("GrooveJoint2D","get_initial_offset")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("GrooveJoint2D","set_initial_offset")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var length: Double
    get() {
      val mb = getMethodBind("GrooveJoint2D","get_length")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("GrooveJoint2D","set_length")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("GrooveJoint2D", "GrooveJoint2D")
        }

  }

  open fun getInitialOffset(): Double {
    val mb = getMethodBind("GrooveJoint2D","get_initial_offset")
    return _icall_Double( mb, this.ptr)
  }

  open fun getLength(): Double {
    val mb = getMethodBind("GrooveJoint2D","get_length")
    return _icall_Double( mb, this.ptr)
  }

  open fun setInitialOffset(offset: Double) {
    val mb = getMethodBind("GrooveJoint2D","set_initial_offset")
    _icall_Unit_Double( mb, this.ptr, offset)
  }

  open fun setLength(length: Double) {
    val mb = getMethodBind("GrooveJoint2D","set_length")
    _icall_Unit_Double( mb, this.ptr, length)
  }
}
