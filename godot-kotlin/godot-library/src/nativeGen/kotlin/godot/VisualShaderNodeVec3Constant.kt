package godot

import godot.core.Godot.shouldInitPtr
import godot.core.Vector3
import godot.icalls._icall_Unit_Vector3
import godot.icalls._icall_Vector3
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Unit

open class VisualShaderNodeVec3Constant internal constructor(
  _ignore: Any?
) : VisualShaderNode(_ignore) {
  open var constant: Vector3
    get() {
      val mb = getMethodBind("VisualShaderNodeVec3Constant","get_constant")
      return _icall_Vector3(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VisualShaderNodeVec3Constant","set_constant")
      _icall_Unit_Vector3(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("VisualShaderNodeVec3Constant",
            "VisualShaderNodeVec3Constant")
        }

  }

  open fun constant(schedule: Vector3.() -> Unit): Vector3 = constant.apply{
      schedule(this)
      constant = this
  }


  open fun getConstant(): Vector3 {
    val mb = getMethodBind("VisualShaderNodeVec3Constant","get_constant")
    return _icall_Vector3( mb, this.ptr)
  }

  open fun setConstant(value: Vector3) {
    val mb = getMethodBind("VisualShaderNodeVec3Constant","set_constant")
    _icall_Unit_Vector3( mb, this.ptr, value)
  }
}
