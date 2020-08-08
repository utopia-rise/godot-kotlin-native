package godot

import godot.Viewport
import godot.core.Godot.shouldInitPtr
import godot.core.RID
import godot.core.Rect2
import godot.core.Signal0
import godot.core.Signal1
import godot.core.Transform2D
import godot.core.Variant
import godot.core.Vector2
import godot.core.signal
import godot.icalls._icall_Boolean
import godot.icalls._icall_Camera
import godot.icalls._icall_Control
import godot.icalls._icall_Long
import godot.icalls._icall_Long_Long
import godot.icalls._icall_RID
import godot.icalls._icall_Rect2
import godot.icalls._icall_Transform2D
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Boolean_Vector2_Vector2
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Long_Long
import godot.icalls._icall_Unit_Object
import godot.icalls._icall_Unit_Rect2
import godot.icalls._icall_Unit_Transform2D
import godot.icalls._icall_Unit_Vector2
import godot.icalls._icall_Variant
import godot.icalls._icall_Vector2
import godot.icalls._icall_ViewportTexture
import godot.icalls._icall_World
import godot.icalls._icall_World2D
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlin.Unit

open class Viewport internal constructor(
  _ignore: Any?
) : Node(_ignore) {
  val guiFocusChanged: Signal1<Control> by signal("node")

  val sizeChanged: Signal0 by signal()

  open var arvr: Boolean
    get() {
      val mb = getMethodBind("Viewport","use_arvr")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Viewport","set_use_arvr")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var audioListenerEnable2d: Boolean
    get() {
      val mb = getMethodBind("Viewport","is_audio_listener_2d")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Viewport","set_as_audio_listener_2d")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var audioListenerEnable3d: Boolean
    get() {
      val mb = getMethodBind("Viewport","is_audio_listener")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Viewport","set_as_audio_listener")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var canvasTransform: Transform2D
    get() {
      val mb = getMethodBind("Viewport","get_canvas_transform")
      return _icall_Transform2D(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Viewport","set_canvas_transform")
      _icall_Unit_Transform2D(mb, this.ptr, value)
    }

  open var debugDraw: Long
    get() {
      val mb = getMethodBind("Viewport","get_debug_draw")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Viewport","set_debug_draw")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var disable3d: Boolean
    get() {
      val mb = getMethodBind("Viewport","is_3d_disabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Viewport","set_disable_3d")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var globalCanvasTransform: Transform2D
    get() {
      val mb = getMethodBind("Viewport","get_global_canvas_transform")
      return _icall_Transform2D(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Viewport","set_global_canvas_transform")
      _icall_Unit_Transform2D(mb, this.ptr, value)
    }

  open var guiDisableInput: Boolean
    get() {
      val mb = getMethodBind("Viewport","is_input_disabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Viewport","set_disable_input")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var guiSnapControlsToPixels: Boolean
    get() {
      val mb = getMethodBind("Viewport","is_snap_controls_to_pixels_enabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Viewport","set_snap_controls_to_pixels")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var handleInputLocally: Boolean
    get() {
      val mb = getMethodBind("Viewport","is_handling_input_locally")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Viewport","set_handle_input_locally")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var hdr: Boolean
    get() {
      val mb = getMethodBind("Viewport","get_hdr")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Viewport","set_hdr")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var keep3dLinear: Boolean
    get() {
      val mb = getMethodBind("Viewport","get_keep_3d_linear")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Viewport","set_keep_3d_linear")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var msaa: Long
    get() {
      val mb = getMethodBind("Viewport","get_msaa")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Viewport","set_msaa")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var ownWorld: Boolean
    get() {
      val mb = getMethodBind("Viewport","is_using_own_world")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Viewport","set_use_own_world")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var physicsObjectPicking: Boolean
    get() {
      val mb = getMethodBind("Viewport","get_physics_object_picking")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Viewport","set_physics_object_picking")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var renderDirectToScreen: Boolean
    get() {
      val mb = getMethodBind("Viewport","is_using_render_direct_to_screen")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Viewport","set_use_render_direct_to_screen")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var renderTargetClearMode: Long
    get() {
      val mb = getMethodBind("Viewport","get_clear_mode")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Viewport","set_clear_mode")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var renderTargetUpdateMode: Long
    get() {
      val mb = getMethodBind("Viewport","get_update_mode")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Viewport","set_update_mode")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var renderTargetVFlip: Boolean
    get() {
      val mb = getMethodBind("Viewport","get_vflip")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Viewport","set_vflip")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var shadowAtlasQuad0: Long
    get() {
      val mb = getMethodBind("Viewport","get_shadow_atlas_quadrant_subdiv")
      return _icall_Long_Long(mb, this.ptr, 0)
    }
    set(value) {
      val mb = getMethodBind("Viewport","set_shadow_atlas_quadrant_subdiv")
      _icall_Unit_Long_Long(mb, this.ptr, 0, value)
    }

  open var shadowAtlasQuad1: Long
    get() {
      val mb = getMethodBind("Viewport","get_shadow_atlas_quadrant_subdiv")
      return _icall_Long_Long(mb, this.ptr, 1)
    }
    set(value) {
      val mb = getMethodBind("Viewport","set_shadow_atlas_quadrant_subdiv")
      _icall_Unit_Long_Long(mb, this.ptr, 1, value)
    }

  open var shadowAtlasQuad2: Long
    get() {
      val mb = getMethodBind("Viewport","get_shadow_atlas_quadrant_subdiv")
      return _icall_Long_Long(mb, this.ptr, 2)
    }
    set(value) {
      val mb = getMethodBind("Viewport","set_shadow_atlas_quadrant_subdiv")
      _icall_Unit_Long_Long(mb, this.ptr, 2, value)
    }

  open var shadowAtlasQuad3: Long
    get() {
      val mb = getMethodBind("Viewport","get_shadow_atlas_quadrant_subdiv")
      return _icall_Long_Long(mb, this.ptr, 3)
    }
    set(value) {
      val mb = getMethodBind("Viewport","set_shadow_atlas_quadrant_subdiv")
      _icall_Unit_Long_Long(mb, this.ptr, 3, value)
    }

  open var shadowAtlasSize: Long
    get() {
      val mb = getMethodBind("Viewport","get_shadow_atlas_size")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Viewport","set_shadow_atlas_size")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var size: Vector2
    get() {
      val mb = getMethodBind("Viewport","get_size")
      return _icall_Vector2(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Viewport","set_size")
      _icall_Unit_Vector2(mb, this.ptr, value)
    }

  open var sizeOverrideStretch: Boolean
    get() {
      val mb = getMethodBind("Viewport","is_size_override_stretch_enabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Viewport","set_size_override_stretch")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var transparentBg: Boolean
    get() {
      val mb = getMethodBind("Viewport","has_transparent_background")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Viewport","set_transparent_background")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var usage: Long
    get() {
      val mb = getMethodBind("Viewport","get_usage")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Viewport","set_usage")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var world: World
    get() {
      val mb = getMethodBind("Viewport","get_world")
      return _icall_World(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Viewport","set_world")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  open var world2d: World2D
    get() {
      val mb = getMethodBind("Viewport","get_world_2d")
      return _icall_World2D(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Viewport","set_world_2d")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("Viewport", "Viewport")
        }

  }

  open fun canvasTransform(schedule: Transform2D.() -> Unit): Transform2D = canvasTransform.apply{
      schedule(this)
      canvasTransform = this
  }


  open fun globalCanvasTransform(schedule: Transform2D.() -> Unit): Transform2D =
      globalCanvasTransform.apply{
      schedule(this)
      globalCanvasTransform = this
  }


  open fun size(schedule: Vector2.() -> Unit): Vector2 = size.apply{
      schedule(this)
      size = this
  }


  open fun _gui_remove_focus() {
  }

  open fun _gui_show_tooltip() {
  }

  open fun _own_world_changed() {
  }

  open fun _post_gui_grab_click_focus() {
  }

  open fun _subwindow_visibility_changed() {
  }

  open fun _vp_input(arg0: InputEvent) {
  }

  open fun _vp_input_text(text: String) {
  }

  open fun _vp_unhandled_input(arg0: InputEvent) {
  }

  open fun findWorld(): World {
    val mb = getMethodBind("Viewport","find_world")
    return _icall_World( mb, this.ptr)
  }

  open fun findWorld2d(): World2D {
    val mb = getMethodBind("Viewport","find_world_2d")
    return _icall_World2D( mb, this.ptr)
  }

  open fun getCamera(): Camera {
    val mb = getMethodBind("Viewport","get_camera")
    return _icall_Camera( mb, this.ptr)
  }

  open fun getCanvasTransform(): Transform2D {
    val mb = getMethodBind("Viewport","get_canvas_transform")
    return _icall_Transform2D( mb, this.ptr)
  }

  open fun getClearMode(): Viewport.ClearMode {
    val mb = getMethodBind("Viewport","get_clear_mode")
    return Viewport.ClearMode.from( _icall_Long( mb, this.ptr))
  }

  open fun getDebugDraw(): Viewport.DebugDraw {
    val mb = getMethodBind("Viewport","get_debug_draw")
    return Viewport.DebugDraw.from( _icall_Long( mb, this.ptr))
  }

  open fun getFinalTransform(): Transform2D {
    val mb = getMethodBind("Viewport","get_final_transform")
    return _icall_Transform2D( mb, this.ptr)
  }

  open fun getGlobalCanvasTransform(): Transform2D {
    val mb = getMethodBind("Viewport","get_global_canvas_transform")
    return _icall_Transform2D( mb, this.ptr)
  }

  open fun getHdr(): Boolean {
    val mb = getMethodBind("Viewport","get_hdr")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun getKeep3dLinear(): Boolean {
    val mb = getMethodBind("Viewport","get_keep_3d_linear")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun getModalStackTop(): Control {
    val mb = getMethodBind("Viewport","get_modal_stack_top")
    return _icall_Control( mb, this.ptr)
  }

  open fun getMousePosition(): Vector2 {
    val mb = getMethodBind("Viewport","get_mouse_position")
    return _icall_Vector2( mb, this.ptr)
  }

  open fun getMsaa(): Viewport.MSAA {
    val mb = getMethodBind("Viewport","get_msaa")
    return Viewport.MSAA.from( _icall_Long( mb, this.ptr))
  }

  open fun getPhysicsObjectPicking(): Boolean {
    val mb = getMethodBind("Viewport","get_physics_object_picking")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun getRenderInfo(info: Long): Long {
    val mb = getMethodBind("Viewport","get_render_info")
    return _icall_Long_Long( mb, this.ptr, info)
  }

  open fun getShadowAtlasQuadrantSubdiv(quadrant: Long): Viewport.ShadowAtlasQuadrantSubdiv {
    val mb = getMethodBind("Viewport","get_shadow_atlas_quadrant_subdiv")
    return Viewport.ShadowAtlasQuadrantSubdiv.from( _icall_Long_Long( mb, this.ptr, quadrant))
  }

  open fun getShadowAtlasSize(): Long {
    val mb = getMethodBind("Viewport","get_shadow_atlas_size")
    return _icall_Long( mb, this.ptr)
  }

  open fun getSize(): Vector2 {
    val mb = getMethodBind("Viewport","get_size")
    return _icall_Vector2( mb, this.ptr)
  }

  open fun getSizeOverride(): Vector2 {
    val mb = getMethodBind("Viewport","get_size_override")
    return _icall_Vector2( mb, this.ptr)
  }

  open fun getTexture(): ViewportTexture {
    val mb = getMethodBind("Viewport","get_texture")
    return _icall_ViewportTexture( mb, this.ptr)
  }

  open fun getUpdateMode(): Viewport.UpdateMode {
    val mb = getMethodBind("Viewport","get_update_mode")
    return Viewport.UpdateMode.from( _icall_Long( mb, this.ptr))
  }

  open fun getUsage(): Viewport.Usage {
    val mb = getMethodBind("Viewport","get_usage")
    return Viewport.Usage.from( _icall_Long( mb, this.ptr))
  }

  open fun getVflip(): Boolean {
    val mb = getMethodBind("Viewport","get_vflip")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun getViewportRid(): RID {
    val mb = getMethodBind("Viewport","get_viewport_rid")
    return _icall_RID( mb, this.ptr)
  }

  open fun getVisibleRect(): Rect2 {
    val mb = getMethodBind("Viewport","get_visible_rect")
    return _icall_Rect2( mb, this.ptr)
  }

  open fun getWorld(): World {
    val mb = getMethodBind("Viewport","get_world")
    return _icall_World( mb, this.ptr)
  }

  open fun getWorld2d(): World2D {
    val mb = getMethodBind("Viewport","get_world_2d")
    return _icall_World2D( mb, this.ptr)
  }

  open fun guiGetDragData(): Variant {
    val mb = getMethodBind("Viewport","gui_get_drag_data")
    return _icall_Variant( mb, this.ptr)
  }

  open fun guiHasModalStack(): Boolean {
    val mb = getMethodBind("Viewport","gui_has_modal_stack")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun guiIsDragging(): Boolean {
    val mb = getMethodBind("Viewport","gui_is_dragging")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun hasTransparentBackground(): Boolean {
    val mb = getMethodBind("Viewport","has_transparent_background")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun input(localEvent: InputEvent) {
    val mb = getMethodBind("Viewport","input")
    _icall_Unit_Object( mb, this.ptr, localEvent)
  }

  open fun is3dDisabled(): Boolean {
    val mb = getMethodBind("Viewport","is_3d_disabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isAudioListener(): Boolean {
    val mb = getMethodBind("Viewport","is_audio_listener")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isAudioListener2d(): Boolean {
    val mb = getMethodBind("Viewport","is_audio_listener_2d")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isHandlingInputLocally(): Boolean {
    val mb = getMethodBind("Viewport","is_handling_input_locally")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isInputDisabled(): Boolean {
    val mb = getMethodBind("Viewport","is_input_disabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isInputHandled(): Boolean {
    val mb = getMethodBind("Viewport","is_input_handled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isSizeOverrideEnabled(): Boolean {
    val mb = getMethodBind("Viewport","is_size_override_enabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isSizeOverrideStretchEnabled(): Boolean {
    val mb = getMethodBind("Viewport","is_size_override_stretch_enabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isSnapControlsToPixelsEnabled(): Boolean {
    val mb = getMethodBind("Viewport","is_snap_controls_to_pixels_enabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isUsingOwnWorld(): Boolean {
    val mb = getMethodBind("Viewport","is_using_own_world")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isUsingRenderDirectToScreen(): Boolean {
    val mb = getMethodBind("Viewport","is_using_render_direct_to_screen")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun setAsAudioListener(enable: Boolean) {
    val mb = getMethodBind("Viewport","set_as_audio_listener")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setAsAudioListener2d(enable: Boolean) {
    val mb = getMethodBind("Viewport","set_as_audio_listener_2d")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setAttachToScreenRect(rect: Rect2) {
    val mb = getMethodBind("Viewport","set_attach_to_screen_rect")
    _icall_Unit_Rect2( mb, this.ptr, rect)
  }

  open fun setCanvasTransform(xform: Transform2D) {
    val mb = getMethodBind("Viewport","set_canvas_transform")
    _icall_Unit_Transform2D( mb, this.ptr, xform)
  }

  open fun setClearMode(mode: Long) {
    val mb = getMethodBind("Viewport","set_clear_mode")
    _icall_Unit_Long( mb, this.ptr, mode)
  }

  open fun setDebugDraw(debugDraw: Long) {
    val mb = getMethodBind("Viewport","set_debug_draw")
    _icall_Unit_Long( mb, this.ptr, debugDraw)
  }

  open fun setDisable3d(disable: Boolean) {
    val mb = getMethodBind("Viewport","set_disable_3d")
    _icall_Unit_Boolean( mb, this.ptr, disable)
  }

  open fun setDisableInput(disable: Boolean) {
    val mb = getMethodBind("Viewport","set_disable_input")
    _icall_Unit_Boolean( mb, this.ptr, disable)
  }

  open fun setGlobalCanvasTransform(xform: Transform2D) {
    val mb = getMethodBind("Viewport","set_global_canvas_transform")
    _icall_Unit_Transform2D( mb, this.ptr, xform)
  }

  open fun setHandleInputLocally(enable: Boolean) {
    val mb = getMethodBind("Viewport","set_handle_input_locally")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setHdr(enable: Boolean) {
    val mb = getMethodBind("Viewport","set_hdr")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setInputAsHandled() {
    val mb = getMethodBind("Viewport","set_input_as_handled")
    _icall_Unit( mb, this.ptr)
  }

  open fun setKeep3dLinear(keep3dLinear: Boolean) {
    val mb = getMethodBind("Viewport","set_keep_3d_linear")
    _icall_Unit_Boolean( mb, this.ptr, keep3dLinear)
  }

  open fun setMsaa(msaa: Long) {
    val mb = getMethodBind("Viewport","set_msaa")
    _icall_Unit_Long( mb, this.ptr, msaa)
  }

  open fun setPhysicsObjectPicking(enable: Boolean) {
    val mb = getMethodBind("Viewport","set_physics_object_picking")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setShadowAtlasQuadrantSubdiv(quadrant: Long, subdiv: Long) {
    val mb = getMethodBind("Viewport","set_shadow_atlas_quadrant_subdiv")
    _icall_Unit_Long_Long( mb, this.ptr, quadrant, subdiv)
  }

  open fun setShadowAtlasSize(size: Long) {
    val mb = getMethodBind("Viewport","set_shadow_atlas_size")
    _icall_Unit_Long( mb, this.ptr, size)
  }

  open fun setSize(size: Vector2) {
    val mb = getMethodBind("Viewport","set_size")
    _icall_Unit_Vector2( mb, this.ptr, size)
  }

  open fun setSizeOverride(
    enable: Boolean,
    size: Vector2 = Vector2(-1.0, -1.0),
    margin: Vector2 = Vector2(0.0, 0.0)
  ) {
    val mb = getMethodBind("Viewport","set_size_override")
    _icall_Unit_Boolean_Vector2_Vector2( mb, this.ptr, enable, size, margin)
  }

  open fun setSizeOverrideStretch(enabled: Boolean) {
    val mb = getMethodBind("Viewport","set_size_override_stretch")
    _icall_Unit_Boolean( mb, this.ptr, enabled)
  }

  open fun setSnapControlsToPixels(enabled: Boolean) {
    val mb = getMethodBind("Viewport","set_snap_controls_to_pixels")
    _icall_Unit_Boolean( mb, this.ptr, enabled)
  }

  open fun setTransparentBackground(enable: Boolean) {
    val mb = getMethodBind("Viewport","set_transparent_background")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setUpdateMode(mode: Long) {
    val mb = getMethodBind("Viewport","set_update_mode")
    _icall_Unit_Long( mb, this.ptr, mode)
  }

  open fun setUsage(usage: Long) {
    val mb = getMethodBind("Viewport","set_usage")
    _icall_Unit_Long( mb, this.ptr, usage)
  }

  open fun setUseArvr(use: Boolean) {
    val mb = getMethodBind("Viewport","set_use_arvr")
    _icall_Unit_Boolean( mb, this.ptr, use)
  }

  open fun setUseOwnWorld(enable: Boolean) {
    val mb = getMethodBind("Viewport","set_use_own_world")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setUseRenderDirectToScreen(enable: Boolean) {
    val mb = getMethodBind("Viewport","set_use_render_direct_to_screen")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setVflip(enable: Boolean) {
    val mb = getMethodBind("Viewport","set_vflip")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setWorld(world: World) {
    val mb = getMethodBind("Viewport","set_world")
    _icall_Unit_Object( mb, this.ptr, world)
  }

  open fun setWorld2d(world2d: World2D) {
    val mb = getMethodBind("Viewport","set_world_2d")
    _icall_Unit_Object( mb, this.ptr, world2d)
  }

  open fun unhandledInput(localEvent: InputEvent) {
    val mb = getMethodBind("Viewport","unhandled_input")
    _icall_Unit_Object( mb, this.ptr, localEvent)
  }

  open fun updateWorlds() {
    val mb = getMethodBind("Viewport","update_worlds")
    _icall_Unit( mb, this.ptr)
  }

  open fun useArvr(): Boolean {
    val mb = getMethodBind("Viewport","use_arvr")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun warpMouse(toPosition: Vector2) {
    val mb = getMethodBind("Viewport","warp_mouse")
    _icall_Unit_Vector2( mb, this.ptr, toPosition)
  }

  enum class ClearMode(
    id: Long
  ) {
    CLEAR_MODE_ALWAYS(0),

    CLEAR_MODE_NEVER(1),

    CLEAR_MODE_ONLY_NEXT_FRAME(2);

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
    RENDER_INFO_OBJECTS_IN_FRAME(0),

    RENDER_INFO_VERTICES_IN_FRAME(1),

    RENDER_INFO_MATERIAL_CHANGES_IN_FRAME(2),

    RENDER_INFO_SHADER_CHANGES_IN_FRAME(3),

    RENDER_INFO_SURFACE_CHANGES_IN_FRAME(4),

    RENDER_INFO_DRAW_CALLS_IN_FRAME(5),

    RENDER_INFO_2D_ITEMS_IN_FRAME(6),

    RENDER_INFO_2D_DRAW_CALLS_IN_FRAME(7),

    RENDER_INFO_MAX(8);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class Usage(
    id: Long
  ) {
    USAGE_2D(0),

    USAGE_2D_NO_SAMPLING(1),

    USAGE_3D(2),

    USAGE_3D_NO_EFFECTS(3);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class DebugDraw(
    id: Long
  ) {
    DEBUG_DRAW_DISABLED(0),

    DEBUG_DRAW_UNSHADED(1),

    DEBUG_DRAW_OVERDRAW(2),

    DEBUG_DRAW_WIREFRAME(3);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class ShadowAtlasQuadrantSubdiv(
    id: Long
  ) {
    SHADOW_ATLAS_QUADRANT_SUBDIV_DISABLED(0),

    SHADOW_ATLAS_QUADRANT_SUBDIV_1(1),

    SHADOW_ATLAS_QUADRANT_SUBDIV_4(2),

    SHADOW_ATLAS_QUADRANT_SUBDIV_16(3),

    SHADOW_ATLAS_QUADRANT_SUBDIV_64(4),

    SHADOW_ATLAS_QUADRANT_SUBDIV_256(5),

    SHADOW_ATLAS_QUADRANT_SUBDIV_1024(6),

    SHADOW_ATLAS_QUADRANT_SUBDIV_MAX(7);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class UpdateMode(
    id: Long
  ) {
    UPDATE_DISABLED(0),

    UPDATE_ONCE(1),

    UPDATE_WHEN_VISIBLE(2),

    UPDATE_ALWAYS(3);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class MSAA(
    id: Long
  ) {
    MSAA_DISABLED(0),

    MSAA_2X(1),

    MSAA_4X(2),

    MSAA_8X(3),

    MSAA_16X(4);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val CLEAR_MODE_ALWAYS: Long = 0

    final const val CLEAR_MODE_NEVER: Long = 1

    final const val CLEAR_MODE_ONLY_NEXT_FRAME: Long = 2

    final const val DEBUG_DRAW_DISABLED: Long = 0

    final const val DEBUG_DRAW_OVERDRAW: Long = 2

    final const val DEBUG_DRAW_UNSHADED: Long = 1

    final const val DEBUG_DRAW_WIREFRAME: Long = 3

    final const val MSAA_16X: Long = 4

    final const val MSAA_2X: Long = 1

    final const val MSAA_4X: Long = 2

    final const val MSAA_8X: Long = 3

    final const val MSAA_DISABLED: Long = 0

    final const val RENDER_INFO_2D_DRAW_CALLS_IN_FRAME: Long = 7

    final const val RENDER_INFO_2D_ITEMS_IN_FRAME: Long = 6

    final const val RENDER_INFO_DRAW_CALLS_IN_FRAME: Long = 5

    final const val RENDER_INFO_MATERIAL_CHANGES_IN_FRAME: Long = 2

    final const val RENDER_INFO_MAX: Long = 8

    final const val RENDER_INFO_OBJECTS_IN_FRAME: Long = 0

    final const val RENDER_INFO_SHADER_CHANGES_IN_FRAME: Long = 3

    final const val RENDER_INFO_SURFACE_CHANGES_IN_FRAME: Long = 4

    final const val RENDER_INFO_VERTICES_IN_FRAME: Long = 1

    final const val SHADOW_ATLAS_QUADRANT_SUBDIV_1: Long = 1

    final const val SHADOW_ATLAS_QUADRANT_SUBDIV_1024: Long = 6

    final const val SHADOW_ATLAS_QUADRANT_SUBDIV_16: Long = 3

    final const val SHADOW_ATLAS_QUADRANT_SUBDIV_256: Long = 5

    final const val SHADOW_ATLAS_QUADRANT_SUBDIV_4: Long = 2

    final const val SHADOW_ATLAS_QUADRANT_SUBDIV_64: Long = 4

    final const val SHADOW_ATLAS_QUADRANT_SUBDIV_DISABLED: Long = 0

    final const val SHADOW_ATLAS_QUADRANT_SUBDIV_MAX: Long = 7

    final const val UPDATE_ALWAYS: Long = 3

    final const val UPDATE_DISABLED: Long = 0

    final const val UPDATE_ONCE: Long = 1

    final const val UPDATE_WHEN_VISIBLE: Long = 2

    final const val USAGE_2D: Long = 0

    final const val USAGE_2D_NO_SAMPLING: Long = 1

    final const val USAGE_3D: Long = 2

    final const val USAGE_3D_NO_EFFECTS: Long = 3
  }
}
