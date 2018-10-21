@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class TileMap : Node2D {
    constructor() : super("TileMap")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class Mode(val id: Long) {
        MODE_SQUARE(0),
        MODE_ISOMETRIC(1),
        MODE_CUSTOM(2),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class TileOrigin(val id: Long) {
        TILE_ORIGIN_TOP_LEFT(0),
        TILE_ORIGIN_CENTER(1),
        TILE_ORIGIN_BOTTOM_LEFT(2),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class HalfOffset(val id: Long) {
        HALF_OFFSET_X(0),
        HALF_OFFSET_Y(1),
        HALF_OFFSET_DISABLED(2),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }


    // Signals
    class Signal {
        companion object {
            const val SETTINGS_CHANGED: String = "settings_changed"
        }
    }


    companion object {
        infix fun from(other: Node2D): TileMap = TileMap("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CanvasItem): TileMap = TileMap("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): TileMap = TileMap("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): TileMap = TileMap("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): TileMap = fromVariant(TileMap(""), other)


        // Constants
        const val INVALID_CELL: Long = -1
        const val MODE_SQUARE: Long = 0
        const val MODE_ISOMETRIC: Long = 1
        const val MODE_CUSTOM: Long = 2
        const val HALF_OFFSET_X: Long = 0
        const val HALF_OFFSET_Y: Long = 1
        const val HALF_OFFSET_DISABLED: Long = 2
        const val TILE_ORIGIN_TOP_LEFT: Long = 0
        const val TILE_ORIGIN_CENTER: Long = 1
        const val TILE_ORIGIN_BOTTOM_LEFT: Long = 2


    }


    // Properties
    open var mode: Long
        get() = _icall_Long(getModeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setModeMethodBind, this.rawMemory, value)


    open var tileSet: TileSet
        get() = _icall_TileSet(getTilesetMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setTilesetMethodBind, this.rawMemory, value)


    open var cellSize: Vector2
        get() = _icall_Vector2(getCellSizeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Vector2(setCellSizeMethodBind, this.rawMemory, value)
    open fun cellSize(shedule: (Vector2) -> Unit): Vector2 = cellSize.apply {
        shedule(this)
        cellSize = this
    }


    open var cellQuadrantSize: Long
        get() = _icall_Long(getQuadrantSizeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setQuadrantSizeMethodBind, this.rawMemory, value)


    open var cellCustomTransform: Transform2D
        get() = _icall_Transform2D(getCustomTransformMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Transform2D(setCustomTransformMethodBind, this.rawMemory, value)
    open fun cellCustomTransform(shedule: (Transform2D) -> Unit): Transform2D = cellCustomTransform.apply {
        shedule(this)
        cellCustomTransform = this
    }


    open var cellHalfOffset: Long
        get() = _icall_Long(getHalfOffsetMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setHalfOffsetMethodBind, this.rawMemory, value)


    open var cellTileOrigin: Long
        get() = _icall_Long(getTileOriginMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setTileOriginMethodBind, this.rawMemory, value)


    open var cellYSort: Boolean
        get() = _icall_Boolean(isYSortModeEnabledMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setYSortModeMethodBind, this.rawMemory, value)


    open var cellClipUv: Boolean
        get() = _icall_Boolean(getClipUvMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setClipUvMethodBind, this.rawMemory, value)


    open var collisionUseKinematic: Boolean
        get() = _icall_Boolean(getCollisionUseKinematicMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setCollisionUseKinematicMethodBind, this.rawMemory, value)


    open var collisionFriction: Double
        get() = _icall_Double(getCollisionFrictionMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setCollisionFrictionMethodBind, this.rawMemory, value)


    open var collisionBounce: Double
        get() = _icall_Double(getCollisionBounceMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setCollisionBounceMethodBind, this.rawMemory, value)


    open var collisionLayer: Long
        get() = _icall_Long(getCollisionLayerMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setCollisionLayerMethodBind, this.rawMemory, value)


    open var collisionMask: Long
        get() = _icall_Long(getCollisionMaskMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setCollisionMaskMethodBind, this.rawMemory, value)


    open var occluderLightMask: Long
        get() = _icall_Long(getOccluderLightMaskMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setOccluderLightMaskMethodBind, this.rawMemory, value)




    // Methods
    private val setTilesetMethodBind: CPointer<godot_method_bind> by lazy { getMB("TileMap", "set_tileset") }
    open fun setTileset(tileset: TileSet) {
        _icall_Unit_Object(setTilesetMethodBind, this.rawMemory, tileset)
    }


    private val getTilesetMethodBind: CPointer<godot_method_bind> by lazy { getMB("TileMap", "get_tileset") }
    open fun getTileset(): TileSet {
        return _icall_TileSet(getTilesetMethodBind, this.rawMemory)
    }


    private val setModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("TileMap", "set_mode") }
    open fun setMode(mode: Long) {
        _icall_Unit_Long(setModeMethodBind, this.rawMemory, mode)
    }


    private val getModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("TileMap", "get_mode") }
    open fun getMode(): TileMap.Mode {
        return TileMap.Mode.fromInt(_icall_Long(getModeMethodBind, this.rawMemory))
    }


    private val setHalfOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("TileMap", "set_half_offset") }
    open fun setHalfOffset(halfOffset: Long) {
        _icall_Unit_Long(setHalfOffsetMethodBind, this.rawMemory, halfOffset)
    }


    private val getHalfOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("TileMap", "get_half_offset") }
    open fun getHalfOffset(): TileMap.HalfOffset {
        return TileMap.HalfOffset.fromInt(_icall_Long(getHalfOffsetMethodBind, this.rawMemory))
    }


    private val setCustomTransformMethodBind: CPointer<godot_method_bind> by lazy { getMB("TileMap", "set_custom_transform") }
    open fun setCustomTransform(customTransform: Transform2D) {
        _icall_Unit_Transform2D(setCustomTransformMethodBind, this.rawMemory, customTransform)
    }


    private val getCustomTransformMethodBind: CPointer<godot_method_bind> by lazy { getMB("TileMap", "get_custom_transform") }
    open fun getCustomTransform(): Transform2D {
        return _icall_Transform2D(getCustomTransformMethodBind, this.rawMemory)
    }


    private val setCellSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("TileMap", "set_cell_size") }
    open fun setCellSize(size: Vector2) {
        _icall_Unit_Vector2(setCellSizeMethodBind, this.rawMemory, size)
    }


    private val getCellSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("TileMap", "get_cell_size") }
    open fun getCellSize(): Vector2 {
        return _icall_Vector2(getCellSizeMethodBind, this.rawMemory)
    }


    open fun _set_old_cell_size(size: Long) {
    }


    open fun _get_old_cell_size(): Long {
        throw NotImplementedError("_get_old_cell_size is not implemented for TileMap")
    }


    private val setQuadrantSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("TileMap", "set_quadrant_size") }
    open fun setQuadrantSize(size: Long) {
        _icall_Unit_Long(setQuadrantSizeMethodBind, this.rawMemory, size)
    }


    private val getQuadrantSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("TileMap", "get_quadrant_size") }
    open fun getQuadrantSize(): Long {
        return _icall_Long(getQuadrantSizeMethodBind, this.rawMemory)
    }


    private val setTileOriginMethodBind: CPointer<godot_method_bind> by lazy { getMB("TileMap", "set_tile_origin") }
    open fun setTileOrigin(origin: Long) {
        _icall_Unit_Long(setTileOriginMethodBind, this.rawMemory, origin)
    }


    private val getTileOriginMethodBind: CPointer<godot_method_bind> by lazy { getMB("TileMap", "get_tile_origin") }
    open fun getTileOrigin(): TileMap.TileOrigin {
        return TileMap.TileOrigin.fromInt(_icall_Long(getTileOriginMethodBind, this.rawMemory))
    }


    private val setClipUvMethodBind: CPointer<godot_method_bind> by lazy { getMB("TileMap", "set_clip_uv") }
    open fun setClipUv(enable: Boolean) {
        _icall_Unit_Boolean(setClipUvMethodBind, this.rawMemory, enable)
    }


    private val getClipUvMethodBind: CPointer<godot_method_bind> by lazy { getMB("TileMap", "get_clip_uv") }
    open fun getClipUv(): Boolean {
        return _icall_Boolean(getClipUvMethodBind, this.rawMemory)
    }


    private val setYSortModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("TileMap", "set_y_sort_mode") }
    open fun setYSortMode(enable: Boolean) {
        _icall_Unit_Boolean(setYSortModeMethodBind, this.rawMemory, enable)
    }


    private val isYSortModeEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("TileMap", "is_y_sort_mode_enabled") }
    open fun isYSortModeEnabled(): Boolean {
        return _icall_Boolean(isYSortModeEnabledMethodBind, this.rawMemory)
    }


    private val setCollisionUseKinematicMethodBind: CPointer<godot_method_bind> by lazy { getMB("TileMap", "set_collision_use_kinematic") }
    open fun setCollisionUseKinematic(useKinematic: Boolean) {
        _icall_Unit_Boolean(setCollisionUseKinematicMethodBind, this.rawMemory, useKinematic)
    }


    private val getCollisionUseKinematicMethodBind: CPointer<godot_method_bind> by lazy { getMB("TileMap", "get_collision_use_kinematic") }
    open fun getCollisionUseKinematic(): Boolean {
        return _icall_Boolean(getCollisionUseKinematicMethodBind, this.rawMemory)
    }


    private val setCollisionLayerMethodBind: CPointer<godot_method_bind> by lazy { getMB("TileMap", "set_collision_layer") }
    open fun setCollisionLayer(layer: Long) {
        _icall_Unit_Long(setCollisionLayerMethodBind, this.rawMemory, layer)
    }


    private val getCollisionLayerMethodBind: CPointer<godot_method_bind> by lazy { getMB("TileMap", "get_collision_layer") }
    open fun getCollisionLayer(): Long {
        return _icall_Long(getCollisionLayerMethodBind, this.rawMemory)
    }


    private val setCollisionMaskMethodBind: CPointer<godot_method_bind> by lazy { getMB("TileMap", "set_collision_mask") }
    open fun setCollisionMask(mask: Long) {
        _icall_Unit_Long(setCollisionMaskMethodBind, this.rawMemory, mask)
    }


    private val getCollisionMaskMethodBind: CPointer<godot_method_bind> by lazy { getMB("TileMap", "get_collision_mask") }
    open fun getCollisionMask(): Long {
        return _icall_Long(getCollisionMaskMethodBind, this.rawMemory)
    }


    private val setCollisionLayerBitMethodBind: CPointer<godot_method_bind> by lazy { getMB("TileMap", "set_collision_layer_bit") }
    open fun setCollisionLayerBit(bit: Long, value: Boolean) {
        _icall_Unit_Long_Boolean(setCollisionLayerBitMethodBind, this.rawMemory, bit, value)
    }


    private val getCollisionLayerBitMethodBind: CPointer<godot_method_bind> by lazy { getMB("TileMap", "get_collision_layer_bit") }
    open fun getCollisionLayerBit(bit: Long): Boolean {
        return _icall_Boolean_Long(getCollisionLayerBitMethodBind, this.rawMemory, bit)
    }


    private val setCollisionMaskBitMethodBind: CPointer<godot_method_bind> by lazy { getMB("TileMap", "set_collision_mask_bit") }
    open fun setCollisionMaskBit(bit: Long, value: Boolean) {
        _icall_Unit_Long_Boolean(setCollisionMaskBitMethodBind, this.rawMemory, bit, value)
    }


    private val getCollisionMaskBitMethodBind: CPointer<godot_method_bind> by lazy { getMB("TileMap", "get_collision_mask_bit") }
    open fun getCollisionMaskBit(bit: Long): Boolean {
        return _icall_Boolean_Long(getCollisionMaskBitMethodBind, this.rawMemory, bit)
    }


    private val setCollisionFrictionMethodBind: CPointer<godot_method_bind> by lazy { getMB("TileMap", "set_collision_friction") }
    open fun setCollisionFriction(value: Double) {
        _icall_Unit_Double(setCollisionFrictionMethodBind, this.rawMemory, value)
    }


    private val getCollisionFrictionMethodBind: CPointer<godot_method_bind> by lazy { getMB("TileMap", "get_collision_friction") }
    open fun getCollisionFriction(): Double {
        return _icall_Double(getCollisionFrictionMethodBind, this.rawMemory)
    }


    private val setCollisionBounceMethodBind: CPointer<godot_method_bind> by lazy { getMB("TileMap", "set_collision_bounce") }
    open fun setCollisionBounce(value: Double) {
        _icall_Unit_Double(setCollisionBounceMethodBind, this.rawMemory, value)
    }


    private val getCollisionBounceMethodBind: CPointer<godot_method_bind> by lazy { getMB("TileMap", "get_collision_bounce") }
    open fun getCollisionBounce(): Double {
        return _icall_Double(getCollisionBounceMethodBind, this.rawMemory)
    }


    private val setOccluderLightMaskMethodBind: CPointer<godot_method_bind> by lazy { getMB("TileMap", "set_occluder_light_mask") }
    open fun setOccluderLightMask(mask: Long) {
        _icall_Unit_Long(setOccluderLightMaskMethodBind, this.rawMemory, mask)
    }


    private val getOccluderLightMaskMethodBind: CPointer<godot_method_bind> by lazy { getMB("TileMap", "get_occluder_light_mask") }
    open fun getOccluderLightMask(): Long {
        return _icall_Long(getOccluderLightMaskMethodBind, this.rawMemory)
    }


    private val setCellMethodBind: CPointer<godot_method_bind> by lazy { getMB("TileMap", "set_cell") }
    open fun setCell(x: Long, y: Long, tile: Long, flipX: Boolean = false, flipY: Boolean = false, transpose: Boolean = false, autotileCoord: Vector2 = Vector2(0, 0)) {
        _icall_Unit_Long_Long_Long_Boolean_Boolean_Boolean_Vector2(setCellMethodBind, this.rawMemory, x, y, tile, flipX, flipY, transpose, autotileCoord)
    }


    private val setCellvMethodBind: CPointer<godot_method_bind> by lazy { getMB("TileMap", "set_cellv") }
    open fun setCellv(position: Vector2, tile: Long, flipX: Boolean = false, flipY: Boolean = false, transpose: Boolean = false) {
        _icall_Unit_Vector2_Long_Boolean_Boolean_Boolean(setCellvMethodBind, this.rawMemory, position, tile, flipX, flipY, transpose)
    }


    private val setCelldMethodBind: CPointer<godot_method_bind> by lazy { getMB("TileMap", "set_celld") }
    open fun setCelld(data: Vector2, arg1: Dictionary) {
        _icall_Unit_Vector2_Dictionary(setCelldMethodBind, this.rawMemory, data, arg1)
    }


    private val getCellMethodBind: CPointer<godot_method_bind> by lazy { getMB("TileMap", "get_cell") }
    open fun getCell(x: Long, y: Long): Long {
        return _icall_Long_Long_Long(getCellMethodBind, this.rawMemory, x, y)
    }


    private val getCellvMethodBind: CPointer<godot_method_bind> by lazy { getMB("TileMap", "get_cellv") }
    open fun getCellv(position: Vector2): Long {
        return _icall_Long_Vector2(getCellvMethodBind, this.rawMemory, position)
    }


    private val isCellXFlippedMethodBind: CPointer<godot_method_bind> by lazy { getMB("TileMap", "is_cell_x_flipped") }
    open fun isCellXFlipped(x: Long, y: Long): Boolean {
        return _icall_Boolean_Long_Long(isCellXFlippedMethodBind, this.rawMemory, x, y)
    }


    private val isCellYFlippedMethodBind: CPointer<godot_method_bind> by lazy { getMB("TileMap", "is_cell_y_flipped") }
    open fun isCellYFlipped(x: Long, y: Long): Boolean {
        return _icall_Boolean_Long_Long(isCellYFlippedMethodBind, this.rawMemory, x, y)
    }


    private val isCellTransposedMethodBind: CPointer<godot_method_bind> by lazy { getMB("TileMap", "is_cell_transposed") }
    open fun isCellTransposed(x: Long, y: Long): Boolean {
        return _icall_Boolean_Long_Long(isCellTransposedMethodBind, this.rawMemory, x, y)
    }


    private val fixInvalidTilesMethodBind: CPointer<godot_method_bind> by lazy { getMB("TileMap", "fix_invalid_tiles") }
    open fun fixInvalidTiles() {
        _icall_Unit(fixInvalidTilesMethodBind, this.rawMemory)
    }


    private val clearMethodBind: CPointer<godot_method_bind> by lazy { getMB("TileMap", "clear") }
    open fun clear() {
        _icall_Unit(clearMethodBind, this.rawMemory)
    }


    private val getUsedCellsMethodBind: CPointer<godot_method_bind> by lazy { getMB("TileMap", "get_used_cells") }
    open fun getUsedCells(): GDArray {
        return _icall_GDArray(getUsedCellsMethodBind, this.rawMemory)
    }


    private val getUsedCellsByIdMethodBind: CPointer<godot_method_bind> by lazy { getMB("TileMap", "get_used_cells_by_id") }
    open fun getUsedCellsById(id: Long): GDArray {
        return _icall_GDArray_Long(getUsedCellsByIdMethodBind, this.rawMemory, id)
    }


    private val getUsedRectMethodBind: CPointer<godot_method_bind> by lazy { getMB("TileMap", "get_used_rect") }
    open fun getUsedRect(): Rect2 {
        return _icall_Rect2(getUsedRectMethodBind, this.rawMemory)
    }


    private val mapToWorldMethodBind: CPointer<godot_method_bind> by lazy { getMB("TileMap", "map_to_world") }
    open fun mapToWorld(mapPosition: Vector2, ignoreHalfOfs: Boolean = false): Vector2 {
        return _icall_Vector2_Vector2_Boolean(mapToWorldMethodBind, this.rawMemory, mapPosition, ignoreHalfOfs)
    }


    private val worldToMapMethodBind: CPointer<godot_method_bind> by lazy { getMB("TileMap", "world_to_map") }
    open fun worldToMap(worldPosition: Vector2): Vector2 {
        return _icall_Vector2_Vector2(worldToMapMethodBind, this.rawMemory, worldPosition)
    }


    open fun _clear_quadrants() {
    }


    open fun _recreate_quadrants() {
    }


    open fun _update_dirty_quadrants() {
    }


    private val updateBitmaskAreaMethodBind: CPointer<godot_method_bind> by lazy { getMB("TileMap", "update_bitmask_area") }
    open fun updateBitmaskArea(position: Vector2) {
        _icall_Unit_Vector2(updateBitmaskAreaMethodBind, this.rawMemory, position)
    }


    private val updateBitmaskRegionMethodBind: CPointer<godot_method_bind> by lazy { getMB("TileMap", "update_bitmask_region") }
    open fun updateBitmaskRegion(start: Vector2 = Vector2(0, 0), end: Vector2 = Vector2(0, 0)) {
        _icall_Unit_Vector2_Vector2(updateBitmaskRegionMethodBind, this.rawMemory, start, end)
    }


    open fun _set_tile_data(arg0: PoolIntArray) {
    }


    open fun _get_tile_data(): PoolIntArray {
        throw NotImplementedError("_get_tile_data is not implemented for TileMap")
    }


}
