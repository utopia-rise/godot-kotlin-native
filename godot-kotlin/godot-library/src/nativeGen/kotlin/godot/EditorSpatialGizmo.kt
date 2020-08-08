package godot

import godot.core.Color
import godot.core.PoolVector3Array
import godot.core.Variant
import godot.core.Vector2
import godot.icalls._icall_EditorSpatialGizmoPlugin
import godot.icalls._icall_Spatial
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Object
import godot.icalls._icall_Unit_Object_Boolean_nObject_nObject
import godot.icalls._icall_Unit_Object_Double_Color
import godot.icalls._icall_Unit_PoolVector3Array
import godot.icalls._icall_Unit_PoolVector3Array_Object_Boolean_Boolean
import godot.icalls._icall_Unit_PoolVector3Array_Object_Boolean_Color
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String

open class EditorSpatialGizmo internal constructor(
  _ignore: Any?
) : SpatialGizmo(_ignore) {
  internal constructor() : this(null)

  open fun addCollisionSegments(segments: PoolVector3Array) {
    val mb = getMethodBind("EditorSpatialGizmo","add_collision_segments")
    _icall_Unit_PoolVector3Array( mb, this.ptr, segments)
  }

  open fun addCollisionTriangles(triangles: TriangleMesh) {
    val mb = getMethodBind("EditorSpatialGizmo","add_collision_triangles")
    _icall_Unit_Object( mb, this.ptr, triangles)
  }

  open fun addHandles(
    handles: PoolVector3Array,
    material: Material,
    billboard: Boolean = false,
    secondary: Boolean = false
  ) {
    val mb = getMethodBind("EditorSpatialGizmo","add_handles")
    _icall_Unit_PoolVector3Array_Object_Boolean_Boolean( mb, this.ptr, handles, material, billboard,
        secondary)
  }

  open fun addLines(
    lines: PoolVector3Array,
    material: Material,
    billboard: Boolean = false,
    modulate: Color = Color(1,1,1,1)
  ) {
    val mb = getMethodBind("EditorSpatialGizmo","add_lines")
    _icall_Unit_PoolVector3Array_Object_Boolean_Color( mb, this.ptr, lines, material, billboard,
        modulate)
  }

  open fun addMesh(
    mesh: ArrayMesh,
    billboard: Boolean = false,
    skeleton: SkinReference? = null,
    material: Material? = null
  ) {
    val mb = getMethodBind("EditorSpatialGizmo","add_mesh")
    _icall_Unit_Object_Boolean_nObject_nObject( mb, this.ptr, mesh, billboard, skeleton, material)
  }

  open fun addUnscaledBillboard(
    material: Material,
    defaultScale: Double = 1.0,
    modulate: Color = Color(1,1,1,1)
  ) {
    val mb = getMethodBind("EditorSpatialGizmo","add_unscaled_billboard")
    _icall_Unit_Object_Double_Color( mb, this.ptr, material, defaultScale, modulate)
  }

  open fun clear() {
    val mb = getMethodBind("EditorSpatialGizmo","clear")
    _icall_Unit( mb, this.ptr)
  }

  open fun commit_handle(
    index: Long,
    restore: Variant,
    cancel: Boolean
  ) {
  }

  open fun get_handle_name(index: Long): String {
    throw NotImplementedError("get_handle_name is not implemented for EditorSpatialGizmo")
  }

  open fun get_handle_value(index: Long): Variant {
    throw NotImplementedError("get_handle_value is not implemented for EditorSpatialGizmo")
  }

  open fun getPlugin(): EditorSpatialGizmoPlugin {
    val mb = getMethodBind("EditorSpatialGizmo","get_plugin")
    return _icall_EditorSpatialGizmoPlugin( mb, this.ptr)
  }

  open fun getSpatialNode(): Spatial {
    val mb = getMethodBind("EditorSpatialGizmo","get_spatial_node")
    return _icall_Spatial( mb, this.ptr)
  }

  open fun is_handle_highlighted(index: Long): Boolean {
    throw NotImplementedError("is_handle_highlighted is not implemented for EditorSpatialGizmo")
  }

  open fun redraw() {
  }

  open fun set_handle(
    index: Long,
    camera: Camera,
    point: Vector2
  ) {
  }

  open fun setHidden(hidden: Boolean) {
    val mb = getMethodBind("EditorSpatialGizmo","set_hidden")
    _icall_Unit_Boolean( mb, this.ptr, hidden)
  }

  open fun setSpatialNode(node: Node) {
    val mb = getMethodBind("EditorSpatialGizmo","set_spatial_node")
    _icall_Unit_Object( mb, this.ptr, node)
  }

  companion object
}
