package godot

import godot.core.Godot.shouldInitPtr
import godot.core.RID
import godot.icalls._icall_Physics2DDirectSpaceState
import godot.icalls._icall_RID
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any

open class World2D internal constructor(
  _ignore: Any?
) : Resource(_ignore) {
  open val canvas: RID
    get() {
      val mb = getMethodBind("World2D","get_canvas")
      return _icall_RID(mb, this.ptr)
    }

  open val directSpaceState: Physics2DDirectSpaceState
    get() {
      val mb = getMethodBind("World2D","get_direct_space_state")
      return _icall_Physics2DDirectSpaceState(mb, this.ptr)
    }

  open val space: RID
    get() {
      val mb = getMethodBind("World2D","get_space")
      return _icall_RID(mb, this.ptr)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("World2D", "World2D")
        }

  }

  open fun getCanvas(): RID {
    val mb = getMethodBind("World2D","get_canvas")
    return _icall_RID( mb, this.ptr)
  }

  open fun getDirectSpaceState(): Physics2DDirectSpaceState {
    val mb = getMethodBind("World2D","get_direct_space_state")
    return _icall_Physics2DDirectSpaceState( mb, this.ptr)
  }

  open fun getSpace(): RID {
    val mb = getMethodBind("World2D","get_space")
    return _icall_RID( mb, this.ptr)
  }
}
