@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class Sky : Resource {
    private constructor() : super("")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class RadianceSize(val id: Long) {
        RADIANCE_SIZE_32(0),
        RADIANCE_SIZE_64(1),
        RADIANCE_SIZE_128(2),
        RADIANCE_SIZE_256(3),
        RADIANCE_SIZE_512(4),
        RADIANCE_SIZE_1024(5),
        RADIANCE_SIZE_2048(6),
        RADIANCE_SIZE_MAX(7),
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
        infix fun from(other: Resource): Sky = Sky("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): Sky = Sky("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): Sky = Sky("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): Sky = fromVariant(Sky(""), other)


        // Constants
        const val RADIANCE_SIZE_32: Long = 0
        const val RADIANCE_SIZE_64: Long = 1
        const val RADIANCE_SIZE_128: Long = 2
        const val RADIANCE_SIZE_256: Long = 3
        const val RADIANCE_SIZE_512: Long = 4
        const val RADIANCE_SIZE_1024: Long = 5
        const val RADIANCE_SIZE_2048: Long = 6
        const val RADIANCE_SIZE_MAX: Long = 7


    }


    // Properties
    open var radianceSize: Long
        get() = _icall_Long(getRadianceSizeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setRadianceSizeMethodBind, this.rawMemory, value)




    // Methods
    private val setRadianceSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Sky", "set_radiance_size") }
    open fun setRadianceSize(size: Long) {
        _icall_Unit_Long(setRadianceSizeMethodBind, this.rawMemory, size)
    }


    private val getRadianceSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Sky", "get_radiance_size") }
    open fun getRadianceSize(): Sky.RadianceSize {
        return Sky.RadianceSize.fromInt(_icall_Long(getRadianceSizeMethodBind, this.rawMemory))
    }


}
