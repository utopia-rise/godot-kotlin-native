package godot

import godot.core.Godot.shouldInitPtr
import godot.core.NodePath
import godot.icalls._icall_Boolean
import godot.icalls._icall_Double
import godot.icalls._icall_NodePath
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_NodePath
import godot.icalls._icall_Unit_Object
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Double

open class InterpolatedCamera internal constructor(
  _ignore: Any?
) : Camera(_ignore) {
  open var enabled: Boolean
    get() {
      val mb = getMethodBind("InterpolatedCamera","is_interpolation_enabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("InterpolatedCamera","set_interpolation_enabled")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var speed: Double
    get() {
      val mb = getMethodBind("InterpolatedCamera","get_speed")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("InterpolatedCamera","set_speed")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var target: NodePath
    get() {
      val mb = getMethodBind("InterpolatedCamera","get_target_path")
      return _icall_NodePath(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("InterpolatedCamera","set_target_path")
      _icall_Unit_NodePath(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("InterpolatedCamera", "InterpolatedCamera")
        }

  }

  open fun getSpeed(): Double {
    val mb = getMethodBind("InterpolatedCamera","get_speed")
    return _icall_Double( mb, this.ptr)
  }

  open fun getTargetPath(): NodePath {
    val mb = getMethodBind("InterpolatedCamera","get_target_path")
    return _icall_NodePath( mb, this.ptr)
  }

  open fun isInterpolationEnabled(): Boolean {
    val mb = getMethodBind("InterpolatedCamera","is_interpolation_enabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun setInterpolationEnabled(targetPath: Boolean) {
    val mb = getMethodBind("InterpolatedCamera","set_interpolation_enabled")
    _icall_Unit_Boolean( mb, this.ptr, targetPath)
  }

  open fun setSpeed(speed: Double) {
    val mb = getMethodBind("InterpolatedCamera","set_speed")
    _icall_Unit_Double( mb, this.ptr, speed)
  }

  open fun setTarget(target: Object) {
    val mb = getMethodBind("InterpolatedCamera","set_target")
    _icall_Unit_Object( mb, this.ptr, target)
  }

  open fun setTargetPath(targetPath: NodePath) {
    val mb = getMethodBind("InterpolatedCamera","set_target_path")
    _icall_Unit_NodePath( mb, this.ptr, targetPath)
  }

  companion object
}
