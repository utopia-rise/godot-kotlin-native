// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.Node
import godot.core.Godot.shouldInitPtr
import godot.core.NodePath
import godot.core.Signal0
import godot.core.Variant
import godot.core.VariantArray
import godot.core.signal
import godot.icalls._icall_Boolean
import godot.icalls._icall_Boolean_NodePath
import godot.icalls._icall_Boolean_Object
import godot.icalls._icall_Boolean_String
import godot.icalls._icall_Double
import godot.icalls._icall_Long
import godot.icalls._icall_MultiplayerAPI
import godot.icalls._icall_Node
import godot.icalls._icall_NodePath
import godot.icalls._icall_NodePath_Object
import godot.icalls._icall_Node_Long
import godot.icalls._icall_Node_NodePath
import godot.icalls._icall_Node_String
import godot.icalls._icall_Node_String_Boolean_Boolean
import godot.icalls._icall_SceneTree
import godot.icalls._icall_String
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Long_Boolean
import godot.icalls._icall_Unit_Long_String_Variant
import godot.icalls._icall_Unit_Object
import godot.icalls._icall_Unit_Object_Boolean
import godot.icalls._icall_Unit_Object_Long
import godot.icalls._icall_Unit_Object_Object_Boolean
import godot.icalls._icall_Unit_String
import godot.icalls._icall_Unit_String_Boolean
import godot.icalls._icall_Unit_String_Long
import godot.icalls._icall_Unit_String_Variant
import godot.icalls._icall_Unit_String_VariantArray_Boolean
import godot.icalls._icall_VariantArray
import godot.icalls._icall_VariantArray_NodePath
import godot.icalls._icall_Viewport
import godot.icalls._icall_varargs
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String

open class Node internal constructor(
  _ignore: Any?
) : Object(_ignore) {
  val ready: Signal0 by signal()

  val renamed: Signal0 by signal()

  val treeEntered: Signal0 by signal()

  val treeExited: Signal0 by signal()

  val treeExiting: Signal0 by signal()

  open var customMultiplayer: MultiplayerAPI
    get() {
      val mb = getMethodBind("Node","get_custom_multiplayer")
      return _icall_MultiplayerAPI(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Node","set_custom_multiplayer")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  open var filename: String
    get() {
      val mb = getMethodBind("Node","get_filename")
      return _icall_String(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Node","set_filename")
      _icall_Unit_String(mb, this.ptr, value)
    }

  open val multiplayer: MultiplayerAPI
    get() {
      val mb = getMethodBind("Node","get_multiplayer")
      return _icall_MultiplayerAPI(mb, this.ptr)
    }

  open var name: String
    get() {
      val mb = getMethodBind("Node","get_name")
      return _icall_String(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Node","set_name")
      _icall_Unit_String(mb, this.ptr, value)
    }

  open var owner: Node
    get() {
      val mb = getMethodBind("Node","get_owner")
      return _icall_Node(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Node","set_owner")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  open var pauseMode: Long
    get() {
      val mb = getMethodBind("Node","get_pause_mode")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Node","set_pause_mode")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var processPriority: Long
    get() {
      val mb = getMethodBind("Node","get_process_priority")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Node","set_process_priority")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = invokeConstructor("Node", "Node")
        }

  }

  open fun _enterTree() {
  }

  open fun _exitTree() {
  }

  open fun _getConfigurationWarning(): String {
    throw NotImplementedError("_get_configuration_warning is not implemented for Node")
  }

  open fun _getEditorDescription(): String {
    throw NotImplementedError("_get_editor_description is not implemented for Node")
  }

  open fun _getImportPath(): NodePath {
    throw NotImplementedError("_get_import_path is not implemented for Node")
  }

  open fun _input(event: InputEvent) {
  }

  open fun _physicsProcess(delta: Double) {
  }

  open fun _process(delta: Double) {
  }

  open fun _ready() {
  }

  open fun _setEditorDescription(editorDescription: String) {
  }

  open fun _setImportPath(importPath: NodePath) {
  }

  open fun _unhandledInput(event: InputEvent) {
  }

  open fun _unhandledKeyInput(event: InputEventKey) {
  }

  open fun addChild(node: Node, legibleUniqueName: Boolean = false) {
    val mb = getMethodBind("Node","add_child")
    _icall_Unit_Object_Boolean( mb, this.ptr, node, legibleUniqueName)
  }

  open fun addChildBelowNode(
    node: Node,
    childNode: Node,
    legibleUniqueName: Boolean = false
  ) {
    val mb = getMethodBind("Node","add_child_below_node")
    _icall_Unit_Object_Object_Boolean( mb, this.ptr, node, childNode, legibleUniqueName)
  }

  open fun addToGroup(group: String, persistent: Boolean = false) {
    val mb = getMethodBind("Node","add_to_group")
    _icall_Unit_String_Boolean( mb, this.ptr, group, persistent)
  }

  open fun canProcess(): Boolean {
    val mb = getMethodBind("Node","can_process")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun duplicate(flags: Long = 15): Node {
    val mb = getMethodBind("Node","duplicate")
    return _icall_Node_Long( mb, this.ptr, flags)
  }

  open fun findNode(
    mask: String,
    recursive: Boolean = true,
    owned: Boolean = true
  ): Node {
    val mb = getMethodBind("Node","find_node")
    return _icall_Node_String_Boolean_Boolean( mb, this.ptr, mask, recursive, owned)
  }

  open fun findParent(mask: String): Node {
    val mb = getMethodBind("Node","find_parent")
    return _icall_Node_String( mb, this.ptr, mask)
  }

  open fun getChild(idx: Long): Node {
    val mb = getMethodBind("Node","get_child")
    return _icall_Node_Long( mb, this.ptr, idx)
  }

  open fun getChildCount(): Long {
    val mb = getMethodBind("Node","get_child_count")
    return _icall_Long( mb, this.ptr)
  }

  open fun getChildren(): VariantArray {
    val mb = getMethodBind("Node","get_children")
    return _icall_VariantArray( mb, this.ptr)
  }

  open fun getCustomMultiplayer(): MultiplayerAPI {
    val mb = getMethodBind("Node","get_custom_multiplayer")
    return _icall_MultiplayerAPI( mb, this.ptr)
  }

  open fun getFilename(): String {
    val mb = getMethodBind("Node","get_filename")
    return _icall_String( mb, this.ptr)
  }

  open fun getGroups(): VariantArray {
    val mb = getMethodBind("Node","get_groups")
    return _icall_VariantArray( mb, this.ptr)
  }

  open fun getIndex(): Long {
    val mb = getMethodBind("Node","get_index")
    return _icall_Long( mb, this.ptr)
  }

  open fun getMultiplayer(): MultiplayerAPI {
    val mb = getMethodBind("Node","get_multiplayer")
    return _icall_MultiplayerAPI( mb, this.ptr)
  }

  open fun getName(): String {
    val mb = getMethodBind("Node","get_name")
    return _icall_String( mb, this.ptr)
  }

  open fun getNetworkMaster(): Long {
    val mb = getMethodBind("Node","get_network_master")
    return _icall_Long( mb, this.ptr)
  }

  open fun getNode(path: NodePath): Node {
    val mb = getMethodBind("Node","get_node")
    return _icall_Node_NodePath( mb, this.ptr, path)
  }

  open fun getNodeAndResource(path: NodePath): VariantArray {
    val mb = getMethodBind("Node","get_node_and_resource")
    return _icall_VariantArray_NodePath( mb, this.ptr, path)
  }

  open fun getNodeOrNull(path: NodePath): Node {
    val mb = getMethodBind("Node","get_node_or_null")
    return _icall_Node_NodePath( mb, this.ptr, path)
  }

  open fun getOwner(): Node {
    val mb = getMethodBind("Node","get_owner")
    return _icall_Node( mb, this.ptr)
  }

  open fun getParent(): Node {
    val mb = getMethodBind("Node","get_parent")
    return _icall_Node( mb, this.ptr)
  }

  open fun getPath(): NodePath {
    val mb = getMethodBind("Node","get_path")
    return _icall_NodePath( mb, this.ptr)
  }

  open fun getPathTo(node: Node): NodePath {
    val mb = getMethodBind("Node","get_path_to")
    return _icall_NodePath_Object( mb, this.ptr, node)
  }

  open fun getPauseMode(): Node.PauseMode {
    val mb = getMethodBind("Node","get_pause_mode")
    return Node.PauseMode.from( _icall_Long( mb, this.ptr))
  }

  open fun getPhysicsProcessDeltaTime(): Double {
    val mb = getMethodBind("Node","get_physics_process_delta_time")
    return _icall_Double( mb, this.ptr)
  }

  open fun getPositionInParent(): Long {
    val mb = getMethodBind("Node","get_position_in_parent")
    return _icall_Long( mb, this.ptr)
  }

  open fun getProcessDeltaTime(): Double {
    val mb = getMethodBind("Node","get_process_delta_time")
    return _icall_Double( mb, this.ptr)
  }

  open fun getProcessPriority(): Long {
    val mb = getMethodBind("Node","get_process_priority")
    return _icall_Long( mb, this.ptr)
  }

  open fun getSceneInstanceLoadPlaceholder(): Boolean {
    val mb = getMethodBind("Node","get_scene_instance_load_placeholder")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun getTree(): SceneTree {
    val mb = getMethodBind("Node","get_tree")
    return _icall_SceneTree( mb, this.ptr)
  }

  open fun getViewport(): Viewport {
    val mb = getMethodBind("Node","get_viewport")
    return _icall_Viewport( mb, this.ptr)
  }

  open fun hasNode(path: NodePath): Boolean {
    val mb = getMethodBind("Node","has_node")
    return _icall_Boolean_NodePath( mb, this.ptr, path)
  }

  open fun hasNodeAndResource(path: NodePath): Boolean {
    val mb = getMethodBind("Node","has_node_and_resource")
    return _icall_Boolean_NodePath( mb, this.ptr, path)
  }

  open fun isAParentOf(node: Node): Boolean {
    val mb = getMethodBind("Node","is_a_parent_of")
    return _icall_Boolean_Object( mb, this.ptr, node)
  }

  open fun isDisplayedFolded(): Boolean {
    val mb = getMethodBind("Node","is_displayed_folded")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isGreaterThan(node: Node): Boolean {
    val mb = getMethodBind("Node","is_greater_than")
    return _icall_Boolean_Object( mb, this.ptr, node)
  }

  open fun isInGroup(group: String): Boolean {
    val mb = getMethodBind("Node","is_in_group")
    return _icall_Boolean_String( mb, this.ptr, group)
  }

  open fun isInsideTree(): Boolean {
    val mb = getMethodBind("Node","is_inside_tree")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isNetworkMaster(): Boolean {
    val mb = getMethodBind("Node","is_network_master")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isPhysicsProcessing(): Boolean {
    val mb = getMethodBind("Node","is_physics_processing")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isPhysicsProcessingInternal(): Boolean {
    val mb = getMethodBind("Node","is_physics_processing_internal")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isProcessing(): Boolean {
    val mb = getMethodBind("Node","is_processing")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isProcessingInput(): Boolean {
    val mb = getMethodBind("Node","is_processing_input")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isProcessingInternal(): Boolean {
    val mb = getMethodBind("Node","is_processing_internal")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isProcessingUnhandledInput(): Boolean {
    val mb = getMethodBind("Node","is_processing_unhandled_input")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isProcessingUnhandledKeyInput(): Boolean {
    val mb = getMethodBind("Node","is_processing_unhandled_key_input")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun moveChild(childNode: Node, toPosition: Long) {
    val mb = getMethodBind("Node","move_child")
    _icall_Unit_Object_Long( mb, this.ptr, childNode, toPosition)
  }

  open fun printStrayNodes() {
    val mb = getMethodBind("Node","print_stray_nodes")
    _icall_Unit( mb, this.ptr)
  }

  open fun printTree() {
    val mb = getMethodBind("Node","print_tree")
    _icall_Unit( mb, this.ptr)
  }

  open fun printTreePretty() {
    val mb = getMethodBind("Node","print_tree_pretty")
    _icall_Unit( mb, this.ptr)
  }

  open fun propagateCall(
    method: String,
    args: VariantArray = VariantArray(),
    parentFirst: Boolean = false
  ) {
    val mb = getMethodBind("Node","propagate_call")
    _icall_Unit_String_VariantArray_Boolean( mb, this.ptr, method, args, parentFirst)
  }

  open fun propagateNotification(what: Long) {
    val mb = getMethodBind("Node","propagate_notification")
    _icall_Unit_Long( mb, this.ptr, what)
  }

  open fun queueFree() {
    val mb = getMethodBind("Node","queue_free")
    _icall_Unit( mb, this.ptr)
  }

  open fun raise() {
    val mb = getMethodBind("Node","raise")
    _icall_Unit( mb, this.ptr)
  }

  open fun removeAndSkip() {
    val mb = getMethodBind("Node","remove_and_skip")
    _icall_Unit( mb, this.ptr)
  }

  open fun removeChild(node: Node) {
    val mb = getMethodBind("Node","remove_child")
    _icall_Unit_Object( mb, this.ptr, node)
  }

  open fun removeFromGroup(group: String) {
    val mb = getMethodBind("Node","remove_from_group")
    _icall_Unit_String( mb, this.ptr, group)
  }

  open fun replaceBy(node: Node, keepData: Boolean = false) {
    val mb = getMethodBind("Node","replace_by")
    _icall_Unit_Object_Boolean( mb, this.ptr, node, keepData)
  }

  open fun requestReady() {
    val mb = getMethodBind("Node","request_ready")
    _icall_Unit( mb, this.ptr)
  }

  open fun rpc(method: String, vararg __var_args: Any?): Variant {
    val mb = getMethodBind("Node","rpc")
    return _icall_varargs( mb, this.ptr, arrayOf(method, *__var_args))
  }

  open fun rpcConfig(method: String, mode: Long) {
    val mb = getMethodBind("Node","rpc_config")
    _icall_Unit_String_Long( mb, this.ptr, method, mode)
  }

  open fun rpcId(
    peerId: Long,
    method: String,
    vararg __var_args: Any?
  ): Variant {
    val mb = getMethodBind("Node","rpc_id")
    return _icall_varargs( mb, this.ptr, arrayOf(peerId, method, *__var_args))
  }

  open fun rpcUnreliable(method: String, vararg __var_args: Any?): Variant {
    val mb = getMethodBind("Node","rpc_unreliable")
    return _icall_varargs( mb, this.ptr, arrayOf(method, *__var_args))
  }

  open fun rpcUnreliableId(
    peerId: Long,
    method: String,
    vararg __var_args: Any?
  ): Variant {
    val mb = getMethodBind("Node","rpc_unreliable_id")
    return _icall_varargs( mb, this.ptr, arrayOf(peerId, method, *__var_args))
  }

  open fun rset(property: String, value: Variant) {
    val mb = getMethodBind("Node","rset")
    _icall_Unit_String_Variant( mb, this.ptr, property, value)
  }

  open fun rsetConfig(property: String, mode: Long) {
    val mb = getMethodBind("Node","rset_config")
    _icall_Unit_String_Long( mb, this.ptr, property, mode)
  }

  open fun rsetId(
    peerId: Long,
    property: String,
    value: Variant
  ) {
    val mb = getMethodBind("Node","rset_id")
    _icall_Unit_Long_String_Variant( mb, this.ptr, peerId, property, value)
  }

  open fun rsetUnreliable(property: String, value: Variant) {
    val mb = getMethodBind("Node","rset_unreliable")
    _icall_Unit_String_Variant( mb, this.ptr, property, value)
  }

  open fun rsetUnreliableId(
    peerId: Long,
    property: String,
    value: Variant
  ) {
    val mb = getMethodBind("Node","rset_unreliable_id")
    _icall_Unit_Long_String_Variant( mb, this.ptr, peerId, property, value)
  }

  open fun setCustomMultiplayer(api: MultiplayerAPI) {
    val mb = getMethodBind("Node","set_custom_multiplayer")
    _icall_Unit_Object( mb, this.ptr, api)
  }

  open fun setDisplayFolded(fold: Boolean) {
    val mb = getMethodBind("Node","set_display_folded")
    _icall_Unit_Boolean( mb, this.ptr, fold)
  }

  open fun setFilename(filename: String) {
    val mb = getMethodBind("Node","set_filename")
    _icall_Unit_String( mb, this.ptr, filename)
  }

  open fun setName(name: String) {
    val mb = getMethodBind("Node","set_name")
    _icall_Unit_String( mb, this.ptr, name)
  }

  open fun setNetworkMaster(id: Long, recursive: Boolean = true) {
    val mb = getMethodBind("Node","set_network_master")
    _icall_Unit_Long_Boolean( mb, this.ptr, id, recursive)
  }

  open fun setOwner(owner: Node) {
    val mb = getMethodBind("Node","set_owner")
    _icall_Unit_Object( mb, this.ptr, owner)
  }

  open fun setPauseMode(mode: Long) {
    val mb = getMethodBind("Node","set_pause_mode")
    _icall_Unit_Long( mb, this.ptr, mode)
  }

  open fun setPhysicsProcess(enable: Boolean) {
    val mb = getMethodBind("Node","set_physics_process")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setPhysicsProcessInternal(enable: Boolean) {
    val mb = getMethodBind("Node","set_physics_process_internal")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setProcess(enable: Boolean) {
    val mb = getMethodBind("Node","set_process")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setProcessInput(enable: Boolean) {
    val mb = getMethodBind("Node","set_process_input")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setProcessInternal(enable: Boolean) {
    val mb = getMethodBind("Node","set_process_internal")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setProcessPriority(priority: Long) {
    val mb = getMethodBind("Node","set_process_priority")
    _icall_Unit_Long( mb, this.ptr, priority)
  }

  open fun setProcessUnhandledInput(enable: Boolean) {
    val mb = getMethodBind("Node","set_process_unhandled_input")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setProcessUnhandledKeyInput(enable: Boolean) {
    val mb = getMethodBind("Node","set_process_unhandled_key_input")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setSceneInstanceLoadPlaceholder(loadPlaceholder: Boolean) {
    val mb = getMethodBind("Node","set_scene_instance_load_placeholder")
    _icall_Unit_Boolean( mb, this.ptr, loadPlaceholder)
  }

  open fun updateConfigurationWarning() {
    val mb = getMethodBind("Node","update_configuration_warning")
    _icall_Unit( mb, this.ptr)
  }

  enum class PauseMode(
    id: Long
  ) {
    PAUSE_MODE_INHERIT(0),

    PAUSE_MODE_STOP(1),

    PAUSE_MODE_PROCESS(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class DuplicateFlags(
    id: Long
  ) {
    DUPLICATE_SIGNALS(1),

    DUPLICATE_GROUPS(2),

    DUPLICATE_SCRIPTS(4),

    DUPLICATE_USE_INSTANCING(8);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val NOTIFICATION_APP_PAUSED: Long = 1015

    final const val NOTIFICATION_APP_RESUMED: Long = 1014

    final const val NOTIFICATION_CRASH: Long = 1012

    final const val NOTIFICATION_DRAG_BEGIN: Long = 21

    final const val NOTIFICATION_DRAG_END: Long = 22

    final const val NOTIFICATION_ENTER_TREE: Long = 10

    final const val NOTIFICATION_EXIT_TREE: Long = 11

    final const val NOTIFICATION_INSTANCED: Long = 20

    final const val NOTIFICATION_INTERNAL_PHYSICS_PROCESS: Long = 26

    final const val NOTIFICATION_INTERNAL_PROCESS: Long = 25

    final const val NOTIFICATION_MOVED_IN_PARENT: Long = 12

    final const val NOTIFICATION_OS_IME_UPDATE: Long = 1013

    final const val NOTIFICATION_OS_MEMORY_WARNING: Long = 1009

    final const val NOTIFICATION_PARENTED: Long = 18

    final const val NOTIFICATION_PATH_CHANGED: Long = 23

    final const val NOTIFICATION_PAUSED: Long = 14

    final const val NOTIFICATION_PHYSICS_PROCESS: Long = 16

    final const val NOTIFICATION_PROCESS: Long = 17

    final const val NOTIFICATION_READY: Long = 13

    final const val NOTIFICATION_TRANSLATION_CHANGED: Long = 1010

    final const val NOTIFICATION_UNPARENTED: Long = 19

    final const val NOTIFICATION_UNPAUSED: Long = 15

    final const val NOTIFICATION_WM_ABOUT: Long = 1011

    final const val NOTIFICATION_WM_FOCUS_IN: Long = 1004

    final const val NOTIFICATION_WM_FOCUS_OUT: Long = 1005

    final const val NOTIFICATION_WM_GO_BACK_REQUEST: Long = 1007

    final const val NOTIFICATION_WM_MOUSE_ENTER: Long = 1002

    final const val NOTIFICATION_WM_MOUSE_EXIT: Long = 1003

    final const val NOTIFICATION_WM_QUIT_REQUEST: Long = 1006

    final const val NOTIFICATION_WM_UNFOCUS_REQUEST: Long = 1008
  }
}
