// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.AABB
import godot.core.Godot.shouldInitPtr
import godot.core.NodePath
import godot.core.PoolByteArray
import godot.core.Transform
import godot.core.VariantArray
import godot.icalls._icall_AABB
import godot.icalls._icall_Double
import godot.icalls._icall_Long
import godot.icalls._icall_NodePath_Long
import godot.icalls._icall_PoolByteArray
import godot.icalls._icall_Texture_Long
import godot.icalls._icall_Transform
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_AABB
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_NodePath_Object_Long
import godot.icalls._icall_Unit_PoolByteArray
import godot.icalls._icall_Unit_Transform
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Any
import kotlin.Double
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Unit

open class BakedLightmapData internal constructor(
  _ignore: Any?
) : Resource(_ignore) {
  open var bounds: AABB
    get() {
      val mb = getMethodBind("BakedLightmapData","get_bounds")
      return _icall_AABB(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("BakedLightmapData","set_bounds")
      _icall_Unit_AABB(mb, this.ptr, value)
    }

  open var cellSpaceTransform: Transform
    get() {
      val mb = getMethodBind("BakedLightmapData","get_cell_space_transform")
      return _icall_Transform(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("BakedLightmapData","set_cell_space_transform")
      _icall_Unit_Transform(mb, this.ptr, value)
    }

  open var cellSubdiv: Long
    get() {
      val mb = getMethodBind("BakedLightmapData","get_cell_subdiv")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("BakedLightmapData","set_cell_subdiv")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var energy: Double
    get() {
      val mb = getMethodBind("BakedLightmapData","get_energy")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("BakedLightmapData","set_energy")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var octree: PoolByteArray
    get() {
      val mb = getMethodBind("BakedLightmapData","get_octree")
      return _icall_PoolByteArray(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("BakedLightmapData","set_octree")
      _icall_Unit_PoolByteArray(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = invokeConstructor("BakedLightmapData", "BakedLightmapData")
        }

  }

  open fun bounds(schedule: AABB.() -> Unit): AABB = bounds.apply{
      schedule(this)
      bounds = this
  }


  open fun cellSpaceTransform(schedule: Transform.() -> Unit): Transform = cellSpaceTransform.apply{
      schedule(this)
      cellSpaceTransform = this
  }


  open fun _getUserData(): VariantArray {
    throw NotImplementedError("_get_user_data is not implemented for BakedLightmapData")
  }

  open fun _setUserData(data: VariantArray) {
  }

  open fun addUser(
    path: NodePath,
    lightmap: Texture,
    instance: Long
  ) {
    val mb = getMethodBind("BakedLightmapData","add_user")
    _icall_Unit_NodePath_Object_Long( mb, this.ptr, path, lightmap, instance)
  }

  open fun clearUsers() {
    val mb = getMethodBind("BakedLightmapData","clear_users")
    _icall_Unit( mb, this.ptr)
  }

  open fun getBounds(): AABB {
    val mb = getMethodBind("BakedLightmapData","get_bounds")
    return _icall_AABB( mb, this.ptr)
  }

  open fun getCellSpaceTransform(): Transform {
    val mb = getMethodBind("BakedLightmapData","get_cell_space_transform")
    return _icall_Transform( mb, this.ptr)
  }

  open fun getCellSubdiv(): Long {
    val mb = getMethodBind("BakedLightmapData","get_cell_subdiv")
    return _icall_Long( mb, this.ptr)
  }

  open fun getEnergy(): Double {
    val mb = getMethodBind("BakedLightmapData","get_energy")
    return _icall_Double( mb, this.ptr)
  }

  open fun getOctree(): PoolByteArray {
    val mb = getMethodBind("BakedLightmapData","get_octree")
    return _icall_PoolByteArray( mb, this.ptr)
  }

  open fun getUserCount(): Long {
    val mb = getMethodBind("BakedLightmapData","get_user_count")
    return _icall_Long( mb, this.ptr)
  }

  open fun getUserLightmap(userIdx: Long): Texture {
    val mb = getMethodBind("BakedLightmapData","get_user_lightmap")
    return _icall_Texture_Long( mb, this.ptr, userIdx)
  }

  open fun getUserPath(userIdx: Long): NodePath {
    val mb = getMethodBind("BakedLightmapData","get_user_path")
    return _icall_NodePath_Long( mb, this.ptr, userIdx)
  }

  open fun setBounds(bounds: AABB) {
    val mb = getMethodBind("BakedLightmapData","set_bounds")
    _icall_Unit_AABB( mb, this.ptr, bounds)
  }

  open fun setCellSpaceTransform(xform: Transform) {
    val mb = getMethodBind("BakedLightmapData","set_cell_space_transform")
    _icall_Unit_Transform( mb, this.ptr, xform)
  }

  open fun setCellSubdiv(cellSubdiv: Long) {
    val mb = getMethodBind("BakedLightmapData","set_cell_subdiv")
    _icall_Unit_Long( mb, this.ptr, cellSubdiv)
  }

  open fun setEnergy(energy: Double) {
    val mb = getMethodBind("BakedLightmapData","set_energy")
    _icall_Unit_Double( mb, this.ptr, energy)
  }

  open fun setOctree(octree: PoolByteArray) {
    val mb = getMethodBind("BakedLightmapData","set_octree")
    _icall_Unit_PoolByteArray( mb, this.ptr, octree)
  }
}
