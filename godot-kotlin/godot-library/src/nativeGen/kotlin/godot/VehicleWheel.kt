package godot

import godot.core.Godot.shouldInitPtr
import godot.icalls._icall_Boolean
import godot.icalls._icall_Double
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Double
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Double

open class VehicleWheel internal constructor(
  _ignore: Any?
) : Spatial(_ignore) {
  open var brake: Double
    get() {
      val mb = getMethodBind("VehicleWheel","get_brake")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VehicleWheel","set_brake")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var dampingCompression: Double
    get() {
      val mb = getMethodBind("VehicleWheel","get_damping_compression")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VehicleWheel","set_damping_compression")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var dampingRelaxation: Double
    get() {
      val mb = getMethodBind("VehicleWheel","get_damping_relaxation")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VehicleWheel","set_damping_relaxation")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var engineForce: Double
    get() {
      val mb = getMethodBind("VehicleWheel","get_engine_force")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VehicleWheel","set_engine_force")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var steering: Double
    get() {
      val mb = getMethodBind("VehicleWheel","get_steering")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VehicleWheel","set_steering")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var suspensionMaxForce: Double
    get() {
      val mb = getMethodBind("VehicleWheel","get_suspension_max_force")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VehicleWheel","set_suspension_max_force")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var suspensionStiffness: Double
    get() {
      val mb = getMethodBind("VehicleWheel","get_suspension_stiffness")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VehicleWheel","set_suspension_stiffness")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var suspensionTravel: Double
    get() {
      val mb = getMethodBind("VehicleWheel","get_suspension_travel")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VehicleWheel","set_suspension_travel")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var useAsSteering: Boolean
    get() {
      val mb = getMethodBind("VehicleWheel","is_used_as_steering")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VehicleWheel","set_use_as_steering")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var useAsTraction: Boolean
    get() {
      val mb = getMethodBind("VehicleWheel","is_used_as_traction")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VehicleWheel","set_use_as_traction")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var wheelFrictionSlip: Double
    get() {
      val mb = getMethodBind("VehicleWheel","get_friction_slip")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VehicleWheel","set_friction_slip")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var wheelRadius: Double
    get() {
      val mb = getMethodBind("VehicleWheel","get_radius")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VehicleWheel","set_radius")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var wheelRestLength: Double
    get() {
      val mb = getMethodBind("VehicleWheel","get_suspension_rest_length")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VehicleWheel","set_suspension_rest_length")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var wheelRollInfluence: Double
    get() {
      val mb = getMethodBind("VehicleWheel","get_roll_influence")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VehicleWheel","set_roll_influence")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("VehicleWheel", "VehicleWheel")
        }

  }

  open fun getBrake(): Double {
    val mb = getMethodBind("VehicleWheel","get_brake")
    return _icall_Double( mb, this.ptr)
  }

  open fun getDampingCompression(): Double {
    val mb = getMethodBind("VehicleWheel","get_damping_compression")
    return _icall_Double( mb, this.ptr)
  }

  open fun getDampingRelaxation(): Double {
    val mb = getMethodBind("VehicleWheel","get_damping_relaxation")
    return _icall_Double( mb, this.ptr)
  }

  open fun getEngineForce(): Double {
    val mb = getMethodBind("VehicleWheel","get_engine_force")
    return _icall_Double( mb, this.ptr)
  }

  open fun getFrictionSlip(): Double {
    val mb = getMethodBind("VehicleWheel","get_friction_slip")
    return _icall_Double( mb, this.ptr)
  }

  open fun getRadius(): Double {
    val mb = getMethodBind("VehicleWheel","get_radius")
    return _icall_Double( mb, this.ptr)
  }

  open fun getRollInfluence(): Double {
    val mb = getMethodBind("VehicleWheel","get_roll_influence")
    return _icall_Double( mb, this.ptr)
  }

  open fun getRpm(): Double {
    val mb = getMethodBind("VehicleWheel","get_rpm")
    return _icall_Double( mb, this.ptr)
  }

  open fun getSkidinfo(): Double {
    val mb = getMethodBind("VehicleWheel","get_skidinfo")
    return _icall_Double( mb, this.ptr)
  }

  open fun getSteering(): Double {
    val mb = getMethodBind("VehicleWheel","get_steering")
    return _icall_Double( mb, this.ptr)
  }

  open fun getSuspensionMaxForce(): Double {
    val mb = getMethodBind("VehicleWheel","get_suspension_max_force")
    return _icall_Double( mb, this.ptr)
  }

  open fun getSuspensionRestLength(): Double {
    val mb = getMethodBind("VehicleWheel","get_suspension_rest_length")
    return _icall_Double( mb, this.ptr)
  }

  open fun getSuspensionStiffness(): Double {
    val mb = getMethodBind("VehicleWheel","get_suspension_stiffness")
    return _icall_Double( mb, this.ptr)
  }

  open fun getSuspensionTravel(): Double {
    val mb = getMethodBind("VehicleWheel","get_suspension_travel")
    return _icall_Double( mb, this.ptr)
  }

  open fun isInContact(): Boolean {
    val mb = getMethodBind("VehicleWheel","is_in_contact")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isUsedAsSteering(): Boolean {
    val mb = getMethodBind("VehicleWheel","is_used_as_steering")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isUsedAsTraction(): Boolean {
    val mb = getMethodBind("VehicleWheel","is_used_as_traction")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun setBrake(brake: Double) {
    val mb = getMethodBind("VehicleWheel","set_brake")
    _icall_Unit_Double( mb, this.ptr, brake)
  }

  open fun setDampingCompression(length: Double) {
    val mb = getMethodBind("VehicleWheel","set_damping_compression")
    _icall_Unit_Double( mb, this.ptr, length)
  }

  open fun setDampingRelaxation(length: Double) {
    val mb = getMethodBind("VehicleWheel","set_damping_relaxation")
    _icall_Unit_Double( mb, this.ptr, length)
  }

  open fun setEngineForce(engineForce: Double) {
    val mb = getMethodBind("VehicleWheel","set_engine_force")
    _icall_Unit_Double( mb, this.ptr, engineForce)
  }

  open fun setFrictionSlip(length: Double) {
    val mb = getMethodBind("VehicleWheel","set_friction_slip")
    _icall_Unit_Double( mb, this.ptr, length)
  }

  open fun setRadius(length: Double) {
    val mb = getMethodBind("VehicleWheel","set_radius")
    _icall_Unit_Double( mb, this.ptr, length)
  }

  open fun setRollInfluence(rollInfluence: Double) {
    val mb = getMethodBind("VehicleWheel","set_roll_influence")
    _icall_Unit_Double( mb, this.ptr, rollInfluence)
  }

  open fun setSteering(steering: Double) {
    val mb = getMethodBind("VehicleWheel","set_steering")
    _icall_Unit_Double( mb, this.ptr, steering)
  }

  open fun setSuspensionMaxForce(length: Double) {
    val mb = getMethodBind("VehicleWheel","set_suspension_max_force")
    _icall_Unit_Double( mb, this.ptr, length)
  }

  open fun setSuspensionRestLength(length: Double) {
    val mb = getMethodBind("VehicleWheel","set_suspension_rest_length")
    _icall_Unit_Double( mb, this.ptr, length)
  }

  open fun setSuspensionStiffness(length: Double) {
    val mb = getMethodBind("VehicleWheel","set_suspension_stiffness")
    _icall_Unit_Double( mb, this.ptr, length)
  }

  open fun setSuspensionTravel(length: Double) {
    val mb = getMethodBind("VehicleWheel","set_suspension_travel")
    _icall_Unit_Double( mb, this.ptr, length)
  }

  open fun setUseAsSteering(enable: Boolean) {
    val mb = getMethodBind("VehicleWheel","set_use_as_steering")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setUseAsTraction(enable: Boolean) {
    val mb = getMethodBind("VehicleWheel","set_use_as_traction")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  companion object
}
