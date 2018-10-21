@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class MeshDataTool : Reference {
    constructor() : super("MeshDataTool")
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
        infix fun from(other: Reference): MeshDataTool = MeshDataTool("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): MeshDataTool = MeshDataTool("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): MeshDataTool = fromVariant(MeshDataTool(""), other)


        // Constants


    }


    // Properties


    // Methods
    private val clearMethodBind: CPointer<godot_method_bind> by lazy { getMB("MeshDataTool", "clear") }
    open fun clear() {
        _icall_Unit(clearMethodBind, this.rawMemory)
    }


    private val createFromSurfaceMethodBind: CPointer<godot_method_bind> by lazy { getMB("MeshDataTool", "create_from_surface") }
    open fun createFromSurface(mesh: ArrayMesh, surface: Long): GodotError {
        return GodotError.fromInt(_icall_Long_Object_Long(createFromSurfaceMethodBind, this.rawMemory, mesh, surface))
    }


    private val commitToSurfaceMethodBind: CPointer<godot_method_bind> by lazy { getMB("MeshDataTool", "commit_to_surface") }
    open fun commitToSurface(mesh: ArrayMesh): GodotError {
        return GodotError.fromInt(_icall_Long_Object(commitToSurfaceMethodBind, this.rawMemory, mesh))
    }


    private val getFormatMethodBind: CPointer<godot_method_bind> by lazy { getMB("MeshDataTool", "get_format") }
    open fun getFormat(): Long {
        return _icall_Long(getFormatMethodBind, this.rawMemory)
    }


    private val getVertexCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("MeshDataTool", "get_vertex_count") }
    open fun getVertexCount(): Long {
        return _icall_Long(getVertexCountMethodBind, this.rawMemory)
    }


    private val getEdgeCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("MeshDataTool", "get_edge_count") }
    open fun getEdgeCount(): Long {
        return _icall_Long(getEdgeCountMethodBind, this.rawMemory)
    }


    private val getFaceCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("MeshDataTool", "get_face_count") }
    open fun getFaceCount(): Long {
        return _icall_Long(getFaceCountMethodBind, this.rawMemory)
    }


    private val setVertexMethodBind: CPointer<godot_method_bind> by lazy { getMB("MeshDataTool", "set_vertex") }
    open fun setVertex(idx: Long, vertex: Vector3) {
        _icall_Unit_Long_Vector3(setVertexMethodBind, this.rawMemory, idx, vertex)
    }


    private val getVertexMethodBind: CPointer<godot_method_bind> by lazy { getMB("MeshDataTool", "get_vertex") }
    open fun getVertex(idx: Long): Vector3 {
        return _icall_Vector3_Long(getVertexMethodBind, this.rawMemory, idx)
    }


    private val setVertexNormalMethodBind: CPointer<godot_method_bind> by lazy { getMB("MeshDataTool", "set_vertex_normal") }
    open fun setVertexNormal(idx: Long, normal: Vector3) {
        _icall_Unit_Long_Vector3(setVertexNormalMethodBind, this.rawMemory, idx, normal)
    }


    private val getVertexNormalMethodBind: CPointer<godot_method_bind> by lazy { getMB("MeshDataTool", "get_vertex_normal") }
    open fun getVertexNormal(idx: Long): Vector3 {
        return _icall_Vector3_Long(getVertexNormalMethodBind, this.rawMemory, idx)
    }


    private val setVertexTangentMethodBind: CPointer<godot_method_bind> by lazy { getMB("MeshDataTool", "set_vertex_tangent") }
    open fun setVertexTangent(idx: Long, tangent: Plane) {
        _icall_Unit_Long_Plane(setVertexTangentMethodBind, this.rawMemory, idx, tangent)
    }


    private val getVertexTangentMethodBind: CPointer<godot_method_bind> by lazy { getMB("MeshDataTool", "get_vertex_tangent") }
    open fun getVertexTangent(idx: Long): Plane {
        return _icall_Plane_Long(getVertexTangentMethodBind, this.rawMemory, idx)
    }


    private val setVertexUvMethodBind: CPointer<godot_method_bind> by lazy { getMB("MeshDataTool", "set_vertex_uv") }
    open fun setVertexUv(idx: Long, uv: Vector2) {
        _icall_Unit_Long_Vector2(setVertexUvMethodBind, this.rawMemory, idx, uv)
    }


    private val getVertexUvMethodBind: CPointer<godot_method_bind> by lazy { getMB("MeshDataTool", "get_vertex_uv") }
    open fun getVertexUv(idx: Long): Vector2 {
        return _icall_Vector2_Long(getVertexUvMethodBind, this.rawMemory, idx)
    }


    private val setVertexUv2MethodBind: CPointer<godot_method_bind> by lazy { getMB("MeshDataTool", "set_vertex_uv2") }
    open fun setVertexUv2(idx: Long, uv2: Vector2) {
        _icall_Unit_Long_Vector2(setVertexUv2MethodBind, this.rawMemory, idx, uv2)
    }


    private val getVertexUv2MethodBind: CPointer<godot_method_bind> by lazy { getMB("MeshDataTool", "get_vertex_uv2") }
    open fun getVertexUv2(idx: Long): Vector2 {
        return _icall_Vector2_Long(getVertexUv2MethodBind, this.rawMemory, idx)
    }


    private val setVertexColorMethodBind: CPointer<godot_method_bind> by lazy { getMB("MeshDataTool", "set_vertex_color") }
    open fun setVertexColor(idx: Long, color: Color) {
        _icall_Unit_Long_Color(setVertexColorMethodBind, this.rawMemory, idx, color)
    }


    private val getVertexColorMethodBind: CPointer<godot_method_bind> by lazy { getMB("MeshDataTool", "get_vertex_color") }
    open fun getVertexColor(idx: Long): Color {
        return _icall_Color_Long(getVertexColorMethodBind, this.rawMemory, idx)
    }


    private val setVertexBonesMethodBind: CPointer<godot_method_bind> by lazy { getMB("MeshDataTool", "set_vertex_bones") }
    open fun setVertexBones(idx: Long, bones: PoolIntArray) {
        _icall_Unit_Long_PoolIntArray(setVertexBonesMethodBind, this.rawMemory, idx, bones)
    }


    private val getVertexBonesMethodBind: CPointer<godot_method_bind> by lazy { getMB("MeshDataTool", "get_vertex_bones") }
    open fun getVertexBones(idx: Long): PoolIntArray {
        return _icall_PoolIntArray_Long(getVertexBonesMethodBind, this.rawMemory, idx)
    }


    private val setVertexWeightsMethodBind: CPointer<godot_method_bind> by lazy { getMB("MeshDataTool", "set_vertex_weights") }
    open fun setVertexWeights(idx: Long, weights: PoolRealArray) {
        _icall_Unit_Long_PoolRealArray(setVertexWeightsMethodBind, this.rawMemory, idx, weights)
    }


    private val getVertexWeightsMethodBind: CPointer<godot_method_bind> by lazy { getMB("MeshDataTool", "get_vertex_weights") }
    open fun getVertexWeights(idx: Long): PoolRealArray {
        return _icall_PoolRealArray_Long(getVertexWeightsMethodBind, this.rawMemory, idx)
    }


    private val setVertexMetaMethodBind: CPointer<godot_method_bind> by lazy { getMB("MeshDataTool", "set_vertex_meta") }
    open fun setVertexMeta(idx: Long, meta: Variant) {
        _icall_Unit_Long_Variant(setVertexMetaMethodBind, this.rawMemory, idx, meta)
    }


    private val getVertexMetaMethodBind: CPointer<godot_method_bind> by lazy { getMB("MeshDataTool", "get_vertex_meta") }
    open fun getVertexMeta(idx: Long): Variant {
        return _icall_Variant_Long(getVertexMetaMethodBind, this.rawMemory, idx)
    }


    private val getVertexEdgesMethodBind: CPointer<godot_method_bind> by lazy { getMB("MeshDataTool", "get_vertex_edges") }
    open fun getVertexEdges(idx: Long): PoolIntArray {
        return _icall_PoolIntArray_Long(getVertexEdgesMethodBind, this.rawMemory, idx)
    }


    private val getVertexFacesMethodBind: CPointer<godot_method_bind> by lazy { getMB("MeshDataTool", "get_vertex_faces") }
    open fun getVertexFaces(idx: Long): PoolIntArray {
        return _icall_PoolIntArray_Long(getVertexFacesMethodBind, this.rawMemory, idx)
    }


    private val getEdgeVertexMethodBind: CPointer<godot_method_bind> by lazy { getMB("MeshDataTool", "get_edge_vertex") }
    open fun getEdgeVertex(idx: Long, vertex: Long): Long {
        return _icall_Long_Long_Long(getEdgeVertexMethodBind, this.rawMemory, idx, vertex)
    }


    private val getEdgeFacesMethodBind: CPointer<godot_method_bind> by lazy { getMB("MeshDataTool", "get_edge_faces") }
    open fun getEdgeFaces(idx: Long): PoolIntArray {
        return _icall_PoolIntArray_Long(getEdgeFacesMethodBind, this.rawMemory, idx)
    }


    private val setEdgeMetaMethodBind: CPointer<godot_method_bind> by lazy { getMB("MeshDataTool", "set_edge_meta") }
    open fun setEdgeMeta(idx: Long, meta: Variant) {
        _icall_Unit_Long_Variant(setEdgeMetaMethodBind, this.rawMemory, idx, meta)
    }


    private val getEdgeMetaMethodBind: CPointer<godot_method_bind> by lazy { getMB("MeshDataTool", "get_edge_meta") }
    open fun getEdgeMeta(idx: Long): Variant {
        return _icall_Variant_Long(getEdgeMetaMethodBind, this.rawMemory, idx)
    }


    private val getFaceVertexMethodBind: CPointer<godot_method_bind> by lazy { getMB("MeshDataTool", "get_face_vertex") }
    open fun getFaceVertex(idx: Long, vertex: Long): Long {
        return _icall_Long_Long_Long(getFaceVertexMethodBind, this.rawMemory, idx, vertex)
    }


    private val getFaceEdgeMethodBind: CPointer<godot_method_bind> by lazy { getMB("MeshDataTool", "get_face_edge") }
    open fun getFaceEdge(idx: Long, edge: Long): Long {
        return _icall_Long_Long_Long(getFaceEdgeMethodBind, this.rawMemory, idx, edge)
    }


    private val setFaceMetaMethodBind: CPointer<godot_method_bind> by lazy { getMB("MeshDataTool", "set_face_meta") }
    open fun setFaceMeta(idx: Long, meta: Variant) {
        _icall_Unit_Long_Variant(setFaceMetaMethodBind, this.rawMemory, idx, meta)
    }


    private val getFaceMetaMethodBind: CPointer<godot_method_bind> by lazy { getMB("MeshDataTool", "get_face_meta") }
    open fun getFaceMeta(idx: Long): Variant {
        return _icall_Variant_Long(getFaceMetaMethodBind, this.rawMemory, idx)
    }


    private val getFaceNormalMethodBind: CPointer<godot_method_bind> by lazy { getMB("MeshDataTool", "get_face_normal") }
    open fun getFaceNormal(idx: Long): Vector3 {
        return _icall_Vector3_Long(getFaceNormalMethodBind, this.rawMemory, idx)
    }


    private val setMaterialMethodBind: CPointer<godot_method_bind> by lazy { getMB("MeshDataTool", "set_material") }
    open fun setMaterial(material: Material) {
        _icall_Unit_Object(setMaterialMethodBind, this.rawMemory, material)
    }


    private val getMaterialMethodBind: CPointer<godot_method_bind> by lazy { getMB("MeshDataTool", "get_material") }
    open fun getMaterial(): Material {
        return _icall_Material(getMaterialMethodBind, this.rawMemory)
    }


}
