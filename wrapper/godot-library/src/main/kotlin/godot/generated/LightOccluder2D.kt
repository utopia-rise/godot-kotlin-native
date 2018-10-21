@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class LightOccluder2D : Node2D {
    constructor() : super("LightOccluder2D")
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
        infix fun from(other: Node2D): LightOccluder2D = LightOccluder2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CanvasItem): LightOccluder2D = LightOccluder2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): LightOccluder2D = LightOccluder2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): LightOccluder2D = LightOccluder2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): LightOccluder2D = fromVariant(LightOccluder2D(""), other)


        // Constants


    }


    // Properties
    open var occluder: OccluderPolygon2D
        get() = _icall_OccluderPolygon2D(getOccluderPolygonMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setOccluderPolygonMethodBind, this.rawMemory, value)


    override var lightMask: Long
        get() = _icall_Long(getOccluderLightMaskMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setOccluderLightMaskMethodBind, this.rawMemory, value)




    // Methods
    private val setOccluderPolygonMethodBind: CPointer<godot_method_bind> by lazy { getMB("LightOccluder2D", "set_occluder_polygon") }
    open fun setOccluderPolygon(polygon: OccluderPolygon2D) {
        _icall_Unit_Object(setOccluderPolygonMethodBind, this.rawMemory, polygon)
    }


    private val getOccluderPolygonMethodBind: CPointer<godot_method_bind> by lazy { getMB("LightOccluder2D", "get_occluder_polygon") }
    open fun getOccluderPolygon(): OccluderPolygon2D {
        return _icall_OccluderPolygon2D(getOccluderPolygonMethodBind, this.rawMemory)
    }


    private val setOccluderLightMaskMethodBind: CPointer<godot_method_bind> by lazy { getMB("LightOccluder2D", "set_occluder_light_mask") }
    open fun setOccluderLightMask(mask: Long) {
        _icall_Unit_Long(setOccluderLightMaskMethodBind, this.rawMemory, mask)
    }


    private val getOccluderLightMaskMethodBind: CPointer<godot_method_bind> by lazy { getMB("LightOccluder2D", "get_occluder_light_mask") }
    open fun getOccluderLightMask(): Long {
        return _icall_Long(getOccluderLightMaskMethodBind, this.rawMemory)
    }


    open fun _poly_changed() {
    }


}
