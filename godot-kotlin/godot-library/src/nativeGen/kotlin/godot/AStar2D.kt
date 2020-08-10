// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot.shouldInitPtr
import godot.core.PoolIntArray
import godot.core.PoolVector2Array
import godot.core.VariantArray
import godot.core.Vector2
import godot.icalls._icall_Boolean_Long
import godot.icalls._icall_Boolean_Long_Long
import godot.icalls._icall_Double_Long
import godot.icalls._icall_Long
import godot.icalls._icall_Long_Vector2_Boolean
import godot.icalls._icall_PoolIntArray_Long
import godot.icalls._icall_PoolIntArray_Long_Long
import godot.icalls._icall_PoolVector2Array_Long_Long
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Long_Boolean
import godot.icalls._icall_Unit_Long_Double
import godot.icalls._icall_Unit_Long_Long
import godot.icalls._icall_Unit_Long_Long_Boolean
import godot.icalls._icall_Unit_Long_Vector2
import godot.icalls._icall_Unit_Long_Vector2_Double
import godot.icalls._icall_VariantArray
import godot.icalls._icall_Vector2_Long
import godot.icalls._icall_Vector2_Vector2
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.NotImplementedError

open class AStar2D internal constructor(
  _ignore: Any?
) : Reference(_ignore) {
  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("AStar2D", "AStar2D")
        }

  }

  open fun _compute_cost(fromId: Long, toId: Long): Double {
    throw NotImplementedError("_compute_cost is not implemented for AStar2D")
  }

  open fun _estimate_cost(fromId: Long, toId: Long): Double {
    throw NotImplementedError("_estimate_cost is not implemented for AStar2D")
  }

  open fun addPoint(
    id: Long,
    position: Vector2,
    weightScale: Double = 1.0
  ) {
    val mb = getMethodBind("AStar2D","add_point")
    _icall_Unit_Long_Vector2_Double( mb, this.ptr, id, position, weightScale)
  }

  open fun arePointsConnected(id: Long, toId: Long): Boolean {
    val mb = getMethodBind("AStar2D","are_points_connected")
    return _icall_Boolean_Long_Long( mb, this.ptr, id, toId)
  }

  open fun clear() {
    val mb = getMethodBind("AStar2D","clear")
    _icall_Unit( mb, this.ptr)
  }

  open fun connectPoints(
    id: Long,
    toId: Long,
    bidirectional: Boolean = true
  ) {
    val mb = getMethodBind("AStar2D","connect_points")
    _icall_Unit_Long_Long_Boolean( mb, this.ptr, id, toId, bidirectional)
  }

  open fun disconnectPoints(id: Long, toId: Long) {
    val mb = getMethodBind("AStar2D","disconnect_points")
    _icall_Unit_Long_Long( mb, this.ptr, id, toId)
  }

  open fun getAvailablePointId(): Long {
    val mb = getMethodBind("AStar2D","get_available_point_id")
    return _icall_Long( mb, this.ptr)
  }

  open fun getClosestPoint(toPosition: Vector2, includeDisabled: Boolean = false): Long {
    val mb = getMethodBind("AStar2D","get_closest_point")
    return _icall_Long_Vector2_Boolean( mb, this.ptr, toPosition, includeDisabled)
  }

  open fun getClosestPositionInSegment(toPosition: Vector2): Vector2 {
    val mb = getMethodBind("AStar2D","get_closest_position_in_segment")
    return _icall_Vector2_Vector2( mb, this.ptr, toPosition)
  }

  open fun getIdPath(fromId: Long, toId: Long): PoolIntArray {
    val mb = getMethodBind("AStar2D","get_id_path")
    return _icall_PoolIntArray_Long_Long( mb, this.ptr, fromId, toId)
  }

  open fun getPointCapacity(): Long {
    val mb = getMethodBind("AStar2D","get_point_capacity")
    return _icall_Long( mb, this.ptr)
  }

  open fun getPointConnections(id: Long): PoolIntArray {
    val mb = getMethodBind("AStar2D","get_point_connections")
    return _icall_PoolIntArray_Long( mb, this.ptr, id)
  }

  open fun getPointCount(): Long {
    val mb = getMethodBind("AStar2D","get_point_count")
    return _icall_Long( mb, this.ptr)
  }

  open fun getPointPath(fromId: Long, toId: Long): PoolVector2Array {
    val mb = getMethodBind("AStar2D","get_point_path")
    return _icall_PoolVector2Array_Long_Long( mb, this.ptr, fromId, toId)
  }

  open fun getPointPosition(id: Long): Vector2 {
    val mb = getMethodBind("AStar2D","get_point_position")
    return _icall_Vector2_Long( mb, this.ptr, id)
  }

  open fun getPointWeightScale(id: Long): Double {
    val mb = getMethodBind("AStar2D","get_point_weight_scale")
    return _icall_Double_Long( mb, this.ptr, id)
  }

  open fun getPoints(): VariantArray {
    val mb = getMethodBind("AStar2D","get_points")
    return _icall_VariantArray( mb, this.ptr)
  }

  open fun hasPoint(id: Long): Boolean {
    val mb = getMethodBind("AStar2D","has_point")
    return _icall_Boolean_Long( mb, this.ptr, id)
  }

  open fun isPointDisabled(id: Long): Boolean {
    val mb = getMethodBind("AStar2D","is_point_disabled")
    return _icall_Boolean_Long( mb, this.ptr, id)
  }

  open fun removePoint(id: Long) {
    val mb = getMethodBind("AStar2D","remove_point")
    _icall_Unit_Long( mb, this.ptr, id)
  }

  open fun reserveSpace(numNodes: Long) {
    val mb = getMethodBind("AStar2D","reserve_space")
    _icall_Unit_Long( mb, this.ptr, numNodes)
  }

  open fun setPointDisabled(id: Long, disabled: Boolean = true) {
    val mb = getMethodBind("AStar2D","set_point_disabled")
    _icall_Unit_Long_Boolean( mb, this.ptr, id, disabled)
  }

  open fun setPointPosition(id: Long, position: Vector2) {
    val mb = getMethodBind("AStar2D","set_point_position")
    _icall_Unit_Long_Vector2( mb, this.ptr, id, position)
  }

  open fun setPointWeightScale(id: Long, weightScale: Double) {
    val mb = getMethodBind("AStar2D","set_point_weight_scale")
    _icall_Unit_Long_Double( mb, this.ptr, id, weightScale)
  }
}
