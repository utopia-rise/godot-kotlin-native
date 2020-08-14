// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.icalls._icall_String
import godot.icalls._icall_Unit_String
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.String
import kotlinx.cinterop.COpaquePointer

open class AnimationNodeAnimation : AnimationRootNode() {
  open var animation: String
    get() {
      val mb = getMethodBind("AnimationNodeAnimation","get_animation")
      return _icall_String(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeAnimation","set_animation")
      _icall_Unit_String(mb, this.ptr, value)
    }

  override fun __new(): COpaquePointer = invokeConstructor("AnimationNodeAnimation",
      "AnimationNodeAnimation")

  open fun getAnimation(): String {
    val mb = getMethodBind("AnimationNodeAnimation","get_animation")
    return _icall_String( mb, this.ptr)
  }

  open fun setAnimation(name: String) {
    val mb = getMethodBind("AnimationNodeAnimation","set_animation")
    _icall_Unit_String( mb, this.ptr, name)
  }
}
