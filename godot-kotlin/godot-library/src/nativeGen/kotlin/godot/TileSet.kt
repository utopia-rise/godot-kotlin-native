// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.TileSet
import godot.core.Color
import godot.core.Rect2
import godot.core.Transform2D
import godot.core.VariantArray
import godot.core.Vector2
import godot.icalls._icall_Boolean_Long_Long
import godot.icalls._icall_Color_Long
import godot.icalls._icall_Double_Long_Long
import godot.icalls._icall_Long
import godot.icalls._icall_Long_Long
import godot.icalls._icall_Long_Long_Vector2
import godot.icalls._icall_Long_String
import godot.icalls._icall_NavigationPolygon_Long
import godot.icalls._icall_NavigationPolygon_Long_Vector2
import godot.icalls._icall_OccluderPolygon2D_Long
import godot.icalls._icall_OccluderPolygon2D_Long_Vector2
import godot.icalls._icall_Rect2_Long
import godot.icalls._icall_ShaderMaterial_Long
import godot.icalls._icall_Shape2D_Long_Long
import godot.icalls._icall_String_Long
import godot.icalls._icall_Texture_Long
import godot.icalls._icall_Transform2D_Long_Long
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Long_Color
import godot.icalls._icall_Unit_Long_Long
import godot.icalls._icall_Unit_Long_Long_Boolean
import godot.icalls._icall_Unit_Long_Long_Double
import godot.icalls._icall_Unit_Long_Long_Object
import godot.icalls._icall_Unit_Long_Long_Transform2D
import godot.icalls._icall_Unit_Long_Long_Vector2
import godot.icalls._icall_Unit_Long_Object
import godot.icalls._icall_Unit_Long_Object_Transform2D_Boolean_Vector2
import godot.icalls._icall_Unit_Long_Object_Vector2
import godot.icalls._icall_Unit_Long_Rect2
import godot.icalls._icall_Unit_Long_String
import godot.icalls._icall_Unit_Long_VariantArray
import godot.icalls._icall_Unit_Long_Vector2
import godot.icalls._icall_Unit_Long_Vector2_Long
import godot.icalls._icall_VariantArray
import godot.icalls._icall_VariantArray_Long
import godot.icalls._icall_Vector2_Long
import godot.icalls._icall_Vector2_Long_Long
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlinx.cinterop.COpaquePointer

open class TileSet : Resource() {
  override fun __new(): COpaquePointer = invokeConstructor("TileSet", "TileSet")

  open fun _forwardAtlasSubtileSelection(
    atlastileId: Long,
    tilemap: Object,
    tileLocation: Vector2
  ): Vector2 {
    throw NotImplementedError("_forward_atlas_subtile_selection is not implemented for TileSet")
  }

  open fun _forwardSubtileSelection(
    autotileId: Long,
    bitmask: Long,
    tilemap: Object,
    tileLocation: Vector2
  ): Vector2 {
    throw NotImplementedError("_forward_subtile_selection is not implemented for TileSet")
  }

  open fun _isTileBound(drawnId: Long, neighborId: Long): Boolean {
    throw NotImplementedError("_is_tile_bound is not implemented for TileSet")
  }

  open fun autotileClearBitmaskMap(id: Long) {
    val mb = getMethodBind("TileSet","autotile_clear_bitmask_map")
    _icall_Unit_Long( mb, this.ptr, id)
  }

  open fun autotileGetBitmask(id: Long, coord: Vector2): Long {
    val mb = getMethodBind("TileSet","autotile_get_bitmask")
    return _icall_Long_Long_Vector2( mb, this.ptr, id, coord)
  }

  open fun autotileGetBitmaskMode(id: Long): TileSet.BitmaskMode {
    val mb = getMethodBind("TileSet","autotile_get_bitmask_mode")
    return TileSet.BitmaskMode.from( _icall_Long_Long( mb, this.ptr, id))
  }

  open fun autotileGetIconCoordinate(id: Long): Vector2 {
    val mb = getMethodBind("TileSet","autotile_get_icon_coordinate")
    return _icall_Vector2_Long( mb, this.ptr, id)
  }

  open fun autotileGetLightOccluder(id: Long, coord: Vector2): OccluderPolygon2D {
    val mb = getMethodBind("TileSet","autotile_get_light_occluder")
    return _icall_OccluderPolygon2D_Long_Vector2( mb, this.ptr, id, coord)
  }

  open fun autotileGetNavigationPolygon(id: Long, coord: Vector2): NavigationPolygon {
    val mb = getMethodBind("TileSet","autotile_get_navigation_polygon")
    return _icall_NavigationPolygon_Long_Vector2( mb, this.ptr, id, coord)
  }

  open fun autotileGetSize(id: Long): Vector2 {
    val mb = getMethodBind("TileSet","autotile_get_size")
    return _icall_Vector2_Long( mb, this.ptr, id)
  }

  open fun autotileGetSpacing(id: Long): Long {
    val mb = getMethodBind("TileSet","autotile_get_spacing")
    return _icall_Long_Long( mb, this.ptr, id)
  }

  open fun autotileGetSubtilePriority(id: Long, coord: Vector2): Long {
    val mb = getMethodBind("TileSet","autotile_get_subtile_priority")
    return _icall_Long_Long_Vector2( mb, this.ptr, id, coord)
  }

  open fun autotileGetZIndex(id: Long, coord: Vector2): Long {
    val mb = getMethodBind("TileSet","autotile_get_z_index")
    return _icall_Long_Long_Vector2( mb, this.ptr, id, coord)
  }

  open fun autotileSetBitmask(
    id: Long,
    bitmask: Vector2,
    flag: Long
  ) {
    val mb = getMethodBind("TileSet","autotile_set_bitmask")
    _icall_Unit_Long_Vector2_Long( mb, this.ptr, id, bitmask, flag)
  }

  open fun autotileSetBitmaskMode(id: Long, mode: Long) {
    val mb = getMethodBind("TileSet","autotile_set_bitmask_mode")
    _icall_Unit_Long_Long( mb, this.ptr, id, mode)
  }

  open fun autotileSetIconCoordinate(id: Long, coord: Vector2) {
    val mb = getMethodBind("TileSet","autotile_set_icon_coordinate")
    _icall_Unit_Long_Vector2( mb, this.ptr, id, coord)
  }

  open fun autotileSetLightOccluder(
    id: Long,
    lightOccluder: OccluderPolygon2D,
    coord: Vector2
  ) {
    val mb = getMethodBind("TileSet","autotile_set_light_occluder")
    _icall_Unit_Long_Object_Vector2( mb, this.ptr, id, lightOccluder, coord)
  }

  open fun autotileSetNavigationPolygon(
    id: Long,
    navigationPolygon: NavigationPolygon,
    coord: Vector2
  ) {
    val mb = getMethodBind("TileSet","autotile_set_navigation_polygon")
    _icall_Unit_Long_Object_Vector2( mb, this.ptr, id, navigationPolygon, coord)
  }

  open fun autotileSetSize(id: Long, size: Vector2) {
    val mb = getMethodBind("TileSet","autotile_set_size")
    _icall_Unit_Long_Vector2( mb, this.ptr, id, size)
  }

  open fun autotileSetSpacing(id: Long, spacing: Long) {
    val mb = getMethodBind("TileSet","autotile_set_spacing")
    _icall_Unit_Long_Long( mb, this.ptr, id, spacing)
  }

  open fun autotileSetSubtilePriority(
    id: Long,
    coord: Vector2,
    priority: Long
  ) {
    val mb = getMethodBind("TileSet","autotile_set_subtile_priority")
    _icall_Unit_Long_Vector2_Long( mb, this.ptr, id, coord, priority)
  }

  open fun autotileSetZIndex(
    id: Long,
    coord: Vector2,
    zIndex: Long
  ) {
    val mb = getMethodBind("TileSet","autotile_set_z_index")
    _icall_Unit_Long_Vector2_Long( mb, this.ptr, id, coord, zIndex)
  }

  open fun clear() {
    val mb = getMethodBind("TileSet","clear")
    _icall_Unit( mb, this.ptr)
  }

  open fun createTile(id: Long) {
    val mb = getMethodBind("TileSet","create_tile")
    _icall_Unit_Long( mb, this.ptr, id)
  }

  open fun findTileByName(name: String): Long {
    val mb = getMethodBind("TileSet","find_tile_by_name")
    return _icall_Long_String( mb, this.ptr, name)
  }

  open fun getLastUnusedTileId(): Long {
    val mb = getMethodBind("TileSet","get_last_unused_tile_id")
    return _icall_Long( mb, this.ptr)
  }

  open fun getTilesIds(): VariantArray {
    val mb = getMethodBind("TileSet","get_tiles_ids")
    return _icall_VariantArray( mb, this.ptr)
  }

  open fun removeTile(id: Long) {
    val mb = getMethodBind("TileSet","remove_tile")
    _icall_Unit_Long( mb, this.ptr, id)
  }

  open fun tileAddShape(
    id: Long,
    shape: Shape2D,
    shapeTransform: Transform2D,
    oneWay: Boolean = false,
    autotileCoord: Vector2 = Vector2(0.0, 0.0)
  ) {
    val mb = getMethodBind("TileSet","tile_add_shape")
    _icall_Unit_Long_Object_Transform2D_Boolean_Vector2( mb, this.ptr, id, shape, shapeTransform,
        oneWay, autotileCoord)
  }

  open fun tileGetLightOccluder(id: Long): OccluderPolygon2D {
    val mb = getMethodBind("TileSet","tile_get_light_occluder")
    return _icall_OccluderPolygon2D_Long( mb, this.ptr, id)
  }

  open fun tileGetMaterial(id: Long): ShaderMaterial {
    val mb = getMethodBind("TileSet","tile_get_material")
    return _icall_ShaderMaterial_Long( mb, this.ptr, id)
  }

  open fun tileGetModulate(id: Long): Color {
    val mb = getMethodBind("TileSet","tile_get_modulate")
    return _icall_Color_Long( mb, this.ptr, id)
  }

  open fun tileGetName(id: Long): String {
    val mb = getMethodBind("TileSet","tile_get_name")
    return _icall_String_Long( mb, this.ptr, id)
  }

  open fun tileGetNavigationPolygon(id: Long): NavigationPolygon {
    val mb = getMethodBind("TileSet","tile_get_navigation_polygon")
    return _icall_NavigationPolygon_Long( mb, this.ptr, id)
  }

  open fun tileGetNavigationPolygonOffset(id: Long): Vector2 {
    val mb = getMethodBind("TileSet","tile_get_navigation_polygon_offset")
    return _icall_Vector2_Long( mb, this.ptr, id)
  }

  open fun tileGetNormalMap(id: Long): Texture {
    val mb = getMethodBind("TileSet","tile_get_normal_map")
    return _icall_Texture_Long( mb, this.ptr, id)
  }

  open fun tileGetOccluderOffset(id: Long): Vector2 {
    val mb = getMethodBind("TileSet","tile_get_occluder_offset")
    return _icall_Vector2_Long( mb, this.ptr, id)
  }

  open fun tileGetRegion(id: Long): Rect2 {
    val mb = getMethodBind("TileSet","tile_get_region")
    return _icall_Rect2_Long( mb, this.ptr, id)
  }

  open fun tileGetShape(id: Long, shapeId: Long): Shape2D {
    val mb = getMethodBind("TileSet","tile_get_shape")
    return _icall_Shape2D_Long_Long( mb, this.ptr, id, shapeId)
  }

  open fun tileGetShapeCount(id: Long): Long {
    val mb = getMethodBind("TileSet","tile_get_shape_count")
    return _icall_Long_Long( mb, this.ptr, id)
  }

  open fun tileGetShapeOffset(id: Long, shapeId: Long): Vector2 {
    val mb = getMethodBind("TileSet","tile_get_shape_offset")
    return _icall_Vector2_Long_Long( mb, this.ptr, id, shapeId)
  }

  open fun tileGetShapeOneWay(id: Long, shapeId: Long): Boolean {
    val mb = getMethodBind("TileSet","tile_get_shape_one_way")
    return _icall_Boolean_Long_Long( mb, this.ptr, id, shapeId)
  }

  open fun tileGetShapeOneWayMargin(id: Long, shapeId: Long): Double {
    val mb = getMethodBind("TileSet","tile_get_shape_one_way_margin")
    return _icall_Double_Long_Long( mb, this.ptr, id, shapeId)
  }

  open fun tileGetShapeTransform(id: Long, shapeId: Long): Transform2D {
    val mb = getMethodBind("TileSet","tile_get_shape_transform")
    return _icall_Transform2D_Long_Long( mb, this.ptr, id, shapeId)
  }

  open fun tileGetShapes(id: Long): VariantArray {
    val mb = getMethodBind("TileSet","tile_get_shapes")
    return _icall_VariantArray_Long( mb, this.ptr, id)
  }

  open fun tileGetTexture(id: Long): Texture {
    val mb = getMethodBind("TileSet","tile_get_texture")
    return _icall_Texture_Long( mb, this.ptr, id)
  }

  open fun tileGetTextureOffset(id: Long): Vector2 {
    val mb = getMethodBind("TileSet","tile_get_texture_offset")
    return _icall_Vector2_Long( mb, this.ptr, id)
  }

  open fun tileGetTileMode(id: Long): TileSet.TileMode {
    val mb = getMethodBind("TileSet","tile_get_tile_mode")
    return TileSet.TileMode.from( _icall_Long_Long( mb, this.ptr, id))
  }

  open fun tileGetZIndex(id: Long): Long {
    val mb = getMethodBind("TileSet","tile_get_z_index")
    return _icall_Long_Long( mb, this.ptr, id)
  }

  open fun tileSetLightOccluder(id: Long, lightOccluder: OccluderPolygon2D) {
    val mb = getMethodBind("TileSet","tile_set_light_occluder")
    _icall_Unit_Long_Object( mb, this.ptr, id, lightOccluder)
  }

  open fun tileSetMaterial(id: Long, material: ShaderMaterial) {
    val mb = getMethodBind("TileSet","tile_set_material")
    _icall_Unit_Long_Object( mb, this.ptr, id, material)
  }

  open fun tileSetModulate(id: Long, color: Color) {
    val mb = getMethodBind("TileSet","tile_set_modulate")
    _icall_Unit_Long_Color( mb, this.ptr, id, color)
  }

  open fun tileSetName(id: Long, name: String) {
    val mb = getMethodBind("TileSet","tile_set_name")
    _icall_Unit_Long_String( mb, this.ptr, id, name)
  }

  open fun tileSetNavigationPolygon(id: Long, navigationPolygon: NavigationPolygon) {
    val mb = getMethodBind("TileSet","tile_set_navigation_polygon")
    _icall_Unit_Long_Object( mb, this.ptr, id, navigationPolygon)
  }

  open fun tileSetNavigationPolygonOffset(id: Long, navigationPolygonOffset: Vector2) {
    val mb = getMethodBind("TileSet","tile_set_navigation_polygon_offset")
    _icall_Unit_Long_Vector2( mb, this.ptr, id, navigationPolygonOffset)
  }

  open fun tileSetNormalMap(id: Long, normalMap: Texture) {
    val mb = getMethodBind("TileSet","tile_set_normal_map")
    _icall_Unit_Long_Object( mb, this.ptr, id, normalMap)
  }

  open fun tileSetOccluderOffset(id: Long, occluderOffset: Vector2) {
    val mb = getMethodBind("TileSet","tile_set_occluder_offset")
    _icall_Unit_Long_Vector2( mb, this.ptr, id, occluderOffset)
  }

  open fun tileSetRegion(id: Long, region: Rect2) {
    val mb = getMethodBind("TileSet","tile_set_region")
    _icall_Unit_Long_Rect2( mb, this.ptr, id, region)
  }

  open fun tileSetShape(
    id: Long,
    shapeId: Long,
    shape: Shape2D
  ) {
    val mb = getMethodBind("TileSet","tile_set_shape")
    _icall_Unit_Long_Long_Object( mb, this.ptr, id, shapeId, shape)
  }

  open fun tileSetShapeOffset(
    id: Long,
    shapeId: Long,
    shapeOffset: Vector2
  ) {
    val mb = getMethodBind("TileSet","tile_set_shape_offset")
    _icall_Unit_Long_Long_Vector2( mb, this.ptr, id, shapeId, shapeOffset)
  }

  open fun tileSetShapeOneWay(
    id: Long,
    shapeId: Long,
    oneWay: Boolean
  ) {
    val mb = getMethodBind("TileSet","tile_set_shape_one_way")
    _icall_Unit_Long_Long_Boolean( mb, this.ptr, id, shapeId, oneWay)
  }

  open fun tileSetShapeOneWayMargin(
    id: Long,
    shapeId: Long,
    oneWay: Double
  ) {
    val mb = getMethodBind("TileSet","tile_set_shape_one_way_margin")
    _icall_Unit_Long_Long_Double( mb, this.ptr, id, shapeId, oneWay)
  }

  open fun tileSetShapeTransform(
    id: Long,
    shapeId: Long,
    shapeTransform: Transform2D
  ) {
    val mb = getMethodBind("TileSet","tile_set_shape_transform")
    _icall_Unit_Long_Long_Transform2D( mb, this.ptr, id, shapeId, shapeTransform)
  }

  open fun tileSetShapes(id: Long, shapes: VariantArray) {
    val mb = getMethodBind("TileSet","tile_set_shapes")
    _icall_Unit_Long_VariantArray( mb, this.ptr, id, shapes)
  }

  open fun tileSetTexture(id: Long, texture: Texture) {
    val mb = getMethodBind("TileSet","tile_set_texture")
    _icall_Unit_Long_Object( mb, this.ptr, id, texture)
  }

  open fun tileSetTextureOffset(id: Long, textureOffset: Vector2) {
    val mb = getMethodBind("TileSet","tile_set_texture_offset")
    _icall_Unit_Long_Vector2( mb, this.ptr, id, textureOffset)
  }

  open fun tileSetTileMode(id: Long, tilemode: Long) {
    val mb = getMethodBind("TileSet","tile_set_tile_mode")
    _icall_Unit_Long_Long( mb, this.ptr, id, tilemode)
  }

  open fun tileSetZIndex(id: Long, zIndex: Long) {
    val mb = getMethodBind("TileSet","tile_set_z_index")
    _icall_Unit_Long_Long( mb, this.ptr, id, zIndex)
  }

  enum class TileMode(
    id: Long
  ) {
    SINGLE_TILE(0),

    AUTO_TILE(1),

    ATLAS_TILE(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class AutotileBindings(
    id: Long
  ) {
    BIND_TOPLEFT(1),

    BIND_TOP(2),

    BIND_TOPRIGHT(4),

    BIND_LEFT(8),

    BIND_CENTER(16),

    BIND_RIGHT(32),

    BIND_BOTTOMLEFT(64),

    BIND_BOTTOM(128),

    BIND_BOTTOMRIGHT(256);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class BitmaskMode(
    id: Long
  ) {
    BITMASK_2X2(0),

    BITMASK_3X3_MINIMAL(1),

    BITMASK_3X3(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object
}
