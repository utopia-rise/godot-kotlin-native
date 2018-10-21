@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class PlaneMesh : PrimitiveMesh {
    constructor() : super("PlaneMesh")
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
        infix fun from(other: PrimitiveMesh): PlaneMesh = PlaneMesh("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Mesh): PlaneMesh = PlaneMesh("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): PlaneMesh = PlaneMesh("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): PlaneMesh = PlaneMesh("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): PlaneMesh = PlaneMesh("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): PlaneMesh = fromVariant(PlaneMesh(""), other)


        // Constants


    }


    // Properties
    open var size: Vector2
        get() = _icall_Vector2(getSizeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Vector2(setSizeMethodBind, this.rawMemory, value)
    open fun size(shedule: (Vector2) -> Unit): Vector2 = size.apply {
        shedule(this)
        size = this
    }


    open var subdivideWidth: Long
        get() = _icall_Long(getSubdivideWidthMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setSubdivideWidthMethodBind, this.rawMemory, value)


    open var subdivideDepth: Long
        get() = _icall_Long(getSubdivideDepthMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setSubdivideDepthMethodBind, this.rawMemory, value)




    // Methods
    private val setSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("PlaneMesh", "set_size") }
    open fun setSize(size: Vector2) {
        _icall_Unit_Vector2(setSizeMethodBind, this.rawMemory, size)
    }


    private val getSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("PlaneMesh", "get_size") }
    open fun getSize(): Vector2 {
        return _icall_Vector2(getSizeMethodBind, this.rawMemory)
    }


    private val setSubdivideWidthMethodBind: CPointer<godot_method_bind> by lazy { getMB("PlaneMesh", "set_subdivide_width") }
    open fun setSubdivideWidth(subdivide: Long) {
        _icall_Unit_Long(setSubdivideWidthMethodBind, this.rawMemory, subdivide)
    }


    private val getSubdivideWidthMethodBind: CPointer<godot_method_bind> by lazy { getMB("PlaneMesh", "get_subdivide_width") }
    open fun getSubdivideWidth(): Long {
        return _icall_Long(getSubdivideWidthMethodBind, this.rawMemory)
    }


    private val setSubdivideDepthMethodBind: CPointer<godot_method_bind> by lazy { getMB("PlaneMesh", "set_subdivide_depth") }
    open fun setSubdivideDepth(subdivide: Long) {
        _icall_Unit_Long(setSubdivideDepthMethodBind, this.rawMemory, subdivide)
    }


    private val getSubdivideDepthMethodBind: CPointer<godot_method_bind> by lazy { getMB("PlaneMesh", "get_subdivide_depth") }
    open fun getSubdivideDepth(): Long {
        return _icall_Long(getSubdivideDepthMethodBind, this.rawMemory)
    }


}
