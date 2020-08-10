// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.Image
import godot.ImageTexture
import godot.core.Godot.shouldInitPtr
import godot.core.GodotError
import godot.core.RID
import godot.core.Vector2
import godot.icalls._icall_Double
import godot.icalls._icall_Long
import godot.icalls._icall_Long_String
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Long_Long_Long_Long
import godot.icalls._icall_Unit_Object
import godot.icalls._icall_Unit_Object_Long
import godot.icalls._icall_Unit_Vector2
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Double
import kotlin.Long
import kotlin.String

open class ImageTexture internal constructor(
  _ignore: Any?
) : Texture(_ignore) {
  open var lossyQuality: Double
    get() {
      val mb = getMethodBind("ImageTexture","get_lossy_storage_quality")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ImageTexture","set_lossy_storage_quality")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var storage: Long
    get() {
      val mb = getMethodBind("ImageTexture","get_storage")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ImageTexture","set_storage")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("ImageTexture", "ImageTexture")
        }

  }

  open fun _reload_hook(rid: RID) {
  }

  open fun create(
    width: Long,
    height: Long,
    format: Long,
    flags: Long = 7
  ) {
    val mb = getMethodBind("ImageTexture","create")
    _icall_Unit_Long_Long_Long_Long( mb, this.ptr, width, height, format, flags)
  }

  open fun createFromImage(image: Image, flags: Long = 7) {
    val mb = getMethodBind("ImageTexture","create_from_image")
    _icall_Unit_Object_Long( mb, this.ptr, image, flags)
  }

  open fun getFormat(): Image.Format {
    val mb = getMethodBind("ImageTexture","get_format")
    return Image.Format.from( _icall_Long( mb, this.ptr))
  }

  open fun getLossyStorageQuality(): Double {
    val mb = getMethodBind("ImageTexture","get_lossy_storage_quality")
    return _icall_Double( mb, this.ptr)
  }

  open fun getStorage(): ImageTexture.Storage {
    val mb = getMethodBind("ImageTexture","get_storage")
    return ImageTexture.Storage.from( _icall_Long( mb, this.ptr))
  }

  open fun load(path: String): GodotError {
    val mb = getMethodBind("ImageTexture","load")
    return GodotError.byValue( _icall_Long_String( mb, this.ptr, path).toUInt())
  }

  open fun setData(image: Image) {
    val mb = getMethodBind("ImageTexture","set_data")
    _icall_Unit_Object( mb, this.ptr, image)
  }

  open fun setLossyStorageQuality(quality: Double) {
    val mb = getMethodBind("ImageTexture","set_lossy_storage_quality")
    _icall_Unit_Double( mb, this.ptr, quality)
  }

  open fun setSizeOverride(size: Vector2) {
    val mb = getMethodBind("ImageTexture","set_size_override")
    _icall_Unit_Vector2( mb, this.ptr, size)
  }

  open fun setStorage(mode: Long) {
    val mb = getMethodBind("ImageTexture","set_storage")
    _icall_Unit_Long( mb, this.ptr, mode)
  }

  enum class Storage(
    id: Long
  ) {
    STORAGE_RAW(0),

    STORAGE_COMPRESS_LOSSY(1),

    STORAGE_COMPRESS_LOSSLESS(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val STORAGE_COMPRESS_LOSSLESS: Long = 2

    final const val STORAGE_COMPRESS_LOSSY: Long = 1

    final const val STORAGE_RAW: Long = 0
  }
}
