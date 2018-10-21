@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class QuadMesh : PrimitiveMesh {
    constructor() : super("QuadMesh")
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
        infix fun from(other: PrimitiveMesh): QuadMesh = QuadMesh("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Mesh): QuadMesh = QuadMesh("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): QuadMesh = QuadMesh("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): QuadMesh = QuadMesh("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): QuadMesh = QuadMesh("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): QuadMesh = fromVariant(QuadMesh(""), other)


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




    // Methods
    private val setSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("QuadMesh", "set_size") }
    open fun setSize(size: Vector2) {
        _icall_Unit_Vector2(setSizeMethodBind, this.rawMemory, size)
    }


    private val getSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("QuadMesh", "get_size") }
    open fun getSize(): Vector2 {
        return _icall_Vector2(getSizeMethodBind, this.rawMemory)
    }


}
