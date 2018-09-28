@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class Path : Spatial {
    constructor() : super("Path")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 



    // Signals
    class Signal {
        companion object {
            const val CURVE_CHANGED: String = "curve_changed"
        }
    }


    companion object {
        infix fun from(other: Spatial): Path = Path("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): Path = Path("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): Path = Path("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): Path = fromVariant(Path(""), other)


        // Constants


    }


    // Properties
    open var curve: Curve3D
        get() = _icall_Curve3D(getCurveMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setCurveMethodBind, this.rawMemory, value)




    // Methods
    private val setCurveMethodBind: CPointer<godot_method_bind> by lazy { getMB("Path", "set_curve") }
    open fun setCurve(curve: Curve3D) {
        _icall_Unit_Object(setCurveMethodBind, this.rawMemory, curve)
    }


    private val getCurveMethodBind: CPointer<godot_method_bind> by lazy { getMB("Path", "get_curve") }
    open fun getCurve(): Curve3D {
        return _icall_Curve3D(getCurveMethodBind, this.rawMemory)
    }


    open fun _curve_changed() {
    }


}
