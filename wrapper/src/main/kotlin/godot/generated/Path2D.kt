@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class Path2D : Node2D {
    constructor() : super("Path2D")
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
        infix fun from(other: Node2D): Path2D = Path2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CanvasItem): Path2D = Path2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): Path2D = Path2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): Path2D = Path2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): Path2D = fromVariant(Path2D(""), other)


        // Constants


    }


    // Properties
    open var curve: Curve2D
        get() = _icall_Curve2D(getCurveMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setCurveMethodBind, this.rawMemory, value)




    // Methods
    private val setCurveMethodBind: CPointer<godot_method_bind> by lazy { getMB("Path2D", "set_curve") }
    open fun setCurve(curve: Curve2D) {
        _icall_Unit_Object(setCurveMethodBind, this.rawMemory, curve)
    }


    private val getCurveMethodBind: CPointer<godot_method_bind> by lazy { getMB("Path2D", "get_curve") }
    open fun getCurve(): Curve2D {
        return _icall_Curve2D(getCurveMethodBind, this.rawMemory)
    }


    open fun _curve_changed() {
    }


}
