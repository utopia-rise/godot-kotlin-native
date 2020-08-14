// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.AABB
import godot.core.Signal0
import godot.core.Signal1
import godot.core.signal
import godot.icalls._icall_AABB
import godot.icalls._icall_Boolean
import godot.icalls._icall_Unit_AABB
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Boolean
import kotlin.Unit
import kotlinx.cinterop.COpaquePointer

open class VisibilityNotifier : Spatial() {
  val cameraEntered: Signal1<Camera> by signal("camera")

  val cameraExited: Signal1<Camera> by signal("camera")

  val screenEntered: Signal0 by signal()

  val screenExited: Signal0 by signal()

  open var aabb: AABB
    get() {
      val mb = getMethodBind("VisibilityNotifier","get_aabb")
      return _icall_AABB(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VisibilityNotifier","set_aabb")
      _icall_Unit_AABB(mb, this.ptr, value)
    }

  override fun __new(): COpaquePointer = invokeConstructor("VisibilityNotifier",
      "VisibilityNotifier")

  open fun aabb(schedule: AABB.() -> Unit): AABB = aabb.apply{
      schedule(this)
      aabb = this
  }


  open fun getAabb(): AABB {
    val mb = getMethodBind("VisibilityNotifier","get_aabb")
    return _icall_AABB( mb, this.ptr)
  }

  open fun isOnScreen(): Boolean {
    val mb = getMethodBind("VisibilityNotifier","is_on_screen")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun setAabb(rect: AABB) {
    val mb = getMethodBind("VisibilityNotifier","set_aabb")
    _icall_Unit_AABB( mb, this.ptr, rect)
  }
}
