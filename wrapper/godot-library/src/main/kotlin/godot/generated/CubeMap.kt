@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class CubeMap : Resource {
    constructor() : super("CubeMap")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class Flags(val id: Long) {
        FLAG_MIPMAPS(1),
        FLAG_REPEAT(2),
        FLAG_FILTER(4),
        FLAGS_DEFAULT(7),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class Side(val id: Long) {
        SIDE_LEFT(0),
        SIDE_RIGHT(1),
        SIDE_BOTTOM(2),
        SIDE_TOP(3),
        SIDE_FRONT(4),
        SIDE_BACK(5),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
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
        infix fun from(other: Resource): CubeMap = CubeMap("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): CubeMap = CubeMap("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): CubeMap = CubeMap("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): CubeMap = fromVariant(CubeMap(""), other)


        // Constants
        const val STORAGE_RAW: Long = 0
        const val STORAGE_COMPRESS_LOSSY: Long = 1
        const val STORAGE_COMPRESS_LOSSLESS: Long = 2
        const val SIDE_LEFT: Long = 0
        const val SIDE_RIGHT: Long = 1
        const val SIDE_BOTTOM: Long = 2
        const val SIDE_TOP: Long = 3
        const val SIDE_FRONT: Long = 4
        const val SIDE_BACK: Long = 5
        const val FLAG_MIPMAPS: Long = 1
        const val FLAG_REPEAT: Long = 2
        const val FLAG_FILTER: Long = 4
        const val FLAGS_DEFAULT: Long = 7


    }


    // Properties
    open var flags: Long
        get() = _icall_Long(getFlagsMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setFlagsMethodBind, this.rawMemory, value)


    open var storageMode: Long
        get() = _icall_Long(getStorageMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setStorageMethodBind, this.rawMemory, value)


    open var lossyStorageQuality: Double
        get() = _icall_Double(getLossyStorageQualityMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setLossyStorageQualityMethodBind, this.rawMemory, value)




    // Methods
    private val getWidthMethodBind: CPointer<godot_method_bind> by lazy { getMB("CubeMap", "get_width") }
    open fun getWidth(): Long {
        return _icall_Long(getWidthMethodBind, this.rawMemory)
    }


    private val getHeightMethodBind: CPointer<godot_method_bind> by lazy { getMB("CubeMap", "get_height") }
    open fun getHeight(): Long {
        return _icall_Long(getHeightMethodBind, this.rawMemory)
    }


    private val setFlagsMethodBind: CPointer<godot_method_bind> by lazy { getMB("CubeMap", "set_flags") }
    open fun setFlags(flags: Long) {
        _icall_Unit_Long(setFlagsMethodBind, this.rawMemory, flags)
    }


    private val getFlagsMethodBind: CPointer<godot_method_bind> by lazy { getMB("CubeMap", "get_flags") }
    open fun getFlags(): Long {
        return _icall_Long(getFlagsMethodBind, this.rawMemory)
    }


    private val setSideMethodBind: CPointer<godot_method_bind> by lazy { getMB("CubeMap", "set_side") }
    open fun setSide(side: Long, image: Image) {
        _icall_Unit_Long_Object(setSideMethodBind, this.rawMemory, side, image)
    }


    private val getSideMethodBind: CPointer<godot_method_bind> by lazy { getMB("CubeMap", "get_side") }
    open fun getSide(side: Long): Image {
        return _icall_Image_Long(getSideMethodBind, this.rawMemory, side)
    }


    private val setStorageMethodBind: CPointer<godot_method_bind> by lazy { getMB("CubeMap", "set_storage") }
    open fun setStorage(mode: Long) {
        _icall_Unit_Long(setStorageMethodBind, this.rawMemory, mode)
    }


    private val getStorageMethodBind: CPointer<godot_method_bind> by lazy { getMB("CubeMap", "get_storage") }
    open fun getStorage(): CubeMap.Storage {
        return CubeMap.Storage.fromInt(_icall_Long(getStorageMethodBind, this.rawMemory))
    }


    private val setLossyStorageQualityMethodBind: CPointer<godot_method_bind> by lazy { getMB("CubeMap", "set_lossy_storage_quality") }
    open fun setLossyStorageQuality(quality: Double) {
        _icall_Unit_Double(setLossyStorageQualityMethodBind, this.rawMemory, quality)
    }


    private val getLossyStorageQualityMethodBind: CPointer<godot_method_bind> by lazy { getMB("CubeMap", "get_lossy_storage_quality") }
    open fun getLossyStorageQuality(): Double {
        return _icall_Double(getLossyStorageQualityMethodBind, this.rawMemory)
    }


}
