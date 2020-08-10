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

open class SliderJoint internal constructor(
  _ignore: Any?
) : Joint(_ignore) {
  open var angularLimit_damping: Double
    get() {
      val mb = getMethodBind("SliderJoint","get_param")
      return _icall_Double_Long(mb, this.ptr, 15)
    }
    set(value) {
      val mb = getMethodBind("SliderJoint","set_param")
      _icall_Unit_Long_Double(mb, this.ptr, 15, value)
    }

  open var angularLimit_restitution: Double
    get() {
      val mb = getMethodBind("SliderJoint","get_param")
      return _icall_Double_Long(mb, this.ptr, 14)
    }
    set(value) {
      val mb = getMethodBind("SliderJoint","set_param")
      _icall_Unit_Long_Double(mb, this.ptr, 14, value)
    }

  open var angularLimit_softness: Double
    get() {
      val mb = getMethodBind("SliderJoint","get_param")
      return _icall_Double_Long(mb, this.ptr, 13)
    }
    set(value) {
      val mb = getMethodBind("SliderJoint","set_param")
      _icall_Unit_Long_Double(mb, this.ptr, 13, value)
    }

  open var angularMotion_damping: Double
    get() {
      val mb = getMethodBind("SliderJoint","get_param")
      return _icall_Double_Long(mb, this.ptr, 18)
    }
    set(value) {
      val mb = getMethodBind("SliderJoint","set_param")
      _icall_Unit_Long_Double(mb, this.ptr, 18, value)
    }

  open var angularMotion_restitution: Double
    get() {
      val mb = getMethodBind("SliderJoint","get_param")
      return _icall_Double_Long(mb, this.ptr, 17)
    }
    set(value) {
      val mb = getMethodBind("SliderJoint","set_param")
      _icall_Unit_Long_Double(mb, this.ptr, 17, value)
    }

  open var angularMotion_softness: Double
    get() {
      val mb = getMethodBind("SliderJoint","get_param")
      return _icall_Double_Long(mb, this.ptr, 16)
    }
    set(value) {
      val mb = getMethodBind("SliderJoint","set_param")
      _icall_Unit_Long_Double(mb, this.ptr, 16, value)
    }

  open var angularOrtho_damping: Double
    get() {
      val mb = getMethodBind("SliderJoint","get_param")
      return _icall_Double_Long(mb, this.ptr, 21)
    }
    set(value) {
      val mb = getMethodBind("SliderJoint","set_param")
      _icall_Unit_Long_Double(mb, this.ptr, 21, value)
    }

  open var angularOrtho_restitution: Double
    get() {
      val mb = getMethodBind("SliderJoint","get_param")
      return _icall_Double_Long(mb, this.ptr, 20)
    }
    set(value) {
      val mb = getMethodBind("SliderJoint","set_param")
      _icall_Unit_Long_Double(mb, this.ptr, 20, value)
    }

  open var angularOrtho_softness: Double
    get() {
      val mb = getMethodBind("SliderJoint","get_param")
      return _icall_Double_Long(mb, this.ptr, 19)
    }
    set(value) {
      val mb = getMethodBind("SliderJoint","set_param")
      _icall_Unit_Long_Double(mb, this.ptr, 19, value)
    }

  open var linearLimit_damping: Double
    get() {
      val mb = getMethodBind("SliderJoint","get_param")
      return _icall_Double_Long(mb, this.ptr, 4)
    }
    set(value) {
      val mb = getMethodBind("SliderJoint","set_param")
      _icall_Unit_Long_Double(mb, this.ptr, 4, value)
    }

  open var linearLimit_lowerDistance: Double
    get() {
      val mb = getMethodBind("SliderJoint","get_param")
      return _icall_Double_Long(mb, this.ptr, 1)
    }
    set(value) {
      val mb = getMethodBind("SliderJoint","set_param")
      _icall_Unit_Long_Double(mb, this.ptr, 1, value)
    }

  open var linearLimit_restitution: Double
    get() {
      val mb = getMethodBind("SliderJoint","get_param")
      return _icall_Double_Long(mb, this.ptr, 3)
    }
    set(value) {
      val mb = getMethodBind("SliderJoint","set_param")
      _icall_Unit_Long_Double(mb, this.ptr, 3, value)
    }

  open var linearLimit_softness: Double
    get() {
      val mb = getMethodBind("SliderJoint","get_param")
      return _icall_Double_Long(mb, this.ptr, 2)
    }
    set(value) {
      val mb = getMethodBind("SliderJoint","set_param")
      _icall_Unit_Long_Double(mb, this.ptr, 2, value)
    }

  open var linearLimit_upperDistance: Double
    get() {
      val mb = getMethodBind("SliderJoint","get_param")
      return _icall_Double_Long(mb, this.ptr, 0)
    }
    set(value) {
      val mb = getMethodBind("SliderJoint","set_param")
      _icall_Unit_Long_Double(mb, this.ptr, 0, value)
    }

  open var linearMotion_damping: Double
    get() {
      val mb = getMethodBind("SliderJoint","get_param")
      return _icall_Double_Long(mb, this.ptr, 7)
    }
    set(value) {
      val mb = getMethodBind("SliderJoint","set_param")
      _icall_Unit_Long_Double(mb, this.ptr, 7, value)
    }

  open var linearMotion_restitution: Double
    get() {
      val mb = getMethodBind("SliderJoint","get_param")
      return _icall_Double_Long(mb, this.ptr, 6)
    }
    set(value) {
      val mb = getMethodBind("SliderJoint","set_param")
      _icall_Unit_Long_Double(mb, this.ptr, 6, value)
    }

  open var linearMotion_softness: Double
    get() {
      val mb = getMethodBind("SliderJoint","get_param")
      return _icall_Double_Long(mb, this.ptr, 5)
    }
    set(value) {
      val mb = getMethodBind("SliderJoint","set_param")
      _icall_Unit_Long_Double(mb, this.ptr, 5, value)
    }

  open var linearOrtho_damping: Double
    get() {
      val mb = getMethodBind("SliderJoint","get_param")
      return _icall_Double_Long(mb, this.ptr, 10)
    }
    set(value) {
      val mb = getMethodBind("SliderJoint","set_param")
      _icall_Unit_Long_Double(mb, this.ptr, 10, value)
    }

  open var linearOrtho_restitution: Double
    get() {
      val mb = getMethodBind("SliderJoint","get_param")
      return _icall_Double_Long(mb, this.ptr, 9)
    }
    set(value) {
      val mb = getMethodBind("SliderJoint","set_param")
      _icall_Unit_Long_Double(mb, this.ptr, 9, value)
    }

  open var linearOrtho_softness: Double
    get() {
      val mb = getMethodBind("SliderJoint","get_param")
      return _icall_Double_Long(mb, this.ptr, 8)
    }
    set(value) {
      val mb = getMethodBind("SliderJoint","set_param")
      _icall_Unit_Long_Double(mb, this.ptr, 8, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("SliderJoint", "SliderJoint")
        }

  }

  open fun _get_lower_limit_angular(): Double {
    throw NotImplementedError("_get_lower_limit_angular is not implemented for SliderJoint")
  }

  open fun _get_upper_limit_angular(): Double {
    throw NotImplementedError("_get_upper_limit_angular is not implemented for SliderJoint")
  }

  open fun _set_lower_limit_angular(lowerLimitAngular: Double) {
  }

  open fun _set_upper_limit_angular(upperLimitAngular: Double) {
  }

  open fun getParam(param: Long): Double {
    val mb = getMethodBind("SliderJoint","get_param")
    return _icall_Double_Long( mb, this.ptr, param)
  }

  open fun setParam(param: Long, value: Double) {
    val mb = getMethodBind("SliderJoint","set_param")
    _icall_Unit_Long_Double( mb, this.ptr, param, value)
  }

  enum class Param(
    id: Long
  ) {
    PARAM_LINEAR_LIMIT_UPPER(0),

    PARAM_LINEAR_LIMIT_LOWER(1),

    PARAM_LINEAR_LIMIT_SOFTNESS(2),

    PARAM_LINEAR_LIMIT_RESTITUTION(3),

    PARAM_LINEAR_LIMIT_DAMPING(4),

    PARAM_LINEAR_MOTION_SOFTNESS(5),

    PARAM_LINEAR_MOTION_RESTITUTION(6),

    PARAM_LINEAR_MOTION_DAMPING(7),

    PARAM_LINEAR_ORTHOGONAL_SOFTNESS(8),

    PARAM_LINEAR_ORTHOGONAL_RESTITUTION(9),

    PARAM_LINEAR_ORTHOGONAL_DAMPING(10),

    PARAM_ANGULAR_LIMIT_UPPER(11),

    PARAM_ANGULAR_LIMIT_LOWER(12),

    PARAM_ANGULAR_LIMIT_SOFTNESS(13),

    PARAM_ANGULAR_LIMIT_RESTITUTION(14),

    PARAM_ANGULAR_LIMIT_DAMPING(15),

    PARAM_ANGULAR_MOTION_SOFTNESS(16),

    PARAM_ANGULAR_MOTION_RESTITUTION(17),

    PARAM_ANGULAR_MOTION_DAMPING(18),

    PARAM_ANGULAR_ORTHOGONAL_SOFTNESS(19),

    PARAM_ANGULAR_ORTHOGONAL_RESTITUTION(20),

    PARAM_ANGULAR_ORTHOGONAL_DAMPING(21),

    PARAM_MAX(22);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val PARAM_ANGULAR_LIMIT_DAMPING: Long = 15

    final const val PARAM_ANGULAR_LIMIT_LOWER: Long = 12

    final const val PARAM_ANGULAR_LIMIT_RESTITUTION: Long = 14

    final const val PARAM_ANGULAR_LIMIT_SOFTNESS: Long = 13

    final const val PARAM_ANGULAR_LIMIT_UPPER: Long = 11

    final const val PARAM_ANGULAR_MOTION_DAMPING: Long = 18

    final const val PARAM_ANGULAR_MOTION_RESTITUTION: Long = 17

    final const val PARAM_ANGULAR_MOTION_SOFTNESS: Long = 16

    final const val PARAM_ANGULAR_ORTHOGONAL_DAMPING: Long = 21

    final const val PARAM_ANGULAR_ORTHOGONAL_RESTITUTION: Long = 20

    final const val PARAM_ANGULAR_ORTHOGONAL_SOFTNESS: Long = 19

    final const val PARAM_LINEAR_LIMIT_DAMPING: Long = 4

    final const val PARAM_LINEAR_LIMIT_LOWER: Long = 1

    final const val PARAM_LINEAR_LIMIT_RESTITUTION: Long = 3

    final const val PARAM_LINEAR_LIMIT_SOFTNESS: Long = 2

    final const val PARAM_LINEAR_LIMIT_UPPER: Long = 0

    final const val PARAM_LINEAR_MOTION_DAMPING: Long = 7

    final const val PARAM_LINEAR_MOTION_RESTITUTION: Long = 6

    final const val PARAM_LINEAR_MOTION_SOFTNESS: Long = 5

    final const val PARAM_LINEAR_ORTHOGONAL_DAMPING: Long = 10

    final const val PARAM_LINEAR_ORTHOGONAL_RESTITUTION: Long = 9

    final const val PARAM_LINEAR_ORTHOGONAL_SOFTNESS: Long = 8

    final const val PARAM_MAX: Long = 22
  }
}
