@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class SceneTree : MainLoop {
    constructor() : super("SceneTree")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class StretchAspect(val id: Long) {
        STRETCH_ASPECT_IGNORE(0),
        STRETCH_ASPECT_KEEP(1),
        STRETCH_ASPECT_KEEP_WIDTH(2),
        STRETCH_ASPECT_KEEP_HEIGHT(3),
        STRETCH_ASPECT_EXPAND(4),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class GroupCallFlags(val id: Long) {
        GROUP_CALL_DEFAULT(0),
        GROUP_CALL_REVERSE(1),
        GROUP_CALL_REALTIME(2),
        GROUP_CALL_UNIQUE(4),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class StretchMode(val id: Long) {
        STRETCH_MODE_DISABLED(0),
        STRETCH_MODE_2D(1),
        STRETCH_MODE_VIEWPORT(2),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }


    // Signals
    class Signal {
        companion object {
            const val CONNECTED_TO_SERVER: String = "connected_to_server"
            const val NODE_CONFIGURATION_WARNING_CHANGED: String = "node_configuration_warning_changed"
            const val CONNECTION_FAILED: String = "connection_failed"
            const val PHYSICS_FRAME: String = "physics_frame"
            const val SCREEN_RESIZED: String = "screen_resized"
            const val NETWORK_PEER_DISCONNECTED: String = "network_peer_disconnected"
            const val NETWORK_PEER_CONNECTED: String = "network_peer_connected"
            const val NODE_REMOVED: String = "node_removed"
            const val NODE_ADDED: String = "node_added"
            const val FILES_DROPPED: String = "files_dropped"
            const val IDLE_FRAME: String = "idle_frame"
            const val SERVER_DISCONNECTED: String = "server_disconnected"
            const val TREE_CHANGED: String = "tree_changed"
        }
    }


    companion object {
        infix fun from(other: MainLoop): SceneTree = SceneTree("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): SceneTree = SceneTree("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): SceneTree = fromVariant(SceneTree(""), other)


        // Constants
        const val GROUP_CALL_DEFAULT: Long = 0
        const val GROUP_CALL_REVERSE: Long = 1
        const val GROUP_CALL_REALTIME: Long = 2
        const val GROUP_CALL_UNIQUE: Long = 4
        const val STRETCH_MODE_DISABLED: Long = 0
        const val STRETCH_MODE_2D: Long = 1
        const val STRETCH_MODE_VIEWPORT: Long = 2
        const val STRETCH_ASPECT_IGNORE: Long = 0
        const val STRETCH_ASPECT_KEEP: Long = 1
        const val STRETCH_ASPECT_KEEP_WIDTH: Long = 2
        const val STRETCH_ASPECT_KEEP_HEIGHT: Long = 3
        const val STRETCH_ASPECT_EXPAND: Long = 4


    }


    // Properties
    open var debugCollisionsHint: Boolean
        get() = _icall_Boolean(isDebuggingCollisionsHintMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setDebugCollisionsHintMethodBind, this.rawMemory, value)


    open var debugNavigationHint: Boolean
        get() = _icall_Boolean(isDebuggingNavigationHintMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setDebugNavigationHintMethodBind, this.rawMemory, value)


    open var paused: Boolean
        get() = _icall_Boolean(isPausedMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setPauseMethodBind, this.rawMemory, value)


    open var refuseNewNetworkConnections: Boolean
        get() = _icall_Boolean(isRefusingNewNetworkConnectionsMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setRefuseNewNetworkConnectionsMethodBind, this.rawMemory, value)


    open var useFontOversampling: Boolean
        get() = _icall_Boolean(isUsingFontOversamplingMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setUseFontOversamplingMethodBind, this.rawMemory, value)


    open var editedSceneRoot: Node
        get() = _icall_Node(getEditedSceneRootMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setEditedSceneRootMethodBind, this.rawMemory, value)


    open var currentScene: Node
        get() = _icall_Node(getCurrentSceneMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setCurrentSceneMethodBind, this.rawMemory, value)


    open var networkPeer: NetworkedMultiplayerPeer
        get() = _icall_NetworkedMultiplayerPeer(getNetworkPeerMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setNetworkPeerMethodBind, this.rawMemory, value)


    open val root: Node
        get() = _icall_Node(getRootMethodBind, this.rawMemory)


    open var multiplayer: MultiplayerAPI
        get() = _icall_MultiplayerAPI(getMultiplayerMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setMultiplayerMethodBind, this.rawMemory, value)


    open var multiplayerPoll: Boolean
        get() = _icall_Boolean(isMultiplayerPollEnabledMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setMultiplayerPollEnabledMethodBind, this.rawMemory, value)




    // Methods
    private val getRootMethodBind: CPointer<godot_method_bind> by lazy { getMB("SceneTree", "get_root") }
    open fun getRoot(): Viewport {
        return _icall_Viewport(getRootMethodBind, this.rawMemory)
    }


    private val hasGroupMethodBind: CPointer<godot_method_bind> by lazy { getMB("SceneTree", "has_group") }
    open fun hasGroup(name: String): Boolean {
        return _icall_Boolean_String(hasGroupMethodBind, this.rawMemory, name)
    }


    private val setAutoAcceptQuitMethodBind: CPointer<godot_method_bind> by lazy { getMB("SceneTree", "set_auto_accept_quit") }
    open fun setAutoAcceptQuit(enabled: Boolean) {
        _icall_Unit_Boolean(setAutoAcceptQuitMethodBind, this.rawMemory, enabled)
    }


    private val setQuitOnGoBackMethodBind: CPointer<godot_method_bind> by lazy { getMB("SceneTree", "set_quit_on_go_back") }
    open fun setQuitOnGoBack(enabled: Boolean) {
        _icall_Unit_Boolean(setQuitOnGoBackMethodBind, this.rawMemory, enabled)
    }


    private val setDebugCollisionsHintMethodBind: CPointer<godot_method_bind> by lazy { getMB("SceneTree", "set_debug_collisions_hint") }
    open fun setDebugCollisionsHint(enable: Boolean) {
        _icall_Unit_Boolean(setDebugCollisionsHintMethodBind, this.rawMemory, enable)
    }


    private val isDebuggingCollisionsHintMethodBind: CPointer<godot_method_bind> by lazy { getMB("SceneTree", "is_debugging_collisions_hint") }
    open fun isDebuggingCollisionsHint(): Boolean {
        return _icall_Boolean(isDebuggingCollisionsHintMethodBind, this.rawMemory)
    }


    private val setDebugNavigationHintMethodBind: CPointer<godot_method_bind> by lazy { getMB("SceneTree", "set_debug_navigation_hint") }
    open fun setDebugNavigationHint(enable: Boolean) {
        _icall_Unit_Boolean(setDebugNavigationHintMethodBind, this.rawMemory, enable)
    }


    private val isDebuggingNavigationHintMethodBind: CPointer<godot_method_bind> by lazy { getMB("SceneTree", "is_debugging_navigation_hint") }
    open fun isDebuggingNavigationHint(): Boolean {
        return _icall_Boolean(isDebuggingNavigationHintMethodBind, this.rawMemory)
    }


    private val setEditedSceneRootMethodBind: CPointer<godot_method_bind> by lazy { getMB("SceneTree", "set_edited_scene_root") }
    open fun setEditedSceneRoot(scene: Object) {
        _icall_Unit_Object(setEditedSceneRootMethodBind, this.rawMemory, scene)
    }


    private val getEditedSceneRootMethodBind: CPointer<godot_method_bind> by lazy { getMB("SceneTree", "get_edited_scene_root") }
    open fun getEditedSceneRoot(): Node {
        return _icall_Node(getEditedSceneRootMethodBind, this.rawMemory)
    }


    private val setPauseMethodBind: CPointer<godot_method_bind> by lazy { getMB("SceneTree", "set_pause") }
    open fun setPause(enable: Boolean) {
        _icall_Unit_Boolean(setPauseMethodBind, this.rawMemory, enable)
    }


    private val isPausedMethodBind: CPointer<godot_method_bind> by lazy { getMB("SceneTree", "is_paused") }
    open fun isPaused(): Boolean {
        return _icall_Boolean(isPausedMethodBind, this.rawMemory)
    }


    private val setInputAsHandledMethodBind: CPointer<godot_method_bind> by lazy { getMB("SceneTree", "set_input_as_handled") }
    open fun setInputAsHandled() {
        _icall_Unit(setInputAsHandledMethodBind, this.rawMemory)
    }


    private val isInputHandledMethodBind: CPointer<godot_method_bind> by lazy { getMB("SceneTree", "is_input_handled") }
    open fun isInputHandled(): Boolean {
        return _icall_Boolean(isInputHandledMethodBind, this.rawMemory)
    }


    private val createTimerMethodBind: CPointer<godot_method_bind> by lazy { getMB("SceneTree", "create_timer") }
    open fun createTimer(timeSec: Double, pauseModeProcess: Boolean = true): SceneTreeTimer {
        return _icall_SceneTreeTimer_Double_Boolean(createTimerMethodBind, this.rawMemory, timeSec, pauseModeProcess)
    }


    private val getNodeCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("SceneTree", "get_node_count") }
    open fun getNodeCount(): Long {
        return _icall_Long(getNodeCountMethodBind, this.rawMemory)
    }


    private val getFrameMethodBind: CPointer<godot_method_bind> by lazy { getMB("SceneTree", "get_frame") }
    open fun getFrame(): Long {
        return _icall_Long(getFrameMethodBind, this.rawMemory)
    }


    private val quitMethodBind: CPointer<godot_method_bind> by lazy { getMB("SceneTree", "quit") }
    open fun quit() {
        _icall_Unit(quitMethodBind, this.rawMemory)
    }


    private val setScreenStretchMethodBind: CPointer<godot_method_bind> by lazy { getMB("SceneTree", "set_screen_stretch") }
    open fun setScreenStretch(mode: Long, aspect: Long, minsize: Vector2, shrink: Double = 1.0) {
        _icall_Unit_Long_Long_Vector2_Double(setScreenStretchMethodBind, this.rawMemory, mode, aspect, minsize, shrink)
    }


    private val queueDeleteMethodBind: CPointer<godot_method_bind> by lazy { getMB("SceneTree", "queue_delete") }
    open fun queueDelete(obj: Object) {
        _icall_Unit_Object(queueDeleteMethodBind, this.rawMemory, obj)
    }


    private val callGroupFlagsMethodBind: CPointer<godot_method_bind> by lazy { getMB("SceneTree", "call_group_flags") }
    open fun callGroupFlags(flags: Long, group: String, method: String, vararg __var_args: Any?): Variant {
        return _icall_varargs(callGroupFlagsMethodBind, this.rawMemory, arrayOf(flags, group, method, *__var_args))
    }


    private val notifyGroupFlagsMethodBind: CPointer<godot_method_bind> by lazy { getMB("SceneTree", "notify_group_flags") }
    open fun notifyGroupFlags(callFlags: Long, group: String, notification: Long) {
        _icall_Unit_Long_String_Long(notifyGroupFlagsMethodBind, this.rawMemory, callFlags, group, notification)
    }


    private val setGroupFlagsMethodBind: CPointer<godot_method_bind> by lazy { getMB("SceneTree", "set_group_flags") }
    open fun setGroupFlags(callFlags: Long, group: String, property: String, value: Variant) {
        _icall_Unit_Long_String_String_Variant(setGroupFlagsMethodBind, this.rawMemory, callFlags, group, property, value)
    }


    private val callGroupMethodBind: CPointer<godot_method_bind> by lazy { getMB("SceneTree", "call_group") }
    open fun callGroup(group: String, method: String, vararg __var_args: Any?): Variant {
        return _icall_varargs(callGroupMethodBind, this.rawMemory, arrayOf(group, method, *__var_args))
    }


    private val notifyGroupMethodBind: CPointer<godot_method_bind> by lazy { getMB("SceneTree", "notify_group") }
    open fun notifyGroup(group: String, notification: Long) {
        _icall_Unit_String_Long(notifyGroupMethodBind, this.rawMemory, group, notification)
    }


    private val setGroupMethodBind: CPointer<godot_method_bind> by lazy { getMB("SceneTree", "set_group") }
    open fun setGroup(group: String, property: String, value: Variant) {
        _icall_Unit_String_String_Variant(setGroupMethodBind, this.rawMemory, group, property, value)
    }


    private val getNodesInGroupMethodBind: CPointer<godot_method_bind> by lazy { getMB("SceneTree", "get_nodes_in_group") }
    open fun getNodesInGroup(group: String): GDArray {
        return _icall_GDArray_String(getNodesInGroupMethodBind, this.rawMemory, group)
    }


    private val setCurrentSceneMethodBind: CPointer<godot_method_bind> by lazy { getMB("SceneTree", "set_current_scene") }
    open fun setCurrentScene(childNode: Object) {
        _icall_Unit_Object(setCurrentSceneMethodBind, this.rawMemory, childNode)
    }


    private val getCurrentSceneMethodBind: CPointer<godot_method_bind> by lazy { getMB("SceneTree", "get_current_scene") }
    open fun getCurrentScene(): Node {
        return _icall_Node(getCurrentSceneMethodBind, this.rawMemory)
    }


    private val changeSceneMethodBind: CPointer<godot_method_bind> by lazy { getMB("SceneTree", "change_scene") }
    open fun changeScene(path: String): GodotError {
        return GodotError.fromInt(_icall_Long_String(changeSceneMethodBind, this.rawMemory, path))
    }


    private val changeSceneToMethodBind: CPointer<godot_method_bind> by lazy { getMB("SceneTree", "change_scene_to") }
    open fun changeSceneTo(packedScene: PackedScene): GodotError {
        return GodotError.fromInt(_icall_Long_Object(changeSceneToMethodBind, this.rawMemory, packedScene))
    }


    private val reloadCurrentSceneMethodBind: CPointer<godot_method_bind> by lazy { getMB("SceneTree", "reload_current_scene") }
    open fun reloadCurrentScene(): GodotError {
        return GodotError.fromInt(_icall_Long(reloadCurrentSceneMethodBind, this.rawMemory))
    }


    open fun _change_scene(arg0: Object) {
    }


    private val setMultiplayerMethodBind: CPointer<godot_method_bind> by lazy { getMB("SceneTree", "set_multiplayer") }
    open fun setMultiplayer(multiplayer: MultiplayerAPI) {
        _icall_Unit_Object(setMultiplayerMethodBind, this.rawMemory, multiplayer)
    }


    private val getMultiplayerMethodBind: CPointer<godot_method_bind> by lazy { getMB("SceneTree", "get_multiplayer") }
    open fun getMultiplayer(): MultiplayerAPI {
        return _icall_MultiplayerAPI(getMultiplayerMethodBind, this.rawMemory)
    }


    private val setMultiplayerPollEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("SceneTree", "set_multiplayer_poll_enabled") }
    open fun setMultiplayerPollEnabled(enabled: Boolean) {
        _icall_Unit_Boolean(setMultiplayerPollEnabledMethodBind, this.rawMemory, enabled)
    }


    private val isMultiplayerPollEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("SceneTree", "is_multiplayer_poll_enabled") }
    open fun isMultiplayerPollEnabled(): Boolean {
        return _icall_Boolean(isMultiplayerPollEnabledMethodBind, this.rawMemory)
    }


    private val setNetworkPeerMethodBind: CPointer<godot_method_bind> by lazy { getMB("SceneTree", "set_network_peer") }
    open fun setNetworkPeer(peer: NetworkedMultiplayerPeer) {
        _icall_Unit_Object(setNetworkPeerMethodBind, this.rawMemory, peer)
    }


    private val getNetworkPeerMethodBind: CPointer<godot_method_bind> by lazy { getMB("SceneTree", "get_network_peer") }
    open fun getNetworkPeer(): NetworkedMultiplayerPeer {
        return _icall_NetworkedMultiplayerPeer(getNetworkPeerMethodBind, this.rawMemory)
    }


    private val isNetworkServerMethodBind: CPointer<godot_method_bind> by lazy { getMB("SceneTree", "is_network_server") }
    open fun isNetworkServer(): Boolean {
        return _icall_Boolean(isNetworkServerMethodBind, this.rawMemory)
    }


    private val hasNetworkPeerMethodBind: CPointer<godot_method_bind> by lazy { getMB("SceneTree", "has_network_peer") }
    open fun hasNetworkPeer(): Boolean {
        return _icall_Boolean(hasNetworkPeerMethodBind, this.rawMemory)
    }


    private val getNetworkConnectedPeersMethodBind: CPointer<godot_method_bind> by lazy { getMB("SceneTree", "get_network_connected_peers") }
    open fun getNetworkConnectedPeers(): PoolIntArray {
        return _icall_PoolIntArray(getNetworkConnectedPeersMethodBind, this.rawMemory)
    }


    private val getNetworkUniqueIdMethodBind: CPointer<godot_method_bind> by lazy { getMB("SceneTree", "get_network_unique_id") }
    open fun getNetworkUniqueId(): Long {
        return _icall_Long(getNetworkUniqueIdMethodBind, this.rawMemory)
    }


    private val getRpcSenderIdMethodBind: CPointer<godot_method_bind> by lazy { getMB("SceneTree", "get_rpc_sender_id") }
    open fun getRpcSenderId(): Long {
        return _icall_Long(getRpcSenderIdMethodBind, this.rawMemory)
    }


    private val setRefuseNewNetworkConnectionsMethodBind: CPointer<godot_method_bind> by lazy { getMB("SceneTree", "set_refuse_new_network_connections") }
    open fun setRefuseNewNetworkConnections(refuse: Boolean) {
        _icall_Unit_Boolean(setRefuseNewNetworkConnectionsMethodBind, this.rawMemory, refuse)
    }


    private val isRefusingNewNetworkConnectionsMethodBind: CPointer<godot_method_bind> by lazy { getMB("SceneTree", "is_refusing_new_network_connections") }
    open fun isRefusingNewNetworkConnections(): Boolean {
        return _icall_Boolean(isRefusingNewNetworkConnectionsMethodBind, this.rawMemory)
    }


    open fun _network_peer_connected(arg0: Long) {
    }


    open fun _network_peer_disconnected(arg0: Long) {
    }


    open fun _connected_to_server() {
    }


    open fun _connection_failed() {
    }


    open fun _server_disconnected() {
    }


    private val setUseFontOversamplingMethodBind: CPointer<godot_method_bind> by lazy { getMB("SceneTree", "set_use_font_oversampling") }
    open fun setUseFontOversampling(enable: Boolean) {
        _icall_Unit_Boolean(setUseFontOversamplingMethodBind, this.rawMemory, enable)
    }


    private val isUsingFontOversamplingMethodBind: CPointer<godot_method_bind> by lazy { getMB("SceneTree", "is_using_font_oversampling") }
    open fun isUsingFontOversampling(): Boolean {
        return _icall_Boolean(isUsingFontOversamplingMethodBind, this.rawMemory)
    }


}
