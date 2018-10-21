@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class ArrayMesh : Mesh {
    constructor() : super("ArrayMesh")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class ArrayFormat(val id: Long) {
        ARRAY_FORMAT_VERTEX(1),
        ARRAY_FORMAT_NORMAL(2),
        ARRAY_FORMAT_TANGENT(4),
        ARRAY_FORMAT_COLOR(8),
        ARRAY_FORMAT_TEX_UV(16),
        ARRAY_FORMAT_TEX_UV2(32),
        ARRAY_FORMAT_BONES(64),
        ARRAY_FORMAT_WEIGHTS(128),
        ARRAY_FORMAT_INDEX(256),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class ArrayType(val id: Long) {
        ARRAY_VERTEX(0),
        ARRAY_NORMAL(1),
        ARRAY_TANGENT(2),
        ARRAY_COLOR(3),
        ARRAY_TEX_UV(4),
        ARRAY_TEX_UV2(5),
        ARRAY_BONES(6),
        ARRAY_WEIGHTS(7),
        ARRAY_INDEX(8),
        ARRAY_MAX(9),
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
        infix fun from(other: Mesh): ArrayMesh = ArrayMesh("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): ArrayMesh = ArrayMesh("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): ArrayMesh = ArrayMesh("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): ArrayMesh = ArrayMesh("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): ArrayMesh = fromVariant(ArrayMesh(""), other)


        // Constants
        const val NO_INDEX_ARRAY: Long = -1
        const val ARRAY_WEIGHTS_SIZE: Long = 4
        const val ARRAY_VERTEX: Long = 0
        const val ARRAY_NORMAL: Long = 1
        const val ARRAY_TANGENT: Long = 2
        const val ARRAY_COLOR: Long = 3
        const val ARRAY_TEX_UV: Long = 4
        const val ARRAY_TEX_UV2: Long = 5
        const val ARRAY_BONES: Long = 6
        const val ARRAY_WEIGHTS: Long = 7
        const val ARRAY_INDEX: Long = 8
        const val ARRAY_MAX: Long = 9
        const val ARRAY_FORMAT_VERTEX: Long = 1
        const val ARRAY_FORMAT_NORMAL: Long = 2
        const val ARRAY_FORMAT_TANGENT: Long = 4
        const val ARRAY_FORMAT_COLOR: Long = 8
        const val ARRAY_FORMAT_TEX_UV: Long = 16
        const val ARRAY_FORMAT_TEX_UV2: Long = 32
        const val ARRAY_FORMAT_BONES: Long = 64
        const val ARRAY_FORMAT_WEIGHTS: Long = 128
        const val ARRAY_FORMAT_INDEX: Long = 256


    }


    // Properties
    open var blendShapeMode: Long
        get() = _icall_Long(getBlendShapeModeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setBlendShapeModeMethodBind, this.rawMemory, value)


    open var customAabb: AABB
        get() = _icall_AABB(getCustomAabbMethodBind, this.rawMemory)
        set(value) = _icall_Unit_AABB(setCustomAabbMethodBind, this.rawMemory, value)
    open fun customAabb(shedule: (AABB) -> Unit): AABB = customAabb.apply {
        shedule(this)
        customAabb = this
    }




    // Methods
    private val addBlendShapeMethodBind: CPointer<godot_method_bind> by lazy { getMB("ArrayMesh", "add_blend_shape") }
    open fun addBlendShape(name: String) {
        _icall_Unit_String(addBlendShapeMethodBind, this.rawMemory, name)
    }


    private val getBlendShapeCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("ArrayMesh", "get_blend_shape_count") }
    open fun getBlendShapeCount(): Long {
        return _icall_Long(getBlendShapeCountMethodBind, this.rawMemory)
    }


    private val getBlendShapeNameMethodBind: CPointer<godot_method_bind> by lazy { getMB("ArrayMesh", "get_blend_shape_name") }
    open fun getBlendShapeName(index: Long): String {
        return _icall_String_Long(getBlendShapeNameMethodBind, this.rawMemory, index)
    }


    private val clearBlendShapesMethodBind: CPointer<godot_method_bind> by lazy { getMB("ArrayMesh", "clear_blend_shapes") }
    open fun clearBlendShapes() {
        _icall_Unit(clearBlendShapesMethodBind, this.rawMemory)
    }


    private val setBlendShapeModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("ArrayMesh", "set_blend_shape_mode") }
    open fun setBlendShapeMode(mode: Long) {
        _icall_Unit_Long(setBlendShapeModeMethodBind, this.rawMemory, mode)
    }


    private val getBlendShapeModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("ArrayMesh", "get_blend_shape_mode") }
    open fun getBlendShapeMode(): Mesh.BlendShapeMode {
        return Mesh.BlendShapeMode.fromInt(_icall_Long(getBlendShapeModeMethodBind, this.rawMemory))
    }


    private val addSurfaceFromArraysMethodBind: CPointer<godot_method_bind> by lazy { getMB("ArrayMesh", "add_surface_from_arrays") }
    open fun addSurfaceFromArrays(primitive: Long, arrays: GDArray, blendShapes: GDArray = GDArray(), compressFlags: Long = 97280) {
        _icall_Unit_Long_GDArray_GDArray_Long(addSurfaceFromArraysMethodBind, this.rawMemory, primitive, arrays, blendShapes, compressFlags)
    }


    private val getSurfaceCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("ArrayMesh", "get_surface_count") }
    open fun getSurfaceCount(): Long {
        return _icall_Long(getSurfaceCountMethodBind, this.rawMemory)
    }


    private val surfaceRemoveMethodBind: CPointer<godot_method_bind> by lazy { getMB("ArrayMesh", "surface_remove") }
    open fun surfaceRemove(surfIdx: Long) {
        _icall_Unit_Long(surfaceRemoveMethodBind, this.rawMemory, surfIdx)
    }


    private val surfaceUpdateRegionMethodBind: CPointer<godot_method_bind> by lazy { getMB("ArrayMesh", "surface_update_region") }
    open fun surfaceUpdateRegion(surfIdx: Long, offset: Long, data: PoolByteArray) {
        _icall_Unit_Long_Long_PoolByteArray(surfaceUpdateRegionMethodBind, this.rawMemory, surfIdx, offset, data)
    }


    private val surfaceGetArrayLenMethodBind: CPointer<godot_method_bind> by lazy { getMB("ArrayMesh", "surface_get_array_len") }
    open fun surfaceGetArrayLen(surfIdx: Long): Long {
        return _icall_Long_Long(surfaceGetArrayLenMethodBind, this.rawMemory, surfIdx)
    }


    private val surfaceGetArrayIndexLenMethodBind: CPointer<godot_method_bind> by lazy { getMB("ArrayMesh", "surface_get_array_index_len") }
    open fun surfaceGetArrayIndexLen(surfIdx: Long): Long {
        return _icall_Long_Long(surfaceGetArrayIndexLenMethodBind, this.rawMemory, surfIdx)
    }


    private val surfaceGetFormatMethodBind: CPointer<godot_method_bind> by lazy { getMB("ArrayMesh", "surface_get_format") }
    open fun surfaceGetFormat(surfIdx: Long): Long {
        return _icall_Long_Long(surfaceGetFormatMethodBind, this.rawMemory, surfIdx)
    }


    private val surfaceGetPrimitiveTypeMethodBind: CPointer<godot_method_bind> by lazy { getMB("ArrayMesh", "surface_get_primitive_type") }
    open fun surfaceGetPrimitiveType(surfIdx: Long): Mesh.PrimitiveType {
        return Mesh.PrimitiveType.fromInt(_icall_Long_Long(surfaceGetPrimitiveTypeMethodBind, this.rawMemory, surfIdx))
    }


    private val surfaceSetMaterialMethodBind: CPointer<godot_method_bind> by lazy { getMB("ArrayMesh", "surface_set_material") }
    open fun surfaceSetMaterial(surfIdx: Long, material: Material) {
        _icall_Unit_Long_Object(surfaceSetMaterialMethodBind, this.rawMemory, surfIdx, material)
    }


    private val surfaceGetMaterialMethodBind: CPointer<godot_method_bind> by lazy { getMB("ArrayMesh", "surface_get_material") }
    open fun surfaceGetMaterial(surfIdx: Long): Material {
        return _icall_Material_Long(surfaceGetMaterialMethodBind, this.rawMemory, surfIdx)
    }


    private val surfaceSetNameMethodBind: CPointer<godot_method_bind> by lazy { getMB("ArrayMesh", "surface_set_name") }
    open fun surfaceSetName(surfIdx: Long, name: String) {
        _icall_Unit_Long_String(surfaceSetNameMethodBind, this.rawMemory, surfIdx, name)
    }


    private val surfaceGetNameMethodBind: CPointer<godot_method_bind> by lazy { getMB("ArrayMesh", "surface_get_name") }
    open fun surfaceGetName(surfIdx: Long): String {
        return _icall_String_Long(surfaceGetNameMethodBind, this.rawMemory, surfIdx)
    }


    private val surfaceGetArraysMethodBind: CPointer<godot_method_bind> by lazy { getMB("ArrayMesh", "surface_get_arrays") }
    open fun surfaceGetArrays(surfIdx: Long): GDArray {
        return _icall_GDArray_Long(surfaceGetArraysMethodBind, this.rawMemory, surfIdx)
    }


    private val surfaceGetBlendShapeArraysMethodBind: CPointer<godot_method_bind> by lazy { getMB("ArrayMesh", "surface_get_blend_shape_arrays") }
    open fun surfaceGetBlendShapeArrays(surfIdx: Long): GDArray {
        return _icall_GDArray_Long(surfaceGetBlendShapeArraysMethodBind, this.rawMemory, surfIdx)
    }


    private val centerGeometryMethodBind: CPointer<godot_method_bind> by lazy { getMB("ArrayMesh", "center_geometry") }
    open fun centerGeometry() {
        _icall_Unit(centerGeometryMethodBind, this.rawMemory)
    }


    private val regenNormalmapsMethodBind: CPointer<godot_method_bind> by lazy { getMB("ArrayMesh", "regen_normalmaps") }
    open fun regenNormalmaps() {
        _icall_Unit(regenNormalmapsMethodBind, this.rawMemory)
    }


    private val lightmapUnwrapMethodBind: CPointer<godot_method_bind> by lazy { getMB("ArrayMesh", "lightmap_unwrap") }
    open fun lightmapUnwrap(arg0: Transform, arg1: Double): GodotError {
        return GodotError.fromInt(_icall_Long_Transform_Double(lightmapUnwrapMethodBind, this.rawMemory, arg0, arg1))
    }


    private val setCustomAabbMethodBind: CPointer<godot_method_bind> by lazy { getMB("ArrayMesh", "set_custom_aabb") }
    open fun setCustomAabb(aabb: AABB) {
        _icall_Unit_AABB(setCustomAabbMethodBind, this.rawMemory, aabb)
    }


    private val getCustomAabbMethodBind: CPointer<godot_method_bind> by lazy { getMB("ArrayMesh", "get_custom_aabb") }
    open fun getCustomAabb(): AABB {
        return _icall_AABB(getCustomAabbMethodBind, this.rawMemory)
    }


}
