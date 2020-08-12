// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Color
import godot.core.Godot.shouldInitPtr
import godot.core.PoolColorArray
import godot.core.PoolRealArray
import godot.icalls._icall_Color_Double
import godot.icalls._icall_Color_Long
import godot.icalls._icall_Double_Long
import godot.icalls._icall_Long
import godot.icalls._icall_PoolColorArray
import godot.icalls._icall_PoolRealArray
import godot.icalls._icall_Unit_Double_Color
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Long_Color
import godot.icalls._icall_Unit_Long_Double
import godot.icalls._icall_Unit_PoolColorArray
import godot.icalls._icall_Unit_PoolRealArray
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Any
import kotlin.Double
import kotlin.Long

open class Gradient internal constructor(
  _ignore: Any?
) : Resource(_ignore) {
  open var colors: PoolColorArray
    get() {
      val mb = getMethodBind("Gradient","get_colors")
      return _icall_PoolColorArray(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Gradient","set_colors")
      _icall_Unit_PoolColorArray(mb, this.ptr, value)
    }

  open var offsets: PoolRealArray
    get() {
      val mb = getMethodBind("Gradient","get_offsets")
      return _icall_PoolRealArray(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Gradient","set_offsets")
      _icall_Unit_PoolRealArray(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = invokeConstructor("Gradient", "Gradient")
        }

  }

  open fun addPoint(offset: Double, color: Color) {
    val mb = getMethodBind("Gradient","add_point")
    _icall_Unit_Double_Color( mb, this.ptr, offset, color)
  }

  open fun getColor(point: Long): Color {
    val mb = getMethodBind("Gradient","get_color")
    return _icall_Color_Long( mb, this.ptr, point)
  }

  open fun getColors(): PoolColorArray {
    val mb = getMethodBind("Gradient","get_colors")
    return _icall_PoolColorArray( mb, this.ptr)
  }

  open fun getOffset(point: Long): Double {
    val mb = getMethodBind("Gradient","get_offset")
    return _icall_Double_Long( mb, this.ptr, point)
  }

  open fun getOffsets(): PoolRealArray {
    val mb = getMethodBind("Gradient","get_offsets")
    return _icall_PoolRealArray( mb, this.ptr)
  }

  open fun getPointCount(): Long {
    val mb = getMethodBind("Gradient","get_point_count")
    return _icall_Long( mb, this.ptr)
  }

  open fun interpolate(offset: Double): Color {
    val mb = getMethodBind("Gradient","interpolate")
    return _icall_Color_Double( mb, this.ptr, offset)
  }

  open fun removePoint(offset: Long) {
    val mb = getMethodBind("Gradient","remove_point")
    _icall_Unit_Long( mb, this.ptr, offset)
  }

  open fun setColor(point: Long, color: Color) {
    val mb = getMethodBind("Gradient","set_color")
    _icall_Unit_Long_Color( mb, this.ptr, point, color)
  }

  open fun setColors(colors: PoolColorArray) {
    val mb = getMethodBind("Gradient","set_colors")
    _icall_Unit_PoolColorArray( mb, this.ptr, colors)
  }

  open fun setOffset(point: Long, offset: Double) {
    val mb = getMethodBind("Gradient","set_offset")
    _icall_Unit_Long_Double( mb, this.ptr, point, offset)
  }

  open fun setOffsets(offsets: PoolRealArray) {
    val mb = getMethodBind("Gradient","set_offsets")
    _icall_Unit_PoolRealArray( mb, this.ptr, offsets)
  }
}
