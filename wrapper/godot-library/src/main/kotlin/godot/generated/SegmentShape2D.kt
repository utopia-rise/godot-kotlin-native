@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class SegmentShape2D : Shape2D {
    constructor() : super("SegmentShape2D")
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
        infix fun from(other: Shape2D): SegmentShape2D = SegmentShape2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): SegmentShape2D = SegmentShape2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): SegmentShape2D = SegmentShape2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): SegmentShape2D = SegmentShape2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): SegmentShape2D = fromVariant(SegmentShape2D(""), other)


        // Constants


    }


    // Properties
    open var a: Vector2
        get() = _icall_Vector2(getAMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Vector2(setAMethodBind, this.rawMemory, value)
    open fun a(shedule: (Vector2) -> Unit): Vector2 = a.apply {
        shedule(this)
        a = this
    }


    open var b: Vector2
        get() = _icall_Vector2(getBMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Vector2(setBMethodBind, this.rawMemory, value)
    open fun b(shedule: (Vector2) -> Unit): Vector2 = b.apply {
        shedule(this)
        b = this
    }




    // Methods
    private val setAMethodBind: CPointer<godot_method_bind> by lazy { getMB("SegmentShape2D", "set_a") }
    open fun setA(a: Vector2) {
        _icall_Unit_Vector2(setAMethodBind, this.rawMemory, a)
    }


    private val getAMethodBind: CPointer<godot_method_bind> by lazy { getMB("SegmentShape2D", "get_a") }
    open fun getA(): Vector2 {
        return _icall_Vector2(getAMethodBind, this.rawMemory)
    }


    private val setBMethodBind: CPointer<godot_method_bind> by lazy { getMB("SegmentShape2D", "set_b") }
    open fun setB(b: Vector2) {
        _icall_Unit_Vector2(setBMethodBind, this.rawMemory, b)
    }


    private val getBMethodBind: CPointer<godot_method_bind> by lazy { getMB("SegmentShape2D", "get_b") }
    open fun getB(): Vector2 {
        return _icall_Vector2(getBMethodBind, this.rawMemory)
    }


}
