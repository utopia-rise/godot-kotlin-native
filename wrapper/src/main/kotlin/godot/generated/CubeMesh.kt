@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class CubeMesh : PrimitiveMesh {
    constructor() : super("CubeMesh")
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
        infix fun from(other: PrimitiveMesh): CubeMesh = CubeMesh("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Mesh): CubeMesh = CubeMesh("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): CubeMesh = CubeMesh("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): CubeMesh = CubeMesh("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): CubeMesh = CubeMesh("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): CubeMesh = fromVariant(CubeMesh(""), other)


        // Constants


    }


    // Properties
    open var size: Vector3
        get() = _icall_Vector3(getSizeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Vector3(setSizeMethodBind, this.rawMemory, value)
    open fun size(shedule: (Vector3) -> Unit): Vector3 = size.apply {
        shedule(this)
        size = this
    }


    open var subdivideWidth: Int
        get() = _icall_Int(getSubdivideWidthMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setSubdivideWidthMethodBind, this.rawMemory, value)


    open var subdivideHeight: Int
        get() = _icall_Int(getSubdivideHeightMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setSubdivideHeightMethodBind, this.rawMemory, value)


    open var subdivideDepth: Int
        get() = _icall_Int(getSubdivideDepthMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setSubdivideDepthMethodBind, this.rawMemory, value)




    // Methods
    private val setSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("CubeMesh", "set_size") }
    open fun setSize(size: Vector3) {
        _icall_Unit_Vector3(setSizeMethodBind, this.rawMemory, size)
    }


    private val getSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("CubeMesh", "get_size") }
    open fun getSize(): Vector3 {
        return _icall_Vector3(getSizeMethodBind, this.rawMemory)
    }


    private val setSubdivideWidthMethodBind: CPointer<godot_method_bind> by lazy { getMB("CubeMesh", "set_subdivide_width") }
    open fun setSubdivideWidth(subdivide: Int) {
        _icall_Unit_Int(setSubdivideWidthMethodBind, this.rawMemory, subdivide)
    }


    private val getSubdivideWidthMethodBind: CPointer<godot_method_bind> by lazy { getMB("CubeMesh", "get_subdivide_width") }
    open fun getSubdivideWidth(): Int {
        return _icall_Int(getSubdivideWidthMethodBind, this.rawMemory)
    }


    private val setSubdivideHeightMethodBind: CPointer<godot_method_bind> by lazy { getMB("CubeMesh", "set_subdivide_height") }
    open fun setSubdivideHeight(divisions: Int) {
        _icall_Unit_Int(setSubdivideHeightMethodBind, this.rawMemory, divisions)
    }


    private val getSubdivideHeightMethodBind: CPointer<godot_method_bind> by lazy { getMB("CubeMesh", "get_subdivide_height") }
    open fun getSubdivideHeight(): Int {
        return _icall_Int(getSubdivideHeightMethodBind, this.rawMemory)
    }


    private val setSubdivideDepthMethodBind: CPointer<godot_method_bind> by lazy { getMB("CubeMesh", "set_subdivide_depth") }
    open fun setSubdivideDepth(divisions: Int) {
        _icall_Unit_Int(setSubdivideDepthMethodBind, this.rawMemory, divisions)
    }


    private val getSubdivideDepthMethodBind: CPointer<godot_method_bind> by lazy { getMB("CubeMesh", "get_subdivide_depth") }
    open fun getSubdivideDepth(): Int {
        return _icall_Int(getSubdivideDepthMethodBind, this.rawMemory)
    }


}
