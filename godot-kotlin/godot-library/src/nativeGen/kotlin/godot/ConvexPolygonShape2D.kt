// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.PoolVector2Array
import godot.icalls._icall_PoolVector2Array
import godot.icalls._icall_Unit_PoolVector2Array
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlinx.cinterop.COpaquePointer

open class ConvexPolygonShape2D : Shape2D() {
  open var points: PoolVector2Array
    get() {
      val mb = getMethodBind("ConvexPolygonShape2D","get_points")
      return _icall_PoolVector2Array(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ConvexPolygonShape2D","set_points")
      _icall_Unit_PoolVector2Array(mb, this.ptr, value)
    }

  override fun __new(): COpaquePointer = invokeConstructor("ConvexPolygonShape2D",
      "ConvexPolygonShape2D")

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
