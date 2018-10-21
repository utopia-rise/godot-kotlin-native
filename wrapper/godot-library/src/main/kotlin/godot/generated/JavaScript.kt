@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class JavaScript : Object {
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


    @ThreadLocal    companion object {
        infix fun from(other: Object): JavaScript = JavaScript("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): JavaScript = fromVariant(JavaScript(""), other)


        // Constants


        private val rawMemory: COpaquePointer by lazy { getSingleton("JavaScript", "JavaScript") }


        // Properties


        // Methods
        private val evalMethodBind: CPointer<godot_method_bind> by lazy { getMB("JavaScript", "eval") }
        fun eval(code: String, useGlobalExecutionContext: Boolean = false): Variant {
            return _icall_Variant_String_Boolean(evalMethodBind, this.rawMemory, code, useGlobalExecutionContext)
        }


    }
}
