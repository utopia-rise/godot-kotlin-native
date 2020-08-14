// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.Camera2D
import godot.core.Vector2
import godot.icalls._icall_Boolean
import godot.icalls._icall_Double
import godot.icalls._icall_Double_Long
import godot.icalls._icall_Long
import godot.icalls._icall_Long_Long
import godot.icalls._icall_Node
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Long_Double
import godot.icalls._icall_Unit_Long_Long
import godot.icalls._icall_Unit_Object
import godot.icalls._icall_Unit_Vector2
import godot.icalls._icall_Vector2
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Unit
import kotlinx.cinterop.COpaquePointer

open class Camera2D : Node2D() {
  open var anchorMode: Long
    get() {
      val mb = getMethodBind("Camera2D","get_anchor_mode")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Camera2D","set_anchor_mode")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open val current: Boolean
    get() {
      val mb = getMethodBind("Camera2D","is_current")
      return _icall_Boolean(mb, this.ptr)
    }

  open var customViewport: Node
    get() {
      val mb = getMethodBind("Camera2D","get_custom_viewport")
      return _icall_Node(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Camera2D","set_custom_viewport")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  open var dragMarginBottom: Double
    get() {
      val mb = getMethodBind("Camera2D","get_drag_margin")
      return _icall_Double_Long(mb, this.ptr, 3)
    }
    set(value) {
      val mb = getMethodBind("Camera2D","set_drag_margin")
      _icall_Unit_Long_Double(mb, this.ptr, 3, value)
    }

  open var dragMarginHEnabled: Boolean
    get() {
      val mb = getMethodBind("Camera2D","is_h_drag_enabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Camera2D","set_h_drag_enabled")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var dragMarginLeft: Double
    get() {
      val mb = getMethodBind("Camera2D","get_drag_margin")
      return _icall_Double_Long(mb, this.ptr, 0)
    }
    set(value) {
      val mb = getMethodBind("Camera2D","set_drag_margin")
      _icall_Unit_Long_Double(mb, this.ptr, 0, value)
    }

  open var dragMarginRight: Double
    get() {
      val mb = getMethodBind("Camera2D","get_drag_margin")
      return _icall_Double_Long(mb, this.ptr, 2)
    }
    set(value) {
      val mb = getMethodBind("Camera2D","set_drag_margin")
      _icall_Unit_Long_Double(mb, this.ptr, 2, value)
    }

  open var dragMarginTop: Double
    get() {
      val mb = getMethodBind("Camera2D","get_drag_margin")
      return _icall_Double_Long(mb, this.ptr, 1)
    }
    set(value) {
      val mb = getMethodBind("Camera2D","set_drag_margin")
      _icall_Unit_Long_Double(mb, this.ptr, 1, value)
    }

  open var dragMarginVEnabled: Boolean
    get() {
      val mb = getMethodBind("Camera2D","is_v_drag_enabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Camera2D","set_v_drag_enabled")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var editorDrawDragMargin: Boolean
    get() {
      val mb = getMethodBind("Camera2D","is_margin_drawing_enabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Camera2D","set_margin_drawing_enabled")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var editorDrawLimits: Boolean
    get() {
      val mb = getMethodBind("Camera2D","is_limit_drawing_enabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Camera2D","set_limit_drawing_enabled")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var editorDrawScreen: Boolean
    get() {
      val mb = getMethodBind("Camera2D","is_screen_drawing_enabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Camera2D","set_screen_drawing_enabled")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var limitBottom: Long
    get() {
      val mb = getMethodBind("Camera2D","get_limit")
      return _icall_Long_Long(mb, this.ptr, 3)
    }
    set(value) {
      val mb = getMethodBind("Camera2D","set_limit")
      _icall_Unit_Long_Long(mb, this.ptr, 3, value)
    }

  open var limitLeft: Long
    get() {
      val mb = getMethodBind("Camera2D","get_limit")
      return _icall_Long_Long(mb, this.ptr, 0)
    }
    set(value) {
      val mb = getMethodBind("Camera2D","set_limit")
      _icall_Unit_Long_Long(mb, this.ptr, 0, value)
    }

  open var limitRight: Long
    get() {
      val mb = getMethodBind("Camera2D","get_limit")
      return _icall_Long_Long(mb, this.ptr, 2)
    }
    set(value) {
      val mb = getMethodBind("Camera2D","set_limit")
      _icall_Unit_Long_Long(mb, this.ptr, 2, value)
    }

  open var limitSmoothed: Boolean
    get() {
      val mb = getMethodBind("Camera2D","is_limit_smoothing_enabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Camera2D","set_limit_smoothing_enabled")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var limitTop: Long
    get() {
      val mb = getMethodBind("Camera2D","get_limit")
      return _icall_Long_Long(mb, this.ptr, 1)
    }
    set(value) {
      val mb = getMethodBind("Camera2D","set_limit")
      _icall_Unit_Long_Long(mb, this.ptr, 1, value)
    }

  open var offset: Vector2
    get() {
      val mb = getMethodBind("Camera2D","get_offset")
      return _icall_Vector2(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Camera2D","set_offset")
      _icall_Unit_Vector2(mb, this.ptr, value)
    }

  open var offsetH: Double
    get() {
      val mb = getMethodBind("Camera2D","get_h_offset")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Camera2D","set_h_offset")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var offsetV: Double
    get() {
      val mb = getMethodBind("Camera2D","get_v_offset")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Camera2D","set_v_offset")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var processMode: Long
    get() {
      val mb = getMethodBind("Camera2D","get_process_mode")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Camera2D","set_process_mode")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var rotating: Boolean
    get() {
      val mb = getMethodBind("Camera2D","is_rotating")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Camera2D","set_rotating")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var smoothingEnabled: Boolean
    get() {
      val mb = getMethodBind("Camera2D","is_follow_smoothing_enabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Camera2D","set_enable_follow_smoothing")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var smoothingSpeed: Double
    get() {
      val mb = getMethodBind("Camera2D","get_follow_smoothing")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Camera2D","set_follow_smoothing")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var zoom: Vector2
    get() {
      val mb = getMethodBind("Camera2D","get_zoom")
      return _icall_Vector2(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Camera2D","set_zoom")
      _icall_Unit_Vector2(mb, this.ptr, value)
    }

  override fun __new(): COpaquePointer = invokeConstructor("Camera2D", "Camera2D")

  open fun offset(schedule: Vector2.() -> Unit): Vector2 = offset.apply{
      schedule(this)
      offset = this
  }


  open fun zoom(schedule: Vector2.() -> Unit): Vector2 = zoom.apply{
      schedule(this)
      zoom = this
  }


  open fun _makeCurrent(arg0: Object) {
  }

  open fun _setCurrent(current: Boolean) {
  }

  open fun _setOldSmoothing(followSmoothing: Double) {
  }

  open fun _updateScroll() {
  }

  open fun align() {
    val mb = getMethodBind("Camera2D","align")
    _icall_Unit( mb, this.ptr)
  }

  open fun clearCurrent() {
    val mb = getMethodBind("Camera2D","clear_current")
    _icall_Unit( mb, this.ptr)
  }

  open fun forceUpdateScroll() {
    val mb = getMethodBind("Camera2D","force_update_scroll")
    _icall_Unit( mb, this.ptr)
  }

  open fun getAnchorMode(): Camera2D.AnchorMode {
    val mb = getMethodBind("Camera2D","get_anchor_mode")
    return Camera2D.AnchorMode.from( _icall_Long( mb, this.ptr))
  }

  open fun getCameraPosition(): Vector2 {
    val mb = getMethodBind("Camera2D","get_camera_position")
    return _icall_Vector2( mb, this.ptr)
  }

  open fun getCameraScreenCenter(): Vector2 {
    val mb = getMethodBind("Camera2D","get_camera_screen_center")
    return _icall_Vector2( mb, this.ptr)
  }

  open fun getCustomViewport(): Node {
    val mb = getMethodBind("Camera2D","get_custom_viewport")
    return _icall_Node( mb, this.ptr)
  }

  open fun getDragMargin(margin: Long): Double {
    val mb = getMethodBind("Camera2D","get_drag_margin")
    return _icall_Double_Long( mb, this.ptr, margin)
  }

  open fun getFollowSmoothing(): Double {
    val mb = getMethodBind("Camera2D","get_follow_smoothing")
    return _icall_Double( mb, this.ptr)
  }

  open fun getHOffset(): Double {
    val mb = getMethodBind("Camera2D","get_h_offset")
    return _icall_Double( mb, this.ptr)
  }

  open fun getLimit(margin: Long): Long {
    val mb = getMethodBind("Camera2D","get_limit")
    return _icall_Long_Long( mb, this.ptr, margin)
  }

  open fun getOffset(): Vector2 {
    val mb = getMethodBind("Camera2D","get_offset")
    return _icall_Vector2( mb, this.ptr)
  }

  open fun getProcessMode(): Camera2D.Camera2DProcessMode {
    val mb = getMethodBind("Camera2D","get_process_mode")
    return Camera2D.Camera2DProcessMode.from( _icall_Long( mb, this.ptr))
  }

  open fun getVOffset(): Double {
    val mb = getMethodBind("Camera2D","get_v_offset")
    return _icall_Double( mb, this.ptr)
  }

  open fun getZoom(): Vector2 {
    val mb = getMethodBind("Camera2D","get_zoom")
    return _icall_Vector2( mb, this.ptr)
  }

  open fun isCurrent(): Boolean {
    val mb = getMethodBind("Camera2D","is_current")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isFollowSmoothingEnabled(): Boolean {
    val mb = getMethodBind("Camera2D","is_follow_smoothing_enabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isHDragEnabled(): Boolean {
    val mb = getMethodBind("Camera2D","is_h_drag_enabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isLimitDrawingEnabled(): Boolean {
    val mb = getMethodBind("Camera2D","is_limit_drawing_enabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isLimitSmoothingEnabled(): Boolean {
    val mb = getMethodBind("Camera2D","is_limit_smoothing_enabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isMarginDrawingEnabled(): Boolean {
    val mb = getMethodBind("Camera2D","is_margin_drawing_enabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isRotating(): Boolean {
    val mb = getMethodBind("Camera2D","is_rotating")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isScreenDrawingEnabled(): Boolean {
    val mb = getMethodBind("Camera2D","is_screen_drawing_enabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isVDragEnabled(): Boolean {
    val mb = getMethodBind("Camera2D","is_v_drag_enabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun makeCurrent() {
    val mb = getMethodBind("Camera2D","make_current")
    _icall_Unit( mb, this.ptr)
  }

  open fun resetSmoothing() {
    val mb = getMethodBind("Camera2D","reset_smoothing")
    _icall_Unit( mb, this.ptr)
  }

  open fun setAnchorMode(anchorMode: Long) {
    val mb = getMethodBind("Camera2D","set_anchor_mode")
    _icall_Unit_Long( mb, this.ptr, anchorMode)
  }

  open fun setCustomViewport(viewport: Node) {
    val mb = getMethodBind("Camera2D","set_custom_viewport")
    _icall_Unit_Object( mb, this.ptr, viewport)
  }

  open fun setDragMargin(margin: Long, dragMargin: Double) {
    val mb = getMethodBind("Camera2D","set_drag_margin")
    _icall_Unit_Long_Double( mb, this.ptr, margin, dragMargin)
  }

  open fun setEnableFollowSmoothing(followSmoothing: Boolean) {
    val mb = getMethodBind("Camera2D","set_enable_follow_smoothing")
    _icall_Unit_Boolean( mb, this.ptr, followSmoothing)
  }

  open fun setFollowSmoothing(followSmoothing: Double) {
    val mb = getMethodBind("Camera2D","set_follow_smoothing")
    _icall_Unit_Double( mb, this.ptr, followSmoothing)
  }

  open fun setHDragEnabled(enabled: Boolean) {
    val mb = getMethodBind("Camera2D","set_h_drag_enabled")
    _icall_Unit_Boolean( mb, this.ptr, enabled)
  }

  open fun setHOffset(ofs: Double) {
    val mb = getMethodBind("Camera2D","set_h_offset")
    _icall_Unit_Double( mb, this.ptr, ofs)
  }

  open fun setLimit(margin: Long, limit: Long) {
    val mb = getMethodBind("Camera2D","set_limit")
    _icall_Unit_Long_Long( mb, this.ptr, margin, limit)
  }

  open fun setLimitDrawingEnabled(limitDrawingEnabled: Boolean) {
    val mb = getMethodBind("Camera2D","set_limit_drawing_enabled")
    _icall_Unit_Boolean( mb, this.ptr, limitDrawingEnabled)
  }

  open fun setLimitSmoothingEnabled(limitSmoothingEnabled: Boolean) {
    val mb = getMethodBind("Camera2D","set_limit_smoothing_enabled")
    _icall_Unit_Boolean( mb, this.ptr, limitSmoothingEnabled)
  }

  open fun setMarginDrawingEnabled(marginDrawingEnabled: Boolean) {
    val mb = getMethodBind("Camera2D","set_margin_drawing_enabled")
    _icall_Unit_Boolean( mb, this.ptr, marginDrawingEnabled)
  }

  open fun setOffset(offset: Vector2) {
    val mb = getMethodBind("Camera2D","set_offset")
    _icall_Unit_Vector2( mb, this.ptr, offset)
  }

  open fun setProcessMode(mode: Long) {
    val mb = getMethodBind("Camera2D","set_process_mode")
    _icall_Unit_Long( mb, this.ptr, mode)
  }

  open fun setRotating(rotating: Boolean) {
    val mb = getMethodBind("Camera2D","set_rotating")
    _icall_Unit_Boolean( mb, this.ptr, rotating)
  }

  open fun setScreenDrawingEnabled(screenDrawingEnabled: Boolean) {
    val mb = getMethodBind("Camera2D","set_screen_drawing_enabled")
    _icall_Unit_Boolean( mb, this.ptr, screenDrawingEnabled)
  }

  open fun setVDragEnabled(enabled: Boolean) {
    val mb = getMethodBind("Camera2D","set_v_drag_enabled")
    _icall_Unit_Boolean( mb, this.ptr, enabled)
  }

  open fun setVOffset(ofs: Double) {
    val mb = getMethodBind("Camera2D","set_v_offset")
    _icall_Unit_Double( mb, this.ptr, ofs)
  }

  open fun setZoom(zoom: Vector2) {
    val mb = getMethodBind("Camera2D","set_zoom")
    _icall_Unit_Vector2( mb, this.ptr, zoom)
  }

  enum class Camera2DProcessMode(
    id: Long
  ) {
    CAMERA2D_PROCESS_PHYSICS(0),

    CAMERA2D_PROCESS_IDLE(1);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class AnchorMode(
    id: Long
  ) {
    ANCHOR_MODE_FIXED_TOP_LEFT(0),

    ANCHOR_MODE_DRAG_CENTER(1);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object
}
