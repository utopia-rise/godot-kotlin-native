package godot

import godot.core.Godot.shouldInitPtr
import godot.core.GodotError
import godot.core.Signal0
import godot.core.Signal1
import godot.core.Signal3
import godot.core.Signal4
import godot.core.VariantArray
import godot.core.Vector2
import godot.core.signal
import godot.icalls._icall_Boolean
import godot.icalls._icall_Boolean_Long_Long
import godot.icalls._icall_Boolean_String_Long_String_Long
import godot.icalls._icall_Double
import godot.icalls._icall_HBoxContainer
import godot.icalls._icall_Long
import godot.icalls._icall_Long_String_Long_String_Long
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Long_Long
import godot.icalls._icall_Unit_Object
import godot.icalls._icall_Unit_String_Long_String_Long
import godot.icalls._icall_Unit_String_Long_String_Long_Double
import godot.icalls._icall_Unit_Vector2
import godot.icalls._icall_VariantArray
import godot.icalls._icall_Vector2
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.String
import kotlin.Unit

open class GraphEdit internal constructor(
  _ignore: Any?
) : Control(_ignore) {
  val _beginNodeMove: Signal0 by signal()

  val _endNodeMove: Signal0 by signal()

  val connectionFromEmpty: Signal3<String, Long, Vector2> by signal("to", "to_slot",
      "release_position")

  val connectionRequest: Signal4<String, Long, String, Long> by signal("from", "from_slot", "to",
      "to_slot")

  val connectionToEmpty: Signal3<String, Long, Vector2> by signal("from", "from_slot",
      "release_position")

  val copyNodesRequest: Signal0 by signal()

  val deleteNodesRequest: Signal0 by signal()

  val disconnectionRequest: Signal4<String, Long, String, Long> by signal("from", "from_slot", "to",
      "to_slot")

  val duplicateNodesRequest: Signal0 by signal()

  val nodeSelected: Signal1<Node> by signal("node")

  val nodeUnselected: Signal1<Node> by signal("node")

  val pasteNodesRequest: Signal0 by signal()

  val popupRequest: Signal1<Vector2> by signal("position")

  val scrollOffsetChanged: Signal1<Vector2> by signal("ofs")

  open var rightDisconnects: Boolean
    get() {
      val mb = getMethodBind("GraphEdit","is_right_disconnects_enabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("GraphEdit","set_right_disconnects")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var scrollOffset: Vector2
    get() {
      val mb = getMethodBind("GraphEdit","get_scroll_ofs")
      return _icall_Vector2(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("GraphEdit","set_scroll_ofs")
      _icall_Unit_Vector2(mb, this.ptr, value)
    }

  open var snapDistance: Long
    get() {
      val mb = getMethodBind("GraphEdit","get_snap")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("GraphEdit","set_snap")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var useSnap: Boolean
    get() {
      val mb = getMethodBind("GraphEdit","is_using_snap")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("GraphEdit","set_use_snap")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var zoom: Double
    get() {
      val mb = getMethodBind("GraphEdit","get_zoom")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("GraphEdit","set_zoom")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("GraphEdit", "GraphEdit")
        }

  }

  open fun scrollOffset(schedule: Vector2.() -> Unit): Vector2 = scrollOffset.apply{
      schedule(this)
      scrollOffset = this
  }


  open fun _connections_layer_draw() {
  }

  open fun _graph_node_moved(arg0: Node) {
  }

  open fun _graph_node_raised(arg0: Node) {
  }

  override fun _gui_input(arg0: InputEvent) {
  }

  open fun _scroll_moved(arg0: Double) {
  }

  open fun _snap_toggled() {
  }

  open fun _snap_value_changed(arg0: Double) {
  }

  open fun _top_layer_draw() {
  }

  open fun _top_layer_input(arg0: InputEvent) {
  }

  open fun _update_scroll_offset() {
  }

  open fun _zoom_minus() {
  }

  open fun _zoom_plus() {
  }

  open fun _zoom_reset() {
  }

  open fun addValidConnectionType(fromType: Long, toType: Long) {
    val mb = getMethodBind("GraphEdit","add_valid_connection_type")
    _icall_Unit_Long_Long( mb, this.ptr, fromType, toType)
  }

  open fun addValidLeftDisconnectType(type: Long) {
    val mb = getMethodBind("GraphEdit","add_valid_left_disconnect_type")
    _icall_Unit_Long( mb, this.ptr, type)
  }

  open fun addValidRightDisconnectType(type: Long) {
    val mb = getMethodBind("GraphEdit","add_valid_right_disconnect_type")
    _icall_Unit_Long( mb, this.ptr, type)
  }

  open fun clearConnections() {
    val mb = getMethodBind("GraphEdit","clear_connections")
    _icall_Unit( mb, this.ptr)
  }

  open fun connectNode(
    from: String,
    fromPort: Long,
    to: String,
    toPort: Long
  ): GodotError {
    val mb = getMethodBind("GraphEdit","connect_node")
    return GodotError.byValue( _icall_Long_String_Long_String_Long( mb, this.ptr, from, fromPort,
        to, toPort).toUInt())
  }

  open fun disconnectNode(
    from: String,
    fromPort: Long,
    to: String,
    toPort: Long
  ) {
    val mb = getMethodBind("GraphEdit","disconnect_node")
    _icall_Unit_String_Long_String_Long( mb, this.ptr, from, fromPort, to, toPort)
  }

  open fun getConnectionList(): VariantArray {
    val mb = getMethodBind("GraphEdit","get_connection_list")
    return _icall_VariantArray( mb, this.ptr)
  }

  open fun getScrollOfs(): Vector2 {
    val mb = getMethodBind("GraphEdit","get_scroll_ofs")
    return _icall_Vector2( mb, this.ptr)
  }

  open fun getSnap(): Long {
    val mb = getMethodBind("GraphEdit","get_snap")
    return _icall_Long( mb, this.ptr)
  }

  open fun getZoom(): Double {
    val mb = getMethodBind("GraphEdit","get_zoom")
    return _icall_Double( mb, this.ptr)
  }

  open fun getZoomHbox(): HBoxContainer {
    val mb = getMethodBind("GraphEdit","get_zoom_hbox")
    return _icall_HBoxContainer( mb, this.ptr)
  }

  open fun isNodeConnected(
    from: String,
    fromPort: Long,
    to: String,
    toPort: Long
  ): Boolean {
    val mb = getMethodBind("GraphEdit","is_node_connected")
    return _icall_Boolean_String_Long_String_Long( mb, this.ptr, from, fromPort, to, toPort)
  }

  open fun isRightDisconnectsEnabled(): Boolean {
    val mb = getMethodBind("GraphEdit","is_right_disconnects_enabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isUsingSnap(): Boolean {
    val mb = getMethodBind("GraphEdit","is_using_snap")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isValidConnectionType(fromType: Long, toType: Long): Boolean {
    val mb = getMethodBind("GraphEdit","is_valid_connection_type")
    return _icall_Boolean_Long_Long( mb, this.ptr, fromType, toType)
  }

  open fun removeValidConnectionType(fromType: Long, toType: Long) {
    val mb = getMethodBind("GraphEdit","remove_valid_connection_type")
    _icall_Unit_Long_Long( mb, this.ptr, fromType, toType)
  }

  open fun removeValidLeftDisconnectType(type: Long) {
    val mb = getMethodBind("GraphEdit","remove_valid_left_disconnect_type")
    _icall_Unit_Long( mb, this.ptr, type)
  }

  open fun removeValidRightDisconnectType(type: Long) {
    val mb = getMethodBind("GraphEdit","remove_valid_right_disconnect_type")
    _icall_Unit_Long( mb, this.ptr, type)
  }

  open fun setConnectionActivity(
    from: String,
    fromPort: Long,
    to: String,
    toPort: Long,
    amount: Double
  ) {
    val mb = getMethodBind("GraphEdit","set_connection_activity")
    _icall_Unit_String_Long_String_Long_Double( mb, this.ptr, from, fromPort, to, toPort, amount)
  }

  open fun setRightDisconnects(enable: Boolean) {
    val mb = getMethodBind("GraphEdit","set_right_disconnects")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setScrollOfs(ofs: Vector2) {
    val mb = getMethodBind("GraphEdit","set_scroll_ofs")
    _icall_Unit_Vector2( mb, this.ptr, ofs)
  }

  open fun setSelected(node: Node) {
    val mb = getMethodBind("GraphEdit","set_selected")
    _icall_Unit_Object( mb, this.ptr, node)
  }

  open fun setSnap(pixels: Long) {
    val mb = getMethodBind("GraphEdit","set_snap")
    _icall_Unit_Long( mb, this.ptr, pixels)
  }

  open fun setUseSnap(enable: Boolean) {
    val mb = getMethodBind("GraphEdit","set_use_snap")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setZoom(pZoom: Double) {
    val mb = getMethodBind("GraphEdit","set_zoom")
    _icall_Unit_Double( mb, this.ptr, pZoom)
  }
}
