package godot

import godot.icalls._icall_Boolean
import godot.icalls._icall_Unit_Boolean
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean

open class InputEventWithModifiers internal constructor(
  _ignore: Any?
) : InputEvent(_ignore) {
  open var alt: Boolean
    get() {
      val mb = getMethodBind("InputEventWithModifiers","get_alt")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("InputEventWithModifiers","set_alt")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var command: Boolean
    get() {
      val mb = getMethodBind("InputEventWithModifiers","get_command")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("InputEventWithModifiers","set_command")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var control: Boolean
    get() {
      val mb = getMethodBind("InputEventWithModifiers","get_control")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("InputEventWithModifiers","set_control")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var meta: Boolean
    get() {
      val mb = getMethodBind("InputEventWithModifiers","get_metakey")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("InputEventWithModifiers","set_metakey")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var shift: Boolean
    get() {
      val mb = getMethodBind("InputEventWithModifiers","get_shift")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("InputEventWithModifiers","set_shift")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  internal constructor() : this(null)

  open fun getAlt(): Boolean {
    val mb = getMethodBind("InputEventWithModifiers","get_alt")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun getCommand(): Boolean {
    val mb = getMethodBind("InputEventWithModifiers","get_command")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun getControl(): Boolean {
    val mb = getMethodBind("InputEventWithModifiers","get_control")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun getMetakey(): Boolean {
    val mb = getMethodBind("InputEventWithModifiers","get_metakey")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun getShift(): Boolean {
    val mb = getMethodBind("InputEventWithModifiers","get_shift")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun setAlt(enable: Boolean) {
    val mb = getMethodBind("InputEventWithModifiers","set_alt")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setCommand(enable: Boolean) {
    val mb = getMethodBind("InputEventWithModifiers","set_command")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setControl(enable: Boolean) {
    val mb = getMethodBind("InputEventWithModifiers","set_control")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setMetakey(enable: Boolean) {
    val mb = getMethodBind("InputEventWithModifiers","set_metakey")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setShift(enable: Boolean) {
    val mb = getMethodBind("InputEventWithModifiers","set_shift")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }
}
