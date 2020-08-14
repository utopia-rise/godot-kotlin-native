// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.icalls._icall_Double_Long
import godot.icalls._icall_Unit_Long_Double
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Double
import kotlin.Long
import kotlinx.cinterop.COpaquePointer

open class PinJoint : Joint() {
  open var params_bias: Double
    get() {
      val mb = getMethodBind("PinJoint","get_param")
      return _icall_Double_Long(mb, this.ptr, 0)
    }
    set(value) {
      val mb = getMethodBind("PinJoint","set_param")
      _icall_Unit_Long_Double(mb, this.ptr, 0, value)
    }

  open var params_damping: Double
    get() {
      val mb = getMethodBind("PinJoint","get_param")
      return _icall_Double_Long(mb, this.ptr, 1)
    }
    set(value) {
      val mb = getMethodBind("PinJoint","set_param")
      _icall_Unit_Long_Double(mb, this.ptr, 1, value)
    }

  open var params_impulseClamp: Double
    get() {
      val mb = getMethodBind("PinJoint","get_param")
      return _icall_Double_Long(mb, this.ptr, 2)
    }
    set(value) {
      val mb = getMethodBind("PinJoint","set_param")
      _icall_Unit_Long_Double(mb, this.ptr, 2, value)
    }

  override fun __new(): COpaquePointer = invokeConstructor("PinJoint", "PinJoint")

  open fun getParam(param: Long): Double {
    val mb = getMethodBind("PinJoint","get_param")
    return _icall_Double_Long( mb, this.ptr, param)
  }

  open fun setParam(param: Long, value: Double) {
    val mb = getMethodBind("PinJoint","set_param")
    _icall_Unit_Long_Double( mb, this.ptr, param, value)
  }

  enum class Param(
    id: Long
  ) {
    PARAM_BIAS(0),

    PARAM_DAMPING(1),

    PARAM_IMPULSE_CLAMP(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object
}
