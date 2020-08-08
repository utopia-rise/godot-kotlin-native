package godot

import godot.core.Godot.shouldInitPtr
import godot.core.PoolStringArray
import godot.icalls._icall_Boolean
import godot.icalls._icall_PoolStringArray
import godot.icalls._icall_String
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_String
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.String

open class AnimationNodeStateMachinePlayback internal constructor(
  _ignore: Any?
) : Resource(_ignore) {
  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("AnimationNodeStateMachinePlayback",
            "AnimationNodeStateMachinePlayback")
        }

  }

  open fun getCurrentNode(): String {
    val mb = getMethodBind("AnimationNodeStateMachinePlayback","get_current_node")
    return _icall_String( mb, this.ptr)
  }

  open fun getTravelPath(): PoolStringArray {
    val mb = getMethodBind("AnimationNodeStateMachinePlayback","get_travel_path")
    return _icall_PoolStringArray( mb, this.ptr)
  }

  open fun isPlaying(): Boolean {
    val mb = getMethodBind("AnimationNodeStateMachinePlayback","is_playing")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun start(node: String) {
    val mb = getMethodBind("AnimationNodeStateMachinePlayback","start")
    _icall_Unit_String( mb, this.ptr, node)
  }

  open fun stop() {
    val mb = getMethodBind("AnimationNodeStateMachinePlayback","stop")
    _icall_Unit( mb, this.ptr)
  }

  open fun travel(toNode: String) {
    val mb = getMethodBind("AnimationNodeStateMachinePlayback","travel")
    _icall_Unit_String( mb, this.ptr, toNode)
  }

  companion object
}
