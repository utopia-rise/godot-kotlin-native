// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.Control
import godot.core.Color
import godot.core.NodePath
import godot.core.Rect2
import godot.core.Signal0
import godot.core.Signal1
import godot.core.Variant
import godot.core.Vector2
import godot.core.signal
import godot.icalls._icall_Boolean
import godot.icalls._icall_Boolean_String
import godot.icalls._icall_Boolean_String_String
import godot.icalls._icall_Color_String_String
import godot.icalls._icall_Control
import godot.icalls._icall_Double
import godot.icalls._icall_Double_Long
import godot.icalls._icall_Font_String_String
import godot.icalls._icall_Long
import godot.icalls._icall_Long_String_String
import godot.icalls._icall_Long_Vector2
import godot.icalls._icall_NodePath
import godot.icalls._icall_NodePath_Long
import godot.icalls._icall_Rect2
import godot.icalls._icall_String_Vector2
import godot.icalls._icall_StyleBox_String_String
import godot.icalls._icall_Texture_String_String
import godot.icalls._icall_Theme
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Long_Boolean
import godot.icalls._icall_Unit_Long_Double
import godot.icalls._icall_Unit_Long_Double_Boolean_Boolean
import godot.icalls._icall_Unit_Long_Double_Double_Boolean
import godot.icalls._icall_Unit_Long_Long_Long
import godot.icalls._icall_Unit_Long_NodePath
import godot.icalls._icall_Unit_NodePath
import godot.icalls._icall_Unit_Object
import godot.icalls._icall_Unit_String
import godot.icalls._icall_Unit_String_Color
import godot.icalls._icall_Unit_String_Long
import godot.icalls._icall_Unit_String_Object
import godot.icalls._icall_Unit_Variant_Object
import godot.icalls._icall_Unit_Vector2
import godot.icalls._icall_Unit_Vector2_Boolean
import godot.icalls._icall_Vector2
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.UninitializedPropertyAccessException
import kotlin.Unit
import kotlinx.cinterop.COpaquePointer

open class Control : CanvasItem() {
  val focusEntered: Signal0 by signal()

  val focusExited: Signal0 by signal()

  val guiInput: Signal1<InputEvent> by signal("event")

  val minimumSizeChanged: Signal0 by signal()

  val modalClosed: Signal0 by signal()

  val mouseEntered: Signal0 by signal()

  val mouseExited: Signal0 by signal()

  val resized: Signal0 by signal()

  val sizeFlagsChanged: Signal0 by signal()

  open val anchorBottom: Double
    get() {
      val mb = getMethodBind("Control","get_anchor")
      return _icall_Double_Long(mb, this.ptr, 3)
    }

  open val anchorLeft: Double
    get() {
      val mb = getMethodBind("Control","get_anchor")
      return _icall_Double_Long(mb, this.ptr, 0)
    }

  open val anchorRight: Double
    get() {
      val mb = getMethodBind("Control","get_anchor")
      return _icall_Double_Long(mb, this.ptr, 2)
    }

  open val anchorTop: Double
    get() {
      val mb = getMethodBind("Control","get_anchor")
      return _icall_Double_Long(mb, this.ptr, 1)
    }

  open var focusMode: Long
    get() {
      val mb = getMethodBind("Control","get_focus_mode")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Control","set_focus_mode")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var focusNeighbourBottom: NodePath
    get() {
      val mb = getMethodBind("Control","get_focus_neighbour")
      return _icall_NodePath_Long(mb, this.ptr, 3)
    }
    set(value) {
      val mb = getMethodBind("Control","set_focus_neighbour")
      _icall_Unit_Long_NodePath(mb, this.ptr, 3, value)
    }

  open var focusNeighbourLeft: NodePath
    get() {
      val mb = getMethodBind("Control","get_focus_neighbour")
      return _icall_NodePath_Long(mb, this.ptr, 0)
    }
    set(value) {
      val mb = getMethodBind("Control","set_focus_neighbour")
      _icall_Unit_Long_NodePath(mb, this.ptr, 0, value)
    }

  open var focusNeighbourRight: NodePath
    get() {
      val mb = getMethodBind("Control","get_focus_neighbour")
      return _icall_NodePath_Long(mb, this.ptr, 2)
    }
    set(value) {
      val mb = getMethodBind("Control","set_focus_neighbour")
      _icall_Unit_Long_NodePath(mb, this.ptr, 2, value)
    }

  open var focusNeighbourTop: NodePath
    get() {
      val mb = getMethodBind("Control","get_focus_neighbour")
      return _icall_NodePath_Long(mb, this.ptr, 1)
    }
    set(value) {
      val mb = getMethodBind("Control","set_focus_neighbour")
      _icall_Unit_Long_NodePath(mb, this.ptr, 1, value)
    }

  open var focusNext: NodePath
    get() {
      val mb = getMethodBind("Control","get_focus_next")
      return _icall_NodePath(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Control","set_focus_next")
      _icall_Unit_NodePath(mb, this.ptr, value)
    }

  open var focusPrevious: NodePath
    get() {
      val mb = getMethodBind("Control","get_focus_previous")
      return _icall_NodePath(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Control","set_focus_previous")
      _icall_Unit_NodePath(mb, this.ptr, value)
    }

  open var growHorizontal: Long
    get() {
      val mb = getMethodBind("Control","get_h_grow_direction")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Control","set_h_grow_direction")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var growVertical: Long
    get() {
      val mb = getMethodBind("Control","get_v_grow_direction")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Control","set_v_grow_direction")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var hintTooltip: String
    get() {
      throw
          UninitializedPropertyAccessException("Cannot access property hintTooltip: has no getter")
    }
    set(value) {
      val mb = getMethodBind("Control","set_tooltip")
      _icall_Unit_String(mb, this.ptr, value)
    }

  open var marginBottom: Double
    get() {
      val mb = getMethodBind("Control","get_margin")
      return _icall_Double_Long(mb, this.ptr, 3)
    }
    set(value) {
      val mb = getMethodBind("Control","set_margin")
      _icall_Unit_Long_Double(mb, this.ptr, 3, value)
    }

  open var marginLeft: Double
    get() {
      val mb = getMethodBind("Control","get_margin")
      return _icall_Double_Long(mb, this.ptr, 0)
    }
    set(value) {
      val mb = getMethodBind("Control","set_margin")
      _icall_Unit_Long_Double(mb, this.ptr, 0, value)
    }

  open var marginRight: Double
    get() {
      val mb = getMethodBind("Control","get_margin")
      return _icall_Double_Long(mb, this.ptr, 2)
    }
    set(value) {
      val mb = getMethodBind("Control","set_margin")
      _icall_Unit_Long_Double(mb, this.ptr, 2, value)
    }

  open var marginTop: Double
    get() {
      val mb = getMethodBind("Control","get_margin")
      return _icall_Double_Long(mb, this.ptr, 1)
    }
    set(value) {
      val mb = getMethodBind("Control","set_margin")
      _icall_Unit_Long_Double(mb, this.ptr, 1, value)
    }

  open var mouseDefaultCursorShape: Long
    get() {
      val mb = getMethodBind("Control","get_default_cursor_shape")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Control","set_default_cursor_shape")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var mouseFilter: Long
    get() {
      val mb = getMethodBind("Control","get_mouse_filter")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Control","set_mouse_filter")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var rectClipContent: Boolean
    get() {
      val mb = getMethodBind("Control","is_clipping_contents")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Control","set_clip_contents")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open val rectGlobalPosition: Vector2
    get() {
      val mb = getMethodBind("Control","get_global_position")
      return _icall_Vector2(mb, this.ptr)
    }

  open var rectMinSize: Vector2
    get() {
      val mb = getMethodBind("Control","get_custom_minimum_size")
      return _icall_Vector2(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Control","set_custom_minimum_size")
      _icall_Unit_Vector2(mb, this.ptr, value)
    }

  open var rectPivotOffset: Vector2
    get() {
      val mb = getMethodBind("Control","get_pivot_offset")
      return _icall_Vector2(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Control","set_pivot_offset")
      _icall_Unit_Vector2(mb, this.ptr, value)
    }

  open val rectPosition: Vector2
    get() {
      val mb = getMethodBind("Control","get_position")
      return _icall_Vector2(mb, this.ptr)
    }

  open var rectRotation: Double
    get() {
      val mb = getMethodBind("Control","get_rotation_degrees")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Control","set_rotation_degrees")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var rectScale: Vector2
    get() {
      val mb = getMethodBind("Control","get_scale")
      return _icall_Vector2(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Control","set_scale")
      _icall_Unit_Vector2(mb, this.ptr, value)
    }

  open val rectSize: Vector2
    get() {
      val mb = getMethodBind("Control","get_size")
      return _icall_Vector2(mb, this.ptr)
    }

  open var sizeFlagsHorizontal: Long
    get() {
      val mb = getMethodBind("Control","get_h_size_flags")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Control","set_h_size_flags")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var sizeFlagsStretchRatio: Double
    get() {
      val mb = getMethodBind("Control","get_stretch_ratio")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Control","set_stretch_ratio")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var sizeFlagsVertical: Long
    get() {
      val mb = getMethodBind("Control","get_v_size_flags")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Control","set_v_size_flags")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var theme: Theme
    get() {
      val mb = getMethodBind("Control","get_theme")
      return _icall_Theme(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Control","set_theme")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  override fun __new(): COpaquePointer = invokeConstructor("Control", "Control")

  open fun rectMinSize(schedule: Vector2.() -> Unit): Vector2 = rectMinSize.apply{
      schedule(this)
      rectMinSize = this
  }


  open fun rectPivotOffset(schedule: Vector2.() -> Unit): Vector2 = rectPivotOffset.apply{
      schedule(this)
      rectPivotOffset = this
  }


  open fun rectScale(schedule: Vector2.() -> Unit): Vector2 = rectScale.apply{
      schedule(this)
      rectScale = this
  }


  open fun _clipsInput(): Boolean {
    throw NotImplementedError("_clips_input is not implemented for Control")
  }

  open fun _getMinimumSize(): Vector2 {
    throw NotImplementedError("_get_minimum_size is not implemented for Control")
  }

  open fun _getTooltip(): String {
    throw NotImplementedError("_get_tooltip is not implemented for Control")
  }

  open fun _guiInput(event: InputEvent) {
  }

  open fun _makeCustomTooltip(forText: String): Object {
    throw NotImplementedError("_make_custom_tooltip is not implemented for Control")
  }

  open fun _overrideChanged() {
  }

  open fun _setAnchor(margin: Long, anchor: Double) {
  }

  open fun _setGlobalPosition(position: Vector2) {
  }

  open fun _setPosition(margin: Vector2) {
  }

  open fun _setSize(size: Vector2) {
  }

  open fun _sizeChanged() {
  }

  open fun _themeChanged() {
  }

  open fun _updateMinimumSize() {
  }

  open fun acceptEvent() {
    val mb = getMethodBind("Control","accept_event")
    _icall_Unit( mb, this.ptr)
  }

  open fun addColorOverride(name: String, color: Color) {
    val mb = getMethodBind("Control","add_color_override")
    _icall_Unit_String_Color( mb, this.ptr, name, color)
  }

  open fun addConstantOverride(name: String, constant: Long) {
    val mb = getMethodBind("Control","add_constant_override")
    _icall_Unit_String_Long( mb, this.ptr, name, constant)
  }

  open fun addFontOverride(name: String, font: Font) {
    val mb = getMethodBind("Control","add_font_override")
    _icall_Unit_String_Object( mb, this.ptr, name, font)
  }

  open fun addIconOverride(name: String, texture: Texture) {
    val mb = getMethodBind("Control","add_icon_override")
    _icall_Unit_String_Object( mb, this.ptr, name, texture)
  }

  open fun addShaderOverride(name: String, shader: Shader) {
    val mb = getMethodBind("Control","add_shader_override")
    _icall_Unit_String_Object( mb, this.ptr, name, shader)
  }

  open fun addStyleboxOverride(name: String, stylebox: StyleBox) {
    val mb = getMethodBind("Control","add_stylebox_override")
    _icall_Unit_String_Object( mb, this.ptr, name, stylebox)
  }

  open fun canDropData(position: Vector2, data: Variant): Boolean {
    throw NotImplementedError("can_drop_data is not implemented for Control")
  }

  open fun dropData(position: Vector2, data: Variant) {
  }

  open fun forceDrag(data: Variant, preview: Control) {
    val mb = getMethodBind("Control","force_drag")
    _icall_Unit_Variant_Object( mb, this.ptr, data, preview)
  }

  open fun getAnchor(margin: Long): Double {
    val mb = getMethodBind("Control","get_anchor")
    return _icall_Double_Long( mb, this.ptr, margin)
  }

  open fun getBegin(): Vector2 {
    val mb = getMethodBind("Control","get_begin")
    return _icall_Vector2( mb, this.ptr)
  }

  open fun getColor(name: String, type: String = ""): Color {
    val mb = getMethodBind("Control","get_color")
    return _icall_Color_String_String( mb, this.ptr, name, type)
  }

  open fun getCombinedMinimumSize(): Vector2 {
    val mb = getMethodBind("Control","get_combined_minimum_size")
    return _icall_Vector2( mb, this.ptr)
  }

  open fun getConstant(name: String, type: String = ""): Long {
    val mb = getMethodBind("Control","get_constant")
    return _icall_Long_String_String( mb, this.ptr, name, type)
  }

  open fun getCursorShape(position: Vector2 = Vector2(0.0, 0.0)): Control.CursorShape {
    val mb = getMethodBind("Control","get_cursor_shape")
    return Control.CursorShape.from( _icall_Long_Vector2( mb, this.ptr, position))
  }

  open fun getCustomMinimumSize(): Vector2 {
    val mb = getMethodBind("Control","get_custom_minimum_size")
    return _icall_Vector2( mb, this.ptr)
  }

  open fun getDefaultCursorShape(): Control.CursorShape {
    val mb = getMethodBind("Control","get_default_cursor_shape")
    return Control.CursorShape.from( _icall_Long( mb, this.ptr))
  }

  open fun getDragData(position: Vector2): Variant {
    throw NotImplementedError("get_drag_data is not implemented for Control")
  }

  open fun getEnd(): Vector2 {
    val mb = getMethodBind("Control","get_end")
    return _icall_Vector2( mb, this.ptr)
  }

  open fun getFocusMode(): Control.FocusMode {
    val mb = getMethodBind("Control","get_focus_mode")
    return Control.FocusMode.from( _icall_Long( mb, this.ptr))
  }

  open fun getFocusNeighbour(margin: Long): NodePath {
    val mb = getMethodBind("Control","get_focus_neighbour")
    return _icall_NodePath_Long( mb, this.ptr, margin)
  }

  open fun getFocusNext(): NodePath {
    val mb = getMethodBind("Control","get_focus_next")
    return _icall_NodePath( mb, this.ptr)
  }

  open fun getFocusOwner(): Control {
    val mb = getMethodBind("Control","get_focus_owner")
    return _icall_Control( mb, this.ptr)
  }

  open fun getFocusPrevious(): NodePath {
    val mb = getMethodBind("Control","get_focus_previous")
    return _icall_NodePath( mb, this.ptr)
  }

  open fun getFont(name: String, type: String = ""): Font {
    val mb = getMethodBind("Control","get_font")
    return _icall_Font_String_String( mb, this.ptr, name, type)
  }

  open fun getGlobalPosition(): Vector2 {
    val mb = getMethodBind("Control","get_global_position")
    return _icall_Vector2( mb, this.ptr)
  }

  open fun getGlobalRect(): Rect2 {
    val mb = getMethodBind("Control","get_global_rect")
    return _icall_Rect2( mb, this.ptr)
  }

  open fun getHGrowDirection(): Control.GrowDirection {
    val mb = getMethodBind("Control","get_h_grow_direction")
    return Control.GrowDirection.from( _icall_Long( mb, this.ptr))
  }

  open fun getHSizeFlags(): Long {
    val mb = getMethodBind("Control","get_h_size_flags")
    return _icall_Long( mb, this.ptr)
  }

  open fun getIcon(name: String, type: String = ""): Texture {
    val mb = getMethodBind("Control","get_icon")
    return _icall_Texture_String_String( mb, this.ptr, name, type)
  }

  open fun getMargin(margin: Long): Double {
    val mb = getMethodBind("Control","get_margin")
    return _icall_Double_Long( mb, this.ptr, margin)
  }

  open fun getMinimumSize(): Vector2 {
    val mb = getMethodBind("Control","get_minimum_size")
    return _icall_Vector2( mb, this.ptr)
  }

  open fun getMouseFilter(): Control.MouseFilter {
    val mb = getMethodBind("Control","get_mouse_filter")
    return Control.MouseFilter.from( _icall_Long( mb, this.ptr))
  }

  open fun getParentAreaSize(): Vector2 {
    val mb = getMethodBind("Control","get_parent_area_size")
    return _icall_Vector2( mb, this.ptr)
  }

  open fun getParentControl(): Control {
    val mb = getMethodBind("Control","get_parent_control")
    return _icall_Control( mb, this.ptr)
  }

  open fun getPivotOffset(): Vector2 {
    val mb = getMethodBind("Control","get_pivot_offset")
    return _icall_Vector2( mb, this.ptr)
  }

  open fun getPosition(): Vector2 {
    val mb = getMethodBind("Control","get_position")
    return _icall_Vector2( mb, this.ptr)
  }

  open fun getRect(): Rect2 {
    val mb = getMethodBind("Control","get_rect")
    return _icall_Rect2( mb, this.ptr)
  }

  open fun getRotation(): Double {
    val mb = getMethodBind("Control","get_rotation")
    return _icall_Double( mb, this.ptr)
  }

  open fun getRotationDegrees(): Double {
    val mb = getMethodBind("Control","get_rotation_degrees")
    return _icall_Double( mb, this.ptr)
  }

  open fun getScale(): Vector2 {
    val mb = getMethodBind("Control","get_scale")
    return _icall_Vector2( mb, this.ptr)
  }

  open fun getSize(): Vector2 {
    val mb = getMethodBind("Control","get_size")
    return _icall_Vector2( mb, this.ptr)
  }

  open fun getStretchRatio(): Double {
    val mb = getMethodBind("Control","get_stretch_ratio")
    return _icall_Double( mb, this.ptr)
  }

  open fun getStylebox(name: String, type: String = ""): StyleBox {
    val mb = getMethodBind("Control","get_stylebox")
    return _icall_StyleBox_String_String( mb, this.ptr, name, type)
  }

  open fun getTheme(): Theme {
    val mb = getMethodBind("Control","get_theme")
    return _icall_Theme( mb, this.ptr)
  }

  open fun getTooltip(atPosition: Vector2 = Vector2(0.0, 0.0)): String {
    val mb = getMethodBind("Control","get_tooltip")
    return _icall_String_Vector2( mb, this.ptr, atPosition)
  }

  open fun getVGrowDirection(): Control.GrowDirection {
    val mb = getMethodBind("Control","get_v_grow_direction")
    return Control.GrowDirection.from( _icall_Long( mb, this.ptr))
  }

  open fun getVSizeFlags(): Long {
    val mb = getMethodBind("Control","get_v_size_flags")
    return _icall_Long( mb, this.ptr)
  }

  open fun grabClickFocus() {
    val mb = getMethodBind("Control","grab_click_focus")
    _icall_Unit( mb, this.ptr)
  }

  open fun grabFocus() {
    val mb = getMethodBind("Control","grab_focus")
    _icall_Unit( mb, this.ptr)
  }

  open fun hasColor(name: String, type: String = ""): Boolean {
    val mb = getMethodBind("Control","has_color")
    return _icall_Boolean_String_String( mb, this.ptr, name, type)
  }

  open fun hasColorOverride(name: String): Boolean {
    val mb = getMethodBind("Control","has_color_override")
    return _icall_Boolean_String( mb, this.ptr, name)
  }

  open fun hasConstant(name: String, type: String = ""): Boolean {
    val mb = getMethodBind("Control","has_constant")
    return _icall_Boolean_String_String( mb, this.ptr, name, type)
  }

  open fun hasConstantOverride(name: String): Boolean {
    val mb = getMethodBind("Control","has_constant_override")
    return _icall_Boolean_String( mb, this.ptr, name)
  }

  open fun hasFocus(): Boolean {
    val mb = getMethodBind("Control","has_focus")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun hasFont(name: String, type: String = ""): Boolean {
    val mb = getMethodBind("Control","has_font")
    return _icall_Boolean_String_String( mb, this.ptr, name, type)
  }

  open fun hasFontOverride(name: String): Boolean {
    val mb = getMethodBind("Control","has_font_override")
    return _icall_Boolean_String( mb, this.ptr, name)
  }

  open fun hasIcon(name: String, type: String = ""): Boolean {
    val mb = getMethodBind("Control","has_icon")
    return _icall_Boolean_String_String( mb, this.ptr, name, type)
  }

  open fun hasIconOverride(name: String): Boolean {
    val mb = getMethodBind("Control","has_icon_override")
    return _icall_Boolean_String( mb, this.ptr, name)
  }

  open fun hasPoint(point: Vector2): Boolean {
    throw NotImplementedError("has_point is not implemented for Control")
  }

  open fun hasShaderOverride(name: String): Boolean {
    val mb = getMethodBind("Control","has_shader_override")
    return _icall_Boolean_String( mb, this.ptr, name)
  }

  open fun hasStylebox(name: String, type: String = ""): Boolean {
    val mb = getMethodBind("Control","has_stylebox")
    return _icall_Boolean_String_String( mb, this.ptr, name, type)
  }

  open fun hasStyleboxOverride(name: String): Boolean {
    val mb = getMethodBind("Control","has_stylebox_override")
    return _icall_Boolean_String( mb, this.ptr, name)
  }

  open fun isClippingContents(): Boolean {
    val mb = getMethodBind("Control","is_clipping_contents")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun minimumSizeChanged() {
    val mb = getMethodBind("Control","minimum_size_changed")
    _icall_Unit( mb, this.ptr)
  }

  open fun releaseFocus() {
    val mb = getMethodBind("Control","release_focus")
    _icall_Unit( mb, this.ptr)
  }

  open fun setAnchor(
    margin: Long,
    anchor: Double,
    keepMargin: Boolean = false,
    pushOppositeAnchor: Boolean = true
  ) {
    val mb = getMethodBind("Control","set_anchor")
    _icall_Unit_Long_Double_Boolean_Boolean( mb, this.ptr, margin, anchor, keepMargin,
        pushOppositeAnchor)
  }

  open fun setAnchorAndMargin(
    margin: Long,
    anchor: Double,
    offset: Double,
    pushOppositeAnchor: Boolean = false
  ) {
    val mb = getMethodBind("Control","set_anchor_and_margin")
    _icall_Unit_Long_Double_Double_Boolean( mb, this.ptr, margin, anchor, offset,
        pushOppositeAnchor)
  }

  open fun setAnchorsAndMarginsPreset(
    preset: Long,
    resizeMode: Long = 0,
    margin: Long = 0
  ) {
    val mb = getMethodBind("Control","set_anchors_and_margins_preset")
    _icall_Unit_Long_Long_Long( mb, this.ptr, preset, resizeMode, margin)
  }

  open fun setAnchorsPreset(preset: Long, keepMargins: Boolean = false) {
    val mb = getMethodBind("Control","set_anchors_preset")
    _icall_Unit_Long_Boolean( mb, this.ptr, preset, keepMargins)
  }

  open fun setBegin(position: Vector2) {
    val mb = getMethodBind("Control","set_begin")
    _icall_Unit_Vector2( mb, this.ptr, position)
  }

  open fun setClipContents(enable: Boolean) {
    val mb = getMethodBind("Control","set_clip_contents")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setCustomMinimumSize(size: Vector2) {
    val mb = getMethodBind("Control","set_custom_minimum_size")
    _icall_Unit_Vector2( mb, this.ptr, size)
  }

  open fun setDefaultCursorShape(shape: Long) {
    val mb = getMethodBind("Control","set_default_cursor_shape")
    _icall_Unit_Long( mb, this.ptr, shape)
  }

  open fun setDragForwarding(target: Control) {
    val mb = getMethodBind("Control","set_drag_forwarding")
    _icall_Unit_Object( mb, this.ptr, target)
  }

  open fun setDragPreview(control: Control) {
    val mb = getMethodBind("Control","set_drag_preview")
    _icall_Unit_Object( mb, this.ptr, control)
  }

  open fun setEnd(position: Vector2) {
    val mb = getMethodBind("Control","set_end")
    _icall_Unit_Vector2( mb, this.ptr, position)
  }

  open fun setFocusMode(mode: Long) {
    val mb = getMethodBind("Control","set_focus_mode")
    _icall_Unit_Long( mb, this.ptr, mode)
  }

  open fun setFocusNeighbour(margin: Long, neighbour: NodePath) {
    val mb = getMethodBind("Control","set_focus_neighbour")
    _icall_Unit_Long_NodePath( mb, this.ptr, margin, neighbour)
  }

  open fun setFocusNext(next: NodePath) {
    val mb = getMethodBind("Control","set_focus_next")
    _icall_Unit_NodePath( mb, this.ptr, next)
  }

  open fun setFocusPrevious(previous: NodePath) {
    val mb = getMethodBind("Control","set_focus_previous")
    _icall_Unit_NodePath( mb, this.ptr, previous)
  }

  open fun setGlobalPosition(position: Vector2, keepMargins: Boolean = false) {
    val mb = getMethodBind("Control","set_global_position")
    _icall_Unit_Vector2_Boolean( mb, this.ptr, position, keepMargins)
  }

  open fun setHGrowDirection(direction: Long) {
    val mb = getMethodBind("Control","set_h_grow_direction")
    _icall_Unit_Long( mb, this.ptr, direction)
  }

  open fun setHSizeFlags(flags: Long) {
    val mb = getMethodBind("Control","set_h_size_flags")
    _icall_Unit_Long( mb, this.ptr, flags)
  }

  open fun setMargin(margin: Long, offset: Double) {
    val mb = getMethodBind("Control","set_margin")
    _icall_Unit_Long_Double( mb, this.ptr, margin, offset)
  }

  open fun setMarginsPreset(
    preset: Long,
    resizeMode: Long = 0,
    margin: Long = 0
  ) {
    val mb = getMethodBind("Control","set_margins_preset")
    _icall_Unit_Long_Long_Long( mb, this.ptr, preset, resizeMode, margin)
  }

  open fun setMouseFilter(filter: Long) {
    val mb = getMethodBind("Control","set_mouse_filter")
    _icall_Unit_Long( mb, this.ptr, filter)
  }

  open fun setPivotOffset(pivotOffset: Vector2) {
    val mb = getMethodBind("Control","set_pivot_offset")
    _icall_Unit_Vector2( mb, this.ptr, pivotOffset)
  }

  open fun setPosition(position: Vector2, keepMargins: Boolean = false) {
    val mb = getMethodBind("Control","set_position")
    _icall_Unit_Vector2_Boolean( mb, this.ptr, position, keepMargins)
  }

  open fun setRotation(radians: Double) {
    val mb = getMethodBind("Control","set_rotation")
    _icall_Unit_Double( mb, this.ptr, radians)
  }

  open fun setRotationDegrees(degrees: Double) {
    val mb = getMethodBind("Control","set_rotation_degrees")
    _icall_Unit_Double( mb, this.ptr, degrees)
  }

  open fun setScale(scale: Vector2) {
    val mb = getMethodBind("Control","set_scale")
    _icall_Unit_Vector2( mb, this.ptr, scale)
  }

  open fun setSize(size: Vector2, keepMargins: Boolean = false) {
    val mb = getMethodBind("Control","set_size")
    _icall_Unit_Vector2_Boolean( mb, this.ptr, size, keepMargins)
  }

  open fun setStretchRatio(ratio: Double) {
    val mb = getMethodBind("Control","set_stretch_ratio")
    _icall_Unit_Double( mb, this.ptr, ratio)
  }

  open fun setTheme(theme: Theme) {
    val mb = getMethodBind("Control","set_theme")
    _icall_Unit_Object( mb, this.ptr, theme)
  }

  open fun setTooltip(tooltip: String) {
    val mb = getMethodBind("Control","set_tooltip")
    _icall_Unit_String( mb, this.ptr, tooltip)
  }

  open fun setVGrowDirection(direction: Long) {
    val mb = getMethodBind("Control","set_v_grow_direction")
    _icall_Unit_Long( mb, this.ptr, direction)
  }

  open fun setVSizeFlags(flags: Long) {
    val mb = getMethodBind("Control","set_v_size_flags")
    _icall_Unit_Long( mb, this.ptr, flags)
  }

  open fun showModal(exclusive: Boolean = false) {
    val mb = getMethodBind("Control","show_modal")
    _icall_Unit_Boolean( mb, this.ptr, exclusive)
  }

  open fun warpMouse(toPosition: Vector2) {
    val mb = getMethodBind("Control","warp_mouse")
    _icall_Unit_Vector2( mb, this.ptr, toPosition)
  }

  enum class Anchor(
    id: Long
  ) {
    ANCHOR_BEGIN(0),

    ANCHOR_END(1);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class FocusMode(
    id: Long
  ) {
    FOCUS_NONE(0),

    FOCUS_CLICK(1),

    FOCUS_ALL(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class LayoutPresetMode(
    id: Long
  ) {
    PRESET_MODE_MINSIZE(0),

    PRESET_MODE_KEEP_WIDTH(1),

    PRESET_MODE_KEEP_HEIGHT(2),

    PRESET_MODE_KEEP_SIZE(3);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class MouseFilter(
    id: Long
  ) {
    MOUSE_FILTER_STOP(0),

    MOUSE_FILTER_PASS(1),

    MOUSE_FILTER_IGNORE(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class CursorShape(
    id: Long
  ) {
    CURSOR_ARROW(0),

    CURSOR_IBEAM(1),

    CURSOR_POINTING_HAND(2),

    CURSOR_CROSS(3),

    CURSOR_WAIT(4),

    CURSOR_BUSY(5),

    CURSOR_DRAG(6),

    CURSOR_CAN_DROP(7),

    CURSOR_FORBIDDEN(8),

    CURSOR_VSIZE(9),

    CURSOR_HSIZE(10),

    CURSOR_BDIAGSIZE(11),

    CURSOR_FDIAGSIZE(12),

    CURSOR_MOVE(13),

    CURSOR_VSPLIT(14),

    CURSOR_HSPLIT(15),

    CURSOR_HELP(16);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class GrowDirection(
    id: Long
  ) {
    GROW_DIRECTION_BEGIN(0),

    GROW_DIRECTION_END(1),

    GROW_DIRECTION_BOTH(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class SizeFlags(
    id: Long
  ) {
    SIZE_FILL(1),

    SIZE_EXPAND(2),

    SIZE_EXPAND_FILL(3),

    SIZE_SHRINK_CENTER(4),

    SIZE_SHRINK_END(8);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class LayoutPreset(
    id: Long
  ) {
    PRESET_TOP_LEFT(0),

    PRESET_TOP_RIGHT(1),

    PRESET_BOTTOM_LEFT(2),

    PRESET_BOTTOM_RIGHT(3),

    PRESET_CENTER_LEFT(4),

    PRESET_CENTER_TOP(5),

    PRESET_CENTER_RIGHT(6),

    PRESET_CENTER_BOTTOM(7),

    PRESET_CENTER(8),

    PRESET_LEFT_WIDE(9),

    PRESET_TOP_WIDE(10),

    PRESET_RIGHT_WIDE(11),

    PRESET_BOTTOM_WIDE(12),

    PRESET_VCENTER_WIDE(13),

    PRESET_HCENTER_WIDE(14),

    PRESET_WIDE(15);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val NOTIFICATION_FOCUS_ENTER: Long = 43

    final const val NOTIFICATION_FOCUS_EXIT: Long = 44

    final const val NOTIFICATION_MODAL_CLOSE: Long = 46

    final const val NOTIFICATION_MOUSE_ENTER: Long = 41

    final const val NOTIFICATION_MOUSE_EXIT: Long = 42

    final const val NOTIFICATION_RESIZED: Long = 40

    final const val NOTIFICATION_SCROLL_BEGIN: Long = 47

    final const val NOTIFICATION_SCROLL_END: Long = 48

    final const val NOTIFICATION_THEME_CHANGED: Long = 45
  }
}
