@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class CapsuleMesh : PrimitiveMesh {
    constructor() : super("CapsuleMesh")
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
        infix fun from(other: PrimitiveMesh): CapsuleMesh = CapsuleMesh("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Mesh): CapsuleMesh = CapsuleMesh("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): CapsuleMesh = CapsuleMesh("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): CapsuleMesh = CapsuleMesh("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): CapsuleMesh = CapsuleMesh("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): CapsuleMesh = fromVariant(CapsuleMesh(""), other)


        // Constants


    }


    // Properties
    open var radius: Double
        get() = _icall_Double(getRadiusMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setRadiusMethodBind, this.rawMemory, value)


    open var midHeight: Double
        get() = _icall_Double(getMidHeightMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setMidHeightMethodBind, this.rawMemory, value)


    open var radialSegments: Long
        get() = _icall_Long(getRadialSegmentsMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setRadialSegmentsMethodBind, this.rawMemory, value)


    open var rings: Long
        get() = _icall_Long(getRingsMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setRingsMethodBind, this.rawMemory, value)




    // Methods
    private val setRadiusMethodBind: CPointer<godot_method_bind> by lazy { getMB("CapsuleMesh", "set_radius") }
    open fun setRadius(radius: Double) {
        _icall_Unit_Double(setRadiusMethodBind, this.rawMemory, radius)
    }


    private val getRadiusMethodBind: CPointer<godot_method_bind> by lazy { getMB("CapsuleMesh", "get_radius") }
    open fun getRadius(): Double {
        return _icall_Double(getRadiusMethodBind, this.rawMemory)
    }


    private val setMidHeightMethodBind: CPointer<godot_method_bind> by lazy { getMB("CapsuleMesh", "set_mid_height") }
    open fun setMidHeight(midHeight: Double) {
        _icall_Unit_Double(setMidHeightMethodBind, this.rawMemory, midHeight)
    }


    private val getMidHeightMethodBind: CPointer<godot_method_bind> by lazy { getMB("CapsuleMesh", "get_mid_height") }
    open fun getMidHeight(): Double {
        return _icall_Double(getMidHeightMethodBind, this.rawMemory)
    }


    private val setRadialSegmentsMethodBind: CPointer<godot_method_bind> by lazy { getMB("CapsuleMesh", "set_radial_segments") }
    open fun setRadialSegments(segments: Long) {
        _icall_Unit_Long(setRadialSegmentsMethodBind, this.rawMemory, segments)
    }


    private val getRadialSegmentsMethodBind: CPointer<godot_method_bind> by lazy { getMB("CapsuleMesh", "get_radial_segments") }
    open fun getRadialSegments(): Long {
        return _icall_Long(getRadialSegmentsMethodBind, this.rawMemory)
    }


    private val setRingsMethodBind: CPointer<godot_method_bind> by lazy { getMB("CapsuleMesh", "set_rings") }
    open fun setRings(rings: Long) {
        _icall_Unit_Long(setRingsMethodBind, this.rawMemory, rings)
    }


    private val getRingsMethodBind: CPointer<godot_method_bind> by lazy { getMB("CapsuleMesh", "get_rings") }
    open fun getRings(): Long {
        return _icall_Long(getRingsMethodBind, this.rawMemory)
    }


}
