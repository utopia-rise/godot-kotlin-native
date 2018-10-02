@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class AnimationTreePlayer : Node {
    constructor() : super("AnimationTreePlayer")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class AnimationProcessMode(val id: Int) {
        ANIMATION_PROCESS_PHYSICS(0),
        ANIMATION_PROCESS_IDLE(1),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }
    enum class NodeType(val id: Int) {
        NODE_OUTPUT(0),
        NODE_ANIMATION(1),
        NODE_ONESHOT(2),
        NODE_MIX(3),
        NODE_BLEND2(4),
        NODE_BLEND3(5),
        NODE_BLEND4(6),
        NODE_TIMESCALE(7),
        NODE_TIMESEEK(8),
        NODE_TRANSITION(9),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }


    // Signals
    class Signal {
        companion object {
        }
    }


    companion object {
        infix fun from(other: Node): AnimationTreePlayer = AnimationTreePlayer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): AnimationTreePlayer = AnimationTreePlayer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): AnimationTreePlayer = fromVariant(AnimationTreePlayer(""), other)


        // Constants
        const val NODE_OUTPUT: Int = 0
        const val NODE_ANIMATION: Int = 1
        const val NODE_ONESHOT: Int = 2
        const val NODE_MIX: Int = 3
        const val NODE_BLEND2: Int = 4
        const val NODE_BLEND3: Int = 5
        const val NODE_BLEND4: Int = 6
        const val NODE_TIMESCALE: Int = 7
        const val NODE_TIMESEEK: Int = 8
        const val NODE_TRANSITION: Int = 9
        const val ANIMATION_PROCESS_PHYSICS: Int = 0
        const val ANIMATION_PROCESS_IDLE: Int = 1


    }


    // Properties
    open var playbackProcessMode: Int
        get() = _icall_Int(getAnimationProcessModeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setAnimationProcessModeMethodBind, this.rawMemory, value)


    open var masterPlayer: NodePath
        get() = _icall_NodePath(getMasterPlayerMethodBind, this.rawMemory)
        set(value) = _icall_Unit_NodePath(setMasterPlayerMethodBind, this.rawMemory, value)


    open var basePath: NodePath
        get() = _icall_NodePath(getBasePathMethodBind, this.rawMemory)
        set(value) = _icall_Unit_NodePath(setBasePathMethodBind, this.rawMemory, value)


    open var active: Boolean
        get() = _icall_Boolean(isActiveMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setActiveMethodBind, this.rawMemory, value)




    // Methods
    private val addNodeMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationTreePlayer", "add_node") }
    open fun addNode(type: Int, id: String) {
        _icall_Unit_Int_String(addNodeMethodBind, this.rawMemory, type, id)
    }


    private val nodeExistsMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationTreePlayer", "node_exists") }
    open fun nodeExists(node: String): Boolean {
        return _icall_Boolean_String(nodeExistsMethodBind, this.rawMemory, node)
    }


    private val nodeRenameMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationTreePlayer", "node_rename") }
    open fun nodeRename(node: String, newName: String): GodotError {
        return GodotError.fromInt(_icall_Int_String_String(nodeRenameMethodBind, this.rawMemory, node, newName))
    }


    private val nodeGetTypeMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationTreePlayer", "node_get_type") }
    open fun nodeGetType(id: String): AnimationTreePlayer.NodeType {
        return AnimationTreePlayer.NodeType.fromInt(_icall_Int_String(nodeGetTypeMethodBind, this.rawMemory, id))
    }


    private val nodeGetInputCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationTreePlayer", "node_get_input_count") }
    open fun nodeGetInputCount(id: String): Int {
        return _icall_Int_String(nodeGetInputCountMethodBind, this.rawMemory, id)
    }


    private val nodeGetInputSourceMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationTreePlayer", "node_get_input_source") }
    open fun nodeGetInputSource(id: String, idx: Int): String {
        return _icall_String_String_Int(nodeGetInputSourceMethodBind, this.rawMemory, id, idx)
    }


    private val animationNodeSetAnimationMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationTreePlayer", "animation_node_set_animation") }
    open fun animationNodeSetAnimation(id: String, animation: Animation) {
        _icall_Unit_String_Object(animationNodeSetAnimationMethodBind, this.rawMemory, id, animation)
    }


    private val animationNodeGetAnimationMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationTreePlayer", "animation_node_get_animation") }
    open fun animationNodeGetAnimation(id: String): Animation {
        return _icall_Animation_String(animationNodeGetAnimationMethodBind, this.rawMemory, id)
    }


    private val animationNodeSetMasterAnimationMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationTreePlayer", "animation_node_set_master_animation") }
    open fun animationNodeSetMasterAnimation(id: String, source: String) {
        _icall_Unit_String_String(animationNodeSetMasterAnimationMethodBind, this.rawMemory, id, source)
    }


    private val animationNodeGetMasterAnimationMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationTreePlayer", "animation_node_get_master_animation") }
    open fun animationNodeGetMasterAnimation(id: String): String {
        return _icall_String_String(animationNodeGetMasterAnimationMethodBind, this.rawMemory, id)
    }


    private val animationNodeGetPositionMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationTreePlayer", "animation_node_get_position") }
    open fun animationNodeGetPosition(id: String): Float {
        return _icall_Float_String(animationNodeGetPositionMethodBind, this.rawMemory, id)
    }


    private val animationNodeSetFilterPathMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationTreePlayer", "animation_node_set_filter_path") }
    open fun animationNodeSetFilterPath(id: String, path: NodePath, enable: Boolean) {
        _icall_Unit_String_NodePath_Boolean(animationNodeSetFilterPathMethodBind, this.rawMemory, id, path, enable)
    }


    private val oneshotNodeSetFadeinTimeMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationTreePlayer", "oneshot_node_set_fadein_time") }
    open fun oneshotNodeSetFadeinTime(id: String, timeSec: Float) {
        _icall_Unit_String_Float(oneshotNodeSetFadeinTimeMethodBind, this.rawMemory, id, timeSec)
    }


    private val oneshotNodeGetFadeinTimeMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationTreePlayer", "oneshot_node_get_fadein_time") }
    open fun oneshotNodeGetFadeinTime(id: String): Float {
        return _icall_Float_String(oneshotNodeGetFadeinTimeMethodBind, this.rawMemory, id)
    }


    private val oneshotNodeSetFadeoutTimeMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationTreePlayer", "oneshot_node_set_fadeout_time") }
    open fun oneshotNodeSetFadeoutTime(id: String, timeSec: Float) {
        _icall_Unit_String_Float(oneshotNodeSetFadeoutTimeMethodBind, this.rawMemory, id, timeSec)
    }


    private val oneshotNodeGetFadeoutTimeMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationTreePlayer", "oneshot_node_get_fadeout_time") }
    open fun oneshotNodeGetFadeoutTime(id: String): Float {
        return _icall_Float_String(oneshotNodeGetFadeoutTimeMethodBind, this.rawMemory, id)
    }


    private val oneshotNodeSetAutorestartMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationTreePlayer", "oneshot_node_set_autorestart") }
    open fun oneshotNodeSetAutorestart(id: String, enable: Boolean) {
        _icall_Unit_String_Boolean(oneshotNodeSetAutorestartMethodBind, this.rawMemory, id, enable)
    }


    private val oneshotNodeSetAutorestartDelayMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationTreePlayer", "oneshot_node_set_autorestart_delay") }
    open fun oneshotNodeSetAutorestartDelay(id: String, delaySec: Float) {
        _icall_Unit_String_Float(oneshotNodeSetAutorestartDelayMethodBind, this.rawMemory, id, delaySec)
    }


    private val oneshotNodeSetAutorestartRandomDelayMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationTreePlayer", "oneshot_node_set_autorestart_random_delay") }
    open fun oneshotNodeSetAutorestartRandomDelay(id: String, randSec: Float) {
        _icall_Unit_String_Float(oneshotNodeSetAutorestartRandomDelayMethodBind, this.rawMemory, id, randSec)
    }


    private val oneshotNodeHasAutorestartMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationTreePlayer", "oneshot_node_has_autorestart") }
    open fun oneshotNodeHasAutorestart(id: String): Boolean {
        return _icall_Boolean_String(oneshotNodeHasAutorestartMethodBind, this.rawMemory, id)
    }


    private val oneshotNodeGetAutorestartDelayMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationTreePlayer", "oneshot_node_get_autorestart_delay") }
    open fun oneshotNodeGetAutorestartDelay(id: String): Float {
        return _icall_Float_String(oneshotNodeGetAutorestartDelayMethodBind, this.rawMemory, id)
    }


    private val oneshotNodeGetAutorestartRandomDelayMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationTreePlayer", "oneshot_node_get_autorestart_random_delay") }
    open fun oneshotNodeGetAutorestartRandomDelay(id: String): Float {
        return _icall_Float_String(oneshotNodeGetAutorestartRandomDelayMethodBind, this.rawMemory, id)
    }


    private val oneshotNodeStartMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationTreePlayer", "oneshot_node_start") }
    open fun oneshotNodeStart(id: String) {
        _icall_Unit_String(oneshotNodeStartMethodBind, this.rawMemory, id)
    }


    private val oneshotNodeStopMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationTreePlayer", "oneshot_node_stop") }
    open fun oneshotNodeStop(id: String) {
        _icall_Unit_String(oneshotNodeStopMethodBind, this.rawMemory, id)
    }


    private val oneshotNodeIsActiveMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationTreePlayer", "oneshot_node_is_active") }
    open fun oneshotNodeIsActive(id: String): Boolean {
        return _icall_Boolean_String(oneshotNodeIsActiveMethodBind, this.rawMemory, id)
    }


    private val oneshotNodeSetFilterPathMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationTreePlayer", "oneshot_node_set_filter_path") }
    open fun oneshotNodeSetFilterPath(id: String, path: NodePath, enable: Boolean) {
        _icall_Unit_String_NodePath_Boolean(oneshotNodeSetFilterPathMethodBind, this.rawMemory, id, path, enable)
    }


    private val mixNodeSetAmountMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationTreePlayer", "mix_node_set_amount") }
    open fun mixNodeSetAmount(id: String, ratio: Float) {
        _icall_Unit_String_Float(mixNodeSetAmountMethodBind, this.rawMemory, id, ratio)
    }


    private val mixNodeGetAmountMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationTreePlayer", "mix_node_get_amount") }
    open fun mixNodeGetAmount(id: String): Float {
        return _icall_Float_String(mixNodeGetAmountMethodBind, this.rawMemory, id)
    }


    private val blend2NodeSetAmountMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationTreePlayer", "blend2_node_set_amount") }
    open fun blend2NodeSetAmount(id: String, blend: Float) {
        _icall_Unit_String_Float(blend2NodeSetAmountMethodBind, this.rawMemory, id, blend)
    }


    private val blend2NodeGetAmountMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationTreePlayer", "blend2_node_get_amount") }
    open fun blend2NodeGetAmount(id: String): Float {
        return _icall_Float_String(blend2NodeGetAmountMethodBind, this.rawMemory, id)
    }


    private val blend2NodeSetFilterPathMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationTreePlayer", "blend2_node_set_filter_path") }
    open fun blend2NodeSetFilterPath(id: String, path: NodePath, enable: Boolean) {
        _icall_Unit_String_NodePath_Boolean(blend2NodeSetFilterPathMethodBind, this.rawMemory, id, path, enable)
    }


    private val blend3NodeSetAmountMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationTreePlayer", "blend3_node_set_amount") }
    open fun blend3NodeSetAmount(id: String, blend: Float) {
        _icall_Unit_String_Float(blend3NodeSetAmountMethodBind, this.rawMemory, id, blend)
    }


    private val blend3NodeGetAmountMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationTreePlayer", "blend3_node_get_amount") }
    open fun blend3NodeGetAmount(id: String): Float {
        return _icall_Float_String(blend3NodeGetAmountMethodBind, this.rawMemory, id)
    }


    private val blend4NodeSetAmountMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationTreePlayer", "blend4_node_set_amount") }
    open fun blend4NodeSetAmount(id: String, blend: Vector2) {
        _icall_Unit_String_Vector2(blend4NodeSetAmountMethodBind, this.rawMemory, id, blend)
    }


    private val blend4NodeGetAmountMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationTreePlayer", "blend4_node_get_amount") }
    open fun blend4NodeGetAmount(id: String): Vector2 {
        return _icall_Vector2_String(blend4NodeGetAmountMethodBind, this.rawMemory, id)
    }


    private val timescaleNodeSetScaleMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationTreePlayer", "timescale_node_set_scale") }
    open fun timescaleNodeSetScale(id: String, scale: Float) {
        _icall_Unit_String_Float(timescaleNodeSetScaleMethodBind, this.rawMemory, id, scale)
    }


    private val timescaleNodeGetScaleMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationTreePlayer", "timescale_node_get_scale") }
    open fun timescaleNodeGetScale(id: String): Float {
        return _icall_Float_String(timescaleNodeGetScaleMethodBind, this.rawMemory, id)
    }


    private val timeseekNodeSeekMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationTreePlayer", "timeseek_node_seek") }
    open fun timeseekNodeSeek(id: String, seconds: Float) {
        _icall_Unit_String_Float(timeseekNodeSeekMethodBind, this.rawMemory, id, seconds)
    }


    private val transitionNodeSetInputCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationTreePlayer", "transition_node_set_input_count") }
    open fun transitionNodeSetInputCount(id: String, count: Int) {
        _icall_Unit_String_Int(transitionNodeSetInputCountMethodBind, this.rawMemory, id, count)
    }


    private val transitionNodeGetInputCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationTreePlayer", "transition_node_get_input_count") }
    open fun transitionNodeGetInputCount(id: String): Int {
        return _icall_Int_String(transitionNodeGetInputCountMethodBind, this.rawMemory, id)
    }


    private val transitionNodeDeleteInputMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationTreePlayer", "transition_node_delete_input") }
    open fun transitionNodeDeleteInput(id: String, inputIdx: Int) {
        _icall_Unit_String_Int(transitionNodeDeleteInputMethodBind, this.rawMemory, id, inputIdx)
    }


    private val transitionNodeSetInputAutoAdvanceMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationTreePlayer", "transition_node_set_input_auto_advance") }
    open fun transitionNodeSetInputAutoAdvance(id: String, inputIdx: Int, enable: Boolean) {
        _icall_Unit_String_Int_Boolean(transitionNodeSetInputAutoAdvanceMethodBind, this.rawMemory, id, inputIdx, enable)
    }


    private val transitionNodeHasInputAutoAdvanceMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationTreePlayer", "transition_node_has_input_auto_advance") }
    open fun transitionNodeHasInputAutoAdvance(id: String, inputIdx: Int): Boolean {
        return _icall_Boolean_String_Int(transitionNodeHasInputAutoAdvanceMethodBind, this.rawMemory, id, inputIdx)
    }


    private val transitionNodeSetXfadeTimeMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationTreePlayer", "transition_node_set_xfade_time") }
    open fun transitionNodeSetXfadeTime(id: String, timeSec: Float) {
        _icall_Unit_String_Float(transitionNodeSetXfadeTimeMethodBind, this.rawMemory, id, timeSec)
    }


    private val transitionNodeGetXfadeTimeMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationTreePlayer", "transition_node_get_xfade_time") }
    open fun transitionNodeGetXfadeTime(id: String): Float {
        return _icall_Float_String(transitionNodeGetXfadeTimeMethodBind, this.rawMemory, id)
    }


    private val transitionNodeSetCurrentMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationTreePlayer", "transition_node_set_current") }
    open fun transitionNodeSetCurrent(id: String, inputIdx: Int) {
        _icall_Unit_String_Int(transitionNodeSetCurrentMethodBind, this.rawMemory, id, inputIdx)
    }


    private val transitionNodeGetCurrentMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationTreePlayer", "transition_node_get_current") }
    open fun transitionNodeGetCurrent(id: String): Int {
        return _icall_Int_String(transitionNodeGetCurrentMethodBind, this.rawMemory, id)
    }


    private val nodeSetPositionMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationTreePlayer", "node_set_position") }
    open fun nodeSetPosition(id: String, screenPosition: Vector2) {
        _icall_Unit_String_Vector2(nodeSetPositionMethodBind, this.rawMemory, id, screenPosition)
    }


    private val nodeGetPositionMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationTreePlayer", "node_get_position") }
    open fun nodeGetPosition(id: String): Vector2 {
        return _icall_Vector2_String(nodeGetPositionMethodBind, this.rawMemory, id)
    }


    private val removeNodeMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationTreePlayer", "remove_node") }
    open fun removeNode(id: String) {
        _icall_Unit_String(removeNodeMethodBind, this.rawMemory, id)
    }


    private val connectNodesMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationTreePlayer", "connect_nodes") }
    open fun connectNodes(id: String, dstId: String, dstInputIdx: Int): GodotError {
        return GodotError.fromInt(_icall_Int_String_String_Int(connectNodesMethodBind, this.rawMemory, id, dstId, dstInputIdx))
    }


    private val areNodesConnectedMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationTreePlayer", "are_nodes_connected") }
    open fun areNodesConnected(id: String, dstId: String, dstInputIdx: Int): Boolean {
        return _icall_Boolean_String_String_Int(areNodesConnectedMethodBind, this.rawMemory, id, dstId, dstInputIdx)
    }


    private val disconnectNodesMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationTreePlayer", "disconnect_nodes") }
    open fun disconnectNodes(id: String, dstInputIdx: Int) {
        _icall_Unit_String_Int(disconnectNodesMethodBind, this.rawMemory, id, dstInputIdx)
    }


    private val setActiveMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationTreePlayer", "set_active") }
    open fun setActive(enabled: Boolean) {
        _icall_Unit_Boolean(setActiveMethodBind, this.rawMemory, enabled)
    }


    private val isActiveMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationTreePlayer", "is_active") }
    open fun isActive(): Boolean {
        return _icall_Boolean(isActiveMethodBind, this.rawMemory)
    }


    private val setBasePathMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationTreePlayer", "set_base_path") }
    open fun setBasePath(path: NodePath) {
        _icall_Unit_NodePath(setBasePathMethodBind, this.rawMemory, path)
    }


    private val getBasePathMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationTreePlayer", "get_base_path") }
    open fun getBasePath(): NodePath {
        return _icall_NodePath(getBasePathMethodBind, this.rawMemory)
    }


    private val setMasterPlayerMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationTreePlayer", "set_master_player") }
    open fun setMasterPlayer(nodepath: NodePath) {
        _icall_Unit_NodePath(setMasterPlayerMethodBind, this.rawMemory, nodepath)
    }


    private val getMasterPlayerMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationTreePlayer", "get_master_player") }
    open fun getMasterPlayer(): NodePath {
        return _icall_NodePath(getMasterPlayerMethodBind, this.rawMemory)
    }


    private val getNodeListMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationTreePlayer", "get_node_list") }
    open fun getNodeList(): PoolStringArray {
        return _icall_PoolStringArray(getNodeListMethodBind, this.rawMemory)
    }


    private val setAnimationProcessModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationTreePlayer", "set_animation_process_mode") }
    open fun setAnimationProcessMode(mode: Int) {
        _icall_Unit_Int(setAnimationProcessModeMethodBind, this.rawMemory, mode)
    }


    private val getAnimationProcessModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationTreePlayer", "get_animation_process_mode") }
    open fun getAnimationProcessMode(): AnimationTreePlayer.AnimationProcessMode {
        return AnimationTreePlayer.AnimationProcessMode.fromInt(_icall_Int(getAnimationProcessModeMethodBind, this.rawMemory))
    }


    private val advanceMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationTreePlayer", "advance") }
    open fun advance(delta: Float) {
        _icall_Unit_Float(advanceMethodBind, this.rawMemory, delta)
    }


    private val resetMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationTreePlayer", "reset") }
    open fun reset() {
        _icall_Unit(resetMethodBind, this.rawMemory)
    }


    private val recomputeCachesMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationTreePlayer", "recompute_caches") }
    open fun recomputeCaches() {
        _icall_Unit(recomputeCachesMethodBind, this.rawMemory)
    }


}
