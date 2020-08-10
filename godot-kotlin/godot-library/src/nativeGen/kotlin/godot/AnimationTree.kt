// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.AnimationTree
import godot.core.Godot.shouldInitPtr
import godot.core.NodePath
import godot.core.Transform
import godot.icalls._icall_AnimationNode
import godot.icalls._icall_Boolean
import godot.icalls._icall_Long
import godot.icalls._icall_NodePath
import godot.icalls._icall_Transform
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_NodePath
import godot.icalls._icall_Unit_Object
import godot.icalls._icall_Unit_String_String
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.String

open class AnimationTree internal constructor(
  _ignore: Any?
) : Node(_ignore) {
  open var active: Boolean
    get() {
      val mb = getMethodBind("AnimationTree","is_active")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AnimationTree","set_active")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var animPlayer: NodePath
    get() {
      val mb = getMethodBind("AnimationTree","get_animation_player")
      return _icall_NodePath(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AnimationTree","set_animation_player")
      _icall_Unit_NodePath(mb, this.ptr, value)
    }

  open var processMode: Long
    get() {
      val mb = getMethodBind("AnimationTree","get_process_mode")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AnimationTree","set_process_mode")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var rootMotionTrack: NodePath
    get() {
      val mb = getMethodBind("AnimationTree","get_root_motion_track")
      return _icall_NodePath(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AnimationTree","set_root_motion_track")
      _icall_Unit_NodePath(mb, this.ptr, value)
    }

  open var treeRoot: AnimationNode
    get() {
      val mb = getMethodBind("AnimationTree","get_tree_root")
      return _icall_AnimationNode(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AnimationTree","set_tree_root")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("AnimationTree", "AnimationTree")
        }

  }

  open fun _clear_caches() {
  }

  open fun _node_removed(arg0: Node) {
  }

  open fun _tree_changed() {
  }

  open fun _update_properties() {
  }

  open fun advance(delta: Double) {
    val mb = getMethodBind("AnimationTree","advance")
    _icall_Unit_Double( mb, this.ptr, delta)
  }

  open fun getAnimationPlayer(): NodePath {
    val mb = getMethodBind("AnimationTree","get_animation_player")
    return _icall_NodePath( mb, this.ptr)
  }

  open fun getProcessMode(): AnimationTree.AnimationProcessMode {
    val mb = getMethodBind("AnimationTree","get_process_mode")
    return AnimationTree.AnimationProcessMode.from( _icall_Long( mb, this.ptr))
  }

  open fun getRootMotionTrack(): NodePath {
    val mb = getMethodBind("AnimationTree","get_root_motion_track")
    return _icall_NodePath( mb, this.ptr)
  }

  open fun getRootMotionTransform(): Transform {
    val mb = getMethodBind("AnimationTree","get_root_motion_transform")
    return _icall_Transform( mb, this.ptr)
  }

  open fun getTreeRoot(): AnimationNode {
    val mb = getMethodBind("AnimationTree","get_tree_root")
    return _icall_AnimationNode( mb, this.ptr)
  }

  open fun isActive(): Boolean {
    val mb = getMethodBind("AnimationTree","is_active")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun renameParameter(oldName: String, newName: String) {
    val mb = getMethodBind("AnimationTree","rename_parameter")
    _icall_Unit_String_String( mb, this.ptr, oldName, newName)
  }

  open fun setActive(active: Boolean) {
    val mb = getMethodBind("AnimationTree","set_active")
    _icall_Unit_Boolean( mb, this.ptr, active)
  }

  open fun setAnimationPlayer(root: NodePath) {
    val mb = getMethodBind("AnimationTree","set_animation_player")
    _icall_Unit_NodePath( mb, this.ptr, root)
  }

  open fun setProcessMode(mode: Long) {
    val mb = getMethodBind("AnimationTree","set_process_mode")
    _icall_Unit_Long( mb, this.ptr, mode)
  }

  open fun setRootMotionTrack(path: NodePath) {
    val mb = getMethodBind("AnimationTree","set_root_motion_track")
    _icall_Unit_NodePath( mb, this.ptr, path)
  }

  open fun setTreeRoot(root: AnimationNode) {
    val mb = getMethodBind("AnimationTree","set_tree_root")
    _icall_Unit_Object( mb, this.ptr, root)
  }

  enum class AnimationProcessMode(
    id: Long
  ) {
    ANIMATION_PROCESS_PHYSICS(0),

    ANIMATION_PROCESS_IDLE(1),

    ANIMATION_PROCESS_MANUAL(2);

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

    final const val ANIMATION_PROCESS_MANUAL: Long = 2

    final const val ANIMATION_PROCESS_PHYSICS: Long = 0
  }
}
