@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class BoxShape : Shape {
    constructor() : super("BoxShape")
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
        infix fun from(other: Shape): BoxShape = BoxShape("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): BoxShape = BoxShape("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): BoxShape = BoxShape("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): BoxShape = BoxShape("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): BoxShape = fromVariant(BoxShape(""), other)


        // Constants


    }


    // Properties
    open var extents: Vector3
        get() = _icall_Vector3(getExtentsMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Vector3(setExtentsMethodBind, this.rawMemory, value)
    open fun extents(shedule: (Vector3) -> Unit): Vector3 = extents.apply {
        shedule(this)
        extents = this
    }




    // Methods
    private val setExtentsMethodBind: CPointer<godot_method_bind> by lazy { getMB("BoxShape", "set_extents") }
    open fun setExtents(extents: Vector3) {
        _icall_Unit_Vector3(setExtentsMethodBind, this.rawMemory, extents)
    }


    private val getExtentsMethodBind: CPointer<godot_method_bind> by lazy { getMB("BoxShape", "get_extents") }
    open fun getExtents(): Vector3 {
        return _icall_Vector3(getExtentsMethodBind, this.rawMemory)
    }


}
