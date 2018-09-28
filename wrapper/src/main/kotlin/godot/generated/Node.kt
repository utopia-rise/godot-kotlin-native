@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class Node : Object {
    constructor() : super("Node")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class PauseMode(val id: Int) {
        PAUSE_MODE_INHERIT(0),
        PAUSE_MODE_STOP(1),
        PAUSE_MODE_PROCESS(2),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }
    enum class DuplicateFlags(val id: Int) {
        DUPLICATE_SIGNALS(1),
        DUPLICATE_GROUPS(2),
        DUPLICATE_SCRIPTS(4),
        DUPLICATE_USE_INSTANCING(8),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }


    // Signals
    class Signal {
        companion object {
            const val RENAMED: String = "renamed"
            const val READY: String = "ready"
            const val TREE_ENTERED: String = "tree_entered"
            const val TREE_EXITING: String = "tree_exiting"
            const val TREE_EXITED: String = "tree_exited"
        }
    }


    companion object {
        infix fun from(other: Object): Node = Node("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): Node = fromVariant(Node(""), other)


        // Constants
        const val NOTIFICATION_ENTER_TREE: Int = 10
        const val NOTIFICATION_EXIT_TREE: Int = 11
        const val NOTIFICATION_MOVED_IN_PARENT: Int = 12
        const val NOTIFICATION_READY: Int = 13
        const val NOTIFICATION_PAUSED: Int = 14
        const val NOTIFICATION_UNPAUSED: Int = 15
        const val NOTIFICATION_PHYSICS_PROCESS: Int = 16
        const val NOTIFICATION_PROCESS: Int = 17
        const val NOTIFICATION_PARENTED: Int = 18
        const val NOTIFICATION_UNPARENTED: Int = 19
        const val NOTIFICATION_INSTANCED: Int = 20
        const val NOTIFICATION_DRAG_BEGIN: Int = 21
        const val NOTIFICATION_DRAG_END: Int = 22
        const val NOTIFICATION_PATH_CHANGED: Int = 23
        const val NOTIFICATION_TRANSLATION_CHANGED: Int = 24
        const val NOTIFICATION_INTERNAL_PROCESS: Int = 25
        const val NOTIFICATION_INTERNAL_PHYSICS_PROCESS: Int = 26
        const val PAUSE_MODE_INHERIT: Int = 0
        const val PAUSE_MODE_STOP: Int = 1
        const val PAUSE_MODE_PROCESS: Int = 2
        const val DUPLICATE_SIGNALS: Int = 1
        const val DUPLICATE_GROUPS: Int = 2
        const val DUPLICATE_SCRIPTS: Int = 4
        const val DUPLICATE_USE_INSTANCING: Int = 8


    }


    // Properties
    open var pauseMode: Int
        get() = _icall_Int(getPauseModeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setPauseModeMethodBind, this.rawMemory, value)


    open var editor_displayFolded: Boolean
        get() = _icall_Boolean(isDisplayedFoldedMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setDisplayFoldedMethodBind, this.rawMemory, value)


    open var name: String
        get() = _icall_String(getNameMethodBind, this.rawMemory)
        set(value) = _icall_Unit_String(setNameMethodBind, this.rawMemory, value)


    open var filename: String
        get() = _icall_String(getFilenameMethodBind, this.rawMemory)
        set(value) = _icall_Unit_String(setFilenameMethodBind, this.rawMemory, value)


    open var owner: Node
        get() = _icall_Node(getOwnerMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setOwnerMethodBind, this.rawMemory, value)


    open val multiplayer: MultiplayerAPI
        get() = _icall_MultiplayerAPI(getMultiplayerMethodBind, this.rawMemory)


    open var customMultiplayer: MultiplayerAPI
        get() = _icall_MultiplayerAPI(getCustomMultiplayerMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setCustomMultiplayerMethodBind, this.rawMemory, value)




    // Methods
    open fun _process(delta: Float) {
    }


    open fun _physics_process(delta: Float) {
    }


    open fun _enter_tree() {
    }


    open fun _exit_tree() {
    }


    open fun _ready() {
    }


    open fun _input(event: InputEvent) {
    }


    open fun _unhandled_input(event: InputEvent) {
    }


    open fun _unhandled_key_input(event: InputEventKey) {
    }


    private val addChildBelowNodeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node", "add_child_below_node") }
    open fun addChildBelowNode(node: Object, childNode: Object, legibleUniqueName: Boolean = false) {
        _icall_Unit_Object_Object_Boolean(addChildBelowNodeMethodBind, this.rawMemory, node, childNode, legibleUniqueName)
    }


    private val setNameMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node", "set_name") }
    open fun setName(name: String) {
        _icall_Unit_String(setNameMethodBind, this.rawMemory, name)
    }


    private val getNameMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node", "get_name") }
    open fun getName(): String {
        return _icall_String(getNameMethodBind, this.rawMemory)
    }


    private val addChildMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node", "add_child") }
    open fun addChild(node: Object, legibleUniqueName: Boolean = false) {
        _icall_Unit_Object_Boolean(addChildMethodBind, this.rawMemory, node, legibleUniqueName)
    }


    private val removeChildMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node", "remove_child") }
    open fun removeChild(node: Object) {
        _icall_Unit_Object(removeChildMethodBind, this.rawMemory, node)
    }


    private val getChildCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node", "get_child_count") }
    open fun getChildCount(): Int {
        return _icall_Int(getChildCountMethodBind, this.rawMemory)
    }


    private val getChildrenMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node", "get_children") }
    open fun getChildren(): GDArray {
        return _icall_GDArray(getChildrenMethodBind, this.rawMemory)
    }


    private val getChildMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node", "get_child") }
    open fun getChild(idx: Int): Node {
        return _icall_Node_Int(getChildMethodBind, this.rawMemory, idx)
    }


    private val hasNodeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node", "has_node") }
    open fun hasNode(path: NodePath): Boolean {
        return _icall_Boolean_NodePath(hasNodeMethodBind, this.rawMemory, path)
    }


    private val getNodeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node", "get_node") }
    open fun getNode(path: NodePath): Node {
        return _icall_Node_NodePath(getNodeMethodBind, this.rawMemory, path)
    }


    private val getParentMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node", "get_parent") }
    open fun getParent(): Node {
        return _icall_Node(getParentMethodBind, this.rawMemory)
    }


    private val findNodeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node", "find_node") }
    open fun findNode(mask: String, recursive: Boolean = true, owned: Boolean = true): Node {
        return _icall_Node_String_Boolean_Boolean(findNodeMethodBind, this.rawMemory, mask, recursive, owned)
    }


    private val hasNodeAndResourceMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node", "has_node_and_resource") }
    open fun hasNodeAndResource(path: NodePath): Boolean {
        return _icall_Boolean_NodePath(hasNodeAndResourceMethodBind, this.rawMemory, path)
    }


    private val getNodeAndResourceMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node", "get_node_and_resource") }
    open fun getNodeAndResource(path: NodePath): GDArray {
        return _icall_GDArray_NodePath(getNodeAndResourceMethodBind, this.rawMemory, path)
    }


    private val isInsideTreeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node", "is_inside_tree") }
    open fun isInsideTree(): Boolean {
        return _icall_Boolean(isInsideTreeMethodBind, this.rawMemory)
    }


    private val isAParentOfMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node", "is_a_parent_of") }
    open fun isAParentOf(node: Object): Boolean {
        return _icall_Boolean_Object(isAParentOfMethodBind, this.rawMemory, node)
    }


    private val isGreaterThanMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node", "is_greater_than") }
    open fun isGreaterThan(node: Object): Boolean {
        return _icall_Boolean_Object(isGreaterThanMethodBind, this.rawMemory, node)
    }


    private val getPathMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node", "get_path") }
    open fun getPath(): NodePath {
        return _icall_NodePath(getPathMethodBind, this.rawMemory)
    }


    private val getPathToMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node", "get_path_to") }
    open fun getPathTo(node: Object): NodePath {
        return _icall_NodePath_Object(getPathToMethodBind, this.rawMemory, node)
    }


    private val addToGroupMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node", "add_to_group") }
    open fun addToGroup(group: String, persistent: Boolean = false) {
        _icall_Unit_String_Boolean(addToGroupMethodBind, this.rawMemory, group, persistent)
    }


    private val removeFromGroupMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node", "remove_from_group") }
    open fun removeFromGroup(group: String) {
        _icall_Unit_String(removeFromGroupMethodBind, this.rawMemory, group)
    }


    private val isInGroupMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node", "is_in_group") }
    open fun isInGroup(group: String): Boolean {
        return _icall_Boolean_String(isInGroupMethodBind, this.rawMemory, group)
    }


    private val moveChildMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node", "move_child") }
    open fun moveChild(childNode: Object, toPosition: Int) {
        _icall_Unit_Object_Int(moveChildMethodBind, this.rawMemory, childNode, toPosition)
    }


    private val getGroupsMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node", "get_groups") }
    open fun getGroups(): GDArray {
        return _icall_GDArray(getGroupsMethodBind, this.rawMemory)
    }


    private val raiseMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node", "raise") }
    open fun raise() {
        _icall_Unit(raiseMethodBind, this.rawMemory)
    }


    private val setOwnerMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node", "set_owner") }
    open fun setOwner(owner: Object) {
        _icall_Unit_Object(setOwnerMethodBind, this.rawMemory, owner)
    }


    private val getOwnerMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node", "get_owner") }
    open fun getOwner(): Node {
        return _icall_Node(getOwnerMethodBind, this.rawMemory)
    }


    private val removeAndSkipMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node", "remove_and_skip") }
    open fun removeAndSkip() {
        _icall_Unit(removeAndSkipMethodBind, this.rawMemory)
    }


    private val getIndexMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node", "get_index") }
    open fun getIndex(): Int {
        return _icall_Int(getIndexMethodBind, this.rawMemory)
    }


    private val printTreeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node", "print_tree") }
    open fun printTree() {
        _icall_Unit(printTreeMethodBind, this.rawMemory)
    }


    private val printTreePrettyMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node", "print_tree_pretty") }
    open fun printTreePretty() {
        _icall_Unit(printTreePrettyMethodBind, this.rawMemory)
    }


    private val setFilenameMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node", "set_filename") }
    open fun setFilename(filename: String) {
        _icall_Unit_String(setFilenameMethodBind, this.rawMemory, filename)
    }


    private val getFilenameMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node", "get_filename") }
    open fun getFilename(): String {
        return _icall_String(getFilenameMethodBind, this.rawMemory)
    }


    private val propagateNotificationMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node", "propagate_notification") }
    open fun propagateNotification(what: Int) {
        _icall_Unit_Int(propagateNotificationMethodBind, this.rawMemory, what)
    }


    private val propagateCallMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node", "propagate_call") }
    open fun propagateCall(method: String, args: GDArray = GDArray(), parentFirst: Boolean = false) {
        _icall_Unit_String_GDArray_Boolean(propagateCallMethodBind, this.rawMemory, method, args, parentFirst)
    }


    private val setPhysicsProcessMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node", "set_physics_process") }
    open fun setPhysicsProcess(enable: Boolean) {
        _icall_Unit_Boolean(setPhysicsProcessMethodBind, this.rawMemory, enable)
    }


    private val getPhysicsProcessDeltaTimeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node", "get_physics_process_delta_time") }
    open fun getPhysicsProcessDeltaTime(): Float {
        return _icall_Float(getPhysicsProcessDeltaTimeMethodBind, this.rawMemory)
    }


    private val isPhysicsProcessingMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node", "is_physics_processing") }
    open fun isPhysicsProcessing(): Boolean {
        return _icall_Boolean(isPhysicsProcessingMethodBind, this.rawMemory)
    }


    private val getProcessDeltaTimeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node", "get_process_delta_time") }
    open fun getProcessDeltaTime(): Float {
        return _icall_Float(getProcessDeltaTimeMethodBind, this.rawMemory)
    }


    private val setProcessMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node", "set_process") }
    open fun setProcess(enable: Boolean) {
        _icall_Unit_Boolean(setProcessMethodBind, this.rawMemory, enable)
    }


    private val isProcessingMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node", "is_processing") }
    open fun isProcessing(): Boolean {
        return _icall_Boolean(isProcessingMethodBind, this.rawMemory)
    }


    private val setProcessInputMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node", "set_process_input") }
    open fun setProcessInput(enable: Boolean) {
        _icall_Unit_Boolean(setProcessInputMethodBind, this.rawMemory, enable)
    }


    private val isProcessingInputMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node", "is_processing_input") }
    open fun isProcessingInput(): Boolean {
        return _icall_Boolean(isProcessingInputMethodBind, this.rawMemory)
    }


    private val setProcessUnhandledInputMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node", "set_process_unhandled_input") }
    open fun setProcessUnhandledInput(enable: Boolean) {
        _icall_Unit_Boolean(setProcessUnhandledInputMethodBind, this.rawMemory, enable)
    }


    private val isProcessingUnhandledInputMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node", "is_processing_unhandled_input") }
    open fun isProcessingUnhandledInput(): Boolean {
        return _icall_Boolean(isProcessingUnhandledInputMethodBind, this.rawMemory)
    }


    private val setProcessUnhandledKeyInputMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node", "set_process_unhandled_key_input") }
    open fun setProcessUnhandledKeyInput(enable: Boolean) {
        _icall_Unit_Boolean(setProcessUnhandledKeyInputMethodBind, this.rawMemory, enable)
    }


    private val isProcessingUnhandledKeyInputMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node", "is_processing_unhandled_key_input") }
    open fun isProcessingUnhandledKeyInput(): Boolean {
        return _icall_Boolean(isProcessingUnhandledKeyInputMethodBind, this.rawMemory)
    }


    private val setPauseModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node", "set_pause_mode") }
    open fun setPauseMode(mode: Int) {
        _icall_Unit_Int(setPauseModeMethodBind, this.rawMemory, mode)
    }


    private val getPauseModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node", "get_pause_mode") }
    open fun getPauseMode(): Node.PauseMode {
        return Node.PauseMode.fromInt(_icall_Int(getPauseModeMethodBind, this.rawMemory))
    }


    private val canProcessMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node", "can_process") }
    open fun canProcess(): Boolean {
        return _icall_Boolean(canProcessMethodBind, this.rawMemory)
    }


    private val printStrayNodesMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node", "print_stray_nodes") }
    open fun printStrayNodes() {
        _icall_Unit(printStrayNodesMethodBind, this.rawMemory)
    }


    private val getPositionInParentMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node", "get_position_in_parent") }
    open fun getPositionInParent(): Int {
        return _icall_Int(getPositionInParentMethodBind, this.rawMemory)
    }


    private val setDisplayFoldedMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node", "set_display_folded") }
    open fun setDisplayFolded(fold: Boolean) {
        _icall_Unit_Boolean(setDisplayFoldedMethodBind, this.rawMemory, fold)
    }


    private val isDisplayedFoldedMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node", "is_displayed_folded") }
    open fun isDisplayedFolded(): Boolean {
        return _icall_Boolean(isDisplayedFoldedMethodBind, this.rawMemory)
    }


    private val setProcessInternalMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node", "set_process_internal") }
    open fun setProcessInternal(enable: Boolean) {
        _icall_Unit_Boolean(setProcessInternalMethodBind, this.rawMemory, enable)
    }


    private val isProcessingInternalMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node", "is_processing_internal") }
    open fun isProcessingInternal(): Boolean {
        return _icall_Boolean(isProcessingInternalMethodBind, this.rawMemory)
    }


    private val setPhysicsProcessInternalMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node", "set_physics_process_internal") }
    open fun setPhysicsProcessInternal(enable: Boolean) {
        _icall_Unit_Boolean(setPhysicsProcessInternalMethodBind, this.rawMemory, enable)
    }


    private val isPhysicsProcessingInternalMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node", "is_physics_processing_internal") }
    open fun isPhysicsProcessingInternal(): Boolean {
        return _icall_Boolean(isPhysicsProcessingInternalMethodBind, this.rawMemory)
    }


    private val getTreeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node", "get_tree") }
    open fun getTree(): SceneTree {
        return _icall_SceneTree(getTreeMethodBind, this.rawMemory)
    }


    private val duplicateMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node", "duplicate") }
    open fun duplicate(flags: Int = 15): Node {
        return _icall_Node_Int(duplicateMethodBind, this.rawMemory, flags)
    }


    private val replaceByMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node", "replace_by") }
    open fun replaceBy(node: Object, keepData: Boolean = false) {
        _icall_Unit_Object_Boolean(replaceByMethodBind, this.rawMemory, node, keepData)
    }


    private val setSceneInstanceLoadPlaceholderMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node", "set_scene_instance_load_placeholder") }
    open fun setSceneInstanceLoadPlaceholder(loadPlaceholder: Boolean) {
        _icall_Unit_Boolean(setSceneInstanceLoadPlaceholderMethodBind, this.rawMemory, loadPlaceholder)
    }


    private val getSceneInstanceLoadPlaceholderMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node", "get_scene_instance_load_placeholder") }
    open fun getSceneInstanceLoadPlaceholder(): Boolean {
        return _icall_Boolean(getSceneInstanceLoadPlaceholderMethodBind, this.rawMemory)
    }


    private val getViewportMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node", "get_viewport") }
    open fun getViewport(): Viewport {
        return _icall_Viewport(getViewportMethodBind, this.rawMemory)
    }


    private val queueFreeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node", "queue_free") }
    open fun queueFree() {
        _icall_Unit(queueFreeMethodBind, this.rawMemory)
    }


    private val requestReadyMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node", "request_ready") }
    open fun requestReady() {
        _icall_Unit(requestReadyMethodBind, this.rawMemory)
    }


    private val setNetworkMasterMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node", "set_network_master") }
    open fun setNetworkMaster(id: Int, recursive: Boolean = true) {
        _icall_Unit_Int_Boolean(setNetworkMasterMethodBind, this.rawMemory, id, recursive)
    }


    private val getNetworkMasterMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node", "get_network_master") }
    open fun getNetworkMaster(): Int {
        return _icall_Int(getNetworkMasterMethodBind, this.rawMemory)
    }


    private val isNetworkMasterMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node", "is_network_master") }
    open fun isNetworkMaster(): Boolean {
        return _icall_Boolean(isNetworkMasterMethodBind, this.rawMemory)
    }


    private val getMultiplayerMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node", "get_multiplayer") }
    open fun getMultiplayer(): MultiplayerAPI {
        return _icall_MultiplayerAPI(getMultiplayerMethodBind, this.rawMemory)
    }


    private val getCustomMultiplayerMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node", "get_custom_multiplayer") }
    open fun getCustomMultiplayer(): MultiplayerAPI {
        return _icall_MultiplayerAPI(getCustomMultiplayerMethodBind, this.rawMemory)
    }


    private val setCustomMultiplayerMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node", "set_custom_multiplayer") }
    open fun setCustomMultiplayer(api: MultiplayerAPI) {
        _icall_Unit_Object(setCustomMultiplayerMethodBind, this.rawMemory, api)
    }


    private val rpcConfigMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node", "rpc_config") }
    open fun rpcConfig(method: String, mode: Int) {
        _icall_Unit_String_Int(rpcConfigMethodBind, this.rawMemory, method, mode)
    }


    private val rsetConfigMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node", "rset_config") }
    open fun rsetConfig(property: String, mode: Int) {
        _icall_Unit_String_Int(rsetConfigMethodBind, this.rawMemory, property, mode)
    }


    open fun _set_import_path(importPath: NodePath) {
    }


    open fun _get_import_path(): NodePath {
        throw NotImplementedError("_get_import_path is not implemented for Node")
    }


    private val rpcMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node", "rpc") }
    open fun rpc(method: String, vararg __var_args: Any?): Variant {
        return _icall_varargs(rpcMethodBind, this.rawMemory, arrayOf(method, *__var_args))
    }


    private val rpcUnreliableMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node", "rpc_unreliable") }
    open fun rpcUnreliable(method: String, vararg __var_args: Any?): Variant {
        return _icall_varargs(rpcUnreliableMethodBind, this.rawMemory, arrayOf(method, *__var_args))
    }


    private val rpcIdMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node", "rpc_id") }
    open fun rpcId(peerId: Int, method: String, vararg __var_args: Any?): Variant {
        return _icall_varargs(rpcIdMethodBind, this.rawMemory, arrayOf(peerId, method, *__var_args))
    }


    private val rpcUnreliableIdMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node", "rpc_unreliable_id") }
    open fun rpcUnreliableId(peerId: Int, method: String, vararg __var_args: Any?): Variant {
        return _icall_varargs(rpcUnreliableIdMethodBind, this.rawMemory, arrayOf(peerId, method, *__var_args))
    }


    private val rsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node", "rset") }
    open fun rset(property: String, value: Variant) {
        _icall_Unit_String_Variant(rsetMethodBind, this.rawMemory, property, value)
    }


    private val rsetIdMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node", "rset_id") }
    open fun rsetId(peerId: Int, property: String, value: Variant) {
        _icall_Unit_Int_String_Variant(rsetIdMethodBind, this.rawMemory, peerId, property, value)
    }


    private val rsetUnreliableMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node", "rset_unreliable") }
    open fun rsetUnreliable(property: String, value: Variant) {
        _icall_Unit_String_Variant(rsetUnreliableMethodBind, this.rawMemory, property, value)
    }


    private val rsetUnreliableIdMethodBind: CPointer<godot_method_bind> by lazy { getMB("Node", "rset_unreliable_id") }
    open fun rsetUnreliableId(peerId: Int, property: String, value: Variant) {
        _icall_Unit_Int_String_Variant(rsetUnreliableIdMethodBind, this.rawMemory, peerId, property, value)
    }


}
