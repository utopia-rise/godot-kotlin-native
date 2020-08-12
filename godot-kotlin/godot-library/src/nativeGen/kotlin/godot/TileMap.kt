// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.TileMap
import godot.core.Dictionary
import godot.core.PoolIntArray
import godot.core.Rect2
import godot.core.Signal0
import godot.core.Transform2D
import godot.core.VariantArray
import godot.core.Vector2
import godot.core.signal
import godot.icalls._icall_Boolean
import godot.icalls._icall_Boolean_Long
import godot.icalls._icall_Boolean_Long_Long
import godot.icalls._icall_Double
import godot.icalls._icall_Long
import godot.icalls._icall_Long_Long_Long
import godot.icalls._icall_Long_Vector2
import godot.icalls._icall_Rect2
import godot.icalls._icall_TileSet
import godot.icalls._icall_Transform2D
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Long_Boolean
import godot.icalls._icall_Unit_Long_Long_Long_Boolean_Boolean_Boolean_Vector2
import godot.icalls._icall_Unit_Object
import godot.icalls._icall_Unit_Transform2D
import godot.icalls._icall_Unit_Vector2
import godot.icalls._icall_Unit_Vector2_Long_Boolean_Boolean_Boolean
import godot.icalls._icall_Unit_Vector2_Vector2
import godot.icalls._icall_VariantArray
import godot.icalls._icall_VariantArray_Long
import godot.icalls._icall_Vector2
import godot.icalls._icall_Vector2_Long_Long
import godot.icalls._icall_Vector2_Vector2
import godot.icalls._icall_Vector2_Vector2_Boolean
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Unit
import kotlinx.cinterop.COpaquePointer

open class TileMap : Node2D() {
  val settingsChanged: Signal0 by signal()

  open var cellClipUv: Boolean
    get() {
      val mb = getMethodBind("TileMap","get_clip_uv")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("TileMap","set_clip_uv")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var cellCustomTransform: Transform2D
    get() {
      val mb = getMethodBind("TileMap","get_custom_transform")
      return _icall_Transform2D(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("TileMap","set_custom_transform")
      _icall_Unit_Transform2D(mb, this.ptr, value)
    }

  open var cellHalfOffset: Long
    get() {
      val mb = getMethodBind("TileMap","get_half_offset")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("TileMap","set_half_offset")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var cellQuadrantSize: Long
    get() {
      val mb = getMethodBind("TileMap","get_quadrant_size")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("TileMap","set_quadrant_size")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var cellSize: Vector2
    get() {
      val mb = getMethodBind("TileMap","get_cell_size")
      return _icall_Vector2(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("TileMap","set_cell_size")
      _icall_Unit_Vector2(mb, this.ptr, value)
    }

  open var cellTileOrigin: Long
    get() {
      val mb = getMethodBind("TileMap","get_tile_origin")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("TileMap","set_tile_origin")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var cellYSort: Boolean
    get() {
      val mb = getMethodBind("TileMap","is_y_sort_mode_enabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("TileMap","set_y_sort_mode")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var centeredTextures: Boolean
    get() {
      val mb = getMethodBind("TileMap","is_centered_textures_enabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("TileMap","set_centered_textures")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var collisionBounce: Double
    get() {
      val mb = getMethodBind("TileMap","get_collision_bounce")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("TileMap","set_collision_bounce")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var collisionFriction: Double
    get() {
      val mb = getMethodBind("TileMap","get_collision_friction")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("TileMap","set_collision_friction")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var collisionLayer: Long
    get() {
      val mb = getMethodBind("TileMap","get_collision_layer")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("TileMap","set_collision_layer")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var collisionMask: Long
    get() {
      val mb = getMethodBind("TileMap","get_collision_mask")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("TileMap","set_collision_mask")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var collisionUseKinematic: Boolean
    get() {
      val mb = getMethodBind("TileMap","get_collision_use_kinematic")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("TileMap","set_collision_use_kinematic")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var collisionUseParent: Boolean
    get() {
      val mb = getMethodBind("TileMap","get_collision_use_parent")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("TileMap","set_collision_use_parent")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var compatibilityMode: Boolean
    get() {
      val mb = getMethodBind("TileMap","is_compatibility_mode_enabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("TileMap","set_compatibility_mode")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var mode: Long
    get() {
      val mb = getMethodBind("TileMap","get_mode")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("TileMap","set_mode")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var occluderLightMask: Long
    get() {
      val mb = getMethodBind("TileMap","get_occluder_light_mask")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("TileMap","set_occluder_light_mask")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var tileSet: TileSet
    get() {
      val mb = getMethodBind("TileMap","get_tileset")
      return _icall_TileSet(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("TileMap","set_tileset")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  override fun __new(): COpaquePointer = invokeConstructor("TileMap", "TileMap")

  open fun cellCustomTransform(schedule: Transform2D.() -> Unit): Transform2D =
      cellCustomTransform.apply{
      schedule(this)
      cellCustomTransform = this
  }


  open fun cellSize(schedule: Vector2.() -> Unit): Vector2 = cellSize.apply{
      schedule(this)
      cellSize = this
  }


  open fun _clearQuadrants() {
  }

  open fun _getOldCellSize(): Long {
    throw NotImplementedError("_get_old_cell_size is not implemented for TileMap")
  }

  open fun _getTileData(): PoolIntArray {
    throw NotImplementedError("_get_tile_data is not implemented for TileMap")
  }

  open fun _recreateQuadrants() {
  }

  open fun _setCelld(position: Vector2, data: Dictionary) {
  }

  open fun _setOldCellSize(size: Long) {
  }

  open fun _setTileData(arg0: PoolIntArray) {
  }

  open fun clear() {
    val mb = getMethodBind("TileMap","clear")
    _icall_Unit( mb, this.ptr)
  }

  open fun fixInvalidTiles() {
    val mb = getMethodBind("TileMap","fix_invalid_tiles")
    _icall_Unit( mb, this.ptr)
  }

  open fun getCell(x: Long, y: Long): Long {
    val mb = getMethodBind("TileMap","get_cell")
    return _icall_Long_Long_Long( mb, this.ptr, x, y)
  }

  open fun getCellAutotileCoord(x: Long, y: Long): Vector2 {
    val mb = getMethodBind("TileMap","get_cell_autotile_coord")
    return _icall_Vector2_Long_Long( mb, this.ptr, x, y)
  }

  open fun getCellSize(): Vector2 {
    val mb = getMethodBind("TileMap","get_cell_size")
    return _icall_Vector2( mb, this.ptr)
  }

  open fun getCellv(position: Vector2): Long {
    val mb = getMethodBind("TileMap","get_cellv")
    return _icall_Long_Vector2( mb, this.ptr, position)
  }

  open fun getClipUv(): Boolean {
    val mb = getMethodBind("TileMap","get_clip_uv")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun getCollisionBounce(): Double {
    val mb = getMethodBind("TileMap","get_collision_bounce")
    return _icall_Double( mb, this.ptr)
  }

  open fun getCollisionFriction(): Double {
    val mb = getMethodBind("TileMap","get_collision_friction")
    return _icall_Double( mb, this.ptr)
  }

  open fun getCollisionLayer(): Long {
    val mb = getMethodBind("TileMap","get_collision_layer")
    return _icall_Long( mb, this.ptr)
  }

  open fun getCollisionLayerBit(bit: Long): Boolean {
    val mb = getMethodBind("TileMap","get_collision_layer_bit")
    return _icall_Boolean_Long( mb, this.ptr, bit)
  }

  open fun getCollisionMask(): Long {
    val mb = getMethodBind("TileMap","get_collision_mask")
    return _icall_Long( mb, this.ptr)
  }

  open fun getCollisionMaskBit(bit: Long): Boolean {
    val mb = getMethodBind("TileMap","get_collision_mask_bit")
    return _icall_Boolean_Long( mb, this.ptr, bit)
  }

  open fun getCollisionUseKinematic(): Boolean {
    val mb = getMethodBind("TileMap","get_collision_use_kinematic")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun getCollisionUseParent(): Boolean {
    val mb = getMethodBind("TileMap","get_collision_use_parent")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun getCustomTransform(): Transform2D {
    val mb = getMethodBind("TileMap","get_custom_transform")
    return _icall_Transform2D( mb, this.ptr)
  }

  open fun getHalfOffset(): TileMap.HalfOffset {
    val mb = getMethodBind("TileMap","get_half_offset")
    return TileMap.HalfOffset.from( _icall_Long( mb, this.ptr))
  }

  open fun getMode(): TileMap.Mode {
    val mb = getMethodBind("TileMap","get_mode")
    return TileMap.Mode.from( _icall_Long( mb, this.ptr))
  }

  open fun getOccluderLightMask(): Long {
    val mb = getMethodBind("TileMap","get_occluder_light_mask")
    return _icall_Long( mb, this.ptr)
  }

  open fun getQuadrantSize(): Long {
    val mb = getMethodBind("TileMap","get_quadrant_size")
    return _icall_Long( mb, this.ptr)
  }

  open fun getTileOrigin(): TileMap.TileOrigin {
    val mb = getMethodBind("TileMap","get_tile_origin")
    return TileMap.TileOrigin.from( _icall_Long( mb, this.ptr))
  }

  open fun getTileset(): TileSet {
    val mb = getMethodBind("TileMap","get_tileset")
    return _icall_TileSet( mb, this.ptr)
  }

  open fun getUsedCells(): VariantArray {
    val mb = getMethodBind("TileMap","get_used_cells")
    return _icall_VariantArray( mb, this.ptr)
  }

  open fun getUsedCellsById(id: Long): VariantArray {
    val mb = getMethodBind("TileMap","get_used_cells_by_id")
    return _icall_VariantArray_Long( mb, this.ptr, id)
  }

  open fun getUsedRect(): Rect2 {
    val mb = getMethodBind("TileMap","get_used_rect")
    return _icall_Rect2( mb, this.ptr)
  }

  open fun isCellTransposed(x: Long, y: Long): Boolean {
    val mb = getMethodBind("TileMap","is_cell_transposed")
    return _icall_Boolean_Long_Long( mb, this.ptr, x, y)
  }

  open fun isCellXFlipped(x: Long, y: Long): Boolean {
    val mb = getMethodBind("TileMap","is_cell_x_flipped")
    return _icall_Boolean_Long_Long( mb, this.ptr, x, y)
  }

  open fun isCellYFlipped(x: Long, y: Long): Boolean {
    val mb = getMethodBind("TileMap","is_cell_y_flipped")
    return _icall_Boolean_Long_Long( mb, this.ptr, x, y)
  }

  open fun isCenteredTexturesEnabled(): Boolean {
    val mb = getMethodBind("TileMap","is_centered_textures_enabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isCompatibilityModeEnabled(): Boolean {
    val mb = getMethodBind("TileMap","is_compatibility_mode_enabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isYSortModeEnabled(): Boolean {
    val mb = getMethodBind("TileMap","is_y_sort_mode_enabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun mapToWorld(mapPosition: Vector2, ignoreHalfOfs: Boolean = false): Vector2 {
    val mb = getMethodBind("TileMap","map_to_world")
    return _icall_Vector2_Vector2_Boolean( mb, this.ptr, mapPosition, ignoreHalfOfs)
  }

  open fun setCell(
    x: Long,
    y: Long,
    tile: Long,
    flipX: Boolean = false,
    flipY: Boolean = false,
    transpose: Boolean = false,
    autotileCoord: Vector2 = Vector2(0.0, 0.0)
  ) {
    val mb = getMethodBind("TileMap","set_cell")
    _icall_Unit_Long_Long_Long_Boolean_Boolean_Boolean_Vector2( mb, this.ptr, x, y, tile, flipX,
        flipY, transpose, autotileCoord)
  }

  open fun setCellSize(size: Vector2) {
    val mb = getMethodBind("TileMap","set_cell_size")
    _icall_Unit_Vector2( mb, this.ptr, size)
  }

  open fun setCellv(
    position: Vector2,
    tile: Long,
    flipX: Boolean = false,
    flipY: Boolean = false,
    transpose: Boolean = false
  ) {
    val mb = getMethodBind("TileMap","set_cellv")
    _icall_Unit_Vector2_Long_Boolean_Boolean_Boolean( mb, this.ptr, position, tile, flipX, flipY,
        transpose)
  }

  open fun setCenteredTextures(enable: Boolean) {
    val mb = getMethodBind("TileMap","set_centered_textures")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setClipUv(enable: Boolean) {
    val mb = getMethodBind("TileMap","set_clip_uv")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setCollisionBounce(value: Double) {
    val mb = getMethodBind("TileMap","set_collision_bounce")
    _icall_Unit_Double( mb, this.ptr, value)
  }

  open fun setCollisionFriction(value: Double) {
    val mb = getMethodBind("TileMap","set_collision_friction")
    _icall_Unit_Double( mb, this.ptr, value)
  }

  open fun setCollisionLayer(layer: Long) {
    val mb = getMethodBind("TileMap","set_collision_layer")
    _icall_Unit_Long( mb, this.ptr, layer)
  }

  open fun setCollisionLayerBit(bit: Long, value: Boolean) {
    val mb = getMethodBind("TileMap","set_collision_layer_bit")
    _icall_Unit_Long_Boolean( mb, this.ptr, bit, value)
  }

  open fun setCollisionMask(mask: Long) {
    val mb = getMethodBind("TileMap","set_collision_mask")
    _icall_Unit_Long( mb, this.ptr, mask)
  }

  open fun setCollisionMaskBit(bit: Long, value: Boolean) {
    val mb = getMethodBind("TileMap","set_collision_mask_bit")
    _icall_Unit_Long_Boolean( mb, this.ptr, bit, value)
  }

  open fun setCollisionUseKinematic(useKinematic: Boolean) {
    val mb = getMethodBind("TileMap","set_collision_use_kinematic")
    _icall_Unit_Boolean( mb, this.ptr, useKinematic)
  }

  open fun setCollisionUseParent(useParent: Boolean) {
    val mb = getMethodBind("TileMap","set_collision_use_parent")
    _icall_Unit_Boolean( mb, this.ptr, useParent)
  }

  open fun setCompatibilityMode(enable: Boolean) {
    val mb = getMethodBind("TileMap","set_compatibility_mode")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setCustomTransform(customTransform: Transform2D) {
    val mb = getMethodBind("TileMap","set_custom_transform")
    _icall_Unit_Transform2D( mb, this.ptr, customTransform)
  }

  open fun setHalfOffset(halfOffset: Long) {
    val mb = getMethodBind("TileMap","set_half_offset")
    _icall_Unit_Long( mb, this.ptr, halfOffset)
  }

  open fun setMode(mode: Long) {
    val mb = getMethodBind("TileMap","set_mode")
    _icall_Unit_Long( mb, this.ptr, mode)
  }

  open fun setOccluderLightMask(mask: Long) {
    val mb = getMethodBind("TileMap","set_occluder_light_mask")
    _icall_Unit_Long( mb, this.ptr, mask)
  }

  open fun setQuadrantSize(size: Long) {
    val mb = getMethodBind("TileMap","set_quadrant_size")
    _icall_Unit_Long( mb, this.ptr, size)
  }

  open fun setTileOrigin(origin: Long) {
    val mb = getMethodBind("TileMap","set_tile_origin")
    _icall_Unit_Long( mb, this.ptr, origin)
  }

  open fun setTileset(tileset: TileSet) {
    val mb = getMethodBind("TileMap","set_tileset")
    _icall_Unit_Object( mb, this.ptr, tileset)
  }

  open fun setYSortMode(enable: Boolean) {
    val mb = getMethodBind("TileMap","set_y_sort_mode")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun updateBitmaskArea(position: Vector2) {
    val mb = getMethodBind("TileMap","update_bitmask_area")
    _icall_Unit_Vector2( mb, this.ptr, position)
  }

  open fun updateBitmaskRegion(start: Vector2 = Vector2(0.0, 0.0), end: Vector2 = Vector2(0.0,
      0.0)) {
    val mb = getMethodBind("TileMap","update_bitmask_region")
    _icall_Unit_Vector2_Vector2( mb, this.ptr, start, end)
  }

  open fun updateDirtyQuadrants() {
    val mb = getMethodBind("TileMap","update_dirty_quadrants")
    _icall_Unit( mb, this.ptr)
  }

  open fun worldToMap(worldPosition: Vector2): Vector2 {
    val mb = getMethodBind("TileMap","world_to_map")
    return _icall_Vector2_Vector2( mb, this.ptr, worldPosition)
  }

  enum class Mode(
    id: Long
  ) {
    MODE_SQUARE(0),

    MODE_ISOMETRIC(1),

    MODE_CUSTOM(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class TileOrigin(
    id: Long
  ) {
    TILE_ORIGIN_TOP_LEFT(0),

    TILE_ORIGIN_CENTER(1),

    TILE_ORIGIN_BOTTOM_LEFT(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class HalfOffset(
    id: Long
  ) {
    HALF_OFFSET_X(0),

    HALF_OFFSET_Y(1),

    HALF_OFFSET_DISABLED(2),

    HALF_OFFSET_NEGATIVE_X(3),

    HALF_OFFSET_NEGATIVE_Y(4);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val INVALID_CELL: Long = -1
  }
}
