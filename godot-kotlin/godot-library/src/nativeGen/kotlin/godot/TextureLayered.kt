// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.Image
import godot.core.Dictionary
import godot.icalls._icall_Image_Long
import godot.icalls._icall_Long
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Long_Long_Long_Long_Long
import godot.icalls._icall_Unit_Object_Long
import godot.icalls._icall_Unit_Object_Long_Long_Long_Long
import godot.internal.utils.getMethodBind
import kotlin.Long
import kotlin.NotImplementedError

open class TextureLayered internal constructor() : Resource() {
  open var flags: Long
    get() {
      val mb = getMethodBind("TextureLayered","get_flags")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("TextureLayered","set_flags")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open fun _getData(): Dictionary {
    throw NotImplementedError("_get_data is not implemented for TextureLayered")
  }

  open fun _setData(data: Dictionary) {
  }

  open fun create(
    width: Long,
    height: Long,
    depth: Long,
    format: Long,
    flags: Long = 4
  ) {
    val mb = getMethodBind("TextureLayered","create")
    _icall_Unit_Long_Long_Long_Long_Long( mb, this.ptr, width, height, depth, format, flags)
  }

  open fun getDepth(): Long {
    val mb = getMethodBind("TextureLayered","get_depth")
    return _icall_Long( mb, this.ptr)
  }

  open fun getFlags(): Long {
    val mb = getMethodBind("TextureLayered","get_flags")
    return _icall_Long( mb, this.ptr)
  }

  open fun getFormat(): Image.Format {
    val mb = getMethodBind("TextureLayered","get_format")
    return Image.Format.from( _icall_Long( mb, this.ptr))
  }

  open fun getHeight(): Long {
    val mb = getMethodBind("TextureLayered","get_height")
    return _icall_Long( mb, this.ptr)
  }

  open fun getLayerData(layer: Long): Image {
    val mb = getMethodBind("TextureLayered","get_layer_data")
    return _icall_Image_Long( mb, this.ptr, layer)
  }

  open fun getWidth(): Long {
    val mb = getMethodBind("TextureLayered","get_width")
    return _icall_Long( mb, this.ptr)
  }

  open fun setDataPartial(
    image: Image,
    xOffset: Long,
    yOffset: Long,
    layer: Long,
    mipmap: Long = 0
  ) {
    val mb = getMethodBind("TextureLayered","set_data_partial")
    _icall_Unit_Object_Long_Long_Long_Long( mb, this.ptr, image, xOffset, yOffset, layer, mipmap)
  }

  open fun setFlags(flags: Long) {
    val mb = getMethodBind("TextureLayered","set_flags")
    _icall_Unit_Long( mb, this.ptr, flags)
  }

  open fun setLayerData(image: Image, layer: Long) {
    val mb = getMethodBind("TextureLayered","set_layer_data")
    _icall_Unit_Object_Long( mb, this.ptr, image, layer)
  }

  enum class Flags(
    id: Long
  ) {
    FLAG_MIPMAPS(1),

    FLAG_REPEAT(2),

    FLAG_FILTER(4),

    FLAGS_DEFAULT(4);

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
