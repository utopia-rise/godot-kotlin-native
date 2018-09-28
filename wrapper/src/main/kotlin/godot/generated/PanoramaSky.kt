@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class PanoramaSky : Sky {
    constructor() : super("PanoramaSky")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 



    // Signals
    class Signal {
        companion object {
        }
    }


    companion object {
        infix fun from(other: Sky): PanoramaSky = PanoramaSky("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): PanoramaSky = PanoramaSky("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): PanoramaSky = PanoramaSky("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): PanoramaSky = PanoramaSky("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): PanoramaSky = fromVariant(PanoramaSky(""), other)


        // Constants


    }


    // Properties
    open var panorama: Texture
        get() = _icall_Texture(getPanoramaMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setPanoramaMethodBind, this.rawMemory, value)




    // Methods
    private val setPanoramaMethodBind: CPointer<godot_method_bind> by lazy { getMB("PanoramaSky", "set_panorama") }
    open fun setPanorama(texture: Texture) {
        _icall_Unit_Object(setPanoramaMethodBind, this.rawMemory, texture)
    }


    private val getPanoramaMethodBind: CPointer<godot_method_bind> by lazy { getMB("PanoramaSky", "get_panorama") }
    open fun getPanorama(): Texture {
        return _icall_Texture(getPanoramaMethodBind, this.rawMemory)
    }


}
