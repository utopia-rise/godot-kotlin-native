// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot.shouldInitPtr
import godot.icalls._icall_Boolean_Long
import godot.icalls._icall_Double_Long
import godot.icalls._icall_Long
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Long_Boolean
import godot.icalls._icall_Unit_Long_Double
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.NotImplementedError

open class Generic6DOFJoint internal constructor(
  _ignore: Any?
) : Joint(_ignore) {
  open var angularLimitX_damping: Double
    get() {
      val mb = getMethodBind("Generic6DOFJoint","get_param_x")
      return _icall_Double_Long(mb, this.ptr, 13)
    }
    set(value) {
      val mb = getMethodBind("Generic6DOFJoint","set_param_x")
      _icall_Unit_Long_Double(mb, this.ptr, 13, value)
    }

  open var angularLimitX_enabled: Boolean
    get() {
      val mb = getMethodBind("Generic6DOFJoint","get_flag_x")
      return _icall_Boolean_Long(mb, this.ptr, 1)
    }
    set(value) {
      val mb = getMethodBind("Generic6DOFJoint","set_flag_x")
      _icall_Unit_Long_Boolean(mb, this.ptr, 1, value)
    }

  open var angularLimitX_erp: Double
    get() {
      val mb = getMethodBind("Generic6DOFJoint","get_param_x")
      return _icall_Double_Long(mb, this.ptr, 16)
    }
    set(value) {
      val mb = getMethodBind("Generic6DOFJoint","set_param_x")
      _icall_Unit_Long_Double(mb, this.ptr, 16, value)
    }

  open var angularLimitX_forceLimit: Double
    get() {
      val mb = getMethodBind("Generic6DOFJoint","get_param_x")
      return _icall_Double_Long(mb, this.ptr, 15)
    }
    set(value) {
      val mb = getMethodBind("Generic6DOFJoint","set_param_x")
      _icall_Unit_Long_Double(mb, this.ptr, 15, value)
    }

  open var angularLimitX_restitution: Double
    get() {
      val mb = getMethodBind("Generic6DOFJoint","get_param_x")
      return _icall_Double_Long(mb, this.ptr, 14)
    }
    set(value) {
      val mb = getMethodBind("Generic6DOFJoint","set_param_x")
      _icall_Unit_Long_Double(mb, this.ptr, 14, value)
    }

  open var angularLimitX_softness: Double
    get() {
      val mb = getMethodBind("Generic6DOFJoint","get_param_x")
      return _icall_Double_Long(mb, this.ptr, 12)
    }
    set(value) {
      val mb = getMethodBind("Generic6DOFJoint","set_param_x")
      _icall_Unit_Long_Double(mb, this.ptr, 12, value)
    }

  open var angularLimitY_damping: Double
    get() {
      val mb = getMethodBind("Generic6DOFJoint","get_param_y")
      return _icall_Double_Long(mb, this.ptr, 13)
    }
    set(value) {
      val mb = getMethodBind("Generic6DOFJoint","set_param_y")
      _icall_Unit_Long_Double(mb, this.ptr, 13, value)
    }

  open var angularLimitY_enabled: Boolean
    get() {
      val mb = getMethodBind("Generic6DOFJoint","get_flag_y")
      return _icall_Boolean_Long(mb, this.ptr, 1)
    }
    set(value) {
      val mb = getMethodBind("Generic6DOFJoint","set_flag_y")
      _icall_Unit_Long_Boolean(mb, this.ptr, 1, value)
    }

  open var angularLimitY_erp: Double
    get() {
      val mb = getMethodBind("Generic6DOFJoint","get_param_y")
      return _icall_Double_Long(mb, this.ptr, 16)
    }
    set(value) {
      val mb = getMethodBind("Generic6DOFJoint","set_param_y")
      _icall_Unit_Long_Double(mb, this.ptr, 16, value)
    }

  open var angularLimitY_forceLimit: Double
    get() {
      val mb = getMethodBind("Generic6DOFJoint","get_param_y")
      return _icall_Double_Long(mb, this.ptr, 15)
    }
    set(value) {
      val mb = getMethodBind("Generic6DOFJoint","set_param_y")
      _icall_Unit_Long_Double(mb, this.ptr, 15, value)
    }

  open var angularLimitY_restitution: Double
    get() {
      val mb = getMethodBind("Generic6DOFJoint","get_param_y")
      return _icall_Double_Long(mb, this.ptr, 14)
    }
    set(value) {
      val mb = getMethodBind("Generic6DOFJoint","set_param_y")
      _icall_Unit_Long_Double(mb, this.ptr, 14, value)
    }

  open var angularLimitY_softness: Double
    get() {
      val mb = getMethodBind("Generic6DOFJoint","get_param_y")
      return _icall_Double_Long(mb, this.ptr, 12)
    }
    set(value) {
      val mb = getMethodBind("Generic6DOFJoint","set_param_y")
      _icall_Unit_Long_Double(mb, this.ptr, 12, value)
    }

  open var angularLimitZ_damping: Double
    get() {
      val mb = getMethodBind("Generic6DOFJoint","get_param_z")
      return _icall_Double_Long(mb, this.ptr, 13)
    }
    set(value) {
      val mb = getMethodBind("Generic6DOFJoint","set_param_z")
      _icall_Unit_Long_Double(mb, this.ptr, 13, value)
    }

  open var angularLimitZ_enabled: Boolean
    get() {
      val mb = getMethodBind("Generic6DOFJoint","get_flag_z")
      return _icall_Boolean_Long(mb, this.ptr, 1)
    }
    set(value) {
      val mb = getMethodBind("Generic6DOFJoint","set_flag_z")
      _icall_Unit_Long_Boolean(mb, this.ptr, 1, value)
    }

  open var angularLimitZ_erp: Double
    get() {
      val mb = getMethodBind("Generic6DOFJoint","get_param_z")
      return _icall_Double_Long(mb, this.ptr, 16)
    }
    set(value) {
      val mb = getMethodBind("Generic6DOFJoint","set_param_z")
      _icall_Unit_Long_Double(mb, this.ptr, 16, value)
    }

  open var angularLimitZ_forceLimit: Double
    get() {
      val mb = getMethodBind("Generic6DOFJoint","get_param_z")
      return _icall_Double_Long(mb, this.ptr, 15)
    }
    set(value) {
      val mb = getMethodBind("Generic6DOFJoint","set_param_z")
      _icall_Unit_Long_Double(mb, this.ptr, 15, value)
    }

  open var angularLimitZ_restitution: Double
    get() {
      val mb = getMethodBind("Generic6DOFJoint","get_param_z")
      return _icall_Double_Long(mb, this.ptr, 14)
    }
    set(value) {
      val mb = getMethodBind("Generic6DOFJoint","set_param_z")
      _icall_Unit_Long_Double(mb, this.ptr, 14, value)
    }

  open var angularLimitZ_softness: Double
    get() {
      val mb = getMethodBind("Generic6DOFJoint","get_param_z")
      return _icall_Double_Long(mb, this.ptr, 12)
    }
    set(value) {
      val mb = getMethodBind("Generic6DOFJoint","set_param_z")
      _icall_Unit_Long_Double(mb, this.ptr, 12, value)
    }

  open var angularMotorX_enabled: Boolean
    get() {
      val mb = getMethodBind("Generic6DOFJoint","get_flag_x")
      return _icall_Boolean_Long(mb, this.ptr, 4)
    }
    set(value) {
      val mb = getMethodBind("Generic6DOFJoint","set_flag_x")
      _icall_Unit_Long_Boolean(mb, this.ptr, 4, value)
    }

  open var angularMotorX_forceLimit: Double
    get() {
      val mb = getMethodBind("Generic6DOFJoint","get_param_x")
      return _icall_Double_Long(mb, this.ptr, 18)
    }
    set(value) {
      val mb = getMethodBind("Generic6DOFJoint","set_param_x")
      _icall_Unit_Long_Double(mb, this.ptr, 18, value)
    }

  open var angularMotorX_targetVelocity: Double
    get() {
      val mb = getMethodBind("Generic6DOFJoint","get_param_x")
      return _icall_Double_Long(mb, this.ptr, 17)
    }
    set(value) {
      val mb = getMethodBind("Generic6DOFJoint","set_param_x")
      _icall_Unit_Long_Double(mb, this.ptr, 17, value)
    }

  open var angularMotorY_enabled: Boolean
    get() {
      val mb = getMethodBind("Generic6DOFJoint","get_flag_y")
      return _icall_Boolean_Long(mb, this.ptr, 4)
    }
    set(value) {
      val mb = getMethodBind("Generic6DOFJoint","set_flag_y")
      _icall_Unit_Long_Boolean(mb, this.ptr, 4, value)
    }

  open var angularMotorY_forceLimit: Double
    get() {
      val mb = getMethodBind("Generic6DOFJoint","get_param_y")
      return _icall_Double_Long(mb, this.ptr, 18)
    }
    set(value) {
      val mb = getMethodBind("Generic6DOFJoint","set_param_y")
      _icall_Unit_Long_Double(mb, this.ptr, 18, value)
    }

  open var angularMotorY_targetVelocity: Double
    get() {
      val mb = getMethodBind("Generic6DOFJoint","get_param_y")
      return _icall_Double_Long(mb, this.ptr, 17)
    }
    set(value) {
      val mb = getMethodBind("Generic6DOFJoint","set_param_y")
      _icall_Unit_Long_Double(mb, this.ptr, 17, value)
    }

  open var angularMotorZ_enabled: Boolean
    get() {
      val mb = getMethodBind("Generic6DOFJoint","get_flag_z")
      return _icall_Boolean_Long(mb, this.ptr, 4)
    }
    set(value) {
      val mb = getMethodBind("Generic6DOFJoint","set_flag_z")
      _icall_Unit_Long_Boolean(mb, this.ptr, 4, value)
    }

  open var angularMotorZ_forceLimit: Double
    get() {
      val mb = getMethodBind("Generic6DOFJoint","get_param_z")
      return _icall_Double_Long(mb, this.ptr, 18)
    }
    set(value) {
      val mb = getMethodBind("Generic6DOFJoint","set_param_z")
      _icall_Unit_Long_Double(mb, this.ptr, 18, value)
    }

  open var angularMotorZ_targetVelocity: Double
    get() {
      val mb = getMethodBind("Generic6DOFJoint","get_param_z")
      return _icall_Double_Long(mb, this.ptr, 17)
    }
    set(value) {
      val mb = getMethodBind("Generic6DOFJoint","set_param_z")
      _icall_Unit_Long_Double(mb, this.ptr, 17, value)
    }

  open var angularSpringX_damping: Double
    get() {
      val mb = getMethodBind("Generic6DOFJoint","get_param_x")
      return _icall_Double_Long(mb, this.ptr, 20)
    }
    set(value) {
      val mb = getMethodBind("Generic6DOFJoint","set_param_x")
      _icall_Unit_Long_Double(mb, this.ptr, 20, value)
    }

  open var angularSpringX_enabled: Boolean
    get() {
      val mb = getMethodBind("Generic6DOFJoint","get_flag_x")
      return _icall_Boolean_Long(mb, this.ptr, 2)
    }
    set(value) {
      val mb = getMethodBind("Generic6DOFJoint","set_flag_x")
      _icall_Unit_Long_Boolean(mb, this.ptr, 2, value)
    }

  open var angularSpringX_equilibriumPoint: Double
    get() {
      val mb = getMethodBind("Generic6DOFJoint","get_param_x")
      return _icall_Double_Long(mb, this.ptr, 21)
    }
    set(value) {
      val mb = getMethodBind("Generic6DOFJoint","set_param_x")
      _icall_Unit_Long_Double(mb, this.ptr, 21, value)
    }

  open var angularSpringX_stiffness: Double
    get() {
      val mb = getMethodBind("Generic6DOFJoint","get_param_x")
      return _icall_Double_Long(mb, this.ptr, 19)
    }
    set(value) {
      val mb = getMethodBind("Generic6DOFJoint","set_param_x")
      _icall_Unit_Long_Double(mb, this.ptr, 19, value)
    }

  open var angularSpringY_damping: Double
    get() {
      val mb = getMethodBind("Generic6DOFJoint","get_param_y")
      return _icall_Double_Long(mb, this.ptr, 20)
    }
    set(value) {
      val mb = getMethodBind("Generic6DOFJoint","set_param_y")
      _icall_Unit_Long_Double(mb, this.ptr, 20, value)
    }

  open var angularSpringY_enabled: Boolean
    get() {
      val mb = getMethodBind("Generic6DOFJoint","get_flag_y")
      return _icall_Boolean_Long(mb, this.ptr, 2)
    }
    set(value) {
      val mb = getMethodBind("Generic6DOFJoint","set_flag_y")
      _icall_Unit_Long_Boolean(mb, this.ptr, 2, value)
    }

  open var angularSpringY_equilibriumPoint: Double
    get() {
      val mb = getMethodBind("Generic6DOFJoint","get_param_y")
      return _icall_Double_Long(mb, this.ptr, 21)
    }
    set(value) {
      val mb = getMethodBind("Generic6DOFJoint","set_param_y")
      _icall_Unit_Long_Double(mb, this.ptr, 21, value)
    }

  open var angularSpringY_stiffness: Double
    get() {
      val mb = getMethodBind("Generic6DOFJoint","get_param_y")
      return _icall_Double_Long(mb, this.ptr, 19)
    }
    set(value) {
      val mb = getMethodBind("Generic6DOFJoint","set_param_y")
      _icall_Unit_Long_Double(mb, this.ptr, 19, value)
    }

  open var angularSpringZ_damping: Double
    get() {
      val mb = getMethodBind("Generic6DOFJoint","get_param_z")
      return _icall_Double_Long(mb, this.ptr, 20)
    }
    set(value) {
      val mb = getMethodBind("Generic6DOFJoint","set_param_z")
      _icall_Unit_Long_Double(mb, this.ptr, 20, value)
    }

  open var angularSpringZ_enabled: Boolean
    get() {
      val mb = getMethodBind("Generic6DOFJoint","get_flag_z")
      return _icall_Boolean_Long(mb, this.ptr, 2)
    }
    set(value) {
      val mb = getMethodBind("Generic6DOFJoint","set_flag_z")
      _icall_Unit_Long_Boolean(mb, this.ptr, 2, value)
    }

  open var angularSpringZ_equilibriumPoint: Double
    get() {
      val mb = getMethodBind("Generic6DOFJoint","get_param_z")
      return _icall_Double_Long(mb, this.ptr, 21)
    }
    set(value) {
      val mb = getMethodBind("Generic6DOFJoint","set_param_z")
      _icall_Unit_Long_Double(mb, this.ptr, 21, value)
    }

  open var angularSpringZ_stiffness: Double
    get() {
      val mb = getMethodBind("Generic6DOFJoint","get_param_z")
      return _icall_Double_Long(mb, this.ptr, 19)
    }
    set(value) {
      val mb = getMethodBind("Generic6DOFJoint","set_param_z")
      _icall_Unit_Long_Double(mb, this.ptr, 19, value)
    }

  open var linearLimitX_damping: Double
    get() {
      val mb = getMethodBind("Generic6DOFJoint","get_param_x")
      return _icall_Double_Long(mb, this.ptr, 4)
    }
    set(value) {
      val mb = getMethodBind("Generic6DOFJoint","set_param_x")
      _icall_Unit_Long_Double(mb, this.ptr, 4, value)
    }

  open var linearLimitX_enabled: Boolean
    get() {
      val mb = getMethodBind("Generic6DOFJoint","get_flag_x")
      return _icall_Boolean_Long(mb, this.ptr, 0)
    }
    set(value) {
      val mb = getMethodBind("Generic6DOFJoint","set_flag_x")
      _icall_Unit_Long_Boolean(mb, this.ptr, 0, value)
    }

  open var linearLimitX_lowerDistance: Double
    get() {
      val mb = getMethodBind("Generic6DOFJoint","get_param_x")
      return _icall_Double_Long(mb, this.ptr, 0)
    }
    set(value) {
      val mb = getMethodBind("Generic6DOFJoint","set_param_x")
      _icall_Unit_Long_Double(mb, this.ptr, 0, value)
    }

  open var linearLimitX_restitution: Double
    get() {
      val mb = getMethodBind("Generic6DOFJoint","get_param_x")
      return _icall_Double_Long(mb, this.ptr, 3)
    }
    set(value) {
      val mb = getMethodBind("Generic6DOFJoint","set_param_x")
      _icall_Unit_Long_Double(mb, this.ptr, 3, value)
    }

  open var linearLimitX_softness: Double
    get() {
      val mb = getMethodBind("Generic6DOFJoint","get_param_x")
      return _icall_Double_Long(mb, this.ptr, 2)
    }
    set(value) {
      val mb = getMethodBind("Generic6DOFJoint","set_param_x")
      _icall_Unit_Long_Double(mb, this.ptr, 2, value)
    }

  open var linearLimitX_upperDistance: Double
    get() {
      val mb = getMethodBind("Generic6DOFJoint","get_param_x")
      return _icall_Double_Long(mb, this.ptr, 1)
    }
    set(value) {
      val mb = getMethodBind("Generic6DOFJoint","set_param_x")
      _icall_Unit_Long_Double(mb, this.ptr, 1, value)
    }

  open var linearLimitY_damping: Double
    get() {
      val mb = getMethodBind("Generic6DOFJoint","get_param_y")
      return _icall_Double_Long(mb, this.ptr, 4)
    }
    set(value) {
      val mb = getMethodBind("Generic6DOFJoint","set_param_y")
      _icall_Unit_Long_Double(mb, this.ptr, 4, value)
    }

  open var linearLimitY_enabled: Boolean
    get() {
      val mb = getMethodBind("Generic6DOFJoint","get_flag_y")
      return _icall_Boolean_Long(mb, this.ptr, 0)
    }
    set(value) {
      val mb = getMethodBind("Generic6DOFJoint","set_flag_y")
      _icall_Unit_Long_Boolean(mb, this.ptr, 0, value)
    }

  open var linearLimitY_lowerDistance: Double
    get() {
      val mb = getMethodBind("Generic6DOFJoint","get_param_y")
      return _icall_Double_Long(mb, this.ptr, 0)
    }
    set(value) {
      val mb = getMethodBind("Generic6DOFJoint","set_param_y")
      _icall_Unit_Long_Double(mb, this.ptr, 0, value)
    }

  open var linearLimitY_restitution: Double
    get() {
      val mb = getMethodBind("Generic6DOFJoint","get_param_y")
      return _icall_Double_Long(mb, this.ptr, 3)
    }
    set(value) {
      val mb = getMethodBind("Generic6DOFJoint","set_param_y")
      _icall_Unit_Long_Double(mb, this.ptr, 3, value)
    }

  open var linearLimitY_softness: Double
    get() {
      val mb = getMethodBind("Generic6DOFJoint","get_param_y")
      return _icall_Double_Long(mb, this.ptr, 2)
    }
    set(value) {
      val mb = getMethodBind("Generic6DOFJoint","set_param_y")
      _icall_Unit_Long_Double(mb, this.ptr, 2, value)
    }

  open var linearLimitY_upperDistance: Double
    get() {
      val mb = getMethodBind("Generic6DOFJoint","get_param_y")
      return _icall_Double_Long(mb, this.ptr, 1)
    }
    set(value) {
      val mb = getMethodBind("Generic6DOFJoint","set_param_y")
      _icall_Unit_Long_Double(mb, this.ptr, 1, value)
    }

  open var linearLimitZ_damping: Double
    get() {
      val mb = getMethodBind("Generic6DOFJoint","get_param_z")
      return _icall_Double_Long(mb, this.ptr, 4)
    }
    set(value) {
      val mb = getMethodBind("Generic6DOFJoint","set_param_z")
      _icall_Unit_Long_Double(mb, this.ptr, 4, value)
    }

  open var linearLimitZ_enabled: Boolean
    get() {
      val mb = getMethodBind("Generic6DOFJoint","get_flag_z")
      return _icall_Boolean_Long(mb, this.ptr, 0)
    }
    set(value) {
      val mb = getMethodBind("Generic6DOFJoint","set_flag_z")
      _icall_Unit_Long_Boolean(mb, this.ptr, 0, value)
    }

  open var linearLimitZ_lowerDistance: Double
    get() {
      val mb = getMethodBind("Generic6DOFJoint","get_param_z")
      return _icall_Double_Long(mb, this.ptr, 0)
    }
    set(value) {
      val mb = getMethodBind("Generic6DOFJoint","set_param_z")
      _icall_Unit_Long_Double(mb, this.ptr, 0, value)
    }

  open var linearLimitZ_restitution: Double
    get() {
      val mb = getMethodBind("Generic6DOFJoint","get_param_z")
      return _icall_Double_Long(mb, this.ptr, 3)
    }
    set(value) {
      val mb = getMethodBind("Generic6DOFJoint","set_param_z")
      _icall_Unit_Long_Double(mb, this.ptr, 3, value)
    }

  open var linearLimitZ_softness: Double
    get() {
      val mb = getMethodBind("Generic6DOFJoint","get_param_z")
      return _icall_Double_Long(mb, this.ptr, 2)
    }
    set(value) {
      val mb = getMethodBind("Generic6DOFJoint","set_param_z")
      _icall_Unit_Long_Double(mb, this.ptr, 2, value)
    }

  open var linearLimitZ_upperDistance: Double
    get() {
      val mb = getMethodBind("Generic6DOFJoint","get_param_z")
      return _icall_Double_Long(mb, this.ptr, 1)
    }
    set(value) {
      val mb = getMethodBind("Generic6DOFJoint","set_param_z")
      _icall_Unit_Long_Double(mb, this.ptr, 1, value)
    }

  open var linearMotorX_enabled: Boolean
    get() {
      val mb = getMethodBind("Generic6DOFJoint","get_flag_x")
      return _icall_Boolean_Long(mb, this.ptr, 5)
    }
    set(value) {
      val mb = getMethodBind("Generic6DOFJoint","set_flag_x")
      _icall_Unit_Long_Boolean(mb, this.ptr, 5, value)
    }

  open var linearMotorX_forceLimit: Double
    get() {
      val mb = getMethodBind("Generic6DOFJoint","get_param_x")
      return _icall_Double_Long(mb, this.ptr, 6)
    }
    set(value) {
      val mb = getMethodBind("Generic6DOFJoint","set_param_x")
      _icall_Unit_Long_Double(mb, this.ptr, 6, value)
    }

  open var linearMotorX_targetVelocity: Double
    get() {
      val mb = getMethodBind("Generic6DOFJoint","get_param_x")
      return _icall_Double_Long(mb, this.ptr, 5)
    }
    set(value) {
      val mb = getMethodBind("Generic6DOFJoint","set_param_x")
      _icall_Unit_Long_Double(mb, this.ptr, 5, value)
    }

  open var linearMotorY_enabled: Boolean
    get() {
      val mb = getMethodBind("Generic6DOFJoint","get_flag_y")
      return _icall_Boolean_Long(mb, this.ptr, 5)
    }
    set(value) {
      val mb = getMethodBind("Generic6DOFJoint","set_flag_y")
      _icall_Unit_Long_Boolean(mb, this.ptr, 5, value)
    }

  open var linearMotorY_forceLimit: Double
    get() {
      val mb = getMethodBind("Generic6DOFJoint","get_param_y")
      return _icall_Double_Long(mb, this.ptr, 6)
    }
    set(value) {
      val mb = getMethodBind("Generic6DOFJoint","set_param_y")
      _icall_Unit_Long_Double(mb, this.ptr, 6, value)
    }

  open var linearMotorY_targetVelocity: Double
    get() {
      val mb = getMethodBind("Generic6DOFJoint","get_param_y")
      return _icall_Double_Long(mb, this.ptr, 5)
    }
    set(value) {
      val mb = getMethodBind("Generic6DOFJoint","set_param_y")
      _icall_Unit_Long_Double(mb, this.ptr, 5, value)
    }

  open var linearMotorZ_enabled: Boolean
    get() {
      val mb = getMethodBind("Generic6DOFJoint","get_flag_z")
      return _icall_Boolean_Long(mb, this.ptr, 5)
    }
    set(value) {
      val mb = getMethodBind("Generic6DOFJoint","set_flag_z")
      _icall_Unit_Long_Boolean(mb, this.ptr, 5, value)
    }

  open var linearMotorZ_forceLimit: Double
    get() {
      val mb = getMethodBind("Generic6DOFJoint","get_param_z")
      return _icall_Double_Long(mb, this.ptr, 6)
    }
    set(value) {
      val mb = getMethodBind("Generic6DOFJoint","set_param_z")
      _icall_Unit_Long_Double(mb, this.ptr, 6, value)
    }

  open var linearMotorZ_targetVelocity: Double
    get() {
      val mb = getMethodBind("Generic6DOFJoint","get_param_z")
      return _icall_Double_Long(mb, this.ptr, 5)
    }
    set(value) {
      val mb = getMethodBind("Generic6DOFJoint","set_param_z")
      _icall_Unit_Long_Double(mb, this.ptr, 5, value)
    }

  open var linearSpringX_damping: Double
    get() {
      val mb = getMethodBind("Generic6DOFJoint","get_param_x")
      return _icall_Double_Long(mb, this.ptr, 8)
    }
    set(value) {
      val mb = getMethodBind("Generic6DOFJoint","set_param_x")
      _icall_Unit_Long_Double(mb, this.ptr, 8, value)
    }

  open var linearSpringX_enabled: Boolean
    get() {
      val mb = getMethodBind("Generic6DOFJoint","get_flag_x")
      return _icall_Boolean_Long(mb, this.ptr, 3)
    }
    set(value) {
      val mb = getMethodBind("Generic6DOFJoint","set_flag_x")
      _icall_Unit_Long_Boolean(mb, this.ptr, 3, value)
    }

  open var linearSpringX_equilibriumPoint: Double
    get() {
      val mb = getMethodBind("Generic6DOFJoint","get_param_x")
      return _icall_Double_Long(mb, this.ptr, 9)
    }
    set(value) {
      val mb = getMethodBind("Generic6DOFJoint","set_param_x")
      _icall_Unit_Long_Double(mb, this.ptr, 9, value)
    }

  open var linearSpringX_stiffness: Double
    get() {
      val mb = getMethodBind("Generic6DOFJoint","get_param_x")
      return _icall_Double_Long(mb, this.ptr, 7)
    }
    set(value) {
      val mb = getMethodBind("Generic6DOFJoint","set_param_x")
      _icall_Unit_Long_Double(mb, this.ptr, 7, value)
    }

  open var linearSpringY_damping: Double
    get() {
      val mb = getMethodBind("Generic6DOFJoint","get_param_y")
      return _icall_Double_Long(mb, this.ptr, 8)
    }
    set(value) {
      val mb = getMethodBind("Generic6DOFJoint","set_param_y")
      _icall_Unit_Long_Double(mb, this.ptr, 8, value)
    }

  open var linearSpringY_enabled: Boolean
    get() {
      val mb = getMethodBind("Generic6DOFJoint","get_flag_y")
      return _icall_Boolean_Long(mb, this.ptr, 3)
    }
    set(value) {
      val mb = getMethodBind("Generic6DOFJoint","set_flag_y")
      _icall_Unit_Long_Boolean(mb, this.ptr, 3, value)
    }

  open var linearSpringY_equilibriumPoint: Double
    get() {
      val mb = getMethodBind("Generic6DOFJoint","get_param_y")
      return _icall_Double_Long(mb, this.ptr, 9)
    }
    set(value) {
      val mb = getMethodBind("Generic6DOFJoint","set_param_y")
      _icall_Unit_Long_Double(mb, this.ptr, 9, value)
    }

  open var linearSpringY_stiffness: Double
    get() {
      val mb = getMethodBind("Generic6DOFJoint","get_param_y")
      return _icall_Double_Long(mb, this.ptr, 7)
    }
    set(value) {
      val mb = getMethodBind("Generic6DOFJoint","set_param_y")
      _icall_Unit_Long_Double(mb, this.ptr, 7, value)
    }

  open var linearSpringZ_damping: Double
    get() {
      val mb = getMethodBind("Generic6DOFJoint","get_param_z")
      return _icall_Double_Long(mb, this.ptr, 8)
    }
    set(value) {
      val mb = getMethodBind("Generic6DOFJoint","set_param_z")
      _icall_Unit_Long_Double(mb, this.ptr, 8, value)
    }

  open var linearSpringZ_enabled: Boolean
    get() {
      val mb = getMethodBind("Generic6DOFJoint","get_flag_z")
      return _icall_Boolean_Long(mb, this.ptr, 3)
    }
    set(value) {
      val mb = getMethodBind("Generic6DOFJoint","set_flag_z")
      _icall_Unit_Long_Boolean(mb, this.ptr, 3, value)
    }

  open var linearSpringZ_equilibriumPoint: Double
    get() {
      val mb = getMethodBind("Generic6DOFJoint","get_param_z")
      return _icall_Double_Long(mb, this.ptr, 9)
    }
    set(value) {
      val mb = getMethodBind("Generic6DOFJoint","set_param_z")
      _icall_Unit_Long_Double(mb, this.ptr, 9, value)
    }

  open var linearSpringZ_stiffness: Double
    get() {
      val mb = getMethodBind("Generic6DOFJoint","get_param_z")
      return _icall_Double_Long(mb, this.ptr, 7)
    }
    set(value) {
      val mb = getMethodBind("Generic6DOFJoint","set_param_z")
      _icall_Unit_Long_Double(mb, this.ptr, 7, value)
    }

  open var precision: Long
    get() {
      val mb = getMethodBind("Generic6DOFJoint","get_precision")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Generic6DOFJoint","set_precision")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = invokeConstructor("Generic6DOFJoint", "Generic6DOFJoint")
        }

  }

  open fun _getAngularHiLimitX(): Double {
    throw NotImplementedError("_get_angular_hi_limit_x is not implemented for Generic6DOFJoint")
  }

  open fun _getAngularHiLimitY(): Double {
    throw NotImplementedError("_get_angular_hi_limit_y is not implemented for Generic6DOFJoint")
  }

  open fun _getAngularHiLimitZ(): Double {
    throw NotImplementedError("_get_angular_hi_limit_z is not implemented for Generic6DOFJoint")
  }

  open fun _getAngularLoLimitX(): Double {
    throw NotImplementedError("_get_angular_lo_limit_x is not implemented for Generic6DOFJoint")
  }

  open fun _getAngularLoLimitY(): Double {
    throw NotImplementedError("_get_angular_lo_limit_y is not implemented for Generic6DOFJoint")
  }

  open fun _getAngularLoLimitZ(): Double {
    throw NotImplementedError("_get_angular_lo_limit_z is not implemented for Generic6DOFJoint")
  }

  open fun _setAngularHiLimitX(angle: Double) {
  }

  open fun _setAngularHiLimitY(angle: Double) {
  }

  open fun _setAngularHiLimitZ(angle: Double) {
  }

  open fun _setAngularLoLimitX(angle: Double) {
  }

  open fun _setAngularLoLimitY(angle: Double) {
  }

  open fun _setAngularLoLimitZ(angle: Double) {
  }

  open fun getFlagX(flag: Long): Boolean {
    val mb = getMethodBind("Generic6DOFJoint","get_flag_x")
    return _icall_Boolean_Long( mb, this.ptr, flag)
  }

  open fun getFlagY(flag: Long): Boolean {
    val mb = getMethodBind("Generic6DOFJoint","get_flag_y")
    return _icall_Boolean_Long( mb, this.ptr, flag)
  }

  open fun getFlagZ(flag: Long): Boolean {
    val mb = getMethodBind("Generic6DOFJoint","get_flag_z")
    return _icall_Boolean_Long( mb, this.ptr, flag)
  }

  open fun getParamX(param: Long): Double {
    val mb = getMethodBind("Generic6DOFJoint","get_param_x")
    return _icall_Double_Long( mb, this.ptr, param)
  }

  open fun getParamY(param: Long): Double {
    val mb = getMethodBind("Generic6DOFJoint","get_param_y")
    return _icall_Double_Long( mb, this.ptr, param)
  }

  open fun getParamZ(param: Long): Double {
    val mb = getMethodBind("Generic6DOFJoint","get_param_z")
    return _icall_Double_Long( mb, this.ptr, param)
  }

  open fun getPrecision(): Long {
    val mb = getMethodBind("Generic6DOFJoint","get_precision")
    return _icall_Long( mb, this.ptr)
  }

  open fun setFlagX(flag: Long, value: Boolean) {
    val mb = getMethodBind("Generic6DOFJoint","set_flag_x")
    _icall_Unit_Long_Boolean( mb, this.ptr, flag, value)
  }

  open fun setFlagY(flag: Long, value: Boolean) {
    val mb = getMethodBind("Generic6DOFJoint","set_flag_y")
    _icall_Unit_Long_Boolean( mb, this.ptr, flag, value)
  }

  open fun setFlagZ(flag: Long, value: Boolean) {
    val mb = getMethodBind("Generic6DOFJoint","set_flag_z")
    _icall_Unit_Long_Boolean( mb, this.ptr, flag, value)
  }

  open fun setParamX(param: Long, value: Double) {
    val mb = getMethodBind("Generic6DOFJoint","set_param_x")
    _icall_Unit_Long_Double( mb, this.ptr, param, value)
  }

  open fun setParamY(param: Long, value: Double) {
    val mb = getMethodBind("Generic6DOFJoint","set_param_y")
    _icall_Unit_Long_Double( mb, this.ptr, param, value)
  }

  open fun setParamZ(param: Long, value: Double) {
    val mb = getMethodBind("Generic6DOFJoint","set_param_z")
    _icall_Unit_Long_Double( mb, this.ptr, param, value)
  }

  open fun setPrecision(precision: Long) {
    val mb = getMethodBind("Generic6DOFJoint","set_precision")
    _icall_Unit_Long( mb, this.ptr, precision)
  }

  enum class Param(
    id: Long
  ) {
    PARAM_LINEAR_LOWER_LIMIT(0),

    PARAM_LINEAR_UPPER_LIMIT(1),

    PARAM_LINEAR_LIMIT_SOFTNESS(2),

    PARAM_LINEAR_RESTITUTION(3),

    PARAM_LINEAR_DAMPING(4),

    PARAM_LINEAR_MOTOR_TARGET_VELOCITY(5),

    PARAM_LINEAR_MOTOR_FORCE_LIMIT(6),

    PARAM_LINEAR_SPRING_STIFFNESS(7),

    PARAM_LINEAR_SPRING_DAMPING(8),

    PARAM_LINEAR_SPRING_EQUILIBRIUM_POINT(9),

    PARAM_ANGULAR_LOWER_LIMIT(10),

    PARAM_ANGULAR_UPPER_LIMIT(11),

    PARAM_ANGULAR_LIMIT_SOFTNESS(12),

    PARAM_ANGULAR_DAMPING(13),

    PARAM_ANGULAR_RESTITUTION(14),

    PARAM_ANGULAR_FORCE_LIMIT(15),

    PARAM_ANGULAR_ERP(16),

    PARAM_ANGULAR_MOTOR_TARGET_VELOCITY(17),

    PARAM_ANGULAR_MOTOR_FORCE_LIMIT(18),

    PARAM_ANGULAR_SPRING_STIFFNESS(19),

    PARAM_ANGULAR_SPRING_DAMPING(20),

    PARAM_ANGULAR_SPRING_EQUILIBRIUM_POINT(21),

    PARAM_MAX(22);

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
    FLAG_ENABLE_LINEAR_LIMIT(0),

    FLAG_ENABLE_ANGULAR_LIMIT(1),

    FLAG_ENABLE_ANGULAR_SPRING(2),

    FLAG_ENABLE_LINEAR_SPRING(3),

    FLAG_ENABLE_MOTOR(4),

    FLAG_ENABLE_LINEAR_MOTOR(5),

    FLAG_MAX(6);

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
