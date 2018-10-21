@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class GraphEdit : Control {
    constructor() : super("GraphEdit")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 



    // Signals
    class Signal {
        companion object {
            const val DELETE_NODES_REQUEST: String = "delete_nodes_request"
            const val DUPLICATE_NODES_REQUEST: String = "duplicate_nodes_request"
            const val POPUP_REQUEST: String = "popup_request"
            const val SCROLL_OFFSET_CHANGED: String = "scroll_offset_changed"
            const val NODE_SELECTED: String = "node_selected"
            const val _BEGIN_NODE_MOVE: String = "_begin_node_move"
            const val CONNECTION_TO_EMPTY: String = "connection_to_empty"
            const val DISCONNECTION_REQUEST: String = "disconnection_request"
            const val CONNECTION_REQUEST: String = "connection_request"
            const val _END_NODE_MOVE: String = "_end_node_move"
        }
    }


    companion object {
        infix fun from(other: Control): GraphEdit = GraphEdit("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CanvasItem): GraphEdit = GraphEdit("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): GraphEdit = GraphEdit("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): GraphEdit = GraphEdit("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): GraphEdit = fromVariant(GraphEdit(""), other)


        // Constants


    }


    // Properties
    open var rightDisconnects: Boolean
        get() = _icall_Boolean(isRightDisconnectsEnabledMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setRightDisconnectsMethodBind, this.rawMemory, value)


    open var scrollOffset: Vector2
        get() = _icall_Vector2(getScrollOfsMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Vector2(setScrollOfsMethodBind, this.rawMemory, value)
    open fun scrollOffset(shedule: (Vector2) -> Unit): Vector2 = scrollOffset.apply {
        shedule(this)
        scrollOffset = this
    }


    open var snapDistance: Long
        get() = _icall_Long(getSnapMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setSnapMethodBind, this.rawMemory, value)


    open var useSnap: Boolean
        get() = _icall_Boolean(isUsingSnapMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setUseSnapMethodBind, this.rawMemory, value)


    open var zoom: Double
        get() = _icall_Double(getZoomMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setZoomMethodBind, this.rawMemory, value)




    // Methods
    private val connectNodeMethodBind: CPointer<godot_method_bind> by lazy { getMB("GraphEdit", "connect_node") }
    open fun connectNode(from: String, fromPort: Long, to: String, toPort: Long): GodotError {
        return GodotError.fromInt(_icall_Long_String_Long_String_Long(connectNodeMethodBind, this.rawMemory, from, fromPort, to, toPort))
    }


    private val isNodeConnectedMethodBind: CPointer<godot_method_bind> by lazy { getMB("GraphEdit", "is_node_connected") }
    open fun isNodeConnected(from: String, fromPort: Long, to: String, toPort: Long): Boolean {
        return _icall_Boolean_String_Long_String_Long(isNodeConnectedMethodBind, this.rawMemory, from, fromPort, to, toPort)
    }


    private val disconnectNodeMethodBind: CPointer<godot_method_bind> by lazy { getMB("GraphEdit", "disconnect_node") }
    open fun disconnectNode(from: String, fromPort: Long, to: String, toPort: Long) {
        _icall_Unit_String_Long_String_Long(disconnectNodeMethodBind, this.rawMemory, from, fromPort, to, toPort)
    }


    private val setConnectionActivityMethodBind: CPointer<godot_method_bind> by lazy { getMB("GraphEdit", "set_connection_activity") }
    open fun setConnectionActivity(from: String, fromPort: Long, to: String, toPort: Long, amount: Double) {
        _icall_Unit_String_Long_String_Long_Double(setConnectionActivityMethodBind, this.rawMemory, from, fromPort, to, toPort, amount)
    }


    private val getConnectionListMethodBind: CPointer<godot_method_bind> by lazy { getMB("GraphEdit", "get_connection_list") }
    open fun getConnectionList(): GDArray {
        return _icall_GDArray(getConnectionListMethodBind, this.rawMemory)
    }


    private val clearConnectionsMethodBind: CPointer<godot_method_bind> by lazy { getMB("GraphEdit", "clear_connections") }
    open fun clearConnections() {
        _icall_Unit(clearConnectionsMethodBind, this.rawMemory)
    }


    private val getScrollOfsMethodBind: CPointer<godot_method_bind> by lazy { getMB("GraphEdit", "get_scroll_ofs") }
    open fun getScrollOfs(): Vector2 {
        return _icall_Vector2(getScrollOfsMethodBind, this.rawMemory)
    }


    private val setScrollOfsMethodBind: CPointer<godot_method_bind> by lazy { getMB("GraphEdit", "set_scroll_ofs") }
    open fun setScrollOfs(ofs: Vector2) {
        _icall_Unit_Vector2(setScrollOfsMethodBind, this.rawMemory, ofs)
    }


    private val addValidRightDisconnectTypeMethodBind: CPointer<godot_method_bind> by lazy { getMB("GraphEdit", "add_valid_right_disconnect_type") }
    open fun addValidRightDisconnectType(type: Long) {
        _icall_Unit_Long(addValidRightDisconnectTypeMethodBind, this.rawMemory, type)
    }


    private val removeValidRightDisconnectTypeMethodBind: CPointer<godot_method_bind> by lazy { getMB("GraphEdit", "remove_valid_right_disconnect_type") }
    open fun removeValidRightDisconnectType(type: Long) {
        _icall_Unit_Long(removeValidRightDisconnectTypeMethodBind, this.rawMemory, type)
    }


    private val addValidLeftDisconnectTypeMethodBind: CPointer<godot_method_bind> by lazy { getMB("GraphEdit", "add_valid_left_disconnect_type") }
    open fun addValidLeftDisconnectType(type: Long) {
        _icall_Unit_Long(addValidLeftDisconnectTypeMethodBind, this.rawMemory, type)
    }


    private val removeValidLeftDisconnectTypeMethodBind: CPointer<godot_method_bind> by lazy { getMB("GraphEdit", "remove_valid_left_disconnect_type") }
    open fun removeValidLeftDisconnectType(type: Long) {
        _icall_Unit_Long(removeValidLeftDisconnectTypeMethodBind, this.rawMemory, type)
    }


    private val addValidConnectionTypeMethodBind: CPointer<godot_method_bind> by lazy { getMB("GraphEdit", "add_valid_connection_type") }
    open fun addValidConnectionType(fromType: Long, toType: Long) {
        _icall_Unit_Long_Long(addValidConnectionTypeMethodBind, this.rawMemory, fromType, toType)
    }


    private val removeValidConnectionTypeMethodBind: CPointer<godot_method_bind> by lazy { getMB("GraphEdit", "remove_valid_connection_type") }
    open fun removeValidConnectionType(fromType: Long, toType: Long) {
        _icall_Unit_Long_Long(removeValidConnectionTypeMethodBind, this.rawMemory, fromType, toType)
    }


    private val isValidConnectionTypeMethodBind: CPointer<godot_method_bind> by lazy { getMB("GraphEdit", "is_valid_connection_type") }
    open fun isValidConnectionType(fromType: Long, toType: Long): Boolean {
        return _icall_Boolean_Long_Long(isValidConnectionTypeMethodBind, this.rawMemory, fromType, toType)
    }


    private val setZoomMethodBind: CPointer<godot_method_bind> by lazy { getMB("GraphEdit", "set_zoom") }
    open fun setZoom(pZoom: Double) {
        _icall_Unit_Double(setZoomMethodBind, this.rawMemory, pZoom)
    }


    private val getZoomMethodBind: CPointer<godot_method_bind> by lazy { getMB("GraphEdit", "get_zoom") }
    open fun getZoom(): Double {
        return _icall_Double(getZoomMethodBind, this.rawMemory)
    }


    private val setSnapMethodBind: CPointer<godot_method_bind> by lazy { getMB("GraphEdit", "set_snap") }
    open fun setSnap(pixels: Long) {
        _icall_Unit_Long(setSnapMethodBind, this.rawMemory, pixels)
    }


    private val getSnapMethodBind: CPointer<godot_method_bind> by lazy { getMB("GraphEdit", "get_snap") }
    open fun getSnap(): Long {
        return _icall_Long(getSnapMethodBind, this.rawMemory)
    }


    private val setUseSnapMethodBind: CPointer<godot_method_bind> by lazy { getMB("GraphEdit", "set_use_snap") }
    open fun setUseSnap(enable: Boolean) {
        _icall_Unit_Boolean(setUseSnapMethodBind, this.rawMemory, enable)
    }


    private val isUsingSnapMethodBind: CPointer<godot_method_bind> by lazy { getMB("GraphEdit", "is_using_snap") }
    open fun isUsingSnap(): Boolean {
        return _icall_Boolean(isUsingSnapMethodBind, this.rawMemory)
    }


    private val setRightDisconnectsMethodBind: CPointer<godot_method_bind> by lazy { getMB("GraphEdit", "set_right_disconnects") }
    open fun setRightDisconnects(enable: Boolean) {
        _icall_Unit_Boolean(setRightDisconnectsMethodBind, this.rawMemory, enable)
    }


    private val isRightDisconnectsEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("GraphEdit", "is_right_disconnects_enabled") }
    open fun isRightDisconnectsEnabled(): Boolean {
        return _icall_Boolean(isRightDisconnectsEnabledMethodBind, this.rawMemory)
    }


    open fun _graph_node_moved(arg0: Object) {
    }


    open fun _graph_node_raised(arg0: Object) {
    }


    open fun _top_layer_input(arg0: InputEvent) {
    }


    open fun _top_layer_draw() {
    }


    open fun _scroll_moved(arg0: Double) {
    }


    open fun _zoom_minus() {
    }


    open fun _zoom_reset() {
    }


    open fun _zoom_plus() {
    }


    open fun _snap_toggled() {
    }


    open fun _snap_value_changed(arg0: Double) {
    }


    override fun _gui_input(arg0: InputEvent) {
    }


    open fun _update_scroll_offset() {
    }


    open fun _connections_layer_draw() {
    }


    private val getZoomHboxMethodBind: CPointer<godot_method_bind> by lazy { getMB("GraphEdit", "get_zoom_hbox") }
    open fun getZoomHbox(): HBoxContainer {
        return _icall_HBoxContainer(getZoomHboxMethodBind, this.rawMemory)
    }


    private val setSelectedMethodBind: CPointer<godot_method_bind> by lazy { getMB("GraphEdit", "set_selected") }
    open fun setSelected(node: Object) {
        _icall_Unit_Object(setSelectedMethodBind, this.rawMemory, node)
    }


}
