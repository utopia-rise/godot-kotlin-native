// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.icalls._icall_String
import godot.icalls._icall_Unit_String
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.String

open class VisualShaderNodeUniform internal constructor(
  _ignore: Any?
) : VisualShaderNode(_ignore) {
  open var uniformName: String
    get() {
      val mb = getMethodBind("VisualShaderNodeUniform","get_uniform_name")
      return _icall_String(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VisualShaderNodeUniform","set_uniform_name")
      _icall_Unit_String(mb, this.ptr, value)
    }

  internal constructor() : this(null)

  open fun getUniformName(): String {
    val mb = getMethodBind("VisualShaderNodeUniform","get_uniform_name")
    return _icall_String( mb, this.ptr)
  }

  open fun setUniformName(name: String) {
    val mb = getMethodBind("VisualShaderNodeUniform","set_uniform_name")
    _icall_Unit_String( mb, this.ptr, name)
  }
}
