// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Dictionary
import godot.core.Godot.shouldInitPtr
import godot.core.PoolVector2Array
import godot.core.Vector2
import godot.icalls._icall_Double
import godot.icalls._icall_Double_Vector2
import godot.icalls._icall_Long
import godot.icalls._icall_PoolVector2Array
import godot.icalls._icall_PoolVector2Array_Long_Double
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Long_Vector2
import godot.icalls._icall_Unit_Vector2_Vector2_Vector2_Long
import godot.icalls._icall_Vector2_Double
import godot.icalls._icall_Vector2_Double_Boolean
import godot.icalls._icall_Vector2_Long
import godot.icalls._icall_Vector2_Long_Double
import godot.icalls._icall_Vector2_Vector2
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.NotImplementedError

open class Curve2D internal constructor(
  _ignore: Any?
) : Resource(_ignore) {
  open var bakeInterval: Double
    get() {
      val mb = getMethodBind("Curve2D","get_bake_interval")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Curve2D","set_bake_interval")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = invokeConstructor("Curve2D", "Curve2D")
        }

  }

  open fun _getData(): Dictionary {
    throw NotImplementedError("_get_data is not implemented for Curve2D")
  }

  open fun _setData(arg0: Dictionary) {
  }

  open fun addPoint(
    position: Vector2,
    _in: Vector2 = Vector2(0.0, 0.0),
    out: Vector2 = Vector2(0.0, 0.0),
    atPosition: Long = -1
  ) {
    val mb = getMethodBind("Curve2D","add_point")
    _icall_Unit_Vector2_Vector2_Vector2_Long( mb, this.ptr, position, _in, out, atPosition)
  }

  open fun clearPoints() {
    val mb = getMethodBind("Curve2D","clear_points")
    _icall_Unit( mb, this.ptr)
  }

  open fun getBakeInterval(): Double {
    val mb = getMethodBind("Curve2D","get_bake_interval")
    return _icall_Double( mb, this.ptr)
  }

  open fun getBakedLength(): Double {
    val mb = getMethodBind("Curve2D","get_baked_length")
    return _icall_Double( mb, this.ptr)
  }

  open fun getBakedPoints(): PoolVector2Array {
    val mb = getMethodBind("Curve2D","get_baked_points")
    return _icall_PoolVector2Array( mb, this.ptr)
  }

  open fun getClosestOffset(toPoint: Vector2): Double {
    val mb = getMethodBind("Curve2D","get_closest_offset")
    return _icall_Double_Vector2( mb, this.ptr, toPoint)
  }

  open fun getClosestPoint(toPoint: Vector2): Vector2 {
    val mb = getMethodBind("Curve2D","get_closest_point")
    return _icall_Vector2_Vector2( mb, this.ptr, toPoint)
  }

  open fun getPointCount(): Long {
    val mb = getMethodBind("Curve2D","get_point_count")
    return _icall_Long( mb, this.ptr)
  }

  open fun getPointIn(idx: Long): Vector2 {
    val mb = getMethodBind("Curve2D","get_point_in")
    return _icall_Vector2_Long( mb, this.ptr, idx)
  }

  open fun getPointOut(idx: Long): Vector2 {
    val mb = getMethodBind("Curve2D","get_point_out")
    return _icall_Vector2_Long( mb, this.ptr, idx)
  }

  open fun getPointPosition(idx: Long): Vector2 {
    val mb = getMethodBind("Curve2D","get_point_position")
    return _icall_Vector2_Long( mb, this.ptr, idx)
  }

  open fun interpolate(idx: Long, t: Double): Vector2 {
    val mb = getMethodBind("Curve2D","interpolate")
    return _icall_Vector2_Long_Double( mb, this.ptr, idx, t)
  }

  open fun interpolateBaked(offset: Double, cubic: Boolean = false): Vector2 {
    val mb = getMethodBind("Curve2D","interpolate_baked")
    return _icall_Vector2_Double_Boolean( mb, this.ptr, offset, cubic)
  }

  open fun interpolatef(fofs: Double): Vector2 {
    val mb = getMethodBind("Curve2D","interpolatef")
    return _icall_Vector2_Double( mb, this.ptr, fofs)
  }

  open fun removePoint(idx: Long) {
    val mb = getMethodBind("Curve2D","remove_point")
    _icall_Unit_Long( mb, this.ptr, idx)
  }

  open fun setBakeInterval(distance: Double) {
    val mb = getMethodBind("Curve2D","set_bake_interval")
    _icall_Unit_Double( mb, this.ptr, distance)
  }

  open fun setPointIn(idx: Long, position: Vector2) {
    val mb = getMethodBind("Curve2D","set_point_in")
    _icall_Unit_Long_Vector2( mb, this.ptr, idx, position)
  }

  open fun setPointOut(idx: Long, position: Vector2) {
    val mb = getMethodBind("Curve2D","set_point_out")
    _icall_Unit_Long_Vector2( mb, this.ptr, idx, position)
  }

  open fun setPointPosition(idx: Long, position: Vector2) {
    val mb = getMethodBind("Curve2D","set_point_position")
    _icall_Unit_Long_Vector2( mb, this.ptr, idx, position)
  }

  open fun tessellate(maxStages: Long = 5, toleranceDegrees: Double = 4.0): PoolVector2Array {
    val mb = getMethodBind("Curve2D","tessellate")
    return _icall_PoolVector2Array_Long_Double( mb, this.ptr, maxStages, toleranceDegrees)
  }
}
