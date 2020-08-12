// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.ARVRPositionalTracker
import godot.core.Signal1
import godot.core.signal
import godot.icalls._icall_Boolean
import godot.icalls._icall_Double
import godot.icalls._icall_Double_Long
import godot.icalls._icall_Long
import godot.icalls._icall_Long_Long
import godot.icalls._icall_Mesh
import godot.icalls._icall_String
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_Long
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.String
import kotlinx.cinterop.COpaquePointer

open class ARVRController : Spatial() {
  val buttonPressed: Signal1<Long> by signal("button")

  val buttonRelease: Signal1<Long> by signal("button")

  val meshUpdated: Signal1<Mesh> by signal("mesh")

  open var controllerId: Long
    get() {
      val mb = getMethodBind("ARVRController","get_controller_id")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ARVRController","set_controller_id")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var rumble: Double
    get() {
      val mb = getMethodBind("ARVRController","get_rumble")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ARVRController","set_rumble")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  override fun __new(): COpaquePointer = invokeConstructor("ARVRController", "ARVRController")

  open fun getControllerId(): Long {
    val mb = getMethodBind("ARVRController","get_controller_id")
    return _icall_Long( mb, this.ptr)
  }

  open fun getControllerName(): String {
    val mb = getMethodBind("ARVRController","get_controller_name")
    return _icall_String( mb, this.ptr)
  }

  open fun getHand(): ARVRPositionalTracker.TrackerHand {
    val mb = getMethodBind("ARVRController","get_hand")
    return ARVRPositionalTracker.TrackerHand.from( _icall_Long( mb, this.ptr))
  }

  open fun getIsActive(): Boolean {
    val mb = getMethodBind("ARVRController","get_is_active")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun getJoystickAxis(axis: Long): Double {
    val mb = getMethodBind("ARVRController","get_joystick_axis")
    return _icall_Double_Long( mb, this.ptr, axis)
  }

  open fun getJoystickId(): Long {
    val mb = getMethodBind("ARVRController","get_joystick_id")
    return _icall_Long( mb, this.ptr)
  }

  open fun getMesh(): Mesh {
    val mb = getMethodBind("ARVRController","get_mesh")
    return _icall_Mesh( mb, this.ptr)
  }

  open fun getRumble(): Double {
    val mb = getMethodBind("ARVRController","get_rumble")
    return _icall_Double( mb, this.ptr)
  }

  open fun isButtonPressed(button: Long): Long {
    val mb = getMethodBind("ARVRController","is_button_pressed")
    return _icall_Long_Long( mb, this.ptr, button)
  }

  open fun setControllerId(controllerId: Long) {
    val mb = getMethodBind("ARVRController","set_controller_id")
    _icall_Unit_Long( mb, this.ptr, controllerId)
  }

  open fun setRumble(rumble: Double) {
    val mb = getMethodBind("ARVRController","set_rumble")
    _icall_Unit_Double( mb, this.ptr, rumble)
  }
}
