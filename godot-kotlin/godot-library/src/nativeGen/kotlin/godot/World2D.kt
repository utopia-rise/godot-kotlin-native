// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.RID
import godot.icalls._icall_Physics2DDirectSpaceState
import godot.icalls._icall_RID
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlinx.cinterop.COpaquePointer

open class World2D : Resource() {
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

  override fun __new(): COpaquePointer = invokeConstructor("World2D", "World2D")

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
