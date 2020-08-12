// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot.shouldInitPtr
import godot.core.RID
import godot.core.Signal1
import godot.core.VariantArray
import godot.core.Vector3
import godot.core.signal
import godot.icalls._icall_Boolean
import godot.icalls._icall_Boolean_Long
import godot.icalls._icall_Double
import godot.icalls._icall_Long
import godot.icalls._icall_Long_Long_Long_Long
import godot.icalls._icall_MeshLibrary
import godot.icalls._icall_RID_Long
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Boolean_Boolean_Long_Long
import godot.icalls._icall_Unit_Boolean_Double
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Long_Boolean
import godot.icalls._icall_Unit_Long_Long_Long_Long_Long
import godot.icalls._icall_Unit_Object
import godot.icalls._icall_Unit_Vector3
import godot.icalls._icall_VariantArray
import godot.icalls._icall_Vector3
import godot.icalls._icall_Vector3_Long_Long_Long
import godot.icalls._icall_Vector3_Vector3
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Unit

open class GridMap internal constructor(
  _ignore: Any?
) : Spatial(_ignore) {
  val cellSizeChanged: Signal1<Vector3> by signal("cell_size")

  open var cellCenterX: Boolean
    get() {
      val mb = getMethodBind("GridMap","get_center_x")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("GridMap","set_center_x")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var cellCenterY: Boolean
    get() {
      val mb = getMethodBind("GridMap","get_center_y")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("GridMap","set_center_y")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var cellCenterZ: Boolean
    get() {
      val mb = getMethodBind("GridMap","get_center_z")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("GridMap","set_center_z")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var cellOctantSize: Long
    get() {
      val mb = getMethodBind("GridMap","get_octant_size")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("GridMap","set_octant_size")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var cellScale: Double
    get() {
      val mb = getMethodBind("GridMap","get_cell_scale")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("GridMap","set_cell_scale")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var cellSize: Vector3
    get() {
      val mb = getMethodBind("GridMap","get_cell_size")
      return _icall_Vector3(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("GridMap","set_cell_size")
      _icall_Unit_Vector3(mb, this.ptr, value)
    }

  open var collisionLayer: Long
    get() {
      val mb = getMethodBind("GridMap","get_collision_layer")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("GridMap","set_collision_layer")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var collisionMask: Long
    get() {
      val mb = getMethodBind("GridMap","get_collision_mask")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("GridMap","set_collision_mask")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var meshLibrary: MeshLibrary
    get() {
      val mb = getMethodBind("GridMap","get_mesh_library")
      return _icall_MeshLibrary(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("GridMap","set_mesh_library")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = invokeConstructor("GridMap", "GridMap")
        }

  }

  open fun cellSize(schedule: Vector3.() -> Unit): Vector3 = cellSize.apply{
      schedule(this)
      cellSize = this
  }


  open fun _updateOctantsCallback() {
  }

  open fun clear() {
    val mb = getMethodBind("GridMap","clear")
    _icall_Unit( mb, this.ptr)
  }

  open fun clearBakedMeshes() {
    val mb = getMethodBind("GridMap","clear_baked_meshes")
    _icall_Unit( mb, this.ptr)
  }

  open fun getBakeMeshInstance(idx: Long): RID {
    val mb = getMethodBind("GridMap","get_bake_mesh_instance")
    return _icall_RID_Long( mb, this.ptr, idx)
  }

  open fun getBakeMeshes(): VariantArray {
    val mb = getMethodBind("GridMap","get_bake_meshes")
    return _icall_VariantArray( mb, this.ptr)
  }

  open fun getCellItem(
    x: Long,
    y: Long,
    z: Long
  ): Long {
    val mb = getMethodBind("GridMap","get_cell_item")
    return _icall_Long_Long_Long_Long( mb, this.ptr, x, y, z)
  }

  open fun getCellItemOrientation(
    x: Long,
    y: Long,
    z: Long
  ): Long {
    val mb = getMethodBind("GridMap","get_cell_item_orientation")
    return _icall_Long_Long_Long_Long( mb, this.ptr, x, y, z)
  }

  open fun getCellScale(): Double {
    val mb = getMethodBind("GridMap","get_cell_scale")
    return _icall_Double( mb, this.ptr)
  }

  open fun getCellSize(): Vector3 {
    val mb = getMethodBind("GridMap","get_cell_size")
    return _icall_Vector3( mb, this.ptr)
  }

  open fun getCenterX(): Boolean {
    val mb = getMethodBind("GridMap","get_center_x")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun getCenterY(): Boolean {
    val mb = getMethodBind("GridMap","get_center_y")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun getCenterZ(): Boolean {
    val mb = getMethodBind("GridMap","get_center_z")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun getCollisionLayer(): Long {
    val mb = getMethodBind("GridMap","get_collision_layer")
    return _icall_Long( mb, this.ptr)
  }

  open fun getCollisionLayerBit(bit: Long): Boolean {
    val mb = getMethodBind("GridMap","get_collision_layer_bit")
    return _icall_Boolean_Long( mb, this.ptr, bit)
  }

  open fun getCollisionMask(): Long {
    val mb = getMethodBind("GridMap","get_collision_mask")
    return _icall_Long( mb, this.ptr)
  }

  open fun getCollisionMaskBit(bit: Long): Boolean {
    val mb = getMethodBind("GridMap","get_collision_mask_bit")
    return _icall_Boolean_Long( mb, this.ptr, bit)
  }

  open fun getMeshLibrary(): MeshLibrary {
    val mb = getMethodBind("GridMap","get_mesh_library")
    return _icall_MeshLibrary( mb, this.ptr)
  }

  open fun getMeshes(): VariantArray {
    val mb = getMethodBind("GridMap","get_meshes")
    return _icall_VariantArray( mb, this.ptr)
  }

  open fun getOctantSize(): Long {
    val mb = getMethodBind("GridMap","get_octant_size")
    return _icall_Long( mb, this.ptr)
  }

  open fun getUsedCells(): VariantArray {
    val mb = getMethodBind("GridMap","get_used_cells")
    return _icall_VariantArray( mb, this.ptr)
  }

  open fun makeBakedMeshes(genLightmapUv: Boolean = false, lightmapUvTexelSize: Double = 0.1) {
    val mb = getMethodBind("GridMap","make_baked_meshes")
    _icall_Unit_Boolean_Double( mb, this.ptr, genLightmapUv, lightmapUvTexelSize)
  }

  open fun mapToWorld(
    x: Long,
    y: Long,
    z: Long
  ): Vector3 {
    val mb = getMethodBind("GridMap","map_to_world")
    return _icall_Vector3_Long_Long_Long( mb, this.ptr, x, y, z)
  }

  open fun resourceChanged(resource: Resource) {
    val mb = getMethodBind("GridMap","resource_changed")
    _icall_Unit_Object( mb, this.ptr, resource)
  }

  open fun setCellItem(
    x: Long,
    y: Long,
    z: Long,
    item: Long,
    orientation: Long = 0
  ) {
    val mb = getMethodBind("GridMap","set_cell_item")
    _icall_Unit_Long_Long_Long_Long_Long( mb, this.ptr, x, y, z, item, orientation)
  }

  open fun setCellScale(scale: Double) {
    val mb = getMethodBind("GridMap","set_cell_scale")
    _icall_Unit_Double( mb, this.ptr, scale)
  }

  open fun setCellSize(size: Vector3) {
    val mb = getMethodBind("GridMap","set_cell_size")
    _icall_Unit_Vector3( mb, this.ptr, size)
  }

  open fun setCenterX(enable: Boolean) {
    val mb = getMethodBind("GridMap","set_center_x")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setCenterY(enable: Boolean) {
    val mb = getMethodBind("GridMap","set_center_y")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setCenterZ(enable: Boolean) {
    val mb = getMethodBind("GridMap","set_center_z")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setClip(
    enabled: Boolean,
    clipabove: Boolean = true,
    floor: Long = 0,
    axis: Long = 0
  ) {
    val mb = getMethodBind("GridMap","set_clip")
    _icall_Unit_Boolean_Boolean_Long_Long( mb, this.ptr, enabled, clipabove, floor, axis)
  }

  open fun setCollisionLayer(layer: Long) {
    val mb = getMethodBind("GridMap","set_collision_layer")
    _icall_Unit_Long( mb, this.ptr, layer)
  }

  open fun setCollisionLayerBit(bit: Long, value: Boolean) {
    val mb = getMethodBind("GridMap","set_collision_layer_bit")
    _icall_Unit_Long_Boolean( mb, this.ptr, bit, value)
  }

  open fun setCollisionMask(mask: Long) {
    val mb = getMethodBind("GridMap","set_collision_mask")
    _icall_Unit_Long( mb, this.ptr, mask)
  }

  open fun setCollisionMaskBit(bit: Long, value: Boolean) {
    val mb = getMethodBind("GridMap","set_collision_mask_bit")
    _icall_Unit_Long_Boolean( mb, this.ptr, bit, value)
  }

  open fun setMeshLibrary(meshLibrary: MeshLibrary) {
    val mb = getMethodBind("GridMap","set_mesh_library")
    _icall_Unit_Object( mb, this.ptr, meshLibrary)
  }

  open fun setOctantSize(size: Long) {
    val mb = getMethodBind("GridMap","set_octant_size")
    _icall_Unit_Long( mb, this.ptr, size)
  }

  open fun worldToMap(pos: Vector3): Vector3 {
    val mb = getMethodBind("GridMap","world_to_map")
    return _icall_Vector3_Vector3( mb, this.ptr, pos)
  }

  companion object {
    final const val INVALID_CELL_ITEM: Long = -1
  }
}
