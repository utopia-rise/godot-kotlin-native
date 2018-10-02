@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class LineShape2D : Shape2D {
    constructor() : super("LineShape2D")
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
        infix fun from(other: Shape2D): LineShape2D = LineShape2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): LineShape2D = LineShape2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): LineShape2D = LineShape2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): LineShape2D = LineShape2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): LineShape2D = fromVariant(LineShape2D(""), other)


        // Constants


    }


    // Properties
    open var normal: Vector2
        get() = _icall_Vector2(getNormalMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Vector2(setNormalMethodBind, this.rawMemory, value)
    open fun normal(shedule: (Vector2) -> Unit): Vector2 = normal.apply {
        shedule(this)
        normal = this
    }


    open var d: Double
        get() = _icall_Double(getDMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setDMethodBind, this.rawMemory, value)




    // Methods
    private val setNormalMethodBind: CPointer<godot_method_bind> by lazy { getMB("LineShape2D", "set_normal") }
    open fun setNormal(normal: Vector2) {
        _icall_Unit_Vector2(setNormalMethodBind, this.rawMemory, normal)
    }


    private val getNormalMethodBind: CPointer<godot_method_bind> by lazy { getMB("LineShape2D", "get_normal") }
    open fun getNormal(): Vector2 {
        return _icall_Vector2(getNormalMethodBind, this.rawMemory)
    }


    private val setDMethodBind: CPointer<godot_method_bind> by lazy { getMB("LineShape2D", "set_d") }
    open fun setD(d: Double) {
        _icall_Unit_Double(setDMethodBind, this.rawMemory, d)
    }


    private val getDMethodBind: CPointer<godot_method_bind> by lazy { getMB("LineShape2D", "get_d") }
    open fun getD(): Double {
        return _icall_Double(getDMethodBind, this.rawMemory)
    }


}
