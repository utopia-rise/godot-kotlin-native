@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class ImageTexture : Texture {
    constructor() : super("ImageTexture")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class Storage(val id: Long) {
        STORAGE_RAW(0),
        STORAGE_COMPRESS_LOSSY(1),
        STORAGE_COMPRESS_LOSSLESS(2),
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
        infix fun from(other: Texture): ImageTexture = ImageTexture("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): ImageTexture = ImageTexture("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): ImageTexture = ImageTexture("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): ImageTexture = ImageTexture("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): ImageTexture = fromVariant(ImageTexture(""), other)


        // Constants
        const val STORAGE_RAW: Long = 0
        const val STORAGE_COMPRESS_LOSSY: Long = 1
        const val STORAGE_COMPRESS_LOSSLESS: Long = 2


    }


    // Properties
    open var storage: Long
        get() = _icall_Long(getStorageMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setStorageMethodBind, this.rawMemory, value)


    open var lossyQuality: Double
        get() = _icall_Double(getLossyStorageQualityMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setLossyStorageQualityMethodBind, this.rawMemory, value)




    // Methods
    private val createMethodBind: CPointer<godot_method_bind> by lazy { getMB("ImageTexture", "create") }
    open fun create(width: Long, height: Long, format: Long, flags: Long = 7) {
        _icall_Unit_Long_Long_Long_Long(createMethodBind, this.rawMemory, width, height, format, flags)
    }


    private val createFromImageMethodBind: CPointer<godot_method_bind> by lazy { getMB("ImageTexture", "create_from_image") }
    open fun createFromImage(image: Image, flags: Long = 7) {
        _icall_Unit_Object_Long(createFromImageMethodBind, this.rawMemory, image, flags)
    }


    private val getFormatMethodBind: CPointer<godot_method_bind> by lazy { getMB("ImageTexture", "get_format") }
    open fun getFormat(): Image.Format {
        return Image.Format.fromInt(_icall_Long(getFormatMethodBind, this.rawMemory))
    }


    private val loadMethodBind: CPointer<godot_method_bind> by lazy { getMB("ImageTexture", "load") }
    open fun load(path: String): GodotError {
        return GodotError.fromInt(_icall_Long_String(loadMethodBind, this.rawMemory, path))
    }


    private val setDataMethodBind: CPointer<godot_method_bind> by lazy { getMB("ImageTexture", "set_data") }
    open fun setData(image: Image) {
        _icall_Unit_Object(setDataMethodBind, this.rawMemory, image)
    }


    private val setStorageMethodBind: CPointer<godot_method_bind> by lazy { getMB("ImageTexture", "set_storage") }
    open fun setStorage(mode: Long) {
        _icall_Unit_Long(setStorageMethodBind, this.rawMemory, mode)
    }


    private val getStorageMethodBind: CPointer<godot_method_bind> by lazy { getMB("ImageTexture", "get_storage") }
    open fun getStorage(): ImageTexture.Storage {
        return ImageTexture.Storage.fromInt(_icall_Long(getStorageMethodBind, this.rawMemory))
    }


    private val setLossyStorageQualityMethodBind: CPointer<godot_method_bind> by lazy { getMB("ImageTexture", "set_lossy_storage_quality") }
    open fun setLossyStorageQuality(quality: Double) {
        _icall_Unit_Double(setLossyStorageQualityMethodBind, this.rawMemory, quality)
    }


    private val getLossyStorageQualityMethodBind: CPointer<godot_method_bind> by lazy { getMB("ImageTexture", "get_lossy_storage_quality") }
    open fun getLossyStorageQuality(): Double {
        return _icall_Double(getLossyStorageQualityMethodBind, this.rawMemory)
    }


    private val setSizeOverrideMethodBind: CPointer<godot_method_bind> by lazy { getMB("ImageTexture", "set_size_override") }
    open fun setSizeOverride(size: Vector2) {
        _icall_Unit_Vector2(setSizeOverrideMethodBind, this.rawMemory, size)
    }


    open fun _reload_hook(rid: RID) {
    }


}
