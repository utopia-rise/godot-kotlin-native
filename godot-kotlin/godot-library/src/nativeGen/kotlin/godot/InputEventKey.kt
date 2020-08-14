// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.icalls._icall_Long
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Long
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Boolean
import kotlin.Long
import kotlin.UninitializedPropertyAccessException
import kotlinx.cinterop.COpaquePointer

open class InputEventKey : InputEventWithModifiers() {
  open var echo: Boolean
    get() {
      throw UninitializedPropertyAccessException("Cannot access property echo: has no getter")
    }
    set(value) {
      val mb = getMethodBind("InputEventKey","set_echo")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var pressed: Boolean
    get() {
      throw UninitializedPropertyAccessException("Cannot access property pressed: has no getter")
    }
    set(value) {
      val mb = getMethodBind("InputEventKey","set_pressed")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var scancode: Long
    get() {
      val mb = getMethodBind("InputEventKey","get_scancode")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("InputEventKey","set_scancode")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var unicode: Long
    get() {
      val mb = getMethodBind("InputEventKey","get_unicode")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("InputEventKey","set_unicode")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  override fun __new(): COpaquePointer = invokeConstructor("InputEventKey", "InputEventKey")

  open fun getScancode(): Long {
    val mb = getMethodBind("InputEventKey","get_scancode")
    return _icall_Long( mb, this.ptr)
  }

  open fun getScancodeWithModifiers(): Long {
    val mb = getMethodBind("InputEventKey","get_scancode_with_modifiers")
    return _icall_Long( mb, this.ptr)
  }

  open fun getUnicode(): Long {
    val mb = getMethodBind("InputEventKey","get_unicode")
    return _icall_Long( mb, this.ptr)
  }

  open fun setEcho(echo: Boolean) {
    val mb = getMethodBind("InputEventKey","set_echo")
    _icall_Unit_Boolean( mb, this.ptr, echo)
  }

  open fun setPressed(pressed: Boolean) {
    val mb = getMethodBind("InputEventKey","set_pressed")
    _icall_Unit_Boolean( mb, this.ptr, pressed)
  }

  open fun setScancode(scancode: Long) {
    val mb = getMethodBind("InputEventKey","set_scancode")
    _icall_Unit_Long( mb, this.ptr, scancode)
  }

  open fun setUnicode(unicode: Long) {
    val mb = getMethodBind("InputEventKey","set_unicode")
    _icall_Unit_Long( mb, this.ptr, unicode)
  }
}
