// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot.shouldInitPtr
import godot.core.PoolVector3Array
import godot.core.Transform
import godot.core.Vector3
import godot.icalls._icall_Long_Object_Transform_nObject
import godot.icalls._icall_Object_Vector3
import godot.icalls._icall_PoolVector3Array_Vector3_Vector3_Boolean
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Long_Transform
import godot.icalls._icall_Unit_Vector3
import godot.icalls._icall_Vector3
import godot.icalls._icall_Vector3_Vector3
import godot.icalls._icall_Vector3_Vector3_Vector3_Boolean
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.Unit

open class Navigation internal constructor(
  _ignore: Any?
) : Spatial(_ignore) {
  open var upVector: Vector3
    get() {
      val mb = getMethodBind("Navigation","get_up_vector")
      return _icall_Vector3(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Navigation","set_up_vector")
      _icall_Unit_Vector3(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = invokeConstructor("Navigation", "Navigation")
        }

  }

  open fun upVector(schedule: Vector3.() -> Unit): Vector3 = upVector.apply{
      schedule(this)
      upVector = this
  }


  open fun getClosestPoint(toPoint: Vector3): Vector3 {
    val mb = getMethodBind("Navigation","get_closest_point")
    return _icall_Vector3_Vector3( mb, this.ptr, toPoint)
  }

  open fun getClosestPointNormal(toPoint: Vector3): Vector3 {
    val mb = getMethodBind("Navigation","get_closest_point_normal")
    return _icall_Vector3_Vector3( mb, this.ptr, toPoint)
  }

  open fun getClosestPointOwner(toPoint: Vector3): Object {
    val mb = getMethodBind("Navigation","get_closest_point_owner")
    return _icall_Object_Vector3( mb, this.ptr, toPoint)
  }

  open fun getClosestPointToSegment(
    start: Vector3,
    end: Vector3,
    useCollision: Boolean = false
  ): Vector3 {
    val mb = getMethodBind("Navigation","get_closest_point_to_segment")
    return _icall_Vector3_Vector3_Vector3_Boolean( mb, this.ptr, start, end, useCollision)
  }

  open fun getSimplePath(
    start: Vector3,
    end: Vector3,
    optimize: Boolean = true
  ): PoolVector3Array {
    val mb = getMethodBind("Navigation","get_simple_path")
    return _icall_PoolVector3Array_Vector3_Vector3_Boolean( mb, this.ptr, start, end, optimize)
  }

  open fun getUpVector(): Vector3 {
    val mb = getMethodBind("Navigation","get_up_vector")
    return _icall_Vector3( mb, this.ptr)
  }

  open fun navmeshAdd(
    mesh: NavigationMesh,
    xform: Transform,
    owner: Object? = null
  ): Long {
    val mb = getMethodBind("Navigation","navmesh_add")
    return _icall_Long_Object_Transform_nObject( mb, this.ptr, mesh, xform, owner)
  }

  open fun navmeshRemove(id: Long) {
    val mb = getMethodBind("Navigation","navmesh_remove")
    _icall_Unit_Long( mb, this.ptr, id)
  }

  open fun navmeshSetTransform(id: Long, xform: Transform) {
    val mb = getMethodBind("Navigation","navmesh_set_transform")
    _icall_Unit_Long_Transform( mb, this.ptr, id, xform)
  }

  open fun setUpVector(up: Vector3) {
    val mb = getMethodBind("Navigation","set_up_vector")
    _icall_Unit_Vector3( mb, this.ptr, up)
  }
}
