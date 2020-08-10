// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.Shader
import godot.core.Godot.shouldInitPtr
import godot.icalls._icall_Boolean_String
import godot.icalls._icall_Long
import godot.icalls._icall_String
import godot.icalls._icall_Texture_String
import godot.icalls._icall_Unit_String
import godot.icalls._icall_Unit_String_Object
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.String

open class Shader internal constructor(
  _ignore: Any?
) : Resource(_ignore) {
  open var code: String
    get() {
      val mb = getMethodBind("Shader","get_code")
      return _icall_String(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Shader","set_code")
      _icall_Unit_String(mb, this.ptr, value)
    }

  open var customDefines: String
    get() {
      val mb = getMethodBind("Shader","get_custom_defines")
      return _icall_String(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Shader","set_custom_defines")
      _icall_Unit_String(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("Shader", "Shader")
        }

  }

  open fun getCode(): String {
    val mb = getMethodBind("Shader","get_code")
    return _icall_String( mb, this.ptr)
  }

  open fun getCustomDefines(): String {
    val mb = getMethodBind("Shader","get_custom_defines")
    return _icall_String( mb, this.ptr)
  }

  open fun getDefaultTextureParam(param: String): Texture {
    val mb = getMethodBind("Shader","get_default_texture_param")
    return _icall_Texture_String( mb, this.ptr, param)
  }

  open fun getMode(): Shader.Mode {
    val mb = getMethodBind("Shader","get_mode")
    return Shader.Mode.from( _icall_Long( mb, this.ptr))
  }

  open fun hasParam(name: String): Boolean {
    val mb = getMethodBind("Shader","has_param")
    return _icall_Boolean_String( mb, this.ptr, name)
  }

  open fun setCode(code: String) {
    val mb = getMethodBind("Shader","set_code")
    _icall_Unit_String( mb, this.ptr, code)
  }

  open fun setCustomDefines(customDefines: String) {
    val mb = getMethodBind("Shader","set_custom_defines")
    _icall_Unit_String( mb, this.ptr, customDefines)
  }

  open fun setDefaultTextureParam(param: String, texture: Texture) {
    val mb = getMethodBind("Shader","set_default_texture_param")
    _icall_Unit_String_Object( mb, this.ptr, param, texture)
  }

  enum class Mode(
    id: Long
  ) {
    MODE_SPATIAL(0),

    MODE_CANVAS_ITEM(1),

    MODE_PARTICLES(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val MODE_CANVAS_ITEM: Long = 1

    final const val MODE_PARTICLES: Long = 2

    final const val MODE_SPATIAL: Long = 0
  }
}
