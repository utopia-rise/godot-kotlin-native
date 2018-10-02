@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class StyleBox : Resource {
    private constructor() : super("")
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
        infix fun from(other: Resource): StyleBox = StyleBox("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): StyleBox = StyleBox("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): StyleBox = StyleBox("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): StyleBox = fromVariant(StyleBox(""), other)


        // Constants


    }


    // Properties
    open var contentMarginLeft: Float
        get() = _icall_Float_Int(getDefaultMarginMethodBind, this.rawMemory, 0)
        set(value) = _icall_Unit_Int_Float(setDefaultMarginMethodBind, this.rawMemory, 0, value)


    open var contentMarginRight: Float
        get() = _icall_Float_Int(getDefaultMarginMethodBind, this.rawMemory, 2)
        set(value) = _icall_Unit_Int_Float(setDefaultMarginMethodBind, this.rawMemory, 2, value)


    open var contentMarginTop: Float
        get() = _icall_Float_Int(getDefaultMarginMethodBind, this.rawMemory, 1)
        set(value) = _icall_Unit_Int_Float(setDefaultMarginMethodBind, this.rawMemory, 1, value)


    open var contentMarginBottom: Float
        get() = _icall_Float_Int(getDefaultMarginMethodBind, this.rawMemory, 3)
        set(value) = _icall_Unit_Int_Float(setDefaultMarginMethodBind, this.rawMemory, 3, value)




    // Methods
    private val testMaskMethodBind: CPointer<godot_method_bind> by lazy { getMB("StyleBox", "test_mask") }
    open fun testMask(point: Vector2, rect: Rect2): Boolean {
        return _icall_Boolean_Vector2_Rect2(testMaskMethodBind, this.rawMemory, point, rect)
    }


    private val setDefaultMarginMethodBind: CPointer<godot_method_bind> by lazy { getMB("StyleBox", "set_default_margin") }
    open fun setDefaultMargin(margin: Int, offset: Float) {
        _icall_Unit_Int_Float(setDefaultMarginMethodBind, this.rawMemory, margin, offset)
    }


    private val getDefaultMarginMethodBind: CPointer<godot_method_bind> by lazy { getMB("StyleBox", "get_default_margin") }
    open fun getDefaultMargin(margin: Int): Float {
        return _icall_Float_Int(getDefaultMarginMethodBind, this.rawMemory, margin)
    }


    private val getMarginMethodBind: CPointer<godot_method_bind> by lazy { getMB("StyleBox", "get_margin") }
    open fun getMargin(margin: Int): Float {
        return _icall_Float_Int(getMarginMethodBind, this.rawMemory, margin)
    }


    private val getMinimumSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("StyleBox", "get_minimum_size") }
    open fun getMinimumSize(): Vector2 {
        return _icall_Vector2(getMinimumSizeMethodBind, this.rawMemory)
    }


    private val getCenterSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("StyleBox", "get_center_size") }
    open fun getCenterSize(): Vector2 {
        return _icall_Vector2(getCenterSizeMethodBind, this.rawMemory)
    }


    private val getOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("StyleBox", "get_offset") }
    open fun getOffset(): Vector2 {
        return _icall_Vector2(getOffsetMethodBind, this.rawMemory)
    }


    private val drawMethodBind: CPointer<godot_method_bind> by lazy { getMB("StyleBox", "draw") }
    open fun draw(canvasItem: RID, rect: Rect2) {
        _icall_Unit_RID_Rect2(drawMethodBind, this.rawMemory, canvasItem, rect)
    }


}
