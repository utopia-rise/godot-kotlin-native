// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.VisualShaderNodeTexture
import godot.core.Godot.shouldInitPtr
import godot.icalls._icall_Long
import godot.icalls._icall_Texture
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Object
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Long

open class VisualShaderNodeTexture internal constructor(
  _ignore: Any?
) : VisualShaderNode(_ignore) {
  open var source: Long
    get() {
      val mb = getMethodBind("VisualShaderNodeTexture","get_source")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VisualShaderNodeTexture","set_source")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var texture: Texture
    get() {
      val mb = getMethodBind("VisualShaderNodeTexture","get_texture")
      return _icall_Texture(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VisualShaderNodeTexture","set_texture")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  open var textureType: Long
    get() {
      val mb = getMethodBind("VisualShaderNodeTexture","get_texture_type")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VisualShaderNodeTexture","set_texture_type")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("VisualShaderNodeTexture", "VisualShaderNodeTexture")
        }

  }

  open fun getSource(): VisualShaderNodeTexture.Source {
    val mb = getMethodBind("VisualShaderNodeTexture","get_source")
    return VisualShaderNodeTexture.Source.from( _icall_Long( mb, this.ptr))
  }

  open fun getTexture(): Texture {
    val mb = getMethodBind("VisualShaderNodeTexture","get_texture")
    return _icall_Texture( mb, this.ptr)
  }

  open fun getTextureType(): VisualShaderNodeTexture.TextureType {
    val mb = getMethodBind("VisualShaderNodeTexture","get_texture_type")
    return VisualShaderNodeTexture.TextureType.from( _icall_Long( mb, this.ptr))
  }

  open fun setSource(value: Long) {
    val mb = getMethodBind("VisualShaderNodeTexture","set_source")
    _icall_Unit_Long( mb, this.ptr, value)
  }

  open fun setTexture(value: Texture) {
    val mb = getMethodBind("VisualShaderNodeTexture","set_texture")
    _icall_Unit_Object( mb, this.ptr, value)
  }

  open fun setTextureType(value: Long) {
    val mb = getMethodBind("VisualShaderNodeTexture","set_texture_type")
    _icall_Unit_Long( mb, this.ptr, value)
  }

  enum class TextureType(
    id: Long
  ) {
    TYPE_DATA(0),

    TYPE_COLOR(1),

    TYPE_NORMALMAP(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class Source(
    id: Long
  ) {
    SOURCE_TEXTURE(0),

    SOURCE_SCREEN(1),

    SOURCE_2D_TEXTURE(2),

    SOURCE_2D_NORMAL(3),

    SOURCE_DEPTH(4),

    SOURCE_PORT(5);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val SOURCE_2D_NORMAL: Long = 3

    final const val SOURCE_2D_TEXTURE: Long = 2

    final const val SOURCE_DEPTH: Long = 4

    final const val SOURCE_PORT: Long = 5

    final const val SOURCE_SCREEN: Long = 1

    final const val SOURCE_TEXTURE: Long = 0

    final const val TYPE_COLOR: Long = 1

    final const val TYPE_DATA: Long = 0

    final const val TYPE_NORMALMAP: Long = 2
  }
}
