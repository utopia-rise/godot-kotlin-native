@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class CurveTexture : Texture {
    constructor() : super("CurveTexture")
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
        infix fun from(other: Texture): CurveTexture = CurveTexture("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): CurveTexture = CurveTexture("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): CurveTexture = CurveTexture("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): CurveTexture = CurveTexture("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): CurveTexture = fromVariant(CurveTexture(""), other)


        // Constants


    }


    // Properties
    open var width: Int
        get() = throw UninitializedPropertyAccessException("Cannot access property width: has no getter")
        set(value) = _icall_Unit_Int(setWidthMethodBind, this.rawMemory, value)


    open var curve: Curve
        get() = _icall_Curve(getCurveMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setCurveMethodBind, this.rawMemory, value)




    // Methods
    private val setWidthMethodBind: CPointer<godot_method_bind> by lazy { getMB("CurveTexture", "set_width") }
    open fun setWidth(width: Int) {
        _icall_Unit_Int(setWidthMethodBind, this.rawMemory, width)
    }


    private val setCurveMethodBind: CPointer<godot_method_bind> by lazy { getMB("CurveTexture", "set_curve") }
    open fun setCurve(curve: Curve) {
        _icall_Unit_Object(setCurveMethodBind, this.rawMemory, curve)
    }


    private val getCurveMethodBind: CPointer<godot_method_bind> by lazy { getMB("CurveTexture", "get_curve") }
    open fun getCurve(): Curve {
        return _icall_Curve(getCurveMethodBind, this.rawMemory)
    }


    open fun _update() {
    }


}
