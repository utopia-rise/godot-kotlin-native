// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
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

open class PathFollow2D internal constructor(
  _ignore: Any?
) : Node2D(_ignore) {
  open var cubicInterp: Boolean
    get() {
      val mb = getMethodBind("PathFollow2D","get_cubic_interpolation")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("PathFollow2D","set_cubic_interpolation")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var hOffset: Double
    get() {
      val mb = getMethodBind("PathFollow2D","get_h_offset")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("PathFollow2D","set_h_offset")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var lookahead: Double
    get() {
      val mb = getMethodBind("PathFollow2D","get_lookahead")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("PathFollow2D","set_lookahead")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var loop: Boolean
    get() {
      val mb = getMethodBind("PathFollow2D","has_loop")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("PathFollow2D","set_loop")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var offset: Double
    get() {
      val mb = getMethodBind("PathFollow2D","get_offset")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("PathFollow2D","set_offset")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var rotate: Boolean
    get() {
      val mb = getMethodBind("PathFollow2D","is_rotating")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("PathFollow2D","set_rotate")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var unitOffset: Double
    get() {
      val mb = getMethodBind("PathFollow2D","get_unit_offset")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("PathFollow2D","set_unit_offset")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var vOffset: Double
    get() {
      val mb = getMethodBind("PathFollow2D","get_v_offset")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("PathFollow2D","set_v_offset")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("PathFollow2D", "PathFollow2D")
        }

  }

  open fun getCubicInterpolation(): Boolean {
    val mb = getMethodBind("PathFollow2D","get_cubic_interpolation")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun getHOffset(): Double {
    val mb = getMethodBind("PathFollow2D","get_h_offset")
    return _icall_Double( mb, this.ptr)
  }

  open fun getLookahead(): Double {
    val mb = getMethodBind("PathFollow2D","get_lookahead")
    return _icall_Double( mb, this.ptr)
  }

  open fun getOffset(): Double {
    val mb = getMethodBind("PathFollow2D","get_offset")
    return _icall_Double( mb, this.ptr)
  }

  open fun getUnitOffset(): Double {
    val mb = getMethodBind("PathFollow2D","get_unit_offset")
    return _icall_Double( mb, this.ptr)
  }

  open fun getVOffset(): Double {
    val mb = getMethodBind("PathFollow2D","get_v_offset")
    return _icall_Double( mb, this.ptr)
  }

  open fun hasLoop(): Boolean {
    val mb = getMethodBind("PathFollow2D","has_loop")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isRotating(): Boolean {
    val mb = getMethodBind("PathFollow2D","is_rotating")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun setCubicInterpolation(enable: Boolean) {
    val mb = getMethodBind("PathFollow2D","set_cubic_interpolation")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setHOffset(hOffset: Double) {
    val mb = getMethodBind("PathFollow2D","set_h_offset")
    _icall_Unit_Double( mb, this.ptr, hOffset)
  }

  open fun setLookahead(lookahead: Double) {
    val mb = getMethodBind("PathFollow2D","set_lookahead")
    _icall_Unit_Double( mb, this.ptr, lookahead)
  }

  open fun setLoop(loop: Boolean) {
    val mb = getMethodBind("PathFollow2D","set_loop")
    _icall_Unit_Boolean( mb, this.ptr, loop)
  }

  open fun setOffset(offset: Double) {
    val mb = getMethodBind("PathFollow2D","set_offset")
    _icall_Unit_Double( mb, this.ptr, offset)
  }

  open fun setRotate(enable: Boolean) {
    val mb = getMethodBind("PathFollow2D","set_rotate")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setUnitOffset(unitOffset: Double) {
    val mb = getMethodBind("PathFollow2D","set_unit_offset")
    _icall_Unit_Double( mb, this.ptr, unitOffset)
  }

  open fun setVOffset(vOffset: Double) {
    val mb = getMethodBind("PathFollow2D","set_v_offset")
    _icall_Unit_Double( mb, this.ptr, vOffset)
  }
}
