// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot.shouldInitPtr
import godot.icalls._icall_Double_Long
import godot.icalls._icall_Unit_Long_Double
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Double
import kotlin.Long
import kotlin.NotImplementedError

open class ConeTwistJoint internal constructor(
  _ignore: Any?
) : Joint(_ignore) {
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

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("ConeTwistJoint", "ConeTwistJoint")
        }

  }

  open fun _get_swing_span(): Double {
    throw NotImplementedError("_get_swing_span is not implemented for ConeTwistJoint")
  }

  open fun _get_twist_span(): Double {
    throw NotImplementedError("_get_twist_span is not implemented for ConeTwistJoint")
  }

  open fun _set_swing_span(swingSpan: Double) {
  }

  open fun _set_twist_span(twistSpan: Double) {
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

  companion object {
    final const val PARAM_BIAS: Long = 2

    final const val PARAM_MAX: Long = 5

    final const val PARAM_RELAXATION: Long = 4

    final const val PARAM_SOFTNESS: Long = 3

    final const val PARAM_SWING_SPAN: Long = 0

    final const val PARAM_TWIST_SPAN: Long = 1
  }
}
