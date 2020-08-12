// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.icalls._icall_Boolean
import godot.icalls._icall_Unit_Boolean
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Boolean
import kotlinx.cinterop.COpaquePointer

open class AnimationNodeAdd2 : AnimationNode() {
  open var sync: Boolean
    get() {
      val mb = getMethodBind("AnimationNodeAdd2","is_using_sync")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeAdd2","set_use_sync")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  override fun __new(): COpaquePointer = invokeConstructor("AnimationNodeAdd2", "AnimationNodeAdd2")

  open fun isUsingSync(): Boolean {
    val mb = getMethodBind("AnimationNodeAdd2","is_using_sync")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun setUseSync(enable: Boolean) {
    val mb = getMethodBind("AnimationNodeAdd2","set_use_sync")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }
}
