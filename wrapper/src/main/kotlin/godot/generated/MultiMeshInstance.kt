@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class MultiMeshInstance : GeometryInstance {
    constructor() : super("MultiMeshInstance")
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
        infix fun from(other: GeometryInstance): MultiMeshInstance = MultiMeshInstance("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: VisualInstance): MultiMeshInstance = MultiMeshInstance("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Spatial): MultiMeshInstance = MultiMeshInstance("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): MultiMeshInstance = MultiMeshInstance("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): MultiMeshInstance = MultiMeshInstance("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): MultiMeshInstance = fromVariant(MultiMeshInstance(""), other)


        // Constants


    }


    // Properties
    open var multimesh: MultiMesh
        get() = _icall_MultiMesh(getMultimeshMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setMultimeshMethodBind, this.rawMemory, value)




    // Methods
    private val setMultimeshMethodBind: CPointer<godot_method_bind> by lazy { getMB("MultiMeshInstance", "set_multimesh") }
    open fun setMultimesh(multimesh: MultiMesh) {
        _icall_Unit_Object(setMultimeshMethodBind, this.rawMemory, multimesh)
    }


    private val getMultimeshMethodBind: CPointer<godot_method_bind> by lazy { getMB("MultiMeshInstance", "get_multimesh") }
    open fun getMultimesh(): MultiMesh {
        return _icall_MultiMesh(getMultimeshMethodBind, this.rawMemory)
    }


}
