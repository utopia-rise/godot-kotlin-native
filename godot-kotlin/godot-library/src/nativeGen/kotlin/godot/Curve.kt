// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.Curve
import godot.core.Godot.shouldInitPtr
import godot.core.Signal0
import godot.core.VariantArray
import godot.core.Vector2
import godot.core.signal
import godot.icalls._icall_Double
import godot.icalls._icall_Double_Double
import godot.icalls._icall_Double_Long
import godot.icalls._icall_Long
import godot.icalls._icall_Long_Long
import godot.icalls._icall_Long_Long_Double
import godot.icalls._icall_Long_Vector2_Double_Double_Long_Long
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Long_Double
import godot.icalls._icall_Unit_Long_Long
import godot.icalls._icall_Vector2_Long
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Double
import kotlin.Long
import kotlin.NotImplementedError

open class Curve internal constructor(
  _ignore: Any?
) : Resource(_ignore) {
  val rangeChanged: Signal0 by signal()

  open var bakeResolution: Long
    get() {
      val mb = getMethodBind("Curve","get_bake_resolution")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Curve","set_bake_resolution")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var maxValue: Double
    get() {
      val mb = getMethodBind("Curve","get_max_value")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Curve","set_max_value")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var minValue: Double
    get() {
      val mb = getMethodBind("Curve","get_min_value")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Curve","set_min_value")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("Curve", "Curve")
        }

  }

  open fun _getData(): VariantArray {
    throw NotImplementedError("_get_data is not implemented for Curve")
  }

  open fun _setData(data: VariantArray) {
  }

  open fun addPoint(
    position: Vector2,
    leftTangent: Double = 0.0,
    rightTangent: Double = 0.0,
    leftMode: Long = 0,
    rightMode: Long = 0
  ): Long {
    val mb = getMethodBind("Curve","add_point")
    return _icall_Long_Vector2_Double_Double_Long_Long( mb, this.ptr, position, leftTangent,
        rightTangent, leftMode, rightMode)
  }

  open fun bake() {
    val mb = getMethodBind("Curve","bake")
    _icall_Unit( mb, this.ptr)
  }

  open fun cleanDupes() {
    val mb = getMethodBind("Curve","clean_dupes")
    _icall_Unit( mb, this.ptr)
  }

  open fun clearPoints() {
    val mb = getMethodBind("Curve","clear_points")
    _icall_Unit( mb, this.ptr)
  }

  open fun getBakeResolution(): Long {
    val mb = getMethodBind("Curve","get_bake_resolution")
    return _icall_Long( mb, this.ptr)
  }

  open fun getMaxValue(): Double {
    val mb = getMethodBind("Curve","get_max_value")
    return _icall_Double( mb, this.ptr)
  }

  open fun getMinValue(): Double {
    val mb = getMethodBind("Curve","get_min_value")
    return _icall_Double( mb, this.ptr)
  }

  open fun getPointCount(): Long {
    val mb = getMethodBind("Curve","get_point_count")
    return _icall_Long( mb, this.ptr)
  }

  open fun getPointLeftMode(index: Long): Curve.TangentMode {
    val mb = getMethodBind("Curve","get_point_left_mode")
    return Curve.TangentMode.from( _icall_Long_Long( mb, this.ptr, index))
  }

  open fun getPointLeftTangent(index: Long): Double {
    val mb = getMethodBind("Curve","get_point_left_tangent")
    return _icall_Double_Long( mb, this.ptr, index)
  }

  open fun getPointPosition(index: Long): Vector2 {
    val mb = getMethodBind("Curve","get_point_position")
    return _icall_Vector2_Long( mb, this.ptr, index)
  }

  open fun getPointRightMode(index: Long): Curve.TangentMode {
    val mb = getMethodBind("Curve","get_point_right_mode")
    return Curve.TangentMode.from( _icall_Long_Long( mb, this.ptr, index))
  }

  open fun getPointRightTangent(index: Long): Double {
    val mb = getMethodBind("Curve","get_point_right_tangent")
    return _icall_Double_Long( mb, this.ptr, index)
  }

  open fun interpolate(offset: Double): Double {
    val mb = getMethodBind("Curve","interpolate")
    return _icall_Double_Double( mb, this.ptr, offset)
  }

  open fun interpolateBaked(offset: Double): Double {
    val mb = getMethodBind("Curve","interpolate_baked")
    return _icall_Double_Double( mb, this.ptr, offset)
  }

  open fun removePoint(index: Long) {
    val mb = getMethodBind("Curve","remove_point")
    _icall_Unit_Long( mb, this.ptr, index)
  }

  open fun setBakeResolution(resolution: Long) {
    val mb = getMethodBind("Curve","set_bake_resolution")
    _icall_Unit_Long( mb, this.ptr, resolution)
  }

  open fun setMaxValue(max: Double) {
    val mb = getMethodBind("Curve","set_max_value")
    _icall_Unit_Double( mb, this.ptr, max)
  }

  open fun setMinValue(min: Double) {
    val mb = getMethodBind("Curve","set_min_value")
    _icall_Unit_Double( mb, this.ptr, min)
  }

  open fun setPointLeftMode(index: Long, mode: Long) {
    val mb = getMethodBind("Curve","set_point_left_mode")
    _icall_Unit_Long_Long( mb, this.ptr, index, mode)
  }

  open fun setPointLeftTangent(index: Long, tangent: Double) {
    val mb = getMethodBind("Curve","set_point_left_tangent")
    _icall_Unit_Long_Double( mb, this.ptr, index, tangent)
  }

  open fun setPointOffset(index: Long, offset: Double): Long {
    val mb = getMethodBind("Curve","set_point_offset")
    return _icall_Long_Long_Double( mb, this.ptr, index, offset)
  }

  open fun setPointRightMode(index: Long, mode: Long) {
    val mb = getMethodBind("Curve","set_point_right_mode")
    _icall_Unit_Long_Long( mb, this.ptr, index, mode)
  }

  open fun setPointRightTangent(index: Long, tangent: Double) {
    val mb = getMethodBind("Curve","set_point_right_tangent")
    _icall_Unit_Long_Double( mb, this.ptr, index, tangent)
  }

  open fun setPointValue(index: Long, y: Double) {
    val mb = getMethodBind("Curve","set_point_value")
    _icall_Unit_Long_Double( mb, this.ptr, index, y)
  }

  enum class TangentMode(
    id: Long
  ) {
    TANGENT_FREE(0),

    TANGENT_LINEAR(1),

    TANGENT_MODE_COUNT(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object
}
