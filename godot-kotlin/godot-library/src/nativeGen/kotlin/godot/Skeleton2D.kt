package godot

import godot.core.Godot.shouldInitPtr
import godot.core.RID
import godot.core.Signal0
import godot.core.signal
import godot.icalls._icall_Bone2D_Long
import godot.icalls._icall_Long
import godot.icalls._icall_RID
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Long

open class Skeleton2D internal constructor(
  _ignore: Any?
) : Node2D(_ignore) {
  val boneSetupChanged: Signal0 by signal()

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("Skeleton2D", "Skeleton2D")
        }

  }

  open fun _update_bone_setup() {
  }

  open fun _update_transform() {
  }

  open fun getBone(idx: Long): Bone2D {
    val mb = getMethodBind("Skeleton2D","get_bone")
    return _icall_Bone2D_Long( mb, this.ptr, idx)
  }

  open fun getBoneCount(): Long {
    val mb = getMethodBind("Skeleton2D","get_bone_count")
    return _icall_Long( mb, this.ptr)
  }

  open fun getSkeleton(): RID {
    val mb = getMethodBind("Skeleton2D","get_skeleton")
    return _icall_RID( mb, this.ptr)
  }
}
