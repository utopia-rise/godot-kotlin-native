package godot

import godot.core.Godot.shouldInitPtr
import godot.core.PoolIntArray
import godot.core.Transform
import godot.core.VariantArray
import godot.icalls._icall_Long
import godot.icalls._icall_Long_String
import godot.icalls._icall_Mesh_Long
import godot.icalls._icall_NavigationMesh_Long
import godot.icalls._icall_PoolIntArray
import godot.icalls._icall_String_Long
import godot.icalls._icall_Texture_Long
import godot.icalls._icall_Transform_Long
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Long_Object
import godot.icalls._icall_Unit_Long_String
import godot.icalls._icall_Unit_Long_Transform
import godot.icalls._icall_Unit_Long_VariantArray
import godot.icalls._icall_VariantArray_Long
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Long
import kotlin.String

open class MeshLibrary internal constructor(
  _ignore: Any?
) : Resource(_ignore) {
  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("MeshLibrary", "MeshLibrary")
        }

  }

  open fun clear() {
    val mb = getMethodBind("MeshLibrary","clear")
    _icall_Unit( mb, this.ptr)
  }

  open fun createItem(id: Long) {
    val mb = getMethodBind("MeshLibrary","create_item")
    _icall_Unit_Long( mb, this.ptr, id)
  }

  open fun findItemByName(name: String): Long {
    val mb = getMethodBind("MeshLibrary","find_item_by_name")
    return _icall_Long_String( mb, this.ptr, name)
  }

  open fun getItemList(): PoolIntArray {
    val mb = getMethodBind("MeshLibrary","get_item_list")
    return _icall_PoolIntArray( mb, this.ptr)
  }

  open fun getItemMesh(id: Long): Mesh {
    val mb = getMethodBind("MeshLibrary","get_item_mesh")
    return _icall_Mesh_Long( mb, this.ptr, id)
  }

  open fun getItemName(id: Long): String {
    val mb = getMethodBind("MeshLibrary","get_item_name")
    return _icall_String_Long( mb, this.ptr, id)
  }

  open fun getItemNavmesh(id: Long): NavigationMesh {
    val mb = getMethodBind("MeshLibrary","get_item_navmesh")
    return _icall_NavigationMesh_Long( mb, this.ptr, id)
  }

  open fun getItemNavmeshTransform(id: Long): Transform {
    val mb = getMethodBind("MeshLibrary","get_item_navmesh_transform")
    return _icall_Transform_Long( mb, this.ptr, id)
  }

  open fun getItemPreview(id: Long): Texture {
    val mb = getMethodBind("MeshLibrary","get_item_preview")
    return _icall_Texture_Long( mb, this.ptr, id)
  }

  open fun getItemShapes(id: Long): VariantArray {
    val mb = getMethodBind("MeshLibrary","get_item_shapes")
    return _icall_VariantArray_Long( mb, this.ptr, id)
  }

  open fun getLastUnusedItemId(): Long {
    val mb = getMethodBind("MeshLibrary","get_last_unused_item_id")
    return _icall_Long( mb, this.ptr)
  }

  open fun removeItem(id: Long) {
    val mb = getMethodBind("MeshLibrary","remove_item")
    _icall_Unit_Long( mb, this.ptr, id)
  }

  open fun setItemMesh(id: Long, mesh: Mesh) {
    val mb = getMethodBind("MeshLibrary","set_item_mesh")
    _icall_Unit_Long_Object( mb, this.ptr, id, mesh)
  }

  open fun setItemName(id: Long, name: String) {
    val mb = getMethodBind("MeshLibrary","set_item_name")
    _icall_Unit_Long_String( mb, this.ptr, id, name)
  }

  open fun setItemNavmesh(id: Long, navmesh: NavigationMesh) {
    val mb = getMethodBind("MeshLibrary","set_item_navmesh")
    _icall_Unit_Long_Object( mb, this.ptr, id, navmesh)
  }

  open fun setItemNavmeshTransform(id: Long, navmesh: Transform) {
    val mb = getMethodBind("MeshLibrary","set_item_navmesh_transform")
    _icall_Unit_Long_Transform( mb, this.ptr, id, navmesh)
  }

  open fun setItemPreview(id: Long, texture: Texture) {
    val mb = getMethodBind("MeshLibrary","set_item_preview")
    _icall_Unit_Long_Object( mb, this.ptr, id, texture)
  }

  open fun setItemShapes(id: Long, shapes: VariantArray) {
    val mb = getMethodBind("MeshLibrary","set_item_shapes")
    _icall_Unit_Long_VariantArray( mb, this.ptr, id, shapes)
  }

  companion object
}
