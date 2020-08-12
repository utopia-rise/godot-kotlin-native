// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.Image
import godot.VisualServer
import godot.core.AABB
import godot.core.Basis
import godot.core.Color
import godot.core.Godot
import godot.core.Plane
import godot.core.PoolByteArray
import godot.core.PoolColorArray
import godot.core.PoolIntArray
import godot.core.PoolRealArray
import godot.core.PoolVector2Array
import godot.core.RID
import godot.core.Rect2
import godot.core.Signal0
import godot.core.Transform
import godot.core.Transform2D
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import godot.core.Vector3
import godot.core.signal
import godot.icalls._icall_AABB_RID
import godot.icalls._icall_AABB_RID_Long
import godot.icalls._icall_Boolean
import godot.icalls._icall_Boolean_Long
import godot.icalls._icall_Boolean_RID
import godot.icalls._icall_Boolean_String
import godot.icalls._icall_Color_RID_Long
import godot.icalls._icall_Double_RID
import godot.icalls._icall_Image_RID_Long
import godot.icalls._icall_Long_Long
import godot.icalls._icall_Long_Long_Long_Long
import godot.icalls._icall_Long_Long_Long_Long_Long
import godot.icalls._icall_Long_RID
import godot.icalls._icall_Long_RID_Long
import godot.icalls._icall_PoolByteArray_RID
import godot.icalls._icall_PoolByteArray_RID_Long
import godot.icalls._icall_PoolIntArray_RID
import godot.icalls._icall_RID
import godot.icalls._icall_RID_Long_Long_Double
import godot.icalls._icall_RID_Object_Long
import godot.icalls._icall_RID_RID
import godot.icalls._icall_RID_RID_Long
import godot.icalls._icall_RID_RID_RID
import godot.icalls._icall_RID_RID_String
import godot.icalls._icall_String
import godot.icalls._icall_String_RID
import godot.icalls._icall_Transform2D_RID_Long
import godot.icalls._icall_Transform_RID
import godot.icalls._icall_Transform_RID_Long
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Boolean_Double
import godot.icalls._icall_Unit_Color
import godot.icalls._icall_Unit_Long_Long_Long_Long
import godot.icalls._icall_Unit_Object_Color_Boolean_Boolean
import godot.icalls._icall_Unit_Object_String_Variant
import godot.icalls._icall_Unit_RID
import godot.icalls._icall_Unit_RID_AABB
import godot.icalls._icall_Unit_RID_Basis
import godot.icalls._icall_Unit_RID_Boolean
import godot.icalls._icall_Unit_RID_Boolean_Color_Color_Double
import godot.icalls._icall_Unit_RID_Boolean_Double_Double_Double
import godot.icalls._icall_Unit_RID_Boolean_Double_Double_Double_Boolean_Double
import godot.icalls._icall_Unit_RID_Boolean_Double_Double_Double_Double_Double_Double_Double_Color_Long_Long_Double
import godot.icalls._icall_Unit_RID_Boolean_Double_Double_Double_Long
import godot.icalls._icall_Unit_RID_Boolean_Double_Double_Double_RID
import godot.icalls._icall_Unit_RID_Boolean_Long_Double_Double_Double_Boolean
import godot.icalls._icall_Unit_RID_Boolean_Long_Double_Double_Double_Long_Double_Double_Double_Boolean
import godot.icalls._icall_Unit_RID_Boolean_Rect2
import godot.icalls._icall_Unit_RID_Color
import godot.icalls._icall_Unit_RID_Color_Double_Double
import godot.icalls._icall_Unit_RID_Double
import godot.icalls._icall_Unit_RID_Double_Double_Double
import godot.icalls._icall_Unit_RID_Double_Double_Double_Double
import godot.icalls._icall_Unit_RID_Double_Vector2_Double_Double
import godot.icalls._icall_Unit_RID_Long
import godot.icalls._icall_Unit_RID_Long_Boolean
import godot.icalls._icall_Unit_RID_Long_Color
import godot.icalls._icall_Unit_RID_Long_Double
import godot.icalls._icall_Unit_RID_Long_Double_Double_Boolean_Double_Double_Double_Double
import godot.icalls._icall_Unit_RID_Long_Long
import godot.icalls._icall_Unit_RID_Long_Long_Long
import godot.icalls._icall_Unit_RID_Long_Long_Long_Long
import godot.icalls._icall_Unit_RID_Long_Long_Long_Long_Long_Long
import godot.icalls._icall_Unit_RID_Long_Long_PoolByteArray
import godot.icalls._icall_Unit_RID_Long_RID
import godot.icalls._icall_Unit_RID_Long_Transform
import godot.icalls._icall_Unit_RID_Long_Transform2D
import godot.icalls._icall_Unit_RID_Long_VariantArray_VariantArray_Long
import godot.icalls._icall_Unit_RID_Object_Long
import godot.icalls._icall_Unit_RID_Object_Long_Long_Long_Long_Long_Long_Long_Long
import godot.icalls._icall_Unit_RID_Plane
import godot.icalls._icall_Unit_RID_PoolByteArray
import godot.icalls._icall_Unit_RID_PoolIntArray
import godot.icalls._icall_Unit_RID_PoolIntArray_PoolVector2Array_PoolColorArray_PoolVector2Array_PoolIntArray_PoolRealArray_RID_Long_RID_Boolean_Boolean
import godot.icalls._icall_Unit_RID_PoolRealArray
import godot.icalls._icall_Unit_RID_PoolVector2Array
import godot.icalls._icall_Unit_RID_PoolVector2Array_Boolean
import godot.icalls._icall_Unit_RID_PoolVector2Array_PoolColorArray_Double_Boolean
import godot.icalls._icall_Unit_RID_PoolVector2Array_PoolColorArray_PoolVector2Array_RID_Double_RID
import godot.icalls._icall_Unit_RID_PoolVector2Array_PoolColorArray_PoolVector2Array_RID_RID_Boolean
import godot.icalls._icall_Unit_RID_RID
import godot.icalls._icall_Unit_RID_RID_Long
import godot.icalls._icall_Unit_RID_RID_Long_Long
import godot.icalls._icall_Unit_RID_RID_RID
import godot.icalls._icall_Unit_RID_RID_RID_RID
import godot.icalls._icall_Unit_RID_RID_Transform2D
import godot.icalls._icall_Unit_RID_RID_Transform2D_Color_RID_RID
import godot.icalls._icall_Unit_RID_RID_Vector2
import godot.icalls._icall_Unit_RID_Rect2_Color
import godot.icalls._icall_Unit_RID_Rect2_Long
import godot.icalls._icall_Unit_RID_Rect2_RID_Boolean_Color_Boolean_RID
import godot.icalls._icall_Unit_RID_Rect2_RID_Rect2_Color_Boolean_RID_Boolean
import godot.icalls._icall_Unit_RID_Rect2_Rect2_RID_Vector2_Vector2_Long_Long_Boolean_Color_RID
import godot.icalls._icall_Unit_RID_String
import godot.icalls._icall_Unit_RID_String_RID
import godot.icalls._icall_Unit_RID_String_Variant
import godot.icalls._icall_Unit_RID_Transform
import godot.icalls._icall_Unit_RID_Transform2D
import godot.icalls._icall_Unit_RID_Vector2
import godot.icalls._icall_Unit_RID_Vector2_Double_Color
import godot.icalls._icall_Unit_RID_Vector2_Vector2_Color_Double_Boolean
import godot.icalls._icall_Unit_RID_Vector3
import godot.icalls._icall_VariantArray
import godot.icalls._icall_VariantArray_AABB_RID
import godot.icalls._icall_VariantArray_RID
import godot.icalls._icall_VariantArray_RID_Long
import godot.icalls._icall_VariantArray_VariantArray_RID
import godot.icalls._icall_VariantArray_Vector3_Vector3_RID
import godot.icalls._icall_Variant_RID_String
import godot.internal.type.nullSafe
import godot.internal.utils.getMethodBind
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.String
import kotlin.requireNotNull
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped

object VisualServer : Object() {
  init {
    memScoped {
        val ptr =
        nullSafe(Godot.gdnative.godot_global_get_singleton).invoke("VisualServer".cstr.ptr)
        requireNotNull(ptr) { "No instance found for singleton VisualServer" }
        this@VisualServer.ptr = ptr
    }
  }

  final const val ARRAY_WEIGHTS_SIZE: Long = 4

  final const val CANVAS_ITEM_Z_MAX: Long = 4096

  final const val CANVAS_ITEM_Z_MIN: Long = -4096

  final const val MATERIAL_RENDER_PRIORITY_MAX: Long = 127

  final const val MATERIAL_RENDER_PRIORITY_MIN: Long = -128

  final const val MAX_CURSORS: Long = 8

  final const val MAX_GLOW_LEVELS: Long = 7

  final const val NO_INDEX_ARRAY: Long = -1

  val framePostDraw: Signal0 by signal()

  val framePreDraw: Signal0 by signal()

  fun blackBarsSetImages(
    left: RID,
    top: RID,
    right: RID,
    bottom: RID
  ) {
    val mb = getMethodBind("VisualServer","black_bars_set_images")
    _icall_Unit_RID_RID_RID_RID( mb, this.ptr, left, top, right, bottom)
  }

  fun blackBarsSetMargins(
    left: Long,
    top: Long,
    right: Long,
    bottom: Long
  ) {
    val mb = getMethodBind("VisualServer","black_bars_set_margins")
    _icall_Unit_Long_Long_Long_Long( mb, this.ptr, left, top, right, bottom)
  }

  fun cameraCreate(): RID {
    val mb = getMethodBind("VisualServer","camera_create")
    return _icall_RID( mb, this.ptr)
  }

  fun cameraSetCullMask(camera: RID, layers: Long) {
    val mb = getMethodBind("VisualServer","camera_set_cull_mask")
    _icall_Unit_RID_Long( mb, this.ptr, camera, layers)
  }

  fun cameraSetEnvironment(camera: RID, env: RID) {
    val mb = getMethodBind("VisualServer","camera_set_environment")
    _icall_Unit_RID_RID( mb, this.ptr, camera, env)
  }

  fun cameraSetFrustum(
    camera: RID,
    size: Double,
    offset: Vector2,
    zNear: Double,
    zFar: Double
  ) {
    val mb = getMethodBind("VisualServer","camera_set_frustum")
    _icall_Unit_RID_Double_Vector2_Double_Double( mb, this.ptr, camera, size, offset, zNear, zFar)
  }

  fun cameraSetOrthogonal(
    camera: RID,
    size: Double,
    zNear: Double,
    zFar: Double
  ) {
    val mb = getMethodBind("VisualServer","camera_set_orthogonal")
    _icall_Unit_RID_Double_Double_Double( mb, this.ptr, camera, size, zNear, zFar)
  }

  fun cameraSetPerspective(
    camera: RID,
    fovyDegrees: Double,
    zNear: Double,
    zFar: Double
  ) {
    val mb = getMethodBind("VisualServer","camera_set_perspective")
    _icall_Unit_RID_Double_Double_Double( mb, this.ptr, camera, fovyDegrees, zNear, zFar)
  }

  fun cameraSetTransform(camera: RID, transform: Transform) {
    val mb = getMethodBind("VisualServer","camera_set_transform")
    _icall_Unit_RID_Transform( mb, this.ptr, camera, transform)
  }

  fun cameraSetUseVerticalAspect(camera: RID, enable: Boolean) {
    val mb = getMethodBind("VisualServer","camera_set_use_vertical_aspect")
    _icall_Unit_RID_Boolean( mb, this.ptr, camera, enable)
  }

  fun canvasCreate(): RID {
    val mb = getMethodBind("VisualServer","canvas_create")
    return _icall_RID( mb, this.ptr)
  }

  fun canvasItemAddCircle(
    item: RID,
    pos: Vector2,
    radius: Double,
    color: Color
  ) {
    val mb = getMethodBind("VisualServer","canvas_item_add_circle")
    _icall_Unit_RID_Vector2_Double_Color( mb, this.ptr, item, pos, radius, color)
  }

  fun canvasItemAddClipIgnore(item: RID, ignore: Boolean) {
    val mb = getMethodBind("VisualServer","canvas_item_add_clip_ignore")
    _icall_Unit_RID_Boolean( mb, this.ptr, item, ignore)
  }

  fun canvasItemAddLine(
    item: RID,
    from: Vector2,
    to: Vector2,
    color: Color,
    width: Double = 1.0,
    antialiased: Boolean = false
  ) {
    val mb = getMethodBind("VisualServer","canvas_item_add_line")
    _icall_Unit_RID_Vector2_Vector2_Color_Double_Boolean( mb, this.ptr, item, from, to, color,
        width, antialiased)
  }

  fun canvasItemAddMesh(
    item: RID,
    mesh: RID,
    transform: Transform2D = Transform2D(),
    modulate: Color = Color(1,1,1,1),
    texture: RID = RID(),
    normalMap: RID = RID()
  ) {
    val mb = getMethodBind("VisualServer","canvas_item_add_mesh")
    _icall_Unit_RID_RID_Transform2D_Color_RID_RID( mb, this.ptr, item, mesh, transform, modulate,
        texture, normalMap)
  }

  fun canvasItemAddMultimesh(
    item: RID,
    mesh: RID,
    texture: RID,
    normalMap: RID = RID()
  ) {
    val mb = getMethodBind("VisualServer","canvas_item_add_multimesh")
    _icall_Unit_RID_RID_RID_RID( mb, this.ptr, item, mesh, texture, normalMap)
  }

  fun canvasItemAddNinePatch(
    item: RID,
    rect: Rect2,
    source: Rect2,
    texture: RID,
    topleft: Vector2,
    bottomright: Vector2,
    xAxisMode: Long = 0,
    yAxisMode: Long = 0,
    drawCenter: Boolean = true,
    modulate: Color = Color(1,1,1,1),
    normalMap: RID = RID()
  ) {
    val mb = getMethodBind("VisualServer","canvas_item_add_nine_patch")
    _icall_Unit_RID_Rect2_Rect2_RID_Vector2_Vector2_Long_Long_Boolean_Color_RID( mb, this.ptr, item,
        rect, source, texture, topleft, bottomright, xAxisMode, yAxisMode, drawCenter, modulate,
        normalMap)
  }

  fun canvasItemAddParticles(
    item: RID,
    particles: RID,
    texture: RID,
    normalMap: RID
  ) {
    val mb = getMethodBind("VisualServer","canvas_item_add_particles")
    _icall_Unit_RID_RID_RID_RID( mb, this.ptr, item, particles, texture, normalMap)
  }

  fun canvasItemAddPolygon(
    item: RID,
    points: PoolVector2Array,
    colors: PoolColorArray,
    uvs: PoolVector2Array = PoolVector2Array(),
    texture: RID = RID(),
    normalMap: RID = RID(),
    antialiased: Boolean = false
  ) {
    val mb = getMethodBind("VisualServer","canvas_item_add_polygon")
    _icall_Unit_RID_PoolVector2Array_PoolColorArray_PoolVector2Array_RID_RID_Boolean( mb, this.ptr,
        item, points, colors, uvs, texture, normalMap, antialiased)
  }

  fun canvasItemAddPolyline(
    item: RID,
    points: PoolVector2Array,
    colors: PoolColorArray,
    width: Double = 1.0,
    antialiased: Boolean = false
  ) {
    val mb = getMethodBind("VisualServer","canvas_item_add_polyline")
    _icall_Unit_RID_PoolVector2Array_PoolColorArray_Double_Boolean( mb, this.ptr, item, points,
        colors, width, antialiased)
  }

  fun canvasItemAddPrimitive(
    item: RID,
    points: PoolVector2Array,
    colors: PoolColorArray,
    uvs: PoolVector2Array,
    texture: RID,
    width: Double = 1.0,
    normalMap: RID = RID()
  ) {
    val mb = getMethodBind("VisualServer","canvas_item_add_primitive")
    _icall_Unit_RID_PoolVector2Array_PoolColorArray_PoolVector2Array_RID_Double_RID( mb, this.ptr,
        item, points, colors, uvs, texture, width, normalMap)
  }

  fun canvasItemAddRect(
    item: RID,
    rect: Rect2,
    color: Color
  ) {
    val mb = getMethodBind("VisualServer","canvas_item_add_rect")
    _icall_Unit_RID_Rect2_Color( mb, this.ptr, item, rect, color)
  }

  fun canvasItemAddSetTransform(item: RID, transform: Transform2D) {
    val mb = getMethodBind("VisualServer","canvas_item_add_set_transform")
    _icall_Unit_RID_Transform2D( mb, this.ptr, item, transform)
  }

  fun canvasItemAddTextureRect(
    item: RID,
    rect: Rect2,
    texture: RID,
    tile: Boolean = false,
    modulate: Color = Color(1,1,1,1),
    transpose: Boolean = false,
    normalMap: RID = RID()
  ) {
    val mb = getMethodBind("VisualServer","canvas_item_add_texture_rect")
    _icall_Unit_RID_Rect2_RID_Boolean_Color_Boolean_RID( mb, this.ptr, item, rect, texture, tile,
        modulate, transpose, normalMap)
  }

  fun canvasItemAddTextureRectRegion(
    item: RID,
    rect: Rect2,
    texture: RID,
    srcRect: Rect2,
    modulate: Color = Color(1,1,1,1),
    transpose: Boolean = false,
    normalMap: RID = RID(),
    clipUv: Boolean = true
  ) {
    val mb = getMethodBind("VisualServer","canvas_item_add_texture_rect_region")
    _icall_Unit_RID_Rect2_RID_Rect2_Color_Boolean_RID_Boolean( mb, this.ptr, item, rect, texture,
        srcRect, modulate, transpose, normalMap, clipUv)
  }

  fun canvasItemAddTriangleArray(
    item: RID,
    indices: PoolIntArray,
    points: PoolVector2Array,
    colors: PoolColorArray,
    uvs: PoolVector2Array = PoolVector2Array(),
    bones: PoolIntArray = PoolIntArray(),
    weights: PoolRealArray = PoolRealArray(),
    texture: RID = RID(),
    count: Long = -1,
    normalMap: RID = RID(),
    antialiased: Boolean = false,
    antialiasingUseIndices: Boolean = false
  ) {
    val mb = getMethodBind("VisualServer","canvas_item_add_triangle_array")
    _icall_Unit_RID_PoolIntArray_PoolVector2Array_PoolColorArray_PoolVector2Array_PoolIntArray_PoolRealArray_RID_Long_RID_Boolean_Boolean(
        mb, this.ptr, item, indices, points, colors, uvs, bones, weights, texture, count, normalMap,
        antialiased, antialiasingUseIndices)
  }

  fun canvasItemClear(item: RID) {
    val mb = getMethodBind("VisualServer","canvas_item_clear")
    _icall_Unit_RID( mb, this.ptr, item)
  }

  fun canvasItemCreate(): RID {
    val mb = getMethodBind("VisualServer","canvas_item_create")
    return _icall_RID( mb, this.ptr)
  }

  fun canvasItemSetClip(item: RID, clip: Boolean) {
    val mb = getMethodBind("VisualServer","canvas_item_set_clip")
    _icall_Unit_RID_Boolean( mb, this.ptr, item, clip)
  }

  fun canvasItemSetCopyToBackbuffer(
    item: RID,
    enabled: Boolean,
    rect: Rect2
  ) {
    val mb = getMethodBind("VisualServer","canvas_item_set_copy_to_backbuffer")
    _icall_Unit_RID_Boolean_Rect2( mb, this.ptr, item, enabled, rect)
  }

  fun canvasItemSetCustomRect(
    item: RID,
    useCustomRect: Boolean,
    rect: Rect2 = Rect2(0.0, 0.0, 0.0, 0.0)
  ) {
    val mb = getMethodBind("VisualServer","canvas_item_set_custom_rect")
    _icall_Unit_RID_Boolean_Rect2( mb, this.ptr, item, useCustomRect, rect)
  }

  fun canvasItemSetDistanceFieldMode(item: RID, enabled: Boolean) {
    val mb = getMethodBind("VisualServer","canvas_item_set_distance_field_mode")
    _icall_Unit_RID_Boolean( mb, this.ptr, item, enabled)
  }

  fun canvasItemSetDrawBehindParent(item: RID, enabled: Boolean) {
    val mb = getMethodBind("VisualServer","canvas_item_set_draw_behind_parent")
    _icall_Unit_RID_Boolean( mb, this.ptr, item, enabled)
  }

  fun canvasItemSetDrawIndex(item: RID, index: Long) {
    val mb = getMethodBind("VisualServer","canvas_item_set_draw_index")
    _icall_Unit_RID_Long( mb, this.ptr, item, index)
  }

  fun canvasItemSetLightMask(item: RID, mask: Long) {
    val mb = getMethodBind("VisualServer","canvas_item_set_light_mask")
    _icall_Unit_RID_Long( mb, this.ptr, item, mask)
  }

  fun canvasItemSetMaterial(item: RID, material: RID) {
    val mb = getMethodBind("VisualServer","canvas_item_set_material")
    _icall_Unit_RID_RID( mb, this.ptr, item, material)
  }

  fun canvasItemSetModulate(item: RID, color: Color) {
    val mb = getMethodBind("VisualServer","canvas_item_set_modulate")
    _icall_Unit_RID_Color( mb, this.ptr, item, color)
  }

  fun canvasItemSetParent(item: RID, parent: RID) {
    val mb = getMethodBind("VisualServer","canvas_item_set_parent")
    _icall_Unit_RID_RID( mb, this.ptr, item, parent)
  }

  fun canvasItemSetSelfModulate(item: RID, color: Color) {
    val mb = getMethodBind("VisualServer","canvas_item_set_self_modulate")
    _icall_Unit_RID_Color( mb, this.ptr, item, color)
  }

  fun canvasItemSetSortChildrenByY(item: RID, enabled: Boolean) {
    val mb = getMethodBind("VisualServer","canvas_item_set_sort_children_by_y")
    _icall_Unit_RID_Boolean( mb, this.ptr, item, enabled)
  }

  fun canvasItemSetTransform(item: RID, transform: Transform2D) {
    val mb = getMethodBind("VisualServer","canvas_item_set_transform")
    _icall_Unit_RID_Transform2D( mb, this.ptr, item, transform)
  }

  fun canvasItemSetUseParentMaterial(item: RID, enabled: Boolean) {
    val mb = getMethodBind("VisualServer","canvas_item_set_use_parent_material")
    _icall_Unit_RID_Boolean( mb, this.ptr, item, enabled)
  }

  fun canvasItemSetVisible(item: RID, visible: Boolean) {
    val mb = getMethodBind("VisualServer","canvas_item_set_visible")
    _icall_Unit_RID_Boolean( mb, this.ptr, item, visible)
  }

  fun canvasItemSetZAsRelativeToParent(item: RID, enabled: Boolean) {
    val mb = getMethodBind("VisualServer","canvas_item_set_z_as_relative_to_parent")
    _icall_Unit_RID_Boolean( mb, this.ptr, item, enabled)
  }

  fun canvasItemSetZIndex(item: RID, zIndex: Long) {
    val mb = getMethodBind("VisualServer","canvas_item_set_z_index")
    _icall_Unit_RID_Long( mb, this.ptr, item, zIndex)
  }

  fun canvasLightAttachToCanvas(light: RID, canvas: RID) {
    val mb = getMethodBind("VisualServer","canvas_light_attach_to_canvas")
    _icall_Unit_RID_RID( mb, this.ptr, light, canvas)
  }

  fun canvasLightCreate(): RID {
    val mb = getMethodBind("VisualServer","canvas_light_create")
    return _icall_RID( mb, this.ptr)
  }

  fun canvasLightOccluderAttachToCanvas(occluder: RID, canvas: RID) {
    val mb = getMethodBind("VisualServer","canvas_light_occluder_attach_to_canvas")
    _icall_Unit_RID_RID( mb, this.ptr, occluder, canvas)
  }

  fun canvasLightOccluderCreate(): RID {
    val mb = getMethodBind("VisualServer","canvas_light_occluder_create")
    return _icall_RID( mb, this.ptr)
  }

  fun canvasLightOccluderSetEnabled(occluder: RID, enabled: Boolean) {
    val mb = getMethodBind("VisualServer","canvas_light_occluder_set_enabled")
    _icall_Unit_RID_Boolean( mb, this.ptr, occluder, enabled)
  }

  fun canvasLightOccluderSetLightMask(occluder: RID, mask: Long) {
    val mb = getMethodBind("VisualServer","canvas_light_occluder_set_light_mask")
    _icall_Unit_RID_Long( mb, this.ptr, occluder, mask)
  }

  fun canvasLightOccluderSetPolygon(occluder: RID, polygon: RID) {
    val mb = getMethodBind("VisualServer","canvas_light_occluder_set_polygon")
    _icall_Unit_RID_RID( mb, this.ptr, occluder, polygon)
  }

  fun canvasLightOccluderSetTransform(occluder: RID, transform: Transform2D) {
    val mb = getMethodBind("VisualServer","canvas_light_occluder_set_transform")
    _icall_Unit_RID_Transform2D( mb, this.ptr, occluder, transform)
  }

  fun canvasLightSetColor(light: RID, color: Color) {
    val mb = getMethodBind("VisualServer","canvas_light_set_color")
    _icall_Unit_RID_Color( mb, this.ptr, light, color)
  }

  fun canvasLightSetEnabled(light: RID, enabled: Boolean) {
    val mb = getMethodBind("VisualServer","canvas_light_set_enabled")
    _icall_Unit_RID_Boolean( mb, this.ptr, light, enabled)
  }

  fun canvasLightSetEnergy(light: RID, energy: Double) {
    val mb = getMethodBind("VisualServer","canvas_light_set_energy")
    _icall_Unit_RID_Double( mb, this.ptr, light, energy)
  }

  fun canvasLightSetHeight(light: RID, height: Double) {
    val mb = getMethodBind("VisualServer","canvas_light_set_height")
    _icall_Unit_RID_Double( mb, this.ptr, light, height)
  }

  fun canvasLightSetItemCullMask(light: RID, mask: Long) {
    val mb = getMethodBind("VisualServer","canvas_light_set_item_cull_mask")
    _icall_Unit_RID_Long( mb, this.ptr, light, mask)
  }

  fun canvasLightSetItemShadowCullMask(light: RID, mask: Long) {
    val mb = getMethodBind("VisualServer","canvas_light_set_item_shadow_cull_mask")
    _icall_Unit_RID_Long( mb, this.ptr, light, mask)
  }

  fun canvasLightSetLayerRange(
    light: RID,
    minLayer: Long,
    maxLayer: Long
  ) {
    val mb = getMethodBind("VisualServer","canvas_light_set_layer_range")
    _icall_Unit_RID_Long_Long( mb, this.ptr, light, minLayer, maxLayer)
  }

  fun canvasLightSetMode(light: RID, mode: Long) {
    val mb = getMethodBind("VisualServer","canvas_light_set_mode")
    _icall_Unit_RID_Long( mb, this.ptr, light, mode)
  }

  fun canvasLightSetScale(light: RID, scale: Double) {
    val mb = getMethodBind("VisualServer","canvas_light_set_scale")
    _icall_Unit_RID_Double( mb, this.ptr, light, scale)
  }

  fun canvasLightSetShadowBufferSize(light: RID, size: Long) {
    val mb = getMethodBind("VisualServer","canvas_light_set_shadow_buffer_size")
    _icall_Unit_RID_Long( mb, this.ptr, light, size)
  }

  fun canvasLightSetShadowColor(light: RID, color: Color) {
    val mb = getMethodBind("VisualServer","canvas_light_set_shadow_color")
    _icall_Unit_RID_Color( mb, this.ptr, light, color)
  }

  fun canvasLightSetShadowEnabled(light: RID, enabled: Boolean) {
    val mb = getMethodBind("VisualServer","canvas_light_set_shadow_enabled")
    _icall_Unit_RID_Boolean( mb, this.ptr, light, enabled)
  }

  fun canvasLightSetShadowFilter(light: RID, filter: Long) {
    val mb = getMethodBind("VisualServer","canvas_light_set_shadow_filter")
    _icall_Unit_RID_Long( mb, this.ptr, light, filter)
  }

  fun canvasLightSetShadowGradientLength(light: RID, length: Double) {
    val mb = getMethodBind("VisualServer","canvas_light_set_shadow_gradient_length")
    _icall_Unit_RID_Double( mb, this.ptr, light, length)
  }

  fun canvasLightSetShadowSmooth(light: RID, smooth: Double) {
    val mb = getMethodBind("VisualServer","canvas_light_set_shadow_smooth")
    _icall_Unit_RID_Double( mb, this.ptr, light, smooth)
  }

  fun canvasLightSetTexture(light: RID, texture: RID) {
    val mb = getMethodBind("VisualServer","canvas_light_set_texture")
    _icall_Unit_RID_RID( mb, this.ptr, light, texture)
  }

  fun canvasLightSetTextureOffset(light: RID, offset: Vector2) {
    val mb = getMethodBind("VisualServer","canvas_light_set_texture_offset")
    _icall_Unit_RID_Vector2( mb, this.ptr, light, offset)
  }

  fun canvasLightSetTransform(light: RID, transform: Transform2D) {
    val mb = getMethodBind("VisualServer","canvas_light_set_transform")
    _icall_Unit_RID_Transform2D( mb, this.ptr, light, transform)
  }

  fun canvasLightSetZRange(
    light: RID,
    minZ: Long,
    maxZ: Long
  ) {
    val mb = getMethodBind("VisualServer","canvas_light_set_z_range")
    _icall_Unit_RID_Long_Long( mb, this.ptr, light, minZ, maxZ)
  }

  fun canvasOccluderPolygonCreate(): RID {
    val mb = getMethodBind("VisualServer","canvas_occluder_polygon_create")
    return _icall_RID( mb, this.ptr)
  }

  fun canvasOccluderPolygonSetCullMode(occluderPolygon: RID, mode: Long) {
    val mb = getMethodBind("VisualServer","canvas_occluder_polygon_set_cull_mode")
    _icall_Unit_RID_Long( mb, this.ptr, occluderPolygon, mode)
  }

  fun canvasOccluderPolygonSetShape(
    occluderPolygon: RID,
    shape: PoolVector2Array,
    closed: Boolean
  ) {
    val mb = getMethodBind("VisualServer","canvas_occluder_polygon_set_shape")
    _icall_Unit_RID_PoolVector2Array_Boolean( mb, this.ptr, occluderPolygon, shape, closed)
  }

  fun canvasOccluderPolygonSetShapeAsLines(occluderPolygon: RID, shape: PoolVector2Array) {
    val mb = getMethodBind("VisualServer","canvas_occluder_polygon_set_shape_as_lines")
    _icall_Unit_RID_PoolVector2Array( mb, this.ptr, occluderPolygon, shape)
  }

  fun canvasSetItemMirroring(
    canvas: RID,
    item: RID,
    mirroring: Vector2
  ) {
    val mb = getMethodBind("VisualServer","canvas_set_item_mirroring")
    _icall_Unit_RID_RID_Vector2( mb, this.ptr, canvas, item, mirroring)
  }

  fun canvasSetModulate(canvas: RID, color: Color) {
    val mb = getMethodBind("VisualServer","canvas_set_modulate")
    _icall_Unit_RID_Color( mb, this.ptr, canvas, color)
  }

  fun directionalLightCreate(): RID {
    val mb = getMethodBind("VisualServer","directional_light_create")
    return _icall_RID( mb, this.ptr)
  }

  fun draw(swapBuffers: Boolean = true, frameStep: Double = 0.0) {
    val mb = getMethodBind("VisualServer","draw")
    _icall_Unit_Boolean_Double( mb, this.ptr, swapBuffers, frameStep)
  }

  fun environmentCreate(): RID {
    val mb = getMethodBind("VisualServer","environment_create")
    return _icall_RID( mb, this.ptr)
  }

  fun environmentSetAdjustment(
    env: RID,
    enable: Boolean,
    brightness: Double,
    contrast: Double,
    saturation: Double,
    ramp: RID
  ) {
    val mb = getMethodBind("VisualServer","environment_set_adjustment")
    _icall_Unit_RID_Boolean_Double_Double_Double_RID( mb, this.ptr, env, enable, brightness,
        contrast, saturation, ramp)
  }

  fun environmentSetAmbientLight(
    env: RID,
    color: Color,
    energy: Double = 1.0,
    skyContibution: Double = 0.0
  ) {
    val mb = getMethodBind("VisualServer","environment_set_ambient_light")
    _icall_Unit_RID_Color_Double_Double( mb, this.ptr, env, color, energy, skyContibution)
  }

  fun environmentSetBackground(env: RID, bg: Long) {
    val mb = getMethodBind("VisualServer","environment_set_background")
    _icall_Unit_RID_Long( mb, this.ptr, env, bg)
  }

  fun environmentSetBgColor(env: RID, color: Color) {
    val mb = getMethodBind("VisualServer","environment_set_bg_color")
    _icall_Unit_RID_Color( mb, this.ptr, env, color)
  }

  fun environmentSetBgEnergy(env: RID, energy: Double) {
    val mb = getMethodBind("VisualServer","environment_set_bg_energy")
    _icall_Unit_RID_Double( mb, this.ptr, env, energy)
  }

  fun environmentSetCanvasMaxLayer(env: RID, maxLayer: Long) {
    val mb = getMethodBind("VisualServer","environment_set_canvas_max_layer")
    _icall_Unit_RID_Long( mb, this.ptr, env, maxLayer)
  }

  fun environmentSetDofBlurFar(
    env: RID,
    enable: Boolean,
    distance: Double,
    transition: Double,
    farAmount: Double,
    quality: Long
  ) {
    val mb = getMethodBind("VisualServer","environment_set_dof_blur_far")
    _icall_Unit_RID_Boolean_Double_Double_Double_Long( mb, this.ptr, env, enable, distance,
        transition, farAmount, quality)
  }

  fun environmentSetDofBlurNear(
    env: RID,
    enable: Boolean,
    distance: Double,
    transition: Double,
    farAmount: Double,
    quality: Long
  ) {
    val mb = getMethodBind("VisualServer","environment_set_dof_blur_near")
    _icall_Unit_RID_Boolean_Double_Double_Double_Long( mb, this.ptr, env, enable, distance,
        transition, farAmount, quality)
  }

  fun environmentSetFog(
    env: RID,
    enable: Boolean,
    color: Color,
    sunColor: Color,
    sunAmount: Double
  ) {
    val mb = getMethodBind("VisualServer","environment_set_fog")
    _icall_Unit_RID_Boolean_Color_Color_Double( mb, this.ptr, env, enable, color, sunColor,
        sunAmount)
  }

  fun environmentSetFogDepth(
    env: RID,
    enable: Boolean,
    depthBegin: Double,
    depthEnd: Double,
    depthCurve: Double,
    transmit: Boolean,
    transmitCurve: Double
  ) {
    val mb = getMethodBind("VisualServer","environment_set_fog_depth")
    _icall_Unit_RID_Boolean_Double_Double_Double_Boolean_Double( mb, this.ptr, env, enable,
        depthBegin, depthEnd, depthCurve, transmit, transmitCurve)
  }

  fun environmentSetFogHeight(
    env: RID,
    enable: Boolean,
    minHeight: Double,
    maxHeight: Double,
    heightCurve: Double
  ) {
    val mb = getMethodBind("VisualServer","environment_set_fog_height")
    _icall_Unit_RID_Boolean_Double_Double_Double( mb, this.ptr, env, enable, minHeight, maxHeight,
        heightCurve)
  }

  fun environmentSetGlow(
    env: RID,
    enable: Boolean,
    levelFlags: Long,
    intensity: Double,
    strength: Double,
    bloomThreshold: Double,
    blendMode: Long,
    hdrBleedThreshold: Double,
    hdrBleedScale: Double,
    hdrLuminanceCap: Double,
    bicubicUpscale: Boolean
  ) {
    val mb = getMethodBind("VisualServer","environment_set_glow")
    _icall_Unit_RID_Boolean_Long_Double_Double_Double_Long_Double_Double_Double_Boolean( mb,
        this.ptr, env, enable, levelFlags, intensity, strength, bloomThreshold, blendMode,
        hdrBleedThreshold, hdrBleedScale, hdrLuminanceCap, bicubicUpscale)
  }

  fun environmentSetSky(env: RID, sky: RID) {
    val mb = getMethodBind("VisualServer","environment_set_sky")
    _icall_Unit_RID_RID( mb, this.ptr, env, sky)
  }

  fun environmentSetSkyCustomFov(env: RID, scale: Double) {
    val mb = getMethodBind("VisualServer","environment_set_sky_custom_fov")
    _icall_Unit_RID_Double( mb, this.ptr, env, scale)
  }

  fun environmentSetSkyOrientation(env: RID, orientation: Basis) {
    val mb = getMethodBind("VisualServer","environment_set_sky_orientation")
    _icall_Unit_RID_Basis( mb, this.ptr, env, orientation)
  }

  fun environmentSetSsao(
    env: RID,
    enable: Boolean,
    radius: Double,
    intensity: Double,
    radius2: Double,
    intensity2: Double,
    bias: Double,
    lightAffect: Double,
    aoChannelAffect: Double,
    color: Color,
    quality: Long,
    blur: Long,
    bilateralSharpness: Double
  ) {
    val mb = getMethodBind("VisualServer","environment_set_ssao")
    _icall_Unit_RID_Boolean_Double_Double_Double_Double_Double_Double_Double_Color_Long_Long_Double(
        mb, this.ptr, env, enable, radius, intensity, radius2, intensity2, bias, lightAffect,
        aoChannelAffect, color, quality, blur, bilateralSharpness)
  }

  fun environmentSetSsr(
    env: RID,
    enable: Boolean,
    maxSteps: Long,
    fadeIn: Double,
    fadeOut: Double,
    depthTolerance: Double,
    roughness: Boolean
  ) {
    val mb = getMethodBind("VisualServer","environment_set_ssr")
    _icall_Unit_RID_Boolean_Long_Double_Double_Double_Boolean( mb, this.ptr, env, enable, maxSteps,
        fadeIn, fadeOut, depthTolerance, roughness)
  }

  fun environmentSetTonemap(
    env: RID,
    toneMapper: Long,
    exposure: Double,
    white: Double,
    autoExposure: Boolean,
    minLuminance: Double,
    maxLuminance: Double,
    autoExpSpeed: Double,
    autoExpGrey: Double
  ) {
    val mb = getMethodBind("VisualServer","environment_set_tonemap")
    _icall_Unit_RID_Long_Double_Double_Boolean_Double_Double_Double_Double( mb, this.ptr, env,
        toneMapper, exposure, white, autoExposure, minLuminance, maxLuminance, autoExpSpeed,
        autoExpGrey)
  }

  fun finish() {
    val mb = getMethodBind("VisualServer","finish")
    _icall_Unit( mb, this.ptr)
  }

  fun forceDraw(swapBuffers: Boolean = true, frameStep: Double = 0.0) {
    val mb = getMethodBind("VisualServer","force_draw")
    _icall_Unit_Boolean_Double( mb, this.ptr, swapBuffers, frameStep)
  }

  fun forceSync() {
    val mb = getMethodBind("VisualServer","force_sync")
    _icall_Unit( mb, this.ptr)
  }

  fun freeRid(rid: RID) {
    val mb = getMethodBind("VisualServer","free_rid")
    _icall_Unit_RID( mb, this.ptr, rid)
  }

  fun getRenderInfo(info: Long): Long {
    val mb = getMethodBind("VisualServer","get_render_info")
    return _icall_Long_Long( mb, this.ptr, info)
  }

  fun getTestCube(): RID {
    val mb = getMethodBind("VisualServer","get_test_cube")
    return _icall_RID( mb, this.ptr)
  }

  fun getTestTexture(): RID {
    val mb = getMethodBind("VisualServer","get_test_texture")
    return _icall_RID( mb, this.ptr)
  }

  fun getVideoAdapterName(): String {
    val mb = getMethodBind("VisualServer","get_video_adapter_name")
    return _icall_String( mb, this.ptr)
  }

  fun getVideoAdapterVendor(): String {
    val mb = getMethodBind("VisualServer","get_video_adapter_vendor")
    return _icall_String( mb, this.ptr)
  }

  fun getWhiteTexture(): RID {
    val mb = getMethodBind("VisualServer","get_white_texture")
    return _icall_RID( mb, this.ptr)
  }

  fun giProbeCreate(): RID {
    val mb = getMethodBind("VisualServer","gi_probe_create")
    return _icall_RID( mb, this.ptr)
  }

  fun giProbeGetBias(probe: RID): Double {
    val mb = getMethodBind("VisualServer","gi_probe_get_bias")
    return _icall_Double_RID( mb, this.ptr, probe)
  }

  fun giProbeGetBounds(probe: RID): AABB {
    val mb = getMethodBind("VisualServer","gi_probe_get_bounds")
    return _icall_AABB_RID( mb, this.ptr, probe)
  }

  fun giProbeGetCellSize(probe: RID): Double {
    val mb = getMethodBind("VisualServer","gi_probe_get_cell_size")
    return _icall_Double_RID( mb, this.ptr, probe)
  }

  fun giProbeGetDynamicData(probe: RID): PoolIntArray {
    val mb = getMethodBind("VisualServer","gi_probe_get_dynamic_data")
    return _icall_PoolIntArray_RID( mb, this.ptr, probe)
  }

  fun giProbeGetDynamicRange(probe: RID): Long {
    val mb = getMethodBind("VisualServer","gi_probe_get_dynamic_range")
    return _icall_Long_RID( mb, this.ptr, probe)
  }

  fun giProbeGetEnergy(probe: RID): Double {
    val mb = getMethodBind("VisualServer","gi_probe_get_energy")
    return _icall_Double_RID( mb, this.ptr, probe)
  }

  fun giProbeGetNormalBias(probe: RID): Double {
    val mb = getMethodBind("VisualServer","gi_probe_get_normal_bias")
    return _icall_Double_RID( mb, this.ptr, probe)
  }

  fun giProbeGetPropagation(probe: RID): Double {
    val mb = getMethodBind("VisualServer","gi_probe_get_propagation")
    return _icall_Double_RID( mb, this.ptr, probe)
  }

  fun giProbeGetToCellXform(probe: RID): Transform {
    val mb = getMethodBind("VisualServer","gi_probe_get_to_cell_xform")
    return _icall_Transform_RID( mb, this.ptr, probe)
  }

  fun giProbeIsCompressed(probe: RID): Boolean {
    val mb = getMethodBind("VisualServer","gi_probe_is_compressed")
    return _icall_Boolean_RID( mb, this.ptr, probe)
  }

  fun giProbeIsInterior(probe: RID): Boolean {
    val mb = getMethodBind("VisualServer","gi_probe_is_interior")
    return _icall_Boolean_RID( mb, this.ptr, probe)
  }

  fun giProbeSetBias(probe: RID, bias: Double) {
    val mb = getMethodBind("VisualServer","gi_probe_set_bias")
    _icall_Unit_RID_Double( mb, this.ptr, probe, bias)
  }

  fun giProbeSetBounds(probe: RID, bounds: AABB) {
    val mb = getMethodBind("VisualServer","gi_probe_set_bounds")
    _icall_Unit_RID_AABB( mb, this.ptr, probe, bounds)
  }

  fun giProbeSetCellSize(probe: RID, range: Double) {
    val mb = getMethodBind("VisualServer","gi_probe_set_cell_size")
    _icall_Unit_RID_Double( mb, this.ptr, probe, range)
  }

  fun giProbeSetCompress(probe: RID, enable: Boolean) {
    val mb = getMethodBind("VisualServer","gi_probe_set_compress")
    _icall_Unit_RID_Boolean( mb, this.ptr, probe, enable)
  }

  fun giProbeSetDynamicData(probe: RID, data: PoolIntArray) {
    val mb = getMethodBind("VisualServer","gi_probe_set_dynamic_data")
    _icall_Unit_RID_PoolIntArray( mb, this.ptr, probe, data)
  }

  fun giProbeSetDynamicRange(probe: RID, range: Long) {
    val mb = getMethodBind("VisualServer","gi_probe_set_dynamic_range")
    _icall_Unit_RID_Long( mb, this.ptr, probe, range)
  }

  fun giProbeSetEnergy(probe: RID, energy: Double) {
    val mb = getMethodBind("VisualServer","gi_probe_set_energy")
    _icall_Unit_RID_Double( mb, this.ptr, probe, energy)
  }

  fun giProbeSetInterior(probe: RID, enable: Boolean) {
    val mb = getMethodBind("VisualServer","gi_probe_set_interior")
    _icall_Unit_RID_Boolean( mb, this.ptr, probe, enable)
  }

  fun giProbeSetNormalBias(probe: RID, bias: Double) {
    val mb = getMethodBind("VisualServer","gi_probe_set_normal_bias")
    _icall_Unit_RID_Double( mb, this.ptr, probe, bias)
  }

  fun giProbeSetPropagation(probe: RID, propagation: Double) {
    val mb = getMethodBind("VisualServer","gi_probe_set_propagation")
    _icall_Unit_RID_Double( mb, this.ptr, probe, propagation)
  }

  fun giProbeSetToCellXform(probe: RID, xform: Transform) {
    val mb = getMethodBind("VisualServer","gi_probe_set_to_cell_xform")
    _icall_Unit_RID_Transform( mb, this.ptr, probe, xform)
  }

  fun hasChanged(): Boolean {
    val mb = getMethodBind("VisualServer","has_changed")
    return _icall_Boolean( mb, this.ptr)
  }

  fun hasFeature(feature: Long): Boolean {
    val mb = getMethodBind("VisualServer","has_feature")
    return _icall_Boolean_Long( mb, this.ptr, feature)
  }

  fun hasOsFeature(feature: String): Boolean {
    val mb = getMethodBind("VisualServer","has_os_feature")
    return _icall_Boolean_String( mb, this.ptr, feature)
  }

  fun immediateBegin(
    immediate: RID,
    primitive: Long,
    texture: RID = RID()
  ) {
    val mb = getMethodBind("VisualServer","immediate_begin")
    _icall_Unit_RID_Long_RID( mb, this.ptr, immediate, primitive, texture)
  }

  fun immediateClear(immediate: RID) {
    val mb = getMethodBind("VisualServer","immediate_clear")
    _icall_Unit_RID( mb, this.ptr, immediate)
  }

  fun immediateColor(immediate: RID, color: Color) {
    val mb = getMethodBind("VisualServer","immediate_color")
    _icall_Unit_RID_Color( mb, this.ptr, immediate, color)
  }

  fun immediateCreate(): RID {
    val mb = getMethodBind("VisualServer","immediate_create")
    return _icall_RID( mb, this.ptr)
  }

  fun immediateEnd(immediate: RID) {
    val mb = getMethodBind("VisualServer","immediate_end")
    _icall_Unit_RID( mb, this.ptr, immediate)
  }

  fun immediateGetMaterial(immediate: RID): RID {
    val mb = getMethodBind("VisualServer","immediate_get_material")
    return _icall_RID_RID( mb, this.ptr, immediate)
  }

  fun immediateNormal(immediate: RID, normal: Vector3) {
    val mb = getMethodBind("VisualServer","immediate_normal")
    _icall_Unit_RID_Vector3( mb, this.ptr, immediate, normal)
  }

  fun immediateSetMaterial(immediate: RID, material: RID) {
    val mb = getMethodBind("VisualServer","immediate_set_material")
    _icall_Unit_RID_RID( mb, this.ptr, immediate, material)
  }

  fun immediateTangent(immediate: RID, tangent: Plane) {
    val mb = getMethodBind("VisualServer","immediate_tangent")
    _icall_Unit_RID_Plane( mb, this.ptr, immediate, tangent)
  }

  fun immediateUv(immediate: RID, texUv: Vector2) {
    val mb = getMethodBind("VisualServer","immediate_uv")
    _icall_Unit_RID_Vector2( mb, this.ptr, immediate, texUv)
  }

  fun immediateUv2(immediate: RID, texUv: Vector2) {
    val mb = getMethodBind("VisualServer","immediate_uv2")
    _icall_Unit_RID_Vector2( mb, this.ptr, immediate, texUv)
  }

  fun immediateVertex(immediate: RID, vertex: Vector3) {
    val mb = getMethodBind("VisualServer","immediate_vertex")
    _icall_Unit_RID_Vector3( mb, this.ptr, immediate, vertex)
  }

  fun immediateVertex2d(immediate: RID, vertex: Vector2) {
    val mb = getMethodBind("VisualServer","immediate_vertex_2d")
    _icall_Unit_RID_Vector2( mb, this.ptr, immediate, vertex)
  }

  fun init() {
    val mb = getMethodBind("VisualServer","init")
    _icall_Unit( mb, this.ptr)
  }

  fun instanceAttachObjectInstanceId(instance: RID, id: Long) {
    val mb = getMethodBind("VisualServer","instance_attach_object_instance_id")
    _icall_Unit_RID_Long( mb, this.ptr, instance, id)
  }

  fun instanceAttachSkeleton(instance: RID, skeleton: RID) {
    val mb = getMethodBind("VisualServer","instance_attach_skeleton")
    _icall_Unit_RID_RID( mb, this.ptr, instance, skeleton)
  }

  fun instanceCreate(): RID {
    val mb = getMethodBind("VisualServer","instance_create")
    return _icall_RID( mb, this.ptr)
  }

  fun instanceCreate2(base: RID, scenario: RID): RID {
    val mb = getMethodBind("VisualServer","instance_create2")
    return _icall_RID_RID_RID( mb, this.ptr, base, scenario)
  }

  fun instanceGeometrySetAsInstanceLod(instance: RID, asLodOfInstance: RID) {
    val mb = getMethodBind("VisualServer","instance_geometry_set_as_instance_lod")
    _icall_Unit_RID_RID( mb, this.ptr, instance, asLodOfInstance)
  }

  fun instanceGeometrySetCastShadowsSetting(instance: RID, shadowCastingSetting: Long) {
    val mb = getMethodBind("VisualServer","instance_geometry_set_cast_shadows_setting")
    _icall_Unit_RID_Long( mb, this.ptr, instance, shadowCastingSetting)
  }

  fun instanceGeometrySetDrawRange(
    instance: RID,
    min: Double,
    max: Double,
    minMargin: Double,
    maxMargin: Double
  ) {
    val mb = getMethodBind("VisualServer","instance_geometry_set_draw_range")
    _icall_Unit_RID_Double_Double_Double_Double( mb, this.ptr, instance, min, max, minMargin,
        maxMargin)
  }

  fun instanceGeometrySetFlag(
    instance: RID,
    flag: Long,
    enabled: Boolean
  ) {
    val mb = getMethodBind("VisualServer","instance_geometry_set_flag")
    _icall_Unit_RID_Long_Boolean( mb, this.ptr, instance, flag, enabled)
  }

  fun instanceGeometrySetMaterialOverride(instance: RID, material: RID) {
    val mb = getMethodBind("VisualServer","instance_geometry_set_material_override")
    _icall_Unit_RID_RID( mb, this.ptr, instance, material)
  }

  fun instanceSetBase(instance: RID, base: RID) {
    val mb = getMethodBind("VisualServer","instance_set_base")
    _icall_Unit_RID_RID( mb, this.ptr, instance, base)
  }

  fun instanceSetBlendShapeWeight(
    instance: RID,
    shape: Long,
    weight: Double
  ) {
    val mb = getMethodBind("VisualServer","instance_set_blend_shape_weight")
    _icall_Unit_RID_Long_Double( mb, this.ptr, instance, shape, weight)
  }

  fun instanceSetCustomAabb(instance: RID, aabb: AABB) {
    val mb = getMethodBind("VisualServer","instance_set_custom_aabb")
    _icall_Unit_RID_AABB( mb, this.ptr, instance, aabb)
  }

  fun instanceSetExterior(instance: RID, enabled: Boolean) {
    val mb = getMethodBind("VisualServer","instance_set_exterior")
    _icall_Unit_RID_Boolean( mb, this.ptr, instance, enabled)
  }

  fun instanceSetExtraVisibilityMargin(instance: RID, margin: Double) {
    val mb = getMethodBind("VisualServer","instance_set_extra_visibility_margin")
    _icall_Unit_RID_Double( mb, this.ptr, instance, margin)
  }

  fun instanceSetLayerMask(instance: RID, mask: Long) {
    val mb = getMethodBind("VisualServer","instance_set_layer_mask")
    _icall_Unit_RID_Long( mb, this.ptr, instance, mask)
  }

  fun instanceSetScenario(instance: RID, scenario: RID) {
    val mb = getMethodBind("VisualServer","instance_set_scenario")
    _icall_Unit_RID_RID( mb, this.ptr, instance, scenario)
  }

  fun instanceSetSurfaceMaterial(
    instance: RID,
    surface: Long,
    material: RID
  ) {
    val mb = getMethodBind("VisualServer","instance_set_surface_material")
    _icall_Unit_RID_Long_RID( mb, this.ptr, instance, surface, material)
  }

  fun instanceSetTransform(instance: RID, transform: Transform) {
    val mb = getMethodBind("VisualServer","instance_set_transform")
    _icall_Unit_RID_Transform( mb, this.ptr, instance, transform)
  }

  fun instanceSetUseLightmap(
    instance: RID,
    lightmapInstance: RID,
    lightmap: RID
  ) {
    val mb = getMethodBind("VisualServer","instance_set_use_lightmap")
    _icall_Unit_RID_RID_RID( mb, this.ptr, instance, lightmapInstance, lightmap)
  }

  fun instanceSetVisible(instance: RID, visible: Boolean) {
    val mb = getMethodBind("VisualServer","instance_set_visible")
    _icall_Unit_RID_Boolean( mb, this.ptr, instance, visible)
  }

  fun instancesCullAabb(aabb: AABB, scenario: RID = RID()): VariantArray {
    val mb = getMethodBind("VisualServer","instances_cull_aabb")
    return _icall_VariantArray_AABB_RID( mb, this.ptr, aabb, scenario)
  }

  fun instancesCullConvex(convex: VariantArray, scenario: RID = RID()): VariantArray {
    val mb = getMethodBind("VisualServer","instances_cull_convex")
    return _icall_VariantArray_VariantArray_RID( mb, this.ptr, convex, scenario)
  }

  fun instancesCullRay(
    from: Vector3,
    to: Vector3,
    scenario: RID = RID()
  ): VariantArray {
    val mb = getMethodBind("VisualServer","instances_cull_ray")
    return _icall_VariantArray_Vector3_Vector3_RID( mb, this.ptr, from, to, scenario)
  }

  fun lightDirectionalSetBlendSplits(light: RID, enable: Boolean) {
    val mb = getMethodBind("VisualServer","light_directional_set_blend_splits")
    _icall_Unit_RID_Boolean( mb, this.ptr, light, enable)
  }

  fun lightDirectionalSetShadowDepthRangeMode(light: RID, rangeMode: Long) {
    val mb = getMethodBind("VisualServer","light_directional_set_shadow_depth_range_mode")
    _icall_Unit_RID_Long( mb, this.ptr, light, rangeMode)
  }

  fun lightDirectionalSetShadowMode(light: RID, mode: Long) {
    val mb = getMethodBind("VisualServer","light_directional_set_shadow_mode")
    _icall_Unit_RID_Long( mb, this.ptr, light, mode)
  }

  fun lightOmniSetShadowDetail(light: RID, detail: Long) {
    val mb = getMethodBind("VisualServer","light_omni_set_shadow_detail")
    _icall_Unit_RID_Long( mb, this.ptr, light, detail)
  }

  fun lightOmniSetShadowMode(light: RID, mode: Long) {
    val mb = getMethodBind("VisualServer","light_omni_set_shadow_mode")
    _icall_Unit_RID_Long( mb, this.ptr, light, mode)
  }

  fun lightSetColor(light: RID, color: Color) {
    val mb = getMethodBind("VisualServer","light_set_color")
    _icall_Unit_RID_Color( mb, this.ptr, light, color)
  }

  fun lightSetCullMask(light: RID, mask: Long) {
    val mb = getMethodBind("VisualServer","light_set_cull_mask")
    _icall_Unit_RID_Long( mb, this.ptr, light, mask)
  }

  fun lightSetNegative(light: RID, enable: Boolean) {
    val mb = getMethodBind("VisualServer","light_set_negative")
    _icall_Unit_RID_Boolean( mb, this.ptr, light, enable)
  }

  fun lightSetParam(
    light: RID,
    param: Long,
    value: Double
  ) {
    val mb = getMethodBind("VisualServer","light_set_param")
    _icall_Unit_RID_Long_Double( mb, this.ptr, light, param, value)
  }

  fun lightSetProjector(light: RID, texture: RID) {
    val mb = getMethodBind("VisualServer","light_set_projector")
    _icall_Unit_RID_RID( mb, this.ptr, light, texture)
  }

  fun lightSetReverseCullFaceMode(light: RID, enabled: Boolean) {
    val mb = getMethodBind("VisualServer","light_set_reverse_cull_face_mode")
    _icall_Unit_RID_Boolean( mb, this.ptr, light, enabled)
  }

  fun lightSetShadow(light: RID, enabled: Boolean) {
    val mb = getMethodBind("VisualServer","light_set_shadow")
    _icall_Unit_RID_Boolean( mb, this.ptr, light, enabled)
  }

  fun lightSetShadowColor(light: RID, color: Color) {
    val mb = getMethodBind("VisualServer","light_set_shadow_color")
    _icall_Unit_RID_Color( mb, this.ptr, light, color)
  }

  fun lightSetUseGi(light: RID, enabled: Boolean) {
    val mb = getMethodBind("VisualServer","light_set_use_gi")
    _icall_Unit_RID_Boolean( mb, this.ptr, light, enabled)
  }

  fun lightmapCaptureCreate(): RID {
    val mb = getMethodBind("VisualServer","lightmap_capture_create")
    return _icall_RID( mb, this.ptr)
  }

  fun lightmapCaptureGetBounds(capture: RID): AABB {
    val mb = getMethodBind("VisualServer","lightmap_capture_get_bounds")
    return _icall_AABB_RID( mb, this.ptr, capture)
  }

  fun lightmapCaptureGetEnergy(capture: RID): Double {
    val mb = getMethodBind("VisualServer","lightmap_capture_get_energy")
    return _icall_Double_RID( mb, this.ptr, capture)
  }

  fun lightmapCaptureGetOctree(capture: RID): PoolByteArray {
    val mb = getMethodBind("VisualServer","lightmap_capture_get_octree")
    return _icall_PoolByteArray_RID( mb, this.ptr, capture)
  }

  fun lightmapCaptureGetOctreeCellSubdiv(capture: RID): Long {
    val mb = getMethodBind("VisualServer","lightmap_capture_get_octree_cell_subdiv")
    return _icall_Long_RID( mb, this.ptr, capture)
  }

  fun lightmapCaptureGetOctreeCellTransform(capture: RID): Transform {
    val mb = getMethodBind("VisualServer","lightmap_capture_get_octree_cell_transform")
    return _icall_Transform_RID( mb, this.ptr, capture)
  }

  fun lightmapCaptureSetBounds(capture: RID, bounds: AABB) {
    val mb = getMethodBind("VisualServer","lightmap_capture_set_bounds")
    _icall_Unit_RID_AABB( mb, this.ptr, capture, bounds)
  }

  fun lightmapCaptureSetEnergy(capture: RID, energy: Double) {
    val mb = getMethodBind("VisualServer","lightmap_capture_set_energy")
    _icall_Unit_RID_Double( mb, this.ptr, capture, energy)
  }

  fun lightmapCaptureSetOctree(capture: RID, octree: PoolByteArray) {
    val mb = getMethodBind("VisualServer","lightmap_capture_set_octree")
    _icall_Unit_RID_PoolByteArray( mb, this.ptr, capture, octree)
  }

  fun lightmapCaptureSetOctreeCellSubdiv(capture: RID, subdiv: Long) {
    val mb = getMethodBind("VisualServer","lightmap_capture_set_octree_cell_subdiv")
    _icall_Unit_RID_Long( mb, this.ptr, capture, subdiv)
  }

  fun lightmapCaptureSetOctreeCellTransform(capture: RID, xform: Transform) {
    val mb = getMethodBind("VisualServer","lightmap_capture_set_octree_cell_transform")
    _icall_Unit_RID_Transform( mb, this.ptr, capture, xform)
  }

  fun makeSphereMesh(
    latitudes: Long,
    longitudes: Long,
    radius: Double
  ): RID {
    val mb = getMethodBind("VisualServer","make_sphere_mesh")
    return _icall_RID_Long_Long_Double( mb, this.ptr, latitudes, longitudes, radius)
  }

  fun materialCreate(): RID {
    val mb = getMethodBind("VisualServer","material_create")
    return _icall_RID( mb, this.ptr)
  }

  fun materialGetParam(material: RID, parameter: String): Variant {
    val mb = getMethodBind("VisualServer","material_get_param")
    return _icall_Variant_RID_String( mb, this.ptr, material, parameter)
  }

  fun materialGetParamDefault(material: RID, parameter: String): Variant {
    val mb = getMethodBind("VisualServer","material_get_param_default")
    return _icall_Variant_RID_String( mb, this.ptr, material, parameter)
  }

  fun materialGetShader(shaderMaterial: RID): RID {
    val mb = getMethodBind("VisualServer","material_get_shader")
    return _icall_RID_RID( mb, this.ptr, shaderMaterial)
  }

  fun materialSetLineWidth(material: RID, width: Double) {
    val mb = getMethodBind("VisualServer","material_set_line_width")
    _icall_Unit_RID_Double( mb, this.ptr, material, width)
  }

  fun materialSetNextPass(material: RID, nextMaterial: RID) {
    val mb = getMethodBind("VisualServer","material_set_next_pass")
    _icall_Unit_RID_RID( mb, this.ptr, material, nextMaterial)
  }

  fun materialSetParam(
    material: RID,
    parameter: String,
    value: Variant
  ) {
    val mb = getMethodBind("VisualServer","material_set_param")
    _icall_Unit_RID_String_Variant( mb, this.ptr, material, parameter, value)
  }

  fun materialSetRenderPriority(material: RID, priority: Long) {
    val mb = getMethodBind("VisualServer","material_set_render_priority")
    _icall_Unit_RID_Long( mb, this.ptr, material, priority)
  }

  fun materialSetShader(shaderMaterial: RID, shader: RID) {
    val mb = getMethodBind("VisualServer","material_set_shader")
    _icall_Unit_RID_RID( mb, this.ptr, shaderMaterial, shader)
  }

  fun meshAddSurfaceFromArrays(
    mesh: RID,
    primitive: Long,
    arrays: VariantArray,
    blendShapes: VariantArray = VariantArray(),
    compressFormat: Long = 97280
  ) {
    val mb = getMethodBind("VisualServer","mesh_add_surface_from_arrays")
    _icall_Unit_RID_Long_VariantArray_VariantArray_Long( mb, this.ptr, mesh, primitive, arrays,
        blendShapes, compressFormat)
  }

  fun meshClear(mesh: RID) {
    val mb = getMethodBind("VisualServer","mesh_clear")
    _icall_Unit_RID( mb, this.ptr, mesh)
  }

  fun meshCreate(): RID {
    val mb = getMethodBind("VisualServer","mesh_create")
    return _icall_RID( mb, this.ptr)
  }

  fun meshGetBlendShapeCount(mesh: RID): Long {
    val mb = getMethodBind("VisualServer","mesh_get_blend_shape_count")
    return _icall_Long_RID( mb, this.ptr, mesh)
  }

  fun meshGetBlendShapeMode(mesh: RID): VisualServer.BlendShapeMode {
    val mb = getMethodBind("VisualServer","mesh_get_blend_shape_mode")
    return VisualServer.BlendShapeMode.from( _icall_Long_RID( mb, this.ptr, mesh))
  }

  fun meshGetCustomAabb(mesh: RID): AABB {
    val mb = getMethodBind("VisualServer","mesh_get_custom_aabb")
    return _icall_AABB_RID( mb, this.ptr, mesh)
  }

  fun meshGetSurfaceCount(mesh: RID): Long {
    val mb = getMethodBind("VisualServer","mesh_get_surface_count")
    return _icall_Long_RID( mb, this.ptr, mesh)
  }

  fun meshRemoveSurface(mesh: RID, index: Long) {
    val mb = getMethodBind("VisualServer","mesh_remove_surface")
    _icall_Unit_RID_Long( mb, this.ptr, mesh, index)
  }

  fun meshSetBlendShapeCount(mesh: RID, amount: Long) {
    val mb = getMethodBind("VisualServer","mesh_set_blend_shape_count")
    _icall_Unit_RID_Long( mb, this.ptr, mesh, amount)
  }

  fun meshSetBlendShapeMode(mesh: RID, mode: Long) {
    val mb = getMethodBind("VisualServer","mesh_set_blend_shape_mode")
    _icall_Unit_RID_Long( mb, this.ptr, mesh, mode)
  }

  fun meshSetCustomAabb(mesh: RID, aabb: AABB) {
    val mb = getMethodBind("VisualServer","mesh_set_custom_aabb")
    _icall_Unit_RID_AABB( mb, this.ptr, mesh, aabb)
  }

  fun meshSurfaceGetAabb(mesh: RID, surface: Long): AABB {
    val mb = getMethodBind("VisualServer","mesh_surface_get_aabb")
    return _icall_AABB_RID_Long( mb, this.ptr, mesh, surface)
  }

  fun meshSurfaceGetArray(mesh: RID, surface: Long): PoolByteArray {
    val mb = getMethodBind("VisualServer","mesh_surface_get_array")
    return _icall_PoolByteArray_RID_Long( mb, this.ptr, mesh, surface)
  }

  fun meshSurfaceGetArrayIndexLen(mesh: RID, surface: Long): Long {
    val mb = getMethodBind("VisualServer","mesh_surface_get_array_index_len")
    return _icall_Long_RID_Long( mb, this.ptr, mesh, surface)
  }

  fun meshSurfaceGetArrayLen(mesh: RID, surface: Long): Long {
    val mb = getMethodBind("VisualServer","mesh_surface_get_array_len")
    return _icall_Long_RID_Long( mb, this.ptr, mesh, surface)
  }

  fun meshSurfaceGetArrays(mesh: RID, surface: Long): VariantArray {
    val mb = getMethodBind("VisualServer","mesh_surface_get_arrays")
    return _icall_VariantArray_RID_Long( mb, this.ptr, mesh, surface)
  }

  fun meshSurfaceGetBlendShapeArrays(mesh: RID, surface: Long): VariantArray {
    val mb = getMethodBind("VisualServer","mesh_surface_get_blend_shape_arrays")
    return _icall_VariantArray_RID_Long( mb, this.ptr, mesh, surface)
  }

  fun meshSurfaceGetFormat(mesh: RID, surface: Long): Long {
    val mb = getMethodBind("VisualServer","mesh_surface_get_format")
    return _icall_Long_RID_Long( mb, this.ptr, mesh, surface)
  }

  fun meshSurfaceGetFormatOffset(
    format: Long,
    vertexLen: Long,
    indexLen: Long,
    arrayIndex: Long
  ): Long {
    val mb = getMethodBind("VisualServer","mesh_surface_get_format_offset")
    return _icall_Long_Long_Long_Long_Long( mb, this.ptr, format, vertexLen, indexLen, arrayIndex)
  }

  fun meshSurfaceGetFormatStride(
    format: Long,
    vertexLen: Long,
    indexLen: Long
  ): Long {
    val mb = getMethodBind("VisualServer","mesh_surface_get_format_stride")
    return _icall_Long_Long_Long_Long( mb, this.ptr, format, vertexLen, indexLen)
  }

  fun meshSurfaceGetIndexArray(mesh: RID, surface: Long): PoolByteArray {
    val mb = getMethodBind("VisualServer","mesh_surface_get_index_array")
    return _icall_PoolByteArray_RID_Long( mb, this.ptr, mesh, surface)
  }

  fun meshSurfaceGetMaterial(mesh: RID, surface: Long): RID {
    val mb = getMethodBind("VisualServer","mesh_surface_get_material")
    return _icall_RID_RID_Long( mb, this.ptr, mesh, surface)
  }

  fun meshSurfaceGetPrimitiveType(mesh: RID, surface: Long): VisualServer.PrimitiveType {
    val mb = getMethodBind("VisualServer","mesh_surface_get_primitive_type")
    return VisualServer.PrimitiveType.from( _icall_Long_RID_Long( mb, this.ptr, mesh, surface))
  }

  fun meshSurfaceGetSkeletonAabb(mesh: RID, surface: Long): VariantArray {
    val mb = getMethodBind("VisualServer","mesh_surface_get_skeleton_aabb")
    return _icall_VariantArray_RID_Long( mb, this.ptr, mesh, surface)
  }

  fun meshSurfaceSetMaterial(
    mesh: RID,
    surface: Long,
    material: RID
  ) {
    val mb = getMethodBind("VisualServer","mesh_surface_set_material")
    _icall_Unit_RID_Long_RID( mb, this.ptr, mesh, surface, material)
  }

  fun meshSurfaceUpdateRegion(
    mesh: RID,
    surface: Long,
    offset: Long,
    data: PoolByteArray
  ) {
    val mb = getMethodBind("VisualServer","mesh_surface_update_region")
    _icall_Unit_RID_Long_Long_PoolByteArray( mb, this.ptr, mesh, surface, offset, data)
  }

  fun multimeshAllocate(
    multimesh: RID,
    instances: Long,
    transformFormat: Long,
    colorFormat: Long,
    customDataFormat: Long = 0
  ) {
    val mb = getMethodBind("VisualServer","multimesh_allocate")
    _icall_Unit_RID_Long_Long_Long_Long( mb, this.ptr, multimesh, instances, transformFormat,
        colorFormat, customDataFormat)
  }

  fun multimeshCreate(): RID {
    val mb = getMethodBind("VisualServer","multimesh_create")
    return _icall_RID( mb, this.ptr)
  }

  fun multimeshGetAabb(multimesh: RID): AABB {
    val mb = getMethodBind("VisualServer","multimesh_get_aabb")
    return _icall_AABB_RID( mb, this.ptr, multimesh)
  }

  fun multimeshGetInstanceCount(multimesh: RID): Long {
    val mb = getMethodBind("VisualServer","multimesh_get_instance_count")
    return _icall_Long_RID( mb, this.ptr, multimesh)
  }

  fun multimeshGetMesh(multimesh: RID): RID {
    val mb = getMethodBind("VisualServer","multimesh_get_mesh")
    return _icall_RID_RID( mb, this.ptr, multimesh)
  }

  fun multimeshGetVisibleInstances(multimesh: RID): Long {
    val mb = getMethodBind("VisualServer","multimesh_get_visible_instances")
    return _icall_Long_RID( mb, this.ptr, multimesh)
  }

  fun multimeshInstanceGetColor(multimesh: RID, index: Long): Color {
    val mb = getMethodBind("VisualServer","multimesh_instance_get_color")
    return _icall_Color_RID_Long( mb, this.ptr, multimesh, index)
  }

  fun multimeshInstanceGetCustomData(multimesh: RID, index: Long): Color {
    val mb = getMethodBind("VisualServer","multimesh_instance_get_custom_data")
    return _icall_Color_RID_Long( mb, this.ptr, multimesh, index)
  }

  fun multimeshInstanceGetTransform(multimesh: RID, index: Long): Transform {
    val mb = getMethodBind("VisualServer","multimesh_instance_get_transform")
    return _icall_Transform_RID_Long( mb, this.ptr, multimesh, index)
  }

  fun multimeshInstanceGetTransform2d(multimesh: RID, index: Long): Transform2D {
    val mb = getMethodBind("VisualServer","multimesh_instance_get_transform_2d")
    return _icall_Transform2D_RID_Long( mb, this.ptr, multimesh, index)
  }

  fun multimeshInstanceSetColor(
    multimesh: RID,
    index: Long,
    color: Color
  ) {
    val mb = getMethodBind("VisualServer","multimesh_instance_set_color")
    _icall_Unit_RID_Long_Color( mb, this.ptr, multimesh, index, color)
  }

  fun multimeshInstanceSetCustomData(
    multimesh: RID,
    index: Long,
    customData: Color
  ) {
    val mb = getMethodBind("VisualServer","multimesh_instance_set_custom_data")
    _icall_Unit_RID_Long_Color( mb, this.ptr, multimesh, index, customData)
  }

  fun multimeshInstanceSetTransform(
    multimesh: RID,
    index: Long,
    transform: Transform
  ) {
    val mb = getMethodBind("VisualServer","multimesh_instance_set_transform")
    _icall_Unit_RID_Long_Transform( mb, this.ptr, multimesh, index, transform)
  }

  fun multimeshInstanceSetTransform2d(
    multimesh: RID,
    index: Long,
    transform: Transform2D
  ) {
    val mb = getMethodBind("VisualServer","multimesh_instance_set_transform_2d")
    _icall_Unit_RID_Long_Transform2D( mb, this.ptr, multimesh, index, transform)
  }

  fun multimeshSetAsBulkArray(multimesh: RID, array: PoolRealArray) {
    val mb = getMethodBind("VisualServer","multimesh_set_as_bulk_array")
    _icall_Unit_RID_PoolRealArray( mb, this.ptr, multimesh, array)
  }

  fun multimeshSetMesh(multimesh: RID, mesh: RID) {
    val mb = getMethodBind("VisualServer","multimesh_set_mesh")
    _icall_Unit_RID_RID( mb, this.ptr, multimesh, mesh)
  }

  fun multimeshSetVisibleInstances(multimesh: RID, visible: Long) {
    val mb = getMethodBind("VisualServer","multimesh_set_visible_instances")
    _icall_Unit_RID_Long( mb, this.ptr, multimesh, visible)
  }

  fun omniLightCreate(): RID {
    val mb = getMethodBind("VisualServer","omni_light_create")
    return _icall_RID( mb, this.ptr)
  }

  fun particlesCreate(): RID {
    val mb = getMethodBind("VisualServer","particles_create")
    return _icall_RID( mb, this.ptr)
  }

  fun particlesGetCurrentAabb(particles: RID): AABB {
    val mb = getMethodBind("VisualServer","particles_get_current_aabb")
    return _icall_AABB_RID( mb, this.ptr, particles)
  }

  fun particlesGetEmitting(particles: RID): Boolean {
    val mb = getMethodBind("VisualServer","particles_get_emitting")
    return _icall_Boolean_RID( mb, this.ptr, particles)
  }

  fun particlesIsInactive(particles: RID): Boolean {
    val mb = getMethodBind("VisualServer","particles_is_inactive")
    return _icall_Boolean_RID( mb, this.ptr, particles)
  }

  fun particlesRequestProcess(particles: RID) {
    val mb = getMethodBind("VisualServer","particles_request_process")
    _icall_Unit_RID( mb, this.ptr, particles)
  }

  fun particlesRestart(particles: RID) {
    val mb = getMethodBind("VisualServer","particles_restart")
    _icall_Unit_RID( mb, this.ptr, particles)
  }

  fun particlesSetAmount(particles: RID, amount: Long) {
    val mb = getMethodBind("VisualServer","particles_set_amount")
    _icall_Unit_RID_Long( mb, this.ptr, particles, amount)
  }

  fun particlesSetCustomAabb(particles: RID, aabb: AABB) {
    val mb = getMethodBind("VisualServer","particles_set_custom_aabb")
    _icall_Unit_RID_AABB( mb, this.ptr, particles, aabb)
  }

  fun particlesSetDrawOrder(particles: RID, order: Long) {
    val mb = getMethodBind("VisualServer","particles_set_draw_order")
    _icall_Unit_RID_Long( mb, this.ptr, particles, order)
  }

  fun particlesSetDrawPassMesh(
    particles: RID,
    pass: Long,
    mesh: RID
  ) {
    val mb = getMethodBind("VisualServer","particles_set_draw_pass_mesh")
    _icall_Unit_RID_Long_RID( mb, this.ptr, particles, pass, mesh)
  }

  fun particlesSetDrawPasses(particles: RID, count: Long) {
    val mb = getMethodBind("VisualServer","particles_set_draw_passes")
    _icall_Unit_RID_Long( mb, this.ptr, particles, count)
  }

  fun particlesSetEmissionTransform(particles: RID, transform: Transform) {
    val mb = getMethodBind("VisualServer","particles_set_emission_transform")
    _icall_Unit_RID_Transform( mb, this.ptr, particles, transform)
  }

  fun particlesSetEmitting(particles: RID, emitting: Boolean) {
    val mb = getMethodBind("VisualServer","particles_set_emitting")
    _icall_Unit_RID_Boolean( mb, this.ptr, particles, emitting)
  }

  fun particlesSetExplosivenessRatio(particles: RID, ratio: Double) {
    val mb = getMethodBind("VisualServer","particles_set_explosiveness_ratio")
    _icall_Unit_RID_Double( mb, this.ptr, particles, ratio)
  }

  fun particlesSetFixedFps(particles: RID, fps: Long) {
    val mb = getMethodBind("VisualServer","particles_set_fixed_fps")
    _icall_Unit_RID_Long( mb, this.ptr, particles, fps)
  }

  fun particlesSetFractionalDelta(particles: RID, enable: Boolean) {
    val mb = getMethodBind("VisualServer","particles_set_fractional_delta")
    _icall_Unit_RID_Boolean( mb, this.ptr, particles, enable)
  }

  fun particlesSetLifetime(particles: RID, lifetime: Double) {
    val mb = getMethodBind("VisualServer","particles_set_lifetime")
    _icall_Unit_RID_Double( mb, this.ptr, particles, lifetime)
  }

  fun particlesSetOneShot(particles: RID, oneShot: Boolean) {
    val mb = getMethodBind("VisualServer","particles_set_one_shot")
    _icall_Unit_RID_Boolean( mb, this.ptr, particles, oneShot)
  }

  fun particlesSetPreProcessTime(particles: RID, time: Double) {
    val mb = getMethodBind("VisualServer","particles_set_pre_process_time")
    _icall_Unit_RID_Double( mb, this.ptr, particles, time)
  }

  fun particlesSetProcessMaterial(particles: RID, material: RID) {
    val mb = getMethodBind("VisualServer","particles_set_process_material")
    _icall_Unit_RID_RID( mb, this.ptr, particles, material)
  }

  fun particlesSetRandomnessRatio(particles: RID, ratio: Double) {
    val mb = getMethodBind("VisualServer","particles_set_randomness_ratio")
    _icall_Unit_RID_Double( mb, this.ptr, particles, ratio)
  }

  fun particlesSetSpeedScale(particles: RID, scale: Double) {
    val mb = getMethodBind("VisualServer","particles_set_speed_scale")
    _icall_Unit_RID_Double( mb, this.ptr, particles, scale)
  }

  fun particlesSetUseLocalCoordinates(particles: RID, enable: Boolean) {
    val mb = getMethodBind("VisualServer","particles_set_use_local_coordinates")
    _icall_Unit_RID_Boolean( mb, this.ptr, particles, enable)
  }

  fun reflectionProbeCreate(): RID {
    val mb = getMethodBind("VisualServer","reflection_probe_create")
    return _icall_RID( mb, this.ptr)
  }

  fun reflectionProbeSetAsInterior(probe: RID, enable: Boolean) {
    val mb = getMethodBind("VisualServer","reflection_probe_set_as_interior")
    _icall_Unit_RID_Boolean( mb, this.ptr, probe, enable)
  }

  fun reflectionProbeSetCullMask(probe: RID, layers: Long) {
    val mb = getMethodBind("VisualServer","reflection_probe_set_cull_mask")
    _icall_Unit_RID_Long( mb, this.ptr, probe, layers)
  }

  fun reflectionProbeSetEnableBoxProjection(probe: RID, enable: Boolean) {
    val mb = getMethodBind("VisualServer","reflection_probe_set_enable_box_projection")
    _icall_Unit_RID_Boolean( mb, this.ptr, probe, enable)
  }

  fun reflectionProbeSetEnableShadows(probe: RID, enable: Boolean) {
    val mb = getMethodBind("VisualServer","reflection_probe_set_enable_shadows")
    _icall_Unit_RID_Boolean( mb, this.ptr, probe, enable)
  }

  fun reflectionProbeSetExtents(probe: RID, extents: Vector3) {
    val mb = getMethodBind("VisualServer","reflection_probe_set_extents")
    _icall_Unit_RID_Vector3( mb, this.ptr, probe, extents)
  }

  fun reflectionProbeSetIntensity(probe: RID, intensity: Double) {
    val mb = getMethodBind("VisualServer","reflection_probe_set_intensity")
    _icall_Unit_RID_Double( mb, this.ptr, probe, intensity)
  }

  fun reflectionProbeSetInteriorAmbient(probe: RID, color: Color) {
    val mb = getMethodBind("VisualServer","reflection_probe_set_interior_ambient")
    _icall_Unit_RID_Color( mb, this.ptr, probe, color)
  }

  fun reflectionProbeSetInteriorAmbientEnergy(probe: RID, energy: Double) {
    val mb = getMethodBind("VisualServer","reflection_probe_set_interior_ambient_energy")
    _icall_Unit_RID_Double( mb, this.ptr, probe, energy)
  }

  fun reflectionProbeSetInteriorAmbientProbeContribution(probe: RID, contrib: Double) {
    val mb =
        getMethodBind("VisualServer","reflection_probe_set_interior_ambient_probe_contribution")
    _icall_Unit_RID_Double( mb, this.ptr, probe, contrib)
  }

  fun reflectionProbeSetMaxDistance(probe: RID, distance: Double) {
    val mb = getMethodBind("VisualServer","reflection_probe_set_max_distance")
    _icall_Unit_RID_Double( mb, this.ptr, probe, distance)
  }

  fun reflectionProbeSetOriginOffset(probe: RID, offset: Vector3) {
    val mb = getMethodBind("VisualServer","reflection_probe_set_origin_offset")
    _icall_Unit_RID_Vector3( mb, this.ptr, probe, offset)
  }

  fun reflectionProbeSetUpdateMode(probe: RID, mode: Long) {
    val mb = getMethodBind("VisualServer","reflection_probe_set_update_mode")
    _icall_Unit_RID_Long( mb, this.ptr, probe, mode)
  }

  fun requestFrameDrawnCallback(
    where: Object,
    method: String,
    userdata: Variant
  ) {
    val mb = getMethodBind("VisualServer","request_frame_drawn_callback")
    _icall_Unit_Object_String_Variant( mb, this.ptr, where, method, userdata)
  }

  fun scenarioCreate(): RID {
    val mb = getMethodBind("VisualServer","scenario_create")
    return _icall_RID( mb, this.ptr)
  }

  fun scenarioSetDebug(scenario: RID, debugMode: Long) {
    val mb = getMethodBind("VisualServer","scenario_set_debug")
    _icall_Unit_RID_Long( mb, this.ptr, scenario, debugMode)
  }

  fun scenarioSetEnvironment(scenario: RID, environment: RID) {
    val mb = getMethodBind("VisualServer","scenario_set_environment")
    _icall_Unit_RID_RID( mb, this.ptr, scenario, environment)
  }

  fun scenarioSetFallbackEnvironment(scenario: RID, environment: RID) {
    val mb = getMethodBind("VisualServer","scenario_set_fallback_environment")
    _icall_Unit_RID_RID( mb, this.ptr, scenario, environment)
  }

  fun scenarioSetReflectionAtlasSize(
    scenario: RID,
    size: Long,
    subdiv: Long
  ) {
    val mb = getMethodBind("VisualServer","scenario_set_reflection_atlas_size")
    _icall_Unit_RID_Long_Long( mb, this.ptr, scenario, size, subdiv)
  }

  fun setBootImage(
    image: Image,
    color: Color,
    scale: Boolean,
    useFilter: Boolean = true
  ) {
    val mb = getMethodBind("VisualServer","set_boot_image")
    _icall_Unit_Object_Color_Boolean_Boolean( mb, this.ptr, image, color, scale, useFilter)
  }

  fun setDebugGenerateWireframes(generate: Boolean) {
    val mb = getMethodBind("VisualServer","set_debug_generate_wireframes")
    _icall_Unit_Boolean( mb, this.ptr, generate)
  }

  fun setDefaultClearColor(color: Color) {
    val mb = getMethodBind("VisualServer","set_default_clear_color")
    _icall_Unit_Color( mb, this.ptr, color)
  }

  fun shaderCreate(): RID {
    val mb = getMethodBind("VisualServer","shader_create")
    return _icall_RID( mb, this.ptr)
  }

  fun shaderGetCode(shader: RID): String {
    val mb = getMethodBind("VisualServer","shader_get_code")
    return _icall_String_RID( mb, this.ptr, shader)
  }

  fun shaderGetDefaultTextureParam(shader: RID, name: String): RID {
    val mb = getMethodBind("VisualServer","shader_get_default_texture_param")
    return _icall_RID_RID_String( mb, this.ptr, shader, name)
  }

  fun shaderGetParamList(shader: RID): VariantArray {
    val mb = getMethodBind("VisualServer","shader_get_param_list")
    return _icall_VariantArray_RID( mb, this.ptr, shader)
  }

  fun shaderSetCode(shader: RID, code: String) {
    val mb = getMethodBind("VisualServer","shader_set_code")
    _icall_Unit_RID_String( mb, this.ptr, shader, code)
  }

  fun shaderSetDefaultTextureParam(
    shader: RID,
    name: String,
    texture: RID
  ) {
    val mb = getMethodBind("VisualServer","shader_set_default_texture_param")
    _icall_Unit_RID_String_RID( mb, this.ptr, shader, name, texture)
  }

  fun skeletonAllocate(
    skeleton: RID,
    bones: Long,
    is2dSkeleton: Boolean = false
  ) {
    val mb = getMethodBind("VisualServer","skeleton_allocate")
    _icall_Unit_RID_Long_Boolean( mb, this.ptr, skeleton, bones, is2dSkeleton)
  }

  fun skeletonBoneGetTransform(skeleton: RID, bone: Long): Transform {
    val mb = getMethodBind("VisualServer","skeleton_bone_get_transform")
    return _icall_Transform_RID_Long( mb, this.ptr, skeleton, bone)
  }

  fun skeletonBoneGetTransform2d(skeleton: RID, bone: Long): Transform2D {
    val mb = getMethodBind("VisualServer","skeleton_bone_get_transform_2d")
    return _icall_Transform2D_RID_Long( mb, this.ptr, skeleton, bone)
  }

  fun skeletonBoneSetTransform(
    skeleton: RID,
    bone: Long,
    transform: Transform
  ) {
    val mb = getMethodBind("VisualServer","skeleton_bone_set_transform")
    _icall_Unit_RID_Long_Transform( mb, this.ptr, skeleton, bone, transform)
  }

  fun skeletonBoneSetTransform2d(
    skeleton: RID,
    bone: Long,
    transform: Transform2D
  ) {
    val mb = getMethodBind("VisualServer","skeleton_bone_set_transform_2d")
    _icall_Unit_RID_Long_Transform2D( mb, this.ptr, skeleton, bone, transform)
  }

  fun skeletonCreate(): RID {
    val mb = getMethodBind("VisualServer","skeleton_create")
    return _icall_RID( mb, this.ptr)
  }

  fun skeletonGetBoneCount(skeleton: RID): Long {
    val mb = getMethodBind("VisualServer","skeleton_get_bone_count")
    return _icall_Long_RID( mb, this.ptr, skeleton)
  }

  fun skyCreate(): RID {
    val mb = getMethodBind("VisualServer","sky_create")
    return _icall_RID( mb, this.ptr)
  }

  fun skySetTexture(
    sky: RID,
    cubeMap: RID,
    radianceSize: Long
  ) {
    val mb = getMethodBind("VisualServer","sky_set_texture")
    _icall_Unit_RID_RID_Long( mb, this.ptr, sky, cubeMap, radianceSize)
  }

  fun spotLightCreate(): RID {
    val mb = getMethodBind("VisualServer","spot_light_create")
    return _icall_RID( mb, this.ptr)
  }

  fun sync() {
    val mb = getMethodBind("VisualServer","sync")
    _icall_Unit( mb, this.ptr)
  }

  fun textureAllocate(
    texture: RID,
    width: Long,
    height: Long,
    depth3d: Long,
    format: Long,
    type: Long,
    flags: Long = 7
  ) {
    val mb = getMethodBind("VisualServer","texture_allocate")
    _icall_Unit_RID_Long_Long_Long_Long_Long_Long( mb, this.ptr, texture, width, height, depth3d,
        format, type, flags)
  }

  fun textureBind(texture: RID, number: Long) {
    val mb = getMethodBind("VisualServer","texture_bind")
    _icall_Unit_RID_Long( mb, this.ptr, texture, number)
  }

  fun textureCreate(): RID {
    val mb = getMethodBind("VisualServer","texture_create")
    return _icall_RID( mb, this.ptr)
  }

  fun textureCreateFromImage(image: Image, flags: Long = 7): RID {
    val mb = getMethodBind("VisualServer","texture_create_from_image")
    return _icall_RID_Object_Long( mb, this.ptr, image, flags)
  }

  fun textureDebugUsage(): VariantArray {
    val mb = getMethodBind("VisualServer","texture_debug_usage")
    return _icall_VariantArray( mb, this.ptr)
  }

  fun textureGetData(texture: RID, cubeSide: Long = 0): Image {
    val mb = getMethodBind("VisualServer","texture_get_data")
    return _icall_Image_RID_Long( mb, this.ptr, texture, cubeSide)
  }

  fun textureGetDepth(texture: RID): Long {
    val mb = getMethodBind("VisualServer","texture_get_depth")
    return _icall_Long_RID( mb, this.ptr, texture)
  }

  fun textureGetFlags(texture: RID): Long {
    val mb = getMethodBind("VisualServer","texture_get_flags")
    return _icall_Long_RID( mb, this.ptr, texture)
  }

  fun textureGetFormat(texture: RID): Image.Format {
    val mb = getMethodBind("VisualServer","texture_get_format")
    return Image.Format.from( _icall_Long_RID( mb, this.ptr, texture))
  }

  fun textureGetHeight(texture: RID): Long {
    val mb = getMethodBind("VisualServer","texture_get_height")
    return _icall_Long_RID( mb, this.ptr, texture)
  }

  fun textureGetPath(texture: RID): String {
    val mb = getMethodBind("VisualServer","texture_get_path")
    return _icall_String_RID( mb, this.ptr, texture)
  }

  fun textureGetTexid(texture: RID): Long {
    val mb = getMethodBind("VisualServer","texture_get_texid")
    return _icall_Long_RID( mb, this.ptr, texture)
  }

  fun textureGetType(texture: RID): VisualServer.TextureType {
    val mb = getMethodBind("VisualServer","texture_get_type")
    return VisualServer.TextureType.from( _icall_Long_RID( mb, this.ptr, texture))
  }

  fun textureGetWidth(texture: RID): Long {
    val mb = getMethodBind("VisualServer","texture_get_width")
    return _icall_Long_RID( mb, this.ptr, texture)
  }

  fun textureSetData(
    texture: RID,
    image: Image,
    layer: Long = 0
  ) {
    val mb = getMethodBind("VisualServer","texture_set_data")
    _icall_Unit_RID_Object_Long( mb, this.ptr, texture, image, layer)
  }

  fun textureSetDataPartial(
    texture: RID,
    image: Image,
    srcX: Long,
    srcY: Long,
    srcW: Long,
    srcH: Long,
    dstX: Long,
    dstY: Long,
    dstMip: Long,
    layer: Long = 0
  ) {
    val mb = getMethodBind("VisualServer","texture_set_data_partial")
    _icall_Unit_RID_Object_Long_Long_Long_Long_Long_Long_Long_Long( mb, this.ptr, texture, image,
        srcX, srcY, srcW, srcH, dstX, dstY, dstMip, layer)
  }

  fun textureSetFlags(texture: RID, flags: Long) {
    val mb = getMethodBind("VisualServer","texture_set_flags")
    _icall_Unit_RID_Long( mb, this.ptr, texture, flags)
  }

  fun textureSetPath(texture: RID, path: String) {
    val mb = getMethodBind("VisualServer","texture_set_path")
    _icall_Unit_RID_String( mb, this.ptr, texture, path)
  }

  fun textureSetShrinkAllX2OnSetData(shrink: Boolean) {
    val mb = getMethodBind("VisualServer","texture_set_shrink_all_x2_on_set_data")
    _icall_Unit_Boolean( mb, this.ptr, shrink)
  }

  fun textureSetSizeOverride(
    texture: RID,
    width: Long,
    height: Long,
    depth: Long
  ) {
    val mb = getMethodBind("VisualServer","texture_set_size_override")
    _icall_Unit_RID_Long_Long_Long( mb, this.ptr, texture, width, height, depth)
  }

  fun texturesKeepOriginal(enable: Boolean) {
    val mb = getMethodBind("VisualServer","textures_keep_original")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  fun viewportAttachCamera(viewport: RID, camera: RID) {
    val mb = getMethodBind("VisualServer","viewport_attach_camera")
    _icall_Unit_RID_RID( mb, this.ptr, viewport, camera)
  }

  fun viewportAttachCanvas(viewport: RID, canvas: RID) {
    val mb = getMethodBind("VisualServer","viewport_attach_canvas")
    _icall_Unit_RID_RID( mb, this.ptr, viewport, canvas)
  }

  fun viewportAttachToScreen(
    viewport: RID,
    rect: Rect2 = Rect2(0.0, 0.0, 0.0, 0.0),
    screen: Long = 0
  ) {
    val mb = getMethodBind("VisualServer","viewport_attach_to_screen")
    _icall_Unit_RID_Rect2_Long( mb, this.ptr, viewport, rect, screen)
  }

  fun viewportCreate(): RID {
    val mb = getMethodBind("VisualServer","viewport_create")
    return _icall_RID( mb, this.ptr)
  }

  fun viewportDetach(viewport: RID) {
    val mb = getMethodBind("VisualServer","viewport_detach")
    _icall_Unit_RID( mb, this.ptr, viewport)
  }

  fun viewportGetRenderInfo(viewport: RID, info: Long): Long {
    val mb = getMethodBind("VisualServer","viewport_get_render_info")
    return _icall_Long_RID_Long( mb, this.ptr, viewport, info)
  }

  fun viewportGetTexture(viewport: RID): RID {
    val mb = getMethodBind("VisualServer","viewport_get_texture")
    return _icall_RID_RID( mb, this.ptr, viewport)
  }

  fun viewportRemoveCanvas(viewport: RID, canvas: RID) {
    val mb = getMethodBind("VisualServer","viewport_remove_canvas")
    _icall_Unit_RID_RID( mb, this.ptr, viewport, canvas)
  }

  fun viewportSetActive(viewport: RID, active: Boolean) {
    val mb = getMethodBind("VisualServer","viewport_set_active")
    _icall_Unit_RID_Boolean( mb, this.ptr, viewport, active)
  }

  fun viewportSetCanvasStacking(
    viewport: RID,
    canvas: RID,
    layer: Long,
    sublayer: Long
  ) {
    val mb = getMethodBind("VisualServer","viewport_set_canvas_stacking")
    _icall_Unit_RID_RID_Long_Long( mb, this.ptr, viewport, canvas, layer, sublayer)
  }

  fun viewportSetCanvasTransform(
    viewport: RID,
    canvas: RID,
    offset: Transform2D
  ) {
    val mb = getMethodBind("VisualServer","viewport_set_canvas_transform")
    _icall_Unit_RID_RID_Transform2D( mb, this.ptr, viewport, canvas, offset)
  }

  fun viewportSetClearMode(viewport: RID, clearMode: Long) {
    val mb = getMethodBind("VisualServer","viewport_set_clear_mode")
    _icall_Unit_RID_Long( mb, this.ptr, viewport, clearMode)
  }

  fun viewportSetDebugDraw(viewport: RID, draw: Long) {
    val mb = getMethodBind("VisualServer","viewport_set_debug_draw")
    _icall_Unit_RID_Long( mb, this.ptr, viewport, draw)
  }

  fun viewportSetDisable3d(viewport: RID, disabled: Boolean) {
    val mb = getMethodBind("VisualServer","viewport_set_disable_3d")
    _icall_Unit_RID_Boolean( mb, this.ptr, viewport, disabled)
  }

  fun viewportSetDisableEnvironment(viewport: RID, disabled: Boolean) {
    val mb = getMethodBind("VisualServer","viewport_set_disable_environment")
    _icall_Unit_RID_Boolean( mb, this.ptr, viewport, disabled)
  }

  fun viewportSetGlobalCanvasTransform(viewport: RID, transform: Transform2D) {
    val mb = getMethodBind("VisualServer","viewport_set_global_canvas_transform")
    _icall_Unit_RID_Transform2D( mb, this.ptr, viewport, transform)
  }

  fun viewportSetHdr(viewport: RID, enabled: Boolean) {
    val mb = getMethodBind("VisualServer","viewport_set_hdr")
    _icall_Unit_RID_Boolean( mb, this.ptr, viewport, enabled)
  }

  fun viewportSetHideCanvas(viewport: RID, hidden: Boolean) {
    val mb = getMethodBind("VisualServer","viewport_set_hide_canvas")
    _icall_Unit_RID_Boolean( mb, this.ptr, viewport, hidden)
  }

  fun viewportSetHideScenario(viewport: RID, hidden: Boolean) {
    val mb = getMethodBind("VisualServer","viewport_set_hide_scenario")
    _icall_Unit_RID_Boolean( mb, this.ptr, viewport, hidden)
  }

  fun viewportSetMsaa(viewport: RID, msaa: Long) {
    val mb = getMethodBind("VisualServer","viewport_set_msaa")
    _icall_Unit_RID_Long( mb, this.ptr, viewport, msaa)
  }

  fun viewportSetParentViewport(viewport: RID, parentViewport: RID) {
    val mb = getMethodBind("VisualServer","viewport_set_parent_viewport")
    _icall_Unit_RID_RID( mb, this.ptr, viewport, parentViewport)
  }

  fun viewportSetRenderDirectToScreen(viewport: RID, enabled: Boolean) {
    val mb = getMethodBind("VisualServer","viewport_set_render_direct_to_screen")
    _icall_Unit_RID_Boolean( mb, this.ptr, viewport, enabled)
  }

  fun viewportSetScenario(viewport: RID, scenario: RID) {
    val mb = getMethodBind("VisualServer","viewport_set_scenario")
    _icall_Unit_RID_RID( mb, this.ptr, viewport, scenario)
  }

  fun viewportSetShadowAtlasQuadrantSubdivision(
    viewport: RID,
    quadrant: Long,
    subdivision: Long
  ) {
    val mb = getMethodBind("VisualServer","viewport_set_shadow_atlas_quadrant_subdivision")
    _icall_Unit_RID_Long_Long( mb, this.ptr, viewport, quadrant, subdivision)
  }

  fun viewportSetShadowAtlasSize(viewport: RID, size: Long) {
    val mb = getMethodBind("VisualServer","viewport_set_shadow_atlas_size")
    _icall_Unit_RID_Long( mb, this.ptr, viewport, size)
  }

  fun viewportSetSize(
    viewport: RID,
    width: Long,
    height: Long
  ) {
    val mb = getMethodBind("VisualServer","viewport_set_size")
    _icall_Unit_RID_Long_Long( mb, this.ptr, viewport, width, height)
  }

  fun viewportSetTransparentBackground(viewport: RID, enabled: Boolean) {
    val mb = getMethodBind("VisualServer","viewport_set_transparent_background")
    _icall_Unit_RID_Boolean( mb, this.ptr, viewport, enabled)
  }

  fun viewportSetUpdateMode(viewport: RID, updateMode: Long) {
    val mb = getMethodBind("VisualServer","viewport_set_update_mode")
    _icall_Unit_RID_Long( mb, this.ptr, viewport, updateMode)
  }

  fun viewportSetUsage(viewport: RID, usage: Long) {
    val mb = getMethodBind("VisualServer","viewport_set_usage")
    _icall_Unit_RID_Long( mb, this.ptr, viewport, usage)
  }

  fun viewportSetUseArvr(viewport: RID, useArvr: Boolean) {
    val mb = getMethodBind("VisualServer","viewport_set_use_arvr")
    _icall_Unit_RID_Boolean( mb, this.ptr, viewport, useArvr)
  }

  fun viewportSetVflip(viewport: RID, enabled: Boolean) {
    val mb = getMethodBind("VisualServer","viewport_set_vflip")
    _icall_Unit_RID_Boolean( mb, this.ptr, viewport, enabled)
  }

  enum class ReflectionProbeUpdateMode(
    id: Long
  ) {
    REFLECTION_PROBE_UPDATE_ONCE(0),

    REFLECTION_PROBE_UPDATE_ALWAYS(1);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class LightDirectionalShadowDepthRangeMode(
    id: Long
  ) {
    LIGHT_DIRECTIONAL_SHADOW_DEPTH_RANGE_STABLE(0),

    LIGHT_DIRECTIONAL_SHADOW_DEPTH_RANGE_OPTIMIZED(1);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class BlendShapeMode(
    id: Long
  ) {
    BLEND_SHAPE_MODE_NORMALIZED(0),

    BLEND_SHAPE_MODE_RELATIVE(1);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class PrimitiveType(
    id: Long
  ) {
    PRIMITIVE_POINTS(0),

    PRIMITIVE_LINES(1),

    PRIMITIVE_LINE_STRIP(2),

    PRIMITIVE_LINE_LOOP(3),

    PRIMITIVE_TRIANGLES(4),

    PRIMITIVE_TRIANGLE_STRIP(5),

    PRIMITIVE_TRIANGLE_FAN(6),

    PRIMITIVE_MAX(7);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class TextureType(
    id: Long
  ) {
    TEXTURE_TYPE_2D(0),

    TEXTURE_TYPE_CUBEMAP(2),

    TEXTURE_TYPE_2D_ARRAY(3),

    TEXTURE_TYPE_3D(4);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class EnvironmentSSAOQuality(
    id: Long
  ) {
    ENV_SSAO_QUALITY_LOW(0),

    ENV_SSAO_QUALITY_MEDIUM(1),

    ENV_SSAO_QUALITY_HIGH(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class EnvironmentDOFBlurQuality(
    id: Long
  ) {
    ENV_DOF_BLUR_QUALITY_LOW(0),

    ENV_DOF_BLUR_QUALITY_MEDIUM(1),

    ENV_DOF_BLUR_QUALITY_HIGH(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class RenderInfo(
    id: Long
  ) {
    INFO_OBJECTS_IN_FRAME(0),

    INFO_VERTICES_IN_FRAME(1),

    INFO_MATERIAL_CHANGES_IN_FRAME(2),

    INFO_SHADER_CHANGES_IN_FRAME(3),

    INFO_SURFACE_CHANGES_IN_FRAME(4),

    INFO_DRAW_CALLS_IN_FRAME(5),

    INFO_2D_ITEMS_IN_FRAME(6),

    INFO_2D_DRAW_CALLS_IN_FRAME(7),

    INFO_USAGE_VIDEO_MEM_TOTAL(8),

    INFO_VIDEO_MEM_USED(9),

    INFO_TEXTURE_MEM_USED(10),

    INFO_VERTEX_MEM_USED(11);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class NinePatchAxisMode(
    id: Long
  ) {
    NINE_PATCH_STRETCH(0),

    NINE_PATCH_TILE(1),

    NINE_PATCH_TILE_FIT(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class ViewportRenderInfo(
    id: Long
  ) {
    VIEWPORT_RENDER_INFO_OBJECTS_IN_FRAME(0),

    VIEWPORT_RENDER_INFO_VERTICES_IN_FRAME(1),

    VIEWPORT_RENDER_INFO_MATERIAL_CHANGES_IN_FRAME(2),

    VIEWPORT_RENDER_INFO_SHADER_CHANGES_IN_FRAME(3),

    VIEWPORT_RENDER_INFO_SURFACE_CHANGES_IN_FRAME(4),

    VIEWPORT_RENDER_INFO_DRAW_CALLS_IN_FRAME(5),

    VIEWPORT_RENDER_INFO_2D_ITEMS_IN_FRAME(6),

    VIEWPORT_RENDER_INFO_2D_DRAW_CALLS_IN_FRAME(7),

    VIEWPORT_RENDER_INFO_MAX(8);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class ViewportClearMode(
    id: Long
  ) {
    VIEWPORT_CLEAR_ALWAYS(0),

    VIEWPORT_CLEAR_NEVER(1),

    VIEWPORT_CLEAR_ONLY_NEXT_FRAME(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class LightOmniShadowDetail(
    id: Long
  ) {
    LIGHT_OMNI_SHADOW_DETAIL_VERTICAL(0),

    LIGHT_OMNI_SHADOW_DETAIL_HORIZONTAL(1);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class ShaderMode(
    id: Long
  ) {
    SHADER_SPATIAL(0),

    SHADER_CANVAS_ITEM(1),

    SHADER_PARTICLES(2),

    SHADER_MAX(3);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class MultimeshTransformFormat(
    id: Long
  ) {
    MULTIMESH_TRANSFORM_2D(0),

    MULTIMESH_TRANSFORM_3D(1);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class ShadowCastingSetting(
    id: Long
  ) {
    SHADOW_CASTING_SETTING_OFF(0),

    SHADOW_CASTING_SETTING_ON(1),

    SHADOW_CASTING_SETTING_DOUBLE_SIDED(2),

    SHADOW_CASTING_SETTING_SHADOWS_ONLY(3);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class ViewportDebugDraw(
    id: Long
  ) {
    VIEWPORT_DEBUG_DRAW_DISABLED(0),

    VIEWPORT_DEBUG_DRAW_UNSHADED(1),

    VIEWPORT_DEBUG_DRAW_OVERDRAW(2),

    VIEWPORT_DEBUG_DRAW_WIREFRAME(3);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class ViewportUsage(
    id: Long
  ) {
    VIEWPORT_USAGE_2D(0),

    VIEWPORT_USAGE_2D_NO_SAMPLING(1),

    VIEWPORT_USAGE_3D(2),

    VIEWPORT_USAGE_3D_NO_EFFECTS(3);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class EnvironmentBG(
    id: Long
  ) {
    ENV_BG_CLEAR_COLOR(0),

    ENV_BG_COLOR(1),

    ENV_BG_SKY(2),

    ENV_BG_COLOR_SKY(3),

    ENV_BG_CANVAS(4),

    ENV_BG_KEEP(5),

    ENV_BG_MAX(7);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class MultimeshCustomDataFormat(
    id: Long
  ) {
    MULTIMESH_CUSTOM_DATA_NONE(0),

    MULTIMESH_CUSTOM_DATA_8BIT(1),

    MULTIMESH_CUSTOM_DATA_FLOAT(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class LightOmniShadowMode(
    id: Long
  ) {
    LIGHT_OMNI_SHADOW_DUAL_PARABOLOID(0),

    LIGHT_OMNI_SHADOW_CUBE(1);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class TextureFlags(
    id: Long
  ) {
    TEXTURE_FLAG_MIPMAPS(1),

    TEXTURE_FLAG_REPEAT(2),

    TEXTURE_FLAG_FILTER(4),

    TEXTURE_FLAGS_DEFAULT(7),

    TEXTURE_FLAG_ANISOTROPIC_FILTER(8),

    TEXTURE_FLAG_CONVERT_TO_LINEAR(16),

    TEXTURE_FLAG_MIRRORED_REPEAT(32),

    TEXTURE_FLAG_USED_FOR_STREAMING(2048);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class Features(
    id: Long
  ) {
    FEATURE_SHADERS(0),

    FEATURE_MULTITHREADED(1);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class InstanceType(
    id: Long
  ) {
    INSTANCE_NONE(0),

    INSTANCE_MESH(1),

    INSTANCE_MULTIMESH(2),

    INSTANCE_IMMEDIATE(3),

    INSTANCE_PARTICLES(4),

    INSTANCE_LIGHT(5),

    INSTANCE_REFLECTION_PROBE(6),

    INSTANCE_GI_PROBE(7),

    INSTANCE_LIGHTMAP_CAPTURE(8),

    INSTANCE_MAX(9),

    INSTANCE_GEOMETRY_MASK(30);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class EnvironmentSSAOBlur(
    id: Long
  ) {
    ENV_SSAO_BLUR_DISABLED(0),

    ENV_SSAO_BLUR_1x1(1),

    ENV_SSAO_BLUR_2x2(2),

    ENV_SSAO_BLUR_3x3(3);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class EnvironmentToneMapper(
    id: Long
  ) {
    ENV_TONE_MAPPER_LINEAR(0),

    ENV_TONE_MAPPER_REINHARD(1),

    ENV_TONE_MAPPER_FILMIC(2),

    ENV_TONE_MAPPER_ACES(3);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class EnvironmentGlowBlendMode(
    id: Long
  ) {
    GLOW_BLEND_MODE_ADDITIVE(0),

    GLOW_BLEND_MODE_SCREEN(1),

    GLOW_BLEND_MODE_SOFTLIGHT(2),

    GLOW_BLEND_MODE_REPLACE(3);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class MultimeshColorFormat(
    id: Long
  ) {
    MULTIMESH_COLOR_NONE(0),

    MULTIMESH_COLOR_8BIT(1),

    MULTIMESH_COLOR_FLOAT(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class CanvasLightShadowFilter(
    id: Long
  ) {
    CANVAS_LIGHT_FILTER_NONE(0),

    CANVAS_LIGHT_FILTER_PCF3(1),

    CANVAS_LIGHT_FILTER_PCF5(2),

    CANVAS_LIGHT_FILTER_PCF7(3),

    CANVAS_LIGHT_FILTER_PCF9(4),

    CANVAS_LIGHT_FILTER_PCF13(5);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class ScenarioDebugMode(
    id: Long
  ) {
    SCENARIO_DEBUG_DISABLED(0),

    SCENARIO_DEBUG_WIREFRAME(1),

    SCENARIO_DEBUG_OVERDRAW(2),

    SCENARIO_DEBUG_SHADELESS(3);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class ViewportUpdateMode(
    id: Long
  ) {
    VIEWPORT_UPDATE_DISABLED(0),

    VIEWPORT_UPDATE_ONCE(1),

    VIEWPORT_UPDATE_WHEN_VISIBLE(2),

    VIEWPORT_UPDATE_ALWAYS(3);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class ArrayFormat(
    id: Long
  ) {
    ARRAY_FORMAT_VERTEX(1),

    ARRAY_FORMAT_NORMAL(2),

    ARRAY_FORMAT_TANGENT(4),

    ARRAY_FORMAT_COLOR(8),

    ARRAY_FORMAT_TEX_UV(16),

    ARRAY_FORMAT_TEX_UV2(32),

    ARRAY_FORMAT_BONES(64),

    ARRAY_FORMAT_WEIGHTS(128),

    ARRAY_FORMAT_INDEX(256),

    ARRAY_COMPRESS_VERTEX(512),

    ARRAY_COMPRESS_NORMAL(1024),

    ARRAY_COMPRESS_TANGENT(2048),

    ARRAY_COMPRESS_COLOR(4096),

    ARRAY_COMPRESS_TEX_UV(8192),

    ARRAY_COMPRESS_TEX_UV2(16384),

    ARRAY_COMPRESS_BONES(32768),

    ARRAY_COMPRESS_WEIGHTS(65536),

    ARRAY_COMPRESS_DEFAULT(97280),

    ARRAY_COMPRESS_INDEX(131072),

    ARRAY_FLAG_USE_2D_VERTICES(262144),

    ARRAY_FLAG_USE_16_BIT_BONES(524288);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class ParticlesDrawOrder(
    id: Long
  ) {
    PARTICLES_DRAW_ORDER_INDEX(0),

    PARTICLES_DRAW_ORDER_LIFETIME(1),

    PARTICLES_DRAW_ORDER_VIEW_DEPTH(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class CanvasLightMode(
    id: Long
  ) {
    CANVAS_LIGHT_MODE_ADD(0),

    CANVAS_LIGHT_MODE_SUB(1),

    CANVAS_LIGHT_MODE_MIX(2),

    CANVAS_LIGHT_MODE_MASK(3);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class LightDirectionalShadowMode(
    id: Long
  ) {
    LIGHT_DIRECTIONAL_SHADOW_ORTHOGONAL(0),

    LIGHT_DIRECTIONAL_SHADOW_PARALLEL_2_SPLITS(1),

    LIGHT_DIRECTIONAL_SHADOW_PARALLEL_4_SPLITS(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class LightParam(
    id: Long
  ) {
    LIGHT_PARAM_ENERGY(0),

    LIGHT_PARAM_SPECULAR(2),

    LIGHT_PARAM_RANGE(3),

    LIGHT_PARAM_ATTENUATION(4),

    LIGHT_PARAM_SPOT_ANGLE(5),

    LIGHT_PARAM_SPOT_ATTENUATION(6),

    LIGHT_PARAM_CONTACT_SHADOW_SIZE(7),

    LIGHT_PARAM_SHADOW_MAX_DISTANCE(8),

    LIGHT_PARAM_SHADOW_SPLIT_1_OFFSET(9),

    LIGHT_PARAM_SHADOW_SPLIT_2_OFFSET(10),

    LIGHT_PARAM_SHADOW_SPLIT_3_OFFSET(11),

    LIGHT_PARAM_SHADOW_NORMAL_BIAS(12),

    LIGHT_PARAM_SHADOW_BIAS(13),

    LIGHT_PARAM_SHADOW_BIAS_SPLIT_SCALE(14),

    LIGHT_PARAM_MAX(15);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class ArrayType(
    id: Long
  ) {
    ARRAY_VERTEX(0),

    ARRAY_NORMAL(1),

    ARRAY_TANGENT(2),

    ARRAY_COLOR(3),

    ARRAY_TEX_UV(4),

    ARRAY_TEX_UV2(5),

    ARRAY_BONES(6),

    ARRAY_WEIGHTS(7),

    ARRAY_INDEX(8),

    ARRAY_MAX(9);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class CanvasOccluderPolygonCullMode(
    id: Long
  ) {
    CANVAS_OCCLUDER_POLYGON_CULL_DISABLED(0),

    CANVAS_OCCLUDER_POLYGON_CULL_CLOCKWISE(1),

    CANVAS_OCCLUDER_POLYGON_CULL_COUNTER_CLOCKWISE(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class InstanceFlags(
    id: Long
  ) {
    INSTANCE_FLAG_USE_BAKED_LIGHT(0),

    INSTANCE_FLAG_DRAW_NEXT_FRAME_IF_VISIBLE(1),

    INSTANCE_FLAG_MAX(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class ViewportMSAA(
    id: Long
  ) {
    VIEWPORT_MSAA_DISABLED(0),

    VIEWPORT_MSAA_2X(1),

    VIEWPORT_MSAA_4X(2),

    VIEWPORT_MSAA_8X(3),

    VIEWPORT_MSAA_16X(4),

    VIEWPORT_MSAA_EXT_2X(5),

    VIEWPORT_MSAA_EXT_4X(6);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class LightType(
    id: Long
  ) {
    LIGHT_DIRECTIONAL(0),

    LIGHT_OMNI(1),

    LIGHT_SPOT(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class CubeMapSide(
    id: Long
  ) {
    CUBEMAP_LEFT(0),

    CUBEMAP_RIGHT(1),

    CUBEMAP_BOTTOM(2),

    CUBEMAP_TOP(3),

    CUBEMAP_FRONT(4),

    CUBEMAP_BACK(5);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }
}
