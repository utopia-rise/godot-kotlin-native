@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class CSGTorus : CSGPrimitive {
    constructor() : super("CSGTorus")
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
        infix fun from(other: CSGPrimitive): CSGTorus = CSGTorus("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CSGShape): CSGTorus = CSGTorus("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: VisualInstance): CSGTorus = CSGTorus("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Spatial): CSGTorus = CSGTorus("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): CSGTorus = CSGTorus("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): CSGTorus = CSGTorus("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): CSGTorus = fromVariant(CSGTorus(""), other)


        // Constants


    }


    // Properties
    open var innerRadius: Float
        get() = _icall_Float(getInnerRadiusMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setInnerRadiusMethodBind, this.rawMemory, value)


    open var outerRadius: Float
        get() = _icall_Float(getOuterRadiusMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setOuterRadiusMethodBind, this.rawMemory, value)


    open var sides: Int
        get() = _icall_Int(getSidesMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setSidesMethodBind, this.rawMemory, value)


    open var ringSides: Int
        get() = _icall_Int(getRingSidesMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setRingSidesMethodBind, this.rawMemory, value)


    open var smoothFaces: Boolean
        get() = _icall_Boolean(getSmoothFacesMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setSmoothFacesMethodBind, this.rawMemory, value)


    open var material: Material
        get() = _icall_Material(getMaterialMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setMaterialMethodBind, this.rawMemory, value)




    // Methods
    private val setInnerRadiusMethodBind: CPointer<godot_method_bind> by lazy { getMB("CSGTorus", "set_inner_radius") }
    open fun setInnerRadius(radius: Float) {
        _icall_Unit_Float(setInnerRadiusMethodBind, this.rawMemory, radius)
    }


    private val getInnerRadiusMethodBind: CPointer<godot_method_bind> by lazy { getMB("CSGTorus", "get_inner_radius") }
    open fun getInnerRadius(): Float {
        return _icall_Float(getInnerRadiusMethodBind, this.rawMemory)
    }


    private val setOuterRadiusMethodBind: CPointer<godot_method_bind> by lazy { getMB("CSGTorus", "set_outer_radius") }
    open fun setOuterRadius(radius: Float) {
        _icall_Unit_Float(setOuterRadiusMethodBind, this.rawMemory, radius)
    }


    private val getOuterRadiusMethodBind: CPointer<godot_method_bind> by lazy { getMB("CSGTorus", "get_outer_radius") }
    open fun getOuterRadius(): Float {
        return _icall_Float(getOuterRadiusMethodBind, this.rawMemory)
    }


    private val setSidesMethodBind: CPointer<godot_method_bind> by lazy { getMB("CSGTorus", "set_sides") }
    open fun setSides(sides: Int) {
        _icall_Unit_Int(setSidesMethodBind, this.rawMemory, sides)
    }


    private val getSidesMethodBind: CPointer<godot_method_bind> by lazy { getMB("CSGTorus", "get_sides") }
    open fun getSides(): Int {
        return _icall_Int(getSidesMethodBind, this.rawMemory)
    }


    private val setRingSidesMethodBind: CPointer<godot_method_bind> by lazy { getMB("CSGTorus", "set_ring_sides") }
    open fun setRingSides(sides: Int) {
        _icall_Unit_Int(setRingSidesMethodBind, this.rawMemory, sides)
    }


    private val getRingSidesMethodBind: CPointer<godot_method_bind> by lazy { getMB("CSGTorus", "get_ring_sides") }
    open fun getRingSides(): Int {
        return _icall_Int(getRingSidesMethodBind, this.rawMemory)
    }


    private val setMaterialMethodBind: CPointer<godot_method_bind> by lazy { getMB("CSGTorus", "set_material") }
    open fun setMaterial(material: Material) {
        _icall_Unit_Object(setMaterialMethodBind, this.rawMemory, material)
    }


    private val getMaterialMethodBind: CPointer<godot_method_bind> by lazy { getMB("CSGTorus", "get_material") }
    open fun getMaterial(): Material {
        return _icall_Material(getMaterialMethodBind, this.rawMemory)
    }


    private val setSmoothFacesMethodBind: CPointer<godot_method_bind> by lazy { getMB("CSGTorus", "set_smooth_faces") }
    open fun setSmoothFaces(smoothFaces: Boolean) {
        _icall_Unit_Boolean(setSmoothFacesMethodBind, this.rawMemory, smoothFaces)
    }


    private val getSmoothFacesMethodBind: CPointer<godot_method_bind> by lazy { getMB("CSGTorus", "get_smooth_faces") }
    open fun getSmoothFaces(): Boolean {
        return _icall_Boolean(getSmoothFacesMethodBind, this.rawMemory)
    }


}
