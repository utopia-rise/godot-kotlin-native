@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
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
    open var width: Float
        get() = _icall_Float(getWidthMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setWidthMethodBind, this.rawMemory, value)


    open var height: Float
        get() = _icall_Float(getHeightMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setHeightMethodBind, this.rawMemory, value)


    open var depth: Float
        get() = _icall_Float(getDepthMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setDepthMethodBind, this.rawMemory, value)


    open var material: Material
        get() = _icall_Material(getMaterialMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setMaterialMethodBind, this.rawMemory, value)




    // Methods
    private val setWidthMethodBind: CPointer<godot_method_bind> by lazy { getMB("CSGBox", "set_width") }
    open fun setWidth(width: Float) {
        _icall_Unit_Float(setWidthMethodBind, this.rawMemory, width)
    }


    private val getWidthMethodBind: CPointer<godot_method_bind> by lazy { getMB("CSGBox", "get_width") }
    open fun getWidth(): Float {
        return _icall_Float(getWidthMethodBind, this.rawMemory)
    }


    private val setHeightMethodBind: CPointer<godot_method_bind> by lazy { getMB("CSGBox", "set_height") }
    open fun setHeight(height: Float) {
        _icall_Unit_Float(setHeightMethodBind, this.rawMemory, height)
    }


    private val getHeightMethodBind: CPointer<godot_method_bind> by lazy { getMB("CSGBox", "get_height") }
    open fun getHeight(): Float {
        return _icall_Float(getHeightMethodBind, this.rawMemory)
    }


    private val setDepthMethodBind: CPointer<godot_method_bind> by lazy { getMB("CSGBox", "set_depth") }
    open fun setDepth(depth: Float) {
        _icall_Unit_Float(setDepthMethodBind, this.rawMemory, depth)
    }


    private val getDepthMethodBind: CPointer<godot_method_bind> by lazy { getMB("CSGBox", "get_depth") }
    open fun getDepth(): Float {
        return _icall_Float(getDepthMethodBind, this.rawMemory)
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
