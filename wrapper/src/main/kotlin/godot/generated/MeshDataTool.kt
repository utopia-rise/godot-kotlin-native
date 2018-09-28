@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
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
    open fun createFromSurface(mesh: ArrayMesh, surface: Int): GodotError {
        return GodotError.fromInt(_icall_Int_Object_Int(createFromSurfaceMethodBind, this.rawMemory, mesh, surface))
    }


    private val commitToSurfaceMethodBind: CPointer<godot_method_bind> by lazy { getMB("MeshDataTool", "commit_to_surface") }
    open fun commitToSurface(mesh: ArrayMesh): GodotError {
        return GodotError.fromInt(_icall_Int_Object(commitToSurfaceMethodBind, this.rawMemory, mesh))
    }


    private val getFormatMethodBind: CPointer<godot_method_bind> by lazy { getMB("MeshDataTool", "get_format") }
    open fun getFormat(): Int {
        return _icall_Int(getFormatMethodBind, this.rawMemory)
    }


    private val getVertexCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("MeshDataTool", "get_vertex_count") }
    open fun getVertexCount(): Int {
        return _icall_Int(getVertexCountMethodBind, this.rawMemory)
    }


    private val getEdgeCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("MeshDataTool", "get_edge_count") }
    open fun getEdgeCount(): Int {
        return _icall_Int(getEdgeCountMethodBind, this.rawMemory)
    }


    private val getFaceCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("MeshDataTool", "get_face_count") }
    open fun getFaceCount(): Int {
        return _icall_Int(getFaceCountMethodBind, this.rawMemory)
    }


    private val setVertexMethodBind: CPointer<godot_method_bind> by lazy { getMB("MeshDataTool", "set_vertex") }
    open fun setVertex(idx: Int, vertex: Vector3) {
        _icall_Unit_Int_Vector3(setVertexMethodBind, this.rawMemory, idx, vertex)
    }


    private val getVertexMethodBind: CPointer<godot_method_bind> by lazy { getMB("MeshDataTool", "get_vertex") }
    open fun getVertex(idx: Int): Vector3 {
        return _icall_Vector3_Int(getVertexMethodBind, this.rawMemory, idx)
    }


    private val setVertexNormalMethodBind: CPointer<godot_method_bind> by lazy { getMB("MeshDataTool", "set_vertex_normal") }
    open fun setVertexNormal(idx: Int, normal: Vector3) {
        _icall_Unit_Int_Vector3(setVertexNormalMethodBind, this.rawMemory, idx, normal)
    }


    private val getVertexNormalMethodBind: CPointer<godot_method_bind> by lazy { getMB("MeshDataTool", "get_vertex_normal") }
    open fun getVertexNormal(idx: Int): Vector3 {
        return _icall_Vector3_Int(getVertexNormalMethodBind, this.rawMemory, idx)
    }


    private val setVertexTangentMethodBind: CPointer<godot_method_bind> by lazy { getMB("MeshDataTool", "set_vertex_tangent") }
    open fun setVertexTangent(idx: Int, tangent: Plane) {
        _icall_Unit_Int_Plane(setVertexTangentMethodBind, this.rawMemory, idx, tangent)
    }


    private val getVertexTangentMethodBind: CPointer<godot_method_bind> by lazy { getMB("MeshDataTool", "get_vertex_tangent") }
    open fun getVertexTangent(idx: Int): Plane {
        return _icall_Plane_Int(getVertexTangentMethodBind, this.rawMemory, idx)
    }


    private val setVertexUvMethodBind: CPointer<godot_method_bind> by lazy { getMB("MeshDataTool", "set_vertex_uv") }
    open fun setVertexUv(idx: Int, uv: Vector2) {
        _icall_Unit_Int_Vector2(setVertexUvMethodBind, this.rawMemory, idx, uv)
    }


    private val getVertexUvMethodBind: CPointer<godot_method_bind> by lazy { getMB("MeshDataTool", "get_vertex_uv") }
    open fun getVertexUv(idx: Int): Vector2 {
        return _icall_Vector2_Int(getVertexUvMethodBind, this.rawMemory, idx)
    }


    private val setVertexUv2MethodBind: CPointer<godot_method_bind> by lazy { getMB("MeshDataTool", "set_vertex_uv2") }
    open fun setVertexUv2(idx: Int, uv2: Vector2) {
        _icall_Unit_Int_Vector2(setVertexUv2MethodBind, this.rawMemory, idx, uv2)
    }


    private val getVertexUv2MethodBind: CPointer<godot_method_bind> by lazy { getMB("MeshDataTool", "get_vertex_uv2") }
    open fun getVertexUv2(idx: Int): Vector2 {
        return _icall_Vector2_Int(getVertexUv2MethodBind, this.rawMemory, idx)
    }


    private val setVertexColorMethodBind: CPointer<godot_method_bind> by lazy { getMB("MeshDataTool", "set_vertex_color") }
    open fun setVertexColor(idx: Int, color: Color) {
        _icall_Unit_Int_Color(setVertexColorMethodBind, this.rawMemory, idx, color)
    }


    private val getVertexColorMethodBind: CPointer<godot_method_bind> by lazy { getMB("MeshDataTool", "get_vertex_color") }
    open fun getVertexColor(idx: Int): Color {
        return _icall_Color_Int(getVertexColorMethodBind, this.rawMemory, idx)
    }


    private val setVertexBonesMethodBind: CPointer<godot_method_bind> by lazy { getMB("MeshDataTool", "set_vertex_bones") }
    open fun setVertexBones(idx: Int, bones: PoolIntArray) {
        _icall_Unit_Int_PoolIntArray(setVertexBonesMethodBind, this.rawMemory, idx, bones)
    }


    private val getVertexBonesMethodBind: CPointer<godot_method_bind> by lazy { getMB("MeshDataTool", "get_vertex_bones") }
    open fun getVertexBones(idx: Int): PoolIntArray {
        return _icall_PoolIntArray_Int(getVertexBonesMethodBind, this.rawMemory, idx)
    }


    private val setVertexWeightsMethodBind: CPointer<godot_method_bind> by lazy { getMB("MeshDataTool", "set_vertex_weights") }
    open fun setVertexWeights(idx: Int, weights: PoolRealArray) {
        _icall_Unit_Int_PoolRealArray(setVertexWeightsMethodBind, this.rawMemory, idx, weights)
    }


    private val getVertexWeightsMethodBind: CPointer<godot_method_bind> by lazy { getMB("MeshDataTool", "get_vertex_weights") }
    open fun getVertexWeights(idx: Int): PoolRealArray {
        return _icall_PoolRealArray_Int(getVertexWeightsMethodBind, this.rawMemory, idx)
    }


    private val setVertexMetaMethodBind: CPointer<godot_method_bind> by lazy { getMB("MeshDataTool", "set_vertex_meta") }
    open fun setVertexMeta(idx: Int, meta: Variant) {
        _icall_Unit_Int_Variant(setVertexMetaMethodBind, this.rawMemory, idx, meta)
    }


    private val getVertexMetaMethodBind: CPointer<godot_method_bind> by lazy { getMB("MeshDataTool", "get_vertex_meta") }
    open fun getVertexMeta(idx: Int): Variant {
        return _icall_Variant_Int(getVertexMetaMethodBind, this.rawMemory, idx)
    }


    private val getVertexEdgesMethodBind: CPointer<godot_method_bind> by lazy { getMB("MeshDataTool", "get_vertex_edges") }
    open fun getVertexEdges(idx: Int): PoolIntArray {
        return _icall_PoolIntArray_Int(getVertexEdgesMethodBind, this.rawMemory, idx)
    }


    private val getVertexFacesMethodBind: CPointer<godot_method_bind> by lazy { getMB("MeshDataTool", "get_vertex_faces") }
    open fun getVertexFaces(idx: Int): PoolIntArray {
        return _icall_PoolIntArray_Int(getVertexFacesMethodBind, this.rawMemory, idx)
    }


    private val getEdgeVertexMethodBind: CPointer<godot_method_bind> by lazy { getMB("MeshDataTool", "get_edge_vertex") }
    open fun getEdgeVertex(idx: Int, vertex: Int): Int {
        return _icall_Int_Int_Int(getEdgeVertexMethodBind, this.rawMemory, idx, vertex)
    }


    private val getEdgeFacesMethodBind: CPointer<godot_method_bind> by lazy { getMB("MeshDataTool", "get_edge_faces") }
    open fun getEdgeFaces(idx: Int): PoolIntArray {
        return _icall_PoolIntArray_Int(getEdgeFacesMethodBind, this.rawMemory, idx)
    }


    private val setEdgeMetaMethodBind: CPointer<godot_method_bind> by lazy { getMB("MeshDataTool", "set_edge_meta") }
    open fun setEdgeMeta(idx: Int, meta: Variant) {
        _icall_Unit_Int_Variant(setEdgeMetaMethodBind, this.rawMemory, idx, meta)
    }


    private val getEdgeMetaMethodBind: CPointer<godot_method_bind> by lazy { getMB("MeshDataTool", "get_edge_meta") }
    open fun getEdgeMeta(idx: Int): Variant {
        return _icall_Variant_Int(getEdgeMetaMethodBind, this.rawMemory, idx)
    }


    private val getFaceVertexMethodBind: CPointer<godot_method_bind> by lazy { getMB("MeshDataTool", "get_face_vertex") }
    open fun getFaceVertex(idx: Int, vertex: Int): Int {
        return _icall_Int_Int_Int(getFaceVertexMethodBind, this.rawMemory, idx, vertex)
    }


    private val getFaceEdgeMethodBind: CPointer<godot_method_bind> by lazy { getMB("MeshDataTool", "get_face_edge") }
    open fun getFaceEdge(idx: Int, edge: Int): Int {
        return _icall_Int_Int_Int(getFaceEdgeMethodBind, this.rawMemory, idx, edge)
    }


    private val setFaceMetaMethodBind: CPointer<godot_method_bind> by lazy { getMB("MeshDataTool", "set_face_meta") }
    open fun setFaceMeta(idx: Int, meta: Variant) {
        _icall_Unit_Int_Variant(setFaceMetaMethodBind, this.rawMemory, idx, meta)
    }


    private val getFaceMetaMethodBind: CPointer<godot_method_bind> by lazy { getMB("MeshDataTool", "get_face_meta") }
    open fun getFaceMeta(idx: Int): Variant {
        return _icall_Variant_Int(getFaceMetaMethodBind, this.rawMemory, idx)
    }


    private val getFaceNormalMethodBind: CPointer<godot_method_bind> by lazy { getMB("MeshDataTool", "get_face_normal") }
    open fun getFaceNormal(idx: Int): Vector3 {
        return _icall_Vector3_Int(getFaceNormalMethodBind, this.rawMemory, idx)
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
