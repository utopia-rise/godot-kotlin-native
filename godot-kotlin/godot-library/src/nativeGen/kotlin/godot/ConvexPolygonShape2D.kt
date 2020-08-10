// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot.shouldInitPtr
import godot.core.PoolVector2Array
import godot.icalls._icall_PoolVector2Array
import godot.icalls._icall_Unit_PoolVector2Array
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any

open class ConvexPolygonShape2D internal constructor(
  _ignore: Any?
) : Shape2D(_ignore) {
  open var points: PoolVector2Array
    get() {
      val mb = getMethodBind("ConvexPolygonShape2D","get_points")
      return _icall_PoolVector2Array(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ConvexPolygonShape2D","set_points")
      _icall_Unit_PoolVector2Array(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("ConvexPolygonShape2D", "ConvexPolygonShape2D")
        }

  }

  open fun getPoints(): PoolVector2Array {
    val mb = getMethodBind("ConvexPolygonShape2D","get_points")
    return _icall_PoolVector2Array( mb, this.ptr)
  }

  open fun setPointCloud(pointCloud: PoolVector2Array) {
    val mb = getMethodBind("ConvexPolygonShape2D","set_point_cloud")
    _icall_Unit_PoolVector2Array( mb, this.ptr, pointCloud)
  }

  open fun setPoints(points: PoolVector2Array) {
    val mb = getMethodBind("ConvexPolygonShape2D","set_points")
    _icall_Unit_PoolVector2Array( mb, this.ptr, points)
  }
}
