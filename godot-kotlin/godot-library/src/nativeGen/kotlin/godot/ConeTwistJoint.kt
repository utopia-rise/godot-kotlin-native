// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.icalls._icall_Double_Long
import godot.icalls._icall_Unit_Long_Double
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Double
import kotlin.Long
import kotlin.NotImplementedError
import kotlinx.cinterop.COpaquePointer

open class ConeTwistJoint : Joint() {
  open var bias: Double
    get() {
      val mb = getMethodBind("ConeTwistJoint","get_param")
      return _icall_Double_Long(mb, this.ptr, 2)
    }
    set(value) {
      val mb = getMethodBind("ConeTwistJoint","set_param")
      _icall_Unit_Long_Double(mb, this.ptr, 2, value)
    }

  open var relaxation: Double
    get() {
      val mb = getMethodBind("ConeTwistJoint","get_param")
      return _icall_Double_Long(mb, this.ptr, 4)
    }
    set(value) {
      val mb = getMethodBind("ConeTwistJoint","set_param")
      _icall_Unit_Long_Double(mb, this.ptr, 4, value)
    }

  open var softness: Double
    get() {
      val mb = getMethodBind("ConeTwistJoint","get_param")
      return _icall_Double_Long(mb, this.ptr, 3)
    }
    set(value) {
      val mb = getMethodBind("ConeTwistJoint","set_param")
      _icall_Unit_Long_Double(mb, this.ptr, 3, value)
    }

  override fun __new(): COpaquePointer = invokeConstructor("ConeTwistJoint", "ConeTwistJoint")

  open fun _getSwingSpan(): Double {
    throw NotImplementedError("_get_swing_span is not implemented for ConeTwistJoint")
  }

  open fun _getTwistSpan(): Double {
    throw NotImplementedError("_get_twist_span is not implemented for ConeTwistJoint")
  }

  open fun _setSwingSpan(swingSpan: Double) {
  }

  open fun _setTwistSpan(twistSpan: Double) {
  }

  open fun getParam(param: Long): Double {
    val mb = getMethodBind("ConeTwistJoint","get_param")
    return _icall_Double_Long( mb, this.ptr, param)
  }

  open fun setParam(param: Long, value: Double) {
    val mb = getMethodBind("ConeTwistJoint","set_param")
    _icall_Unit_Long_Double( mb, this.ptr, param, value)
  }

  enum class Param(
    id: Long
  ) {
    PARAM_SWING_SPAN(0),

    PARAM_TWIST_SPAN(1),

    PARAM_BIAS(2),

    PARAM_SOFTNESS(3),

    PARAM_RELAXATION(4),

    PARAM_MAX(5);

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
