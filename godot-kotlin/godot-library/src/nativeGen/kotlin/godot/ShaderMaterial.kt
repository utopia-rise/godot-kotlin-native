// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot.shouldInitPtr
import godot.core.Variant
import godot.icalls._icall_Boolean_String
import godot.icalls._icall_Shader
import godot.icalls._icall_Unit_Object
import godot.icalls._icall_Unit_String_Variant
import godot.icalls._icall_Variant_String
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Any
import kotlin.Boolean
import kotlin.String

open class ShaderMaterial internal constructor(
  _ignore: Any?
) : Material(_ignore) {
  open var shader: Shader
    get() {
      val mb = getMethodBind("ShaderMaterial","get_shader")
      return _icall_Shader(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ShaderMaterial","set_shader")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = invokeConstructor("ShaderMaterial", "ShaderMaterial")
        }

  }

  open fun _shaderChanged() {
  }

  open fun getShader(): Shader {
    val mb = getMethodBind("ShaderMaterial","get_shader")
    return _icall_Shader( mb, this.ptr)
  }

  open fun getShaderParam(param: String): Variant {
    val mb = getMethodBind("ShaderMaterial","get_shader_param")
    return _icall_Variant_String( mb, this.ptr, param)
  }

  open fun propertyCanRevert(name: String): Boolean {
    val mb = getMethodBind("ShaderMaterial","property_can_revert")
    return _icall_Boolean_String( mb, this.ptr, name)
  }

  open fun propertyGetRevert(name: String): Variant {
    val mb = getMethodBind("ShaderMaterial","property_get_revert")
    return _icall_Variant_String( mb, this.ptr, name)
  }

  open fun setShader(shader: Shader) {
    val mb = getMethodBind("ShaderMaterial","set_shader")
    _icall_Unit_Object( mb, this.ptr, shader)
  }

  open fun setShaderParam(param: String, value: Variant) {
    val mb = getMethodBind("ShaderMaterial","set_shader_param")
    _icall_Unit_String_Variant( mb, this.ptr, param, value)
  }
}
