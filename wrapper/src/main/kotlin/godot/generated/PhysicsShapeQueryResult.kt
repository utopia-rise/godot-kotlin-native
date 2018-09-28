@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class PhysicsShapeQueryResult : Reference {
    private constructor() : super("")
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
        infix fun from(other: Reference): PhysicsShapeQueryResult = PhysicsShapeQueryResult("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): PhysicsShapeQueryResult = PhysicsShapeQueryResult("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): PhysicsShapeQueryResult = fromVariant(PhysicsShapeQueryResult(""), other)


        // Constants


    }


    // Properties


    // Methods
    private val getResultCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsShapeQueryResult", "get_result_count") }
    open fun getResultCount(): Int {
        return _icall_Int(getResultCountMethodBind, this.rawMemory)
    }


    private val getResultRidMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsShapeQueryResult", "get_result_rid") }
    open fun getResultRid(idx: Int): RID {
        return _icall_RID_Int(getResultRidMethodBind, this.rawMemory, idx)
    }


    private val getResultObjectIdMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsShapeQueryResult", "get_result_object_id") }
    open fun getResultObjectId(idx: Int): Int {
        return _icall_Int_Int(getResultObjectIdMethodBind, this.rawMemory, idx)
    }


    private val getResultObjectMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsShapeQueryResult", "get_result_object") }
    open fun getResultObject(idx: Int): Object {
        return _icall_Object_Int(getResultObjectMethodBind, this.rawMemory, idx)
    }


    private val getResultObjectShapeMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsShapeQueryResult", "get_result_object_shape") }
    open fun getResultObjectShape(idx: Int): Int {
        return _icall_Int_Int(getResultObjectShapeMethodBind, this.rawMemory, idx)
    }


}
