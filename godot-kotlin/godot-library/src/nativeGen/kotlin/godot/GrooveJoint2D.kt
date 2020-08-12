// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.icalls._icall_Double
import godot.icalls._icall_Unit_Double
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Double
import kotlinx.cinterop.COpaquePointer

open class GrooveJoint2D : Joint2D() {
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

  override fun __new(): COpaquePointer = invokeConstructor("GrooveJoint2D", "GrooveJoint2D")

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
