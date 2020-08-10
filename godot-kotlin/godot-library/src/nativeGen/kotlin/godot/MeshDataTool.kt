package godot

import godot.core.Color
import godot.core.Godot.shouldInitPtr
import godot.core.GodotError
import godot.core.Plane
import godot.core.PoolIntArray
import godot.core.PoolRealArray
import godot.core.Variant
import godot.core.Vector2
import godot.core.Vector3
import godot.icalls._icall_Color_Long
import godot.icalls._icall_Long
import godot.icalls._icall_Long_Long_Long
import godot.icalls._icall_Long_Object
import godot.icalls._icall_Long_Object_Long
import godot.icalls._icall_Material
import godot.icalls._icall_Plane_Long
import godot.icalls._icall_PoolIntArray_Long
import godot.icalls._icall_PoolRealArray_Long
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_Long_Color
import godot.icalls._icall_Unit_Long_Plane
import godot.icalls._icall_Unit_Long_PoolIntArray
import godot.icalls._icall_Unit_Long_PoolRealArray
import godot.icalls._icall_Unit_Long_Variant
import godot.icalls._icall_Unit_Long_Vector2
import godot.icalls._icall_Unit_Long_Vector3
import godot.icalls._icall_Unit_Object
import godot.icalls._icall_Variant_Long
import godot.icalls._icall_Vector2_Long
import godot.icalls._icall_Vector3_Long
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Long

open class MeshDataTool internal constructor(
  _ignore: Any?
) : Reference(_ignore) {
  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("MeshDataTool", "MeshDataTool")
        }

  }

  open fun clear() {
    val mb = getMethodBind("MeshDataTool","clear")
    _icall_Unit( mb, this.ptr)
  }

  open fun commitToSurface(mesh: ArrayMesh): GodotError {
    val mb = getMethodBind("MeshDataTool","commit_to_surface")
    return GodotError.byValue( _icall_Long_Object( mb, this.ptr, mesh).toUInt())
  }

  open fun createFromSurface(mesh: ArrayMesh, surface: Long): GodotError {
    val mb = getMethodBind("MeshDataTool","create_from_surface")
    return GodotError.byValue( _icall_Long_Object_Long( mb, this.ptr, mesh, surface).toUInt())
  }

  open fun getEdgeCount(): Long {
    val mb = getMethodBind("MeshDataTool","get_edge_count")
    return _icall_Long( mb, this.ptr)
  }

  open fun getEdgeFaces(idx: Long): PoolIntArray {
    val mb = getMethodBind("MeshDataTool","get_edge_faces")
    return _icall_PoolIntArray_Long( mb, this.ptr, idx)
  }

  open fun getEdgeMeta(idx: Long): Variant {
    val mb = getMethodBind("MeshDataTool","get_edge_meta")
    return _icall_Variant_Long( mb, this.ptr, idx)
  }

  open fun getEdgeVertex(idx: Long, vertex: Long): Long {
    val mb = getMethodBind("MeshDataTool","get_edge_vertex")
    return _icall_Long_Long_Long( mb, this.ptr, idx, vertex)
  }

  open fun getFaceCount(): Long {
    val mb = getMethodBind("MeshDataTool","get_face_count")
    return _icall_Long( mb, this.ptr)
  }

  open fun getFaceEdge(idx: Long, edge: Long): Long {
    val mb = getMethodBind("MeshDataTool","get_face_edge")
    return _icall_Long_Long_Long( mb, this.ptr, idx, edge)
  }

  open fun getFaceMeta(idx: Long): Variant {
    val mb = getMethodBind("MeshDataTool","get_face_meta")
    return _icall_Variant_Long( mb, this.ptr, idx)
  }

  open fun getFaceNormal(idx: Long): Vector3 {
    val mb = getMethodBind("MeshDataTool","get_face_normal")
    return _icall_Vector3_Long( mb, this.ptr, idx)
  }

  open fun getFaceVertex(idx: Long, vertex: Long): Long {
    val mb = getMethodBind("MeshDataTool","get_face_vertex")
    return _icall_Long_Long_Long( mb, this.ptr, idx, vertex)
  }

  open fun getFormat(): Long {
    val mb = getMethodBind("MeshDataTool","get_format")
    return _icall_Long( mb, this.ptr)
  }

  open fun getMaterial(): Material {
    val mb = getMethodBind("MeshDataTool","get_material")
    return _icall_Material( mb, this.ptr)
  }

  open fun getVertex(idx: Long): Vector3 {
    val mb = getMethodBind("MeshDataTool","get_vertex")
    return _icall_Vector3_Long( mb, this.ptr, idx)
  }

  open fun getVertexBones(idx: Long): PoolIntArray {
    val mb = getMethodBind("MeshDataTool","get_vertex_bones")
    return _icall_PoolIntArray_Long( mb, this.ptr, idx)
  }

  open fun getVertexColor(idx: Long): Color {
    val mb = getMethodBind("MeshDataTool","get_vertex_color")
    return _icall_Color_Long( mb, this.ptr, idx)
  }

  open fun getVertexCount(): Long {
    val mb = getMethodBind("MeshDataTool","get_vertex_count")
    return _icall_Long( mb, this.ptr)
  }

  open fun getVertexEdges(idx: Long): PoolIntArray {
    val mb = getMethodBind("MeshDataTool","get_vertex_edges")
    return _icall_PoolIntArray_Long( mb, this.ptr, idx)
  }

  open fun getVertexFaces(idx: Long): PoolIntArray {
    val mb = getMethodBind("MeshDataTool","get_vertex_faces")
    return _icall_PoolIntArray_Long( mb, this.ptr, idx)
  }

  open fun getVertexMeta(idx: Long): Variant {
    val mb = getMethodBind("MeshDataTool","get_vertex_meta")
    return _icall_Variant_Long( mb, this.ptr, idx)
  }

  open fun getVertexNormal(idx: Long): Vector3 {
    val mb = getMethodBind("MeshDataTool","get_vertex_normal")
    return _icall_Vector3_Long( mb, this.ptr, idx)
  }

  open fun getVertexTangent(idx: Long): Plane {
    val mb = getMethodBind("MeshDataTool","get_vertex_tangent")
    return _icall_Plane_Long( mb, this.ptr, idx)
  }

  open fun getVertexUv(idx: Long): Vector2 {
    val mb = getMethodBind("MeshDataTool","get_vertex_uv")
    return _icall_Vector2_Long( mb, this.ptr, idx)
  }

  open fun getVertexUv2(idx: Long): Vector2 {
    val mb = getMethodBind("MeshDataTool","get_vertex_uv2")
    return _icall_Vector2_Long( mb, this.ptr, idx)
  }

  open fun getVertexWeights(idx: Long): PoolRealArray {
    val mb = getMethodBind("MeshDataTool","get_vertex_weights")
    return _icall_PoolRealArray_Long( mb, this.ptr, idx)
  }

  open fun setEdgeMeta(idx: Long, meta: Variant) {
    val mb = getMethodBind("MeshDataTool","set_edge_meta")
    _icall_Unit_Long_Variant( mb, this.ptr, idx, meta)
  }

  open fun setFaceMeta(idx: Long, meta: Variant) {
    val mb = getMethodBind("MeshDataTool","set_face_meta")
    _icall_Unit_Long_Variant( mb, this.ptr, idx, meta)
  }

  open fun setMaterial(material: Material) {
    val mb = getMethodBind("MeshDataTool","set_material")
    _icall_Unit_Object( mb, this.ptr, material)
  }

  open fun setVertex(idx: Long, vertex: Vector3) {
    val mb = getMethodBind("MeshDataTool","set_vertex")
    _icall_Unit_Long_Vector3( mb, this.ptr, idx, vertex)
  }

  open fun setVertexBones(idx: Long, bones: PoolIntArray) {
    val mb = getMethodBind("MeshDataTool","set_vertex_bones")
    _icall_Unit_Long_PoolIntArray( mb, this.ptr, idx, bones)
  }

  open fun setVertexColor(idx: Long, color: Color) {
    val mb = getMethodBind("MeshDataTool","set_vertex_color")
    _icall_Unit_Long_Color( mb, this.ptr, idx, color)
  }

  open fun setVertexMeta(idx: Long, meta: Variant) {
    val mb = getMethodBind("MeshDataTool","set_vertex_meta")
    _icall_Unit_Long_Variant( mb, this.ptr, idx, meta)
  }

  open fun setVertexNormal(idx: Long, normal: Vector3) {
    val mb = getMethodBind("MeshDataTool","set_vertex_normal")
    _icall_Unit_Long_Vector3( mb, this.ptr, idx, normal)
  }

  open fun setVertexTangent(idx: Long, tangent: Plane) {
    val mb = getMethodBind("MeshDataTool","set_vertex_tangent")
    _icall_Unit_Long_Plane( mb, this.ptr, idx, tangent)
  }

  open fun setVertexUv(idx: Long, uv: Vector2) {
    val mb = getMethodBind("MeshDataTool","set_vertex_uv")
    _icall_Unit_Long_Vector2( mb, this.ptr, idx, uv)
  }

  open fun setVertexUv2(idx: Long, uv2: Vector2) {
    val mb = getMethodBind("MeshDataTool","set_vertex_uv2")
    _icall_Unit_Long_Vector2( mb, this.ptr, idx, uv2)
  }

  open fun setVertexWeights(idx: Long, weights: PoolRealArray) {
    val mb = getMethodBind("MeshDataTool","set_vertex_weights")
    _icall_Unit_Long_PoolRealArray( mb, this.ptr, idx, weights)
  }
}
