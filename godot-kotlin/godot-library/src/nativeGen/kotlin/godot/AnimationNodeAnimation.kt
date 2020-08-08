package godot

import godot.core.Godot.shouldInitPtr
import godot.icalls._icall_String
import godot.icalls._icall_Unit_String
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.String

open class AnimationNodeAnimation internal constructor(
  _ignore: Any?
) : AnimationRootNode(_ignore) {
  open var animation: String
    get() {
      val mb = getMethodBind("AnimationNodeAnimation","get_animation")
      return _icall_String(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeAnimation","set_animation")
      _icall_Unit_String(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("AnimationNodeAnimation", "AnimationNodeAnimation")
        }

  }

  open fun getAnimation(): String {
    val mb = getMethodBind("AnimationNodeAnimation","get_animation")
    return _icall_String( mb, this.ptr)
  }

  open fun setAnimation(name: String) {
    val mb = getMethodBind("AnimationNodeAnimation","set_animation")
    _icall_Unit_String( mb, this.ptr, name)
  }

  companion object
}
