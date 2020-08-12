// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.icalls._icall_Double
import godot.icalls._icall_Unit_Double
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Double
import kotlinx.cinterop.COpaquePointer

open class DampedSpringJoint2D : Joint2D() {
  open var damping: Double
    get() {
      val mb = getMethodBind("DampedSpringJoint2D","get_damping")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("DampedSpringJoint2D","set_damping")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var length: Double
    get() {
      val mb = getMethodBind("DampedSpringJoint2D","get_length")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("DampedSpringJoint2D","set_length")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var restLength: Double
    get() {
      val mb = getMethodBind("DampedSpringJoint2D","get_rest_length")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("DampedSpringJoint2D","set_rest_length")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var stiffness: Double
    get() {
      val mb = getMethodBind("DampedSpringJoint2D","get_stiffness")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("DampedSpringJoint2D","set_stiffness")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  override fun __new(): COpaquePointer = invokeConstructor("DampedSpringJoint2D",
      "DampedSpringJoint2D")

  open fun getDamping(): Double {
    val mb = getMethodBind("DampedSpringJoint2D","get_damping")
    return _icall_Double( mb, this.ptr)
  }

  open fun getLength(): Double {
    val mb = getMethodBind("DampedSpringJoint2D","get_length")
    return _icall_Double( mb, this.ptr)
  }

  open fun getRestLength(): Double {
    val mb = getMethodBind("DampedSpringJoint2D","get_rest_length")
    return _icall_Double( mb, this.ptr)
  }

  open fun getStiffness(): Double {
    val mb = getMethodBind("DampedSpringJoint2D","get_stiffness")
    return _icall_Double( mb, this.ptr)
  }

  open fun setDamping(damping: Double) {
    val mb = getMethodBind("DampedSpringJoint2D","set_damping")
    _icall_Unit_Double( mb, this.ptr, damping)
  }

  open fun setLength(length: Double) {
    val mb = getMethodBind("DampedSpringJoint2D","set_length")
    _icall_Unit_Double( mb, this.ptr, length)
  }

  open fun setRestLength(restLength: Double) {
    val mb = getMethodBind("DampedSpringJoint2D","set_rest_length")
    _icall_Unit_Double( mb, this.ptr, restLength)
  }

  open fun setStiffness(stiffness: Double) {
    val mb = getMethodBind("DampedSpringJoint2D","set_stiffness")
    _icall_Unit_Double( mb, this.ptr, stiffness)
  }
}
