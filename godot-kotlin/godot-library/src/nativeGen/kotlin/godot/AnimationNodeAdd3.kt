// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot.shouldInitPtr
import godot.icalls._icall_Boolean
import godot.icalls._icall_Unit_Boolean
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean

open class AnimationNodeAdd3 internal constructor(
  _ignore: Any?
) : AnimationNode(_ignore) {
  open var sync: Boolean
    get() {
      val mb = getMethodBind("AnimationNodeAdd3","is_using_sync")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeAdd3","set_use_sync")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("AnimationNodeAdd3", "AnimationNodeAdd3")
        }

  }

  open fun isUsingSync(): Boolean {
    val mb = getMethodBind("AnimationNodeAdd3","is_using_sync")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun setUseSync(enable: Boolean) {
    val mb = getMethodBind("AnimationNodeAdd3","set_use_sync")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }
}
