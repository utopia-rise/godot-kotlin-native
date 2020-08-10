package godot

import godot.core.Color
import godot.core.Godot.shouldInitPtr
import godot.core.Plane
import godot.core.PoolColorArray
import godot.core.PoolIntArray
import godot.core.PoolRealArray
import godot.core.PoolVector2Array
import godot.core.PoolVector3Array
import godot.core.Transform
import godot.core.VariantArray
import godot.core.Vector2
import godot.core.Vector3
import godot.icalls._icall_ArrayMesh_nObject_Long
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Color
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Object
import godot.icalls._icall_Unit_Object_Long
import godot.icalls._icall_Unit_Object_Long_String
import godot.icalls._icall_Unit_Object_Long_Transform
import godot.icalls._icall_Unit_Plane
import godot.icalls._icall_Unit_PoolIntArray
import godot.icalls._icall_Unit_PoolRealArray
import godot.icalls._icall_Unit_PoolVector3Array_PoolVector2Array_PoolColorArray_PoolVector2Array_PoolVector3Array_VariantArray
import godot.icalls._icall_Unit_Vector2
import godot.icalls._icall_Unit_Vector3
import godot.icalls._icall_VariantArray
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.String

open class SurfaceTool internal constructor(
  _ignore: Any?
) : Reference(_ignore) {
  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("SurfaceTool", "SurfaceTool")
        }

  }

  open fun addBones(bones: PoolIntArray) {
    val mb = getMethodBind("SurfaceTool","add_bones")
    _icall_Unit_PoolIntArray( mb, this.ptr, bones)
  }

  open fun addColor(color: Color) {
    val mb = getMethodBind("SurfaceTool","add_color")
    _icall_Unit_Color( mb, this.ptr, color)
  }

  open fun addIndex(index: Long) {
    val mb = getMethodBind("SurfaceTool","add_index")
    _icall_Unit_Long( mb, this.ptr, index)
  }

  open fun addNormal(normal: Vector3) {
    val mb = getMethodBind("SurfaceTool","add_normal")
    _icall_Unit_Vector3( mb, this.ptr, normal)
  }

  open fun addSmoothGroup(smooth: Boolean) {
    val mb = getMethodBind("SurfaceTool","add_smooth_group")
    _icall_Unit_Boolean( mb, this.ptr, smooth)
  }

  open fun addTangent(tangent: Plane) {
    val mb = getMethodBind("SurfaceTool","add_tangent")
    _icall_Unit_Plane( mb, this.ptr, tangent)
  }

  open fun addTriangleFan(
    vertices: PoolVector3Array,
    uvs: PoolVector2Array = PoolVector2Array(),
    colors: PoolColorArray = PoolColorArray(),
    uv2s: PoolVector2Array = PoolVector2Array(),
    normals: PoolVector3Array = PoolVector3Array(),
    tangents: VariantArray = VariantArray()
  ) {
    val mb = getMethodBind("SurfaceTool","add_triangle_fan")
    _icall_Unit_PoolVector3Array_PoolVector2Array_PoolColorArray_PoolVector2Array_PoolVector3Array_VariantArray(
        mb, this.ptr, vertices, uvs, colors, uv2s, normals, tangents)
  }

  open fun addUv(uv: Vector2) {
    val mb = getMethodBind("SurfaceTool","add_uv")
    _icall_Unit_Vector2( mb, this.ptr, uv)
  }

  open fun addUv2(uv2: Vector2) {
    val mb = getMethodBind("SurfaceTool","add_uv2")
    _icall_Unit_Vector2( mb, this.ptr, uv2)
  }

  open fun addVertex(vertex: Vector3) {
    val mb = getMethodBind("SurfaceTool","add_vertex")
    _icall_Unit_Vector3( mb, this.ptr, vertex)
  }

  open fun addWeights(weights: PoolRealArray) {
    val mb = getMethodBind("SurfaceTool","add_weights")
    _icall_Unit_PoolRealArray( mb, this.ptr, weights)
  }

  open fun appendFrom(
    existing: Mesh,
    surface: Long,
    transform: Transform
  ) {
    val mb = getMethodBind("SurfaceTool","append_from")
    _icall_Unit_Object_Long_Transform( mb, this.ptr, existing, surface, transform)
  }

  open fun begin(primitive: Long) {
    val mb = getMethodBind("SurfaceTool","begin")
    _icall_Unit_Long( mb, this.ptr, primitive)
  }

  open fun clear() {
    val mb = getMethodBind("SurfaceTool","clear")
    _icall_Unit( mb, this.ptr)
  }

  open fun commit(existing: ArrayMesh? = null, flags: Long = 97280): ArrayMesh {
    val mb = getMethodBind("SurfaceTool","commit")
    return _icall_ArrayMesh_nObject_Long( mb, this.ptr, existing, flags)
  }

  open fun commitToArrays(): VariantArray {
    val mb = getMethodBind("SurfaceTool","commit_to_arrays")
    return _icall_VariantArray( mb, this.ptr)
  }

  open fun createFrom(existing: Mesh, surface: Long) {
    val mb = getMethodBind("SurfaceTool","create_from")
    _icall_Unit_Object_Long( mb, this.ptr, existing, surface)
  }

  open fun createFromBlendShape(
    existing: Mesh,
    surface: Long,
    blendShape: String
  ) {
    val mb = getMethodBind("SurfaceTool","create_from_blend_shape")
    _icall_Unit_Object_Long_String( mb, this.ptr, existing, surface, blendShape)
  }

  open fun deindex() {
    val mb = getMethodBind("SurfaceTool","deindex")
    _icall_Unit( mb, this.ptr)
  }

  open fun generateNormals(flip: Boolean = false) {
    val mb = getMethodBind("SurfaceTool","generate_normals")
    _icall_Unit_Boolean( mb, this.ptr, flip)
  }

  open fun generateTangents() {
    val mb = getMethodBind("SurfaceTool","generate_tangents")
    _icall_Unit( mb, this.ptr)
  }

  open fun index() {
    val mb = getMethodBind("SurfaceTool","index")
    _icall_Unit( mb, this.ptr)
  }

  open fun setMaterial(material: Material) {
    val mb = getMethodBind("SurfaceTool","set_material")
    _icall_Unit_Object( mb, this.ptr, material)
  }
}
