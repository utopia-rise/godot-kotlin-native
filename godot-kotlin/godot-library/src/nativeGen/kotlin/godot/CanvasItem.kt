// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Color
import godot.core.Dictionary
import godot.core.PoolColorArray
import godot.core.PoolVector2Array
import godot.core.RID
import godot.core.Rect2
import godot.core.Signal0
import godot.core.Transform2D
import godot.core.Vector2
import godot.core.signal
import godot.icalls._icall_Boolean
import godot.icalls._icall_Color
import godot.icalls._icall_Double_Object_Vector2_String_String_Color
import godot.icalls._icall_InputEvent_Object
import godot.icalls._icall_Long
import godot.icalls._icall_Material
import godot.icalls._icall_RID
import godot.icalls._icall_Rect2
import godot.icalls._icall_Transform2D
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Color
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Object
import godot.icalls._icall_Unit_Object_Object_nObject
import godot.icalls._icall_Unit_Object_Object_nObject_Transform2D_Color
import godot.icalls._icall_Unit_Object_Rect2
import godot.icalls._icall_Unit_Object_Rect2_Boolean_Color_Boolean_nObject
import godot.icalls._icall_Unit_Object_Rect2_Rect2_Color_Boolean_nObject_Boolean
import godot.icalls._icall_Unit_Object_Vector2_Color_nObject
import godot.icalls._icall_Unit_Object_Vector2_String_Color_Long
import godot.icalls._icall_Unit_PoolVector2Array_Color_Double_Boolean
import godot.icalls._icall_Unit_PoolVector2Array_Color_PoolVector2Array_nObject_nObject_Boolean
import godot.icalls._icall_Unit_PoolVector2Array_PoolColorArray_Double_Boolean
import godot.icalls._icall_Unit_PoolVector2Array_PoolColorArray_PoolVector2Array_nObject_Double_nObject
import godot.icalls._icall_Unit_PoolVector2Array_PoolColorArray_PoolVector2Array_nObject_nObject_Boolean
import godot.icalls._icall_Unit_Rect2_Color_Boolean_Double_Boolean
import godot.icalls._icall_Unit_Transform2D
import godot.icalls._icall_Unit_Vector2_Double_Color
import godot.icalls._icall_Unit_Vector2_Double_Double_Double_Long_Color_Double_Boolean
import godot.icalls._icall_Unit_Vector2_Double_Vector2
import godot.icalls._icall_Unit_Vector2_Vector2_Color_Double_Boolean
import godot.icalls._icall_Vector2
import godot.icalls._icall_Vector2_Vector2
import godot.icalls._icall_World2D
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Unit

open class CanvasItem internal constructor(
  _ignore: Any?
) : Node(_ignore) {
  val draw: Signal0 by signal()

  val hide: Signal0 by signal()

  val itemRectChanged: Signal0 by signal()

  val visibilityChanged: Signal0 by signal()

  open var lightMask: Long
    get() {
      val mb = getMethodBind("CanvasItem","get_light_mask")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CanvasItem","set_light_mask")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var material: Material
    get() {
      val mb = getMethodBind("CanvasItem","get_material")
      return _icall_Material(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CanvasItem","set_material")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  open var modulate: Color
    get() {
      val mb = getMethodBind("CanvasItem","get_modulate")
      return _icall_Color(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CanvasItem","set_modulate")
      _icall_Unit_Color(mb, this.ptr, value)
    }

  open var selfModulate: Color
    get() {
      val mb = getMethodBind("CanvasItem","get_self_modulate")
      return _icall_Color(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CanvasItem","set_self_modulate")
      _icall_Unit_Color(mb, this.ptr, value)
    }

  open var showBehindParent: Boolean
    get() {
      val mb = getMethodBind("CanvasItem","is_draw_behind_parent_enabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CanvasItem","set_draw_behind_parent")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var useParentMaterial: Boolean
    get() {
      val mb = getMethodBind("CanvasItem","get_use_parent_material")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CanvasItem","set_use_parent_material")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var visible: Boolean
    get() {
      val mb = getMethodBind("CanvasItem","is_visible")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CanvasItem","set_visible")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  internal constructor() : this(null)

  open fun modulate(schedule: Color.() -> Unit): Color = modulate.apply{
      schedule(this)
      modulate = this
  }


  open fun selfModulate(schedule: Color.() -> Unit): Color = selfModulate.apply{
      schedule(this)
      selfModulate = this
  }


  open fun _draw() {
  }

  open fun _editGetPivot(): Vector2 {
    throw NotImplementedError("_edit_get_pivot is not implemented for CanvasItem")
  }

  open fun _editGetPosition(): Vector2 {
    throw NotImplementedError("_edit_get_position is not implemented for CanvasItem")
  }

  open fun _editGetRect(): Rect2 {
    throw NotImplementedError("_edit_get_rect is not implemented for CanvasItem")
  }

  open fun _editGetRotation(): Double {
    throw NotImplementedError("_edit_get_rotation is not implemented for CanvasItem")
  }

  open fun _editGetScale(): Vector2 {
    throw NotImplementedError("_edit_get_scale is not implemented for CanvasItem")
  }

  open fun _editGetState(): Dictionary {
    throw NotImplementedError("_edit_get_state is not implemented for CanvasItem")
  }

  open fun _editGetTransform(): Transform2D {
    throw NotImplementedError("_edit_get_transform is not implemented for CanvasItem")
  }

  open fun _editSetPivot(pivot: Vector2) {
  }

  open fun _editSetPosition(position: Vector2) {
  }

  open fun _editSetRect(rect: Rect2) {
  }

  open fun _editSetRotation(degrees: Double) {
  }

  open fun _editSetScale(scale: Vector2) {
  }

  open fun _editSetState(state: Dictionary) {
  }

  open fun _editUsePivot(): Boolean {
    throw NotImplementedError("_edit_use_pivot is not implemented for CanvasItem")
  }

  open fun _editUseRect(): Boolean {
    throw NotImplementedError("_edit_use_rect is not implemented for CanvasItem")
  }

  open fun _editUseRotation(): Boolean {
    throw NotImplementedError("_edit_use_rotation is not implemented for CanvasItem")
  }

  open fun _isOnTop(): Boolean {
    throw NotImplementedError("_is_on_top is not implemented for CanvasItem")
  }

  open fun _setOnTop(onTop: Boolean) {
  }

  open fun _toplevelRaiseSelf() {
  }

  open fun _updateCallback() {
  }

  open fun drawArc(
    center: Vector2,
    radius: Double,
    startAngle: Double,
    endAngle: Double,
    pointCount: Long,
    color: Color,
    width: Double = 1.0,
    antialiased: Boolean = false
  ) {
    val mb = getMethodBind("CanvasItem","draw_arc")
    _icall_Unit_Vector2_Double_Double_Double_Long_Color_Double_Boolean( mb, this.ptr, center,
        radius, startAngle, endAngle, pointCount, color, width, antialiased)
  }

  open fun drawChar(
    font: Font,
    position: Vector2,
    char: String,
    next: String,
    modulate: Color = Color(1,1,1,1)
  ): Double {
    val mb = getMethodBind("CanvasItem","draw_char")
    return _icall_Double_Object_Vector2_String_String_Color( mb, this.ptr, font, position, char,
        next, modulate)
  }

  open fun drawCircle(
    position: Vector2,
    radius: Double,
    color: Color
  ) {
    val mb = getMethodBind("CanvasItem","draw_circle")
    _icall_Unit_Vector2_Double_Color( mb, this.ptr, position, radius, color)
  }

  open fun drawColoredPolygon(
    points: PoolVector2Array,
    color: Color,
    uvs: PoolVector2Array = PoolVector2Array(),
    texture: Texture? = null,
    normalMap: Texture? = null,
    antialiased: Boolean = false
  ) {
    val mb = getMethodBind("CanvasItem","draw_colored_polygon")
    _icall_Unit_PoolVector2Array_Color_PoolVector2Array_nObject_nObject_Boolean( mb, this.ptr,
        points, color, uvs, texture, normalMap, antialiased)
  }

  open fun drawLine(
    from: Vector2,
    to: Vector2,
    color: Color,
    width: Double = 1.0,
    antialiased: Boolean = false
  ) {
    val mb = getMethodBind("CanvasItem","draw_line")
    _icall_Unit_Vector2_Vector2_Color_Double_Boolean( mb, this.ptr, from, to, color, width,
        antialiased)
  }

  open fun drawMesh(
    mesh: Mesh,
    texture: Texture,
    normalMap: Texture? = null,
    transform: Transform2D = Transform2D(),
    modulate: Color = Color(1,1,1,1)
  ) {
    val mb = getMethodBind("CanvasItem","draw_mesh")
    _icall_Unit_Object_Object_nObject_Transform2D_Color( mb, this.ptr, mesh, texture, normalMap,
        transform, modulate)
  }

  open fun drawMultiline(
    points: PoolVector2Array,
    color: Color,
    width: Double = 1.0,
    antialiased: Boolean = false
  ) {
    val mb = getMethodBind("CanvasItem","draw_multiline")
    _icall_Unit_PoolVector2Array_Color_Double_Boolean( mb, this.ptr, points, color, width,
        antialiased)
  }

  open fun drawMultilineColors(
    points: PoolVector2Array,
    colors: PoolColorArray,
    width: Double = 1.0,
    antialiased: Boolean = false
  ) {
    val mb = getMethodBind("CanvasItem","draw_multiline_colors")
    _icall_Unit_PoolVector2Array_PoolColorArray_Double_Boolean( mb, this.ptr, points, colors, width,
        antialiased)
  }

  open fun drawMultimesh(
    multimesh: MultiMesh,
    texture: Texture,
    normalMap: Texture? = null
  ) {
    val mb = getMethodBind("CanvasItem","draw_multimesh")
    _icall_Unit_Object_Object_nObject( mb, this.ptr, multimesh, texture, normalMap)
  }

  open fun drawPolygon(
    points: PoolVector2Array,
    colors: PoolColorArray,
    uvs: PoolVector2Array = PoolVector2Array(),
    texture: Texture? = null,
    normalMap: Texture? = null,
    antialiased: Boolean = false
  ) {
    val mb = getMethodBind("CanvasItem","draw_polygon")
    _icall_Unit_PoolVector2Array_PoolColorArray_PoolVector2Array_nObject_nObject_Boolean( mb,
        this.ptr, points, colors, uvs, texture, normalMap, antialiased)
  }

  open fun drawPolyline(
    points: PoolVector2Array,
    color: Color,
    width: Double = 1.0,
    antialiased: Boolean = false
  ) {
    val mb = getMethodBind("CanvasItem","draw_polyline")
    _icall_Unit_PoolVector2Array_Color_Double_Boolean( mb, this.ptr, points, color, width,
        antialiased)
  }

  open fun drawPolylineColors(
    points: PoolVector2Array,
    colors: PoolColorArray,
    width: Double = 1.0,
    antialiased: Boolean = false
  ) {
    val mb = getMethodBind("CanvasItem","draw_polyline_colors")
    _icall_Unit_PoolVector2Array_PoolColorArray_Double_Boolean( mb, this.ptr, points, colors, width,
        antialiased)
  }

  open fun drawPrimitive(
    points: PoolVector2Array,
    colors: PoolColorArray,
    uvs: PoolVector2Array,
    texture: Texture? = null,
    width: Double = 1.0,
    normalMap: Texture? = null
  ) {
    val mb = getMethodBind("CanvasItem","draw_primitive")
    _icall_Unit_PoolVector2Array_PoolColorArray_PoolVector2Array_nObject_Double_nObject( mb,
        this.ptr, points, colors, uvs, texture, width, normalMap)
  }

  open fun drawRect(
    rect: Rect2,
    color: Color,
    filled: Boolean = true,
    width: Double = 1.0,
    antialiased: Boolean = false
  ) {
    val mb = getMethodBind("CanvasItem","draw_rect")
    _icall_Unit_Rect2_Color_Boolean_Double_Boolean( mb, this.ptr, rect, color, filled, width,
        antialiased)
  }

  open fun drawSetTransform(
    position: Vector2,
    rotation: Double,
    scale: Vector2
  ) {
    val mb = getMethodBind("CanvasItem","draw_set_transform")
    _icall_Unit_Vector2_Double_Vector2( mb, this.ptr, position, rotation, scale)
  }

  open fun drawSetTransformMatrix(xform: Transform2D) {
    val mb = getMethodBind("CanvasItem","draw_set_transform_matrix")
    _icall_Unit_Transform2D( mb, this.ptr, xform)
  }

  open fun drawString(
    font: Font,
    position: Vector2,
    text: String,
    modulate: Color = Color(1,1,1,1),
    clipW: Long = -1
  ) {
    val mb = getMethodBind("CanvasItem","draw_string")
    _icall_Unit_Object_Vector2_String_Color_Long( mb, this.ptr, font, position, text, modulate,
        clipW)
  }

  open fun drawStyleBox(styleBox: StyleBox, rect: Rect2) {
    val mb = getMethodBind("CanvasItem","draw_style_box")
    _icall_Unit_Object_Rect2( mb, this.ptr, styleBox, rect)
  }

  open fun drawTexture(
    texture: Texture,
    position: Vector2,
    modulate: Color = Color(1,1,1,1),
    normalMap: Texture? = null
  ) {
    val mb = getMethodBind("CanvasItem","draw_texture")
    _icall_Unit_Object_Vector2_Color_nObject( mb, this.ptr, texture, position, modulate, normalMap)
  }

  open fun drawTextureRect(
    texture: Texture,
    rect: Rect2,
    tile: Boolean,
    modulate: Color = Color(1,1,1,1),
    transpose: Boolean = false,
    normalMap: Texture? = null
  ) {
    val mb = getMethodBind("CanvasItem","draw_texture_rect")
    _icall_Unit_Object_Rect2_Boolean_Color_Boolean_nObject( mb, this.ptr, texture, rect, tile,
        modulate, transpose, normalMap)
  }

  open fun drawTextureRectRegion(
    texture: Texture,
    rect: Rect2,
    srcRect: Rect2,
    modulate: Color = Color(1,1,1,1),
    transpose: Boolean = false,
    normalMap: Texture? = null,
    clipUv: Boolean = true
  ) {
    val mb = getMethodBind("CanvasItem","draw_texture_rect_region")
    _icall_Unit_Object_Rect2_Rect2_Color_Boolean_nObject_Boolean( mb, this.ptr, texture, rect,
        srcRect, modulate, transpose, normalMap, clipUv)
  }

  open fun forceUpdateTransform() {
    val mb = getMethodBind("CanvasItem","force_update_transform")
    _icall_Unit( mb, this.ptr)
  }

  open fun getCanvas(): RID {
    val mb = getMethodBind("CanvasItem","get_canvas")
    return _icall_RID( mb, this.ptr)
  }

  open fun getCanvasItem(): RID {
    val mb = getMethodBind("CanvasItem","get_canvas_item")
    return _icall_RID( mb, this.ptr)
  }

  open fun getCanvasTransform(): Transform2D {
    val mb = getMethodBind("CanvasItem","get_canvas_transform")
    return _icall_Transform2D( mb, this.ptr)
  }

  open fun getGlobalMousePosition(): Vector2 {
    val mb = getMethodBind("CanvasItem","get_global_mouse_position")
    return _icall_Vector2( mb, this.ptr)
  }

  open fun getGlobalTransform(): Transform2D {
    val mb = getMethodBind("CanvasItem","get_global_transform")
    return _icall_Transform2D( mb, this.ptr)
  }

  open fun getGlobalTransformWithCanvas(): Transform2D {
    val mb = getMethodBind("CanvasItem","get_global_transform_with_canvas")
    return _icall_Transform2D( mb, this.ptr)
  }

  open fun getLightMask(): Long {
    val mb = getMethodBind("CanvasItem","get_light_mask")
    return _icall_Long( mb, this.ptr)
  }

  open fun getLocalMousePosition(): Vector2 {
    val mb = getMethodBind("CanvasItem","get_local_mouse_position")
    return _icall_Vector2( mb, this.ptr)
  }

  open fun getMaterial(): Material {
    val mb = getMethodBind("CanvasItem","get_material")
    return _icall_Material( mb, this.ptr)
  }

  open fun getModulate(): Color {
    val mb = getMethodBind("CanvasItem","get_modulate")
    return _icall_Color( mb, this.ptr)
  }

  open fun getSelfModulate(): Color {
    val mb = getMethodBind("CanvasItem","get_self_modulate")
    return _icall_Color( mb, this.ptr)
  }

  open fun getTransform(): Transform2D {
    val mb = getMethodBind("CanvasItem","get_transform")
    return _icall_Transform2D( mb, this.ptr)
  }

  open fun getUseParentMaterial(): Boolean {
    val mb = getMethodBind("CanvasItem","get_use_parent_material")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun getViewportRect(): Rect2 {
    val mb = getMethodBind("CanvasItem","get_viewport_rect")
    return _icall_Rect2( mb, this.ptr)
  }

  open fun getViewportTransform(): Transform2D {
    val mb = getMethodBind("CanvasItem","get_viewport_transform")
    return _icall_Transform2D( mb, this.ptr)
  }

  open fun getWorld2d(): World2D {
    val mb = getMethodBind("CanvasItem","get_world_2d")
    return _icall_World2D( mb, this.ptr)
  }

  open fun hide() {
    val mb = getMethodBind("CanvasItem","hide")
    _icall_Unit( mb, this.ptr)
  }

  open fun isDrawBehindParentEnabled(): Boolean {
    val mb = getMethodBind("CanvasItem","is_draw_behind_parent_enabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isLocalTransformNotificationEnabled(): Boolean {
    val mb = getMethodBind("CanvasItem","is_local_transform_notification_enabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isSetAsToplevel(): Boolean {
    val mb = getMethodBind("CanvasItem","is_set_as_toplevel")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isTransformNotificationEnabled(): Boolean {
    val mb = getMethodBind("CanvasItem","is_transform_notification_enabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isVisible(): Boolean {
    val mb = getMethodBind("CanvasItem","is_visible")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isVisibleInTree(): Boolean {
    val mb = getMethodBind("CanvasItem","is_visible_in_tree")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun makeCanvasPositionLocal(screenPoint: Vector2): Vector2 {
    val mb = getMethodBind("CanvasItem","make_canvas_position_local")
    return _icall_Vector2_Vector2( mb, this.ptr, screenPoint)
  }

  open fun makeInputLocal(event: InputEvent): InputEvent {
    val mb = getMethodBind("CanvasItem","make_input_local")
    return _icall_InputEvent_Object( mb, this.ptr, event)
  }

  open fun setAsToplevel(enable: Boolean) {
    val mb = getMethodBind("CanvasItem","set_as_toplevel")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setDrawBehindParent(enable: Boolean) {
    val mb = getMethodBind("CanvasItem","set_draw_behind_parent")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setLightMask(lightMask: Long) {
    val mb = getMethodBind("CanvasItem","set_light_mask")
    _icall_Unit_Long( mb, this.ptr, lightMask)
  }

  open fun setMaterial(material: Material) {
    val mb = getMethodBind("CanvasItem","set_material")
    _icall_Unit_Object( mb, this.ptr, material)
  }

  open fun setModulate(modulate: Color) {
    val mb = getMethodBind("CanvasItem","set_modulate")
    _icall_Unit_Color( mb, this.ptr, modulate)
  }

  open fun setNotifyLocalTransform(enable: Boolean) {
    val mb = getMethodBind("CanvasItem","set_notify_local_transform")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setNotifyTransform(enable: Boolean) {
    val mb = getMethodBind("CanvasItem","set_notify_transform")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setSelfModulate(selfModulate: Color) {
    val mb = getMethodBind("CanvasItem","set_self_modulate")
    _icall_Unit_Color( mb, this.ptr, selfModulate)
  }

  open fun setUseParentMaterial(enable: Boolean) {
    val mb = getMethodBind("CanvasItem","set_use_parent_material")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setVisible(visible: Boolean) {
    val mb = getMethodBind("CanvasItem","set_visible")
    _icall_Unit_Boolean( mb, this.ptr, visible)
  }

  open fun show() {
    val mb = getMethodBind("CanvasItem","show")
    _icall_Unit( mb, this.ptr)
  }

  open fun update() {
    val mb = getMethodBind("CanvasItem","update")
    _icall_Unit( mb, this.ptr)
  }

  enum class BlendMode(
    id: Long
  ) {
    BLEND_MODE_MIX(0),

    BLEND_MODE_ADD(1),

    BLEND_MODE_SUB(2),

    BLEND_MODE_MUL(3),

    BLEND_MODE_PREMULT_ALPHA(4),

    BLEND_MODE_DISABLED(5);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val NOTIFICATION_DRAW: Long = 30

    final const val NOTIFICATION_ENTER_CANVAS: Long = 32

    final const val NOTIFICATION_EXIT_CANVAS: Long = 33

    final const val NOTIFICATION_TRANSFORM_CHANGED: Long = 2000

    final const val NOTIFICATION_VISIBILITY_CHANGED: Long = 31
  }
}
