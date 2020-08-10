// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot.shouldInitPtr
import godot.core.PoolVector2Array
import godot.core.Transform2D
import godot.core.Vector2
import godot.icalls._icall_Long_Object_Transform2D_nObject
import godot.icalls._icall_Object_Vector2
import godot.icalls._icall_PoolVector2Array_Vector2_Vector2_Boolean
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Long_Transform2D
import godot.icalls._icall_Vector2_Vector2
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Long

open class Navigation2D internal constructor(
  _ignore: Any?
) : Node2D(_ignore) {
  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("Navigation2D", "Navigation2D")
        }

  }

  open fun getClosestPoint(toPoint: Vector2): Vector2 {
    val mb = getMethodBind("Navigation2D","get_closest_point")
    return _icall_Vector2_Vector2( mb, this.ptr, toPoint)
  }

  open fun getClosestPointOwner(toPoint: Vector2): Object {
    val mb = getMethodBind("Navigation2D","get_closest_point_owner")
    return _icall_Object_Vector2( mb, this.ptr, toPoint)
  }

  open fun getSimplePath(
    start: Vector2,
    end: Vector2,
    optimize: Boolean = true
  ): PoolVector2Array {
    val mb = getMethodBind("Navigation2D","get_simple_path")
    return _icall_PoolVector2Array_Vector2_Vector2_Boolean( mb, this.ptr, start, end, optimize)
  }

  open fun navpolyAdd(
    mesh: NavigationPolygon,
    xform: Transform2D,
    owner: Object? = null
  ): Long {
    val mb = getMethodBind("Navigation2D","navpoly_add")
    return _icall_Long_Object_Transform2D_nObject( mb, this.ptr, mesh, xform, owner)
  }

  open fun navpolyRemove(id: Long) {
    val mb = getMethodBind("Navigation2D","navpoly_remove")
    _icall_Unit_Long( mb, this.ptr, id)
  }

  open fun navpolySetTransform(id: Long, xform: Transform2D) {
    val mb = getMethodBind("Navigation2D","navpoly_set_transform")
    _icall_Unit_Long_Transform2D( mb, this.ptr, id, xform)
  }
}
