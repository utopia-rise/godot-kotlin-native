// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.icalls._icall_Boolean
import godot.icalls._icall_Double
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Double
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Boolean
import kotlin.Double
import kotlinx.cinterop.COpaquePointer

open class PhysicsMaterial : Resource() {
  open var absorbent: Boolean
    get() {
      val mb = getMethodBind("PhysicsMaterial","is_absorbent")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("PhysicsMaterial","set_absorbent")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var bounce: Double
    get() {
      val mb = getMethodBind("PhysicsMaterial","get_bounce")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("PhysicsMaterial","set_bounce")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var friction: Double
    get() {
      val mb = getMethodBind("PhysicsMaterial","get_friction")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("PhysicsMaterial","set_friction")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var rough: Boolean
    get() {
      val mb = getMethodBind("PhysicsMaterial","is_rough")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("PhysicsMaterial","set_rough")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  override fun __new(): COpaquePointer = invokeConstructor("PhysicsMaterial", "PhysicsMaterial")

  open fun getBounce(): Double {
    val mb = getMethodBind("PhysicsMaterial","get_bounce")
    return _icall_Double( mb, this.ptr)
  }

  open fun getFriction(): Double {
    val mb = getMethodBind("PhysicsMaterial","get_friction")
    return _icall_Double( mb, this.ptr)
  }

  open fun isAbsorbent(): Boolean {
    val mb = getMethodBind("PhysicsMaterial","is_absorbent")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isRough(): Boolean {
    val mb = getMethodBind("PhysicsMaterial","is_rough")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun setAbsorbent(absorbent: Boolean) {
    val mb = getMethodBind("PhysicsMaterial","set_absorbent")
    _icall_Unit_Boolean( mb, this.ptr, absorbent)
  }

  open fun setBounce(bounce: Double) {
    val mb = getMethodBind("PhysicsMaterial","set_bounce")
    _icall_Unit_Double( mb, this.ptr, bounce)
  }

  open fun setFriction(friction: Double) {
    val mb = getMethodBind("PhysicsMaterial","set_friction")
    _icall_Unit_Double( mb, this.ptr, friction)
  }

  open fun setRough(rough: Boolean) {
    val mb = getMethodBind("PhysicsMaterial","set_rough")
    _icall_Unit_Boolean( mb, this.ptr, rough)
  }
}
