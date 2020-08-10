// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot.shouldInitPtr
import godot.core.PoolIntArray
import godot.core.PoolVector3Array
import godot.core.VariantArray
import godot.core.Vector3
import godot.icalls._icall_Boolean_Long
import godot.icalls._icall_Boolean_Long_Long_Boolean
import godot.icalls._icall_Double_Long
import godot.icalls._icall_Long
import godot.icalls._icall_Long_Vector3_Boolean
import godot.icalls._icall_PoolIntArray_Long
import godot.icalls._icall_PoolIntArray_Long_Long
import godot.icalls._icall_PoolVector3Array_Long_Long
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Long_Boolean
import godot.icalls._icall_Unit_Long_Double
import godot.icalls._icall_Unit_Long_Long_Boolean
import godot.icalls._icall_Unit_Long_Vector3
import godot.icalls._icall_Unit_Long_Vector3_Double
import godot.icalls._icall_VariantArray
import godot.icalls._icall_Vector3_Long
import godot.icalls._icall_Vector3_Vector3
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.NotImplementedError

open class AStar internal constructor(
  _ignore: Any?
) : Reference(_ignore) {
  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("AStar", "AStar")
        }

  }

  open fun _compute_cost(fromId: Long, toId: Long): Double {
    throw NotImplementedError("_compute_cost is not implemented for AStar")
  }

  open fun _estimate_cost(fromId: Long, toId: Long): Double {
    throw NotImplementedError("_estimate_cost is not implemented for AStar")
  }

  open fun addPoint(
    id: Long,
    position: Vector3,
    weightScale: Double = 1.0
  ) {
    val mb = getMethodBind("AStar","add_point")
    _icall_Unit_Long_Vector3_Double( mb, this.ptr, id, position, weightScale)
  }

  open fun arePointsConnected(
    id: Long,
    toId: Long,
    bidirectional: Boolean = true
  ): Boolean {
    val mb = getMethodBind("AStar","are_points_connected")
    return _icall_Boolean_Long_Long_Boolean( mb, this.ptr, id, toId, bidirectional)
  }

  open fun clear() {
    val mb = getMethodBind("AStar","clear")
    _icall_Unit( mb, this.ptr)
  }

  open fun connectPoints(
    id: Long,
    toId: Long,
    bidirectional: Boolean = true
  ) {
    val mb = getMethodBind("AStar","connect_points")
    _icall_Unit_Long_Long_Boolean( mb, this.ptr, id, toId, bidirectional)
  }

  open fun disconnectPoints(
    id: Long,
    toId: Long,
    bidirectional: Boolean = true
  ) {
    val mb = getMethodBind("AStar","disconnect_points")
    _icall_Unit_Long_Long_Boolean( mb, this.ptr, id, toId, bidirectional)
  }

  open fun getAvailablePointId(): Long {
    val mb = getMethodBind("AStar","get_available_point_id")
    return _icall_Long( mb, this.ptr)
  }

  open fun getClosestPoint(toPosition: Vector3, includeDisabled: Boolean = false): Long {
    val mb = getMethodBind("AStar","get_closest_point")
    return _icall_Long_Vector3_Boolean( mb, this.ptr, toPosition, includeDisabled)
  }

  open fun getClosestPositionInSegment(toPosition: Vector3): Vector3 {
    val mb = getMethodBind("AStar","get_closest_position_in_segment")
    return _icall_Vector3_Vector3( mb, this.ptr, toPosition)
  }

  open fun getIdPath(fromId: Long, toId: Long): PoolIntArray {
    val mb = getMethodBind("AStar","get_id_path")
    return _icall_PoolIntArray_Long_Long( mb, this.ptr, fromId, toId)
  }

  open fun getPointCapacity(): Long {
    val mb = getMethodBind("AStar","get_point_capacity")
    return _icall_Long( mb, this.ptr)
  }

  open fun getPointConnections(id: Long): PoolIntArray {
    val mb = getMethodBind("AStar","get_point_connections")
    return _icall_PoolIntArray_Long( mb, this.ptr, id)
  }

  open fun getPointCount(): Long {
    val mb = getMethodBind("AStar","get_point_count")
    return _icall_Long( mb, this.ptr)
  }

  open fun getPointPath(fromId: Long, toId: Long): PoolVector3Array {
    val mb = getMethodBind("AStar","get_point_path")
    return _icall_PoolVector3Array_Long_Long( mb, this.ptr, fromId, toId)
  }

  open fun getPointPosition(id: Long): Vector3 {
    val mb = getMethodBind("AStar","get_point_position")
    return _icall_Vector3_Long( mb, this.ptr, id)
  }

  open fun getPointWeightScale(id: Long): Double {
    val mb = getMethodBind("AStar","get_point_weight_scale")
    return _icall_Double_Long( mb, this.ptr, id)
  }

  open fun getPoints(): VariantArray {
    val mb = getMethodBind("AStar","get_points")
    return _icall_VariantArray( mb, this.ptr)
  }

  open fun hasPoint(id: Long): Boolean {
    val mb = getMethodBind("AStar","has_point")
    return _icall_Boolean_Long( mb, this.ptr, id)
  }

  open fun isPointDisabled(id: Long): Boolean {
    val mb = getMethodBind("AStar","is_point_disabled")
    return _icall_Boolean_Long( mb, this.ptr, id)
  }

  open fun removePoint(id: Long) {
    val mb = getMethodBind("AStar","remove_point")
    _icall_Unit_Long( mb, this.ptr, id)
  }

  open fun reserveSpace(numNodes: Long) {
    val mb = getMethodBind("AStar","reserve_space")
    _icall_Unit_Long( mb, this.ptr, numNodes)
  }

  open fun setPointDisabled(id: Long, disabled: Boolean = true) {
    val mb = getMethodBind("AStar","set_point_disabled")
    _icall_Unit_Long_Boolean( mb, this.ptr, id, disabled)
  }

  open fun setPointPosition(id: Long, position: Vector3) {
    val mb = getMethodBind("AStar","set_point_position")
    _icall_Unit_Long_Vector3( mb, this.ptr, id, position)
  }

  open fun setPointWeightScale(id: Long, weightScale: Double) {
    val mb = getMethodBind("AStar","set_point_weight_scale")
    _icall_Unit_Long_Double( mb, this.ptr, id, weightScale)
  }
}
