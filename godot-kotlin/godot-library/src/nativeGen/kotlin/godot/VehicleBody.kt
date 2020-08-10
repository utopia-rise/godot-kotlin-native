// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot.shouldInitPtr
import godot.icalls._icall_Double
import godot.icalls._icall_Unit_Double
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Double

open class VehicleBody internal constructor(
  _ignore: Any?
) : RigidBody(_ignore) {
  open var brake: Double
    get() {
      val mb = getMethodBind("VehicleBody","get_brake")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VehicleBody","set_brake")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var engineForce: Double
    get() {
      val mb = getMethodBind("VehicleBody","get_engine_force")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VehicleBody","set_engine_force")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var steering: Double
    get() {
      val mb = getMethodBind("VehicleBody","get_steering")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VehicleBody","set_steering")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("VehicleBody", "VehicleBody")
        }

  }

  open fun getBrake(): Double {
    val mb = getMethodBind("VehicleBody","get_brake")
    return _icall_Double( mb, this.ptr)
  }

  open fun getEngineForce(): Double {
    val mb = getMethodBind("VehicleBody","get_engine_force")
    return _icall_Double( mb, this.ptr)
  }

  open fun getSteering(): Double {
    val mb = getMethodBind("VehicleBody","get_steering")
    return _icall_Double( mb, this.ptr)
  }

  open fun setBrake(brake: Double) {
    val mb = getMethodBind("VehicleBody","set_brake")
    _icall_Unit_Double( mb, this.ptr, brake)
  }

  open fun setEngineForce(engineForce: Double) {
    val mb = getMethodBind("VehicleBody","set_engine_force")
    _icall_Unit_Double( mb, this.ptr, engineForce)
  }

  open fun setSteering(steering: Double) {
    val mb = getMethodBind("VehicleBody","set_steering")
    _icall_Unit_Double( mb, this.ptr, steering)
  }
}
