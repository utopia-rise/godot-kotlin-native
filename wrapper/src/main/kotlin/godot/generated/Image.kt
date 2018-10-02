@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class Image : Resource {
    constructor() : super("Image")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class AlphaMode(val id: Long) {
        ALPHA_NONE(0),
        ALPHA_BIT(1),
        ALPHA_BLEND(2),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class CompressSource(val id: Long) {
        COMPRESS_SOURCE_GENERIC(0),
        COMPRESS_SOURCE_SRGB(1),
        COMPRESS_SOURCE_NORMAL(2),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class Interpolation(val id: Long) {
        INTERPOLATE_NEAREST(0),
        INTERPOLATE_BILINEAR(1),
        INTERPOLATE_CUBIC(2),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class CompressMode(val id: Long) {
        COMPRESS_S3TC(0),
        COMPRESS_PVRTC2(1),
        COMPRESS_PVRTC4(2),
        COMPRESS_ETC(3),
        COMPRESS_ETC2(4),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class Format(val id: Long) {
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
        FORMAT_MAX(37),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }


    // Signals
    class Signal {
        companion object {
        }
    }


    companion object {
        infix fun from(other: Resource): Image = Image("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): Image = Image("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): Image = Image("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): Image = fromVariant(Image(""), other)


        // Constants
        const val FORMAT_L8: Long = 0
        const val FORMAT_LA8: Long = 1
        const val FORMAT_R8: Long = 2
        const val FORMAT_RG8: Long = 3
        const val FORMAT_RGB8: Long = 4
        const val FORMAT_RGBA8: Long = 5
        const val FORMAT_RGBA4444: Long = 6
        const val FORMAT_RGBA5551: Long = 7
        const val FORMAT_RF: Long = 8
        const val FORMAT_RGF: Long = 9
        const val FORMAT_RGBF: Long = 10
        const val FORMAT_RGBAF: Long = 11
        const val FORMAT_RH: Long = 12
        const val FORMAT_RGH: Long = 13
        const val FORMAT_RGBH: Long = 14
        const val FORMAT_RGBAH: Long = 15
        const val FORMAT_RGBE9995: Long = 16
        const val FORMAT_DXT1: Long = 17
        const val FORMAT_DXT3: Long = 18
        const val FORMAT_DXT5: Long = 19
        const val FORMAT_RGTC_R: Long = 20
        const val FORMAT_RGTC_RG: Long = 21
        const val FORMAT_BPTC_RGBA: Long = 22
        const val FORMAT_BPTC_RGBF: Long = 23
        const val FORMAT_BPTC_RGBFU: Long = 24
        const val FORMAT_PVRTC2: Long = 25
        const val FORMAT_PVRTC2A: Long = 26
        const val FORMAT_PVRTC4: Long = 27
        const val FORMAT_PVRTC4A: Long = 28
        const val FORMAT_ETC: Long = 29
        const val FORMAT_ETC2_R11: Long = 30
        const val FORMAT_ETC2_R11S: Long = 31
        const val FORMAT_ETC2_RG11: Long = 32
        const val FORMAT_ETC2_RG11S: Long = 33
        const val FORMAT_ETC2_RGB8: Long = 34
        const val FORMAT_ETC2_RGBA8: Long = 35
        const val FORMAT_ETC2_RGB8A1: Long = 36
        const val FORMAT_MAX: Long = 37
        const val INTERPOLATE_NEAREST: Long = 0
        const val INTERPOLATE_BILINEAR: Long = 1
        const val INTERPOLATE_CUBIC: Long = 2
        const val ALPHA_NONE: Long = 0
        const val ALPHA_BIT: Long = 1
        const val ALPHA_BLEND: Long = 2
        const val COMPRESS_S3TC: Long = 0
        const val COMPRESS_PVRTC2: Long = 1
        const val COMPRESS_PVRTC4: Long = 2
        const val COMPRESS_ETC: Long = 3
        const val COMPRESS_ETC2: Long = 4
        const val COMPRESS_SOURCE_GENERIC: Long = 0
        const val COMPRESS_SOURCE_SRGB: Long = 1
        const val COMPRESS_SOURCE_NORMAL: Long = 2


    }


    // Properties


    // Methods
    private val getWidthMethodBind: CPointer<godot_method_bind> by lazy { getMB("Image", "get_width") }
    open fun getWidth(): Long {
        return _icall_Long(getWidthMethodBind, this.rawMemory)
    }


    private val getHeightMethodBind: CPointer<godot_method_bind> by lazy { getMB("Image", "get_height") }
    open fun getHeight(): Long {
        return _icall_Long(getHeightMethodBind, this.rawMemory)
    }


    private val getSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Image", "get_size") }
    open fun getSize(): Vector2 {
        return _icall_Vector2(getSizeMethodBind, this.rawMemory)
    }


    private val hasMipmapsMethodBind: CPointer<godot_method_bind> by lazy { getMB("Image", "has_mipmaps") }
    open fun hasMipmaps(): Boolean {
        return _icall_Boolean(hasMipmapsMethodBind, this.rawMemory)
    }


    private val getFormatMethodBind: CPointer<godot_method_bind> by lazy { getMB("Image", "get_format") }
    open fun getFormat(): Image.Format {
        return Image.Format.fromInt(_icall_Long(getFormatMethodBind, this.rawMemory))
    }


    private val getDataMethodBind: CPointer<godot_method_bind> by lazy { getMB("Image", "get_data") }
    open fun getData(): PoolByteArray {
        return _icall_PoolByteArray(getDataMethodBind, this.rawMemory)
    }


    private val convertMethodBind: CPointer<godot_method_bind> by lazy { getMB("Image", "convert") }
    open fun convert(format: Long) {
        _icall_Unit_Long(convertMethodBind, this.rawMemory, format)
    }


    private val getMipmapOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("Image", "get_mipmap_offset") }
    open fun getMipmapOffset(mipmap: Long): Long {
        return _icall_Long_Long(getMipmapOffsetMethodBind, this.rawMemory, mipmap)
    }


    private val resizeToPo2MethodBind: CPointer<godot_method_bind> by lazy { getMB("Image", "resize_to_po2") }
    open fun resizeToPo2(square: Boolean = false) {
        _icall_Unit_Boolean(resizeToPo2MethodBind, this.rawMemory, square)
    }


    private val resizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Image", "resize") }
    open fun resize(width: Long, height: Long, interpolation: Long = 1) {
        _icall_Unit_Long_Long_Long(resizeMethodBind, this.rawMemory, width, height, interpolation)
    }


    private val shrinkX2MethodBind: CPointer<godot_method_bind> by lazy { getMB("Image", "shrink_x2") }
    open fun shrinkX2() {
        _icall_Unit(shrinkX2MethodBind, this.rawMemory)
    }


    private val expandX2Hq2xMethodBind: CPointer<godot_method_bind> by lazy { getMB("Image", "expand_x2_hq2x") }
    open fun expandX2Hq2x() {
        _icall_Unit(expandX2Hq2xMethodBind, this.rawMemory)
    }


    private val cropMethodBind: CPointer<godot_method_bind> by lazy { getMB("Image", "crop") }
    open fun crop(width: Long, height: Long) {
        _icall_Unit_Long_Long(cropMethodBind, this.rawMemory, width, height)
    }


    private val flipXMethodBind: CPointer<godot_method_bind> by lazy { getMB("Image", "flip_x") }
    open fun flipX() {
        _icall_Unit(flipXMethodBind, this.rawMemory)
    }


    private val flipYMethodBind: CPointer<godot_method_bind> by lazy { getMB("Image", "flip_y") }
    open fun flipY() {
        _icall_Unit(flipYMethodBind, this.rawMemory)
    }


    private val generateMipmapsMethodBind: CPointer<godot_method_bind> by lazy { getMB("Image", "generate_mipmaps") }
    open fun generateMipmaps(renormalize: Boolean = false): GodotError {
        return GodotError.fromInt(_icall_Long_Boolean(generateMipmapsMethodBind, this.rawMemory, renormalize))
    }


    private val clearMipmapsMethodBind: CPointer<godot_method_bind> by lazy { getMB("Image", "clear_mipmaps") }
    open fun clearMipmaps() {
        _icall_Unit(clearMipmapsMethodBind, this.rawMemory)
    }


    private val createMethodBind: CPointer<godot_method_bind> by lazy { getMB("Image", "create") }
    open fun create(width: Long, height: Long, useMipmaps: Boolean, format: Long) {
        _icall_Unit_Long_Long_Boolean_Long(createMethodBind, this.rawMemory, width, height, useMipmaps, format)
    }


    private val createFromDataMethodBind: CPointer<godot_method_bind> by lazy { getMB("Image", "create_from_data") }
    open fun createFromData(width: Long, height: Long, useMipmaps: Boolean, format: Long, data: PoolByteArray) {
        _icall_Unit_Long_Long_Boolean_Long_PoolByteArray(createFromDataMethodBind, this.rawMemory, width, height, useMipmaps, format, data)
    }


    private val isEmptyMethodBind: CPointer<godot_method_bind> by lazy { getMB("Image", "is_empty") }
    open fun isEmpty(): Boolean {
        return _icall_Boolean(isEmptyMethodBind, this.rawMemory)
    }


    private val loadMethodBind: CPointer<godot_method_bind> by lazy { getMB("Image", "load") }
    open fun load(path: String): GodotError {
        return GodotError.fromInt(_icall_Long_String(loadMethodBind, this.rawMemory, path))
    }


    private val savePngMethodBind: CPointer<godot_method_bind> by lazy { getMB("Image", "save_png") }
    open fun savePng(path: String): GodotError {
        return GodotError.fromInt(_icall_Long_String(savePngMethodBind, this.rawMemory, path))
    }


    private val detectAlphaMethodBind: CPointer<godot_method_bind> by lazy { getMB("Image", "detect_alpha") }
    open fun detectAlpha(): Image.AlphaMode {
        return Image.AlphaMode.fromInt(_icall_Long(detectAlphaMethodBind, this.rawMemory))
    }


    private val isInvisibleMethodBind: CPointer<godot_method_bind> by lazy { getMB("Image", "is_invisible") }
    open fun isInvisible(): Boolean {
        return _icall_Boolean(isInvisibleMethodBind, this.rawMemory)
    }


    private val compressMethodBind: CPointer<godot_method_bind> by lazy { getMB("Image", "compress") }
    open fun compress(mode: Long, source: Long, lossyQuality: Double): GodotError {
        return GodotError.fromInt(_icall_Long_Long_Long_Double(compressMethodBind, this.rawMemory, mode, source, lossyQuality))
    }


    private val decompressMethodBind: CPointer<godot_method_bind> by lazy { getMB("Image", "decompress") }
    open fun decompress(): GodotError {
        return GodotError.fromInt(_icall_Long(decompressMethodBind, this.rawMemory))
    }


    private val isCompressedMethodBind: CPointer<godot_method_bind> by lazy { getMB("Image", "is_compressed") }
    open fun isCompressed(): Boolean {
        return _icall_Boolean(isCompressedMethodBind, this.rawMemory)
    }


    private val fixAlphaEdgesMethodBind: CPointer<godot_method_bind> by lazy { getMB("Image", "fix_alpha_edges") }
    open fun fixAlphaEdges() {
        _icall_Unit(fixAlphaEdgesMethodBind, this.rawMemory)
    }


    private val premultiplyAlphaMethodBind: CPointer<godot_method_bind> by lazy { getMB("Image", "premultiply_alpha") }
    open fun premultiplyAlpha() {
        _icall_Unit(premultiplyAlphaMethodBind, this.rawMemory)
    }


    private val srgbToLinearMethodBind: CPointer<godot_method_bind> by lazy { getMB("Image", "srgb_to_linear") }
    open fun srgbToLinear() {
        _icall_Unit(srgbToLinearMethodBind, this.rawMemory)
    }


    private val normalmapToXyMethodBind: CPointer<godot_method_bind> by lazy { getMB("Image", "normalmap_to_xy") }
    open fun normalmapToXy() {
        _icall_Unit(normalmapToXyMethodBind, this.rawMemory)
    }


    private val rgbeToSrgbMethodBind: CPointer<godot_method_bind> by lazy { getMB("Image", "rgbe_to_srgb") }
    open fun rgbeToSrgb(): Image {
        return _icall_Image(rgbeToSrgbMethodBind, this.rawMemory)
    }


    private val bumpmapToNormalmapMethodBind: CPointer<godot_method_bind> by lazy { getMB("Image", "bumpmap_to_normalmap") }
    open fun bumpmapToNormalmap(bumpScale: Double = 1.0) {
        _icall_Unit_Double(bumpmapToNormalmapMethodBind, this.rawMemory, bumpScale)
    }


    private val blitRectMethodBind: CPointer<godot_method_bind> by lazy { getMB("Image", "blit_rect") }
    open fun blitRect(src: Image, srcRect: Rect2, dst: Vector2) {
        _icall_Unit_Object_Rect2_Vector2(blitRectMethodBind, this.rawMemory, src, srcRect, dst)
    }


    private val blitRectMaskMethodBind: CPointer<godot_method_bind> by lazy { getMB("Image", "blit_rect_mask") }
    open fun blitRectMask(src: Image, mask: Image, srcRect: Rect2, dst: Vector2) {
        _icall_Unit_Object_Object_Rect2_Vector2(blitRectMaskMethodBind, this.rawMemory, src, mask, srcRect, dst)
    }


    private val blendRectMethodBind: CPointer<godot_method_bind> by lazy { getMB("Image", "blend_rect") }
    open fun blendRect(src: Image, srcRect: Rect2, dst: Vector2) {
        _icall_Unit_Object_Rect2_Vector2(blendRectMethodBind, this.rawMemory, src, srcRect, dst)
    }


    private val blendRectMaskMethodBind: CPointer<godot_method_bind> by lazy { getMB("Image", "blend_rect_mask") }
    open fun blendRectMask(src: Image, mask: Image, srcRect: Rect2, dst: Vector2) {
        _icall_Unit_Object_Object_Rect2_Vector2(blendRectMaskMethodBind, this.rawMemory, src, mask, srcRect, dst)
    }


    private val fillMethodBind: CPointer<godot_method_bind> by lazy { getMB("Image", "fill") }
    open fun fill(color: Color) {
        _icall_Unit_Color(fillMethodBind, this.rawMemory, color)
    }


    private val getUsedRectMethodBind: CPointer<godot_method_bind> by lazy { getMB("Image", "get_used_rect") }
    open fun getUsedRect(): Rect2 {
        return _icall_Rect2(getUsedRectMethodBind, this.rawMemory)
    }


    private val getRectMethodBind: CPointer<godot_method_bind> by lazy { getMB("Image", "get_rect") }
    open fun getRect(rect: Rect2): Image {
        return _icall_Image_Rect2(getRectMethodBind, this.rawMemory, rect)
    }


    private val copyFromMethodBind: CPointer<godot_method_bind> by lazy { getMB("Image", "copy_from") }
    open fun copyFrom(src: Image) {
        _icall_Unit_Object(copyFromMethodBind, this.rawMemory, src)
    }


    open fun _set_data(data: Dictionary) {
    }


    open fun _get_data(): Dictionary {
        throw NotImplementedError("_get_data is not implemented for Image")
    }


    private val lockMethodBind: CPointer<godot_method_bind> by lazy { getMB("Image", "lock") }
    open fun lock() {
        _icall_Unit(lockMethodBind, this.rawMemory)
    }


    private val unlockMethodBind: CPointer<godot_method_bind> by lazy { getMB("Image", "unlock") }
    open fun unlock() {
        _icall_Unit(unlockMethodBind, this.rawMemory)
    }


    private val getPixelvMethodBind: CPointer<godot_method_bind> by lazy { getMB("Image", "get_pixelv") }
    open fun getPixelv(src: Vector2): Color {
        return _icall_Color_Vector2(getPixelvMethodBind, this.rawMemory, src)
    }


    private val getPixelMethodBind: CPointer<godot_method_bind> by lazy { getMB("Image", "get_pixel") }
    open fun getPixel(x: Long, y: Long): Color {
        return _icall_Color_Long_Long(getPixelMethodBind, this.rawMemory, x, y)
    }


    private val setPixelvMethodBind: CPointer<godot_method_bind> by lazy { getMB("Image", "set_pixelv") }
    open fun setPixelv(dst: Vector2, color: Color) {
        _icall_Unit_Vector2_Color(setPixelvMethodBind, this.rawMemory, dst, color)
    }


    private val setPixelMethodBind: CPointer<godot_method_bind> by lazy { getMB("Image", "set_pixel") }
    open fun setPixel(x: Long, y: Long, color: Color) {
        _icall_Unit_Long_Long_Color(setPixelMethodBind, this.rawMemory, x, y, color)
    }


    private val loadPngFromBufferMethodBind: CPointer<godot_method_bind> by lazy { getMB("Image", "load_png_from_buffer") }
    open fun loadPngFromBuffer(buffer: PoolByteArray): GodotError {
        return GodotError.fromInt(_icall_Long_PoolByteArray(loadPngFromBufferMethodBind, this.rawMemory, buffer))
    }


    private val loadJpgFromBufferMethodBind: CPointer<godot_method_bind> by lazy { getMB("Image", "load_jpg_from_buffer") }
    open fun loadJpgFromBuffer(buffer: PoolByteArray): GodotError {
        return GodotError.fromInt(_icall_Long_PoolByteArray(loadJpgFromBufferMethodBind, this.rawMemory, buffer))
    }


}
