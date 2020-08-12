// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Dictionary
import godot.core.Godot.shouldInitPtr
import godot.core.PoolRealArray
import godot.core.PoolVector3Array
import godot.core.Vector3
import godot.icalls._icall_Boolean
import godot.icalls._icall_Double
import godot.icalls._icall_Double_Long
import godot.icalls._icall_Double_Vector3
import godot.icalls._icall_Long
import godot.icalls._icall_PoolRealArray
import godot.icalls._icall_PoolVector3Array
import godot.icalls._icall_PoolVector3Array_Long_Double
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Long_Double
import godot.icalls._icall_Unit_Long_Vector3
import godot.icalls._icall_Unit_Vector3_Vector3_Vector3_Long
import godot.icalls._icall_Vector3_Double
import godot.icalls._icall_Vector3_Double_Boolean
import godot.icalls._icall_Vector3_Long
import godot.icalls._icall_Vector3_Long_Double
import godot.icalls._icall_Vector3_Vector3
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.NotImplementedError

open class Curve3D internal constructor(
  _ignore: Any?
) : Resource(_ignore) {
  open var bakeInterval: Double
    get() {
      val mb = getMethodBind("Curve3D","get_bake_interval")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Curve3D","set_bake_interval")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var upVectorEnabled: Boolean
    get() {
      val mb = getMethodBind("Curve3D","is_up_vector_enabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Curve3D","set_up_vector_enabled")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("Curve3D", "Curve3D")
        }

  }

  open fun _getData(): Dictionary {
    throw NotImplementedError("_get_data is not implemented for Curve3D")
  }

  open fun _setData(arg0: Dictionary) {
  }

  open fun addPoint(
    position: Vector3,
    _in: Vector3 = Vector3(0.0, 0.0, 0.0),
    out: Vector3 = Vector3(0.0, 0.0, 0.0),
    atPosition: Long = -1
  ) {
    val mb = getMethodBind("Curve3D","add_point")
    _icall_Unit_Vector3_Vector3_Vector3_Long( mb, this.ptr, position, _in, out, atPosition)
  }

  open fun clearPoints() {
    val mb = getMethodBind("Curve3D","clear_points")
    _icall_Unit( mb, this.ptr)
  }

  open fun getBakeInterval(): Double {
    val mb = getMethodBind("Curve3D","get_bake_interval")
    return _icall_Double( mb, this.ptr)
  }

  open fun getBakedLength(): Double {
    val mb = getMethodBind("Curve3D","get_baked_length")
    return _icall_Double( mb, this.ptr)
  }

  open fun getBakedPoints(): PoolVector3Array {
    val mb = getMethodBind("Curve3D","get_baked_points")
    return _icall_PoolVector3Array( mb, this.ptr)
  }

  open fun getBakedTilts(): PoolRealArray {
    val mb = getMethodBind("Curve3D","get_baked_tilts")
    return _icall_PoolRealArray( mb, this.ptr)
  }

  open fun getBakedUpVectors(): PoolVector3Array {
    val mb = getMethodBind("Curve3D","get_baked_up_vectors")
    return _icall_PoolVector3Array( mb, this.ptr)
  }

  open fun getClosestOffset(toPoint: Vector3): Double {
    val mb = getMethodBind("Curve3D","get_closest_offset")
    return _icall_Double_Vector3( mb, this.ptr, toPoint)
  }

  open fun getClosestPoint(toPoint: Vector3): Vector3 {
    val mb = getMethodBind("Curve3D","get_closest_point")
    return _icall_Vector3_Vector3( mb, this.ptr, toPoint)
  }

  open fun getPointCount(): Long {
    val mb = getMethodBind("Curve3D","get_point_count")
    return _icall_Long( mb, this.ptr)
  }

  open fun getPointIn(idx: Long): Vector3 {
    val mb = getMethodBind("Curve3D","get_point_in")
    return _icall_Vector3_Long( mb, this.ptr, idx)
  }

  open fun getPointOut(idx: Long): Vector3 {
    val mb = getMethodBind("Curve3D","get_point_out")
    return _icall_Vector3_Long( mb, this.ptr, idx)
  }

  open fun getPointPosition(idx: Long): Vector3 {
    val mb = getMethodBind("Curve3D","get_point_position")
    return _icall_Vector3_Long( mb, this.ptr, idx)
  }

  open fun getPointTilt(idx: Long): Double {
    val mb = getMethodBind("Curve3D","get_point_tilt")
    return _icall_Double_Long( mb, this.ptr, idx)
  }

  open fun interpolate(idx: Long, t: Double): Vector3 {
    val mb = getMethodBind("Curve3D","interpolate")
    return _icall_Vector3_Long_Double( mb, this.ptr, idx, t)
  }

  open fun interpolateBaked(offset: Double, cubic: Boolean = false): Vector3 {
    val mb = getMethodBind("Curve3D","interpolate_baked")
    return _icall_Vector3_Double_Boolean( mb, this.ptr, offset, cubic)
  }

  open fun interpolateBakedUpVector(offset: Double, applyTilt: Boolean = false): Vector3 {
    val mb = getMethodBind("Curve3D","interpolate_baked_up_vector")
    return _icall_Vector3_Double_Boolean( mb, this.ptr, offset, applyTilt)
  }

  open fun interpolatef(fofs: Double): Vector3 {
    val mb = getMethodBind("Curve3D","interpolatef")
    return _icall_Vector3_Double( mb, this.ptr, fofs)
  }

  open fun isUpVectorEnabled(): Boolean {
    val mb = getMethodBind("Curve3D","is_up_vector_enabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun removePoint(idx: Long) {
    val mb = getMethodBind("Curve3D","remove_point")
    _icall_Unit_Long( mb, this.ptr, idx)
  }

  open fun setBakeInterval(distance: Double) {
    val mb = getMethodBind("Curve3D","set_bake_interval")
    _icall_Unit_Double( mb, this.ptr, distance)
  }

  open fun setPointIn(idx: Long, position: Vector3) {
    val mb = getMethodBind("Curve3D","set_point_in")
    _icall_Unit_Long_Vector3( mb, this.ptr, idx, position)
  }

  open fun setPointOut(idx: Long, position: Vector3) {
    val mb = getMethodBind("Curve3D","set_point_out")
    _icall_Unit_Long_Vector3( mb, this.ptr, idx, position)
  }

  open fun setPointPosition(idx: Long, position: Vector3) {
    val mb = getMethodBind("Curve3D","set_point_position")
    _icall_Unit_Long_Vector3( mb, this.ptr, idx, position)
  }

  open fun setPointTilt(idx: Long, tilt: Double) {
    val mb = getMethodBind("Curve3D","set_point_tilt")
    _icall_Unit_Long_Double( mb, this.ptr, idx, tilt)
  }

  open fun setUpVectorEnabled(enable: Boolean) {
    val mb = getMethodBind("Curve3D","set_up_vector_enabled")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun tessellate(maxStages: Long = 5, toleranceDegrees: Double = 4.0): PoolVector3Array {
    val mb = getMethodBind("Curve3D","tessellate")
    return _icall_PoolVector3Array_Long_Double( mb, this.ptr, maxStages, toleranceDegrees)
  }
}
