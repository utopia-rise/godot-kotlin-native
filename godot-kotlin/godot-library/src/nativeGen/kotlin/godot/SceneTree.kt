// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot.shouldInitPtr
import godot.core.GodotError
import godot.core.PoolIntArray
import godot.core.PoolStringArray
import godot.core.Signal0
import godot.core.Signal1
import godot.core.Signal2
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import godot.core.signal
import godot.icalls._icall_Boolean
import godot.icalls._icall_Boolean_String
import godot.icalls._icall_Long
import godot.icalls._icall_Long_Object
import godot.icalls._icall_Long_String
import godot.icalls._icall_MultiplayerAPI
import godot.icalls._icall_NetworkedMultiplayerPeer
import godot.icalls._icall_Node
import godot.icalls._icall_PoolIntArray
import godot.icalls._icall_SceneTreeTimer_Double_Boolean
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Long_Long_Vector2_Double
import godot.icalls._icall_Unit_Long_String_Long
import godot.icalls._icall_Unit_Long_String_String_Variant
import godot.icalls._icall_Unit_Object
import godot.icalls._icall_Unit_String_Long
import godot.icalls._icall_Unit_String_String_Variant
import godot.icalls._icall_VariantArray_String
import godot.icalls._icall_Viewport
import godot.icalls._icall_varargs
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.String
import kotlin.Unit

open class SceneTree internal constructor(
  _ignore: Any?
) : MainLoop(_ignore) {
  val connectedToServer: Signal0 by signal()

  val connectionFailed: Signal0 by signal()

  val filesDropped: Signal2<PoolStringArray, Long> by signal("files", "screen")

  val globalMenuAction: Signal2<Unit, Unit> by signal("id", "meta")

  val idleFrame: Signal0 by signal()

  val networkPeerConnected: Signal1<Long> by signal("id")

  val networkPeerDisconnected: Signal1<Long> by signal("id")

  val nodeAdded: Signal1<Node> by signal("node")

  val nodeConfigurationWarningChanged: Signal1<Node> by signal("node")

  val nodeRemoved: Signal1<Node> by signal("node")

  val nodeRenamed: Signal1<Node> by signal("node")

  val physicsFrame: Signal0 by signal()

  val screenResized: Signal0 by signal()

  val serverDisconnected: Signal0 by signal()

  val treeChanged: Signal0 by signal()

  open var currentScene: Node
    get() {
      val mb = getMethodBind("SceneTree","get_current_scene")
      return _icall_Node(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SceneTree","set_current_scene")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  open var debugCollisionsHint: Boolean
    get() {
      val mb = getMethodBind("SceneTree","is_debugging_collisions_hint")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SceneTree","set_debug_collisions_hint")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var debugNavigationHint: Boolean
    get() {
      val mb = getMethodBind("SceneTree","is_debugging_navigation_hint")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SceneTree","set_debug_navigation_hint")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var editedSceneRoot: Node
    get() {
      val mb = getMethodBind("SceneTree","get_edited_scene_root")
      return _icall_Node(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SceneTree","set_edited_scene_root")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  open var multiplayer: MultiplayerAPI
    get() {
      val mb = getMethodBind("SceneTree","get_multiplayer")
      return _icall_MultiplayerAPI(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SceneTree","set_multiplayer")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  open var multiplayerPoll: Boolean
    get() {
      val mb = getMethodBind("SceneTree","is_multiplayer_poll_enabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SceneTree","set_multiplayer_poll_enabled")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var networkPeer: NetworkedMultiplayerPeer
    get() {
      val mb = getMethodBind("SceneTree","get_network_peer")
      return _icall_NetworkedMultiplayerPeer(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SceneTree","set_network_peer")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  open var paused: Boolean
    get() {
      val mb = getMethodBind("SceneTree","is_paused")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SceneTree","set_pause")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var refuseNewNetworkConnections: Boolean
    get() {
      val mb = getMethodBind("SceneTree","is_refusing_new_network_connections")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SceneTree","set_refuse_new_network_connections")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open val root: Viewport
    get() {
      val mb = getMethodBind("SceneTree","get_root")
      return _icall_Viewport(mb, this.ptr)
    }

  open var useFontOversampling: Boolean
    get() {
      val mb = getMethodBind("SceneTree","is_using_font_oversampling")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SceneTree","set_use_font_oversampling")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("SceneTree", "SceneTree")
        }

  }

  open fun _changeScene(arg0: Node) {
  }

  open fun _connectedToServer() {
  }

  open fun _connectionFailed() {
  }

  open fun _networkPeerConnected(arg0: Long) {
  }

  open fun _networkPeerDisconnected(arg0: Long) {
  }

  open fun _serverDisconnected() {
  }

  open fun callGroup(
    group: String,
    method: String,
    vararg __var_args: Any?
  ): Variant {
    val mb = getMethodBind("SceneTree","call_group")
    return _icall_varargs( mb, this.ptr, arrayOf(group, method, *__var_args))
  }

  open fun callGroupFlags(
    flags: Long,
    group: String,
    method: String,
    vararg __var_args: Any?
  ): Variant {
    val mb = getMethodBind("SceneTree","call_group_flags")
    return _icall_varargs( mb, this.ptr, arrayOf(flags, group, method, *__var_args))
  }

  open fun changeScene(path: String): GodotError {
    val mb = getMethodBind("SceneTree","change_scene")
    return GodotError.byValue( _icall_Long_String( mb, this.ptr, path).toUInt())
  }

  open fun changeSceneTo(packedScene: PackedScene): GodotError {
    val mb = getMethodBind("SceneTree","change_scene_to")
    return GodotError.byValue( _icall_Long_Object( mb, this.ptr, packedScene).toUInt())
  }

  open fun createTimer(timeSec: Double, pauseModeProcess: Boolean = true): SceneTreeTimer {
    val mb = getMethodBind("SceneTree","create_timer")
    return _icall_SceneTreeTimer_Double_Boolean( mb, this.ptr, timeSec, pauseModeProcess)
  }

  open fun getCurrentScene(): Node {
    val mb = getMethodBind("SceneTree","get_current_scene")
    return _icall_Node( mb, this.ptr)
  }

  open fun getEditedSceneRoot(): Node {
    val mb = getMethodBind("SceneTree","get_edited_scene_root")
    return _icall_Node( mb, this.ptr)
  }

  open fun getFrame(): Long {
    val mb = getMethodBind("SceneTree","get_frame")
    return _icall_Long( mb, this.ptr)
  }

  open fun getMultiplayer(): MultiplayerAPI {
    val mb = getMethodBind("SceneTree","get_multiplayer")
    return _icall_MultiplayerAPI( mb, this.ptr)
  }

  open fun getNetworkConnectedPeers(): PoolIntArray {
    val mb = getMethodBind("SceneTree","get_network_connected_peers")
    return _icall_PoolIntArray( mb, this.ptr)
  }

  open fun getNetworkPeer(): NetworkedMultiplayerPeer {
    val mb = getMethodBind("SceneTree","get_network_peer")
    return _icall_NetworkedMultiplayerPeer( mb, this.ptr)
  }

  open fun getNetworkUniqueId(): Long {
    val mb = getMethodBind("SceneTree","get_network_unique_id")
    return _icall_Long( mb, this.ptr)
  }

  open fun getNodeCount(): Long {
    val mb = getMethodBind("SceneTree","get_node_count")
    return _icall_Long( mb, this.ptr)
  }

  open fun getNodesInGroup(group: String): VariantArray {
    val mb = getMethodBind("SceneTree","get_nodes_in_group")
    return _icall_VariantArray_String( mb, this.ptr, group)
  }

  open fun getRoot(): Viewport {
    val mb = getMethodBind("SceneTree","get_root")
    return _icall_Viewport( mb, this.ptr)
  }

  open fun getRpcSenderId(): Long {
    val mb = getMethodBind("SceneTree","get_rpc_sender_id")
    return _icall_Long( mb, this.ptr)
  }

  open fun hasGroup(name: String): Boolean {
    val mb = getMethodBind("SceneTree","has_group")
    return _icall_Boolean_String( mb, this.ptr, name)
  }

  open fun hasNetworkPeer(): Boolean {
    val mb = getMethodBind("SceneTree","has_network_peer")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isDebuggingCollisionsHint(): Boolean {
    val mb = getMethodBind("SceneTree","is_debugging_collisions_hint")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isDebuggingNavigationHint(): Boolean {
    val mb = getMethodBind("SceneTree","is_debugging_navigation_hint")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isInputHandled(): Boolean {
    val mb = getMethodBind("SceneTree","is_input_handled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isMultiplayerPollEnabled(): Boolean {
    val mb = getMethodBind("SceneTree","is_multiplayer_poll_enabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isNetworkServer(): Boolean {
    val mb = getMethodBind("SceneTree","is_network_server")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isPaused(): Boolean {
    val mb = getMethodBind("SceneTree","is_paused")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isRefusingNewNetworkConnections(): Boolean {
    val mb = getMethodBind("SceneTree","is_refusing_new_network_connections")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isUsingFontOversampling(): Boolean {
    val mb = getMethodBind("SceneTree","is_using_font_oversampling")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun notifyGroup(group: String, notification: Long) {
    val mb = getMethodBind("SceneTree","notify_group")
    _icall_Unit_String_Long( mb, this.ptr, group, notification)
  }

  open fun notifyGroupFlags(
    callFlags: Long,
    group: String,
    notification: Long
  ) {
    val mb = getMethodBind("SceneTree","notify_group_flags")
    _icall_Unit_Long_String_Long( mb, this.ptr, callFlags, group, notification)
  }

  open fun queueDelete(obj: Object) {
    val mb = getMethodBind("SceneTree","queue_delete")
    _icall_Unit_Object( mb, this.ptr, obj)
  }

  open fun quit(exitCode: Long = -1) {
    val mb = getMethodBind("SceneTree","quit")
    _icall_Unit_Long( mb, this.ptr, exitCode)
  }

  open fun reloadCurrentScene(): GodotError {
    val mb = getMethodBind("SceneTree","reload_current_scene")
    return GodotError.byValue( _icall_Long( mb, this.ptr).toUInt())
  }

  open fun setAutoAcceptQuit(enabled: Boolean) {
    val mb = getMethodBind("SceneTree","set_auto_accept_quit")
    _icall_Unit_Boolean( mb, this.ptr, enabled)
  }

  open fun setCurrentScene(childNode: Node) {
    val mb = getMethodBind("SceneTree","set_current_scene")
    _icall_Unit_Object( mb, this.ptr, childNode)
  }

  open fun setDebugCollisionsHint(enable: Boolean) {
    val mb = getMethodBind("SceneTree","set_debug_collisions_hint")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setDebugNavigationHint(enable: Boolean) {
    val mb = getMethodBind("SceneTree","set_debug_navigation_hint")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setEditedSceneRoot(scene: Node) {
    val mb = getMethodBind("SceneTree","set_edited_scene_root")
    _icall_Unit_Object( mb, this.ptr, scene)
  }

  open fun setGroup(
    group: String,
    property: String,
    value: Variant
  ) {
    val mb = getMethodBind("SceneTree","set_group")
    _icall_Unit_String_String_Variant( mb, this.ptr, group, property, value)
  }

  open fun setGroupFlags(
    callFlags: Long,
    group: String,
    property: String,
    value: Variant
  ) {
    val mb = getMethodBind("SceneTree","set_group_flags")
    _icall_Unit_Long_String_String_Variant( mb, this.ptr, callFlags, group, property, value)
  }

  open fun setInputAsHandled() {
    val mb = getMethodBind("SceneTree","set_input_as_handled")
    _icall_Unit( mb, this.ptr)
  }

  open fun setMultiplayer(multiplayer: MultiplayerAPI) {
    val mb = getMethodBind("SceneTree","set_multiplayer")
    _icall_Unit_Object( mb, this.ptr, multiplayer)
  }

  open fun setMultiplayerPollEnabled(enabled: Boolean) {
    val mb = getMethodBind("SceneTree","set_multiplayer_poll_enabled")
    _icall_Unit_Boolean( mb, this.ptr, enabled)
  }

  open fun setNetworkPeer(peer: NetworkedMultiplayerPeer) {
    val mb = getMethodBind("SceneTree","set_network_peer")
    _icall_Unit_Object( mb, this.ptr, peer)
  }

  open fun setPause(enable: Boolean) {
    val mb = getMethodBind("SceneTree","set_pause")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setQuitOnGoBack(enabled: Boolean) {
    val mb = getMethodBind("SceneTree","set_quit_on_go_back")
    _icall_Unit_Boolean( mb, this.ptr, enabled)
  }

  open fun setRefuseNewNetworkConnections(refuse: Boolean) {
    val mb = getMethodBind("SceneTree","set_refuse_new_network_connections")
    _icall_Unit_Boolean( mb, this.ptr, refuse)
  }

  open fun setScreenStretch(
    mode: Long,
    aspect: Long,
    minsize: Vector2,
    shrink: Double = 1.0
  ) {
    val mb = getMethodBind("SceneTree","set_screen_stretch")
    _icall_Unit_Long_Long_Vector2_Double( mb, this.ptr, mode, aspect, minsize, shrink)
  }

  open fun setUseFontOversampling(enable: Boolean) {
    val mb = getMethodBind("SceneTree","set_use_font_oversampling")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  enum class StretchAspect(
    id: Long
  ) {
    STRETCH_ASPECT_IGNORE(0),

    STRETCH_ASPECT_KEEP(1),

    STRETCH_ASPECT_KEEP_WIDTH(2),

    STRETCH_ASPECT_KEEP_HEIGHT(3),

    STRETCH_ASPECT_EXPAND(4);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class GroupCallFlags(
    id: Long
  ) {
    GROUP_CALL_DEFAULT(0),

    GROUP_CALL_REVERSE(1),

    GROUP_CALL_REALTIME(2),

    GROUP_CALL_UNIQUE(4);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class StretchMode(
    id: Long
  ) {
    STRETCH_MODE_DISABLED(0),

    STRETCH_MODE_2D(1),

    STRETCH_MODE_VIEWPORT(2);

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
