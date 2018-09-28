@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
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
    open var topRadius: Float
        get() = _icall_Float(getTopRadiusMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setTopRadiusMethodBind, this.rawMemory, value)


    open var bottomRadius: Float
        get() = _icall_Float(getBottomRadiusMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setBottomRadiusMethodBind, this.rawMemory, value)


    open var height: Float
        get() = _icall_Float(getHeightMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setHeightMethodBind, this.rawMemory, value)


    open var radialSegments: Int
        get() = _icall_Int(getRadialSegmentsMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setRadialSegmentsMethodBind, this.rawMemory, value)


    open var rings: Int
        get() = _icall_Int(getRingsMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setRingsMethodBind, this.rawMemory, value)




    // Methods
    private val setTopRadiusMethodBind: CPointer<godot_method_bind> by lazy { getMB("CylinderMesh", "set_top_radius") }
    open fun setTopRadius(radius: Float) {
        _icall_Unit_Float(setTopRadiusMethodBind, this.rawMemory, radius)
    }


    private val getTopRadiusMethodBind: CPointer<godot_method_bind> by lazy { getMB("CylinderMesh", "get_top_radius") }
    open fun getTopRadius(): Float {
        return _icall_Float(getTopRadiusMethodBind, this.rawMemory)
    }


    private val setBottomRadiusMethodBind: CPointer<godot_method_bind> by lazy { getMB("CylinderMesh", "set_bottom_radius") }
    open fun setBottomRadius(radius: Float) {
        _icall_Unit_Float(setBottomRadiusMethodBind, this.rawMemory, radius)
    }


    private val getBottomRadiusMethodBind: CPointer<godot_method_bind> by lazy { getMB("CylinderMesh", "get_bottom_radius") }
    open fun getBottomRadius(): Float {
        return _icall_Float(getBottomRadiusMethodBind, this.rawMemory)
    }


    private val setHeightMethodBind: CPointer<godot_method_bind> by lazy { getMB("CylinderMesh", "set_height") }
    open fun setHeight(height: Float) {
        _icall_Unit_Float(setHeightMethodBind, this.rawMemory, height)
    }


    private val getHeightMethodBind: CPointer<godot_method_bind> by lazy { getMB("CylinderMesh", "get_height") }
    open fun getHeight(): Float {
        return _icall_Float(getHeightMethodBind, this.rawMemory)
    }


    private val setRadialSegmentsMethodBind: CPointer<godot_method_bind> by lazy { getMB("CylinderMesh", "set_radial_segments") }
    open fun setRadialSegments(segments: Int) {
        _icall_Unit_Int(setRadialSegmentsMethodBind, this.rawMemory, segments)
    }


    private val getRadialSegmentsMethodBind: CPointer<godot_method_bind> by lazy { getMB("CylinderMesh", "get_radial_segments") }
    open fun getRadialSegments(): Int {
        return _icall_Int(getRadialSegmentsMethodBind, this.rawMemory)
    }


    private val setRingsMethodBind: CPointer<godot_method_bind> by lazy { getMB("CylinderMesh", "set_rings") }
    open fun setRings(rings: Int) {
        _icall_Unit_Int(setRingsMethodBind, this.rawMemory, rings)
    }


    private val getRingsMethodBind: CPointer<godot_method_bind> by lazy { getMB("CylinderMesh", "get_rings") }
    open fun getRings(): Int {
        return _icall_Int(getRingsMethodBind, this.rawMemory)
    }


}
