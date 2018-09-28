@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class Sky : Resource {
    private constructor() : super("")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class RadianceSize(val id: Int) {
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
            fun fromInt(value: Int) = values().single { it.id == value }
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
        const val RADIANCE_SIZE_32: Int = 0
        const val RADIANCE_SIZE_64: Int = 1
        const val RADIANCE_SIZE_128: Int = 2
        const val RADIANCE_SIZE_256: Int = 3
        const val RADIANCE_SIZE_512: Int = 4
        const val RADIANCE_SIZE_1024: Int = 5
        const val RADIANCE_SIZE_2048: Int = 6
        const val RADIANCE_SIZE_MAX: Int = 7


    }


    // Properties
    open var radianceSize: Int
        get() = _icall_Int(getRadianceSizeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setRadianceSizeMethodBind, this.rawMemory, value)




    // Methods
    private val setRadianceSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Sky", "set_radiance_size") }
    open fun setRadianceSize(size: Int) {
        _icall_Unit_Int(setRadianceSizeMethodBind, this.rawMemory, size)
    }


    private val getRadianceSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Sky", "get_radiance_size") }
    open fun getRadianceSize(): Sky.RadianceSize {
        return Sky.RadianceSize.fromInt(_icall_Int(getRadianceSizeMethodBind, this.rawMemory))
    }


}
