@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class CSGSphere : CSGPrimitive {
    constructor() : super("CSGSphere")
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
        infix fun from(other: CSGPrimitive): CSGSphere = CSGSphere("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CSGShape): CSGSphere = CSGSphere("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: VisualInstance): CSGSphere = CSGSphere("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Spatial): CSGSphere = CSGSphere("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): CSGSphere = CSGSphere("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): CSGSphere = CSGSphere("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): CSGSphere = fromVariant(CSGSphere(""), other)


        // Constants


    }


    // Properties
    open var radius: Double
        get() = _icall_Double(getRadiusMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setRadiusMethodBind, this.rawMemory, value)


    open var radialSegments: Long
        get() = _icall_Long(getRadialSegmentsMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setRadialSegmentsMethodBind, this.rawMemory, value)


    open var rings: Long
        get() = _icall_Long(getRingsMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setRingsMethodBind, this.rawMemory, value)


    open var smoothFaces: Boolean
        get() = _icall_Boolean(getSmoothFacesMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setSmoothFacesMethodBind, this.rawMemory, value)


    open var material: Material
        get() = _icall_Material(getMaterialMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setMaterialMethodBind, this.rawMemory, value)




    // Methods
    private val setRadiusMethodBind: CPointer<godot_method_bind> by lazy { getMB("CSGSphere", "set_radius") }
    open fun setRadius(radius: Double) {
        _icall_Unit_Double(setRadiusMethodBind, this.rawMemory, radius)
    }


    private val getRadiusMethodBind: CPointer<godot_method_bind> by lazy { getMB("CSGSphere", "get_radius") }
    open fun getRadius(): Double {
        return _icall_Double(getRadiusMethodBind, this.rawMemory)
    }


    private val setRadialSegmentsMethodBind: CPointer<godot_method_bind> by lazy { getMB("CSGSphere", "set_radial_segments") }
    open fun setRadialSegments(radialSegments: Long) {
        _icall_Unit_Long(setRadialSegmentsMethodBind, this.rawMemory, radialSegments)
    }


    private val getRadialSegmentsMethodBind: CPointer<godot_method_bind> by lazy { getMB("CSGSphere", "get_radial_segments") }
    open fun getRadialSegments(): Long {
        return _icall_Long(getRadialSegmentsMethodBind, this.rawMemory)
    }


    private val setRingsMethodBind: CPointer<godot_method_bind> by lazy { getMB("CSGSphere", "set_rings") }
    open fun setRings(rings: Long) {
        _icall_Unit_Long(setRingsMethodBind, this.rawMemory, rings)
    }


    private val getRingsMethodBind: CPointer<godot_method_bind> by lazy { getMB("CSGSphere", "get_rings") }
    open fun getRings(): Long {
        return _icall_Long(getRingsMethodBind, this.rawMemory)
    }


    private val setSmoothFacesMethodBind: CPointer<godot_method_bind> by lazy { getMB("CSGSphere", "set_smooth_faces") }
    open fun setSmoothFaces(smoothFaces: Boolean) {
        _icall_Unit_Boolean(setSmoothFacesMethodBind, this.rawMemory, smoothFaces)
    }


    private val getSmoothFacesMethodBind: CPointer<godot_method_bind> by lazy { getMB("CSGSphere", "get_smooth_faces") }
    open fun getSmoothFaces(): Boolean {
        return _icall_Boolean(getSmoothFacesMethodBind, this.rawMemory)
    }


    private val setMaterialMethodBind: CPointer<godot_method_bind> by lazy { getMB("CSGSphere", "set_material") }
    open fun setMaterial(material: Material) {
        _icall_Unit_Object(setMaterialMethodBind, this.rawMemory, material)
    }


    private val getMaterialMethodBind: CPointer<godot_method_bind> by lazy { getMB("CSGSphere", "get_material") }
    open fun getMaterial(): Material {
        return _icall_Material(getMaterialMethodBind, this.rawMemory)
    }


}
