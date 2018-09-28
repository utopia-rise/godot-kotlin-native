@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class GridMap : Spatial {
    constructor() : super("GridMap")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 



    // Signals
    class Signal {
        companion object {
        }
    }


    companion object {
        infix fun from(other: Spatial): GridMap = GridMap("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): GridMap = GridMap("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): GridMap = GridMap("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): GridMap = fromVariant(GridMap(""), other)


        // Constants
        const val INVALID_CELL_ITEM: Int = -1


    }


    // Properties
    open var theme: MeshLibrary
        get() = _icall_MeshLibrary(getThemeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setThemeMethodBind, this.rawMemory, value)


    open var cellSize: Vector3
        get() = _icall_Vector3(getCellSizeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Vector3(setCellSizeMethodBind, this.rawMemory, value)
    open fun cellSize(shedule: (Vector3) -> Unit): Vector3 = cellSize.apply {
        shedule(this)
        cellSize = this
    }


    open var cellOctantSize: Int
        get() = _icall_Int(getOctantSizeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setOctantSizeMethodBind, this.rawMemory, value)


    open var cellCenterX: Boolean
        get() = _icall_Boolean(getCenterXMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setCenterXMethodBind, this.rawMemory, value)


    open var cellCenterY: Boolean
        get() = _icall_Boolean(getCenterYMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setCenterYMethodBind, this.rawMemory, value)


    open var cellCenterZ: Boolean
        get() = _icall_Boolean(getCenterZMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setCenterZMethodBind, this.rawMemory, value)


    open var cellScale: Float
        get() = _icall_Float(getCellScaleMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setCellScaleMethodBind, this.rawMemory, value)


    open var collisionLayer: Int
        get() = _icall_Int(getCollisionLayerMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setCollisionLayerMethodBind, this.rawMemory, value)


    open var collisionMask: Int
        get() = _icall_Int(getCollisionMaskMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setCollisionMaskMethodBind, this.rawMemory, value)




    // Methods
    private val setCollisionLayerMethodBind: CPointer<godot_method_bind> by lazy { getMB("GridMap", "set_collision_layer") }
    open fun setCollisionLayer(layer: Int) {
        _icall_Unit_Int(setCollisionLayerMethodBind, this.rawMemory, layer)
    }


    private val getCollisionLayerMethodBind: CPointer<godot_method_bind> by lazy { getMB("GridMap", "get_collision_layer") }
    open fun getCollisionLayer(): Int {
        return _icall_Int(getCollisionLayerMethodBind, this.rawMemory)
    }


    private val setCollisionMaskMethodBind: CPointer<godot_method_bind> by lazy { getMB("GridMap", "set_collision_mask") }
    open fun setCollisionMask(mask: Int) {
        _icall_Unit_Int(setCollisionMaskMethodBind, this.rawMemory, mask)
    }


    private val getCollisionMaskMethodBind: CPointer<godot_method_bind> by lazy { getMB("GridMap", "get_collision_mask") }
    open fun getCollisionMask(): Int {
        return _icall_Int(getCollisionMaskMethodBind, this.rawMemory)
    }


    private val setCollisionMaskBitMethodBind: CPointer<godot_method_bind> by lazy { getMB("GridMap", "set_collision_mask_bit") }
    open fun setCollisionMaskBit(bit: Int, value: Boolean) {
        _icall_Unit_Int_Boolean(setCollisionMaskBitMethodBind, this.rawMemory, bit, value)
    }


    private val getCollisionMaskBitMethodBind: CPointer<godot_method_bind> by lazy { getMB("GridMap", "get_collision_mask_bit") }
    open fun getCollisionMaskBit(bit: Int): Boolean {
        return _icall_Boolean_Int(getCollisionMaskBitMethodBind, this.rawMemory, bit)
    }


    private val setCollisionLayerBitMethodBind: CPointer<godot_method_bind> by lazy { getMB("GridMap", "set_collision_layer_bit") }
    open fun setCollisionLayerBit(bit: Int, value: Boolean) {
        _icall_Unit_Int_Boolean(setCollisionLayerBitMethodBind, this.rawMemory, bit, value)
    }


    private val getCollisionLayerBitMethodBind: CPointer<godot_method_bind> by lazy { getMB("GridMap", "get_collision_layer_bit") }
    open fun getCollisionLayerBit(bit: Int): Boolean {
        return _icall_Boolean_Int(getCollisionLayerBitMethodBind, this.rawMemory, bit)
    }


    private val setThemeMethodBind: CPointer<godot_method_bind> by lazy { getMB("GridMap", "set_theme") }
    open fun setTheme(theme: MeshLibrary) {
        _icall_Unit_Object(setThemeMethodBind, this.rawMemory, theme)
    }


    private val getThemeMethodBind: CPointer<godot_method_bind> by lazy { getMB("GridMap", "get_theme") }
    open fun getTheme(): MeshLibrary {
        return _icall_MeshLibrary(getThemeMethodBind, this.rawMemory)
    }


    private val setCellSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("GridMap", "set_cell_size") }
    open fun setCellSize(size: Vector3) {
        _icall_Unit_Vector3(setCellSizeMethodBind, this.rawMemory, size)
    }


    private val getCellSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("GridMap", "get_cell_size") }
    open fun getCellSize(): Vector3 {
        return _icall_Vector3(getCellSizeMethodBind, this.rawMemory)
    }


    private val setCellScaleMethodBind: CPointer<godot_method_bind> by lazy { getMB("GridMap", "set_cell_scale") }
    open fun setCellScale(scale: Float) {
        _icall_Unit_Float(setCellScaleMethodBind, this.rawMemory, scale)
    }


    private val getCellScaleMethodBind: CPointer<godot_method_bind> by lazy { getMB("GridMap", "get_cell_scale") }
    open fun getCellScale(): Float {
        return _icall_Float(getCellScaleMethodBind, this.rawMemory)
    }


    private val setOctantSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("GridMap", "set_octant_size") }
    open fun setOctantSize(size: Int) {
        _icall_Unit_Int(setOctantSizeMethodBind, this.rawMemory, size)
    }


    private val getOctantSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("GridMap", "get_octant_size") }
    open fun getOctantSize(): Int {
        return _icall_Int(getOctantSizeMethodBind, this.rawMemory)
    }


    private val setCellItemMethodBind: CPointer<godot_method_bind> by lazy { getMB("GridMap", "set_cell_item") }
    open fun setCellItem(x: Int, y: Int, z: Int, item: Int, orientation: Int = 0) {
        _icall_Unit_Int_Int_Int_Int_Int(setCellItemMethodBind, this.rawMemory, x, y, z, item, orientation)
    }


    private val getCellItemMethodBind: CPointer<godot_method_bind> by lazy { getMB("GridMap", "get_cell_item") }
    open fun getCellItem(x: Int, y: Int, z: Int): Int {
        return _icall_Int_Int_Int_Int(getCellItemMethodBind, this.rawMemory, x, y, z)
    }


    private val getCellItemOrientationMethodBind: CPointer<godot_method_bind> by lazy { getMB("GridMap", "get_cell_item_orientation") }
    open fun getCellItemOrientation(x: Int, y: Int, z: Int): Int {
        return _icall_Int_Int_Int_Int(getCellItemOrientationMethodBind, this.rawMemory, x, y, z)
    }


    private val worldToMapMethodBind: CPointer<godot_method_bind> by lazy { getMB("GridMap", "world_to_map") }
    open fun worldToMap(pos: Vector3): Vector3 {
        return _icall_Vector3_Vector3(worldToMapMethodBind, this.rawMemory, pos)
    }


    private val mapToWorldMethodBind: CPointer<godot_method_bind> by lazy { getMB("GridMap", "map_to_world") }
    open fun mapToWorld(x: Int, y: Int, z: Int): Vector3 {
        return _icall_Vector3_Int_Int_Int(mapToWorldMethodBind, this.rawMemory, x, y, z)
    }


    open fun _update_octants_callback() {
    }


    private val resourceChangedMethodBind: CPointer<godot_method_bind> by lazy { getMB("GridMap", "resource_changed") }
    open fun resourceChanged(resource: Resource) {
        _icall_Unit_Object(resourceChangedMethodBind, this.rawMemory, resource)
    }


    private val setCenterXMethodBind: CPointer<godot_method_bind> by lazy { getMB("GridMap", "set_center_x") }
    open fun setCenterX(enable: Boolean) {
        _icall_Unit_Boolean(setCenterXMethodBind, this.rawMemory, enable)
    }


    private val getCenterXMethodBind: CPointer<godot_method_bind> by lazy { getMB("GridMap", "get_center_x") }
    open fun getCenterX(): Boolean {
        return _icall_Boolean(getCenterXMethodBind, this.rawMemory)
    }


    private val setCenterYMethodBind: CPointer<godot_method_bind> by lazy { getMB("GridMap", "set_center_y") }
    open fun setCenterY(enable: Boolean) {
        _icall_Unit_Boolean(setCenterYMethodBind, this.rawMemory, enable)
    }


    private val getCenterYMethodBind: CPointer<godot_method_bind> by lazy { getMB("GridMap", "get_center_y") }
    open fun getCenterY(): Boolean {
        return _icall_Boolean(getCenterYMethodBind, this.rawMemory)
    }


    private val setCenterZMethodBind: CPointer<godot_method_bind> by lazy { getMB("GridMap", "set_center_z") }
    open fun setCenterZ(enable: Boolean) {
        _icall_Unit_Boolean(setCenterZMethodBind, this.rawMemory, enable)
    }


    private val getCenterZMethodBind: CPointer<godot_method_bind> by lazy { getMB("GridMap", "get_center_z") }
    open fun getCenterZ(): Boolean {
        return _icall_Boolean(getCenterZMethodBind, this.rawMemory)
    }


    private val setClipMethodBind: CPointer<godot_method_bind> by lazy { getMB("GridMap", "set_clip") }
    open fun setClip(enabled: Boolean, clipabove: Boolean = true, floor: Int = 0, axis: Int = 0) {
        _icall_Unit_Boolean_Boolean_Int_Int(setClipMethodBind, this.rawMemory, enabled, clipabove, floor, axis)
    }


    private val clearMethodBind: CPointer<godot_method_bind> by lazy { getMB("GridMap", "clear") }
    open fun clear() {
        _icall_Unit(clearMethodBind, this.rawMemory)
    }


    private val getUsedCellsMethodBind: CPointer<godot_method_bind> by lazy { getMB("GridMap", "get_used_cells") }
    open fun getUsedCells(): GDArray {
        return _icall_GDArray(getUsedCellsMethodBind, this.rawMemory)
    }


    private val getMeshesMethodBind: CPointer<godot_method_bind> by lazy { getMB("GridMap", "get_meshes") }
    open fun getMeshes(): GDArray {
        return _icall_GDArray(getMeshesMethodBind, this.rawMemory)
    }


    private val getBakeMeshesMethodBind: CPointer<godot_method_bind> by lazy { getMB("GridMap", "get_bake_meshes") }
    open fun getBakeMeshes(): GDArray {
        return _icall_GDArray(getBakeMeshesMethodBind, this.rawMemory)
    }


    private val getBakeMeshInstanceMethodBind: CPointer<godot_method_bind> by lazy { getMB("GridMap", "get_bake_mesh_instance") }
    open fun getBakeMeshInstance(idx: Int): RID {
        return _icall_RID_Int(getBakeMeshInstanceMethodBind, this.rawMemory, idx)
    }


    private val clearBakedMeshesMethodBind: CPointer<godot_method_bind> by lazy { getMB("GridMap", "clear_baked_meshes") }
    open fun clearBakedMeshes() {
        _icall_Unit(clearBakedMeshesMethodBind, this.rawMemory)
    }


    private val makeBakedMeshesMethodBind: CPointer<godot_method_bind> by lazy { getMB("GridMap", "make_baked_meshes") }
    open fun makeBakedMeshes(genLightmapUv: Boolean = false, lightmapUvTexelSize: Float = 0.1f) {
        _icall_Unit_Boolean_Float(makeBakedMeshesMethodBind, this.rawMemory, genLightmapUv, lightmapUvTexelSize)
    }


}
