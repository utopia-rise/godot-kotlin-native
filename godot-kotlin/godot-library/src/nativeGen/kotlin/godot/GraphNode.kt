// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.GraphNode
import godot.core.Color
import godot.core.Godot.shouldInitPtr
import godot.core.Signal0
import godot.core.Signal1
import godot.core.Signal2
import godot.core.Vector2
import godot.core.signal
import godot.icalls._icall_Boolean
import godot.icalls._icall_Boolean_Long
import godot.icalls._icall_Color_Long
import godot.icalls._icall_Long
import godot.icalls._icall_Long_Long
import godot.icalls._icall_String
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Long_Boolean_Long_Color_Boolean_Long_Color_nObject_nObject
import godot.icalls._icall_Unit_String
import godot.icalls._icall_Unit_Vector2
import godot.icalls._icall_Vector2
import godot.icalls._icall_Vector2_Long
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlin.Unit

open class GraphNode internal constructor(
  _ignore: Any?
) : Container(_ignore) {
  val closeRequest: Signal0 by signal()

  val dragged: Signal2<Vector2, Vector2> by signal("from", "to")

  val offsetChanged: Signal0 by signal()

  val raiseRequest: Signal0 by signal()

  val resizeRequest: Signal1<Vector2> by signal("new_minsize")

  open var comment: Boolean
    get() {
      val mb = getMethodBind("GraphNode","is_comment")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("GraphNode","set_comment")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var offset: Vector2
    get() {
      val mb = getMethodBind("GraphNode","get_offset")
      return _icall_Vector2(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("GraphNode","set_offset")
      _icall_Unit_Vector2(mb, this.ptr, value)
    }

  open var overlay: Long
    get() {
      val mb = getMethodBind("GraphNode","get_overlay")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("GraphNode","set_overlay")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var resizable: Boolean
    get() {
      val mb = getMethodBind("GraphNode","is_resizable")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("GraphNode","set_resizable")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var selected: Boolean
    get() {
      val mb = getMethodBind("GraphNode","is_selected")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("GraphNode","set_selected")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var showClose: Boolean
    get() {
      val mb = getMethodBind("GraphNode","is_close_button_visible")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("GraphNode","set_show_close_button")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var title: String
    get() {
      val mb = getMethodBind("GraphNode","get_title")
      return _icall_String(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("GraphNode","set_title")
      _icall_Unit_String(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("GraphNode", "GraphNode")
        }

  }

  open fun offset(schedule: Vector2.() -> Unit): Vector2 = offset.apply{
      schedule(this)
      offset = this
  }


  override fun _guiInput(arg0: InputEvent) {
  }

  open fun clearAllSlots() {
    val mb = getMethodBind("GraphNode","clear_all_slots")
    _icall_Unit( mb, this.ptr)
  }

  open fun clearSlot(idx: Long) {
    val mb = getMethodBind("GraphNode","clear_slot")
    _icall_Unit_Long( mb, this.ptr, idx)
  }

  open fun getConnectionInputColor(idx: Long): Color {
    val mb = getMethodBind("GraphNode","get_connection_input_color")
    return _icall_Color_Long( mb, this.ptr, idx)
  }

  open fun getConnectionInputCount(): Long {
    val mb = getMethodBind("GraphNode","get_connection_input_count")
    return _icall_Long( mb, this.ptr)
  }

  open fun getConnectionInputPosition(idx: Long): Vector2 {
    val mb = getMethodBind("GraphNode","get_connection_input_position")
    return _icall_Vector2_Long( mb, this.ptr, idx)
  }

  open fun getConnectionInputType(idx: Long): Long {
    val mb = getMethodBind("GraphNode","get_connection_input_type")
    return _icall_Long_Long( mb, this.ptr, idx)
  }

  open fun getConnectionOutputColor(idx: Long): Color {
    val mb = getMethodBind("GraphNode","get_connection_output_color")
    return _icall_Color_Long( mb, this.ptr, idx)
  }

  open fun getConnectionOutputCount(): Long {
    val mb = getMethodBind("GraphNode","get_connection_output_count")
    return _icall_Long( mb, this.ptr)
  }

  open fun getConnectionOutputPosition(idx: Long): Vector2 {
    val mb = getMethodBind("GraphNode","get_connection_output_position")
    return _icall_Vector2_Long( mb, this.ptr, idx)
  }

  open fun getConnectionOutputType(idx: Long): Long {
    val mb = getMethodBind("GraphNode","get_connection_output_type")
    return _icall_Long_Long( mb, this.ptr, idx)
  }

  open fun getOffset(): Vector2 {
    val mb = getMethodBind("GraphNode","get_offset")
    return _icall_Vector2( mb, this.ptr)
  }

  open fun getOverlay(): GraphNode.Overlay {
    val mb = getMethodBind("GraphNode","get_overlay")
    return GraphNode.Overlay.from( _icall_Long( mb, this.ptr))
  }

  open fun getSlotColorLeft(idx: Long): Color {
    val mb = getMethodBind("GraphNode","get_slot_color_left")
    return _icall_Color_Long( mb, this.ptr, idx)
  }

  open fun getSlotColorRight(idx: Long): Color {
    val mb = getMethodBind("GraphNode","get_slot_color_right")
    return _icall_Color_Long( mb, this.ptr, idx)
  }

  open fun getSlotTypeLeft(idx: Long): Long {
    val mb = getMethodBind("GraphNode","get_slot_type_left")
    return _icall_Long_Long( mb, this.ptr, idx)
  }

  open fun getSlotTypeRight(idx: Long): Long {
    val mb = getMethodBind("GraphNode","get_slot_type_right")
    return _icall_Long_Long( mb, this.ptr, idx)
  }

  open fun getTitle(): String {
    val mb = getMethodBind("GraphNode","get_title")
    return _icall_String( mb, this.ptr)
  }

  open fun isCloseButtonVisible(): Boolean {
    val mb = getMethodBind("GraphNode","is_close_button_visible")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isComment(): Boolean {
    val mb = getMethodBind("GraphNode","is_comment")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isResizable(): Boolean {
    val mb = getMethodBind("GraphNode","is_resizable")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isSelected(): Boolean {
    val mb = getMethodBind("GraphNode","is_selected")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isSlotEnabledLeft(idx: Long): Boolean {
    val mb = getMethodBind("GraphNode","is_slot_enabled_left")
    return _icall_Boolean_Long( mb, this.ptr, idx)
  }

  open fun isSlotEnabledRight(idx: Long): Boolean {
    val mb = getMethodBind("GraphNode","is_slot_enabled_right")
    return _icall_Boolean_Long( mb, this.ptr, idx)
  }

  open fun setComment(comment: Boolean) {
    val mb = getMethodBind("GraphNode","set_comment")
    _icall_Unit_Boolean( mb, this.ptr, comment)
  }

  open fun setOffset(offset: Vector2) {
    val mb = getMethodBind("GraphNode","set_offset")
    _icall_Unit_Vector2( mb, this.ptr, offset)
  }

  open fun setOverlay(overlay: Long) {
    val mb = getMethodBind("GraphNode","set_overlay")
    _icall_Unit_Long( mb, this.ptr, overlay)
  }

  open fun setResizable(resizable: Boolean) {
    val mb = getMethodBind("GraphNode","set_resizable")
    _icall_Unit_Boolean( mb, this.ptr, resizable)
  }

  open fun setSelected(selected: Boolean) {
    val mb = getMethodBind("GraphNode","set_selected")
    _icall_Unit_Boolean( mb, this.ptr, selected)
  }

  open fun setShowCloseButton(show: Boolean) {
    val mb = getMethodBind("GraphNode","set_show_close_button")
    _icall_Unit_Boolean( mb, this.ptr, show)
  }

  open fun setSlot(
    idx: Long,
    enableLeft: Boolean,
    typeLeft: Long,
    colorLeft: Color,
    enableRight: Boolean,
    typeRight: Long,
    colorRight: Color,
    customLeft: Texture? = null,
    customRight: Texture? = null
  ) {
    val mb = getMethodBind("GraphNode","set_slot")
    _icall_Unit_Long_Boolean_Long_Color_Boolean_Long_Color_nObject_nObject( mb, this.ptr, idx,
        enableLeft, typeLeft, colorLeft, enableRight, typeRight, colorRight, customLeft,
        customRight)
  }

  open fun setTitle(title: String) {
    val mb = getMethodBind("GraphNode","set_title")
    _icall_Unit_String( mb, this.ptr, title)
  }

  enum class Overlay(
    id: Long
  ) {
    OVERLAY_DISABLED(0),

    OVERLAY_BREAKPOINT(1),

    OVERLAY_POSITION(2);

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
