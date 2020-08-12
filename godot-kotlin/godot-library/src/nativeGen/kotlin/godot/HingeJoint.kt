// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot.shouldInitPtr
import godot.icalls._icall_Boolean_Long
import godot.icalls._icall_Double_Long
import godot.icalls._icall_Unit_Long_Boolean
import godot.icalls._icall_Unit_Long_Double
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.NotImplementedError

open class HingeJoint internal constructor(
  _ignore: Any?
) : Joint(_ignore) {
  open var angularLimit_bias: Double
    get() {
      val mb = getMethodBind("HingeJoint","get_param")
      return _icall_Double_Long(mb, this.ptr, 3)
    }
    set(value) {
      val mb = getMethodBind("HingeJoint","set_param")
      _icall_Unit_Long_Double(mb, this.ptr, 3, value)
    }

  open var angularLimit_enable: Boolean
    get() {
      val mb = getMethodBind("HingeJoint","get_flag")
      return _icall_Boolean_Long(mb, this.ptr, 0)
    }
    set(value) {
      val mb = getMethodBind("HingeJoint","set_flag")
      _icall_Unit_Long_Boolean(mb, this.ptr, 0, value)
    }

  open var angularLimit_relaxation: Double
    get() {
      val mb = getMethodBind("HingeJoint","get_param")
      return _icall_Double_Long(mb, this.ptr, 5)
    }
    set(value) {
      val mb = getMethodBind("HingeJoint","set_param")
      _icall_Unit_Long_Double(mb, this.ptr, 5, value)
    }

  open var angularLimit_softness: Double
    get() {
      val mb = getMethodBind("HingeJoint","get_param")
      return _icall_Double_Long(mb, this.ptr, 4)
    }
    set(value) {
      val mb = getMethodBind("HingeJoint","set_param")
      _icall_Unit_Long_Double(mb, this.ptr, 4, value)
    }

  open var motor_enable: Boolean
    get() {
      val mb = getMethodBind("HingeJoint","get_flag")
      return _icall_Boolean_Long(mb, this.ptr, 1)
    }
    set(value) {
      val mb = getMethodBind("HingeJoint","set_flag")
      _icall_Unit_Long_Boolean(mb, this.ptr, 1, value)
    }

  open var motor_maxImpulse: Double
    get() {
      val mb = getMethodBind("HingeJoint","get_param")
      return _icall_Double_Long(mb, this.ptr, 7)
    }
    set(value) {
      val mb = getMethodBind("HingeJoint","set_param")
      _icall_Unit_Long_Double(mb, this.ptr, 7, value)
    }

  open var motor_targetVelocity: Double
    get() {
      val mb = getMethodBind("HingeJoint","get_param")
      return _icall_Double_Long(mb, this.ptr, 6)
    }
    set(value) {
      val mb = getMethodBind("HingeJoint","set_param")
      _icall_Unit_Long_Double(mb, this.ptr, 6, value)
    }

  open var params_bias: Double
    get() {
      val mb = getMethodBind("HingeJoint","get_param")
      return _icall_Double_Long(mb, this.ptr, 0)
    }
    set(value) {
      val mb = getMethodBind("HingeJoint","set_param")
      _icall_Unit_Long_Double(mb, this.ptr, 0, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = invokeConstructor("HingeJoint", "HingeJoint")
        }

  }

  open fun _getLowerLimit(): Double {
    throw NotImplementedError("_get_lower_limit is not implemented for HingeJoint")
  }

  open fun _getUpperLimit(): Double {
    throw NotImplementedError("_get_upper_limit is not implemented for HingeJoint")
  }

  open fun _setLowerLimit(lowerLimit: Double) {
  }

  open fun _setUpperLimit(upperLimit: Double) {
  }

  open fun getFlag(flag: Long): Boolean {
    val mb = getMethodBind("HingeJoint","get_flag")
    return _icall_Boolean_Long( mb, this.ptr, flag)
  }

  open fun getParam(param: Long): Double {
    val mb = getMethodBind("HingeJoint","get_param")
    return _icall_Double_Long( mb, this.ptr, param)
  }

  open fun setFlag(flag: Long, enabled: Boolean) {
    val mb = getMethodBind("HingeJoint","set_flag")
    _icall_Unit_Long_Boolean( mb, this.ptr, flag, enabled)
  }

  open fun setParam(param: Long, value: Double) {
    val mb = getMethodBind("HingeJoint","set_param")
    _icall_Unit_Long_Double( mb, this.ptr, param, value)
  }

  enum class Param(
    id: Long
  ) {
    PARAM_BIAS(0),

    PARAM_LIMIT_UPPER(1),

    PARAM_LIMIT_LOWER(2),

    PARAM_LIMIT_BIAS(3),

    PARAM_LIMIT_SOFTNESS(4),

    PARAM_LIMIT_RELAXATION(5),

    PARAM_MOTOR_TARGET_VELOCITY(6),

    PARAM_MOTOR_MAX_IMPULSE(7),

    PARAM_MAX(8);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class Flag(
    id: Long
  ) {
    FLAG_USE_LIMIT(0),

    FLAG_ENABLE_MOTOR(1),

    FLAG_MAX(2);

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
