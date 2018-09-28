@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class CSGMesh : CSGPrimitive {
    constructor() : super("CSGMesh")
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
        infix fun from(other: CSGPrimitive): CSGMesh = CSGMesh("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CSGShape): CSGMesh = CSGMesh("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: VisualInstance): CSGMesh = CSGMesh("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Spatial): CSGMesh = CSGMesh("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): CSGMesh = CSGMesh("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): CSGMesh = CSGMesh("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): CSGMesh = fromVariant(CSGMesh(""), other)


        // Constants


    }


    // Properties
    open var mesh: Mesh
        get() = _icall_Mesh(getMeshMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setMeshMethodBind, this.rawMemory, value)




    // Methods
    private val setMeshMethodBind: CPointer<godot_method_bind> by lazy { getMB("CSGMesh", "set_mesh") }
    open fun setMesh(mesh: Mesh) {
        _icall_Unit_Object(setMeshMethodBind, this.rawMemory, mesh)
    }


    private val getMeshMethodBind: CPointer<godot_method_bind> by lazy { getMB("CSGMesh", "get_mesh") }
    open fun getMesh(): Mesh {
        return _icall_Mesh(getMeshMethodBind, this.rawMemory)
    }


    open fun _mesh_changed() {
    }


}
