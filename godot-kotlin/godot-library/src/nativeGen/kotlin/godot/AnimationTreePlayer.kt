// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.AnimationTreePlayer
import godot.core.Godot.shouldInitPtr
import godot.core.GodotError
import godot.core.NodePath
import godot.core.PoolStringArray
import godot.core.Vector2
import godot.icalls._icall_Animation_String
import godot.icalls._icall_Boolean
import godot.icalls._icall_Boolean_String
import godot.icalls._icall_Boolean_String_Long
import godot.icalls._icall_Boolean_String_String_Long
import godot.icalls._icall_Double_String
import godot.icalls._icall_Long
import godot.icalls._icall_Long_String
import godot.icalls._icall_Long_String_String
import godot.icalls._icall_Long_String_String_Long
import godot.icalls._icall_NodePath
import godot.icalls._icall_PoolStringArray
import godot.icalls._icall_String_String
import godot.icalls._icall_String_String_Long
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Long_String
import godot.icalls._icall_Unit_NodePath
import godot.icalls._icall_Unit_String
import godot.icalls._icall_Unit_String_Boolean
import godot.icalls._icall_Unit_String_Double
import godot.icalls._icall_Unit_String_Long
import godot.icalls._icall_Unit_String_Long_Boolean
import godot.icalls._icall_Unit_String_NodePath_Boolean
import godot.icalls._icall_Unit_String_Object
import godot.icalls._icall_Unit_String_String
import godot.icalls._icall_Unit_String_Vector2
import godot.icalls._icall_Vector2_String
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.String

open class AnimationTreePlayer internal constructor(
  _ignore: Any?
) : Node(_ignore) {
  open var active: Boolean
    get() {
      val mb = getMethodBind("AnimationTreePlayer","is_active")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AnimationTreePlayer","set_active")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var basePath: NodePath
    get() {
      val mb = getMethodBind("AnimationTreePlayer","get_base_path")
      return _icall_NodePath(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AnimationTreePlayer","set_base_path")
      _icall_Unit_NodePath(mb, this.ptr, value)
    }

  open var masterPlayer: NodePath
    get() {
      val mb = getMethodBind("AnimationTreePlayer","get_master_player")
      return _icall_NodePath(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AnimationTreePlayer","set_master_player")
      _icall_Unit_NodePath(mb, this.ptr, value)
    }

  open var playbackProcessMode: Long
    get() {
      val mb = getMethodBind("AnimationTreePlayer","get_animation_process_mode")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AnimationTreePlayer","set_animation_process_mode")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("AnimationTreePlayer", "AnimationTreePlayer")
        }

  }

  open fun addNode(type: Long, id: String) {
    val mb = getMethodBind("AnimationTreePlayer","add_node")
    _icall_Unit_Long_String( mb, this.ptr, type, id)
  }

  open fun advance(delta: Double) {
    val mb = getMethodBind("AnimationTreePlayer","advance")
    _icall_Unit_Double( mb, this.ptr, delta)
  }

  open fun animationNodeGetAnimation(id: String): Animation {
    val mb = getMethodBind("AnimationTreePlayer","animation_node_get_animation")
    return _icall_Animation_String( mb, this.ptr, id)
  }

  open fun animationNodeGetMasterAnimation(id: String): String {
    val mb = getMethodBind("AnimationTreePlayer","animation_node_get_master_animation")
    return _icall_String_String( mb, this.ptr, id)
  }

  open fun animationNodeGetPosition(id: String): Double {
    val mb = getMethodBind("AnimationTreePlayer","animation_node_get_position")
    return _icall_Double_String( mb, this.ptr, id)
  }

  open fun animationNodeSetAnimation(id: String, animation: Animation) {
    val mb = getMethodBind("AnimationTreePlayer","animation_node_set_animation")
    _icall_Unit_String_Object( mb, this.ptr, id, animation)
  }

  open fun animationNodeSetFilterPath(
    id: String,
    path: NodePath,
    enable: Boolean
  ) {
    val mb = getMethodBind("AnimationTreePlayer","animation_node_set_filter_path")
    _icall_Unit_String_NodePath_Boolean( mb, this.ptr, id, path, enable)
  }

  open fun animationNodeSetMasterAnimation(id: String, source: String) {
    val mb = getMethodBind("AnimationTreePlayer","animation_node_set_master_animation")
    _icall_Unit_String_String( mb, this.ptr, id, source)
  }

  open fun areNodesConnected(
    id: String,
    dstId: String,
    dstInputIdx: Long
  ): Boolean {
    val mb = getMethodBind("AnimationTreePlayer","are_nodes_connected")
    return _icall_Boolean_String_String_Long( mb, this.ptr, id, dstId, dstInputIdx)
  }

  open fun blend2NodeGetAmount(id: String): Double {
    val mb = getMethodBind("AnimationTreePlayer","blend2_node_get_amount")
    return _icall_Double_String( mb, this.ptr, id)
  }

  open fun blend2NodeSetAmount(id: String, blend: Double) {
    val mb = getMethodBind("AnimationTreePlayer","blend2_node_set_amount")
    _icall_Unit_String_Double( mb, this.ptr, id, blend)
  }

  open fun blend2NodeSetFilterPath(
    id: String,
    path: NodePath,
    enable: Boolean
  ) {
    val mb = getMethodBind("AnimationTreePlayer","blend2_node_set_filter_path")
    _icall_Unit_String_NodePath_Boolean( mb, this.ptr, id, path, enable)
  }

  open fun blend3NodeGetAmount(id: String): Double {
    val mb = getMethodBind("AnimationTreePlayer","blend3_node_get_amount")
    return _icall_Double_String( mb, this.ptr, id)
  }

  open fun blend3NodeSetAmount(id: String, blend: Double) {
    val mb = getMethodBind("AnimationTreePlayer","blend3_node_set_amount")
    _icall_Unit_String_Double( mb, this.ptr, id, blend)
  }

  open fun blend4NodeGetAmount(id: String): Vector2 {
    val mb = getMethodBind("AnimationTreePlayer","blend4_node_get_amount")
    return _icall_Vector2_String( mb, this.ptr, id)
  }

  open fun blend4NodeSetAmount(id: String, blend: Vector2) {
    val mb = getMethodBind("AnimationTreePlayer","blend4_node_set_amount")
    _icall_Unit_String_Vector2( mb, this.ptr, id, blend)
  }

  open fun connectNodes(
    id: String,
    dstId: String,
    dstInputIdx: Long
  ): GodotError {
    val mb = getMethodBind("AnimationTreePlayer","connect_nodes")
    return GodotError.byValue( _icall_Long_String_String_Long( mb, this.ptr, id, dstId,
        dstInputIdx).toUInt())
  }

  open fun disconnectNodes(id: String, dstInputIdx: Long) {
    val mb = getMethodBind("AnimationTreePlayer","disconnect_nodes")
    _icall_Unit_String_Long( mb, this.ptr, id, dstInputIdx)
  }

  open fun getAnimationProcessMode(): AnimationTreePlayer.AnimationProcessMode {
    val mb = getMethodBind("AnimationTreePlayer","get_animation_process_mode")
    return AnimationTreePlayer.AnimationProcessMode.from( _icall_Long( mb, this.ptr))
  }

  open fun getBasePath(): NodePath {
    val mb = getMethodBind("AnimationTreePlayer","get_base_path")
    return _icall_NodePath( mb, this.ptr)
  }

  open fun getMasterPlayer(): NodePath {
    val mb = getMethodBind("AnimationTreePlayer","get_master_player")
    return _icall_NodePath( mb, this.ptr)
  }

  open fun getNodeList(): PoolStringArray {
    val mb = getMethodBind("AnimationTreePlayer","get_node_list")
    return _icall_PoolStringArray( mb, this.ptr)
  }

  open fun isActive(): Boolean {
    val mb = getMethodBind("AnimationTreePlayer","is_active")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun mixNodeGetAmount(id: String): Double {
    val mb = getMethodBind("AnimationTreePlayer","mix_node_get_amount")
    return _icall_Double_String( mb, this.ptr, id)
  }

  open fun mixNodeSetAmount(id: String, ratio: Double) {
    val mb = getMethodBind("AnimationTreePlayer","mix_node_set_amount")
    _icall_Unit_String_Double( mb, this.ptr, id, ratio)
  }

  open fun nodeExists(node: String): Boolean {
    val mb = getMethodBind("AnimationTreePlayer","node_exists")
    return _icall_Boolean_String( mb, this.ptr, node)
  }

  open fun nodeGetInputCount(id: String): Long {
    val mb = getMethodBind("AnimationTreePlayer","node_get_input_count")
    return _icall_Long_String( mb, this.ptr, id)
  }

  open fun nodeGetInputSource(id: String, idx: Long): String {
    val mb = getMethodBind("AnimationTreePlayer","node_get_input_source")
    return _icall_String_String_Long( mb, this.ptr, id, idx)
  }

  open fun nodeGetPosition(id: String): Vector2 {
    val mb = getMethodBind("AnimationTreePlayer","node_get_position")
    return _icall_Vector2_String( mb, this.ptr, id)
  }

  open fun nodeGetType(id: String): AnimationTreePlayer.NodeType {
    val mb = getMethodBind("AnimationTreePlayer","node_get_type")
    return AnimationTreePlayer.NodeType.from( _icall_Long_String( mb, this.ptr, id))
  }

  open fun nodeRename(node: String, newName: String): GodotError {
    val mb = getMethodBind("AnimationTreePlayer","node_rename")
    return GodotError.byValue( _icall_Long_String_String( mb, this.ptr, node, newName).toUInt())
  }

  open fun nodeSetPosition(id: String, screenPosition: Vector2) {
    val mb = getMethodBind("AnimationTreePlayer","node_set_position")
    _icall_Unit_String_Vector2( mb, this.ptr, id, screenPosition)
  }

  open fun oneshotNodeGetAutorestartDelay(id: String): Double {
    val mb = getMethodBind("AnimationTreePlayer","oneshot_node_get_autorestart_delay")
    return _icall_Double_String( mb, this.ptr, id)
  }

  open fun oneshotNodeGetAutorestartRandomDelay(id: String): Double {
    val mb = getMethodBind("AnimationTreePlayer","oneshot_node_get_autorestart_random_delay")
    return _icall_Double_String( mb, this.ptr, id)
  }

  open fun oneshotNodeGetFadeinTime(id: String): Double {
    val mb = getMethodBind("AnimationTreePlayer","oneshot_node_get_fadein_time")
    return _icall_Double_String( mb, this.ptr, id)
  }

  open fun oneshotNodeGetFadeoutTime(id: String): Double {
    val mb = getMethodBind("AnimationTreePlayer","oneshot_node_get_fadeout_time")
    return _icall_Double_String( mb, this.ptr, id)
  }

  open fun oneshotNodeHasAutorestart(id: String): Boolean {
    val mb = getMethodBind("AnimationTreePlayer","oneshot_node_has_autorestart")
    return _icall_Boolean_String( mb, this.ptr, id)
  }

  open fun oneshotNodeIsActive(id: String): Boolean {
    val mb = getMethodBind("AnimationTreePlayer","oneshot_node_is_active")
    return _icall_Boolean_String( mb, this.ptr, id)
  }

  open fun oneshotNodeSetAutorestart(id: String, enable: Boolean) {
    val mb = getMethodBind("AnimationTreePlayer","oneshot_node_set_autorestart")
    _icall_Unit_String_Boolean( mb, this.ptr, id, enable)
  }

  open fun oneshotNodeSetAutorestartDelay(id: String, delaySec: Double) {
    val mb = getMethodBind("AnimationTreePlayer","oneshot_node_set_autorestart_delay")
    _icall_Unit_String_Double( mb, this.ptr, id, delaySec)
  }

  open fun oneshotNodeSetAutorestartRandomDelay(id: String, randSec: Double) {
    val mb = getMethodBind("AnimationTreePlayer","oneshot_node_set_autorestart_random_delay")
    _icall_Unit_String_Double( mb, this.ptr, id, randSec)
  }

  open fun oneshotNodeSetFadeinTime(id: String, timeSec: Double) {
    val mb = getMethodBind("AnimationTreePlayer","oneshot_node_set_fadein_time")
    _icall_Unit_String_Double( mb, this.ptr, id, timeSec)
  }

  open fun oneshotNodeSetFadeoutTime(id: String, timeSec: Double) {
    val mb = getMethodBind("AnimationTreePlayer","oneshot_node_set_fadeout_time")
    _icall_Unit_String_Double( mb, this.ptr, id, timeSec)
  }

  open fun oneshotNodeSetFilterPath(
    id: String,
    path: NodePath,
    enable: Boolean
  ) {
    val mb = getMethodBind("AnimationTreePlayer","oneshot_node_set_filter_path")
    _icall_Unit_String_NodePath_Boolean( mb, this.ptr, id, path, enable)
  }

  open fun oneshotNodeStart(id: String) {
    val mb = getMethodBind("AnimationTreePlayer","oneshot_node_start")
    _icall_Unit_String( mb, this.ptr, id)
  }

  open fun oneshotNodeStop(id: String) {
    val mb = getMethodBind("AnimationTreePlayer","oneshot_node_stop")
    _icall_Unit_String( mb, this.ptr, id)
  }

  open fun recomputeCaches() {
    val mb = getMethodBind("AnimationTreePlayer","recompute_caches")
    _icall_Unit( mb, this.ptr)
  }

  open fun removeNode(id: String) {
    val mb = getMethodBind("AnimationTreePlayer","remove_node")
    _icall_Unit_String( mb, this.ptr, id)
  }

  open fun reset() {
    val mb = getMethodBind("AnimationTreePlayer","reset")
    _icall_Unit( mb, this.ptr)
  }

  open fun setActive(enabled: Boolean) {
    val mb = getMethodBind("AnimationTreePlayer","set_active")
    _icall_Unit_Boolean( mb, this.ptr, enabled)
  }

  open fun setAnimationProcessMode(mode: Long) {
    val mb = getMethodBind("AnimationTreePlayer","set_animation_process_mode")
    _icall_Unit_Long( mb, this.ptr, mode)
  }

  open fun setBasePath(path: NodePath) {
    val mb = getMethodBind("AnimationTreePlayer","set_base_path")
    _icall_Unit_NodePath( mb, this.ptr, path)
  }

  open fun setMasterPlayer(nodepath: NodePath) {
    val mb = getMethodBind("AnimationTreePlayer","set_master_player")
    _icall_Unit_NodePath( mb, this.ptr, nodepath)
  }

  open fun timescaleNodeGetScale(id: String): Double {
    val mb = getMethodBind("AnimationTreePlayer","timescale_node_get_scale")
    return _icall_Double_String( mb, this.ptr, id)
  }

  open fun timescaleNodeSetScale(id: String, scale: Double) {
    val mb = getMethodBind("AnimationTreePlayer","timescale_node_set_scale")
    _icall_Unit_String_Double( mb, this.ptr, id, scale)
  }

  open fun timeseekNodeSeek(id: String, seconds: Double) {
    val mb = getMethodBind("AnimationTreePlayer","timeseek_node_seek")
    _icall_Unit_String_Double( mb, this.ptr, id, seconds)
  }

  open fun transitionNodeDeleteInput(id: String, inputIdx: Long) {
    val mb = getMethodBind("AnimationTreePlayer","transition_node_delete_input")
    _icall_Unit_String_Long( mb, this.ptr, id, inputIdx)
  }

  open fun transitionNodeGetCurrent(id: String): Long {
    val mb = getMethodBind("AnimationTreePlayer","transition_node_get_current")
    return _icall_Long_String( mb, this.ptr, id)
  }

  open fun transitionNodeGetInputCount(id: String): Long {
    val mb = getMethodBind("AnimationTreePlayer","transition_node_get_input_count")
    return _icall_Long_String( mb, this.ptr, id)
  }

  open fun transitionNodeGetXfadeTime(id: String): Double {
    val mb = getMethodBind("AnimationTreePlayer","transition_node_get_xfade_time")
    return _icall_Double_String( mb, this.ptr, id)
  }

  open fun transitionNodeHasInputAutoAdvance(id: String, inputIdx: Long): Boolean {
    val mb = getMethodBind("AnimationTreePlayer","transition_node_has_input_auto_advance")
    return _icall_Boolean_String_Long( mb, this.ptr, id, inputIdx)
  }

  open fun transitionNodeSetCurrent(id: String, inputIdx: Long) {
    val mb = getMethodBind("AnimationTreePlayer","transition_node_set_current")
    _icall_Unit_String_Long( mb, this.ptr, id, inputIdx)
  }

  open fun transitionNodeSetInputAutoAdvance(
    id: String,
    inputIdx: Long,
    enable: Boolean
  ) {
    val mb = getMethodBind("AnimationTreePlayer","transition_node_set_input_auto_advance")
    _icall_Unit_String_Long_Boolean( mb, this.ptr, id, inputIdx, enable)
  }

  open fun transitionNodeSetInputCount(id: String, count: Long) {
    val mb = getMethodBind("AnimationTreePlayer","transition_node_set_input_count")
    _icall_Unit_String_Long( mb, this.ptr, id, count)
  }

  open fun transitionNodeSetXfadeTime(id: String, timeSec: Double) {
    val mb = getMethodBind("AnimationTreePlayer","transition_node_set_xfade_time")
    _icall_Unit_String_Double( mb, this.ptr, id, timeSec)
  }

  enum class AnimationProcessMode(
    id: Long
  ) {
    ANIMATION_PROCESS_PHYSICS(0),

    ANIMATION_PROCESS_IDLE(1);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class NodeType(
    id: Long
  ) {
    NODE_OUTPUT(0),

    NODE_ANIMATION(1),

    NODE_ONESHOT(2),

    NODE_MIX(3),

    NODE_BLEND2(4),

    NODE_BLEND3(5),

    NODE_BLEND4(6),

    NODE_TIMESCALE(7),

    NODE_TIMESEEK(8),

    NODE_TRANSITION(9);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val ANIMATION_PROCESS_IDLE: Long = 1

    final const val ANIMATION_PROCESS_PHYSICS: Long = 0

    final const val NODE_ANIMATION: Long = 1

    final const val NODE_BLEND2: Long = 4

    final const val NODE_BLEND3: Long = 5

    final const val NODE_BLEND4: Long = 6

    final const val NODE_MIX: Long = 3

    final const val NODE_ONESHOT: Long = 2

    final const val NODE_OUTPUT: Long = 0

    final const val NODE_TIMESCALE: Long = 7

    final const val NODE_TIMESEEK: Long = 8

    final const val NODE_TRANSITION: Long = 9
  }
}
