@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class World2D : Resource {
    constructor() : super("World2D")
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
        infix fun from(other: Resource): World2D = World2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): World2D = World2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): World2D = World2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): World2D = fromVariant(World2D(""), other)


        // Constants


    }


    // Properties
    open val canvas: RID
        get() = _icall_RID(getCanvasMethodBind, this.rawMemory)


    open val space: RID
        get() = _icall_RID(getSpaceMethodBind, this.rawMemory)


    open val directSpaceState: Physics2DDirectSpaceState
        get() = _icall_Physics2DDirectSpaceState(getDirectSpaceStateMethodBind, this.rawMemory)




    // Methods
    private val getCanvasMethodBind: CPointer<godot_method_bind> by lazy { getMB("World2D", "get_canvas") }
    open fun getCanvas(): RID {
        return _icall_RID(getCanvasMethodBind, this.rawMemory)
    }


    private val getSpaceMethodBind: CPointer<godot_method_bind> by lazy { getMB("World2D", "get_space") }
    open fun getSpace(): RID {
        return _icall_RID(getSpaceMethodBind, this.rawMemory)
    }


    private val getDirectSpaceStateMethodBind: CPointer<godot_method_bind> by lazy { getMB("World2D", "get_direct_space_state") }
    open fun getDirectSpaceState(): Physics2DDirectSpaceState {
        return _icall_Physics2DDirectSpaceState(getDirectSpaceStateMethodBind, this.rawMemory)
    }


}
