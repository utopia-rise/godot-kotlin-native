@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class CSGBox : CSGPrimitive {
    constructor() : super("CSGBox")
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
        infix fun from(other: CSGPrimitive): CSGBox = CSGBox("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CSGShape): CSGBox = CSGBox("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: VisualInstance): CSGBox = CSGBox("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Spatial): CSGBox = CSGBox("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): CSGBox = CSGBox("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): CSGBox = CSGBox("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): CSGBox = fromVariant(CSGBox(""), other)


        // Constants


    }


    // Properties
    open var width: Double
        get() = _icall_Double(getWidthMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setWidthMethodBind, this.rawMemory, value)


    open var height: Double
        get() = _icall_Double(getHeightMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setHeightMethodBind, this.rawMemory, value)


    open var depth: Double
        get() = _icall_Double(getDepthMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setDepthMethodBind, this.rawMemory, value)


    open var material: Material
        get() = _icall_Material(getMaterialMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setMaterialMethodBind, this.rawMemory, value)




    // Methods
    private val setWidthMethodBind: CPointer<godot_method_bind> by lazy { getMB("CSGBox", "set_width") }
    open fun setWidth(width: Double) {
        _icall_Unit_Double(setWidthMethodBind, this.rawMemory, width)
    }


    private val getWidthMethodBind: CPointer<godot_method_bind> by lazy { getMB("CSGBox", "get_width") }
    open fun getWidth(): Double {
        return _icall_Double(getWidthMethodBind, this.rawMemory)
    }


    private val setHeightMethodBind: CPointer<godot_method_bind> by lazy { getMB("CSGBox", "set_height") }
    open fun setHeight(height: Double) {
        _icall_Unit_Double(setHeightMethodBind, this.rawMemory, height)
    }


    private val getHeightMethodBind: CPointer<godot_method_bind> by lazy { getMB("CSGBox", "get_height") }
    open fun getHeight(): Double {
        return _icall_Double(getHeightMethodBind, this.rawMemory)
    }


    private val setDepthMethodBind: CPointer<godot_method_bind> by lazy { getMB("CSGBox", "set_depth") }
    open fun setDepth(depth: Double) {
        _icall_Unit_Double(setDepthMethodBind, this.rawMemory, depth)
    }


    private val getDepthMethodBind: CPointer<godot_method_bind> by lazy { getMB("CSGBox", "get_depth") }
    open fun getDepth(): Double {
        return _icall_Double(getDepthMethodBind, this.rawMemory)
    }


    private val setMaterialMethodBind: CPointer<godot_method_bind> by lazy { getMB("CSGBox", "set_material") }
    open fun setMaterial(material: Material) {
        _icall_Unit_Object(setMaterialMethodBind, this.rawMemory, material)
    }


    private val getMaterialMethodBind: CPointer<godot_method_bind> by lazy { getMB("CSGBox", "get_material") }
    open fun getMaterial(): Material {
        return _icall_Material(getMaterialMethodBind, this.rawMemory)
    }


}
