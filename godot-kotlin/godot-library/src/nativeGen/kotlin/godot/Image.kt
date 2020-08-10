// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.Image
import godot.core.Color
import godot.core.Dictionary
import godot.core.Godot.shouldInitPtr
import godot.core.GodotError
import godot.core.PoolByteArray
import godot.core.Rect2
import godot.core.Vector2
import godot.icalls._icall_Boolean
import godot.icalls._icall_Color_Long_Long
import godot.icalls._icall_Color_Vector2
import godot.icalls._icall_Image
import godot.icalls._icall_Image_Rect2
import godot.icalls._icall_Long
import godot.icalls._icall_Long_Boolean
import godot.icalls._icall_Long_Long
import godot.icalls._icall_Long_Long_Long_Double
import godot.icalls._icall_Long_PoolByteArray
import godot.icalls._icall_Long_String
import godot.icalls._icall_Long_String_Boolean
import godot.icalls._icall_PoolByteArray
import godot.icalls._icall_Rect2
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Color
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Long_Long
import godot.icalls._icall_Unit_Long_Long_Boolean_Long
import godot.icalls._icall_Unit_Long_Long_Boolean_Long_PoolByteArray
import godot.icalls._icall_Unit_Long_Long_Color
import godot.icalls._icall_Unit_Long_Long_Long
import godot.icalls._icall_Unit_Object
import godot.icalls._icall_Unit_Object_Object_Rect2_Vector2
import godot.icalls._icall_Unit_Object_Rect2_Vector2
import godot.icalls._icall_Unit_Vector2_Color
import godot.icalls._icall_Vector2
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String

open class Image internal constructor(
  _ignore: Any?
) : Resource(_ignore) {
  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("Image", "Image")
        }

  }

  open fun _get_data(): Dictionary {
    throw NotImplementedError("_get_data is not implemented for Image")
  }

  open fun _set_data(data: Dictionary) {
  }

  open fun blendRect(
    src: Image,
    srcRect: Rect2,
    dst: Vector2
  ) {
    val mb = getMethodBind("Image","blend_rect")
    _icall_Unit_Object_Rect2_Vector2( mb, this.ptr, src, srcRect, dst)
  }

  open fun blendRectMask(
    src: Image,
    mask: Image,
    srcRect: Rect2,
    dst: Vector2
  ) {
    val mb = getMethodBind("Image","blend_rect_mask")
    _icall_Unit_Object_Object_Rect2_Vector2( mb, this.ptr, src, mask, srcRect, dst)
  }

  open fun blitRect(
    src: Image,
    srcRect: Rect2,
    dst: Vector2
  ) {
    val mb = getMethodBind("Image","blit_rect")
    _icall_Unit_Object_Rect2_Vector2( mb, this.ptr, src, srcRect, dst)
  }

  open fun blitRectMask(
    src: Image,
    mask: Image,
    srcRect: Rect2,
    dst: Vector2
  ) {
    val mb = getMethodBind("Image","blit_rect_mask")
    _icall_Unit_Object_Object_Rect2_Vector2( mb, this.ptr, src, mask, srcRect, dst)
  }

  open fun bumpmapToNormalmap(bumpScale: Double = 1.0) {
    val mb = getMethodBind("Image","bumpmap_to_normalmap")
    _icall_Unit_Double( mb, this.ptr, bumpScale)
  }

  open fun clearMipmaps() {
    val mb = getMethodBind("Image","clear_mipmaps")
    _icall_Unit( mb, this.ptr)
  }

  open fun compress(
    mode: Long,
    source: Long,
    lossyQuality: Double
  ): GodotError {
    val mb = getMethodBind("Image","compress")
    return GodotError.byValue( _icall_Long_Long_Long_Double( mb, this.ptr, mode, source,
        lossyQuality).toUInt())
  }

  open fun convert(format: Long) {
    val mb = getMethodBind("Image","convert")
    _icall_Unit_Long( mb, this.ptr, format)
  }

  open fun copyFrom(src: Image) {
    val mb = getMethodBind("Image","copy_from")
    _icall_Unit_Object( mb, this.ptr, src)
  }

  open fun create(
    width: Long,
    height: Long,
    useMipmaps: Boolean,
    format: Long
  ) {
    val mb = getMethodBind("Image","create")
    _icall_Unit_Long_Long_Boolean_Long( mb, this.ptr, width, height, useMipmaps, format)
  }

  open fun createFromData(
    width: Long,
    height: Long,
    useMipmaps: Boolean,
    format: Long,
    data: PoolByteArray
  ) {
    val mb = getMethodBind("Image","create_from_data")
    _icall_Unit_Long_Long_Boolean_Long_PoolByteArray( mb, this.ptr, width, height, useMipmaps,
        format, data)
  }

  open fun crop(width: Long, height: Long) {
    val mb = getMethodBind("Image","crop")
    _icall_Unit_Long_Long( mb, this.ptr, width, height)
  }

  open fun decompress(): GodotError {
    val mb = getMethodBind("Image","decompress")
    return GodotError.byValue( _icall_Long( mb, this.ptr).toUInt())
  }

  open fun detectAlpha(): Image.AlphaMode {
    val mb = getMethodBind("Image","detect_alpha")
    return Image.AlphaMode.from( _icall_Long( mb, this.ptr))
  }

  open fun expandX2Hq2x() {
    val mb = getMethodBind("Image","expand_x2_hq2x")
    _icall_Unit( mb, this.ptr)
  }

  open fun fill(color: Color) {
    val mb = getMethodBind("Image","fill")
    _icall_Unit_Color( mb, this.ptr, color)
  }

  open fun fixAlphaEdges() {
    val mb = getMethodBind("Image","fix_alpha_edges")
    _icall_Unit( mb, this.ptr)
  }

  open fun flipX() {
    val mb = getMethodBind("Image","flip_x")
    _icall_Unit( mb, this.ptr)
  }

  open fun flipY() {
    val mb = getMethodBind("Image","flip_y")
    _icall_Unit( mb, this.ptr)
  }

  open fun generateMipmaps(renormalize: Boolean = false): GodotError {
    val mb = getMethodBind("Image","generate_mipmaps")
    return GodotError.byValue( _icall_Long_Boolean( mb, this.ptr, renormalize).toUInt())
  }

  open fun getData(): PoolByteArray {
    val mb = getMethodBind("Image","get_data")
    return _icall_PoolByteArray( mb, this.ptr)
  }

  open fun getFormat(): Image.Format {
    val mb = getMethodBind("Image","get_format")
    return Image.Format.from( _icall_Long( mb, this.ptr))
  }

  open fun getHeight(): Long {
    val mb = getMethodBind("Image","get_height")
    return _icall_Long( mb, this.ptr)
  }

  open fun getMipmapOffset(mipmap: Long): Long {
    val mb = getMethodBind("Image","get_mipmap_offset")
    return _icall_Long_Long( mb, this.ptr, mipmap)
  }

  open fun getPixel(x: Long, y: Long): Color {
    val mb = getMethodBind("Image","get_pixel")
    return _icall_Color_Long_Long( mb, this.ptr, x, y)
  }

  open fun getPixelv(src: Vector2): Color {
    val mb = getMethodBind("Image","get_pixelv")
    return _icall_Color_Vector2( mb, this.ptr, src)
  }

  open fun getRect(rect: Rect2): Image {
    val mb = getMethodBind("Image","get_rect")
    return _icall_Image_Rect2( mb, this.ptr, rect)
  }

  open fun getSize(): Vector2 {
    val mb = getMethodBind("Image","get_size")
    return _icall_Vector2( mb, this.ptr)
  }

  open fun getUsedRect(): Rect2 {
    val mb = getMethodBind("Image","get_used_rect")
    return _icall_Rect2( mb, this.ptr)
  }

  open fun getWidth(): Long {
    val mb = getMethodBind("Image","get_width")
    return _icall_Long( mb, this.ptr)
  }

  open fun hasMipmaps(): Boolean {
    val mb = getMethodBind("Image","has_mipmaps")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isCompressed(): Boolean {
    val mb = getMethodBind("Image","is_compressed")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isEmpty(): Boolean {
    val mb = getMethodBind("Image","is_empty")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isInvisible(): Boolean {
    val mb = getMethodBind("Image","is_invisible")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun load(path: String): GodotError {
    val mb = getMethodBind("Image","load")
    return GodotError.byValue( _icall_Long_String( mb, this.ptr, path).toUInt())
  }

  open fun loadJpgFromBuffer(buffer: PoolByteArray): GodotError {
    val mb = getMethodBind("Image","load_jpg_from_buffer")
    return GodotError.byValue( _icall_Long_PoolByteArray( mb, this.ptr, buffer).toUInt())
  }

  open fun loadPngFromBuffer(buffer: PoolByteArray): GodotError {
    val mb = getMethodBind("Image","load_png_from_buffer")
    return GodotError.byValue( _icall_Long_PoolByteArray( mb, this.ptr, buffer).toUInt())
  }

  open fun loadWebpFromBuffer(buffer: PoolByteArray): GodotError {
    val mb = getMethodBind("Image","load_webp_from_buffer")
    return GodotError.byValue( _icall_Long_PoolByteArray( mb, this.ptr, buffer).toUInt())
  }

  open fun lock() {
    val mb = getMethodBind("Image","lock")
    _icall_Unit( mb, this.ptr)
  }

  open fun normalmapToXy() {
    val mb = getMethodBind("Image","normalmap_to_xy")
    _icall_Unit( mb, this.ptr)
  }

  open fun premultiplyAlpha() {
    val mb = getMethodBind("Image","premultiply_alpha")
    _icall_Unit( mb, this.ptr)
  }

  open fun resize(
    width: Long,
    height: Long,
    interpolation: Long = 1
  ) {
    val mb = getMethodBind("Image","resize")
    _icall_Unit_Long_Long_Long( mb, this.ptr, width, height, interpolation)
  }

  open fun resizeToPo2(square: Boolean = false) {
    val mb = getMethodBind("Image","resize_to_po2")
    _icall_Unit_Boolean( mb, this.ptr, square)
  }

  open fun rgbeToSrgb(): Image {
    val mb = getMethodBind("Image","rgbe_to_srgb")
    return _icall_Image( mb, this.ptr)
  }

  open fun saveExr(path: String, grayscale: Boolean = false): GodotError {
    val mb = getMethodBind("Image","save_exr")
    return GodotError.byValue( _icall_Long_String_Boolean( mb, this.ptr, path, grayscale).toUInt())
  }

  open fun savePng(path: String): GodotError {
    val mb = getMethodBind("Image","save_png")
    return GodotError.byValue( _icall_Long_String( mb, this.ptr, path).toUInt())
  }

  open fun savePngToBuffer(): PoolByteArray {
    val mb = getMethodBind("Image","save_png_to_buffer")
    return _icall_PoolByteArray( mb, this.ptr)
  }

  open fun setPixel(
    x: Long,
    y: Long,
    color: Color
  ) {
    val mb = getMethodBind("Image","set_pixel")
    _icall_Unit_Long_Long_Color( mb, this.ptr, x, y, color)
  }

  open fun setPixelv(dst: Vector2, color: Color) {
    val mb = getMethodBind("Image","set_pixelv")
    _icall_Unit_Vector2_Color( mb, this.ptr, dst, color)
  }

  open fun shrinkX2() {
    val mb = getMethodBind("Image","shrink_x2")
    _icall_Unit( mb, this.ptr)
  }

  open fun srgbToLinear() {
    val mb = getMethodBind("Image","srgb_to_linear")
    _icall_Unit( mb, this.ptr)
  }

  open fun unlock() {
    val mb = getMethodBind("Image","unlock")
    _icall_Unit( mb, this.ptr)
  }

  enum class AlphaMode(
    id: Long
  ) {
    ALPHA_NONE(0),

    ALPHA_BIT(1),

    ALPHA_BLEND(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class CompressSource(
    id: Long
  ) {
    COMPRESS_SOURCE_GENERIC(0),

    COMPRESS_SOURCE_SRGB(1),

    COMPRESS_SOURCE_NORMAL(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class Interpolation(
    id: Long
  ) {
    INTERPOLATE_NEAREST(0),

    INTERPOLATE_BILINEAR(1),

    INTERPOLATE_CUBIC(2),

    INTERPOLATE_TRILINEAR(3),

    INTERPOLATE_LANCZOS(4);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class CompressMode(
    id: Long
  ) {
    COMPRESS_S3TC(0),

    COMPRESS_PVRTC2(1),

    COMPRESS_PVRTC4(2),

    COMPRESS_ETC(3),

    COMPRESS_ETC2(4);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class Format(
    id: Long
  ) {
    FORMAT_L8(0),

    FORMAT_LA8(1),

    FORMAT_R8(2),

    FORMAT_RG8(3),

    FORMAT_RGB8(4),

    FORMAT_RGBA8(5),

    FORMAT_RGBA4444(6),

    FORMAT_RGBA5551(7),

    FORMAT_RF(8),

    FORMAT_RGF(9),

    FORMAT_RGBF(10),

    FORMAT_RGBAF(11),

    FORMAT_RH(12),

    FORMAT_RGH(13),

    FORMAT_RGBH(14),

    FORMAT_RGBAH(15),

    FORMAT_RGBE9995(16),

    FORMAT_DXT1(17),

    FORMAT_DXT3(18),

    FORMAT_DXT5(19),

    FORMAT_RGTC_R(20),

    FORMAT_RGTC_RG(21),

    FORMAT_BPTC_RGBA(22),

    FORMAT_BPTC_RGBF(23),

    FORMAT_BPTC_RGBFU(24),

    FORMAT_PVRTC2(25),

    FORMAT_PVRTC2A(26),

    FORMAT_PVRTC4(27),

    FORMAT_PVRTC4A(28),

    FORMAT_ETC(29),

    FORMAT_ETC2_R11(30),

    FORMAT_ETC2_R11S(31),

    FORMAT_ETC2_RG11(32),

    FORMAT_ETC2_RG11S(33),

    FORMAT_ETC2_RGB8(34),

    FORMAT_ETC2_RGBA8(35),

    FORMAT_ETC2_RGB8A1(36),

    FORMAT_MAX(37);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val ALPHA_BIT: Long = 1

    final const val ALPHA_BLEND: Long = 2

    final const val ALPHA_NONE: Long = 0

    final const val COMPRESS_ETC: Long = 3

    final const val COMPRESS_ETC2: Long = 4

    final const val COMPRESS_PVRTC2: Long = 1

    final const val COMPRESS_PVRTC4: Long = 2

    final const val COMPRESS_S3TC: Long = 0

    final const val COMPRESS_SOURCE_GENERIC: Long = 0

    final const val COMPRESS_SOURCE_NORMAL: Long = 2

    final const val COMPRESS_SOURCE_SRGB: Long = 1

    final const val FORMAT_BPTC_RGBA: Long = 22

    final const val FORMAT_BPTC_RGBF: Long = 23

    final const val FORMAT_BPTC_RGBFU: Long = 24

    final const val FORMAT_DXT1: Long = 17

    final const val FORMAT_DXT3: Long = 18

    final const val FORMAT_DXT5: Long = 19

    final const val FORMAT_ETC: Long = 29

    final const val FORMAT_ETC2_R11: Long = 30

    final const val FORMAT_ETC2_R11S: Long = 31

    final const val FORMAT_ETC2_RG11: Long = 32

    final const val FORMAT_ETC2_RG11S: Long = 33

    final const val FORMAT_ETC2_RGB8: Long = 34

    final const val FORMAT_ETC2_RGB8A1: Long = 36

    final const val FORMAT_ETC2_RGBA8: Long = 35

    final const val FORMAT_L8: Long = 0

    final const val FORMAT_LA8: Long = 1

    final const val FORMAT_MAX: Long = 37

    final const val FORMAT_PVRTC2: Long = 25

    final const val FORMAT_PVRTC2A: Long = 26

    final const val FORMAT_PVRTC4: Long = 27

    final const val FORMAT_PVRTC4A: Long = 28

    final const val FORMAT_R8: Long = 2

    final const val FORMAT_RF: Long = 8

    final const val FORMAT_RG8: Long = 3

    final const val FORMAT_RGB8: Long = 4

    final const val FORMAT_RGBA4444: Long = 6

    final const val FORMAT_RGBA5551: Long = 7

    final const val FORMAT_RGBA8: Long = 5

    final const val FORMAT_RGBAF: Long = 11

    final const val FORMAT_RGBAH: Long = 15

    final const val FORMAT_RGBE9995: Long = 16

    final const val FORMAT_RGBF: Long = 10

    final const val FORMAT_RGBH: Long = 14

    final const val FORMAT_RGF: Long = 9

    final const val FORMAT_RGH: Long = 13

    final const val FORMAT_RGTC_R: Long = 20

    final const val FORMAT_RGTC_RG: Long = 21

    final const val FORMAT_RH: Long = 12

    final const val INTERPOLATE_BILINEAR: Long = 1

    final const val INTERPOLATE_CUBIC: Long = 2

    final const val INTERPOLATE_LANCZOS: Long = 4

    final const val INTERPOLATE_NEAREST: Long = 0

    final const val INTERPOLATE_TRILINEAR: Long = 3

    final const val MAX_HEIGHT: Long = 16384

    final const val MAX_WIDTH: Long = 16384
  }
}
