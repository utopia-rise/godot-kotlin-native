@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class RectangleShape2D : Shape2D {
    constructor() : super("RectangleShape2D")
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
        infix fun from(other: Shape2D): RectangleShape2D = RectangleShape2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): RectangleShape2D = RectangleShape2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): RectangleShape2D = RectangleShape2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): RectangleShape2D = RectangleShape2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): RectangleShape2D = fromVariant(RectangleShape2D(""), other)


        // Constants


    }


    // Properties
    open var extents: Vector2
        get() = _icall_Vector2(getExtentsMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Vector2(setExtentsMethodBind, this.rawMemory, value)
    open fun extents(shedule: (Vector2) -> Unit): Vector2 = extents.apply {
        shedule(this)
        extents = this
    }




    // Methods
    private val setExtentsMethodBind: CPointer<godot_method_bind> by lazy { getMB("RectangleShape2D", "set_extents") }
    open fun setExtents(extents: Vector2) {
        _icall_Unit_Vector2(setExtentsMethodBind, this.rawMemory, extents)
    }


    private val getExtentsMethodBind: CPointer<godot_method_bind> by lazy { getMB("RectangleShape2D", "get_extents") }
    open fun getExtents(): Vector2 {
        return _icall_Vector2(getExtentsMethodBind, this.rawMemory)
    }


}
