// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot.shouldInitPtr
import godot.icalls._icall_Gradient
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Object
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Long
import kotlin.UninitializedPropertyAccessException

open class GradientTexture internal constructor(
  _ignore: Any?
) : Texture(_ignore) {
  open var gradient: Gradient
    get() {
      val mb = getMethodBind("GradientTexture","get_gradient")
      return _icall_Gradient(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("GradientTexture","set_gradient")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  open var width: Long
    get() {
      throw UninitializedPropertyAccessException("Cannot access property width: has no getter")
    }
    set(value) {
      val mb = getMethodBind("GradientTexture","set_width")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("GradientTexture", "GradientTexture")
        }

  }

  open fun _update() {
  }

  open fun getGradient(): Gradient {
    val mb = getMethodBind("GradientTexture","get_gradient")
    return _icall_Gradient( mb, this.ptr)
  }

  open fun setGradient(gradient: Gradient) {
    val mb = getMethodBind("GradientTexture","set_gradient")
    _icall_Unit_Object( mb, this.ptr, gradient)
  }

  open fun setWidth(width: Long) {
    val mb = getMethodBind("GradientTexture","set_width")
    _icall_Unit_Long( mb, this.ptr, width)
  }
}
