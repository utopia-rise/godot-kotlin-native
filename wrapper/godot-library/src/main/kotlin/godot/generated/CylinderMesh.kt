@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class CylinderMesh : PrimitiveMesh {
    constructor() : super("CylinderMesh")
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
        infix fun from(other: PrimitiveMesh): CylinderMesh = CylinderMesh("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Mesh): CylinderMesh = CylinderMesh("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): CylinderMesh = CylinderMesh("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): CylinderMesh = CylinderMesh("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): CylinderMesh = CylinderMesh("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): CylinderMesh = fromVariant(CylinderMesh(""), other)


        // Constants


    }


    // Properties
    open var topRadius: Double
        get() = _icall_Double(getTopRadiusMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setTopRadiusMethodBind, this.rawMemory, value)


    open var bottomRadius: Double
        get() = _icall_Double(getBottomRadiusMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setBottomRadiusMethodBind, this.rawMemory, value)


    open var height: Double
        get() = _icall_Double(getHeightMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setHeightMethodBind, this.rawMemory, value)


    open var radialSegments: Long
        get() = _icall_Long(getRadialSegmentsMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setRadialSegmentsMethodBind, this.rawMemory, value)


    open var rings: Long
        get() = _icall_Long(getRingsMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setRingsMethodBind, this.rawMemory, value)




    // Methods
    private val setTopRadiusMethodBind: CPointer<godot_method_bind> by lazy { getMB("CylinderMesh", "set_top_radius") }
    open fun setTopRadius(radius: Double) {
        _icall_Unit_Double(setTopRadiusMethodBind, this.rawMemory, radius)
    }


    private val getTopRadiusMethodBind: CPointer<godot_method_bind> by lazy { getMB("CylinderMesh", "get_top_radius") }
    open fun getTopRadius(): Double {
        return _icall_Double(getTopRadiusMethodBind, this.rawMemory)
    }


    private val setBottomRadiusMethodBind: CPointer<godot_method_bind> by lazy { getMB("CylinderMesh", "set_bottom_radius") }
    open fun setBottomRadius(radius: Double) {
        _icall_Unit_Double(setBottomRadiusMethodBind, this.rawMemory, radius)
    }


    private val getBottomRadiusMethodBind: CPointer<godot_method_bind> by lazy { getMB("CylinderMesh", "get_bottom_radius") }
    open fun getBottomRadius(): Double {
        return _icall_Double(getBottomRadiusMethodBind, this.rawMemory)
    }


    private val setHeightMethodBind: CPointer<godot_method_bind> by lazy { getMB("CylinderMesh", "set_height") }
    open fun setHeight(height: Double) {
        _icall_Unit_Double(setHeightMethodBind, this.rawMemory, height)
    }


    private val getHeightMethodBind: CPointer<godot_method_bind> by lazy { getMB("CylinderMesh", "get_height") }
    open fun getHeight(): Double {
        return _icall_Double(getHeightMethodBind, this.rawMemory)
    }


    private val setRadialSegmentsMethodBind: CPointer<godot_method_bind> by lazy { getMB("CylinderMesh", "set_radial_segments") }
    open fun setRadialSegments(segments: Long) {
        _icall_Unit_Long(setRadialSegmentsMethodBind, this.rawMemory, segments)
    }


    private val getRadialSegmentsMethodBind: CPointer<godot_method_bind> by lazy { getMB("CylinderMesh", "get_radial_segments") }
    open fun getRadialSegments(): Long {
        return _icall_Long(getRadialSegmentsMethodBind, this.rawMemory)
    }


    private val setRingsMethodBind: CPointer<godot_method_bind> by lazy { getMB("CylinderMesh", "set_rings") }
    open fun setRings(rings: Long) {
        _icall_Unit_Long(setRingsMethodBind, this.rawMemory, rings)
    }


    private val getRingsMethodBind: CPointer<godot_method_bind> by lazy { getMB("CylinderMesh", "get_rings") }
    open fun getRings(): Long {
        return _icall_Long(getRingsMethodBind, this.rawMemory)
    }


}
