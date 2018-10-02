@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class CSGCylinder : CSGPrimitive {
    constructor() : super("CSGCylinder")
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
        infix fun from(other: CSGPrimitive): CSGCylinder = CSGCylinder("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CSGShape): CSGCylinder = CSGCylinder("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: VisualInstance): CSGCylinder = CSGCylinder("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Spatial): CSGCylinder = CSGCylinder("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): CSGCylinder = CSGCylinder("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): CSGCylinder = CSGCylinder("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): CSGCylinder = fromVariant(CSGCylinder(""), other)


        // Constants


    }


    // Properties
    open var radius: Double
        get() = _icall_Double(getRadiusMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setRadiusMethodBind, this.rawMemory, value)


    open var height: Double
        get() = _icall_Double(getHeightMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setHeightMethodBind, this.rawMemory, value)


    open var sides: Long
        get() = _icall_Long(getSidesMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setSidesMethodBind, this.rawMemory, value)


    open var cone: Boolean
        get() = _icall_Boolean(isConeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setConeMethodBind, this.rawMemory, value)


    open var smoothFaces: Boolean
        get() = _icall_Boolean(getSmoothFacesMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setSmoothFacesMethodBind, this.rawMemory, value)


    open var material: Material
        get() = _icall_Material(getMaterialMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setMaterialMethodBind, this.rawMemory, value)




    // Methods
    private val setRadiusMethodBind: CPointer<godot_method_bind> by lazy { getMB("CSGCylinder", "set_radius") }
    open fun setRadius(radius: Double) {
        _icall_Unit_Double(setRadiusMethodBind, this.rawMemory, radius)
    }


    private val getRadiusMethodBind: CPointer<godot_method_bind> by lazy { getMB("CSGCylinder", "get_radius") }
    open fun getRadius(): Double {
        return _icall_Double(getRadiusMethodBind, this.rawMemory)
    }


    private val setHeightMethodBind: CPointer<godot_method_bind> by lazy { getMB("CSGCylinder", "set_height") }
    open fun setHeight(height: Double) {
        _icall_Unit_Double(setHeightMethodBind, this.rawMemory, height)
    }


    private val getHeightMethodBind: CPointer<godot_method_bind> by lazy { getMB("CSGCylinder", "get_height") }
    open fun getHeight(): Double {
        return _icall_Double(getHeightMethodBind, this.rawMemory)
    }


    private val setSidesMethodBind: CPointer<godot_method_bind> by lazy { getMB("CSGCylinder", "set_sides") }
    open fun setSides(sides: Long) {
        _icall_Unit_Long(setSidesMethodBind, this.rawMemory, sides)
    }


    private val getSidesMethodBind: CPointer<godot_method_bind> by lazy { getMB("CSGCylinder", "get_sides") }
    open fun getSides(): Long {
        return _icall_Long(getSidesMethodBind, this.rawMemory)
    }


    private val setConeMethodBind: CPointer<godot_method_bind> by lazy { getMB("CSGCylinder", "set_cone") }
    open fun setCone(cone: Boolean) {
        _icall_Unit_Boolean(setConeMethodBind, this.rawMemory, cone)
    }


    private val isConeMethodBind: CPointer<godot_method_bind> by lazy { getMB("CSGCylinder", "is_cone") }
    open fun isCone(): Boolean {
        return _icall_Boolean(isConeMethodBind, this.rawMemory)
    }


    private val setMaterialMethodBind: CPointer<godot_method_bind> by lazy { getMB("CSGCylinder", "set_material") }
    open fun setMaterial(material: Material) {
        _icall_Unit_Object(setMaterialMethodBind, this.rawMemory, material)
    }


    private val getMaterialMethodBind: CPointer<godot_method_bind> by lazy { getMB("CSGCylinder", "get_material") }
    open fun getMaterial(): Material {
        return _icall_Material(getMaterialMethodBind, this.rawMemory)
    }


    private val setSmoothFacesMethodBind: CPointer<godot_method_bind> by lazy { getMB("CSGCylinder", "set_smooth_faces") }
    open fun setSmoothFaces(smoothFaces: Boolean) {
        _icall_Unit_Boolean(setSmoothFacesMethodBind, this.rawMemory, smoothFaces)
    }


    private val getSmoothFacesMethodBind: CPointer<godot_method_bind> by lazy { getMB("CSGCylinder", "get_smooth_faces") }
    open fun getSmoothFaces(): Boolean {
        return _icall_Boolean(getSmoothFacesMethodBind, this.rawMemory)
    }


}
