// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot.shouldInitPtr
import godot.icalls._icall_Boolean_Long
import godot.icalls._icall_Unit_Long_Boolean
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Long

open class VisibilityEnabler2D internal constructor(
  _ignore: Any?
) : VisibilityNotifier2D(_ignore) {
  open var freezeBodies: Boolean
    get() {
      val mb = getMethodBind("VisibilityEnabler2D","is_enabler_enabled")
      return _icall_Boolean_Long(mb, this.ptr, 1)
    }
    set(value) {
      val mb = getMethodBind("VisibilityEnabler2D","set_enabler")
      _icall_Unit_Long_Boolean(mb, this.ptr, 1, value)
    }

  open var pauseAnimatedSprites: Boolean
    get() {
      val mb = getMethodBind("VisibilityEnabler2D","is_enabler_enabled")
      return _icall_Boolean_Long(mb, this.ptr, 5)
    }
    set(value) {
      val mb = getMethodBind("VisibilityEnabler2D","set_enabler")
      _icall_Unit_Long_Boolean(mb, this.ptr, 5, value)
    }

  open var pauseAnimations: Boolean
    get() {
      val mb = getMethodBind("VisibilityEnabler2D","is_enabler_enabled")
      return _icall_Boolean_Long(mb, this.ptr, 0)
    }
    set(value) {
      val mb = getMethodBind("VisibilityEnabler2D","set_enabler")
      _icall_Unit_Long_Boolean(mb, this.ptr, 0, value)
    }

  open var pauseParticles: Boolean
    get() {
      val mb = getMethodBind("VisibilityEnabler2D","is_enabler_enabled")
      return _icall_Boolean_Long(mb, this.ptr, 2)
    }
    set(value) {
      val mb = getMethodBind("VisibilityEnabler2D","set_enabler")
      _icall_Unit_Long_Boolean(mb, this.ptr, 2, value)
    }

  open var physicsProcessParent: Boolean
    get() {
      val mb = getMethodBind("VisibilityEnabler2D","is_enabler_enabled")
      return _icall_Boolean_Long(mb, this.ptr, 4)
    }
    set(value) {
      val mb = getMethodBind("VisibilityEnabler2D","set_enabler")
      _icall_Unit_Long_Boolean(mb, this.ptr, 4, value)
    }

  open var processParent: Boolean
    get() {
      val mb = getMethodBind("VisibilityEnabler2D","is_enabler_enabled")
      return _icall_Boolean_Long(mb, this.ptr, 3)
    }
    set(value) {
      val mb = getMethodBind("VisibilityEnabler2D","set_enabler")
      _icall_Unit_Long_Boolean(mb, this.ptr, 3, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("VisibilityEnabler2D", "VisibilityEnabler2D")
        }

  }

  open fun _nodeRemoved(arg0: Node) {
  }

  open fun isEnablerEnabled(enabler: Long): Boolean {
    val mb = getMethodBind("VisibilityEnabler2D","is_enabler_enabled")
    return _icall_Boolean_Long( mb, this.ptr, enabler)
  }

  open fun setEnabler(enabler: Long, enabled: Boolean) {
    val mb = getMethodBind("VisibilityEnabler2D","set_enabler")
    _icall_Unit_Long_Boolean( mb, this.ptr, enabler, enabled)
  }

  enum class Enabler(
    id: Long
  ) {
    ENABLER_PAUSE_ANIMATIONS(0),

    ENABLER_FREEZE_BODIES(1),

    ENABLER_PAUSE_PARTICLES(2),

    ENABLER_PARENT_PROCESS(3),

    ENABLER_PARENT_PHYSICS_PROCESS(4),

    ENABLER_PAUSE_ANIMATED_SPRITES(5),

    ENABLER_MAX(6);

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
