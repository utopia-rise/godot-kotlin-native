// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.icalls._icall_Long
import godot.icalls._icall_Unit_Long
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Long
import kotlinx.cinterop.COpaquePointer

open class InputEventMIDI : InputEvent() {
  open var channel: Long
    get() {
      val mb = getMethodBind("InputEventMIDI","get_channel")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("InputEventMIDI","set_channel")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var controllerNumber: Long
    get() {
      val mb = getMethodBind("InputEventMIDI","get_controller_number")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("InputEventMIDI","set_controller_number")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var controllerValue: Long
    get() {
      val mb = getMethodBind("InputEventMIDI","get_controller_value")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("InputEventMIDI","set_controller_value")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var instrument: Long
    get() {
      val mb = getMethodBind("InputEventMIDI","get_instrument")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("InputEventMIDI","set_instrument")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var message: Long
    get() {
      val mb = getMethodBind("InputEventMIDI","get_message")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("InputEventMIDI","set_message")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var pitch: Long
    get() {
      val mb = getMethodBind("InputEventMIDI","get_pitch")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("InputEventMIDI","set_pitch")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var pressure: Long
    get() {
      val mb = getMethodBind("InputEventMIDI","get_pressure")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("InputEventMIDI","set_pressure")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var velocity: Long
    get() {
      val mb = getMethodBind("InputEventMIDI","get_velocity")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("InputEventMIDI","set_velocity")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  override fun __new(): COpaquePointer = invokeConstructor("InputEventMIDI", "InputEventMIDI")

  open fun getChannel(): Long {
    val mb = getMethodBind("InputEventMIDI","get_channel")
    return _icall_Long( mb, this.ptr)
  }

  open fun getControllerNumber(): Long {
    val mb = getMethodBind("InputEventMIDI","get_controller_number")
    return _icall_Long( mb, this.ptr)
  }

  open fun getControllerValue(): Long {
    val mb = getMethodBind("InputEventMIDI","get_controller_value")
    return _icall_Long( mb, this.ptr)
  }

  open fun getInstrument(): Long {
    val mb = getMethodBind("InputEventMIDI","get_instrument")
    return _icall_Long( mb, this.ptr)
  }

  open fun getMessage(): Long {
    val mb = getMethodBind("InputEventMIDI","get_message")
    return _icall_Long( mb, this.ptr)
  }

  open fun getPitch(): Long {
    val mb = getMethodBind("InputEventMIDI","get_pitch")
    return _icall_Long( mb, this.ptr)
  }

  open fun getPressure(): Long {
    val mb = getMethodBind("InputEventMIDI","get_pressure")
    return _icall_Long( mb, this.ptr)
  }

  open fun getVelocity(): Long {
    val mb = getMethodBind("InputEventMIDI","get_velocity")
    return _icall_Long( mb, this.ptr)
  }

  open fun setChannel(channel: Long) {
    val mb = getMethodBind("InputEventMIDI","set_channel")
    _icall_Unit_Long( mb, this.ptr, channel)
  }

  open fun setControllerNumber(controllerNumber: Long) {
    val mb = getMethodBind("InputEventMIDI","set_controller_number")
    _icall_Unit_Long( mb, this.ptr, controllerNumber)
  }

  open fun setControllerValue(controllerValue: Long) {
    val mb = getMethodBind("InputEventMIDI","set_controller_value")
    _icall_Unit_Long( mb, this.ptr, controllerValue)
  }

  open fun setInstrument(instrument: Long) {
    val mb = getMethodBind("InputEventMIDI","set_instrument")
    _icall_Unit_Long( mb, this.ptr, instrument)
  }

  open fun setMessage(message: Long) {
    val mb = getMethodBind("InputEventMIDI","set_message")
    _icall_Unit_Long( mb, this.ptr, message)
  }

  open fun setPitch(pitch: Long) {
    val mb = getMethodBind("InputEventMIDI","set_pitch")
    _icall_Unit_Long( mb, this.ptr, pitch)
  }

  open fun setPressure(pressure: Long) {
    val mb = getMethodBind("InputEventMIDI","set_pressure")
    _icall_Unit_Long( mb, this.ptr, pressure)
  }

  open fun setVelocity(velocity: Long) {
    val mb = getMethodBind("InputEventMIDI","set_velocity")
    _icall_Unit_Long( mb, this.ptr, velocity)
  }
}
