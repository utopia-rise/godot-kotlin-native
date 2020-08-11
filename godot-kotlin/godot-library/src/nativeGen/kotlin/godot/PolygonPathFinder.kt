// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Dictionary
import godot.core.Godot.shouldInitPtr
import godot.core.PoolIntArray
import godot.core.PoolVector2Array
import godot.core.Rect2
import godot.core.Vector2
import godot.icalls._icall_Boolean_Vector2
import godot.icalls._icall_Double_Long
import godot.icalls._icall_PoolVector2Array_Vector2_Vector2
import godot.icalls._icall_Rect2
import godot.icalls._icall_Unit_Long_Double
import godot.icalls._icall_Unit_PoolVector2Array_PoolIntArray
import godot.icalls._icall_Vector2_Vector2
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.NotImplementedError

open class PolygonPathFinder internal constructor(
  _ignore: Any?
) : Resource(_ignore) {
  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("PolygonPathFinder", "PolygonPathFinder")
        }

  }

  open fun _get_data(): Dictionary {
    throw NotImplementedError("_get_data is not implemented for PolygonPathFinder")
  }

  open fun _set_data(arg0: Dictionary) {
  }

  open fun findPath(from: Vector2, to: Vector2): PoolVector2Array {
    val mb = getMethodBind("PolygonPathFinder","find_path")
    return _icall_PoolVector2Array_Vector2_Vector2( mb, this.ptr, from, to)
  }

  open fun getBounds(): Rect2 {
    val mb = getMethodBind("PolygonPathFinder","get_bounds")
    return _icall_Rect2( mb, this.ptr)
  }

  open fun getClosestPoint(point: Vector2): Vector2 {
    val mb = getMethodBind("PolygonPathFinder","get_closest_point")
    return _icall_Vector2_Vector2( mb, this.ptr, point)
  }

  open fun getIntersections(from: Vector2, to: Vector2): PoolVector2Array {
    val mb = getMethodBind("PolygonPathFinder","get_intersections")
    return _icall_PoolVector2Array_Vector2_Vector2( mb, this.ptr, from, to)
  }

  open fun getPointPenalty(idx: Long): Double {
    val mb = getMethodBind("PolygonPathFinder","get_point_penalty")
    return _icall_Double_Long( mb, this.ptr, idx)
  }

  open fun isPointInside(point: Vector2): Boolean {
    val mb = getMethodBind("PolygonPathFinder","is_point_inside")
    return _icall_Boolean_Vector2( mb, this.ptr, point)
  }

  open fun setPointPenalty(idx: Long, penalty: Double) {
    val mb = getMethodBind("PolygonPathFinder","set_point_penalty")
    _icall_Unit_Long_Double( mb, this.ptr, idx, penalty)
  }

  open fun setup(points: PoolVector2Array, connections: PoolIntArray) {
    val mb = getMethodBind("PolygonPathFinder","setup")
    _icall_Unit_PoolVector2Array_PoolIntArray( mb, this.ptr, points, connections)
  }
}
