@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class TileSet : Resource {
    constructor() : super("TileSet")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class TileMode(val id: Long) {
        SINGLE_TILE(0),
        AUTO_TILE(1),
        ANIMATED_TILE(2),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class AutotileBindings(val id: Long) {
        BIND_TOPLEFT(1),
        BIND_TOP(2),
        BIND_TOPRIGHT(4),
        BIND_LEFT(8),
        BIND_RIGHT(32),
        BIND_BOTTOMLEFT(64),
        BIND_BOTTOM(128),
        BIND_BOTTOMRIGHT(256),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class BitmaskMode(val id: Long) {
        BITMASK_2X2(0),
        BITMASK_3X3_MINIMAL(1),
        BITMASK_3X3(2),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }


    // Signals
    class Signal {
        companion object {
        }
    }


    companion object {
        infix fun from(other: Resource): TileSet = TileSet("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): TileSet = TileSet("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): TileSet = TileSet("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): TileSet = fromVariant(TileSet(""), other)


        // Constants
        const val BITMASK_2X2: Long = 0
        const val BITMASK_3X3_MINIMAL: Long = 1
        const val BITMASK_3X3: Long = 2
        const val BIND_TOPLEFT: Long = 1
        const val BIND_TOP: Long = 2
        const val BIND_TOPRIGHT: Long = 4
        const val BIND_LEFT: Long = 8
        const val BIND_RIGHT: Long = 32
        const val BIND_BOTTOMLEFT: Long = 64
        const val BIND_BOTTOM: Long = 128
        const val BIND_BOTTOMRIGHT: Long = 256
        const val SINGLE_TILE: Long = 0
        const val AUTO_TILE: Long = 1
        const val ANIMATED_TILE: Long = 2


    }


    // Properties


    // Methods
    open fun _is_tile_bound(drawnId: Long, neighborId: Long): Boolean {
        throw NotImplementedError("_is_tile_bound is not implemented for TileSet")
    }


    open fun _forward_subtile_selection(autotileId: Long, bitmask: Long, tilemap: Object, tileLocation: Vector2): Vector2 {
        throw NotImplementedError("_forward_subtile_selection is not implemented for TileSet")
    }


    private val createTileMethodBind: CPointer<godot_method_bind> by lazy { getMB("TileSet", "create_tile") }
    open fun createTile(id: Long) {
        _icall_Unit_Long(createTileMethodBind, this.rawMemory, id)
    }


    private val autotileSetBitmaskModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("TileSet", "autotile_set_bitmask_mode") }
    open fun autotileSetBitmaskMode(id: Long, mode: Long) {
        _icall_Unit_Long_Long(autotileSetBitmaskModeMethodBind, this.rawMemory, id, mode)
    }


    private val autotileGetBitmaskModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("TileSet", "autotile_get_bitmask_mode") }
    open fun autotileGetBitmaskMode(id: Long): TileSet.BitmaskMode {
        return TileSet.BitmaskMode.fromInt(_icall_Long_Long(autotileGetBitmaskModeMethodBind, this.rawMemory, id))
    }


    private val tileSetNameMethodBind: CPointer<godot_method_bind> by lazy { getMB("TileSet", "tile_set_name") }
    open fun tileSetName(id: Long, name: String) {
        _icall_Unit_Long_String(tileSetNameMethodBind, this.rawMemory, id, name)
    }


    private val tileGetNameMethodBind: CPointer<godot_method_bind> by lazy { getMB("TileSet", "tile_get_name") }
    open fun tileGetName(id: Long): String {
        return _icall_String_Long(tileGetNameMethodBind, this.rawMemory, id)
    }


    private val tileSetTextureMethodBind: CPointer<godot_method_bind> by lazy { getMB("TileSet", "tile_set_texture") }
    open fun tileSetTexture(id: Long, texture: Texture) {
        _icall_Unit_Long_Object(tileSetTextureMethodBind, this.rawMemory, id, texture)
    }


    private val tileGetTextureMethodBind: CPointer<godot_method_bind> by lazy { getMB("TileSet", "tile_get_texture") }
    open fun tileGetTexture(id: Long): Texture {
        return _icall_Texture_Long(tileGetTextureMethodBind, this.rawMemory, id)
    }


    private val tileSetNormalMapMethodBind: CPointer<godot_method_bind> by lazy { getMB("TileSet", "tile_set_normal_map") }
    open fun tileSetNormalMap(id: Long, normalMap: Texture) {
        _icall_Unit_Long_Object(tileSetNormalMapMethodBind, this.rawMemory, id, normalMap)
    }


    private val tileGetNormalMapMethodBind: CPointer<godot_method_bind> by lazy { getMB("TileSet", "tile_get_normal_map") }
    open fun tileGetNormalMap(id: Long): Texture {
        return _icall_Texture_Long(tileGetNormalMapMethodBind, this.rawMemory, id)
    }


    private val tileSetMaterialMethodBind: CPointer<godot_method_bind> by lazy { getMB("TileSet", "tile_set_material") }
    open fun tileSetMaterial(id: Long, material: ShaderMaterial) {
        _icall_Unit_Long_Object(tileSetMaterialMethodBind, this.rawMemory, id, material)
    }


    private val tileGetMaterialMethodBind: CPointer<godot_method_bind> by lazy { getMB("TileSet", "tile_get_material") }
    open fun tileGetMaterial(id: Long): ShaderMaterial {
        return _icall_ShaderMaterial_Long(tileGetMaterialMethodBind, this.rawMemory, id)
    }


    private val tileSetTextureOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("TileSet", "tile_set_texture_offset") }
    open fun tileSetTextureOffset(id: Long, textureOffset: Vector2) {
        _icall_Unit_Long_Vector2(tileSetTextureOffsetMethodBind, this.rawMemory, id, textureOffset)
    }


    private val tileGetTextureOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("TileSet", "tile_get_texture_offset") }
    open fun tileGetTextureOffset(id: Long): Vector2 {
        return _icall_Vector2_Long(tileGetTextureOffsetMethodBind, this.rawMemory, id)
    }


    private val tileSetRegionMethodBind: CPointer<godot_method_bind> by lazy { getMB("TileSet", "tile_set_region") }
    open fun tileSetRegion(id: Long, region: Rect2) {
        _icall_Unit_Long_Rect2(tileSetRegionMethodBind, this.rawMemory, id, region)
    }


    private val tileGetRegionMethodBind: CPointer<godot_method_bind> by lazy { getMB("TileSet", "tile_get_region") }
    open fun tileGetRegion(id: Long): Rect2 {
        return _icall_Rect2_Long(tileGetRegionMethodBind, this.rawMemory, id)
    }


    private val tileSetShapeMethodBind: CPointer<godot_method_bind> by lazy { getMB("TileSet", "tile_set_shape") }
    open fun tileSetShape(id: Long, shapeId: Long, shape: Shape2D) {
        _icall_Unit_Long_Long_Object(tileSetShapeMethodBind, this.rawMemory, id, shapeId, shape)
    }


    private val tileGetShapeMethodBind: CPointer<godot_method_bind> by lazy { getMB("TileSet", "tile_get_shape") }
    open fun tileGetShape(id: Long, shapeId: Long): Shape2D {
        return _icall_Shape2D_Long_Long(tileGetShapeMethodBind, this.rawMemory, id, shapeId)
    }


    private val tileSetShapeTransformMethodBind: CPointer<godot_method_bind> by lazy { getMB("TileSet", "tile_set_shape_transform") }
    open fun tileSetShapeTransform(id: Long, shapeId: Long, shapeTransform: Transform2D) {
        _icall_Unit_Long_Long_Transform2D(tileSetShapeTransformMethodBind, this.rawMemory, id, shapeId, shapeTransform)
    }


    private val tileGetShapeTransformMethodBind: CPointer<godot_method_bind> by lazy { getMB("TileSet", "tile_get_shape_transform") }
    open fun tileGetShapeTransform(id: Long, shapeId: Long): Transform2D {
        return _icall_Transform2D_Long_Long(tileGetShapeTransformMethodBind, this.rawMemory, id, shapeId)
    }


    private val tileSetShapeOneWayMethodBind: CPointer<godot_method_bind> by lazy { getMB("TileSet", "tile_set_shape_one_way") }
    open fun tileSetShapeOneWay(id: Long, shapeId: Long, oneWay: Boolean) {
        _icall_Unit_Long_Long_Boolean(tileSetShapeOneWayMethodBind, this.rawMemory, id, shapeId, oneWay)
    }


    private val tileGetShapeOneWayMethodBind: CPointer<godot_method_bind> by lazy { getMB("TileSet", "tile_get_shape_one_way") }
    open fun tileGetShapeOneWay(id: Long, shapeId: Long): Boolean {
        return _icall_Boolean_Long_Long(tileGetShapeOneWayMethodBind, this.rawMemory, id, shapeId)
    }


    private val tileAddShapeMethodBind: CPointer<godot_method_bind> by lazy { getMB("TileSet", "tile_add_shape") }
    open fun tileAddShape(id: Long, shape: Shape2D, shapeTransform: Transform2D, oneWay: Boolean = false, autotileCoord: Vector2 = Vector2(0, 0)) {
        _icall_Unit_Long_Object_Transform2D_Boolean_Vector2(tileAddShapeMethodBind, this.rawMemory, id, shape, shapeTransform, oneWay, autotileCoord)
    }


    private val tileGetShapeCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("TileSet", "tile_get_shape_count") }
    open fun tileGetShapeCount(id: Long): Long {
        return _icall_Long_Long(tileGetShapeCountMethodBind, this.rawMemory, id)
    }


    private val tileSetShapesMethodBind: CPointer<godot_method_bind> by lazy { getMB("TileSet", "tile_set_shapes") }
    open fun tileSetShapes(id: Long, shapes: GDArray) {
        _icall_Unit_Long_GDArray(tileSetShapesMethodBind, this.rawMemory, id, shapes)
    }


    private val tileGetShapesMethodBind: CPointer<godot_method_bind> by lazy { getMB("TileSet", "tile_get_shapes") }
    open fun tileGetShapes(id: Long): GDArray {
        return _icall_GDArray_Long(tileGetShapesMethodBind, this.rawMemory, id)
    }


    private val tileSetTileModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("TileSet", "tile_set_tile_mode") }
    open fun tileSetTileMode(id: Long, tilemode: Long) {
        _icall_Unit_Long_Long(tileSetTileModeMethodBind, this.rawMemory, id, tilemode)
    }


    private val tileGetTileModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("TileSet", "tile_get_tile_mode") }
    open fun tileGetTileMode(id: Long): TileSet.TileMode {
        return TileSet.TileMode.fromInt(_icall_Long_Long(tileGetTileModeMethodBind, this.rawMemory, id))
    }


    private val tileSetNavigationPolygonMethodBind: CPointer<godot_method_bind> by lazy { getMB("TileSet", "tile_set_navigation_polygon") }
    open fun tileSetNavigationPolygon(id: Long, navigationPolygon: NavigationPolygon) {
        _icall_Unit_Long_Object(tileSetNavigationPolygonMethodBind, this.rawMemory, id, navigationPolygon)
    }


    private val tileGetNavigationPolygonMethodBind: CPointer<godot_method_bind> by lazy { getMB("TileSet", "tile_get_navigation_polygon") }
    open fun tileGetNavigationPolygon(id: Long): NavigationPolygon {
        return _icall_NavigationPolygon_Long(tileGetNavigationPolygonMethodBind, this.rawMemory, id)
    }


    private val tileSetNavigationPolygonOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("TileSet", "tile_set_navigation_polygon_offset") }
    open fun tileSetNavigationPolygonOffset(id: Long, navigationPolygonOffset: Vector2) {
        _icall_Unit_Long_Vector2(tileSetNavigationPolygonOffsetMethodBind, this.rawMemory, id, navigationPolygonOffset)
    }


    private val tileGetNavigationPolygonOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("TileSet", "tile_get_navigation_polygon_offset") }
    open fun tileGetNavigationPolygonOffset(id: Long): Vector2 {
        return _icall_Vector2_Long(tileGetNavigationPolygonOffsetMethodBind, this.rawMemory, id)
    }


    private val tileSetLightOccluderMethodBind: CPointer<godot_method_bind> by lazy { getMB("TileSet", "tile_set_light_occluder") }
    open fun tileSetLightOccluder(id: Long, lightOccluder: OccluderPolygon2D) {
        _icall_Unit_Long_Object(tileSetLightOccluderMethodBind, this.rawMemory, id, lightOccluder)
    }


    private val tileGetLightOccluderMethodBind: CPointer<godot_method_bind> by lazy { getMB("TileSet", "tile_get_light_occluder") }
    open fun tileGetLightOccluder(id: Long): OccluderPolygon2D {
        return _icall_OccluderPolygon2D_Long(tileGetLightOccluderMethodBind, this.rawMemory, id)
    }


    private val tileSetOccluderOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("TileSet", "tile_set_occluder_offset") }
    open fun tileSetOccluderOffset(id: Long, occluderOffset: Vector2) {
        _icall_Unit_Long_Vector2(tileSetOccluderOffsetMethodBind, this.rawMemory, id, occluderOffset)
    }


    private val tileGetOccluderOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("TileSet", "tile_get_occluder_offset") }
    open fun tileGetOccluderOffset(id: Long): Vector2 {
        return _icall_Vector2_Long(tileGetOccluderOffsetMethodBind, this.rawMemory, id)
    }


    private val tileSetZIndexMethodBind: CPointer<godot_method_bind> by lazy { getMB("TileSet", "tile_set_z_index") }
    open fun tileSetZIndex(id: Long, zIndex: Long) {
        _icall_Unit_Long_Long(tileSetZIndexMethodBind, this.rawMemory, id, zIndex)
    }


    private val tileGetZIndexMethodBind: CPointer<godot_method_bind> by lazy { getMB("TileSet", "tile_get_z_index") }
    open fun tileGetZIndex(id: Long): Long {
        return _icall_Long_Long(tileGetZIndexMethodBind, this.rawMemory, id)
    }


    private val removeTileMethodBind: CPointer<godot_method_bind> by lazy { getMB("TileSet", "remove_tile") }
    open fun removeTile(id: Long) {
        _icall_Unit_Long(removeTileMethodBind, this.rawMemory, id)
    }


    private val clearMethodBind: CPointer<godot_method_bind> by lazy { getMB("TileSet", "clear") }
    open fun clear() {
        _icall_Unit(clearMethodBind, this.rawMemory)
    }


    private val getLastUnusedTileIdMethodBind: CPointer<godot_method_bind> by lazy { getMB("TileSet", "get_last_unused_tile_id") }
    open fun getLastUnusedTileId(): Long {
        return _icall_Long(getLastUnusedTileIdMethodBind, this.rawMemory)
    }


    private val findTileByNameMethodBind: CPointer<godot_method_bind> by lazy { getMB("TileSet", "find_tile_by_name") }
    open fun findTileByName(name: String): Long {
        return _icall_Long_String(findTileByNameMethodBind, this.rawMemory, name)
    }


    private val getTilesIdsMethodBind: CPointer<godot_method_bind> by lazy { getMB("TileSet", "get_tiles_ids") }
    open fun getTilesIds(): GDArray {
        return _icall_GDArray(getTilesIdsMethodBind, this.rawMemory)
    }


}
