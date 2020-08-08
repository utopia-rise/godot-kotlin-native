package godot

import godot.core.Color
import godot.core.Variant
import godot.core.Vector2
import godot.icalls._icall_SpatialMaterial_String_Object
import godot.icalls._icall_Unit_String_Boolean
import godot.icalls._icall_Unit_String_Color_Boolean_Boolean_Boolean
import godot.icalls._icall_Unit_String_Object
import godot.icalls._icall_Unit_String_Object_Boolean_Color
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String

open class EditorSpatialGizmoPlugin internal constructor(
  _ignore: Any?
) : Resource(_ignore) {
  internal constructor() : this(null)

  open fun addMaterial(name: String, material: SpatialMaterial) {
    val mb = getMethodBind("EditorSpatialGizmoPlugin","add_material")
    _icall_Unit_String_Object( mb, this.ptr, name, material)
  }

  open fun can_be_hidden(): Boolean {
    throw NotImplementedError("can_be_hidden is not implemented for EditorSpatialGizmoPlugin")
  }

  open fun commit_handle(
    gizmo: EditorSpatialGizmo,
    index: Long,
    restore: Variant,
    cancel: Boolean
  ) {
  }

  open fun create_gizmo(spatial: Spatial): EditorSpatialGizmo {
    throw NotImplementedError("create_gizmo is not implemented for EditorSpatialGizmoPlugin")
  }

  open fun createHandleMaterial(name: String, billboard: Boolean = false) {
    val mb = getMethodBind("EditorSpatialGizmoPlugin","create_handle_material")
    _icall_Unit_String_Boolean( mb, this.ptr, name, billboard)
  }

  open fun createIconMaterial(
    name: String,
    texture: Texture,
    onTop: Boolean = false,
    color: Color = Color(1,1,1,1)
  ) {
    val mb = getMethodBind("EditorSpatialGizmoPlugin","create_icon_material")
    _icall_Unit_String_Object_Boolean_Color( mb, this.ptr, name, texture, onTop, color)
  }

  open fun createMaterial(
    name: String,
    color: Color,
    billboard: Boolean = false,
    onTop: Boolean = false,
    useVertexColor: Boolean = false
  ) {
    val mb = getMethodBind("EditorSpatialGizmoPlugin","create_material")
    _icall_Unit_String_Color_Boolean_Boolean_Boolean( mb, this.ptr, name, color, billboard, onTop,
        useVertexColor)
  }

  open fun get_handle_name(gizmo: EditorSpatialGizmo, index: Long): String {
    throw NotImplementedError("get_handle_name is not implemented for EditorSpatialGizmoPlugin")
  }

  open fun get_handle_value(gizmo: EditorSpatialGizmo, index: Long): Variant {
    throw NotImplementedError("get_handle_value is not implemented for EditorSpatialGizmoPlugin")
  }

  open fun getMaterial(name: String, gizmo: EditorSpatialGizmo): SpatialMaterial {
    val mb = getMethodBind("EditorSpatialGizmoPlugin","get_material")
    return _icall_SpatialMaterial_String_Object( mb, this.ptr, name, gizmo)
  }

  open fun get_name(): String {
    throw NotImplementedError("get_name is not implemented for EditorSpatialGizmoPlugin")
  }

  open fun get_priority(): String {
    throw NotImplementedError("get_priority is not implemented for EditorSpatialGizmoPlugin")
  }

  open fun has_gizmo(spatial: Spatial): Boolean {
    throw NotImplementedError("has_gizmo is not implemented for EditorSpatialGizmoPlugin")
  }

  open fun is_handle_highlighted(gizmo: EditorSpatialGizmo, index: Long): Boolean {
    throw
        NotImplementedError("is_handle_highlighted is not implemented for EditorSpatialGizmoPlugin")
  }

  open fun is_selectable_when_hidden(): Boolean {
    throw
        NotImplementedError("is_selectable_when_hidden is not implemented for EditorSpatialGizmoPlugin")
  }

  open fun redraw(gizmo: EditorSpatialGizmo) {
  }

  open fun set_handle(
    gizmo: EditorSpatialGizmo,
    index: Long,
    camera: Camera,
    point: Vector2
  ) {
  }

  companion object
}
