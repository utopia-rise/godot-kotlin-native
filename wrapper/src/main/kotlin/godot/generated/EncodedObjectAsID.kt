@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class EncodedObjectAsID : Reference {
    constructor() : super("EncodedObjectAsID")
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
        infix fun from(other: Reference): EncodedObjectAsID = EncodedObjectAsID("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): EncodedObjectAsID = EncodedObjectAsID("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): EncodedObjectAsID = fromVariant(EncodedObjectAsID(""), other)


        // Constants


    }


    // Properties


    // Methods
    private val setObjectIdMethodBind: CPointer<godot_method_bind> by lazy { getMB("EncodedObjectAsID", "set_object_id") }
    open fun setObjectId(id: Long) {
        _icall_Unit_Long(setObjectIdMethodBind, this.rawMemory, id)
    }


    private val getObjectIdMethodBind: CPointer<godot_method_bind> by lazy { getMB("EncodedObjectAsID", "get_object_id") }
    open fun getObjectId(): Long {
        return _icall_Long(getObjectIdMethodBind, this.rawMemory)
    }


}
