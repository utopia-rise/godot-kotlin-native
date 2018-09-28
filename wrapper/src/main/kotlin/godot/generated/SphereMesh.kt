@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class SphereMesh : PrimitiveMesh {
    constructor() : super("SphereMesh")
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
        infix fun from(other: PrimitiveMesh): SphereMesh = SphereMesh("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Mesh): SphereMesh = SphereMesh("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): SphereMesh = SphereMesh("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): SphereMesh = SphereMesh("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): SphereMesh = SphereMesh("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): SphereMesh = fromVariant(SphereMesh(""), other)


        // Constants


    }


    // Properties
    open var radius: Float
        get() = _icall_Float(getRadiusMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setRadiusMethodBind, this.rawMemory, value)


    open var height: Float
        get() = _icall_Float(getHeightMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setHeightMethodBind, this.rawMemory, value)


    open var radialSegments: Int
        get() = _icall_Int(getRadialSegmentsMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setRadialSegmentsMethodBind, this.rawMemory, value)


    open var rings: Int
        get() = _icall_Int(getRingsMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setRingsMethodBind, this.rawMemory, value)


    open var isHemisphere: Boolean
        get() = _icall_Boolean(getIsHemisphereMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setIsHemisphereMethodBind, this.rawMemory, value)




    // Methods
    private val setRadiusMethodBind: CPointer<godot_method_bind> by lazy { getMB("SphereMesh", "set_radius") }
    open fun setRadius(radius: Float) {
        _icall_Unit_Float(setRadiusMethodBind, this.rawMemory, radius)
    }


    private val getRadiusMethodBind: CPointer<godot_method_bind> by lazy { getMB("SphereMesh", "get_radius") }
    open fun getRadius(): Float {
        return _icall_Float(getRadiusMethodBind, this.rawMemory)
    }


    private val setHeightMethodBind: CPointer<godot_method_bind> by lazy { getMB("SphereMesh", "set_height") }
    open fun setHeight(height: Float) {
        _icall_Unit_Float(setHeightMethodBind, this.rawMemory, height)
    }


    private val getHeightMethodBind: CPointer<godot_method_bind> by lazy { getMB("SphereMesh", "get_height") }
    open fun getHeight(): Float {
        return _icall_Float(getHeightMethodBind, this.rawMemory)
    }


    private val setRadialSegmentsMethodBind: CPointer<godot_method_bind> by lazy { getMB("SphereMesh", "set_radial_segments") }
    open fun setRadialSegments(radialSegments: Int) {
        _icall_Unit_Int(setRadialSegmentsMethodBind, this.rawMemory, radialSegments)
    }


    private val getRadialSegmentsMethodBind: CPointer<godot_method_bind> by lazy { getMB("SphereMesh", "get_radial_segments") }
    open fun getRadialSegments(): Int {
        return _icall_Int(getRadialSegmentsMethodBind, this.rawMemory)
    }


    private val setRingsMethodBind: CPointer<godot_method_bind> by lazy { getMB("SphereMesh", "set_rings") }
    open fun setRings(rings: Int) {
        _icall_Unit_Int(setRingsMethodBind, this.rawMemory, rings)
    }


    private val getRingsMethodBind: CPointer<godot_method_bind> by lazy { getMB("SphereMesh", "get_rings") }
    open fun getRings(): Int {
        return _icall_Int(getRingsMethodBind, this.rawMemory)
    }


    private val setIsHemisphereMethodBind: CPointer<godot_method_bind> by lazy { getMB("SphereMesh", "set_is_hemisphere") }
    open fun setIsHemisphere(isHemisphere: Boolean) {
        _icall_Unit_Boolean(setIsHemisphereMethodBind, this.rawMemory, isHemisphere)
    }


    private val getIsHemisphereMethodBind: CPointer<godot_method_bind> by lazy { getMB("SphereMesh", "get_is_hemisphere") }
    open fun getIsHemisphere(): Boolean {
        return _icall_Boolean(getIsHemisphereMethodBind, this.rawMemory)
    }


}
