// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.icalls._icall_Boolean_Long
import godot.icalls._icall_Unit_Long_Boolean
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Boolean
import kotlin.Long
import kotlinx.cinterop.COpaquePointer

open class VisibilityEnabler : VisibilityNotifier() {
  open var freezeBodies: Boolean
    get() {
      val mb = getMethodBind("VisibilityEnabler","is_enabler_enabled")
      return _icall_Boolean_Long(mb, this.ptr, 1)
    }
    set(value) {
      val mb = getMethodBind("VisibilityEnabler","set_enabler")
      _icall_Unit_Long_Boolean(mb, this.ptr, 1, value)
    }

  open var pauseAnimations: Boolean
    get() {
      val mb = getMethodBind("VisibilityEnabler","is_enabler_enabled")
      return _icall_Boolean_Long(mb, this.ptr, 0)
    }
    set(value) {
      val mb = getMethodBind("VisibilityEnabler","set_enabler")
      _icall_Unit_Long_Boolean(mb, this.ptr, 0, value)
    }

  override fun __new(): COpaquePointer = invokeConstructor("VisibilityEnabler", "VisibilityEnabler")

  open fun _nodeRemoved(arg0: Node) {
  }

  open fun isEnablerEnabled(enabler: Long): Boolean {
    val mb = getMethodBind("VisibilityEnabler","is_enabler_enabled")
    return _icall_Boolean_Long( mb, this.ptr, enabler)
  }

  open fun setEnabler(enabler: Long, enabled: Boolean) {
    val mb = getMethodBind("VisibilityEnabler","set_enabler")
    _icall_Unit_Long_Boolean( mb, this.ptr, enabler, enabled)
  }

  enum class Enabler(
    id: Long
  ) {
    ENABLER_PAUSE_ANIMATIONS(0),

    ENABLER_FREEZE_BODIES(1),

    ENABLER_MAX(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object
}
