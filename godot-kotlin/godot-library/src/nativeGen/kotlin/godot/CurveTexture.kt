// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot.shouldInitPtr
import godot.icalls._icall_Curve
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Object
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Any
import kotlin.Long
import kotlin.UninitializedPropertyAccessException

open class CurveTexture internal constructor(
  _ignore: Any?
) : Texture(_ignore) {
  open var curve: Curve
    get() {
      val mb = getMethodBind("CurveTexture","get_curve")
      return _icall_Curve(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CurveTexture","set_curve")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  open var width: Long
    get() {
      throw UninitializedPropertyAccessException("Cannot access property width: has no getter")
    }
    set(value) {
      val mb = getMethodBind("CurveTexture","set_width")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = invokeConstructor("CurveTexture", "CurveTexture")
        }

  }

  open fun _update() {
  }

  open fun getCurve(): Curve {
    val mb = getMethodBind("CurveTexture","get_curve")
    return _icall_Curve( mb, this.ptr)
  }

  open fun setCurve(curve: Curve) {
    val mb = getMethodBind("CurveTexture","set_curve")
    _icall_Unit_Object( mb, this.ptr, curve)
  }

  open fun setWidth(width: Long) {
    val mb = getMethodBind("CurveTexture","set_width")
    _icall_Unit_Long( mb, this.ptr, width)
  }
}
