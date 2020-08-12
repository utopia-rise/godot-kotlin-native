// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.VisualShaderNodeTextureUniform
import godot.core.Godot.shouldInitPtr
import godot.icalls._icall_Long
import godot.icalls._icall_Unit_Long
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Any
import kotlin.Long

open class VisualShaderNodeTextureUniform internal constructor(
  _ignore: Any?
) : VisualShaderNodeUniform(_ignore) {
  open var colorDefault: Long
    get() {
      val mb = getMethodBind("VisualShaderNodeTextureUniform","get_color_default")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VisualShaderNodeTextureUniform","set_color_default")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var textureType: Long
    get() {
      val mb = getMethodBind("VisualShaderNodeTextureUniform","get_texture_type")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VisualShaderNodeTextureUniform","set_texture_type")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = invokeConstructor("VisualShaderNodeTextureUniform",
            "VisualShaderNodeTextureUniform")
        }

  }

  open fun getColorDefault(): VisualShaderNodeTextureUniform.ColorDefault {
    val mb = getMethodBind("VisualShaderNodeTextureUniform","get_color_default")
    return VisualShaderNodeTextureUniform.ColorDefault.from( _icall_Long( mb, this.ptr))
  }

  open fun getTextureType(): VisualShaderNodeTextureUniform.TextureType {
    val mb = getMethodBind("VisualShaderNodeTextureUniform","get_texture_type")
    return VisualShaderNodeTextureUniform.TextureType.from( _icall_Long( mb, this.ptr))
  }

  open fun setColorDefault(type: Long) {
    val mb = getMethodBind("VisualShaderNodeTextureUniform","set_color_default")
    _icall_Unit_Long( mb, this.ptr, type)
  }

  open fun setTextureType(type: Long) {
    val mb = getMethodBind("VisualShaderNodeTextureUniform","set_texture_type")
    _icall_Unit_Long( mb, this.ptr, type)
  }

  enum class TextureType(
    id: Long
  ) {
    TYPE_DATA(0),

    TYPE_COLOR(1),

    TYPE_NORMALMAP(2),

    TYPE_ANISO(3);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class ColorDefault(
    id: Long
  ) {
    COLOR_DEFAULT_WHITE(0),

    COLOR_DEFAULT_BLACK(1);

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
